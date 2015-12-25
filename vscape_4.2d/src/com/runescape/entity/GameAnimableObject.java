package com.runescape.entity;
import com.runescape.cache.anim.Frame;
import com.runescape.cache.anim.SpotAnimation;
import com.runescape.entity.model.Model;

public final class GameAnimableObject extends Renderable {
   public final int a;
   public final int b;
   public final int c;
   public final int d;
   public final int e;
   public boolean f = false;
   private final SpotAnimation g;
   private int h;
   private int i;

   public GameAnimableObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.g = SpotAnimation.a[var4];
      this.a = var1;
      this.b = var7;
      this.c = var6;
      this.d = var5;
      this.e = var2 + var3;
      this.f = false;
   }

   public final Model a() {
      Model var1;
      if((var1 = this.g.a()) == null) {
         return null;
      } else {
         int var2 = this.g.b.c[this.h];
         var1 = new Model(true, Frame.b(var2), false, var1);
         if(!this.f) {
            var1.d();
            var1.c(var2);
            var1.v = null;
            var1.u = null;
         }

         if(this.g.c != 128 || this.g.d != 128) {
            var1.b(this.g.c, this.g.c, this.g.d);
         }

         if(this.g.e != 0) {
            if(this.g.e == 90) {
               var1.e();
            }

            if(this.g.e == 180) {
               var1.e();
               var1.e();
            }

            if(this.g.e == 270) {
               var1.e();
               var1.e();
               var1.e();
            }
         }

         var1.a(64 + this.g.f, 850 + this.g.g, -30, -50, -30, true);
         return var1;
      }
   }

   public final void a(int var1) {
      this.i += var1;

      while(true) {
         do {
            do {
               if(this.i <= this.g.b.a(this.h)) {
                  return;
               }

               this.i -= this.g.b.a(this.h) + 1;
               ++this.h;
            } while(this.h < this.g.b.b);
         } while(this.h >= 0 && this.h < this.g.b.b);

         this.h = 0;
         this.f = true;
      }
   }
}
