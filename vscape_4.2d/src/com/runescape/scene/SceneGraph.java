package com.runescape.scene;
import com.runescape.Client;
import com.runescape.data.LinkedList;
import com.runescape.entity.GameObject;
import com.runescape.entity.Renderable;
import com.runescape.entity.model.Model;
import com.runescape.entity.model.VertexNormal;
import com.runescape.graphics.Rasterizer2D;
import com.runescape.graphics.Rasterizer3D;
import com.runescape.scene.world.GroundDecoration;
import com.runescape.scene.world.Wall;
import com.runescape.scene.world.WallDecoration;

public final class SceneGraph {
   private boolean d = true;
   public static boolean a = true;
   private final int e = 4;
   private final int f = 104;
   private final int g = 104;
   private final int[][][] h;
   private final SceneTile[][][] i = new SceneTile[4][104][104];
   private int j;
   private int k;
   private final GameObject[] l = new GameObject[5000];
   private final int[][][] m = new int[4][105][105];
   private static int n;
   private static int o;
   private static int p;
   private static int q;
   private static int r;
   private static int s;
   private static int t;
   private static int u;
   private static int v;
   private static int w;
   private static int x;
   private static int y;
   private static int z;
   private static int A;
   private static int B;
   private static int C;
   private static GameObject[] D = new GameObject[100];
   private static final int[] E = new int[]{53, -53, -53, 53};
   private static final int[] F = new int[]{-53, -53, 53, 53};
   private static final int[] G = new int[]{-45, 45, 45, -45};
   private static final int[] H = new int[]{45, 45, -45, -45};
   private static boolean I;
   private static int J;
   private static int K;
   public static int b = -1;
   public static int c = -1;
   private static final int L = 4;
   private static int[] M = new int[4];
   private static Class77[][] N = new Class77[4][500];
   private static int O;
   private static final Class77[] P = new Class77[500];
   private static LinkedList Q = new LinkedList();
   private static final int[] R = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
   private static final int[] S = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
   private static final int[] T = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
   private static final int[] U = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
   private static final int[] V = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
   private static final int[] W = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
   private static final int[] X = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
   private static final int[] Y = new int[]{41, '\u9950', 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, '\ua84e', 41, 41, 41, 41, 41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 41, 5056, 41, 41, 41, 7079, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 3131, 41, 41, 41};
   private final int[] Z = new int[10000];
   private final int[] aa = new int[10000];
   private int ab;
   private final int[][] ac = new int[][]{new int[16], {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
   private final int[][] ad = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
   private static boolean[][][][] ae = new boolean[8][32][51][51];
   private static boolean[][] af;
   private static int ag;
   private static int ah;
   private static int ai;
   private static int aj;
   private static int ak;
   private static int al;

   public SceneGraph(int[][][] var1) {
      this.h = var1;
      this.b();
   }

   public static void a() {
      D = null;
      M = null;
      N = null;
      Q = null;
      ae = null;
      af = null;
   }

   public final void b() {
      int var1;
      int var2;
      for(var1 = 0; var1 < 4; ++var1) {
         for(var2 = 0; var2 < 104; ++var2) {
            for(int var3 = 0; var3 < 104; ++var3) {
               this.i[var1][var2][var3] = null;
            }
         }
      }

      for(var1 = 0; var1 < 4; ++var1) {
         for(var2 = 0; var2 < M[var1]; ++var2) {
            N[var1][var2] = null;
         }

         M[var1] = 0;
      }

      for(var1 = 0; var1 < this.k; ++var1) {
         this.l[var1] = null;
      }

      this.k = 0;

      for(var1 = 0; var1 < D.length; ++var1) {
         D[var1] = null;
      }

   }

   public final void a(int var1) {
      this.j = var1;

      for(int var2 = 0; var2 < 104; ++var2) {
         for(int var3 = 0; var3 < 104; ++var3) {
            if(this.i[var1][var2][var3] == null) {
               this.i[var1][var2][var3] = new SceneTile(var1, var2, var3);
            }
         }
      }

   }

   public final void a(int var1, int var2) {
      SceneTile var3 = this.i[0][var2][var1];

      for(int var4 = 0; var4 < 3; ++var4) {
         SceneTile var5;
         if((var5 = this.i[var4][var2][var1] = this.i[var4 + 1][var2][var1]) != null) {
            --var5.a;

            for(int var6 = 0; var6 < var5.k; ++var6) {
               GameObject var7;
               if(((var7 = var5.l[var6]).m >> 29 & 3) == 2 && var7.g == var2 && var7.i == var1) {
                  --var7.a;
               }
            }
         }
      }

      if(this.i[0][var2][var1] == null) {
         this.i[0][var2][var1] = new SceneTile(0, var2, var1);
      }

      this.i[0][var2][var1].w = var3;
      this.i[3][var2][var1] = null;
   }

   public static void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      Class77 var8;
      (var8 = new Class77()).a = var1 / 128;
      var8.b = var3 / 128;
      var8.c = var6 / 128;
      var8.d = var4 / 128;
      var8.e = var7;
      var8.f = var1;
      var8.g = var3;
      var8.h = var6;
      var8.i = var4;
      var8.j = var5;
      var8.k = var2;
      N[var0][M[var0]++] = var8;
   }

   public final void a(int var1, int var2, int var3, int var4) {
      if(this.i[var1][var2][var3] != null) {
         this.i[var1][var2][var3].o = var4;
      }

   }

   public final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      SimpleTile var21;
      if(var4 == 0) {
         var21 = new SimpleTile(var11, var12, var13, var14, -1, var19, false);

         for(var5 = var1; var5 >= 0; --var5) {
            if(this.i[var5][var2][var3] == null) {
               this.i[var5][var2][var3] = new SceneTile(var5, var2, var3);
            }
         }

         this.i[var1][var2][var3].e = var21;
      } else if(var4 != 1) {
         ShapedTile var22 = new ShapedTile(var3, var15, var14, var9, var6, var17, var5, var11, var19, var13, var10, var8, var7, var4, var18, var16, var12, var2, var20);

         for(var5 = var1; var5 >= 0; --var5) {
            if(this.i[var5][var2][var3] == null) {
               this.i[var5][var2][var3] = new SceneTile(var5, var2, var3);
            }
         }

         this.i[var1][var2][var3].f = var22;
      } else {
         var21 = new SimpleTile(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

         for(var5 = var1; var5 >= 0; --var5) {
            if(this.i[var5][var2][var3] == null) {
               this.i[var5][var2][var3] = new SceneTile(var5, var2, var3);
            }
         }

         this.i[var1][var2][var3].e = var21;
      }
   }

   public final void a(int var1, int var2, int var3, Renderable var4, byte var5, int var6, int var7) {
      if(var4 != null) {
         GroundDecoration var8;
         (var8 = new GroundDecoration()).d = var4;
         var8.b = (var7 << 7) + 64;
         var8.c = (var3 << 7) + 64;
         var8.a = var2;
         var8.e = var6;
         var8.f = var5;
         if(this.i[var1][var7][var3] == null) {
            this.i[var1][var7][var3] = new SceneTile(var1, var7, var3);
         }

         this.i[var1][var7][var3].i = var8;
      }
   }

   public final void a(int var1, int var2, Renderable var3, int var4, Renderable var5, Renderable var6, int var7, int var8) {
      GroundItem var9;
      (var9 = new GroundItem()).d = var6;
      var9.b = (var1 << 7) + 64;
      var9.c = (var8 << 7) + 64;
      var9.a = var4;
      var9.g = var2;
      var9.e = var3;
      var9.f = var5;
      var2 = 0;
      SceneTile var10;
      if((var10 = this.i[var7][var1][var8]) != null) {
         for(var4 = 0; var4 < var10.k; ++var4) {
            int var11;
            if(var10.l[var4].e instanceof Model && (var11 = ((Model)var10.l[var4].e).t) > var2) {
               var2 = var11;
            }
         }
      }

      var9.h = var2;
      if(this.i[var7][var1][var8] == null) {
         this.i[var7][var1][var8] = new SceneTile(var7, var1, var8);
      }

      this.i[var7][var1][var8].j = var9;
   }

   public final void a(int var1, Renderable var2, int var3, int var4, byte var5, int var6, Renderable var7, int var8, int var9, int var10) {
      if(var2 != null || var7 != null) {
         Wall var11;
         (var11 = new Wall()).h = var3;
         var11.i = var5;
         var11.b = (var6 << 7) + 64;
         var11.c = (var4 << 7) + 64;
         var11.a = var8;
         var11.f = var2;
         var11.g = var7;
         var11.d = var1;
         var11.e = var9;

         for(var1 = var10; var1 >= 0; --var1) {
            if(this.i[var1][var6][var4] == null) {
               this.i[var1][var6][var4] = new SceneTile(var1, var6, var4);
            }
         }

         this.i[var10][var6][var4].g = var11;
      }
   }

   public final void a(int var1, int var2, int var3, int var4, int var5, int var6, Renderable var7, int var8, byte var9, int var10, int var11) {
      if(var7 != null) {
         WallDecoration var12;
         (var12 = new WallDecoration()).g = var1;
         var12.h = var9;
         var12.b = (var8 << 7) + 64 + var5;
         var12.c = (var2 << 7) + 64 + var10;
         var12.a = var6;
         var12.f = var7;
         var12.d = var11;
         var12.e = var3;

         for(var1 = var4; var1 >= 0; --var1) {
            if(this.i[var1][var8][var2] == null) {
               this.i[var1][var8][var2] = new SceneTile(var1, var8, var2);
            }
         }

         this.i[var4][var8][var2].h = var12;
      }
   }

   public final boolean a(int var1, byte var2, int var3, int var4, Renderable var5, int var6, int var7, int var8, int var9, int var10) {
      if(var5 == null) {
         return true;
      } else {
         int var11 = (var10 << 7) + var6 * 64;
         int var12 = (var9 << 7) + var4 * 64;
         return this.a(var7, var10, var9, var6, var4, var11, var12, var3, var5, var8, false, var1, var2);
      }
   }

   public final boolean a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, Renderable var8, boolean var9) {
      if(var8 == null) {
         return true;
      } else {
         int var10 = var7 - var6;
         int var11 = var5 - var6;
         int var12 = var7 + var6;
         var6 += var5;
         if(var9) {
            if(var2 > 640 && var2 < 1408) {
               var6 += 128;
            }

            if(var2 > 1152 && var2 < 1920) {
               var12 += 128;
            }

            if(var2 > 1664 || var2 < 384) {
               var11 -= 128;
            }

            if(var2 > 128 && var2 < 896) {
               var10 -= 128;
            }
         }

         var10 /= 128;
         var11 /= 128;
         var12 /= 128;
         var6 /= 128;
         return this.a(var1, var10, var11, var12 - var10 + 1, var6 - var11 + 1, var7, var5, var3, var8, var2, true, var4, (byte)0);
      }
   }

