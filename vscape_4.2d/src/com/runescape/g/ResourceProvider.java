package com.runescape.g;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.GZIPInputStream;

import com.runescape.Client;
import com.runescape.a.Archive;
import com.runescape.d.Buffer;
import com.runescape.e.LinkedList;
import com.runescape.e.Queue;
import com.runescape.i.SignLink;

public final class ResourceProvider extends Provider implements Runnable {
   private final LinkedList b = new LinkedList();
   private int c;
   private int d;
   private long e;
   private int[] f;
   private final byte[] g = new byte[500];
   private int h;
   private final byte[][] i = new byte[4][];
   private Client j;
   private final LinkedList k = new LinkedList();
   private int l;
   private int m;
   private int[] n;
   public int a;
   private int[] o;
   private int p;
   private boolean q = true;
   private OutputStream r;
   private int[] s;
   private boolean t = false;
   private final LinkedList u = new LinkedList();
   private final byte[] v = new byte[465000];
   private final Queue w = new Queue();
   private InputStream x;
   private Socket y;
   private final int[][] z = new int[4][];
   private int A;
   private int B;
   private final LinkedList C = new LinkedList();
   private Resource D;
   private final LinkedList E = new LinkedList();
   private int[] F;
   private int G;

   private void f() {
      try {
         int var1 = this.x.available();
         int var3;
         int var4;
         if(this.m == 0 && var1 >= 6) {
            this.t = true;

            int var2;
            for(var2 = 0; var2 < 6; var2 += this.x.read(this.g, var2, 6 - var2)) {
               ;
            }

            var2 = this.g[0] & 255;
            var3 = ((this.g[1] & 255) << 8) + (this.g[2] & 255);
            var4 = ((this.g[3] & 255) << 8) + (this.g[4] & 255);
            int var5 = this.g[5] & 255;
            this.D = null;
            Resource var6 = (Resource)this.b.b();

            while(true) {
               if(var6 == null) {
                  if(this.D != null) {
                     this.G = 0;
                     if(var4 == 0) {
                        SignLink.b("Rej: " + var2 + "," + var3);
                        this.D.b = null;
                        if(this.D.d) {
                           LinkedList var13 = this.u;
                           synchronized(this.u) {
                              this.u.a(this.D);
                           }
                        } else {
                           this.D.C();
                        }

                        this.D = null;
                     } else {
                        if(this.D.b == null && var5 == 0) {
                           this.D.b = new byte[var4];
                        }

                        if(this.D.b == null && var5 != 0) {
                           throw new IOException("missing start of file");
                        }
                     }
                  }

                  this.l = var5 * 500;
                  this.m = 500;
                  if(this.m > var4 - var5 * 500) {
                     this.m = var4 - var5 * 500;
                  }
                  break;
               }

               if(var6.a == var2 && var6.c == var3) {
                  this.D = var6;
               }

               if(this.D != null) {
                  var6.e = 0;
               }

               var6 = (Resource)this.b.d();
            }
         }

         if(this.m > 0 && var1 >= this.m) {
            this.t = true;
            byte[] var11 = this.g;
            var3 = 0;
            if(this.D != null) {
               var11 = this.D.b;
               var3 = this.l;
            }

            for(var4 = 0; var4 < this.m; var4 += this.x.read(var11, var4 + var3, this.m - var4)) {
               ;
            }

            if(this.m + this.l >= var11.length && this.D != null) {
               if(this.j.l[0] != null) {
                  this.j.l[this.D.a + 1].a(var11.length, var11, this.D.c);
               }

               if(!this.D.d && this.D.a == 3) {
                  this.D.d = true;
                  this.D.a = 93;
               }

               if(this.D.d) {
                  LinkedList var12 = this.u;
                  synchronized(this.u) {
                     this.u.a(this.D);
                  }
               } else {
                  this.D.C();
               }
            }

            this.m = 0;
            return;
         }
      } catch (IOException var10) {
         try {
            this.y.close();
         } catch (Exception var7) {
            ;
         }

         this.y = null;
         this.x = null;
         this.r = null;
         this.m = 0;
      }

   }

   public final void a() {
      int var1;
      byte[] var2;
      File var3;
      FileOutputStream var6;
      for(var1 = 0; var1 < this.f.length; ++var1) {
         try {
            var2 = this.j.l[4].a(this.f[var1]);
            var3 = new File("Configs/mapdata/" + this.f[var1] + ".gz");
            (var6 = new FileOutputStream(var3)).write(var2);
            var6.close();
         } catch (Exception var5) {
            var5.printStackTrace();
         }
      }

      for(var1 = 0; var1 < this.o.length; ++var1) {
         try {
            var2 = this.j.l[4].a(this.o[var1]);
            var3 = new File("Configs/mapdata/" + this.o[var1] + ".gz");
            (var6 = new FileOutputStream(var3)).write(var2);
            var6.close();
         } catch (Exception var4) {
            var4.printStackTrace();
         }
      }

   }

