package com.runescape.utils;
import com.runescape.stream.Buffer;

public final class ChatMessageCodec {
   private static final char[] a = new char[100];
   private static final Buffer b = new Buffer(new byte[100]);
   private static final char[] c = new char[]{' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '\u00a3', '$', '%', '\"', '[', ']', '_', '<', '>', '^', '/', '{', '|', '}', '~', '`'};

   public static String a(int var0, Buffer var1) {
      int var2 = 0;

      int var4;
      for(int var3 = 0; var3 < var0; ++var3) {
         var4 = var1.e();
         a[var2++] = c[var4];
      }

      boolean var6 = true;

      for(var4 = 0; var4 < var2; ++var4) {
         char var5 = a[var4];
         if(var6 && var5 >= 97 && var5 <= 122) {
            a[var4] += '\uffe0';
            var6 = false;
         }

         if(var5 == 46 || var5 == 33 || var5 == 63) {
            var6 = true;
         }
      }

      return new String(a, 0, var2);
   }

   public static void a(String var0, Buffer var1) {
      if(var0.length() > 80) {
         var0 = var0.substring(0, 80);
      }

      var0 = var0.toLowerCase();

      for(int var2 = 0; var2 < var0.length(); ++var2) {
         char var3 = var0.charAt(var2);
         int var4 = 0;

         for(int var5 = 0; var5 < 71; ++var5) {
            if(var3 == c[var5]) {
               var4 = var5;
               break;
            }
         }

         var1.b(var4);
      }

   }

   public static String a(String var0) {
      b.b = 0;
      a(var0, b);
      int var1 = b.b;
      b.b = 0;
      return a(var1, b);
   }
}
