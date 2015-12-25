package com.runescape.f;
import com.runescape.a.b.ItemDefinition;
import com.runescape.b.Rasterizer3D;
import com.runescape.c.Renderable;
import com.runescape.c.RenderableObject;
import com.runescape.c.a.Model;
import com.runescape.d.Buffer;
import com.runescape.g.ResourceProvider;

public final class MapRegion {
   private final int[] d;
   private final int[] e;
   private final int[] f;
   private final int[] g;
   private final int[] h;
   private final int[][][] i;
   private final byte[][][] j;
   public static int a;
   private final byte[][][] k;
   private final int[][][] l;
   private final byte[][][] m;
   private static final int[] n = new int[]{1, 0, -1, 0};
   private final int[][] o;
   private static final int[] p = new int[]{16, 32, 64, 128};
   private final byte[][][] q;
   private static final int[] r = new int[]{0, -1, 0, 1};
   public static int b = 99;
   private final int s;
   private final int t;
   private final byte[][][] u;
   private final byte[][][] v;
   public static boolean c = true;
   private static final int[] w = new int[]{1, 2, 4, 8};

   public MapRegion(byte[][][] var1, int[][][] var2) {
      b = 99;
      this.s = 104;
      this.t = 104;
      this.i = var2;
      this.v = var1;
      this.q = new byte[4][104][104];
      this.j = new byte[4][104][104];
      this.m = new byte[4][104][104];
      this.u = new byte[4][104][104];
      this.l = new int[4][105][105];
      this.k = new byte[4][105][105];
      this.o = new int[105][105];
      this.d = new int[104];
      this.e = new int[104];
      this.f = new int[104];
      this.g = new int[104];
      this.h = new int[104];
   }

