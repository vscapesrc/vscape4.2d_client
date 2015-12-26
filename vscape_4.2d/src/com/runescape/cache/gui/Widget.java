package com.runescape.cache.gui;
import com.runescape.Client;
import com.runescape.cache.Archive;
import com.runescape.cache.SpriteLoader;
import com.runescape.cache.anim.Frame;
import com.runescape.cache.def.ActorDefinition;
import com.runescape.cache.def.ObjectDefinition;
import com.runescape.data.Cache;
import com.runescape.entity.model.Model;
import com.runescape.stream.Buffer;
import com.runescape.utils.StringUtils;

public final class Widget {
   public String a;
   public Sprite b;
   public int c;
   public Sprite[] d;
   public static Widget[] e;
   public int[] f;
   public int g;
   public int[] h;
   public int i;
   public int j;
   public String k;
   public int l;
   public int m;
   public String n;
   public String o;
   public boolean p;
   public int q;
   public String[] r;
   public int[][] s;
   public boolean t;
   public String u;
   public int v;
   public int w;
   public int x;
   public int y;
   public int z;
   public boolean A;
   public int B;
   public int C;
   private static Cache ai;
   public int D;
   public int[] E;
   public int[] F;
   public boolean G;
   public TextDrawingArea H;
   public int I;
   public int[] J;
   public int K;
   public int[] L;
   public String M;
   public boolean N;
   public int O;
   public int[] P;
   public int[] Q;
   public byte R;
   private int aj;
   private int ak;
   public int S;
   public int T;
   public boolean U;
   public Sprite V;
   public int W;
   public int X;
   public int Y;
   private static final Cache al = new Cache(30);
   public int Z;
   public boolean aa;
   public int ab;
   public boolean ac;
   public int ad;
   public int ae;
   public int af;
   public int[] ag;
   public boolean ah;

   public final void a(int var1, int var2) {
      int var3 = this.Q[var1];
      this.Q[var1] = this.Q[var2];
      this.Q[var2] = var3;
      var3 = this.P[var1];
      this.P[var1] = this.P[var2];
      this.P[var2] = var3;
   }

