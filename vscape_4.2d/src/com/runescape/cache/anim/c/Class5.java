package com.runescape.cache.anim.c;
import com.runescape.stream.Buffer;

public final class Class5 {
   public final int[] a;
   public final int[][] b;

   public Class5(Buffer var1) {
      int var2 = var1.e();
      this.a = new int[var2];
      this.b = new int[var2][];

      int var3;
      for(var3 = 0; var3 < var2; ++var3) {
         this.a[var3] = var1.e();
      }

      for(var3 = 0; var3 < var2; ++var3) {
         this.b[var3] = new int[var1.e()];
      }

      for(var3 = 0; var3 < var2; ++var3) {
         for(int var4 = 0; var4 < this.b[var3].length; ++var4) {
            this.b[var3][var4] = var1.e();
         }
      }

   }
}
