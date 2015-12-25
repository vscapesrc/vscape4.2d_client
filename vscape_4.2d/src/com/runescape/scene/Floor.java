package com.runescape.scene;
import com.runescape.cache.Archive;
import com.runescape.stream.Buffer;

public final class Floor {
   public static Floor[] a;
   public int b;
   public int c = -1;
   public boolean d = true;
   public int e;
   public int f;
   public int g;
   public int h;
   public int i;
   public int j;

   public static void a(Archive var0) {
      Buffer var10;
      int var1 = (var10 = new Buffer(var0.a("flo.dat"))).g();
      if(a == null) {
         a = new Floor[var1];
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         if(a[var2] == null) {
            a[var2] = new Floor();
         }

         Floor var10000 = a[var2];
         Buffer var3 = var10;
         Floor var4 = var10000;

         int var5;
         while((var5 = var3.e()) != 0) {
            if(var5 == 1) {
               var4.b = var3.i();
               var4.a(var4.b);
            } else if(var5 == 2) {
               var4.c = var3.e();
            } else if(var5 != 3) {
               if(var5 == 5) {
                  var4.d = false;
               } else if(var5 == 6) {
                  var3.l();
               } else if(var5 == 7) {
                  var5 = var4.e;
                  int var6 = var4.f;
                  int var7 = var4.g;
                  int var8 = var4.h;
                  int var9 = var3.i();
                  var4.a(var9);
                  var4.e = var5;
                  var4.f = var6;
                  var4.g = var7;
                  var4.h = var8;
                  var4.i = var8;
               } else {
                  System.out.println("Error unrecognised config code: " + var5);
               }
            }
         }
      }

   }

   private void a(int var1) {
      double var2 = (double)(var1 >> 16 & 255) / 256.0D;
      double var4 = (double)(var1 >> 8 & 255) / 256.0D;
      double var6 = (double)(var1 & 255) / 256.0D;
      double var8 = var2;
      if(var4 < var2) {
         var8 = var4;
      }

      if(var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if(var4 > var2) {
         var10 = var4;
      }

      if(var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0D;
      double var14 = 0.0D;
      double var16 = (var8 + var10) / 2.0D;
      if(var8 != var10) {
         if(var16 < 0.5D) {
            var14 = (var10 - var8) / (var10 + var8);
         }

         if(var16 >= 0.5D) {
            var14 = (var10 - var8) / (2.0D - var10 - var8);
         }

         if(var2 == var10) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if(var4 == var10) {
            var12 = 2.0D + (var6 - var2) / (var10 - var8);
         } else if(var6 == var10) {
            var12 = 4.0D + (var2 - var4) / (var10 - var8);
         }
      }

      var12 /= 6.0D;
      this.e = (int)(var12 * 256.0D);
      this.f = (int)(var14 * 256.0D);
      this.g = (int)(var16 * 256.0D);
      if(this.f < 0) {
         this.f = 0;
      } else if(this.f > 255) {
         this.f = 255;
      }

      if(this.g < 0) {
         this.g = 0;
      } else if(this.g > 255) {
         this.g = 255;
      }

      if(var16 > 0.5D) {
         this.i = (int)((1.0D - var16) * var14 * 512.0D);
      } else {
         this.i = (int)(var16 * var14 * 512.0D);
      }

      if(this.i <= 0) {
         this.i = 1;
      }

      this.h = (int)(var12 * (double)this.i);
      if((var1 = this.e + (int)(Math.random() * 16.0D) - 8) < 0) {
         var1 = 0;
      } else if(var1 > 255) {
         var1 = 255;
      }

      int var18;
      if((var18 = this.f + (int)(Math.random() * 48.0D) - 24) < 0) {
         var18 = 0;
      } else if(var18 > 255) {
         var18 = 255;
      }

      int var19;
      if((var19 = this.g + (int)(Math.random() * 48.0D) - 24) < 0) {
         var19 = 0;
      } else if(var19 > 255) {
         var19 = 255;
      }

      var18 = var18;
      if(var19 > 179) {
         var18 /= 2;
      }

      if(var19 > 192) {
         var18 /= 2;
      }

      if(var19 > 217) {
         var18 /= 2;
      }

      if(var19 > 243) {
         var18 /= 2;
      }

      this.j = (var1 / 4 << 10) + (var18 / 32 << 7) + var19 / 2;
   }
}