   public static void a(Archive var0, TextDrawingArea[] var1, Archive var2) {
      ai = new Cache('\uc350');
      Buffer var9 = new Buffer(var0.a("data"));
      int var3 = -1;
      int var4 = var9.g();
      e = new Widget[var4 + '\uee48'];

      while(true) {
         Widget var5;
         do {
            int var6;
            int var7;
            int var8;
            if(var9.b >= var9.a.length) {
               Widget var14 = e[904];
               a(24149, 1, "Options/SPRITE", "Fixed");
               a(24150, 2, "Options/SPRITE", "Resizable");
               a(24151, 3, "Options/SPRITE", "Fullscreen");
               var14.b(39, 24149, 10, 8);
               var14.b(40, 24150, 70, 8);
               var14.b(41, 24151, 130, 8);
               (var14 = e[19156]).j = 1;
               var14.n = "Toggle roofs";
               var14 = b(5292);
               a(28, (Widget)var14);
               a(5293, "bank", 0);
               var14.b(0, 5293, 13, 13);
               a(5384, "bank", 1, 17, 17, "Close Window", 0, 5380, 3);
               a(5380, "bank", 2, 17, 17, 5379);
               var14.b(1, 5384, 476, 16);
               var14.b(2, 5380, 476, 16);
               a(8131, 5292, "bank", 5, "bank", 6, 35, 25, "Swap/Insert", 1, 4, 304);
               var14.b(3, 8131, 25, 285);
               a(5386, 5292, "bank", 7, "bank", 8, 35, 25, "Withdraw Mode", 1, 4, 115);
               var14.b(4, 5386, 65, 285);
               a('\uc350', "bank", 9, 35, 25, "Deposit All", 0, '\uc351', 1);
               a('\uc351', "bank", 10, 35, 25, '\uc34f');
               var14.b(5, '\uc350', 455, 285);
               var14.b(6, '\uc351', 455, 285);
               var14.b(7, 5383, 170, 15);
               var14.b(8, 5385, -4, 74);
               a('\uc352', "bank", 11, "Click here to view the full contents of your bank");
               var14.b(9, '\uc352', 22, 36);
               a('\uc353', "bank", 15, "Drag an item here to create vscape new tab");
               var14.b(10, '\uc353', 70, 36);
               a('\uc354', "bank", 15, "Drag an item here to create vscape new tab");
               var14.b(11, '\uc354', 118, 36);
               a('\uc355', "bank", 15, "Drag an item here to create vscape new tab");
               var14.b(12, '\uc355', 166, 36);
               a('\uc356', "bank", 15, "Drag an item here to create vscape new tab");
               var14.b(13, '\uc356', 214, 36);
               a('\uc357', "bank", 15, "Drag an item here to create vscape new tab");
               var14.b(14, '\uc357', 262, 36);
               a('\uc358', "bank", 15, "Drag an item here to create vscape new tab");
               var14.b(15, '\uc358', 310, 36);
               a('\uc359', "bank", 15, "Drag an item here to create vscape new tab");
               var14.b(16, '\uc359', 358, 36);
               a('\uc35a', "bank", 15, "Drag an item here to create vscape new tab");
               var14.b(17, '\uc35a', 406, 36);
               a('\uc35b', "0", var1, 0, 11834970, true, false);
               var14.b(18, '\uc35b', 473, 42);
               a('\uc35c', "352", var1, 0, 11834970, true, false);
               var14.b(19, '\uc35c', 473, 57);
               d('\uc35d');
               var14.b(20, '\uc35d', 77, 39);
               d('\uc35e');
               var14.b(21, '\uc35e', 125, 39);
               d('\uc35f');
               var14.b(22, '\uc35f', 173, 39);
               d('\uc360');
               var14.b(23, '\uc360', 221, 39);
               d('\uc361');
               var14.b(24, '\uc361', 269, 39);
               d('\uc362');
               var14.b(25, '\uc362', 317, 39);
               d('\uc363');
               var14.b(26, '\uc363', 365, 39);
               d('\uc364');
               var14.b(27, '\uc364', 413, 39);
               a('\uc365', "0", 16750623, false, true, 52, var1, 1);
               a('\uc366', "0", 16750623, false, true, 52, var1, 1);
               a('\uc367', "0", 16750623, false, true, 52, var1, 1);
               (var14 = e[5385]).ab = 206;
               var14.m = 480;
               (var14 = e[5382]).m = 10;
               var14.w = 12;
               var14.ab = 35;
               int[] var15 = new int[]{8654, 8655, 8656, 8657, 8658, 8659, 8660, 8661, 8662, 8663, 8664, 8665, 8666, 8667, 8668, 8669, 8670, 8671, 8672, 12162, 13928};
               int[][] var16 = new int[][]{{4, 4}, {66, 4}, {128, 4}, {4, 34}, {66, 34}, {128, 34}, {4, 64}, {66, 64}, {128, 64}, {4, 94}, {66, 94}, {128, 94}, {4, 124}, {66, 124}, {128, 124}, {4, 154}, {66, 154}, {128, 154}, {4, 184}, {66, 184}, {128, 184}};
               Widget var24;
               int[] var18 = (var24 = e[3917]).E;
               int[] var19 = var24.F;
               int[] var23 = var24.ag;
               var24.c(var24.E.length + 21);

               for(var8 = 0; var8 < var18.length; ++var8) {
                  var24.b(var8, var18[var8], var19[var8], var23[var8]);
               }

               for(var8 = 0; var8 < 21; ++var8) {
                  int var10000 = var8 + 30000;
                  int var10001 = var8 + 10000;
                  boolean var10 = true;
                  var6 = var10001;
                  Widget var11;
                  (var11 = b(var10000)).X = 8;
                  var11.g = var6;
                  var11.M = "";
                  var11.ab = 28;
                  var11.m = 60;
                  var11.ah = true;
                  var24.b(var18.length + var8, var8 + 30000, var16[var8][0], var16[var8][1]);
               }

               for(var8 = 0; var8 < var18.length; ++var8) {
                  for(int var12 = 0; var12 < 21; ++var12) {
                     if(var15[var12] == var24.E[var8]) {
                        e[var15[var12]].v = var12 + 30000;
                     }
                  }
               }

               TextDrawingArea[] var13 = var1;
               var14 = b(25000);
               a(8, (Widget)var14);
               a(25001, "Clan Chat", var1, 1, 16751360, true, true);
               a(25002, "Talking in: Not in chat", var1, 0, 16751360, true, true);
               a(25003, "Owner: None", var1, 0, 16751360, true, true);
               a(25004, "clanchat", 4);
               Widget var17 = b(25005);
               a(3, (Widget)var17);
               a(25006, "clanchat", 5, 72, 32, "Join Chat", 550, 25007, 1);
               a(25007, "clanchat", 6, 72, 32, 25008);
               a(25009, "Join Chat", var1, 0, 16751360, true, true);
               var17.a(0, 25006, 0, 0);
               var17.a(1, 25007, 0, 0);
               var17.a(2, 25009, 36, 11);
               var24 = b(25010);
               a(3, (Widget)var24);
               a(25011, "clanchat", 5, 72, 32, "Clan Setup", -1, 25012, 5);
               a(25012, "clanchat", 6, 72, 32, 25013);
               a(25014, "Clan Setup", var1, 0, 16751360, true, true);
               var24.a(0, 25011, 0, 0);
               var24.a(1, 25012, 0, 0);
               var24.a(2, 25014, 36, 11);
               var5 = b(25015);
               a(3, (Widget)var5);
               a(25016, "clanchat", 5, 72, 32, "Leave Chat", -1, 25017, 1);
               a(25017, "clanchat", 6, 72, 32, 25018);
               a(25019, "Leave Chat", var1, 0, 16751360, true, true);
               var5.a(0, 25016, 0, 0);
               var5.a(1, 25017, 0, 0);
               var5.a(2, 25019, 36, 11);
               var5.aa = true;
               var14.a(0, 25001, 95, 3);
               var14.a(1, 25002, 95, 25);
               var14.a(2, 25003, 95, 40);
               var14.a(3, 25004, 0, 60);
               var14.a(4, 25005, 15, 226);
               var14.a(5, 25010, 103, 226);
               var14.a(6, 25015, 15, 226);
               var14.a(7, 25020, 0, 62);
               Widget var20;
               (var20 = b(25020)).g = 20000;
               var20.c(200);

               for(var7 = 0; var7 < 100; ++var7) {
                  a(var8 = var7 + 25021, "clanchat", 0);
               }

               for(var7 = 0; var7 < 100; ++var7) {
                  var8 = var7 + 25021;
                  var20.E[var7] = var8;
                  var20.F[var7] = 5;
                  if(var7 == 0) {
                     var20.ag[0] = 2;
                  } else {
                     var20.ag[var7] = var20.ag[var7 - 1] + 14;
                  }
               }

               for(var7 = 0; var7 < 100; ++var7) {
                  a(var8 = var7 + 25122, "", var13, 0, 16777215, false, true);
               }

               for(var7 = 100; var7 < 200; ++var7) {
                  var8 = 25122 + (var7 - 100);
                  var20.E[var7] = var8;
                  var20.F[var7] = 17;
                  if(var7 == 100) {
                     var20.ag[100] = 2;
                  } else {
                     var20.ag[var7] = var20.ag[var7 - 1] + 14;
                  }
               }

               var20.ab = 158;
               var20.m = 174;
               var20.W = 1405;

               for(var7 = 25122; var7 < 25222; ++var7) {
                  e[var7].g = 20001 + (var7 - 25122);
               }

               var14 = a(994);
               a(70, (Widget)var14);
               a(995, "windowframes", 0);
               var14.b(0, 995, 5, 8);
               a(1084, "bank", 1, 17, 17, "Close Window", 0, 1082, 3);
               a(1082, "bank", 2, 17, 17, 1081);
               var14.b(1, 1084, 480, 17);
               var14.b(2, 1082, 480, 17);
               var14.b(3, 1117, 6, 17);
               var14.b(4, 1119, 22, 46);
               a(1119, 68, 24);
               var14.b(5, 1120, 104, 46);
               a(1120, 68, 24);
               var14.b(6, 1121, 180, 46);
               a(1121, 68, 24);
               var14.b(7, 1122, 264, 46);
               a(1122, 68, 24);
               var14.b(8, 1123, 348, 46);
               a(1123, 68, 24);
               var14.b(9, 24476, 432, 46);
               a(24476, 68, 24);
               var14.b(10, 1094, 12, 78);
               var14.b(11, 1125, 12, 90);
               var14.b(12, 1085, 12, 134);
               var14.b(13, 1124, 12, 146);
               var14.b(14, 1087, 12, 188);
               var14.b(15, 1116, 12, 200);
               var14.b(16, 1086, 12, 244);
               var14.b(17, 1089, 12, 256);
               var14.b(18, 1088, 12, 302);
               var14.b(19, 1090, 12, 312);
               var14.b(20, 1091, 100, 78);
               var14.b(21, 1126, 100, 90);
               var14.b(22, 1093, 100, 134);
               var14.b(23, 1129, 100, 146);
               var14.b(24, 1083, 100, 188);
               var14.b(25, 1118, 100, 200);
               var14.b(26, 1092, 100, 244);
               var14.b(27, 1095, 100, 256);
               var14.b(28, 8429, 100, 302);
               var14.b(29, 8428, 100, 312);
               var14.b(30, 1098, 174, 78);
               var14.b(31, 1109, 174, 90);
               var14.b(32, 1099, 174, 134);
               var14.b(33, 1110, 174, 146);
               var14.b(34, 1100, 174, 188);
               var14.b(35, 1111, 174, 200);
               var14.b(36, 1101, 174, 244);
               var14.b(37, 1112, 174, 256);
               var14.b(38, 11461, 174, 302);
               var14.b(39, 11459, 174, 312);
               var14.b(40, 1102, 258, 78);
               var14.b(41, 1127, 258, 90);
               var14.b(42, 1103, 258, 134);
               var14.b(43, 1113, 258, 146);
               var14.b(44, 1104, 258, 188);
               var14.b(45, 1114, 258, 200);
               var14.b(46, 1105, 258, 244);
               var14.b(47, 1115, 258, 256);
               var14.b(48, 13358, 258, 302);
               var14.b(49, 13357, 258, 312);
               var14.b(50, 1107, 340, 78);
               var14.b(51, 1128, 340, 90);
               var14.b(52, 1108, 340, 134);
               var14.b(53, 1130, 340, 146);
               var14.b(54, 1106, 340, 188);
               var14.b(55, 1131, 340, 200);
               var14.b(56, 1096, 340, 244);
               var14.b(57, 1132, 340, 256);
               var14.b(58, 1134, 340, 302);
               var14.b(59, 1135, 340, 312);
               var14.b(60, 24482, 432, 78);
               var14.b(61, 24477, 432, 90);
               var14.b(62, 24483, 432, 134);
               var14.b(63, 24478, 432, 146);
               var14.b(64, 24484, 432, 188);
               var14.b(65, 24479, 432, 200);
               var14.b(66, 24485, 432, 244);
               var14.b(67, 24480, 432, 256);
               var14.b(68, 24486, 432, 302);
               var14.b(69, 24481, 432, 312);
               ai = null;
               return;
            }

            if((var4 = var9.g()) == '\uffff') {
               var3 = var9.g();
               var4 = var9.g();
            }

            (var5 = e[var4] = new Widget()).O = var4;
            var5.B = var3;
            var5.X = var9.e();
            var5.j = var9.e();
            var5.g = var9.g();
            var5.m = var9.g();
            var5.ab = var9.g();
            var5.R = (byte)var9.e();
            var5.v = var9.e();
            if(var5.v != 0) {
               var5.v = (var5.v - 1 << 8) + var9.e();
            } else {
               var5.v = -1;
            }

            if((var4 = var9.e()) > 0) {
               var5.J = new int[var4];
               var5.f = new int[var4];

               for(var6 = 0; var6 < var4; ++var6) {
                  var5.J[var6] = var9.e();
                  var5.f[var6] = var9.g();
               }
            }

            if((var6 = var9.e()) > 0) {
               var5.s = new int[var6][];

               for(var4 = 0; var4 < var6; ++var4) {
                  var7 = var9.g();
                  var5.s[var4] = new int[var7];

                  for(var8 = 0; var8 < var7; ++var8) {
                     var5.s[var4][var8] = var9.g();
                  }
               }
            }

            if(var5.X == 0) {
               var5.W = var9.g();
               var5.aa = var9.e() == 1;
               var4 = var9.g();
               var5.E = new int[var4];
               var5.F = new int[var4];
               var5.ag = new int[var4];

               for(var7 = 0; var7 < var4; ++var7) {
                  var5.E[var7] = var9.g();
                  var5.F[var7] = var9.h();
                  var5.ag[var7] = var9.h();
               }
            }

            if(var5.X == 1) {
               var9.g();
               var9.e();
            }

            if(var5.X == 2) {
               var5.Q = new int[var5.m * var5.ab];
               var5.P = new int[var5.m * var5.ab];
               var5.U = var9.e() == 1;
               var5.N = var9.e() == 1;
               var5.G = var9.e() == 1;
               var5.A = var9.e() == 1;
               var5.w = var9.e();
               var5.I = var9.e();
               var5.h = new int[20];
               var5.L = new int[20];
               var5.d = new Sprite[20];

               for(var4 = 0; var4 < 20; ++var4) {
                  if(var9.e() == 1) {
                     var5.h[var4] = var9.h();
                     var5.L[var4] = var9.h();
                     String var22 = var9.l();
                     if(var2 != null && var22.length() > 0) {
                        var6 = var22.lastIndexOf(",");
                        var5.d[var4] = a(Integer.parseInt(var22.substring(var6 + 1)), var2, var22.substring(0, var6));
                     }
                  }
               }

               var5.r = new String[5];

               for(var4 = 0; var4 < 5; ++var4) {
                  var5.r[var4] = var9.l();
                  if(var5.r[var4].length() == 0) {
                     var5.r[var4] = null;
                  }

                  if(var5.O == 1688) {
                     var5.r[1] = null;
                  }

                  if(var5.B == 3822) {
                     var5.r[4] = "Sell X";
                  }
               }
            }

            if(var5.X == 3) {
               var5.t = var9.e() == 1;
            }

            if(var5.X == 4 || var5.X == 1) {
               var5.p = var9.e() == 1;
               var4 = var9.e();
               var5.H = var1[var4];
               var5.ac = var9.e() == 1;
            }

            if(var5.X == 4) {
               var5.M = var9.l().replaceAll("RuneScape", "/v/scape");
               var5.u = var9.l();
            }

            if(var5.X == 1 || var5.X == 3 || var5.X == 4) {
               var5.x = var9.j();
            }

            if(var5.X == 3 || var5.X == 4) {
               var5.l = var9.j();
               var5.i = var9.j();
               var5.D = var9.j();
            }

            if(var5.X == 5) {
               String var21 = var9.l();
               if(var2 != null && var21.length() > 0) {
                  var7 = var21.lastIndexOf(",");
                  var5.b = a(Integer.parseInt(var21.substring(var7 + 1)), var2, var21.substring(0, var7));
               }

               var21 = var9.l();
               if(var2 != null && var21.length() > 0) {
                  var7 = var21.lastIndexOf(",");
                  var5.V = a(Integer.parseInt(var21.substring(var7 + 1)), var2, var21.substring(0, var7));
               }
            }

            if(var5.X == 6) {
               if((var4 = var9.e()) != 0) {
                  var5.y = 1;
                  var5.z = (var4 - 1 << 8) + var9.e();
               }

               if((var4 = var9.e()) != 0) {
                  var5.aj = 1;
                  var5.ak = (var4 - 1 << 8) + var9.e();
               }

               if((var4 = var9.e()) != 0) {
                  var5.S = (var4 - 1 << 8) + var9.e();
               } else {
                  var5.S = -1;
               }

               if((var4 = var9.e()) != 0) {
                  var5.T = (var4 - 1 << 8) + var9.e();
               } else {
                  var5.T = -1;
               }

               var5.ad = var9.g();
               var5.ae = var9.g();
               var5.af = var9.g();
            }

            if(var5.X == 7) {
               var5.Q = new int[var5.m * var5.ab];
               var5.P = new int[var5.m * var5.ab];
               var5.p = var9.e() == 1;
               var4 = var9.e();
               var5.H = var1[var4];
               var5.ac = var9.e() == 1;
               var5.x = var9.j();
               var5.w = var9.h();
               var5.I = var9.h();
               var5.N = var9.e() == 1;
               var5.r = new String[5];

               for(var7 = 0; var7 < 5; ++var7) {
                  var5.r[var7] = var9.l();
                  if(var5.r[var7].length() == 0) {
                     var5.r[var7] = null;
                  }
               }
            }

            if(var5.j == 2 || var5.X == 2) {
               var5.o = var9.l();
               var5.k = var9.l();
               var5.C = var9.g();
            }

            if(var5.X == 8) {
               var5.M = var9.l();
            }
         } while(var5.j != 1 && var5.j != 4 && var5.j != 5 && var5.j != 6);

         var5.n = var9.l();
         if(var5.n.length() == 0) {
            if(var5.j == 1) {
               var5.n = "Ok";
            }

            if(var5.j == 4) {
               var5.n = "Select";
            }

            if(var5.j == 5) {
               var5.n = "Select";
            }

            if(var5.j == 6) {
               var5.n = "Continue";
            }
         }
      }
   }

