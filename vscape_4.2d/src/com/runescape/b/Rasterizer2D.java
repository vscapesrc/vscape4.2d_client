package com.runescape.b;
import com.runescape.e.CacheableNode;

public class Rasterizer2D extends CacheableNode {
   public static int[] h;
   public static int i;
   public static int j;
   public static int k;
   public static int l;
   public static int m;
   public static int n;
   public static int o;
   public static int p;
   public static int q;

   public static void a(int var0, int var1, int[] var2) {
      h = var2;
      i = var1;
      j = var0;
      b(var0, 0, var1, 0);
   }

   public static void a(int var0, int var1, int var2, int var3) {
      if(var1 >= k && var1 < l) {
         if(var0 < m) {
            var2 -= m - var0;
            var0 = m;
         }

         if(var0 + var2 > n) {
            var2 = n - var0;
         }

         var0 += var1 * i;

         for(var1 = 0; var1 < var2; ++var1) {
            h[var0 + var1] = var3;
         }
      }

   }

   public static void c() {
      m = 0;
      k = 0;
      n = i;
      l = j;
      o = n;
      p = n / 2;
   }

   public static void b(int var0, int var1, int var2, int var3) {
      if(var1 < 0) {
         var1 = 0;
      }

      if(var3 < 0) {
         var3 = 0;
      }

      if(var2 > i) {
         var2 = i;
      }

      if(var0 > j) {
         var0 = j;
      }

      m = var1;
      k = var3;
      n = var2;
      l = var0;
      o = n;
      p = n / 2;
      q = l / 2;
   }

   public static void d() {
      int var0 = i * j;

      for(int var1 = 0; var1 < var0; ++var1) {
         h[var1] = 0;
      }

   }

   public static void a(int var0, int var1, int var2, int var3, int var4, int var5) {
      if(var5 < m) {
         var2 -= m - var5;
         var5 = m;
      }

      if(var1 < k) {
         var3 -= k - var1;
         var1 = k;
      }

      if(var5 + var2 > n) {
         var2 = n - var5;
      }

      if(var1 + var3 > l) {
         var3 = l - var1;
      }

      int var6 = 256 - var4;
      int var7 = (var0 >> 16 & 255) * var4;
      int var8 = (var0 >> 8 & 255) * var4;
      var0 = (var0 & 255) * var4;
      var4 = i - var2;
      var1 = var5 + var1 * i;

      for(var5 = 0; var5 < var3; ++var5) {
         for(int var9 = -var2; var9 < 0; ++var9) {
            int var10 = (h[var1] >> 16 & 255) * var6;
            int var11 = (h[var1] >> 8 & 255) * var6;
            int var12 = (h[var1] & 255) * var6;
            var10 = (var7 + var10 >> 8 << 16) + (var8 + var11 >> 8 << 8) + (var0 + var12 >> 8);
            h[var1++] = var10;
         }

         var1 += var4;
      }

   }

   public static void a(int var0, int var1, int var2, int var3, int var4) {
      if(var2 < m) {
         var4 -= m - var2;
         var2 = m;
      }

      if(var1 < k) {
         var0 -= k - var1;
         var1 = k;
      }

      if(var2 + var4 > n) {
         var4 = n - var2;
      }

      if(var1 + var0 > l) {
         var0 = l - var1;
      }

      int var5 = i - var4;
      var1 = var2 + var1 * i;

      for(var0 = -var0; var0 < 0; ++var0) {
         for(var2 = -var4; var2 < 0; ++var2) {
            h[var1++] = var3;
         }

         var1 += var5;
      }

   }

   public static void b(int var0, int var1, int var2, int var3, int var4) {
      c(var4, var3, var1, var0);
      c(var4 + var2 - 1, var3, var1, var0);
      d(var4, var3, var2, var0);
      d(var4, var3, var2, var0 + var1 - 1);
   }

   public static void b(int var0, int var1, int var2, int var3, int var4, int var5) {
      c(var3, var4, var0, var2, var5);
      c(var3, var4, var0 + var1 - 1, var2, var5);
      if(var1 >= 3) {
         d(var3, var5, var2, var0 + 1, var1 - 2);
         d(var3, var5 + var4 - 1, var2, var0 + 1, var1 - 2);
      }

   }

   public static void c(int var0, int var1, int var2, int var3) {
      if(var0 >= k && var0 < l) {
         if(var3 < m) {
            var2 -= m - var3;
            var3 = m;
         }

         if(var3 + var2 > n) {
            var2 = n - var3;
         }

         var0 = var3 + var0 * i;

         for(var3 = 0; var3 < var2; ++var3) {
            h[var0 + var3] = var1;
         }

      }
   }

   public static void c(int var0, int var1, int var2, int var3, int var4) {
      if(var2 >= k && var2 < l) {
         if(var4 < m) {
            var1 -= m - var4;
            var4 = m;
         }

         if(var4 + var1 > n) {
            var1 = n - var4;
         }

         int var5 = 256 - var3;
         int var6 = (var0 >> 16 & 255) * var3;
         int var7 = (var0 >> 8 & 255) * var3;
         var0 = (var0 & 255) * var3;
         var2 = var4 + var2 * i;

         for(var3 = 0; var3 < var1; ++var3) {
            var4 = (h[var2] >> 16 & 255) * var5;
            int var8 = (h[var2] >> 8 & 255) * var5;
            int var9 = (h[var2] & 255) * var5;
            var4 = (var6 + var4 >> 8 << 16) + (var7 + var8 >> 8 << 8) + (var0 + var9 >> 8);
            h[var2++] = var4;
         }

      }
   }

   public static void d(int var0, int var1, int var2, int var3) {
      if(var3 >= m && var3 < n) {
         if(var0 < k) {
            var2 -= k - var0;
            var0 = k;
         }

         if(var0 + var2 > l) {
            var2 = l - var0;
         }

         var0 = var3 + var0 * i;

         for(var3 = 0; var3 < var2; ++var3) {
            h[var0 + var3 * i] = var1;
         }

      }
   }

   private static void d(int var0, int var1, int var2, int var3, int var4) {
      if(var1 >= m && var1 < n) {
         if(var3 < k) {
            var4 -= k - var3;
            var3 = k;
         }

         if(var3 + var4 > l) {
            var4 = l - var3;
         }

         int var5 = 256 - var2;
         int var6 = (var0 >> 16 & 255) * var2;
         int var7 = (var0 >> 8 & 255) * var2;
         var0 = (var0 & 255) * var2;
         var1 += var3 * i;

         for(var2 = 0; var2 < var4; ++var2) {
            var3 = (h[var1] >> 16 & 255) * var5;
            int var8 = (h[var1] >> 8 & 255) * var5;
            int var9 = (h[var1] & 255) * var5;
            var3 = (var6 + var3 >> 8 << 16) + (var7 + var8 >> 8 << 8) + (var0 + var9 >> 8);
            h[var1] = var3;
            var1 += i;
         }

      }
   }
}
