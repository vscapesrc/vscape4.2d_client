package com.runescape.cache;
public final class BZip2Decompressor {
   private static final SpriteLoader a = new SpriteLoader();

   public static int a(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      SpriteLoader var5 = a;
      synchronized(a) {
         a.a = var2;
         a.b = var4;
         a.f = var0;
         a.g = 0;
         a.c = var3;
         a.h = var1;
         a.o = 0;
         a.n = 0;
         a.d = 0;
         a.e = 0;
         a.i = 0;
         a.j = 0;
         a.q = 0;
         SpriteLoader var18 = a;
         boolean var19 = false;
         Object var21 = null;
         SpriteLoader var24 = null;
         Object var6 = null;
         var18.p = 1;
         if(SpriteLoader.x == null) {
            SpriteLoader.x = new int[var18.p * 100000];
         }

         boolean var10000 = true;

         while(var10000 && (byte)a(8, var18) != 23) {
            byte var46 = (byte)a(8, var18);
            var46 = (byte)a(8, var18);
            var46 = (byte)a(8, var18);
            var46 = (byte)a(8, var18);
            var46 = (byte)a(8, var18);
            ++var18.q;
            var46 = (byte)a(8, var18);
            var46 = (byte)a(8, var18);
            var46 = (byte)a(8, var18);
            var46 = (byte)a(8, var18);
            byte var20 = (byte)a(1, var18);
            var18.m = var20 != 0;
            if(var18.m) {
               System.out.println("PANIC! RANDOMISED BLOCK!");
            }

            var18.r = 0;
            var20 = (byte)a(8, var18);
            var18.r = var18.r << 8 | var20 & 255;
            var20 = (byte)a(8, var18);
            var18.r = var18.r << 8 | var20 & 255;
            var20 = (byte)a(8, var18);
            var18.r = var18.r << 8 | var20 & 255;

            int var23;
            for(var23 = 0; var23 < 16; ++var23) {
               byte var22 = (byte)a(1, var18);
               var18.A[var23] = var22 == 1;
            }

            for(var23 = 0; var23 < 256; ++var23) {
               var18.z[var23] = false;
            }

            for(var23 = 0; var23 < 16; ++var23) {
               if(var18.A[var23]) {
                  for(var3 = 0; var3 < 16; ++var3) {
                     if((byte)a(1, var18) == 1) {
                        var18.z[(var23 << 4) + var3] = true;
                     }
                  }
               }
            }

            var24 = var18;
            var18.y = 0;

            int var27;
            for(var27 = 0; var27 < 256; ++var27) {
               if(var24.z[var27]) {
                  var24.B[var24.y] = (byte)var27;
                  ++var24.y;
               }
            }

            var23 = var18.y + 2;
            var3 = a(3, var18);
            var4 = a(15, var18);

            int var8;
            for(var27 = 0; var27 < var4; ++var27) {
               for(var8 = 0; (byte)a(1, var18) != 0; ++var8) {
                  ;
               }

               var18.F[var27] = (byte)var8;
            }

            byte[] var28 = new byte[6];

            byte var30;
            for(var30 = 0; var30 < var3; var28[var30] = var30++) {
               ;
            }

            byte var9;
            byte var10;
            for(var8 = 0; var8 < var4; ++var8) {
               var9 = var18.F[var8];

               for(var10 = var28[var9]; var9 > 0; --var9) {
                  var28[var9] = var28[var9 - 1];
               }

               var28[0] = var10;
               var18.E[var8] = var10;
            }

            int var31;
            int var33;
            for(var8 = 0; var8 < var3; ++var8) {
               var31 = a(5, var18);

               for(var33 = 0; var33 < var23; ++var33) {
                  while((byte)a(1, var18) != 0) {
                     if((byte)a(1, var18) == 0) {
                        ++var31;
                     } else {
                        --var31;
                     }
                  }

                  var18.G[var8][var33] = (byte)var31;
               }
            }

            int var7;
            int var11;
            byte var12;
            int var15;
            int var16;
            int[] var26;
            int[] var29;
            for(var8 = 0; var8 < var3; ++var8) {
               var9 = 32;
               var10 = 0;

               for(var4 = 0; var4 < var23; ++var4) {
                  if(var18.G[var8][var4] > var10) {
                     var10 = var18.G[var8][var4];
                  }

                  if(var18.G[var8][var4] < var9) {
                     var9 = var18.G[var8][var4];
                  }
               }

               int[] var47 = var18.H[var8];
               int[] var10001 = var18.I[var8];
               int[] var10002 = var18.J[var8];
               byte[] var10003 = var18.G[var8];
               var11 = var23;
               var12 = var10;
               byte[] var14 = var10003;
               int[] var36 = var10002;
               var29 = var10001;
               var26 = var47;
               var15 = 0;

               for(var7 = var9; var7 <= var12; ++var7) {
                  for(var16 = 0; var16 < var11; ++var16) {
                     if(var14[var16] == var7) {
                        var36[var15] = var16;
                        ++var15;
                     }
                  }
               }

               for(var7 = 0; var7 < 23; ++var7) {
                  var29[var7] = 0;
               }

               for(var7 = 0; var7 < var11; ++var7) {
                  ++var29[var14[var7] + 1];
               }

               for(var7 = 1; var7 < 23; ++var7) {
                  var29[var7] += var29[var7 - 1];
               }

               for(var7 = 0; var7 < 23; ++var7) {
                  var26[var7] = 0;
               }

               var7 = 0;

               for(var16 = var9; var16 <= var12; ++var16) {
                  var7 += var29[var16 + 1] - var29[var16];
                  var26[var16] = var7 - 1;
                  var7 <<= 1;
               }

               for(var16 = var9 + 1; var16 <= var12; ++var16) {
                  var29[var16] = (var26[var16 - 1] + 1 << 1) - var29[var16];
               }

               var18.K[var8] = var9;
            }

            var8 = var18.y + 1;
            var9 = -1;
            boolean var38 = false;

            for(var4 = 0; var4 <= 255; ++var4) {
               var18.u[var4] = 0;
            }

            var4 = 4095;

            int var13;
            int var42;
            for(var42 = 15; var42 >= 0; --var42) {
               for(var13 = 15; var13 >= 0; --var13) {
                  var18.C[var4] = (byte)((var42 << 4) + var13);
                  --var4;
               }

               var18.D[var42] = var4 + 1;
            }

            var42 = 0;
            var31 = var9 + 1;
            byte var39 = 50;
            byte var41 = var18.E[0];
            var23 = var18.K[var41];
            int[] var25 = var18.H[var41];
            var29 = var18.J[var41];
            var26 = var18.I[var41];
            var33 = var39 - 1;
            var13 = var23;

            byte var34;
            int var40;
            for(var40 = a(var23, var18); var40 > var25[var13]; var40 = var40 << 1 | var34) {
               ++var13;
               var34 = (byte)a(1, var18);
            }

            var13 = var29[var40 - var26[var13]];

            while(true) {
               while(var13 != var8) {
                  byte var35;
                  byte var43;
                  if(var13 != 0 && var13 != 1) {
                     if((var40 = var13 - 1) < 16) {
                        var15 = var18.D[0];

                        for(var34 = var18.C[var15 + var40]; var40 > 3; var40 -= 4) {
                           var13 = var15 + var40;
                           var18.C[var13] = var18.C[var13 - 1];
                           var18.C[var13 - 1] = var18.C[var13 - 2];
                           var18.C[var13 - 2] = var18.C[var13 - 3];
                           var18.C[var13 - 3] = var18.C[var13 - 4];
                        }

                        while(var40 > 0) {
                           var18.C[var15 + var40] = var18.C[var15 + var40 - 1];
                           --var40;
                        }

                        var18.C[var15] = var34;
                     } else {
                        var15 = var40 / 16;
                        var13 = var40 % 16;
                        var7 = var18.D[var15] + var13;

                        for(var34 = var18.C[var7]; var7 > var18.D[var15]; --var7) {
                           var18.C[var7] = var18.C[var7 - 1];
                        }

                        ++var18.D[var15];

                        while(var15 > 0) {
                           --var18.D[var15];
                           var18.C[var18.D[var15]] = var18.C[var18.D[var15 - 1] + 16 - 1];
                           --var15;
                        }

                        --var18.D[0];
                        var18.C[var18.D[0]] = var34;
                        if(var18.D[0] == 0) {
                           var13 = 4095;

                           for(var40 = 15; var40 >= 0; --var40) {
                              for(var15 = 15; var15 >= 0; --var15) {
                                 var18.C[var13] = var18.C[var18.D[var40] + var15];
                                 --var13;
                              }

                              var18.D[var40] = var13 + 1;
                           }
                        }
                     }

                     ++var18.u[var18.B[var34 & 255] & 255];
                     SpriteLoader.x[var42] = var18.B[var34 & 255] & 255;
                     ++var42;
                     if(var33 == 0) {
                        ++var31;
                        var33 = 50;
                        var43 = var18.E[var31];
                        var23 = var18.K[var43];
                        var25 = var18.H[var43];
                        var29 = var18.J[var43];
                        var26 = var18.I[var43];
                     }

                     --var33;
                     var15 = var23;

                     for(var13 = a(var23, var18); var13 > var25[var15]; var13 = var13 << 1 | var35) {
                        ++var15;
                        var35 = (byte)a(1, var18);
                     }

                     var13 = var29[var13 - var26[var15]];
                  } else {
                     var40 = -1;
                     var11 = 1;

                     do {
                        if(var13 == 0) {
                           var40 += var11;
                        } else if(var13 == 1) {
                           var40 += 2 * var11;
                        }

                        var11 <<= 1;
                        if(var33 == 0) {
                           ++var31;
                           var33 = 50;
                           var43 = var18.E[var31];
                           var23 = var18.K[var43];
                           var25 = var18.H[var43];
                           var29 = var18.J[var43];
                           var26 = var18.I[var43];
                        }

                        --var33;
                        var15 = var23;

                        for(var13 = a(var23, var18); var13 > var25[var15]; var13 = var13 << 1 | var35) {
                           ++var15;
                           var35 = (byte)a(1, var18);
                        }
                     } while((var13 = var29[var13 - var26[var15]]) == 0 || var13 == 1);

                     ++var40;
                     var43 = var18.B[var18.C[var18.D[0]] & 255];

                     for(var18.u[var43 & 255] += var40; var40 > 0; --var40) {
                        SpriteLoader.x[var42] = var43 & 255;
                        ++var42;
                     }
                  }
               }

               var18.l = 0;
               var18.k = 0;
               var18.w[0] = 0;

               for(var13 = 1; var13 <= 256; ++var13) {
                  var18.w[var13] = var18.u[var13 - 1];
               }

               for(var13 = 1; var13 <= 256; ++var13) {
                  var18.w[var13] += var18.w[var13 - 1];
               }

               for(var13 = 0; var13 < var42; ++var13) {
                  var12 = (byte)SpriteLoader.x[var13];
                  SpriteLoader.x[var18.w[var12 & 255]] |= var13 << 8;
                  ++var18.w[var12 & 255];
               }

               var18.s = SpriteLoader.x[var18.r] >> 8;
               var18.v = 0;
               var18.s = SpriteLoader.x[var18.s];
               var18.t = (byte)var18.s;
               var18.s >>= 8;
               ++var18.v;
               var18.L = var42;
               byte var32 = var18.k;
               var33 = var18.l;
               var42 = var18.v;
               var13 = var18.t;
               int[] var44 = SpriteLoader.x;
               var11 = var18.s;
               byte[] var45 = var18.f;
               var7 = var18.g;
               var16 = var18.h;
               var23 = var18.h;
               var3 = var18.L + 1;

               label272:
               while(true) {
                  if(var33 > 0) {
                     while(true) {
                        if(var16 == 0) {
                           break label272;
                        }

                        if(var33 == 1) {
                           if(var16 == 0) {
                              var33 = 1;
                              break label272;
                           }

                           var45[var7] = var32;
                           ++var7;
                           --var16;
                           break;
                        }

                        var45[var7] = var32;
                        --var33;
                        ++var7;
                        --var16;
                     }
                  }

                  boolean var37 = true;

                  while(var37) {
                     var37 = false;
                     if(var42 == var3) {
                        var33 = 0;
                        break label272;
                     }

                     var32 = (byte)var13;
                     var9 = (byte)(var11 = var44[var11]);
                     var11 >>= 8;
                     ++var42;
                     if(var9 != var13) {
                        var13 = var9;
                        if(var16 == 0) {
                           var33 = 1;
                           break label272;
                        }

                        var45[var7] = var32;
                        ++var7;
                        --var16;
                        var37 = true;
                     } else if(var42 == var3) {
                        if(var16 == 0) {
                           var33 = 1;
                           break label272;
                        }

                        var45[var7] = var32;
                        ++var7;
                        --var16;
                        var37 = true;
                     }
                  }

                  var33 = 2;
                  var9 = (byte)(var11 = var44[var11]);
                  var11 >>= 8;
                  ++var42;
                  if(var42 != var3) {
                     if(var9 != var13) {
                        var13 = var9;
                     } else {
                        var33 = 3;
                        var30 = (byte)(var11 = var44[var11]);
                        var11 >>= 8;
                        ++var42;
                        if(var42 != var3) {
                           if(var30 != var13) {
                              var13 = var30;
                           } else {
                              var30 = (byte)(var11 = var44[var11]);
                              var11 >>= 8;
                              ++var42;
                              var33 = (var30 & 255) + 4;
                              var13 = (byte)(var11 = var44[var11]);
                              var11 >>= 8;
                              ++var42;
                           }
                        }
                     }
                  }
               }

               var8 = var18.i;
               var18.i += var23 - var16;
               if(var18.i < var8) {
                  ++var18.j;
               }

               var18.k = var32;
               var18.l = var33;
               var18.v = var42;
               var18.t = var13;
               SpriteLoader.x = var44;
               var18.s = var11;
               var18.f = var45;
               var18.g = var7;
               var18.h = var16;
               if(var18.v == var18.L + 1 && var18.l == 0) {
                  var10000 = true;
                  break;
               }

               var10000 = false;
               break;
            }
         }

         return var1 -= a.h;
      }
   }

   private static int a(int var0, SpriteLoader var1) {
      while(var1.o < var0) {
         var1.n = var1.n << 8 | var1.a[var1.b] & 255;
         var1.o += 8;
         ++var1.b;
         --var1.c;
         ++var1.d;
         if(var1.d == 0) {
            ++var1.e;
         }
      }

      int var2 = var1.n >> var1.o - var0 & (1 << var0) - 1;
      var1.o -= var0;
      return var2;
   }
}
