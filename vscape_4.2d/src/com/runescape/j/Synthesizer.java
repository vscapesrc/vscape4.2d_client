package com.runescape.j;
import com.runescape.d.Buffer;

final class Synthesizer {
   private Envelope c;
   private Envelope d;
   private Envelope e;
   private Envelope f;
   private Envelope g;
   private Envelope h;
   private Envelope i;
   private Envelope j;
   private final int[] k = new int[5];
   private final int[] l = new int[5];
   private final int[] m = new int[5];
   private int n;
   private int o = 100;
   private Filter p;
   private Envelope q;
   int a = 500;
   int b;
   private static int[] r;
   private static int[] s;
   private static int[] t;
   private static final int[] u = new int[5];
   private static final int[] v = new int[5];
   private static final int[] w = new int[5];
   private static final int[] x = new int[5];
   private static final int[] y = new int[5];

   public static void a() {
      s = new int['\u8000'];

      int var0;
      for(var0 = 0; var0 < '\u8000'; ++var0) {
         if(Math.random() > 0.5D) {
            s[var0] = 1;
         } else {
            s[var0] = -1;
         }
      }

      t = new int['\u8000'];

      for(var0 = 0; var0 < '\u8000'; ++var0) {
         t[var0] = (int)(Math.sin((double)var0 / 5215.1903D) * 16384.0D);
      }

      r = new int[220500];
   }

