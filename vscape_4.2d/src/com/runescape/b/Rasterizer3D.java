package com.runescape.b;
import com.runescape.Client;
import com.runescape.a.Archive;
import com.runescape.a.c.IndexedImage;

public final class Rasterizer3D extends Rasterizer2D {
   public static boolean a = true;
   public static boolean b;
   private static boolean y;
   public static boolean c = true;
   public static int d;
   public static int e;
   public static int f;
   private static int[] z = new int[512];
   public static final int[] g = new int[2048];
   public static int[] r = new int[2048];
   public static int[] s = new int[2048];
   public static int[] t;
   private static int A;
   public static IndexedImage[] u = new IndexedImage[51];
   private static boolean[] B = new boolean[51];
   private static int[] C = new int[51];
   private static int D;
   private static int[][] E;
   private static int[][] F = new int[51][];
   public static int[] v = new int[51];
   public static int w;
   public static int[] x = new int[65536];
   private static int[][] G = new int[51][];

   static {
      int var0;
      for(var0 = 1; var0 < 512; ++var0) {
         z[var0] = '\u8000' / var0;
      }

      for(var0 = 1; var0 < 2048; ++var0) {
         g[var0] = 65536 / var0;
      }

      for(var0 = 0; var0 < 2048; ++var0) {
         r[var0] = (int)(65536.0D * Math.sin((double)var0 * 0.0030679615D));
         s[var0] = (int)(65536.0D * Math.cos((double)var0 * 0.0030679615D));
      }

   }

   public static void a() {
      z = null;
      z = null;
      r = null;
      s = null;
      t = null;
      u = null;
      B = null;
      C = null;
      E = null;
      F = null;
      v = null;
      x = null;
      G = null;
   }

   public static void b() {
      t = new int[Rasterizer2D.j];

      for(int var0 = 0; var0 < Rasterizer2D.j; ++var0) {
         t[var0] = Rasterizer2D.i * var0;
      }

      e = Rasterizer2D.i / 2;
      f = Rasterizer2D.j / 2;
   }

   public static void a(int var0, int var1) {
      t = new int[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         t[var2] = var0 * var2;
      }

      e = var0 / 2;
      f = var1 / 2;
   }

   public static void e() {
      E = null;

      for(int var0 = 0; var0 < 51; ++var0) {
         F[var0] = null;
      }

   }

   public static void f() {
      if(E == null) {
         D = 20;
         if(a) {
            E = new int[D][16384];
         } else {
            E = new int[D][65536];
         }

         for(int var0 = 0; var0 < 51; ++var0) {
            F[var0] = null;
         }
      }

   }

   public static void a(Archive var0) {
      A = 0;

      for(int var1 = 0; var1 < 51; ++var1) {
         try {
            u[var1] = new IndexedImage(var0, String.valueOf(var1), 0);
            if(a && u[var1].g == 128) {
               u[var1].a();
            } else {
               u[var1].b();
            }

            ++A;
         } catch (Exception var2) {
            ;
         }
      }

   }

   public static int a(int var0) {
      if(C[var0] != 0) {
         return C[var0];
      } else {
         int var1 = 0;
         int var2 = 0;
         int var3 = 0;
         int var4 = G[var0].length;

         int var5;
         for(var5 = 0; var5 < var4; ++var5) {
            var1 += G[var0][var5] >> 16 & 255;
            var2 += G[var0][var5] >> 8 & 255;
            var3 += G[var0][var5] & 255;
         }

         if((var5 = a((var1 / var4 << 16) + (var2 / var4 << 8) + var3 / var4, 1.4D)) == 0) {
            var5 = 1;
         }

         C[var0] = var5;
         return var5;
      }
   }

   public static void b(int var0) {
      if(F[var0] != null) {
         E[D++] = F[var0];
         F[var0] = null;
      }
   }

   public static void a(double var0) {
      var0 += Math.random() * 0.03D - 0.015D;
      int var2 = 0;

      int var3;
      for(var3 = 0; var3 < 512; ++var3) {
         double var4 = (double)(var3 / 8) / 64.0D + 0.0078125D;
         double var6 = (double)(var3 & 7) / 8.0D + 0.0625D;

         for(int var8 = 0; var8 < 128; ++var8) {
            double var9;
            double var11 = var9 = (double)var8 / 128.0D;
            double var13 = var9;
            double var15 = var9;
            if(var6 != 0.0D) {
               double var17;
               if(var9 < 0.5D) {
                  var17 = var9 * (var6 + 1.0D);
               } else {
                  var17 = var9 + var6 - var9 * var6;
               }

               double var19 = var9 * 2.0D - var17;
               double var21;
               if((var21 = var4 + 0.3333333333333333D) > 1.0D) {
                  --var21;
               }

               double var25;
               if((var25 = var4 - 0.3333333333333333D) < 0.0D) {
                  ++var25;
               }

               if(var21 * 6.0D < 1.0D) {
                  var11 = var19 + (var17 - var19) * 6.0D * var21;
               } else if(var21 * 2.0D < 1.0D) {
                  var11 = var17;
               } else if(var21 * 3.0D < 2.0D) {
                  var11 = var19 + (var17 - var19) * (0.6666666666666666D - var21) * 6.0D;
               } else {
                  var11 = var19;
               }

               if(var4 * 6.0D < 1.0D) {
                  var13 = var19 + (var17 - var19) * 6.0D * var4;
               } else if(var4 * 2.0D < 1.0D) {
                  var13 = var17;
               } else if(var4 * 3.0D < 2.0D) {
                  var13 = var19 + (var17 - var19) * (0.6666666666666666D - var4) * 6.0D;
               } else {
                  var13 = var19;
               }

               if(var25 * 6.0D < 1.0D) {
                  var15 = var19 + (var17 - var19) * 6.0D * var25;
               } else if(var25 * 2.0D < 1.0D) {
                  var15 = var17;
               } else if(var25 * 3.0D < 2.0D) {
                  var15 = var19 + (var17 - var19) * (0.6666666666666666D - var25) * 6.0D;
               } else {
                  var15 = var19;
               }
            }

            int var27 = (int)(var11 * 256.0D);
            int var28 = (int)(var13 * 256.0D);
            int var29 = (int)(var15 * 256.0D);
            int var30;
            if((var30 = a((var27 << 16) + (var28 << 8) + var29, var0)) == 0) {
               var30 = 1;
            }

            x[var2++] = var30;
         }
      }

      for(var3 = 0; var3 < 51; ++var3) {
         if(u[var3] != null) {
            int[] var31 = u[var3].b;
            G[var3] = new int[var31.length];

            for(int var32 = 0; var32 < var31.length; ++var32) {
               G[var3][var32] = a(var31[var32], var0);
               if((G[var3][var32] & 16316671) == 0 && var32 != 0) {
                  G[var3][var32] = 1;
               }
            }
         }
      }

      for(var3 = 0; var3 < 51; ++var3) {
         b(var3);
      }

   }

   private static int a(int var0, double var1) {
      double var3 = (double)(var0 >> 16) / 256.0D;
      double var5 = (double)(var0 >> 8 & 255) / 256.0D;
      double var7 = (double)(var0 & 255) / 256.0D;
      var3 = Math.pow(var3, var1);
      var5 = Math.pow(var5, var1);
      var7 = Math.pow(var7, var1);
      var0 = (int)(var3 * 256.0D);
      int var9 = (int)(var5 * 256.0D);
      int var2 = (int)(var7 * 256.0D);
      return (var0 << 16) + (var9 << 8) + var2;
   }

   public static void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      var2 = var2;
      var1 = var1;
      var0 = var0;
      int var9 = 0;
      int var10 = 0;
      if(var1 != var0) {
         var9 = (var4 - var3 << 16) / (var1 - var0);
         var10 = (var7 - var6 << 15) / (var1 - var0);
      }

      int var11 = 0;
      int var12 = 0;
      if(var2 != var1) {
         var11 = (var5 - var4 << 16) / (var2 - var1);
         var12 = (var8 - var7 << 15) / (var2 - var1);
      }

      int var13 = 0;
      int var14 = 0;
      if(var2 != var0) {
         var13 = (var3 - var5 << 16) / (var0 - var2);
         var14 = (var6 - var8 << 15) / (var0 - var2);
      }

