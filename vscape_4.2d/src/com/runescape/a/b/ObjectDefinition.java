package com.runescape.a.b;
import com.runescape.a.Archive;
import com.runescape.a.c.Sprite;
import com.runescape.b.Rasterizer2D;
import com.runescape.b.Rasterizer3D;
import com.runescape.c.a.Model;
import com.runescape.d.Buffer;
import com.runescape.e.Cache;

public final class ObjectDefinition {
   public byte a;
   public int b;
   public int[] c;
   public int d = -1;
   public static Cache e = new Cache(100);
   public static Cache f = new Cache(50);
   public int[] g;
   public boolean h;
   public int i;
   public int j;
   public int k;
   public int l;
   public int m;
   private int G;
   public String[] n;
   private int H;
   public String o;
   private static ObjectDefinition[] I;
   public int p;
   private int J;
   public int q;
   public boolean r;
   public byte[] s;
   private int K;
   private static int L;
   public int t;
   public static boolean u = true;
   private static Buffer M;
   private int N;
   public int v;
   public int w;
   public String[] x;
   public String[] y;
   public int z;
   private int O;
   private int P;
   private int[] Q;
   private int R;
   private static int[] S;
   private int T;
   public int A;
   public int B;
   public int C;
   private int[] U;
   public int D;
   public static int E;
   private int V;
   public byte F;

   public static void a() {
      f = null;
      e = null;
      S = null;
      I = null;
      M = null;
   }

   public static void a(Archive var0) {
      M = new Buffer(var0.a("obj.dat"));
      Buffer var3;
      S = new int[(E = (var3 = new Buffer(var0.a("obj.idx"))).g()) + 15000];
      int var1 = 2;

      int var2;
      for(var2 = 0; var2 < E; ++var2) {
         S[var2] = var1;
         var1 += var3.g();
      }

      I = new ObjectDefinition[10];

      for(var2 = 0; var2 < 10; ++var2) {
         I[var2] = new ObjectDefinition();
      }

   }

   public static ObjectDefinition a(int var0) {
      for(int var1 = 0; var1 < 10; ++var1) {
         if(I[var1].d == var0) {
            return I[var1];
         }
      }

      L = (L + 1) % 10;
      ObjectDefinition var7 = I[L];
      M.b = S[var0];
      var7.d = var0;
      var7.J = 0;
      var7.o = null;
      var7.s = null;
      var7.g = null;
      var7.c = null;
      var7.t = 2000;
      var7.z = 0;
      var7.B = 0;
      var7.V = 0;
      var7.H = 0;
      var7.R = 0;
      var7.r = false;
      var7.b = 1;
      var7.h = false;
      var7.n = null;
      var7.x = null;
      var7.y = null;
      var7.l = -1;
      var7.w = -1;
      var7.F = 0;
      var7.C = -1;
      var7.k = -1;
      var7.a = 0;
      var7.v = -1;
      var7.i = -1;
      var7.q = -1;
      var7.m = -1;
      var7.A = -1;
      var7.p = -1;
      var7.Q = null;
      var7.U = null;
      var7.K = -1;
      var7.j = -1;
      var7.G = 128;
      var7.P = 128;
      var7.O = 128;
      var7.T = 0;
      var7.N = 0;
      var7.D = 0;
      Buffer var2 = M;
      ObjectDefinition var6 = var7;

      while(true) {
         int var3;
         while((var3 = var2.e()) != 0) {
            if(var3 == 1) {
               var6.J = var2.g();
            } else if(var3 == 2) {
               var6.o = var2.l();
            } else if(var3 == 3) {
               var6.s = var2.m();
            } else if(var3 == 4) {
               var6.t = var2.g();
            } else if(var3 == 5) {
               var6.z = var2.g();
            } else if(var3 == 6) {
               var6.B = var2.g();
            } else if(var3 == 7) {
               var6.H = var2.g();
               if(var6.H > 32767) {
                  var6.H -= 65536;
               }
            } else if(var3 == 8) {
               var6.R = var2.g();
               if(var6.R > 32767) {
                  var6.R -= 65536;
               }
            } else if(var3 == 10) {
               var2.g();
            } else if(var3 == 11) {
               var6.r = true;
            } else if(var3 == 12) {
               var6.b = var2.j();
            } else if(var3 == 16) {
               var6.h = true;
            } else if(var3 == 23) {
               var6.l = var2.g();
               var6.F = var2.f();
            } else if(var3 == 24) {
               var6.w = var2.g();
            } else if(var3 == 25) {
               var6.C = var2.g();
               var6.a = var2.f();
            } else if(var3 == 26) {
               var6.k = var2.g();
            } else if(var3 >= 30 && var3 < 35) {
               if(var6.n == null) {
                  var6.n = new String[5];
               }

               var6.n[var3 - 30] = var2.l();
               if(var6.n[var3 - 30].equalsIgnoreCase("hidden")) {
                  var6.n[var3 - 30] = null;
               }
            } else if(var3 >= 35 && var3 < 40) {
               if(var6.x == null) {
                  var6.x = new String[5];
               }

               var6.x[var3 - 35] = var2.l();
            } else if(var3 == 40) {
               int var4 = var2.e();
               var6.g = new int[var4];
               var6.c = new int[var4];

               for(int var5 = 0; var5 < var4; ++var5) {
                  var6.g[var5] = var2.g();
                  var6.c[var5] = var2.g();
               }
            } else if(var3 >= 45 && var3 < 50) {
               if(var6.y == null) {
                  var6.y = new String[5];
               }

               var6.y[var3 - 45] = var2.l();
            } else if(var3 == 78) {
               var6.v = var2.g();
            } else if(var3 == 79) {
               var6.i = var2.g();
            } else if(var3 == 90) {
               var6.q = var2.g();
            } else if(var3 == 91) {
               var6.A = var2.g();
            } else if(var3 == 92) {
               var6.m = var2.g();
            } else if(var3 == 93) {
               var6.p = var2.g();
            } else if(var3 == 95) {
               var6.V = var2.g();
            } else if(var3 == 97) {
               var6.K = var2.g();
            } else if(var3 == 98) {
               var6.j = var2.g();
            } else if(var3 >= 100 && var3 < 110) {
               if(var6.Q == null) {
                  var6.Q = new int[10];
                  var6.U = new int[10];
               }

               var6.Q[var3 - 100] = var2.g();
               var6.U[var3 - 100] = var2.g();
            } else if(var3 == 110) {
               var6.G = var2.g();
            } else if(var3 == 111) {
               var6.P = var2.g();
            } else if(var3 == 112) {
               var6.O = var2.g();
            } else if(var3 == 113) {
               var6.T = var2.f();
            } else if(var3 == 114) {
               var6.N = var2.f() * 5;
            } else if(var3 == 115) {
               var6.D = var2.e();
            }
         }

         if(var7.j != -1) {
            ObjectDefinition var8 = a(var7.j);
            var7.J = var8.J;
            var7.t = var8.t;
            var7.z = var8.z;
            var7.B = var8.B;
            var7.V = var8.V;
            var7.H = var8.H;
            var7.R = var8.R;
            var7.g = var8.g;
            var7.c = var8.c;
            ObjectDefinition var9 = a(var7.K);
            var7.o = var9.o;
            var7.h = var9.h;
            var7.b = var9.b;
            String var10 = "a";
            char var11;
            if((var11 = var9.o.charAt(0)) == 65 || var11 == 69 || var11 == 73 || var11 == 79 || var11 == 85) {
               var10 = "an";
            }

            var7.s = ("Swap this note at any bank for " + var10 + " " + var9.o + ".").getBytes();
            var7.r = true;
         }

         if(!u && var7.h) {
            var7.o = "Members Object";
            var7.s = "Login to a members\' server to use this object.".getBytes();
            var7.n = null;
            var7.x = null;
            var7.D = 0;
         }

         return var7;
      }
   }