   private static void a(int var0, int var1, String var2, String var3) {
      Widget var4;
      (var4 = e[var0] = new Widget()).O = var0;
      var4.B = var0;
      var4.X = 5;
      var4.j = 1;
      var4.g = 0;
      var4.R = 0;
      var4.v = 52;
      var4.b = a(var1, var2);
      var4.V = a(var1, var2);
      var4.m = var4.b.b;
      var4.ab = var4.V.c;
      var4.n = var3;
   }

   private static void a(int var0, String var1, int var2, String var3) {
      Widget var4;
      (var4 = e[var0] = new Widget()).O = var0;
      var4.B = var0;
      var4.X = 5;
      var4.j = 1;
      var4.g = 0;
      var4.R = 0;
      var4.v = 52;
      var4.b = SpriteLoader.a(var1, var2);
      var4.V = SpriteLoader.a(var1, var2);
      var4.m = var4.b.b;
      var4.ab = var4.V.c;
      var4.n = var3;
   }

   private static Widget a(int var0) {
      Widget var1;
      (var1 = e[var0] = new Widget()).O = var0;
      var1.B = var0;
      var1.m = 512;
      var1.ab = 334;
      return var1;
   }

   private static void a(int var0, String var1, TextDrawingArea[] var2, int var3, int var4, boolean var5, boolean var6) {
      Widget var7;
      (var7 = b(var0)).B = var0;
      var7.O = var0;
      var7.X = 4;
      var7.j = 0;
      var7.m = 0;
      var7.ab = 11;
      var7.g = 0;
      var7.R = 0;
      var7.v = -1;
      var7.p = var5;
      var7.ac = var6;
      var7.H = var2[var3];
      var7.M = var1;
      var7.u = "";
      var7.x = var4;
      var7.l = 0;
      var7.i = 0;
      var7.D = 0;
   }

