package com.runescape.network;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;

import com.runescape.RSApplet;

public final class BufferedConnection implements Runnable {
   private InputStream a;
   private OutputStream b;
   private final Socket c;
   private boolean d = false;
   private final RSApplet e;
   private byte[] f;
   private int g;
   private int h;
   private boolean i = false;
   private boolean j = false;

   public BufferedConnection(RSApplet var1, Socket var2) throws IOException {
      this.e = var1;
      this.c = var2;
      this.c.setSoTimeout(30000);
      this.c.setTcpNoDelay(true);
      this.a = this.c.getInputStream();
      this.b = this.c.getOutputStream();
   }

   public final void a() {
      this.d = true;

      try {
         if(this.a != null) {
            this.a.close();
         }

         if(this.b != null) {
            this.b.close();
         }

         if(this.c != null) {
            this.c.close();
         }
      } catch (IOException var3) {
         System.out.println("Error closing stream");
      }

      this.i = false;
      synchronized(this) {
         this.notify();
      }

      this.f = null;
   }

   public final int b() throws IOException {
      return this.d?0:this.a.read();
   }

   public final int c() throws IOException {
      return this.d?0:this.a.available();
   }

   public final void a(byte[] var1, int var2) throws IOException {
      int var3 = 0;
      if(!this.d) {
         while(var2 > 0) {
            int var4;
            if((var4 = this.a.read(var1, var3, var2)) <= 0) {
               throw new IOException("EOF");
            }

            var3 += var4;
            var2 -= var4;
         }

      }
   }

   public final void a(int var1, byte[] var2) throws IOException {
      if(!this.d) {
         if(this.j) {
            this.j = false;
            throw new IOException("Error in writer thread");
         } else {
            if(this.f == null) {
               this.f = new byte[5000];
            }

            synchronized(this) {
               for(int var4 = 0; var4 < var1; ++var4) {
                  this.f[this.h] = var2[var4];
                  this.h = (this.h + 1) % 5000;
                  if(this.h == (this.g + 4900) % 5000) {
                     throw new IOException("buffer overflow");
                  }
               }

               if(!this.i) {
                  this.i = true;
                  this.e.a(this, 3);
               }

               this.notify();
            }
         }
      }
   }

   public final void run() {
      while(this.i) {
         int var2;
         int var3;
         synchronized(this) {
            if(this.h == this.g) {
               try {
                  this.wait();
               } catch (InterruptedException var6) {
                  ;
               }
            }

            if(!this.i) {
               return;
            }

            var2 = this.g;
            if(this.h >= this.g) {
               var3 = this.h - this.g;
            } else {
               var3 = 5000 - this.g;
            }
         }

         if(var3 > 0) {
            try {
               this.b.write(this.f, var2, var3);
            } catch (IOException var5) {
               this.j = true;
            }

            this.g = (this.g + var3) % 5000;

            try {
               if(this.h == this.g) {
                  this.b.flush();
               }
            } catch (IOException var4) {
               this.j = true;
            }
         }
      }

   }
}
