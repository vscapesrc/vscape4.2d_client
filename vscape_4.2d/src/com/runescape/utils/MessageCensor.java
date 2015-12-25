package com.runescape.utils;
import com.runescape.cache.Archive;
import com.runescape.stream.Buffer;

public final class MessageCensor {
   private static int[] a;
   private static char[][] b;
   private static byte[][][] c;
   private static char[][] d;
   private static char[][] e;
   private static int[] f;

   static {
      String[] var10000 = new String[]{"cook", "cook\'s", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs"};
   }

   public static void a(Archive var0) {
      Buffer var1 = new Buffer(var0.a("fragmentsenc.txt"));
      Buffer var2 = new Buffer(var0.a("badenc.txt"));
      Buffer var3 = new Buffer(var0.a("domainenc.txt"));
      Buffer var9 = new Buffer(var0.a("tldlist.txt"));
      Buffer var10000 = var1;
      Buffer var10001 = var2;
      Buffer var10002 = var3;
      var3 = var9;
      var2 = var10002;
      var1 = var10001;
      var9 = var10000;
      int var4;
      b = new char[var4 = var1.j()][];
      c = new byte[var4][][];
      byte[][][] var5 = c;
      char[][] var6 = b;
      Buffer var7 = var1;

      for(int var10 = 0; var10 < var6.length; ++var10) {
         char[] var12 = new char[var7.e()];

         for(int var8 = 0; var8 < var12.length; ++var8) {
            var12[var8] = (char)var7.e();
         }

         var6[var10] = var12;
         byte[][] var18 = new byte[var7.e()][2];

         for(var4 = 0; var4 < var18.length; ++var4) {
            var18[var4][0] = (byte)var7.e();
            var18[var4][1] = (byte)var7.e();
         }

         if(var18.length > 0) {
            var5[var10] = var18;
         }
      }

      char[][] var19 = d = new char[var2.j()][];
      Buffer var14 = var2;
      char[][] var16 = var19;

      int var13;
      for(var13 = 0; var13 < var16.length; ++var13) {
         char[] var11 = new char[var14.e()];

         for(var4 = 0; var4 < var11.length; ++var4) {
            var11[var4] = (char)var14.e();
         }

         var16[var13] = var11;
      }

      var1 = var9;
      a = new int[var9.j()];

      for(var4 = 0; var4 < a.length; ++var4) {
         a[var4] = var1.g();
      }

      var1 = var3;
      e = new char[var4 = var3.j()][];
      f = new int[var4];

      for(int var17 = 0; var17 < var4; ++var17) {
         f[var17] = var1.e();
         char[] var15 = new char[var1.e()];

         for(var13 = 0; var13 < var15.length; ++var13) {
            var15[var13] = (char)var1.e();
         }

         e[var17] = var15;
      }

   }
}
