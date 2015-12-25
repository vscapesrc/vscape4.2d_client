package com.runescape.entity;
import com.runescape.cache.anim.Frame;
import com.runescape.cache.anim.SpotAnimation;
import com.runescape.entity.model.Model;

public final class Projectile extends Renderable {
   public final int a;
   public final int b;
   private double j;
   private double k;
   private double l;
   private double m;
   private double n;
   private boolean o = false;
   private final int p;
   private final int q;
   private final int r;
   public final int c;
   public double d;
   public double e;
   public double f;
   private final int s;
   private final int t;
   public final int g;
   private final SpotAnimation u;
   private int v;
   private int w;
   public int h;
   private int x;
   public final int i;

   public final void a(int var1, int var2, int var3, int var4) {
      double var5;
      if(!this.o) {
         var5 = (double)(var4 - this.p);
         double var7 = (double)(var2 - this.q);
         double var9 = Math.sqrt(var5 * var5 + var7 * var7);
         this.d = (double)this.p + var5 * (double)this.t / var9;
         this.e = (double)this.q + var7 * (double)this.t / var9;
         this.f = (double)this.r;
      }

      var5 = (double)(this.b + 1 - var1);
      this.j = ((double)var4 - this.d) / var5;
      this.k = ((double)var2 - this.e) / var5;
      this.l = Math.sqrt(this.j * this.j + this.k * this.k);
      if(!this.o) {
         this.m = -this.l * Math.tan((double)this.s * 0.02454369D);
      }

      this.n = 2.0D * ((double)var3 - this.f - this.m * var5) / (var5 * var5);
   }

   public final Model a() {
      Model var1;
      if((var1 = this.u.a()) == null) {
         return null;
      } else {
         int var2 = -1;
         if(this.u.b != null) {
            var2 = this.u.b.c[this.v];
         }

         var1 = new Model(true, Frame.b(var2), false, var1);
         if(var2 != -1) {
            var1.d();
            var1.c(var2);
            var1.v = null;
            var1.u = null;
         }

         if(this.u.c != 128 || this.u.d != 128) {
            var1.b(this.u.c, this.u.c, this.u.d);
         }

         int var3 = this.x;
         Model var7 = var1;
         int var4 = Model.D[var3];
         var3 = Model.E[var3];

         for(int var5 = 0; var5 < var7.b; ++var5) {
            int var6 = var7.d[var5] * var3 - var7.e[var5] * var4 >> 16;
            var7.e[var5] = var7.d[var5] * var4 + var7.e[var5] * var3 >> 16;
            var7.d[var5] = var6;
         }

         var1.a(64 + this.u.f, 850 + this.u.g, -30, -50, -30, true);
         return var1;
      }
   }

   public Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      this.u = SpotAnimation.a[var11];
      this.i = var6;
      this.p = var9;
      this.q = var8;
      this.r = var7;
      this.a = var3;
      this.b = var4;
      this.s = var1;
      this.t = var5;
      this.g = var10;
      this.c = var2;
      this.o = false;
   }

   public final void a(int var1) {
      this.o = true;
      this.d += this.j * (double)var1;
      this.e += this.k * (double)var1;
      this.f += this.m * (double)var1 + 0.5D * this.n * (double)var1 * (double)var1;
      this.m += this.n * (double)var1;
      this.h = (int)(Math.atan2(this.j, this.k) * 325.949D) + 1024 & 2047;
      this.x = (int)(Math.atan2(this.m, this.l) * 325.949D) & 2047;
      if(this.u.b != null) {
         this.w += var1;

         while(this.w > this.u.b.a(this.v)) {
            this.w -= this.u.b.a(this.v) + 1;
            ++this.v;
            if(this.v >= this.u.b.b) {
               this.v = 0;
            }
         }
      }

   }
}
