package com.runescape.entity.model;
import com.runescape.Client;
import com.runescape.cache.anim.Frame;
import com.runescape.cache.anim.c.Class5;
import com.runescape.entity.Renderable;
import com.runescape.graphics.Rasterizer2D;
import com.runescape.graphics.Rasterizer3D;
import com.runescape.network.Provider;
import com.runescape.stream.Buffer;

public final class Model extends Renderable {
   private static boolean[] F;
   private static String G = "Cla";
   private static String H = "at Cl";
   private static String I = "nt";
   private boolean J;
   private static int K;
   public static Model a;
   private static int[] L;
   private static int[] M;
   private static int[] N;
   private static int[] O;
   public int b;
   public int[] c;
   public int[] d;
   public int[] e;
   public int f;
   public int[] g;
   public int[] h;
   public int[] i;
   private int[] P;
   private int[] Q;
   private int[] R;
   public int[] j;
   private int[] S;
   private int[] T;
   public int[] k;
   private int U;
   private int V;
   private int[] W;
   private int[] X;
   private int[] Y;
   public int l;
   public int m;
   public int n;
   public int o;
   public int p;
   public int q;
   public int r;
   public int s;
   public int t;
   private int[] Z;
   private int[] aa;
   public int[][] u;
   public int[][] v;
   public boolean w;
   public VertexNormal[] x;
   private static ModelHeader[] ab;
   private static Provider ac;
   private static boolean[] ad;
   private static boolean[] ae;
   private static int[] af;
   private static int[] ag;
   private static int[] ah;
   private static int[] ai;
   private static int[] aj;
   private static int[] ak;
   private static int[] al;
   private static int[][] am;
   private static int[] an;
   private static int[][] ao;
   private static int[] ap;
   private static int[] aq;
   private static int[] ar;
   private static int[] as;
   private static int[] at;
   private static int[] au;
   private static int av;
   private static int aw;
   private static int ax;
   public static boolean y;
   public static int z;
   public static int A;
   public static int B;
   public static int[] C;
   public static int[] D;
   public static int[] E;
   private static int[] ay;
   private static int[] az;

   static {
      (new StringBuilder()).append(G).append("n Ch").append(H).append("ie").append(I).append(" ");
      a = new Model(true);
      L = new int[2000];
      M = new int[2000];
      N = new int[2000];
      O = new int[2000];
      ad = new boolean[8000];
      ae = new boolean[8000];
      af = new int[8000];
      ag = new int[8000];
      ah = new int[8000];
      ai = new int[8000];
      aj = new int[8000];
      ak = new int[8000];
      al = new int[1500];
      am = new int[1500][512];
      an = new int[12];
      ao = new int[12][2000];
      ap = new int[2000];
      aq = new int[2000];
      ar = new int[12];
      as = new int[10];
      at = new int[10];
      au = new int[10];
      C = new int[1000];
      D = Rasterizer3D.r;
      E = Rasterizer3D.s;
      ay = Rasterizer3D.x;
      az = Rasterizer3D.g;
   }

   public static void b() {
      ab = null;
      ad = null;
      ae = null;
      ag = null;
      ah = null;
      ai = null;
      aj = null;
      ak = null;
      al = null;
      am = null;
      an = null;
      ao = null;
      ap = null;
      aq = null;
      ar = null;
      D = null;
      E = null;
      ay = null;
      az = null;
   }

