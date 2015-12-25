package com.runescape.c.a;
import com.runescape.a.Archive;
import com.runescape.d.Buffer;

public final class IdentityKit {
   public static int a;
   public static IdentityKit[] b;
   public int c = -1;
   private int[] e;
   private final int[] f = new int[6];
   private final int[] g = new int[6];
   private final int[] h = new int[]{-1, -1, -1, -1, -1};
   public boolean d = false;

   public static void a(Archive var0) {
      Buffer var6;
      a = (var6 = new Buffer(var0.a("idk.dat"))).g();
      if(b == null) {
         b = new IdentityKit[a];
      }

      label67:
      for(int var1 = 0; var1 < a; ++var1) {
         if(b[var1] == null) {
            b[var1] = new IdentityKit();
         }

         IdentityKit var10000 = b[var1];
         Buffer var2 = var6;
         IdentityKit var3 = var10000;

         while(true) {
            while(true) {
               int var4;
               if((var4 = var2.e()) == 0) {
                  continue label67;
               }

               if(var4 == 1) {
                  var3.c = var2.e();
               } else if(var4 == 2) {
                  var4 = var2.e();
                  var3.e = new int[var4];

                  for(int var5 = 0; var5 < var4; ++var5) {
                     var3.e[var5] = var2.g();
                  }
               } else if(var4 == 3) {
                  var3.d = true;
               } else if(var4 >= 40 && var4 < 50) {
                  var3.f[var4 - 40] = var2.g();
               } else if(var4 >= 50 && var4 < 60) {
                  var3.g[var4 - 50] = var2.g();
               } else if(var4 >= 60 && var4 < 70) {
                  var3.h[var4 - 60] = var2.g();
               } else {
                  System.out.println("Error unrecognised config code: " + var4);
               }
            }
         }
      }

   }

   public final boolean a() {
      if(this.e == null) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.e.length; ++var2) {
            if(!Model.b(this.e[var2])) {
               var1 = false;
            }
         }

         return var1;
      }
   }

   public final Model b() {
      if(this.e == null) {
         return null;
      } else {
         Model[] var1 = new Model[this.e.length];

         for(int var2 = 0; var2 < this.e.length; ++var2) {
            var1[var2] = Model.a(this.e[var2]);
         }

         Model var4;
         if(var1.length == 1) {
            var4 = var1[0];
         } else {
            var4 = new Model(var1.length, var1);
         }

         for(int var3 = 0; var3 < 6 && this.f[var3] != 0; ++var3) {
            var4.a(this.f[var3], this.g[var3]);
         }

         return var4;
      }
   }

   public final boolean c() {
      boolean var1 = true;

      for(int var2 = 0; var2 < 5; ++var2) {
         if(this.h[var2] != -1 && !Model.b(this.h[var2])) {
            var1 = false;
         }
      }

      return var1;
   }

   public final Model d() {
      Model[] var1 = new Model[5];
      int var2 = 0;

      for(int var3 = 0; var3 < 5; ++var3) {
         if(this.h[var3] != -1) {
            var1[var2++] = Model.a(this.h[var3]);
         }
      }

      Model var5 = new Model(var2, var1);

      for(int var4 = 0; var4 < 6 && this.f[var4] != 0; ++var4) {
         var5.a(this.f[var4], this.g[var4]);
      }

      return var5;
   }
}
