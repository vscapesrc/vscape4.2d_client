package com.runescape.a.b;
import com.runescape.Client;
import com.runescape.a.Archive;
import com.runescape.a.a.Frame;
import com.runescape.c.a.Model;
import com.runescape.d.Buffer;
import com.runescape.e.Cache;

public final class ItemDefinition {
   private static int B;
   public boolean a;
   private byte C;
   private int D;
   public String b;
   private int E;
   private static final Model[] F = new Model[4];
   private byte G;
   public int c;
   private int H;
   public int d;
   private int[] I;
   private int J;
   public int e;
   private boolean K;
   public static boolean f;
   private static Buffer L;
   public int g = -1;
   private static int[] M;
   public boolean h;
   public int i;
   public int[] j;
   private int N;
   public int k;
   public boolean l;
   public boolean m;
   public static Client n;
   private boolean O;
   public boolean o;
   public int p;
   private boolean P;
   private static int Q;
   private int R;
   public int[] q;
   public int r;
   public int s;
   public int[] t;
   public byte[] u;
   public boolean v;
   public boolean w;
   public static Cache x = new Cache(30);
   public int y;
   private static ItemDefinition[] S;
   private int T;
   private int[] U;
   public static Cache z = new Cache(500);
   public String[] A;

   public static ItemDefinition a(int var0) {
      for(int var1 = 0; var1 < 20; ++var1) {
         if(S[var1].g == var0) {
            return S[var1];
         }
      }

      Q = (Q + 1) % 20;
      ItemDefinition var7 = S[Q];
      L.b = M[var0];
      var7.g = var0;
      var7.q = null;
      var7.t = null;
      var7.b = null;
      var7.u = null;
      var7.U = null;
      var7.I = null;
      var7.c = 1;
      var7.k = 1;
      var7.o = true;
      var7.h = true;
      var7.v = false;
      var7.l = false;
      var7.P = false;
      var7.m = false;
      var7.y = -1;
      var7.s = 16;
      var7.C = 0;
      var7.G = 0;
      var7.A = null;
      var7.d = -1;
      var7.i = -1;
      var7.K = false;
      var7.w = true;
      var7.J = 128;
      var7.R = 128;
      var7.E = 128;
      var7.p = 0;
      var7.D = 0;
      var7.H = 0;
      var7.T = 0;
      var7.a = false;
      var7.O = false;
      var7.N = -1;
      var7.r = -1;
      var7.e = -1;
      var7.j = null;
      Buffer var2 = L;
      ItemDefinition var6 = var7;
      int var3 = -1;

      while(true) {
         while(true) {
            int var4;
            int var5;
            label244:
            do {
               while((var4 = var2.e()) != 0) {
                  if(var4 == 1) {
                     continue label244;
                  }

                  if(var4 == 2) {
                     var6.b = var2.l();
                  } else if(var4 == 3) {
                     var6.u = var2.m();
                  } else if(var4 == 5) {
                     if((var4 = var2.e()) > 0) {
                        if(var6.q == null) {
                           var6.t = null;
                           var6.q = new int[var4];

                           for(var5 = 0; var5 < var4; ++var5) {
                              var6.q[var5] = var2.g();
                           }
                        } else {
                           var2.b += var4 << 1;
                        }
                     }
                  } else if(var4 == 14) {
                     var6.c = var2.e();
                  } else if(var4 == 15) {
                     var6.k = var2.e();
                  } else if(var4 == 17) {
                     var6.o = false;
                  } else if(var4 == 18) {
                     var6.h = false;
                  } else if(var4 == 19) {
                     if((var3 = var2.e()) == 1) {
                        var6.v = true;
                     }
                  } else if(var4 == 21) {
                     var6.l = true;
                  } else if(var4 == 22) {
                     var6.P = true;
                  } else if(var4 == 23) {
                     var6.m = true;
                  } else if(var4 == 24) {
                     var6.y = var2.g();
                     if(var6.y == '\uffff') {
                        var6.y = -1;
                     }
                  } else if(var4 == 28) {
                     var6.s = var2.e();
                  } else if(var4 == 29) {
                     var6.C = var2.f();
                  } else if(var4 == 39) {
                     var6.G = var2.f();
                  } else if(var4 >= 30 && var4 < 39) {
                     if(var6.A == null) {
                        var6.A = new String[5];
                     }

                     var6.A[var4 - 30] = var2.l();
                     if(var6.A[var4 - 30].equalsIgnoreCase("hidden")) {
                        var6.A[var4 - 30] = null;
                     }
                  } else if(var4 == 40) {
                     var4 = var2.e();
                     var6.U = new int[var4];
                     var6.I = new int[var4];

                     for(var5 = 0; var5 < var4; ++var5) {
                        var6.U[var5] = var2.g();
                        var6.I[var5] = var2.g();
                     }
                  } else if(var4 == 60) {
                     var6.d = var2.g();
                  } else if(var4 == 62) {
                     var6.K = true;
                  } else if(var4 == 64) {
                     var6.w = false;
                  } else if(var4 == 65) {
                     var6.J = var2.g();
                  } else if(var4 == 66) {
                     var6.R = var2.g();
                  } else if(var4 == 67) {
                     var6.E = var2.g();
                  } else if(var4 == 68) {
                     var6.i = var2.g();
                  } else if(var4 == 69) {
                     var6.p = var2.e();
                  } else if(var4 == 70) {
                     var6.D = var2.h();
                  } else if(var4 == 71) {
                     var6.H = var2.h();
                  } else if(var4 == 72) {
                     var6.T = var2.h();
                  } else if(var4 == 73) {
                     var6.a = true;
                  } else if(var4 == 74) {
                     var6.O = true;
                  } else if(var4 == 75) {
                     var6.N = var2.e();
                  } else if(var4 == 77) {
                     var6.r = var2.g();
                     if(var6.r == '\uffff') {
                        var6.r = -1;
                     }

                     var6.e = var2.g();
                     if(var6.e == '\uffff') {
                        var6.e = -1;
                     }

                     var4 = var2.e();
                     var6.j = new int[var4 + 1];

                     for(var5 = 0; var5 <= var4; ++var5) {
                        var6.j[var5] = var2.g();
                        if(var6.j[var5] == '\uffff') {
                           var6.j[var5] = -1;
                        }
                     }
                  }
               }

               if(var3 == -1) {
                  var6.v = var6.q != null && (var6.t == null || var6.t[0] == 10);
                  if(var6.A != null) {
                     var6.v = true;
                  }
               }

               if(var6.O) {
                  var6.o = false;
                  var6.h = false;
               }

               if(var6.N == -1) {
                  var6.N = var6.o?1:0;
               }

               return var7;
            } while((var4 = var2.e()) <= 0);

            if(var6.q == null) {
               var6.t = new int[var4];
               var6.q = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  var6.q[var5] = var2.g();
                  var6.t[var5] = var2.e();
               }
            } else {
               var2.b += var4 * 3;
            }
         }
      }
   }

   public static void a() {
      z = null;
      x = null;
      M = null;
      S = null;
      L = null;
   }

   public static void a(Archive var0) {
      L = new Buffer(var0.a("loc.dat"));
      Buffer var3;
      M = new int[B = (var3 = new Buffer(var0.a("loc.idx"))).g()];
      System.out.println("Objects Loaded: " + B);
      int var1 = 2;

      int var2;
      for(var2 = 0; var2 < B; ++var2) {
         M[var2] = var1;
         var1 += var3.g();
      }

      S = new ItemDefinition[20];

      for(var2 = 0; var2 < 20; ++var2) {
         S[var2] = new ItemDefinition();
      }

   }

   public final Model a(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8;
      Model var10000;
      int var20;
      label251: {
         int var10001 = var1;
         var1 = var2;
         var8 = var7;
         var7 = var10001;
         ItemDefinition var16 = this;
         Model var9 = null;
         long var10;
         boolean var13;
         int var14;
         if(this.t == null) {
            if(var7 != 10) {
               var10000 = null;
               break label251;
            }

            var10 = (long)((this.g << 6) + var2) + ((long)(var8 + 1) << 32);
            Model var12;
            if((var12 = (Model)x.a(var10)) != null) {
               var10000 = var12;
               break label251;
            }

            if(this.q == null) {
               var10000 = null;
               break label251;
            }

            var13 = this.K ^ var2 > 3;
            var7 = this.q.length;

            for(var14 = 0; var14 < var7; ++var14) {
               var20 = var16.q[var14];
               if(var13) {
                  var20 += 65536;
               }

               if((var9 = (Model)z.a((long)var20)) == null) {
                  if((var9 = Model.a(var20 & '\uffff')) == null) {
                     var10000 = null;
                     break label251;
                  }

                  if(var13) {
                     var9.f();
                  }

                  z.a(var9, (long)var20);
               }

               if(var7 > 1) {
                  F[var14] = var9;
               }
            }

            if(var7 > 1) {
               var9 = new Model(var7, F);
            }
         } else {
            var20 = -1;

            for(int var21 = 0; var21 < var16.t.length; ++var21) {
               if(var16.t[var21] == var7) {
                  var20 = var21;
                  break;
               }
            }

            if(var20 == -1) {
               var10000 = null;
               break label251;
            }

            var10 = (long)((var16.g << 6) + (var20 << 3) + var2) + ((long)(var8 + 1) << 32);
            Model var22;
            if((var22 = (Model)x.a(var10)) != null) {
               var10000 = var22;
               break label251;
            }

            var7 = var16.q[var20];
            boolean var24;
            if(var24 = var16.K ^ var2 > 3) {
               var7 += 65536;
            }

            if((var9 = (Model)z.a((long)var7)) == null) {
               if((var9 = Model.a(var7 & '\uffff')) == null) {
                  var10000 = null;
                  break label251;
               }

               if(var24) {
                  var9.f();
               }

               z.a(var9, (long)var7);
            }
         }

         boolean var23 = var16.J != 128 || var16.R != 128 || var16.E != 128;
         var13 = var16.D != 0 || var16.H != 0 || var16.T != 0;
         Model var18 = new Model(var16.U == null, Frame.b(var8), var2 == 0 && var8 == -1 && !var23 && !var13, var9);
         if(var8 != -1) {
            var18.d();
            var18.c(var8);
            var18.v = null;
            var18.u = null;
         }

         while(var1-- > 0) {
            var18.e();
         }

         if(var16.U != null) {
            for(var14 = 0; var14 < var16.U.length; ++var14) {
               var18.a(var16.U[var14], var16.I[var14]);
            }
         }

         if(var23) {
            var18.b(var16.J, var16.E, var16.R);
         }

         if(var13) {
            var18.a(var16.D, var16.H, var16.T);
         }

         var18.a(64 + var16.C, 768 + var16.G * 5, -50, -10, -50, !var16.P);
         if(var16.N == 1) {
            var18.t = var18.aE;
         }

         x.a(var18, var10);
         var10000 = var18;
      }

      Model var15 = var10000;
      if(var10000 == null) {
         return null;
      } else {
         if(this.l || this.P) {
            var15 = new Model(this.l, this.P, var15);
         }

         if(this.l) {
            var2 = (var3 + var4 + var5 + var6) / 4;

            for(var7 = 0; var7 < var15.b; ++var7) {
               var8 = var15.c[var7];
               int var19 = var15.e[var7];
               var20 = var3 + (var4 - var3) * (var8 + 64) / 128;
               var8 = var6 + (var5 - var6) * (var8 + 64) / 128;
               var8 = var20 + (var8 - var20) * (var19 + 64) / 128;
               var15.d[var7] += var8 - var2;
            }

            Model var17 = var15;
            var15.aE = 0;
            var15.q = 0;

            for(var7 = 0; var7 < var17.b; ++var7) {
               if(-(var8 = var17.d[var7]) > var17.aE) {
                  var17.aE = -var8;
               }

               if(var8 > var17.q) {
                  var17.q = var8;
               }
            }

            var17.s = (int)(Math.sqrt((double)(var17.p * var17.p + var17.aE * var17.aE)) + 0.99D);
            var17.r = var17.s + (int)(Math.sqrt((double)(var17.p * var17.p + var17.q * var17.q)) + 0.99D);
         }

         return var15;
      }
   }
}