   private Model(int var1) {
      byte[] var2;
      int var3;
      int var4;
      Buffer var6;
      Buffer var7;
      Buffer var8;
      Buffer var9;
      Buffer var10;
      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      int var18;
      Model var156;
      boolean var158;
      if((var2 = ab[var1].a)[var2.length - 1] == -1 && var2[var2.length - 2] == -1) {
         var156 = this;
         Buffer var159 = new Buffer(var2);
         var6 = new Buffer(var2);
         var7 = new Buffer(var2);
         var8 = new Buffer(var2);
         var9 = new Buffer(var2);
         var10 = new Buffer(var2);
         Buffer var160 = new Buffer(var2);
         var159.b = var2.length - 23;
         var12 = var159.g();
         var13 = var159.g();
         var14 = var159.e();
         ModelHeader var161;
         (var161 = ab[var1] = new ModelHeader()).a = var2;
         var161.b = var12;
         var161.c = var13;
         var161.d = var14;
         var16 = var159.e();
         boolean var162 = ~(1 & var16) == -2;
         if((8 & var16) != 8) {
            Model var21 = this;
            Buffer var22 = new Buffer(var2);
            Buffer var23 = new Buffer(var2);
            Buffer var24 = new Buffer(var2);
            Buffer var25 = new Buffer(var2);
            Buffer var26 = new Buffer(var2);
            Buffer var27 = new Buffer(var2);
            Buffer var28 = new Buffer(var2);
            var22.b = var2.length - 23;
            int var29 = var22.g();
            int var30 = var22.g();
            int var31 = var22.e();
            ModelHeader var32;
            (var32 = ab[var1] = new ModelHeader()).a = var2;
            var32.b = var29;
            var32.c = var30;
            var32.d = var31;
            int var33 = var22.e();
            boolean var34 = ~(1 & var33) == -2;
            int var35 = var22.e();
            int var36 = var22.e();
            int var37 = var22.e();
            int var38 = var22.e();
            int var39 = var22.e();
            int var40 = var22.g();
            int var41 = var22.g();
            int var42 = var22.g();
            int var43 = var22.g();
            int var44 = var22.g();
            int var45 = 0;
            int var46 = 0;
            int var47 = 0;
            byte[] var48 = null;
            byte[] var49 = null;
            byte[] var50 = null;
            byte[] var51 = null;
            byte[] var52 = null;
            byte[] var53 = null;
            byte[] var54 = null;
            int[] var55 = null;
            int[] var56 = null;
            int[] var57 = null;
            short[] var58 = null;
            int var59;
            if(var31 > 0) {
               var49 = new byte[var31];
               var22.b = 0;

               for(var59 = 0; var59 < var31; ++var59) {
                  byte var60;
                  if((var60 = var49[var59] = var22.f()) == 0) {
                     ++var45;
                  }

                  if(var60 > 0 && var60 <= 3) {
                     ++var46;
                  }

                  if(var60 == 2) {
                     ++var47;
                  }
               }
            }

            int var61 = var59 = var31 + var29;
            if(var33 == 1) {
               var59 += var30;
            }

            int var62 = var59;
            int var63 = var59 += var30;
            if(var35 == 255) {
               var59 += var30;
            }

            int var64 = var59;
            if(var37 == 1) {
               var59 += var30;
            }

            int var65 = var59;
            if(var39 == 1) {
               var59 += var29;
            }

            int var66 = var59;
            if(var36 == 1) {
               var59 += var30;
            }

            int var67 = var59;
            int var68 = var59 += var43;
            if(var38 == 1) {
               var59 += var30 << 1;
            }

            int var69 = var59;
            int var70 = var59 += var44;
            int var71 = var59 += var30 << 1;
            int var72 = var59 += var40;
            int var73 = var59 += var41;
            int var74 = var59 += var42;
            int var75 = var59 += var45 * 6;
            int var76 = var59 += var46 * 6;
            int var77 = var59 += var46 * 6;
            int var78 = var59 += var46;
            int var79 = var59 + var46;
            int[] var80 = new int[var29];
            int[] var81 = new int[var29];
            int[] var82 = new int[var29];
            int[] var83 = new int[var30];
            int[] var84 = new int[var30];
            int[] var85 = new int[var30];
            this.Z = new int[var29];
            this.j = new int[var30];
            this.S = new int[var30];
            this.T = new int[var30];
            this.aa = new int[var30];
            if(var39 == 1) {
               this.Z = new int[var29];
            }

            if(var34) {
               this.j = new int[var30];
            }

            if(var35 == 255) {
               this.S = new int[var30];
            }

            if(var36 == 1) {
               this.T = new int[var30];
            }

            if(var37 == 1) {
               this.aa = new int[var30];
            }

            if(var38 == 1) {
               var58 = new short[var30];
            }

            if(var38 == 1 && var31 > 0) {
               var48 = new byte[var30];
            }

            int[] var86 = new int[var30];
            int[] var87 = null;
            int[] var88 = null;
            int[] var89 = null;
            if(var31 > 0) {
               var87 = new int[var31];
               var88 = new int[var31];
               var89 = new int[var31];
               if(var46 > 0) {
                  var55 = new int[var46];
                  var57 = new int[var46];
                  var56 = new int[var46];
                  var53 = new byte[var46];
                  var54 = new byte[var46];
                  var51 = new byte[var46];
               }

               if(var47 > 0) {
                  var52 = new byte[var47];
                  var50 = new byte[var47];
               }
            }

            var22.b = var31;
            var23.b = var71;
            var24.b = var72;
            var25.b = var73;
            var26.b = var65;
            int var90 = 0;
            int var91 = 0;
            int var92 = 0;

            int var93;
            int var94;
            int var95;
            int var96;
            int var97;
            for(var93 = 0; var93 < var29; ++var93) {
               var94 = var22.e();
               var95 = 0;
               if((var94 & 1) != 0) {
                  var95 = var23.p();
               }

               var96 = 0;
               if((var94 & 2) != 0) {
                  var96 = var24.p();
               }

               var97 = 0;
               if((var94 & 4) != 0) {
                  var97 = var25.p();
               }

               var80[var93] = var90 + var95;
               var81[var93] = var91 + var96;
               var82[var93] = var92 + var97;
               var90 = var80[var93];
               var91 = var81[var93];
               var92 = var82[var93];
               if(var21.Z != null) {
                  var21.Z[var93] = var26.e();
               }
            }

            var22.b = var70;
            var23.b = var61;
            var24.b = var63;
            var25.b = var66;
            var26.b = var64;
            var27.b = var68;
            var28.b = var69;

            for(var93 = 0; var93 < var30; ++var93) {
               var86[var93] = var22.g();
               if(var33 == 1) {
                  var21.j[var93] = var23.f();
                  if(var21.j[var93] == 2) {
                     var86[var93] = '\uffff';
                  }

                  var21.j[var93] = 0;
               }

               if(var35 == 255) {
                  var21.S[var93] = var24.f();
               }

               if(var36 == 1) {
                  var21.T[var93] = var25.f();
                  if(var21.T[var93] < 0) {
                     var21.T[var93] += 256;
                  }
               }

               if(var37 == 1) {
                  var21.aa[var93] = var26.e();
               }

               if(var38 == 1) {
                  var58[var93] = (short)(var27.g() - 1);
               }

               if(var48 != null) {
                  if(var58[var93] != -1) {
                     var48[var93] = (byte)(var28.e() - 1);
                  } else {
                     var48[var93] = -1;
                  }
               }
            }

            var22.b = var67;
            var23.b = var62;
            var93 = 0;
            var94 = 0;
            var95 = 0;
            var96 = 0;

            int var98;
            for(var97 = 0; var97 < var30; ++var97) {
               if((var98 = var23.e()) == 1) {
                  var96 = var93 = var22.p() + var96;
                  var96 = var94 = var22.p() + var96;
                  var96 = var95 = var22.p() + var96;
                  var83[var97] = var93;
                  var84[var97] = var94;
                  var85[var97] = var95;
               }

               if(var98 == 2) {
                  var94 = var95;
                  var96 = var95 = var22.p() + var96;
                  var83[var97] = var93;
                  var84[var97] = var94;
                  var85[var97] = var95;
               }

               if(var98 == 3) {
                  var93 = var95;
                  var96 = var95 = var22.p() + var96;
                  var83[var97] = var93;
                  var84[var97] = var94;
                  var85[var97] = var95;
               }

               if(var98 == 4) {
                  int var99 = var93;
                  var93 = var94;
                  var94 = var99;
                  var96 = var95 = var22.p() + var96;
                  var83[var97] = var93;
                  var84[var97] = var99;
                  var85[var97] = var95;
               }
            }

            var22.b = var74;
            var23.b = var75;
            var24.b = var76;
            var25.b = var77;
            var26.b = var78;
            var27.b = var79;

            for(var97 = 0; var97 < var31; ++var97) {
               if((var98 = var49[var97] & 255) == 0) {
                  var87[var97] = var22.g();
                  var88[var97] = var22.g();
                  var89[var97] = var22.g();
               }

               if(var98 == 1) {
                  var87[var97] = var23.g();
                  var88[var97] = var23.g();
                  var89[var97] = var23.g();
                  var55[var97] = var24.g();
                  var57[var97] = var24.g();
                  var56[var97] = var24.g();
                  var53[var97] = var25.f();
                  var54[var97] = var26.f();
                  var51[var97] = var27.f();
               }

               if(var98 == 2) {
                  var87[var97] = var23.g();
                  var88[var97] = var23.g();
                  var89[var97] = var23.g();
                  var55[var97] = var24.g();
                  var57[var97] = var24.g();
                  var56[var97] = var24.g();
                  var53[var97] = var25.f();
                  var54[var97] = var26.f();
                  var51[var97] = var27.f();
                  var52[var97] = var27.f();
                  var50[var97] = var27.f();
               }

               if(var98 == 3) {
                  var87[var97] = var23.g();
                  var88[var97] = var23.g();
                  var89[var97] = var23.g();
                  var55[var97] = var24.g();
                  var57[var97] = var24.g();
                  var56[var97] = var24.g();
                  var53[var97] = var25.f();
                  var54[var97] = var26.f();
                  var51[var97] = var27.f();
               }
            }

            if(var35 != 255) {
               for(var97 = 0; var97 < var30; ++var97) {
                  var21.S[var97] = var35;
               }
            }

            var21.k = var86;
            var21.b = var29;
            var21.f = var30;
            var21.c = var80;
            var21.d = var81;
            var21.e = var82;
            var21.g = var83;
            var21.h = var84;
            var21.i = var85;
         } else {
            var158 = false;
            var159.b -= 7;
            var4 = var159.e();
            var159.b += 6;
            if(var4 == 15) {
               F[var1] = true;
            }

            var3 = var159.e();
            var15 = var159.e();
            var18 = var159.e();
            int var100 = var159.e();
            int var101 = var159.e();
            int var102 = var159.g();
            int var103 = var159.g();
            int var104 = var159.g();
            int var105 = var159.g();
            int var106 = var159.g();
            int var107 = 0;
            int var108 = 0;
            int var109 = 0;
            byte[] var110 = null;
            byte[] var111 = null;
            byte[] var112 = null;
            byte[] var113 = null;
            byte[] var114 = null;
            byte[] var115 = null;
            byte[] var116 = null;
            int[] var117 = null;
            int[] var118 = null;
            int[] var119 = null;
            short[] var120 = null;
            int var121;
            if(var14 > 0) {
               var111 = new byte[var14];
               var159.b = 0;

               for(var121 = 0; var121 < var14; ++var121) {
                  byte var122;
                  if((var122 = var111[var121] = var159.f()) == 0) {
                     ++var107;
                  }

                  if(var122 > 0 && var122 <= 3) {
                     ++var108;
                  }

                  if(var122 == 2) {
                     ++var109;
                  }
               }
            }

            int var123 = var121 = var14 + var12;
            if(var162) {
               var121 += var13;
            }

            if(var16 == 1) {
               var121 += var13;
            }

            int var124 = var121;
            int var125 = var121 += var13;
            if(var3 == 255) {
               var121 += var13;
            }

            int var126 = var121;
            if(var18 == 1) {
               var121 += var13;
            }

            int var127 = var121;
            if(var101 == 1) {
               var121 += var12;
            }

            int var128 = var121;
            if(var15 == 1) {
               var121 += var13;
            }

            int var129 = var121;
            var105 = var121 += var105;
            if(var100 == 1) {
               var121 += var13 << 1;
            }

            int var130 = var121;
            var106 = var121 += var106;
            int var131 = var121 += var13 << 1;
            var102 = var121 += var102;
            var103 = var121 += var103;
            var104 = var121 += var104;
            var107 = var121 += var107 * 6;
            var121 += var108 * 6;
            byte var132 = 6;
            if(var4 != 14) {
               if(var4 >= 15) {
                  var132 = 9;
               }
            } else {
               var132 = 7;
            }

            int var133 = var121;
            int var134 = var121 += var132 * var108;
            int var135 = var121 += var108;
            int var136 = var121 + var108;
            int[] var137 = new int[var12];
            int[] var138 = new int[var12];
            int[] var139 = new int[var12];
            int[] var140 = new int[var13];
            int[] var141 = new int[var13];
            int[] var142 = new int[var13];
            this.Z = new int[var12];
            this.j = new int[var13];
            this.S = new int[var13];
            this.T = new int[var13];
            this.aa = new int[var13];
            if(var101 == 1) {
               this.Z = new int[var12];
            }

            if(var162) {
               this.j = new int[var13];
            }

            if(var3 == 255) {
               this.S = new int[var13];
            }

            if(var15 == 1) {
               this.T = new int[var13];
            }

            if(var18 == 1) {
               this.aa = new int[var13];
            }

            if(var100 == 1) {
               var120 = new short[var13];
            }

            if(var100 == 1 && var14 > 0) {
               var110 = new byte[var13];
            }

            int[] var163 = new int[var13];
            int[] var143 = null;
            int[] var144 = null;
            int[] var145 = null;
            if(var14 > 0) {
               var143 = new int[var14];
               var144 = new int[var14];
               var145 = new int[var14];
               if(var108 > 0) {
                  var117 = new int[var108];
                  var119 = new int[var108];
                  var118 = new int[var108];
                  var115 = new byte[var108];
                  var116 = new byte[var108];
                  var113 = new byte[var108];
               }

               if(var109 > 0) {
                  var114 = new byte[var109];
                  var112 = new byte[var109];
               }
            }

            var159.b = var14;
            var6.b = var131;
            var7.b = var102;
            var8.b = var103;
            var9.b = var127;
            int var146 = 0;
            int var147 = 0;
            int var148 = 0;

            int var149;
            int var150;
            int var151;
            int var152;
            int var153;
            for(var149 = 0; var149 < var12; ++var149) {
               var150 = var159.e();
               var151 = 0;
               if((var150 & 1) != 0) {
                  var151 = var6.p();
               }

               var152 = 0;
               if((var150 & 2) != 0) {
                  var152 = var7.p();
               }

               var153 = 0;
               if((var150 & 4) != 0) {
                  var153 = var8.p();
               }

               var137[var149] = var146 + var151;
               var138[var149] = var147 + var152;
               var139[var149] = var148 + var153;
               var146 = var137[var149];
               var147 = var138[var149];
               var148 = var139[var149];
               if(var156.Z != null) {
                  var156.Z[var149] = var9.e();
               }
            }

            var159.b = var106;
            var6.b = var123;
            var7.b = var125;
            var8.b = var128;
            var9.b = var126;
            var10.b = var105;
            var160.b = var130;

            for(var149 = 0; var149 < var13; ++var149) {
               var163[var149] = var159.g();
               if(var16 == 1) {
                  var156.j[var149] = var6.f();
                  if(var156.j[var149] == 2) {
                     var163[var149] = '\uffff';
                  }

                  var156.j[var149] = 0;
               }

               if(var3 == 255) {
                  var156.S[var149] = var7.f();
               }

               if(var15 == 1) {
                  var156.T[var149] = var8.f();
                  if(var156.T[var149] < 0) {
                     var156.T[var149] += 256;
                  }
               }

               if(var18 == 1) {
                  var156.aa[var149] = var9.e();
               }

               if(var100 == 1) {
                  var120[var149] = (short)(var10.g() - 1);
               }

               if(var110 != null) {
                  if(var120[var149] != -1) {
                     var110[var149] = (byte)(var160.e() - 1);
                  } else {
                     var110[var149] = -1;
                  }
               }
            }

            var159.b = var129;
            var6.b = var124;
            var149 = 0;
            var150 = 0;
            var151 = 0;
            var152 = 0;

            int var154;
            for(var153 = 0; var153 < var13; ++var153) {
               if((var154 = var6.e()) == 1) {
                  var152 = var149 = var159.p() + var152;
                  var152 = var150 = var159.p() + var152;
                  var152 = var151 = var159.p() + var152;
                  var140[var153] = var149;
                  var141[var153] = var150;
                  var142[var153] = var151;
               }

               if(var154 == 2) {
                  var150 = var151;
                  var152 = var151 = var159.p() + var152;
                  var140[var153] = var149;
                  var141[var153] = var150;
                  var142[var153] = var151;
               }

               if(var154 == 3) {
                  var149 = var151;
                  var152 = var151 = var159.p() + var152;
                  var140[var153] = var149;
                  var141[var153] = var150;
                  var142[var153] = var151;
               }

               if(var154 == 4) {
                  int var155 = var149;
                  var149 = var150;
                  var150 = var155;
                  var152 = var151 = var159.p() + var152;
                  var140[var153] = var149;
                  var141[var153] = var155;
                  var142[var153] = var151;
               }
            }

            var159.b = var104;
            var6.b = var107;
            var7.b = var133;
            var8.b = var134;
            var9.b = var135;
            var10.b = var136;

            for(var153 = 0; var153 < var14; ++var153) {
               if((var154 = var111[var153] & 255) == 0) {
                  var143[var153] = var159.g();
                  var144[var153] = var159.g();
                  var145[var153] = var159.g();
               }

               if(var154 == 1) {
                  var143[var153] = var6.g();
                  var144[var153] = var6.g();
                  var145[var153] = var6.g();
                  if(var4 < 15) {
                     var117[var153] = var7.g();
                     if(var4 >= 14) {
                        var119[var153] = var7.b();
                     } else {
                        var119[var153] = var7.g();
                     }

                     var118[var153] = var7.g();
                  } else {
                     var117[var153] = var7.b();
                     var119[var153] = var7.b();
                     var118[var153] = var7.b();
                  }

                  var115[var153] = var8.f();
                  var116[var153] = var9.f();
                  var113[var153] = var10.f();
               }

               if(var154 == 2) {
                  var143[var153] = var6.g();
                  var144[var153] = var6.g();
                  var145[var153] = var6.g();
                  if(var4 >= 15) {
                     var117[var153] = var7.b();
                     var119[var153] = var7.b();
                     var118[var153] = var7.b();
                  } else {
                     var117[var153] = var7.g();
                     if(var4 < 14) {
                        var119[var153] = var7.g();
                     } else {
                        var119[var153] = var7.b();
                     }

                     var118[var153] = var7.g();
                  }

                  var115[var153] = var8.f();
                  var116[var153] = var9.f();
                  var113[var153] = var10.f();
                  var114[var153] = var10.f();
                  var112[var153] = var10.f();
               }

               if(var154 == 3) {
                  var143[var153] = var6.g();
                  var144[var153] = var6.g();
                  var145[var153] = var6.g();
                  if(var4 < 15) {
                     var117[var153] = var7.g();
                     if(var4 < 14) {
                        var119[var153] = var7.g();
                     } else {
                        var119[var153] = var7.b();
                     }

                     var118[var153] = var7.g();
                  } else {
                     var117[var153] = var7.b();
                     var119[var153] = var7.b();
                     var118[var153] = var7.b();
                  }

                  var115[var153] = var8.f();
                  var116[var153] = var9.f();
                  var113[var153] = var10.f();
               }
            }

            if(var3 != 255) {
               for(var153 = 0; var153 < var13; ++var153) {
                  var156.S[var153] = var3;
               }
            }

            var156.k = var163;
            var156.b = var12;
            var156.f = var13;
            var156.c = var137;
            var156.d = var138;
            var156.e = var139;
            var156.g = var140;
            var156.h = var141;
            var156.i = var142;
         }
      } else {
         var156 = this;
         this.J = true;
         this.w = false;
         ++K;
         ModelHeader var5 = ab[var1];
         this.b = var5.b;
         this.f = var5.c;
         this.V = var5.d;
         this.c = new int[this.b];
         this.d = new int[this.b];
         this.e = new int[this.b];
         this.g = new int[this.f];
         this.h = new int[this.f];
         this.i = new int[this.f];
         this.W = new int[this.V];
         this.X = new int[this.V];
         this.Y = new int[this.V];
         if(var5.i >= 0) {
            this.Z = new int[this.b];
         }

         if(var5.m >= 0) {
            this.j = new int[this.f];
         }

         if(var5.n >= 0) {
            this.S = new int[this.f];
         } else {
            this.U = -var5.n - 1;
         }

         if(var5.o >= 0) {
            this.T = new int[this.f];
         }

         if(var5.p >= 0) {
            this.aa = new int[this.f];
         }

         this.k = new int[this.f];
         (var6 = new Buffer(var5.a)).b = 0;
         (var7 = new Buffer(var5.a)).b = var5.f;
         (var8 = new Buffer(var5.a)).b = var5.g;
         (var9 = new Buffer(var5.a)).b = var5.h;
         (var10 = new Buffer(var5.a)).b = var5.i;
         int var11 = 0;
         var12 = 0;
         var13 = 0;

         int var17;
         for(var14 = 0; var14 < var156.b; ++var14) {
            var15 = var6.e();
            var16 = 0;
            if((var15 & 1) != 0) {
               var16 = var7.p();
            }

            var17 = 0;
            if((var15 & 2) != 0) {
               var17 = var8.p();
            }

            var18 = 0;
            if((var15 & 4) != 0) {
               var18 = var9.p();
            }

            var156.c[var14] = var11 + var16;
            var156.d[var14] = var12 + var17;
            var156.e[var14] = var13 + var18;
            var11 = var156.c[var14];
            var12 = var156.d[var14];
            var13 = var156.e[var14];
            if(var156.Z != null) {
               var156.Z[var14] = var10.e();
            }
         }

         var6.b = var5.l;
         var7.b = var5.m;
         var8.b = var5.n;
         var9.b = var5.o;
         var10.b = var5.p;

         for(var14 = 0; var14 < var156.f; ++var14) {
            var156.k[var14] = var6.g();
            if(var156.j != null) {
               var156.j[var14] = var7.e();
            }

            if(var156.S != null) {
               var156.S[var14] = var8.e();
            }

            if(var156.T != null) {
               var156.T[var14] = var9.e();
            }

            if(var156.aa != null) {
               var156.aa[var14] = var10.e();
            }
         }

         var6.b = var5.j;
         var7.b = var5.k;
         var14 = 0;
         var15 = 0;
         var16 = 0;
         var17 = 0;

         for(var18 = 0; var18 < var156.f; ++var18) {
            if((var4 = var7.e()) == 1) {
               var17 = var14 = var6.p() + var17;
               var17 = var15 = var6.p() + var17;
               var17 = var16 = var6.p() + var17;
               var156.g[var18] = var14;
               var156.h[var18] = var15;
               var156.i[var18] = var16;
            }

            if(var4 == 2) {
               var15 = var16;
               var17 = var16 = var6.p() + var17;
               var156.g[var18] = var14;
               var156.h[var18] = var15;
               var156.i[var18] = var16;
            }

            if(var4 == 3) {
               var14 = var16;
               var17 = var16 = var6.p() + var17;
               var156.g[var18] = var14;
               var156.h[var18] = var15;
               var156.i[var18] = var16;
            }

            if(var4 == 4) {
               var3 = var14;
               var14 = var15;
               var15 = var3;
               var17 = var16 = var6.p() + var17;
               var156.g[var18] = var14;
               var156.h[var18] = var3;
               var156.i[var18] = var16;
            }
         }

         var6.b = var5.q;

         for(var18 = 0; var18 < var156.V; ++var18) {
            var156.W[var18] = var6.g();
            var156.X[var18] = var6.g();
            var156.Y[var18] = var6.g();
         }
      }

      if(F[var1]) {
         var158 = true;
         var156 = this;

         for(var3 = 0; var3 < var156.b; ++var3) {
            var156.c[var3] /= 4;
            var156.d[var3] /= 4;
            var156.e[var3] /= 4;
         }

         if(this.S != null) {
            for(var1 = 0; var1 < this.S.length; ++var1) {
               this.S[var1] = 10;
            }
         }
      }

   }

