package com.runescape.f;
public final class ShapedTile {
   final int[] a;
   final int[] b;
   final int[] c;
   final int[] d;
   final int[] e;
   final int[] f;
   final int[] g;
   final int[] h;
   final int[] i;
   int[] j;
   final boolean k;
   final int l;
   final int m;
   final int n;
   final int o;
   static final int[] p = new int[6];
   static final int[] q = new int[6];
   static final int[] r = new int[6];
   static final int[] s = new int[6];
   static final int[] t = new int[6];
   private static final int[][] u;
   private static final int[][] v;

   static {
      int[] var10000 = new int[]{1, 0};
      var10000 = new int[]{2, 1};
      var10000 = new int[]{3, 3};
      u = new int[][]{{1, 3, 5, 7}, {1, 3, 5, 7}, {1, 3, 5, 7}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 2, 6}, {1, 3, 5, 7, 2, 8}, {1, 3, 5, 7, 2, 8}, {1, 3, 5, 7, 11, 12}, {1, 3, 5, 7, 11, 12}, {1, 3, 5, 7, 13, 14}};
      v = new int[][]{{0, 1, 2, 3, 0, 0, 1, 3}, {1, 1, 2, 3, 1, 0, 1, 3}, {0, 1, 2, 3, 1, 0, 1, 3}, {0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3}, {0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4}, {0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4}, {0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3}, {0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3}, {0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5}, {0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5}, {0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3}, {1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3}, {1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5}};
   }

   public ShapedTile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19) {
      this.k = var13 == var12 && var13 == var4 && var13 == var11;
      this.l = var14;
      this.m = var7;
      this.n = var9;
      this.o = var19;
      int[] var29;
      var19 = (var29 = u[var14]).length;
      this.a = new int[var19];
      this.b = new int[var19];
      this.c = new int[var19];
      int[] var20 = new int[var19];
      int[] var21 = new int[var19];
      var18 <<= 7;
      var1 <<= 7;

      int var23;
      int var24;
      int var25;
      int var26;
      int var27;
      int var28;
      for(int var22 = 0; var22 < var19; ++var22) {
         if(((var23 = var29[var22]) & 1) == 0 && var23 <= 8) {
            var23 = (var23 - var7 - var7 - 1 & 7) + 1;
         }

         if(var23 > 8 && var23 <= 12) {
            var23 = (var23 - 9 - var7 & 3) + 9;
         }

         if(var23 > 12 && var23 <= 16) {
            var23 = (var23 - 13 - var7 & 3) + 13;
         }

         if(var23 == 1) {
            var24 = var18;
            var25 = var1;
            var26 = var13;
            var27 = var8;
            var28 = var2;
         } else if(var23 == 2) {
            var24 = var18 + 64;
            var25 = var1;
            var26 = var13 + var12 >> 1;
            var27 = var8 + var17 >> 1;
            var28 = var2 + var16 >> 1;
         } else if(var23 == 3) {
            var24 = var18 + 128;
            var25 = var1;
            var26 = var12;
            var27 = var17;
            var28 = var16;
         } else if(var23 == 4) {
            var24 = var18 + 128;
            var25 = var1 + 64;
            var26 = var12 + var4 >> 1;
            var27 = var17 + var10 >> 1;
            var28 = var16 + var6 >> 1;
         } else if(var23 == 5) {
            var24 = var18 + 128;
            var25 = var1 + 128;
            var26 = var4;
            var27 = var10;
            var28 = var6;
         } else if(var23 == 6) {
            var24 = var18 + 64;
            var25 = var1 + 128;
            var26 = var4 + var11 >> 1;
            var27 = var10 + var3 >> 1;
            var28 = var6 + var15 >> 1;
         } else if(var23 == 7) {
            var24 = var18;
            var25 = var1 + 128;
            var26 = var11;
            var27 = var3;
            var28 = var15;
         } else if(var23 == 8) {
            var24 = var18;
            var25 = var1 + 64;
            var26 = var11 + var13 >> 1;
            var27 = var3 + var8 >> 1;
            var28 = var15 + var2 >> 1;
         } else if(var23 == 9) {
            var24 = var18 + 64;
            var25 = var1 + 32;
            var26 = var13 + var12 >> 1;
            var27 = var8 + var17 >> 1;
            var28 = var2 + var16 >> 1;
         } else if(var23 == 10) {
            var24 = var18 + 96;
            var25 = var1 + 64;
            var26 = var12 + var4 >> 1;
            var27 = var17 + var10 >> 1;
            var28 = var16 + var6 >> 1;
         } else if(var23 == 11) {
            var24 = var18 + 64;
            var25 = var1 + 96;
            var26 = var4 + var11 >> 1;
            var27 = var10 + var3 >> 1;
            var28 = var6 + var15 >> 1;
         } else if(var23 == 12) {
            var24 = var18 + 32;
            var25 = var1 + 64;
            var26 = var11 + var13 >> 1;
            var27 = var3 + var8 >> 1;
            var28 = var15 + var2 >> 1;
         } else if(var23 == 13) {
            var24 = var18 + 32;
            var25 = var1 + 32;
            var26 = var13;
            var27 = var8;
            var28 = var2;
         } else if(var23 == 14) {
            var24 = var18 + 96;
            var25 = var1 + 32;
            var26 = var12;
            var27 = var17;
            var28 = var16;
         } else if(var23 == 15) {
            var24 = var18 + 96;
            var25 = var1 + 96;
            var26 = var4;
            var27 = var10;
            var28 = var6;
         } else {
            var24 = var18 + 32;
            var25 = var1 + 96;
            var26 = var11;
            var27 = var3;
            var28 = var15;
         }

         this.a[var22] = var24;
         this.b[var22] = var26;
         this.c[var22] = var25;
         var20[var22] = var27;
         var21[var22] = var28;
      }

      int[] var30;
      var23 = (var30 = v[var14]).length / 4;
      this.g = new int[var23];
      this.h = new int[var23];
      this.i = new int[var23];
      this.d = new int[var23];
      this.e = new int[var23];
      this.f = new int[var23];
      if(var5 != -1) {
         this.j = new int[var23];
      }

      var24 = 0;

      for(var25 = 0; var25 < var23; ++var25) {
         var26 = var30[var24];
         var27 = var30[var24 + 1];
         var28 = var30[var24 + 2];
         var1 = var30[var24 + 3];
         var24 += 4;
         if(var27 < 4) {
            var27 = var27 - var7 & 3;
         }

         if(var28 < 4) {
            var28 = var28 - var7 & 3;
         }

         if(var1 < 4) {
            var1 = var1 - var7 & 3;
         }

         this.g[var25] = var27;
         this.h[var25] = var28;
         this.i[var25] = var1;
         if(var26 == 0) {
            this.d[var25] = var20[var27];
            this.e[var25] = var20[var28];
            this.f[var25] = var20[var1];
            if(this.j != null) {
               this.j[var25] = -1;
            }
         } else {
            this.d[var25] = var21[var27];
            this.e[var25] = var21[var28];
            this.f[var25] = var21[var1];
            if(this.j != null) {
               this.j[var25] = var5;
            }
         }
      }

   }
}
