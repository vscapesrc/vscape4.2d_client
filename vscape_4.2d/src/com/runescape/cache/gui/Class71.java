package com.runescape.cache.gui;
import java.awt.Color;

import com.runescape.cache.Archive;
import com.runescape.graphics.Rasterizer2D;
import com.runescape.graphics.Sprite1;
import com.runescape.stream.Buffer;

public final class Class71 extends Rasterizer2D {
   private int a = 0;
   private int[] b = new int[256];
   private int[] c = new int[256];
   private int[] d = new int[256];
   private int[] e = new int[256];
   private byte[][] f = new byte[256][];
   private int[] g = new int[256];
   private static String r = "nbsp";
   private static String s = "trans=";
   private static String t = "shad";
   private static String u = "/shad";
   private static String v = "gt";
   private static String w = "/str";
   private static String x = "euro";
   private static String y = "col=";
   private static String z = "br";
   private static String A = "str=";
   private static String B = "/col";
   private static String C = "img=";
   private static String D = "/u";
   private static String E = "str";
   private static String F = "shad=";
   private static String G = "lt";
   private static String H = "shy";
   private static String I = "copy";
   private static String J = "/trans";
   private static String K = "times";
   private static String L = "u=";
   private static String M = "u";
   private static String N = "reg";
   private static int O = 0;
   private static int P = -1;
   private static int Q = -1;
   private static int R = 256;
   private static int S = 0;
   private static int T = -1;
   private static int U = -1;
   private static int V = 0;
   private static int W = 256;
   private static int X = 0;

   public Class71(boolean var1, String var2, Archive var3) {
      Buffer var9 = new Buffer(var3.a(var2 + ".dat"));
      Buffer var10;
      (var10 = new Buffer(var3.a("index.dat"))).b = var9.g() + 4;
      int var4;
      if((var4 = var10.e()) > 0) {
         var10.b += 3 * (var4 - 1);
      }

      for(var4 = 0; var4 < 256; ++var4) {
         this.d[var4] = var10.e();
         this.b[var4] = var10.e();
         int var5 = this.e[var4] = var10.g();
         int var6 = this.c[var4] = var10.g();
         int var7 = var10.e();
         int var8 = var5 * var6;
         this.f[var4] = new byte[var8];
         if(var7 == 0) {
            for(var7 = 0; var7 < var8; ++var7) {
               this.f[var4][var7] = var9.f();
            }
         } else if(var7 == 1) {
            for(var7 = 0; var7 < var5; ++var7) {
               for(var8 = 0; var8 < var6; ++var8) {
                  this.f[var4][var7 + var8 * var5] = var9.f();
               }
            }
         }

         if(var6 > this.a && var4 < 128) {
            this.a = var6;
         }

         this.d[var4] = 1;
         this.g[var4] = var5 + 2;
         var7 = 0;

         for(var8 = var6 / 7; var8 < var6; ++var8) {
            var7 += this.f[var4][var8 * var5];
         }

         if(var7 <= var6 / 7) {
            --this.g[var4];
            this.d[var4] = 0;
         }

         var7 = 0;

         for(var8 = var6 / 7; var8 < var6; ++var8) {
            var7 += this.f[var4][var5 - 1 + var8 * var5];
         }

         if(var7 <= var6 / 7) {
            --this.g[var4];
         }
      }

      if(var1) {
         this.g[32] = this.g[73];
      } else {
         this.g[32] = this.g[105];
      }
   }