   public static void a(byte[] var0, int var1) {
      try {
         if(var0 == null) {
            ModelHeader var14;
            (var14 = ab[var1] = new ModelHeader()).b = 0;
            var14.c = 0;
            var14.d = 0;
         } else {
            Buffer var2;
            (var2 = new Buffer(var0)).b = var0.length - 18;
            ModelHeader var12;
            (var12 = ab[var1] = new ModelHeader()).a = var0;
            var12.b = var2.g();
            var12.c = var2.g();
            var12.d = var2.e();
            int var11 = var2.e();
            int var3 = var2.e();
            int var4 = var2.e();
            int var5 = var2.e();
            int var6 = var2.e();
            int var7 = var2.g();
            int var8 = var2.g();
            var2.g();
            int var13 = var2.g();
            var12.e = 0;
            int var9 = 0 + var12.b;
            var12.k = var9;
            var9 += var12.c;
            var12.n = var9;
            if(var3 == 255) {
               var9 += var12.c;
            } else {
               var12.n = -var3 - 1;
            }

            var12.p = var9;
            if(var5 == 1) {
               var9 += var12.c;
            } else {
               var12.p = -1;
            }

            var12.m = var9;
            if(var11 == 1) {
               var9 += var12.c;
            } else {
               var12.m = -1;
            }

            var12.i = var9;
            if(var6 == 1) {
               var9 += var12.b;
            } else {
               var12.i = -1;
            }

            var12.o = var9;
            if(var4 == 1) {
               var9 += var12.c;
            } else {
               var12.o = -1;
            }

            var12.j = var9;
            var9 += var13;
            var12.l = var9;
            var9 += var12.c << 1;
            var12.q = var9;
            var9 += var12.d * 6;
            var12.f = var9;
            var9 += var7;
            var12.g = var9;
            var9 += var8;
            var12.h = var9;
         }
      } catch (Exception var10) {
         ;
      }
   }