   private static void a(int var0, String var1, int var2, boolean var3, boolean var4, int var5, TextDrawingArea[] var6, int var7) {
      Widget var8;
      (var8 = a(var0)).B = var0;
      var8.O = var0;
      var8.X = 4;
      var8.j = 0;
      var8.m = 0;
      var8.ab = 0;
      var8.g = 0;
      var8.R = 0;
      var8.v = 52;
      var8.p = false;
      var8.ac = true;
      var8.H = var6[1];
      var8.M = var1;
      var8.u = "";
      var8.x = 16750623;
   }

   private static void a(int var0, int var1, String var2, int var3, String var4, int var5, int var6, int var7, String var8, int var9, int var10, int var11) {
      Widget var12;
      (var12 = b(var0)).B = 5292;
      var12.O = var0;
      var12.X = 5;
      var12.j = 4;
      var12.g = 0;
      var12.m = 35;
      var12.ab = 25;
      var12.R = 0;
      var12.v = -1;
      var12.J = new int[1];
      var12.f = new int[1];
      var12.J[0] = 1;
      var12.f[0] = 1;
      var12.s = new int[1][3];
      var12.s[0][0] = 5;
      var12.s[0][1] = var11;
      var12.s[0][2] = 0;
      var12.b = SpriteLoader.a(var2, var3);
      var12.V = SpriteLoader.a(var4, var5);
      var12.n = var8;
   }

