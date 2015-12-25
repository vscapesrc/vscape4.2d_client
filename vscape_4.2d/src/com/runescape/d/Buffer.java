package com.runescape.d;
import com.runescape.e.CacheableNode;
import com.runescape.e.LinkedList;
import com.runescape.g.IsaacCipher;
import com.runescape.i.SignLink;

public final class Buffer extends CacheableNode {
   public byte[] a;
   public int b;
   public int c;
   private static final int[] e = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, '\uffff', 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   public IsaacCipher d;
   private static int f;
   private static final LinkedList g = new LinkedList();

   public static Buffer a() {
      LinkedList var0 = g;
      synchronized(g) {
         Buffer var1 = null;
         if(f > 0) {
            --f;
            var1 = (Buffer)g.a();
         }

         if(var1 != null) {
            var1.b = 0;
            return var1;
         }
      }

      Buffer var3;
      (var3 = new Buffer()).b = 0;
      var3.a = new byte[5000];
      return var3;
   }

   public final int b() {
      this.b += 3;
      return (255 & this.a[this.b - 3] << 16) + (255 & this.a[this.b - 2] << 8) + (255 & this.a[this.b - 1]);
   }

   private Buffer() {
   }

   public Buffer(byte[] var1) {
      this.a = var1;
      this.b = 0;
   }

   public final int c() {
      int var1;
      int var2;
      for(var1 = 0; (var2 = this.q()) == 32767; var1 += 32767) {
         ;
      }

      return var1 + var2;
   }

   public final String d() {
      int var1 = this.b;

      while(this.a[this.b++] != 0) {
         ;
      }

      return new String(this.a, var1, this.b - var1 - 1);
   }

   public final void a(int var1) {
      this.a[this.b++] = (byte)(var1 + this.d.a());
   }

   public final void b(int var1) {
      this.a[this.b++] = (byte)var1;
   }

   public final void c(int var1) {
      this.a[this.b++] = (byte)(var1 >> 8);
      this.a[this.b++] = (byte)var1;
   }

   public final void d(int var1) {
      this.a[this.b++] = (byte)var1;
      this.a[this.b++] = (byte)(var1 >> 8);
   }

   public final void e(int var1) {
      this.a[this.b++] = -26;
      this.a[this.b++] = 50;
      this.a[this.b++] = 113;
   }

   public final void f(int var1) {
      this.a[this.b++] = (byte)(var1 >> 24);
      this.a[this.b++] = (byte)(var1 >> 16);
      this.a[this.b++] = (byte)(var1 >> 8);
      this.a[this.b++] = (byte)var1;
   }

   public final void g(int var1) {
      this.a[this.b++] = (byte)var1;
      this.a[this.b++] = (byte)(var1 >> 8);
      this.a[this.b++] = (byte)(var1 >> 16);
      this.a[this.b++] = (byte)(var1 >> 24);
   }

   public final void a(long var1) {
      try {
         this.a[this.b++] = (byte)((int)(var1 >> 56));
         this.a[this.b++] = (byte)((int)(var1 >> 48));
         this.a[this.b++] = (byte)((int)(var1 >> 40));
         this.a[this.b++] = (byte)((int)(var1 >> 32));
         this.a[this.b++] = (byte)((int)(var1 >> 24));
         this.a[this.b++] = (byte)((int)(var1 >> 16));
         this.a[this.b++] = (byte)((int)(var1 >> 8));
         this.a[this.b++] = (byte)((int)var1);
      } catch (RuntimeException var4) {
         SignLink.b("14395, 5, " + var1 + ", " + var4.toString());
         throw new RuntimeException();
      }
   }

   public final void a(String var1) {
      System.arraycopy(var1.getBytes(), 0, this.a, this.b, var1.length());
      this.b += var1.length();
      this.a[this.b++] = 10;
   }

   public final void a(byte[] var1, int var2, int var3) {
      for(var3 = 0; var3 < var2 + 0; ++var3) {
         this.a[this.b++] = var1[var3];
      }

   }

   public final void h(int var1) {
      this.a[this.b - var1 - 1] = (byte)var1;
   }

   public final int e() {
      return this.a[this.b++] & 255;
   }

   public final byte f() {
      return this.a[this.b++];
   }

   public final int g() {
      this.b += 2;
      return ((this.a[this.b - 2] & 255) << 8) + (this.a[this.b - 1] & 255);
   }