   public final void a(Archive var1, Client var2) {
      byte[] var3 = var1.a("map_index");
      Buffer var4 = new Buffer(var3);
      int var6 = var3.length / 7;
      this.F = new int[var6];
      this.o = new int[var6];
      this.f = new int[var6];
      this.s = new int[var6];

      int var5;
      for(var5 = 0; var5 < var6; ++var5) {
         this.F[var5] = var4.g();
         this.o[var5] = var4.g();
         this.f[var5] = var4.g();
         this.s[var5] = var4.e();
      }

      var3 = var1.a("midi_index");
      var4 = new Buffer(var3);
      var6 = var3.length;
      this.n = new int[var6];

      for(var5 = 0; var5 < var6; ++var5) {
         this.n[var5] = var4.e();
      }

      this.j = var2;
      this.q = true;
      this.j.a((Runnable)this, 2);
   }

   public final int b() {
      Queue var1 = this.w;
      synchronized(this.w) {
         return this.w.d();
      }
   }

   public final void c() {
      this.q = false;
   }

   private void a(Resource var1) {
      try {
         if(this.y == null) {
            long var2;
            if((var2 = System.currentTimeMillis()) - this.e < 4000L) {
               return;
            }

            this.e = var2;
            int var10001 = Client.k;
            this.y = Client.a('\uaa4a');
            this.x = this.y.getInputStream();
            this.r = this.y.getOutputStream();
            this.r.write(15);

            for(int var4 = 0; var4 < 8; ++var4) {
               this.x.read();
            }

            this.G = 0;
         }

         this.g[0] = (byte)var1.a;
         this.g[1] = (byte)(var1.c >> 8);
         this.g[2] = (byte)var1.c;
         if(var1.d) {
            this.g[3] = 2;
         } else if(!this.j.w) {
            this.g[3] = 1;
         } else {
            this.g[3] = 0;
         }

         this.r.write(this.g, 0, 4);
         this.d = 0;
         this.a = -10000;
      } catch (IOException var6) {
         try {
            this.y.close();
         } catch (Exception var5) {
            ;
         }

         this.y = null;
         this.x = null;
         this.r = null;
         this.m = 0;
         ++this.a;
      }
   }

   public final void a(int var1, int var2) {
      Queue var3 = this.w;
      synchronized(this.w) {
         Resource var4;
         for(var4 = (Resource)this.w.b(); var4 != null; var4 = (Resource)this.w.c()) {
            if(var4.a == var1 && var4.c == var2) {
               return;
            }
         }

         (var4 = new Resource()).a = var1;
         var4.c = var2;
         var4.d = true;
         LinkedList var7 = this.E;
         synchronized(this.E) {
            this.E.a(var4);
         }

         this.w.a(var4);
      }
   }

   public final void run() {
      try {
         while(this.q) {
            ++this.h;
            byte var1 = 20;
            if(this.c == 0 && this.j.l[0] != null) {
               var1 = 50;
            }

            try {
               Thread.sleep((long)var1);
            } catch (Exception var11) {
               ;
            }

            this.t = true;

            for(int var14 = 0; var14 < 100 && this.t; ++var14) {
               this.t = false;
               ResourceProvider var2 = this;
               LinkedList var3 = this.E;
               Resource var4;
               synchronized(this.E) {
                  var4 = (Resource)var2.E.a();
               }

               while(var4 != null) {
                  var2.t = true;
                  byte[] var17 = null;
                  if(var2.j.l[0] != null) {
                     var17 = var2.j.l[var4.a + 1].a(var4.c);
                  }

                  LinkedList var5 = var2.E;
                  synchronized(var2.E) {
                     if(var17 == null) {
                        var2.C.a(var4);
                     } else {
                        var4.b = var17;
                        var3 = var2.u;
                        synchronized(var2.u) {
                           var2.u.a(var4);
                        }
                     }

                     var4 = (Resource)var2.E.a();
                  }
               }

               var2 = this;
               this.A = 0;
               this.B = 0;

               for(var4 = (Resource)this.b.b(); var4 != null; var4 = (Resource)var2.b.d()) {
                  if(var4.d) {
                     ++var2.A;
                     System.out.println("Error: model is incomplete or missing  [ type = " + var4.a + "]  [id = " + var4.c + "]");
                  } else {
                     ++var2.B;
                  }
               }

               while(var2.A < 10) {
                  try {
                     if((var4 = (Resource)var2.C.a()) == null) {
                        break;
                     }

                     if(var2.i[var4.a][var4.c] != 0) {
                        ++var2.p;
                     }

                     var2.i[var4.a][var4.c] = 0;
                     var2.b.a(var4);
                     ++var2.A;
                     var2.a(var4);
                     var2.t = true;
                     System.out.println("Error: file is missing  [ type = " + var4.a + "]  [id = " + var4.c + "]");
                  } catch (Exception var12) {
                     ;
                  }
               }

               if(this.A == 0 && var14 >= 5) {
                  break;
               }

               this.g();
               if(this.x != null) {
                  this.f();
               }
            }

            boolean var15 = false;

            Resource var16;
            for(var16 = (Resource)this.b.b(); var16 != null; var16 = (Resource)this.b.d()) {
               if(var16.d) {
                  var15 = true;
                  ++var16.e;
                  if(var16.e > 50) {
                     var16.e = 0;
                     this.a(var16);
                  }
               }
            }

            if(!var15) {
               for(var16 = (Resource)this.b.b(); var16 != null; var16 = (Resource)this.b.d()) {
                  var15 = true;
                  ++var16.e;
                  if(var16.e > 50) {
                     var16.e = 0;
                     this.a(var16);
                  }
               }
            }

            if(var15) {
               ++this.G;
               if(this.G > 750) {
                  try {
                     this.y.close();
                  } catch (Exception var7) {
                     ;
                  }

                  this.y = null;
                  this.x = null;
                  this.r = null;
                  this.m = 0;
               }
            } else {
               this.G = 0;
            }

            if(this.j.w && this.y != null && this.r != null && (this.c > 0 || this.j.l[0] == null)) {
               ++this.d;
               if(this.d > 500) {
                  this.d = 0;
                  this.g[0] = 0;
                  this.g[1] = 0;
                  this.g[2] = 0;
                  this.g[3] = 10;

                  try {
                     this.r.write(this.g, 0, 4);
                  } catch (IOException var6) {
                     this.G = 5000;
                  }
               }
            }
         }

      } catch (Exception var13) {
         SignLink.b("od_ex " + var13.getMessage());
      }
   }