   public static void a(Provider var0) {
      ab = new ModelHeader[80000];
      F = new boolean[100000];
      ac = var0;
   }

   public static Model a(int var0) {
      if(ab == null) {
         return null;
      } else if(ab[var0] == null) {
         ac.a(var0);
         return null;
      } else {
         return new Model(var0);
      }
   }

   public static boolean b(int var0) {
      if(ab == null) {
         return false;
      } else if(ab[var0] == null) {
         ac.a(var0);
         return false;
      } else {
         return true;
      }
   }

   private Model(boolean var1) {
      this.J = true;
      this.w = false;
   }

   public Model(int var1, Model[] var2) {
      this.J = true;
      this.w = false;
      ++K;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      this.b = 0;
      this.f = 0;
      this.V = 0;
      this.U = -1;

      int var7;
      for(var7 = 0; var7 < var1; ++var7) {
         Model var8;
         if((var8 = var2[var7]) != null) {
            this.b += var8.b;
            this.f += var8.f;
            this.V += var8.V;
            var3 |= var8.j != null;
            if(var8.S != null) {
               var4 = true;
            } else {
               if(this.U == -1) {
                  this.U = var8.U;
               }

               if(this.U != var8.U) {
                  var4 = true;
               }
            }

            var5 |= var8.T != null;
            var6 |= var8.aa != null;
         }
      }

      this.c = new int[this.b];
      this.d = new int[this.b];
      this.e = new int[this.b];
      this.Z = new int[this.b];
      this.g = new int[this.f];
      this.h = new int[this.f];
      this.i = new int[this.f];
      this.W = new int[this.V];
      this.X = new int[this.V];
      this.Y = new int[this.V];
      if(var3) {
         this.j = new int[this.f];
      }

      if(var4) {
         this.S = new int[this.f];
      }

      if(var5) {
         this.T = new int[this.f];
      }

      if(var6) {
         this.aa = new int[this.f];
      }

      this.k = new int[this.f];
      this.b = 0;
      this.f = 0;
      this.V = 0;
      var7 = 0;

      for(int var12 = 0; var12 < var1; ++var12) {
         Model var9;
         if((var9 = var2[var12]) != null) {
            int var10;
            for(var10 = 0; var10 < var9.f; ++var10) {
               if(var3) {
                  if(var9.j == null) {
                     this.j[this.f] = 0;
                  } else {
                     int var11;
                     if(((var11 = var9.j[var10]) & 2) == 2) {
                        var11 += var7 << 2;
                     }

                     this.j[this.f] = var11;
                  }
               }

               if(var4) {
                  if(var9.S == null) {
                     this.S[this.f] = var9.U;
                  } else {
                     this.S[this.f] = var9.S[var10];
                  }
               }

               if(var5) {
                  if(var9.T == null) {
                     this.T[this.f] = 0;
                  } else {
                     this.T[this.f] = var9.T[var10];
                  }
               }

               if(var6 && var9.aa != null) {
                  this.aa[this.f] = var9.aa[var10];
               }

               this.k[this.f] = var9.k[var10];
               this.g[this.f] = this.a(var9, var9.g[var10]);
               this.h[this.f] = this.a(var9, var9.h[var10]);
               this.i[this.f] = this.a(var9, var9.i[var10]);
               ++this.f;
            }

            for(var10 = 0; var10 < var9.V; ++var10) {
               this.W[this.V] = this.a(var9, var9.W[var10]);
               this.X[this.V] = this.a(var9, var9.X[var10]);
               this.Y[this.V] = this.a(var9, var9.Y[var10]);
               ++this.V;
            }

            var7 += var9.V;
         }
      }

   }

   public Model(Model[] var1) {
      this.J = true;
      this.w = false;
      ++K;
      boolean var2 = false;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      this.b = 0;
      this.f = 0;
      this.V = 0;
      this.U = -1;

      int var6;
      for(var6 = 0; var6 < 2; ++var6) {
         Model var7;
         if((var7 = var1[var6]) != null) {
            this.b += var7.b;
            this.f += var7.f;
            this.V += var7.V;
            var2 |= var7.j != null;
            if(var7.S != null) {
               var3 = true;
            } else {
               if(this.U == -1) {
                  this.U = var7.U;
               }

               if(this.U != var7.U) {
                  var3 = true;
               }
            }

            var4 |= var7.T != null;
            var5 |= var7.k != null;
         }
      }

      this.c = new int[this.b];
      this.d = new int[this.b];
      this.e = new int[this.b];
      this.g = new int[this.f];
      this.h = new int[this.f];
      this.i = new int[this.f];
      this.P = new int[this.f];
      this.Q = new int[this.f];
      this.R = new int[this.f];
      this.W = new int[this.V];
      this.X = new int[this.V];
      this.Y = new int[this.V];
      if(var2) {
         this.j = new int[this.f];
      }

      if(var3) {
         this.S = new int[this.f];
      }

      if(var4) {
         this.T = new int[this.f];
      }

      if(var5) {
         this.k = new int[this.f];
      }

      this.b = 0;
      this.f = 0;
      this.V = 0;
      var6 = 0;

      for(int var12 = 0; var12 < 2; ++var12) {
         Model var8;
         if((var8 = var1[var12]) != null) {
            int var9 = this.b;

            int var10;
            for(var10 = 0; var10 < var8.b; ++var10) {
               this.c[this.b] = var8.c[var10];
               this.d[this.b] = var8.d[var10];
               this.e[this.b] = var8.e[var10];
               ++this.b;
            }

            for(var10 = 0; var10 < var8.f; ++var10) {
               this.g[this.f] = var8.g[var10] + var9;
               this.h[this.f] = var8.h[var10] + var9;
               this.i[this.f] = var8.i[var10] + var9;
               this.P[this.f] = var8.P[var10];
               this.Q[this.f] = var8.Q[var10];
               this.R[this.f] = var8.R[var10];
               if(var2) {
                  if(var8.j == null) {
                     this.j[this.f] = 0;
                  } else {
                     int var11;
                     if(((var11 = var8.j[var10]) & 2) == 2) {
                        var11 += var6 << 2;
                     }

                     this.j[this.f] = var11;
                  }
               }

               if(var3) {
                  if(var8.S == null) {
                     this.S[this.f] = var8.U;
                  } else {
                     this.S[this.f] = var8.S[var10];
                  }
               }

               if(var4) {
                  if(var8.T == null) {
                     this.T[this.f] = 0;
                  } else {
                     this.T[this.f] = var8.T[var10];
                  }
               }

               if(var5 && var8.k != null) {
                  this.k[this.f] = var8.k[var10];
               }

               ++this.f;
            }

            for(var10 = 0; var10 < var8.V; ++var10) {
               this.W[this.V] = var8.W[var10] + var9;
               this.X[this.V] = var8.X[var10] + var9;
               this.Y[this.V] = var8.Y[var10] + var9;
               ++this.V;
            }

            var6 += var8.V;
         }
      }

      this.c();
   }

   public Model(boolean var1, boolean var2, boolean var3, Model var4) {
      this.J = true;
      this.w = false;
      ++K;
      this.b = var4.b;
      this.f = var4.f;
      this.V = var4.V;
      int var5;
      if(var3) {
         this.c = var4.c;
         this.d = var4.d;
         this.e = var4.e;
      } else {
         this.c = new int[this.b];
         this.d = new int[this.b];
         this.e = new int[this.b];

         for(var5 = 0; var5 < this.b; ++var5) {
            this.c[var5] = var4.c[var5];
            this.d[var5] = var4.d[var5];
            this.e[var5] = var4.e[var5];
         }
      }

      if(var1) {
         this.k = var4.k;
      } else {
         this.k = new int[this.f];

         for(var5 = 0; var5 < this.f; ++var5) {
            this.k[var5] = var4.k[var5];
         }
      }

      if(var2) {
         this.T = var4.T;
      } else {
         this.T = new int[this.f];
         if(var4.T == null) {
            for(var5 = 0; var5 < this.f; ++var5) {
               this.T[var5] = 0;
            }
         } else {
            for(var5 = 0; var5 < this.f; ++var5) {
               this.T[var5] = var4.T[var5];
            }
         }
      }

      this.Z = var4.Z;
      this.aa = var4.aa;
      this.j = var4.j;
      this.g = var4.g;
      this.h = var4.h;
      this.i = var4.i;
      this.S = var4.S;
      this.U = var4.U;
      this.W = var4.W;
      this.X = var4.X;
      this.Y = var4.Y;
   }