   private void a(String var1, int var2, int var3) {
      var3 -= this.a;
      int var4 = -1;

      for(int var5 = 0; var5 < var1.length(); ++var5) {
         char var6;
         if((var6 = var1.charAt(var5)) > 255) {
            var6 = 32;
         }

         if(var6 == 60) {
            var4 = var5;
         } else {
            int var8;
            int var11;
            int var12;
            if(var6 == 62 && var4 != -1) {
               String var7 = var1.substring(var4 + 1, var5);
               var4 = -1;
               if(var7.equals(G)) {
                  var6 = 60;
               } else if(var7.equals(v)) {
                  var6 = 62;
               } else if(var7.equals(r)) {
                  var6 = 160;
               } else if(var7.equals(H)) {
                  var6 = 173;
               } else if(var7.equals(K)) {
                  var6 = 215;
               } else if(var7.equals(x)) {
                  var6 = 128;
               } else if(var7.equals(I)) {
                  var6 = 169;
               } else {
                  if(!var7.equals(N)) {
                     if(var7.startsWith(C)) {
                        try {
                           var12 = ((Sprite)null).e;
                           if(W == 256) {
                              //null.c(var2, var3 + this.a - var12);
                           } else {
                              //null.c(var2, var3 + this.a - var12, W);
                           }

                           var2 += ((Sprite)null).d;
                        } catch (Exception var10) {
                           ;
                        }
                     } else {
                        var7 = var7;

                        try {
                           if(var7.startsWith(y)) {
                              String var13;
                              X = (var13 = var7.substring(4)).length() < 6?Color.decode(var13).getRGB():Integer.parseInt(var13, 16);
                           } else if(var7.equals(B)) {
                              X = O;
                           } else if(var7.startsWith(s)) {
                              W = Integer.valueOf(var7.substring(6)).intValue();
                           } else if(var7.equals(J)) {
                              W = R;
                           } else if(var7.startsWith(A)) {
                              Q = Integer.valueOf(var7.substring(4)).intValue();
                           } else if(var7.equals(E)) {
                              Q = 8388608;
                           } else if(var7.equals(w)) {
                              Q = -1;
                           } else if(var7.startsWith(L)) {
                              T = Integer.valueOf(var7.substring(2)).intValue();
                           } else if(var7.equals(M)) {
                              T = 0;
                           } else if(var7.equals(D)) {
                              T = -1;
                           } else if(var7.startsWith(F)) {
                              P = Integer.valueOf(var7.substring(5)).intValue();
                           } else if(var7.equals(t)) {
                              P = 0;
                           } else if(var7.equals(u)) {
                              P = U;
                           } else if(var7.equals(z)) {
                              var8 = R;
                              var11 = U;
                              var12 = O;
                              Q = -1;
                              T = -1;
                              U = var11;
                              P = var11;
                              O = var12;
                              X = var12;
                              R = var8;
                              W = var8;
                              V = 0;
                              S = 0;
                           }
                        } catch (Exception var9) {
                           ;
                        }
                     }
                     continue;
                  }

                  var6 = 174;
               }
            }

            if(var4 == -1) {
               var11 = this.e[var6];
               var8 = this.c[var6];
               if(var6 != 32) {
                  if(W == 256) {
                     if(P != -1) {
                        this.c(var6, var2 + this.d[var6] + 1, var3 + this.b[var6] + 1, var11, var8, P);
                     }

                     this.c(var6, var2 + this.d[var6], var3 + this.b[var6], var11, var8, X);
                  } else {
                     if(P != -1) {
                        this.a(var6, var2 + this.d[var6] + 1, var3 + this.b[var6] + 1, var11, var8, P, W);
                     }

                     this.a(var6, var2 + this.d[var6], var3 + this.b[var6], var11, var8, X, W);
                  }
               }

               var12 = this.g[var6];
               if(Q != -1) {
                  Sprite1.a(var2, var3 + (int)((double)this.a * 0.7D), var12, Q);
               }

               if(T != -1) {
                  Sprite1.a(var2, var3 + this.a, var12, T);
               }

               var2 += var12;
            }
         }
      }

   }

   private static void a(int var0, int var1) {
      Q = -1;
      T = -1;
      U = var1;
      P = var1;
      O = var0;
      X = var0;
      R = 256;
      W = 256;
      V = 0;
      S = 0;
   }

   public final int a(String var1) {
      if(var1 == null) {
         return 0;
      } else {
         int var2 = -1;
         int var3 = 0;

         for(int var4 = 0; var4 < var1.length(); ++var4) {
            char var5;
            if((var5 = var1.charAt(var4)) > 255) {
               var5 = 32;
            }

            if(var5 == 60) {
               var2 = var4;
            } else {
               if(var5 == 62 && var2 != -1) {
                  String var7 = var1.substring(var2 + 1, var4);
                  var2 = -1;
                  if(var7.equals(G)) {
                     var5 = 60;
                  } else if(var7.equals(v)) {
                     var5 = 62;
                  } else if(var7.equals(r)) {
                     var5 = 160;
                  } else if(var7.equals(H)) {
                     var5 = 173;
                  } else if(var7.equals(K)) {
                     var5 = 215;
                  } else if(var7.equals(x)) {
                     var5 = 128;
                  } else if(var7.equals(I)) {
                     var5 = 169;
                  } else {
                     if(!var7.equals(N)) {
                        if(var7.startsWith(C)) {
                           try {
                              var3 += ((Sprite)null).d;
                           } catch (Exception var6) {
                              ;
                           }
                        }
                        continue;
                     }

                     var5 = 174;
                  }
               }

               if(var2 == -1) {
                  var3 += this.g[var5];
               }
            }
         }

         return var3;
      }
   }

