package com.runescape.sound;
import com.runescape.stream.Buffer;

public final class Track {
   private static final Track[] b = new Track[5000];
   public static final int[] a = new int[5000];
   private static byte[] c;
   private static Buffer d;
   private final Synthesizer[] e = new Synthesizer[10];
   private int f;
   private int g;

   public static void a(Buffer var0) {
      c = new byte[441000];
      d = new Buffer(c);
      Synthesizer.a();

      int var1;
      int var10002;
      int[] var7;
      for(; (var1 = var0.g()) != '\uffff'; var7[var1] = var10002) {
         b[var1] = new Track();
         Track var10000 = b[var1];
         Buffer var2 = var0;
         Track var3 = var10000;

         int var4;
         for(var4 = 0; var4 < 10; ++var4) {
            if(var2.e() != 0) {
               --var2.b;
               var3.e[var4] = new Synthesizer();
               var3.e[var4].a(var2);
            }
         }

         var3.f = var2.g();
         var3.g = var2.g();
         var7 = a;
         var3 = b[var1];
         int var6 = 9999999;

         for(var4 = 0; var4 < 10; ++var4) {
            if(var3.e[var4] != null && var3.e[var4].b / 20 < var6) {
               var6 = var3.e[var4].b / 20;
            }
         }

         if(var3.f < var3.g && var3.f / 20 < var6) {
            var6 = var3.f / 20;
         }

         if(var6 != 9999999 && var6 != 0) {
            for(var4 = 0; var4 < 10; ++var4) {
               if(var3.e[var4] != null) {
                  var3.e[var4].b -= var6 * 20;
               }
            }

            if(var3.f < var3.g) {
               var3.f -= var6 * 20;
               var3.g -= var6 * 20;
            }

            var10002 = var6;
         } else {
            var10002 = 0;
         }
      }

   }

   public static Buffer a(int var0, int var1) {
      if(b[var1] == null) {
         return null;
      } else {
         Track var10000 = b[var1];
         var1 = var0;
         Track var11 = var10000;
         int var2 = 0;

         int var3;
         for(var3 = 0; var3 < 10; ++var3) {
            if(var11.e[var3] != null && var11.e[var3].a + var11.e[var3].b > var2) {
               var2 = var11.e[var3].a + var11.e[var3].b;
            }
         }

         int var12;
         if(var2 == 0) {
            var12 = 0;
         } else {
            var3 = var2 * 22050 / 1000;
            var2 = 22050 * var11.f / 1000;
            int var4 = 22050 * var11.g / 1000;
            if(var2 < 0 || var2 > var3 || var4 < 0 || var4 > var3 || var2 >= var4) {
               var1 = 0;
            }

            int var5 = var3 + (var4 - var2) * (var1 - 1);

            int var6;
            for(var6 = 44; var6 < var5 + 44; ++var6) {
               c[var6] = -128;
            }

            int var7;
            int var8;
            for(var6 = 0; var6 < 10; ++var6) {
               if(var11.e[var6] != null) {
                  var7 = var11.e[var6].a * 22050 / 1000;
                  var8 = var11.e[var6].b * 22050 / 1000;
                  int[] var9 = var11.e[var6].a(var7, var11.e[var6].a);

                  for(int var10 = 0; var10 < var7; ++var10) {
                     c[var10 + var8 + 44] += (byte)(var9[var10] >> 8);
                  }
               }
            }

            if(var1 > 1) {
               var2 += 44;
               var4 += 44;
               var3 += 44;
               var5 += 44;
               var6 = var5 - var3;

               for(var7 = var3 - 1; var7 >= var4; --var7) {
                  c[var7 + var6] = c[var7];
               }

               for(var7 = 1; var7 < var1; ++var7) {
                  var8 = (var4 - var2) * var7;
                  System.arraycopy(c, var2, c, var2 + var8, var4 - var2);
               }

               var5 -= 44;
            }

            var12 = var5;
         }

         var0 = var12;
         d.b = 0;
         d.f(1380533830);
         d.g(var0 + 36);
         d.f(1463899717);
         d.f(1718449184);
         d.g(16);
         d.d(1);
         d.d(1);
         d.g(22050);
         d.g(22050);
         d.d(1);
         d.d(8);
         d.f(1684108385);
         d.g(var0);
         d.b += var0;
         return d;
      }
   }
}