   public final boolean a(int var1, int var2, Renderable var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      return var3 == null || this.a(var1, var8, var11, var9 - var8 + 1, var5 - var11 + 1, var6, var2, var7, var3, var4, true, var10, (byte)0);
   }

   private boolean a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Renderable var9, int var10, boolean var11, int var12, byte var13) {
      int var15;
      for(int var14 = var2; var14 < var2 + var4; ++var14) {
         for(var15 = var3; var15 < var3 + var5; ++var15) {
            if(var14 < 0 || var15 < 0 || var14 >= 104 || var15 >= 104) {
               return false;
            }

            SceneTile var16;
            if((var16 = this.i[var1][var14][var15]) != null && var16.k >= 5) {
               return false;
            }
         }
      }

      GameObject var18;
      (var18 = new GameObject()).m = var12;
      var18.n = var13;
      var18.a = var1;
      var18.c = var6;
      var18.d = var7;
      var18.b = var8;
      var18.e = var9;
      var18.f = var10;
      var18.g = var2;
      var18.i = var3;
      var18.h = var2 + var4 - 1;
      var18.j = var3 + var5 - 1;

      for(var15 = var2; var15 < var2 + var4; ++var15) {
         for(int var19 = var3; var19 < var3 + var5; ++var19) {
            var6 = 0;
            if(var15 > var2) {
               ++var6;
            }

            if(var15 < var2 + var4 - 1) {
               var6 += 4;
            }

            if(var19 > var3) {
               var6 += 8;
            }

            if(var19 < var3 + var5 - 1) {
               var6 += 2;
            }

            for(var7 = var1; var7 >= 0; --var7) {
               if(this.i[var7][var15][var19] == null) {
                  this.i[var7][var15][var19] = new SceneTile(var7, var15, var19);
               }
            }

            SceneTile var17;
            (var17 = this.i[var1][var15][var19]).l[var17.k] = var18;
            var17.m[var17.k] = var6;
            var17.n |= var6;
            ++var17.k;
         }
      }

      if(var11) {
         this.l[this.k++] = var18;
      }

      return true;
   }

   public final void c() {
      for(int var1 = 0; var1 < this.k; ++var1) {
         GameObject var2 = this.l[var1];
         this.a(var2);
         this.l[var1] = null;
      }

      this.k = 0;
   }

   private void a(GameObject var1) {
      for(int var2 = var1.g; var2 <= var1.h; ++var2) {
         for(int var3 = var1.i; var3 <= var1.j; ++var3) {
            SceneTile var4;
            if((var4 = this.i[var1.a][var2][var3]) != null) {
               int var5;
               for(var5 = 0; var5 < var4.k; ++var5) {
                  if(var4.l[var5] == var1) {
                     --var4.k;

                     for(var5 = var5; var5 < var4.k; ++var5) {
                        var4.l[var5] = var4.l[var5 + 1];
                        var4.m[var5] = var4.m[var5 + 1];
                     }

                     var4.l[var4.k] = null;
                     break;
                  }
               }

               var4.n = 0;

               for(var5 = 0; var5 < var4.k; ++var5) {
                  var4.n |= var4.m[var5];
               }
            }
         }
      }

   }

   public final void b(int var1, int var2, int var3, int var4) {
      SceneTile var5;
      if((var5 = this.i[var4][var3][var1]) != null) {
         WallDecoration var6;
         if((var6 = var5.h) != null) {
            var3 = (var3 << 7) + 64;
            var1 = (var1 << 7) + 64;
            var6.b = var3 + (var6.b - var3) * var2 / 16;
            var6.c = var1 + (var6.c - var1) * var2 / 16;
         }

      }
   }

   public final void a(int var1, int var2, int var3, byte var4) {
      SceneTile var5;
      if((var5 = this.i[var2][var1][var3]) != null) {
         var5.g = null;
      }

   }

   public final void a(int var1, int var2, int var3) {
      SceneTile var4;
      if((var4 = this.i[var2][var3][var1]) != null) {
         var4.h = null;
      }

   }

   public final void b(int var1, int var2, int var3) {
      SceneTile var6;
      if((var6 = this.i[var1][var2][var3]) != null) {
         for(int var4 = 0; var4 < var6.k; ++var4) {
            GameObject var5;
            if(((var5 = var6.l[var4]).m >> 29 & 3) == 2 && var5.g == var2 && var5.i == var3) {
               this.a(var5);
               return;
            }
         }

      }
   }

   public final void c(int var1, int var2, int var3) {
      SceneTile var4;
      if((var4 = this.i[var1][var3][var2]) != null) {
         var4.i = null;
      }
   }

   public final void d(int var1, int var2, int var3) {
      SceneTile var4;
      if((var4 = this.i[var1][var2][var3]) != null) {
         var4.j = null;
      }

   }

   public final Wall e(int var1, int var2, int var3) {
      SceneTile var4;
      return (var4 = this.i[var1][var2][var3]) == null?null:var4.g;
   }

   public final WallDecoration f(int var1, int var2, int var3) {
      SceneTile var4;
      return (var4 = this.i[var3][var1][var2]) == null?null:var4.h;
   }

   public final GameObject g(int var1, int var2, int var3) {
      SceneTile var6;
      if((var6 = this.i[var3][var1][var2]) == null) {
         return null;
      } else {
         for(int var4 = 0; var4 < var6.k; ++var4) {
            GameObject var5;
            if(((var5 = var6.l[var4]).m >> 29 & 3) == 2 && var5.g == var1 && var5.i == var2) {
               return var5;
            }
         }

         return null;
      }
   }

   public final GroundDecoration h(int var1, int var2, int var3) {
      SceneTile var4;
      return (var4 = this.i[var3][var2][var1]) != null && var4.i != null?var4.i:null;
   }

   public final int i(int var1, int var2, int var3) {
      SceneTile var4;
      return (var4 = this.i[var1][var2][var3]) != null && var4.g != null?var4.g.h:0;
   }

   public final int j(int var1, int var2, int var3) {
      SceneTile var4;
      return (var4 = this.i[var1][var2][var3]) != null && var4.h != null?var4.h.g:0;
   }

   public final int k(int var1, int var2, int var3) {
      SceneTile var6;
      if((var6 = this.i[var1][var2][var3]) == null) {
         return 0;
      } else {
         for(int var4 = 0; var4 < var6.k; ++var4) {
            GameObject var5;
            if(((var5 = var6.l[var4]).m >> 29 & 3) == 2 && var5.g == var2 && var5.i == var3) {
               return var5.m;
            }
         }

         return 0;
      }
   }

   public final int l(int var1, int var2, int var3) {
      SceneTile var4;
      return (var4 = this.i[var1][var2][var3]) != null && var4.i != null?var4.i.e:0;
   }

   public final int c(int var1, int var2, int var3, int var4) {
      SceneTile var5;
      if((var5 = this.i[var1][var2][var3]) == null) {
         return -1;
      } else if(var5.g != null && var5.g.h == var4) {
         return var5.g.i & 255;
      } else if(var5.h != null && var5.h.g == var4) {
         return var5.h.h & 255;
      } else if(var5.i != null && var5.i.e == var4) {
         return var5.i.f & 255;
      } else {
         for(var2 = 0; var2 < var5.k; ++var2) {
            if(var5.l[var2].m == var4) {
               return var5.l[var2].n & 255;
            }
         }

         return -1;
      }
   }

   public final void m(int var1, int var2, int var3) {
      var1 = (int)Math.sqrt(5100.0D);
      var1 = var1 * 768 >> 8;

      for(var2 = 0; var2 < 4; ++var2) {
         for(var3 = 0; var3 < 104; ++var3) {
            for(int var4 = 0; var4 < 104; ++var4) {
               SceneTile var5;
               if((var5 = this.i[var2][var3][var4]) != null) {
                  Wall var6 = var5.g;
                  if(var5.g != null && var6.f != null && var6.f.aD != null) {
                     this.a(var2, 1, 1, var3, var4, (Model)var6.f);
                     if(var6.g != null && var6.g.aD != null) {
                        this.a(var2, 1, 1, var3, var4, (Model)var6.g);
                        this.a((Model)var6.f, (Model)var6.g, 0, 0, 0, false);
                        ((Model)var6.g).a(80, var1, -50, -10, -50);
                     }

                     ((Model)var6.f).a(80, var1, -50, -10, -50);
                  }

                  for(int var12 = 0; var12 < var5.k; ++var12) {
                     GameObject var7;
                     if((var7 = var5.l[var12]) != null && var7.e != null && var7.e.aD != null) {
                        this.a(var2, var7.h - var7.g + 1, var7.j - var7.i + 1, var3, var4, (Model)var7.e);
                        ((Model)var7.e).a(80, var1, -50, -10, -50);
                     }
                  }

                  GroundDecoration var13 = var5.i;
                  if(var5.i != null && var13.d.aD != null) {
                     Model var9 = (Model)var13.d;
                     SceneTile var11;
                     if(var3 < 104 && (var11 = this.i[var2][var3 + 1][var4]) != null && var11.i != null && var11.i.d.aD != null) {
                        this.a(var9, (Model)var11.i.d, 128, 0, 0, true);
                     }

                     if(var4 < 104 && (var11 = this.i[var2][var3][var4 + 1]) != null && var11.i != null && var11.i.d.aD != null) {
                        this.a(var9, (Model)var11.i.d, 0, 0, 128, true);
                     }

                     if(var3 < 104 && var4 < 104 && (var11 = this.i[var2][var3 + 1][var4 + 1]) != null && var11.i != null && var11.i.d.aD != null) {
                        this.a(var9, (Model)var11.i.d, 128, 0, 128, true);
                     }

                     if(var3 < 104 && var4 > 0 && (var11 = this.i[var2][var3 + 1][var4 - 1]) != null && var11.i != null && var11.i.d.aD != null) {
                        this.a(var9, (Model)var11.i.d, 128, 0, -128, true);
                     }

                     ((Model)var13.d).a(80, var1, -50, -10, -50);
                  }
               }
            }
         }
      }

   }

   private void a(int var1, int var2, int var3, int var4, int var5, Model var6) {
      boolean var7 = true;
      int var8 = var4;
      int var9 = var4 + var2;
      int var10 = var5 - 1;
      int var11 = var5 + var3;

      for(int var12 = var1; var12 <= var1 + 1; ++var12) {
         if(var12 != 4) {
            for(int var13 = var8; var13 <= var9; ++var13) {
               if(var13 >= 0 && var13 < 104) {
                  for(int var14 = var10; var14 <= var11; ++var14) {
                     SceneTile var15;
                     if(var14 >= 0 && var14 < 104 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var5 && var13 != var4) && (var15 = this.i[var12][var13][var14]) != null) {
                        int var16 = (this.h[var12][var13][var14] + this.h[var12][var13 + 1][var14] + this.h[var12][var13][var14 + 1] + this.h[var12][var13 + 1][var14 + 1]) / 4 - (this.h[var1][var4][var5] + this.h[var1][var4 + 1][var5] + this.h[var1][var4][var5 + 1] + this.h[var1][var4 + 1][var5 + 1]) / 4;
                        Wall var17 = var15.g;
                        if(var15.g != null && var17.f != null && var17.f.aD != null) {
                           this.a(var6, (Model)var17.f, (var13 - var4 << 7) + (1 - var2 << 6), var16, (var14 - var5 << 7) + (1 - var3 << 6), var7);
                        }

                        if(var17 != null && var17.g != null && var17.g.aD != null) {
                           this.a(var6, (Model)var17.g, (var13 - var4 << 7) + (1 - var2 << 6), var16, (var14 - var5 << 7) + (1 - var3 << 6), var7);
                        }

                        for(int var21 = 0; var21 < var15.k; ++var21) {
                           GameObject var18;
                           if((var18 = var15.l[var21]) != null && var18.e != null && var18.e.aD != null) {
                              int var19 = var18.h - var18.g + 1;
                              int var20 = var18.j - var18.i + 1;
                              this.a(var6, (Model)var18.e, (var18.g - var4 << 7) + (var19 - var2 << 6), var16, (var18.i - var5 << 7) + (var20 - var3 << 6), var7);
                           }
                        }
                     }
                  }
               }
            }

            --var8;
            var7 = false;
         }
      }

   }

   private void a(Model var1, Model var2, int var3, int var4, int var5, boolean var6) {
      ++this.ab;
      int var7 = 0;
      int[] var8 = var2.c;
      int var9 = var2.b;

      int var10;
      for(var10 = 0; var10 < var1.b; ++var10) {
         VertexNormal var11 = var1.aD[var10];
         VertexNormal var12;
         int var13;
         int var14;
         int var15;
         if((var12 = var1.x[var10]).d != 0 && (var13 = var1.d[var10] - var4) <= var2.q && (var14 = var1.c[var10] - var3) >= var2.l && var14 <= var2.m && (var15 = var1.e[var10] - var5) >= var2.o && var15 <= var2.n) {
            for(int var16 = 0; var16 < var9; ++var16) {
               VertexNormal var17 = var2.aD[var16];
               VertexNormal var18 = var2.x[var16];
               if(var14 == var8[var16] && var15 == var2.e[var16] && var13 == var2.d[var16] && var18.d != 0) {
                  var11.a += var18.a;
                  var11.b += var18.b;
                  var11.c += var18.c;
                  var11.d += var18.d;
                  var17.a += var12.a;
                  var17.b += var12.b;
                  var17.c += var12.c;
                  var17.d += var12.d;
                  ++var7;
                  this.Z[var10] = this.ab;
                  this.aa[var16] = this.ab;
               }
            }
         }
      }

      if(var7 >= 3 && var6) {
         for(var10 = 0; var10 < var1.f; ++var10) {
            if(this.Z[var1.g[var10]] == this.ab && this.Z[var1.h[var10]] == this.ab && this.Z[var1.i[var10]] == this.ab) {
               var1.j[var10] = -1;
            }
         }

         for(var10 = 0; var10 < var2.f; ++var10) {
            if(this.aa[var2.g[var10]] == this.ab && this.aa[var2.h[var10]] == this.ab && this.aa[var2.i[var10]] == this.ab) {
               var2.j[var10] = -1;
            }
         }

      }
   }

   public final void a(int[] var1, int var2, int var3, int var4, int var5) {
      SceneTile var9;
      if((var9 = this.i[var3][var4][var5]) != null) {
         SimpleTile var11 = var9.e;
         if(var9.e == null) {
            ShapedTile var10;
            if((var10 = var9.f) != null) {
               var4 = var10.l;
               var5 = var10.m;
               int var6 = var10.n;
               var3 = var10.o;
               int[] var12 = this.ac[var4];
               int[] var13 = this.ad[var5];
               int var7 = 0;
               int var8;
               if(var6 != 0) {
                  for(var8 = 0; var8 < 4; ++var8) {
                     var1[var2] = var12[var13[var7++]] != 0?var3:var6;
                     var1[var2 + 1] = var12[var13[var7++]] != 0?var3:var6;
                     var1[var2 + 2] = var12[var13[var7++]] != 0?var3:var6;
                     var1[var2 + 3] = var12[var13[var7++]] != 0?var3:var6;
                     var2 += 512;
                  }

               } else {
                  for(var8 = 0; var8 < 4; ++var8) {
                     if(var12[var13[var7++]] != 0) {
                        var1[var2] = var3;
                     }

                     if(var12[var13[var7++]] != 0) {
                        var1[var2 + 1] = var3;
                     }

                     if(var12[var13[var7++]] != 0) {
                        var1[var2 + 2] = var3;
                     }

                     if(var12[var13[var7++]] != 0) {
                        var1[var2 + 3] = var3;
                     }

                     var2 += 512;
                  }

               }
            }
         } else {
            var3 = var11.g;
            if(var11.g != 0) {
               for(var4 = 0; var4 < 4; ++var4) {
                  var1[var2] = var3;
                  var1[var2 + 1] = var3;
                  var1[var2 + 2] = var3;
                  var1[var2 + 3] = var3;
                  var2 += 512;
               }

            }
         }
      }
   }

   public static void a(int var0, int var1, int var2, int var3, int[] var4) {
      ai = 0;
      aj = 0;
      ak = var2;
      al = var3;
      ag = var2 / 2;
      ah = var3 / 2;
      boolean[][][][] var16 = new boolean[9][32][53][53];

      int var5;
      int var7;
      int var8;
      for(var1 = 128; var1 <= 384; var1 += 32) {
         for(var2 = 0; var2 < 2048; var2 += 64) {
            z = Model.D[var1];
            A = Model.E[var1];
            B = Model.D[var2];
            C = Model.E[var2];
            var3 = (var1 - 128) / 32;
            var5 = var2 / 64;

            for(int var6 = -26; var6 <= 26; ++var6) {
               for(var7 = -26; var7 <= 26; ++var7) {
                  var8 = var6 << 7;
                  int var9 = var7 << 7;
                  boolean var10 = false;

                  for(int var11 = -500; var11 <= 800; var11 += 128) {
                     int var14 = var4[var3] + var11;
                     int var15 = var9 * B + var8 * C >> 16;
                     int var13 = var9 * C - var8 * B >> 16;
                     int var12 = var14 * z + var13 * A >> 16;
                     var14 = var14 * A - var13 * z >> 16;
                     boolean var10000;
                     if(var12 >= 50 && var12 <= 3500) {
                        var13 = ag + (var15 << Client.d) / var12;
                        var14 = ah + (var14 << Client.d) / var12;
                        var10000 = var13 >= 0 && var13 <= ak && var14 >= 0 && var14 <= al;
                     } else {
                        var10000 = false;
                     }

                     if(var10000) {
                        var10 = true;
                        break;
                     }
                  }

                  var16[var3][var5][var6 + 25 + 1][var7 + 25 + 1] = var10;
               }
            }
         }
      }

      for(var1 = 0; var1 < 8; ++var1) {
         for(var2 = 0; var2 < 32; ++var2) {
            for(var3 = -25; var3 < 25; ++var3) {
               for(var5 = -25; var5 < 25; ++var5) {
                  boolean var17 = false;

                  label85:
                  for(var7 = -1; var7 <= 1; ++var7) {
                     for(var8 = -1; var8 <= 1; ++var8) {
                        if(var16[var1][var2][var3 + var7 + 25 + 1][var5 + var8 + 25 + 1]) {
                           var17 = true;
                           break label85;
                        }

                        if(var16[var1][(var2 + 1) % 31][var3 + var7 + 25 + 1][var5 + var8 + 25 + 1]) {
                           var17 = true;
                           break label85;
                        }

                        if(var16[var1 + 1][var2][var3 + var7 + 25 + 1][var5 + var8 + 25 + 1]) {
                           var17 = true;
                           break label85;
                        }

                        if(var16[var1 + 1][(var2 + 1) % 31][var3 + var7 + 25 + 1][var5 + var8 + 25 + 1]) {
                           var17 = true;
                           break label85;
                        }
                     }
                  }

                  ae[var1][var2][var3 + 25][var5 + 25] = var17;
               }
            }
         }
      }

   }

   public static void b(int var0, int var1) {
      I = true;
      J = var1;
      K = var0;
      b = -1;
      c = -1;
   }

   public final void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 < 0) {
         var1 = 0;
      } else if(var1 >= 13312) {
         var1 = 13311;
      }

      if(var2 < 0) {
         var2 = 0;
      } else if(var2 >= 13312) {
         var2 = 13311;
      }

      ++p;
      z = Model.D[var6];
      A = Model.E[var6];
      B = Model.D[var3];
      C = Model.E[var3];
      af = ae[(var6 - 128) / 32][var3 / 64];
      w = var1;
      x = var4;
      y = var2;
      u = var1 / 128;
      v = var2 / 128;
      o = var5;
      if((q = u - 25) < 0) {
         q = 0;
      }

      if((s = v - 25) < 0) {
         s = 0;
      }

      if((r = u + 25) > 104) {
         r = 104;
      }

      if((t = v + 25) > 104) {
         t = 104;
      }

      var1 = M[o];
      Class77[] var14 = N[o];
      O = 0;

      int var7;
      int var8;
      for(var3 = 0; var3 < var1; ++var3) {
         int var9;
         int var11;
         Class77 var16;
         boolean var18;
         if((var16 = var14[var3]).e == 1) {
            if((var7 = var16.a - u + 25) >= 0 && var7 <= 50) {
               if((var8 = var16.c - v + 25) < 0) {
                  var8 = 0;
               }

               if((var9 = var16.d - v + 25) > 50) {
                  var9 = 50;
               }

               var18 = false;

               while(var8 <= var9) {
                  if(af[var7][var8++]) {
                     var18 = true;
                     break;
                  }
               }

               if(var18) {
                  if((var11 = w - var16.f) > 32) {
                     var16.l = 1;
                  } else {
                     if(var11 >= -32) {
                        continue;
                     }

                     var16.l = 2;
                     var11 = -var11;
                  }

                  var16.o = (var16.h - y << 8) / var11;
                  var16.p = (var16.i - y << 8) / var11;
                  var16.q = (var16.j - x << 8) / var11;
                  var16.r = (var16.k - x << 8) / var11;
                  P[O++] = var16;
               }
            }
         } else if(var16.e == 2) {
            if((var7 = var16.c - v + 25) >= 0 && var7 <= 50) {
               if((var8 = var16.a - u + 25) < 0) {
                  var8 = 0;
               }

               if((var9 = var16.b - u + 25) > 50) {
                  var9 = 50;
               }

               var18 = false;

               while(var8 <= var9) {
                  if(af[var8++][var7]) {
                     var18 = true;
                     break;
                  }
               }

               if(var18) {
                  if((var11 = y - var16.h) > 32) {
                     var16.l = 3;
                  } else {
                     if(var11 >= -32) {
                        continue;
                     }

                     var16.l = 4;
                     var11 = -var11;
                  }

                  var16.m = (var16.f - w << 8) / var11;
                  var16.n = (var16.g - w << 8) / var11;
                  var16.q = (var16.j - x << 8) / var11;
                  var16.r = (var16.k - x << 8) / var11;
                  P[O++] = var16;
               }
            }
         } else if(var16.e == 4 && (var7 = var16.j - x) > 128) {
            if((var8 = var16.c - v + 25) < 0) {
               var8 = 0;
            }

            if((var9 = var16.d - v + 25) > 50) {
               var9 = 50;
            }

            if(var8 <= var9) {
               int var10;
               if((var10 = var16.a - u + 25) < 0) {
                  var10 = 0;
               }

               if((var11 = var16.b - u + 25) > 50) {
                  var11 = 50;
               }

               boolean var12 = false;

               label358:
               for(var10 = var10; var10 <= var11; ++var10) {
                  for(int var13 = var8; var13 <= var9; ++var13) {
                     if(af[var10][var13]) {
                        var12 = true;
                        break label358;
                     }
                  }
               }

               if(var12) {
                  var16.l = 5;
                  var16.m = (var16.f - w << 8) / var7;
                  var16.n = (var16.g - w << 8) / var7;
                  var16.o = (var16.h - y << 8) / var7;
                  var16.p = (var16.i - y << 8) / var7;
                  P[O++] = var16;
               }
            }
         }
      }

      n = 0;

      SceneTile[][] var15;
      for(var1 = this.j; var1 < 4; ++var1) {
         var15 = this.i[var1];

         for(var3 = q; var3 < r; ++var3) {
            for(var6 = s; var6 < t; ++var6) {
               SceneTile var17;
               if((var17 = var15[var3][var6]) != null) {
                  if(var17.o <= var5 && (af[var3 - u + 25][var6 - v + 25] || this.h[var1][var3][var6] - var4 >= 2000)) {
                     var17.p = true;
                     var17.q = true;
                     var17.r = var17.k > 0;
                     ++n;
                  } else {
                     var17.p = false;
                     var17.q = false;
                     var17.s = 0;
                  }
               }
            }
         }
      }

      SceneTile var19;
      for(var1 = this.j; var1 < 4; ++var1) {
         var15 = this.i[var1];

         for(var3 = -25; var3 <= 0; ++var3) {
            var6 = u + var3;
            var7 = u - var3;
            if(var6 >= q || var7 < r) {
               for(var4 = -25; var4 <= 0; ++var4) {
                  var5 = v + var4;
                  var8 = v - var4;
                  if(var6 >= q) {
                     if(var5 >= s && (var19 = var15[var6][var5]) != null && var19.p) {
                        this.a(var19, true);
                     }

                     if(var8 < t && (var19 = var15[var6][var8]) != null && var19.p) {
                        this.a(var19, true);
                     }
                  }

                  if(var7 < r) {
                     if(var5 >= s && (var19 = var15[var7][var5]) != null && var19.p) {
                        this.a(var19, true);
                     }

                     if(var8 < t && (var19 = var15[var7][var8]) != null && var19.p) {
                        this.a(var19, true);
                     }
                  }

                  if(n == 0) {
                     I = false;
                     return;
                  }
               }
            }
         }
      }

      for(var1 = this.j; var1 < 4; ++var1) {
         var15 = this.i[var1];

         for(var3 = -25; var3 <= 0; ++var3) {
            var6 = u + var3;
            var7 = u - var3;
            if(var6 >= q || var7 < r) {
               for(var4 = -25; var4 <= 0; ++var4) {
                  var5 = v + var4;
                  var8 = v - var4;
                  if(var6 >= q) {
                     if(var5 >= s && (var19 = var15[var6][var5]) != null && var19.p) {
                        this.a(var19, false);
                     }

                     if(var8 < t && (var19 = var15[var6][var8]) != null && var19.p) {
                        this.a(var19, false);
                     }
                  }

                  if(var7 < r) {
                     if(var5 >= s && (var19 = var15[var7][var5]) != null && var19.p) {
                        this.a(var19, false);
                     }

                     if(var8 < t && (var19 = var15[var7][var8]) != null && var19.p) {
                        this.a(var19, false);
                     }
                  }

                  if(n == 0) {
                     I = false;
                     return;
                  }
               }
            }
         }
      }

      I = false;
   }

   private void a(SceneTile var1, boolean var2) {
      Q.a(var1);

      while(true) {
         int var3;
         int var4;
         int var5;
         int var6;
         SceneTile[][] var7;
         SceneTile var8;
         int var10;
         int var13;
         int var14;
         int var15;
         int var16;
         int var17;
         int var23;
         int var25;
         do {
            do {
               do {
                  do {
                     do {
                        do {
                           while(true) {
                              Wall var9;
                              GameObject var11;
                              int var20;
                              boolean var21;
                              SceneTile var30;
                              while(true) {
                                 do {
                                    if((var1 = (SceneTile)Q.a()) == null) {
                                       return;
                                    }
                                 } while(!var1.q);

                                 var3 = var1.b;
                                 var4 = var1.c;
                                 var5 = var1.a;
                                 var6 = var1.d;
                                 var7 = this.i[var5];
                                 if(!var1.p) {
                                    break;
                                 }

                                 if(var2) {
                                    if(var5 > 0 && (var8 = this.i[var5 - 1][var3][var4]) != null && var8.q || var3 <= u && var3 > q && (var8 = var7[var3 - 1][var4]) != null && var8.q && (var8.p || (var1.n & 1) == 0) || var3 >= u && var3 < r - 1 && (var8 = var7[var3 + 1][var4]) != null && var8.q && (var8.p || (var1.n & 4) == 0) || var4 <= v && var4 > s && (var8 = var7[var3][var4 - 1]) != null && var8.q && (var8.p || (var1.n & 8) == 0) || var4 >= v && var4 < t - 1 && (var8 = var7[var3][var4 + 1]) != null && var8.q && (var8.p || (var1.n & 2) == 0)) {
                                       continue;
                                    }
                                 } else {
                                    var2 = true;
                                 }

                                 var1.p = false;
                                 if(var1.w != null) {
                                    var8 = var1.w;
                                    if(var1.w.e != null) {
                                       if(!this.n(0, var3, var4)) {
                                          this.a(var8.e, 0, z, A, B, C, var3, var4);
                                       }
                                    } else if(var8.f != null && !this.n(0, var3, var4)) {
                                       this.a(var3, z, B, var8.f, A, var4, C);
                                    }

                                    var9 = var8.g;
                                    if(var8.g != null) {
                                       var9.f.a(0, z, A, B, C, var9.b - w, var9.a - x, var9.c - y, var9.h);
                                    }

                                    for(var10 = 0; var10 < var8.k; ++var10) {
                                       if((var11 = var8.l[var10]) != null) {
                                          var11.e.a(var11.f, z, A, B, C, var11.c - w, var11.b - x, var11.d - y, var11.m);
                                       }
                                    }
                                 }

                                 var21 = false;
                                 if(var1.e != null) {
                                    if(!this.n(var6, var3, var4)) {
                                       var21 = true;
                                       this.a(var1.e, var6, z, A, B, C, var3, var4);
                                    }
                                 } else if(var1.f != null && !this.n(var6, var3, var4)) {
                                    var21 = true;
                                    this.a(var3, z, B, var1.f, A, var4, C);
                                 }

                                 var20 = 0;
                                 var10 = 0;
                                 Wall var22 = var1.g;
                                 WallDecoration var12 = var1.h;
                                 if(var22 != null || var12 != null) {
                                    if(u == var3) {
                                       ++var20;
                                    } else if(u < var3) {
                                       var20 += 2;
                                    }

                                    if(v == var4) {
                                       var20 += 3;
                                    } else if(v > var4) {
                                       var20 += 6;
                                    }

                                    var10 = R[var20];
                                    var1.v = T[var20];
                                 }

                                 if(var22 != null) {
                                    if((var22.d & S[var20]) != 0) {
                                       if(var22.d == 16) {
                                          var1.s = 3;
                                          var1.t = U[var20];
                                          var1.u = 3 - var1.t;
                                       } else if(var22.d == 32) {
                                          var1.s = 6;
                                          var1.t = V[var20];
                                          var1.u = 6 - var1.t;
                                       } else if(var22.d == 64) {
                                          var1.s = 12;
                                          var1.t = W[var20];
                                          var1.u = 12 - var1.t;
                                       } else {
                                          var1.s = 9;
                                          var1.t = X[var20];
                                          var1.u = 9 - var1.t;
                                       }
                                    } else {
                                       var1.s = 0;
                                    }

                                    if((var22.d & var10) != 0 && !this.d(var6, var3, var4, var22.d)) {
                                       var22.f.a(0, z, A, B, C, var22.b - w, var22.a - x, var22.c - y, var22.h);
                                    }

                                    if((var22.e & var10) != 0 && !this.d(var6, var3, var4, var22.e)) {
                                       var22.g.a(0, z, A, B, C, var22.b - w, var22.a - x, var22.c - y, var22.h);
                                    }
                                 }

                                 if(var12 != null && !this.e(var6, var3, var4, var12.f.aE)) {
                                    if((var12.d & var10) != 0) {
                                       var12.f.a(var12.e, z, A, B, C, var12.b - w, var12.a - x, var12.c - y, var12.g);
                                    } else if((var12.d & 768) != 0) {
                                       var13 = var12.b - w;
                                       var14 = var12.a - x;
                                       var15 = var12.c - y;
                                       var16 = var12.e;
                                       if(var12.e != 1 && var16 != 2) {
                                          var17 = var13;
                                       } else {
                                          var17 = -var13;
                                       }

                                       if(var16 != 2 && var16 != 3) {
                                          var20 = var15;
                                       } else {
                                          var20 = -var15;
                                       }

                                       if((var12.d & 256) != 0 && var20 < var17) {
                                          var10 = var13 + E[var16];
                                          var23 = var15 + F[var16];
                                          var12.f.a((var16 << 9) + 256, z, A, B, C, var10, var14, var23, var12.g);
                                       }

                                       if((var12.d & 512) != 0 && var20 > var17) {
                                          var10 = var13 + G[var16];
                                          var23 = var15 + H[var16];
                                          var12.f.a((var16 << 9) + 1280 & 2047, z, A, B, C, var10, var14, var23, var12.g);
                                       }
                                    }
                                 }

                                 if(var21) {
                                    GroundDecoration var27 = var1.i;
                                    if(var1.i != null) {
                                       var27.d.a(0, z, A, B, C, var27.b - w, var27.a - x, var27.c - y, var27.e);
                                    }

                                    GroundItem var28 = var1.j;
                                    if(var1.j != null && var28.h == 0) {
                                       if(var28.e != null) {
                                          var28.e.a(0, z, A, B, C, var28.b - w, var28.a - x, var28.c - y, var28.g);
                                       }

                                       if(var28.f != null) {
                                          var28.f.a(0, z, A, B, C, var28.b - w, var28.a - x, var28.c - y, var28.g);
                                       }

                                       if(var28.d != null) {
                                          var28.d.a(0, z, A, B, C, var28.b - w, var28.a - x, var28.c - y, var28.g);
                                       }
                                    }
                                 }

                                 var13 = var1.n;
                                 if(var1.n != 0) {
                                    if(var3 < u && (var13 & 4) != 0 && (var30 = var7[var3 + 1][var4]) != null && var30.q) {
                                       Q.a(var30);
                                    }

                                    if(var4 < v && (var13 & 2) != 0 && (var30 = var7[var3][var4 + 1]) != null && var30.q) {
                                       Q.a(var30);
                                    }

                                    if(var3 > u && (var13 & 1) != 0 && (var30 = var7[var3 - 1][var4]) != null && var30.q) {
                                       Q.a(var30);
                                    }

                                    if(var4 > v && (var13 & 8) != 0 && (var30 = var7[var3][var4 - 1]) != null && var30.q) {
                                       Q.a(var30);
                                    }
                                 }
                                 break;
                              }

                              if(var1.s != 0) {
                                 var21 = true;

                                 for(var20 = 0; var20 < var1.k; ++var20) {
                                    if(var1.l[var20].l != p && (var1.m[var20] & var1.s) == var1.t) {
                                       var21 = false;
                                       break;
                                    }
                                 }

                                 if(var21) {
                                    var9 = var1.g;
                                    if(!this.d(var6, var3, var4, var9.d)) {
                                       var9.f.a(0, z, A, B, C, var9.b - w, var9.a - x, var9.c - y, var9.h);
                                    }

                                    var1.s = 0;
                                 }
                              }

                              if(!var1.r) {
                                 break;
                              }

                              try {
                                 int var24 = var1.k;
                                 var1.r = false;
                                 var20 = 0;

                                 label603:
                                 for(var10 = 0; var10 < var24; ++var10) {
                                    if((var11 = var1.l[var10]).l != p) {
                                       for(var25 = var11.g; var25 <= var11.h; ++var25) {
                                          for(var13 = var11.i; var13 <= var11.j; ++var13) {
                                             if((var30 = var7[var25][var13]).p) {
                                                var1.r = true;
                                                continue label603;
                                             }

                                             if(var30.s != 0) {
                                                var15 = 0;
                                                if(var25 > var11.g) {
                                                   ++var15;
                                                }

                                                if(var25 < var11.h) {
                                                   var15 += 4;
                                                }

                                                if(var13 > var11.i) {
                                                   var15 += 8;
                                                }

                                                if(var13 < var11.j) {
                                                   var15 += 2;
                                                }

                                                if((var15 & var30.s) == var1.u) {
                                                   var1.r = true;
                                                   continue label603;
                                                }
                                             }
                                          }
                                       }

                                       D[var20++] = var11;
                                       var25 = u - var11.g;
                                       if((var13 = var11.h - u) > var25) {
                                          var25 = var13;
                                       }

                                       var14 = v - var11.i;
                                       if((var15 = var11.j - v) > var14) {
                                          var11.k = var25 + var15;
                                       } else {
                                          var11.k = var25 + var14;
                                       }
                                    }
                                 }

                                 while(var20 > 0) {
                                    var10 = -50;
                                    var23 = -1;

                                    for(var25 = 0; var25 < var20; ++var25) {
                                       GameObject var31;
                                       if((var31 = D[var25]).l != p) {
                                          if(var31.k > var10) {
                                             var10 = var31.k;
                                             var23 = var25;
                                          } else if(var31.k == var10) {
                                             var14 = var31.c - w;
                                             var15 = var31.d - y;
                                             var16 = D[var23].c - w;
                                             var17 = D[var23].d - y;
                                             if(var14 * var14 + var15 * var15 > var16 * var16 + var17 * var17) {
                                                var23 = var25;
                                             }
                                          }
                                       }
                                    }

                                    if(var23 == -1) {
                                       break;
                                    }

                                    boolean var10000;
                                    GameObject var32;
                                    label723: {
                                       (var32 = D[var23]).l = p;
                                       var16 = var32.e.aE;
                                       var15 = var32.j;
                                       var14 = var32.i;
                                       var13 = var32.h;
                                       var23 = var32.g;
                                       var10 = var6;
                                       SceneGraph var26 = this;
                                       int var18;
                                       if(var23 == var13 && var14 == var15) {
                                          if(this.n(var6, var23, var14)) {
                                             var17 = var23 << 7;
                                             var18 = var14 << 7;
                                             var10000 = o(var17 + 1, this.h[var6][var23][var14] - var16, var18 + 1) && o(var17 + 128 - 1, this.h[var6][var23 + 1][var14] - var16, var18 + 1) && o(var17 + 128 - 1, this.h[var6][var23 + 1][var14 + 1] - var16, var18 + 128 - 1) && o(var17 + 1, this.h[var6][var23][var14 + 1] - var16, var18 + 128 - 1);
                                             break label723;
                                          }
                                       } else {
                                          var17 = var23;

                                          label559:
                                          while(true) {
                                             if(var17 > var13) {
                                                var17 = (var23 << 7) + 1;
                                                var18 = (var14 << 7) + 2;
                                                var24 = var26.h[var10][var23][var14] - var16;
                                                if(o(var17, var24, var18) && o(var10 = (var13 << 7) - 1, var24, var18)) {
                                                   var23 = (var15 << 7) - 1;
                                                   if(o(var17, var24, var23) && o(var10, var24, var23)) {
                                                      var10000 = true;
                                                      break label723;
                                                   }
                                                }
                                                break;
                                             }

                                             for(var18 = var14; var18 <= var15; ++var18) {
                                                if(var26.m[var10][var17][var18] == -p) {
                                                   break label559;
                                                }
                                             }

                                             ++var17;
                                          }
                                       }

                                       var10000 = false;
                                    }

                                    if(!var10000) {
                                       var32.e.a(var32.f, z, A, B, C, var32.c - w, var32.b - x, var32.d - y, var32.m);
                                    }

                                    for(var13 = var32.g; var13 <= var32.h; ++var13) {
                                       for(var14 = var32.i; var14 <= var32.j; ++var14) {
                                          SceneTile var36;
                                          if((var36 = var7[var13][var14]).s != 0) {
                                             Q.a(var36);
                                          } else if((var13 != var3 || var14 != var4) && var36.q) {
                                             Q.a(var36);
                                          }
                                       }
                                    }
                                 }

                                 if(!var1.r) {
                                    break;
                                 }
                              } catch (Exception var19) {
                                 var1.r = false;
                                 break;
                              }
                           }
                        } while(!var1.q);
                     } while(var1.s != 0);
                  } while(var3 <= u && var3 > q && (var8 = var7[var3 - 1][var4]) != null && var8.q);
               } while(var3 >= u && var3 < r - 1 && (var8 = var7[var3 + 1][var4]) != null && var8.q);
            } while(var4 <= v && var4 > s && (var8 = var7[var3][var4 - 1]) != null && var8.q);
         } while(var4 >= v && var4 < t - 1 && (var8 = var7[var3][var4 + 1]) != null && var8.q);

         var1.q = false;
         --n;
         GroundItem var29 = var1.j;
         if(var1.j != null && var29.h != 0) {
            if(var29.e != null) {
               var29.e.a(0, z, A, B, C, var29.b - w, var29.a - x - var29.h, var29.c - y, var29.g);
            }

            if(var29.f != null) {
               var29.f.a(0, z, A, B, C, var29.b - w, var29.a - x - var29.h, var29.c - y, var29.g);
            }

            if(var29.d != null) {
               var29.d.a(0, z, A, B, C, var29.b - w, var29.a - x - var29.h, var29.c - y, var29.g);
            }
         }

         if(var1.v != 0) {
            WallDecoration var34 = var1.h;
            if(var1.h != null && !this.e(var6, var3, var4, var34.f.aE)) {
               if((var34.d & var1.v) != 0) {
                  var34.f.a(var34.e, z, A, B, C, var34.b - w, var34.a - x, var34.c - y, var34.g);
               } else if((var34.d & 768) != 0) {
                  var10 = var34.b - w;
                  var23 = var34.a - x;
                  var25 = var34.c - y;
                  var13 = var34.e;
                  if(var34.e != 1 && var13 != 2) {
                     var14 = var10;
                  } else {
                     var14 = -var10;
                  }

                  if(var13 != 2 && var13 != 3) {
                     var15 = var25;
                  } else {
                     var15 = -var25;
                  }

                  if((var34.d & 256) != 0 && var15 >= var14) {
                     var16 = var10 + E[var13];
                     var17 = var25 + F[var13];
                     var34.f.a((var13 << 9) + 256, z, A, B, C, var16, var23, var17, var34.g);
                  }

                  if((var34.d & 512) != 0 && var15 <= var14) {
                     var16 = var10 + G[var13];
                     var17 = var25 + H[var13];
                     var34.f.a((var13 << 9) + 1280 & 2047, z, A, B, C, var16, var23, var17, var34.g);
                  }
               }
            }

            Wall var33 = var1.g;
            if(var1.g != null) {
               if((var33.e & var1.v) != 0 && !this.d(var6, var3, var4, var33.e)) {
                  var33.g.a(0, z, A, B, C, var33.b - w, var33.a - x, var33.c - y, var33.h);
               }

               if((var33.d & var1.v) != 0 && !this.d(var6, var3, var4, var33.d)) {
                  var33.f.a(0, z, A, B, C, var33.b - w, var33.a - x, var33.c - y, var33.h);
               }
            }
         }

         SceneTile var35;
         if(var5 < 3 && (var35 = this.i[var5 + 1][var3][var4]) != null && var35.q) {
            Q.a(var35);
         }

         if(var3 < u && (var35 = var7[var3 + 1][var4]) != null && var35.q) {
            Q.a(var35);
         }

         if(var4 < v && (var35 = var7[var3][var4 + 1]) != null && var35.q) {
            Q.a(var35);
         }

         if(var3 > u && (var35 = var7[var3 - 1][var4]) != null && var35.q) {
            Q.a(var35);
         }

         if(var4 > v && (var35 = var7[var3][var4 - 1]) != null && var35.q) {
            Q.a(var35);
         }
      }
   }

   private void a(SimpleTile var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9;
      int var10 = var9 = (var7 << 7) - w;
      int var11;
      int var12 = var11 = (var8 << 7) - y;
      int var13;
      int var14 = var13 = var10 + 128;
      int var15;
      int var16 = var15 = var12 + 128;
      int var17 = this.h[var2][var7][var8] - x;
      int var18 = this.h[var2][var7 + 1][var8] - x;
      int var19 = this.h[var2][var7 + 1][var8 + 1] - x;
      var2 = this.h[var2][var7][var8 + 1] - x;
      int var20 = var12 * var5 + var10 * var6 >> 16;
      var12 = var12 * var6 - var10 * var5 >> 16;
      var10 = var20;
      var20 = var17 * var4 - var12 * var3 >> 16;
      var12 = var17 * var3 + var12 * var4 >> 16;
      var17 = var20;
      if(var12 >= 50) {
         var20 = var11 * var5 + var14 * var6 >> 16;
         var11 = var11 * var6 - var14 * var5 >> 16;
         var14 = var20;
         var20 = var18 * var4 - var11 * var3 >> 16;
         var11 = var18 * var3 + var11 * var4 >> 16;
         var18 = var20;
         if(var11 >= 50) {
            var20 = var16 * var5 + var13 * var6 >> 16;
            var16 = var16 * var6 - var13 * var5 >> 16;
            var13 = var20;
            var20 = var19 * var4 - var16 * var3 >> 16;
            var16 = var19 * var3 + var16 * var4 >> 16;
            var19 = var20;
            if(var16 >= 50) {
               var20 = var15 * var5 + var9 * var6 >> 16;
               var15 = var15 * var6 - var9 * var5 >> 16;
               var9 = var20;
               var20 = var2 * var4 - var15 * var3 >> 16;
               var15 = var2 * var3 + var15 * var4 >> 16;
               var2 = var20;
               if(var15 >= 50) {
                  var3 = Rasterizer3D.e + (var10 << Client.d) / var12;
                  var4 = Rasterizer3D.f + (var17 << Client.d) / var12;
                  var5 = Rasterizer3D.e + (var14 << Client.d) / var11;
                  var6 = Rasterizer3D.f + (var18 << Client.d) / var11;
                  var20 = Rasterizer3D.e + (var13 << Client.d) / var16;
                  int var21 = Rasterizer3D.f + (var19 << Client.d) / var16;
                  int var22 = Rasterizer3D.e + (var9 << Client.d) / var15;
                  int var23 = Rasterizer3D.f + (var2 << Client.d) / var15;
                  Rasterizer3D.d = 0;
                  if((var20 - var22) * (var6 - var23) - (var21 - var23) * (var5 - var22) > 0) {
                     Rasterizer3D.b = var20 < 0 || var22 < 0 || var5 < 0 || var20 > Rasterizer2D.o || var22 > Rasterizer2D.o || var5 > Rasterizer2D.o;
                     if(I && b(J, K, var21, var23, var6, var20, var22, var5)) {
                        b = var7;
                        c = var8;
                     }

                     if(var1.e == -1) {
                        if(var1.c != 12345678) {
                           Rasterizer3D.a(var21, var23, var6, var20, var22, var5, var1.c, var1.d, var1.b);
                        }
                     } else if(!a) {
                        if(var1.f) {
                           Rasterizer3D.a(var21, var23, var6, var20, var22, var5, var1.c, var1.d, var1.b, var10, var14, var9, var17, var18, var2, var12, var11, var15, var1.e);
                        } else {
                           Rasterizer3D.a(var21, var23, var6, var20, var22, var5, var1.c, var1.d, var1.b, var13, var9, var14, var19, var2, var18, var16, var15, var11, var1.e);
                        }
                     } else {
                        var13 = Y[var1.e];
                        Rasterizer3D.a(var21, var23, var6, var20, var22, var5, c(var13, var1.c), c(var13, var1.d), c(var13, var1.b));
                     }
                  }

                  if((var3 - var5) * (var23 - var6) - (var4 - var6) * (var22 - var5) > 0) {
                     Rasterizer3D.b = var3 < 0 || var5 < 0 || var22 < 0 || var3 > Rasterizer2D.o || var5 > Rasterizer2D.o || var22 > Rasterizer2D.o;
                     if(I && b(J, K, var4, var6, var23, var3, var5, var22)) {
                        b = var7;
                        c = var8;
                     }

                     if(var1.e == -1) {
                        if(var1.a != 12345678) {
                           Rasterizer3D.a(var4, var6, var23, var3, var5, var22, var1.a, var1.b, var1.d);
                           return;
                        }
                     } else {
                        if(!a) {
                           Rasterizer3D.a(var4, var6, var23, var3, var5, var22, var1.a, var1.b, var1.d, var10, var14, var9, var17, var18, var2, var12, var11, var15, var1.e);
                           return;
                        }

                        var13 = Y[var1.e];
                        Rasterizer3D.a(var4, var6, var23, var3, var5, var22, c(var13, var1.a), c(var13, var1.b), c(var13, var1.d));
                     }
                  }

               }
            }
         }
      }
   }

   private void a(int var1, int var2, int var3, ShapedTile var4, int var5, int var6, int var7) {
      int var8 = var4.a.length;

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var4.a[var9] - w;
         var11 = var4.b[var9] - x;
         var13 = (var12 = var4.c[var9] - y) * var3 + var10 * var7 >> 16;
         var12 = var12 * var7 - var10 * var3 >> 16;
         var10 = var13;
         var13 = var11 * var5 - var12 * var2 >> 16;
         var12 = var11 * var2 + var12 * var5 >> 16;
         if(var12 < 50) {
            return;
         }

         if(var4.j != null) {
            ShapedTile.r[var9] = var10;
            ShapedTile.s[var9] = var13;
            ShapedTile.t[var9] = var12;
         }

         ShapedTile.p[var9] = Rasterizer3D.e + (var10 << Client.d) / var12;
         ShapedTile.q[var9] = Rasterizer3D.f + (var13 << Client.d) / var12;
      }

      Rasterizer3D.d = 0;
      var8 = var4.g.length;

      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var4.g[var9];
         var11 = var4.h[var9];
         var12 = var4.i[var9];
         var13 = ShapedTile.p[var10];
         var2 = ShapedTile.p[var11];
         var3 = ShapedTile.p[var12];
         var5 = ShapedTile.q[var10];
         var7 = ShapedTile.q[var11];
         int var14 = ShapedTile.q[var12];
         if((var13 - var2) * (var14 - var7) - (var5 - var7) * (var3 - var2) > 0) {
            Rasterizer3D.b = var13 < 0 || var2 < 0 || var3 < 0 || var13 > Rasterizer2D.o || var2 > Rasterizer2D.o || var3 > Rasterizer2D.o;
            if(I && b(J, K, var5, var7, var14, var13, var2, var3)) {
               b = var1;
               c = var6;
            }

            if(var4.j != null && var4.j[var9] != -1) {
               if(!a) {
                  if(var4.k) {
                     Rasterizer3D.a(var5, var7, var14, var13, var2, var3, var4.d[var9], var4.e[var9], var4.f[var9], ShapedTile.r[0], ShapedTile.r[1], ShapedTile.r[3], ShapedTile.s[0], ShapedTile.s[1], ShapedTile.s[3], ShapedTile.t[0], ShapedTile.t[1], ShapedTile.t[3], var4.j[var9]);
                  } else {
                     Rasterizer3D.a(var5, var7, var14, var13, var2, var3, var4.d[var9], var4.e[var9], var4.f[var9], ShapedTile.r[var10], ShapedTile.r[var11], ShapedTile.r[var12], ShapedTile.s[var10], ShapedTile.s[var11], ShapedTile.s[var12], ShapedTile.t[var10], ShapedTile.t[var11], ShapedTile.t[var12], var4.j[var9]);
                  }
               } else {
                  var10 = Y[var4.j[var9]];
                  Rasterizer3D.a(var5, var7, var14, var13, var2, var3, c(var10, var4.d[var9]), c(var10, var4.e[var9]), c(var10, var4.f[var9]));
               }
            } else if(var4.d[var9] != 12345678) {
               Rasterizer3D.a(var5, var7, var14, var13, var2, var3, var4.d[var9], var4.e[var9], var4.f[var9]);
            }
         }
      }

   }

   private static int c(int var0, int var1) {
      if((var1 = (var1 = 127 - var1) * (var0 & 127) / 160) < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return (var0 & '\uff80') + var1;
   }

   private static boolean b(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var1 < var2 && var1 < var3 && var1 < var4) {
         return false;
      } else if(var1 > var2 && var1 > var3 && var1 > var4) {
         return false;
      } else if(var0 < var5 && var0 < var6 && var0 < var7) {
         return false;
      } else if(var0 > var5 && var0 > var6 && var0 > var7) {
         return false;
      } else {
         int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
         var2 = (var1 - var4) * (var5 - var7) - (var0 - var7) * (var2 - var4);
         var0 = (var1 - var3) * (var7 - var6) - (var0 - var6) * (var4 - var3);
         return var8 * var0 > 0 && var0 * var2 > 0;
      }
   }

   private boolean n(int var1, int var2, int var3) {
      int var4;
      if((var4 = this.m[var1][var2][var3]) == -p) {
         return false;
      } else if(var4 == p) {
         return true;
      } else {
         var4 = var2 << 7;
         int var5 = var3 << 7;
         if(o(var4 + 1, this.h[var1][var2][var3], var5 + 1) && o(var4 + 128 - 1, this.h[var1][var2 + 1][var3], var5 + 1) && o(var4 + 128 - 1, this.h[var1][var2 + 1][var3 + 1], var5 + 128 - 1) && o(var4 + 1, this.h[var1][var2][var3 + 1], var5 + 128 - 1)) {
            this.m[var1][var2][var3] = p;
            return true;
         } else {
            this.m[var1][var2][var3] = -p;
            return false;
         }
      }
   }

   private boolean d(int var1, int var2, int var3, int var4) {
      if(!this.n(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         var3 = (var2 = this.h[var1][var2][var3] - 1) - 120;
         int var7 = var2 - 230;
         int var8 = var2 - 238;
         if(var4 < 16) {
            if(var4 == 1) {
               if(var5 > w) {
                  if(!o(var5, var2, var6)) {
                     return false;
                  }

                  if(!o(var5, var2, var6 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!o(var5, var3, var6)) {
                     return false;
                  }

                  if(!o(var5, var3, var6 + 128)) {
                     return false;
                  }
               }

               if(o(var5, var7, var6) && o(var5, var7, var6 + 128)) {
                  return true;
               }

               return false;
            }

            if(var4 == 2) {
               if(var6 < y) {
                  if(!o(var5, var2, var6 + 128)) {
                     return false;
                  }

                  if(!o(var5 + 128, var2, var6 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!o(var5, var3, var6 + 128)) {
                     return false;
                  }

                  if(!o(var5 + 128, var3, var6 + 128)) {
                     return false;
                  }
               }

               if(o(var5, var7, var6 + 128) && o(var5 + 128, var7, var6 + 128)) {
                  return true;
               }

               return false;
            }

            if(var4 == 4) {
               if(var5 < w) {
                  if(!o(var5 + 128, var2, var6)) {
                     return false;
                  }

                  if(!o(var5 + 128, var2, var6 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!o(var5 + 128, var3, var6)) {
                     return false;
                  }

                  if(!o(var5 + 128, var3, var6 + 128)) {
                     return false;
                  }
               }

               if(o(var5 + 128, var7, var6) && o(var5 + 128, var7, var6 + 128)) {
                  return true;
               }

               return false;
            }

            if(var4 == 8) {
               if(var6 > y) {
                  if(!o(var5, var2, var6)) {
                     return false;
                  }

                  if(!o(var5 + 128, var2, var6)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!o(var5, var3, var6)) {
                     return false;
                  }

                  if(!o(var5 + 128, var3, var6)) {
                     return false;
                  }
               }

               if(o(var5, var7, var6) && o(var5 + 128, var7, var6)) {
                  return true;
               }

               return false;
            }
         }

         if(!o(var5 + 64, var8, var6 + 64)) {
            return false;
         } else if(var4 == 16) {
            return o(var5, var7, var6 + 128);
         } else if(var4 == 32) {
            return o(var5 + 128, var7, var6 + 128);
         } else if(var4 == 64) {
            return o(var5 + 128, var7, var6);
         } else if(var4 == 128) {
            return o(var5, var7, var6);
         } else {
            System.out.println("Warning unsupported wall type");
            return true;
         }
      }
   }

   private boolean e(int var1, int var2, int var3, int var4) {
      if(!this.n(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return o(var5 + 1, this.h[var1][var2][var3] - var4, var6 + 1) && o(var5 + 128 - 1, this.h[var1][var2 + 1][var3] - var4, var6 + 1) && o(var5 + 128 - 1, this.h[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && o(var5 + 1, this.h[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   private static boolean o(int var0, int var1, int var2) {
      for(int var3 = 0; var3 < O; ++var3) {
         Class77 var4;
         int var5;
         int var6;
         int var7;
         int var8;
         int var9;
         if((var4 = P[var3]).l == 1) {
            if((var5 = var4.f - var0) > 0) {
               var6 = var4.h + (var4.o * var5 >> 8);
               var7 = var4.i + (var4.p * var5 >> 8);
               var8 = var4.j + (var4.q * var5 >> 8);
               var9 = var4.k + (var4.r * var5 >> 8);
               if(var2 >= var6 && var2 <= var7 && var1 >= var8 && var1 <= var9) {
                  return true;
               }
            }
         } else if(var4.l == 2) {
            if((var5 = var0 - var4.f) > 0) {
               var6 = var4.h + (var4.o * var5 >> 8);
               var7 = var4.i + (var4.p * var5 >> 8);
               var8 = var4.j + (var4.q * var5 >> 8);
               var9 = var4.k + (var4.r * var5 >> 8);
               if(var2 >= var6 && var2 <= var7 && var1 >= var8 && var1 <= var9) {
                  return true;
               }
            }
         } else if(var4.l == 3) {
            if((var5 = var4.h - var2) > 0) {
               var6 = var4.f + (var4.m * var5 >> 8);
               var7 = var4.g + (var4.n * var5 >> 8);
               var8 = var4.j + (var4.q * var5 >> 8);
               var9 = var4.k + (var4.r * var5 >> 8);
               if(var0 >= var6 && var0 <= var7 && var1 >= var8 && var1 <= var9) {
                  return true;
               }
            }
         } else if(var4.l == 4) {
            if((var5 = var2 - var4.h) > 0) {
               var6 = var4.f + (var4.m * var5 >> 8);
               var7 = var4.g + (var4.n * var5 >> 8);
               var8 = var4.j + (var4.q * var5 >> 8);
               var9 = var4.k + (var4.r * var5 >> 8);
               if(var0 >= var6 && var0 <= var7 && var1 >= var8 && var1 <= var9) {
                  return true;
               }
            }
         } else if(var4.l == 5 && (var5 = var1 - var4.j) > 0) {
            var6 = var4.f + (var4.m * var5 >> 8);
            var7 = var4.g + (var4.n * var5 >> 8);
            var8 = var4.h + (var4.o * var5 >> 8);
            var9 = var4.i + (var4.p * var5 >> 8);
            if(var0 >= var6 && var0 <= var7 && var2 >= var8 && var2 <= var9) {
               return true;
            }
         }
      }

      return false;
   }
}