   public Model(boolean var1, boolean var2, Model var3) {
      this.J = true;
      this.w = false;
      ++K;
      this.b = var3.b;
      this.f = var3.f;
      this.V = var3.V;
      int var5;
      if(var1) {
         this.d = new int[this.b];

         for(var5 = 0; var5 < this.b; ++var5) {
            this.d[var5] = var3.d[var5];
         }
      } else {
         this.d = var3.d;
      }

      if(var2) {
         this.P = new int[this.f];
         this.Q = new int[this.f];
         this.R = new int[this.f];

         for(var5 = 0; var5 < this.f; ++var5) {
            this.P[var5] = var3.P[var5];
            this.Q[var5] = var3.Q[var5];
            this.R[var5] = var3.R[var5];
         }

         this.j = new int[this.f];
         if(var3.j == null) {
            for(var5 = 0; var5 < this.f; ++var5) {
               this.j[var5] = 0;
            }
         } else {
            for(var5 = 0; var5 < this.f; ++var5) {
               this.j[var5] = var3.j[var5];
            }
         }

         super.aD = new VertexNormal[this.b];

         for(var5 = 0; var5 < this.b; ++var5) {
            VertexNormal var6 = super.aD[var5] = new VertexNormal();
            VertexNormal var4 = var3.aD[var5];
            var6.a = var4.a;
            var6.b = var4.b;
            var6.c = var4.c;
            var6.d = var4.d;
         }

         this.x = var3.x;
      } else {
         this.P = var3.P;
         this.Q = var3.Q;
         this.R = var3.R;
         this.j = var3.j;
      }

      this.c = var3.c;
      this.e = var3.e;
      this.k = var3.k;
      this.T = var3.T;
      this.S = var3.S;
      this.U = var3.U;
      this.g = var3.g;
      this.h = var3.h;
      this.i = var3.i;
      this.W = var3.W;
      this.X = var3.X;
      this.Y = var3.Y;
      super.aE = var3.aE;
      this.p = var3.p;
      this.s = var3.s;
      this.r = var3.r;
      this.l = var3.l;
      this.n = var3.n;
      this.o = var3.o;
      this.m = var3.m;
   }

   public final void a(Model var1, boolean var2) {
      this.b = var1.b;
      this.f = var1.f;
      this.V = var1.V;
      if(L.length < this.b) {
         L = new int[this.b + 10000];
         M = new int[this.b + 10000];
         N = new int[this.b + 10000];
      }

      this.c = L;
      this.d = M;
      this.e = N;

      int var3;
      for(var3 = 0; var3 < this.b; ++var3) {
         this.c[var3] = var1.c[var3];
         this.d[var3] = var1.d[var3];
         this.e[var3] = var1.e[var3];
      }

      if(var2) {
         this.T = var1.T;
      } else {
         if(O.length < this.f) {
            O = new int[this.f + 100];
         }

         this.T = O;
         if(var1.T == null) {
            for(var3 = 0; var3 < this.f; ++var3) {
               this.T[var3] = 0;
            }
         } else {
            for(var3 = 0; var3 < this.f; ++var3) {
               this.T[var3] = var1.T[var3];
            }
         }
      }

      this.j = var1.j;
      this.k = var1.k;
      this.S = var1.S;
      this.U = var1.U;
      this.v = var1.v;
      this.u = var1.u;
      this.g = var1.g;
      this.h = var1.h;
      this.i = var1.i;
      this.P = var1.P;
      this.Q = var1.Q;
      this.R = var1.R;
      this.W = var1.W;
      this.X = var1.X;
      this.Y = var1.Y;
   }

   private final int a(Model var1, int var2) {
      int var3 = -1;
      int var4 = var1.c[var2];
      int var5 = var1.d[var2];
      int var6 = var1.e[var2];

      for(int var7 = 0; var7 < this.b; ++var7) {
         if(var4 == this.c[var7] && var5 == this.d[var7] && var6 == this.e[var7]) {
            var3 = var7;
            break;
         }
      }

      if(var3 == -1) {
         this.c[this.b] = var4;
         this.d[this.b] = var5;
         this.e[this.b] = var6;
         if(var1.Z != null) {
            this.Z[this.b] = var1.Z[var2];
         }

         var3 = this.b++;
      }

      return var3;
   }

   public final void c() {
      super.aE = 0;
      this.p = 0;
      this.q = 0;

      for(int var1 = 0; var1 < this.b; ++var1) {
         int var2 = this.c[var1];
         int var3 = this.d[var1];
         int var4 = this.e[var1];
         if(-var3 > super.aE) {
            super.aE = -var3;
         }

         if(var3 > this.q) {
            this.q = var3;
         }

         if((var2 = var2 * var2 + var4 * var4) > this.p) {
            this.p = var2;
         }
      }

      this.p = (int)(Math.sqrt((double)this.p) + 0.99D);
      this.s = (int)(Math.sqrt((double)(this.p * this.p + super.aE * super.aE)) + 0.99D);
      this.r = this.s + (int)(Math.sqrt((double)(this.p * this.p + this.q * this.q)) + 0.99D);
   }

   public final void d() {
      int[] var1;
      int var2;
      int var3;
      int var4;
      if(this.Z != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.b; ++var3) {
            var4 = this.Z[var3];
            ++var1[var4];
            if(var4 > var2) {
               var2 = var4;
            }
         }

         this.u = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.u[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.b; this.u[var4][var1[var4]++] = var3++) {
            var4 = this.Z[var3];
         }

         this.Z = null;
      }

      if(this.aa != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.f; ++var3) {
            var4 = this.aa[var3];
            ++var1[var4];
            if(var4 > var2) {
               var2 = var4;
            }
         }

         this.v = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.v[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.f; this.v[var4][var1[var4]++] = var3++) {
            var4 = this.aa[var3];
         }

