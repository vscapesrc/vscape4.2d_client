package com.runescape.k;
import com.runescape.i.SignLink;

public final class StringUtils {
   private static final char[] a = new char[]{' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '_'};

   public static long a(String var0) {
      long var1 = 0L;

      for(int var3 = 0; var3 < var0.length() && var3 < 12; ++var3) {
         char var4 = var0.charAt(var3);
         var1 *= 38L;
         if(var4 >= 65 && var4 <= 90) {
            var1 += (long)(var4 + 1 - 65);
         } else if(var4 >= 97 && var4 <= 122) {
            var1 += (long)(var4 + 1 - 97);
         } else if(var4 >= 48 && var4 <= 57) {
            var1 += (long)(var4 + 27 - 48);
         } else if(var4 == 95) {
            var1 += 37L;
         }
      }

      while(var1 % 38L == 0L && var1 != 0L) {
         var1 /= 38L;
      }

      return var1;
   }

   public static String a(long var0) {
      if(var0 > 0L && var0 < 9065737908494995456L) {
         try {
            if(var0 % 38L == 0L) {
               return "invalid_name";
            } else {
               int var2 = 0;

               char[] var3;
               long var4;
               for(var3 = new char[12]; var0 != 0L; var3[11 - var2++] = a[(int)(var4 - var0 * 38L)]) {
                  var4 = var0;
                  var0 /= 38L;
               }

               return new String(var3, 12 - var2, var2);
            }
         } catch (RuntimeException var6) {
            SignLink.b("81570, " + var0 + ", -99" + ", " + var6.toString());
            throw new RuntimeException();
         }
      } else {
         return "invalid_name";
      }
   }

   public static long b(String var0) {
      var0 = var0.toUpperCase();
      long var1 = 0L;

      for(int var3 = 0; var3 < var0.length(); ++var3) {
         var1 = (var1 = var1 * 61L + (long)var0.charAt(var3) - 32L) + (var1 >> 56) & 72057594037927935L;
      }

      return var1;
   }

   public static String a(int var0) {
      return (var0 >>> 24) + "." + (var0 >> 16 & 255) + "." + (var0 >> 8 & 255) + "." + (var0 & 255);
   }

   public static String c(String var0) {
      if(var0.length() <= 0) {
         return var0;
      } else {
         char[] var2 = var0.toCharArray();

         for(int var1 = 0; var1 < var2.length; ++var1) {
            if((var2[var1] == 95 || var2[var1] == 32) && var1 + 1 < var2.length && var2[var1 + 1] >= 97 && var2[var1 + 1] <= 122) {
               var2[var1 + 1] = (char)(var2[var1 + 1] + 65 - 97);
            }
         }

         if(var2[0] >= 97 && var2[0] <= 122) {
            var2[0] = (char)(var2[0] + 65 - 97);
         }

         return new String(var2);
      }
   }

   public static String d(String var0) {
      StringBuffer var1 = new StringBuffer();

      for(int var2 = 0; var2 < var0.length(); ++var2) {
         var1.append("*");
      }

      return var1.toString();
   }
}
