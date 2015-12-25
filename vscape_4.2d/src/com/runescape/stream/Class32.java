package com.runescape.stream;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public final class Class32 {
   private static int a = 0;

   public static final byte[] a(String var0) {
      try {
         int var1;
         byte[] var2 = new byte[var1 = (int)(new File(var0)).length()];
         DataInputStream var4;
         (var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(var0)))).readFully(var2, 0, var1);
         var4.close();
         ++a;
         return var2;
      } catch (Exception var3) {
         return null;
      }
   }

   public static boolean b(String var0) {
      return (new File(var0)).exists();
   }
}
