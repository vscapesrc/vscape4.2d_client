package com.runescape.var;
import com.runescape.cache.Archive;
import com.runescape.stream.Buffer;

public final class Varp {
   public static Varp[] a;
   private static int c;
   private static int[] d;
   public int b;

   public static void a(Archive var0) {
      Buffer var7 = new Buffer(var0.a("varp.dat"));
      c = 0;
      int var1 = var7.g();
      if(a == null) {
         a = new Varp[var1];
      }

      if(d == null) {
         d = new int[var1];
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         if(a[var2] == null) {
            a[var2] = new Varp();
         }

         Varp var10000 = a[var2];
         int var3 = var2;
         Buffer var4 = var7;
         Varp var5 = var10000;

         int var6;
         while((var6 = var4.e()) != 0) {
            if(var6 == 1) {
               var4.e();
            } else if(var6 == 2) {
               var4.e();
            } else if(var6 == 3) {
               d[c++] = var3;
            } else if(var6 != 4) {
               if(var6 == 5) {
                  var5.b = var4.g();
               } else if(var6 != 6) {
                  if(var6 == 7) {
                     var4.j();
                  } else if(var6 != 8) {
                     if(var6 == 10) {
                        var4.l();
                     } else if(var6 != 11) {
                        if(var6 == 12) {
                           var4.j();
                        } else if(var6 != 13) {
                           System.out.println("Error unrecognised config code: " + var6);
                        }
                     }
                  }
               }
            }
         }
      }

      if(var7.b != var7.a.length) {
         System.out.println("varptype load mismatch");
      }

   }
}
