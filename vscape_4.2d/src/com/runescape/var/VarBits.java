package com.runescape.var;
import com.runescape.cache.Archive;
import com.runescape.stream.Buffer;

public final class VarBits {
   public static VarBits[] a;
   public int b;
   public int c;
   public int d;
   private boolean e = false;

   public static void a(Archive var0) {
      Buffer var6;
      int var1 = (var6 = new Buffer(var0.a("varbit.dat"))).g();
      if(a == null) {
         a = new VarBits[var1];
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         if(a[var2] == null) {
            a[var2] = new VarBits();
         }

         VarBits var10000 = a[var2];
         Buffer var3 = var6;
         VarBits var4 = var10000;

         int var5;
         while((var5 = var3.e()) != 0) {
            if(var5 == 1) {
               var4.b = var3.g();
               var4.c = var3.e();
               var4.d = var3.e();
            } else if(var5 == 10) {
               var3.l();
            } else if(var5 == 2) {
               var4.e = true;
            } else if(var5 == 3) {
               var3.j();
            } else if(var5 == 4) {
               var3.j();
            } else {
               System.out.println("Error unrecognised config code: " + var5);
            }
         }
      }

      if(var6.b != var6.a.length) {
         System.out.println("varbit load mismatch");
      }

   }
}