   private static void a(int var0, String var1, int var2) {
      Widget var3;
      (var3 = e[var0] = new Widget()).O = var0;
      var3.B = var0;
      var3.X = 5;
      var3.j = 0;
      var3.g = 0;
      var3.R = 0;
      var3.v = 52;
      var3.b = SpriteLoader.a(var1, var2);
      var3.V = SpriteLoader.a(var1, var2);
      var3.m = 512;
      var3.ab = 334;
   }

   private static void a(int var0, String var1, int var2, int var3, int var4, String var5, int var6, int var7, int var8) {
      Widget var9;
      (var9 = b(var0)).O = var0;
      var9.B = var0;
      var9.X = 5;
      var9.j = var8;
      var9.g = var6;
      var9.R = 0;
      var9.v = var7;
      var9.b = SpriteLoader.a(var1, var2);
      var9.V = SpriteLoader.a(var1, var2);
      var9.m = var3;
      var9.ab = var4;
      var9.n = var5;
   }

   private static void a(int var0, String var1, int var2, int var3, int var4, int var5) {
      Widget var6;
      (var6 = b(var0)).B = var0;
      var6.O = var0;
      var6.X = 0;
      var6.j = 0;
      var6.m = var3;
      var6.ab = var4;
      var6.aa = true;
      var6.R = 0;
      var6.v = -1;
      var6.W = 0;
      Widget var7;
      (var7 = b(var5)).O = var5;
      var7.B = var5;
      var7.X = 5;
      var7.j = 0;
      var7.g = 0;
      var7.m = 512;
      var7.ab = 334;
      var7.R = 0;
      var7.v = 52;
      var7.b = SpriteLoader.a(var1, var2);
      var7.V = SpriteLoader.a(var1, var2);
      var6.c(1);
      var6.a(0, var5, 0, 0);
   }

