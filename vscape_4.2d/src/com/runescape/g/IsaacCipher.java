package com.runescape.g;
public final class IsaacCipher {
   private int a;
   private final int[] b = new int[256];
   private final int[] c = new int[256];
   private int d;
   private int e;
   private int f;

   public IsaacCipher(int[] var1) {
      System.arraycopy(var1, 0, this.b, 0, 4);
      this.c();
   }

   public final int a() {
      if(this.a-- == 0) {
         this.b();
         this.a = 255;
      }

      return this.b[this.a];
   }

   private void b() {
      this.e += ++this.f;

      for(int var1 = 0; var1 < 256; ++var1) {
         int var2 = this.c[var1];
         if((var1 & 3) == 0) {
            this.d ^= this.d << 13;
         } else if((var1 & 3) == 1) {
            this.d ^= this.d >>> 6;
         } else if((var1 & 3) == 2) {
            this.d ^= this.d << 2;
         } else if((var1 & 3) == 3) {
            this.d ^= this.d >>> 16;
         }

         this.d += this.c[var1 + 128 & 255];
         int var3;
         this.c[var1] = var3 = this.c[(var2 & 1020) >> 2] + this.d + this.e;
         this.b[var1] = this.e = this.c[(var3 >> 8 & 1020) >> 2] + var2;
      }

   }

   private void c() {
      int var1 = -1640531527;
      int var2 = -1640531527;
      int var3 = -1640531527;
      int var4 = -1640531527;
      int var5 = -1640531527;
      int var6 = -1640531527;
      int var7 = -1640531527;
      int var8 = -1640531527;

      int var9;
      for(var9 = 0; var9 < 4; ++var9) {
         var8 ^= var7 << 11;
         var5 += var8;
         var7 = var7 + var6 ^ var6 >>> 2;
         var4 += var7;
         var6 = var6 + var5 ^ var5 << 8;
         var3 += var6;
         var5 = var5 + var4 ^ var4 >>> 16;
         var2 += var5;
         var4 = var4 + var3 ^ var3 << 10;
         var1 += var4;
         var3 = var3 + var2 ^ var2 >>> 4;
         var8 += var3;
         var2 = var2 + var1 ^ var1 << 8;
         var7 += var2;
         var1 = var1 + var8 ^ var8 >>> 9;
         var6 += var1;
         var8 += var7;
      }

      for(var9 = 0; var9 < 256; var9 += 8) {
         var8 += this.b[var9];
         var7 += this.b[var9 + 1];
         var6 += this.b[var9 + 2];
         var5 += this.b[var9 + 3];
         var4 += this.b[var9 + 4];
         var3 += this.b[var9 + 5];
         var2 += this.b[var9 + 6];
         var1 += this.b[var9 + 7];
         var8 ^= var7 << 11;
         var5 += var8;
         var7 = var7 + var6 ^ var6 >>> 2;
         var4 += var7;
         var6 = var6 + var5 ^ var5 << 8;
         var3 += var6;
         var5 = var5 + var4 ^ var4 >>> 16;
         var2 += var5;
         var4 = var4 + var3 ^ var3 << 10;
         var1 += var4;
         var3 = var3 + var2 ^ var2 >>> 4;
         var8 += var3;
         var2 = var2 + var1 ^ var1 << 8;
         var7 += var2;
         var1 = var1 + var8 ^ var8 >>> 9;
         var6 += var1;
         var8 += var7;
         this.c[var9] = var8;
         this.c[var9 + 1] = var7;
         this.c[var9 + 2] = var6;
         this.c[var9 + 3] = var5;
         this.c[var9 + 4] = var4;
         this.c[var9 + 5] = var3;
         this.c[var9 + 6] = var2;
         this.c[var9 + 7] = var1;
      }

      for(var9 = 0; var9 < 256; var9 += 8) {
         var8 += this.c[var9];
         var7 += this.c[var9 + 1];
         var6 += this.c[var9 + 2];
         var5 += this.c[var9 + 3];
         var4 += this.c[var9 + 4];
         var3 += this.c[var9 + 5];
         var2 += this.c[var9 + 6];
         var1 += this.c[var9 + 7];
         var8 ^= var7 << 11;
         var5 += var8;
         var7 = var7 + var6 ^ var6 >>> 2;
         var4 += var7;
         var6 = var6 + var5 ^ var5 << 8;
         var3 += var6;
         var5 = var5 + var4 ^ var4 >>> 16;
         var2 += var5;
         var4 = var4 + var3 ^ var3 << 10;
         var1 += var4;
         var3 = var3 + var2 ^ var2 >>> 4;
         var8 += var3;
         var2 = var2 + var1 ^ var1 << 8;
         var7 += var2;
         var1 = var1 + var8 ^ var8 >>> 9;
         var6 += var1;
         var8 += var7;
         this.c[var9] = var8;
         this.c[var9 + 1] = var7;
         this.c[var9 + 2] = var6;
         this.c[var9 + 3] = var5;
         this.c[var9 + 4] = var4;
         this.c[var9 + 5] = var3;
         this.c[var9 + 6] = var2;
         this.c[var9 + 7] = var1;
      }

      this.b();
      this.a = 256;
   }
}
