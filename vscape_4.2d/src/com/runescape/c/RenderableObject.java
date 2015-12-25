package com.runescape.c;
import com.runescape.Client;
import com.runescape.a.a.Animation;
import com.runescape.a.b.ItemDefinition;
import com.runescape.c.a.Model;
import com.runescape.h.VarBits;

public final class RenderableObject extends Renderable {
   private int b;
   private final int[] c;
   private final int d;
   private final int e;
   private final int f;
   private final int g;
   private final int h;
   private final int i;
   private Animation j;
   private int k;
   public static Client a;
   private final int l;
   private final int m;
   private final int n;

   private ItemDefinition b() {
      int var1 = -1;
      if(this.d != -1) {
         try {
            VarBits var2;
            int var3 = (var2 = VarBits.a[this.d]).b;
            int var4 = var2.c;
            int var6 = var2.d;
            var6 = Client.F[var6 - var4];
            var1 = a.m[var3] >> var4 & var6;
         } catch (Exception var5) {
            ;
         }
      } else if(this.e != -1) {
         var1 = a.m[this.e];
      }

      return var1 >= 0 && var1 < this.c.length && this.c[var1] != -1?ItemDefinition.a(this.c[var1]):null;
   }

   public final Model a() {
      int var1 = -1;
      if(this.j != null) {
         int var2;
         if((var2 = Client.x - this.k) > 100 && this.j.e > 0) {
            var2 = 100;
         }

         label40: {
            do {
               do {
                  if(var2 <= this.j.a(this.b)) {
                     break label40;
                  }

                  var2 -= this.j.a(this.b);
                  ++this.b;
               } while(this.b < this.j.b);

               this.b -= this.j.e;
            } while(this.b >= 0 && this.b < this.j.b);

            this.j = null;
         }

         this.k = Client.x - var2;
         if(this.j != null) {
            var1 = this.j.c[this.b];
         }
      }

      ItemDefinition var3;
      if(this.c != null) {
         var3 = this.b();
      } else {
         var3 = ItemDefinition.a(this.l);
      }

      return var3 == null?null:var3.a(this.m, this.n, this.f, this.g, this.h, this.i, var1);
   }

   public RenderableObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      this.l = var1;
      this.m = var3;
      this.n = var2;
      this.f = var6;
      this.g = var4;
      this.h = var5;
      this.i = var7;
      if(var8 != -1) {
         this.j = Animation.a[var8];
         this.b = 0;
         this.k = Client.x;
         if(var9 && this.j.e != -1) {
            this.b = (int)(Math.random() * (double)this.j.b);
            this.k -= (int)(Math.random() * (double)this.j.a(this.b));
         }
      }

      ItemDefinition var10 = ItemDefinition.a(this.l);
      this.d = var10.r;
      this.e = var10.e;
      this.c = var10.j;
   }
}
