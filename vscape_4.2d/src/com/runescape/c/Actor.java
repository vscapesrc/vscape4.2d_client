package com.runescape.c;
import com.runescape.a.a.Animation;

public class Actor extends Renderable {
   public final int[] a = new int[10];
   public final int[] b = new int[10];
   public int c = -1;
   public int d;
   public int e = 32;
   public int f = -1;
   public String g;
   public int h = 200;
   public int i;
   public int j = -1;
   public int k = -1;
   public int l;
   public final int[] m = new int[4];
   public final int[] n = new int[4];
   public final int[] o = new int[4];
   public int p = -1;
   public int q;
   public int r;
   public int s = -1;
   public int t;
   public int u;
   public int v;
   public int w;
   public int x;
   public int y = -1;
   public int z;
   public int A;
   public int B;
   public int C;
   public int D;
   public int E = -1000;
   public int F;
   public int G;
   public int H = 100;
   public int I;
   public int J;
   public int K;
   public int L = 1;
   public boolean M = false;
   public int N;
   public int O;
   public int P;
   public int Q;
   public int R;
   public int S;
   public int T;
   public int U;
   public int V;
   public int W;
   public int X;
   public final boolean[] Y = new boolean[10];
   public int Z = -1;
   public int aa = -1;
   public int ab = -1;
   public int ac = -1;

   public final void a(int var1, int var2, boolean var3) {
      if(this.y != -1 && Animation.a[this.y].m == 1) {
         this.y = -1;
      }

      if(!var3) {
         int var5 = var1 - this.a[0];
         int var4 = var2 - this.b[0];
         if(var5 >= -8 && var5 <= 8 && var4 >= -8 && var4 <= 8) {
            if(this.x < 9) {
               ++this.x;
            }

            for(var5 = this.x; var5 > 0; --var5) {
               this.a[var5] = this.a[var5 - 1];
               this.b[var5] = this.b[var5 - 1];
               this.Y[var5] = this.Y[var5 - 1];
            }

            this.a[0] = var1;
            this.b[0] = var2;
            this.Y[0] = false;
            return;
         }
      }

      this.x = 0;
      this.N = 0;
      this.d = 0;
      this.a[0] = var1;
      this.b[0] = var2;
      this.V = (this.a[0] << 7) + (this.L << 6);
      this.W = (this.b[0] << 7) + (this.L << 6);
   }

   public final void b() {
      this.x = 0;
      this.N = 0;
   }

   public final void a(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < 4; ++var4) {
         if(this.o[var4] <= var3) {
            this.m[var4] = var2;
            this.n[var4] = var1;
            this.o[var4] = var3 + 70;
            return;
         }
      }

   }

   public final void a(boolean var1, int var2) {
      int var3 = this.a[0];
      int var4 = this.b[0];
      if(var2 == 0) {
         --var3;
         ++var4;
      }

      if(var2 == 1) {
         ++var4;
      }

      if(var2 == 2) {
         ++var3;
         ++var4;
      }

      if(var2 == 3) {
         --var3;
      }

      if(var2 == 4) {
         ++var3;
      }

      if(var2 == 5) {
         --var3;
         --var4;
      }

      if(var2 == 6) {
         --var4;
      }

      if(var2 == 7) {
         ++var3;
         --var4;
      }

      if(this.y != -1 && Animation.a[this.y].m == 1) {
         this.y = -1;
      }

      if(this.x < 9) {
         ++this.x;
      }

      for(var2 = this.x; var2 > 0; --var2) {
         this.a[var2] = this.a[var2 - 1];
         this.b[var2] = this.b[var2 - 1];
         this.Y[var2] = this.Y[var2 - 1];
      }

      this.a[0] = var3;
      this.b[0] = var4;
      this.Y[0] = var1;
   }

   public boolean c() {
      return false;
   }
}
