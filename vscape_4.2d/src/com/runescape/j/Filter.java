package com.runescape.j;
import com.runescape.d.Buffer;

public final class Filter {
   final int[] a = new int[2];
   private final int[][][] d = new int[2][2][4];
   private final int[][][] e = new int[2][2][4];
   private final int[] f = new int[2];
   private static final float[][] g = new float[2][8];
   static final int[][] b = new int[2][8];
   private static float h;
   static int c;

   private float a(int var1, int var2, float var3) {
      float var4 = ((float)this.e[var1][0][var2] + var3 * (float)(this.e[var1][1][var2] - this.e[var1][0][var2])) * 0.001525879F;
      return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F));
   }

   private float a(float var1, int var2, int var3) {
      var1 = ((float)this.d[var3][0][var2] + var1 * (float)(this.d[var3][1][var2] - this.d[var3][0][var2])) * 1.220703E-4F;
      return 32.7032F * (float)Math.pow(2.0D, (double)var1) * 3.141593F / 11025.0F;
   }

   public final int a(int var1, float var2) {
      float var3;
      if(var1 == 0) {
         var3 = ((float)this.f[0] + (float)(this.f[1] - this.f[0]) * var2) * 0.003051758F;
         c = (int)((h = (float)Math.pow(0.1D, (double)(var3 / 20.0F))) * 65536.0F);
      }

      if(this.a[var1] == 0) {
         return 0;
      } else {
         var3 = this.a(var1, 0, var2);
         g[var1][0] = -2.0F * var3 * (float)Math.cos((double)this.a(var2, 0, var1));
         g[var1][1] = var3 * var3;

         int var7;
         for(var7 = 1; var7 < this.a[var1]; ++var7) {
            float var4 = this.a(var1, var7, var2);
            float var5 = -2.0F * var4 * (float)Math.cos((double)this.a(var2, var7, var1));
            var4 *= var4;
            g[var1][(var7 << 1) + 1] = g[var1][(var7 << 1) - 1] * var4;
            g[var1][var7 << 1] = g[var1][(var7 << 1) - 1] * var5 + g[var1][(var7 << 1) - 2] * var4;

            for(int var6 = (var7 << 1) - 1; var6 >= 2; --var6) {
               g[var1][var6] += g[var1][var6 - 1] * var5 + g[var1][var6 - 2] * var4;
            }

            g[var1][1] += g[var1][0] * var5 + var4;
            g[var1][0] += var5;
         }

         if(var1 == 0) {
            for(var7 = 0; var7 < this.a[0] << 1; ++var7) {
               g[0][var7] *= h;
            }
         }

         for(var7 = 0; var7 < this.a[var1] << 1; ++var7) {
            b[var1][var7] = (int)(g[var1][var7] * 65536.0F);
         }

         return this.a[var1] << 1;
      }
   }

   public final void a(Buffer var1, Envelope var2) {
      int var3 = var1.e();
      this.a[0] = var3 >> 4;
      this.a[1] = var3 & 15;
      if(var3 == 0) {
         this.f[0] = this.f[1] = 0;
      } else {
         this.f[0] = var1.g();
         this.f[1] = var1.g();
         var3 = var1.e();
         int var4 = 0;

         while(true) {
            int var5;
            if(var4 >= 2) {
               for(var4 = 0; var4 < 2; ++var4) {
                  for(var5 = 0; var5 < this.a[var4]; ++var5) {
                     if((var3 & 1 << (var4 << 2) << var5) != 0) {
                        this.d[var4][1][var5] = var1.g();
                        this.e[var4][1][var5] = var1.g();
                     } else {
                        this.d[var4][1][var5] = this.d[var4][0][var5];
                        this.e[var4][1][var5] = this.e[var4][0][var5];
                     }
                  }
               }

               if(var3 != 0 || this.f[1] != this.f[0]) {
                  var2.b(var1);
                  return;
               }
               break;
            }

            for(var5 = 0; var5 < this.a[var4]; ++var5) {
               this.d[var4][0][var5] = var1.g();
               this.e[var4][0][var5] = var1.g();
            }

            ++var4;
         }
      }

   }
}