   public final void a(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         a(var4, var5);
         this.a(var1, var2, var3);
      }

   }

   public final void b(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         a(0, -1);
         this.a(var1, 259 - this.a(var1) / 2, var3);
      }

   }

   private void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var2 + var3 * Rasterizer2D.i;
      int var9 = Rasterizer2D.i - var4;
      int var10 = 0;
      int var11 = 0;
      int var12;
      if(var3 < Rasterizer2D.k) {
         var12 = Rasterizer2D.k - var3;
         var5 -= var12;
         var3 = Rasterizer2D.k;
         var11 = 0 + var12 * var4;
         var8 += var12 * Rasterizer2D.i;
      }

      if(var3 + var5 > Rasterizer2D.l) {
         var5 -= var3 + var5 - Rasterizer2D.l;
      }

      if(var2 < Rasterizer2D.m) {
         var12 = Rasterizer2D.m - var2;
         var4 -= var12;
         var2 = Rasterizer2D.m;
         var11 += var12;
         var8 += var12;
         var10 = var12 + 0;
         var9 += var12;
      }

      if(var2 + var4 > Rasterizer2D.n) {
         var12 = var2 + var4 - Rasterizer2D.n;
         var4 -= var12;
         var10 += var12;
         var9 += var12;
      }

      if(var4 > 0 && var5 > 0) {
         byte[] var10001 = this.f[var1];
         int var10002 = var6;
         int var10004 = var8;
         int var10007 = var9;
         int var10008 = var10;
         var10 = var7;
         var9 = var10008;
         var8 = var10007;
         var7 = var5;
         var6 = var4;
         var5 = var10004;
         var4 = var11;
         var3 = var10002;
         byte[] var14 = var10001;
         int[] var13 = Rasterizer2D.h;
         var3 = ((var3 & 16711935) * var10 & -16711936) + ((var3 & '\uff00') * var10 & 16711680) >> 8;
         var10 = 256 - var10;

         for(var7 = -var7; var7 < 0; ++var7) {
            for(var11 = -var6; var11 < 0; ++var11) {
               if(var14[var4++] != 0) {
                  var12 = var13[var5];
                  var13[var5++] = (((var12 & 16711935) * var10 & -16711936) + ((var12 & '\uff00') * var10 & 16711680) >> 8) + var3;
               } else {
                  ++var5;
               }
            }

            var5 += var8;
            var4 += var9;
         }
      }

   }

   private void c(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var2 + var3 * Rasterizer2D.i;
      int var8 = Rasterizer2D.i - var4;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if(var3 < Rasterizer2D.k) {
         var11 = Rasterizer2D.k - var3;
         var5 -= var11;
         var3 = Rasterizer2D.k;
         var10 = 0 + var11 * var4;
         var7 += var11 * Rasterizer2D.i;
      }

      if(var3 + var5 > Rasterizer2D.l) {
         var5 -= var3 + var5 - Rasterizer2D.l;
      }

      if(var2 < Rasterizer2D.m) {
         var11 = Rasterizer2D.m - var2;
         var4 -= var11;
         var2 = Rasterizer2D.m;
         var10 += var11;
         var7 += var11;
         var9 = var11 + 0;
         var8 += var11;
      }

      if(var2 + var4 > Rasterizer2D.n) {
         var11 = var2 + var4 - Rasterizer2D.n;
         var4 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if(var4 > 0 && var5 > 0) {
         byte[] var10001 = this.f[var1];
         int var10002 = var6;
         int var10004 = var7;
         var9 = var9;
         var8 = var8;
         var7 = var5;
         var6 = var4;
         var5 = var10004;
         var4 = var10;
         var3 = var10002;
         byte[] var13 = var10001;
         int[] var12 = Rasterizer2D.h;
         var10 = -(var6 >> 2);
         var6 = -(var6 & 3);

         for(var7 = -var7; var7 < 0; ++var7) {
            for(var11 = var10; var11 < 0; ++var11) {
               if(var13[var4++] != 0) {
                  var12[var5++] = var3;
               } else {
                  ++var5;
               }

               if(var13[var4++] != 0) {
                  var12[var5++] = var3;
               } else {
                  ++var5;
               }

               if(var13[var4++] != 0) {
                  var12[var5++] = var3;
               } else {
                  ++var5;
               }

               if(var13[var4++] != 0) {
                  var12[var5++] = var3;
               } else {
                  ++var5;
               }
            }

            for(var11 = var6; var11 < 0; ++var11) {
               if(var13[var4++] != 0) {
                  var12[var5++] = var3;
               } else {
                  ++var5;
               }
            }

            var5 += var8;
            var4 += var9;
         }
      }

   }
}