   public static Sprite a(int var0, int var1, int var2) {
      if(var2 == 0) {
         Sprite var3;
         if((var3 = (Sprite)e.a((long)var0)) != null && var3.e != var1 && var3.e != -1) {
            var3.C();
            var3 = null;
         }

         if(var3 != null) {
            return var3;
         }
      }

      ObjectDefinition var19;
      if((var19 = a(var0)).Q == null) {
         var1 = -1;
      }

      int var4;
      if(var1 > 1) {
         var4 = -1;

         for(int var5 = 0; var5 < 10; ++var5) {
            if(var1 >= var19.U[var5] && var19.U[var5] != 0) {
               var4 = var19.Q[var5];
            }
         }

         if(var4 != -1) {
            var19 = a(var4);
         }
      }

      Model var20;
      if((var20 = var19.b(1)) == null) {
         return null;
      } else {
         Sprite var21 = null;
         if(var19.j != -1 && (var21 = a(var19.K, 10, -1)) == null) {
            return null;
         } else {
            Sprite var6 = new Sprite(32, 32);
            int var7 = Rasterizer3D.e;
            int var8 = Rasterizer3D.f;
            int[] var9 = Rasterizer3D.t;
            int[] var10 = Rasterizer2D.h;
            int var11 = Rasterizer2D.i;
            int var12 = Rasterizer2D.j;
            int var13 = Rasterizer2D.m;
            int var14 = Rasterizer2D.n;
            int var15 = Rasterizer2D.k;
            int var16 = Rasterizer2D.l;
            Rasterizer3D.c = false;
            Rasterizer2D.a(32, 32, var6.a);
            Rasterizer2D.a(32, 0, 0, 0, 32);
            Rasterizer3D.b();
            int var17 = var19.t;
            if(var2 == -1) {
               var17 = (int)((double)var17 * 1.5D);
            }

            if(var2 > 0) {
               var17 = (int)((double)var17 * 1.04D);
            }

            int var18 = Rasterizer3D.r[var19.z] * var17 >> 16;
            var17 = Rasterizer3D.s[var19.z] * var17 >> 16;
            var20.a(var19.B, var19.V, var19.z, var19.H, var18 + var20.aE / 2 + var19.R, var17 + var19.R);

            for(var4 = 31; var4 >= 0; --var4) {
               for(var17 = 31; var17 >= 0; --var17) {
                  if(var6.a[var4 + (var17 << 5)] == 0) {
                     if(var4 > 0 && var6.a[var4 - 1 + (var17 << 5)] > 1) {
                        var6.a[var4 + (var17 << 5)] = 1;
                     } else if(var17 > 0 && var6.a[var4 + (var17 - 1 << 5)] > 1) {
                        var6.a[var4 + (var17 << 5)] = 1;
                     } else if(var4 < 31 && var6.a[var4 + 1 + (var17 << 5)] > 1) {
                        var6.a[var4 + (var17 << 5)] = 1;
                     } else if(var17 < 31 && var6.a[var4 + (var17 + 1 << 5)] > 1) {
                        var6.a[var4 + (var17 << 5)] = 1;
                     }
                  }
               }
            }

            if(var2 > 0) {
               for(var4 = 31; var4 >= 0; --var4) {
                  for(var17 = 31; var17 >= 0; --var17) {
                     if(var6.a[var4 + (var17 << 5)] == 0) {
                        if(var4 > 0 && var6.a[var4 - 1 + (var17 << 5)] == 1) {
                           var6.a[var4 + (var17 << 5)] = var2;
                        } else if(var17 > 0 && var6.a[var4 + (var17 - 1 << 5)] == 1) {
                           var6.a[var4 + (var17 << 5)] = var2;
                        } else if(var4 < 31 && var6.a[var4 + 1 + (var17 << 5)] == 1) {
                           var6.a[var4 + (var17 << 5)] = var2;
                        } else if(var17 < 31 && var6.a[var4 + (var17 + 1 << 5)] == 1) {
                           var6.a[var4 + (var17 << 5)] = var2;
                        }
                     }
                  }
               }
            } else if(var2 == 0) {
               for(var4 = 31; var4 >= 0; --var4) {
                  for(var17 = 31; var17 >= 0; --var17) {
                     if(var6.a[var4 + (var17 << 5)] == 0 && var4 > 0 && var17 > 0 && var6.a[var4 - 1 + (var17 - 1 << 5)] > 0) {
                        var6.a[var4 + (var17 << 5)] = 3153952;
                     }
                  }
               }
            }

            if(var19.j != -1) {
               var4 = var21.d;
               var17 = var21.e;
               var21.d = 32;
               var21.e = 32;
               var21.e(0, 0);
               var21.d = var4;
               var21.e = var17;
            }

            if(var2 == 0) {
               e.a(var6, (long)var0);
            }

            Rasterizer2D.a(var12, var11, var10);
            Rasterizer2D.b(var16, var13, var14, var15);
            Rasterizer3D.e = var7;
            Rasterizer3D.f = var8;
            Rasterizer3D.t = var9;
            Rasterizer3D.c = true;
            if(var19.r) {
               var6.d = 33;
            } else {
               var6.d = 32;
            }

            var6.e = var1;
            return var6;
         }
      }
   }