   private static Widget b(int var0) {
      Widget var1;
      (var1 = e[var0] = new Widget()).O = var0;
      var1.B = var0;
      var1.X = 0;
      var1.j = 0;
      var1.g = 0;
      var1.m = 512;
      var1.ab = 700;
      var1.R = 0;
      var1.v = -1;
      return var1;
   }

   private static Sprite a(int var0, String var1) {
      long var2 = (StringUtils.b(var1) << 8) + (long)var0;
      Sprite var4;
      if((var4 = (Sprite)ai.a(var2)) != null) {
         return var4;
      } else {
         try {
            var4 = new Sprite(var1 + " " + var0);
            ai.a(var4, var2);
            return var4;
         } catch (Exception var5) {
            return null;
         }
      }
   }

   private void a(int var1, int var2, int var3, int var4) {
      this.E[var1] = var2;
      this.F[var1] = var3;
      this.ag[var1] = var4;
   }

   private void c(int var1) {
      this.E = new int[var1];
      this.F = new int[var1];
      this.ag = new int[var1];
   }

   private static Model b(int var0, int var1) {
      Model var2;
      if((var2 = (Model)al.a((long)((var0 << 16) + var1))) != null) {
         return var2;
      } else {
         if(var0 == 1) {
            var2 = Model.a(var1);
         }

         if(var0 == 2) {
            var2 = ActorDefinition.a(var1).a();
         }

         if(var0 == 3) {
            var2 = Client.t.e();
         }

         if(var0 == 4) {
            var2 = ObjectDefinition.a(var1).c(50);
         }

         if(var0 == 5) {
            var2 = null;
         }

         if(var2 != null) {
            al.a(var2, (long)((var0 << 16) + var1));
         }

         return var2;
      }
   }