         this.aa = null;
      }

   }

   public final void c(int var1) {
      if(this.u != null) {
         if(var1 != -1) {
            Frame var5;
            if((var5 = Frame.a(var1)) != null) {
               Class5 var2 = var5.b;
               av = 0;
               aw = 0;
               ax = 0;

               for(int var3 = 0; var3 < var5.c; ++var3) {
                  int var4 = var5.d[var3];
                  this.a(var2.a[var4], var2.b[var4], var5.e[var3], var5.f[var3], var5.g[var3]);
               }

            }
         }
      }
   }

   public final void a(int[] var1, int var2, int var3) {
      if(var3 != -1) {
         if(var1 != null && var2 != -1) {
            Frame var4;
            if((var4 = Frame.a(var3)) != null) {
               Frame var9;
               if((var9 = Frame.a(var2)) == null) {
                  this.c(var3);
               } else {
                  Class5 var10 = var4.b;
                  av = 0;
                  aw = 0;
                  ax = 0;
                  byte var5 = 0;
                  int var11 = var5 + 1;
                  int var6 = var1[0];

                  int var7;
                  int var8;
                  for(var7 = 0; var7 < var4.c; ++var7) {
                     for(var8 = var4.d[var7]; var8 > var6; var6 = var1[var11++]) {
                        ;
                     }

                     if(var8 != var6 || var10.a[var8] == 0) {
                        this.a(var10.a[var8], var10.b[var8], var4.e[var7], var4.f[var7], var4.g[var7]);
                     }
                  }

                  av = 0;
                  aw = 0;
                  ax = 0;
                  var5 = 0;
                  var11 = var5 + 1;
                  var6 = var1[0];

                  for(var7 = 0; var7 < var9.c; ++var7) {
                     for(var8 = var9.d[var7]; var8 > var6; var6 = var1[var11++]) {
                        ;
                     }

                     if(var8 == var6 || var10.a[var8] == 0) {
                        this.a(var10.a[var8], var10.b[var8], var9.e[var7], var9.f[var7], var9.g[var7]);
                     }
                  }

               }
            }
         } else {
            this.c(var3);
         }
      }
   }

   private void a(int var1, int[] var2, int var3, int var4, int var5) {
      int var6 = var2.length;
      int var7;
      int var10;
      int var11;
      if(var1 == 0) {
         var1 = 0;
         av = 0;
         aw = 0;
         ax = 0;

         for(var7 = 0; var7 < var6; ++var7) {
            int var15;
            if((var15 = var2[var7]) < this.u.length) {
               int[] var16 = this.u[var15];

               for(var10 = 0; var10 < var16.length; ++var10) {
                  var11 = var16[var10];
                  av += this.c[var11];
                  aw += this.d[var11];
                  ax += this.e[var11];
                  ++var1;
               }
            }
         }

         if(var1 > 0) {
            av = av / var1 + var3;
            aw = aw / var1 + var4;
            ax = ax / var1 + var5;
         } else {
            av = var3;
            aw = var4;
            ax = var5;
         }
      } else {
         int[] var8;
         int var9;
         if(var1 == 1) {
            for(var1 = 0; var1 < var6; ++var1) {
               if((var7 = var2[var1]) < this.u.length) {
                  var8 = this.u[var7];

                  for(var9 = 0; var9 < var8.length; ++var9) {
                     var10 = var8[var9];
                     this.c[var10] += var3;
                     this.d[var10] += var4;
                     this.e[var10] += var5;
                  }
               }
            }

         } else if(var1 == 2) {
            for(var1 = 0; var1 < var6; ++var1) {
               if((var7 = var2[var1]) < this.u.length) {
                  var8 = this.u[var7];

                  for(var9 = 0; var9 < var8.length; ++var9) {
                     var10 = var8[var9];
                     this.c[var10] -= av;
                     this.d[var10] -= aw;
                     this.e[var10] -= ax;
                     var11 = (var3 & 255) << 3;
                     var7 = (var4 & 255) << 3;
                     int var12;
                     int var13;
                     int var14;
                     if((var12 = (var5 & 255) << 3) != 0) {
                        var13 = D[var12];
                        var12 = E[var12];
                        var14 = this.d[var10] * var13 + this.c[var10] * var12 >> 16;
                        this.d[var10] = this.d[var10] * var12 - this.c[var10] * var13 >> 16;
                        this.c[var10] = var14;
                     }

                     if(var11 != 0) {
                        var13 = D[var11];
                        var12 = E[var11];
                        var14 = this.d[var10] * var12 - this.e[var10] * var13 >> 16;
                        this.e[var10] = this.d[var10] * var13 + this.e[var10] * var12 >> 16;
                        this.d[var10] = var14;
                     }

                     if(var7 != 0) {
                        var13 = D[var7];
                        var12 = E[var7];
                        var14 = this.e[var10] * var13 + this.c[var10] * var12 >> 16;
                        this.e[var10] = this.e[var10] * var12 - this.c[var10] * var13 >> 16;
                        this.c[var10] = var14;
                     }

                     this.c[var10] += av;
                     this.d[var10] += aw;
                     this.e[var10] += ax;
                  }
               }
            }

         } else if(var1 == 3) {
            for(var1 = 0; var1 < var6; ++var1) {
               if((var7 = var2[var1]) < this.u.length) {
                  var8 = this.u[var7];

                  for(var9 = 0; var9 < var8.length; ++var9) {
                     var10 = var8[var9];
                     this.c[var10] -= av;
                     this.d[var10] -= aw;
                     this.e[var10] -= ax;
                     this.c[var10] = this.c[var10] * var3 / 128;
                     this.d[var10] = this.d[var10] * var4 / 128;
                     this.e[var10] = this.e[var10] * var5 / 128;
                     this.c[var10] += av;
                     this.d[var10] += aw;
                     this.e[var10] += ax;
                  }
               }
            }

         } else {
            if(var1 == 5 && this.v != null && this.T != null) {
               for(var1 = 0; var1 < var6; ++var1) {
                  if((var7 = var2[var1]) < this.v.length) {
                     var8 = this.v[var7];

                     for(var9 = 0; var9 < var8.length; ++var9) {
                        var10 = var8[var9];
                        this.T[var10] += var3 << 3;
                        if(this.T[var10] < 0) {
                           this.T[var10] = 0;
                        }

                        if(this.T[var10] > 255) {
                           this.T[var10] = 255;
                        }
                     }
                  }
               }
            }

         }
      }
   }

   public final void e() {
      for(int var1 = 0; var1 < this.b; ++var1) {
         int var2 = this.c[var1];
         this.c[var1] = this.e[var1];
         this.e[var1] = -var2;
      }

   }

   public final void a(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.b; ++var4) {
         this.c[var4] += var1;
         this.d[var4] += var2;
         this.e[var4] += var3;
      }

   }

   public final void a(int var1, int var2) {
      for(int var3 = 0; var3 < this.f; ++var3) {
         if(this.k[var3] == var1) {
            this.k[var3] = var2;
         }
      }

   }

   public final void f() {
      int var1;
      for(var1 = 0; var1 < this.b; ++var1) {
         this.e[var1] = -this.e[var1];
      }

      for(var1 = 0; var1 < this.f; ++var1) {
         int var2 = this.g[var1];
         this.g[var1] = this.i[var1];
         this.i[var1] = var2;
      }

   }

   public final void b(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.b; ++var4) {
         this.c[var4] = this.c[var4] * var1 / 128;
         this.d[var4] = this.d[var4] * var3 / 128;
         this.e[var4] = this.e[var4] * var2 / 128;
      }

   }

   public final void a(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
      var2 = var2 * var7 >> 8;
      if(this.P == null) {
         this.P = new int[this.f];
         this.Q = new int[this.f];
         this.R = new int[this.f];
      }

      if(super.aD == null) {
         super.aD = new VertexNormal[this.b];

         for(var7 = 0; var7 < this.b; ++var7) {
            super.aD[var7] = new VertexNormal();
         }
      }

      VertexNormal var20;
      for(var7 = 0; var7 < this.f; ++var7) {
         if(this.k != null && this.T != null && (this.k[var7] == '\uffff' || this.k[var7] == 16705)) {
            this.T[var7] = 255;
         }

         int var8 = this.g[var7];
         int var9 = this.h[var7];
         int var10 = this.i[var7];
         int var11 = this.c[var9] - this.c[var8];
         int var12 = this.d[var9] - this.d[var8];
         int var13 = this.e[var9] - this.e[var8];
         int var14 = this.c[var10] - this.c[var8];
         int var15 = this.d[var10] - this.d[var8];
         int var16 = this.e[var10] - this.e[var8];
         int var17 = var12 * var16 - var15 * var13;
         var13 = var13 * var14 - var16 * var11;

         for(var11 = var11 * var15 - var14 * var12; var17 > 8192 || var13 > 8192 || var11 > 8192 || var17 < -8192 || var13 < -8192 || var11 < -8192; var11 >>= 1) {
            var17 >>= 1;
            var13 >>= 1;
         }

         if((var12 = (int)Math.sqrt((double)(var17 * var17 + var13 * var13 + var11 * var11))) <= 0) {
            var12 = 1;
         }

         var17 = (var17 << 8) / var12;
         var13 = (var13 << 8) / var12;
         var11 = (var11 << 8) / var12;
         if(this.j != null && (this.j[var7] & 1) != 0) {
            var8 = var1 + (var3 * var17 + var4 * var13 + var5 * var11) / (var2 + var2 / 2);
            this.P[var7] = c(this.k[var7], var8, this.j[var7]);
         } else {
            VertexNormal var10000 = var20 = super.aD[var8];
            var10000.a += var17;
            var20.b += var13;
            var20.c += var11;
            ++var20.d;
            var10000 = var20 = super.aD[var9];
            var10000.a += var17;
            var20.b += var13;
            var20.c += var11;
            ++var20.d;
            var10000 = var20 = super.aD[var10];
            var10000.a += var17;
            var20.b += var13;
            var20.c += var11;
            ++var20.d;
         }
      }

      if(var6) {
         this.a(var1, var2, var3, var4, var5);
      } else {
         this.x = new VertexNormal[this.b];

         for(var7 = 0; var7 < this.b; ++var7) {
            var20 = super.aD[var7];
            VertexNormal var21;
            (var21 = this.x[var7] = new VertexNormal()).a = var20.a;
            var21.b = var20.b;
            var21.c = var20.c;
            var21.d = var20.d;
         }
      }

      if(var6) {
         this.c();
      } else {
         boolean var18 = true;
         Model var19 = this;
         super.aE = 0;
         this.p = 0;
         this.q = 0;
         this.l = 999999;
         this.m = -999999;
         this.n = -99999;
         this.o = 99999;

         for(var2 = 0; var2 < var19.b; ++var2) {
            var3 = var19.c[var2];
            var4 = var19.d[var2];
            var5 = var19.e[var2];
            if(var3 < var19.l) {
               var19.l = var3;
            }

            if(var3 > var19.m) {
               var19.m = var3;
            }

            if(var5 < var19.o) {
               var19.o = var5;
            }

            if(var5 > var19.n) {
               var19.n = var5;
            }

            if(-var4 > var19.aE) {
               var19.aE = -var4;
            }

            if(var4 > var19.q) {
               var19.q = var4;
            }

            if((var3 = var3 * var3 + var5 * var5) > var19.p) {
               var19.p = var3;
            }
         }

         var19.p = (int)Math.sqrt((double)var19.p);
         var19.s = (int)Math.sqrt((double)(var19.p * var19.p + var19.aE * var19.aE));
         var19.r = var19.s + (int)Math.sqrt((double)(var19.p * var19.p + var19.q * var19.q));
      }
   }

   public final void a(int var1, int var2, int var3, int var4, int var5) {
      int var6;
      for(var6 = 0; var6 < this.f; ++var6) {
         int var7 = this.g[var6];
         int var8 = this.h[var6];
         int var9 = this.i[var6];
         int var10;
         if(this.j == null) {
            var10 = this.k[var6];
            VertexNormal var11 = super.aD[var7];
            var7 = var1 + (var3 * var11.a + var4 * var11.b + var5 * var11.c) / (var2 * var11.d);
            this.P[var6] = c(var10, var7, 0);
            var11 = super.aD[var8];
            var7 = var1 + (var3 * var11.a + var4 * var11.b + var5 * var11.c) / (var2 * var11.d);
            this.Q[var6] = c(var10, var7, 0);
            var11 = super.aD[var9];
            var7 = var1 + (var3 * var11.a + var4 * var11.b + var5 * var11.c) / (var2 * var11.d);
            this.R[var6] = c(var10, var7, 0);
         } else if((this.j[var6] & 1) == 0) {
            var10 = this.k[var6];
            int var13 = this.j[var6];
            VertexNormal var12 = super.aD[var7];
            var7 = var1 + (var3 * var12.a + var4 * var12.b + var5 * var12.c) / (var2 * var12.d);
            this.P[var6] = c(var10, var7, var13);
            var12 = super.aD[var8];
            var7 = var1 + (var3 * var12.a + var4 * var12.b + var5 * var12.c) / (var2 * var12.d);
            this.Q[var6] = c(var10, var7, var13);
            var12 = super.aD[var9];
            var7 = var1 + (var3 * var12.a + var4 * var12.b + var5 * var12.c) / (var2 * var12.d);
            this.R[var6] = c(var10, var7, var13);
         }
      }

      super.aD = null;
      this.x = null;
      this.Z = null;
      this.aa = null;
      if(this.j != null) {
         for(var6 = 0; var6 < this.f; ++var6) {
            if((this.j[var6] & 2) == 2) {
               return;
            }
         }
      }

      this.k = null;
   }

   private static int c(int var0, int var1, int var2) {
      if(var0 == '\uffff') {
         return 0;
      } else if((var2 & 2) == 2) {
         if(var1 < 0) {
            var1 = 0;
         } else if(var1 > 127) {
            var1 = 127;
         }

         return var1 = 127 - var1;
      } else {
         if((var1 = var1 * (var0 & 127) >> 7) < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return (var0 & '\uff80') + var1;
      }
   }

   public final void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = Rasterizer3D.e;
      int var8 = Rasterizer3D.f;
      int var9 = D[var1];
      int var10 = E[var1];
      int var11 = D[var2];
      int var12 = E[var2];
      int var13 = D[var3];
      var3 = E[var3];
      int var14 = var5 * var13 + var6 * var3 >> 16;

      for(int var15 = 0; var15 < this.b; ++var15) {
         int var16 = this.c[var15];
         int var17 = this.d[var15];
         int var18 = this.e[var15];
         int var19;
         if(var2 != 0) {
            var19 = var17 * var11 + var16 * var12 >> 16;
            var17 = var17 * var12 - var16 * var11 >> 16;
            var16 = var19;
         }

         if(var1 != 0) {
            var19 = var18 * var9 + var16 * var10 >> 16;
            var18 = var18 * var10 - var16 * var9 >> 16;
            var16 = var19;
         }

         var16 += var4;
         var17 += var5;
         var18 += var6;
         var19 = var17 * var3 - var18 * var13 >> 16;
         var18 = var17 * var13 + var18 * var3 >> 16;
         ah[var15] = var18 - var14;
         af[var15] = var7 + (var16 << 9) / var18;
         ag[var15] = var8 + (var19 << 9) / var18;
         if(this.V > 0) {
            ai[var15] = var16;
            aj[var15] = var19;
            ak[var15] = var18;
         }
      }

      try {
         this.a(false, false, 0);
      } catch (Exception var20) {
         ;
      }
   }

   public final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = var8 * var5 - var6 * var4 >> 16;
      int var11 = var7 * var2 + var10 * var3 >> 16;
      int var12 = this.p * var3 >> 16;
      int var13;
      if((var13 = var11 + var12) > 50 && var11 < 3500) {
         int var14;
         int var15;
         if((var15 = (var14 = var8 * var4 + var6 * var5 >> 16) - this.p << Client.d) / var13 < Rasterizer2D.p) {
            int var16;
            if((var16 = var14 + this.p << Client.d) / var13 > -Rasterizer2D.p) {
               var10 = var7 * var3 - var10 * var2 >> 16;
               int var17 = this.p * var2 >> 16;
               int var18;
               if((var18 = var10 + var17 << Client.d) / var13 > -Rasterizer2D.q) {
                  var17 += super.aE * var3 >> 16;
                  if((var17 = var10 - var17 << Client.d) / var13 < Rasterizer2D.q) {
                     int var19 = var12 + (super.aE * var2 >> 16);
                     boolean var20 = false;
                     if(var11 - var19 <= 50) {
                        var20 = true;
                     }

                     boolean var23 = false;
                     if(var9 > 0 && y) {
                        if((var12 = var11 - var12) <= 50) {
                           var12 = 50;
                        }

                        if(var14 > 0) {
                           var15 /= var13;
                           var16 /= var12;
                        } else {
                           var16 /= var13;
                           var15 /= var12;
                        }

                        if(var10 > 0) {
                           var17 /= var13;
                           var18 /= var12;
                        } else {
                           var18 /= var13;
                           var17 /= var12;
                        }

                        var10 = z - Rasterizer3D.e;
                        var13 = A - Rasterizer3D.f;
                        if(var10 > var15 && var10 < var16 && var13 > var17 && var13 < var18) {
                           if(this.w) {
                              C[B++] = var9;
                           } else {
                              var23 = true;
                           }
                        }
                     }

                     var12 = Rasterizer3D.e;
                     var10 = Rasterizer3D.f;
                     var13 = 0;
                     var14 = 0;
                     if(var1 != 0) {
                        var13 = D[var1];
                        var14 = E[var1];
                     }

                     for(var15 = 0; var15 < this.b; ++var15) {
                        var16 = this.c[var15];
                        var17 = this.d[var15];
                        var18 = this.e[var15];
                        int var21;
                        if(var1 != 0) {
                           var21 = var18 * var13 + var16 * var14 >> 16;
                           var18 = var18 * var14 - var16 * var13 >> 16;
                           var16 = var21;
                        }

                        var16 += var6;
                        var17 += var7;
                        var21 = (var18 += var8) * var4 + var16 * var5 >> 16;
                        var18 = var18 * var5 - var16 * var4 >> 16;
                        var16 = var21;
                        var21 = var17 * var3 - var18 * var2 >> 16;
                        var18 = var17 * var2 + var18 * var3 >> 16;
                        ah[var15] = var18 - var11;
                        if(var18 >= 50) {
                           af[var15] = var12 + (var16 << Client.d) / var18;
                           ag[var15] = var10 + (var21 << Client.d) / var18;
                        } else {
                           af[var15] = -5000;
                           var20 = true;
                        }

                        if(var20 || this.V > 0) {
                           ai[var15] = var16;
                           aj[var15] = var21;
                           ak[var15] = var18;
                        }
                     }

                     try {
                        this.a(var20, var23, var9);
                     } catch (Exception var22) {
                        ;
                     }
                  }
               }
            }
         }
      }
   }

   private final void a(boolean var1, boolean var2, int var3) {
      int var4;
      for(var4 = 0; var4 < this.r; ++var4) {
         al[var4] = 0;
      }

      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      int var17;
      int var18;
      for(var4 = 0; var4 < this.f; ++var4) {
         if(this.j == null || this.j[var4] != -1) {
            var5 = this.g[var4];
            var6 = this.h[var4];
            var7 = this.i[var4];
            var8 = af[var5];
            var9 = af[var6];
            var10 = af[var7];
            if(!var1 || var8 != -5000 && var9 != -5000 && var10 != -5000) {
               if(var2) {
                  int var10002 = ag[var5];
                  int var10003 = ag[var6];
                  int var14 = ag[var7];
                  int var15 = var10003;
                  int var16 = var10002;
                  var17 = A;
                  var18 = z;
                  if(var17 < var16 && var17 < var15 && var17 < var14?false:(var17 > var16 && var17 > var15 && var17 > var14?false:(var18 < var8 && var18 < var9 && var18 < var10?false:var18 <= var8 || var18 <= var9 || var18 <= var10))) {
                     C[B++] = var3;
                     var2 = false;
                  }
               }

               if((var8 - var9) * (ag[var7] - ag[var6]) - (ag[var5] - ag[var6]) * (var10 - var9) <= 0) {
                  continue;
               }

               ae[var4] = false;
               if(var8 >= 0 && var9 >= 0 && var10 >= 0 && var8 <= Rasterizer2D.o && var9 <= Rasterizer2D.o && var10 <= Rasterizer2D.o) {
                  ad[var4] = false;
               } else {
                  ad[var4] = true;
               }
            } else {
               ae[var4] = true;
            }

            var18 = (ah[var5] + ah[var6] + ah[var7]) / 3 + this.s;
            am[var18][al[var18]++] = var4;
         }
      }

      int[] var22;
      if(this.S == null) {
         for(var4 = this.r - 1; var4 >= 0; --var4) {
            if((var5 = al[var4]) > 0) {
               var22 = am[var4];

               for(var7 = 0; var7 < var5; ++var7) {
                  this.d(var22[var7]);
               }
            }
         }

      } else {
         for(var4 = 0; var4 < 12; ++var4) {
            an[var4] = 0;
            ar[var4] = 0;
         }

         for(var4 = this.r - 1; var4 >= 0; --var4) {
            if((var5 = al[var4]) > 0) {
               var22 = am[var4];

               for(var7 = 0; var7 < var5; ++var7) {
                  var8 = var22[var7];
                  var9 = this.S[var8];
                  var10 = an[var9]++;
                  ao[var9][var10] = var8;
                  if(var9 < 10) {
                     ar[var9] += var4;
                  } else if(var9 == 10) {
                     ap[var10] = var4;
                  } else {
                     aq[var10] = var4;
                  }
               }
            }
         }

         var4 = 0;
         if(an[1] > 0 || an[2] > 0) {
            var4 = (ar[1] + ar[2]) / (an[1] + an[2]);
         }

         var5 = 0;
         if(an[3] > 0 || an[4] > 0) {
            var5 = (ar[3] + ar[4]) / (an[3] + an[4]);
         }

         var6 = 0;
         if(an[6] > 0 || an[8] > 0) {
            var6 = (ar[6] + ar[8]) / (an[6] + an[8]);
         }

         var7 = 0;
         var8 = an[10];
         int[] var23 = ao[10];
         int[] var24 = ap;
         if(var8 == 0) {
            var7 = 0;
            var8 = an[11];
            var23 = ao[11];
            var24 = aq;
         }

         if(var8 > 0) {
            var18 = var24[0];
         } else {
            var18 = -1000;
         }

         for(int var19 = 0; var19 < 10; ++var19) {
            while(var19 == 0 && var18 > var4) {
               this.d(var23[var7++]);
               if(var7 == var8 && var23 != ao[11]) {
                  var7 = 0;
                  var8 = an[11];
                  var23 = ao[11];
                  var24 = aq;
               }

               if(var7 < var8) {
                  var18 = var24[var7];
               } else {
                  var18 = -1000;
               }
            }

            while(var19 == 3 && var18 > var5) {
               this.d(var23[var7++]);
               if(var7 == var8 && var23 != ao[11]) {
                  var7 = 0;
                  var8 = an[11];
                  var23 = ao[11];
                  var24 = aq;
               }

               if(var7 < var8) {
                  var18 = var24[var7];
               } else {
                  var18 = -1000;
               }
            }

            while(var19 == 5 && var18 > var6) {
               this.d(var23[var7++]);
               if(var7 == var8 && var23 != ao[11]) {
                  var7 = 0;
                  var8 = an[11];
                  var23 = ao[11];
                  var24 = aq;
               }

               if(var7 < var8) {
                  var18 = var24[var7];
               } else {
                  var18 = -1000;
               }
            }

            int var20 = an[var19];
            int[] var21 = ao[var19];

            for(var17 = 0; var17 < var20; ++var17) {
               this.d(var21[var17]);
            }
         }

         while(var18 != -1000) {
            this.d(var23[var7++]);
            if(var7 == var8 && var23 != ao[11]) {
               var7 = 0;
               var23 = ao[11];
               var8 = an[11];
               var24 = aq;
            }

            if(var7 < var8) {
               var18 = var24[var7];
            } else {
               var18 = -1000;
            }
         }

      }
   }

   private final void d(int var1) {
      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      if(!ae[var1]) {
         int var2 = this.g[var1];
         var3 = this.h[var1];
         var4 = this.i[var1];
         Rasterizer3D.b = ad[var1];
         if(this.T == null) {
            Rasterizer3D.d = 0;
         } else {
            Rasterizer3D.d = this.T[var1];
         }

         if(this.j == null) {
            var5 = 0;
         } else {
            var5 = this.j[var1] & 3;
         }

         if(var5 == 0) {
            Rasterizer3D.a(ag[var2], ag[var3], ag[var4], af[var2], af[var3], af[var4], this.P[var1], this.Q[var1], this.R[var1]);
         } else if(var5 == 1) {
            Rasterizer3D.a(ag[var2], ag[var3], ag[var4], af[var2], af[var3], af[var4], ay[this.P[var1]]);
         } else if(var5 == 2) {
            var5 = this.j[var1] >> 2;
            var6 = this.W[var5];
            var7 = this.X[var5];
            var5 = this.Y[var5];
            Rasterizer3D.a(ag[var2], ag[var3], ag[var4], af[var2], af[var3], af[var4], this.P[var1], this.Q[var1], this.R[var1], ai[var6], ai[var7], ai[var5], aj[var6], aj[var7], aj[var5], ak[var6], ak[var7], ak[var5], this.k[var1]);
         } else {
            if(var5 == 3) {
               var5 = this.j[var1] >> 2;
               var6 = this.W[var5];
               var7 = this.X[var5];
               var5 = this.Y[var5];
               Rasterizer3D.a(ag[var2], ag[var3], ag[var4], af[var2], af[var3], af[var4], this.P[var1], this.P[var1], this.P[var1], ai[var6], ai[var7], ai[var5], aj[var6], aj[var7], aj[var5], ak[var6], ak[var7], ak[var5], this.k[var1]);
            }

         }
      } else {
         if(this.k == null || this.k[var1] != '\uffff') {
            var3 = Rasterizer3D.e;
            var4 = Rasterizer3D.f;
            var5 = 0;
            var6 = this.g[var1];
            var7 = this.h[var1];
            int var8 = this.i[var1];
            int var9 = ak[var6];
            int var10 = ak[var7];
            int var11 = ak[var8];
            int var12;
            int var13;
            int var14;
            int var15;
            if(var9 >= 50) {
               as[0] = af[var6];
               at[0] = ag[var6];
               ++var5;
               au[0] = this.P[var1];
            } else {
               var12 = ai[var6];
               var13 = aj[var6];
               var14 = this.P[var1];
               if(var11 >= 50) {
                  var15 = (50 - var9) * az[var11 - var9];
                  as[0] = var3 + (var12 + ((ai[var8] - var12) * var15 >> 16) << Client.d) / 50;
                  at[0] = var4 + (var13 + ((aj[var8] - var13) * var15 >> 16) << Client.d) / 50;
                  ++var5;
                  au[0] = var14 + ((this.R[var1] - var14) * var15 >> 16);
               }

               if(var10 >= 50) {
                  var15 = (50 - var9) * az[var10 - var9];
                  as[var5] = var3 + (var12 + ((ai[var7] - var12) * var15 >> 16) << Client.d) / 50;
                  at[var5] = var4 + (var13 + ((aj[var7] - var13) * var15 >> 16) << Client.d) / 50;
                  au[var5++] = var14 + ((this.Q[var1] - var14) * var15 >> 16);
               }
            }

            if(var10 >= 50) {
               as[var5] = af[var7];
               at[var5] = ag[var7];
               au[var5++] = this.Q[var1];
            } else {
               var12 = ai[var7];
               var13 = aj[var7];
               var14 = this.Q[var1];
               if(var9 >= 50) {
                  var15 = (50 - var10) * az[var9 - var10];
                  as[var5] = var3 + (var12 + ((ai[var6] - var12) * var15 >> 16) << Client.d) / 50;
                  at[var5] = var4 + (var13 + ((aj[var6] - var13) * var15 >> 16) << Client.d) / 50;
                  au[var5++] = var14 + ((this.P[var1] - var14) * var15 >> 16);
               }

               if(var11 >= 50) {
                  var15 = (50 - var10) * az[var11 - var10];
                  as[var5] = var3 + (var12 + ((ai[var8] - var12) * var15 >> 16) << Client.d) / 50;
                  at[var5] = var4 + (var13 + ((aj[var8] - var13) * var15 >> 16) << Client.d) / 50;
                  au[var5++] = var14 + ((this.R[var1] - var14) * var15 >> 16);
               }
            }

            if(var11 >= 50) {
               as[var5] = af[var8];
               at[var5] = ag[var8];
               au[var5++] = this.R[var1];
            } else {
               var12 = ai[var8];
               var13 = aj[var8];
               var14 = this.R[var1];
               if(var10 >= 50) {
                  var15 = (50 - var11) * az[var10 - var11];
                  as[var5] = var3 + (var12 + ((ai[var7] - var12) * var15 >> 16) << Client.d) / 50;
                  at[var5] = var4 + (var13 + ((aj[var7] - var13) * var15 >> 16) << Client.d) / 50;
                  au[var5++] = var14 + ((this.Q[var1] - var14) * var15 >> 16);
               }

               if(var9 >= 50) {
                  var15 = (50 - var11) * az[var9 - var11];
                  as[var5] = var3 + (var12 + ((ai[var6] - var12) * var15 >> 16) << Client.d) / 50;
                  at[var5] = var4 + (var13 + ((aj[var6] - var13) * var15 >> 16) << Client.d) / 50;
                  au[var5++] = var14 + ((this.P[var1] - var14) * var15 >> 16);
               }
            }

            var12 = as[0];
            var13 = as[1];
            var14 = as[2];
            var15 = at[0];
            var3 = at[1];
            var4 = at[2];
            if((var12 - var13) * (var4 - var3) - (var15 - var3) * (var14 - var13) > 0) {
               Rasterizer3D.b = false;
               if(var5 == 3) {
                  if(var12 < 0 || var13 < 0 || var14 < 0 || var12 > Rasterizer2D.o || var13 > Rasterizer2D.o || var14 > Rasterizer2D.o) {
                     Rasterizer3D.b = true;
                  }

                  if(this.j == null) {
                     var6 = 0;
                  } else {
                     var6 = this.j[var1] & 3;
                  }

                  if(var6 == 0) {
                     Rasterizer3D.a(var15, var3, var4, var12, var13, var14, au[0], au[1], au[2]);
                  } else if(var6 == 1) {
                     Rasterizer3D.a(var15, var3, var4, var12, var13, var14, ay[this.P[var1]]);
                  } else if(var6 == 2) {
                     var6 = this.j[var1] >> 2;
                     var7 = this.W[var6];
                     var8 = this.X[var6];
                     var6 = this.Y[var6];
                     Rasterizer3D.a(var15, var3, var4, var12, var13, var14, au[0], au[1], au[2], ai[var7], ai[var8], ai[var6], aj[var7], aj[var8], aj[var6], ak[var7], ak[var8], ak[var6], this.k[var1]);
                  } else if(var6 == 3) {
                     var6 = this.j[var1] >> 2;
                     var7 = this.W[var6];
                     var8 = this.X[var6];
                     var6 = this.Y[var6];
                     Rasterizer3D.a(var15, var3, var4, var12, var13, var14, this.P[var1], this.P[var1], this.P[var1], ai[var7], ai[var8], ai[var6], aj[var7], aj[var8], aj[var6], ak[var7], ak[var8], ak[var6], this.k[var1]);
                  }
               }

               if(var5 == 4) {
                  if(var12 < 0 || var13 < 0 || var14 < 0 || var12 > Rasterizer2D.o || var13 > Rasterizer2D.o || var14 > Rasterizer2D.o || as[3] < 0 || as[3] > Rasterizer2D.o) {
                     Rasterizer3D.b = true;
                  }

                  if(this.j == null) {
                     var6 = 0;
                  } else {
                     var6 = this.j[var1] & 3;
                  }

                  if(var6 == 0) {
                     Rasterizer3D.a(var15, var3, var4, var12, var13, var14, au[0], au[1], au[2]);
                     Rasterizer3D.a(var15, var4, at[3], var12, var14, as[3], au[0], au[2], au[3]);
                     return;
                  }

                  if(var6 == 1) {
                     var6 = ay[this.P[var1]];
                     Rasterizer3D.a(var15, var3, var4, var12, var13, var14, var6);
                     Rasterizer3D.a(var15, var4, at[3], var12, var14, as[3], var6);
                     return;
                  }

                  if(var6 == 2) {
                     var6 = this.j[var1] >> 2;
                     var7 = this.W[var6];
                     var8 = this.X[var6];
                     var6 = this.Y[var6];
                     Rasterizer3D.a(var15, var3, var4, var12, var13, var14, au[0], au[1], au[2], ai[var7], ai[var8], ai[var6], aj[var7], aj[var8], aj[var6], ak[var7], ak[var8], ak[var6], this.k[var1]);
                     Rasterizer3D.a(var15, var4, at[3], var12, var14, as[3], au[0], au[2], au[3], ai[var7], ai[var8], ai[var6], aj[var7], aj[var8], aj[var6], ak[var7], ak[var8], ak[var6], this.k[var1]);
                     return;
                  }

                  if(var6 == 3) {
                     var6 = this.j[var1] >> 2;
                     var7 = this.W[var6];
                     var8 = this.X[var6];
                     var6 = this.Y[var6];
                     Rasterizer3D.a(var15, var3, var4, var12, var13, var14, this.P[var1], this.P[var1], this.P[var1], ai[var7], ai[var8], ai[var6], aj[var7], aj[var8], aj[var6], ak[var7], ak[var8], ak[var6], this.k[var1]);
                     Rasterizer3D.a(var15, var4, at[3], var12, var14, as[3], this.P[var1], this.P[var1], this.P[var1], ai[var7], ai[var8], ai[var6], aj[var7], aj[var8], aj[var6], ak[var7], ak[var8], ak[var6], this.k[var1]);
                  }
               }
            }
         }

      }
   }
}
