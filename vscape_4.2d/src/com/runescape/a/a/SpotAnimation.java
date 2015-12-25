package com.runescape.a.a;
import com.runescape.a.Archive;
import com.runescape.c.a.Model;
import com.runescape.d.Buffer;
import com.runescape.e.Cache;

public final class SpotAnimation {
   public static SpotAnimation[] a;
   private int i;
   private int j;
   private int k = -1;
   public Animation b;
   private final int[] l = new int[6];
   private final int[] m = new int[6];
   public int c = 128;
   public int d = 128;
   public int e;
   public int f;
   public int g;
   public static Cache h = new Cache(30);

   public static void a(Archive var0) {
      Buffer var7;
      int var1 = (var7 = new Buffer(var0.a("spotanim.dat"))).g();
      if(a == null) {
         a = new SpotAnimation[var1];
      }

      label71:
      for(int var2 = 0; var2 < var1; ++var2) {
         if(a[var2] == null) {
            a[var2] = new SpotAnimation();
         }

         a[var2].i = var2;
         SpotAnimation var10000 = a[var2];
         Buffer var3 = var7;
         SpotAnimation var4 = var10000;

         while(true) {
            while(true) {
               int var5;
               if((var5 = var3.e()) == 0) {
                  continue label71;
               }

               if(var5 == 1) {
                  var4.j = var3.g();
               } else if(var5 == 2) {
                  var4.k = var3.g();
                  if(Animation.a != null) {
                     var4.b = Animation.a[var4.k];
                  }
               } else if(var5 == 4) {
                  var4.c = var3.g();
               } else if(var5 == 5) {
                  var4.d = var3.g();
               } else if(var5 == 6) {
                  var4.e = var3.g();
               } else if(var5 == 7) {
                  var4.f = var3.e();
               } else if(var5 == 8) {
                  var4.g = var3.e();
               } else if(var5 == 40) {
                  var5 = var3.e();

                  for(int var6 = 0; var6 < var5; ++var6) {
                     var4.l[var6] = var3.g();
                     var4.m[var6] = var3.g();
                  }
               } else {
                  System.out.println("Error unrecognised spotanim config code: " + var5);
               }
            }
         }
      }

   }

   public final Model a() {
      Model var1;
      if((var1 = (Model)h.a((long)this.i)) != null) {
         return var1;
      } else if((var1 = Model.a(this.j)) == null) {
         return null;
      } else {
         for(int var2 = 0; var2 < 6; ++var2) {
            if(this.l[0] != 0) {
               var1.a(this.l[var2], this.m[var2]);
            }
         }

         h.a(var1, (long)this.i);
         return var1;
      }
   }
}