   private static Sprite a(int var0, Archive var1, String var2) {
      long var3 = (StringUtils.b(var2) << 8) + (long)var0;
      Sprite var5;
      if((var5 = (Sprite)ai.a(var3)) != null) {
         return var5;
      } else {
         try {
            var5 = new Sprite(var1, var2, var0);
            ai.a(var5, var3);
            return var5;
         } catch (Exception var6) {
            return null;
         }
      }
   }

   public static void a(boolean var0, Model var1) {
      if(!var0) {
         al.a();
         if(var1 != null) {
            al.a(var1, 327680L);
         }

      }
   }

   public final Model a(int var1, int var2, boolean var3) {
      Model var4;
      if(var3) {
         var4 = b(this.aj, this.ak);
      } else {
         var4 = b(this.y, this.z);
      }

      if(var4 == null) {
         return null;
      } else if(var2 == -1 && var1 == -1 && var4.k == null) {
         return var4;
      } else {
         var4 = new Model(true, Frame.b(var2) & Frame.b(var1), false, var4);
         if(var2 != -1 || var1 != -1) {
            var4.d();
         }

         if(var2 != -1) {
            var4.c(var2);
         }

         if(var1 != -1) {
            var4.c(var1);
         }

         var4.a(64, 768, -50, -10, -50, true);
         return var4;
      }
   }

   private static void a(int var0, Widget var1) {
      var1.E = new int[var0];
      var1.F = new int[var0];
      var1.ag = new int[var0];
   }

   private void b(int var1, int var2, int var3, int var4) {
      this.E[var1] = var2;
      this.F[var1] = var3;
      this.ag[var1] = var4;
   }

   private static void d(int var0) {
      Widget var1;
      (var1 = e[var0] = new Widget()).O = var0;
      var1.B = var0;
      var1.X = 2;
      var1.w = 24;
      var1.I = 24;
      var1.ab = 1;
      var1.m = 1;
      var1.r = new String[5];
      var1.h = new int[20];
      var1.L = new int[20];
      var1.Q = new int[1];
      var1.P = new int[1];
      var1.E = new int[0];
      var1.F = new int[0];
      var1.ag = new int[0];
      var1.G = false;
      var1.N = false;
   }

   private static void a(int var0, int var1, int var2) {
      Widget var3;
      (var3 = e[var0]).w = 68;
      var3.I = 24;
   }
}
