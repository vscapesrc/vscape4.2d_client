package com.runescape.c;
import com.runescape.a.a.Animation;
import com.runescape.a.a.Frame;
import com.runescape.a.a.SpotAnimation;
import com.runescape.a.b.ActorDefinition;
import com.runescape.c.a.Model;

public final class Npc extends Actor {
   public ActorDefinition ad;

   public final Model a() {
      if(this.ad == null) {
         return null;
      } else {
         Model var10000;
         int var2;
         if(super.y >= 0 && super.B == 0) {
            var2 = Animation.a[super.y].c[super.z];
            int var3 = -1;
            if(super.p >= 0 && super.p != super.j) {
               var3 = Animation.a[super.p].c[super.q];
            }

            var10000 = this.ad.a(var3, var2, Animation.a[super.y].f);
         } else {
            var2 = -1;
            if(super.p >= 0) {
               var2 = Animation.a[super.p].c[super.q];
            }

            var10000 = this.ad.a(-1, var2, (int[])null);
         }

         Model var1 = var10000;
         if(var10000 == null) {
            return null;
         } else {
            super.h = var1.aE;
            SpotAnimation var6;
            Model var7;
            if(super.s != -1 && super.t != -1 && (var7 = (var6 = SpotAnimation.a[super.s]).a()) != null) {
               int var4 = var6.b.c[super.t];
               (var7 = new Model(true, Frame.b(var4), false, var7)).a(0, -super.w, 0);
               var7.d();
               var7.c(var4);
               var7.v = null;
               var7.u = null;
               if(var6.c != 128 || var6.d != 128) {
                  var7.b(var6.c, var6.c, var6.d);
               }

               var7.a(64 + var6.f, 850 + var6.g, -30, -50, -30, true);
               Model[] var5 = new Model[]{var1, var7};
               var1 = new Model(var5);
            }

            if(this.ad.i == 1) {
               var1.w = true;
            }

            return var1;
         }
      }
   }

   public final boolean c() {
      return this.ad != null;
   }
}