   public final Model b(int var1) {
	  ObjectDefinition this_ = this;
	   
      while(true) {
         int var3;
         if(this_.Q != null && var1 > 1) {
            int var2 = -1;

            for(var3 = 0; var3 < 10; ++var3) {
               if(var1 >= this_.U[var3] && this_.U[var3] != 0) {
                  var2 = this_.Q[var3];
               }
            }

            if(var2 != -1) {
               ObjectDefinition var10000 = a(var2);
               var1 = 1;
               this_ = var10000;
               continue;
            }
         }

         Model var4;
         if((var4 = (Model)f.a((long)this_.d)) != null) {
            return var4;
         }

         if((var4 = Model.a(this_.J)) == null) {
            return null;
         }

         if(this_.G != 128 || this_.P != 128 || this_.O != 128) {
            var4.b(this_.G, this_.O, this_.P);
         }

         if(this_.g != null) {
            for(var3 = 0; var3 < this_.g.length; ++var3) {
               var4.a(this_.g[var3], this_.c[var3]);
            }
         }

         var4.a(64 + this_.T, 768 + this_.N, -50, -10, -50, true);
         var4.w = true;
         f.a(var4, (long)this_.d);
         return var4;
      }
   }

   public final Model c(int var1) {
	  ObjectDefinition this_ = this;
	   
      while(true) {
         int var3;
         if(this_.Q != null && var1 > 1) {
            int var2 = -1;

            for(var3 = 0; var3 < 10; ++var3) {
               if(var1 >= this_.U[var3] && this_.U[var3] != 0) {
                  var2 = this_.Q[var3];
               }
            }

            if(var2 != -1) {
               ObjectDefinition var10000 = a(var2);
               var1 = 1;
               this_ = var10000;
               continue;
            }
         }

         Model var4;
         if((var4 = Model.a(this_.J)) == null) {
            return null;
         }

         if(this_.g != null) {
            for(var3 = 0; var3 < this_.g.length; ++var3) {
               var4.a(this_.g[var3], this_.c[var3]);
            }
         }

         return var4;
      }
   }
}