   public final int h() {
      this.b += 2;
      int var1;
      if((var1 = ((this.a[this.b - 2] & 255) << 8) + (this.a[this.b - 1] & 255)) > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   public final int i() {
      this.b += 3;
      return ((this.a[this.b - 3] & 255) << 16) + ((this.a[this.b - 2] & 255) << 8) + (this.a[this.b - 1] & 255);
   }

   public final int j() {
      this.b += 4;
      return ((this.a[this.b - 4] & 255) << 24) + ((this.a[this.b - 3] & 255) << 16) + ((this.a[this.b - 2] & 255) << 8) + (this.a[this.b - 1] & 255);
   }

   public final long k() {
      long var1 = (long)this.j() & 4294967295L;
      long var3 = (long)this.j() & 4294967295L;
      return (var1 << 32) + var3;
   }

   public final String l() {
      int var1 = this.b;

      while(this.a[this.b++] != 10) {
         ;
      }

      return new String(this.a, var1, this.b - var1 - 1);
   }

   public final byte[] m() {
      int var1 = this.b;

      while(this.a[this.b++] != 10) {
         ;
      }

      byte[] var2 = new byte[this.b - var1 - 1];
      System.arraycopy(this.a, var1, var2, var1 - var1, this.b - 1 - var1);
      return var2;
   }

   public final void a(int var1, int var2, byte[] var3) {
      for(var2 = 0; var2 < var1 + 0; ++var2) {
         var3[var2] = this.a[this.b++];
      }

   }

   public final void n() {
      this.c = this.b << 3;
   }

   public final int i(int var1) {
      int var2 = this.c >> 3;
      int var3 = 8 - (this.c & 7);
      int var4 = 0;

      for(this.c += var1; var1 > var3; var3 = 8) {
         var4 += (this.a[var2++] & e[var3]) << var1 - var3;
         var1 -= var3;
      }

      if(var1 == var3) {
         var4 += this.a[var2] & e[var3];
      } else {
         var4 += this.a[var2] >> var3 - var1 & e[var1];
      }

      return var4;
   }

   public final void o() {
      this.b = (this.c + 7) / 8;
   }

   public final int p() {
      return (this.a[this.b] & 255) < 128?this.e() - 64:this.g() - '\uc000';
   }

   public final int q() {
      return (this.a[this.b] & 255) < 128?this.e():this.g() - '\u8000';
   }

   public final void j(int var1) {
      this.a[this.b++] = (byte)(-var1);
   }

   public final void k(int var1) {
      this.a[this.b++] = (byte)(128 - var1);
   }

   public final int r() {
      return this.a[this.b++] - 128 & 255;
   }

   public final int s() {
      return -this.a[this.b++] & 255;
   }

   public final int t() {
      return 128 - this.a[this.b++] & 255;
   }

   public final byte u() {
      return (byte)(-this.a[this.b++]);
   }

   public final void l(int var1) {
      this.a[this.b++] = (byte)var1;
      this.a[this.b++] = (byte)(var1 >> 8);
   }

   public final void m(int var1) {
      this.a[this.b++] = (byte)(var1 >> 8);
      this.a[this.b++] = (byte)(var1 + 128);
   }

   public final void n(int var1) {
      this.a[this.b++] = (byte)(var1 + 128);
      this.a[this.b++] = (byte)(var1 >> 8);
   }

   public final int v() {
      this.b += 2;
      return ((this.a[this.b - 1] & 255) << 8) + (this.a[this.b - 2] & 255);
   }

   public final int w() {
      this.b += 2;
      return ((this.a[this.b - 2] & 255) << 8) + (this.a[this.b - 1] - 128 & 255);
   }

   public final int x() {
      this.b += 2;
      return ((this.a[this.b - 1] & 255) << 8) + (this.a[this.b - 2] - 128 & 255);
   }

   public final int y() {
      this.b += 2;
      int var1;
      if((var1 = ((this.a[this.b - 1] & 255) << 8) + (this.a[this.b - 2] & 255)) > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   public final int z() {
      this.b += 2;
      int var1;
      if((var1 = ((this.a[this.b - 1] & 255) << 8) + (this.a[this.b - 2] - 128 & 255)) > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   public final int A() {
      this.b += 4;
      return ((this.a[this.b - 2] & 255) << 24) + ((this.a[this.b - 1] & 255) << 16) + ((this.a[this.b - 4] & 255) << 8) + (this.a[this.b - 3] & 255);
   }

   public final int B() {
      this.b += 4;
      return ((this.a[this.b - 3] & 255) << 24) + ((this.a[this.b - 4] & 255) << 16) + ((this.a[this.b - 1] & 255) << 8) + (this.a[this.b - 2] & 255);
   }

   public final void a(int var1, byte[] var2, int var3) {
      for(var1 = var3 + 0 - 1; var1 >= 0; --var1) {
         this.a[this.b++] = (byte)(var2[var1] + 128);
      }

   }
}
