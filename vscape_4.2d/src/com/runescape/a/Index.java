package com.runescape.a;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class Index {
   private static final byte[] a = new byte[520];
   private final RandomAccessFile b;
   private final RandomAccessFile c;
   private final int d;

   public Index(RandomAccessFile var1, RandomAccessFile var2, int var3) {
      this.d = var3;
      this.b = var1;
      this.c = var2;
   }

   public final synchronized byte[] a(int var1) {
      try {
         this.a(this.c, var1 * 6);

         int var2;
         int var3;
         for(var2 = 0; var2 < 6; var2 += var3) {
            if((var3 = this.c.read(a, var2, 6 - var2)) == -1) {
               return null;
            }
         }

         var2 = ((a[0] & 255) << 16) + ((a[1] & 255) << 8) + (a[2] & 255);
         if((var3 = ((a[3] & 255) << 16) + ((a[4] & 255) << 8) + (a[5] & 255)) > 0 && (long)var3 <= this.b.length() / 520L) {
            byte[] var4 = new byte[var2];
            int var5 = 0;
            int var6 = 0;

            while(var5 < var2) {
               if(var3 == 0) {
                  return null;
               }

               this.a(this.b, var3 * 520);
               var3 = 0;
               int var7;
               if((var7 = var2 - var5) > 512) {
                  var7 = 512;
               }

               int var8;
               while(var3 < var7 + 8) {
                  if((var8 = this.b.read(a, var3, var7 + 8 - var3)) == -1) {
                     return null;
                  }

                  var3 += var8;
               }

               var3 = ((a[0] & 255) << 8) + (a[1] & 255);
               var8 = ((a[2] & 255) << 8) + (a[3] & 255);
               int var9 = ((a[4] & 255) << 16) + ((a[5] & 255) << 8) + (a[6] & 255);
               int var10 = a[7] & 255;
               if(var3 == var1 && var8 == var6 && var10 == this.d) {
                  if(var9 >= 0 && (long)var9 <= this.b.length() / 520L) {
                     for(var3 = 0; var3 < var7; ++var3) {
                        var4[var5++] = a[var3 + 8];
                     }

                     var3 = var9;
                     ++var6;
                     continue;
                  }

                  return null;
               }

               return null;
            }

            return var4;
         } else {
            return null;
         }
      } catch (IOException var11) {
         return null;
      }
   }

   public final synchronized boolean a(int var1, byte[] var2, int var3) {
      boolean var4;
      if(!(var4 = this.a(true, var3, var1, var2))) {
         var4 = this.a(false, var3, var1, var2);
      }

      return var4;
   }

   private synchronized boolean a(boolean var1, int var2, int var3, byte[] var4) {
      try {
         int var5;
         int var6;
         int var7;
         if(!var1) {
            if((var7 = (int)((this.b.length() + 519L) / 520L)) == 0) {
               var7 = 1;
            }
         } else {
            this.a(this.c, var2 * 6);
            var5 = 0;

            while(true) {
               if(var5 >= 6) {
                  if((var7 = ((a[3] & 255) << 16) + ((a[4] & 255) << 8) + (a[5] & 255)) <= 0 || (long)var7 > this.b.length() / 520L) {
                     return false;
                  }
                  break;
               }

               if((var6 = this.c.read(a, var5, 6 - var5)) == -1) {
                  return false;
               }

               var5 += var6;
            }
         }

         a[0] = (byte)(var3 >> 16);
         a[1] = (byte)(var3 >> 8);
         a[2] = (byte)var3;
         a[3] = (byte)(var7 >> 16);
         a[4] = (byte)(var7 >> 8);
         a[5] = (byte)var7;
         this.a(this.c, var2 * 6);
         this.c.write(a, 0, 6);
         var6 = 0;

         for(var5 = 0; var6 < var3; ++var5) {
            int var8 = 0;
            int var9;
            if(var1) {
               this.a(this.b, var7 * 520);
               var9 = 0;

               while(true) {
                  int var10;
                  if(var9 >= 8 || (var10 = this.b.read(a, var9, 8 - var9)) == -1) {
                     if(var9 == 8) {
                        var9 = ((a[0] & 255) << 8) + (a[1] & 255);
                        var10 = ((a[2] & 255) << 8) + (a[3] & 255);
                        var8 = ((a[4] & 255) << 16) + ((a[5] & 255) << 8) + (a[6] & 255);
                        int var11 = a[7] & 255;
                        if(var9 != var2 || var10 != var5 || var11 != this.d) {
                           return false;
                        }

                        if(var8 < 0 || (long)var8 > this.b.length() / 520L) {
                           return false;
                        }
                     }
                     break;
                  }

                  var9 += var10;
               }
            }

            if(var8 == 0) {
               var1 = false;
               if((var8 = (int)((this.b.length() + 519L) / 520L)) == 0) {
                  ++var8;
               }

               if(var8 == var7) {
                  ++var8;
               }
            }

            if(var3 - var6 <= 512) {
               var8 = 0;
            }

            a[0] = (byte)(var2 >> 8);
            a[1] = (byte)var2;
            a[2] = (byte)(var5 >> 8);
            a[3] = (byte)var5;
            a[4] = (byte)(var8 >> 16);
            a[5] = (byte)(var8 >> 8);
            a[6] = (byte)var8;
            a[7] = (byte)this.d;
            this.a(this.b, var7 * 520);
            this.b.write(a, 0, 8);
            if((var9 = var3 - var6) > 512) {
               var9 = 512;
            }

            this.b.write(var4, var6, var9);
            var6 += var9;
            var7 = var8;
         }

         return true;
      } catch (IOException var12) {
         return false;
      }
   }

   private synchronized void a(RandomAccessFile var1, int var2) {
      try {
         var1.seek((long)var2);
      } catch (Exception var3) {
         ;
      }
   }
}