   public final int[] a(int var1, int var2) {
      int var3;
      for(var3 = 0; var3 < var1; ++var3) {
         r[var3] = 0;
      }

      if(var2 < 10) {
         return r;
      } else {
         double var4 = (double)var1 / ((double)var2 + 0.0D);
         this.c.a();
         this.d.a();
         var2 = 0;
         int var6 = 0;
         int var7 = 0;
         if(this.e != null) {
            this.e.a();
            this.f.a();
            var2 = (int)((double)(this.e.b - this.e.a) * 32.768D / var4);
            var6 = (int)((double)this.e.a * 32.768D / var4);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if(this.g != null) {
            this.g.a();
            this.h.a();
            var8 = (int)((double)(this.g.b - this.g.a) * 32.768D / var4);
            var9 = (int)((double)this.g.a * 32.768D / var4);
         }

         int var11;
         for(var11 = 0; var11 < 5; ++var11) {
            if(this.k[var11] != 0) {
               u[var11] = 0;
               v[var11] = (int)((double)this.m[var11] * var4);
               w[var11] = (this.k[var11] << 14) / 100;
               x[var11] = (int)((double)(this.c.b - this.c.a) * 32.768D * Math.pow(1.0057929410678534D, (double)this.l[var11]) / var4);
               y[var11] = (int)((double)this.c.a * 32.768D / var4);
            }
         }

         int var12;
         int var13;
         int var14;
         int var15;
         for(var11 = 0; var11 < var1; ++var11) {
            var12 = this.c.a(var1);
            var13 = this.d.a(var1);
            if(this.e != null) {
               var14 = this.e.a(var1);
               var15 = this.f.a(var1);
               var12 += a(var15, var7, this.e.c) >> 1;
               var7 += (var14 * var2 >> 16) + var6;
            }

            if(this.g != null) {
               var14 = this.g.a(var1);
               var15 = this.h.a(var1);
               var13 = var13 * ((a(var15, var10, this.g.c) >> 1) + '\u8000') >> 15;
               var10 += (var14 * var8 >> 16) + var9;
            }

            for(var14 = 0; var14 < 5; ++var14) {
               if(this.k[var14] != 0 && (var15 = var11 + v[var14]) < var1) {
                  r[var15] += a(var13 * w[var14] >> 15, u[var14], this.c.c);
                  u[var14] += (var12 * x[var14] >> 16) + y[var14];
               }
            }
         }

         if(this.i != null) {
            this.i.a();
            this.j.a();
            var11 = 0;
            boolean var16 = true;

            for(var13 = 0; var13 < var1; ++var13) {
               var14 = this.i.a(var1);
               var15 = this.j.a(var1);
               if(var16) {
                  var2 = this.i.a + ((this.i.b - this.i.a) * var14 >> 8);
               } else {
                  var2 = this.i.a + ((this.i.b - this.i.a) * var15 >> 8);
               }

               var11 += 256;
               if(var11 >= var2) {
                  var11 = 0;
                  var16 = !var16;
               }

               if(var16) {
                  r[var13] = 0;
               }
            }
         }

         if(this.n > 0 && this.o > 0) {
            for(var12 = var11 = (int)((double)this.n * var4); var12 < var1; ++var12) {
               r[var12] += r[var12 - var11] * this.o / 100;
            }
         }

         if(this.p.a[0] > 0 || this.p.a[1] > 0) {
            this.q.a();
            var11 = this.q.a(var1 + 1);
            var12 = this.p.a(0, (float)var11 / 65536.0F);
            var13 = this.p.a(1, (float)var11 / 65536.0F);
            if(var1 >= var12 + var13) {
               var14 = 0;
               var15 = var13;
               if(var13 > var1 - var12) {
                  var15 = var1 - var12;
               }

               while(var14 < var15) {
                  var2 = (int)((long)r[var14 + var12] * (long)Filter.c >> 16);

                  for(var3 = 0; var3 < var12; ++var3) {
                     var2 += (int)((long)r[var14 + var12 - 1 - var3] * (long)Filter.b[0][var3] >> 16);
                  }

                  for(var3 = 0; var3 < var14; ++var3) {
                     var2 -= (int)((long)r[var14 - 1 - var3] * (long)Filter.b[1][var3] >> 16);
                  }

                  r[var14] = var2;
                  var11 = this.q.a(var1 + 1);
                  ++var14;
               }

               var15 = 128;

               while(true) {
                  if(var15 > var1 - var12) {
                     var15 = var1 - var12;
                  }

                  while(var14 < var15) {
                     var3 = (int)((long)r[var14 + var12] * (long)Filter.c >> 16);

                     for(var2 = 0; var2 < var12; ++var2) {
                        var3 += (int)((long)r[var14 + var12 - 1 - var2] * (long)Filter.b[0][var2] >> 16);
                     }

                     for(var2 = 0; var2 < var13; ++var2) {
                        var3 -= (int)((long)r[var14 - 1 - var2] * (long)Filter.b[1][var2] >> 16);
                     }

                     r[var14] = var3;
                     var11 = this.q.a(var1 + 1);
                     ++var14;
                  }

                  if(var14 >= var1 - var12) {
                     while(var14 < var1) {
                        var3 = 0;

                        for(var2 = var14 + var12 - var1; var2 < var12; ++var2) {
                           var3 += (int)((long)r[var14 + var12 - 1 - var2] * (long)Filter.b[0][var2] >> 16);
                        }

                        for(var2 = 0; var2 < var13; ++var2) {
                           var3 -= (int)((long)r[var14 - 1 - var2] * (long)Filter.b[1][var2] >> 16);
                        }

                        r[var14] = var3;
                        ++var14;
                     }
                     break;
                  }

                  var12 = this.p.a(0, (float)var11 / 65536.0F);
                  var13 = this.p.a(1, (float)var11 / 65536.0F);
                  var15 += 128;
               }
            }
         }

         for(var11 = 0; var11 < var1; ++var11) {
            if(r[var11] < -32768) {
               r[var11] = -32768;
            }

            if(r[var11] > 32767) {
               r[var11] = 32767;
            }
         }

         return r;
      }
   }

   private static int a(int var0, int var1, int var2) {
      return var2 == 1?((var1 & 32767) < 16384?var0:-var0):(var2 == 2?t[var1 & 32767] * var0 >> 14:(var2 == 3?((var1 & 32767) * var0 >> 14) - var0:(var2 == 4?s[var1 / 2607 & 32767] * var0:0)));
   }

   public final void a(Buffer var1) {
      this.c = new Envelope();
      this.c.a(var1);
      this.d = new Envelope();
      this.d.a(var1);
      if(var1.e() != 0) {
         --var1.b;
         this.e = new Envelope();
         this.e.a(var1);
         this.f = new Envelope();
         this.f.a(var1);
      }

      if(var1.e() != 0) {
         --var1.b;
         this.g = new Envelope();
         this.g.a(var1);
         this.h = new Envelope();
         this.h.a(var1);
      }

      if(var1.e() != 0) {
         --var1.b;
         this.i = new Envelope();
         this.i.a(var1);
         this.j = new Envelope();
         this.j.a(var1);
      }

      int var3;
      for(int var2 = 0; var2 < 10 && (var3 = var1.q()) != 0; ++var2) {
         this.k[var2] = var3;
         this.l[var2] = var1.p();
         this.m[var2] = var1.q();
      }

      this.n = var1.q();
      this.o = var1.q();
      this.a = var1.g();
      this.b = var1.g();
      this.p = new Filter();
      this.q = new Envelope();
      this.p.a(var1, this.q);
   }
}