   public final void b(int var1, int var2) {
      if(this.j.l[0] != null) {
         if(this.c != 0) {
            Resource var3;
            (var3 = new Resource()).a = var2;
            var3.c = var1;
            var3.d = false;
            LinkedList var5 = this.k;
            synchronized(this.k) {
               this.k.a(var3);
            }
         }
      }
   }

   public final Resource d() {
      LinkedList var1 = this.u;
      Resource var2;
      synchronized(this.u) {
         var2 = (Resource)this.u.a();
      }

      if(var2 == null) {
         return null;
      } else {
         Queue var8 = this.w;
         synchronized(this.w) {
            var2.D();
         }

         if(var2.b == null) {
            return var2;
         } else {
            int var9 = 0;

            try {
               GZIPInputStream var3 = new GZIPInputStream(new ByteArrayInputStream(var2.b));

               while(true) {
                  if(var9 == 465000) {
                     throw new RuntimeException("buffer overflow!");
                  }

                  int var4;
                  if((var4 = var3.read(this.v, var9, 465000 - var9)) == -1) {
                     break;
                  }

                  var9 += var4;
               }
            } catch (IOException var7) {
               System.out.println("Failed to unzip model [" + var2.c + "] type = " + var2.a);
               var7.printStackTrace();
               return null;
            }

            var2.b = new byte[var9];
            System.arraycopy(this.v, 0, var2.b, 0, var9);
            return var2;
         }
      }
   }

   public final int a(int var1, int var2, int var3) {
      var2 += var3 << 8;

      for(var3 = 0; var3 < this.F.length; ++var3) {
         if(this.F[var3] == var2) {
            if(var1 == 0) {
               return this.o[var3] > 3535?-1:this.o[var3];
            }

            return this.f[var3] > 3535?-1:this.f[var3];
         }
      }

      return -1;
   }

   public final void a(int var1) {
      this.a(0, var1);
   }

   public final boolean b(int var1) {
      for(int var2 = 0; var2 < this.F.length; ++var2) {
         if(this.f[var2] == var1) {
            return true;
         }
      }

      return false;
   }

   public final void e() {
      LinkedList var1 = this.k;
      synchronized(this.k) {
         this.k.f();
      }
   }

   private void g() {
      while(this.A == 0 && this.B < 10 && this.c != 0) {
         LinkedList var1 = this.k;
         Resource var2;
         synchronized(this.k) {
            var2 = (Resource)this.k.a();
         }

         while(var2 != null) {
            if(this.i[var2.a][var2.c] != 0) {
               this.i[var2.a][var2.c] = 0;
               this.b.a(var2);
               this.a(var2);
               this.t = true;
               if(this.p < 0) {
                  ++this.p;
               }

               (new StringBuilder("Loading extra files - ")).append(this.p * 100 / 0).append("%");
               ++this.B;
               if(this.B == 10) {
                  return;
               }
            }

            var1 = this.k;
            synchronized(this.k) {
               var2 = (Resource)this.k.a();
            }
         }

         for(int var8 = 0; var8 < 4; ++var8) {
            byte[] var9;
            int var3 = (var9 = this.i[var8]).length;

            for(int var4 = 0; var4 < var3; ++var4) {
               if(var9[var4] == this.c) {
                  var9[var4] = 0;
                  Resource var5;
                  (var5 = new Resource()).a = var8;
                  var5.c = var4;
                  var5.d = false;
                  this.b.a(var5);
                  this.a(var5);
                  this.t = true;
                  if(this.p < 0) {
                     ++this.p;
                  }

                  (new StringBuilder("Loading extra files - ")).append(this.p * 100 / 0).append("%");
                  ++this.B;
                  if(this.B == 10) {
                     return;
                  }
               }
            }
         }

         --this.c;
      }

   }
}