   private static int b(int var0, int var1) {
      return ((var0 ^= (var0 += var1 * 57) << 13) * (var0 * var0 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE) >> 19 & 255;
   }

   public final void a(CollisionMap[] var1, SceneGraph var2) {
      try {
         int var3;
         int var4;
         int var5;
         int var6;
         for(var3 = 0; var3 < 4; ++var3) {
            for(var4 = 0; var4 < 104; ++var4) {
               for(var5 = 0; var5 < 104; ++var5) {
                  if((this.v[var3][var4][var5] & 1) == 1) {
                     var6 = var3;
                     if((this.v[1][var4][var5] & 2) == 2) {
                        var6 = var3 - 1;
                     }

                     if(var6 >= 0) {
                        var1[var6].a(var5, var4);
                     }
                  }
               }
            }
         }

         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var16;
         int var27;
         for(var3 = 0; var3 < 4; ++var3) {
            byte[][] var29 = this.k[var3];
            var7 = (int)Math.sqrt(5100.0D);
            var8 = var7 * 768 >> 8;

            for(var9 = 1; var9 < 103; ++var9) {
               for(var10 = 1; var10 < 103; ++var10) {
                  var11 = this.i[var3][var10 + 1][var9] - this.i[var3][var10 - 1][var9];
                  var7 = this.i[var3][var10][var9 + 1] - this.i[var3][var10][var9 - 1];
                  var12 = (int)Math.sqrt((double)(var11 * var11 + 65536 + var7 * var7));
                  var13 = (var11 << 8) / var12;
                  var14 = 65536 / var12;
                  var15 = (var7 << 8) / var12;
                  var27 = 96 + (var13 * -50 + var14 * -10 + var15 * -50) / var8;
                  var5 = (var29[var10 - 1][var9] >> 2) + (var29[var10 + 1][var9] >> 3) + (var29[var10][var9 - 1] >> 2) + (var29[var10][var9 + 1] >> 3) + (var29[var10][var9] >> 1);
                  this.o[var10][var9] = var27 - var5;
               }
            }

            for(var9 = 0; var9 < 104; ++var9) {
               this.d[var9] = 0;
               this.e[var9] = 0;
               this.f[var9] = 0;
               this.g[var9] = 0;
               this.h[var9] = 0;
            }

            for(var9 = -5; var9 < 109; ++var9) {
               for(var10 = 0; var10 < 104; ++var10) {
                  if((var11 = var9 + 5) >= 0 && var11 < 104 && (var7 = this.q[var3][var11][var10] & 255) > 0) {
                     Floor var31 = Floor.a[var7 - 1];
                     this.d[var10] += var31.h;
                     this.e[var10] += var31.f;
                     this.f[var10] += var31.g;
                     this.g[var10] += var31.i;
                     ++this.h[var10];
                  }

                  if((var7 = var9 - 5) >= 0 && var7 < 104 && (var12 = this.q[var3][var7][var10] & 255) > 0) {
                     Floor var32 = Floor.a[var12 - 1];
                     this.d[var10] -= var32.h;
                     this.e[var10] -= var32.f;
                     this.f[var10] -= var32.g;
                     this.g[var10] -= var32.i;
                     --this.h[var10];
                  }
               }

               if(var9 > 0 && var9 < 103) {
                  var10 = 0;
                  var11 = 0;
                  var7 = 0;
                  var12 = 0;
                  var13 = 0;

                  for(var14 = -5; var14 < 109; ++var14) {
                     if((var15 = var14 + 5) >= 0 && var15 < 104) {
                        var10 += this.d[var15];
                        var11 += this.e[var15];
                        var7 += this.f[var15];
                        var12 += this.g[var15];
                        var13 += this.h[var15];
                     }

                     if((var27 = var14 - 5) >= 0 && var27 < 104) {
                        var10 -= this.d[var27];
                        var11 -= this.e[var27];
                        var7 -= this.f[var27];
                        var12 -= this.g[var27];
                        var13 -= this.h[var27];
                     }

                     if(var14 > 0 && var14 < 103 && (!c || (this.v[0][var9][var14] & 2) != 0 || (this.v[var3][var9][var14] & 16) == 0 && this.c(var14, var3, var9) == a)) {
                        if(var3 < b) {
                           b = var3;
                        }

                        var5 = this.q[var3][var9][var14] & 255;
                        var27 = this.j[var3][var9][var14] & 255;
                        if(var5 > 0 || var27 > 0) {
                           var4 = this.i[var3][var9][var14];
                           var6 = this.i[var3][var9 + 1][var14];
                           var16 = this.i[var3][var9 + 1][var14 + 1];
                           var8 = this.i[var3][var9][var14 + 1];
                           var15 = this.o[var9][var14];
                           int var17 = this.o[var9 + 1][var14];
                           int var18 = this.o[var9 + 1][var14 + 1];
                           int var19 = this.o[var9][var14 + 1];
                           int var20 = -1;
                           int var21 = -1;
                           int var22;
                           if(var5 > 0) {
                              var22 = (var10 << 8) / var12;
                              var21 = var11 / var13;
                              int var23 = var7 / var13;
                              var20 = b(var22, var21, var23);
                              var21 = b(var22, var21, var23);
                           }

                           if(var3 > 0) {
                              boolean var33 = true;
                              if(var5 == 0 && this.m[var3][var9][var14] != 0) {
                                 var33 = false;
                              }

                              if(var27 > 0 && !Floor.a[var27 - 1].d) {
                                 var33 = false;
                              }

                              if(var33 && var4 == var6 && var4 == var16 && var4 == var8) {
                                 this.l[var3][var9][var14] |= 2340;
                              }
                           }

                           var22 = 0;
                           if(var20 != -1) {
                              var22 = Rasterizer3D.x[e(var21, 96)];
                           }

                           if(var27 == 0) {
                              var2.a(var3, var9, var14, 0, 0, -1, var4, var6, var16, var8, e(var20, var15), e(var20, var17), e(var20, var18), e(var20, var19), 0, 0, 0, 0, var22, 0);
                           } else {
                              var21 = this.m[var3][var9][var14] + 1;
                              byte var34 = this.u[var3][var9][var14];
                              Floor var30 = Floor.a[var27 - 1];
                              if(var27 - 1 != 54) {
                                 int var24 = var30.c;
                                 int var25;
                                 if(var30.c >= 0) {
                                    var5 = Rasterizer3D.a(var24);
                                    var25 = -1;
                                 } else if(var30.b == 16711935) {
                                    var5 = 0;
                                    var25 = -2;
                                    var24 = -1;
                                 } else if(var30.b == 3355443) {
                                    var5 = Rasterizer3D.x[c(var30.j, 96)];
                                    var25 = -2;
                                    var24 = -1;
                                 } else {
                                    var25 = b(var30.e, var30.f, var30.g);
                                    var5 = Rasterizer3D.x[c(var30.j, 96)];
                                 }

                                 if(var27 - 1 == 111) {
                                    var5 = Rasterizer3D.a(1);
                                    var25 = -1;
                                    var24 = 1;
                                 } else if(var25 == 6363) {
                                    var5 = 4733729;
                                    var25 = b(25, 146, 24);
                                 }

                                 var2.a(var3, var9, var14, var21, var34, var24, var4, var6, var16, var8, e(var20, var15), e(var20, var17), e(var20, var18), e(var20, var19), c(var25, var15), c(var25, var17), c(var25, var18), c(var25, var19), var22, var5);
                              }
                           }
                        }
                     }
                  }
               }
            }

            for(var9 = 1; var9 < 103; ++var9) {
               for(var10 = 1; var10 < 103; ++var10) {
                  var2.a(var3, var10, var9, this.c(var9, var3, var10));
               }
            }
         }

         var2.m(-10, -50, -50);

         for(var3 = 0; var3 < 104; ++var3) {
            for(var4 = 0; var4 < 104; ++var4) {
               if((this.v[1][var3][var4] & 2) == 2) {
                  var2.a(var4, var3);
               }
            }
         }

         var3 = 1;
         var4 = 2;
         var5 = 4;

         for(var6 = 0; var6 < 4; ++var6) {
            if(var6 > 0) {
               var3 <<= 3;
               var4 <<= 3;
               var5 <<= 3;
            }

            for(var27 = 0; var27 <= var6; ++var27) {
               for(int var28 = 0; var28 <= 104; ++var28) {
                  for(var16 = 0; var16 <= 104; ++var16) {
                     if((this.l[var27][var16][var28] & var3) != 0) {
                        var7 = var28;
                        var8 = var28;
                        var9 = var27;

                        for(var10 = var27; var7 > 0 && (this.l[var27][var16][var7 - 1] & var3) != 0; --var7) {
                           ;
                        }

                        while(var8 < 104 && (this.l[var27][var16][var8 + 1] & var3) != 0) {
                           ++var8;
                        }

                        label310:
                        while(var9 > 0) {
                           for(var11 = var7; var11 <= var8; ++var11) {
                              if((this.l[var9 - 1][var16][var11] & var3) == 0) {
                                 break label310;
                              }
                           }

                           --var9;
                        }

                        label299:
                        while(var10 < var6) {
                           for(var11 = var7; var11 <= var8; ++var11) {
                              if((this.l[var10 + 1][var16][var11] & var3) == 0) {
                                 break label299;
                              }
                           }

                           ++var10;
                        }

                        if((var10 + 1 - var9) * (var8 - var7 + 1) >= 8) {
                           var12 = this.i[var10][var16][var7] - 240;
                           var13 = this.i[var9][var16][var7];
                           SceneGraph.a(var6, var16 << 7, var13, var16 << 7, (var8 << 7) + 128, var12, var7 << 7, 1);

                           for(var14 = var9; var14 <= var10; ++var14) {
                              for(var15 = var7; var15 <= var8; ++var15) {
                                 this.l[var14][var16][var15] &= ~var3;
                              }
                           }
                        }
                     }

                     if((this.l[var27][var16][var28] & var4) != 0) {
                        var7 = var16;
                        var8 = var16;
                        var9 = var27;

                        for(var10 = var27; var7 > 0 && (this.l[var27][var7 - 1][var28] & var4) != 0; --var7) {
                           ;
                        }

                        while(var8 < 104 && (this.l[var27][var8 + 1][var28] & var4) != 0) {
                           ++var8;
                        }

                        label363:
                        while(var9 > 0) {
                           for(var11 = var7; var11 <= var8; ++var11) {
                              if((this.l[var9 - 1][var11][var28] & var4) == 0) {
                                 break label363;
                              }
                           }

                           --var9;
                        }

                        label352:
                        while(var10 < var6) {
                           for(var11 = var7; var11 <= var8; ++var11) {
                              if((this.l[var10 + 1][var11][var28] & var4) == 0) {
                                 break label352;
                              }
                           }

                           ++var10;
                        }

                        if((var10 + 1 - var9) * (var8 - var7 + 1) >= 8) {
                           var12 = this.i[var10][var7][var28] - 240;
                           var13 = this.i[var9][var7][var28];
                           SceneGraph.a(var6, var7 << 7, var13, (var8 << 7) + 128, var28 << 7, var12, var28 << 7, 2);

                           for(var14 = var9; var14 <= var10; ++var14) {
                              for(var15 = var7; var15 <= var8; ++var15) {
                                 this.l[var14][var15][var28] &= ~var4;
                              }
                           }
                        }
                     }

                     if((this.l[var27][var16][var28] & var5) != 0) {
                        var7 = var16;
                        var8 = var16;
                        var9 = var28;

                        for(var10 = var28; var9 > 0 && (this.l[var27][var16][var9 - 1] & var5) != 0; --var9) {
                           ;
                        }

                        while(var10 < 104 && (this.l[var27][var16][var10 + 1] & var5) != 0) {
                           ++var10;
                        }

                        label416:
                        while(var7 > 0) {
                           for(var11 = var9; var11 <= var10; ++var11) {
                              if((this.l[var27][var7 - 1][var11] & var5) == 0) {
                                 break label416;
                              }
                           }

                           --var7;
                        }

                        label405:
                        while(var8 < 104) {
                           for(var11 = var9; var11 <= var10; ++var11) {
                              if((this.l[var27][var8 + 1][var11] & var5) == 0) {
                                 break label405;
                              }
                           }

                           ++var8;
                        }

                        if((var8 - var7 + 1) * (var10 - var9 + 1) >= 4) {
                           var11 = this.i[var27][var7][var9];
                           SceneGraph.a(var6, var7 << 7, var11, (var8 << 7) + 128, (var10 << 7) + 128, var11, var9 << 7, 4);

                           for(var7 = var7; var7 <= var8; ++var7) {
                              for(var12 = var9; var12 <= var10; ++var12) {
                                 this.l[var27][var7][var12] &= ~var5;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

      } catch (Exception var26) {
         ;
      }
   }

   public static void a(Buffer var0, ResourceProvider var1) {
      int var2 = -1;

      int var3;
      while((var3 = var0.c()) != 0) {
         ItemDefinition var10000 = ItemDefinition.a(var2 += var3);
         ResourceProvider var4 = var1;
         ItemDefinition var6 = var10000;
         if(var10000.q != null) {
            for(int var5 = 0; var5 < var6.q.length; ++var5) {
               var4.b(var6.q[var5] & '\uffff', 0);
            }
         }

         while(var0.q() != 0) {
            var0.e();
         }
      }

   }

   public final void a(int var1, int var2, int var3, int var4) {
      for(int var5 = var1; var5 <= var1 + var2; ++var5) {
         for(int var6 = var4; var6 <= var4 + var3; ++var6) {
            if(var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
               this.k[0][var6][var5] = 127;
               if(var6 == var4 && var6 > 0) {
                  this.i[0][var6][var5] = this.i[0][var6 - 1][var5];
               }

               if(var6 == var4 + var3 && var6 < 103) {
                  this.i[0][var6][var5] = this.i[0][var6 + 1][var5];
               }

               if(var5 == var1 && var5 > 0) {
                  this.i[0][var6][var5] = this.i[0][var6][var5 - 1];
               }

               if(var5 == var1 + var2 && var5 < 103) {
                  this.i[0][var6][var5] = this.i[0][var6][var5 + 1];
               }
            }
         }
      }

   }

   private void a(int var1, SceneGraph var2, CollisionMap var3, int var4, int var5, int var6, int var7, int var8) {
      if(c && (this.v[0][var6][var1] & 2) == 0) {
         if((this.v[var5][var6][var1] & 16) != 0) {
            return;
         }

         if(this.c(var1, var5, var6) != a) {
            return;
         }
      }

      if(var5 < b) {
         b = var5;
      }

      int var9 = this.i[var5][var6][var1];
      int var10 = this.i[var5][var6 + 1][var1];
      int var11 = this.i[var5][var6 + 1][var1 + 1];
      int var12 = this.i[var5][var6][var1 + 1];
      int var13 = var9 + var10 + var11 + var12 >> 2;
      ItemDefinition var14 = ItemDefinition.a(var7);
      int var15 = var6 + (var1 << 7) + (var7 << 14) + 1073741824;
      if(!var14.v) {
         var15 += Integer.MIN_VALUE;
      }

      byte var16 = (byte)((var8 << 6) + var4);
      Object var17;
      if(var4 == 22) {
         if(!c || var14.v || var14.a) {
            if(var14.y == -1 && var14.j == null) {
               var17 = var14.a(22, var8, var9, var10, var11, var12, -1);
            } else {
               var17 = new RenderableObject(var7, var8, 22, var10, var11, var9, var12, var14.y, true);
            }

            var2.a(var5, var13, var1, (Renderable)var17, var16, var15, var6);
            if(var14.o && var14.v && var3 != null) {
               var3.a(var1, var6);
            }

         }
      } else {
         int var18;
         if(var4 != 10 && var4 != 11) {
            if(var4 >= 12) {
               if(var14.y == -1 && var14.j == null) {
                  var17 = var14.a(var4, var8, var9, var10, var11, var12, -1);
               } else {
                  var17 = new RenderableObject(var7, var8, var4, var10, var11, var9, var12, var14.y, true);
               }

               var2.a(var15, var16, var13, 1, (Renderable)var17, 1, var5, 0, var1, var6);
               if(var4 >= 12 && var4 <= 17 && var4 != 13 && var5 > 0) {
                  this.l[var5][var6][var1] |= 2340;
               }

               if(var14.o && var3 != null) {
                  var3.a(var14.h, var14.c, var14.k, var6, var1, var8);
               }

            } else if(var4 == 0) {
               if(var14.y == -1 && var14.j == null) {
                  var17 = var14.a(0, var8, var9, var10, var11, var12, -1);
               } else {
                  var17 = new RenderableObject(var7, var8, 0, var10, var11, var9, var12, var14.y, true);
               }

               var2.a(w[var8], (Renderable)var17, var15, var1, var16, var6, (Renderable)null, var13, 0, var5);
               if(var8 == 0) {
                  if(var14.w) {
                     this.k[var5][var6][var1] = 50;
                     this.k[var5][var6][var1 + 1] = 50;
                  }

                  if(var14.m) {
                     this.l[var5][var6][var1] |= 585;
                  }
               } else if(var8 == 1) {
                  if(var14.w) {
                     this.k[var5][var6][var1 + 1] = 50;
                     this.k[var5][var6 + 1][var1 + 1] = 50;
                  }

                  if(var14.m) {
                     this.l[var5][var6][var1 + 1] |= 1170;
                  }
               } else if(var8 == 2) {
                  if(var14.w) {
                     this.k[var5][var6 + 1][var1] = 50;
                     this.k[var5][var6 + 1][var1 + 1] = 50;
                  }

                  if(var14.m) {
                     this.l[var5][var6 + 1][var1] |= 585;
                  }
               } else if(var8 == 3) {
                  if(var14.w) {
                     this.k[var5][var6][var1] = 50;
                     this.k[var5][var6 + 1][var1] = 50;
                  }

                  if(var14.m) {
                     this.l[var5][var6][var1] |= 1170;
                  }
               }

               if(var14.o && var3 != null) {
                  var3.a(var1, var8, var6, var4, var14.h);
               }

               if(var14.s != 16) {
                  var2.b(var1, var14.s, var6, var5);
               }

            } else if(var4 == 1) {
               if(var14.y == -1 && var14.j == null) {
                  var17 = var14.a(1, var8, var9, var10, var11, var12, -1);
               } else {
                  var17 = new RenderableObject(var7, var8, 1, var10, var11, var9, var12, var14.y, true);
               }

               var2.a(p[var8], (Renderable)var17, var15, var1, var16, var6, (Renderable)null, var13, 0, var5);
               if(var14.w) {
                  if(var8 == 0) {
                     this.k[var5][var6][var1 + 1] = 50;
                  } else if(var8 == 1) {
                     this.k[var5][var6 + 1][var1 + 1] = 50;
                  } else if(var8 == 2) {
                     this.k[var5][var6 + 1][var1] = 50;
                  } else if(var8 == 3) {
                     this.k[var5][var6][var1] = 50;
                  }
               }

               if(var14.o && var3 != null) {
                  var3.a(var1, var8, var6, var4, var14.h);
               }

            } else {
               Object var20;
               int var21;
               if(var4 == 2) {
                  var21 = var8 + 1 & 3;
                  Object var22;
                  if(var14.y == -1 && var14.j == null) {
                     var22 = var14.a(2, var8 + 4, var9, var10, var11, var12, -1);
                     var20 = var14.a(2, var21, var9, var10, var11, var12, -1);
                  } else {
                     var22 = new RenderableObject(var7, var8 + 4, 2, var10, var11, var9, var12, var14.y, true);
                     var20 = new RenderableObject(var7, var21, 2, var10, var11, var9, var12, var14.y, true);
                  }

                  var2.a(w[var8], (Renderable)var22, var15, var1, var16, var6, (Renderable)var20, var13, w[var21], var5);
                  if(var14.m) {
                     if(var8 == 0) {
                        this.l[var5][var6][var1] |= 585;
                        this.l[var5][var6][var1 + 1] |= 1170;
                     } else if(var8 == 1) {
                        this.l[var5][var6][var1 + 1] |= 1170;
                        this.l[var5][var6 + 1][var1] |= 585;
                     } else if(var8 == 2) {
                        this.l[var5][var6 + 1][var1] |= 585;
                        this.l[var5][var6][var1] |= 1170;
                     } else if(var8 == 3) {
                        this.l[var5][var6][var1] |= 1170;
                        this.l[var5][var6][var1] |= 585;
                     }
                  }

                  if(var14.o && var3 != null) {
                     var3.a(var1, var8, var6, var4, var14.h);
                  }

                  if(var14.s != 16) {
                     var2.b(var1, var14.s, var6, var5);
                  }

               } else if(var4 == 3) {
                  if(var14.y == -1 && var14.j == null) {
                     var17 = var14.a(3, var8, var9, var10, var11, var12, -1);
                  } else {
                     var17 = new RenderableObject(var7, var8, 3, var10, var11, var9, var12, var14.y, true);
                  }

                  var2.a(p[var8], (Renderable)var17, var15, var1, var16, var6, (Renderable)null, var13, 0, var5);
                  if(var14.w) {
                     if(var8 == 0) {
                        this.k[var5][var6][var1 + 1] = 50;
                     } else if(var8 == 1) {
                        this.k[var5][var6 + 1][var1 + 1] = 50;
                     } else if(var8 == 2) {
                        this.k[var5][var6 + 1][var1] = 50;
                     } else if(var8 == 3) {
                        this.k[var5][var6][var1] = 50;
                     }
                  }

                  if(var14.o && var3 != null) {
                     var3.a(var1, var8, var6, var4, var14.h);
                  }

               } else if(var4 == 9) {
                  if(var14.y == -1 && var14.j == null) {
                     var17 = var14.a(var4, var8, var9, var10, var11, var12, -1);
                  } else {
                     var17 = new RenderableObject(var7, var8, var4, var10, var11, var9, var12, var14.y, true);
                  }

                  var2.a(var15, var16, var13, 1, (Renderable)var17, 1, var5, 0, var1, var6);
                  if(var14.o && var3 != null) {
                     var3.a(var14.h, var14.c, var14.k, var6, var1, var8);
                  }

               } else {
                  if(var14.l) {
                     if(var8 == 1) {
                        var21 = var12;
                        var12 = var11;
                        var11 = var10;
                        var10 = var9;
                        var9 = var21;
                     } else if(var8 == 2) {
                        var21 = var12;
                        var12 = var10;
                        var10 = var21;
                        var21 = var11;
                        var11 = var9;
                        var9 = var21;
                     } else if(var8 == 3) {
                        var21 = var12;
                        var12 = var9;
                        var9 = var10;
                        var10 = var11;
                        var11 = var21;
                     }
                  }

                  if(var4 == 4) {
                     if(var14.y == -1 && var14.j == null) {
                        var17 = var14.a(4, 0, var9, var10, var11, var12, -1);
                     } else {
                        var17 = new RenderableObject(var7, 0, 4, var10, var11, var9, var12, var14.y, true);
                     }

                     var2.a(var15, var1, var8 << 9, var5, 0, var13, (Renderable)var17, var6, var16, 0, w[var8]);
                  } else if(var4 == 5) {
                     var21 = 16;
                     if((var18 = var2.i(var5, var6, var1)) > 0) {
                        var21 = ItemDefinition.a(var18 >> 14 & 32767).s;
                     }

                     if(var14.y == -1 && var14.j == null) {
                        var20 = var14.a(4, 0, var9, var10, var11, var12, -1);
                     } else {
                        var20 = new RenderableObject(var7, 0, 4, var10, var11, var9, var12, var14.y, true);
                     }

                     var2.a(var15, var1, var8 << 9, var5, n[var8] * var21, var13, (Renderable)var20, var6, var16, r[var8] * var21, w[var8]);
                  } else if(var4 == 6) {
                     if(var14.y == -1 && var14.j == null) {
                        var17 = var14.a(4, 0, var9, var10, var11, var12, -1);
                     } else {
                        var17 = new RenderableObject(var7, 0, 4, var10, var11, var9, var12, var14.y, true);
                     }

                     var2.a(var15, var1, var8, var5, 0, var13, (Renderable)var17, var6, var16, 0, 256);
                  } else if(var4 == 7) {
                     if(var14.y == -1 && var14.j == null) {
                        var17 = var14.a(4, 0, var9, var10, var11, var12, -1);
                     } else {
                        var17 = new RenderableObject(var7, 0, 4, var10, var11, var9, var12, var14.y, true);
                     }

                     var2.a(var15, var1, var8, var5, 0, var13, (Renderable)var17, var6, var16, 0, 512);
                  } else {
                     if(var4 == 8) {
                        if(var14.y == -1 && var14.j == null) {
                           var17 = var14.a(4, 0, var9, var10, var11, var12, -1);
                        } else {
                           var17 = new RenderableObject(var7, 0, 4, var10, var11, var9, var12, var14.y, true);
                        }

                        var2.a(var15, var1, var8, var5, 0, var13, (Renderable)var17, var6, var16, 0, 768);
                     }

                  }
               }
            }
         } else {
            if(var14.y == -1 && var14.j == null) {
               var17 = var14.a(10, var8, var9, var10, var11, var12, -1);
            } else {
               var17 = new RenderableObject(var7, var8, 10, var10, var11, var9, var12, var14.y, true);
            }

            if(var17 != null) {
               var18 = 0;
               if(var4 == 11) {
                  var18 += 256;
               }

               if(var8 != 1 && var8 != 3) {
                  var7 = var14.c;
                  var4 = var14.k;
               } else {
                  var7 = var14.k;
                  var4 = var14.c;
               }

               if(var2.a(var15, var16, var13, var4, (Renderable)var17, var7, var5, var18, var1, var6) && var14.w) {
                  Model var19;
                  if(var17 instanceof Model) {
                     var19 = (Model)var17;
                  } else {
                     var19 = var14.a(10, var8, var9, var10, var11, var12, -1);
                  }

                  if(var19 != null) {
                     for(var9 = 0; var9 <= var7; ++var9) {
                        for(var10 = 0; var10 <= var4; ++var10) {
                           if((var11 = var19.p / 4) > 30) {
                              var11 = 30;
                           }

                           if(var11 > this.k[var5][var6 + var9][var1 + var10]) {
                              this.k[var5][var6 + var9][var1 + var10] = (byte)var11;
                           }
                        }
                     }
                  }
               }
            }

            if(var14.o && var3 != null) {
               var3.a(var14.h, var14.c, var14.k, var6, var1, var8);
            }

         }
      }
   }

   private static int a(int var0, int var1, int var2) {
      int var3 = var0 / var2;
      var0 &= var2 - 1;
      int var4 = var1 / var2;
      var1 &= var2 - 1;
      int var5 = d(var3, var4);
      int var6 = d(var3 + 1, var4);
      int var7 = d(var3, var4 + 1);
      var3 = d(var3 + 1, var4 + 1);
      var4 = b(var5, var6, var0, var2);
      var0 = b(var7, var3, var0, var2);
      return b(var4, var0, var1, var2);
   }

   private static int b(int var0, int var1, int var2) {
      if(var2 > 179) {
         var1 /= 2;
      }

      if(var2 > 192) {
         var1 /= 2;
      }

      if(var2 > 217) {
         var1 /= 2;
      }

      if(var2 > 243) {
         var1 /= 2;
      }

      return (var0 / 4 << 10) + (var1 / 32 << 7) + var2 / 2;
   }

   public static boolean a(int var0, int var1) {
      ItemDefinition var3 = ItemDefinition.a(var0);
      if(var1 == 11) {
         var1 = 10;
      }

      if(var1 >= 5 && var1 <= 8) {
         var1 = 4;
      }

      ItemDefinition var10000 = var3;
      var1 = var1;
      var3 = var3;
      if(var10000.t == null) {
         if(var3.q == null) {
            return true;
         } else if(var1 != 10) {
            return true;
         } else {
            boolean var4 = true;

            for(var1 = 0; var1 < var3.q.length; ++var1) {
               var4 &= Model.b(var3.q[var1] & '\uffff');
            }

            return var4;
         }
      } else {
         for(int var2 = 0; var2 < var3.t.length; ++var2) {
            if(var3.t[var2] == var1) {
               return Model.b(var3.q[var2] & '\uffff');
            }
         }

         return true;
      }
   }

   public final void a(int var1, int var2, CollisionMap[] var3, int var4, int var5, byte[] var6, int var7, int var8, int var9) {
      int var11;
      for(int var10 = 0; var10 < 8; ++var10) {
         for(var11 = 0; var11 < 8; ++var11) {
            if(var4 + var10 > 0 && var4 + var10 < 103 && var9 + var11 > 0 && var9 + var11 < 103) {
               var3[var8].a[var4 + var10][var9 + var11] &= -16777217;
            }
         }
      }

      Buffer var17 = new Buffer(var6);

      for(var11 = 0; var11 < 4; ++var11) {
         for(int var15 = 0; var15 < 64; ++var15) {
            for(int var16 = 0; var16 < 64; ++var16) {
               if(var11 == var1 && var15 >= var5 && var15 < var5 + 8 && var16 >= var7 && var16 < var7 + 8) {
                  int var10002 = var16 & 7;
                  int var12 = var15 & 7;
                  int var14 = var10002;
                  int var13;
                  int var10001 = var9 + ((var13 = var2 & 3) == 0?var14:(var13 == 1?7 - var12:(var13 == 2?7 - var14:var12)));
                  int var10006 = var16 & 7;
                  var12 = var15 & 7;
                  var13 = var10006;
                  this.a(var10001, 0, var17, var4 + ((var14 = var2 & 3) == 0?var12:(var14 == 1?var13:(var14 == 2?7 - var12:7 - var13))), var8, var2, 0);
               } else {
                  this.a(-1, 0, var17, -1, 0, 0, 0);
               }
            }
         }
      }

   }

   public final void a(byte[] var1, int var2, int var3, int var4, int var5, CollisionMap[] var6) {
      int var8;
      int var9;
      for(int var7 = 0; var7 < 4; ++var7) {
         for(var8 = 0; var8 < 64; ++var8) {
            for(var9 = 0; var9 < 64; ++var9) {
               if(var3 + var8 > 0 && var3 + var8 < 103 && var2 + var9 > 0 && var2 + var9 < 103) {
                  var6[var7].a[var3 + var8][var2 + var9] &= -16777217;
               }
            }
         }
      }

      Buffer var11 = new Buffer(var1);

      for(var8 = 0; var8 < 4; ++var8) {
         for(var9 = 0; var9 < 64; ++var9) {
            for(int var10 = 0; var10 < 64; ++var10) {
               this.a(var10 + var2, var5, var11, var9 + var3, var8, 0, var4);
            }
         }
      }

   }

   private void a(int var1, int var2, Buffer var3, int var4, int var5, int var6, int var7) {
      try {
         int var8;
         if(var4 >= 0 && var4 < 104 && var1 >= 0 && var1 < 104) {
            this.v[var5][var4][var1] = 0;

            while((var8 = var3.e()) != 0) {
               if(var8 == 1) {
                  if((var2 = var3.e()) == 1) {
                     var2 = 0;
                  }

                  if(var5 == 0) {
                     this.i[0][var4][var1] = -var2 << 3;
                     return;
                  }

                  this.i[var5][var4][var1] = this.i[var5 - 1][var4][var1] - (var2 << 3);
                  return;
               }

               if(var8 <= 49) {
                  this.j[var5][var4][var1] = var3.f();
                  this.m[var5][var4][var1] = (byte)((var8 - 2) / 4);
                  this.u[var5][var4][var1] = (byte)(var8 - 2 + var6 & 3);
               } else if(var8 <= 81) {
                  this.v[var5][var4][var1] = (byte)(var8 - 49);
               } else {
                  this.q[var5][var4][var1] = (byte)(var8 - 81);
               }
            }

            if(var5 == 0) {
               int[] var10000 = this.i[0][var4];
               int var10001 = var1;
               int var10002 = var4 + 932731 + var7;
               var2 += var1 + 556238;
               var1 = var10002;
               if((var1 = (int)((double)(a(var10002 + '\ub135', var2 + 91923, 4) - 128 + (a(var1 + 10294, var2 + '\u93bd', 2) - 128 >> 1) + (a(var1, var2, 1) - 128 >> 2)) * 0.3D) + 35) < 10) {
                  var1 = 10;
               } else if(var1 > 60) {
                  var1 = 60;
               }

               var10000[var10001] = -var1 << 3;
               return;
            }

            this.i[var5][var4][var1] = this.i[var5 - 1][var4][var1] - 240;
            return;
         }

         while((var8 = var3.e()) != 0) {
            if(var8 == 1) {
               var3.e();
               return;
            }

            if(var8 <= 49) {
               var3.e();
            }
         }
      } catch (Exception var9) {
         ;
      }

   }

   private int c(int var1, int var2, int var3) {
      return (this.v[var2][var3][var1] & 8) != 0?0:(var2 > 0 && (this.v[1][var3][var1] & 2) != 0?var2 - 1:var2);
   }

   public final void a(CollisionMap[] var1, SceneGraph var2, int var3, int var4, int var5, int var6, byte[] var7, int var8, int var9, int var10) {
      Buffer var25 = new Buffer(var7);
      int var11 = -1;

      int var12;
      while((var12 = var25.c()) != 0) {
         var11 += var12;
         var12 = 0;

         int var13;
         while((var13 = var25.q()) != 0) {
            var13 = (var12 += var13 - 1) & 63;
            int var14 = var12 >> 6 & 63;
            int var15 = var12 >> 12;
            int var16;
            int var17 = (var16 = var25.e()) >> 2;
            var16 &= 3;
            if(var15 == var3 && var14 >= var8 && var14 < var8 + 8 && var13 >= var5 && var13 < var5 + 8) {
               ItemDefinition var18 = ItemDefinition.a(var11);
               int var10003 = var14 & 7;
               int var10004 = var13 & 7;
               int var19 = var18.c;
               int var20 = var10004;
               int var21 = var10003;
               int var22 = var18.k;
               int var23;
               int var24 = var4 + ((var23 = var9 & 3) == 0?var21:(var23 == 1?var20:(var23 == 2?7 - var21 - (var19 - 1):7 - var20 - (var22 - 1))));
               int var10001 = var13 & 7;
               var19 = var14 & 7;
               var20 = var18.c;
               var22 = var18.k;
               var23 = var10001;
               var13 = var10 + ((var21 = var9 & 3) == 0?var23:(var21 == 1?7 - var19 - (var20 - 1):(var21 == 2?7 - var23 - (var22 - 1):var19)));
               if(var24 > 0 && var13 > 0 && var24 < 103 && var13 < 103) {
                  var14 = var15;
                  if((this.v[1][var24][var13] & 2) == 2) {
                     var14 = var15 - 1;
                  }

                  CollisionMap var26 = null;
                  if(var14 >= 0) {
                     var26 = var1[var14];
                  }

                  this.a(var13, var2, var26, var17, var6, var24, var11, var16 + var9 & 3);
               }
            }
         }
      }

   }

   private static int b(int var0, int var1, int var2, int var3) {
      var2 = 65536 - Rasterizer3D.s[(var2 << 10) / var3] >> 1;
      return (var0 * (65536 - var2) >> 16) + (var1 * var2 >> 16);
   }

   private static int c(int var0, int var1) {
      if(var0 == -2) {
         return 12345678;
      } else if(var0 == -1) {
         if(var1 < 0) {
            var1 = 0;
         } else if(var1 > 127) {
            var1 = 127;
         }

         return var1 = 127 - var1;
      } else {
         if((var1 = var1 * (var0 & 127) / 128) < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return (var0 & '\uff80') + var1;
      }
   }

   private static int d(int var0, int var1) {
      int var2 = b(var0 - 1, var1 - 1) + b(var0 + 1, var1 - 1) + b(var0 - 1, var1 + 1) + b(var0 + 1, var1 + 1);
      int var3 = b(var0 - 1, var1) + b(var0 + 1, var1) + b(var0, var1 - 1) + b(var0, var1 + 1);
      var0 = b(var0, var1);
      return var2 / 16 + var3 / 8 + var0 / 4;
   }

   private static int e(int var0, int var1) {
      if(var0 == -1) {
         return 12345678;
      } else {
         if((var1 = var1 * (var0 & 127) / 128) < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return (var0 & '\uff80') + var1;
      }
   }

   public static void a(SceneGraph var0, int var1, int var2, int var3, int var4, CollisionMap var5, int[][][] var6, int var7, int var8, int var9) {
      int var10 = var6[var4][var7][var2];
      int var11 = var6[var4][var7 + 1][var2];
      int var12 = var6[var4][var7 + 1][var2 + 1];
      var4 = var6[var4][var7][var2 + 1];
      int var18 = var10 + var11 + var12 + var4 >> 2;
      ItemDefinition var13 = ItemDefinition.a(var8);
      int var14 = var7 + (var2 << 7) + (var8 << 14) + 1073741824;
      if(!var13.v) {
         var14 += Integer.MIN_VALUE;
      }

      byte var15 = (byte)((var1 << 6) + var3);
      Object var16;
      if(var3 == 22) {
         if(var13.y == -1 && var13.j == null) {
            var16 = var13.a(22, var1, var10, var11, var12, var4, -1);
         } else {
            var16 = new RenderableObject(var8, var1, 22, var11, var12, var10, var4, var13.y, true);
         }

         var0.a(var9, var18, var2, (Renderable)var16, var15, var14, var7);
         if(var13.o && var13.v) {
            var5.a(var2, var7);
         }

      } else {
         int var17;
         if(var3 != 10 && var3 != 11) {
            if(var3 >= 12) {
               if(var13.y == -1 && var13.j == null) {
                  var16 = var13.a(var3, var1, var10, var11, var12, var4, -1);
               } else {
                  var16 = new RenderableObject(var8, var1, var3, var11, var12, var10, var4, var13.y, true);
               }

               var0.a(var14, var15, var18, 1, (Renderable)var16, 1, var9, 0, var2, var7);
               if(var13.o) {
                  var5.a(var13.h, var13.c, var13.k, var7, var2, var1);
               }

            } else if(var3 == 0) {
               if(var13.y == -1 && var13.j == null) {
                  var16 = var13.a(0, var1, var10, var11, var12, var4, -1);
               } else {
                  var16 = new RenderableObject(var8, var1, 0, var11, var12, var10, var4, var13.y, true);
               }

               var0.a(w[var1], (Renderable)var16, var14, var2, var15, var7, (Renderable)null, var18, 0, var9);
               if(var13.o) {
                  var5.a(var2, var1, var7, var3, var13.h);
               }

            } else if(var3 == 1) {
               if(var13.y == -1 && var13.j == null) {
                  var16 = var13.a(1, var1, var10, var11, var12, var4, -1);
               } else {
                  var16 = new RenderableObject(var8, var1, 1, var11, var12, var10, var4, var13.y, true);
               }

               var0.a(p[var1], (Renderable)var16, var14, var2, var15, var7, (Renderable)null, var18, 0, var9);
               if(var13.o) {
                  var5.a(var2, var1, var7, var3, var13.h);
               }

            } else {
               Object var19;
               int var20;
               if(var3 == 2) {
                  var20 = var1 + 1 & 3;
                  Object var21;
                  if(var13.y == -1 && var13.j == null) {
                     var21 = var13.a(2, var1 + 4, var10, var11, var12, var4, -1);
                     var19 = var13.a(2, var20, var10, var11, var12, var4, -1);
                  } else {
                     var21 = new RenderableObject(var8, var1 + 4, 2, var11, var12, var10, var4, var13.y, true);
                     var19 = new RenderableObject(var8, var20, 2, var11, var12, var10, var4, var13.y, true);
                  }

                  var0.a(w[var1], (Renderable)var21, var14, var2, var15, var7, (Renderable)var19, var18, w[var20], var9);
                  if(var13.o) {
                     var5.a(var2, var1, var7, var3, var13.h);
                  }

               } else if(var3 == 3) {
                  if(var13.y == -1 && var13.j == null) {
                     var16 = var13.a(3, var1, var10, var11, var12, var4, -1);
                  } else {
                     var16 = new RenderableObject(var8, var1, 3, var11, var12, var10, var4, var13.y, true);
                  }

                  var0.a(p[var1], (Renderable)var16, var14, var2, var15, var7, (Renderable)null, var18, 0, var9);
                  if(var13.o) {
                     var5.a(var2, var1, var7, var3, var13.h);
                  }

               } else if(var3 == 9) {
                  if(var13.y == -1 && var13.j == null) {
                     var16 = var13.a(var3, var1, var10, var11, var12, var4, -1);
                  } else {
                     var16 = new RenderableObject(var8, var1, var3, var11, var12, var10, var4, var13.y, true);
                  }

                  var0.a(var14, var15, var18, 1, (Renderable)var16, 1, var9, 0, var2, var7);
                  if(var13.o) {
                     var5.a(var13.h, var13.c, var13.k, var7, var2, var1);
                  }

               } else {
                  if(var13.l) {
                     if(var1 == 1) {
                        var20 = var4;
                        var4 = var12;
                        var12 = var11;
                        var11 = var10;
                        var10 = var20;
                     } else if(var1 == 2) {
                        var20 = var4;
                        var4 = var11;
                        var11 = var20;
                        var20 = var12;
                        var12 = var10;
                        var10 = var20;
                     } else if(var1 == 3) {
                        var20 = var4;
                        var4 = var10;
                        var10 = var11;
                        var11 = var12;
                        var12 = var20;
                     }
                  }

                  if(var3 == 4) {
                     if(var13.y == -1 && var13.j == null) {
                        var16 = var13.a(4, 0, var10, var11, var12, var4, -1);
                     } else {
                        var16 = new RenderableObject(var8, 0, 4, var11, var12, var10, var4, var13.y, true);
                     }

                     var0.a(var14, var2, var1 << 9, var9, 0, var18, (Renderable)var16, var7, var15, 0, w[var1]);
                  } else if(var3 == 5) {
                     var20 = 16;
                     if((var17 = var0.i(var9, var7, var2)) > 0) {
                        var20 = ItemDefinition.a(var17 >> 14 & 32767).s;
                     }

                     if(var13.y == -1 && var13.j == null) {
                        var19 = var13.a(4, 0, var10, var11, var12, var4, -1);
                     } else {
                        var19 = new RenderableObject(var8, 0, 4, var11, var12, var10, var4, var13.y, true);
                     }

                     var0.a(var14, var2, var1 << 9, var9, n[var1] * var20, var18, (Renderable)var19, var7, var15, r[var1] * var20, w[var1]);
                  } else if(var3 == 6) {
                     if(var13.y == -1 && var13.j == null) {
                        var16 = var13.a(4, 0, var10, var11, var12, var4, -1);
                     } else {
                        var16 = new RenderableObject(var8, 0, 4, var11, var12, var10, var4, var13.y, true);
                     }

                     var0.a(var14, var2, var1, var9, 0, var18, (Renderable)var16, var7, var15, 0, 256);
                  } else if(var3 == 7) {
                     if(var13.y == -1 && var13.j == null) {
                        var16 = var13.a(4, 0, var10, var11, var12, var4, -1);
                     } else {
                        var16 = new RenderableObject(var8, 0, 4, var11, var12, var10, var4, var13.y, true);
                     }

                     var0.a(var14, var2, var1, var9, 0, var18, (Renderable)var16, var7, var15, 0, 512);
                  } else {
                     if(var3 == 8) {
                        if(var13.y == -1 && var13.j == null) {
                           var16 = var13.a(4, 0, var10, var11, var12, var4, -1);
                        } else {
                           var16 = new RenderableObject(var8, 0, 4, var11, var12, var10, var4, var13.y, true);
                        }

                        var0.a(var14, var2, var1, var9, 0, var18, (Renderable)var16, var7, var15, 0, 768);
                     }

                  }
               }
            }
         } else {
            if(var13.y == -1 && var13.j == null) {
               var16 = var13.a(10, var1, var10, var11, var12, var4, -1);
            } else {
               var16 = new RenderableObject(var8, var1, 10, var11, var12, var10, var4, var13.y, true);
            }

            if(var16 != null) {
               var17 = 0;
               if(var3 == 11) {
                  var17 += 256;
               }

               if(var1 != 1 && var1 != 3) {
                  var4 = var13.c;
                  var3 = var13.k;
               } else {
                  var4 = var13.k;
                  var3 = var13.c;
               }

               var0.a(var14, var15, var18, var3, (Renderable)var16, var4, var9, var17, var2, var7);
            }

            if(var13.o) {
               var5.a(var13.h, var13.c, var13.k, var7, var2, var1);
            }

         }
      }
   }

   public static boolean a(int var0, byte[] var1, int var2) {
      boolean var3 = true;
      Buffer var10 = new Buffer(var1);
      int var4 = -1;

      int var5;
      label62:
      while((var5 = var10.q()) != 0) {
         var4 += var5;
         var5 = 0;
         boolean var6 = false;

         while(true) {
            while(!var6) {
               int var7;
               if((var7 = var10.q()) == 0) {
                  continue label62;
               }

               var7 = (var5 += var7 - 1) & 63;
               int var8 = var5 >> 6 & 63;
               int var9 = var10.e() >> 2;
               var8 += var0;
               var7 += var2;
               if(var8 > 0 && var7 > 0 && var8 < 103 && var7 < 103) {
                  ItemDefinition var12 = ItemDefinition.a(var4);
                  if(var9 != 22 || !c || var12.v || var12.a) {
                     ItemDefinition var11 = var12;
                     boolean var10001;
                     if(var12.q == null) {
                        var10001 = true;
                     } else {
                        var6 = true;

                        for(var7 = 0; var7 < var11.q.length; ++var7) {
                           var6 &= Model.b(var11.q[var7] & '\uffff');
                        }

                        var10001 = var6;
                     }

                     var3 &= var10001;
                     var6 = true;
                  }
               }
            }

            if(var10.q() == 0) {
               break;
            }

            var10.e();
         }
      }

      return var3;
   }

   public final void a(int var1, CollisionMap[] var2, int var3, SceneGraph var4, byte[] var5) {
      Buffer var15 = new Buffer(var5);
      int var6 = -1;

      int var7;
      while((var7 = var15.q()) != 0) {
         var6 += var7;
         var7 = 0;

         int var8;
         while((var8 = var15.q()) != 0) {
            var8 = (var7 += var8 - 1) & 63;
            int var9 = var7 >> 6 & 63;
            int var10 = var7 >> 12;
            int var11;
            int var12 = (var11 = var15.e()) >> 2;
            var11 &= 3;
            var9 += var1;
            var8 += var3;
            if(var9 > 0 && var8 > 0 && var9 < 103 && var8 < 103 && var10 >= 0 && var10 < 4) {
               int var13 = var10;
               if((this.v[1][var9][var8] & 2) == 2) {
                  var13 = var10 - 1;
               }

               CollisionMap var14 = null;
               if(var13 >= 0) {
                  var14 = var2[var13];
               }

               this.a(var8, var4, var14, var12, var10, var9, var6, var11);
            }
         }
      }

   }
}
