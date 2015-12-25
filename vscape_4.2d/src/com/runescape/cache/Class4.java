package com.runescape.cache;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel.MapMode;
import java.util.zip.GZIPInputStream;

import vscape.content.CustomSprites;

import com.runescape.cache.gui.Sprite;
import com.runescape.sign.SignLink;
import com.runescape.stream.Buffer;

public class Class4 {
   byte[] a;
   int b;
   int c;
   int d;
   int e;
   byte[] f;
   int g;
   int h;
   int i;
   int j;
   byte k;
   int l;
   boolean m;
   int n;
   int o;
   int p;
   int q;
   int r;
   int s;
   int t;
   final int[] u = new int[256];
   int v;
   final int[] w = new int[257];
   public static int[] x;
   int y;
   final boolean[] z = new boolean[256];
   final boolean[] A = new boolean[16];
   final byte[] B = new byte[256];
   final byte[] C = new byte[4096];
   final int[] D = new int[16];
   final byte[] E = new byte[18002];
   final byte[] F = new byte[18002];
   final byte[][] G = new byte[6][258];
   final int[][] H = new int[6][258];
   final int[][] I = new int[6][258];
   final int[][] J = new int[6][258];
   final int[] K = new int[6];
   int L;
   public static CustomSprites[] M;

   public static byte[] a(String var0) {
      try {
         RandomAccessFile var7;
         MappedByteBuffer var1 = (var7 = new RandomAccessFile(var0, "r")).getChannel().map(MapMode.READ_ONLY, 0L, var7.length());

         byte[] var8;
         try {
            if(var1.hasArray()) {
               var8 = var1.array();
               return var8;
            }

            byte[] var2 = new byte[var1.remaining()];
            var1.get(var2);
            var8 = var2;
         } finally {
            var7.close();
         }

         return var8;
      } catch (Exception var6) {
         var6.printStackTrace();
         return null;
      }
   }

   public static boolean a() {
      // $FF: Couldn't be decompiled
	   return false;
   }

   public static void b() {
      try {
         Buffer var0 = new Buffer(a(SignLink.a() + "sprites.idx"));
         Buffer var1 = new Buffer(a(SignLink.a() + "sprites.dat"));
         DataInputStream var6 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(var0.a)));
         DataInputStream var7 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(var1.a)));
         int var2 = var6.readInt();
         if(M == null) {
            M = new CustomSprites[var2];
         }

         for(int var3 = 0; var3 < var2; ++var3) {
            byte[] var4 = new byte[var6.readInt()];
            var6.readFully(var4);
            if(M[var3] == null) {
               M[var3] = new CustomSprites(new String(var4));
            }

            M[var3].a(var6, var7);
         }

         var6.close();
         var7.close();
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   public static Sprite a(String var0, int var1) {
      var0 = var0;
      CustomSprites[] var2 = M;
      int var3 = M.length;
      int var4 = 0;

      CustomSprites var10000;
      while(true) {
         if(var4 >= var3) {
            var10000 = null;
            break;
         }

         CustomSprites var5;
         if((var5 = var2[var4]).a.equalsIgnoreCase(var0)) {
            var10000 = var5;
            break;
         }

         ++var4;
      }

      CustomSprites var6 = var10000;
      return var10000 != null && var1 >= 0 && var1 <= var6.b?var6.c[var1]:null;
   }
}