      if(var0 <= var1 && var0 <= var2) {
         if(var0 < Rasterizer2D.l) {
            if(var1 > Rasterizer2D.l) {
               var1 = Rasterizer2D.l;
            }

            if(var2 > Rasterizer2D.l) {
               var2 = Rasterizer2D.l;
            }

            if(var1 < var2) {
               var5 = var3 <<= 16;
               var8 = var6 <<= 15;
               if(var0 < 0) {
                  var5 -= var13 * var0;
                  var3 -= var9 * var0;
                  var8 -= var14 * var0;
                  var6 -= var10 * var0;
                  var0 = 0;
               }

               var4 <<= 16;
               var7 <<= 15;
               if(var1 < 0) {
                  var4 -= var11 * var1;
                  var7 -= var12 * var1;
                  var1 = 0;
               }

               if(var0 != var1 && var13 < var9 || var0 == var1 && var13 > var11) {
                  var2 -= var1;
                  var1 -= var0;
                  var0 = t[var0];

                  while(true) {
                     --var1;
                     if(var1 < 0) {
                        while(true) {
                           --var2;
                           if(var2 < 0) {
                              return;
                           }

                           a(Rasterizer2D.h, var0, var5 >> 16, var4 >> 16, var8 >> 7, var7 >> 7);
                           var5 += var13;
                           var4 += var11;
                           var8 += var14;
                           var7 += var12;
                           var0 += Rasterizer2D.i;
                        }
                     }

                     a(Rasterizer2D.h, var0, var5 >> 16, var3 >> 16, var8 >> 7, var6 >> 7);
                     var5 += var13;
                     var3 += var9;
                     var8 += var14;
                     var6 += var10;
                     var0 += Rasterizer2D.i;
                  }
               }

               var2 -= var1;
               var1 -= var0;
               var0 = t[var0];

               while(true) {
                  --var1;
                  if(var1 < 0) {
                     while(true) {
                        --var2;
                        if(var2 < 0) {
                           return;
                        }

                        a(Rasterizer2D.h, var0, var4 >> 16, var5 >> 16, var7 >> 7, var8 >> 7);
                        var5 += var13;
                        var4 += var11;
                        var8 += var14;
                        var7 += var12;
                        var0 += Rasterizer2D.i;
                     }
                  }

                  a(Rasterizer2D.h, var0, var3 >> 16, var5 >> 16, var6 >> 7, var8 >> 7);
                  var5 += var13;
                  var3 += var9;
                  var8 += var14;
                  var6 += var10;
                  var0 += Rasterizer2D.i;
               }
            }

            var4 = var3 <<= 16;
            var7 = var6 <<= 15;
            if(var0 < 0) {
               var4 -= var13 * var0;
               var3 -= var9 * var0;
               var7 -= var14 * var0;
               var6 -= var10 * var0;
               var0 = 0;
            }

            var5 <<= 16;
            var8 <<= 15;
            if(var2 < 0) {
               var5 -= var11 * var2;
               var8 -= var12 * var2;
               var2 = 0;
            }

            if(var0 != var2 && var13 < var9 || var0 == var2 && var11 > var9) {
               var1 -= var2;
               var2 -= var0;
               var0 = t[var0];

               while(true) {
                  --var2;
                  if(var2 < 0) {
                     while(true) {
                        --var1;
                        if(var1 < 0) {
                           return;
                        }

                        a(Rasterizer2D.h, var0, var5 >> 16, var3 >> 16, var8 >> 7, var6 >> 7);
                        var5 += var11;
                        var3 += var9;
                        var8 += var12;
                        var6 += var10;
                        var0 += Rasterizer2D.i;
                     }
                  }

                  a(Rasterizer2D.h, var0, var4 >> 16, var3 >> 16, var7 >> 7, var6 >> 7);
                  var4 += var13;
                  var3 += var9;
                  var7 += var14;
                  var6 += var10;
                  var0 += Rasterizer2D.i;
               }
            }

            var1 -= var2;
            var2 -= var0;
            var0 = t[var0];

            while(true) {
               --var2;
               if(var2 < 0) {
                  while(true) {
                     --var1;
                     if(var1 < 0) {
                        return;
                     }

                     a(Rasterizer2D.h, var0, var3 >> 16, var5 >> 16, var6 >> 7, var8 >> 7);
                     var5 += var11;
                     var3 += var9;
                     var8 += var12;
                     var6 += var10;
                     var0 += Rasterizer2D.i;
                  }
               }

               a(Rasterizer2D.h, var0, var3 >> 16, var4 >> 16, var6 >> 7, var7 >> 7);
               var4 += var13;
               var3 += var9;
               var7 += var14;
               var6 += var10;
               var0 += Rasterizer2D.i;
            }
         }
      } else if(var1 <= var2) {
         if(var1 < Rasterizer2D.l) {
            if(var2 > Rasterizer2D.l) {
               var2 = Rasterizer2D.l;
            }

            if(var0 > Rasterizer2D.l) {
               var0 = Rasterizer2D.l;
            }

            if(var2 < var0) {
               var3 = var4 <<= 16;
               var6 = var7 <<= 15;
               if(var1 < 0) {
                  var3 -= var9 * var1;
                  var4 -= var11 * var1;
                  var6 -= var10 * var1;
                  var7 -= var12 * var1;
                  var1 = 0;
               }

               var5 <<= 16;
               var8 <<= 15;
               if(var2 < 0) {
                  var5 -= var13 * var2;
                  var8 -= var14 * var2;
                  var2 = 0;
               }

               if(var1 != var2 && var9 < var11 || var1 == var2 && var9 > var13) {
                  var0 -= var2;
                  var2 -= var1;
                  var1 = t[var1];

                  while(true) {
                     --var2;
                     if(var2 < 0) {
                        while(true) {
                           --var0;
                           if(var0 < 0) {
                              return;
                           }

                           a(Rasterizer2D.h, var1, var3 >> 16, var5 >> 16, var6 >> 7, var8 >> 7);
                           var3 += var9;
                           var5 += var13;
                           var6 += var10;
                           var8 += var14;
                           var1 += Rasterizer2D.i;
                        }
                     }

                     a(Rasterizer2D.h, var1, var3 >> 16, var4 >> 16, var6 >> 7, var7 >> 7);
                     var3 += var9;
                     var4 += var11;
                     var6 += var10;
                     var7 += var12;
                     var1 += Rasterizer2D.i;
                  }
               }

               var0 -= var2;
               var2 -= var1;
               var1 = t[var1];

               while(true) {
                  --var2;
                  if(var2 < 0) {
                     while(true) {
                        --var0;
                        if(var0 < 0) {
                           return;
                        }

                        a(Rasterizer2D.h, var1, var5 >> 16, var3 >> 16, var8 >> 7, var6 >> 7);
                        var3 += var9;
                        var5 += var13;
                        var6 += var10;
                        var8 += var14;
                        var1 += Rasterizer2D.i;
                     }
                  }

                  a(Rasterizer2D.h, var1, var4 >> 16, var3 >> 16, var7 >> 7, var6 >> 7);
                  var3 += var9;
                  var4 += var11;
                  var6 += var10;
                  var7 += var12;
                  var1 += Rasterizer2D.i;
               }
            }

            var5 = var4 <<= 16;
            var8 = var7 <<= 15;
            if(var1 < 0) {
               var5 -= var9 * var1;
               var4 -= var11 * var1;
               var8 -= var10 * var1;
               var7 -= var12 * var1;
               var1 = 0;
            }

            var3 <<= 16;
            var6 <<= 15;
            if(var0 < 0) {
               var3 -= var13 * var0;
               var6 -= var14 * var0;
               var0 = 0;
            }

            if(var9 < var11) {
               var2 -= var0;
               var0 -= var1;
               var1 = t[var1];

               while(true) {
                  --var0;
                  if(var0 < 0) {
                     while(true) {
                        --var2;
                        if(var2 < 0) {
                           return;
                        }

                        a(Rasterizer2D.h, var1, var3 >> 16, var4 >> 16, var6 >> 7, var7 >> 7);
                        var3 += var13;
                        var4 += var11;
                        var6 += var14;
                        var7 += var12;
                        var1 += Rasterizer2D.i;
                     }
                  }

                  a(Rasterizer2D.h, var1, var5 >> 16, var4 >> 16, var8 >> 7, var7 >> 7);
                  var5 += var9;
                  var4 += var11;
                  var8 += var10;
                  var7 += var12;
                  var1 += Rasterizer2D.i;
               }
            }

            var2 -= var0;
            var0 -= var1;
            var1 = t[var1];

            while(true) {
               --var0;
               if(var0 < 0) {
                  while(true) {
                     --var2;
                     if(var2 < 0) {
                        return;
                     }

                     a(Rasterizer2D.h, var1, var4 >> 16, var3 >> 16, var7 >> 7, var6 >> 7);
                     var3 += var13;
                     var4 += var11;
                     var6 += var14;
                     var7 += var12;
                     var1 += Rasterizer2D.i;
                  }
               }

               a(Rasterizer2D.h, var1, var4 >> 16, var5 >> 16, var7 >> 7, var8 >> 7);
               var5 += var9;
               var4 += var11;
               var8 += var10;
               var7 += var12;
               var1 += Rasterizer2D.i;
            }
         }
      } else if(var2 < Rasterizer2D.l) {
         if(var0 > Rasterizer2D.l) {
            var0 = Rasterizer2D.l;
         }

         if(var1 > Rasterizer2D.l) {
            var1 = Rasterizer2D.l;
         }

         if(var0 < var1) {
            var4 = var5 <<= 16;
            var7 = var8 <<= 15;
            if(var2 < 0) {
               var4 -= var11 * var2;
               var5 -= var13 * var2;
               var7 -= var12 * var2;
               var8 -= var14 * var2;
               var2 = 0;
            }

            var3 <<= 16;
            var6 <<= 15;
            if(var0 < 0) {
               var3 -= var9 * var0;
               var6 -= var10 * var0;
               var0 = 0;
            }

            if(var11 < var13) {
               var1 -= var0;
               var0 -= var2;
               var2 = t[var2];

               while(true) {
                  --var0;
                  if(var0 < 0) {
                     while(true) {
                        --var1;
                        if(var1 < 0) {
                           return;
                        }

                        a(Rasterizer2D.h, var2, var4 >> 16, var3 >> 16, var7 >> 7, var6 >> 7);
                        var4 += var11;
                        var3 += var9;
                        var7 += var12;
                        var6 += var10;
                        var2 += Rasterizer2D.i;
                     }
                  }

                  a(Rasterizer2D.h, var2, var4 >> 16, var5 >> 16, var7 >> 7, var8 >> 7);
                  var4 += var11;
                  var5 += var13;
                  var7 += var12;
                  var8 += var14;
                  var2 += Rasterizer2D.i;
               }
            }

            var1 -= var0;
            var0 -= var2;
            var2 = t[var2];

            while(true) {
               --var0;
               if(var0 < 0) {
                  while(true) {
                     --var1;
                     if(var1 < 0) {
                        return;
                     }

                     a(Rasterizer2D.h, var2, var3 >> 16, var4 >> 16, var6 >> 7, var7 >> 7);
                     var4 += var11;
                     var3 += var9;
                     var7 += var12;
                     var6 += var10;
                     var2 += Rasterizer2D.i;
                  }
               }

               a(Rasterizer2D.h, var2, var5 >> 16, var4 >> 16, var8 >> 7, var7 >> 7);
               var4 += var11;
               var5 += var13;
               var7 += var12;
               var8 += var14;
               var2 += Rasterizer2D.i;
            }
         }

         var3 = var5 <<= 16;
         var6 = var8 <<= 15;
         if(var2 < 0) {
            var3 -= var11 * var2;
            var5 -= var13 * var2;
            var6 -= var12 * var2;
            var8 -= var14 * var2;
            var2 = 0;
         }

         var4 <<= 16;
         var7 <<= 15;
         if(var1 < 0) {
            var4 -= var9 * var1;
            var7 -= var10 * var1;
            var1 = 0;
         }

         if(var11 < var13) {
            var0 -= var1;
            var1 -= var2;
            var2 = t[var2];

            while(true) {
               --var1;
               if(var1 < 0) {
                  while(true) {
                     --var0;
                     if(var0 < 0) {
                        return;
                     }

                     a(Rasterizer2D.h, var2, var4 >> 16, var5 >> 16, var7 >> 7, var8 >> 7);
                     var4 += var9;
                     var5 += var13;
                     var7 += var10;
                     var8 += var14;
                     var2 += Rasterizer2D.i;
                  }
               }

               a(Rasterizer2D.h, var2, var3 >> 16, var5 >> 16, var6 >> 7, var8 >> 7);
               var3 += var11;
               var5 += var13;
               var6 += var12;
               var8 += var14;
               var2 += Rasterizer2D.i;
            }
         }

         var0 -= var1;
         var1 -= var2;
         var2 = t[var2];

         while(true) {
            --var1;
            if(var1 < 0) {
               while(true) {
                  --var0;
                  if(var0 < 0) {
                     return;
                  }

                  a(Rasterizer2D.h, var2, var5 >> 16, var4 >> 16, var8 >> 7, var7 >> 7);
                  var4 += var9;
                  var5 += var13;
                  var7 += var10;
                  var8 += var14;
                  var2 += Rasterizer2D.i;
               }
            }

            a(Rasterizer2D.h, var2, var5 >> 16, var3 >> 16, var8 >> 7, var6 >> 7);
            var3 += var11;
            var5 += var13;
            var6 += var12;
            var8 += var14;
            var2 += Rasterizer2D.i;
         }
      }

   }

   private static void a(int[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6;
      int var7;
      int var8;
      int var9;
      if(c) {
         if(b) {
            if(var3 - var2 > 3) {
               var6 = (var5 - var4) / (var3 - var2);
            } else {
               var6 = 0;
            }

            if(var3 > Rasterizer2D.o) {
               var3 = Rasterizer2D.o;
            }

            if(var2 < 0) {
               var4 -= var2 * var6;
               var2 = 0;
            }

            if(var2 >= var3) {
               return;
            }

            var1 += var2;
            var7 = var3 - var2 >> 2;
            var6 <<= 2;
         } else {
            if(var2 >= var3) {
               return;
            }

            var1 += var2;
            if((var7 = var3 - var2 >> 2) > 0) {
               var6 = (var5 - var4) * z[var7] >> 15;
            } else {
               var6 = 0;
            }
         }

         if(d != 0) {
            var8 = d;
            var9 = 256 - d;

            while(true) {
               --var7;
               if(var7 < 0) {
                  if((var7 = var3 - var2 & 3) > 0) {
                     var5 = (((var5 = x[var4 >> 8]) & 16711935) * var9 >> 8 & 16711935) + ((var5 & '\uff00') * var9 >> 8 & '\uff00');

                     do {
                        var0[var1++] = var5 + ((var0[var1] & 16711935) * var8 >> 8 & 16711935) + ((var0[var1] & '\uff00') * var8 >> 8 & '\uff00');
                        --var7;
                     } while(var7 > 0);
                  }
                  break;
               }

               var5 = x[var4 >> 8];
               var4 += var6;
               var5 = ((var5 & 16711935) * var9 >> 8 & 16711935) + ((var5 & '\uff00') * var9 >> 8 & '\uff00');
               var0[var1++] = var5 + ((var0[var1] & 16711935) * var8 >> 8 & 16711935) + ((var0[var1] & '\uff00') * var8 >> 8 & '\uff00');
               var0[var1++] = var5 + ((var0[var1] & 16711935) * var8 >> 8 & 16711935) + ((var0[var1] & '\uff00') * var8 >> 8 & '\uff00');
               var0[var1++] = var5 + ((var0[var1] & 16711935) * var8 >> 8 & 16711935) + ((var0[var1] & '\uff00') * var8 >> 8 & '\uff00');
               var0[var1++] = var5 + ((var0[var1] & 16711935) * var8 >> 8 & 16711935) + ((var0[var1] & '\uff00') * var8 >> 8 & '\uff00');
            }
         } else {
            while(true) {
               --var7;
               if(var7 < 0) {
                  if((var7 = var3 - var2 & 3) > 0) {
                     var5 = x[var4 >> 8];

                     do {
                        var0[var1++] = var5;
                        --var7;
                     } while(var7 > 0);

                     return;
                  }
                  break;
               }

               var5 = x[var4 >> 8];
               var4 += var6;
               var0[var1++] = var5;
               var0[var1++] = var5;
               var0[var1++] = var5;
               var0[var1++] = var5;
            }
         }

      } else if(var2 < var3) {
         var6 = (var5 - var4) / (var3 - var2);
         if(b) {
            if(var3 > Rasterizer2D.o) {
               var3 = Rasterizer2D.o;
            }

            if(var2 < 0) {
               var4 -= var2 * var6;
               var2 = 0;
            }

            if(var2 >= var3) {
               return;
            }
         }

         var1 += var2;
         var7 = var3 - var2;
         if(d == 0) {
            do {
               var0[var1++] = x[var4 >> 8];
               var4 += var6;
               --var7;
            } while(var7 > 0);

         } else {
            var8 = d;
            var9 = 256 - d;

            do {
               var5 = x[var4 >> 8];
               var4 += var6;
               var5 = ((var5 & 16711935) * var9 >> 8 & 16711935) + ((var5 & '\uff00') * var9 >> 8 & '\uff00');
               var0[var1++] = var5 + ((var0[var1] & 16711935) * var8 >> 8 & 16711935) + ((var0[var1] & '\uff00') * var8 >> 8 & '\uff00');
               --var7;
            } while(var7 > 0);

         }
      }
   }

   public static void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 0;
      if(var1 != var0) {
         var7 = (var4 - var3 << 16) / (var1 - var0);
      }

      int var8 = 0;
      if(var2 != var1) {
         var8 = (var5 - var4 << 16) / (var2 - var1);
      }

      int var9 = 0;
      if(var2 != var0) {
         var9 = (var3 - var5 << 16) / (var0 - var2);
      }

      if(var0 <= var1 && var0 <= var2) {
         if(var0 < Rasterizer2D.l) {
            if(var1 > Rasterizer2D.l) {
               var1 = Rasterizer2D.l;
            }

            if(var2 > Rasterizer2D.l) {
               var2 = Rasterizer2D.l;
            }

            if(var1 < var2) {
               var5 = var3 <<= 16;
               if(var0 < 0) {
                  var5 -= var9 * var0;
                  var3 -= var7 * var0;
                  var0 = 0;
               }

               var4 <<= 16;
               if(var1 < 0) {
                  var4 -= var8 * var1;
                  var1 = 0;
               }

               if(var0 != var1 && var9 < var7 || var0 == var1 && var9 > var8) {
                  var2 -= var1;
                  var1 -= var0;
                  var0 = t[var0];

                  while(true) {
                     --var1;
                     if(var1 < 0) {
                        while(true) {
                           --var2;
                           if(var2 < 0) {
                              return;
                           }

                           a(Rasterizer2D.h, var0, var6, var5 >> 16, var4 >> 16);
                           var5 += var9;
                           var4 += var8;
                           var0 += Rasterizer2D.i;
                        }
                     }

                     a(Rasterizer2D.h, var0, var6, var5 >> 16, var3 >> 16);
                     var5 += var9;
                     var3 += var7;
                     var0 += Rasterizer2D.i;
                  }
               } else {
                  var2 -= var1;
                  var1 -= var0;
                  var0 = t[var0];

                  while(true) {
                     --var1;
                     if(var1 < 0) {
                        while(true) {
                           --var2;
                           if(var2 < 0) {
                              return;
                           }

                           a(Rasterizer2D.h, var0, var6, var4 >> 16, var5 >> 16);
                           var5 += var9;
                           var4 += var8;
                           var0 += Rasterizer2D.i;
                        }
                     }

                     a(Rasterizer2D.h, var0, var6, var3 >> 16, var5 >> 16);
                     var5 += var9;
                     var3 += var7;
                     var0 += Rasterizer2D.i;
                  }
               }
            } else {
               var4 = var3 <<= 16;
               if(var0 < 0) {
                  var4 -= var9 * var0;
                  var3 -= var7 * var0;
                  var0 = 0;
               }

               var5 <<= 16;
               if(var2 < 0) {
                  var5 -= var8 * var2;
                  var2 = 0;
               }

               if(var0 != var2 && var9 < var7 || var0 == var2 && var8 > var7) {
                  var1 -= var2;
                  var2 -= var0;
                  var0 = t[var0];

                  while(true) {
                     --var2;
                     if(var2 < 0) {
                        while(true) {
                           --var1;
                           if(var1 < 0) {
                              return;
                           }

                           a(Rasterizer2D.h, var0, var6, var5 >> 16, var3 >> 16);
                           var5 += var8;
                           var3 += var7;
                           var0 += Rasterizer2D.i;
                        }
                     }

                     a(Rasterizer2D.h, var0, var6, var4 >> 16, var3 >> 16);
                     var4 += var9;
                     var3 += var7;
                     var0 += Rasterizer2D.i;
                  }
               } else {
                  var1 -= var2;
                  var2 -= var0;
                  var0 = t[var0];

                  while(true) {
                     --var2;
                     if(var2 < 0) {
                        while(true) {
                           --var1;
                           if(var1 < 0) {
                              return;
                           }

                           a(Rasterizer2D.h, var0, var6, var3 >> 16, var5 >> 16);
                           var5 += var8;
                           var3 += var7;
                           var0 += Rasterizer2D.i;
                        }
                     }

                     a(Rasterizer2D.h, var0, var6, var3 >> 16, var4 >> 16);
                     var4 += var9;
                     var3 += var7;
                     var0 += Rasterizer2D.i;
                  }
               }
            }
         }
      } else if(var1 <= var2) {
         if(var1 < Rasterizer2D.l) {
            if(var2 > Rasterizer2D.l) {
               var2 = Rasterizer2D.l;
            }

            if(var0 > Rasterizer2D.l) {
               var0 = Rasterizer2D.l;
            }

            if(var2 < var0) {
               var3 = var4 <<= 16;
               if(var1 < 0) {
                  var3 -= var7 * var1;
                  var4 -= var8 * var1;
                  var1 = 0;
               }

               var5 <<= 16;
               if(var2 < 0) {
                  var5 -= var9 * var2;
                  var2 = 0;
               }

               if(var1 != var2 && var7 < var8 || var1 == var2 && var7 > var9) {
                  var0 -= var2;
                  var2 -= var1;
                  var1 = t[var1];

                  while(true) {
                     --var2;
                     if(var2 < 0) {
                        while(true) {
                           --var0;
                           if(var0 < 0) {
                              return;
                           }

                           a(Rasterizer2D.h, var1, var6, var3 >> 16, var5 >> 16);
                           var3 += var7;
                           var5 += var9;
                           var1 += Rasterizer2D.i;
                        }
                     }

                     a(Rasterizer2D.h, var1, var6, var3 >> 16, var4 >> 16);
                     var3 += var7;
                     var4 += var8;
                     var1 += Rasterizer2D.i;
                  }
               } else {
                  var0 -= var2;
                  var2 -= var1;
                  var1 = t[var1];

                  while(true) {
                     --var2;
                     if(var2 < 0) {
                        while(true) {
                           --var0;
                           if(var0 < 0) {
                              return;
                           }

                           a(Rasterizer2D.h, var1, var6, var5 >> 16, var3 >> 16);
                           var3 += var7;
                           var5 += var9;
                           var1 += Rasterizer2D.i;
                        }
                     }

                     a(Rasterizer2D.h, var1, var6, var4 >> 16, var3 >> 16);
                     var3 += var7;
                     var4 += var8;
                     var1 += Rasterizer2D.i;
                  }
               }
            } else {
               var5 = var4 <<= 16;
               if(var1 < 0) {
                  var5 -= var7 * var1;
                  var4 -= var8 * var1;
                  var1 = 0;
               }

               var3 <<= 16;
               if(var0 < 0) {
                  var3 -= var9 * var0;
                  var0 = 0;
               }

               if(var7 < var8) {
                  var2 -= var0;
                  var0 -= var1;
                  var1 = t[var1];

                  while(true) {
                     --var0;
                     if(var0 < 0) {
                        while(true) {
                           --var2;
                           if(var2 < 0) {
                              return;
                           }

                           a(Rasterizer2D.h, var1, var6, var3 >> 16, var4 >> 16);
                           var3 += var9;
                           var4 += var8;
                           var1 += Rasterizer2D.i;
                        }
                     }

                     a(Rasterizer2D.h, var1, var6, var5 >> 16, var4 >> 16);
                     var5 += var7;
                     var4 += var8;
                     var1 += Rasterizer2D.i;
                  }
               } else {
                  var2 -= var0;
                  var0 -= var1;
                  var1 = t[var1];

                  while(true) {
                     --var0;
                     if(var0 < 0) {
                        while(true) {
                           --var2;
                           if(var2 < 0) {
                              return;
                           }

                           a(Rasterizer2D.h, var1, var6, var4 >> 16, var3 >> 16);
                           var3 += var9;
                           var4 += var8;
                           var1 += Rasterizer2D.i;
                        }
                     }

                     a(Rasterizer2D.h, var1, var6, var4 >> 16, var5 >> 16);
                     var5 += var7;
                     var4 += var8;
                     var1 += Rasterizer2D.i;
                  }
               }
            }
         }
      } else if(var2 < Rasterizer2D.l) {
         if(var0 > Rasterizer2D.l) {
            var0 = Rasterizer2D.l;
         }

         if(var1 > Rasterizer2D.l) {
            var1 = Rasterizer2D.l;
         }

         if(var0 < var1) {
            var4 = var5 <<= 16;
            if(var2 < 0) {
               var4 -= var8 * var2;
               var5 -= var9 * var2;
               var2 = 0;
            }

            var3 <<= 16;
            if(var0 < 0) {
               var3 -= var7 * var0;
               var0 = 0;
            }

            if(var8 < var9) {
               var1 -= var0;
               var0 -= var2;
               var2 = t[var2];

               while(true) {
                  --var0;
                  if(var0 < 0) {
                     while(true) {
                        --var1;
                        if(var1 < 0) {
                           return;
                        }

                        a(Rasterizer2D.h, var2, var6, var4 >> 16, var3 >> 16);
                        var4 += var8;
                        var3 += var7;
                        var2 += Rasterizer2D.i;
                     }
                  }

                  a(Rasterizer2D.h, var2, var6, var4 >> 16, var5 >> 16);
                  var4 += var8;
                  var5 += var9;
                  var2 += Rasterizer2D.i;
               }
            } else {
               var1 -= var0;
               var0 -= var2;
               var2 = t[var2];

               while(true) {
                  --var0;
                  if(var0 < 0) {
                     while(true) {
                        --var1;
                        if(var1 < 0) {
                           return;
                        }

                        a(Rasterizer2D.h, var2, var6, var3 >> 16, var4 >> 16);
                        var4 += var8;
                        var3 += var7;
                        var2 += Rasterizer2D.i;
                     }
                  }

                  a(Rasterizer2D.h, var2, var6, var5 >> 16, var4 >> 16);
                  var4 += var8;
                  var5 += var9;
                  var2 += Rasterizer2D.i;
               }
            }
         } else {
            var3 = var5 <<= 16;
            if(var2 < 0) {
               var3 -= var8 * var2;
               var5 -= var9 * var2;
               var2 = 0;
            }

            var4 <<= 16;
            if(var1 < 0) {
               var4 -= var7 * var1;
               var1 = 0;
            }

            if(var8 < var9) {
               var0 -= var1;
               var1 -= var2;
               var2 = t[var2];

               while(true) {
                  --var1;
                  if(var1 < 0) {
                     while(true) {
                        --var0;
                        if(var0 < 0) {
                           return;
                        }

                        a(Rasterizer2D.h, var2, var6, var4 >> 16, var5 >> 16);
                        var4 += var7;
                        var5 += var9;
                        var2 += Rasterizer2D.i;
                     }
                  }

                  a(Rasterizer2D.h, var2, var6, var3 >> 16, var5 >> 16);
                  var3 += var8;
                  var5 += var9;
                  var2 += Rasterizer2D.i;
               }
            } else {
               var0 -= var1;
               var1 -= var2;
               var2 = t[var2];

               while(true) {
                  --var1;
                  if(var1 < 0) {
                     while(true) {
                        --var0;
                        if(var0 < 0) {
                           return;
                        }

                        a(Rasterizer2D.h, var2, var6, var5 >> 16, var4 >> 16);
                        var4 += var7;
                        var5 += var9;
                        var2 += Rasterizer2D.i;
                     }
                  }

                  a(Rasterizer2D.h, var2, var6, var5 >> 16, var3 >> 16);
                  var3 += var8;
                  var5 += var9;
                  var2 += Rasterizer2D.i;
               }
            }
         }
      }
   }

   private static void a(int[] var0, int var1, int var2, int var3, int var4) {
      if(b) {
         if(var4 > Rasterizer2D.o) {
            var4 = Rasterizer2D.o;
         }

         if(var3 < 0) {
            var3 = 0;
         }
      }

      if(var3 < var4) {
         var1 += var3;
         int var5 = var4 - var3 >> 2;
         if(d == 0) {
            while(true) {
               --var5;
               if(var5 < 0) {
                  var5 = var4 - var3 & 3;

                  while(true) {
                     --var5;
                     if(var5 < 0) {
                        return;
                     }

                     var0[var1++] = var2;
                  }
               }

               var0[var1++] = var2;
               var0[var1++] = var2;
               var0[var1++] = var2;
               var0[var1++] = var2;
            }
         } else {
            int var6 = d;
            int var7 = 256 - d;
            var2 = ((var2 & 16711935) * var7 >> 8 & 16711935) + ((var2 & '\uff00') * var7 >> 8 & '\uff00');

            while(true) {
               --var5;
               if(var5 < 0) {
                  var5 = var4 - var3 & 3;

                  while(true) {
                     --var5;
                     if(var5 < 0) {
                        return;
                     }

                     var0[var1++] = var2 + ((var0[var1] & 16711935) * var6 >> 8 & 16711935) + ((var0[var1] & '\uff00') * var6 >> 8 & '\uff00');
                  }
               }

               var0[var1++] = var2 + ((var0[var1] & 16711935) * var6 >> 8 & 16711935) + ((var0[var1] & '\uff00') * var6 >> 8 & '\uff00');
               var0[var1++] = var2 + ((var0[var1] & 16711935) * var6 >> 8 & 16711935) + ((var0[var1] & '\uff00') * var6 >> 8 & '\uff00');
               var0[var1++] = var2 + ((var0[var1] & 16711935) * var6 >> 8 & 16711935) + ((var0[var1] & '\uff00') * var6 >> 8 & '\uff00');
               var0[var1++] = var2 + ((var0[var1] & 16711935) * var6 >> 8 & 16711935) + ((var0[var1] & '\uff00') * var6 >> 8 & '\uff00');
            }
         }
      }
   }

   public static void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18) {
      var2 = var2;
      var1 = var1;
      var0 = var0;
      int var19 = var18;
      v[var18] = w++;
      int[] var10000;
      int var21;
      int var22;
      int var23;
      int var24;
      if(F[var18] != null) {
         var10000 = F[var18];
      } else {
         int[] var20;
         if(D > 0) {
            var20 = E[--D];
            E[D] = null;
         } else {
            var21 = 0;
            var22 = -1;
            var23 = 0;

            while(true) {
               if(var23 >= A) {
                  var20 = F[var22];
                  F[var22] = null;
                  break;
               }

               if(F[var23] != null && (v[var23] < var21 || var22 == -1)) {
                  var21 = v[var23];
                  var22 = var23;
               }

               ++var23;
            }
         }

         F[var18] = var20;
         IndexedImage var28 = u[var18];
         int[] var29 = G[var18];
         if(a) {
            B[var18] = false;

            for(var23 = 0; var23 < 4096; ++var23) {
               if((var24 = var20[var23] = var29[var28.a[var23]] & 16316671) == 0) {
                  B[var19] = true;
               }

               var20[var23 + 4096] = var24 - (var24 >>> 3) & 16316671;
               var20[var23 + 8192] = var24 - (var24 >>> 2) & 16316671;
               var20[var23 + 12288] = var24 - (var24 >>> 2) - (var24 >>> 3) & 16316671;
            }
         } else {
            if(var28.c == 64) {
               for(var23 = 0; var23 < 128; ++var23) {
                  for(var24 = 0; var24 < 128; ++var24) {
                     var20[var24 + (var23 << 7)] = var29[var28.a[(var24 >> 1) + (var23 >> 1 << 6)]];
                  }
               }
            } else {
               for(var23 = 0; var23 < 16384; ++var23) {
                  var20[var23] = var29[var28.a[var23]];
               }
            }

            B[var18] = false;

            for(var23 = 0; var23 < 16384; ++var23) {
               var20[var23] &= 16316671;
               if((var24 = var20[var23]) == 0) {
                  B[var19] = true;
               }

               var20[var23 + 16384] = var24 - (var24 >>> 3) & 16316671;
               var20[var23 + '\u8000'] = var24 - (var24 >>> 2) & 16316671;
               var20[var23 + '\uc000'] = var24 - (var24 >>> 2) - (var24 >>> 3) & 16316671;
            }
         }

         var10000 = var20;
      }

      int[] var26 = var10000;
      y = !B[var18];
      var10 = var9 - var10;
      var13 = var12 - var13;
      var16 = var15 - var16;
      var11 -= var9;
      var14 -= var12;
      var17 -= var15;
      var18 = var11 * var12 - var14 * var9 << (Client.d == 9?14:15);
      int var27 = var14 * var15 - var17 * var12 << 8;
      var21 = var17 * var9 - var11 * var15 << 5;
      var22 = var10 * var12 - var13 * var9 << (Client.d == 9?14:15);
      var12 = var13 * var15 - var16 * var12 << 8;
      var9 = var16 * var9 - var10 * var15 << 5;
      var15 = var13 * var11 - var10 * var14 << (Client.d == 9?14:15);
      var13 = var16 * var14 - var13 * var17 << 8;
      var10 = var10 * var17 - var16 * var11 << 5;
      var11 = 0;
      var14 = 0;
      if(var1 != var0) {
         var11 = (var4 - var3 << 16) / (var1 - var0);
         var14 = (var7 - var6 << 16) / (var1 - var0);
      }

      var16 = 0;
      var17 = 0;
      if(var2 != var1) {
         var16 = (var5 - var4 << 16) / (var2 - var1);
         var17 = (var8 - var7 << 16) / (var2 - var1);
      }

      var23 = 0;
      var24 = 0;
      if(var2 != var0) {
         var23 = (var3 - var5 << 16) / (var0 - var2);
         var24 = (var6 - var8 << 16) / (var0 - var2);
      }

      int var25;
      if(var0 <= var1 && var0 <= var2) {
         if(var0 < Rasterizer2D.l) {
            if(var1 > Rasterizer2D.l) {
               var1 = Rasterizer2D.l;
            }

            if(var2 > Rasterizer2D.l) {
               var2 = Rasterizer2D.l;
            }

            if(var1 < var2) {
               var5 = var3 <<= 16;
               var8 = var6 <<= 16;
               if(var0 < 0) {
                  var5 -= var23 * var0;
                  var3 -= var11 * var0;
                  var8 -= var24 * var0;
                  var6 -= var14 * var0;
                  var0 = 0;
               }

               var4 <<= 16;
               var7 <<= 16;
               if(var1 < 0) {
                  var4 -= var16 * var1;
                  var7 -= var17 * var1;
                  var1 = 0;
               }

               var25 = var0 - f;
               var18 += var21 * var25;
               var22 += var9 * var25;
               var15 += var10 * var25;
               if(var0 != var1 && var23 < var11 || var0 == var1 && var23 > var16) {
                  var2 -= var1;
                  var1 -= var0;
                  var0 = t[var0];

                  while(true) {
                     --var1;
                     if(var1 < 0) {
                        while(true) {
                           --var2;
                           if(var2 < 0) {
                              return;
                           }

                           a(Rasterizer2D.h, var26, var0, var5 >> 16, var4 >> 16, var8 >> 8, var7 >> 8, var18, var22, var15, var27, var12, var13);
                           var5 += var23;
                           var4 += var16;
                           var8 += var24;
                           var7 += var17;
                           var0 += Rasterizer2D.i;
                           var18 += var21;
                           var22 += var9;
                           var15 += var10;
                        }
                     }

                     a(Rasterizer2D.h, var26, var0, var5 >> 16, var3 >> 16, var8 >> 8, var6 >> 8, var18, var22, var15, var27, var12, var13);
                     var5 += var23;
                     var3 += var11;
                     var8 += var24;
                     var6 += var14;
                     var0 += Rasterizer2D.i;
                     var18 += var21;
                     var22 += var9;
                     var15 += var10;
                  }
               }

               var2 -= var1;
               var1 -= var0;
               var0 = t[var0];

               while(true) {
                  --var1;
                  if(var1 < 0) {
                     while(true) {
                        --var2;
                        if(var2 < 0) {
                           return;
                        }

                        a(Rasterizer2D.h, var26, var0, var4 >> 16, var5 >> 16, var7 >> 8, var8 >> 8, var18, var22, var15, var27, var12, var13);
                        var5 += var23;
                        var4 += var16;
                        var8 += var24;
                        var7 += var17;
                        var0 += Rasterizer2D.i;
                        var18 += var21;
                        var22 += var9;
                        var15 += var10;
                     }
                  }

                  a(Rasterizer2D.h, var26, var0, var3 >> 16, var5 >> 16, var6 >> 8, var8 >> 8, var18, var22, var15, var27, var12, var13);
                  var5 += var23;
                  var3 += var11;
                  var8 += var24;
                  var6 += var14;
                  var0 += Rasterizer2D.i;
                  var18 += var21;
                  var22 += var9;
                  var15 += var10;
               }
            }

            var4 = var3 <<= 16;
            var7 = var6 <<= 16;
            if(var0 < 0) {
               var4 -= var23 * var0;
               var3 -= var11 * var0;
               var7 -= var24 * var0;
               var6 -= var14 * var0;
               var0 = 0;
            }

            var5 <<= 16;
            var8 <<= 16;
            if(var2 < 0) {
               var5 -= var16 * var2;
               var8 -= var17 * var2;
               var2 = 0;
            }

            var25 = var0 - f;
            var18 += var21 * var25;
            var22 += var9 * var25;
            var15 += var10 * var25;
            if((var0 == var2 || var23 >= var11) && (var0 != var2 || var16 <= var11)) {
               var1 -= var2;
               var2 -= var0;
               var0 = t[var0];

               while(true) {
                  --var2;
                  if(var2 < 0) {
                     while(true) {
                        --var1;
                        if(var1 < 0) {
                           return;
                        }

                        a(Rasterizer2D.h, var26, var0, var3 >> 16, var5 >> 16, var6 >> 8, var8 >> 8, var18, var22, var15, var27, var12, var13);
                        var5 += var16;
                        var3 += var11;
                        var8 += var17;
                        var6 += var14;
                        var0 += Rasterizer2D.i;
                        var18 += var21;
                        var22 += var9;
                        var15 += var10;
                     }
                  }

                  a(Rasterizer2D.h, var26, var0, var3 >> 16, var4 >> 16, var6 >> 8, var7 >> 8, var18, var22, var15, var27, var12, var13);
                  var4 += var23;
                  var3 += var11;
                  var7 += var24;
                  var6 += var14;
                  var0 += Rasterizer2D.i;
                  var18 += var21;
                  var22 += var9;
                  var15 += var10;
               }
            }

            var1 -= var2;
            var2 -= var0;
            var0 = t[var0];

            while(true) {
               --var2;
               if(var2 < 0) {
                  while(true) {
                     --var1;
                     if(var1 < 0) {
                        return;
                     }

                     a(Rasterizer2D.h, var26, var0, var5 >> 16, var3 >> 16, var8 >> 8, var6 >> 8, var18, var22, var15, var27, var12, var13);
                     var5 += var16;
                     var3 += var11;
                     var8 += var17;
                     var6 += var14;
                     var0 += Rasterizer2D.i;
                     var18 += var21;
                     var22 += var9;
                     var15 += var10;
                  }
               }

               a(Rasterizer2D.h, var26, var0, var4 >> 16, var3 >> 16, var7 >> 8, var6 >> 8, var18, var22, var15, var27, var12, var13);
               var4 += var23;
               var3 += var11;
               var7 += var24;
               var6 += var14;
               var0 += Rasterizer2D.i;
               var18 += var21;
               var22 += var9;
               var15 += var10;
            }
         }
      } else if(var1 <= var2) {
         if(var1 < Rasterizer2D.l) {
            if(var2 > Rasterizer2D.l) {
               var2 = Rasterizer2D.l;
            }

            if(var0 > Rasterizer2D.l) {
               var0 = Rasterizer2D.l;
            }

            if(var2 < var0) {
               var3 = var4 <<= 16;
               var6 = var7 <<= 16;
               if(var1 < 0) {
                  var3 -= var11 * var1;
                  var4 -= var16 * var1;
                  var6 -= var14 * var1;
                  var7 -= var17 * var1;
                  var1 = 0;
               }

               var5 <<= 16;
               var8 <<= 16;
               if(var2 < 0) {
                  var5 -= var23 * var2;
                  var8 -= var24 * var2;
                  var2 = 0;
               }

               var25 = var1 - f;
               var18 += var21 * var25;
               var22 += var9 * var25;
               var15 += var10 * var25;
               if(var1 != var2 && var11 < var16 || var1 == var2 && var11 > var23) {
                  var0 -= var2;
                  var2 -= var1;
                  var1 = t[var1];

                  while(true) {
                     --var2;
                     if(var2 < 0) {
                        while(true) {
                           --var0;
                           if(var0 < 0) {
                              return;
                           }

                           a(Rasterizer2D.h, var26, var1, var3 >> 16, var5 >> 16, var6 >> 8, var8 >> 8, var18, var22, var15, var27, var12, var13);
                           var3 += var11;
                           var5 += var23;
                           var6 += var14;
                           var8 += var24;
                           var1 += Rasterizer2D.i;
                           var18 += var21;
                           var22 += var9;
                           var15 += var10;
                        }
                     }

                     a(Rasterizer2D.h, var26, var1, var3 >> 16, var4 >> 16, var6 >> 8, var7 >> 8, var18, var22, var15, var27, var12, var13);
                     var3 += var11;
                     var4 += var16;
                     var6 += var14;
                     var7 += var17;
                     var1 += Rasterizer2D.i;
                     var18 += var21;
                     var22 += var9;
                     var15 += var10;
                  }
               }

               var0 -= var2;
               var2 -= var1;
               var1 = t[var1];

               while(true) {
                  --var2;
                  if(var2 < 0) {
                     while(true) {
                        --var0;
                        if(var0 < 0) {
                           return;
                        }

                        a(Rasterizer2D.h, var26, var1, var5 >> 16, var3 >> 16, var8 >> 8, var6 >> 8, var18, var22, var15, var27, var12, var13);
                        var3 += var11;
                        var5 += var23;
                        var6 += var14;
                        var8 += var24;
                        var1 += Rasterizer2D.i;
                        var18 += var21;
                        var22 += var9;
                        var15 += var10;
                     }
                  }

                  a(Rasterizer2D.h, var26, var1, var4 >> 16, var3 >> 16, var7 >> 8, var6 >> 8, var18, var22, var15, var27, var12, var13);
                  var3 += var11;
                  var4 += var16;
                  var6 += var14;
                  var7 += var17;
                  var1 += Rasterizer2D.i;
                  var18 += var21;
                  var22 += var9;
                  var15 += var10;
               }
            }

            var5 = var4 <<= 16;
            var8 = var7 <<= 16;
            if(var1 < 0) {
               var5 -= var11 * var1;
               var4 -= var16 * var1;
               var8 -= var14 * var1;
               var7 -= var17 * var1;
               var1 = 0;
            }

            var3 <<= 16;
            var6 <<= 16;
            if(var0 < 0) {
               var3 -= var23 * var0;
               var6 -= var24 * var0;
               var0 = 0;
            }

            var25 = var1 - f;
            var18 += var21 * var25;
            var22 += var9 * var25;
            var15 += var10 * var25;
            if(var11 < var16) {
               var2 -= var0;
               var0 -= var1;
               var1 = t[var1];

               while(true) {
                  --var0;
                  if(var0 < 0) {
                     while(true) {
                        --var2;
                        if(var2 < 0) {
                           return;
                        }

                        a(Rasterizer2D.h, var26, var1, var3 >> 16, var4 >> 16, var6 >> 8, var7 >> 8, var18, var22, var15, var27, var12, var13);
                        var3 += var23;
                        var4 += var16;
                        var6 += var24;
                        var7 += var17;
                        var1 += Rasterizer2D.i;
                        var18 += var21;
                        var22 += var9;
                        var15 += var10;
                     }
                  }

                  a(Rasterizer2D.h, var26, var1, var5 >> 16, var4 >> 16, var8 >> 8, var7 >> 8, var18, var22, var15, var27, var12, var13);
                  var5 += var11;
                  var4 += var16;
                  var8 += var14;
                  var7 += var17;
                  var1 += Rasterizer2D.i;
                  var18 += var21;
                  var22 += var9;
                  var15 += var10;
               }
            }

            var2 -= var0;
            var0 -= var1;
            var1 = t[var1];

            while(true) {
               --var0;
               if(var0 < 0) {
                  while(true) {
                     --var2;
                     if(var2 < 0) {
                        return;
                     }

                     a(Rasterizer2D.h, var26, var1, var4 >> 16, var3 >> 16, var7 >> 8, var6 >> 8, var18, var22, var15, var27, var12, var13);
                     var3 += var23;
                     var4 += var16;
                     var6 += var24;
                     var7 += var17;
                     var1 += Rasterizer2D.i;
                     var18 += var21;
                     var22 += var9;
                     var15 += var10;
                  }
               }

               a(Rasterizer2D.h, var26, var1, var4 >> 16, var5 >> 16, var7 >> 8, var8 >> 8, var18, var22, var15, var27, var12, var13);
               var5 += var11;
               var4 += var16;
               var8 += var14;
               var7 += var17;
               var1 += Rasterizer2D.i;
               var18 += var21;
               var22 += var9;
               var15 += var10;
            }
         }
      } else if(var2 < Rasterizer2D.l) {
         if(var0 > Rasterizer2D.l) {
            var0 = Rasterizer2D.l;
         }

         if(var1 > Rasterizer2D.l) {
            var1 = Rasterizer2D.l;
         }

         if(var0 < var1) {
            var4 = var5 <<= 16;
            var7 = var8 <<= 16;
            if(var2 < 0) {
               var4 -= var16 * var2;
               var5 -= var23 * var2;
               var7 -= var17 * var2;
               var8 -= var24 * var2;
               var2 = 0;
            }

            var3 <<= 16;
            var6 <<= 16;
            if(var0 < 0) {
               var3 -= var11 * var0;
               var6 -= var14 * var0;
               var0 = 0;
            }

            var25 = var2 - f;
            var18 += var21 * var25;
            var22 += var9 * var25;
            var15 += var10 * var25;
            if(var16 < var23) {
               var1 -= var0;
               var0 -= var2;
               var2 = t[var2];

               while(true) {
                  --var0;
                  if(var0 < 0) {
                     while(true) {
                        --var1;
                        if(var1 < 0) {
                           return;
                        }

                        a(Rasterizer2D.h, var26, var2, var4 >> 16, var3 >> 16, var7 >> 8, var6 >> 8, var18, var22, var15, var27, var12, var13);
                        var4 += var16;
                        var3 += var11;
                        var7 += var17;
                        var6 += var14;
                        var2 += Rasterizer2D.i;
                        var18 += var21;
                        var22 += var9;
                        var15 += var10;
                     }
                  }

                  a(Rasterizer2D.h, var26, var2, var4 >> 16, var5 >> 16, var7 >> 8, var8 >> 8, var18, var22, var15, var27, var12, var13);
                  var4 += var16;
                  var5 += var23;
                  var7 += var17;
                  var8 += var24;
                  var2 += Rasterizer2D.i;
                  var18 += var21;
                  var22 += var9;
                  var15 += var10;
               }
            }

            var1 -= var0;
            var0 -= var2;
            var2 = t[var2];

            while(true) {
               --var0;
               if(var0 < 0) {
                  while(true) {
                     --var1;
                     if(var1 < 0) {
                        return;
                     }

                     a(Rasterizer2D.h, var26, var2, var3 >> 16, var4 >> 16, var6 >> 8, var7 >> 8, var18, var22, var15, var27, var12, var13);
                     var4 += var16;
                     var3 += var11;
                     var7 += var17;
                     var6 += var14;
                     var2 += Rasterizer2D.i;
                     var18 += var21;
                     var22 += var9;
                     var15 += var10;
                  }
               }

               a(Rasterizer2D.h, var26, var2, var5 >> 16, var4 >> 16, var8 >> 8, var7 >> 8, var18, var22, var15, var27, var12, var13);
               var4 += var16;
               var5 += var23;
               var7 += var17;
               var8 += var24;
               var2 += Rasterizer2D.i;
               var18 += var21;
               var22 += var9;
               var15 += var10;
            }
         }

         var3 = var5 <<= 16;
         var6 = var8 <<= 16;
         if(var2 < 0) {
            var3 -= var16 * var2;
            var5 -= var23 * var2;
            var6 -= var17 * var2;
            var8 -= var24 * var2;
            var2 = 0;
         }

         var4 <<= 16;
         var7 <<= 16;
         if(var1 < 0) {
            var4 -= var11 * var1;
            var7 -= var14 * var1;
            var1 = 0;
         }

         var25 = var2 - f;
         var18 += var21 * var25;
         var22 += var9 * var25;
         var15 += var10 * var25;
         if(var16 < var23) {
            var0 -= var1;
            var1 -= var2;
            var2 = t[var2];

            while(true) {
               --var1;
               if(var1 < 0) {
                  while(true) {
                     --var0;
                     if(var0 < 0) {
                        return;
                     }

                     a(Rasterizer2D.h, var26, var2, var4 >> 16, var5 >> 16, var7 >> 8, var8 >> 8, var18, var22, var15, var27, var12, var13);
                     var4 += var11;
                     var5 += var23;
                     var7 += var14;
                     var8 += var24;
                     var2 += Rasterizer2D.i;
                     var18 += var21;
                     var22 += var9;
                     var15 += var10;
                  }
               }

               a(Rasterizer2D.h, var26, var2, var3 >> 16, var5 >> 16, var6 >> 8, var8 >> 8, var18, var22, var15, var27, var12, var13);
               var3 += var16;
               var5 += var23;
               var6 += var17;
               var8 += var24;
               var2 += Rasterizer2D.i;
               var18 += var21;
               var22 += var9;
               var15 += var10;
            }
         }

         var0 -= var1;
         var1 -= var2;
         var2 = t[var2];

         while(true) {
            --var1;
            if(var1 < 0) {
               while(true) {
                  --var0;
                  if(var0 < 0) {
                     return;
                  }

                  a(Rasterizer2D.h, var26, var2, var5 >> 16, var4 >> 16, var8 >> 8, var7 >> 8, var18, var22, var15, var27, var12, var13);
                  var4 += var11;
                  var5 += var23;
                  var7 += var14;
                  var8 += var24;
                  var2 += Rasterizer2D.i;
                  var18 += var21;
                  var22 += var9;
                  var15 += var10;
               }
            }

            a(Rasterizer2D.h, var26, var2, var5 >> 16, var3 >> 16, var8 >> 8, var6 >> 8, var18, var22, var15, var27, var12, var13);
            var3 += var16;
            var5 += var23;
            var6 += var17;
            var8 += var24;
            var2 += Rasterizer2D.i;
            var18 += var21;
            var22 += var9;
            var15 += var10;
         }
      }

   }

   private static void a(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      int var13 = 0;
      int var14 = 0;
      if(var3 < var4) {
         int var15;
         if(b) {
            var6 = (var6 - var5) / (var4 - var3);
            if(var4 > Rasterizer2D.o) {
               var4 = Rasterizer2D.o;
            }

            if(var3 < 0) {
               var5 -= var3 * var6;
               var3 = 0;
            }

            if(var3 >= var4) {
               return;
            }

            var15 = var4 - var3 >> 3;
            var6 <<= 12;
         } else if(var4 - var3 > 7) {
            var15 = var4 - var3 >> 3;
            var6 = (var6 - var5) * z[var15] >> 6;
         } else {
            var15 = 0;
            var6 = 0;
         }

         var5 <<= 9;
         var2 += var3;
         int var16;
         int var17;
         int var18;
         int var19;
         int var20;
         int var21;
         int var22;
         if(a) {
            var16 = 0;
            var17 = 0;
            var18 = var3 - e;
            var7 += (var10 >> 3) * var18;
            var8 += (var11 >> 3) * var18;
            if((var18 = (var9 += (var12 >> 3) * var18) >> 12) != 0) {
               var13 = var7 / var18;
               var14 = var8 / var18;
               if(var13 < 0) {
                  var13 = 0;
               } else if(var13 > 4032) {
                  var13 = 4032;
               }
            }

            var7 += var10;
            var8 += var11;
            if((var18 = (var9 += var12) >> 12) != 0) {
               var16 = var7 / var18;
               var17 = var8 / var18;
               if(var16 < 7) {
                  var16 = 7;
               } else if(var16 > 4032) {
                  var16 = 4032;
               }
            }

            var18 = var16 - var13 >> 3;
            var19 = var17 - var14 >> 3;
            var13 += (var5 & 6291456) >> 3;
            var20 = var5 >> 23;
            if(!y) {
               while(var15-- > 0) {
                  if((var21 = var1[(var14 & 4032) + (var13 >> 6)] >>> var20) != 0) {
                     var0[var2] = var21;
                  }

                  ++var2;
                  var13 += var18;
                  var14 += var19;
                  if((var21 = var1[(var14 & 4032) + (var13 >> 6)] >>> var20) != 0) {
                     var0[var2] = var21;
                  }

                  ++var2;
                  var13 += var18;
                  var14 += var19;
                  if((var21 = var1[(var14 & 4032) + (var13 >> 6)] >>> var20) != 0) {
                     var0[var2] = var21;
                  }

                  ++var2;
                  var13 += var18;
                  var14 += var19;
                  if((var21 = var1[(var14 & 4032) + (var13 >> 6)] >>> var20) != 0) {
                     var0[var2] = var21;
                  }

                  ++var2;
                  var13 += var18;
                  var14 += var19;
                  if((var21 = var1[(var14 & 4032) + (var13 >> 6)] >>> var20) != 0) {
                     var0[var2] = var21;
                  }

                  ++var2;
                  var13 += var18;
                  var14 += var19;
                  if((var21 = var1[(var14 & 4032) + (var13 >> 6)] >>> var20) != 0) {
                     var0[var2] = var21;
                  }

                  ++var2;
                  var13 += var18;
                  var14 += var19;
                  if((var21 = var1[(var14 & 4032) + (var13 >> 6)] >>> var20) != 0) {
                     var0[var2] = var21;
                  }

                  ++var2;
                  var13 += var18;
                  var14 += var19;
                  if((var21 = var1[(var14 & 4032) + (var13 >> 6)] >>> var20) != 0) {
                     var0[var2] = var21;
                  }

                  ++var2;
                  var13 = var16;
                  var14 = var17;
                  var7 += var10;
                  var8 += var11;
                  if((var22 = (var9 += var12) >> 12) != 0) {
                     var16 = var7 / var22;
                     var17 = var8 / var22;
                     if(var16 < 7) {
                        var16 = 7;
                     } else if(var16 > 4032) {
                        var16 = 4032;
                     }
                  }

                  var18 = var16 - var13 >> 3;
                  var19 = var17 - var14 >> 3;
                  var5 += var6;
                  var13 += (var5 & 6291456) >> 3;
                  var20 = var5 >> 23;
               }

               for(var15 = var4 - var3 & 7; var15-- > 0; var14 += var19) {
                  if((var21 = var1[(var14 & 4032) + (var13 >> 6)] >>> var20) != 0) {
                     var0[var2] = var21;
                  }

                  ++var2;
                  var13 += var18;
               }

            } else {
               while(var15-- > 0) {
                  var0[var2++] = var1[(var14 & 4032) + (var13 >> 6)] >>> var20;
                  var13 += var18;
                  var14 += var19;
                  var0[var2++] = var1[(var14 & 4032) + (var13 >> 6)] >>> var20;
                  var13 += var18;
                  var14 += var19;
                  var0[var2++] = var1[(var14 & 4032) + (var13 >> 6)] >>> var20;
                  var13 += var18;
                  var14 += var19;
                  var0[var2++] = var1[(var14 & 4032) + (var13 >> 6)] >>> var20;
                  var13 += var18;
                  var14 += var19;
                  var0[var2++] = var1[(var14 & 4032) + (var13 >> 6)] >>> var20;
                  var13 += var18;
                  var14 += var19;
                  var0[var2++] = var1[(var14 & 4032) + (var13 >> 6)] >>> var20;
                  var13 += var18;
                  var14 += var19;
                  var0[var2++] = var1[(var14 & 4032) + (var13 >> 6)] >>> var20;
                  var13 += var18;
                  var14 += var19;
                  var0[var2++] = var1[(var14 & 4032) + (var13 >> 6)] >>> var20;
                  var13 = var16;
                  var14 = var17;
                  var7 += var10;
                  var8 += var11;
                  if((var21 = (var9 += var12) >> 12) != 0) {
                     var16 = var7 / var21;
                     var17 = var8 / var21;
                     if(var16 < 7) {
                        var16 = 7;
                     } else if(var16 > 4032) {
                        var16 = 4032;
                     }
                  }

                  var18 = var16 - var13 >> 3;
                  var19 = var17 - var14 >> 3;
                  var5 += var6;
                  var13 += (var5 & 6291456) >> 3;
                  var20 = var5 >> 23;
               }

               for(var15 = var4 - var3 & 7; var15-- > 0; var14 += var19) {
                  var0[var2++] = var1[(var14 & 4032) + (var13 >> 6)] >>> var20;
                  var13 += var18;
               }

            }
         } else {
            var16 = 0;
            var17 = 0;
            var18 = var3 - e;
            var7 += (var10 >> 3) * var18;
            var8 += (var11 >> 3) * var18;
            if((var18 = (var9 += (var12 >> 3) * var18) >> 14) != 0) {
               var13 = var7 / var18;
               var14 = var8 / var18;
               if(var13 < 0) {
                  var13 = 0;
               } else if(var13 > 16256) {
                  var13 = 16256;
               }
            }

            var7 += var10;
            var8 += var11;
            if((var18 = (var9 += var12) >> 14) != 0) {
               var16 = var7 / var18;
               var17 = var8 / var18;
               if(var16 < 7) {
                  var16 = 7;
               } else if(var16 > 16256) {
                  var16 = 16256;
               }
            }

            var18 = var16 - var13 >> 3;
            var19 = var17 - var14 >> 3;
            var13 += var5 & 6291456;
            var20 = var5 >> 23;
            if(!y) {
               while(var15-- > 0) {
                  if((var21 = var1[(var14 & 16256) + (var13 >> 7)] >>> var20) != 0) {
                     var0[var2] = var21;
                  }

                  ++var2;
                  var13 += var18;
                  var14 += var19;
                  if((var21 = var1[(var14 & 16256) + (var13 >> 7)] >>> var20) != 0) {
                     var0[var2] = var21;
                  }

                  ++var2;
                  var13 += var18;
                  var14 += var19;
                  if((var21 = var1[(var14 & 16256) + (var13 >> 7)] >>> var20) != 0) {
                     var0[var2] = var21;
                  }

                  ++var2;
                  var13 += var18;
                  var14 += var19;
                  if((var21 = var1[(var14 & 16256) + (var13 >> 7)] >>> var20) != 0) {
                     var0[var2] = var21;
                  }

                  ++var2;
                  var13 += var18;
                  var14 += var19;
                  if((var21 = var1[(var14 & 16256) + (var13 >> 7)] >>> var20) != 0) {
                     var0[var2] = var21;
                  }

                  ++var2;
                  var13 += var18;
                  var14 += var19;
                  if((var21 = var1[(var14 & 16256) + (var13 >> 7)] >>> var20) != 0) {
                     var0[var2] = var21;
                  }

                  ++var2;
                  var13 += var18;
                  var14 += var19;
                  if((var21 = var1[(var14 & 16256) + (var13 >> 7)] >>> var20) != 0) {
                     var0[var2] = var21;
                  }

                  ++var2;
                  var13 += var18;
                  var14 += var19;
                  if((var21 = var1[(var14 & 16256) + (var13 >> 7)] >>> var20) != 0) {
                     var0[var2] = var21;
                  }

                  ++var2;
                  var13 = var16;
                  var14 = var17;
                  var7 += var10;
                  var8 += var11;
                  if((var22 = (var9 += var12) >> 14) != 0) {
                     var16 = var7 / var22;
                     var17 = var8 / var22;
                     if(var16 < 7) {
                        var16 = 7;
                     } else if(var16 > 16256) {
                        var16 = 16256;
                     }
                  }

                  var18 = var16 - var13 >> 3;
                  var19 = var17 - var14 >> 3;
                  var5 += var6;
                  var13 += var5 & 6291456;
                  var20 = var5 >> 23;
               }

               for(var21 = var4 - var3 & 7; var21-- > 0; var14 += var19) {
                  if((var22 = var1[(var14 & 16256) + (var13 >> 7)] >>> var20) != 0) {
                     var0[var2] = var22;
                  }

                  ++var2;
                  var13 += var18;
               }

            } else {
               while(var15-- > 0) {
                  var0[var2++] = var1[(var14 & 16256) + (var13 >> 7)] >>> var20;
                  var13 += var18;
                  var14 += var19;
                  var0[var2++] = var1[(var14 & 16256) + (var13 >> 7)] >>> var20;
                  var13 += var18;
                  var14 += var19;
                  var0[var2++] = var1[(var14 & 16256) + (var13 >> 7)] >>> var20;
                  var13 += var18;
                  var14 += var19;
                  var0[var2++] = var1[(var14 & 16256) + (var13 >> 7)] >>> var20;
                  var13 += var18;
                  var14 += var19;
                  var0[var2++] = var1[(var14 & 16256) + (var13 >> 7)] >>> var20;
                  var13 += var18;
                  var14 += var19;
                  var0[var2++] = var1[(var14 & 16256) + (var13 >> 7)] >>> var20;
                  var13 += var18;
                  var14 += var19;
                  var0[var2++] = var1[(var14 & 16256) + (var13 >> 7)] >>> var20;
                  var13 += var18;
                  var14 += var19;
                  var0[var2++] = var1[(var14 & 16256) + (var13 >> 7)] >>> var20;
                  var13 = var16;
                  var14 = var17;
                  var7 += var10;
                  var8 += var11;
                  if((var21 = (var9 += var12) >> 14) != 0) {
                     var16 = var7 / var21;
                     var17 = var8 / var21;
                     if(var16 < 7) {
                        var16 = 7;
                     } else if(var16 > 16256) {
                        var16 = 16256;
                     }
                  }

                  var18 = var16 - var13 >> 3;
                  var19 = var17 - var14 >> 3;
                  var5 += var6;
                  var13 += var5 & 6291456;
                  var20 = var5 >> 23;
               }

               for(var15 = var4 - var3 & 7; var15-- > 0; var14 += var19) {
                  var0[var2++] = var1[(var14 & 16256) + (var13 >> 7)] >>> var20;
                  var13 += var18;
               }

            }
         }
      }
   }
}
