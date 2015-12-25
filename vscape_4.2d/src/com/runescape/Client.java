package com.runescape;
import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.net.UnknownHostException;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import vscape.RSAConstants;
import vscape.Settings;
import vscape.content.CacheUpdater;
import vscape.overlay.OverlayTemplate;
import vscape.overlay.Overlays;

import com.runescape.cache.Archive;
import com.runescape.cache.Class4;
import com.runescape.cache.Index;
import com.runescape.cache.anim.Animation;
import com.runescape.cache.anim.Frame;
import com.runescape.cache.anim.SpotAnimation;
import com.runescape.cache.def.ActorDefinition;
import com.runescape.cache.def.ItemDefinition;
import com.runescape.cache.def.ObjectDefinition;
import com.runescape.cache.gui.Class71;
import com.runescape.cache.gui.IndexedImage;
import com.runescape.cache.gui.RSFont;
import com.runescape.cache.gui.Sprite;
import com.runescape.cache.gui.Widget;
import com.runescape.data.LinkedList;
import com.runescape.data.Node;
import com.runescape.entity.Actor;
import com.runescape.entity.GameAnimableObject;
import com.runescape.entity.GameObject;
import com.runescape.entity.Item;
import com.runescape.entity.Npc;
import com.runescape.entity.Player;
import com.runescape.entity.Projectile;
import com.runescape.entity.Renderable;
import com.runescape.entity.RenderableObject;
import com.runescape.entity.model.IdentityKit;
import com.runescape.entity.model.Model;
import com.runescape.graphics.ProducingGraphicsBuffer;
import com.runescape.graphics.Rasterizer2D;
import com.runescape.graphics.Rasterizer3D;
import com.runescape.network.BufferedConnection;
import com.runescape.network.IsaacCipher;
import com.runescape.network.PacketConstants;
import com.runescape.network.Resource;
import com.runescape.network.ResourceProvider;
import com.runescape.scene.CollisionMap;
import com.runescape.scene.Floor;
import com.runescape.scene.MapRegion;
import com.runescape.scene.SceneGraph;
import com.runescape.scene.world.Ground;
import com.runescape.scene.world.GroundDecoration;
import com.runescape.scene.world.Wall;
import com.runescape.scene.world.WallDecoration;
import com.runescape.sign.SignLink;
import com.runescape.sound.Class49;
import com.runescape.sound.MidiPlayer;
import com.runescape.sound.Track;
import com.runescape.stream.Buffer;
import com.runescape.stream.Class32;
import com.runescape.utils.ChatMessageCodec;
import com.runescape.utils.MessageCensor;
import com.runescape.utils.MouseMonitor;
import com.runescape.utils.SkillConstants;
import com.runescape.utils.StringUtils;
import com.runescape.var.VarBits;
import com.runescape.var.Varp;

public class Client extends RSApplet {
   private static int ab = 765;
   private static int ac = 503;
   private int ad;
   private String[] ae = new String[100];
   private int[] af = new int[100];
   private int ag;
   private int ah;
   private int ai;
   private int aj;
   public static Client a;
   public NumberFormat b;
   private boolean ak;
   private boolean al;
   private int am;
   private int an;
   private boolean ao;
   private int ap;
   private int aq;
   private int ar;
   private int as;
   private boolean at;
   public static boolean c = false;
   public static int d = 9;
   private boolean au;
   private double av;
   public boolean e;
   private boolean aw;
   private String ax;
   private String ay;
   private final int[] az;
   private final boolean[] aA;
   private int aB;
   public int f;
   public int g;
   public int h;
   private int aC;
   private Sprite aD;
   private Sprite aE;
   private Sprite aF;
   private ProducingGraphicsBuffer aG;
   private ProducingGraphicsBuffer aH;
   private int aI;
   private long aJ;
   private int[][] aK;
   private int[] aL;
   private LinkedList[][][] aM;
   private volatile boolean aN;
   private Socket aO;
   private int aP;
   private Buffer aQ;
   private Npc[] aR;
   private int aS;
   private int[] aT;
   private int aU;
   private int[] aV;
   private int aW;
   private int aX;
   private int aY;
   private String aZ;
   private int ba;
   private Buffer bb;
   private boolean bc;
   private static int bd;
   private int[] be;
   private int[] bf;
   private int[] bg;
   private static int bh;
   private int bi;
   static int i;
   private int bj;
   private int bk;
   private int bl;
   private int bm;
   private int bn;
   private int bo;
   private final int[] bp;
   private Sprite bq;
   private Sprite br;
   private boolean bs;
   private final int[] bt;
   private final boolean[] bu;
   private long bv;
   private int bw;
   private int bx;
   private MouseMonitor by;
   private volatile boolean bz;
   private String bA;
   private int bB;
   private boolean bC;
   private int bD;
   private String bE;
   private final int bF;
   private final int bG;
   private Player[] bH;
   private int bI;
   private int[] bJ;
   private int bK;
   private int[] bL;
   private Buffer[] bM;
   private int bN;
   private int bO;
   private int bP;
   private int bQ;
   private int[][] bR;
   private byte[] bS;
   private int bT;
   private int bU;
   private int bV;
   private int bW;
   private int bX;
   private int bY;
   private final int[] bZ;
   private static int ca;
   private long[] cb;
   private boolean cc;
   private final int[] cd;
   private int[][] ce;
   private Sprite cf;
   private Sprite cg;
   private int ch;
   private int ci;
   private int cj;
   private int ck;
   private int cl;
   private int cm;
   private final int[] cn;
   private final String[] co;
   private final String[] cp;
   private final String[] cq;
   private int cr;
   private SceneGraph cs;
   private Sprite[] ct;
   public Sprite[] j;
   private int cu;
   private int cv;
   private int cw;
   private int cx;
   private int cy;
   private long cz;
   private boolean cA;
   private long[] cB;
   private long[] cC;
   private int[] cD;
   private int cE;
   private static int cF = 10;
   public static int k;
   private static boolean cG;
   private static boolean cH = true;
   private static boolean cI;
   private volatile boolean cJ;
   private int cK;
   private int cL;
   private final int[] cM;
   private final int[] cN;
   public final Index[] l;
   public int[] m;
   private boolean cO;
   private final int cP;
   private final int[] cQ;
   private final int[] cR;
   private final int[] cS;
   private final int[] cT;
   private final int[] cU;
   private final int[] cV;
   private final int[] cW;
   private final String[] cX;
   private int cY;
   private int cZ;
   private static int da;
   private Sprite[] db;
   private int dc;
   private int[] dd;
   private final boolean de;
   private int df;
   private int dg;
   private int dh;
   private int di;
   private int dj;
   private IsaacCipher dk;
   private Sprite dl;
   public static final int[][] n = new int[][]{{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, '\u83a1', 22433, 2983, '\ud3b1'}, {8741, 12, '\ufa1e', '\ua89a', 7735, 8404, 1701, '\u961e', 24094, 10153, '\udd2d', 4783, 1341, 16578, '\u88bb', 25239}, {25238, 8742, 12, '\ufa1e', '\ua89a', 7735, 8404, 1701, '\u961e', 24094, 10153, '\udd2d', 4783, 1341, 16578, '\u88bb'}, {4626, 11146, 6439, 12, 4758, 10270}, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574}};
   private String dm;
   private static int dn;
   private int do_;
   private int dp;
   private int dq;
   private int dr;
   private int ds;
   private int dt;
   private LinkedList du;
   private int dv;
   private int dw;
   private int dx;
   private boolean dy;
   private int dz;
   private static final int[] dA = new int[99];
   private int dB;
   private int dC;
   private Sprite dD;
   private Sprite dE;
   private int dF;
   private final int[] dG;
   private boolean dH;
   private Sprite[] dI;
   private int dJ;
   private int dK;
   private int dL;
   private int dM;
   private int dN;
   private int dO;
   private int dP;
   private final int[] dQ;
   private final int[] dR;
   private int dS;
   private boolean dT;
   private int dU;
   private String dV;
   private static int dW;
   private final int[] dX;
   private Archive dY;
   private int dZ;
   private int ea;
   private LinkedList eb;
   private final int[] ec;
   private Widget ed;
   private IndexedImage[] ee;
   private int ef;
   private final int eg;
   private int eh;
   private final int[] ei;
   private int ej;
   private int ek;
   public ResourceProvider o;
   private int el;
   private int em;
   private int en;
   private int[] eo;
   private int[] ep;
   private Sprite eq;
   private Sprite er;
   private Sprite es;
   private Sprite et;
   private Sprite eu;
   private Sprite ev;
   private int ew;
   private boolean ex;
   private String[] ey;
   private Buffer ez;
   private int eA;
   private int eB;
   private int eC;
   private int eD;
   private int eE;
   public static int p;
   private static int eF = 0;
   private int eG;
   private static int eH = 600;
   public static int q = 765;
   public static int r = 503;
   public static int s = 0;
   private int eI;
   private int eJ;
   private boolean eK;
   private static boolean eL = true;
   private int eM;
   private final int[] eN;
   private int[] eO;
   private int[] eP;
   private int[] eQ;
   private int[] eR;
   private Sprite eS;
   private Sprite[] eT;
   private Sprite[] eU;
   private Sprite[] eV;
   private static int eW;
   private int eX;
   private int eY;
   private int eZ;
   private int fa;
   private int fb;
   private static boolean fc;
   private int fd;
   private String fe;
   private ProducingGraphicsBuffer ff;
   private ProducingGraphicsBuffer fg;
   private ProducingGraphicsBuffer fh;
   private ProducingGraphicsBuffer fi;
   private ProducingGraphicsBuffer fj;
   private ProducingGraphicsBuffer fk;
   private ProducingGraphicsBuffer fl;
   private ProducingGraphicsBuffer fm;
   private ProducingGraphicsBuffer fn;
   private static int fo;
   private int fp;
   private String fq;
   private Sprite fr;
   private ProducingGraphicsBuffer fs;
   public static Player t;
   private final String[] ft;
   private final boolean[] fu;
   private final int[][][] fv;
   public static final int[] u = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
   private int fw;
   private int fx;
   private static int fy;
   private int fz;
   private int fA;
   private int fB;
   private String fC;
   private Sprite[] fD;
   private boolean fE;
   private int fF;
   private boolean fG;
   private Sprite[] fH;
   private static boolean fI;
   public static boolean v;
   private IndexedImage[] fJ;
   private int fK;
   private static int fL;
   private static boolean fM;
   public boolean w;
   private boolean fN;
   private boolean fO;
   private boolean fP;
   public static int x;
   private ProducingGraphicsBuffer fQ;
   private ProducingGraphicsBuffer fR;
   private ProducingGraphicsBuffer fS;
   private ProducingGraphicsBuffer fT;
   private int fU;
   private BufferedConnection fV;
   private int fW;
   public static String y = "";
   public static String z = "";
   private static int fX;
   private boolean fY;
   private final int[] fZ;
   private int ga;
   private LinkedList gb;
   private int[] gc;
   private int[] gd;
   private int[] ge;
   private byte[][] gf;
   private int gg;
   private int gh;
   private int gi;
   private int gj;
   private static int gk;
   private int gl;
   private int[] gm;
   private int[] gn;
   private Buffer go;
   private int gp;
   private int gq;
   private IndexedImage gr;
   private String[] gs;
   private Sprite gt;
   private Sprite gu;
   private final int[] gv;
   public static final int[] A = new int[]{9104, 10275, 7595, 3610, 7975, 8526, 918, '\u9792', 24466, 10145, '\ue51e', 5027, 1457, 16565, '\u88af', 25486};
   private final int[] gw;
   private int gx;
   static int B;
   private String gy;
   private int gz;
   private int[][][] gA;
   private long gB;
   private int gC;
   private final IndexedImage[] gD;
   static int C;
   private int gE;
   public static boolean D;
   private int gF;
   private static int gG;
   private int gH;
   private boolean gI;
   private int gJ;
   private MidiPlayer gK;
   public Overlays E;
   private final int[] gL;
   private CollisionMap[] gM;
   public static int[] F;
   private int[] gN;
   private int[] gO;
   private int[] gP;
   private final int[] gQ;
   private boolean gR;
   private int gS;
   private int gT;
   private int gU;
   private int gV;
   private byte[][] gW;
   private int gX;
   private int gY;
   private final int[] gZ;
   private final int[] ha;
   private int hb;
   private final boolean hc;
   private int hd;
   private boolean he;
   private boolean hf;
   private byte[][][] hg;
   private int hh;
   private int hi;
   private int hj;
   private Sprite hk;
   private int hl;
   private int hm;
   private String hn;
   private String ho;
   private int hp;
   private int hq;
   private RSFont hr;
   private RSFont hs;
   private RSFont ht;
   public Class71 G;
   public Class71 H;
   private Class71 hu;
   private int hv;
   private int hw;
   private int[] hx;
   private int[] hy;
   private int hz;
   private int hA;
   private int hB;
   private int hC;
   private String hD;
   private int hE;
   private static int hF;
   private static String hG = "";
   private int hH;
   private int hI;
   private int hJ;
   private int hK;
   private int hL;
   private int hM;
   private int hN;
   private int[] hO;

   static {
      int var0 = 0;

      int var1;
      for(var1 = 0; var1 < 99; ++var1) {
         int var2 = (int)((double)(var2 = var1 + 1) + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D));
         var0 += var2;
         dA[var1] = var0 / 4;
      }

      F = new int[32];
      var0 = 2;

      for(var1 = 0; var1 < 32; ++var1) {
         F[var1] = var0 - 1;
         var0 += var0;
      }

   }

   public final void a() {
      if(s == 1) {
         if(q != this.O.a()) {
            q = this.O.a();
            this.k();
         }

         if(r != this.O.b()) {
            r = this.O.b();
            this.k();
         }

         if(this.w && (Settings.d != q || Settings.e != r)) {
            Settings.a();
         }
      }

   }

   private void k() {
      Rasterizer3D.a(s == 0?ab:q, s == 0?ac:r);
      this.hO = Rasterizer3D.t;
      Rasterizer3D.a(s == 0?516:q, s == 0?165:r);
      this.gc = Rasterizer3D.t;
      Rasterizer3D.a(s == 0?(this.fQ != null?this.fQ.b:250):q, s == 0?(this.fQ != null?this.fQ.c:335):r);
      this.gd = Rasterizer3D.t;
      Rasterizer3D.a(s == 0?512:q, s == 0?334:r);
      this.ge = Rasterizer3D.t;
      int[] var1 = new int[9];

      for(int var2 = 0; var2 < 9; ++var2) {
         int var3 = 128 + (var2 << 5) + 15;
         int var4 = 600 + var3 * 3;
         var3 = Rasterizer3D.r[var3];
         var1[var2] = var4 * var3 >> 16;
      }

      SceneGraph.a(500, 800, s == 0?512:q, s == 0?334:r, var1);
      this.fS = new ProducingGraphicsBuffer(s == 0?512:q, s == 0?334:r, this.e());
      Rasterizer2D.d();
      this.G();
      if(!this.w) {
         this.Z();
      }

   }

   private void e(int var1) {
      if(s != var1) {
         s = var1;
         int var2 = 765;
         int var3 = 503;
         boolean var7;
         if(var1 == 0) {
            d = 9;
            var7 = false;
            var2 = ab;
            var3 = ac;
            eL = true;
            this.eK = true;
         } else if(var1 == 1) {
            d = 10;
            var7 = true;
            var2 = Settings.d > 0?Settings.d:900;
            var3 = Settings.e > 0?Settings.e:600;
         } else if(var1 == 2) {
            d = 10;
            var7 = true;
            var2 = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
            var3 = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
         }

         var3 = var3;
         var2 = var2;
         Client var8 = this;

         try {
            q = var2;
            r = var3;
            boolean var10001 = s == 2;
            int var10002 = var2;
            boolean var10004 = s == 1;
            boolean var9 = s > 0;
            int var4 = var3;
            int var5 = var10002;
            boolean var11 = var10001;
            Client var10 = a;
            a.K = var5;
            var10.L = var4;
            if(var10.O != null) {
               var10.O.dispose();
            }

            var10.O = new RSFrame(var10, var5, var4, var11);
            var10.O.addWindowListener(var10);
            var10.M = var10.O.getGraphics();
            var10.e().addMouseWheelListener(var10);
            var10.e().addMouseListener(var10);
            var10.e().addMouseMotionListener(var10);
            var10.e().addKeyListener(var10);
            var10.e().addFocusListener(var10);
            var8.k();
            var8.S = var8.T = -1;
         } catch (Exception var6) {
            var6.printStackTrace();
         }

         this.k();
      }

   }

   private boolean a(int var1, int var2, int var3, int var4) {
      return super.S >= var1 && super.S <= var3 && super.T >= var2 && super.T <= var4;
   }

   private boolean b(int var1, int var2, int var3, int var4) {
      return super.V >= var1 && super.V <= var3 && super.W >= var2 && super.W <= var4;
   }

   private static String l() {
      String var0;
      if(!(var0 = System.getProperty("os.name")).startsWith("Linux") && !var0.startsWith("Mac") && !var0.startsWith("HP-UX")) {
         String var13 = null;
         HashMap var14 = new HashMap();
         Enumeration var12 = null;

         try {
            var12 = NetworkInterface.getNetworkInterfaces();
         } catch (SocketException var8) {
            var8.printStackTrace();
         }

         while(var12.hasMoreElements()) {
            NetworkInterface var15 = (NetworkInterface)var12.nextElement();
            byte[] var16 = null;

            try {
               var16 = var15.getHardwareAddress();
            } catch (SocketException var7) {
               var7.printStackTrace();
            }

            if(var16 != null) {
               StringBuilder var5 = new StringBuilder();

               for(int var6 = 0; var6 < var16.length; ++var6) {
                  var5.append(String.format("%02X%s", new Object[]{Byte.valueOf(var16[var6]), var6 < var16.length - 1?"-":""}));
               }

               if(!var5.toString().isEmpty()) {
                  var14.put(var15.getName(), var5.toString());
               }

               if(!var5.toString().isEmpty() && var13 == null) {
                  var13 = var15.getName();
               }
            }
         }

         return var13 != null?(String)var14.get(var13):null;
      } else {
         var0 = "/sbin/ifconfig";
         Pattern var1 = Pattern.compile("([vscape-fA-F0-9]{1,2}(-|:)){5}[vscape-fA-F0-9]{1,2}");

         try {
            Process var2 = null;

            try {
               var2 = Runtime.getRuntime().exec(var0);
            } catch (Exception var9) {
               var9.printStackTrace();
            }

            if(var2 == null) {
               System.out.println("the command \'ifconfig\' failed to run on your system");
            }

            var2.waitFor();
            BufferedReader var11 = new BufferedReader(new InputStreamReader(var2.getInputStream()));

            String var3;
            while((var3 = var11.readLine()) != null) {
               Matcher var4;
               if((var4 = var1.matcher(var3)).find()) {
                  var3 = var4.group();
                  break;
               }
            }

            return var3;
         } catch (Exception var10) {
            var10.printStackTrace();
            return null;
         }
      }
   }

   private static String f(int var0) {
      String var2;
      for(int var1 = (var2 = String.valueOf(var0)).length() - 3; var1 > 0; var1 -= 3) {
         var2 = var2.substring(0, var1) + "," + var2.substring(var1);
      }

      if(var2.length() > 8) {
         var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
      } else if(var2.length() > 4) {
         var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
      }

      return " " + var2;
   }

   private void m() {
      String var1 = null;

      for(int var2 = 0; var2 < 100; ++var2) {
         int var3;
         if(this.cp[var2] != null && ((var3 = this.cn[var2]) == 3 || var3 == 7)) {
            var1 = this.co[var2];
            break;
         }
      }

      if(var1 == null) {
         this.a("You haven\'t received any messages to which you can reply.", 0, "");
      } else {
         if(var1.startsWith("@cr")) {
            var1 = var1.substring(5);
         }

         if(var1.startsWith("@irn")) {
            var1 = var1.substring(5);
         }

         long var4 = StringUtils.a(var1.trim());
         int var7 = -1;

         for(int var6 = 0; var6 < this.bO; ++var6) {
            if(this.cB[var6] == var4) {
               var7 = var6;
               break;
            }
         }

         if(var7 != -1) {
            if(this.aL[var7] > 0) {
               D = true;
               this.gF = 0;
               this.hf = true;
               this.gy = "";
               this.eh = 3;
               this.cz = this.cB[var7];
               this.fq = "Enter message to send to " + this.ey[var7];
               return;
            }

            this.a("That player is currently offline.", 0, "");
         }

      }
   }

   private boolean g(int var1) {
      if(var1 < 0) {
         return false;
      } else {
         if((var1 = this.eQ[var1]) >= 2000) {
            var1 -= 2000;
         }

         return var1 == 337;
      }
   }

   private static String h(int var0) {
      switch(var0) {
      case 1:
         return "@cr1@";
      case 2:
         return "@cr2@";
      case 3:
         return "@cr2@";
      case 4:
         return "@irn@";
      default:
         return "";
      }
   }

   private int a(int var1, int var2, int var3) {
      switch(var1) {
      case 1:
         this.gD[0].a(var2, var3);
         return 15;
      case 2:
         this.gD[1].a(var2, var3);
         return 15;
      case 3:
         this.gD[1].a(var2, var3);
         return 15;
      case 4:
         Class4.a("chaticons", 0).e(var2, var3);
         return 13;
      default:
         return 0;
      }
   }

   private void a(String var1) {
      if(var1 != null && var1.length() != 0) {
         var1 = var1;
         String[] var2 = new String[100];

         int var3;
         int var4;
         for(var3 = 0; (var4 = var1.indexOf(" ")) != -1; var1 = var1.substring(var4 + 1)) {
            String var5;
            if((var5 = var1.substring(0, var4).trim()).length() > 0) {
               var2[var3++] = var5.toLowerCase();
            }
         }

         if((var1 = var1.trim()).length() > 0) {
            var2[var3++] = var1.toLowerCase();
         }

         this.ad = 0;

         label45:
         for(var4 = 0; var4 < ObjectDefinition.E; ++var4) {
            ObjectDefinition var6;
            if((var6 = ObjectDefinition.a(var4)).j == -1 && var6.o != null) {
               var1 = var6.o.toLowerCase();

               for(int var7 = 0; var7 < var3; ++var7) {
                  if(var1.indexOf(var2[var7]) == -1) {
                     continue label45;
                  }
               }

               this.ae[this.ad] = var1;
               this.af[this.ad] = var4;
               ++this.ad;
               if(this.ad >= this.ae.length) {
                  return;
               }
            }
         }

      } else {
         this.ad = 0;
      }
   }

   private void b(String var1) {
      if(var1 != null && var1.length() != 0) {
         var1 = var1;
         String[] var2 = new String[100];

         int var3;
         int var4;
         for(var3 = 0; (var4 = var1.indexOf(" ")) != -1; var1 = var1.substring(var4 + 1)) {
            String var5;
            if((var5 = var1.substring(0, var4).trim()).length() > 0) {
               var2[var3++] = var5.toLowerCase();
            }
         }

         if((var1 = var1.trim()).length() > 0) {
            var2[var3++] = var1.toLowerCase();
         }

         this.ad = 0;

         label42:
         for(var4 = 0; var4 < ActorDefinition.a; ++var4) {
            ActorDefinition var6;
            if((var6 = ActorDefinition.a(var4)).f != null) {
               var1 = var6.f.toLowerCase();

               for(int var7 = 0; var7 < var3; ++var7) {
                  if(var1.indexOf(var2[var7]) == -1) {
                     continue label42;
                  }
               }

               this.ae[this.ad] = var1;
               this.af[this.ad] = var4;
               ++this.ad;
               if(this.ad >= this.ae.length) {
                  return;
               }
            }
         }

      } else {
         this.ad = 0;
      }
   }

   private void n() {
      int var1 = 0;
      Rasterizer3D.t = this.gc;
      if(s == 0) {
         this.fT.a();
      }

      if(s == 0) {
         Class4.a("chat", 4).e(0, 0);
         this.aF.b(7, 6);
      }

      if(s != 0) {
         var1 = r - 165;
      }

      if(s != 0 && eL) {
         Class4.a("chat", 5).e(0, var1 - 1);
         Rasterizer2D.a(13417370, var1 + 6, 506, 129, 200, 7);
         this.aF.b(7, var1 + 6);
      }

      if(s != 0) {
         Class4.a("chat", 6).e(0, r - 22);
      }

      if(s == 0) {
         this.fT.a();
      }

      int var3 = 0;
      if(s != 0) {
         var3 = r - 164;
      }

      String[] var4 = new String[]{"On", "Filtered", "Off"};
      int[] var5 = new int[]{'\uff00', '\uffff', 16711680};
      String[] var6 = new String[]{"On", "Hidden", "Off"};
      int[] var7 = new int[]{'\uff00', '\uffff', 16711680};
      String[] var8 = new String[]{"On", "Friends", "Off", "Hide"};
      int[] var9 = new int[]{'\uff00', 16776960, 16711680, '\uffff'};
      switch(this.ai) {
      case 0:
         Class4.a("chat", 1).e(5, var3 + 142);
         break;
      case 1:
         Class4.a("chat", 1).e(71, var3 + 142);
         break;
      case 2:
         Class4.a("chat", 1).e(137, var3 + 142);
         break;
      case 3:
         Class4.a("chat", 1).e(203, var3 + 142);
         break;
      case 4:
         Class4.a("chat", 1).e(269, var3 + 142);
         break;
      case 5:
         Class4.a("chat", 1).e(335, var3 + 142);
         break;
      case 6:
         Class4.a("chat", 1).e(401, var3 + 142);
      }

      if(this.ah == this.ai) {
         switch(this.ah) {
         case 0:
            Class4.a("chat", 2).e(5, var3 + 142);
            break;
         case 1:
            Class4.a("chat", 2).e(71, var3 + 142);
            break;
         case 2:
            Class4.a("chat", 2).e(137, var3 + 142);
            break;
         case 3:
            Class4.a("chat", 2).e(203, var3 + 142);
            break;
         case 4:
            Class4.a("chat", 2).e(269, var3 + 142);
            break;
         case 5:
            Class4.a("chat", 2).e(335, var3 + 142);
            break;
         case 6:
            Class4.a("chat", 2).e(401, var3 + 142);
         }
      } else {
         switch(this.ah) {
         case 0:
            Class4.a("chat", 0).e(5, var3 + 142);
            break;
         case 1:
            Class4.a("chat", 0).e(71, var3 + 142);
            break;
         case 2:
            Class4.a("chat", 0).e(137, var3 + 142);
            break;
         case 3:
            Class4.a("chat", 0).e(203, var3 + 142);
            break;
         case 4:
            Class4.a("chat", 0).e(269, var3 + 142);
            break;
         case 5:
            Class4.a("chat", 0).e(335, var3 + 142);
            break;
         case 6:
            Class4.a("chat", 0).e(401, var3 + 142);
         }
      }

      this.hr.a(true, 26, 16777215, "All", s == 0?157:r - 8);
      this.hr.a(true, 86, 16777215, "Game", s == 0?152:r - 12);
      this.hr.a(true, 150, 16777215, "Public", s == 0?152:r - 12);
      this.hr.a(true, 212, 16777215, "Private", s == 0?152:r - 12);
      this.hr.a(true, 286, 16777215, "Clan", s == 0?152:r - 12);
      this.hr.a(true, 349, 16777215, "Trade", s == 0?152:r - 12);
      this.hr.a(true, 411, 16777215, "Global", s == 0?152:r - 12);
      this.hr.a(var5[this.h], 100, var4[this.h], s == 0?163:r - 1, true);
      this.hr.a(var9[this.hE], 164, var8[this.hE], s == 0?163:r - 1, true);
      this.hr.a(var9[this.ba], 230, var8[this.ba], s == 0?163:r - 1, true);
      this.hr.a(var7[this.f], 296, var6[this.f], s == 0?163:r - 1, true);
      this.hr.a(var9[this.gX], 362, var8[this.gX], s == 0?163:r - 1, true);
      this.hr.a(var7[this.g], 428, var6[this.g], s == 0?163:r - 1, true);
      RSFont var2 = this.hs;
      if(this.hf) {
         this.ht.a(0, this.fq, var1 + 60, 259);
         this.ht.a(128, this.gy + "*", var1 + 80, 259);
      } else if(this.gF == 1) {
         this.ht.a(0, "Enter amount:", var1 + 60, 259);
         this.ht.a(128, this.dm + "*", var1 + 80, 259);
      } else if(this.gF == 2) {
         this.ht.a(0, "Enter name:", var1 + 60, 259);
         this.ht.a(128, this.dm + "*", var1 + 80, 259);
      } else {
         int var11;
         if(this.gF != 3 && this.gF != 4) {
            if(this.aZ != null) {
               this.ht.a(0, this.aZ, var1 + 60, 259);
               this.ht.a(128, "Click to continue", var1 + 80, 259);
            } else if(this.hv != -1) {
               this.a(0, 20, (Widget)Widget.e[this.hv], var1 + 20);
            } else if(this.dP != -1) {
               this.a(0, 20, (Widget)Widget.e[this.dP], var1 + 20);
            } else if(eL || s == 0) {
               var3 = 0;
               Rasterizer2D.b(var1 + 122, 8, 497, var1 + 7);

               int var12;
               int var14;
               int var16;
               int var17;
               for(var11 = 0; var11 < 500; ++var11) {
                  if(this.cp[var11] != null) {
                     var12 = this.cn[var11];
                     var14 = this.az[var11];
                     boolean var15 = this.aA[var11];
                     var17 = 114 - var3 * 14 + 3 + p;
                     if(s != 0) {
                        var17 += var1;
                     }

                     String var18 = this.co[var11];
                     byte var10 = 0;
                     if(var18 != null && var18.startsWith("@irn@")) {
                        var18 = var18.substring(5);
                        var10 = 4;
                     }

                     if(var12 == 0 && (this.aB == 5 || this.aB == 0) && (this.h == 0 || this.h == 1 && var15)) {
                        if(var17 > var1 && var17 < var1 + 210) {
                           int var10000 = s;
                           var2.a(false, 11, 0, this.cp[var11], var17);
                        }

                        ++var3;
                     }

                     if(var12 == 12 && (this.aB == 5 || this.aB == 0) && (this.h == 0 || this.h == 1 && var15)) {
                        if(var17 > var1 && var17 < var1 + 210) {
                           var2.a(false, 11, 0, this.cp[var11] + " @red@" + var18, var17);
                        }

                        ++var3;
                     }

                     if((var12 == 1 || var12 == 2) && (var12 == 1 || this.hE == 0 || this.hE == 1 && this.c(var18)) && (this.aB == 1 || this.aB == 0)) {
                        if(var17 > var1 && var17 < var1 + 210) {
                           var16 = 11;
                           if(var14 > 0) {
                              var16 = 11 + this.a(var14, 12, var17 - 12);
                           }

                           if(var10 > 0) {
                              var16 += this.a(var10, var16 + 1, var17 - 12);
                           }

                           var2.b(0, var18 + ":", var17, var16);
                           var16 += var2.a(var18) + 8;
                           var2.a(false, var16, 255, this.cp[var11], var17);
                        }

                        ++var3;
                     }

                     if((var12 == 3 || var12 == 7) && (this.gq == 0 || this.aB == 2) && (var12 == 7 || this.ba == 0 || this.ba == 1 && this.c(var18)) && (this.aB == 2 || this.aB == 0)) {
                        if(var17 > var1 && var17 < var1 + 210) {
                           if(s == 0) {
                              var2.b(0, "From", var17, 11);
                           } else {
                              var2.a(true, 11, 16732758, "From", var17);
                           }

                           var16 = 11 + var2.a("From ");
                           if(var14 > 0) {
                              var16 += this.a(var14, var16 + 1, var17 - 12);
                           }

                           if(var10 > 0) {
                              var16 += this.a(var10, var16 + 1, var17 - 12);
                           }

                           if(s != 0) {
                              var2.a(true, var16, 16732758, var18 + ":", var17);
                              var16 += var2.a(var18) + 8;
                              var2.a(true, var16, 16732758, this.cp[var11], var17);
                           } else {
                              var2.b(0, var18 + ":", var17, var16);
                              var16 += var2.a(var18) + 8;
                              var2.b(8388608, this.cp[var11], var17, var16);
                           }
                        }

                        ++var3;
                     }

                     if(var12 == 4 && (this.gX == 0 || this.gX == 1 && this.c(var18)) && (this.aB == 3 || this.aB == 0)) {
                        if(var17 > var1 && var17 < var1 + 210) {
                           if(s != 0) {
                              var2.a(true, 11, 16732758, var18 + " " + this.cp[var11], var17);
                           } else {
                              var2.b(8388736, var18 + " " + this.cp[var11], var17, 11);
                           }
                        }

                        ++var3;
                     }

                     if(var12 == 5 && this.gq == 0 && this.ba < 2 && (this.aB == 2 || this.aB == 0)) {
                        if(var17 > var1 && var17 < var1 + 210) {
                           if(s != 0) {
                              var2.a(true, 11, 16732758, this.cp[var11], var17);
                           } else {
                              var2.b(8388608, this.cp[var11], var17, 11);
                           }
                        }

                        ++var3;
                     }

                     if(var12 == 6 && (this.gq == 0 || this.aB == 2) && this.ba < 2 && (this.aB == 2 || this.aB == 0)) {
                        if(var17 > var1 && var17 < var1 + 210) {
                           if(s != 0) {
                              var2.a(true, 11, 16732758, "To " + var18 + ":", var17);
                              var2.a(true, 15 + var2.a("To :" + var18), 16732758, this.cp[var11], var17);
                           } else {
                              var2.b(0, "To " + var18 + ":", var17, 11);
                              var2.b(8388608, this.cp[var11], var17, 15 + var2.a("To :" + var18));
                           }
                        }

                        ++var3;
                     }

                     if(var12 == 8 && (this.aB == 4 || this.aB == 0)) {
                        if(var17 > var1 && var17 < var1 + 210) {
                           if(s != 0) {
                              var2.a(true, 11, 8270336, var18 + " " + this.cp[var11], var17);
                           } else {
                              var2.b(8270336, var18 + " " + this.cp[var11], var17, 11);
                           }
                        }

                        ++var3;
                     }

                     if(var12 == 9 && (this.g == 0 || this.g == 1) && (this.aB == 9 || this.aB == 0 && this.g == 0)) {
                        var2.b(255, this.ay, var17, 8);
                        var16 = 8 + var2.a(this.ay);
                        if(var14 > 0) {
                           var16 += this.a(var14, var16 + 1, var17 - 12);
                        }

                        if(var10 > 0) {
                           var16 += this.a(var10, var16 + 1, var17 - 12);
                        }

                        var2.b(0, var18 + ":", var17, var16);
                        var16 += var2.a(var18) + 5;
                        var2.a(false, var16, 8270336, this.cp[var11], var17);
                        ++var3;
                     }

                     if(var12 == 16 && (this.f == 0 || this.f == 1) && (this.aB == 16 || this.aB == 0 && this.f == 0)) {
                        String var20 = this.cq[var11];
                        var2.b(0, "[", var17, 8);
                        var2.b(255, var20, var17, 14);
                        var12 = 14 + var2.a(var20);
                        var2.b(0, "]", var17, var12);
                        var12 += 6;
                        if(var14 > 0) {
                           var12 += this.a(var14, var12 + 1, var17 - 12);
                        }

                        if(var10 > 0) {
                           var12 += this.a(var10, var12 + 1, var17 - 12);
                        }

                        var2.b(0, var18 + ":", var17, var12);
                        var12 += var2.a(var18) + 5;
                        var2.b(8388608, this.cp[var11], var17, var12);
                        ++var3;
                     }
                  }
               }

               Rasterizer2D.c();
               if((B = var3 * 14 + 7 + 5) < 111) {
                  B = 111;
               }

               this.a(114, B - p - 114, 7 + (s == 0?0:r - 165), 496, B);
               String var13;
               if(t != null && t.ai != null) {
                  var13 = t.ai;
               } else {
                  var13 = StringUtils.c(y);
               }

               if(s != 0) {
                  var12 = 11;
                  var14 = var1 + 133;
                  if(this.bo > 0) {
                     var12 = 11 + this.a(this.bo, 12, var14 - 12);
                  }

                  if(t.aC) {
                     var12 += this.a(4, var12 + 1, var14 - 12);
                  }

                  var2.b(0, var13 + ":", var14, var12);
                  var2.b(255, var12 + 1 + var2.a(var13 + ": "), this.bE + "*", var14, false);

                  for(var16 = 0; var16 < 505; ++var16) {
                     var17 = 100 - (int)((double)var16 / 5.05D);
                     Rasterizer2D.c(0, 1, var1 + 6, var17, var16 + 7);
                     Rasterizer2D.c(0, 1, var1 + 121, var17, var16 + 7);
                  }
               } else {
                  var12 = 11;
                  var14 = var1 + 133;
                  if(this.bo > 0) {
                     var12 = 11 + this.a(this.bo, 12, var14 - 12);
                  }

                  if(t.aC) {
                     var12 += this.a(4, var12 + 1, var14 - 12);
                  }

                  var2.b(0, var13 + ":", var14, var12);
                  var2.b(255, var12 + 1 + var2.a(var13 + ": "), this.bE + "*", var14, false);
                  Rasterizer2D.c(var14 - 12, 8418912, 506, 7);
               }
            }
         } else {
            if(this.dm != "") {
               if(this.gF == 3) {
                  this.a(this.dm);
               } else if(this.gF == 4) {
                  this.b(this.dm);
               }
            }

            Rasterizer2D.b(var1 + 121, 8, 512, var1 + 7);

            for(var3 = 0; var3 < this.ad; ++var3) {
               if((var11 = 18 + var3 * 14 - this.ag) > 0 && var11 < 132) {
                  this.H.a(this.ae[var3], 10, var11 + var1, 0, -1);
                  this.H.a(String.valueOf(this.af[var3]), 220, var11 + var1, 0, -1);
               }
            }

            Rasterizer2D.c();
            if(this.ad > 8) {
               this.a(114, this.ag, var1 + 7, 496, this.ad * 14 + 7);
            }

            String var19;
            if(this.dm.length() == 0) {
               var19 = this.gF == 3?"Item Search":"Npc Search";
               this.hu.b(var19, 259, var1 + 40, 0, -1);
            } else if(this.ad == 0) {
               var19 = this.gF == 3?"items":"npcs";
               this.hu.b("No matching " + var19 + " found", 259, var1 + 70, 0, -1);
            }

            this.H.a(this.dm + "*", 10, var1 + 132, 16777215, 0);
            Rasterizer2D.a(7, var1 + 121, 505, s == 0?8418912:16777215);
         }
      }

      if(this.bC && s == 0) {
         this.c(0, 338);
      }

      if(s == 0) {
         this.fT.a(338, super.M, 0);
      }

      this.fS.a();
      Rasterizer3D.t = this.ge;
   }

   public final void a(Runnable var1, int var2) {
      if(var2 > 10) {
         var2 = 10;
      }

      super.a(var1, var2);
   }

   public static Socket a(int var0) throws UnknownHostException, IOException {
      return new Socket(InetAddress.getByName(hG), var0);
   }

   private void o() {
      if(this.eC == 0) {
         int var1 = super.U;
         if(this.fz == 1 && super.V >= 516 && super.W >= 160 && super.V <= 765 && super.W <= 205) {
            var1 = 0;
         }

         int var2;
         int var3;
         int var4;
         int var6;
         int var11;
         if(this.bC) {
            if(var1 != 1) {
               var2 = super.S;
               var3 = super.T;
               var2 -= 4;
               var3 -= 4;
               if(var2 < this.cv - 10 || var2 > this.cv + this.cx + 10 || var3 < this.cw - 10 || var3 > this.cw + this.cy + 10) {
                  this.bC = false;
               }
            }

            if(var1 == 1) {
               var2 = this.cv;
               var3 = this.cw;
               var4 = this.cx;
               var11 = super.V;
               var1 = super.W;
               var11 -= 4;
               var1 -= 4;
               var6 = -1;

               for(int var7 = 0; var7 < this.fx; ++var7) {
                  int var8 = var3 + 31 + (this.fx - 1 - var7) * 15;
                  if(var11 > var2 && var11 < var2 + var4 && var1 > var8 - 13 && var1 < var8 + 3) {
                     var6 = var7;
                  }
               }

               if(var6 != -1) {
                  this.n(var6);
               }

               this.bC = false;
               return;
            }
         } else {
            if(var1 == 1 && this.fx > 0 && ((var2 = this.eQ[this.fx - 1]) >= 700 && var2 <= 705 || var2 == 632 || var2 == 78 || var2 == 867 || var2 == 431 || var2 == 53 || var2 == 74 || var2 == 454 || var2 == 539 || var2 == 493 || var2 == 847 || var2 == 447 || var2 == 1125)) {
               var3 = this.eO[this.fx - 1];
               var4 = this.eP[this.fx - 1];
               Widget var5;
               if((var5 = Widget.e[var4]).U || var5.A) {
                  this.gR = false;
                  this.dc = 0;
                  this.eA = var4;
                  this.eB = var3;
                  this.eC = 2;
                  this.eD = super.V;
                  this.eE = super.W;
                  if(Widget.e[var4].B == i) {
                     this.eC = 1;
                  }

                  if(Widget.e[var4].B == this.hv) {
                     this.eC = 3;
                  }

                  return;
               }
            }

            if(var1 == 1 && (this.hd == 1 || this.g(this.fx - 1)) && this.fx > 2) {
               var1 = 2;
            }

            if(var1 == 1 && this.fx > 0) {
               this.n(this.fx - 1);
            }

            if(var1 == 2 && this.fx > 0) {
               this.Q();
            }

            if(this.dB == 0 && super.U == 1) {
               var2 = s == 0?super.V - 25 - 545:super.V - q + 183;
               var3 = s == 0?super.W - 9:super.W - 10;
               if(var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151 && (super.S < q - 21 || super.S > q || super.T < 0 || super.T > 21)) {
                  boolean var10 = true;
                  var10 = false;
                  var10 = false;
                  if(Math.pow((double)(77 - var2), 2.0D) + Math.pow((double)(77 - var3), 2.0D) < Math.pow(77.0D, 2.0D)) {
                     var2 -= 73;
                     var3 -= 75;
                     var4 = this.gh + this.gx & 2047;
                     var11 = Rasterizer3D.r[var4];
                     var4 = Rasterizer3D.s[var4];
                     var11 = var11 * (this.fW + 256) >> 8;
                     var4 = var4 * (this.fW + 256) >> 8;
                     var6 = var3 * var11 + var2 * var4 >> 11;
                     var4 = var3 * var4 - var2 * var11 >> 11;
                     var11 = t.V + var6 >> 7;
                     var4 = t.W - var4 >> 7;
                     if(this.a(1, 0, 0, 0, t.b[0], 0, 0, var4, t.a[0], true, var11)) {
                        this.go.b(var2);
                        this.go.b(var3);
                        this.go.c(this.gh);
                        this.go.b(57);
                        this.go.b(this.gx);
                        this.go.b(this.fW);
                        this.go.b(89);
                        this.go.c(t.V);
                        this.go.c(t.W);
                        this.go.b(this.hl);
                        this.go.b(63);
                     }
                  }

                  if(++fo > 1151) {
                     fo = 0;
                     this.go.a(246);
                     this.go.b(0);
                     var4 = this.go.b;
                     if((int)(Math.random() * 2.0D) == 0) {
                        this.go.b(101);
                     }

                     this.go.b(197);
                     this.go.c((int)(Math.random() * 65536.0D));
                     this.go.b((int)(Math.random() * 256.0D));
                     this.go.b(67);
                     this.go.c(14214);
                     if((int)(Math.random() * 2.0D) == 0) {
                        this.go.c(29487);
                     }

                     this.go.c((int)(Math.random() * 65536.0D));
                     if((int)(Math.random() * 2.0D) == 0) {
                        this.go.b(220);
                     }

                     this.go.b(180);
                     this.go.h(this.go.b - var4);
                  }
               }
            }

            int[] var9 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
            if(s == 0) {
               if(super.U == 1) {
                  if(super.V >= 524 && super.V <= 561 && super.W >= 169 && super.W < 205 && u[0] != -1) {
                     C = 0;
                     fc = true;
                  }

                  if(super.V >= 562 && super.V <= 594 && super.W >= 168 && super.W < 205 && u[1] != -1) {
                     C = 1;
                     fc = true;
                  }

                  if(super.V >= 595 && super.V <= 626 && super.W >= 168 && super.W < 205 && u[2] != -1) {
                     C = 2;
                     fc = true;
                  }

                  if(super.V >= 627 && super.V <= 660 && super.W >= 168 && super.W < 203 && u[3] != -1) {
                     C = 3;
                     fc = true;
                  }

                  if(super.V >= 661 && super.V <= 693 && super.W >= 168 && super.W < 205 && u[4] != -1) {
                     C = 4;
                     fc = true;
                  }

                  if(super.V >= 694 && super.V <= 725 && super.W >= 168 && super.W < 205 && u[5] != -1) {
                     C = 5;
                     fc = true;
                  }

                  if(super.V >= 726 && super.V <= 765 && super.W >= 169 && super.W < 205 && u[6] != -1) {
                     C = 6;
                     fc = true;
                  }

                  if(super.V >= 524 && super.V <= 561 && super.W >= 466 && super.W < 503 && u[7] != -1) {
                     C = 7;
                     fc = true;
                  }

                  if(super.V >= 562 && super.V <= 594 && super.W >= 466 && super.W < 503 && u[8] != -1) {
                     C = 8;
                     fc = true;
                  }

                  if(super.V >= 595 && super.V <= 627 && super.W >= 466 && super.W < 503 && u[9] != -1) {
                     C = 9;
                     fc = true;
                  }

                  if(super.V >= 627 && super.V <= 664 && super.W >= 466 && super.W < 503 && u[10] != -1) {
                     C = 10;
                     fc = true;
                  }

                  if(super.V >= 661 && super.V <= 694 && super.W >= 466 && super.W < 503 && u[11] != -1) {
                     C = 11;
                     fc = true;
                  }

                  if(super.V >= 695 && super.V <= 725 && super.W >= 466 && super.W < 503 && u[12] != -1) {
                     C = 12;
                     fc = true;
                  }

                  if(super.V >= 726 && super.V <= 765 && super.W >= 466 && super.W < 502 && u[13] != -1) {
                     C = 13;
                     fc = true;
                  }
               }
            } else if(s != 0 && q < this.eM && super.U == 1) {
               if(super.V >= q - 241 && super.V <= q - 204 && super.W >= r - 72 && super.W < r - 40 && u[0] != -1) {
                  if(this.gl == -1) {
                     if(C == var9[0]) {
                        this.eK = !this.eK;
                     } else {
                        this.eK = true;
                     }
                  }

                  C = var9[0];
                  fc = true;
               }

               if(super.V >= q - 202 && super.V <= q - 171 && super.W >= r - 72 && super.W < r - 40 && u[1] != -1) {
                  if(this.gl == -1) {
                     if(C == var9[1]) {
                        this.eK = !this.eK;
                     } else {
                        this.eK = true;
                     }
                  }

                  C = var9[1];
                  fc = true;
               }

               if(super.V >= q - 170 && super.V <= q - 139 && super.W >= r - 72 && super.W < r - 40 && u[2] != -1) {
                  if(this.gl == -1) {
                     if(C == var9[2]) {
                        this.eK = !this.eK;
                     } else {
                        this.eK = true;
                     }
                  }

                  C = var9[2];
                  fc = true;
               }

               if(super.V >= q - 138 && super.V <= q - 105 && super.W >= r - 72 && super.W < r - 40 && u[3] != -1) {
                  if(this.gl == -1) {
                     if(C == var9[3]) {
                        this.eK = !this.eK;
                     } else {
                        this.eK = true;
                     }
                  }

                  C = var9[3];
                  fc = true;
               }

               if(super.V >= q - 104 && super.V <= q - 72 && super.W >= r - 72 && super.W < r - 40 && u[4] != -1) {
                  if(this.gl == -1) {
                     if(C == var9[4]) {
                        this.eK = !this.eK;
                     } else {
                        this.eK = true;
                     }
                  }

                  C = var9[4];
                  fc = true;
               }

               if(super.V >= q - 71 && super.V <= q - 39 && super.W >= r - 72 && super.W < r - 40 && u[5] != -1) {
                  if(this.gl == -1) {
                     if(C == var9[5]) {
                        this.eK = !this.eK;
                     } else {
                        this.eK = true;
                     }
                  }

                  C = var9[5];
                  fc = true;
               }

               if(super.V >= q - 38 && super.V <= q && super.W >= r - 72 && super.W < r - 40 && u[6] != -1) {
                  if(this.gl == -1) {
                     if(C == var9[6]) {
                        this.eK = !this.eK;
                     } else {
                        this.eK = true;
                     }
                  }

                  C = var9[6];
                  fc = true;
               }

               if(super.V >= q - 241 && super.V <= q - 204 && super.W >= r - 37 && super.W < r && u[7] != -1) {
                  if(this.gl == -1) {
                     if(C == var9[7]) {
                        this.eK = !this.eK;
                     } else {
                        this.eK = true;
                     }
                  }

                  C = var9[7];
                  fc = true;
               }

               if(super.V >= q - 202 && super.V <= q - 171 && super.W >= r - 37 && super.W < r && u[8] != -1) {
                  if(this.gl == -1) {
                     if(C == var9[8]) {
                        this.eK = !this.eK;
                     } else {
                        this.eK = true;
                     }
                  }

                  C = var9[8];
                  fc = true;
               }

               if(super.V >= q - 170 && super.V <= q - 139 && super.W >= r - 37 && super.W < r && u[9] != -1) {
                  if(this.gl == -1) {
                     if(C == var9[9]) {
                        this.eK = !this.eK;
                     } else {
                        this.eK = true;
                     }
                  }

                  C = var9[9];
                  fc = true;
               }

               if(super.V >= q - 138 && super.V <= q - 105 && super.W >= r - 37 && super.W < r && u[10] != -1) {
                  if(this.gl == -1) {
                     if(C == var9[10]) {
                        this.eK = !this.eK;
                     } else {
                        this.eK = true;
                     }
                  }

                  C = var9[10];
                  fc = true;
               }

               if(super.V >= q - 104 && super.V <= q - 72 && super.W >= r - 37 && super.W < r && u[11] != -1) {
                  if(this.gl == -1) {
                     if(C == var9[11]) {
                        this.eK = !this.eK;
                     } else {
                        this.eK = true;
                     }
                  }

                  C = var9[11];
                  fc = true;
               }

               if(super.V >= q - 71 && super.V <= q - 39 && super.W >= r - 37 && super.W < r && u[12] != -1) {
                  if(this.gl == -1) {
                     if(C == var9[12]) {
                        this.eK = !this.eK;
                     } else {
                        this.eK = true;
                     }
                  }

                  C = var9[12];
                  fc = true;
               }

               if(super.V >= q - 38 && super.V <= q && super.W >= r - 37 && super.W < r && u[13] != -1) {
                  if(this.gl == -1) {
                     if(C == var9[13]) {
                        this.eK = !this.eK;
                     } else {
                        this.eK = true;
                     }
                  }

                  C = var9[13];
                  fc = true;
               }
            }

            if(q >= this.eM && super.U == 1) {
               if(super.V >= q - 462 && super.V <= q - 429 && super.W >= r - 37 && super.W < r && u[0] != -1) {
                  if(this.gl == -1) {
                     if(C == var9[0]) {
                        this.eK = !this.eK;
                     } else {
                        this.eK = true;
                     }
                  }

                  C = var9[0];
                  fc = true;
               }

               if(super.V >= q - 429 && super.V <= q - 396 && super.W >= r - 37 && super.W < r && u[1] != -1) {
                  if(this.gl == -1) {
                     if(C == var9[1]) {
                        this.eK = !this.eK;
                     } else {
                        this.eK = true;
                     }
                  }

                  C = var9[1];
                  fc = true;
               }

               if(super.V >= q - 396 && super.V <= q - 363 && super.W >= r - 37 && super.W < r && u[2] != -1) {
                  if(this.gl == -1) {
                     if(C == var9[2]) {
                        this.eK = !this.eK;
                     } else {
                        this.eK = true;
                     }
                  }

                  C = var9[2];
                  fc = true;
               }

               if(super.V >= q - 363 && super.V <= q - 330 && super.W >= r - 37 && super.W < r && u[3] != -1) {
                  if(this.gl == -1) {
                     if(C == var9[3]) {
                        this.eK = !this.eK;
                     } else {
                        this.eK = true;
                     }
                  }

                  C = var9[3];
                  fc = true;
               }

               if(super.V >= q - 330 && super.V <= q - 297 && super.W >= r - 37 && super.W < r && u[4] != -1) {
                  if(this.gl == -1) {
                     if(C == var9[4]) {
                        this.eK = !this.eK;
                     } else {
                        this.eK = true;
                     }
                  }

                  C = var9[4];
                  fc = true;
               }

               if(super.V >= q - 297 && super.V <= q - 264 && super.W >= r - 37 && super.W < r && u[5] != -1) {
                  if(this.gl == -1) {
                     if(C == var9[5]) {
                        this.eK = !this.eK;
                     } else {
                        this.eK = true;
                     }
                  }

                  C = var9[5];
                  fc = true;
               }

               if(super.V >= q - 264 && super.V <= q - 231 && super.W >= r - 37 && super.W < r && u[6] != -1) {
                  if(this.gl == -1) {
                     if(C == var9[6]) {
                        this.eK = !this.eK;
                     } else {
                        this.eK = true;
                     }
                  }

                  C = var9[6];
                  fc = true;
               }

               if(super.V >= q - 231 && super.V <= q - 198 && super.W >= r - 37 && super.W < r && u[7] != -1) {
                  if(this.gl == -1) {
                     if(C == var9[7]) {
                        this.eK = !this.eK;
                     } else {
                        this.eK = true;
                     }
                  }

                  C = var9[7];
                  fc = true;
               }

               if(super.V >= q - 198 && super.V <= q - 165 && super.W >= r - 37 && super.W < r && u[8] != -1) {
                  if(this.gl == -1) {
                     if(C == var9[8]) {
                        this.eK = !this.eK;
                     } else {
                        this.eK = true;
                     }
                  }

                  C = var9[8];
                  fc = true;
               }

               if(super.V >= q - 165 && super.V <= q - 132 && super.W >= r - 37 && super.W < r && u[9] != -1) {
                  if(this.gl == -1) {
                     if(C == var9[9]) {
                        this.eK = !this.eK;
                     } else {
                        this.eK = true;
                     }
                  }

                  C = var9[9];
                  fc = true;
               }

               if(super.V >= q - 132 && super.V <= q - 99 && super.W >= r - 37 && super.W < r && u[10] != -1) {
                  if(this.gl == -1) {
                     if(C == var9[10]) {
                        this.eK = !this.eK;
                     } else {
                        this.eK = true;
                     }
                  }

                  C = var9[10];
                  fc = true;
               }

               if(super.V >= q - 99 && super.V <= q - 66 && super.W >= r - 37 && super.W < r && u[11] != -1) {
                  if(this.gl == -1) {
                     if(C == var9[11]) {
                        this.eK = !this.eK;
                     } else {
                        this.eK = true;
                     }
                  }

                  C = var9[11];
                  fc = true;
               }

               if(super.V >= q - 66 && super.V <= q - 33 && super.W >= r - 37 && super.W < r && u[12] != -1) {
                  if(this.gl == -1) {
                     if(C == var9[12]) {
                        this.eK = !this.eK;
                     } else {
                        this.eK = true;
                     }
                  }

                  C = var9[12];
                  fc = true;
               }

               if(super.V >= q - 33 && super.V <= q && super.W >= r - 37 && super.W < r && u[13] != -1) {
                  if(this.gl == -1) {
                     if(C == var9[13]) {
                        this.eK = !this.eK;
                     } else {
                        this.eK = true;
                     }
                  }

                  C = var9[13];
                  fc = true;
               }
            }

            var2 = 0;
            if(s != 0) {
               var2 = r - 503;
            }

            if(super.S >= 5 && super.S <= 61 && super.T >= var2 + 482 && super.T <= var2 + 503) {
               this.ah = 0;
               D = true;
            } else if(super.S >= 71 && super.S <= 127 && super.T >= var2 + 482 && super.T <= var2 + 503) {
               this.ah = 1;
               D = true;
            } else if(super.S >= 137 && super.S <= 193 && super.T >= var2 + 482 && super.T <= var2 + 503) {
               this.ah = 2;
               D = true;
            } else if(super.S >= 203 && super.S <= 259 && super.T >= var2 + 482 && super.T <= var2 + 503) {
               this.ah = 3;
               D = true;
            } else if(super.S >= 269 && super.S <= 325 && super.T >= var2 + 482 && super.T <= var2 + 503) {
               this.ah = 4;
               D = true;
            } else if(super.S >= 335 && super.S <= 391 && super.T >= var2 + 482 && super.T <= var2 + 503) {
               this.ah = 5;
               D = true;
            } else if(super.S >= 401 && super.S <= 457 && super.T >= var2 + 482 && super.T <= var2 + 503) {
               this.ah = 6;
               D = true;
            } else {
               this.ah = -1;
               D = true;
            }

            if(super.U == 1) {
               if(super.V >= 5 && super.V <= 61 && super.W >= var2 + 482 && super.W <= var2 + 505) {
                  if(s != 0) {
                     if(this.aj != 0) {
                        this.ai = 0;
                        this.aB = 0;
                        D = true;
                        this.aj = 0;
                        return;
                     }

                     eL = !eL;
                     return;
                  }

                  this.ai = 0;
                  this.aB = 0;
                  D = true;
                  this.aj = 0;
                  return;
               }

               if(super.V >= 71 && super.V <= 127 && super.W >= var2 + 482 && super.W <= var2 + 505) {
                  if(s != 0) {
                     if(this.aj != 1 && s != 0) {
                        this.ai = 1;
                        this.aB = 5;
                        D = true;
                        this.aj = 1;
                        return;
                     }

                     eL = !eL;
                     return;
                  }

                  this.ai = 1;
                  this.aB = 5;
                  D = true;
                  this.aj = 1;
                  return;
               }

               if(super.V >= 137 && super.V <= 193 && super.W >= var2 + 482 && super.W <= var2 + 505) {
                  if(s != 0) {
                     if(this.aj != 2 && s != 0) {
                        this.ai = 2;
                        this.aB = 1;
                        D = true;
                        this.aj = 2;
                        return;
                     }

                     eL = !eL;
                     return;
                  }

                  this.ai = 2;
                  this.aB = 1;
                  D = true;
                  this.aj = 2;
                  return;
               }

               if(super.V >= 203 && super.V <= 259 && super.W >= var2 + 482 && super.W <= var2 + 505) {
                  if(s != 0) {
                     if(this.aj != 3 && s != 0) {
                        this.ai = 3;
                        this.aB = 2;
                        D = true;
                        this.aj = 3;
                        return;
                     }

                     eL = !eL;
                     return;
                  }

                  this.ai = 3;
                  this.aB = 2;
                  D = true;
                  this.aj = 3;
                  return;
               }

               if(super.V >= 269 && super.V <= 325 && super.W >= var2 + 482 && super.W <= var2 + 505) {
                  if(s != 0) {
                     if(this.aj != 16 && s != 0) {
                        this.ai = 4;
                        this.aB = 16;
                        D = true;
                        this.aj = 16;
                        return;
                     }

                     eL = !eL;
                     return;
                  }

                  this.ai = 4;
                  this.aB = 16;
                  D = true;
                  this.aj = 16;
                  return;
               }

               if(super.V >= 335 && super.V <= 391 && super.W >= var2 + 482 && super.W <= var2 + 505) {
                  if(s != 0) {
                     if(this.aj != 5 && s != 0) {
                        this.ai = 5;
                        this.aB = 3;
                        D = true;
                        this.aj = 5;
                        return;
                     }

                     eL = !eL;
                     return;
                  }

                  this.ai = 5;
                  this.aB = 3;
                  D = true;
                  this.aj = 5;
                  return;
               }

               if(super.V >= 401 && super.V <= 457 && super.W >= var2 + 482 && super.W <= var2 + 505) {
                  if(s != 0 && (this.aj == 9 || s == 0)) {
                     eL = !eL;
                     return;
                  }

                  this.ai = 6;
                  this.aB = 9;
                  D = true;
                  this.aj = 9;
               }
            }
         }

      }
   }

   private void p() {
      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      int var7;
      int var8;
      int var14;
      try {
         this.cZ = -1;
         this.eb.f();
         this.du.f();
         Rasterizer3D.e();
         q();
         this.cs.b();
         System.gc();

         for(var1 = 0; var1 < 4; ++var1) {
            this.gM[var1].a();
         }

         for(var1 = 0; var1 < 4; ++var1) {
            for(var2 = 0; var2 < 104; ++var2) {
               for(var3 = 0; var3 < 104; ++var3) {
                  this.hg[var1][var2][var3] = 0;
               }
            }
         }

         MapRegion var12 = new MapRegion(this.hg, this.gA);
         var2 = this.gf.length;
         this.go.a(0);
         if(!this.fO) {
            for(var3 = 0; var3 < var2; ++var3) {
               var4 = (this.gN[var3] >> 8 << 6) - this.dJ;
               var5 = ((this.gN[var3] & 255) << 6) - this.dK;
               byte[] var6 = this.gf[var3];
               if(Class32.b(SignLink.a() + "maps/" + this.gO[var3] + ".dat")) {
                  var6 = Class32.a(SignLink.a() + "maps/" + this.gO[var3] + ".dat");
               }

               if(var6 != null) {
                  var12.a(var6, var5, var4, this.el - 6 << 3, this.em - 6 << 3, this.gM);
               }
            }

            for(var3 = 0; var3 < var2; ++var3) {
               var4 = (this.gN[var3] >> 8 << 6) - this.dJ;
               var5 = ((this.gN[var3] & 255) << 6) - this.dK;
               if(this.gf[var3] == null && this.em < 800) {
                  var12.a(var5, 64, 64, var4);
               }
            }

            if(++eW > 160) {
               eW = 0;
               this.go.a(238);
               this.go.b(96);
            }

            this.go.a(0);

            for(var3 = 0; var3 < var2; ++var3) {
               byte[] var13;
               if((var13 = this.gW[var3]) != null) {
                  var5 = (this.gN[var3] >> 8 << 6) - this.dJ;
                  var14 = ((this.gN[var3] & 255) << 6) - this.dK;
                  var12.a(var5, this.gM, var14, this.cs, var13);
               }
            }
         }

         if(this.fO) {
            var3 = 0;

            label226:
            while(true) {
               int var9;
               int var10;
               if(var3 >= 4) {
                  for(var3 = 0; var3 < 13; ++var3) {
                     for(var4 = 0; var4 < 13; ++var4) {
                        if(this.fv[0][var3][var4] == -1) {
                           var12.a(var4 << 3, 8, 8, var3 << 3);
                        }
                     }
                  }

                  this.go.a(0);
                  var3 = 0;

                  while(true) {
                     if(var3 >= 4) {
                        break label226;
                     }

                     for(var4 = 0; var4 < 13; ++var4) {
                        for(var5 = 0; var5 < 13; ++var5) {
                           if((var14 = this.fv[var3][var4][var5]) != -1) {
                              var7 = var14 >> 24 & 3;
                              var8 = var14 >> 1 & 3;
                              var2 = var14 >> 14 & 1023;
                              var14 = var14 >> 3 & 2047;
                              var9 = (var2 / 8 << 8) + var14 / 8;

                              for(var10 = 0; var10 < this.gN.length; ++var10) {
                                 if(this.gN[var10] == var9 && this.gW[var10] != null) {
                                    var12.a(this.gM, this.cs, var7, var4 << 3, (var14 & 7) << 3, var3, this.gW[var10], (var2 & 7) << 3, var8, var5 << 3);
                                    break;
                                 }
                              }
                           }
                        }
                     }

                     ++var3;
                  }
               }

               for(var4 = 0; var4 < 13; ++var4) {
                  for(var5 = 0; var5 < 13; ++var5) {
                     if((var14 = this.fv[var3][var4][var5]) != -1) {
                        var7 = var14 >> 24 & 3;
                        var8 = var14 >> 1 & 3;
                        var2 = var14 >> 14 & 1023;
                        var14 = var14 >> 3 & 2047;
                        var9 = (var2 / 8 << 8) + var14 / 8;

                        for(var10 = 0; var10 < this.gN.length; ++var10) {
                           if(this.gN[var10] == var9 && this.gf[var10] != null) {
                              var12.a(var7, var8, this.gM, var4 << 3, (var2 & 7) << 3, this.gf[var10], (var14 & 7) << 3, var3, var5 << 3);
                              break;
                           }
                        }
                     }
                  }
               }

               ++var3;
            }
         }

         this.go.a(0);
         var12.a(this.gM, this.cs);
         this.fS.a();
         this.go.a(0);
         int var10000 = MapRegion.b;
         this.cs.a(0);

         for(var4 = 0; var4 < 104; ++var4) {
            for(var5 = 0; var5 < 104; ++var5) {
               this.b(var4, var5);
            }
         }

         if(++dW > 98) {
            dW = 0;
            this.go.a(150);
         }

         this.B();
      } catch (Exception var11) {
         ;
      }

      ItemDefinition.z.a();
      if(super.O != null) {
         this.go.a(210);
         this.go.f(1057001181);
      }

      System.gc();
      Rasterizer3D.f();
      this.o.e();
      var1 = (this.el - 6) / 8 - 1;
      var2 = (this.el + 6) / 8 + 1;
      var3 = (this.em - 6) / 8 - 1;
      var4 = (this.em + 6) / 8 + 1;
      if(this.fE) {
         var1 = 49;
         var2 = 50;
         var3 = 49;
         var4 = 50;
      }

      for(var5 = var1; var5 <= var2; ++var5) {
         for(var14 = var3; var14 <= var4; ++var14) {
            if(var5 == var1 || var5 == var2 || var14 == var3 || var14 == var4) {
               if((var7 = this.o.a(0, var14, var5)) != -1) {
                  this.o.b(var7, 3);
               }

               if((var8 = this.o.a(1, var14, var5)) != -1) {
                  this.o.b(var8, 3);
               }
            }
         }
      }

   }

   private static void q() {
      ItemDefinition.z.a();
      ItemDefinition.x.a();
      ActorDefinition.t.a();
      ObjectDefinition.f.a();
      ObjectDefinition.e.a();
      Player.aj.a();
      SpotAnimation.h.a();
   }

   private void i(int var1) {
      int[] var2 = this.hk.a;
      int var3 = this.hk.a.length;

      int var4;
      for(var4 = 0; var4 < var3; ++var4) {
         var2[var4] = 0;
      }

      int var5;
      for(var4 = 1; var4 < 103; ++var4) {
         var3 = 24628 + (103 - var4 << 9 << 2);

         for(var5 = 1; var5 < 103; ++var5) {
            if((this.hg[var1][var5][var4] & 24) == 0) {
               this.cs.a(var2, var3, var1, var5, var4);
            }

            if(var1 < 3 && (this.hg[var1 + 1][var5][var4] & 8) != 0) {
               this.cs.a(var2, var3, var1 + 1, var5, var4);
            }

            var3 += 4;
         }
      }

      var4 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
      var3 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
      Sprite var9 = this.hk;
      Rasterizer2D.a(this.hk.c, var9.b, var9.a);

      int var10;
      for(var5 = 1; var5 < 103; ++var5) {
         for(var10 = 1; var10 < 103; ++var10) {
            if((this.hg[var1][var10][var5] & 24) == 0) {
               this.b(var5, var4, var10, var3, var1);
            }

            if(var1 < 3 && (this.hg[var1 + 1][var10][var5] & 8) != 0) {
               this.b(var5, var4, var10, var3, var1 + 1);
            }
         }
      }

      this.fS.a();
      this.en = 0;

      for(var5 = 0; var5 < 104; ++var5) {
         for(var10 = 0; var10 < 104; ++var10) {
            if((var1 = this.cs.l(this.bY, var5, var10)) != 0 && (var1 = ItemDefinition.a(var1 >> 14 & 32767).d) >= 0) {
               var3 = var5;
               var4 = var10;
               if(var1 != 22 && var1 != 29 && var1 != 34 && var1 != 36 && var1 != 46 && var1 != 47 && var1 != 48) {
                  int[][] var6 = this.gM[this.bY].a;

                  for(int var7 = 0; var7 < 10; ++var7) {
                     int var8;
                     if((var8 = (int)(Math.random() * 4.0D)) == 0 && var3 > 0 && var3 > var5 - 3 && (var6[var3 - 1][var4] & 19398920) == 0) {
                        --var3;
                     }

                     if(var8 == 1 && var3 < 103 && var3 < var5 + 3 && (var6[var3 + 1][var4] & 19399040) == 0) {
                        ++var3;
                     }

                     if(var8 == 2 && var4 > 0 && var4 > var10 - 3 && (var6[var3][var4 - 1] & 19398914) == 0) {
                        --var4;
                     }

                     if(var8 == 3 && var4 < 103 && var4 < var10 + 3 && (var6[var3][var4 + 1] & 19398944) == 0) {
                        ++var4;
                     }
                  }
               }

               this.fD[this.en] = this.dI[var1];
               this.eo[this.en] = var3;
               this.ep[this.en] = var4;
               ++this.en;
            }
         }
      }

   }

   private void b(int var1, int var2) {
      LinkedList var3;
      if((var3 = this.aM[this.bY][var1][var2]) == null) {
         this.cs.d(this.bY, var1, var2);
      } else {
         int var4 = -99999999;
         Item var5 = null;

         Item var6;
         int var8;
         for(var6 = (Item)var3.b(); var6 != null; var6 = (Item)var3.d()) {
            ObjectDefinition var7;
            var8 = (var7 = ObjectDefinition.a(var6.a)).b;
            if(var7.r) {
               var8 *= var6.b + 1;
            }

            if(var8 > var4) {
               var4 = var8;
               var5 = var6;
            }
         }

         var3.b((Node)var5);
         var6 = null;
         Item var9 = null;

         for(Item var10 = (Item)var3.b(); var10 != null; var10 = (Item)var3.d()) {
            if(var10.a != ((Item)var5).a && var6 == null) {
               var6 = var10;
            }

            if(var10.a != ((Item)var5).a && var10.a != ((Item)var6).a && var9 == null) {
               var9 = var10;
            }
         }

         var8 = var1 + (var2 << 7) + 1610612736;
         this.cs.a(var1, var8, (Renderable)var6, this.b(this.bY, (var2 << 7) + 64, (var1 << 7) + 64), (Renderable)var9, (Renderable)var5, this.bY, var2);
      }
   }

   private void a(boolean var1) {
      for(int var2 = 0; var2 < this.aS; ++var2) {
         Npc var3 = this.aR[this.aT[var2]];
         int var4 = 536870912 + (this.aT[var2] << 14);
         if(var3 != null && var3.c() && var3.ad.s == var1) {
            int var5 = var3.V >> 7;
            int var6 = var3.W >> 7;
            if(var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
               if(var3.L == 1 && (var3.V & 127) == 64 && (var3.W & 127) == 64) {
                  if(this.ce[var5][var6] == this.hm) {
                     continue;
                  }

                  this.ce[var5][var6] = this.hm;
               }

               if(!var3.ad.p) {
                  var4 += Integer.MIN_VALUE;
               }

               this.cs.a(this.bY, var3.X, this.b(this.bY, var3.W, var3.V), var4, var3.W, (var3.L - 1 << 6) + 60, var3.V, var3, var3.M);
            }
         }
      }

   }

   private void a(int var1, Widget var2, int var3, int var4, int var5, int var6) {
      if(var2 == null) {
         var2 = Widget.e[21356];
      }

      if(var2.X == 0 && var2.E != null && !var2.aa) {
         if(var3 >= var1 && var5 >= var4 && var3 <= var1 + var2.m && var5 <= var4 + var2.ab) {
            int var7 = var2.E.length;

            for(int var8 = 0; var8 < var7; ++var8) {
               int var9 = var2.F[var8] + var1;
               int var10 = var2.ag[var8] + var4 - var6;
               Widget var11 = Widget.e[var2.E[var8]];
               var9 += var11.Y;
               var10 += var11.Z;
               if((var11.v >= 0 || var11.i != 0) && var3 >= var9 && var5 >= var10 && var3 < var9 + var11.m && var5 < var10 + var11.ab) {
                  if(var11.v >= 0) {
                     this.bD = var11.v;
                  } else {
                     this.bD = var11.O;
                  }
               }

               if(var11.X == 8 && var3 >= var9 && var5 >= var10 && var3 < var9 + var11.m && var5 < var10 + var11.ab) {
                  this.hL = var11.O;
               }

               if(var11.X == 0) {
                  this.a(var9, var11, var3, var10, var5, var11.q);
                  if(var11.W > var11.ab) {
                     this.a(var9 + var11.m, var11.ab, var3, var5, var11, var10, true, var11.W);
                  }
               } else {
                  int var13;
                  int var14;
                  if(var11.j == 1 && var3 >= var9 && var5 >= var10 && var3 < var9 + var11.m && var5 < var10 + var11.ab) {
                     boolean var12 = false;
                     if(var11.g != 0) {
                        var14 = var11.g;
                        boolean var10000;
                        if((var11.g <= 0 || var14 > 200) && (var14 < 701 || var14 > 900)) {
                           if(var14 >= 401 && var14 <= 500) {
                              this.gs[this.fx] = "Remove @whi@" + var11.M;
                              this.eQ[this.fx] = 322;
                              ++this.fx;
                              var10000 = true;
                           } else {
                              var10000 = false;
                           }
                        } else {
                           if(var14 >= 801) {
                              var14 -= 701;
                           } else if(var14 >= 701) {
                              var14 -= 601;
                           } else if(var14 >= 101) {
                              var14 -= 101;
                           } else {
                              --var14;
                           }

                           this.gs[this.fx] = "Remove @whi@" + this.ey[var14];
                           this.eQ[this.fx] = 792;
                           ++this.fx;
                           this.gs[this.fx] = "Message @whi@" + this.ey[var14];
                           this.eQ[this.fx] = 639;
                           ++this.fx;
                           var10000 = true;
                        }

                        label421: {
                           if(!var10000) {
                              label418: {
                                 var14 = var11.g;
                                 if(var11.g >= 20001 && var14 <= 20101) {
                                    var13 = var14 - 20001;
                                    String var18;
                                    if((var18 = StringUtils.a(this.cC[var13])).length() > 0) {
                                       if(var18.startsWith("@cc1@") || var18.startsWith("@cc2@") || var18.startsWith("@cc3@")) {
                                          var18 = var18.substring(5);
                                       }

                                       var18 = StringUtils.c(var18);
                                       this.gs[this.fx] = "Ban @whi@" + var18;
                                       this.eQ[this.fx] = 1502;
                                       ++this.fx;
                                       this.gs[this.fx] = "Demote @whi@" + var18;
                                       this.eQ[this.fx] = 1501;
                                       ++this.fx;
                                       this.gs[this.fx] = "Promote @whi@" + var18;
                                       this.eQ[this.fx] = 1500;
                                       ++this.fx;
                                       var10000 = true;
                                       break label418;
                                    }
                                 }

                                 var10000 = false;
                              }

                              if(!var10000) {
                                 var10000 = false;
                                 break label421;
                              }
                           }

                           var10000 = true;
                        }

                        var12 = var10000;
                     }

                     if(!var12) {
                        this.gs[this.fx] = var11.n;
                        this.eQ[this.fx] = 315;
                        this.eP[this.fx] = var11.O;
                        ++this.fx;
                     }
                  }

                  if(var11.j == 2 && this.fz == 0 && var3 >= var9 && var5 >= var10 && var3 < var9 + var11.m && var5 < var10 + var11.ab) {
                     String var17 = var11.o;
                     if(var11.o.indexOf(" ") != -1) {
                        var17 = var17.substring(0, var17.indexOf(" "));
                     }

                     if(var11.k.endsWith("Rush") || var11.k.endsWith("Burst") || var11.k.endsWith("Blitz") || var11.k.endsWith("Barrage") || var11.k.endsWith("strike") || var11.k.endsWith("bolt") || var11.k.equals("Crumble undead") || var11.k.endsWith("blast") || var11.k.endsWith("wave") || var11.k.equals("Claws of Guthix") || var11.k.equals("Flames of Zamorak") || var11.k.equals("Magic Dart")) {
                        this.gs[this.fx] = "Autocast @gre@" + var11.k;
                        this.eQ[this.fx] = 104;
                        this.eP[this.fx] = var11.O;
                        ++this.fx;
                     }

                     this.gs[this.fx] = var17 + " @gre@" + var11.k;
                     this.eQ[this.fx] = 626;
                     this.eP[this.fx] = var11.O;
                     ++this.fx;
                  }

                  if(var11.j == 3 && var3 >= var9 && var5 >= var10 && var3 < var9 + var11.m && var5 < var10 + var11.ab) {
                     this.gs[this.fx] = "Close";
                     this.eQ[this.fx] = 200;
                     this.eP[this.fx] = var11.O;
                     ++this.fx;
                  }

                  if(var11.j == 4 && var3 >= var9 && var5 >= var10 && var3 < var9 + var11.m && var5 < var10 + var11.ab) {
                     this.gs[this.fx] = var11.n;
                     this.eQ[this.fx] = 169;
                     this.eP[this.fx] = var11.O;
                     ++this.fx;
                     String var21 = var11.a;
                  }

                  if(var11.j == 5 && var3 >= var9 && var5 >= var10 && var3 < var9 + var11.m && var5 < var10 + var11.ab) {
                     this.gs[this.fx] = var11.n;
                     this.eQ[this.fx] = 646;
                     this.eP[this.fx] = var11.O;
                     ++this.fx;
                  }

                  if(var11.j == 6 && !this.fG && var3 >= var9 && var5 >= var10 && var3 < var9 + var11.m && var5 < var10 + var11.ab) {
                     this.gs[this.fx] = var11.n;
                     this.eQ[this.fx] = 679;
                     this.eP[this.fx] = var11.O;
                     ++this.fx;
                  }

                  if(var11.X == 2) {
                     int var19 = 0;

                     for(var13 = 0; var13 < var11.ab; ++var13) {
                        for(var14 = 0; var14 < var11.m; ++var14) {
                           int var15 = var9 + var14 * (32 + var11.w);
                           int var16 = var10 + var13 * (32 + var11.I);
                           if(var19 < 20) {
                              var15 += var11.h[var19];
                              var16 += var11.L[var19];
                           }

                           if(var3 >= var15 && var5 >= var16 && var3 < var15 + 32 && var5 < var16 + 32) {
                              this.ej = var19;
                              this.ek = var11.O;
                              if(var11.Q[var19] > 0) {
                                 ObjectDefinition var20 = ObjectDefinition.a(var11.Q[var19] - 1);
                                 if(this.hz == 1 && var11.N) {
                                    if(var11.O != this.hB || var19 != this.hA) {
                                       this.gs[this.fx] = "Use " + this.hD + " with @lre@" + var20.o;
                                       this.eQ[this.fx] = 870;
                                       this.eR[this.fx] = var20.d;
                                       this.eO[this.fx] = var19;
                                       this.eP[this.fx] = var11.O;
                                       ++this.fx;
                                    }
                                 } else if(this.fz == 1 && var11.N) {
                                    if((this.fB & 16) == 16) {
                                       this.gs[this.fx] = this.fC + " @lre@" + var20.o;
                                       this.eQ[this.fx] = 543;
                                       this.eR[this.fx] = var20.d;
                                       this.eO[this.fx] = var19;
                                       this.eP[this.fx] = var11.O;
                                       ++this.fx;
                                    }
                                 } else {
                                    if(var11.N) {
                                       for(var16 = 4; var16 >= 3; --var16) {
                                          if(var20.x != null && var20.x[var16] != null) {
                                             this.gs[this.fx] = var20.x[var16] + " @lre@" + var20.o;
                                             if(var16 == 3) {
                                                this.eQ[this.fx] = 493;
                                             }

                                             if(var16 == 4) {
                                                this.eQ[this.fx] = 847;
                                             }

                                             this.eR[this.fx] = var20.d;
                                          } else {
                                             if(var16 != 4) {
                                                continue;
                                             }

                                             this.gs[this.fx] = "Drop @lre@" + var20.o;
                                             this.eQ[this.fx] = 847;
                                             this.eR[this.fx] = var20.d;
                                             if(var20.d == 1971) {
                                                this.gs[this.fx] = "Remove @lre@" + var20.o;
                                             }
                                          }

                                          this.eO[this.fx] = var19;
                                          this.eP[this.fx] = var11.O;
                                          ++this.fx;
                                       }
                                    }

                                    if(var11.G) {
                                       this.gs[this.fx] = "Use @lre@" + var20.o;
                                       this.eQ[this.fx] = 447;
                                       this.eR[this.fx] = var20.d;
                                       this.eO[this.fx] = var19;
                                       this.eP[this.fx] = var11.O;
                                       ++this.fx;
                                    }

                                    if(var11.N && var20.x != null) {
                                       for(var16 = 2; var16 >= 0; --var16) {
                                          if(var20.x[var16] != null) {
                                             this.gs[this.fx] = var20.x[var16] + " @lre@" + var20.o;
                                             if(var16 == 0) {
                                                this.eQ[this.fx] = 74;
                                             }

                                             if(var16 == 1) {
                                                this.eQ[this.fx] = 454;
                                             }

                                             if(var16 == 2) {
                                                this.eQ[this.fx] = 539;
                                             }

                                             this.eR[this.fx] = var20.d;
                                             this.eO[this.fx] = var19;
                                             this.eP[this.fx] = var11.O;
                                             ++this.fx;
                                          }
                                       }
                                    }

                                    if(var11.O == 1688 && var20.y != null) {
                                       for(var16 = 4; var16 >= 0; --var16) {
                                          if(var20.y[var16] != null) {
                                             this.gs[this.fx] = var20.y[var16] + " @lre@" + var20.o;
                                             if(var16 == 0) {
                                                this.eQ[this.fx] = 700;
                                             }

                                             if(var16 == 1) {
                                                this.eQ[this.fx] = 701;
                                             }

                                             if(var16 == 2) {
                                                this.eQ[this.fx] = 702;
                                             }

                                             if(var16 == 3) {
                                                this.eQ[this.fx] = 703;
                                             }

                                             if(var16 == 4) {
                                                this.eQ[this.fx] = 704;
                                             }

                                             this.eR[this.fx] = var20.d;
                                             this.eO[this.fx] = var19;
                                             this.eP[this.fx] = var11.O;
                                             ++this.fx;
                                          }
                                       }
                                    }

                                    if(var11.r != null) {
                                       for(var16 = 4; var16 >= 0; --var16) {
                                          if(var11.r[var16] != null) {
                                             this.gs[this.fx] = var11.r[var16] + " @lre@" + var20.o;
                                             if(var16 == 0) {
                                                this.eQ[this.fx] = 632;
                                             }

                                             if(var16 == 1) {
                                                this.eQ[this.fx] = 78;
                                             }

                                             if(var16 == 2) {
                                                this.eQ[this.fx] = 867;
                                             }

                                             if(var16 == 3) {
                                                this.eQ[this.fx] = 431;
                                             }

                                             if(var16 == 4) {
                                                this.eQ[this.fx] = 53;
                                             }

                                             this.eR[this.fx] = var20.d;
                                             this.eO[this.fx] = var19;
                                             this.eP[this.fx] = var11.O;
                                             ++this.fx;
                                          }
                                       }
                                    }

                                    this.gs[this.fx] = this.bo < 2?"Examine @lre@" + var20.o:"Examine @lre@" + var20.o + " @gre@(@whi@" + (var11.Q[var19] - 1) + "@gre@)";
                                    this.eQ[this.fx] = 1125;
                                    this.eR[this.fx] = var20.d;
                                    this.eO[this.fx] = var19;
                                    this.eP[this.fx] = var11.O;
                                    ++this.fx;
                                 }
                              }
                           }

                           ++var19;
                        }
                     }
                  }
               }
            }

         }
      }
   }

   private void a(int var1, int var2, int var3, int var4, int var5) {
      this.dD.e(var4, var3);
      this.dE.e(var4, var3 + var1 - 16);
      Rasterizer2D.a(var1 - 32, var3 + 16, var4, 1, 16);
      Rasterizer2D.a(var1 - 32, var3 + 16, var4, 4011046, 15);
      Rasterizer2D.a(var1 - 32, var3 + 16, var4, 3419425, 13);
      Rasterizer2D.a(var1 - 32, var3 + 16, var4, 3024925, 11);
      Rasterizer2D.a(var1 - 32, var3 + 16, var4, 2696219, 10);
      Rasterizer2D.a(var1 - 32, var3 + 16, var4, 2433049, 9);
      Rasterizer2D.a(var1 - 32, var3 + 16, var4, 1, 1);
      int var6;
      if((var6 = (var1 - 32) * var1 / var5) < 8) {
         var6 = 8;
      }

      var1 = (var1 - 32 - var6) * var2 / (var5 - var1);
      Rasterizer2D.a(var6, var3 + 16 + var1, var4, 5063219, 16);
      Rasterizer2D.d(var3 + 16 + var1, 1, var6, var4);
      Rasterizer2D.d(var3 + 16 + var1, 8482897, var6, var4 + 1);
      Rasterizer2D.d(var3 + 16 + var1, 7562570, var6, var4 + 2);
      Rasterizer2D.d(var3 + 16 + var1, 6970435, var6, var4 + 3);
      Rasterizer2D.d(var3 + 16 + var1, 6970435, var6, var4 + 4);
      Rasterizer2D.d(var3 + 16 + var1, 6641729, var6, var4 + 5);
      Rasterizer2D.d(var3 + 16 + var1, 6641729, var6, var4 + 6);
      Rasterizer2D.d(var3 + 16 + var1, 6378814, var6, var4 + 7);
      Rasterizer2D.d(var3 + 16 + var1, 6378814, var6, var4 + 8);
      Rasterizer2D.d(var3 + 16 + var1, 6115644, var6, var4 + 9);
      Rasterizer2D.d(var3 + 16 + var1, 6115644, var6, var4 + 10);
      Rasterizer2D.d(var3 + 16 + var1, 5852730, var6, var4 + 11);
      Rasterizer2D.d(var3 + 16 + var1, 5852730, var6, var4 + 12);
      Rasterizer2D.d(var3 + 16 + var1, 5326389, var6, var4 + 13);
      Rasterizer2D.d(var3 + 16 + var1, 4931889, var6, var4 + 14);
      Rasterizer2D.c(var3 + 16 + var1, 1, 15, var4);
      Rasterizer2D.c(var3 + 17 + var1, 1, 15, var4);
      Rasterizer2D.c(var3 + 17 + var1, 6641729, 14, var4);
      Rasterizer2D.c(var3 + 17 + var1, 6970435, 13, var4);
      Rasterizer2D.c(var3 + 17 + var1, 7167816, 11, var4);
      Rasterizer2D.c(var3 + 17 + var1, 7562570, 10, var4);
      Rasterizer2D.c(var3 + 17 + var1, 7759947, 7, var4);
      Rasterizer2D.c(var3 + 17 + var1, 8088141, 5, var4);
      Rasterizer2D.c(var3 + 17 + var1, 8285776, 4, var4);
      Rasterizer2D.c(var3 + 17 + var1, 8482897, 3, var4);
      Rasterizer2D.c(var3 + 17 + var1, 1, 2, var4);
      Rasterizer2D.c(var3 + 18 + var1, 1, 16, var4);
      Rasterizer2D.c(var3 + 18 + var1, 5655352, 15, var4);
      Rasterizer2D.c(var3 + 18 + var1, 6115644, 14, var4);
      Rasterizer2D.c(var3 + 18 + var1, 6444608, 11, var4);
      Rasterizer2D.c(var3 + 18 + var1, 6641729, 10, var4);
      Rasterizer2D.c(var3 + 18 + var1, 6970435, 7, var4);
      Rasterizer2D.c(var3 + 18 + var1, 7233606, 5, var4);
      Rasterizer2D.c(var3 + 18 + var1, 7430727, 4, var4);
      Rasterizer2D.c(var3 + 18 + var1, 8088141, 3, var4);
      Rasterizer2D.c(var3 + 18 + var1, 8482897, 2, var4);
      Rasterizer2D.c(var3 + 18 + var1, 1, 1, var4);
      Rasterizer2D.c(var3 + 19 + var1, 1, 16, var4);
      Rasterizer2D.c(var3 + 19 + var1, 5326389, 15, var4);
      Rasterizer2D.c(var3 + 19 + var1, 5655352, 14, var4);
      Rasterizer2D.c(var3 + 19 + var1, 6115644, 11, var4);
      Rasterizer2D.c(var3 + 19 + var1, 6378814, 9, var4);
      Rasterizer2D.c(var3 + 19 + var1, 6641729, 7, var4);
      Rasterizer2D.c(var3 + 19 + var1, 6970435, 5, var4);
      Rasterizer2D.c(var3 + 19 + var1, 7233606, 4, var4);
      Rasterizer2D.c(var3 + 19 + var1, 7562570, 3, var4);
      Rasterizer2D.c(var3 + 19 + var1, 8482897, 2, var4);
      Rasterizer2D.c(var3 + 19 + var1, 1, 1, var4);
      Rasterizer2D.c(var3 + 20 + var1, 1, 16, var4);
      Rasterizer2D.c(var3 + 20 + var1, 4931889, 15, var4);
      Rasterizer2D.c(var3 + 20 + var1, 5523766, 14, var4);
      Rasterizer2D.c(var3 + 20 + var1, 5852730, 13, var4);
      Rasterizer2D.c(var3 + 20 + var1, 6115644, 10, var4);
      Rasterizer2D.c(var3 + 20 + var1, 6378814, 8, var4);
      Rasterizer2D.c(var3 + 20 + var1, 6641729, 6, var4);
      Rasterizer2D.c(var3 + 20 + var1, 6970435, 4, var4);
      Rasterizer2D.c(var3 + 20 + var1, 7562570, 3, var4);
      Rasterizer2D.c(var3 + 20 + var1, 8482897, 2, var4);
      Rasterizer2D.c(var3 + 20 + var1, 1, 1, var4);
      Rasterizer2D.d(var3 + 16 + var1, 1, var6, var4 + 15);
      Rasterizer2D.c(var3 + 15 + var1 + var6, 1, 16, var4);
      Rasterizer2D.c(var3 + 14 + var1 + var6, 1, 15, var4);
      Rasterizer2D.c(var3 + 14 + var1 + var6, 4142890, 14, var4);
      Rasterizer2D.c(var3 + 14 + var1 + var6, 4471853, 10, var4);
      Rasterizer2D.c(var3 + 14 + var1 + var6, 4734511, 9, var4);
      Rasterizer2D.c(var3 + 14 + var1 + var6, 4866095, 7, var4);
      Rasterizer2D.c(var3 + 14 + var1 + var6, 4931889, 4, var4);
      Rasterizer2D.c(var3 + 14 + var1 + var6, 5655352, 3, var4);
      Rasterizer2D.c(var3 + 14 + var1 + var6, 1, 2, var4);
      Rasterizer2D.c(var3 + 13 + var1 + var6, 1, 16, var4);
      Rasterizer2D.c(var3 + 13 + var1 + var6, 4471853, 15, var4);
      Rasterizer2D.c(var3 + 13 + var1 + var6, 4931889, 11, var4);
      Rasterizer2D.c(var3 + 13 + var1 + var6, 5326389, 9, var4);
      Rasterizer2D.c(var3 + 13 + var1 + var6, 5523766, 7, var4);
      Rasterizer2D.c(var3 + 13 + var1 + var6, 5655352, 6, var4);
      Rasterizer2D.c(var3 + 13 + var1 + var6, 5852730, 4, var4);
      Rasterizer2D.c(var3 + 13 + var1 + var6, 6444608, 3, var4);
      Rasterizer2D.c(var3 + 13 + var1 + var6, 6970435, 2, var4);
      Rasterizer2D.c(var3 + 13 + var1 + var6, 1, 1, var4);
      Rasterizer2D.c(var3 + 12 + var1 + var6, 1, 16, var4);
      Rasterizer2D.c(var3 + 12 + var1 + var6, 4471853, 15, var4);
      Rasterizer2D.c(var3 + 12 + var1 + var6, 4931889, 14, var4);
      Rasterizer2D.c(var3 + 12 + var1 + var6, 5523766, 12, var4);
      Rasterizer2D.c(var3 + 12 + var1 + var6, 5655352, 11, var4);
      Rasterizer2D.c(var3 + 12 + var1 + var6, 5852730, 10, var4);
      Rasterizer2D.c(var3 + 12 + var1 + var6, 6115644, 7, var4);
      Rasterizer2D.c(var3 + 12 + var1 + var6, 6378814, 4, var4);
      Rasterizer2D.c(var3 + 12 + var1 + var6, 7233606, 3, var4);
      Rasterizer2D.c(var3 + 12 + var1 + var6, 8088141, 2, var4);
      Rasterizer2D.c(var3 + 12 + var1 + var6, 1, 1, var4);
      Rasterizer2D.c(var3 + 11 + var1 + var6, 1, 16, var4);
      Rasterizer2D.c(var3 + 11 + var1 + var6, 4931889, 15, var4);
      Rasterizer2D.c(var3 + 11 + var1 + var6, 5326389, 14, var4);
      Rasterizer2D.c(var3 + 11 + var1 + var6, 5655352, 13, var4);
      Rasterizer2D.c(var3 + 11 + var1 + var6, 5852730, 11, var4);
      Rasterizer2D.c(var3 + 11 + var1 + var6, 6115644, 9, var4);
      Rasterizer2D.c(var3 + 11 + var1 + var6, 6378814, 7, var4);
      Rasterizer2D.c(var3 + 11 + var1 + var6, 6641729, 5, var4);
      Rasterizer2D.c(var3 + 11 + var1 + var6, 6970435, 4, var4);
      Rasterizer2D.c(var3 + 11 + var1 + var6, 7562570, 3, var4);
      Rasterizer2D.c(var3 + 11 + var1 + var6, 8088141, 2, var4);
      Rasterizer2D.c(var3 + 11 + var1 + var6, 1, 1, var4);
   }

   private void a(Buffer var1, int var2) {
      this.aU = 0;
      this.bK = 0;
      Buffer var3 = var1;
      Client var4 = this;
      var1.n();
      int var5;
      int var6;
      if((var5 = var1.i(8)) < this.aS) {
         for(var6 = var5; var6 < var4.aS; ++var6) {
            var4.aV[var4.aU++] = var4.aT[var6];
         }
      }

      if(var5 > var4.aS) {
         SignLink.b(y + " Too many npcs");
         throw new RuntimeException("eek");
      } else {
         var4.aS = 0;

         for(var6 = 0; var6 < var5; ++var6) {
            int var7 = var4.aT[var6];
            Npc var8 = var4.aR[var7];
            if(var3.i(1) == 0) {
               var4.aT[var4.aS++] = var7;
               var8.I = x;
            } else {
               int var9;
               if((var9 = var3.i(2)) == 0) {
                  var4.aT[var4.aS++] = var7;
                  var8.I = x;
                  var4.bL[var4.bK++] = var7;
               } else if(var9 == 1) {
                  var4.aT[var4.aS++] = var7;
                  var8.I = x;
                  var9 = var3.i(3);
                  var8.a(false, var9);
                  if(var3.i(1) == 1) {
                     var4.bL[var4.bK++] = var7;
                  }
               } else if(var9 == 2) {
                  var4.aT[var4.aS++] = var7;
                  var8.I = x;
                  var9 = var3.i(3);
                  var8.a(true, var9);
                  var9 = var3.i(3);
                  var8.a(true, var9);
                  if(var3.i(1) == 1) {
                     var4.bL[var4.bK++] = var7;
                  }
               } else if(var9 == 3) {
                  var4.aV[var4.aU++] = var7;
               }
            }
         }

         this.a(var2, var1);
         this.b(var1);

         int var11;
         for(var11 = 0; var11 < this.aU; ++var11) {
            int var10 = this.aV[var11];
            if(this.aR[var10].I != x) {
               this.aR[var10].ad = null;
               this.aR[var10] = null;
            }
         }

         if(var1.b != var2) {
            SignLink.b(y + " size mismatch in getnpcpos - pos:" + var1.b + " psize:" + var2);
            throw new RuntimeException("eek");
         } else {
            for(var11 = 0; var11 < this.aS; ++var11) {
               if(this.aR[this.aT[var11]] == null) {
                  SignLink.b(y + " null entry in npc list - pos:" + var11 + " size:" + this.aS);
                  throw new RuntimeException("eek");
               }
            }

         }
      }
   }

   private void j(int var1) {
      try {
         int var2;
         if((var2 = Varp.a[var1].b) == 0) {
            return;
         }

         var1 = this.m[var1];
         if(var2 == 1) {
            if(var1 == 1) {
               this.av = 0.9D;
            }

            if(var1 == 2) {
               this.av = 0.8D;
            }

            if(var1 == 3) {
               this.av = 0.7D;
            }

            if(var1 == 4) {
               this.av = 0.6D;
            }

            Rasterizer3D.a(this.av);
            ObjectDefinition.e.a();
            this.he = true;
         }

         if(var2 == 3) {
            boolean var3 = fI;
            if(var1 == 0) {
               if(!fI) {
                  this.hh = 0;
               }

               this.l(256);
               fI = true;
            }

            if(var1 == 1) {
               this.l(192);
               fI = true;
            }

            if(var1 == 2) {
               this.l(128);
               fI = true;
            }

            if(var1 == 3) {
               this.l(64);
               fI = true;
            }

            if(var1 == 4) {
               fI = false;
            }

            if(fI != var3) {
               if(fI) {
                  this.gH = this.cE;
                  this.gI = true;
                  this.o.a(2, this.gH);
               } else {
                  this.y();
               }

               this.hh = 0;
            }
         }

         if(var2 == 4) {
            Class49.a = var1;
            if(var1 == 0) {
               this.bc = true;
            }

            if(var1 == 1) {
               this.bc = true;
            }

            if(var1 == 2) {
               this.bc = true;
            }

            if(var1 == 3) {
               this.bc = true;
            }

            if(var1 == 4) {
               this.bc = false;
            }
         }

         if(var2 == 5) {
            this.hd = var1;
         }

         if(var2 == 6) {
            this.gY = var1;
         }

         if(var2 == 7) {
            this.at = var1 == 1;
         }

         if(var2 == 8) {
            this.gq = var1;
            D = true;
         }

         if(var2 == 9) {
            this.bT = var1;
            return;
         }
      } catch (Exception var4) {
         ;
      }

   }

   private void r() {
      try {
         int var1 = 0;

         int var2;
         int var12;
         for(var2 = -1; var2 < this.bI + this.aS; ++var2) {
            Object var3;
            if(var2 == -1) {
               var3 = t;
            } else if(var2 < this.bI) {
               var3 = this.bH[this.bJ[var2]];
            } else {
               var3 = this.aR[this.aT[var2 - this.bI]];
            }

            if(var3 != null && ((Actor)var3).c()) {
               ActorDefinition var4;
               if(var3 instanceof Npc) {
                  var4 = ((Npc)var3).ad;
                  if(((Npc)var3).ad.r != null) {
                     var4 = var4.b();
                  }

                  if(var4 == null) {
                     continue;
                  }
               }

               if(var2 < this.bI) {
                  var12 = 30;
                  Player var5;
                  if((var5 = (Player)var3).al >= 0) {
                     this.a((Actor)var3, ((Actor)var3).h + 15);
                     if(this.cK >= 0) {
                        if(var5.am < 2) {
                           this.eU[var5.am].e(this.cK - 12, this.cL - 30);
                           var12 += 25;
                        }

                        if(var5.al < 7) {
                           this.eT[var5.al].e(this.cK - 12, this.cL - var12);
                           var12 += 18;
                        }
                     }
                  }

                  if(var2 >= 0 && this.bi == 10 && this.ch == this.bJ[var2]) {
                     this.a((Actor)var3, ((Actor)var3).h + 15);
                     if(this.cK >= 0) {
                        this.eV[var5.an].e(this.cK - 12, this.cL - var12);
                     }
                  }
               } else {
                  var4 = ((Npc)var3).ad;
                  if(((Npc)var3).ad.j >= 0 && var4.j < this.eT.length) {
                     this.a((Actor)var3, ((Actor)var3).h + 15);
                     if(this.cK >= 0) {
                        this.eT[var4.j].e(this.cK - 12, this.cL - 30);
                     }
                  }

                  if(this.bi == 1 && this.gE == this.aT[var2 - this.bI] && x % 20 < 10) {
                     this.a((Actor)var3, ((Actor)var3).h + 15);
                     if(this.cK >= 0) {
                        this.eV[0].e(this.cK - 12, this.cL - 28);
                     }
                  }
               }

               if(((Actor)var3).g != null && (var2 >= this.bI || this.hE == 0 || this.hE == 3 || this.hE == 1 && this.c(((Player)var3).ai))) {
                  this.a((Actor)var3, ((Actor)var3).h);
                  if(this.cK >= 0 && var1 < 50) {
                     this.cT[var1] = this.ht.b(((Actor)var3).g) / 2;
                     this.cS[var1] = this.ht.a;
                     this.cQ[var1] = this.cK;
                     this.cR[var1] = this.cL;
                     this.cU[var1] = ((Actor)var3).l;
                     this.cV[var1] = ((Actor)var3).D;
                     this.cW[var1] = ((Actor)var3).H;
                     this.cX[var1++] = ((Actor)var3).g;
                     if(this.gY == 0 && ((Actor)var3).D > 0 && ((Actor)var3).D <= 3) {
                        this.cS[var1] += 10;
                        this.cR[var1] += 5;
                     }

                     if(this.gY == 0 && ((Actor)var3).D == 4) {
                        this.cT[var1] = 60;
                     }

                     if(this.gY == 0 && ((Actor)var3).D == 5) {
                        this.cS[var1] += 5;
                     }
                  }
               }

               if(((Actor)var3).E > x) {
                  try {
                     this.a((Actor)var3, ((Actor)var3).h + 15);
                     if(this.cK >= 0) {
                        if((var12 = ((Actor)var3).F * 30 / ((Actor)var3).G) > 30) {
                           var12 = 30;
                        }

                        Rasterizer2D.a(5, this.cL - 3, this.cK - 15, '\uff00', var12);
                        Rasterizer2D.a(5, this.cL - 3, this.cK - 15 + var12, 16711680, 30 - var12);
                     }
                  } catch (Exception var9) {
                     ;
                  }
               }

               for(var12 = 0; var12 < 4; ++var12) {
                  if(((Actor)var3).o[var12] > x) {
                     this.a((Actor)var3, ((Actor)var3).h / 2);
                     if(this.cK >= 0) {
                        if(var12 == 1) {
                           this.cL -= 20;
                        }

                        if(var12 == 2) {
                           this.cK -= 15;
                           this.cL -= 10;
                        }

                        if(var12 == 3) {
                           this.cK += 15;
                           this.cL -= 10;
                        }

                        this.db[((Actor)var3).n[var12]].e(this.cK - 12, this.cL - 12);
                        this.hr.a(0, String.valueOf(((Actor)var3).m[var12]), this.cL + 4, this.cK);
                        this.hr.a(16777215, String.valueOf(((Actor)var3).m[var12]), this.cL + 3, this.cK - 1);
                     }
                  }
               }
            }
         }

         for(var2 = 0; var2 < var1; ++var2) {
            int var11 = this.cQ[var2];
            var12 = this.cR[var2];
            int var13 = this.cT[var2];
            int var6 = this.cS[var2];
            boolean var7 = true;

            while(var7) {
               var7 = false;

               for(int var8 = 0; var8 < var2; ++var8) {
                  if(var12 + 2 > this.cR[var8] - this.cS[var8] && var12 - var6 < this.cR[var8] + 2 && var11 - var13 < this.cQ[var8] + this.cT[var8] && var11 + var13 > this.cQ[var8] - this.cT[var8] && this.cR[var8] - this.cS[var8] < var12) {
                     var12 = this.cR[var8] - this.cS[var8];
                     var7 = true;
                  }
               }
            }

            this.cK = this.cQ[var2];
            this.cL = this.cR[var2] = var12;
            String var14 = this.cX[var2];
            if(this.gY == 0) {
               var11 = 16776960;
               if(this.cU[var2] < 6) {
                  var11 = this.cM[this.cU[var2]];
               }

               if(this.cU[var2] == 6) {
                  var11 = this.hm % 20 >= 10?16776960:16711680;
               }

               if(this.cU[var2] == 7) {
                  var11 = this.hm % 20 >= 10?'\uffff':255;
               }

               if(this.cU[var2] == 8) {
                  var11 = this.hm % 20 >= 10?8454016:'\ub000';
               }

               if(this.cU[var2] == 9) {
                  if((var12 = 150 - this.cW[var2]) < 50) {
                     var11 = 16711680 + var12 * 1280;
                  } else if(var12 < 100) {
                     var11 = 16776960 - 327680 * (var12 - 50);
                  } else if(var12 < 150) {
                     var11 = '\uff00' + 5 * (var12 - 100);
                  }
               }

               if(this.cU[var2] == 10) {
                  if((var12 = 150 - this.cW[var2]) < 50) {
                     var11 = 16711680 + 5 * var12;
                  } else if(var12 < 100) {
                     var11 = 16711935 - 327680 * (var12 - 50);
                  } else if(var12 < 150) {
                     var11 = 255 + 327680 * (var12 - 100) - 5 * (var12 - 100);
                  }
               }

               if(this.cU[var2] == 11) {
                  if((var12 = 150 - this.cW[var2]) < 50) {
                     var11 = 16777215 - var12 * 327685;
                  } else if(var12 < 100) {
                     var11 = '\uff00' + 327685 * (var12 - 50);
                  } else if(var12 < 150) {
                     var11 = 16777215 - 327680 * (var12 - 100);
                  }
               }

               if(this.cV[var2] == 0) {
                  this.ht.a(0, var14, this.cL + 1, this.cK);
                  this.ht.a(var11, var14, this.cL, this.cK);
               }

               if(this.cV[var2] == 1) {
                  this.ht.a(0, var14, this.cK, this.hm, this.cL + 1);
                  this.ht.a(var11, var14, this.cK, this.hm, this.cL);
               }

               if(this.cV[var2] == 2) {
                  this.ht.b(this.cK, var14, this.hm, this.cL + 1, 0);
                  this.ht.b(this.cK, var14, this.hm, this.cL, var11);
               }

               if(this.cV[var2] == 3) {
                  this.ht.a(150 - this.cW[var2], var14, this.hm, this.cL + 1, this.cK, 0);
                  this.ht.a(150 - this.cW[var2], var14, this.hm, this.cL, this.cK, var11);
               }

               if(this.cV[var2] == 4) {
                  var12 = this.ht.b(var14);
                  var13 = (150 - this.cW[var2]) * (var12 + 100) / 150;
                  Rasterizer2D.b(334, this.cK - 50, this.cK + 50, 0);
                  this.ht.b(0, var14, this.cL + 1, this.cK + 50 - var13);
                  this.ht.b(var11, var14, this.cL, this.cK + 50 - var13);
                  Rasterizer2D.c();
               }

               if(this.cV[var2] == 5) {
                  var12 = 150 - this.cW[var2];
                  var13 = 0;
                  if(var12 < 25) {
                     var13 = var12 - 25;
                  } else if(var12 > 125) {
                     var13 = var12 - 125;
                  }

                  Rasterizer2D.b(this.cL + 5, 0, 512, this.cL - this.ht.a - 1);
                  this.ht.a(0, var14, this.cL + 1 + var13, this.cK);
                  this.ht.a(var11, var14, this.cL + var13, this.cK);
                  Rasterizer2D.c();
               }
            } else {
               this.ht.a(0, var14, this.cL + 1, this.cK);
               this.ht.a(16776960, var14, this.cL, this.cK);
            }
         }

      } catch (Exception var10) {
         ;
      }
   }

   private void a(long var1) {
      if(var1 != 0L) {
         try {
            for(int var3 = 0; var3 < this.bO; ++var3) {
               if(this.cB[var3] == var1) {
                  --this.bO;

                  for(var3 = var3; var3 < this.bO; ++var3) {
                     this.ey[var3] = this.ey[var3 + 1];
                     this.aL[var3] = this.aL[var3 + 1];
                     this.cB[var3] = this.cB[var3 + 1];
                  }

                  this.go.a(215);
                  this.go.a(var1);
                  return;
               }
            }

         } catch (RuntimeException var4) {
            SignLink.b("18622, false, " + var1 + ", " + var4.toString());
            throw new RuntimeException();
         }
      }
   }

   private void s() {
      if(s == 0) {
         this.fQ.a();
      }

      if(s == 0) {
         Class4.a("tabs", 5).e(0, 0);
         this.aE.b(30, 37);
      }

      Rasterizer3D.t = this.gd;
      int var1 = q >= this.eM?37:74;
      if(s != 0) {
         if(q >= this.eM) {
            Class4.a("tabs", 6).e(q - 461, r - 36);
         } else {
            Class4.a("tabs", 7).e(q - 241, r - 73);
         }
      }

      if(this.eK) {
         if(q >= this.eM) {
            Class4.a("tabs", 8).e(q - 204, r - 310);
            Rasterizer2D.a(5260860, r - 303, 190, 260, 100, q - 197);
            this.aE.b(q - 198, r - 303);
         } else {
            Class4.a("tabs", 8).e(q - 222, r - 346);
            Rasterizer2D.a(5260860, r - 339, 190, 260, 100, q - 216);
            this.aE.b(q - 216, r - 339);
         }
      }

      int var2 = 0;
      int var3 = 0;
      if(s != 0) {
         var2 = q - 225;
         var3 = r - 340;
      }

      label227: {
         Client var10000;
         byte var10001;
         int var10002;
         Widget var10003;
         int var10004;
         if(s == 0) {
            if(this.gl != -1) {
               var10000 = this;
               var10001 = 0;
               var10002 = 32;
               var10003 = Widget.e[this.gl];
               var10004 = 36;
            } else {
               if(u[C] == -1) {
                  break label227;
               }

               var10000 = this;
               var10001 = 0;
               var10002 = 32;
               var10003 = Widget.e[u[C]];
               var10004 = 36;
            }
         } else {
            if(s == 0 || !this.eK) {
               break label227;
            }

            if(this.gl != -1) {
               this.a(0, q >= this.eM?var2 + 28:q - 214, (Widget)Widget.e[this.gl], q >= this.eM?var3 + 37:r - var1 - 265);
               break label227;
            }

            if(u[C] == -1) {
               break label227;
            }

            var10000 = this;
            var10001 = 0;
            var10002 = q >= this.eM?var2 + 28:q - 214;
            var10003 = Widget.e[u[C]];
            var10004 = q >= this.eM?var3 + 37:r - var1 - 265;
         }

         var10000.a(var10001, var10002, (Widget)var10003, var10004);
      }

      if(this.gl == -1) {
         if(s == 0) {
            if(u[C] != -1) {
               switch(C) {
               case 0:
                  Class4.a("tabs", 0).e(6, 0);
                  break;
               case 1:
                  Class4.a("tabs", 4).e(44, 0);
                  break;
               case 2:
                  Class4.a("tabs", 4).e(77, 0);
                  break;
               case 3:
                  Class4.a("tabs", 4).e(110, 0);
                  break;
               case 4:
                  Class4.a("tabs", 4).e(143, 0);
                  break;
               case 5:
                  Class4.a("tabs", 4).e(176, 0);
                  break;
               case 6:
                  Class4.a("tabs", 1).e(209, 0);
                  break;
               case 7:
                  Class4.a("tabs", 2).e(6, 298);
                  break;
               case 8:
                  Class4.a("tabs", 4).e(44, 298);
                  break;
               case 9:
                  Class4.a("tabs", 4).e(77, 298);
                  break;
               case 10:
                  Class4.a("tabs", 4).e(110, 298);
                  break;
               case 11:
                  Class4.a("tabs", 4).e(143, 298);
                  break;
               case 12:
                  Class4.a("tabs", 4).e(176, 298);
                  break;
               case 13:
                  Class4.a("tabs", 3).e(209, 298);
               }
            }
         } else if(s != 0) {
            if(q < this.eM) {
               if(u[C] != -1 && this.eK) {
                  switch(C) {
                  case 0:
                     Class4.a("tabs", 0).e(q - 241, r - 73);
                     break;
                  case 1:
                     Class4.a("tabs", 4).e(q - 202, r - 73);
                     break;
                  case 2:
                     Class4.a("tabs", 4).e(q - 170, r - 73);
                     break;
                  case 3:
                     Class4.a("tabs", 4).e(q - 138, r - 73);
                     break;
                  case 4:
                     Class4.a("tabs", 4).e(q - 104, r - 73);
                     break;
                  case 5:
                     Class4.a("tabs", 4).e(q - 71, r - 73);
                     break;
                  case 6:
                     Class4.a("tabs", 1).e(q - 38, r - 73);
                     break;
                  case 7:
                     Class4.a("tabs", 2).e(q - 241, r - 37);
                     break;
                  case 8:
                     Class4.a("tabs", 4).e(q - 202, r - 37);
                     break;
                  case 9:
                     Class4.a("tabs", 4).e(q - 170, r - 37);
                     break;
                  case 10:
                     Class4.a("tabs", 4).e(q - 138, r - 37);
                     break;
                  case 11:
                     Class4.a("tabs", 4).e(q - 104, r - 37);
                     break;
                  case 12:
                     Class4.a("tabs", 4).e(q - 71, r - 37);
                     break;
                  case 13:
                     Class4.a("tabs", 3).e(q - 38, r - 37);
                  }
               }
            } else if(q >= this.eM && u[C] != -1 && this.eK) {
               switch(C) {
               case 0:
                  Class4.a("tabs", 4).e(q - 462, r - 36);
                  break;
               case 1:
                  Class4.a("tabs", 4).e(q - 429, r - 36);
                  break;
               case 2:
                  Class4.a("tabs", 4).e(q - 396, r - 36);
                  break;
               case 3:
                  Class4.a("tabs", 4).e(q - 363, r - 36);
                  break;
               case 4:
                  Class4.a("tabs", 4).e(q - 330, r - 36);
                  break;
               case 5:
                  Class4.a("tabs", 4).e(q - 297, r - 36);
                  break;
               case 6:
                  Class4.a("tabs", 4).e(q - 264, r - 36);
                  break;
               case 7:
                  Class4.a("tabs", 4).e(q - 231, r - 36);
                  break;
               case 8:
                  Class4.a("tabs", 4).e(q - 198, r - 36);
                  break;
               case 9:
                  Class4.a("tabs", 4).e(q - 165, r - 36);
                  break;
               case 10:
                  Class4.a("tabs", 4).e(q - 132, r - 36);
                  break;
               case 11:
                  Class4.a("tabs", 4).e(q - 99, r - 36);
                  break;
               case 12:
                  Class4.a("tabs", 4).e(q - 66, r - 36);
                  break;
               case 13:
                  Class4.a("tabs", 4).e(q - 33, r - 36);
               }
            }
         }

         Client var6 = this;
         int[] var7 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
         int[] var4;
         int var5;
         int[] var8;
         if(s == 0) {
            var8 = new int[]{17, 49, 83, 114, 147, 180, 214, 14, 49, 82, 116, 148, 184, 216};
            var4 = new int[]{9, 7, 7, 5, 2, 3, 7, 303, 306, 306, 302, 304, 302, 303};

            for(var5 = 0; var5 < 14; ++var5) {
               if(u[var7[var5]] != -1 && (var6.dZ != var7[var5] || x % 20 < 10)) {
                  Class4.a("sideicons", var5).e(var8[var5], var4[var5]);
               }
            }
         } else if(s != 0) {
            if(q < this.eM) {
               var8 = new int[]{231, 198, 165, 134, 100, 67, 32, 232, 198, 164, 131, 98, 64, 32};
               var4 = new int[]{65, 67, 66, 68, 71, 70, 65, 32, 30, 30, 33, 31, 32, 32};

               for(var5 = 0; var5 < 14; ++var5) {
                  if(u[var7[var5]] != -1 && (var6.dZ != var7[var5] || x % 20 < 10)) {
                     Class4.a("sideicons", var5).e(q - var8[var5], r - var4[var5]);
                  }
               }
            } else if(q >= this.eM) {
               var8 = new int[]{455, 423, 389, 359, 325, 292, 258, 226, 193, 160, 126, 95, 61, 29};
               var4 = new int[]{29, 31, 29, 32, 34, 34, 31, 32, 30, 30, 33, 31, 32, 32};

               for(var5 = 0; var5 < 14; ++var5) {
                  if(u[var7[var5]] != -1 && (var6.dZ != var7[var5] || x % 20 < 10)) {
                     Class4.a("sideicons", var5).e(q - var8[var5], r - var4[var5]);
                  }
               }
            }
         }
      }

      if(this.bC && s == 0) {
         this.c(516, 168);
      }

      if(s == 0) {
         this.fQ.a(168, super.M, 516);
      }

      this.fS.a();
      Rasterizer3D.t = this.ge;
   }

   private void t() {
      int var1;
      int var2;
      for(var1 = -1; var1 < this.bI; ++var1) {
         if(var1 == -1) {
            var2 = 2047;
         } else {
            var2 = this.bJ[var1];
         }

         Player var3;
         if((var3 = this.bH[var2]) != null && var3.H > 0) {
            var3.H = var3.H - 1;
            if(var3.H == 0) {
               var3.g = null;
            }
         }
      }

      for(var1 = 0; var1 < this.aS; ++var1) {
         var2 = this.aT[var1];
         Npc var4;
         if((var4 = this.aR[var2]) != null && var4.H > 0) {
            var4.H = var4.H - 1;
            if(var4.H == 0) {
               var4.g = null;
            }
         }
      }

   }

   private void c(int var1, int var2) {
      int var3 = this.cv - (var1 - 4);
      int var4 = -var2 + 4 + this.cw;
      int var5 = this.cx;
      int var6 = this.cy + 1;
      D = true;
      fc = true;
      Rasterizer2D.a(var6 - 4, var4 + 2, var3, 7367262, var5);
      Rasterizer2D.a(var6 - 2, var4 + 1, var3 + 1, 7367262, var5 - 2);
      Rasterizer2D.a(var6, var4, var3 + 2, 7367262, var5 - 4);
      Rasterizer2D.a(var6 - 2, var4 + 1, var3 + 3, 2959394, var5 - 6);
      Rasterizer2D.a(var6 - 4, var4 + 2, var3 + 2, 2959394, var5 - 4);
      Rasterizer2D.a(var6 - 6, var4 + 3, var3 + 1, 2959394, var5 - 2);
      Rasterizer2D.a(var6 - 22, var4 + 19, var3 + 2, 5392957, var5 - 4);
      Rasterizer2D.a(var6 - 22, var4 + 20, var3 + 3, 5392957, var5 - 6);
      Rasterizer2D.a(var6 - 23, var4 + 20, var3 + 3, 2828060, var5 - 6);
      Rasterizer2D.b(var3 + 3, var5 - 6, 1, 2763035, var4 + 2);
      Rasterizer2D.b(var3 + 2, var5 - 4, 1, 2762267, var4 + 3);
      Rasterizer2D.b(var3 + 2, var5 - 4, 1, 2433302, var4 + 4);
      Rasterizer2D.b(var3 + 2, var5 - 4, 1, 2170389, var4 + 5);
      Rasterizer2D.b(var3 + 2, var5 - 4, 1, 1973010, var4 + 6);
      Rasterizer2D.b(var3 + 2, var5 - 4, 1, 1709838, var4 + 7);
      Rasterizer2D.b(var3 + 2, var5 - 4, 2, 1380875, var4 + 8);
      Rasterizer2D.b(var3 + 2, var5 - 4, 1, 1051912, var4 + 10);
      Rasterizer2D.b(var3 + 2, var5 - 4, 1, 592388, var4 + 11);
      Rasterizer2D.b(var3 + 2, var5 - 4, 1, 526083, var4 + 12);
      Rasterizer2D.b(var3 + 2, var5 - 4, 1, 592388, var4 + 13);
      Rasterizer2D.b(var3 + 2, var5 - 4, 1, 460802, var4 + 14);
      Rasterizer2D.b(var3 + 2, var5 - 4, 1, 592388, var4 + 15);
      Rasterizer2D.b(var3 + 2, var5 - 4, 1, 460802, var4 + 16);
      Rasterizer2D.b(var3 + 2, var5 - 4, 1, 592388, var4 + 17);
      Rasterizer2D.b(var3 + 2, var5 - 4, 1, 2763035, var4 + 18);
      Rasterizer2D.b(var3 + 3, var5 - 6, 1, 5654851, var4 + 19);
      this.ht.b(13023381, "Choose Option", var4 + 14, var3 + 3);
      var1 = super.S - var1;
      var2 = -var2 + super.T;

      for(var6 = 0; var6 < this.fx; ++var6) {
         int var7 = var4 + 31 + (this.fx - 1 - var6) * 15;
         int var8 = 13023381;
         if(var1 > var3 && var1 < var3 + var5 && var2 > var7 - 13 && var2 < var7 + 3) {
            Rasterizer2D.a(15, var7 - 11, var3 + 3, 7301469, this.cx - 6);
            var8 = 15656390;
         }

         this.ht.a(true, var3 + 3, var8, this.gs[var6], var7);
      }

   }

   private void b(long var1) {
      if(var1 != 0L) {
         try {
            if(this.bO >= 100 && this.dS != 1) {
               this.a("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "", true);
            } else if(this.bO >= 200) {
               this.a("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "", true);
            } else {
               String var3 = StringUtils.c(StringUtils.a(var1));

               int var4;
               for(var4 = 0; var4 < this.bO; ++var4) {
                  if(this.cB[var4] == var1) {
                     this.a(var3 + " is already on your friend list", 0, "", true);
                     return;
                  }
               }

               for(var4 = 0; var4 < this.aI; ++var4) {
                  if(this.cb[var4] == var1) {
                     this.a("Please remove " + var3 + " from your ignore list first", 0, "", true);
                     return;
                  }
               }

               if(!var3.equals(t.ai)) {
                  this.ey[this.bO] = var3;
                  this.cB[this.bO] = var1;
                  this.aL[this.bO] = 0;
                  ++this.bO;
                  this.go.a(188);
                  this.go.a(var1);
               }
            }
         } catch (RuntimeException var5) {
            SignLink.b("15283, 68, " + var1 + ", " + var5.toString());
            throw new RuntimeException();
         }
      }
   }

   private int b(int var1, int var2, int var3) {
      int var4 = var3 >> 7;
      int var5 = var2 >> 7;
      if(var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
         if((var1 = var1) < 3 && (this.hg[1][var4][var5] & 2) == 2) {
            ++var1;
         }

         var3 &= 127;
         var2 &= 127;
         int var6 = this.gA[var1][var4][var5] * (128 - var3) + this.gA[var1][var4 + 1][var5] * var3 >> 7;
         var1 = this.gA[var1][var4][var5 + 1] * (128 - var3) + this.gA[var1][var4 + 1][var5 + 1] * var3 >> 7;
         return var6 * (128 - var2) + var1 * var2 >> 7;
      } else {
         return 0;
      }
   }

   private static String k(int var0) {
      return var0 < 100000?String.valueOf(var0):(var0 < 10000000?var0 / 1000 + "K":var0 / 1000000 + "M");
   }

   private void u() {
      try {
         if(this.fV != null) {
            this.fV.a();
         }
      } catch (Exception var5) {
         ;
      }

      this.e(0);
      this.N();
      this.e(0, 0);
      this.fV = null;
      this.w = false;
      this.aP = 0;
      this.hn = "";
      this.ho = "";
      this.fe = "";
      this.aI = 0;
      this.bP = 0;
      Overlays var1 = this.E;
      OverlayTemplate[] var2;
      int var3 = (var2 = Overlays.a()).length;

      for(int var4 = 0; var4 < var3; ++var4) {
         var2[var4].b();
      }

      q();
      this.cs.b();

      for(int var6 = 0; var6 < 4; ++var6) {
         this.gM[var6].a();
      }

      System.gc();
      this.y();
      this.cE = -1;
      this.gH = 0;
      this.hh = 0;
      if(v) {
         this.gJ = 256;
         this.o.a(2, this.gH);
      }

   }

   private void v() {
      this.dH = true;

      for(int var1 = 0; var1 < 7; ++var1) {
         this.ei[var1] = -1;

         for(int var2 = 0; var2 < IdentityKit.a; ++var2) {
            if(!IdentityKit.b[var2].d && IdentityKit.b[var2].c == var1 + (this.dT?0:7)) {
               this.ei[var1] = var2;
               break;
            }
         }
      }

   }

   private void a(int var1, Buffer var2) {
      int var3;
      while(var2.c + 21 < var1 << 3 && (var3 = var2.i(14)) != 16383) {
         if(this.aR[var3] == null) {
            this.aR[var3] = new Npc();
         }

         Npc var4 = this.aR[var3];
         this.aT[this.aS++] = var3;
         var4.I = x;
         int var5;
         if((var5 = var2.i(5)) > 15) {
            var5 -= 32;
         }

         int var6;
         if((var6 = var2.i(5)) > 15) {
            var6 -= 32;
         }

         int var7 = var2.i(1);
         var4.ad = ActorDefinition.a(var2.i(14));
         if(var2.i(1) == 1) {
            this.bL[this.bK++] = var3;
         }

         var4.L = var4.ad.i;
         var4.e = var4.ad.m;
         var4.Z = var4.ad.h;
         var4.aa = var4.ad.d;
         var4.ab = var4.ad.o;
         var4.ac = var4.ad.c;
         var4.j = var4.ad.k;
         var4.a(t.a[0] + var6, t.b[0] + var5, var7 == 1);
      }

      var2.o();
   }

   public final void b() {
      if(!this.cc) {
         ++x;
         if(!this.w) {
            label180: {
               Client var1 = this;
               int var2 = q / 2;
               int var3 = r / 2;
               if(super.U == 1 && this.b(q - 52, 10, q - 10, 52)) {
                  if(v) {
                     v = false;
                     this.y();
                  } else if(!v) {
                     v = true;
                     this.gJ = 256;
                     this.gH = 0;

                     try {
                        var1.gH = Integer.parseInt(var1.getParameter("music"));
                     } catch (Exception var7) {
                        ;
                     }

                     this.o.a(2, this.gH);
                  }

                  Settings.a();
               }

               if(this.hn.length() > 0 || this.ho.length() > 0) {
                  if(this.hn.length() > 0) {
                     this.hs.a(16777215, var2 + 5, this.hn, var3 + 80, true);
                  }

                  this.hs.a(16777215, var2 + 5, this.ho, var3 + 80, true);
               }

               if(super.U == 1 && this.b(var2 - 108, var3 + 12, var2 - 90, var3 + 24)) {
                  if(c) {
                     c = false;
                  } else {
                     c = true;
                  }

                  Settings.a();
               }

               if(super.U == 1 && this.b(var2 - 100, var3 - 64, var2 + Class4.a("login", 1).b / 2, var3 - 38)) {
                  this.gC = 0;
               }

               if(super.U == 1 && this.b(var2 - 100, var3 - 19, var2 + Class4.a("login", 1).b / 2, var3 + 7)) {
                  this.gC = 1;
               }

               if(super.U == 1 && this.b(var2 - 80, var3 + 38, var2 + Class4.a("login", 2).b / 2, var3 + 64)) {
                  if(y.length() > 0 && z.length() > 0) {
                     this.dN = 0;
                     this.a(y, z, false);
                     if(!Settings.a.equals(y) || !Settings.b.equals(z)) {
                        Settings.a();
                     }

                     this.y();
                     if(this.w) {
                        break label180;
                     }
                  } else {
                     this.hn = "Please enter vscape valid login.";
                  }
               }

               int var4;
               while((var4 = var1.d(-796)) != -1) {
                  boolean var5 = false;

                  for(int var6 = 0; var6 < 95; ++var6) {
                     if(var4 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".charAt(var6)) {
                        var5 = true;
                        break;
                     }
                  }

                  if(var1.gC == 0) {
                     if(var4 == 8 && y.length() > 0) {
                        y = y.substring(0, y.length() - 1);
                     }

                     if(var4 == 9 || var4 == 10 || var4 == 13) {
                        var1.gC = 1;
                     }

                     if(var5) {
                        y = y + (char)var4;
                     }

                     if(y.length() > 12) {
                        y = y.substring(0, 12);
                     }
                  } else if(var1.gC == 1) {
                     if(var4 == 8 && z.length() > 0) {
                        z = z.substring(0, z.length() - 1);
                     }

                     if(var4 == 9 || var4 == 10 || var4 == 13) {
                        var1.gC = 0;
                     }

                     if(var5) {
                        z = z + (char)var4;
                     }

                     if(z.length() > 20) {
                        z = z.substring(0, 20);
                     }
                  }

                  var1.hs.a(16777215, var2 - 308, var1.hn, var3 - 47, true);
                  var1.hs.a(16777215, var2 + 5, var1.hn, var3 - 180, true);
               }
            }
         } else {
            this.A();
         }

         this.z();
      }
   }

   private void b(boolean var1) {
      if(t.V >> 7 == this.hi && t.W >> 7 == this.hj) {
         this.hi = 0;
      }

      int var2 = this.bI;
      if(var1) {
         var2 = 1;
      }

      for(int var3 = 0; var3 < var2; ++var3) {
         Player var4;
         int var5;
         if(var1) {
            var4 = t;
            var5 = 33538048;
         } else {
            var4 = this.bH[this.bJ[var3]];
            var5 = this.bJ[var3] << 14;
         }

         if(var4 != null && var4.ar) {
            var4.af = this.bI > 200 && !var1 && var4.p == var4.j;
            int var6 = var4.V >> 7;
            int var7 = var4.W >> 7;
            if(var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
               if(var4.av != null && x >= var4.ao && x < var4.ap) {
                  var4.af = false;
                  var4.aq = this.b(this.bY, var4.W, var4.V);
                  this.cs.a(this.bY, var4.W, var4, var4.X, var4.aA, var4.V, var4.aq, var4.ax, var4.az, var5, var4.ay);
               } else {
                  if((var4.V & 127) == 64 && (var4.W & 127) == 64) {
                     if(this.ce[var6][var7] == this.hm) {
                        continue;
                     }

                     this.ce[var6][var7] = this.hm;
                  }

                  var4.aq = this.b(this.bY, var4.W, var4.V);
                  this.cs.a(this.bY, var4.X, var4.aq, var5, var4.W, 60, var4.V, var4, var4.M);
               }
            }
         }
      }

   }

   private boolean a(Widget var1) {
      int var5 = var1.g;
      if(this.bQ == 2) {
         if(var5 == 201) {
            D = true;
            this.gF = 0;
            this.hf = true;
            this.gy = "";
            this.eh = 1;
            this.fq = "Enter name of friend to add to list";
         }

         if(var5 == 202) {
            D = true;
            this.gF = 0;
            this.hf = true;
            this.gy = "";
            this.eh = 2;
            this.fq = "Enter name of friend to delete from list";
         }
      }

      if(var5 == 205) {
         this.dt = 250;
         return true;
      } else {
         if(var5 == 501) {
            D = true;
            this.gF = 0;
            this.hf = true;
            this.gy = "";
            this.eh = 4;
            this.fq = "Enter name of player to add to list";
         }

         if(var5 == 502) {
            D = true;
            this.gF = 0;
            this.hf = true;
            this.gy = "";
            this.eh = 5;
            this.fq = "Enter name of player to delete from list";
         }

         if(var5 == 550) {
            D = true;
            this.gF = 0;
            this.hf = true;
            this.gy = "";
            this.eh = 6;
            this.fq = "Enter the name of the chat you wish to join";
         }

         int var2;
         int var3;
         int var4;
         if(var5 >= 300 && var5 <= 313) {
            var2 = (var5 - 300) / 2;
            var3 = var5 & 1;
            if((var4 = this.ei[var2]) != -1) {
               while(true) {
                  if(var3 == 0) {
                     --var4;
                     if(var4 < 0) {
                        var4 = IdentityKit.a - 1;
                     }
                  }

                  if(var3 == 1) {
                     ++var4;
                     if(var4 >= IdentityKit.a) {
                        var4 = 0;
                     }
                  }

                  if(!IdentityKit.b[var4].d && IdentityKit.b[var4].c == var2 + (this.dT?0:7)) {
                     this.ei[var2] = var4;
                     this.dH = true;
                     break;
                  }
               }
            }
         }

         if(var5 >= 314 && var5 <= 323) {
            var2 = (var5 - 314) / 2;
            var3 = var5 & 1;
            var4 = this.dd[var2];
            if(var3 == 0) {
               --var4;
               if(var4 < 0) {
                  var4 = n[var2].length - 1;
               }
            }

            if(var3 == 1) {
               ++var4;
               if(var4 >= n[var2].length) {
                  var4 = 0;
               }
            }

            this.dd[var2] = var4;
            this.dH = true;
         }

         if(var5 == 324 && !this.dT) {
            this.dT = true;
            this.v();
         }

         if(var5 == 325 && this.dT) {
            this.dT = false;
            this.v();
         }

         if(var5 != 326) {
            if(var5 == 613) {
               this.fN = !this.fN;
            }

            if(var5 >= 601 && var5 <= 612) {
               this.Y();
               if(this.bA.length() > 0) {
                  this.go.a(218);
                  this.go.a(StringUtils.a(this.bA));
                  this.go.b(var5 - 601);
                  this.go.b(this.fN?1:0);
               }
            }

            return false;
         } else {
            this.go.a(101);
            this.go.b(this.dT?0:1);

            for(var2 = 0; var2 < 7; ++var2) {
               this.go.b(this.ei[var2]);
            }

            for(var2 = 0; var2 < 5; ++var2) {
               this.go.b(this.dd[var2]);
            }

            return true;
         }
      }
   }

   private void a(Buffer var1) {
      for(int var2 = 0; var2 < this.bK; ++var2) {
         int var3 = this.bL[var2];
         Player var4 = this.bH[var3];
         int var5;
         if(((var5 = var1.e()) & 64) != 0) {
            var5 += var1.e() << 8;
         }

         Player var6 = var4;
         Buffer var7 = var1;
         Client var18 = this;
         if((var5 & 1024) != 0) {
            var4.O = var1.t();
            var4.Q = var1.t();
            var4.P = var1.t();
            var4.R = var1.t();
            var4.S = var1.x() + x;
            var4.T = var1.w() + x;
            var4.U = var1.t();
            var4.b();
         }

         int var8;
         if((var5 & 256) != 0) {
            var4.s = var1.v();
            var8 = var1.j();
            var4.w = var8 >> 16;
            var4.v = x + (var8 & '\uffff');
            var4.t = 0;
            var4.u = 0;
            if(var4.v > x) {
               var4.t = -1;
            }

            if(var4.s == '\uffff') {
               var4.s = -1;
            }
         }

         int var9;
         int var10;
         if((var5 & 8) != 0) {
            if((var8 = var1.v()) == '\uffff') {
               var8 = -1;
            }

            var9 = var1.s();
            if(var8 == var4.y && var8 != -1) {
               if((var10 = Animation.a[var8].n) == 1) {
                  var4.z = 0;
                  var4.A = 0;
                  var4.B = var9;
                  var4.C = 0;
               }

               if(var10 == 2) {
                  var4.C = 0;
               }
            } else if(var8 == -1 || var4.y == -1 || Animation.a[var8].h >= Animation.a[var4.y].h) {
               var4.y = var8;
               var4.z = 0;
               var4.A = 0;
               var4.B = var9;
               var4.C = 0;
               var4.N = var4.x;
            }
         }

         if((var5 & 4) != 0) {
            var4.g = var1.l();
            if(var4.g.charAt(0) == 126) {
               var4.g = var4.g.substring(1);
               this.a(var4.g, 2, var4.ai);
            } else if(var4 == t) {
               this.a(var4.g, 2, var4.ai);
            }

            var4.l = 0;
            var4.D = 0;
            var4.H = 150;
         }

         if((var5 & 128) != 0) {
            var8 = var1.v();
            var9 = var1.e();
            var10 = var1.s();
            int var11 = var1.b;
            if(var4.ai != null && var4.ar) {
               long var12 = StringUtils.a(var4.ai);
               boolean var14 = false;
               int var15;
               if(var9 <= 1) {
                  for(var15 = 0; var15 < var18.aI; ++var15) {
                     if(var18.cb[var15] == var12) {
                        var14 = true;
                        break;
                     }
                  }
               }

               if(!var14 && var18.hb == 0) {
                  try {
                     var18.aQ.b = 0;
                     byte[] var16 = var18.aQ.a;
                     var14 = false;
                     Buffer var22 = var7;

                     for(var15 = var10 + 0 - 1; var15 >= 0; --var15) {
                        var16[var15] = var22.a[var22.b++];
                     }

                     var18.aQ.b = 0;
                     String var23 = ChatMessageCodec.a(var10, var18.aQ);
                     var6.g = var23;
                     var6.l = var8 >> 8;
                     var6.ad = var9;
                     var6.D = var8 & 255;
                     var6.H = 150;
                     if(var6.aC) {
                        var18.a(var23, 1, "@irn@" + var6.ai, var9);
                     } else {
                        var18.a(var23, 1, var6.ai, var9);
                     }
                  } catch (Exception var17) {
                     SignLink.b("cde2");
                  }
               }
            }

            var1.b = var11 + var10;
         }

         if((var5 & 1) != 0) {
            var4.c = var1.v();
            if(var4.c == '\uffff') {
               var4.c = -1;
            }
         }

         if((var5 & 16) != 0) {
            byte[] var20 = new byte[var8 = var1.s()];
            Buffer var21 = new Buffer(var20);
            var1.a(var8, 0, var20);
            var18.bM[var3] = var21;
            var4.a(var21);
         }

         if((var5 & 2) != 0) {
            var4.J = var1.x();
            var4.K = var1.v();
         }

         if((var5 & 32) != 0) {
            var8 = var1.e();
            var9 = var1.r();
            var4.a(var9, var8, x);
            var4.E = x + 300;
            var4.F = var1.s();
            var4.G = var1.e();
         }

         if((var5 & 512) != 0) {
            var8 = var1.e();
            var9 = var1.t();
            var4.a(var9, var8, x);
            var4.E = x + 300;
            var4.F = var1.e();
            var4.G = var1.s();
         }
      }

   }

   private void b(int var1, int var2, int var3, int var4, int var5) {
      int var6;
      int var7;
      int var8;
      int var9;
      if((var6 = this.cs.i(var5, var3, var1)) != 0) {
         var8 = (var7 = this.cs.c(var5, var3, var1, var6)) >> 6 & 3;
         var7 &= 31;
         var2 = var2;
         if(var6 > 0) {
            var2 = var4;
         }

         int[] var12 = this.hk.a;
         var9 = 24624 + (var3 << 2) + (103 - var1 << 9 << 2);
         ItemDefinition var10;
         if((var10 = ItemDefinition.a(var6 >> 14 & 32767)).i != -1) {
            IndexedImage var11;
            if((var11 = this.ee[var10.i]) != null) {
               var4 = ((var10.c << 2) - var11.c) / 2;
               var6 = ((var10.k << 2) - var11.d) / 2;
               var11.a(48 + (var3 << 2) + var4, 48 + (104 - var1 - var10.k << 2) + var6);
            }
         } else {
            if(var7 == 0 || var7 == 2) {
               if(var8 == 0) {
                  var12[var9] = var2;
                  var12[var9 + 512] = var2;
                  var12[var9 + 1024] = var2;
                  var12[var9 + 1536] = var2;
               } else if(var8 == 1) {
                  var12[var9] = var2;
                  var12[var9 + 1] = var2;
                  var12[var9 + 2] = var2;
                  var12[var9 + 3] = var2;
               } else if(var8 == 2) {
                  var12[var9 + 3] = var2;
                  var12[var9 + 3 + 512] = var2;
                  var12[var9 + 3 + 1024] = var2;
                  var12[var9 + 3 + 1536] = var2;
               } else if(var8 == 3) {
                  var12[var9 + 1536] = var2;
                  var12[var9 + 1536 + 1] = var2;
                  var12[var9 + 1536 + 2] = var2;
                  var12[var9 + 1536 + 3] = var2;
               }
            }

            if(var7 == 3) {
               if(var8 == 0) {
                  var12[var9] = var2;
               } else if(var8 == 1) {
                  var12[var9 + 3] = var2;
               } else if(var8 == 2) {
                  var12[var9 + 3 + 1536] = var2;
               } else if(var8 == 3) {
                  var12[var9 + 1536] = var2;
               }
            }

            if(var7 == 2) {
               if(var8 == 3) {
                  var12[var9] = var2;
                  var12[var9 + 512] = var2;
                  var12[var9 + 1024] = var2;
                  var12[var9 + 1536] = var2;
               } else if(var8 == 0) {
                  var12[var9] = var2;
                  var12[var9 + 1] = var2;
                  var12[var9 + 2] = var2;
                  var12[var9 + 3] = var2;
               } else if(var8 == 1) {
                  var12[var9 + 3] = var2;
                  var12[var9 + 3 + 512] = var2;
                  var12[var9 + 3 + 1024] = var2;
                  var12[var9 + 3 + 1536] = var2;
               } else if(var8 == 2) {
                  var12[var9 + 1536] = var2;
                  var12[var9 + 1536 + 1] = var2;
                  var12[var9 + 1536 + 2] = var2;
                  var12[var9 + 1536 + 3] = var2;
               }
            }
         }
      }

      if((var6 = this.cs.k(var5, var3, var1)) != 0) {
         var8 = (var7 = this.cs.c(var5, var3, var1, var6)) >> 6 & 3;
         var7 &= 31;
         ItemDefinition var13;
         int var18;
         if((var13 = ItemDefinition.a(var6 >> 14 & 32767)).i != -1) {
            IndexedImage var17;
            if((var17 = this.ee[var13.i]) != null) {
               var6 = ((var13.c << 2) - var17.c) / 2;
               var18 = ((var13.k << 2) - var17.d) / 2;
               var17.a(48 + (var3 << 2) + var6, 48 + (104 - var1 - var13.k << 2) + var18);
            }
         } else if(var7 == 9) {
            var9 = 15658734;
            if(var6 > 0) {
               var9 = 15597568;
            }

            int[] var14 = this.hk.a;
            var18 = 24624 + (var3 << 2) + (103 - var1 << 9 << 2);
            if(var8 != 0 && var8 != 2) {
               var14[var18] = var9;
               var14[var18 + 512 + 1] = var9;
               var14[var18 + 1024 + 2] = var9;
               var14[var18 + 1536 + 3] = var9;
            } else {
               var14[var18 + 1536] = var9;
               var14[var18 + 1024 + 1] = var9;
               var14[var18 + 512 + 2] = var9;
               var14[var18 + 3] = var9;
            }
         }
      }

      IndexedImage var15;
      ItemDefinition var16;
      if((var6 = this.cs.l(var5, var3, var1)) != 0 && (var16 = ItemDefinition.a(var6 >> 14 & 32767)).i != -1 && (var15 = this.ee[var16.i]) != null) {
         var2 = ((var16.c << 2) - var15.c) / 2;
         var4 = ((var16.k << 2) - var15.d) / 2;
         var15.a(48 + (var3 << 2) + var2, 48 + (104 - var1 - var16.k << 2) + var4);
      }

   }

   private void w() {
      new IndexedImage(this.dY, "titlebox", 0);
      new IndexedImage(this.dY, "titlebutton", 0);
      this.fJ = new IndexedImage[12];
      int var1 = 0;

      try {
         var1 = Integer.parseInt(this.getParameter("fl_icon"));
      } catch (Exception var6) {
         ;
      }

      if(var1 == 0) {
         for(var1 = 0; var1 < 12; ++var1) {
            this.fJ[var1] = new IndexedImage(this.dY, "runes", var1);
         }
      } else {
         for(var1 = 0; var1 < 12; ++var1) {
            this.fJ[var1] = new IndexedImage(this.dY, "runes", 12 + (var1 & 3));
         }
      }

      this.gt = new Sprite(128, 265);
      this.gu = new Sprite(128, 265);
      System.arraycopy(this.fi.a, 0, this.gt.a, 0, '\u8480');
      System.arraycopy(this.fj.a, 0, this.gu.a, 0, '\u8480');
      this.be = new int[256];

      for(var1 = 0; var1 < 64; ++var1) {
         this.be[var1] = var1 * 262144;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.be[var1 + 64] = 16711680 + var1 * 1024;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.be[var1 + 128] = 16776960 + 4 * var1;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.be[var1 + 192] = 16777215;
      }

      this.bf = new int[256];

      for(var1 = 0; var1 < 64; ++var1) {
         this.bf[var1] = var1 << 10;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.bf[var1 + 64] = '\uff00' + 4 * var1;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.bf[var1 + 128] = '\uffff' + var1 * 262144;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.bf[var1 + 192] = 16777215;
      }

      this.bg = new int[256];

      for(var1 = 0; var1 < 64; ++var1) {
         this.bg[var1] = var1 << 2;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.bg[var1 + 64] = 255 + var1 * 262144;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.bg[var1 + 128] = 16711935 + var1 * 1024;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.bg[var1 + 192] = 16777215;
      }

      this.gm = new int['\u8000'];
      this.gn = new int['\u8000'];
      Client var8 = null;
      var8 = this;

      int var2;
      for(var2 = 0; var2 < var8.gm.length; ++var2) {
         var8.gm[var2] = 0;
      }

      int var3;
      for(var2 = 0; var2 < 5000; ++var2) {
         var3 = (int)(Math.random() * 128.0D * 256.0D);
         var8.gm[var3] = (int)(Math.random() * 256.0D);
      }

      for(var2 = 0; var2 < 20; ++var2) {
         for(var3 = 1; var3 < 255; ++var3) {
            for(int var4 = 1; var4 < 127; ++var4) {
               int var5 = var4 + (var3 << 7);
               var8.gn[var5] = (var8.gm[var5 - 1] + var8.gm[var5 + 1] + var8.gm[var5 - 128] + var8.gm[var5 + 128]) / 4;
            }
         }

         int[] var7 = var8.gm;
         var8.gm = var8.gn;
         var8.gn = var7;
      }

      this.a(10, (String)"Connecting to fileserver");
      if(!this.aN) {
         this.bz = true;
         this.aN = true;
         this.a((Runnable)this, 2);
      }

   }

   public static Client c() {
      return a;
   }

   public static void main(String[] var0) {
      try {
         cF = 10;
         k = 0;
         SceneGraph.a = false;
         Rasterizer3D.a = false;
         cI = false;
         MapRegion.c = false;
         ItemDefinition.f = false;
         cH = true;
         SignLink.a(InetAddress.getLocalHost());
         s = 0;
         Client var10000 = a = new Client();
         int var1 = r;
         int var2 = q;
         Client var4 = var10000;
         var10000.Y = false;
         var4.K = var2;
         var4.L = var1;
         boolean var10006 = s == 2;
         int var10007 = s;
         var4.O = new RSFrame(var4, var4.K, var4.L, var10006);
         var4.O.setFocusTraversalKeysEnabled(false);
         var4.M = var4.e().getGraphics();
         var4.N = new ProducingGraphicsBuffer(var4.K, var4.L, var4.e());
         var4.a(var4, 1);
      } catch (Exception var3) {
         ;
      }
   }

   public AppletContext getAppletContext() {
      return super.getAppletContext();
   }

   private void x() {
      byte[] var1 = this.dY.a("title.dat");
      Sprite var5 = new Sprite(var1, this);
      this.fi.a();
      var5.c(0, 0);
      this.fj.a();
      var5.c(-637, 0);
      this.ff.a();
      var5.c(-128, 0);
      this.fg.a();
      var5.c(-202, -371);
      this.fh.a();
      var5.c(-202, -171);
      this.fk.a();
      var5.c(0, -265);
      this.fl.a();
      var5.c(-562, -265);
      this.fm.a();
      var5.c(-128, -171);
      this.fn.a();
      var5.c(-562, -171);
      int[] var2 = new int[var5.b];

      for(int var3 = 0; var3 < var5.c; ++var3) {
         for(int var4 = 0; var4 < var5.b; ++var4) {
            var2[var4] = var5.a[var5.b - var4 - 1 + var5.b * var3];
         }

         System.arraycopy(var2, 0, var5.a, var5.b * var3, var5.b);
      }

      this.fi.a();
      var5.c(382, 0);
      this.fj.a();
      var5.c(-255, 0);
      this.ff.a();
      var5.c(254, 0);
      this.fg.a();
      var5.c(180, -371);
      this.fh.a();
      var5.c(180, -171);
      this.fk.a();
      var5.c(382, -265);
      this.fl.a();
      var5.c(-180, -265);
      this.fm.a();
      var5.c(254, -171);
      this.fn.a();
      var5.c(-180, -171);
      var5 = new Sprite(this.dY, "logo", 0);
      this.ff.a();
      var5.e(382 - var5.b / 2 - 128, 18);
      System.gc();
   }

   private void l(int var1) {
      this.gJ = var1;
      if(this.gK != null) {
         if(this.gK.a()) {
            this.gK.a(0, this.gJ);
         }

      }
   }

   private void y() {
      if(this.gK != null) {
         this.gK.b();
      }

   }

   private void z() {
      Resource var1;
      while((var1 = this.o.d()) != null) {
         if(var1.a == 0) {
            Model.a(var1.b, var1.c);
            if(this.hv != -1) {
               D = true;
            }
         }

         if(var1.a == 1 && var1.b != null) {
            Frame.a(var1.b, var1.c);
         }

         if(var1.a == 2 && var1.c == this.gH && var1.b != null) {
            byte[] var2 = var1.b;
            boolean var4 = this.hh > 0;
            if(this.gK != null) {
               if(this.gK.a() && !var4) {
                  this.gK.a(var2, true, this.gJ);
               } else {
                  this.gK.a(var2, false, this.gJ);
               }
            }
         }

         if(var1.a == 3 && this.dC == 1) {
            for(int var3 = 0; var3 < this.gf.length; ++var3) {
               if(this.gO[var3] == var1.c) {
                  this.gf[var3] = var1.b;
                  if(var1.b == null) {
                     this.gO[var3] = -1;
                  }
                  break;
               }

               if(this.gP[var3] == var1.c) {
                  this.gW[var3] = var1.b;
                  if(var1.b == null) {
                     this.gP[var3] = -1;
                  }
                  break;
               }
            }
         }

         if(var1.a == 93 && this.o.b(var1.c)) {
            MapRegion.a(new Buffer(var1.b), this.o);
         }
      }

   }

   private void m(int var1) {
      Widget var4 = Widget.e[var1];

      for(int var2 = 0; var2 < var4.E.length && var4.E[var2] != -1; ++var2) {
         Widget var3;
         if((var3 = Widget.e[var4.E[var2]]).X == 1) {
            this.m(var3.O);
         }

         var3.K = 0;
         var3.c = 0;
      }

   }

   private void A() {
      this.a();
      if(this.fd > 1) {
         --this.fd;
      }

      if(this.dt > 0) {
         --this.dt;
      }

      int var1;
      for(var1 = 0; var1 < 5 && this.X(); ++var1) {
         ;
      }

      if(this.w) {
         if(this.dx > 0) {
            --this.dx;
         }

         if(super.X[1] == 1 || super.X[2] == 1 || super.X[3] == 1 || super.X[4] == 1) {
            this.dy = true;
         }

         if(this.dy && this.dx <= 0) {
            this.dx = 20;
            this.dy = false;
            this.go.a(86);
            this.go.c(this.gg);
            this.go.m(this.gh);
         }

         if(super.P && !this.cA) {
            this.cA = true;
            this.go.a(3);
            this.go.b(1);
         }

         if(!super.P && this.cA) {
            this.cA = false;
            this.go.a(3);
            this.go.b(0);
         }

         int var3;
         int var4;
         int var6;
         int var7;
         if(this.dC == 1) {
            Client var2 = this;

            byte var10000;
            label471: {
               for(var3 = 0; var3 < var2.gf.length; ++var3) {
                  if(var2.gf[var3] == null && var2.gO[var3] != -1) {
                     var10000 = -1;
                     break label471;
                  }

                  if(var2.gW[var3] == null && var2.gP[var3] != -1) {
                     var10000 = -2;
                     break label471;
                  }
               }

               boolean var12 = true;

               for(var4 = 0; var4 < var2.gf.length; ++var4) {
                  byte[] var5;
                  if((var5 = var2.gW[var4]) != null) {
                     var6 = (var2.gN[var4] >> 8 << 6) - var2.dJ;
                     var7 = ((var2.gN[var4] & 255) << 6) - var2.dK;
                     if(var2.fO) {
                        var6 = 10;
                        var7 = 10;
                     }

                     var12 &= MapRegion.a(var6, var5, var7);
                  }
               }

               if(!var12) {
                  var10000 = -3;
               } else if(var2.ex) {
                  var10000 = -4;
               } else {
                  var2.dC = 2;
                  MapRegion.a = var2.bY;
                  var2.p();
                  var2.go.a(121);
                  var10000 = 0;
               }
            }

            byte var14 = var10000;
            if(var10000 != 0 && System.currentTimeMillis() - this.aJ > 360000L) {
               SignLink.b(y + " glcfb " + this.gB + "," + var14 + ",false" + "," + this.l[0] + "," + this.o.b() + "," + this.bY + "," + this.el + "," + this.em);
               this.aJ = System.currentTimeMillis();
            }
         }

         if(this.dC == 2 && this.bY != this.cZ) {
            this.cZ = this.bY;
            this.i(this.bY);
         }

         this.P();
         this.I();
         ++this.dr;
         if(this.dr > 750) {
            this.C();
         }

         this.O();
         this.J();
         this.t();
         ++this.cr;
         if(this.bX != 0) {
            this.bW += 20;
            if(this.bW >= 400) {
               this.bX = 0;
            }
         }

         if(this.gV != 0) {
            ++this.gS;
            if(this.gS >= 15) {
               if(this.gV == 3) {
                  D = true;
               }

               this.gV = 0;
            }
         }

         int var11;
         if(this.eC != 0) {
            ++this.dc;
            if(super.S > this.eD + 5 || super.S < this.eD - 5 || super.T > this.eE + 5 || super.T < this.eE - 5) {
               this.gR = true;
            }

            if(super.R == 0) {
               if(this.eC == 3) {
                  D = true;
               }

               this.eC = 0;
               if(this.gR && this.dc >= 15) {
                  this.ek = -1;
                  this.H();
                  var4 = s == 0?0:q / 2 - 356;
                  var11 = s == 0?0:r / 2 - 230;
                  if(this.eA == 5382 && super.T >= var11 + 40 && super.T <= var11 + 77) {
                     if(super.S >= var4 + 28 && super.S <= var4 + 74) {
                        this.go.a(214);
                        this.go.n('\uc369');
                        this.go.j(0);
                        this.go.n(this.eB);
                        this.go.l(this.ej);
                     }

                     if(super.S >= var4 + 75 && super.S <= var4 + 121) {
                        this.go.a(214);
                        this.go.n('\uc36a');
                        this.go.j(0);
                        this.go.n(this.eB);
                        this.go.l(this.ej);
                     }

                     if(super.S >= var4 + 122 && super.S <= var4 + 168) {
                        this.go.a(214);
                        this.go.n('\uc36b');
                        this.go.j(0);
                        this.go.n(this.eB);
                        this.go.l(this.ej);
                     }

                     if(super.S >= var4 + 169 && super.S <= var4 + 215) {
                        this.go.a(214);
                        this.go.n('\uc36c');
                        this.go.j(0);
                        this.go.n(this.eB);
                        this.go.l(this.ej);
                     }

                     if(super.S >= var4 + 216 && super.S <= var4 + 262) {
                        this.go.a(214);
                        this.go.n('\uc36d');
                        this.go.j(0);
                        this.go.n(this.eB);
                        this.go.l(this.ej);
                     }

                     if(super.S >= var4 + 263 && super.S <= var4 + 309) {
                        this.go.a(214);
                        this.go.n('\uc36e');
                        this.go.j(0);
                        this.go.n(this.eB);
                        this.go.l(this.ej);
                     }

                     if(super.S >= var4 + 310 && super.S <= var4 + 356) {
                        this.go.a(214);
                        this.go.n('\uc36f');
                        this.go.j(0);
                        this.go.n(this.eB);
                        this.go.l(this.ej);
                     }

                     if(super.S >= var4 + 357 && super.S <= var4 + 403) {
                        this.go.a(214);
                        this.go.n('\uc370');
                        this.go.j(0);
                        this.go.n(this.eB);
                        this.go.l(this.ej);
                     }

                     if(super.S >= var4 + 404 && super.S <= var4 + 450) {
                        this.go.a(214);
                        this.go.n('\uc371');
                        this.go.j(0);
                        this.go.n(this.eB);
                        this.go.l(this.ej);
                     }
                  }

                  if(this.ek == this.eA && this.ej != this.eB) {
                     Widget var10 = Widget.e[this.eA];
                     byte var15 = 0;
                     if(this.bT == 1 && var10.g == 206) {
                        var15 = 1;
                     }

                     if(var10.Q[this.ej] <= 0) {
                        var15 = 0;
                     }

                     if(var10.A) {
                        var11 = this.eB;
                        var3 = this.ej;
                        var10.Q[var3] = var10.Q[var11];
                        var10.P[var3] = var10.P[var11];
                        var10.Q[var11] = -1;
                        var10.P[var11] = 0;
                     } else if(var15 == 1) {
                        var11 = this.eB;
                        var3 = this.ej;

                        while(var11 != var3) {
                           if(var11 > var3) {
                              var10.a(var11, var11 - 1);
                              --var11;
                           } else if(var11 < var3) {
                              var10.a(var11, var11 + 1);
                              ++var11;
                           }
                        }
                     } else {
                        var10.a(this.eB, this.ej);
                     }

                     this.go.a(214);
                     this.go.n(this.eA);
                     this.go.j(var15);
                     this.go.n(this.eB);
                     this.go.l(this.ej);
                  }
               } else if((this.hd == 1 || this.g(this.fx - 1)) && this.fx > 2) {
                  this.Q();
               } else if(this.fx > 0) {
                  this.n(this.fx - 1);
               }

               this.gS = 10;
               super.U = 0;
            }
         }

         if(SceneGraph.b != -1) {
            var1 = SceneGraph.b;
            var4 = SceneGraph.c;
            boolean var13 = this.a(0, 0, 0, 0, t.b[0], 0, 0, var4, t.a[0], true, var1);
            SceneGraph.b = -1;
            if(var13) {
               this.bU = super.V;
               this.bV = super.W;
               this.bX = 1;
               this.bW = 0;
            }
         }

         if(super.U == 1 && this.aZ != null) {
            this.aZ = null;
            D = true;
            super.U = 0;
         }

         this.o();
         if(super.R == 1 || super.U == 1) {
            ++this.gz;
         }

         if(this.hM == 0 && this.hJ == 0 && this.hK == 0) {
            if(this.hN > 0) {
               --this.hN;
            }
         } else if(this.hN < 0 && !this.bC) {
            ++this.hN;
            if(this.hN == 0 && this.hM != 0) {
               D = true;
            }
         }

         if(this.dC == 2) {
            this.M();
         }

         if(this.dC == 2 && this.fP) {
            var4 = (this.eX << 7) + 64;
            var11 = (this.eY << 7) + 64;
            var3 = this.b(this.bY, var11, var4) - this.eZ;
            if(this.bj < var4) {
               this.bj += this.fa + (var4 - this.bj) * this.fb / 1000;
               if(this.bj > var4) {
                  this.bj = var4;
               }
            }

            if(this.bj > var4) {
               this.bj -= this.fa + (this.bj - var4) * this.fb / 1000;
               if(this.bj < var4) {
                  this.bj = var4;
               }
            }

            if(this.bk < var3) {
               this.bk += this.fa + (var3 - this.bk) * this.fb / 1000;
               if(this.bk > var3) {
                  this.bk = var3;
               }
            }

            if(this.bk > var3) {
               this.bk -= this.fa + (this.bk - var3) * this.fb / 1000;
               if(this.bk < var3) {
                  this.bk = var3;
               }
            }

            if(this.bl < var11) {
               this.bl += this.fa + (var11 - this.bl) * this.fb / 1000;
               if(this.bl > var11) {
                  this.bl = var11;
               }
            }

            if(this.bl > var11) {
               this.bl -= this.fa + (this.bl - var11) * this.fb / 1000;
               if(this.bl < var11) {
                  this.bl = var11;
               }
            }

            var4 = (this.df << 7) + 64;
            var11 = (this.dg << 7) + 64;
            var3 = this.b(this.bY, var11, var4) - this.dh;
            var4 -= this.bj;
            int var16 = var3 - this.bk;
            var6 = var11 - this.bl;
            var7 = (int)Math.sqrt((double)(var4 * var4 + var6 * var6));
            var11 = (int)(Math.atan2((double)var16, (double)var7) * 325.949D) & 2047;
            var4 = (int)(Math.atan2((double)var4, (double)var6) * -325.949D) & 2047;
            if(var11 < 128) {
               var11 = 128;
            }

            if(var11 > 383) {
               var11 = 383;
            }

            if(this.bm < var11) {
               this.bm += this.di + (var11 - this.bm) * this.dj / 1000;
               if(this.bm > var11) {
                  this.bm = var11;
               }
            }

            if(this.bm > var11) {
               this.bm -= this.di + (this.bm - var11) * this.dj / 1000;
               if(this.bm < var11) {
                  this.bm = var11;
               }
            }

            if((var11 = var4 - this.bn) > 1024) {
               var11 -= 2048;
            }

            if(var11 < -1024) {
               var11 += 2048;
            }

            if(var11 > 0) {
               this.bn += this.di + var11 * this.dj / 1000;
               this.bn &= 2047;
            }

            if(var11 < 0) {
               this.bn -= this.di + -var11 * this.dj / 1000;
               this.bn &= 2047;
            }

            if((var3 = var4 - this.bn) > 1024) {
               var3 -= 2048;
            }

            if(var3 < -1024) {
               var3 += 2048;
            }

            if(var3 < 0 && var11 > 0 || var3 > 0 && var11 < 0) {
               this.bn = var4;
            }
         }

         for(var1 = 0; var1 < 5; ++var1) {
            ++this.dG[var1];
         }

         this.F();
         ++super.Q;
         if(super.Q > 20000) {
            this.dt = 250;
            super.Q -= 2000;
            this.go.a(202);
         }

         ++this.ds;
         if(this.ds > 50) {
            this.go.a(0);
         }

         try {
            if(this.fV != null && this.go.b > 0) {
               this.fV.a(this.go.b, this.go.a);
               this.go.b = 0;
               this.ds = 0;
               return;
            }
         } catch (IOException var8) {
            this.C();
            return;
         } catch (Exception var9) {
            this.u();
         }

      }
   }

   private void B() {
      for(Ground var1 = (Ground)this.gb.b(); var1 != null; var1 = (Ground)this.gb.d()) {
         if(var1.d == -1) {
            var1.l = 0;
            this.a(var1);
         } else {
            var1.C();
         }
      }

   }

   public final void a(int var1, String var2) {
      this.ew = var1;
      this.dV = var2;
      if(this.ff == null) {
         super.N = null;
         this.fT = null;
         this.fR = null;
         this.fQ = null;
         this.fS = null;
         this.fs = null;
         this.fi = new ProducingGraphicsBuffer(128, 265, this.e());
         Rasterizer2D.d();
         this.fj = new ProducingGraphicsBuffer(128, 265, this.e());
         Rasterizer2D.d();
         this.ff = new ProducingGraphicsBuffer(509, 171, this.e());
         Rasterizer2D.d();
         this.fg = new ProducingGraphicsBuffer(360, 132, this.e());
         Rasterizer2D.d();
         this.fh = new ProducingGraphicsBuffer(360, 200, this.e());
         Rasterizer2D.d();
         this.fk = new ProducingGraphicsBuffer(202, 238, this.e());
         Rasterizer2D.d();
         this.fl = new ProducingGraphicsBuffer(203, 238, this.e());
         Rasterizer2D.d();
         this.fm = new ProducingGraphicsBuffer(74, 94, this.e());
         Rasterizer2D.d();
         this.fn = new ProducingGraphicsBuffer(75, 94, this.e());
         Rasterizer2D.d();
         if(this.dY != null) {
            this.x();
            this.w();
         }

         this.he = true;
      }

      if(this.dY == null) {
         super.a(var1, var2);
      } else {
         this.R();
         int var3 = q / 2;
         int var4 = r / 2;
         this.ht.a(16777215, var3, "vscape is loading - please wait...", var4 - 23 - 20, true);
         int var5 = var4 - 18 - 20;
         Rasterizer2D.b(var3 - 152, 304, 34, 9179409, var5);
         Rasterizer2D.b(var3 - 151, 302, 32, 0, var5 + 1);
         Rasterizer2D.a(30, var5 + 2, var3 - 150, 9179409, var1 * 3);
         Rasterizer2D.a(30, var5 + 2, var3 - 150 + var1 * 3, 0, 300 - var1 * 3);
         this.ht.a(16777215, var2, var4 + 4 - 20, var3);
         this.fh.a(0, super.M, 0);
         if(this.he) {
            this.he = false;
         }

      }
   }

   private void a(int var1, int var2, int var3, int var4, Widget var5, int var6, boolean var7, int var8) {
      byte var9;
      if(this.cO) {
         var9 = 32;
      } else {
         var9 = 0;
      }

      this.cO = false;
      if(var3 >= var1 && var3 < var1 + 16 && var4 >= var6 && var4 < var6 + 16) {
         var5.q -= this.gz << 2;
         if(var7) {
            return;
         }
      } else if(var3 >= var1 && var3 < var1 + 16 && var4 >= var6 + var2 - 16 && var4 < var6 + var2) {
         var5.q += this.gz << 2;
         if(var7) {
            return;
         }
      } else if(var3 >= var1 - var9 && var3 < var1 + 16 + var9 && var4 >= var6 + 16 && var4 < var6 + var2 - 16 && this.gz > 0) {
         if((var1 = (var2 - 32) * var2 / var8) < 8) {
            var1 = 8;
         }

         var3 = var4 - var6 - 16 - var1 / 2;
         var1 = var2 - 32 - var1;
         var5.q = (short)((var8 - var2) * var3 / var1);
         this.cO = true;
      }

   }

   private boolean c(int var1, int var2, int var3) {
      int var4 = var1 >> 14 & 32767;
      if((var1 = this.cs.c(this.bY, var3, var2, var1)) == -1) {
         return false;
      } else {
         int var5 = var1 & 31;
         var1 = var1 >> 6 & 3;
         if(var5 != 10 && var5 != 11 && var5 != 22) {
            this.a(2, var1, 0, var5 + 1, t.b[0], 0, 0, var2, t.a[0], false, var3);
         } else {
            ItemDefinition var7 = ItemDefinition.a(var4);
            int var6;
            if(var1 != 0 && var1 != 2) {
               var5 = var7.k;
               var6 = var7.c;
            } else {
               var5 = var7.c;
               var6 = var7.k;
            }

            var4 = var7.p;
            if(var1 != 0) {
               var4 = (var4 << var1 & 15) + (var4 >> 4 - var1);
            }

            this.a(2, 0, var6, 0, t.b[0], var5, var4, var2, t.a[0], false, var3);
         }

         this.bU = super.V;
         this.bV = super.W;
         this.bX = 2;
         this.bW = 0;
         return true;
      }
   }

   private Archive a(int var1, String var2, String var3, int var4, int var5) {
      byte[] var6 = null;
      int var7 = 5;

      try {
         if(this.l[0] != null) {
            var6 = this.l[0].a(var1);
         }
      } catch (Exception var16) {
         ;
      }

      if(var6 != null) {
         return new Archive(var6);
      } else {
         while(var6 == null) {
            String var8 = "Unknown error";
            this.a(var5, "Requesting " + var2);

            int var9;
            try {
               var9 = 0;
               DataInputStream var10 = this.d(var3 + var4);
               byte[] var11 = new byte[6];
               var10.readFully(var11, 0, 6);
               Buffer var21;
               (var21 = new Buffer(var11)).b = 3;
               int var12 = var21.i() + 6;
               int var13 = 6;
               var6 = new byte[var12];
               System.arraycopy(var11, 0, var6, 0, 6);

               int var22;
               for(; var13 < var12; var9 = var22) {
                  if((var22 = var12 - var13) > 1000) {
                     var22 = 1000;
                  }

                  if((var22 = var10.read(var6, var13, var22)) < 0) {
                     (new StringBuilder("Length error: ")).append(var13).append("/").append(var12).toString();
                     throw new IOException("EOF");
                  }

                  if((var22 = (var13 += var22) * 100 / var12) != var9) {
                     this.a(var5, "Loading " + var2 + " - " + var22 + "%");
                  }
               }

               var10.close();

               try {
                  if(this.l[0] != null) {
                     this.l[0].a(var6.length, var6, var1);
                  }
               } catch (Exception var15) {
                  this.l[0] = null;
               }
            } catch (IOException var17) {
               if(var8.equals("Unknown error")) {
                  var8 = "Connection error";
               }

               var6 = null;
            } catch (NullPointerException var18) {
               var8 = "Null error";
               var6 = null;
               if(!SignLink.e) {
                  return null;
               }
            } catch (ArrayIndexOutOfBoundsException var19) {
               var8 = "Bounds error";
               var6 = null;
               if(!SignLink.e) {
                  return null;
               }
            } catch (Exception var20) {
               var8 = "Unexpected error";
               var6 = null;
               if(!SignLink.e) {
                  return null;
               }
            }

            if(var6 == null) {
               for(var9 = var7; var9 > 0; --var9) {
                  this.a(var5, var8 + " - Retrying in " + var9);

                  try {
                     Thread.sleep(1000L);
                  } catch (Exception var14) {
                     ;
                  }
               }

               if((var7 <<= 1) > 60) {
                  var7 = 60;
               }

               this.bs = !this.bs;
            }
         }

         return new Archive(var6);
      }
   }

   private void C() {
      if(this.dt > 0) {
         this.u();
      } else {
         this.fS.a();
         this.hs.a(0, "Connection lost", 144, 257);
         this.hs.a(16777215, "Connection lost", 143, 256);
         this.hs.a(0, "Please wait - attempting to reestablish", 159, 257);
         this.hs.a(16777215, "Please wait - attempting to reestablish", 158, 256);
         this.fS.a(4, super.M, 4);
         this.dB = 0;
         this.hi = 0;
         BufferedConnection var1 = this.fV;
         this.w = false;
         this.dN = 0;
         this.a(y, z, true);
         if(!this.w) {
            this.u();
         }

         try {
            var1.a();
         } catch (Exception var2) {
            ;
         }
      }
   }

   private void D() {
      this.hw = 0;
      this.fw = 0;
      this.bN = 0;
      this.gh = 0;
      this.gx = 0;
      this.fW = 0;
   }

   private void n(int var1) {
      if(var1 >= 0) {
         if(this.gF != 0 && this.gF != 3 && this.gF != 4) {
            this.gF = 0;
            D = true;
         }

         int var2 = this.eO[var1];
         int var3 = this.eP[var1];
         int var4 = this.eQ[var1];
         int var5 = this.eR[var1];
         if(var4 >= 2000) {
            var4 -= 2000;
         }

         if(var4 == 696) {
            this.D();
         }

         Widget var6;
         if(var4 == 104) {
            eF = (var6 = Widget.e[var3]).O;
            if(!this.aw) {
               this.aw = true;
               this.aC = var6.O;
               this.go.a(185);
               this.go.c(var6.O);
            } else if(this.aC == var6.O) {
               this.aw = false;
               this.aC = 0;
               this.go.a(185);
               this.go.c(var6.O);
            } else if(this.aC != var6.O) {
               this.aw = true;
               this.aC = var6.O;
               this.go.a(185);
               this.go.c(var6.O);
            }
         }

         Npc var12;
         if(var4 == 582 && (var12 = this.aR[var5]) != null) {
            this.a(2, 0, 1, 0, t.b[0], 1, 0, var12.b[0], t.a[0], false, var12.a[0]);
            this.bU = super.V;
            this.bV = super.W;
            this.bX = 2;
            this.bW = 0;
            this.go.a(57);
            this.go.m(this.hC);
            this.go.m(var5);
            this.go.l(this.hA);
            this.go.m(this.hB);
         }

         if(var4 == 234) {
            if(!this.a(2, 0, 0, 0, t.b[0], 0, 0, var3, t.a[0], false, var2)) {
               this.a(2, 0, 1, 0, t.b[0], 1, 0, var3, t.a[0], false, var2);
            }

            this.bU = super.V;
            this.bV = super.W;
            this.bX = 2;
            this.bW = 0;
            this.go.a(236);
            this.go.l(var3 + this.dK);
            this.go.c(var5);
            this.go.l(var2 + this.dJ);
         }

         if(var4 == 62 && this.c(var5, var3, var2)) {
            this.go.a(192);
            this.go.c(this.hB);
            this.go.l(var5 >> 14 & 32767);
            this.go.n(var3 + this.dK);
            this.go.l(this.hA);
            this.go.n(var2 + this.dJ);
            this.go.c(this.hC);
         }

         if(var4 == 511) {
            if(!this.a(2, 0, 0, 0, t.b[0], 0, 0, var3, t.a[0], false, var2)) {
               this.a(2, 0, 1, 0, t.b[0], 1, 0, var3, t.a[0], false, var2);
            }

            this.bU = super.V;
            this.bV = super.W;
            this.bX = 2;
            this.bW = 0;
            this.go.a(25);
            this.go.l(this.hB);
            this.go.m(this.hC);
            this.go.c(var5);
            this.go.m(var3 + this.dK);
            this.go.n(this.hA);
            this.go.c(var2 + this.dJ);
         }

         if(var4 == 74) {
            this.go.a(122);
            this.go.n(var3);
            this.go.m(var2);
            this.go.l(var5);
            this.gS = 0;
            this.gT = var3;
            this.gU = var2;
            this.gV = 2;
            if(Widget.e[var3].B == i) {
               this.gV = 1;
            }

            if(Widget.e[var3].B == this.hv) {
               this.gV = 3;
            }
         }

         if(var4 == 315) {
            var6 = Widget.e[var3];
            boolean var7 = true;
            if(var6.g > 0) {
               var7 = this.a(var6);
            }

            if(var7) {
               switch(var3) {
               case 19156:
                  this.e = !this.e;
                  Settings.a();
                  break;
               case 24149:
                  this.e(0);
                  Settings.a();
                  break;
               case 24150:
                  this.e(1);
                  Settings.a();
                  break;
               case 24151:
                  this.e(2);
                  break;
               default:
                  this.go.a(185);
                  this.go.c(var3);
               }
            }
         }

         Player var13;
         if(var4 == 561 && (var13 = this.bH[var5]) != null) {
            this.a(2, 0, 1, 0, t.b[0], 1, 0, var13.b[0], t.a[0], false, var13.a[0]);
            this.bU = super.V;
            this.bV = super.W;
            this.bX = 2;
            this.bW = 0;
            if((gk += var5) >= 90) {
               this.go.a(136);
               gk = 0;
            }

            this.go.a(128);
            this.go.c(var5);
         }

         if(var4 == 20 && (var12 = this.aR[var5]) != null) {
            this.a(2, 0, 1, 0, t.b[0], 1, 0, var12.b[0], t.a[0], false, var12.a[0]);
            this.bU = super.V;
            this.bV = super.W;
            this.bX = 2;
            this.bW = 0;
            this.go.a(155);
            this.go.l(var5);
         }

         if(var4 == 779 && (var13 = this.bH[var5]) != null) {
            this.a(2, 0, 1, 0, t.b[0], 1, 0, var13.b[0], t.a[0], false, var13.a[0]);
            this.bU = super.V;
            this.bV = super.W;
            this.bX = 2;
            this.bW = 0;
            this.go.a(153);
            this.go.l(var5);
         }

         if(var4 == 519) {
            if(!this.bC) {
               SceneGraph.b(super.W - 4, super.V - 4);
            } else {
               SceneGraph.b(var3 - 4, var2 - 4);
            }
         }

         if(var4 == 1062) {
            if((ca += this.dJ) >= 113) {
               this.go.a(183);
               this.go.e(15086193);
               ca = 0;
            }

            this.c(var5, var3, var2);
            this.go.a(228);
            this.go.m(var5 >> 14 & 32767);
            this.go.m(var3 + this.dK);
            this.go.c(var2 + this.dJ);
         }

         if(var4 == 679 && !this.fG) {
            this.go.a(40);
            this.go.c(var3);
            this.fG = true;
         }

         if(var4 == 431) {
            this.go.a(129);
            this.go.m(var2);
            this.go.c(var3);
            this.go.m(var5);
            this.gS = 0;
            this.gT = var3;
            this.gU = var2;
            this.gV = 2;
            if(Widget.e[var3].B == i) {
               this.gV = 1;
            }

            if(Widget.e[var3].B == this.hv) {
               this.gV = 3;
            }
         }

         long var8;
         String var14;
         int var15;
         if((var4 == 337 || var4 == 42 || var4 == 792 || var4 == 322) && (var15 = (var14 = this.gs[var1]).indexOf("@whi@")) != -1) {
            var8 = StringUtils.a(var14.substring(var15 + 5).trim());
            if(var4 == 337) {
               this.b(var8);
            }

            if(var4 == 42) {
               this.c(var8);
            }

            if(var4 == 792) {
               this.a(var8);
            }

            if(var4 == 322) {
               this.d(var8);
            }
         }

         if((var4 == 1500 || var4 == 1501 || var4 == 1502) && (var15 = (var14 = this.gs[var1]).indexOf("@whi@")) != -1) {
            var8 = StringUtils.a(var14.substring(var15 + 5).trim());
            if(var4 == 1500) {
               this.a(var8, 0);
            }

            if(var4 == 1501) {
               this.a(var8, 1);
            }

            if(var4 == 1502) {
               this.a(var8, 2);
            }
         }

         if(var4 == 53) {
            this.go.a(135);
            this.go.l(var2);
            this.go.m(var3);
            this.go.l(var5);
            this.gS = 0;
            this.gT = var3;
            this.gU = var2;
            this.gV = 2;
            if(Widget.e[var3].B == i) {
               this.gV = 1;
            }

            if(Widget.e[var3].B == this.hv) {
               this.gV = 3;
            }
         }

         if(var4 == 539) {
            this.go.a(16);
            this.go.m(var5);
            this.go.n(var2);
            this.go.n(var3);
            this.gS = 0;
            this.gT = var3;
            this.gU = var2;
            this.gV = 2;
            if(Widget.e[var3].B == i) {
               this.gV = 1;
            }

            if(Widget.e[var3].B == this.hv) {
               this.gV = 3;
            }
         }

         if(var4 == 927) {
            var15 = (var14 = this.gs[var1]).indexOf("@lre@");
            var14 = var14.substring(var15 + 5).trim();
            this.e(var14);
            System.out.println("Opening page:" + var14);
         }

         String var10;
         int var17;
         if((var4 == 484 || var4 == 6) && (var15 = (var14 = this.gs[var1]).indexOf("@whi@")) != -1) {
            var10 = StringUtils.c(StringUtils.a(StringUtils.a(var14.substring(var15 + 5).trim())));
            boolean var11 = false;

            for(var17 = 0; var17 < this.bI; ++var17) {
               Player var16;
               if((var16 = this.bH[this.bJ[var17]]) != null && var16.ai != null && var16.ai.equalsIgnoreCase(var10)) {
                  this.a(2, 0, 1, 0, t.b[0], 1, 0, var16.b[0], t.a[0], false, var16.a[0]);
                  if(var4 == 484) {
                     this.go.a(139);
                     this.go.l(this.bJ[var17]);
                  }

                  if(var4 == 6) {
                     if((gk += var5) >= 90) {
                        this.go.a(136);
                        gk = 0;
                     }

                     this.go.a(128);
                     this.go.c(this.bJ[var17]);
                  }

                  var11 = true;
                  break;
               }
            }

            if(!var11) {
               this.a("Unable to find " + var10, 0, "", true);
            }
         }

         if(var4 == 870) {
            this.go.a(53);
            this.go.c(var2);
            this.go.m(this.hA);
            this.go.n(var5);
            this.go.c(this.hB);
            this.go.l(this.hC);
            this.go.c(var3);
            this.gS = 0;
            this.gT = var3;
            this.gU = var2;
            this.gV = 2;
            if(Widget.e[var3].B == i) {
               this.gV = 1;
            }

            if(Widget.e[var3].B == this.hv) {
               this.gV = 3;
            }
         }

         if(var4 == 847) {
            this.go.a(87);
            this.go.m(var5);
            this.go.c(var3);
            this.go.m(var2);
            this.gS = 0;
            this.gT = var3;
            this.gU = var2;
            this.gV = 2;
            if(Widget.e[var3].B == i) {
               this.gV = 1;
            }

            if(Widget.e[var3].B == this.hv) {
               this.gV = 3;
            }
         }

         String var22;
         if(var4 == 626) {
            var6 = Widget.e[var3];
            this.fz = 1;
            eF = var6.O;
            this.fA = var3;
            this.fB = var6.C;
            this.hz = 0;
            var22 = var6.o;
            if(var6.o.indexOf(" ") != -1) {
               var22 = var22.substring(0, var22.indexOf(" "));
            }

            var10 = var6.o;
            if(var6.o.indexOf(" ") != -1) {
               var10 = var10.substring(var10.indexOf(" ") + 1);
            }

            this.fC = var22 + " " + var6.k + " " + var10;
            if(this.fB == 16) {
               C = 3;
               fc = true;
            }

         } else {
            if(var4 == 78) {
               this.go.a(117);
               this.go.n(var3);
               this.go.n(var5);
               this.go.l(var2);
               this.gS = 0;
               this.gT = var3;
               this.gU = var2;
               this.gV = 2;
               if(Widget.e[var3].B == i) {
                  this.gV = 1;
               }

               if(Widget.e[var3].B == this.hv) {
                  this.gV = 3;
               }
            }

            if(var4 == 27 && (var13 = this.bH[var5]) != null) {
               this.a(2, 0, 1, 0, t.b[0], 1, 0, var13.b[0], t.a[0], false, var13.a[0]);
               this.bU = super.V;
               this.bV = super.W;
               this.bX = 2;
               this.bW = 0;
               if((da += var5) >= 54) {
                  this.go.a(189);
                  this.go.b(234);
                  da = 0;
               }

               this.go.a(73);
               this.go.l(var5);
            }

            if(var4 == 213) {
               if(!this.a(2, 0, 0, 0, t.b[0], 0, 0, var3, t.a[0], false, var2)) {
                  this.a(2, 0, 1, 0, t.b[0], 1, 0, var3, t.a[0], false, var2);
               }

               this.bU = super.V;
               this.bV = super.W;
               this.bX = 2;
               this.bW = 0;
               this.go.a(79);
               this.go.l(var3 + this.dK);
               this.go.c(var5);
               this.go.m(var2 + this.dJ);
            }

            if(var4 == 632) {
               this.go.a(145);
               this.go.m(var3);
               this.go.m(var2);
               this.go.m(var5);
               this.gS = 0;
               this.gT = var3;
               this.gU = var2;
               this.gV = 2;
               if(Widget.e[var3].B == i) {
                  this.gV = 1;
               }

               if(Widget.e[var3].B == this.hv) {
                  this.gV = 3;
               }
            }

            if(var4 >= 700 && var4 <= 705) {
               var17 = 110 + (var4 - 700);
               this.go.a(var17);
               this.go.n(var3);
               this.go.n(var5);
               this.go.l(var2);
               this.gS = 0;
               this.gT = var3;
               this.gU = var2;
               this.gV = 2;
               if(Widget.e[var3].B == i) {
                  this.gV = 1;
               }

               if(Widget.e[var3].B == this.hv) {
                  this.gV = 3;
               }
            }

            if(var4 == 1010) {
               this.gh = 20;
            }

            if(var4 == 1050) {
               if(!this.at) {
                  this.at = true;
                  this.go.a(185);
                  this.go.c(153);
               } else {
                  this.at = false;
                  this.go.a(185);
                  this.go.c(152);
               }
            }

            if(var4 == 1008) {
               this.g = 2;
               D = true;
               Settings.a();
            }

            if(var4 == 1007) {
               this.g = 1;
               D = true;
               Settings.a();
            }

            if(var4 == 1006) {
               this.g = 0;
               D = true;
               Settings.a();
            }

            if(var4 == 1005) {
               this.ai = 0;
               this.aB = 9;
               D = true;
            }

            if(var4 == 1004 && u[10] != -1) {
               C = 10;
               fc = true;
            }

            if(var4 == 1002) {
               this.h = 2;
               D = true;
               Settings.a();
            }

            if(var4 == 1001) {
               this.h = 1;
               D = true;
               Settings.a();
            }

            if(var4 == 1000) {
               this.h = 0;
               D = true;
               Settings.a();
            }

            if(var4 == 999) {
               this.ai = 0;
               this.aB = 0;
               D = true;
            }

            if(var4 == 998) {
               this.ai = 1;
               this.aB = 5;
               D = true;
            }

            if(var4 >= 994 && var4 <= 997) {
               if(var4 == 997) {
                  this.hE = 3;
               }

               if(var4 == 996) {
                  this.hE = 2;
               }

               if(var4 == 995) {
                  this.hE = 1;
               }

               if(var4 == 994) {
                  this.hE = 0;
               }

               D = true;
               this.go.a(95);
               this.go.b(this.hE);
               this.go.b(this.ba);
               this.go.b(this.gX);
            }

            if(var4 == 993) {
               this.ai = 2;
               this.aB = 1;
               D = true;
            }

            if(var4 >= 990 && var4 <= 992) {
               if(var4 == 992) {
                  this.ba = 2;
               }

               if(var4 == 991) {
                  this.ba = 1;
               }

               if(var4 == 990) {
                  this.ba = 0;
               }

               D = true;
               this.go.a(95);
               this.go.b(this.hE);
               this.go.b(this.ba);
               this.go.b(this.gX);
            }

            if(var4 == 989) {
               this.ai = 3;
               this.aB = 2;
               D = true;
            }

            if(var4 >= 985 && var4 <= 987) {
               if(var4 == 987) {
                  this.gX = 2;
               }

               if(var4 == 986) {
                  this.gX = 1;
               }

               if(var4 == 985) {
                  this.gX = 0;
               }

               D = true;
               this.go.a(95);
               this.go.b(this.hE);
               this.go.b(this.ba);
               this.go.b(this.gX);
            }

            if(var4 == 984) {
               this.ai = 5;
               this.aB = 3;
               D = true;
            }

            if(var4 == 983) {
               this.f = 2;
               D = true;
               Settings.a();
            }

            if(var4 == 982) {
               this.f = 1;
               D = true;
               Settings.a();
            }

            if(var4 == 981) {
               this.f = 0;
               D = true;
               Settings.a();
            }

            if(var4 == 980) {
               this.ai = 6;
               this.aB = 16;
               D = true;
            }

            if(var4 == 493) {
               this.go.a(75);
               this.go.n(var3);
               this.go.l(var2);
               this.go.m(var5);
               this.gS = 0;
               this.gT = var3;
               this.gU = var2;
               this.gV = 2;
               if(Widget.e[var3].B == i) {
                  this.gV = 1;
               }

               if(Widget.e[var3].B == this.hv) {
                  this.gV = 3;
               }
            }

            if(var4 == 652) {
               if(!this.a(2, 0, 0, 0, t.b[0], 0, 0, var3, t.a[0], false, var2)) {
                  this.a(2, 0, 1, 0, t.b[0], 1, 0, var3, t.a[0], false, var2);
               }

               this.bU = super.V;
               this.bV = super.W;
               this.bX = 2;
               this.bW = 0;
               this.go.a(156);
               this.go.m(var2 + this.dJ);
               this.go.l(var3 + this.dK);
               this.go.n(var5);
            }

            if(var4 == 94) {
               if(!this.a(2, 0, 0, 0, t.b[0], 0, 0, var3, t.a[0], false, var2)) {
                  this.a(2, 0, 1, 0, t.b[0], 1, 0, var3, t.a[0], false, var2);
               }

               this.bU = super.V;
               this.bV = super.W;
               this.bX = 2;
               this.bW = 0;
               this.go.a(181);
               this.go.l(var3 + this.dK);
               this.go.c(var5);
               this.go.l(var2 + this.dJ);
               this.go.m(this.fA);
            }

            if(var4 == 646) {
               this.go.a(185);
               this.go.c(var3);
               if((var6 = Widget.e[var3]).s != null && var6.s[0][0] == 5) {
                  var15 = var6.s[0][1];
                  if(this.m[var15] != var6.f[0]) {
                     this.m[var15] = var6.f[0];
                     this.j(var15);
                  }
               }
            }

            if(var4 == 225 && (var12 = this.aR[var5]) != null) {
               this.a(2, 0, 1, 0, t.b[0], 1, 0, var12.b[0], t.a[0], false, var12.a[0]);
               this.bU = super.V;
               this.bV = super.W;
               this.bX = 2;
               this.bW = 0;
               if((gG += var5) >= 85) {
                  this.go.a(230);
                  this.go.b(239);
                  gG = 0;
               }

               this.go.a(17);
               this.go.n(var5);
            }

            if(var4 == 965 && (var12 = this.aR[var5]) != null) {
               this.a(2, 0, 1, 0, t.b[0], 1, 0, var12.b[0], t.a[0], false, var12.a[0]);
               this.bU = super.V;
               this.bV = super.W;
               this.bX = 2;
               this.bW = 0;
               if(++fy >= 96) {
                  this.go.a(152);
                  this.go.b(88);
                  fy = 0;
               }

               this.go.a(21);
               this.go.c(var5);
            }

            if(var4 == 413 && (var12 = this.aR[var5]) != null) {
               this.a(2, 0, 1, 0, t.b[0], 1, 0, var12.b[0], t.a[0], false, var12.a[0]);
               this.bU = super.V;
               this.bV = super.W;
               this.bX = 2;
               this.bW = 0;
               this.go.a(131);
               this.go.n(var5);
               this.go.m(this.fA);
            }

            if(var4 == 200) {
               this.Y();
            }

            if(var4 == 1025 && (var12 = this.aR[var5]) != null) {
               ActorDefinition var18 = var12.ad;
               if(var12.ad.r != null) {
                  var18 = var18.b();
               }

               if(var18 != null) {
                  this.go.a(222);
                  this.go.c(var18.b);
               }
            }

            if(var4 == 900) {
               this.c(var5, var3, var2);
               this.go.a(252);
               this.go.n(var5 >> 14 & 32767);
               this.go.l(var3 + this.dK);
               this.go.m(var2 + this.dJ);
            }

            if(var4 == 412 && (var12 = this.aR[var5]) != null) {
               this.a(2, 0, 1, 0, t.b[0], 1, 0, var12.b[0], t.a[0], false, var12.a[0]);
               this.bU = super.V;
               this.bV = super.W;
               this.bX = 2;
               this.bW = 0;
               this.go.a(72);
               this.go.m(var5);
            }

            if(var4 == 365 && (var13 = this.bH[var5]) != null) {
               this.a(2, 0, 1, 0, t.b[0], 1, 0, var13.b[0], t.a[0], false, var13.a[0]);
               this.bU = super.V;
               this.bV = super.W;
               this.bX = 2;
               this.bW = 0;
               this.go.a(249);
               this.go.m(var5);
               this.go.l(this.fA);
            }

            if(var4 == 729 && (var13 = this.bH[var5]) != null) {
               this.a(2, 0, 1, 0, t.b[0], 1, 0, var13.b[0], t.a[0], false, var13.a[0]);
               this.bU = super.V;
               this.bV = super.W;
               this.bX = 2;
               this.bW = 0;
               this.go.a(39);
               this.go.l(var5);
            }

            if(var4 == 577 && (var13 = this.bH[var5]) != null) {
               this.a(2, 0, 1, 0, t.b[0], 1, 0, var13.b[0], t.a[0], false, var13.a[0]);
               this.bU = super.V;
               this.bV = super.W;
               this.bX = 2;
               this.bW = 0;
               this.go.a(139);
               this.go.l(var5);
            }

            if(var4 == 956 && this.c(var5, var3, var2)) {
               this.go.a(35);
               this.go.l(var2 + this.dJ);
               this.go.m(this.fA);
               this.go.m(var3 + this.dK);
               this.go.l(var5 >> 14 & 32767);
            }

            if(var4 == 567) {
               if(!this.a(2, 0, 0, 0, t.b[0], 0, 0, var3, t.a[0], false, var2)) {
                  this.a(2, 0, 1, 0, t.b[0], 1, 0, var3, t.a[0], false, var2);
               }

               this.bU = super.V;
               this.bV = super.W;
               this.bX = 2;
               this.bW = 0;
               this.go.a(23);
               this.go.l(var3 + this.dK);
               this.go.l(var5);
               this.go.l(var2 + this.dJ);
            }

            if(var4 == 867) {
               if((var5 & 3) == 0) {
                  ++fX;
               }

               if(fX >= 59) {
                  this.go.a(200);
                  this.go.c(25501);
                  fX = 0;
               }

               this.go.a(43);
               this.go.l(var3);
               this.go.m(var5);
               this.go.m(var2);
               this.gS = 0;
               this.gT = var3;
               this.gU = var2;
               this.gV = 2;
               if(Widget.e[var3].B == i) {
                  this.gV = 1;
               }

               if(Widget.e[var3].B == this.hv) {
                  this.gV = 3;
               }
            }

            if(var4 == 543) {
               this.go.a(237);
               this.go.c(var2);
               this.go.m(var5);
               this.go.c(var3);
               this.go.m(this.fA);
               this.gS = 0;
               this.gT = var3;
               this.gU = var2;
               this.gV = 2;
               if(Widget.e[var3].B == i) {
                  this.gV = 1;
               }

               if(Widget.e[var3].B == this.hv) {
                  this.gV = 3;
               }
            }

            if(var4 == 606 && (var15 = (var14 = this.gs[var1]).indexOf("@whi@")) != -1) {
               if(i == -1) {
                  this.Y();
                  this.bA = var14.substring(var15 + 5).trim();
                  this.fN = false;

                  for(int var19 = 0; var19 < Widget.e.length; ++var19) {
                     if(Widget.e[var19] != null && Widget.e[var19].g == 600) {
                        this.ga = i = Widget.e[var19].B;
                        break;
                     }
                  }
               } else {
                  this.a("Please close the interface you have open before using \'report abuse\'", 0, "");
               }
            }

            if(var4 == 491 && (var13 = this.bH[var5]) != null) {
               this.a(2, 0, 1, 0, t.b[0], 1, 0, var13.b[0], t.a[0], false, var13.a[0]);
               this.bU = super.V;
               this.bV = super.W;
               this.bX = 2;
               this.bW = 0;
               this.go.a(14);
               this.go.c(var5);
               this.go.l(this.hA);
            }

            if(var4 == 639 && (var15 = (var14 = this.gs[var1]).indexOf("@whi@")) != -1) {
               var8 = StringUtils.a(var14.substring(var15 + 5).trim());
               var17 = -1;

               for(var15 = 0; var15 < this.bO; ++var15) {
                  if(this.cB[var15] == var8) {
                     var17 = var15;
                     break;
                  }
               }

               if(var17 != -1 && this.aL[var17] > 0) {
                  D = true;
                  this.gF = 0;
                  this.hf = true;
                  this.gy = "";
                  this.eh = 3;
                  this.cz = this.cB[var17];
                  this.fq = "Enter message to send to " + this.ey[var17];
               }
            }

            if(var4 == 454) {
               this.go.a(41);
               this.go.c(var5);
               this.go.m(var2);
               this.go.m(var3);
               this.gS = 0;
               this.gT = var3;
               this.gU = var2;
               this.gV = 2;
               if(Widget.e[var3].B == i) {
                  this.gV = 1;
               }

               if(Widget.e[var3].B == this.hv) {
                  this.gV = 3;
               }
            }

            if(var4 == 478 && (var12 = this.aR[var5]) != null) {
               this.a(2, 0, 1, 0, t.b[0], 1, 0, var12.b[0], t.a[0], false, var12.a[0]);
               this.bU = super.V;
               this.bV = super.W;
               this.bX = 2;
               this.bW = 0;
               if((var5 & 3) == 0) {
                  ++fL;
               }

               if(fL >= 53) {
                  this.go.a(85);
                  this.go.b(66);
                  fL = 0;
               }

               this.go.a(18);
               this.go.l(var5);
            }

            if(var4 == 113) {
               this.c(var5, var3, var2);
               this.go.a(70);
               this.go.l(var2 + this.dJ);
               this.go.c(var3 + this.dK);
               this.go.n(var5 >> 14 & 32767);
            }

            if(var4 == 872) {
               this.c(var5, var3, var2);
               this.go.a(234);
               this.go.n(var2 + this.dJ);
               this.go.m(var5 >> 14 & 32767);
               this.go.n(var3 + this.dK);
            }

            if(var4 == 502) {
               this.c(var5, var3, var2);
               this.go.a(132);
               this.go.n(var2 + this.dJ);
               this.go.c(var5 >> 14 & 32767);
               this.go.m(var3 + this.dK);
            }

            ObjectDefinition var23;
            if(var4 == 1125) {
               var23 = ObjectDefinition.a(var5);
               Widget var20;
               if((var20 = Widget.e[var3]) != null && var20.P[var2] >= 100000) {
                  var10 = var20.P[var2] + " x " + var23.o;
               } else if(var23.s != null) {
                  var10 = new String(var23.s);
               } else {
                  var10 = "It\'s vscape " + var23.o + ".";
               }

               this.a(var10, 0, "", true);
            }

            if(var4 == 169) {
               this.go.a(185);
               this.go.c(var3);
               if((var6 = Widget.e[var3]).s != null && var6.s[0][0] == 5) {
                  var15 = var6.s[0][1];
                  this.m[var15] = 1 - this.m[var15];
                  this.j(var15);
               }
            }

            if(var4 == 447) {
               this.hz = 1;
               this.hA = var2;
               this.hB = var3;
               this.hC = var5;
               this.hD = ObjectDefinition.a(var5).o;
               this.fz = 0;
            } else {
               if(var4 == 1226) {
                  ItemDefinition var21;
                  if((var21 = ItemDefinition.a(var5 >> 14 & 32767)).u != null) {
                     var10 = new String(var21.u);
                  } else {
                     var10 = "It\'s vscape " + var21.b + ".";
                  }

                  this.a(var10, 0, "", true);
               }

               if(var4 == 244) {
                  if(!this.a(2, 0, 0, 0, t.b[0], 0, 0, var3, t.a[0], false, var2)) {
                     this.a(2, 0, 1, 0, t.b[0], 1, 0, var3, t.a[0], false, var2);
                  }

                  this.bU = super.V;
                  this.bV = super.W;
                  this.bX = 2;
                  this.bW = 0;
                  this.go.a(253);
                  this.go.l(var2 + this.dJ);
                  this.go.n(var3 + this.dK);
                  this.go.m(var5);
               }

               if(var4 == 1448) {
                  if((var23 = ObjectDefinition.a(var5)).s != null) {
                     var22 = new String(var23.s);
                  } else {
                     var22 = "It\'s vscape " + var23.o + ".";
                  }

                  this.a(var22, 0, "", true);
               }

               this.hz = 0;
               this.fz = 0;
            }
         }
      }
   }

   public void run() {
      if(!this.bz) {
         super.run();
      }

   }

   private void E() {
      if(this.hz == 0 && this.fz == 0) {
         this.gs[this.fx] = "Walk here";
         this.eQ[this.fx] = 519;
         this.eO[this.fx] = super.S;
         this.eP[this.fx] = super.T;
         ++this.fx;
      }

      int var1 = -1;

      for(int var2 = 0; var2 < Model.B; ++var2) {
         int var3;
         int var4 = (var3 = Model.C[var2]) & 127;
         int var5 = var3 >> 7 & 127;
         int var6 = var3 >> 29 & 3;
         int var7 = var3 >> 14 & 32767;
         if(var3 != var1) {
            var1 = var3;
            int var9;
            if(var6 == 2 && this.cs.c(this.bY, var4, var5, var3) >= 0) {
               ItemDefinition var8;
               if((var8 = ItemDefinition.a(var7)).j != null) {
                  var9 = -1;
                  if(var8.r != -1) {
                     VarBits var18;
                     int var10 = (var18 = VarBits.a[var8.r]).b;
                     int var11 = var18.c;
                     var9 = var18.d;
                     var9 = F[var9 - var11];
                     var9 &= ItemDefinition.n.m[var10] >> var11;
                  } else if(var8.e != -1) {
                     var9 = ItemDefinition.n.m[var8.e];
                  }

                  var8 = var9 >= 0 && var9 < var8.j.length && var8.j[var9] != -1?ItemDefinition.a(var8.j[var9]):null;
               }

               if(var8 == null) {
                  continue;
               }

               if(this.hz == 1) {
                  this.gs[this.fx] = "Use " + this.hD + " with @cya@" + var8.b;
                  this.eQ[this.fx] = 62;
                  this.eR[this.fx] = var3;
                  this.eO[this.fx] = var4;
                  this.eP[this.fx] = var5;
                  ++this.fx;
               } else if(this.fz == 1) {
                  if((this.fB & 4) == 4) {
                     this.gs[this.fx] = this.fC + " @cya@" + var8.b;
                     this.eQ[this.fx] = 956;
                     this.eR[this.fx] = var3;
                     this.eO[this.fx] = var4;
                     this.eP[this.fx] = var5;
                     ++this.fx;
                  }
               } else {
                  if(var8.A != null) {
                     for(var9 = 4; var9 >= 0; --var9) {
                        if(var8.A[var9] != null) {
                           this.gs[this.fx] = var8.A[var9] + " @cya@" + var8.b;
                           if(var9 == 0) {
                              this.eQ[this.fx] = 502;
                           }

                           if(var9 == 1) {
                              this.eQ[this.fx] = 900;
                           }

                           if(var9 == 2) {
                              this.eQ[this.fx] = 113;
                           }

                           if(var9 == 3) {
                              this.eQ[this.fx] = 872;
                           }

                           if(var9 == 4) {
                              this.eQ[this.fx] = 1062;
                           }

                           this.eR[this.fx] = var3;
                           this.eO[this.fx] = var4;
                           this.eP[this.fx] = var5;
                           ++this.fx;
                        }
                     }
                  }

                  this.gs[this.fx] = this.bo < 2?"Examine @cya@" + var8.b:"Examine @cya@" + var8.b + " @gre@(@whi@" + var7 + "@gre@) (@whi@" + (var4 + this.dJ) + "," + (var5 + this.dK) + "@gre@)";
                  this.eQ[this.fx] = 1226;
                  this.eR[this.fx] = var8.g << 14;
                  this.eO[this.fx] = var4;
                  this.eP[this.fx] = var5;
                  ++this.fx;
               }
            }

            Npc var14;
            Player var15;
            if(var6 == 1) {
               Npc var17 = this.aR[var7];

               try {
                  if(var17.ad.i == 1 && (var17.V & 127) == 64 && (var17.W & 127) == 64) {
                     for(var9 = 0; var9 < this.aS; ++var9) {
                        if((var14 = this.aR[this.aT[var9]]) != null && var14 != var17 && var14.ad.i == 1 && var14.V == var17.V && var14.W == var17.W) {
                           this.a(var14.ad, this.aT[var9], var5, var4);
                        }
                     }

                     for(var9 = 0; var9 < this.bI; ++var9) {
                        if((var15 = this.bH[this.bJ[var9]]) != null && var15.V == var17.V && var15.W == var17.W) {
                           this.a(var4, this.bJ[var9], var15, var5);
                        }
                     }
                  }

                  this.a(var17.ad, var7, var5, var4);
               } catch (Exception var13) {
                  ;
               }
            }

            if(var6 == 0) {
               Player var19 = this.bH[var7];

               try {
                  if((var19.V & 127) == 64 && (var19.W & 127) == 64) {
                     for(var9 = 0; var9 < this.aS; ++var9) {
                        if((var14 = this.aR[this.aT[var9]]) != null && var14.ad.i == 1 && var14.V == var19.V && var14.W == var19.W) {
                           this.a(var14.ad, this.aT[var9], var5, var4);
                        }
                     }

                     for(var9 = 0; var9 < this.bI; ++var9) {
                        if((var15 = this.bH[this.bJ[var9]]) != null && var15 != var19 && var15.V == var19.V && var15.W == var19.W) {
                           this.a(var4, this.bJ[var9], var15, var5);
                        }
                     }
                  }

                  this.a(var4, var7, var19, var5);
               } catch (Exception var12) {
                  ;
               }
            }

            LinkedList var20;
            if(var6 == 3 && (var20 = this.aM[this.bY][var4][var5]) != null) {
               for(Item var21 = (Item)var20.c(); var21 != null; var21 = (Item)var20.e()) {
                  ObjectDefinition var16 = ObjectDefinition.a(var21.a);
                  if(this.hz == 1) {
                     this.gs[this.fx] = "Use " + this.hD + " with @lre@" + var16.o;
                     this.eQ[this.fx] = 511;
                     this.eR[this.fx] = var21.a;
                     this.eO[this.fx] = var4;
                     this.eP[this.fx] = var5;
                     ++this.fx;
                  } else if(this.fz == 1) {
                     if((this.fB & 1) == 1) {
                        this.gs[this.fx] = this.fC + " @lre@" + var16.o;
                        this.eQ[this.fx] = 94;
                        this.eR[this.fx] = var21.a;
                        this.eO[this.fx] = var4;
                        this.eP[this.fx] = var5;
                        ++this.fx;
                     }
                  } else {
                     for(var6 = 4; var6 >= 0; --var6) {
                        if(var16.n != null && var16.n[var6] != null) {
                           this.gs[this.fx] = var16.n[var6] + " @lre@" + var16.o;
                           if(var6 == 0) {
                              this.eQ[this.fx] = 652;
                           }

                           if(var6 == 1) {
                              this.eQ[this.fx] = 567;
                           }

                           if(var6 == 2) {
                              this.eQ[this.fx] = 234;
                           }

                           if(var6 == 3) {
                              this.eQ[this.fx] = 244;
                           }

                           if(var6 == 4) {
                              this.eQ[this.fx] = 213;
                           }

                           this.eR[this.fx] = var21.a;
                        } else {
                           if(var6 != 2) {
                              continue;
                           }

                           this.gs[this.fx] = "Take @lre@" + var16.o;
                           this.eQ[this.fx] = 234;
                           this.eR[this.fx] = var21.a;
                           if(var21.a == 1971) {
                              this.gs[this.fx] = "Remove @lre@" + var16.o;
                           }
                        }

                        this.eO[this.fx] = var4;
                        this.eP[this.fx] = var5;
                        ++this.fx;
                     }

                     this.gs[this.fx] = this.bo < 2?"Examine @lre@" + var16.o:"Examine @lre@" + var16.o + " @gre@(@whi@" + var21.a + "@gre@)";
                     this.eQ[this.fx] = 1448;
                     this.eR[this.fx] = var21.a;
                     this.eO[this.fx] = var4;
                     this.eP[this.fx] = var5;
                     ++this.fx;
                  }
               }
            }
         }
      }

   }

   public final void d() {
      SignLink.e = false;

      try {
         if(this.fV != null) {
            this.fV.a();
         }
      } catch (Exception var5) {
         ;
      }

      this.fV = null;
      this.y();
      this.N();
      this.e(0, 0);
      if(this.by != null) {
         this.by.a = false;
      }

      this.by = null;
      if(this.E != null) {
         Overlays var1 = this.E;
         OverlayTemplate[] var2;
         int var3 = (var2 = Overlays.a()).length;

         for(int var4 = 0; var4 < var3; ++var4) {
            var2[var4].c();
         }
      }

      this.E = null;
      if(this.gK != null) {
         this.gK = null;
      }

      this.o.c();
      this.o = null;
      this.aQ = null;
      this.go = null;
      this.bb = null;
      this.ez = null;
      this.gN = null;
      this.gf = null;
      this.gW = null;
      this.gO = null;
      this.gP = null;
      this.gA = null;
      this.hg = null;
      this.cs = null;
      this.gM = null;
      this.bR = null;
      this.aK = null;
      this.hx = null;
      this.hy = null;
      this.bS = null;
      this.fQ = null;
      this.aG = null;
      this.aH = null;
      this.fR = null;
      this.fS = null;
      this.fT = null;
      this.fs = null;
      this.aD = null;
      this.aE = null;
      this.aF = null;
      this.gr = null;
      this.ct = null;
      this.j = null;
      this.fr = null;
      this.db = null;
      this.eT = null;
      this.eU = null;
      this.eV = null;
      this.fH = null;
      this.eq = null;
      this.er = null;
      this.es = null;
      this.et = null;
      this.eu = null;
      this.ee = null;
      this.dI = null;
      this.ce = null;
      this.bH = null;
      this.bJ = null;
      this.bL = null;
      this.bM = null;
      this.aV = null;
      this.aR = null;
      this.aT = null;
      this.aM = null;
      this.gb = null;
      this.du = null;
      this.eb = null;
      this.eO = null;
      this.eP = null;
      this.eQ = null;
      this.eR = null;
      this.gs = null;
      this.m = null;
      this.eo = null;
      this.ep = null;
      this.fD = null;
      this.hk = null;
      this.ey = null;
      this.cB = null;
      this.aL = null;
      this.cb = null;
      this.cC = null;
      this.cD = null;
      this.fi = null;
      this.fj = null;
      this.ff = null;
      this.fg = null;
      this.fh = null;
      this.fk = null;
      this.fl = null;
      this.fm = null;
      this.fn = null;
      this.S();
      ItemDefinition.a();
      ActorDefinition.c();
      ObjectDefinition.a();
      Floor.a = null;
      IdentityKit.b = null;
      Widget.e = null;
      Animation.a = null;
      SpotAnimation.a = null;
      SpotAnimation.h = null;
      Varp.a = null;
      super.N = null;
      Player.aj = null;
      Rasterizer3D.a();
      SceneGraph.a();
      Model.b();
      Frame.a();
      System.gc();
   }

   final Component e() {
      return (Component)(super.O != null?super.O:this);
   }

   private void F() {
      int var1;
      while((var1 = this.d(-796)) != -1) {
         if(i != -1 && i == this.ga) {
            if(var1 == 8 && this.bA.length() > 0) {
               this.bA = this.bA.substring(0, this.bA.length() - 1);
            }

            if((var1 >= 97 && var1 <= 126 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && this.bA.length() < 12) {
               this.bA = this.bA + (char)var1;
            }
         } else {
            int var12;
            if(this.hf) {
               if(var1 >= 32 && var1 <= 126 && this.gy.length() < 80) {
                  this.gy = this.gy + (char)var1;
                  D = true;
               }

               if(var1 == 8 && this.gy.length() > 0) {
                  this.gy = this.gy.substring(0, this.gy.length() - 1);
                  D = true;
               }

               if(var1 == 13 || var1 == 10) {
                  this.hf = false;
                  D = true;
                  long var2;
                  if(this.eh == 1) {
                     var2 = StringUtils.a(this.gy);
                     this.b(var2);
                  }

                  if(this.eh == 2 && this.bO > 0) {
                     var2 = StringUtils.a(this.gy);
                     this.a(var2);
                  }

                  if(this.eh == 3 && this.gy.length() > 0) {
                     this.go.a(126);
                     this.go.b(0);
                     var12 = this.go.b;
                     this.go.a(this.cz);
                     ChatMessageCodec.a(this.gy, this.go);
                     this.go.h(this.go.b - var12);
                     this.gy = ChatMessageCodec.a(this.gy);
                     this.a(this.gy, 6, StringUtils.c(StringUtils.a(this.cz)));
                     if(this.ba == 2) {
                        this.ba = 1;
                        this.go.a(95);
                        this.go.b(this.hE);
                        this.go.b(this.ba);
                        this.go.b(this.gX);
                     }
                  }

                  if(this.eh == 4 && this.aI < 100) {
                     var2 = StringUtils.a(this.gy);
                     this.c(var2);
                  }

                  if(this.eh == 5 && this.aI > 0) {
                     var2 = StringUtils.a(this.gy);
                     this.d(var2);
                  }

                  if(this.eh == 6) {
                     var2 = StringUtils.a(this.gy);
                     long var5 = var2;
                     Client var11 = this;
                     if(var2 != 0L) {
                        try {
                           var11.go.a(60);
                           var11.go.a(var5);
                        } catch (RuntimeException var8) {
                           SignLink.b("47229, 3, " + var2 + ", " + var8.toString());
                           throw new RuntimeException();
                        }
                     }
                  }
               }
            } else if(this.gF == 1) {
               if(var1 >= 48 && var1 <= 57 && this.dm.length() < 10) {
                  this.dm = this.dm + (char)var1;
                  D = true;
               }

               if(!this.dm.toLowerCase().contains("k") && !this.dm.toLowerCase().contains("m") && !this.dm.toLowerCase().contains("b") && (var1 == 107 || var1 == 109) || var1 == 98) {
                  this.dm = this.dm + (char)var1;
                  D = true;
               }

               if(var1 == 8 && this.dm.length() > 0) {
                  this.dm = this.dm.substring(0, this.dm.length() - 1);
                  D = true;
               }

               if(var1 == 13 || var1 == 10) {
                  if(this.dm.length() > 0) {
                     if(this.dm.toLowerCase().contains("k")) {
                        this.dm = this.dm.replaceAll("k", "000");
                     } else if(this.dm.toLowerCase().contains("m")) {
                        this.dm = this.dm.replaceAll("m", "000000");
                     } else if(this.dm.toLowerCase().contains("b")) {
                        this.dm = this.dm.replaceAll("b", "000000000");
                     }

                     try {
                        var12 = Integer.parseInt(this.dm);
                     } catch (NumberFormatException var9) {
                        var12 = Integer.MAX_VALUE;
                     }

                     this.go.a(208);
                     this.go.f(var12);
                  }

                  this.gF = 0;
                  D = true;
               }
            } else if(this.gF == 2) {
               if(var1 >= 32 && var1 <= 126 && this.dm.length() < 12) {
                  this.dm = this.dm + (char)var1;
                  D = true;
               }

               if(var1 == 8 && this.dm.length() > 0) {
                  this.dm = this.dm.substring(0, this.dm.length() - 1);
                  D = true;
               }

               if(var1 == 13 || var1 == 10) {
                  if(this.dm.length() > 0) {
                     this.go.a(60);
                     this.go.a(StringUtils.a(this.dm));
                  }

                  this.gF = 0;
                  D = true;
               }
            } else if(this.gF != 3 && this.gF != 4) {
               if(this.hv == -1) {
                  if(var1 >= 32 && var1 <= 126 && this.bE.length() < 80) {
                     this.bE = this.bE + (char)var1;
                     D = true;
                  }

                  if(var1 == 8 && this.bE.length() > 0) {
                     this.bE = this.bE.substring(0, this.bE.length() - 1);
                     D = true;
                  }

                  if(var1 == 9) {
                     this.m();
                  }

                  if((var1 == 13 || var1 == 10) && this.bE.length() > 0) {
                     this.E.a(this.bE);
                     if(this.bE.equalsIgnoreCase("::toggleroofs")) {
                        this.e = !this.e;
                        Settings.a();
                     }

                     if(this.bo >= 2) {
                        if(this.bE.equals("::itemsearch")) {
                           this.gF = 3;
                        }

                        if(this.bE.equals("::npcsearch")) {
                           this.gF = 4;
                        }

                        if(this.bE.equalsIgnoreCase("::dumpclip")) {
                           this.o.a();
                        }

                        if(this.bE.equalsIgnoreCase("::regular")) {
                           this.e(0);
                        }

                        if(this.bE.equalsIgnoreCase("::resize")) {
                           this.e(1);
                        }

                        if(this.bE.equalsIgnoreCase("::fullscreen")) {
                           this.e(2);
                        }

                        if(this.bE.equalsIgnoreCase("::fps")) {
                           fM = !fM;
                        }

                        if(this.bE.equalsIgnoreCase("::data")) {
                           cG = !cG;
                        }
                     }

                     if(this.bE.startsWith("/")) {
                        this.bE = "::" + this.bE;
                     }

                     if(this.bE.startsWith("::")) {
                        this.go.a(103);
                        this.go.b(this.bE.length() - 1);
                        this.go.a(this.bE.substring(2));
                     } else {
                        String var4 = this.bE.toLowerCase();
                        byte var7 = 0;
                        if(var4.startsWith("yellow:")) {
                           var7 = 0;
                           this.bE = this.bE.substring(7);
                        } else if(var4.startsWith("red:")) {
                           var7 = 1;
                           this.bE = this.bE.substring(4);
                        } else if(var4.startsWith("green:")) {
                           var7 = 2;
                           this.bE = this.bE.substring(6);
                        } else if(var4.startsWith("cyan:")) {
                           var7 = 3;
                           this.bE = this.bE.substring(5);
                        } else if(var4.startsWith("purple:")) {
                           var7 = 4;
                           this.bE = this.bE.substring(7);
                        } else if(var4.startsWith("white:")) {
                           var7 = 5;
                           this.bE = this.bE.substring(6);
                        } else if(var4.startsWith("flash1:")) {
                           var7 = 6;
                           this.bE = this.bE.substring(7);
                        } else if(var4.startsWith("flash2:")) {
                           var7 = 7;
                           this.bE = this.bE.substring(7);
                        } else if(var4.startsWith("flash3:")) {
                           var7 = 8;
                           this.bE = this.bE.substring(7);
                        } else if(var4.startsWith("glow1:")) {
                           var7 = 9;
                           this.bE = this.bE.substring(6);
                        } else if(var4.startsWith("glow2:")) {
                           var7 = 10;
                           this.bE = this.bE.substring(6);
                        } else if(var4.startsWith("glow3:")) {
                           var7 = 11;
                           this.bE = this.bE.substring(6);
                        } else if(var4.startsWith(">")) {
                           var7 = 2;
                        }

                        var4 = this.bE.toLowerCase();
                        byte var10 = 0;
                        if(var4.startsWith("wave:")) {
                           var10 = 1;
                           this.bE = this.bE.substring(5);
                        } else if(var4.startsWith("wave2:")) {
                           var10 = 2;
                           this.bE = this.bE.substring(6);
                        } else if(var4.startsWith("shake:")) {
                           var10 = 3;
                           this.bE = this.bE.substring(6);
                        } else if(var4.startsWith("scroll:")) {
                           var10 = 4;
                           this.bE = this.bE.substring(7);
                        } else if(var4.startsWith("slide:")) {
                           var10 = 5;
                           this.bE = this.bE.substring(6);
                        }

                        this.go.a(4);
                        this.go.b(0);
                        var12 = this.go.b;
                        this.go.k(var10);
                        this.go.k(var7);
                        this.aQ.b = 0;
                        ChatMessageCodec.a(this.bE, this.aQ);
                        this.go.a(0, this.aQ.a, this.aQ.b);
                        this.go.h(this.go.b - var12);
                        this.bE = ChatMessageCodec.a(this.bE);
                        t.g = this.bE;
                        t.l = var7;
                        t.D = var10;
                        t.H = 150;
                        if(t.aC) {
                           this.a(t.g, 2, "@irn@" + t.ai, this.bo);
                        } else {
                           this.a(t.g, 2, t.ai, this.bo);
                        }

                        if(this.hE == 2) {
                           this.hE = 3;
                           this.go.a(95);
                           this.go.b(this.hE);
                           this.go.b(this.ba);
                           this.go.b(this.gX);
                        }
                     }

                     this.bE = "";
                     D = true;
                  }
               }
            } else {
               if(var1 == 13 || var1 == 10) {
                  this.gF = 0;
                  D = true;
               }

               if(var1 >= 32 && var1 <= 126 && this.dm.length() < 40) {
                  this.dm = this.dm + (char)var1;
                  D = true;
               }

               if(var1 == 8 && this.dm.length() > 0) {
                  this.dm = this.dm.substring(0, this.dm.length() - 1);
                  D = true;
               }
            }
         }
      }

   }

   private void o(int var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < 500; ++var3) {
         if(this.cp[var3] != null && this.aB == 9) {
            int var4 = this.cn[var3];
            String var5 = this.co[var3];
            int var6;
            if((var6 = 70 - var2 * 14 + 42 + p + 4 + 5) < -23) {
               break;
            }

            if(var5 != null && var5.startsWith("@irn@")) {
               var5 = var5.substring(5);
            }

            if(var4 == 9 && (this.g == 0 || this.g == 1)) {
               if(var1 > var6 - 14 && var1 <= var6 && !var5.equals(t.ai)) {
                  if(this.bo > 0) {
                     this.gs[this.fx] = "Report abuse @whi@" + var5;
                     this.eQ[this.fx] = 606;
                     ++this.fx;
                  }

                  this.gs[this.fx] = "Add ignore @whi@" + var5;
                  this.eQ[this.fx] = 42;
                  ++this.fx;
                  this.gs[this.fx] = "Add friend @whi@" + var5;
                  this.eQ[this.fx] = 337;
                  ++this.fx;
               }

               ++var2;
            }
         }
      }

   }

   private void p(int var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < 500; ++var3) {
         if(this.cp[var3] != null && this.aB == 16) {
            int var4 = this.cn[var3];
            String var5 = this.co[var3];
            int var6;
            if((var6 = 70 - var2 * 14 + 42 + p + 4 + 5) < -23) {
               break;
            }

            if(var5 != null && var5.startsWith("@irn@")) {
               var5 = var5.substring(5);
            }

            if(var4 == 16 && (this.f == 0 || this.f == 1)) {
               if(var1 > var6 - 14 && var1 <= var6 && !var5.equals(t.ai)) {
                  this.gs[this.fx] = "Add ignore @whi@" + var5;
                  this.eQ[this.fx] = 42;
                  ++this.fx;
                  this.gs[this.fx] = "Add friend @whi@" + var5;
                  this.eQ[this.fx] = 337;
                  ++this.fx;
               }

               ++var2;
            }
         }
      }

   }

   private void q(int var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < 500; ++var3) {
         if(this.cp[var3] != null && this.aB == 2) {
            int var4 = this.cn[var3];
            String var5 = this.co[var3];
            int var6;
            if((var6 = 70 - var2 * 14 + 42 + p + 4 + 5) < -23) {
               break;
            }

            if(var5 != null && var5.startsWith("@irn@")) {
               var5 = var5.substring(5);
            }

            if((var4 == 5 || var4 == 6) && (this.gq == 0 || this.aB == 2) && (var4 == 6 || this.ba == 0 || this.ba == 1 && this.c(var5))) {
               ++var2;
            }

            if((var4 == 3 || var4 == 7) && (this.gq == 0 || this.aB == 2) && (var4 == 7 || this.ba == 0 || this.ba == 1 && this.c(var5))) {
               if(var1 > var6 - 14 && var1 <= var6) {
                  if(this.bo > 0) {
                     this.gs[this.fx] = "Report abuse @whi@" + var5;
                     this.eQ[this.fx] = 606;
                     ++this.fx;
                  }

                  this.gs[this.fx] = "Add ignore @whi@" + var5;
                  this.eQ[this.fx] = 42;
                  ++this.fx;
                  this.gs[this.fx] = "Add friend @whi@" + var5;
                  this.eQ[this.fx] = 337;
                  ++this.fx;
               }

               ++var2;
            }
         }
      }

   }

   private void r(int var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < 500; ++var3) {
         if(this.cp[var3] != null && (this.aB == 3 || this.aB == 4)) {
            int var4 = this.cn[var3];
            String var5 = this.co[var3];
            int var6;
            if((var6 = 70 - var2 * 14 + 42 + p + 4 + 5) < -23) {
               break;
            }

            if(var5 != null && var5.startsWith("@irn@")) {
               var5 = var5.substring(5);
            }

            if(this.aB == 3 && var4 == 4 && (this.gX == 0 || this.gX == 1 && this.c(var5))) {
               if(var1 > var6 - 14 && var1 <= var6) {
                  this.gs[this.fx] = "Accept trade @whi@" + var5;
                  this.eQ[this.fx] = 484;
                  ++this.fx;
               }

               ++var2;
            }

            if(this.aB == 4 && var4 == 8 && (this.gX == 0 || this.gX == 1 && this.c(var5))) {
               if(var1 > var6 - 14 && var1 <= var6) {
                  this.gs[this.fx] = "Accept challenge @whi@" + var5;
                  this.eQ[this.fx] = 6;
                  ++this.fx;
               }

               ++var2;
            }

            if(var4 == 12) {
               if(var1 > var6 - 14 && var1 <= var6) {
                  this.gs[this.fx] = "Visit @red@" + var5;
                  this.eQ[this.fx] = 927;
                  ++this.fx;
               }

               ++var2;
            }
         }
      }

   }

   private void s(int var1) {
      int var2 = 0;
      int var3 = 0;

      while(true) {
         label279: {
            if(var3 < 500) {
               if(this.cp[var3] == null) {
                  break label279;
               }

               int var4 = this.cn[var3];
               int var5;
               if((var5 = 70 - var2 * 14 + 42 + p + 4 + 5) >= -23) {
                  String var6 = this.co[var3];
                  if(this.aB == 1) {
                     var2 = var1;
                     Client var8 = this;
                     var3 = 0;

                     for(var4 = 0; var4 < 500; ++var4) {
                        if(var8.cp[var4] != null && var8.aB == 1) {
                           var5 = var8.cn[var4];
                           var6 = var8.co[var4];
                           int var7;
                           if((var7 = 70 - var3 * 14 + 42 + p + 4 + 5) < -23) {
                              break;
                           }

                           if(var6 != null && var6.startsWith("@irn@")) {
                              var6 = var6.substring(5);
                           }

                           if((var5 == 1 || var5 == 2) && (var5 == 1 || var8.hE == 0 || var8.hE == 1 && var8.c(var6))) {
                              if(var2 > var7 - 14 && var2 <= var7 && !var6.equals(t.ai)) {
                                 if(var8.bo > 0) {
                                    var8.gs[var8.fx] = "Report abuse @whi@" + var6;
                                    var8.eQ[var8.fx] = 606;
                                    ++var8.fx;
                                 }

                                 var8.gs[var8.fx] = "Add ignore @whi@" + var6;
                                 var8.eQ[var8.fx] = 42;
                                 ++var8.fx;
                                 var8.gs[var8.fx] = "Add friend @whi@" + var6;
                                 var8.eQ[var8.fx] = 337;
                                 ++var8.fx;
                              }

                              ++var3;
                           }
                        }
                     }

                     return;
                  }

                  if(this.aB == 2) {
                     this.q(var1);
                     return;
                  }

                  if(this.aB == 3 || this.aB == 4) {
                     this.r(var1);
                     return;
                  }

                  if(this.aB != 5) {
                     if(this.aB == 9) {
                        this.o(var1);
                        return;
                     }

                     if(this.aB == 16) {
                        this.p(var1);
                        return;
                     }

                     if(var6 != null && var6.startsWith("@irn@")) {
                        var6 = var6.substring(5);
                     }

                     if(var4 == 0 && (this.h == 0 || this.h == 1 && this.aA[var3])) {
                        ++var2;
                     }

                     if((var4 == 1 || var4 == 2) && (var4 == 1 || this.hE == 0 || this.hE == 1 && this.c(var6))) {
                        if(var1 > var5 - 14 && var1 <= var5 && !var6.equals(t.ai)) {
                           if(this.bo > 0) {
                              this.gs[this.fx] = "Report abuse @whi@" + var6;
                              this.eQ[this.fx] = 606;
                              ++this.fx;
                           }

                           this.gs[this.fx] = "Add ignore @whi@" + var6;
                           this.eQ[this.fx] = 42;
                           ++this.fx;
                           this.gs[this.fx] = "Add friend @whi@" + var6;
                           this.eQ[this.fx] = 337;
                           ++this.fx;
                        }

                        ++var2;
                     }

                     if((var4 == 3 || var4 == 7) && this.gq == 0 && (var4 == 7 || this.ba == 0 || this.ba == 1 && this.c(var6))) {
                        if(var1 > var5 - 14 && var1 <= var5) {
                           if(this.bo > 0) {
                              this.gs[this.fx] = "Report abuse @whi@" + var6;
                              this.eQ[this.fx] = 606;
                              ++this.fx;
                           }

                           this.gs[this.fx] = "Add ignore @whi@" + var6;
                           this.eQ[this.fx] = 42;
                           ++this.fx;
                           this.gs[this.fx] = "Add friend @whi@" + var6;
                           this.eQ[this.fx] = 337;
                           ++this.fx;
                        }

                        ++var2;
                     }

                     if(var4 == 4 && (this.gX == 0 || this.gX == 1 && this.c(var6))) {
                        if(var1 > var5 - 14 && var1 <= var5) {
                           this.gs[this.fx] = "Accept trade @whi@" + var6;
                           this.eQ[this.fx] = 484;
                           ++this.fx;
                        }

                        ++var2;
                     }

                     if((var4 == 5 || var4 == 6) && this.gq == 0 && this.ba < 2) {
                        ++var2;
                     }

                     if(var4 == 8 && (this.gX == 0 || this.gX == 1 && this.c(var6))) {
                        if(var1 > var5 - 14 && var1 <= var5) {
                           this.gs[this.fx] = "Accept challenge @whi@" + var6;
                           this.eQ[this.fx] = 6;
                           ++this.fx;
                        }

                        ++var2;
                     }

                     if(var4 == 9 && this.g == 0) {
                        if(var1 > var5 - 14 && var1 <= var5 && !var6.equals(t.ai)) {
                           if(this.bo > 0) {
                              this.gs[this.fx] = "Report abuse @whi@" + var6;
                              this.eQ[this.fx] = 606;
                              ++this.fx;
                           }

                           this.gs[this.fx] = "Add ignore @whi@" + var6;
                           this.eQ[this.fx] = 42;
                           ++this.fx;
                           this.gs[this.fx] = "Add friend @whi@" + var6;
                           this.eQ[this.fx] = 337;
                           ++this.fx;
                        }

                        ++var2;
                     }

                     if(var4 == 16 && this.f == 0) {
                        if(var1 > var5 - 14 && var1 <= var5 && !var6.equals(t.ai)) {
                           this.gs[this.fx] = "Add ignore @whi@" + var6;
                           this.eQ[this.fx] = 42;
                           ++this.fx;
                           this.gs[this.fx] = "Add friend @whi@" + var6;
                           this.eQ[this.fx] = 337;
                           ++this.fx;
                        }

                        ++var2;
                     }

                     if(var4 == 12 && (this.h == 0 || this.h == 1 && this.aA[var3])) {
                        if(var1 > var5 - 14 && var1 <= var5) {
                           this.gs[this.fx] = "Go-to @lre@" + var6;
                           this.eQ[this.fx] = 927;
                           ++this.fx;
                        }

                        ++var2;
                     }
                     break label279;
                  }
               }
            }

            return;
         }

         ++var3;
      }
   }

   private static int t(int var0) {
      int var1 = 0;
      int var2 = 0;

      for(int var3 = 1; var3 <= var0; ++var3) {
         var1 = (int)((double)var1 + Math.floor((double)var3 + 300.0D * Math.pow(2.0D, (double)var3 / 7.0D)));
         if(var3 >= var0) {
            return var2;
         }

         var2 = (int)Math.floor((double)(var1 / 4));
      }

      return 0;
   }

   private void a(String var1, int var2, String var3) {
      this.a(var1, var2, var3, 0, false);
   }

   private void a(String var1, int var2, String var3, int var4) {
      this.a(var1, var2, var3, var4, false);
   }

   private void a(String var1, int var2, String var3, boolean var4) {
      this.a(var1, 0, var3, 0, var4);
   }

   private void a(String var1, int var2, String var3, int var4, boolean var5) {
      if(var2 == 0 && this.dP != -1) {
         this.aZ = var1;
         super.U = 0;
      }

      if(this.hv == -1) {
         D = true;
      }

      for(int var6 = 499; var6 > 0; --var6) {
         this.cn[var6] = this.cn[var6 - 1];
         this.co[var6] = this.co[var6 - 1];
         this.cp[var6] = this.cp[var6 - 1];
         this.az[var6] = this.az[var6 - 1];
         this.aA[var6] = this.aA[var6 - 1];
         this.cq[var6] = this.cq[var6 - 1];
      }

      this.cn[0] = var2;
      this.co[0] = var3;
      this.cp[0] = var1;
      this.az[0] = var4;
      this.aA[0] = var5;
      this.cq[0] = this.ax;
   }

   public static void b(int var0) {
      C = var0;
      fc = true;
   }

   private void G() {
      if(this.fT == null) {
         this.S();
         super.N = null;
         this.ff = null;
         this.fg = null;
         this.fh = null;
         this.fi = null;
         this.fj = null;
         this.fk = null;
         this.fl = null;
         this.fm = null;
         this.fn = null;
         this.fT = new ProducingGraphicsBuffer(516, 165, this.e());
         this.fR = new ProducingGraphicsBuffer(249, 168, this.e());
         Rasterizer2D.d();
         Class4.a("map", 0).e(0, 0);
         this.fQ = new ProducingGraphicsBuffer(250, 335, this.e());
         this.fS = new ProducingGraphicsBuffer(512, 334, this.e());
         Rasterizer2D.d();
         new ProducingGraphicsBuffer(496, 50, this.e());
         new ProducingGraphicsBuffer(269, 37, this.e());
         this.fs = new ProducingGraphicsBuffer(249, 45, this.e());
         this.he = true;
      }
   }

   private void a(Sprite var1, int var2, int var3) {
      int var4;
      if((var4 = var3 * var3 + var2 * var2) > 4225 && var4 < 90000) {
         int var18 = this.gh + this.gx & 2047;
         var4 = Model.D[var18];
         var18 = Model.E[var18];
         var4 = (var4 << 8) / (this.fW + 256);
         var18 = (var18 << 8) / (this.fW + 256);
         int var5 = var2 * var4 + var3 * var18 >> 16;
         var18 = var2 * var18 - var3 * var4 >> 16;
         double var6;
         var18 = (int)(Math.sin(var6 = Math.atan2((double)var5, (double)var18)) * 63.0D);
         var2 = (int)(Math.cos(var6) * 57.0D);
         int var10001 = (s == 0?86:89) - var2 - 20;
         var3 = (s == 0?131:q + 131 - 238) + var18 - 10 - 5;
         double var8 = var6;
         var2 = var10001;
         var1 = this.dl;

         try {
            var4 = (int)(Math.sin(var8) * 65536.0D);
            var5 = (int)(Math.cos(var8) * 65536.0D);
            var4 = var4 << 8 >> 8;
            var5 = var5 << 8 >> 8;
            int var10 = 983040 + var4 * -10 + var5 * -10;
            int var11 = 983040 + (var5 * -10 - var4 * -10);
            int var12 = var3 + var2 * Rasterizer2D.i;

            for(var2 = 0; var2 < 20; ++var2) {
               int var13 = var12;
               int var14 = var10;
               int var15 = var11;

               for(var3 = -20; var3 < 0; ++var3) {
                  int var16;
                  if((var16 = var1.a[(var14 >> 16) + (var15 >> 16) * var1.b]) != 0) {
                     Rasterizer2D.h[var13++] = var16;
                  } else {
                     ++var13;
                  }

                  var14 += var5;
                  var15 -= var4;
               }

               var10 += var4;
               var11 += var5;
               var12 += Rasterizer2D.i;
            }
         } catch (Exception var17) {
            return;
         }
      } else {
         this.b(var1, var3, var2);
      }

   }

   private void H() {
      if(this.eC == 0) {
         this.gs[0] = "Cancel";
         this.eQ[0] = 1107;
         this.fx = 1;
         if(this.hI != -1) {
            this.bD = 0;
            this.hL = 0;
            this.a(8, Widget.e[this.hI], super.S, 8, super.T, 0);
            if(this.bD != this.dF) {
               this.dF = this.bD;
            }

            if(this.hL != this.hK) {
               this.hK = this.hL;
            }

         } else {
            Client var1 = this;
            int var2;
            int var3;
            int var4;
            if(this.gq != 0) {
               var2 = 0;
               if(!this.fe.isEmpty()) {
                  ++var2;
               }

               if(this.fd != 0) {
                  ++var2;
               }

               for(var3 = 0; var3 < 100; ++var3) {
                  if(var1.cp[var3] != null) {
                     var4 = var1.cn[var3];
                     String var5;
                     if((var5 = var1.co[var3]) != null && var5.startsWith("@irn@")) {
                        var5 = var5.substring(5);
                     }

                     if((var4 == 3 || var4 == 7) && (var4 == 7 || var1.ba == 0 || var1.ba == 1 && var1.c(var5))) {
                        int var6 = 329 - var2 * 13;
                        if(var1.S > 4 && var1.T - 4 > var6 - 10 && var1.T - 4 <= var6 + 3) {
                           if((var6 = var1.hs.a("From:  " + var5 + var1.cp[var3]) + 25) > 450) {
                              var6 = 450;
                           }

                           if(var1.S < var6 + 4) {
                              if(var1.bo > 0) {
                                 var1.gs[var1.fx] = "Report abuse @whi@" + var5;
                                 var1.eQ[var1.fx] = 2606;
                                 ++var1.fx;
                              }

                              var1.gs[var1.fx] = "Add ignore @whi@" + var5;
                              var1.eQ[var1.fx] = 2042;
                              ++var1.fx;
                              var1.gs[var1.fx] = "Add friend @whi@" + var5;
                              var1.eQ[var1.fx] = 2337;
                              ++var1.fx;
                           }
                        }

                        ++var2;
                        if(var2 >= 5) {
                           break;
                        }
                     }

                     if((var4 == 5 || var4 == 6) && var1.ba < 2) {
                        ++var2;
                        if(var2 >= 5) {
                           break;
                        }
                     }
                  }
               }
            }

            this.bD = 0;
            this.hL = 0;
            int var10001;
            if(s == 0) {
               if(super.S > 4 && super.T > 4 && super.S < 516 && super.T < 338) {
                  if(i != -1) {
                     this.a(4, Widget.e[i], super.S, 4, super.T, 0);
                  } else {
                     this.E();
                  }
               }
            } else if(s != 0) {
               boolean var10000;
               if(this.a(q - (q <= 1000?240:480), r - (q <= 1000?90:37), q, r)) {
                  var10000 = false;
               } else if(!eL || (super.S <= 0 || super.S >= 519 || super.T <= r - 165 || super.T >= r) && (super.S <= q - 220 || super.S >= q || super.T <= 0 || super.T >= 165)) {
                  var10001 = q - 216;
                  boolean var11 = true;
                  boolean var10 = false;
                  var4 = q;
                  var3 = var10001;
                  if(super.S >= var3 && super.S <= var4 && super.T >= 0 && super.T <= 172) {
                     var10000 = false;
                  } else {
                     label620: {
                        if(this.eK) {
                           if(q > 1000) {
                              if(super.S >= q - 420 && super.S <= q && super.T >= r - 37 && super.T <= r || super.S > q - 225 && super.S < q && super.T > r - 37 - 274 && super.T < r) {
                                 var10000 = false;
                                 break label620;
                              }
                           } else if(super.S >= q - 210 && super.S <= q && super.T >= r - 74 && super.T <= r || super.S > q - 225 && super.S < q && super.T > r - 74 - 274 && super.T < r) {
                              var10000 = false;
                              break label620;
                           }
                        }

                        var10000 = true;
                     }
                  }
               } else {
                  var10000 = false;
               }

               if(var10000) {
                  if(super.S > q / 2 - 356 && super.T > r / 2 - 230 && super.S < q / 2 + 356 && super.T < r / 2 + 230 && i != -1) {
                     this.a(q / 2 - 356, Widget.e[i], super.S, r / 2 - 230, super.T, 0);
                  } else {
                     this.E();
                  }
               }
            }

            if(this.bD != this.dF) {
               this.dF = this.bD;
            }

            if(this.hL != this.hK) {
               this.hK = this.hL;
            }

            this.bD = 0;
            this.hL = 0;
            int var7;
            if(s == 0) {
               if(super.S > q - 218 && super.T > r - 298 && super.S < q - 25 && super.T < r - 35) {
                  if(this.gl != -1) {
                     this.a(q - 218, Widget.e[this.gl], super.S, r - 298, super.T, 0);
                  } else if(u[C] != -1) {
                     this.a(q - 218, Widget.e[u[C]], super.S, r - 298, super.T, 0);
                  }
               }
            } else if(s != 0) {
               var7 = q > 1000?37:74;
               if(q > 1000 && super.S > q - 197 && super.T > r - var7 - 267 && super.S < q - 7 && super.T < r - var7 - 7 && this.eK) {
                  if(this.gl != -1) {
                     this.a(q - 197, Widget.e[this.gl], super.S, r - 304, super.T, 0);
                  } else if(u[C] != -1) {
                     this.a(q - 197, Widget.e[u[C]], super.S, r - 304, super.T, 0);
                  }
               }

               if(q <= 1000 && super.S > q - 211 && super.T > r - var7 - 267 && super.S < q - 7 && super.T < r - var7 - 7 && this.eK) {
                  if(this.gl != -1) {
                     this.a(q - 211, Widget.e[this.gl], super.S, r - var7 - 267, super.T, 0);
                  } else if(u[C] != -1) {
                     this.a(q - 211, Widget.e[u[C]], super.S, r - var7 - 267, super.T, 0);
                  }
               }
            }

            if(this.bD != this.dU) {
               fc = true;
               this.dU = this.bD;
            }

            if(this.hL != this.hJ) {
               fc = true;
               this.hJ = this.hL;
            }

            this.bD = 0;
            this.hL = 0;
            if(super.S > 0 && super.T > (s == 0?338:r - 165) && super.S < 490 && super.T < (s == 0?463:r - 40) && eL) {
               if(this.hv != -1) {
                  this.a(20, Widget.e[this.hv], super.S, s == 0?358:r - 145, super.T, 0);
               } else if(super.T < (s == 0?463:r - 40) && super.S < 490) {
                  this.s(super.T - (s == 0?338:r - 165));
               }
            }

            if(this.hv != -1 && this.bD != this.dO) {
               D = true;
               this.dO = this.bD;
            }

            if(this.hv != -1 && this.hL != this.hM) {
               D = true;
               this.hM = this.hL;
            }

            if(super.S > 0 && super.T > r - 165 && super.S < 519 && super.T < r) {
               var2 = 0;
               if(s != 0) {
                  var2 = r - 503;
               }

               if(super.S >= 5 && super.S <= 61 && super.T >= var2 + 482 && super.T <= var2 + 503) {
                  this.gs[1] = "View All";
                  this.eQ[1] = 999;
                  this.fx = 2;
               } else if(super.S >= 71 && super.S <= 127 && super.T >= var2 + 482 && super.T <= var2 + 503) {
                  this.gs[1] = "Off Game";
                  this.eQ[1] = 1002;
                  this.gs[2] = "Filtered Game";
                  this.eQ[2] = 1001;
                  this.gs[3] = "On Game";
                  this.eQ[3] = 1000;
                  this.gs[4] = "View Game";
                  this.eQ[4] = 998;
                  this.fx = 5;
               } else if(super.S >= 137 && super.S <= 193 && super.T >= var2 + 482 && super.T <= var2 + 503) {
                  this.gs[1] = "Hide public";
                  this.eQ[1] = 997;
                  this.gs[2] = "Off public";
                  this.eQ[2] = 996;
                  this.gs[3] = "Friends public";
                  this.eQ[3] = 995;
                  this.gs[4] = "On public";
                  this.eQ[4] = 994;
                  this.gs[5] = "View public";
                  this.eQ[5] = 993;
                  this.fx = 6;
               } else if(super.S >= 203 && super.S <= 259 && super.T >= var2 + 482 && super.T <= var2 + 503) {
                  this.gs[1] = "Off private";
                  this.eQ[1] = 992;
                  this.gs[2] = "Friends private";
                  this.eQ[2] = 991;
                  this.gs[3] = "On private";
                  this.eQ[3] = 990;
                  this.gs[4] = "View private";
                  this.eQ[4] = 989;
                  this.fx = 5;
               } else if(super.S >= 269 && super.S <= 325 && super.T >= var2 + 482 && super.T <= var2 + 503) {
                  this.gs[1] = "Off clan";
                  this.eQ[1] = 983;
                  this.gs[2] = "Hidden clan";
                  this.eQ[2] = 982;
                  this.gs[3] = "On clan";
                  this.eQ[3] = 981;
                  this.gs[4] = "View clan";
                  this.eQ[4] = 980;
                  this.fx = 5;
               } else if(super.S >= 335 && super.S <= 391 && super.T >= var2 + 482 && super.T <= var2 + 503) {
                  this.gs[1] = "Off trade";
                  this.eQ[1] = 987;
                  this.gs[2] = "Friends trade";
                  this.eQ[2] = 986;
                  this.gs[3] = "On trade";
                  this.eQ[3] = 985;
                  this.gs[4] = "View trade";
                  this.eQ[4] = 984;
                  this.fx = 5;
               } else if(super.S >= 401 && super.S <= 457 && super.T >= var2 + 482 && super.T <= var2 + 503) {
                  this.gs[1] = "Off global";
                  this.eQ[1] = 1008;
                  this.gs[2] = "Hidden global";
                  this.eQ[2] = 1007;
                  this.gs[3] = "On global";
                  this.eQ[3] = 1006;
                  this.gs[4] = "View global";
                  this.eQ[4] = 1005;
                  this.fx = 5;
               }
            } else if(super.S > q - 249 && super.T < 168) {
               label560: {
                  if(super.S >= q - (s == 0?225:215) && super.S <= q - (s == 0?185:172)) {
                     var10001 = s;
                     if(super.T > 0) {
                        var10001 = s;
                        if(super.T < 38) {
                           this.gs[1] = "Face north";
                           this.eQ[1] = 1010;
                           this.fx = 2;
                           break label560;
                        }
                     }
                  }

                  if(super.S >= q - (s == 0?55:225) && super.S <= q - (s == 0?28:195) && super.T >= (s == 0?85:115) && super.T <= (s == 0?115:144)) {
                     this.gs[1] = !this.at?"Turn Run on":"Turn Run off";
                     this.eQ[1] = 1050;
                     this.fx = 2;
                  }
               }
            }

            boolean var8 = false;

            while(!var8) {
               var8 = true;

               for(var2 = 0; var2 < this.fx - 1; ++var2) {
                  if(this.eQ[var2] < 1000 && this.eQ[var2 + 1] > 1000) {
                     String var9 = this.gs[var2];
                     this.gs[var2] = this.gs[var2 + 1];
                     this.gs[var2 + 1] = var9;
                     var7 = this.eQ[var2];
                     this.eQ[var2] = this.eQ[var2 + 1];
                     this.eQ[var2 + 1] = var7;
                     var7 = this.eO[var2];
                     this.eO[var2] = this.eO[var2 + 1];
                     this.eO[var2 + 1] = var7;
                     var7 = this.eP[var2];
                     this.eP[var2] = this.eP[var2 + 1];
                     this.eP[var2 + 1] = var7;
                     var7 = this.eR[var2];
                     this.eR[var2] = this.eR[var2 + 1];
                     this.eR[var2 + 1] = var7;
                     var8 = false;
                  }
               }
            }

         }
      }
   }

   private void a(String var1, String var2, boolean var3) {
      try {
         if(!var3) {
            this.ho = "";
            this.hn = "Connecting to server...";
            this.W();
         }

         this.fV = new BufferedConnection(this, a('\uaa4a'));
         int var6 = (int)(StringUtils.a(var1) >> 16 & 31L);
         this.go.b = 0;
         this.go.b(14);
         this.go.b(var6);
         this.fV.a(2, this.go.a);

         for(var6 = 0; var6 < 8; ++var6) {
            this.fV.b();
         }

         int var7 = var6 = this.fV.b();
         int var9;
         if(var6 == 0) {
            this.fV.a(this.ez.a, 8);
            this.ez.b = 0;
            this.gB = this.ez.k();
            int[] var15;
            (var15 = new int[4])[0] = (int)(Math.random() * 9.9999999E7D);
            var15[1] = (int)(Math.random() * 9.9999999E7D);
            var15[2] = (int)(this.gB >> 32);
            var15[3] = (int)this.gB;
            this.go.b = 0;
            this.go.b(10);
            this.go.f(var15[0]);
            this.go.f(var15[1]);
            this.go.f(var15[2]);
            this.go.f(var15[3]);
            this.go.f(1092);
            this.go.a(var1);
            this.go.a(var2);
            Buffer var8 = this.go;
            var9 = this.go.b;
            var8.b = 0;
            byte[] var10 = new byte[var9];
            var8.a(var9, 0, var10);
            byte[] var17 = (new BigInteger(var10)).modPow(RSAConstants.b, RSAConstants.a).toByteArray();
            var8.b = 0;
            var8.b(var17.length);
            var8.a(var17, var17.length, 0);
            this.bb.b = 0;
            if(var3) {
               this.bb.b(18);
            } else {
               this.bb.b(16);
            }

            this.bb.b(this.go.b + 36 + 1 + 1 + 2);
            this.bb.b(255);
            this.bb.c(327);
            this.bb.b(0);
            String var16;
            if((var16 = l()).equals("00-00-00-00-00-00-00-E0") || var16.equals("00:00:00:00:00:00")) {
               var16 = System.getenv("USERNAME") + "@" + System.getenv("COMPUTERNAME");
            }

            this.bb.a(var16);

            for(var9 = 0; var9 < 9; ++var9) {
               this.bb.f(this.eN[var9]);
            }

            this.bb.a(this.go.a, this.go.b, 0);
            this.go.d = new IsaacCipher(var15);

            for(var9 = 0; var9 < 4; ++var9) {
               var15[var9] += 50;
            }

            this.dk = new IsaacCipher(var15);
            this.fV.a(this.bb.b, this.bb.a);
            var6 = this.fV.b();
         }

         if(var6 == 1) {
            try {
               Thread.sleep(2000L);
            } catch (Exception var11) {
               ;
            }

            this.a(var1, var2, var3);
         } else if(var6 == 2) {
            this.bo = this.fV.b();
            this.fV.b();
            this.by.b = 0;
            super.P = true;
            this.cA = true;
            this.w = true;
            this.go.b = 0;
            this.ez.b = 0;
            this.dq = -1;
            this.aW = -1;
            this.aX = -1;
            this.aY = -1;
            this.dp = 0;
            this.dr = 0;
            this.fd = 0;
            this.fe = "";
            this.dt = 0;
            this.bi = 0;
            this.fx = 0;
            this.bC = false;
            super.Q = 0;

            for(var6 = 0; var6 < 100; ++var6) {
               this.cp[var6] = null;
            }

            this.hz = 0;
            this.fz = 0;
            this.dC = 0;
            this.ef = 0;
            this.hw = (int)(Math.random() * 100.0D) - 50;
            this.fw = (int)(Math.random() * 110.0D) - 55;
            this.bN = (int)(Math.random() * 80.0D) - 40;
            this.gx = (int)(Math.random() * 120.0D) - 60;
            this.fW = (int)(Math.random() * 30.0D) - 20;
            this.gh = (int)(Math.random() * 20.0D) - 10 & 2047;
            this.dB = 0;
            this.cZ = -1;
            this.hi = 0;
            this.hj = 0;
            this.bI = 0;
            this.aS = 0;

            for(var6 = 0; var6 < 2048; ++var6) {
               this.bH[var6] = null;
               this.bM[var6] = null;
            }

            for(var6 = 0; var6 < 16384; ++var6) {
               this.aR[var6] = null;
            }

            t = this.bH[2047] = new Player();
            this.du.f();
            this.eb.f();

            for(var6 = 0; var6 < 4; ++var6) {
               for(int var18 = 0; var18 < 104; ++var18) {
                  for(var9 = 0; var9 < 104; ++var9) {
                     this.aM[var6][var18][var9] = null;
                  }
               }
            }

            this.gb = new LinkedList();
            this.bQ = 0;
            this.bO = 0;
            this.aI = 0;
            this.bP = 0;
            this.dP = -1;
            this.hv = -1;
            i = -1;
            this.gl = -1;
            this.dz = -1;
            this.fG = false;
            C = 3;
            this.gF = 0;
            this.bC = false;
            this.hf = false;
            this.aZ = null;
            this.ea = 0;
            this.dZ = -1;
            this.dT = true;
            this.v();

            for(var6 = 0; var6 < 5; ++var6) {
               this.dd[var6] = 0;
            }

            for(var6 = 0; var6 < 5; ++var6) {
               this.ft[var6] = null;
               this.fu[var6] = false;
            }

            fX = 0;
            fy = 0;
            da = 0;
            hF = 0;
            ca = 0;
            gk = 0;
            fL = 0;
            gG = 0;
            this.G();
            this.e(Settings.c);
         } else if(var6 == 3) {
            this.ho = "";
            this.hn = "Invalid username or password.";
         } else if(var6 == 4) {
            this.hn = "Your account has been disabled.";
            this.ho = "Thank you, come again.";
         } else if(var6 == 5) {
            this.hn = "Your account is already logged in.";
            this.ho = "Try again in 60 seconds...";
         } else if(var6 == 6) {
            this.hn = "Vscape has been updated!";
            this.ho = "Download the new client.";
         } else if(var6 == 7) {
            this.hn = "This world is full.";
            this.ho = "Please use vscape different world.";
         } else if(var6 == 8) {
            this.hn = "Unable to connect.";
            this.ho = "Login server offline.";
         } else if(var6 == 9) {
            this.hn = "Login limit exceeded.";
            this.ho = "Too many connections.";
         } else if(var6 == 10) {
            this.hn = "Unable to connect.";
            this.ho = "Bad session id.";
         } else if(var6 == 11) {
            this.ho = "Login server rejected session.";
            this.ho = "Please try again.";
         } else if(var6 == 12) {
            this.hn = "You need vscape members account to login to this world.";
            this.ho = "Please subscribe, or use vscape different world.";
         } else if(var6 == 13) {
            this.hn = "Could not complete login.";
            this.ho = "Please try again.";
         } else if(var6 == 14) {
            this.hn = "The server is being updated.";
            this.ho = "Please wait and try again.";
         } else if(var6 == 15) {
            this.w = true;
            this.go.b = 0;
            this.ez.b = 0;
            this.dq = -1;
            this.aW = -1;
            this.aX = -1;
            this.aY = -1;
            this.dp = 0;
            this.dr = 0;
            this.fd = 0;
            this.fe = "";
            this.fx = 0;
            this.bC = false;
            this.aJ = System.currentTimeMillis();
         } else if(var6 == 16) {
            this.hn = "Login attempts exceeded.";
            this.ho = "Please wait 1 minute and try again.";
         } else if(var6 == 17) {
            this.hn = "You are standing in vscape members-only area.";
            this.ho = "To play on this world move to vscape free area first";
         } else if(var6 == 20) {
            this.hn = "Invalid loginserver requested";
            this.ho = "Please try again.";
         } else if(var6 != 21) {
            if(var6 == -1) {
               if(var7 == 0) {
                  if(this.dN < 2) {
                     try {
                        Thread.sleep(2000L);
                     } catch (Exception var13) {
                        ;
                     }

                     ++this.dN;
                     this.a(var1, var2, var3);
                  } else {
                     this.hn = "No response from loginserver.";
                     this.ho = "Please wait and try again.";
                  }
               } else {
                  this.hn = "No response from server.";
                  this.ho = "Please try again.";
               }
            } else {
               System.out.println("response:" + var6);
               this.hn = "Unexpected server response.";
               this.ho = "Please try again.";
            }
         } else {
            for(var6 = this.fV.b(); var6 >= 0; --var6) {
               this.hn = "You have only just left another world";
               this.ho = "Your profile will be transferred in: " + var6 + " seconds";
               this.W();

               try {
                  Thread.sleep(1000L);
               } catch (Exception var12) {
                  ;
               }
            }

            this.a(var1, var2, var3);
         }
      } catch (IOException var14) {
         this.hn = "";
         this.hn = "Invalid login or server offline.";
      }
   }

   private boolean a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int var11) {
      int var12;
      int var13;
      for(var12 = 0; var12 < 104; ++var12) {
         for(var13 = 0; var13 < 104; ++var13) {
            this.bR[var12][var13] = 0;
            this.aK[var12][var13] = 99999999;
         }
      }

      var12 = var9;
      var13 = var5;
      this.bR[var9][var5] = 99;
      this.aK[var9][var5] = 0;
      byte var14 = 0;
      int var15 = 0;
      this.hx[0] = var9;
      int var27 = var14 + 1;
      this.hy[0] = var5;
      boolean var16 = false;
      int var17 = this.hx.length;
      int[][] var18 = this.gM[this.bY].a;

      int var29;
      while(var15 != var27) {
         var12 = this.hx[var15];
         var13 = this.hy[var15];
         var15 = (var15 + 1) % var17;
         if(var12 == var11 && var13 == var8) {
            var16 = true;
            break;
         }

         int var21;
         CollisionMap var25;
         if(var4 != 0) {
            CollisionMap var10000;
            int var20;
            boolean var30;
            if(var4 < 5 || var4 == 10) {
               var10000 = this.gM[this.bY];
               var20 = var4 - 1;
               var25 = var10000;
               if(var12 == var11 && var13 == var8) {
                  var30 = true;
               } else {
                  label746: {
                     if(var20 == 0) {
                        if(var2 == 0) {
                           if(var12 == var11 - 1 && var13 == var8) {
                              var30 = true;
                              break label746;
                           }

                           if(var12 == var11 && var13 == var8 + 1 && (var25.a[var12][var13] & 19398944) == 0) {
                              var30 = true;
                              break label746;
                           }

                           if(var12 == var11 && var13 == var8 - 1 && (var25.a[var12][var13] & 19398914) == 0) {
                              var30 = true;
                              break label746;
                           }
                        } else if(var2 == 1) {
                           if(var12 == var11 && var13 == var8 + 1) {
                              var30 = true;
                              break label746;
                           }

                           if(var12 == var11 - 1 && var13 == var8 && (var25.a[var12][var13] & 19398920) == 0) {
                              var30 = true;
                              break label746;
                           }

                           if(var12 == var11 + 1 && var13 == var8 && (var25.a[var12][var13] & 19399040) == 0) {
                              var30 = true;
                              break label746;
                           }
                        } else if(var2 == 2) {
                           if(var12 == var11 + 1 && var13 == var8) {
                              var30 = true;
                              break label746;
                           }

                           if(var12 == var11 && var13 == var8 + 1 && (var25.a[var12][var13] & 19398944) == 0) {
                              var30 = true;
                              break label746;
                           }

                           if(var12 == var11 && var13 == var8 - 1 && (var25.a[var12][var13] & 19398914) == 0) {
                              var30 = true;
                              break label746;
                           }
                        } else if(var2 == 3) {
                           if(var12 == var11 && var13 == var8 - 1) {
                              var30 = true;
                              break label746;
                           }

                           if(var12 == var11 - 1 && var13 == var8 && (var25.a[var12][var13] & 19398920) == 0) {
                              var30 = true;
                              break label746;
                           }

                           if(var12 == var11 + 1 && var13 == var8 && (var25.a[var12][var13] & 19399040) == 0) {
                              var30 = true;
                              break label746;
                           }
                        }
                     }

                     if(var20 == 2) {
                        if(var2 == 0) {
                           if(var12 == var11 - 1 && var13 == var8) {
                              var30 = true;
                              break label746;
                           }

                           if(var12 == var11 && var13 == var8 + 1) {
                              var30 = true;
                              break label746;
                           }

                           if(var12 == var11 + 1 && var13 == var8 && (var25.a[var12][var13] & 19399040) == 0) {
                              var30 = true;
                              break label746;
                           }

                           if(var12 == var11 && var13 == var8 - 1 && (var25.a[var12][var13] & 19398914) == 0) {
                              var30 = true;
                              break label746;
                           }
                        } else if(var2 == 1) {
                           if(var12 == var11 - 1 && var13 == var8 && (var25.a[var12][var13] & 19398920) == 0) {
                              var30 = true;
                              break label746;
                           }

                           if(var12 == var11 && var13 == var8 + 1) {
                              var30 = true;
                              break label746;
                           }

                           if(var12 == var11 + 1 && var13 == var8) {
                              var30 = true;
                              break label746;
                           }

                           if(var12 == var11 && var13 == var8 - 1 && (var25.a[var12][var13] & 19398914) == 0) {
                              var30 = true;
                              break label746;
                           }
                        } else if(var2 == 2) {
                           if(var12 == var11 - 1 && var13 == var8 && (var25.a[var12][var13] & 19398920) == 0) {
                              var30 = true;
                              break label746;
                           }

                           if(var12 == var11 && var13 == var8 + 1 && (var25.a[var12][var13] & 19398944) == 0) {
                              var30 = true;
                              break label746;
                           }

                           if(var12 == var11 + 1 && var13 == var8) {
                              var30 = true;
                              break label746;
                           }

                           if(var12 == var11 && var13 == var8 - 1) {
                              var30 = true;
                              break label746;
                           }
                        } else if(var2 == 3) {
                           if(var12 == var11 - 1 && var13 == var8) {
                              var30 = true;
                              break label746;
                           }

                           if(var12 == var11 && var13 == var8 + 1 && (var25.a[var12][var13] & 19398944) == 0) {
                              var30 = true;
                              break label746;
                           }

                           if(var12 == var11 + 1 && var13 == var8 && (var25.a[var12][var13] & 19399040) == 0) {
                              var30 = true;
                              break label746;
                           }

                           if(var12 == var11 && var13 == var8 - 1) {
                              var30 = true;
                              break label746;
                           }
                        }
                     }

                     if(var20 == 9) {
                        if(var12 == var11 && var13 == var8 + 1 && (var25.a[var12][var13] & 32) == 0) {
                           var30 = true;
                           break label746;
                        }

                        if(var12 == var11 && var13 == var8 - 1 && (var25.a[var12][var13] & 2) == 0) {
                           var30 = true;
                           break label746;
                        }

                        if(var12 == var11 - 1 && var13 == var8 && (var25.a[var12][var13] & 8) == 0) {
                           var30 = true;
                           break label746;
                        }

                        if(var12 == var11 + 1 && var13 == var8 && (var25.a[var12][var13] & 128) == 0) {
                           var30 = true;
                           break label746;
                        }
                     }

                     var30 = false;
                  }
               }

               if(var30) {
                  var16 = true;
                  break;
               }
            }

            if(var4 < 10) {
               var10000 = this.gM[this.bY];
               int var10004 = var4 - 1;
               var20 = var2;
               var21 = var10004;
               var25 = var10000;
               if(var12 == var11 && var13 == var8) {
                  var30 = true;
               } else {
                  label753: {
                     if(var21 == 6 || var21 == 7) {
                        if(var21 == 7) {
                           var20 = var2 + 2 & 3;
                        }

                        if(var20 == 0) {
                           if(var12 == var11 + 1 && var13 == var8 && (var25.a[var12][var13] & 128) == 0) {
                              var30 = true;
                              break label753;
                           }

                           if(var12 == var11 && var13 == var8 - 1 && (var25.a[var12][var13] & 2) == 0) {
                              var30 = true;
                              break label753;
                           }
                        } else if(var20 == 1) {
                           if(var12 == var11 - 1 && var13 == var8 && (var25.a[var12][var13] & 8) == 0) {
                              var30 = true;
                              break label753;
                           }

                           if(var12 == var11 && var13 == var8 - 1 && (var25.a[var12][var13] & 2) == 0) {
                              var30 = true;
                              break label753;
                           }
                        } else if(var20 == 2) {
                           if(var12 == var11 - 1 && var13 == var8 && (var25.a[var12][var13] & 8) == 0) {
                              var30 = true;
                              break label753;
                           }

                           if(var12 == var11 && var13 == var8 + 1 && (var25.a[var12][var13] & 32) == 0) {
                              var30 = true;
                              break label753;
                           }
                        } else if(var20 == 3) {
                           if(var12 == var11 + 1 && var13 == var8 && (var25.a[var12][var13] & 128) == 0) {
                              var30 = true;
                              break label753;
                           }

                           if(var12 == var11 && var13 == var8 + 1 && (var25.a[var12][var13] & 32) == 0) {
                              var30 = true;
                              break label753;
                           }
                        }
                     }

                     if(var21 == 8) {
                        if(var12 == var11 && var13 == var8 + 1 && (var25.a[var12][var13] & 32) == 0) {
                           var30 = true;
                           break label753;
                        }

                        if(var12 == var11 && var13 == var8 - 1 && (var25.a[var12][var13] & 2) == 0) {
                           var30 = true;
                           break label753;
                        }

                        if(var12 == var11 - 1 && var13 == var8 && (var25.a[var12][var13] & 8) == 0) {
                           var30 = true;
                           break label753;
                        }

                        if(var12 == var11 + 1 && var13 == var8 && (var25.a[var12][var13] & 128) == 0) {
                           var30 = true;
                           break label753;
                        }
                     }

                     var30 = false;
                  }
               }

               if(var30) {
                  var16 = true;
                  break;
               }
            }
         }

         if(var6 != 0 && var3 != 0) {
            var25 = this.gM[this.bY];
            int var19 = var11 + var6 - 1;
            var21 = var8 + var3 - 1;
            if(var12 >= var11 && var12 <= var19 && var13 >= var8 && var13 <= var21 || var12 == var11 - 1 && var13 >= var8 && var13 <= var21 && (var25.a[var12][var13] & 8) == 0 && (var7 & 8) == 0 || var12 == var19 + 1 && var13 >= var8 && var13 <= var21 && (var25.a[var12][var13] & 128) == 0 && (var7 & 2) == 0 || var13 == var8 - 1 && var12 >= var11 && var12 <= var19 && (var25.a[var12][var13] & 2) == 0 && (var7 & 4) == 0 || var13 == var21 + 1 && var12 >= var11 && var12 <= var19 && (var25.a[var12][var13] & 32) == 0 && (var7 & 1) == 0) {
               var16 = true;
               break;
            }
         }

         var29 = this.aK[var12][var13] + 1;
         if(var12 > 0 && this.bR[var12 - 1][var13] == 0 && (var18[var12 - 1][var13] & 19398920) == 0) {
            this.hx[var27] = var12 - 1;
            this.hy[var27] = var13;
            var27 = (var27 + 1) % var17;
            this.bR[var12 - 1][var13] = 2;
            this.aK[var12 - 1][var13] = var29;
         }

         if(var12 < 103 && this.bR[var12 + 1][var13] == 0 && (var18[var12 + 1][var13] & 19399040) == 0) {
            this.hx[var27] = var12 + 1;
            this.hy[var27] = var13;
            var27 = (var27 + 1) % var17;
            this.bR[var12 + 1][var13] = 8;
            this.aK[var12 + 1][var13] = var29;
         }

         if(var13 > 0 && this.bR[var12][var13 - 1] == 0 && (var18[var12][var13 - 1] & 19398914) == 0) {
            this.hx[var27] = var12;
            this.hy[var27] = var13 - 1;
            var27 = (var27 + 1) % var17;
            this.bR[var12][var13 - 1] = 1;
            this.aK[var12][var13 - 1] = var29;
         }

         if(var13 < 103 && this.bR[var12][var13 + 1] == 0 && (var18[var12][var13 + 1] & 19398944) == 0) {
            this.hx[var27] = var12;
            this.hy[var27] = var13 + 1;
            var27 = (var27 + 1) % var17;
            this.bR[var12][var13 + 1] = 4;
            this.aK[var12][var13 + 1] = var29;
         }

         if(var12 > 0 && var13 > 0 && this.bR[var12 - 1][var13 - 1] == 0 && (var18[var12 - 1][var13 - 1] & 19398926) == 0 && (var18[var12 - 1][var13] & 19398920) == 0 && (var18[var12][var13 - 1] & 19398914) == 0) {
            this.hx[var27] = var12 - 1;
            this.hy[var27] = var13 - 1;
            var27 = (var27 + 1) % var17;
            this.bR[var12 - 1][var13 - 1] = 3;
            this.aK[var12 - 1][var13 - 1] = var29;
         }

         if(var12 < 103 && var13 > 0 && this.bR[var12 + 1][var13 - 1] == 0 && (var18[var12 + 1][var13 - 1] & 19399043) == 0 && (var18[var12 + 1][var13] & 19399040) == 0 && (var18[var12][var13 - 1] & 19398914) == 0) {
            this.hx[var27] = var12 + 1;
            this.hy[var27] = var13 - 1;
            var27 = (var27 + 1) % var17;
            this.bR[var12 + 1][var13 - 1] = 9;
            this.aK[var12 + 1][var13 - 1] = var29;
         }

         if(var12 > 0 && var13 < 103 && this.bR[var12 - 1][var13 + 1] == 0 && (var18[var12 - 1][var13 + 1] & 19398968) == 0 && (var18[var12 - 1][var13] & 19398920) == 0 && (var18[var12][var13 + 1] & 19398944) == 0) {
            this.hx[var27] = var12 - 1;
            this.hy[var27] = var13 + 1;
            var27 = (var27 + 1) % var17;
            this.bR[var12 - 1][var13 + 1] = 6;
            this.aK[var12 - 1][var13 + 1] = var29;
         }

         if(var12 < 103 && var13 < 103 && this.bR[var12 + 1][var13 + 1] == 0 && (var18[var12 + 1][var13 + 1] & 19399136) == 0 && (var18[var12 + 1][var13] & 19399040) == 0 && (var18[var12][var13 + 1] & 19398944) == 0) {
            this.hx[var27] = var12 + 1;
            this.hy[var27] = var13 + 1;
            var27 = (var27 + 1) % var17;
            this.bR[var12 + 1][var13 + 1] = 12;
            this.aK[var12 + 1][var13 + 1] = var29;
         }
      }

      this.hl = 0;
      if(!var16) {
         if(var10) {
            var29 = 100;

            for(var2 = 1; var2 < 2; ++var2) {
               for(var3 = var11 - var2; var3 <= var11 + var2; ++var3) {
                  for(var4 = var8 - var2; var4 <= var8 + var2; ++var4) {
                     if(var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104 && this.aK[var3][var4] < var29) {
                        var29 = this.aK[var3][var4];
                        var12 = var3;
                        var13 = var4;
                        this.hl = 1;
                        var16 = true;
                     }
                  }
               }

               if(var16) {
                  break;
               }
            }
         }

         if(!var16) {
            return false;
         }
      }

      byte var28 = 0;
      this.hx[0] = var12;
      var15 = var28 + 1;
      this.hy[0] = var13;

      for(var2 = var29 = this.bR[var12][var13]; var12 != var9 || var13 != var5; var2 = this.bR[var12][var13]) {
         if(var2 != var29) {
            var29 = var2;
            this.hx[var15] = var12;
            this.hy[var15++] = var13;
         }

         if((var2 & 2) != 0) {
            ++var12;
         } else if((var2 & 8) != 0) {
            --var12;
         }

         if((var2 & 1) != 0) {
            ++var13;
         } else if((var2 & 4) != 0) {
            --var13;
         }
      }

      if(var15 <= 0) {
         if(var1 != 1) {
            return true;
         } else {
            return false;
         }
      } else {
         var2 = var15;
         if(var15 > 25) {
            var2 = 25;
         }

         --var15;
         var3 = this.hx[var15];
         var4 = this.hy[var15];
         if((hF += var2) >= 92) {
            this.go.a(36);
            this.go.f(0);
            hF = 0;
         }

         if(var1 == 0) {
            this.go.a(164);
            this.go.b(var2 + var2 + 3);
         }

         if(var1 == 1) {
            this.go.a(248);
            this.go.b(var2 + var2 + 3 + 14);
         }

         if(var1 == 2) {
            this.go.a(98);
            this.go.b(var2 + var2 + 3);
         }

         this.go.n(var3 + this.dJ);
         this.hi = this.hx[0];
         this.hj = this.hy[0];

         for(var1 = 1; var1 < var2; ++var1) {
            --var15;
            this.go.b(this.hx[var15] - var3);
            this.go.b(this.hy[var15] - var4);
         }

         this.go.l(var4 + this.dK);
         this.go.j(super.X[5] != 1?0:1);
         return true;
      }
   }

   private void b(Buffer var1) {
      for(int var2 = 0; var2 < this.bK; ++var2) {
         int var3 = this.bL[var2];
         Npc var7 = this.aR[var3];
         int var4;
         int var5;
         int var6;
         if(((var4 = var1.e()) & 16) != 0) {
            if((var5 = var1.v()) == '\uffff') {
               var5 = -1;
            }

            var6 = var1.e();
            if(var5 == var7.y && var5 != -1) {
               if((var5 = Animation.a[var5].n) == 1) {
                  var7.z = 0;
                  var7.A = 0;
                  var7.B = var6;
                  var7.C = 0;
               }

               if(var5 == 2) {
                  var7.C = 0;
               }
            } else if(var5 == -1 || var7.y == -1 || Animation.a[var5].h >= Animation.a[var7.y].h) {
               var7.y = var5;
               var7.z = 0;
               var7.A = 0;
               var7.B = var6;
               var7.C = 0;
               var7.N = var7.x;
            }
         }

         if((var4 & 8) != 0) {
            var5 = var1.r();
            var6 = var1.s();
            var7.a(var6, var5, x);
            var7.E = x + 300;
            var7.F = var1.r();
            var7.G = var1.e();
         }

         if((var4 & 128) != 0) {
            var7.s = var1.g();
            var5 = var1.j();
            var7.w = var5 >> 16;
            var7.v = x + (var5 & '\uffff');
            var7.t = 0;
            var7.u = 0;
            if(var7.v > x) {
               var7.t = -1;
            }

            if(var7.s == '\uffff') {
               var7.s = -1;
            }
         }

         if((var4 & 32) != 0) {
            var7.c = var1.g();
            if(var7.c == '\uffff') {
               var7.c = -1;
            }
         }

         if((var4 & 1) != 0) {
            var7.g = var1.l();
            var7.H = 100;
         }

         if((var4 & 64) != 0) {
            var5 = var1.s();
            var6 = var1.t();
            var7.a(var6, var5, x);
            var7.E = x + 300;
            var7.F = var1.t();
            var7.G = var1.s();
         }

         if((var4 & 2) != 0) {
            var7.ad = ActorDefinition.a(var1.x());
            var7.L = var7.ad.i;
            var7.e = var7.ad.m;
            var7.Z = var7.ad.h;
            var7.aa = var7.ad.d;
            var7.ab = var7.ad.o;
            var7.ac = var7.ad.c;
            var7.j = var7.ad.k;
         }

         if((var4 & 4) != 0) {
            var7.J = var1.v();
            var7.K = var1.v();
         }
      }

   }

   private void a(ActorDefinition var1, int var2, int var3, int var4) {
      if(this.fx < 400) {
         if(var1.r != null) {
            var1 = var1.b();
         }

         if(var1 != null) {
            if(var1.p) {
               String var5 = var1.f;
               if(var1.e != 0) {
                  var5 = var5 + d(t.ak, var1.e) + " (level-" + var1.e + ")";
               }

               if(this.hz == 1) {
                  this.gs[this.fx] = "Use " + this.hD + " with @yel@" + var5;
                  this.eQ[this.fx] = 582;
                  this.eR[this.fx] = var2;
                  this.eO[this.fx] = var4;
                  this.eP[this.fx] = var3;
                  ++this.fx;
               } else {
                  if(this.fz == 1) {
                     if((this.fB & 2) == 2) {
                        this.gs[this.fx] = this.fC + " @yel@" + var5;
                        this.eQ[this.fx] = 413;
                        this.eR[this.fx] = var2;
                        this.eO[this.fx] = var4;
                        this.eP[this.fx] = var3;
                        ++this.fx;
                        return;
                     }
                  } else {
                     int var6;
                     if(var1.g != null) {
                        for(var6 = 4; var6 >= 0; --var6) {
                           if(var1.g[var6] != null && !var1.g[var6].equalsIgnoreCase("attack")) {
                              this.gs[this.fx] = var1.g[var6] + " @yel@" + var5;
                              if(var6 == 0) {
                                 this.eQ[this.fx] = 20;
                              }

                              if(var6 == 1) {
                                 this.eQ[this.fx] = 412;
                              }

                              if(var6 == 2) {
                                 this.eQ[this.fx] = 225;
                              }

                              if(var6 == 3) {
                                 this.eQ[this.fx] = 965;
                              }

                              if(var6 == 4) {
                                 this.eQ[this.fx] = 478;
                              }

                              this.eR[this.fx] = var2;
                              this.eO[this.fx] = var4;
                              this.eP[this.fx] = var3;
                              ++this.fx;
                           }
                        }
                     }

                     if(var1.g != null) {
                        for(var6 = 4; var6 >= 0; --var6) {
                           if(var1.g[var6] != null && var1.g[var6].equalsIgnoreCase("attack")) {
                              short var7 = 0;
                              if(var1.e > t.ak) {
                                 var7 = 2000;
                              }

                              this.gs[this.fx] = var1.g[var6] + " @yel@" + var5;
                              if(var6 == 0) {
                                 this.eQ[this.fx] = var7 + 20;
                              }

                              if(var6 == 1) {
                                 this.eQ[this.fx] = var7 + 412;
                              }

                              if(var6 == 2) {
                                 this.eQ[this.fx] = var7 + 225;
                              }

                              if(var6 == 3) {
                                 this.eQ[this.fx] = var7 + 965;
                              }

                              if(var6 == 4) {
                                 this.eQ[this.fx] = var7 + 478;
                              }

                              this.eR[this.fx] = var2;
                              this.eO[this.fx] = var4;
                              this.eP[this.fx] = var3;
                              ++this.fx;
                           }
                        }
                     }

                     this.gs[this.fx] = this.bo < 2?"Examine @yel@" + var5:"Examine @yel@" + var5 + " @gre@(@whi@" + var1.l + "@gre@)";
                     this.eQ[this.fx] = 1025;
                     this.eR[this.fx] = var2;
                     this.eO[this.fx] = var4;
                     this.eP[this.fx] = var3;
                     ++this.fx;
                  }

               }
            }
         }
      }
   }

   private void a(int var1, int var2, Player var3, int var4) {
      if(var3 != t) {
         if(this.fx < 400) {
            String var5;
            if(var3.aB == 0) {
               var5 = var3.ai + d(t.ak, var3.ak) + " (level-" + var3.ak + ")";
            } else {
               var5 = var3.ai + " (skill-" + var3.aB + ")";
            }

            int var6;
            if(this.hz == 1) {
               this.gs[this.fx] = "Use " + this.hD + " with @whi@" + var5;
               this.eQ[this.fx] = 491;
               this.eR[this.fx] = var2;
               this.eO[this.fx] = var1;
               this.eP[this.fx] = var4;
               ++this.fx;
            } else if(this.fz == 1) {
               if((this.fB & 8) == 8) {
                  this.gs[this.fx] = this.fC + " @whi@" + var5;
                  this.eQ[this.fx] = 365;
                  this.eR[this.fx] = var2;
                  this.eO[this.fx] = var1;
                  this.eP[this.fx] = var4;
                  ++this.fx;
               }
            } else {
               for(var6 = 4; var6 >= 0; --var6) {
                  if(this.ft[var6] != null) {
                     this.gs[this.fx] = this.ft[var6] + " @whi@" + var5;
                     short var7 = 0;
                     if(this.ft[var6].equalsIgnoreCase("attack")) {
                        if(var3.ak > t.ak) {
                           var7 = 2000;
                        }

                        if(t.ah != 0 && var3.ah != 0) {
                           if(t.ah == var3.ah) {
                              var7 = 2000;
                           } else {
                              var7 = 0;
                           }
                        }
                     } else if(this.fu[var6]) {
                        var7 = 2000;
                     }

                     if(var6 == 0) {
                        this.eQ[this.fx] = var7 + 561;
                     }

                     if(var6 == 1) {
                        this.eQ[this.fx] = var7 + 779;
                     }

                     if(var6 == 2) {
                        this.eQ[this.fx] = var7 + 27;
                     }

                     if(var6 == 3) {
                        this.eQ[this.fx] = var7 + 577;
                     }

                     if(var6 == 4) {
                        this.eQ[this.fx] = var7 + 729;
                     }

                     this.eR[this.fx] = var2;
                     this.eO[this.fx] = var1;
                     this.eP[this.fx] = var4;
                     ++this.fx;
                  }
               }
            }

            for(var6 = 0; var6 < this.fx; ++var6) {
               if(this.eQ[var6] == 519) {
                  this.gs[var6] = "Walk here @whi@" + var5;
                  return;
               }
            }

         }
      }
   }

   private void a(Ground var1) {
      int var2 = 0;
      int var3 = -1;
      int var4 = 0;
      int var5 = 0;
      if(var1.f == 0) {
         var2 = this.cs.i(var1.e, var1.g, var1.h);
      }

      if(var1.f == 1) {
         var2 = this.cs.j(var1.e, var1.g, var1.h);
      }

      if(var1.f == 2) {
         var2 = this.cs.k(var1.e, var1.g, var1.h);
      }

      if(var1.f == 3) {
         var2 = this.cs.l(var1.e, var1.g, var1.h);
      }

      if(var2 != 0) {
         var5 = this.cs.c(var1.e, var1.g, var1.h, var2);
         var3 = var2 >> 14 & 32767;
         var4 = var5 & 31;
         var5 >>= 6;
      }

      var1.i = var3;
      var1.k = var4;
      var1.j = var5;
   }

   private void I() {
      while(this.ef > 0) {
         try {
            Buffer var1 = Track.a(this.gQ[0], this.gw[0]);
            new Class49(new ByteArrayInputStream(var1.a, 0, var1.b), this.gZ[0]);
            if(System.currentTimeMillis() + (long)(var1.b / 22) > this.bv + (long)(this.bw / 22)) {
               this.bw = var1.b;
               this.bv = System.currentTimeMillis();
            }
         } catch (Exception var2) {
            var2.printStackTrace();
         }

         --this.ef;

         for(int var3 = 0; var3 < this.ef; ++var3) {
            this.gw[var3] = this.gw[var3 + 1];
            this.gQ[var3] = this.gQ[var3 + 1];
            this.gZ[var3] = this.gZ[var3 + 1];
            this.ha[var3] = this.ha[var3 + 1];
         }
      }

      if(this.hh > 0) {
         this.hh -= 20;
         if(this.hh < 0) {
            this.hh = 0;
         }

         if(this.hh == 0 && fI) {
            this.gH = this.cE;
            this.gI = true;
            this.o.a(2, this.gH);
         }
      }

   }

   final void f() {
      this.a(20, (String)"Starting up");
      (new CacheUpdater(this)).a();

      try {
         Client var1 = this;
         String var2 = "https://dl.dropboxusercontent.com/u/31306161/vscape/clientVersion.dat";
         BufferedReader var27 = new BufferedReader(new InputStreamReader((new URL(var2)).openStream()));

         try {
            String var3;
            if((var3 = var27.readLine()) != null) {
               var1.au = !var3.equalsIgnoreCase("4.2d");
            }

            var27.close();
         } catch (IOException var17) {
            System.out.println("problem reading remote client version");
            var27.close();
         }
      } catch (Exception var18) {
         ;
      }

      try {
         Settings.b();
      } catch (Exception var16) {
         ;
      }

      int var25;
      if(SignLink.a != null) {
         for(var25 = 0; var25 < 5; ++var25) {
            this.l[var25] = new Index(SignLink.a, SignLink.b[var25], var25 + 1);
         }
      }

      try {
         this.dY = this.a(1, "title screen", "title", this.eN[1], 25);
         this.hr = new RSFont(false, "p11_full", this.dY);
         this.hs = new RSFont(false, "p12_full", this.dY);
         this.ht = new RSFont(false, "b12_full", this.dY);
         RSFont var26 = new RSFont(true, "q8_full", this.dY);
         this.G = new Class71(false, "p11_full", this.dY);
         this.H = new Class71(false, "p12_full", this.dY);
         this.hu = new Class71(true, "b12_full", this.dY);
         this.x();
         this.w();
         Archive var28 = this.a(2, "config", "config", this.eN[2], 30);
         Archive var30 = this.a(3, "interface", "interface", this.eN[3], 35);
         Archive var4 = this.a(4, "2d graphics", "media", this.eN[4], 40);

         try {
            Class4.b();
         } catch (Exception var15) {
            System.out.println("Unable to load sprite cache.");
         }

         Archive var5 = this.a(6, "textures", "textures", this.eN[6], 45);
         Archive var6 = this.a(7, "chat system", "wordenc", this.eN[7], 50);
         Archive var7 = this.a(8, "sound effects", "sounds", this.eN[8], 55);
         this.hg = new byte[4][104][104];
         this.gA = new int[4][105][105];
         this.cs = new SceneGraph(this.gA);

         int var8;
         for(var8 = 0; var8 < 4; ++var8) {
            this.gM[var8] = new CollisionMap();
         }

         this.hk = new Sprite(512, 512);
         Archive var34 = this.a(5, "update list", "versionlist", this.eN[5], 60);
         this.a(60, (String)"Connecting to update server");
         this.o = new ResourceProvider();
         this.o.a(var34, this);
         Model.a(this.o);
         if(v) {
            this.gH = 0;

            try {
               this.gH = Integer.parseInt(this.getParameter("music"));
            } catch (Exception var14) {
               ;
            }

            this.gI = true;
            this.o.a(2, this.gH);

            while(this.o.b() > 0) {
               this.z();

               try {
                  Thread.sleep(100L);
               } catch (Exception var13) {
                  ;
               }

               if(this.o.a > 3) {
                  return;
               }
            }
         }

         this.a(80, (String)"Unpacking media");
         this.aD = new Sprite("background");
         this.aE = new Sprite("mascot_inv");
         this.aF = new Sprite("mascot_chat");
         new Sprite(var4, "overlay_multiway", 0);
         this.gr = new IndexedImage(var4, "mapback", 0);

         for(var8 = 0; var8 <= 14; ++var8) {
            this.ct[var8] = new Sprite(var4, "sideicons", var8);
         }

         for(var8 = 0; var8 <= 17; ++var8) {
            this.j[var8] = new Sprite(var4, "staticons", var8);
         }

         for(var8 = 0; var8 <= 2; ++var8) {
            this.j[var8 + 18] = new Sprite(var4, "staticons2", var8);
         }

         this.fr = new Sprite(var4, "compass", 0);
         this.dl = new Sprite(var4, "mapedge", 0);
         this.dl.a();

         try {
            for(var8 = 0; var8 < 100; ++var8) {
               this.ee[var8] = new IndexedImage(var4, "mapscene", var8);
            }
         } catch (Exception var23) {
            ;
         }

         try {
            for(var8 = 0; var8 < 100; ++var8) {
               this.dI[var8] = new Sprite(var4, "mapfunction", var8);
            }
         } catch (Exception var22) {
            ;
         }

         try {
            for(var8 = 0; var8 < 20; ++var8) {
               this.db[var8] = new Sprite(var4, "hitmarks", var8);
            }
         } catch (Exception var21) {
            ;
         }

         try {
            for(var8 = 0; var8 < 6; ++var8) {
               this.eV[var8] = new Sprite(var4, "headicons_hint", var8);
            }
         } catch (Exception var20) {
            ;
         }

         try {
            for(var8 = 0; var8 < 8; ++var8) {
               this.eT[var8] = new Sprite(var4, "headicons_prayer", var8);
            }

            for(var8 = 0; var8 < 3; ++var8) {
               this.eU[var8] = new Sprite(var4, "headicons_pk", var8);
            }
         } catch (Exception var19) {
            ;
         }

         this.bq = new Sprite(var4, "mapmarker", 0);
         this.br = new Sprite(var4, "mapmarker", 1);

         for(var8 = 0; var8 < 8; ++var8) {
            this.fH[var8] = new Sprite(var4, "cross", var8);
         }

         this.eq = new Sprite(var4, "mapdots", 0);
         this.eS = new Sprite(var4, "Overlay_multiway", 0);
         this.er = new Sprite(var4, "mapdots", 1);
         this.es = new Sprite(var4, "mapdots", 2);
         this.et = new Sprite(var4, "mapdots", 3);
         this.eu = new Sprite(var4, "mapdots", 4);
         this.ev = Class4.a("clanchat", 7);
         this.dD = new Sprite(var4, "scrollbar", 0);
         this.dE = new Sprite(var4, "scrollbar", 1);

         for(var8 = 0; var8 < 2; ++var8) {
            this.gD[var8] = new IndexedImage(var4, "mod_icons", var8);
         }

         Sprite var37 = new Sprite(var4, "screenframe", 0);
         this.aG = new ProducingGraphicsBuffer(var37.b, var37.c, this.e());
         var37.c(0, 0);
         var37 = new Sprite(var4, "screenframe", 1);
         this.aH = new ProducingGraphicsBuffer(var37.b, var37.c, this.e());
         var37.c(0, 0);
         var37 = new Sprite(var4, "mapedge", 0);
         new ProducingGraphicsBuffer(var37.b, var37.c, this.e());
         var37.c(0, 0);
         var8 = (int)(Math.random() * 21.0D) - 10;
         int var9 = (int)(Math.random() * 21.0D) - 10;
         int var10 = (int)(Math.random() * 21.0D) - 10;
         int var11 = (int)(Math.random() * 41.0D) - 20;

         for(int var12 = 0; var12 < 100; ++var12) {
            if(this.dI[var12] != null) {
               this.dI[var12].b(var8 + var11, var9 + var11, var10 + var11);
            }

            if(this.ee[var12] != null) {
               this.ee[var12].a(var8 + var11, var9 + var11, var10 + var11);
            }
         }

         this.a(83, (String)"Unpacking textures");
         Rasterizer3D.a(var5);
         Rasterizer3D.a(0.8D);
         Rasterizer3D.f();
         this.a(86, (String)"Unpacking config");
         Animation.a(var28);
         ItemDefinition.a(var28);
         Floor.a(var28);
         ObjectDefinition.a(var28);
         ActorDefinition.a(var28);
         IdentityKit.a(var28);
         SpotAnimation.a(var28);
         Varp.a(var28);
         VarBits.a(var28);
         ObjectDefinition.u = cH;
         this.a(90, (String)"Unpacking sounds");
         byte[] var35 = var7.a("sounds.dat");
         Track.a(new Buffer(var35));
         this.a(95, (String)"Unpacking interfaces");
         RSFont[] var36 = new RSFont[]{this.hr, this.hs, this.ht, var26};
         Widget.a(var30, var36, var4);
         this.a(100, (String)"Preparing game engine");

         int var29;
         int var31;
         int var32;
         for(var29 = 0; var29 < 33; ++var29) {
            var25 = 999;
            var31 = 0;

            for(var32 = 0; var32 < 34; ++var32) {
               if(this.gr.a[var32 + var29 * this.gr.c] == 0) {
                  if(var25 == 999) {
                     var25 = var32;
                  }
               } else if(var25 != 999) {
                  var31 = var32;
                  break;
               }
            }

            this.cN[var29] = var25;
            this.ec[var29] = var31 - var25;
         }

         for(var29 = 1; var29 < 153; ++var29) {
            var25 = 999;
            var31 = 0;

            for(var32 = 24; var32 < 177; ++var32) {
               if(this.gr.a[var32 + var29 * this.gr.c] != 0 || var32 <= 34 && var29 <= 34) {
                  if(var25 != 999) {
                     var31 = var32;
                     break;
                  }
               } else if(var25 == 999) {
                  var25 = var32;
               }
            }

            this.dX[var29 - 1] = var25 - 24;
            this.gL[var29 - 1] = var31 - var25;
         }

         Rasterizer3D.a(765, 503);
         this.hO = Rasterizer3D.t;
         Rasterizer3D.a(516, 165);
         this.gc = Rasterizer3D.t;
         Rasterizer3D.a(250, 335);
         this.gd = Rasterizer3D.t;
         Rasterizer3D.a(512, 334);
         this.ge = Rasterizer3D.t;
         int[] var33 = new int[9];

         for(var25 = 0; var25 < 9; ++var25) {
            var31 = 128 + (var25 << 5) + 15;
            var32 = 600 + var31 * 3;
            var31 = Rasterizer3D.r[var31];
            var33[var25] = var32 * var31 >> 16;
         }

         SceneGraph.a(500, 800, 512, 334, var33);
         MessageCensor.a(var6);
         this.by = new MouseMonitor(this);
         this.a((Runnable)this.by, 10);
         RenderableObject.a = this;
         ItemDefinition.n = this;
         ActorDefinition.n = this;
      } catch (Exception var24) {
         var24.printStackTrace();
         SignLink.b("loaderror " + this.dV + " " + this.ew);
         this.cc = true;
      }
   }

   private void b(Buffer var1, int var2) {
      int var3;
      Player var4;
      int var5;
      int var6;
      for(; var1.c + 10 < var2 << 3 && (var3 = var1.i(11)) != 2047; var4.a(t.a[0] + var6, t.b[0] + var5, var3 == 1)) {
         if(this.bH[var3] == null) {
            this.bH[var3] = new Player();
            if(this.bM[var3] != null) {
               this.bH[var3].a(this.bM[var3]);
            }
         }

         this.bJ[this.bI++] = var3;
         (var4 = this.bH[var3]).I = x;
         if(var1.i(1) == 1) {
            this.bL[this.bK++] = var3;
         }

         var3 = var1.i(1);
         if((var5 = var1.i(5)) > 15) {
            var5 -= 32;
         }

         if((var6 = var1.i(5)) > 15) {
            var6 -= 32;
         }
      }

      var1.o();
   }

   private static String u(int var0) {
      return var0 < 999999999?String.valueOf(var0):"*";
   }

   public URL getCodeBase() {
      try {
         return new URL(hG + ":80");
      } catch (Exception var1) {
         return null;
      }
   }

   private void J() {
      for(int var1 = 0; var1 < this.aS; ++var1) {
         int var2 = this.aT[var1];
         Npc var3;
         if((var3 = this.aR[var2]) != null) {
            this.a((Actor)var3);
         }
      }

   }

   private void a(Actor var1) {
      if(var1.V < 128 || var1.W < 128 || var1.V >= 13184 || var1.W >= 13184) {
         var1.y = -1;
         var1.s = -1;
         var1.S = 0;
         var1.T = 0;
         var1.V = (var1.a[0] << 7) + (var1.L << 6);
         var1.W = (var1.b[0] << 7) + (var1.L << 6);
         var1.b();
      }

      if(var1 == t && (var1.V < 1536 || var1.W < 1536 || var1.V >= 11776 || var1.W >= 11776)) {
         var1.y = -1;
         var1.s = -1;
         var1.S = 0;
         var1.T = 0;
         var1.V = (var1.a[0] << 7) + (var1.L << 6);
         var1.W = (var1.b[0] << 7) + (var1.L << 6);
         var1.b();
      }

      int var3;
      int var4;
      int var5;
      int var6;
      Animation var9;
      if(var1.S > x) {
         var3 = var1.S - x;
         var4 = (var1.O << 7) + (var1.L << 6);
         var5 = (var1.Q << 7) + (var1.L << 6);
         var1.V += (var4 - var1.V) / var3;
         var1.W += (var5 - var1.W) / var3;
         var1.d = 0;
         if(var1.U == 0) {
            var1.i = 1024;
         }

         if(var1.U == 1) {
            var1.i = 1536;
         }

         if(var1.U == 2) {
            var1.i = 0;
         }

         if(var1.U == 3) {
            var1.i = 512;
         }
      } else {
         int var7;
         int var8;
         if(var1.T >= x) {
            if(var1.T == x || var1.y == -1 || var1.B != 0 || var1.A + 1 > Animation.a[var1.y].a(var1.z)) {
               var3 = var1.T - var1.S;
               var4 = x - var1.S;
               var5 = (var1.O << 7) + (var1.L << 6);
               var6 = (var1.Q << 7) + (var1.L << 6);
               var7 = (var1.P << 7) + (var1.L << 6);
               var8 = (var1.R << 7) + (var1.L << 6);
               var1.V = (var5 * (var3 - var4) + var7 * var4) / var3;
               var1.W = (var6 * (var3 - var4) + var8 * var4) / var3;
            }

            var1.d = 0;
            if(var1.U == 0) {
               var1.i = 1024;
            }

            if(var1.U == 1) {
               var1.i = 1536;
            }

            if(var1.U == 2) {
               var1.i = 0;
            }

            if(var1.U == 3) {
               var1.i = 512;
            }

            var1.X = var1.i;
         } else {
            var1.p = var1.j;
            if(var1.x == 0) {
               var1.d = 0;
            } else {
               label402: {
                  if(var1.y != -1 && var1.B == 0) {
                     var9 = Animation.a[var1.y];
                     if(var1.N > 0 && var9.l == 0) {
                        ++var1.d;
                        break label402;
                     }

                     if(var1.N <= 0 && var9.m == 0) {
                        ++var1.d;
                        break label402;
                     }
                  }

                  var3 = var1.V;
                  var4 = var1.W;
                  var5 = (var1.a[var1.x - 1] << 7) + (var1.L << 6);
                  var6 = (var1.b[var1.x - 1] << 7) + (var1.L << 6);
                  if(var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
                     if(var3 < var5) {
                        if(var4 < var6) {
                           var1.i = 1280;
                        } else if(var4 > var6) {
                           var1.i = 1792;
                        } else {
                           var1.i = 1536;
                        }
                     } else if(var3 > var5) {
                        if(var4 < var6) {
                           var1.i = 768;
                        } else if(var4 > var6) {
                           var1.i = 256;
                        } else {
                           var1.i = 512;
                        }
                     } else if(var4 < var6) {
                        var1.i = 1024;
                     } else {
                        var1.i = 0;
                     }

                     if((var7 = var1.i - var1.X & 2047) > 1024) {
                        var7 -= 2048;
                     }

                     var8 = var1.aa;
                     if(var7 >= -256 && var7 <= 256) {
                        var8 = var1.Z;
                     } else if(var7 >= 256 && var7 < 768) {
                        var8 = var1.ac;
                     } else if(var7 >= -768 && var7 <= -256) {
                        var8 = var1.ab;
                     }

                     if(var8 == -1) {
                        var8 = var1.Z;
                     }

                     var1.p = var8;
                     var7 = 4;
                     if(var1.X != var1.i && var1.c == -1 && var1.e != 0) {
                        var7 = 2;
                     }

                     if(var1.x > 2) {
                        var7 = 6;
                     }

                     if(var1.x > 3) {
                        var7 = 8;
                     }

                     if(var1.d > 0 && var1.x > 1) {
                        var7 = 8;
                        --var1.d;
                     }

                     if(var1.Y[var1.x - 1]) {
                        var7 <<= 1;
                     }

                     if(var7 >= 8 && var1.p == var1.Z && var1.f != -1) {
                        var1.p = var1.f;
                     }

                     if(var3 < var5) {
                        var1.V += var7;
                        if(var1.V > var5) {
                           var1.V = var5;
                        }
                     } else if(var3 > var5) {
                        var1.V -= var7;
                        if(var1.V < var5) {
                           var1.V = var5;
                        }
                     }

                     if(var4 < var6) {
                        var1.W += var7;
                        if(var1.W > var6) {
                           var1.W = var6;
                        }
                     } else if(var4 > var6) {
                        var1.W -= var7;
                        if(var1.W < var6) {
                           var1.W = var6;
                        }
                     }

                     if(var1.V == var5 && var1.W == var6) {
                        --var1.x;
                        if(var1.N > 0) {
                           --var1.N;
                        }
                     }
                  } else {
                     var1.V = var5;
                     var1.W = var6;
                  }
               }
            }
         }
      }

      if(var1.e != 0) {
         Npc var10;
         if(var1.c != -1 && var1.c < '\u8000' && (var10 = this.aR[var1.c]) != null) {
            var4 = var1.V - var10.V;
            var5 = var1.W - var10.W;
            if(var4 != 0 || var5 != 0) {
               var1.i = (int)(Math.atan2((double)var4, (double)var5) * 325.949D) & 2047;
            }
         }

         if(var1.c >= '\u8000') {
            if((var3 = var1.c - '\u8000') == this.bB) {
               var3 = 2047;
            }

            Player var11;
            if((var11 = this.bH[var3]) != null) {
               var5 = var1.V - var11.V;
               var6 = var1.W - var11.W;
               if(var5 != 0 || var6 != 0) {
                  var1.i = (int)(Math.atan2((double)var5, (double)var6) * 325.949D) & 2047;
               }
            }
         }

         if((var1.J != 0 || var1.K != 0) && (var1.x == 0 || var1.d > 0)) {
            var3 = var1.V - (var1.J - this.dJ - this.dJ << 6);
            var4 = var1.W - (var1.K - this.dK - this.dK << 6);
            if(var3 != 0 || var4 != 0) {
               var1.i = (int)(Math.atan2((double)var3, (double)var4) * 325.949D) & 2047;
            }

            var1.J = 0;
            var1.K = 0;
         }

         if((var3 = var1.i - var1.X & 2047) != 0) {
            if(var3 >= var1.e && var3 <= 2048 - var1.e) {
               if(var3 > 1024) {
                  var1.X -= var1.e;
               } else {
                  var1.X += var1.e;
               }
            } else {
               var1.X = var1.i;
            }

            var1.X &= 2047;
            if(var1.p == var1.j && var1.X != var1.i) {
               if(var1.k != -1) {
                  var1.p = var1.k;
               } else {
                  var1.p = var1.Z;
               }
            }
         }
      }

      Actor var2 = var1;
      var1.M = false;
      if(var1.p != -1) {
         var9 = Animation.a[var1.p];
         ++var1.r;
         if(var1.q < var9.b && var1.r > var9.a(var1.q)) {
            var1.r = 0;
            ++var1.q;
         }

         if(var1.q >= var9.b) {
            var1.r = 0;
            var1.q = 0;
         }
      }

      if(var1.s != -1 && x >= var1.v) {
         if(var1.t < 0) {
            var1.t = 0;
         }

         var9 = SpotAnimation.a[var1.s].b;
         ++var1.u;

         while(var2.t < var9.b && var2.u > var9.a(var2.t)) {
            var2.u -= var9.a(var2.t);
            ++var2.t;
         }

         if(var2.t >= var9.b && (var2.t < 0 || var2.t >= var9.b)) {
            var2.s = -1;
         }
      }

      if(var2.y != -1 && var2.B <= 1 && Animation.a[var2.y].l == 1 && var2.N > 0 && var2.S <= x && var2.T < x) {
         var2.B = 1;
      } else {
         if(var2.y != -1 && var2.B == 0) {
            var9 = Animation.a[var2.y];
            ++var2.A;

            while(var2.z < var9.b && var2.A > var9.a(var2.z)) {
               var2.A -= var9.a(var2.z);
               ++var2.z;
            }

            if(var2.z >= var9.b) {
               var2.z -= var9.e;
               ++var2.C;
               if(var2.C >= var9.k) {
                  var2.y = -1;
               }

               if(var2.z < 0 || var2.z >= var9.b) {
                  var2.y = -1;
               }
            }

            var2.M = var9.g;
         }

         if(var2.B > 0) {
            --var2.B;
         }

      }
   }

   private void K() {
      if(this.hI == -1 || this.dC != 2 && super.N == null) {
         if(this.hH != 0) {
            this.G();
         }

         if(this.he) {
            this.he = false;
            if(s == 0) {
               this.aH.a(0, super.M, 0);
               this.aG.a(4, super.M, 0);
            }

            D = true;
            fc = true;
            if(this.dC != 2) {
               if(s == 0) {
                  this.fS.a(4, super.M, 4);
                  this.fR.a(0, super.M, 516);
               } else {
                  this.fS.a(0, super.M, 0);
               }
            }
         }

         if(!this.bC) {
            this.H();
            this.T();
         } else {
            this.c(4, 4);
         }

         if(this.gl != -1) {
            this.f(this.cr, this.gl);
         }

         this.s();
         int var21;
         if(this.hv == -1) {
            this.ed.q = (short)(B - p - 114);
            if(s == 0) {
               if(super.S > 478 && super.S < 580 && super.T > 342) {
                  this.a(494, 110, super.S, super.T - 348, this.ed, 0, false, B);
               }
            } else if(super.S >= 460 && super.S <= 513 && super.T >= r - 158 && super.T <= r - 44) {
               this.a(480, 114, super.S - 16, super.T, this.ed, r - 158, false, B);
            }

            if((var21 = B - 114 - this.ed.q) < 0) {
               var21 = 0;
            }

            if(var21 > B - 114) {
               var21 = B - 114;
            }

            if(p != var21) {
               p = var21;
               D = true;
            }
         }

         int var2;
         if(this.hv == -1 && (this.gF == 3 || this.gF == 4)) {
            var21 = this.ad * 14 + 7;
            this.ed.q = this.ag;
            if(s == 0) {
               if(super.S > 478 && super.S < 580 && super.T > 342) {
                  this.a(494, 110, super.S, super.T - 348, this.ed, 0, false, var21);
               }
            } else if(super.S >= 460 && super.S <= 513 && super.T >= r - 158 && super.T <= r - 44) {
               this.a(480, 114, super.S - 16, super.T, this.ed, r - 158, false, var21);
            }

            var2 = this.ed.q;
            if(this.ed.q < 0) {
               var2 = 0;
            }

            if(var2 > var21 - 114) {
               var2 = var21 - 114;
            }

            if(this.ag != var2) {
               this.ag = var2;
               D = true;
            }
         }

         if(this.hv != -1 && this.f(this.cr, this.hv)) {
            D = true;
         }

         if(this.gV == 3) {
            D = true;
         }

         if(this.eC == 3) {
            D = true;
         }

         if(this.aZ != null) {
            D = true;
         }

         if(D) {
            this.n();
         }

         if(this.dC == 2) {
            Client var22 = this;
            ++this.hm;
            this.b(true);
            this.a(true);
            this.b(false);
            this.a(false);
            Client var23 = this;

            int var26;
            for(Projectile var3 = (Projectile)this.du.b(); var3 != null; var3 = (Projectile)var23.du.d()) {
               if(var3.i == var23.bY && x <= var3.b) {
                  if(x >= var3.a) {
                     Npc var4;
                     if(var3.g > 0 && (var4 = var23.aR[var3.g - 1]) != null && var4.V >= 0 && var4.V < 13312 && var4.W >= 0 && var4.W < 13312) {
                        var3.a(x, var4.W, var23.b(var3.i, var4.W, var4.V) - var3.c, var4.V);
                     }

                     if(var3.g < 0) {
                        Player var5;
                        if((var26 = -var3.g - 1) == var23.bB) {
                           var5 = t;
                        } else {
                           var5 = var23.bH[var26];
                        }

                        if(var5 != null && var5.V >= 0 && var5.V < 13312 && var5.W >= 0 && var5.W < 13312) {
                           var3.a(x, var5.W, var23.b(var3.i, var5.W, var5.V) - var3.c, var5.V);
                        }
                     }

                     var3.a(var23.cr);
                     var23.cs.a(var23.bY, var3.h, (int)var3.f, -1, (int)var3.e, 60, (int)var3.d, var3, false);
                  }
               } else {
                  var3.C();
               }
            }

            var23 = this;

            for(GameAnimableObject var24 = (GameAnimableObject)this.eb.b(); var24 != null; var24 = (GameAnimableObject)var23.eb.d()) {
               if(var24.a == var23.bY && !var24.f) {
                  if(x >= var24.e) {
                     var24.a(var23.cr);
                     if(var24.f) {
                        var24.C();
                     } else {
                        var23.cs.a(var24.a, 0, var24.d, -1, var24.c, 60, var24.b, var24, false);
                     }
                  }
               } else {
                  var24.C();
               }
            }

            int var6;
            int var7;
            int var9;
            int var10;
            int var11;
            int var12;
            int var13;
            int var15;
            int var10004;
            int var25;
            int var27;
            if(!this.fP) {
               var2 = this.gg;
               if(this.cY / 256 > var2) {
                  var2 = this.cY / 256;
               }

               if(this.bu[4] && this.gv[4] + 128 > var2) {
                  var2 = this.gv[4] + 128;
               }

               var6 = this.gh + this.bN & 2047;
               int var10001 = eH + var2 * (s == 0?this.eG:5);
               int var10003 = this.dv;
               var10004 = this.b(this.bY, t.W, t.V) - 50;
               var7 = this.dw;
               var9 = var10004;
               var27 = var10003;
               var25 = var10001;
               var10 = 2048 - var2 & 2047;
               var11 = 2048 - var6 & 2047;
               var12 = 0;
               var13 = 0;
               var25 = var25;
               int var14;
               int var16;
               if(var10 != 0) {
                  var14 = Model.D[var10];
                  var15 = Model.E[var10];
                  var16 = 0 * var15 - var25 * var14 >> 16;
                  var25 = 0 * var14 + var25 * var15 >> 16;
                  var13 = var16;
               }

               if(var11 != 0) {
                  var14 = Model.D[var11];
                  var15 = Model.E[var11];
                  var16 = var25 * var14 + 0 * var15 >> 16;
                  var25 = var25 * var15 - 0 * var14 >> 16;
                  var12 = var16;
               }

               this.bj = var27 - var12;
               this.bk = var9 - var13;
               this.bl = var7 - var25;
               this.bm = var2;
               this.bn = var6;
            }

            int var8;
            if(!this.fP) {
               var23 = this;
               int var10000;
               if(this.e) {
                  var10000 = this.bY;
               } else {
                  var25 = 3;
                  if(this.bm < 310) {
                     var26 = this.bj >> 7;
                     var27 = this.bl >> 7;
                     var9 = t.V >> 7;
                     var8 = t.W >> 7;
                     if((this.hg[this.bY][var26][var27] & 4) != 0) {
                        var25 = this.bY;
                     }

                     if(var9 > var26) {
                        var7 = var9 - var26;
                     } else {
                        var7 = var26 - var9;
                     }

                     if(var8 > var27) {
                        var10 = var8 - var27;
                     } else {
                        var10 = var27 - var8;
                     }

                     if(var7 > var10) {
                        var11 = (var10 << 16) / var7;
                        var12 = '\u8000';

                        while(var26 != var9) {
                           if(var26 < var9) {
                              ++var26;
                           } else if(var26 > var9) {
                              --var26;
                           }

                           if((var23.hg[var23.bY][var26][var27] & 4) != 0) {
                              var25 = var23.bY;
                           }

                           if((var12 += var11) >= 65536) {
                              var12 -= 65536;
                              if(var27 < var8) {
                                 ++var27;
                              } else if(var27 > var8) {
                                 --var27;
                              }

                              if((var23.hg[var23.bY][var26][var27] & 4) != 0) {
                                 var25 = var23.bY;
                              }
                           }
                        }
                     } else {
                        var11 = (var7 << 16) / var10;
                        var12 = '\u8000';

                        while(var27 != var8) {
                           if(var27 < var8) {
                              ++var27;
                           } else if(var27 > var8) {
                              --var27;
                           }

                           if((var23.hg[var23.bY][var26][var27] & 4) != 0) {
                              var25 = var23.bY;
                           }

                           if((var12 += var11) >= 65536) {
                              var12 -= 65536;
                              if(var26 < var9) {
                                 ++var26;
                              } else if(var26 > var9) {
                                 --var26;
                              }

                              if((var23.hg[var23.bY][var26][var27] & 4) != 0) {
                                 var25 = var23.bY;
                              }
                           }
                        }
                     }
                  }

                  if((var23.hg[var23.bY][t.V >> 7][t.W >> 7] & 4) != 0) {
                     var25 = var23.bY;
                  }

                  var10000 = var25;
               }

               var2 = var10000;
            } else {
               var2 = this.e?this.bY:(this.b(this.bY, this.bl, this.bj) - this.bk < 800 && (this.hg[this.bY][this.bj >> 7][this.bl >> 7] & 4) != 0?this.bY:3);
            }

            var6 = this.bj;
            int var17 = this.bk;
            int var18 = this.bl;
            int var19 = this.bm;
            int var20 = this.bn;

            for(var25 = 0; var25 < 5; ++var25) {
               if(var22.bu[var25]) {
                  var26 = (int)(Math.random() * (double)((var22.bt[var25] << 1) + 1) - (double)var22.bt[var25] + Math.sin((double)var22.dG[var25] * ((double)var22.cd[var25] / 100.0D)) * (double)var22.gv[var25]);
                  if(var25 == 0) {
                     var22.bj += var26;
                  }

                  if(var25 == 1) {
                     var22.bk += var26;
                  }

                  if(var25 == 2) {
                     var22.bl += var26;
                  }

                  if(var25 == 3) {
                     var22.bn = var22.bn + var26 & 2047;
                  }

                  if(var25 == 4) {
                     var22.bm += var26;
                     if(var22.bm < 128) {
                        var22.bm = 128;
                     }

                     if(var22.bm > 383) {
                        var22.bm = 383;
                     }
                  }
               }
            }

            var25 = Rasterizer3D.w;
            Model.y = true;
            Model.B = 0;
            Model.z = var22.S - 4;
            Model.A = var22.T - 4;
            Rasterizer2D.d();
            var22.cs.a(var22.bj, var22.bl, var22.bn, var22.bk, var2, var22.bm);
            var22.cs.c();
            var22.r();
            if(var22.bi == 2) {
               var22.d((var22.ci - var22.dJ << 7) + var22.cl, var22.ck << 1, (var22.cj - var22.dK << 7) + var22.cm);
               if(var22.cK >= 0 && x % 20 < 10) {
                  var22.eV[0].e(var22.cK - 12, var22.cL - 28);
               }
            }

            if(var22.w) {
               if(var22.ap > 0 && s != 0) {
                  Rasterizer2D.a(var22.aq, 0, q, r, var22.ap, 0);
               }

               if(var22.al && var22.am != -10) {
                  if(!var22.ak) {
                     if(var22.ao) {
                        var22.am += 5;
                        if(var22.am >= 255) {
                           var22.am = 255;
                           var22.ak = true;
                        }
                     } else {
                        var22.am -= 5;
                        if(var22.am <= 0) {
                           var22.am = 0;
                           var22.ak = true;
                        }
                     }
                  }

                  if(var22.am > 0) {
                     Rasterizer2D.a(var22.an, 0, q, r, var22.am, 0);
                  }
               }
            }

            IndexedImage var28;
            byte[] var29;
            byte[] var30;
            if(Rasterizer3D.v[17] >= var25) {
               var27 = (var28 = Rasterizer3D.u[17]).c * var28.d - 1;
               var9 = var28.c * var22.cr << 1;
               var29 = var28.a;
               var30 = var22.bS;

               for(var10 = 0; var10 <= var27; ++var10) {
                  var30[var10] = var29[var10 - var9 & var27];
               }

               var28.a = var30;
               var22.bS = var29;
               Rasterizer3D.b(17);
               if(++bh > 1235) {
                  bh = 0;
                  var22.go.a(226);
                  var22.go.b(0);
                  var10 = var22.go.b;
                  var22.go.c('\ue562');
                  var22.go.b(240);
                  var22.go.c((int)(Math.random() * 65536.0D));
                  var22.go.b((int)(Math.random() * 256.0D));
                  if((int)(Math.random() * 2.0D) == 0) {
                     var22.go.c('\uca71');
                  }

                  var22.go.b((int)(Math.random() * 256.0D));
                  var22.go.c((int)(Math.random() * 65536.0D));
                  var22.go.c(7130);
                  var22.go.c((int)(Math.random() * 65536.0D));
                  var22.go.c('\uf0d9');
                  var22.go.h(var22.go.b - var10);
               }
            }

            if(Rasterizer3D.v[24] >= var25) {
               var27 = (var28 = Rasterizer3D.u[24]).c * var28.d - 1;
               var9 = var28.c * var22.cr << 1;
               var29 = var28.a;
               var30 = var22.bS;

               for(var10 = 0; var10 <= var27; ++var10) {
                  var30[var10] = var29[var10 - var9 & var27];
               }

               var28.a = var30;
               var22.bS = var29;
               Rasterizer3D.b(24);
            }

            if(Rasterizer3D.v[34] >= var25) {
               var27 = (var28 = Rasterizer3D.u[34]).c * var28.d - 1;
               var9 = var28.c * var22.cr << 1;
               var29 = var28.a;
               var30 = var22.bS;

               for(var10 = 0; var10 <= var27; ++var10) {
                  var30[var10] = var29[var10 - var9 & var27];
               }

               var28.a = var30;
               var22.bS = var29;
               Rasterizer3D.b(34);
            }

            int[] var38 = Rasterizer3D.v;
            var27 = (var28 = Rasterizer3D.u[40]).c * var28.d - 1;
            var9 = var28.c * var22.cr << 1;
            var29 = var28.a;
            var30 = var22.bS;

            for(var10 = 0; var10 <= var27; ++var10) {
               var30[var10] = var29[var10 - var9 & var27];
            }

            var28.a = var30;
            var22.bS = var29;
            Rasterizer3D.b(40);
            if(var22.w) {
               if(s != 0) {
                  var22.n();
                  var22.s();
                  var22.U();
               }

               var23 = var22;
               if(eL) {
                  Client var35 = var22;
                  if(var22.gq != 0) {
                     RSFont var34 = var22.hs;
                     var12 = 0;
                     if(!var22.fe.isEmpty()) {
                        ++var12;
                     }

                     if(var22.fd != 0) {
                        ++var12;
                     }

                     for(var13 = 0; var13 < 100; ++var13) {
                        if(var35.cp[var13] != null) {
                           var25 = var35.cn[var13];
                           String var36 = var35.co[var13];
                           var15 = var35.az[var13];
                           byte var37 = 0;
                           if(var36 != null && var36.startsWith("@irn@")) {
                              var36 = var36.substring(5);
                              var37 = 4;
                           }

                           if((var25 == 3 || var25 == 7) && (var25 == 7 || var35.ba == 0 || var35.ba == 1 && var35.c(var36))) {
                              var26 = 329 - var12 * 13;
                              if(s != 0) {
                                 var26 = r - 170 - var12 * 13;
                              }

                              var34.b(0, "From", var26, 4);
                              var34.b('\uffff', "From", var26 - 1, 4);
                              var27 = 4 + var34.a("From ");
                              if(var15 > 0) {
                                 var27 += var35.a(var15, var27 + 1, var26 - 12);
                              }

                              if(var37 > 0) {
                                 var27 += var35.a(var37, var27 + 1, var26 - 12);
                              }

                              var34.b(0, var36 + ": " + var35.cp[var13], var26, var27);
                              var34.b('\uffff', var36 + ": " + var35.cp[var13], var26 - 1, var27);
                              ++var12;
                              if(var12 >= 5) {
                                 break;
                              }
                           }

                           if(var25 == 5 && var35.ba < 2) {
                              var26 = 329 - var12 * 13;
                              if(s != 0) {
                                 var26 = r - 170 - var12 * 13;
                              }

                              var34.b(0, var35.cp[var13], var26, 4);
                              var34.b('\uffff', var35.cp[var13], var26 - 1, 4);
                              ++var12;
                              if(var12 >= 5) {
                                 break;
                              }
                           }

                           if(var25 == 6 && var35.ba < 2) {
                              var26 = 329 - var12 * 13;
                              if(s != 0) {
                                 var26 = r - 170 - var12 * 13;
                              }

                              var34.b(0, "To " + var36 + ": " + var35.cp[var13], var26, 4);
                              var34.b('\uffff', "To " + var36 + ": " + var35.cp[var13], var26 - 1, 4);
                              ++var12;
                              if(var12 >= 5) {
                                 break;
                              }
                           }
                        }
                     }
                  }
               }

               if(var22.bX == 1) {
                  var22.fH[var22.bW / 100].e(var22.bU - 8 - (s == 0?4:0), var22.bV - 8 - (s == 0?4:0));
               }

               if(var22.bX == 2) {
                  var22.fH[4 + var22.bW / 100].e(var22.bU - 8 - (s == 0?4:0), var22.bV - 8 - (s == 0?4:0));
               }

               if(var22.ea == 1) {
                  var22.eS.e(s == 0?472:(var22.dz == 197?q - 268:q - 255), s == 0?296:(var22.dz == 197?48:20));
               }

               if(var22.dz != -1) {
                  label1209: {
                     var22.f(var22.cr, var22.dz);
                     int var10002;
                     Client var39;
                     byte var40;
                     Widget var41;
                     if((var22.dz == 11146 || var22.dz == 24126 || var22.dz == 24131) && s != 0) {
                        var39 = var22;
                        var40 = 0;
                        var10002 = 0;
                        var41 = Widget.e[var22.dz];
                        var10004 = -5;
                     } else if((var22.dz == 2804 || var22.dz == 11479) && s != 0) {
                        var39 = var22;
                        var40 = 0;
                        var10002 = q / 2 - 256;
                        var41 = Widget.e[var22.dz];
                        var10004 = -5;
                     } else if(var22.dz == 4535 && s != 0) {
                        var39 = var22;
                        var40 = 0;
                        var10002 = -418;
                        var41 = Widget.e[var22.dz];
                        var10004 = -285;
                     } else if((var22.dz == 15892 || var22.dz == 15917 || var22.dz == 15931 || var22.dz == 15962) && s != 0) {
                        var39 = var22;
                        var40 = 0;
                        var10002 = var22.dz == 15892?-325:-349;
                        var41 = Widget.e[var22.dz];
                        var10004 = 25;
                     } else {
                        if(var22.dz == 8677) {
                           var22.a(true, 0);
                           break label1209;
                        }

                        if(var22.dz == 15843) {
                           var22.a(false, 0);
                           break label1209;
                        }

                        if(var22.dz == 18433) {
                           var22.a(true, 8881798);
                           break label1209;
                        }

                        if(var22.dz == 18458) {
                           var22.a(false, 8881798);
                           break label1209;
                        }

                        if((var22.dz == 12418 || var22.dz == 12416 || var22.dz == 12414) && s != 0) {
                           if(var22.dz == 12416) {
                              var22.e(50, 0);
                           }

                           if(var22.dz == 12418) {
                              var22.e(100, 0);
                           }

                           if(var22.dz == 12414) {
                              var22.e(200, 0);
                           }
                           break label1209;
                        }

                        if(var22.dz == 18456 && s != 0) {
                           var22.e(75, 5082768);
                           break label1209;
                        }

                        var39 = var22;
                        var40 = 0;
                        var10002 = s == 0?0:q / 2 - -80;
                        var41 = Widget.e[var22.dz];
                        var10004 = s == 0?0:r / 2 - 550;
                     }

                     var39.a(var40, var10002, (Widget)var41, var10004);
                  }
               }

               if(i != -1) {
                  var22.f(var22.cr, i);
                  if(i == 8677) {
                     var22.a(true, 0);
                  } else if(i == 15843) {
                     var22.a(false, 0);
                  } else if(i == 18433) {
                     var22.a(true, 8881798);
                  } else if(i == 18458) {
                     var22.a(false, 8881798);
                  } else if((i == 12418 || i == 12416 || i == 12414) && s != 0) {
                     if(i == 12416) {
                        var22.e(50, 0);
                     }

                     if(i == 12418) {
                        var22.e(100, 0);
                     }

                     if(i == 12414) {
                        var22.e(200, 0);
                     }
                  } else if(i == 18456 && s != 0) {
                     var22.e(75, 5082768);
                  } else {
                     var22.a(0, s == 0?0:q / 2 - 356, (Widget)Widget.e[i], s == 0?0:r / 2 - 230);
                  }
               }

               var22.hb = 0;
               var11 = (t.V >> 7) + var22.dJ;
               var12 = (t.W >> 7) + var22.dK;
               if(var11 >= 3053 && var11 <= 3156 && var12 >= 3056 && var12 <= 3136) {
                  var22.hb = 1;
               }

               if(var11 >= 3072 && var11 <= 3118 && var12 >= 9492 && var12 <= 9535) {
                  var22.hb = 1;
               }

               if(var22.hb == 1 && var11 >= 3139 && var11 <= 3199 && var12 >= 3008 && var12 <= 3062) {
                  var22.hb = 0;
               }

               if(!var22.bC) {
                  var22.H();
                  var22.T();
               } else {
                  var22.c(s == 0?4:0, s == 0?4:0);
               }

               if(fM) {
                  var27 = 16776960;
                  if(var22.J < 15) {
                     var27 = 16711680;
                  }

                  var22.hs.a("Fps:" + var22.J, 507, var27, 20);
                  Runtime var32;
                  var8 = (int)(((var32 = Runtime.getRuntime()).totalMemory() - var32.freeMemory()) / 1024L);
                  var22.hs.a("Mem:" + var8 + "k", 507, 16776960, 35);
               }

               var25 = var22.dJ + (t.V - 6 >> 7);
               var26 = var22.dK + (t.W - 6 >> 7);
               if(cG) {
                  var27 = q - var22.S;
                  var9 = r - var22.T;
                  var22.hs.b(16776960, "Dimensions: " + q + " x " + r, s == 0?225:(eL?r - 277:r - 140), 5);
                  var22.hs.b(16776960, "Mouse Positions: clientWidth - " + var27 + ", clientHeight - " + var9, s == 0?240:(eL?r - 262:r - 125), 5);

                  int[] var31;
                  for(var8 = 0; var8 < var23.gO.length; ++var8) {
                     var31 = var23.gO;
                     var23.hs.b(16776960, "Floor Map Array: " + Arrays.toString(var31), s == 0?255:(eL?r - 247:r - 110), 5);
                  }

                  for(var8 = 0; var8 < var23.gP.length; ++var8) {
                     var31 = var23.gP;
                     var23.hs.b(16776960, "Object Map Array: " + Arrays.toString(var31), s == 0?270:(eL?r - 232:r - 95), 5);
                  }

                  var23.hs.b(16776960, "Fps: " + var23.J, s == 0?285:(eL?r - 217:r - 80), 5);
                  Runtime var33;
                  var7 = (int)(((var33 = Runtime.getRuntime()).totalMemory() - var33.freeMemory()) / 1024L);
                  var23.hs.b(16776960, "Mem: " + var7 + "k", s == 0?299:(eL?r - 202:r - 65), 5);
                  var23.hs.b(16776960, "Mouse X: " + var23.S + " , Mouse Y: " + var23.T, s == 0?314:(eL?r - 187:r - 50), 5);
                  var23.hs.b(16776960, "Coords: " + var25 + ", " + var26, s == 0?329:(eL?r - 172:r - 35), 5);
               }

               if(!var23.fe.isEmpty()) {
                  var23.hs.a(false, 4, 16776960, var23.fe, 329);
               }

               if(var23.fd != 0) {
                  var27 = var23.fe.isEmpty()?329:315;
                  var8 = (var9 = var23.fd / 50) / 60;
                  if((var9 %= 60) < 10) {
                     var23.hs.b(16776960, "System update in: " + var8 + ":0" + var9, var27, 4);
                  } else {
                     var23.hs.b(16776960, "System update in: " + var8 + ":" + var9, var27, 4);
                  }

                  if(++bd > 75) {
                     bd = 0;
                     var23.go.a(148);
                  }
               }

               var23.E.b();
            }

            if(var22.w) {
               var22.fS.a(s == 0?4:0, var22.M, s == 0?4:0);
            }

            var22.bj = var6;
            var22.bk = var17;
            var22.bl = var18;
            var22.bm = var19;
            var22.bn = var20;
         }

         if(this.dC == 2 && s == 0) {
            this.U();
            this.fR.a(0, super.M, 516);
         }

         if(this.dZ != -1) {
            fc = true;
         }

         if(fc) {
            if(this.dZ != -1 && this.dZ == C) {
               this.dZ = -1;
               this.go.a(120);
               this.go.b(C);
            }

            fc = false;
            this.fs.a();
            this.fS.a();
         }

         this.cr = 0;
      } else {
         if(this.dC == 2) {
            this.f(this.cr, this.hI);
            if(i != -1) {
               this.f(this.cr, i);
            }

            this.cr = 0;
            this.Z();
            super.N.a();
            Rasterizer3D.t = this.hO;
            Rasterizer2D.d();
            this.he = true;
            Widget var1;
            if(i != -1) {
               if((var1 = Widget.e[i]).m == 512 && var1.ab == 334 && var1.X == 0) {
                  var1.m = s == 0?765:q;
                  var1.ab = s == 0?503:r;
               }

               this.a(0, s == 0?0:q / 2 - 382, (Widget)var1, s == 0?8:r / 2 - 251);
            }

            if((var1 = Widget.e[this.hI]).m == 512 && var1.ab == 334 && var1.X == 0) {
               var1.m = s == 0?765:q;
               var1.ab = s == 0?503:r;
            }

            this.a(0, s == 0?0:q / 2 - 382, (Widget)var1, s == 0?8:r / 2 - 251);
         }

         ++this.hH;
         super.N.a(0, super.M, 0);
      }
   }

   private static void L() {
      try {
         if(i == 5292 && Widget.e['\uc365'].M.equals("1")) {
            int var0 = Integer.parseInt(Widget.e['\uc366'].M);
            int var1 = Integer.parseInt(Widget.e['\uc367'].M);

            int var2;
            for(var2 = 0; var2 <= var0; ++var2) {
               Widget.e[var2 + '\uc353'].b = Class4.a("bank", 14);
               Widget.e[var2 + '\uc353'].n = "Click here to select tab " + (var2 + 1);
            }

            for(var2 = var0 + 1; var2 <= 8; ++var2) {
               Widget.e[var2 + '\uc352'].b = new Sprite("");
               Widget.e[var2 + '\uc352'].n = "";
            }

            if(var0 != 8) {
               Widget.e[var0 + '\uc353'].b = Class4.a("bank", 15);
               Widget.e[var0 + '\uc353'].n = "Drag an item here to create vscape new tab";
            }

            if(var1 > 0) {
               Widget.e[var1 + '\uc352'].b = Class4.a("bank", 13);
               Widget.e['\uc352'].b = Class4.a("bank", 12);
            } else {
               Widget.e['\uc352'].b = Class4.a("bank", 11);
            }

            Widget.e['\uc365'].M = "0";
            return;
         }
      } catch (Exception var3) {
         ;
      }

   }

   private void a(int var1, int var2, Widget var3, int var4) {
      if(var3.B == 197 && s != 0) {
         var2 = q - 120;
         var4 = 170;
      }

      if(var3.X == 0 && var3.E != null) {
         if(!var3.aa || this.dF == var3.O || this.dU == var3.O || this.dO == var3.O) {
            int var5 = Rasterizer2D.m;
            int var6 = Rasterizer2D.k;
            int var7 = Rasterizer2D.n;
            int var8 = Rasterizer2D.l;
            Rasterizer2D.b(var4 + var3.ab, var2, var2 + var3.m, var4);
            int var9 = var3.E.length;

            for(int var10 = 0; var10 < var9; ++var10) {
               int var11 = var3.F[var10] + var2;
               int var12 = var3.ag[var10] + var4 - var1;
               Widget var13 = Widget.e[var3.E[var10]];
               var11 += var13.Y;
               var12 += var13.Z;
               int var14;
               int var16;
               int var17;
               int var19;
               String var28;
               int var30;
               if(var13.g > 0) {
                  Client var15 = this;
                  var16 = var13.g;
                  if(var13.g > 0 && var16 <= 100 || var16 >= 701 && var16 <= 800) {
                     if(var16 == 1 && this.bQ == 0) {
                        var13.M = "Loading friend list";
                        var13.j = 0;
                     } else if(var16 == 1 && this.bQ == 1) {
                        var13.M = "Connecting to friendserver";
                        var13.j = 0;
                     } else if(var16 == 2 && this.bQ != 2) {
                        var13.M = "Please wait...";
                        var13.j = 0;
                     } else {
                        var17 = this.bO;
                        if(this.bQ != 2) {
                           var17 = 0;
                        }

                        if(var16 > 700) {
                           var16 -= 601;
                        } else {
                           --var16;
                        }

                        if(var16 >= var17) {
                           var13.M = "";
                           var13.j = 0;
                        } else {
                           var13.M = this.ey[var16];
                           var13.j = 1;
                        }
                     }
                  } else if((var16 < 101 || var16 > 200) && (var16 < 801 || var16 > 900)) {
                     if(var16 == 203) {
                        var17 = this.bO;
                        if(this.bQ != 2) {
                           var17 = 0;
                        }

                        var13.W = var17 * 15 + 20;
                        if(var13.W <= var13.ab) {
                           var13.W = var13.ab + 1;
                        }
                     } else if(var16 >= 401 && var16 <= 500) {
                        var16 -= 401;
                        if(var16 == 0 && this.bQ == 0) {
                           var13.M = "Loading ignore list";
                           var13.j = 0;
                        } else if(var16 == 1 && this.bQ == 0) {
                           var13.M = "Please wait...";
                           var13.j = 0;
                        } else {
                           var17 = this.aI;
                           if(this.bQ == 0) {
                              var17 = 0;
                           }

                           if(var16 >= var17) {
                              var13.M = "";
                              var13.j = 0;
                           } else {
                              var13.M = StringUtils.c(StringUtils.a(this.cb[var16]));
                              var13.j = 1;
                           }
                        }
                     } else if(var16 == 503) {
                        var13.W = this.aI * 15 + 20;
                        if(var13.W <= var13.ab) {
                           var13.W = var13.ab + 1;
                        }
                     } else if(var16 == 327) {
                        var13.ae = 150;
                        var13.af = (int)(Math.sin((double)x / 40.0D) * 256.0D) & 2047;
                        if(this.dH) {
                           label1052: {
                              for(var17 = 0; var17 < 7; ++var17) {
                                 if((var30 = var15.ei[var17]) >= 0 && !IdentityKit.b[var30].a()) {
                                    break label1052;
                                 }
                              }

                              var15.dH = false;
                              Model[] var36 = new Model[7];
                              var30 = 0;

                              for(var19 = 0; var19 < 7; ++var19) {
                                 if((var16 = var15.ei[var19]) >= 0) {
                                    var36[var30++] = IdentityKit.b[var16].b();
                                 }
                              }

                              Model var31 = new Model(var30, var36);

                              for(var16 = 0; var16 < 5; ++var16) {
                                 if(var15.dd[var16] != 0) {
                                    var31.a(n[var16][0], n[var16][var15.dd[var16]]);
                                    if(var16 == 1) {
                                       var31.a(A[0], A[var15.dd[var16]]);
                                    }
                                 }
                              }

                              var31.d();
                              var31.c(Animation.a[t.j].c[0]);
                              var31.a(64, 850, -30, -50, -30, true);
                              var13.y = 5;
                              var13.z = 0;
                              Widget.a(false, var31);
                           }
                        }
                     } else if(var16 == 328) {
                        var19 = (int)(Math.sin((double)x / 40.0D) * 256.0D) & 2047;
                        var13.ae = 150;
                        var13.af = var19;
                        if(this.dH) {
                           Model var35 = t.d();

                           for(var14 = 0; var14 < 5; ++var14) {
                              if(var15.dd[var14] != 0) {
                                 var35.a(n[var14][0], n[var14][var15.dd[var14]]);
                                 if(var14 == 1) {
                                    var35.a(A[0], A[var15.dd[var14]]);
                                 }
                              }
                           }

                           var14 = t.j;
                           var35.d();
                           var35.c(Animation.a[var14].c[0]);
                           var13.y = 5;
                           var13.z = 0;
                           Widget.a(false, var35);
                        }
                     } else if(var16 == 324) {
                        if(this.cf == null) {
                           this.cf = var13.b;
                           this.cg = var13.V;
                        }

                        if(this.dT) {
                           var13.b = this.cg;
                        } else {
                           var13.b = this.cf;
                        }
                     } else if(var16 == 325) {
                        if(this.cf == null) {
                           this.cf = var13.b;
                           this.cg = var13.V;
                        }

                        if(this.dT) {
                           var13.b = this.cf;
                        } else {
                           var13.b = this.cg;
                        }
                     } else if(var16 == 600) {
                        var13.M = this.bA;
                        if(x % 20 < 10) {
                           var13.M = var13.M + "|";
                        } else {
                           var13.M = var13.M + " ";
                        }
                     } else {
                        label1057: {
                           if(var16 == 613) {
                              if(this.bo > 0) {
                                 if(this.fN) {
                                    var13.x = 16711680;
                                    var13.M = "Moderator option: Mute player for 48 hours: <ON>";
                                 } else {
                                    var13.x = 16777215;
                                    var13.M = "Moderator option: Mute player for 48 hours: <OFF>";
                                 }
                              } else {
                                 var13.M = "";
                              }
                           }

                           if(var16 == 650 || var16 == 655) {
                              if(this.gp != 0) {
                                 if(this.do_ == 0) {
                                    var28 = "earlier today";
                                 } else if(this.do_ == 1) {
                                    var28 = "yesterday";
                                 } else {
                                    var28 = this.do_ + " days ago";
                                 }

                                 var13.M = "You last logged in " + var28 + " from: " + SignLink.d;
                              } else {
                                 var13.M = "";
                              }
                           }

                           if(var16 == 651) {
                              if(this.fK == 0) {
                                 var13.M = "0 unread messages";
                                 var13.x = 16776960;
                              }

                              if(this.fK == 1) {
                                 var13.M = "1 unread message";
                                 var13.x = '\uff00';
                              }

                              if(this.fK > 1) {
                                 var13.M = this.fK + " unread messages";
                                 var13.x = '\uff00';
                              }
                           }

                           if(var16 == 652) {
                              if(this.fU == 201) {
                                 if(this.fp == 1) {
                                    var13.M = "@yel@This is vscape non-members world: @whi@Since you are vscape member we";
                                 } else {
                                    var13.M = "";
                                 }
                              } else if(this.fU == 200) {
                                 var13.M = "You have not yet set any password recovery questions.";
                              } else {
                                 if(this.fU == 0) {
                                    var28 = "Earlier today";
                                 } else if(this.fU == 1) {
                                    var28 = "Yesterday";
                                 } else {
                                    var28 = this.fU + " days ago";
                                 }

                                 var13.M = var28 + " you changed your recovery questions";
                              }
                           }

                           if(var16 == 653) {
                              if(this.fU == 201) {
                                 if(this.fp == 1) {
                                    var13.M = "@whi@recommend you use vscape members world instead. You may use";
                                 } else {
                                    var13.M = "";
                                 }
                              } else if(this.fU == 200) {
                                 var13.M = "We strongly recommend you do so now to secure your account.";
                              } else {
                                 var13.M = "If you do not remember making this change then cancel it immediately";
                              }
                           }

                           if(var16 == 654) {
                              if(this.fU == 201) {
                                 if(this.fp == 1) {
                                    var13.M = "@whi@this world but member benefits are unavailable whilst here.";
                                 } else {
                                    var13.M = "";
                                 }
                                 break label1057;
                              }

                              if(this.fU == 200) {
                                 var13.M = "Do this from the \'account management\' area on our front webpage";
                                 break label1057;
                              }

                              var13.M = "Do this from the \'account management\' area on our front webpage";
                           }

                           String var27;
                           if(var16 >= 10000 && var16 <= 10020) {
                              var16 -= 10000;
                              var27 = "";
                              int[] var33 = new int[]{0, 3, 14, 2, 16, 13, 1, 15, 10, 4, 17, 7, 5, 12, 11, 6, 9, 8, 20, 18, 19};
                              var27 = var27 + StringUtils.c(SkillConstants.a[var33[var16]]) + ": " + this.bZ[var33[var16]] + "/" + this.dQ[var33[var16]] + "\\n";
                              var27 = var27 + "Current XP: " + this.b.format((long)this.bp[var33[var16]]) + "\\n";
                              if(this.dQ[var33[var16]] < 99) {
                                 var27 = var27 + "Next level: " + this.b.format((long)t(this.dQ[var33[var16]] + 1)) + "\\n";
                                 var27 = var27 + "Remainder: " + this.b.format((long)(t(this.dQ[var33[var16]] + 1) - this.bp[var33[var16]]));
                              } else {
                                 if(this.bp[var33[var16]] < 200000000) {
                                    var27 = var27 + "Remainder: " + this.b.format((long)(200000000 - this.bp[var33[var16]])) + "\\n";
                                 } else {
                                    var27 = var27 + "Max EXP Reached\\n";
                                 }

                                 var27 = var27 + "Max Level Reached";
                              }

                              var13.M = var27;
                           } else if(var16 == 20000) {
                              var13.W = this.bP * 15 + 20;
                              if(var13.W <= var13.ab) {
                                 var13.W = var13.ab + 1;
                              }
                           } else if(var16 >= 20001 && var16 <= 20101) {
                              var17 = this.bP;
                              var16 -= 20001;
                              Widget var18 = Widget.e[var13.O - 101];
                              if(var16 >= var17) {
                                 var18.b = var18.V = null;
                                 var13.M = "";
                                 var13.m = 0;
                                 var13.j = 0;
                              } else {
                                 var19 = this.cD[var16];
                                 var27 = StringUtils.a(this.cC[var16]);
                                 switch(var19) {
                                 case 0:
                                    if(this.c(var27) && !var27.equalsIgnoreCase(t.ai)) {
                                       var18.b = var18.V = Class4.a("clanchat", 0);
                                    } else {
                                       var18.b = var18.V = null;
                                    }
                                    break;
                                 case 1:
                                    var18.b = var18.V = Class4.a("clanchat", 1);
                                    break;
                                 case 2:
                                    var18.b = var18.V = Class4.a("clanchat", 3);
                                    break;
                                 case 3:
                                    var18.b = var18.V = Class4.a("clanchat", 2);
                                 }

                                 var13.M = StringUtils.c(var27);
                                 var13.m = var13.H.a(var13.M);
                                 var13.j = 1;
                              }
                           }
                        }
                     }
                  } else {
                     var17 = this.bO;
                     if(this.bQ != 2) {
                        var17 = 0;
                     }

                     if(var16 > 800) {
                        var16 -= 701;
                     } else {
                        var16 -= 101;
                     }

                     if(var16 >= var17) {
                        var13.M = "";
                        var13.j = 0;
                     } else {
                        if(this.aL[var16] != 0 && this.aL[var16] == cF) {
                           var13.M = "@gre@Online";
                        } else {
                           var13.M = "@red@Offline";
                        }

                        var13.j = 1;
                     }
                  }
               }

               if(var13.X == 0) {
                  L();
                  if(var13.q > var13.W - var13.ab) {
                     var13.q = var13.W - var13.ab;
                  }

                  if(var13.q < 0) {
                     var13.q = 0;
                  }

                  this.a(var13.q, var11, var13, var12);
                  if(var13.W > var13.ab) {
                     this.a(var13.ab, var13.q, var12, var11 + var13.m, var13.W);
                  }
               } else if(var13.X != 1) {
                  int var20;
                  int var21;
                  int var23;
                  if(var13.X == 2) {
                     var23 = 0;

                     for(var14 = 0; var14 < var13.ab; ++var14) {
                        for(var16 = 0; var16 < var13.m; ++var16) {
                           var17 = var11 + var16 * (32 + var13.w);
                           var30 = var12 + var14 * (32 + var13.I);
                           if(var23 < 20) {
                              var17 += var13.h[var23];
                              var30 += var13.L[var23];
                           }

                           if(var13.Q[var23] <= 0) {
                              Sprite var46;
                              if(var13.d != null && var23 < 20 && (var46 = var13.d[var23]) != null) {
                                 var46.e(var17, var30);
                              }
                           } else {
                              var19 = 0;
                              var20 = 0;
                              var21 = var13.Q[var23] - 1;
                              if(var17 > Rasterizer2D.m - 32 && var17 < Rasterizer2D.n && var30 > Rasterizer2D.k - 32 && var30 < Rasterizer2D.l || this.eC != 0 && this.eB == var23) {
                                 int var41 = 0;
                                 if(this.hz == 1 && this.hA == var23 && this.hB == var13.O) {
                                    var41 = 16777215;
                                 }

                                 Sprite var44;
                                 if((var44 = ObjectDefinition.a(var21, var13.P[var23], var41)) != null) {
                                    if(this.eC != 0 && this.eB == var23 && this.eA == var13.O) {
                                       var19 = super.S - this.eD;
                                       var20 = super.T - this.eE;
                                       if(var19 < 5 && var19 > -5) {
                                          var19 = 0;
                                       }

                                       if(var20 < 5 && var20 > -5) {
                                          var20 = 0;
                                       }

                                       if(this.dc < 5) {
                                          var19 = 0;
                                          var20 = 0;
                                       }

                                       var44.d(var17 + var19, var30 + var20);
                                       if(var30 + var20 < Rasterizer2D.k && var3.q > 0) {
                                          if((var41 = this.cr * (Rasterizer2D.k - var30 - var20) / 3) > this.cr * 10) {
                                             var41 = this.cr * 10;
                                          }

                                          if(var41 > var3.q) {
                                             var41 = var3.q;
                                          }

                                          var3.q -= var41;
                                          this.eE += var41;
                                       }

                                       if(var30 + var20 + 32 > Rasterizer2D.l && var3.q < var3.W - var3.ab) {
                                          if((var41 = this.cr * (var30 + var20 + 32 - Rasterizer2D.l) / 3) > this.cr * 10) {
                                             var41 = this.cr * 10;
                                          }

                                          if(var41 > var3.W - var3.ab - var3.q) {
                                             var41 = var3.W - var3.ab - var3.q;
                                          }

                                          var3.q += var41;
                                          this.eE -= var41;
                                       }
                                    } else if(this.gV != 0 && this.gU == var23 && this.gT == var13.O) {
                                       var44.d(var17, var30);
                                    } else {
                                       var44.e(var17, var30);
                                    }

                                    if(var44.d == 33 || var13.P[var23] != 1) {
                                       var41 = var13.P[var23];
                                       this.hr.b(0, k(var41), var30 + 10 + var20, var17 + 1 + var19);
                                       this.hr.b(16776960, k(var41), var30 + 9 + var20, var17 + var19);
                                    }
                                 }
                              }
                           }

                           ++var23;
                        }
                     }
                  } else if(var13.X == 3) {
                     boolean var29 = false;
                     if(this.dO == var13.O || this.dU == var13.O || this.dF == var13.O) {
                        var29 = true;
                     }

                     if(this.b(var13)) {
                        var14 = var13.l;
                        if(var29 && var13.D != 0) {
                           var14 = var13.D;
                        }
                     } else {
                        var14 = var13.x;
                        if(var29 && var13.i != 0) {
                           var14 = var13.i;
                        }
                     }

                     if(var13.R == 0) {
                        if(var13.t) {
                           Rasterizer2D.a(var13.ab, var12, var11, var14, var13.m);
                        } else {
                           Rasterizer2D.b(var11, var13.m, var13.ab, var14, var12);
                        }
                     } else if(var13.t) {
                        Rasterizer2D.a(var14, var12, var13.m, var13.ab, 256 - (var13.R & 255), var11);
                     } else {
                        Rasterizer2D.b(var12, var13.ab, 256 - (var13.R & 255), var14, var13.m, var11);
                     }
                  } else {
                     RSFont var24;
                     if(var13.X == 4) {
                        var24 = var13.H;
                        String var26 = var13.M;
                        boolean var45 = false;
                        if(this.dO == var13.O || this.dU == var13.O || this.dF == var13.O) {
                           var45 = true;
                        }

                        if(this.b(var13)) {
                           var17 = var13.l;
                           if(var45 && var13.D != 0) {
                              var17 = var13.D;
                           }

                           if(var13.u.length() > 0) {
                              var26 = var13.u;
                           }
                        } else {
                           var17 = var13.x;
                           if(var45 && var13.i != 0) {
                              var17 = var13.i;
                           }
                        }

                        if(var13.j == 6 && this.fG) {
                           var26 = "Please wait...";
                           var17 = var13.x;
                        }

                        if((this.hv != -1 || this.dP != -1 || var13.M.contains("Click here to continue")) && (var3.O == this.hv || var3.O == this.dP)) {
                           if(var17 == 16776960) {
                              var17 = 255;
                           }

                           if(var17 == '\uc000') {
                              var17 = 16777215;
                           }
                        }

                        for(var30 = var12 + var24.a; var26.length() > 0; var30 += var24.a) {
                           if(var26.indexOf("%") != -1) {
                              while((var19 = var26.indexOf("%1")) != -1) {
                                 var26 = var26.substring(0, var19) + u(this.a((Widget)var13, 0)) + var26.substring(var19 + 2);
                              }

                              while((var19 = var26.indexOf("%2")) != -1) {
                                 var26 = var26.substring(0, var19) + u(this.a((Widget)var13, 1)) + var26.substring(var19 + 2);
                              }

                              while((var19 = var26.indexOf("%3")) != -1) {
                                 var26 = var26.substring(0, var19) + u(this.a((Widget)var13, 2)) + var26.substring(var19 + 2);
                              }

                              while((var19 = var26.indexOf("%4")) != -1) {
                                 var26 = var26.substring(0, var19) + u(this.a((Widget)var13, 3)) + var26.substring(var19 + 2);
                              }

                              while((var19 = var26.indexOf("%5")) != -1) {
                                 var26 = var26.substring(0, var19) + u(this.a((Widget)var13, 4)) + var26.substring(var19 + 2);
                              }
                           }

                           String var37;
                           if((var19 = var26.indexOf("\\n")) != -1) {
                              var37 = var26.substring(0, var19);
                              var26 = var26.substring(var19 + 2);
                           } else {
                              var37 = var26;
                              var26 = "";
                           }

                           if(var13.p) {
                              var24.a(var17, var11 + var13.m / 2, var37, var30, var13.ac);
                           } else {
                              var24.a(var13.ac, var11, var17, var37, var30);
                           }
                        }
                     } else if(var13.X == 5) {
                        Sprite var25;
                        if(this.b(var13)) {
                           var25 = var13.V;
                        } else {
                           var25 = var13.b;
                        }

                        if(var25 != null) {
                           if(this.fz == 1 && var13.O == eF && eF != 0) {
                              var25.c(var11, var12, 16777215);
                           } else {
                              var25.e(var11, var12);
                           }
                        }
                     } else if(var13.X == 6) {
                        var23 = Rasterizer3D.e;
                        var14 = Rasterizer3D.f;
                        Rasterizer3D.e = var11 + var13.m / 2;
                        Rasterizer3D.f = var12 + var13.ab / 2;
                        var16 = Rasterizer3D.r[var13.ae] * var13.ad >> 16;
                        var17 = Rasterizer3D.s[var13.ae] * var13.ad >> 16;
                        boolean var40;
                        if(var40 = this.b(var13)) {
                           var19 = var13.T;
                        } else {
                           var19 = var13.S;
                        }

                        Model var34;
                        if(var19 == -1) {
                           var34 = var13.a(-1, -1, var40);
                        } else {
                           Animation var42 = Animation.a[var19];
                           var34 = var13.a(var42.d[var13.K], var42.c[var13.K], var40);
                        }

                        if(var34 != null) {
                           var34.a(var13.af, 0, var13.ae, 0, var16, var17);
                        }

                        Rasterizer3D.e = var23;
                        Rasterizer3D.f = var14;
                     } else {
                        String var32;
                        if(var13.X == 7) {
                           var24 = var13.H;
                           var14 = 0;

                           for(var16 = 0; var16 < var13.ab; ++var16) {
                              for(var17 = 0; var17 < var13.m; ++var17) {
                                 if(var13.Q[var14] > 0) {
                                    ObjectDefinition var38;
                                    var32 = (var38 = ObjectDefinition.a(var13.Q[var14] - 1)).o;
                                    if(var38.r || var13.P[var14] != 1) {
                                       var32 = var32 + " x" + f(var13.P[var14]);
                                    }

                                    var20 = var11 + var17 * (115 + var13.w);
                                    var21 = var12 + var16 * (12 + var13.I);
                                    if(var13.p) {
                                       var24.a(var13.x, var20 + var13.m / 2, var32, var21, var13.ac);
                                    } else {
                                       var24.a(var13.ac, var20, var13.x, var32, var21);
                                    }
                                 }

                                 ++var14;
                              }
                           }
                        } else if(var13.X == 8 && (this.hM == var13.O || this.hJ == var13.O || this.hK == var13.O) && this.hN == 0 && !this.bC) {
                           var23 = 0;
                           var14 = 0;
                           RSFont var43 = this.hs;

                           for(var28 = var13.M; var28.length() > 0; var14 += var43.a + 1) {
                              if(var28.indexOf("%") != -1) {
                                 while((var30 = var28.indexOf("%1")) != -1) {
                                    var28 = var28.substring(0, var30) + u(this.a((Widget)var13, 0)) + var28.substring(var30 + 2);
                                 }

                                 while((var30 = var28.indexOf("%2")) != -1) {
                                    var28 = var28.substring(0, var30) + u(this.a((Widget)var13, 1)) + var28.substring(var30 + 2);
                                 }

                                 while((var30 = var28.indexOf("%3")) != -1) {
                                    var28 = var28.substring(0, var30) + u(this.a((Widget)var13, 2)) + var28.substring(var30 + 2);
                                 }

                                 while((var30 = var28.indexOf("%4")) != -1) {
                                    var28 = var28.substring(0, var30) + u(this.a((Widget)var13, 3)) + var28.substring(var30 + 2);
                                 }

                                 while((var30 = var28.indexOf("%5")) != -1) {
                                    var28 = var28.substring(0, var30) + u(this.a((Widget)var13, 4)) + var28.substring(var30 + 2);
                                 }
                              }

                              if((var30 = var28.indexOf("\\n")) != -1) {
                                 var32 = var28.substring(0, var30);
                                 var28 = var28.substring(var30 + 2);
                              } else {
                                 var32 = var28;
                                 var28 = "";
                              }

                              if((var20 = var43.a(var32)) > var23) {
                                 var23 = var20;
                              }
                           }

                           var23 += 6;
                           var14 += 7;
                           var17 = var11 + var13.m - 5 - var23;
                           var30 = var12 + var13.ab + 5;
                           if(var17 < var11 + 5) {
                              var17 = var11 + 5;
                           }

                           if(var17 + var23 > var2 + var3.m) {
                              var17 = var2 + var3.m - var23;
                           }

                           if(var30 + var14 > var4 + var3.ab) {
                              var30 = var4 + var3.ab - var14;
                           }

                           if(var13.ah) {
                              var19 = q >= this.eM?r - 37:r - 73;
                              if(var17 + var23 + var2 > (s == 0?280:q + var2)) {
                                 var17 = (s == 0?280:q + var2) - var23 - var2;
                              }

                              if(var30 + var14 + var4 > (s == 0?330:var19 + var4 - 10)) {
                                 var30 = (s == 0?330:var19 + var4 - 10) - var14 - var4;
                              }
                           }

                           Rasterizer2D.a(var14, var30, var17, 16777120, var23);
                           Rasterizer2D.b(var17, var23, var14, 0, var30);
                           var32 = var13.M;

                           for(var20 = var30 + var43.a + 2; var32.length() > 0; var20 += var43.a + 1) {
                              if(var32.indexOf("%") != -1) {
                                 while((var21 = var32.indexOf("%1")) != -1) {
                                    var32 = var32.substring(0, var21) + u(this.a((Widget)var13, 0)) + var32.substring(var21 + 2);
                                 }

                                 while((var21 = var32.indexOf("%2")) != -1) {
                                    var32 = var32.substring(0, var21) + u(this.a((Widget)var13, 1)) + var32.substring(var21 + 2);
                                 }

                                 while((var21 = var32.indexOf("%3")) != -1) {
                                    var32 = var32.substring(0, var21) + u(this.a((Widget)var13, 2)) + var32.substring(var21 + 2);
                                 }

                                 while((var21 = var32.indexOf("%4")) != -1) {
                                    var32 = var32.substring(0, var21) + u(this.a((Widget)var13, 3)) + var32.substring(var21 + 2);
                                 }

                                 while((var21 = var32.indexOf("%5")) != -1) {
                                    var32 = var32.substring(0, var21) + u(this.a((Widget)var13, 4)) + var32.substring(var21 + 2);
                                 }
                              }

                              String var22;
                              if((var21 = var32.indexOf("\\n")) != -1) {
                                 var22 = var32.substring(0, var21);
                                 var32 = var32.substring(var21 + 2);
                              } else {
                                 var22 = var32;
                                 var32 = "";
                              }

                              if(var13.p) {
                                 var43.a(var30, var17 + var13.m / 2, var22, var20, false);
                              } else if(var22.contains("\\r")) {
                                 String var39 = var22.substring(0, var22.indexOf("\\r"));
                                 var22 = var22.substring(var22.indexOf("\\r") + 2);
                                 var43.a(false, var17 + 3, 0, var39, var20);
                                 var11 = var23 + var17 - var43.a(var22) - 2;
                                 var43.a(false, var11, 0, var22, var20);
                                 System.out.println("Box: " + var23);
                              } else {
                                 var43.a(false, var17 + 3, 0, var22, var20);
                              }
                           }
                        }
                     }
                  }
               }
            }

            Rasterizer2D.b(var8, var5, var7, var6);
         }
      }
   }

   public final void a(int var1, int var2) {
      if((super.Z == 5 || super.aa && super.Z == 5) && this.w) {
         int var3 = Settings.f;
         if(Settings.f <= 0) {
            var3 = 1;
         }

         if(var3 > 10) {
            var3 = 10;
         }

         this.gi += var1 * var3;
         this.gj += var2 << 1;
      }
   }

   private void M() {
      try {
         int var1 = t.V + this.hw;
         int var2 = t.W + this.fw;
         if(this.dv - var1 < -500 || this.dv - var1 > 500 || this.dw - var2 < -500 || this.dw - var2 > 500) {
            this.dv = var1;
            this.dw = var2;
         }

         if(this.dv != var1) {
            this.dv += (var1 - this.dv) / 16;
         }

         if(this.dw != var2) {
            this.dw += (var2 - this.dw) / 16;
         }

         if(super.X[1] == 1) {
            this.gi += (-24 - this.gi) / 2;
         } else if(super.X[2] == 1) {
            this.gi += (24 - this.gi) / 2;
         } else {
            this.gi /= 2;
         }

         if(super.X[3] == 1) {
            this.gj += (12 - this.gj) / 2;
         } else if(super.X[4] == 1) {
            this.gj += (-12 - this.gj) / 2;
         } else {
            this.gj /= 2;
         }

         this.gh = this.gh + this.gi / 2 & 2047;
         this.gg += this.gj / 2;
         if(this.gg < 128) {
            this.gg = 128;
         }

         if(this.gg > 383) {
            this.gg = 383;
         }

         var1 = this.dv >> 7;
         var2 = this.dw >> 7;
         int var3 = this.b(this.bY, this.dw, this.dv);
         int var4 = 0;
         int var5;
         if(var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for(var5 = var1 - 4; var5 <= var1 + 4; ++var5) {
               for(int var6 = var2 - 4; var6 <= var2 + 4; ++var6) {
                  int var7 = this.bY;
                  if(this.bY < 3 && (this.hg[1][var5][var6] & 2) == 2) {
                     ++var7;
                  }

                  if((var7 = var3 - this.gA[var7][var5][var6]) > var4) {
                     var4 = var7;
                  }
               }
            }
         }

         if(++dn > 1512) {
            dn = 0;
            this.go.a(77);
            this.go.b(0);
            var5 = this.go.b;
            this.go.b((int)(Math.random() * 256.0D));
            this.go.b(101);
            this.go.b(233);
            this.go.c('\ub024');
            if((int)(Math.random() * 2.0D) == 0) {
               this.go.c('\u8bc8');
            }

            this.go.b((int)(Math.random() * 256.0D));
            this.go.b(64);
            this.go.b(38);
            this.go.c((int)(Math.random() * 65536.0D));
            this.go.c((int)(Math.random() * 65536.0D));
            this.go.h(this.go.b - var5);
         }

         if((var5 = var4 * 192) > 98048) {
            var5 = 98048;
         }

         if(var5 < '\u8000') {
            var5 = '\u8000';
         }

         if(var5 > this.cY) {
            this.cY += (var5 - this.cY) / 24;
         } else if(var5 < this.cY) {
            this.cY += (var5 - this.cY) / 80;
         }
      } catch (Exception var8) {
         SignLink.b("glfc_ex " + t.V + "," + t.W + "," + this.dv + "," + this.dw + "," + this.el + "," + this.em + "," + this.dJ + "," + this.dK);
         throw new RuntimeException("eek");
      }
   }

   public final void g() {
      if(this.cc) {
         Graphics var2;
         (var2 = this.e().getGraphics()).setColor(Color.black);
         var2.fillRect(0, 0, 765, 503);
         this.c(1);
         if(this.cc) {
            this.aN = false;
            var2.setFont(new Font("Helvetica", 1, 16));
            var2.setColor(Color.yellow);
            var2.drawString("Sorry, an error has occured whilst loading /v/scape", 30, 35);
            var2.setColor(Color.white);
            var2.drawString("To fix this try the following (in order):", 30, 85);
            var2.setColor(Color.white);
            var2.setFont(new Font("Helvetica", 1, 12));
            var2.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
            var2.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
            var2.drawString("3: Try using vscape different game-world", 30, 195);
            var2.drawString("4: Try rebooting your computer", 30, 225);
            var2.drawString("5: Try selecting vscape different version of Java from the play-game menu", 30, 255);
         }

      } else {
         if(!this.w) {
            this.W();
         } else {
            this.K();
         }

         this.gz = 0;
      }
   }

   private boolean c(String var1) {
      if(var1 == null) {
         return false;
      } else {
         for(int var2 = 0; var2 < this.bO; ++var2) {
            if(var1.equalsIgnoreCase(this.ey[var2])) {
               return true;
            }
         }

         return var1.equalsIgnoreCase(t.ai);
      }
   }

   private static String d(int var0, int var1) {
      return (var0 -= var1) < -9?"@red@":(var0 < -6?"@or3@":(var0 < -3?"@or2@":(var0 < 0?"@or1@":(var0 > 9?"@gre@":(var0 > 6?"@gr3@":(var0 > 3?"@gr2@":(var0 > 0?"@gr1@":"@yel@")))))));
   }

   private void a(boolean var1, int var2) {
      if(!this.ak && this.am == -10) {
         this.ao = var1;
         this.an = var2;
         this.al = true;
         if(this.ao) {
            this.am = 0;
            return;
         }

         this.am = 255;
      }

   }

   private void N() {
      this.al = false;
      this.ak = false;
      this.ao = false;
      this.am = -10;
   }

   private void e(int var1, int var2) {
      this.ap = var1;
      this.aq = var2;
   }

   public final long h() {
      long var1 = 0L;

      for(int var3 = 0; var3 < 25; ++var3) {
         var1 += (long)this.bp[var3];
      }

      return var1;
   }

   private void c(long var1) {
      if(var1 != 0L) {
         try {
            if(this.aI >= 100) {
               this.a("Your ignore list is full. Max of 100 hit", 0, "", true);
            } else {
               String var3 = StringUtils.c(StringUtils.a(var1));

               int var4;
               for(var4 = 0; var4 < this.aI; ++var4) {
                  if(this.cb[var4] == var1) {
                     this.a(var3 + " is already on your ignore list", 0, "", true);
                     return;
                  }
               }

               for(var4 = 0; var4 < this.bO; ++var4) {
                  if(this.cB[var4] == var1) {
                     this.a("Please remove " + var3 + " from your friend list first", 0, "", true);
                     return;
                  }
               }

               this.cb[this.aI++] = var1;
               this.go.a(133);
               this.go.a(var1);
            }
         } catch (RuntimeException var5) {
            SignLink.b("45688, " + var1 + ", 4" + ", " + var5.toString());
            throw new RuntimeException();
         }
      }
   }

   private void O() {
      for(int var1 = -1; var1 < this.bI; ++var1) {
         int var2;
         if(var1 == -1) {
            var2 = 2047;
         } else {
            var2 = this.bJ[var1];
         }

         Player var3;
         if((var3 = this.bH[var2]) != null) {
            this.a((Actor)var3);
         }
      }

   }

   private void P() {
      if(this.dC == 2) {
         for(Ground var1 = (Ground)this.gb.b(); var1 != null; var1 = (Ground)this.gb.d()) {
            if(var1.d > 0) {
               --var1.d;
            }

            if(var1.d == 0) {
               if(var1.i < 0 || MapRegion.a(var1.i, var1.k)) {
                  this.a(var1.h, var1.e, var1.j, var1.k, var1.g, var1.f, var1.i);
                  var1.C();
               }
            } else {
               if(var1.l > 0) {
                  --var1.l;
               }

               if(var1.l == 0 && var1.g > 0 && var1.h > 0 && var1.g <= 102 && var1.h <= 102 && (var1.a < 0 || MapRegion.a(var1.a, var1.c))) {
                  this.a(var1.h, var1.e, var1.b, var1.c, var1.g, var1.f, var1.a);
                  var1.l = -1;
                  if(var1.a == var1.i && var1.i == -1) {
                     var1.C();
                  } else if(var1.a == var1.i && var1.b == var1.j && var1.c == var1.k) {
                     var1.C();
                  }
               }
            }
         }
      }

   }

   private void Q() {
      int var1 = this.ht.a("Choose option");

      int var2;
      int var3;
      for(var2 = 0; var2 < this.fx; ++var2) {
         if((var3 = this.ht.a(this.gs[var2])) > var1) {
            var1 = var3;
         }
      }

      var1 += 8;
      var2 = 15 * this.fx + 21;
      int var4;
      if(super.V > 0 && super.W > 0 && super.V < 765 && super.W < 503) {
         if((var3 = super.V - var1 / 2) + var1 > 761) {
            var3 = 761 - var1;
         }

         if(var3 < 0) {
            var3 = 0;
         }

         var4 = super.W;
         if(super.W + var2 > 497) {
            var4 = 497 - var2;
         }

         if(var4 < 0) {
            var4 = 0;
         }

         this.bC = true;
         this.cv = var3;
         this.cw = var4;
         this.cx = var1;
         this.cy = 15 * this.fx + 22;
      }

      if(s != 0 && super.V > 0 && super.W > 0 && super.V < q && super.W < r) {
         if((var3 = super.V - var1 / 2) + var1 > q) {
            var3 = q - var1;
         }

         if(var3 < 0) {
            var3 = 0;
         }

         var4 = super.W;
         if(super.W + var2 > r) {
            var4 = r - var2;
         }

         if(var4 < 0) {
            var4 = 0;
         }

         this.bC = true;
         this.cu = 0;
         this.cv = var3;
         this.cw = var4;
         this.cx = var1;
         this.cy = 15 * this.fx + 22;
      }

   }

   private void R() {
      this.fh = new ProducingGraphicsBuffer(q, r, this.e());
      Rasterizer2D.d();
   }

   private void S() {
      this.aN = false;
      boolean var10000 = this.cJ;
      this.fJ = null;
      this.be = null;
      this.bf = null;
      this.bg = null;
      this.gm = null;
      this.gn = null;
      this.gt = null;
      this.gu = null;
   }

   private boolean f(int var1, int var2) {
      boolean var3 = false;
      Widget var7 = Widget.e[var2];

      for(int var4 = 0; var4 < var7.E.length && var7.E[var4] != -1; ++var4) {
         Widget var5;
         if((var5 = Widget.e[var7.E[var4]]).X == 1) {
            var3 |= this.f(var1, var5.O);
         }

         if(var5.X == 6 && (var5.S != -1 || var5.T != -1)) {
            int var6;
            if(this.b(var5)) {
               var6 = var5.T;
            } else {
               var6 = var5.S;
            }

            if(var6 != -1) {
               Animation var8 = Animation.a[var6];

               for(var5.c += var1; var5.c > var8.a(var5.K); var3 = true) {
                  var5.c -= var8.a(var5.K) + 1;
                  ++var5.K;
                  if(var5.K >= var8.b) {
                     var5.K -= var8.e;
                     if(var5.K < 0 || var5.K >= var8.b) {
                        var5.K = 0;
                     }
                  }
               }
            }
         }
      }

      return var3;
   }

   private void d(long var1) {
      if(var1 != 0L) {
         try {
            for(int var3 = 0; var3 < this.aI; ++var3) {
               if(this.cb[var3] == var1) {
                  --this.aI;
                  System.arraycopy(this.cb, var3 + 1, this.cb, var3, this.aI - var3);
                  this.go.a(74);
                  this.go.a(var1);
                  return;
               }
            }

         } catch (RuntimeException var4) {
            SignLink.b("47229, 3, " + var1 + ", " + var4.toString());
            throw new RuntimeException();
         }
      }
   }

   private void a(long var1, int var3) {
      if(var1 != 0L) {
         if(var3 >= 0) {
            try {
               this.go.a(61);
               this.go.a(var1);
               this.go.c(var3);
            } catch (RuntimeException var4) {
               SignLink.b("47229, 3, " + var1 + ", " + var4.toString());
               throw new RuntimeException();
            }
         }
      }
   }

   public String getParameter(String var1) {
      return super.getParameter(var1);
   }

   private int a(Widget var1, int var2) {
      if(var1.s != null && var2 < var1.s.length) {
         try {
            int[] var12 = var1.s[var2];
            var2 = 0;
            int var3 = 0;
            byte var4 = 0;

            while(true) {
               int var5 = var12[var3++];
               int var6 = 0;
               byte var7 = 0;
               if(var5 == 0) {
                  return var2;
               }

               if(var5 == 1) {
                  var6 = this.bZ[var12[var3++]];
               }

               if(var5 == 2) {
                  var6 = this.dQ[var12[var3++]];
               }

               if(var5 == 3) {
                  var6 = this.bp[var12[var3++]];
               }

               Widget var8;
               int var9;
               int var10;
               if(var5 == 4) {
                  var8 = Widget.e[var12[var3++]];
                  if((var9 = var12[var3++]) >= 0 && var9 < ObjectDefinition.E && (!ObjectDefinition.a(var9).h || cH)) {
                     for(var10 = 0; var10 < var8.Q.length; ++var10) {
                        if(var8.Q[var10] == var9 + 1) {
                           var6 += var8.P[var10];
                        }
                     }
                  }
               }

               if(var5 == 5) {
                  var6 = this.m[var12[var3++]];
               }

               if(var5 == 6) {
                  var6 = dA[this.dQ[var12[var3++]] - 1];
               }

               if(var5 == 7) {
                  var6 = this.m[var12[var3++]] * 100 / '\ub71b';
               }

               if(var5 == 8) {
                  var6 = t.ak;
               }

               int var13;
               if(var5 == 9) {
                  for(var13 = 0; var13 < 25; ++var13) {
                     if(SkillConstants.b[var13]) {
                        var6 += this.dQ[var13];
                     }
                  }
               }

               if(var5 == 10) {
                  var8 = Widget.e[var12[var3++]];
                  if((var9 = var12[var3++] + 1) >= 0 && var9 < ObjectDefinition.E && cH) {
                     for(var10 = 0; var10 < var8.Q.length; ++var10) {
                        if(var8.Q[var10] == var9) {
                           var6 = 999999999;
                           break;
                        }
                     }
                  }
               }

               if(var5 == 11) {
                  var6 = this.fF;
               }

               if(var5 == 12) {
                  var6 = this.bx;
               }

               if(var5 == 13) {
                  var13 = this.m[var12[var3++]];
                  var9 = var12[var3++];
                  var6 = (var13 & 1 << var9) == 0?0:1;
               }

               if(var5 == 14) {
                  var13 = var12[var3++];
                  VarBits var14;
                  var10 = (var14 = VarBits.a[var13]).b;
                  var6 = var14.c;
                  var13 = var14.d;
                  var13 = F[var13 - var6];
                  var6 = this.m[var10] >> var6 & var13;
               }

               if(var5 == 15) {
                  var7 = 1;
               }

               if(var5 == 16) {
                  var7 = 2;
               }

               if(var5 == 17) {
                  var7 = 3;
               }

               if(var5 == 18) {
                  var6 = (t.V >> 7) + this.dJ;
               }

               if(var5 == 19) {
                  var6 = (t.W >> 7) + this.dK;
               }

               if(var5 == 20) {
                  var6 = var12[var3++];
               }

               if(var7 == 0) {
                  if(var4 == 0) {
                     var2 += var6;
                  }

                  if(var4 == 1) {
                     var2 -= var6;
                  }

                  if(var4 == 2 && var6 != 0) {
                     var2 /= var6;
                  }

                  if(var4 == 3) {
                     var2 *= var6;
                  }

                  var4 = 0;
               } else {
                  var4 = var7;
               }
            }
         } catch (Exception var11) {
            return -1;
         }
      } else {
         return -2;
      }
   }

   private void T() {
      if(this.fx >= 2 || this.hz != 0 || this.fz != 0) {
         String var1;
         if(this.hz == 1 && this.fx < 2) {
            var1 = "Use " + this.hD + " with...";
         } else if(this.fz == 1 && this.fx < 2) {
            var1 = this.fC + "...";
         } else {
            var1 = this.gs[this.fx - 1];
         }

         if(this.fx > 2) {
            var1 = var1 + "@whi@ / " + (this.fx - 2) + " more options";
         }

         this.ht.a(4, 16777215, var1, x / 1000, 15);
      }
   }

   private void b(Sprite var1, int var2, int var3) {
      int var4 = this.gh + this.gx & 2047;
      if(var1.b + var1.c + var2 * var2 + var3 * var3 <= 4850 || s == 0) {
         int var5 = Model.D[var4];
         var4 = Model.E[var4];
         var5 = (var5 << 8) / (this.fW + 256);
         var4 = (var4 << 8) / (this.fW + 256);
         int var6 = var3 * var5 + var2 * var4 >> 16;
         var2 = var3 * var4 - var2 * var5 >> 16;
         var1.e((s == 0?124:q + 129 - 5 - 238) + var6 - var1.d / 2 + 4, (s == 0?88:91) - var2 - var1.e / 2 - 4);
      }
   }

   private void U() {
      if(s == 0) {
         this.fR.a();
      }

      int var1;
      int var2;
      if(s != 0) {
         for(var1 = 0; var1 < 76; ++var1) {
            var2 = (int)Math.sqrt(Math.pow(77.0D, 2.0D) - Math.pow((double)(75 - var1), 2.0D));
            this.gL[var1] = 2 * var2 + 2;
            this.gL[150 - var1] = 2 * var2 + 2;
            this.dX[var1] = -var2 + 73;
            this.dX[150 - var1] = -var2 + 73;
         }
      }

      if(s == 0) {
         for(var1 = 0; var1 < 152; ++var1) {
            this.gL[var1] = 170;
            this.dX[var1] = -23;
         }
      }

      if(this.dB == 2) {
         if(s == 0) {
            Class4.a("map", 2).e(0, 0);
         }

         if(s != 0) {
            Class4.a("map", 4).e(q - 238, 3);
         }

         this.fr.a(33, this.gh, this.ec, 256, this.cN, 25, s == 0?4:7, s == 0?29:q + 34 - 5 - 238, 33, 25);
         this.V();
         this.fS.a();
      } else {
         var1 = this.gh + this.gx & 2047;
         var2 = 48 + t.V / 32;
         int var3 = 464 - t.W / 32;
         this.hk.a(151, var1, this.gL, 256 + this.fW, this.dX, var3, s == 0?9:12, s == 0?54:q + 59 - 5 - 238, 146, var2);

         for(var1 = 0; var1 < this.en; ++var1) {
            var2 = (this.eo[var1] << 2) + 2 - t.V / 32;
            var3 = (this.ep[var1] << 2) + 2 - t.W / 32;
            this.b(this.fD[var1], var2, var3);
         }

         int var4;
         int var5;
         for(var1 = 0; var1 < 104; ++var1) {
            for(var2 = 0; var2 < 104; ++var2) {
               if(this.aM[this.bY][var1][var2] != null) {
                  var4 = (var1 << 2) + 2 - t.V / 32;
                  var5 = (var2 << 2) + 2 - t.W / 32;
                  this.b(this.eq, var4, var5);
               }
            }
         }

         for(var1 = 0; var1 < this.aS; ++var1) {
            Npc var12;
            if((var12 = this.aR[this.aT[var1]]) != null && var12.c()) {
               ActorDefinition var13 = var12.ad;
               if(var12.ad.r != null) {
                  var13 = var13.b();
               }

               if(var13 != null && var13.q && var13.p) {
                  var4 = var12.V / 32 - t.V / 32;
                  var5 = var12.W / 32 - t.W / 32;
                  this.b(this.er, var4, var5);
               }
            }
         }

         for(var1 = 0; var1 < this.bI; ++var1) {
            Player var14;
            if((var14 = this.bH[this.bJ[var1]]) != null && var14.ar) {
               var3 = var14.V / 32 - t.V / 32;
               var4 = var14.W / 32 - t.W / 32;
               boolean var16 = false;
               boolean var6 = false;

               for(int var7 = 0; var7 < this.bP; ++var7) {
                  if(this.cC[var7] > 0L && StringUtils.a(this.cC[var7]).equalsIgnoreCase(var14.ai)) {
                     var6 = true;
                     break;
                  }
               }

               long var9 = StringUtils.a(var14.ai);

               for(int var11 = 0; var11 < this.bO; ++var11) {
                  if(var9 == this.cB[var11] && this.aL[var11] != 0) {
                     var16 = true;
                     break;
                  }
               }

               boolean var18 = false;
               if(t.ah != 0 && var14.ah != 0 && t.ah == var14.ah) {
                  var18 = true;
               }

               if(var16) {
                  this.b(this.et, var3, var4);
               } else if(var6) {
                  this.b(this.ev, var3, var4);
               } else if(var18) {
                  this.b(this.eu, var3, var4);
               } else {
                  this.b(this.es, var3, var4);
               }
            }
         }

         if(this.bi != 0 && x % 20 < 10) {
            Npc var15;
            if(this.bi == 1 && this.gE >= 0 && this.gE < this.aR.length && (var15 = this.aR[this.gE]) != null) {
               var2 = var15.V / 32 - t.V / 32;
               var3 = var15.W / 32 - t.W / 32;
               this.a(this.br, var3, var2);
            }

            if(this.bi == 2) {
               var1 = (this.ci - this.dJ << 2) + 2 - t.V / 32;
               var2 = (this.cj - this.dK << 2) + 2 - t.W / 32;
               this.a(this.br, var2, var1);
            }

            Player var17;
            if(this.bi == 10 && this.ch >= 0 && this.ch < this.bH.length && (var17 = this.bH[this.ch]) != null) {
               var2 = var17.V / 32 - t.V / 32;
               var3 = var17.W / 32 - t.W / 32;
               this.a(this.br, var3, var2);
            }
         }

         if(this.hi != 0) {
            var1 = (this.hi << 2) + 2 - t.V / 32;
            var2 = (this.hj << 2) + 2 - t.W / 32;
            this.b(this.bq, var1, var2);
         }

         if(s != 0) {
            Class4.a("map", 3).e(q - 238, 3);
            this.fr.a(33, this.gh, this.ec, 256, this.cN, 25, s == 0?4:7, s == 0?29:q + 34 - 5 - 238, 33, 25);
         }

         Rasterizer2D.a(3, (s == 0?9:12) + 74, s == 0?125:q + 130 - 5 - 238, 16777215, 3);
         if(s == 0) {
            Class4.a("map", 0).e(0, 0);
            Class4.a("map", 1).a(33, this.gh, this.ec, 256, this.cN, 25, 4, 29, 33, 25);
         }

         this.V();
         if(this.bC && s == 0) {
            this.c(516, 0);
         }

         this.fS.a();
      }
   }

   private void a(Actor var1, int var2) {
      this.d(var1.V, var2, var1.W);
   }

   private void d(int var1, int var2, int var3) {
      if(var1 >= 128 && var3 >= 128 && var1 <= 13056 && var3 <= 13056) {
         var2 = this.b(this.bY, var3, var1) - var2;
         var1 -= this.bj;
         var2 -= this.bk;
         var3 -= this.bl;
         int var4 = Model.D[this.bm];
         int var5 = Model.E[this.bm];
         int var6 = Model.D[this.bn];
         int var7 = Model.E[this.bn];
         int var8 = var3 * var6 + var1 * var7 >> 16;
         var3 = var3 * var7 - var1 * var6 >> 16;
         var1 = var8;
         var8 = var2 * var5 - var3 * var4 >> 16;
         var3 = var2 * var4 + var3 * var5 >> 16;
         if(var3 >= 50) {
            this.cK = Rasterizer3D.e + (var1 << d) / var3;
            this.cL = Rasterizer3D.f + (var8 << d) / var3;
         } else {
            this.cK = -1;
            this.cL = -1;
         }
      } else {
         this.cK = -1;
         this.cL = -1;
      }
   }

   private void V() {
      Client var1 = this;

      int var2;
      int var5;
      int var8;
      try {
         double var3 = (double)(var2 = (int)((double)var1.fF / 100.0D * 100.0D)) / 100.0D;
         var5 = s == 0?190:q - 250;
         int var6 = s == 0?80:110;
         Class4.a("orbs", s == 0?5:4).e(var5, var6);
         Class4.a("orbs", var1.at?9:8).e(var5 + (s == 0?3:27), var6 + 3);
         Sprite var7 = Class4.a("orbs", 7);
         var8 = 27 - (int)(var3 * 27.0D);
         var7.c = var8;
         Sprite.j = var8;
         var7.e(var5 + (s == 0?3:27), var6 + 3);
         var1.hr.a(v(var2), var5 + (s == 0?41:14), String.valueOf(var2), var6 + 26, true);
         Class4.a("orbs", var1.at?11:10).e(var5 + (s == 0?9:32), var6 + 7);
      } catch (Exception var15) {
         ;
      }

      var1 = this;

      int var16;
      int var9;
      double var10;
      Sprite var12;
      try {
         var2 = var1.bZ[5];
         var8 = var1.dQ[5];
         var10 = (double)(var9 = (int)((double)var2 / (double)var8 * 100.0D)) / 100.0D;
         var16 = s == 0?190:q - 260;
         var8 = s == 0?45:75;
         Class4.a("orbs", s == 0?5:4).e(var16, var8);
         Class4.a("orbs", 1).e(var16 + (s == 0?3:27), var8 + 3);
         var12 = Class4.a("orbs", 7);
         var5 = 27 - (int)(var10 * 27.0D);
         var12.c = var5;
         Sprite.j = var5;
         var12.e(var16 + (s == 0?3:27), var8 + 3);
         var1.hr.a(v(var9), var16 + (s == 0?41:14), String.valueOf(var2), var8 + 26, true);
         Class4.a("orbs", 3).e(var16 + (s == 0?7:30), var8 + 7);
      } catch (Exception var14) {
         ;
      }

      var1 = this;

      try {
         var2 = var1.bZ[3];
         var8 = var1.dQ[3];
         var10 = (double)(var9 = (int)((double)var2 / (double)var8 * 100.0D)) / 100.0D;
         var16 = s == 0?180:q - 250;
         var8 = s == 0?10:40;
         Class4.a("orbs", s == 0?5:4).e(var16, var8);
         Class4.a("orbs", 0).e(var16 + (s == 0?3:27), var8 + 3);
         var12 = Class4.a("orbs", 7);
         var5 = 27 - (int)(var10 * 27.0D);
         var12.c = var5;
         Sprite.j = var5;
         var12.e(var16 + (s == 0?3:27), var8 + 3);
         var1.hr.a(v(var9), var16 + (s == 0?41:14), String.valueOf(var2), var8 + 26, true);
         Class4.a("orbs", 2).e(var16 + (s == 0?10:33), var8 + 10);
      } catch (Exception var13) {
         ;
      }
   }

   private static int v(int var0) {
      return var0 >= 75?'\uff00':(var0 >= 50 && var0 <= 74?16776960:(var0 >= 25 && var0 <= 49?16750623:16711680));
   }

   private void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      Ground var10 = null;

      for(Ground var11 = (Ground)this.gb.b(); var11 != null; var11 = (Ground)this.gb.d()) {
         if(var11.e == var7 && var11.g == var8 && var11.h == var5 && var11.f == var4) {
            var10 = var11;
            break;
         }
      }

      if(var10 == null) {
         (var10 = new Ground()).e = var7;
         var10.f = var4;
         var10.g = var8;
         var10.h = var5;
         this.a(var10);
         this.gb.a(var10);
      }

      var10.a = var2;
      var10.c = var6;
      var10.b = var3;
      var10.l = var9;
      var10.d = var1;
   }

   private boolean b(Widget var1) {
      if(var1.J == null) {
         return false;
      } else {
         for(int var2 = 0; var2 < var1.J.length; ++var2) {
            int var3 = this.a(var1, var2);
            int var4 = var1.f[var2];
            if(var1.J[var2] == 2) {
               if(var3 >= var4) {
                  return false;
               }
            } else if(var1.J[var2] == 3) {
               if(var3 <= var4) {
                  return false;
               }
            } else if(var1.J[var2] == 4) {
               if(var3 == var4) {
                  return false;
               }
            } else if(var3 != var4) {
               return false;
            }
         }

         return true;
      }
   }

   private DataInputStream d(String var1) throws IOException {
      if(this.aO != null) {
         try {
            this.aO.close();
         } catch (Exception var4) {
            ;
         }

         this.aO = null;
      }

      this.aO = a('\uaa4b');
      this.aO.setSoTimeout(10000);
      InputStream var2 = this.aO.getInputStream();
      this.aO.getOutputStream().write(("JAGGRAB /" + var1 + "\n\n").getBytes());
      return new DataInputStream(var2);
   }

   private void W() {
      this.R();
      if(this.aD != null) {
         this.aD.a(q / 2 - this.aD.b / 2, r / 2 - this.aD.c / 2);
      }

      if(v) {
         Class4.a("login", 6).e(q - 52, 10);
      } else {
         Class4.a("login", 7).e(q - 52, 10);
      }

      Class4.a("login", 0).a(this.ar - 145, this.as - 135);
      if(this.a(this.ar - 110, this.as - 64, this.ar + 115, this.as - 38)) {
         Class4.a("login", 1).e(this.ar - 110, this.as - 64);
      }

      if(this.a(this.ar - 110, this.as - 19, this.ar + 115, this.as + 8)) {
         Class4.a("login", 1).e(this.ar - 110, this.as - 17);
      }

      if(this.a(this.ar - 90, this.as + 38, this.ar + 99, this.as + 64)) {
         Class4.a("login", 2).e(this.ar - 90, this.as + 39);
      }

      RSFont var1 = this.hs;
      this.ht.a(true, this.ar - 105, 15970623, y + (this.gC == 0 & x % 40 < 20?"|":""), this.as - 43);
      this.ht.a(true, this.ar - 105, 15970623, StringUtils.d(z) + (this.gC == 1 & x % 40 < 20?"|":""), this.as + 5);
      this.ht.a(true, this.ar - var1.a(this.hn) / 2 - (this.hn.length() > 25?16:(this.hn.length() > 20?14:(this.hn.length() > 15?12:10))), 15970623, this.hn, this.as + 90);
      this.ht.a(true, this.ar - var1.a(this.ho) / 2 - (this.ho.length() > 25?16:(this.ho.length() > 20?14:(this.ho.length() > 15?12:10))), 15970623, this.ho, this.as + 113);
      if(c) {
         Class4.a("login", 4).e(this.ar - 108, this.as + 12);
      } else {
         Class4.a("login", 3).e(this.ar - 108, this.as + 12);
         if(this.a(this.ar - 108, this.as + 12, this.ar - 80, this.as + 24)) {
            Class4.a("login", 5).e(this.ar - 108, this.as + 12);
         }
      }

      this.ht.a(true, this.ar - 92, 15970623, "Remember Me", this.as + 24);
      if(this.au) {
         this.ht.a(true, this.ar - 90, 16711680, "New Client Version available", this.as - 90);
      }

      this.fh.a(0, super.M, 0);
   }

   public final void i() {
      this.he = true;
   }

   private void c(Buffer var1, int var2) {
      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      if(var2 == 84) {
         var3 = var1.e();
         var4 = this.hp + (var3 >> 4 & 7);
         var5 = this.hq + (var3 & 7);
         var6 = var1.g();
         var7 = var1.g();
         var8 = var1.g();
         LinkedList var31;
         if(var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && (var31 = this.aM[this.bY][var4][var5]) != null) {
            for(Item var24 = (Item)var31.b(); var24 != null; var24 = (Item)var31.d()) {
               if(var24.a == (var6 & 32767) && var24.b == var7) {
                  var24.b = var8;
                  break;
               }
            }

            this.b(var4, var5);
         }

      } else {
         int var9;
         if(var2 == 105) {
            var3 = var1.e();
            var4 = this.hp + (var3 >> 4 & 7);
            var5 = this.hq + (var3 & 7);
            var6 = var1.g();
            var8 = (var7 = var1.e()) >> 4 & 15;
            var9 = var7 & 7;
            if(t.a[0] >= var4 - var8 && t.a[0] <= var4 + var8 && t.b[0] >= var5 - var8 && t.b[0] <= var5 + var8 && this.bc && this.ef < 50) {
               this.gw[this.ef] = var6;
               this.gQ[this.ef] = var9;
               this.gZ[this.ef] = Track.a[var6];
               ++this.ef;
            }
         }

         if(var2 == 215) {
            var3 = var1.w();
            var4 = var1.t();
            var5 = this.hp + (var4 >> 4 & 7);
            var6 = this.hq + (var4 & 7);
            var7 = var1.w();
            var8 = var1.g();
            if(var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104 && var7 != this.bB) {
               Item var30;
               (var30 = new Item()).a = var3;
               var30.b = var8;
               if(this.aM[this.bY][var5][var6] == null) {
                  this.aM[this.bY][var5][var6] = new LinkedList();
               }

               this.aM[this.bY][var5][var6].a(var30);
               this.b(var5, var6);
            }

         } else {
            Item var26;
            if(var2 == 156) {
               var3 = var1.r();
               var4 = this.hp + (var3 >> 4 & 7);
               var5 = this.hq + (var3 & 7);
               var6 = var1.g();
               LinkedList var28;
               if(var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && (var28 = this.aM[this.bY][var4][var5]) != null) {
                  for(var26 = (Item)var28.b(); var26 != null; var26 = (Item)var28.d()) {
                     if(var26.a == (var6 & 32767)) {
                        var26.C();
                        break;
                     }
                  }

                  if(var28.b() == null) {
                     this.aM[this.bY][var4][var5] = null;
                  }

                  this.b(var4, var5);
               }

            } else {
               int var10;
               int var11;
               int var12;
               int var13;
               int var15;
               if(var2 == 160) {
                  var3 = var1.t();
                  var4 = this.hp + (var3 >> 4 & 7);
                  var5 = this.hq + (var3 & 7);
                  var7 = (var6 = var1.t()) >> 2;
                  var8 = var6 & 3;
                  var9 = this.fZ[var7];
                  var3 = var1.w();
                  if(var4 >= 0 && var5 >= 0 && var4 < 103 && var5 < 103) {
                     var10 = this.gA[this.bY][var4][var5];
                     var11 = this.gA[this.bY][var4 + 1][var5];
                     var12 = this.gA[this.bY][var4 + 1][var5 + 1];
                     var13 = this.gA[this.bY][var4][var5 + 1];
                     Wall var33;
                     if(var9 == 0 && (var33 = this.cs.e(this.bY, var4, var5)) != null) {
                        var15 = var33.h >> 14 & 32767;
                        if(var7 == 2) {
                           var33.f = new RenderableObject(var15, var8 + 4, 2, var11, var12, var10, var13, var3, false);
                           var33.g = new RenderableObject(var15, var8 + 1 & 3, 2, var11, var12, var10, var13, var3, false);
                        } else {
                           var33.f = new RenderableObject(var15, var8, var7, var11, var12, var10, var13, var3, false);
                        }
                     }

                     WallDecoration var35;
                     if(var9 == 1 && (var35 = this.cs.f(var4, var5, this.bY)) != null) {
                        var35.f = new RenderableObject(var35.g >> 14 & 32767, 0, 4, var11, var12, var10, var13, var3, false);
                     }

                     if(var9 == 2) {
                        GameObject var37 = this.cs.g(var4, var5, this.bY);
                        if(var7 == 11) {
                           var7 = 10;
                        }

                        if(var37 != null) {
                           var37.e = new RenderableObject(var37.m >> 14 & 32767, var8, var7, var11, var12, var10, var13, var3, false);
                        }
                     }

                     GroundDecoration var38;
                     if(var9 == 3 && (var38 = this.cs.h(var5, var4, this.bY)) != null) {
                        var38.d = new RenderableObject(var38.e >> 14 & 32767, var8, 22, var11, var12, var10, var13, var3, false);
                     }
                  }

               } else {
                  if(var2 == 147) {
                     var3 = var1.t();
                     var4 = this.hp + (var3 >> 4 & 7);
                     var5 = this.hq + (var3 & 7);
                     var6 = var1.g();
                     byte var22 = (byte)(128 - var1.a[var1.b++]);
                     var8 = var1.v();
                     byte var23 = var1.u();
                     var3 = var1.g();
                     var11 = (var10 = var1.t()) >> 2;
                     var12 = var10 & 3;
                     var13 = this.fZ[var11];
                     byte var14 = var1.f();
                     var15 = var1.g();
                     byte var25 = var1.u();
                     Player var21;
                     if(var6 == this.bB) {
                        var21 = t;
                     } else {
                        var21 = this.bH[var6];
                     }

                     if(var21 != null) {
                        ItemDefinition var34 = ItemDefinition.a(var15);
                        int var16 = this.gA[this.bY][var4][var5];
                        int var17 = this.gA[this.bY][var4 + 1][var5];
                        int var18 = this.gA[this.bY][var4 + 1][var5 + 1];
                        int var19 = this.gA[this.bY][var4][var5 + 1];
                        Model var29;
                        if((var29 = var34.a(var11, var12, var16, var17, var18, var19, -1)) != null) {
                           this.a(var3 + 1, -1, 0, var13, var5, 0, this.bY, var4, var8 + 1);
                           var21.ao = var8 + x;
                           var21.ap = var3 + x;
                           var21.av = var29;
                           var3 = var34.c;
                           var8 = var34.k;
                           if(var12 == 1 || var12 == 3) {
                              var3 = var34.k;
                              var8 = var34.c;
                           }

                           var21.as = (var4 << 7) + (var3 << 6);
                           var21.au = (var5 << 7) + (var8 << 6);
                           var21.at = this.b(this.bY, var21.au, var21.as);
                           byte var20;
                           if(var14 > var22) {
                              var20 = var14;
                              var14 = var22;
                              var22 = var20;
                           }

                           if(var25 > var23) {
                              var20 = var25;
                              var25 = var23;
                              var23 = var20;
                           }

                           var21.ax = var4 + var14;
                           var21.az = var4 + var22;
                           var21.ay = var5 + var25;
                           var21.aA = var5 + var23;
                        }
                     }
                  }

                  if(var2 == 151) {
                     var3 = var1.r();
                     var4 = this.hp + (var3 >> 4 & 7);
                     var5 = this.hq + (var3 & 7);
                     var6 = var1.v();
                     var8 = (var7 = var1.t()) >> 2;
                     var9 = var7 & 3;
                     var3 = this.fZ[var8];
                     if(var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                        this.a(-1, var6, var9, var3, var5, var8, this.bY, var4, 0);
                     }

                  } else if(var2 == 4) {
                     var3 = var1.e();
                     var4 = this.hp + (var3 >> 4 & 7);
                     var5 = this.hq + (var3 & 7);
                     var6 = var1.g();
                     var7 = var1.e();
                     var8 = var1.g();
                     if(var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                        var4 = (var4 << 7) + 64;
                        var5 = (var5 << 7) + 64;
                        GameAnimableObject var27 = new GameAnimableObject(this.bY, x, var8, var6, this.b(this.bY, var5, var4) - var7, var5, var4);
                        this.eb.a(var27);
                     }

                  } else if(var2 == 44) {
                     var3 = var1.x();
                     var4 = var1.g();
                     var5 = var1.e();
                     var6 = this.hp + (var5 >> 4 & 7);
                     var7 = this.hq + (var5 & 7);
                     if(var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
                        (var26 = new Item()).a = var3;
                        var26.b = var4;
                        if(this.aM[this.bY][var6][var7] == null) {
                           this.aM[this.bY][var6][var7] = new LinkedList();
                        }

                        this.aM[this.bY][var6][var7].a(var26);
                        this.b(var6, var7);
                     }

                  } else if(var2 == 101) {
                     var4 = (var3 = var1.s()) >> 2;
                     var5 = var3 & 3;
                     var6 = this.fZ[var4];
                     var7 = var1.e();
                     var8 = this.hp + (var7 >> 4 & 7);
                     var9 = this.hq + (var7 & 7);
                     if(var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
                        this.a(-1, -1, var5, var6, var9, var4, this.bY, var8, 0);
                     }

                  } else {
                     if(var2 == 117) {
                        var3 = var1.e();
                        var4 = this.hp + (var3 >> 4 & 7);
                        var5 = this.hq + (var3 & 7);
                        var6 = var4 + var1.f();
                        var7 = var5 + var1.f();
                        var8 = var1.h();
                        var9 = var1.g();
                        var3 = var1.e() << 2;
                        var10 = var1.e() << 2;
                        var11 = var1.g();
                        var12 = var1.g();
                        var13 = var1.e();
                        int var32 = var1.e();
                        if(var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104 && var9 != '\uffff') {
                           var4 = (var4 << 7) + 64;
                           var5 = (var5 << 7) + 64;
                           var6 = (var6 << 7) + 64;
                           var7 = (var7 << 7) + 64;
                           Projectile var36;
                           (var36 = new Projectile(var13, var10, var11 + x, var12 + x, var32, this.bY, this.b(this.bY, var5, var4) - var3, var5, var4, var8, var9)).a(var11 + x, var7, this.b(this.bY, var7, var6) - var10, var6);
                           this.du.a(var36);
                        }
                     }

                  }
               }
            }
         }
      }
   }

   private void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var5 > 0 && var1 > 0 && var5 <= 102 && var1 <= 102) {
         int var8 = 0;
         if(var6 == 0) {
            var8 = this.cs.i(var2, var5, var1);
         }

         if(var6 == 1) {
            var8 = this.cs.j(var2, var5, var1);
         }

         if(var6 == 2) {
            var8 = this.cs.k(var2, var5, var1);
         }

         if(var6 == 3) {
            var8 = this.cs.l(var2, var5, var1);
         }

         int var9;
         if(var8 != 0) {
            var9 = this.cs.c(var2, var5, var1, var8);
            var8 = var8 >> 14 & 32767;
            int var10 = var9 & 31;
            var9 >>= 6;
            ItemDefinition var11;
            if(var6 == 0) {
               this.cs.a(var5, var2, var1, (byte)-119);
               if((var11 = ItemDefinition.a(var8)).o) {
                  this.gM[var2].a(var9, var10, var11.h, var5, var1);
               }
            }

            if(var6 == 1) {
               this.cs.a(var1, var2, var5);
            }

            if(var6 == 2) {
               this.cs.b(var2, var5, var1);
               var11 = ItemDefinition.a(var8);
               if(var5 + var11.c > 103 || var1 + var11.c > 103 || var5 + var11.k > 103 || var1 + var11.k > 103) {
                  return;
               }

               if(var11.o) {
                  this.gM[var2].a(var9, var11.c, var5, var1, var11.k, var11.h);
               }
            }

            if(var6 == 3) {
               this.cs.c(var2, var1, var5);
               if((var11 = ItemDefinition.a(var8)).o && var11.v) {
                  CollisionMap var12 = this.gM[var2];
                  var12.a[var5][var1] &= 14680063;
               }
            }
         }

         if(var7 >= 0) {
            var9 = var2;
            if(var2 < 3 && (this.hg[1][var5][var1] & 2) == 2) {
               var9 = var2 + 1;
            }

            MapRegion.a(this.cs, var3, var1, var4, var9, this.gM[var2], this.gA, var5, var7, var2);
         }
      }

   }

   private void b(int var1, Buffer var2) {
      this.aU = 0;
      this.bK = 0;
      var2.n();
      int var6;
      int var7;
      int var9;
      int var10;
      if(var2.i(1) != 0) {
         if((var6 = var2.i(2)) == 0) {
            this.bL[this.bK++] = 2047;
         } else if(var6 == 1) {
            var7 = var2.i(3);
            t.a(false, var7);
            if(var2.i(1) == 1) {
               this.bL[this.bK++] = 2047;
            }
         } else if(var6 == 2) {
            var7 = var2.i(3);
            t.a(true, var7);
            int var8 = var2.i(3);
            t.a(true, var8);
            if(var2.i(1) == 1) {
               this.bL[this.bK++] = 2047;
            }
         } else if(var6 == 3) {
            this.bY = var2.i(2);
            var7 = var2.i(1);
            if(var2.i(1) == 1) {
               this.bL[this.bK++] = 2047;
            }

            var9 = var2.i(7);
            var10 = var2.i(7);
            t.a(var10, var9, var7 == 1);
         }
      }

      Buffer var3 = var2;
      Client var4 = this;
      int var5;
      if((var5 = var2.i(8)) < this.bI) {
         for(var6 = var5; var6 < var4.bI; ++var6) {
            var4.aV[var4.aU++] = var4.bJ[var6];
         }
      }

      if(var5 > var4.bI) {
         SignLink.b(y + " Too many players");
         throw new RuntimeException("eek");
      } else {
         var4.bI = 0;

         for(var6 = 0; var6 < var5; ++var6) {
            var7 = var4.bJ[var6];
            Player var13 = var4.bH[var7];
            if(var3.i(1) == 0) {
               var4.bJ[var4.bI++] = var7;
               var13.I = x;
            } else if((var10 = var3.i(2)) == 0) {
               var4.bJ[var4.bI++] = var7;
               var13.I = x;
               var4.bL[var4.bK++] = var7;
            } else if(var10 == 1) {
               var4.bJ[var4.bI++] = var7;
               var13.I = x;
               var9 = var3.i(3);
               var13.a(false, var9);
               if(var3.i(1) == 1) {
                  var4.bL[var4.bK++] = var7;
               }
            } else if(var10 == 2) {
               var4.bJ[var4.bI++] = var7;
               var13.I = x;
               var9 = var3.i(3);
               var13.a(true, var9);
               var9 = var3.i(3);
               var13.a(true, var9);
               if(var3.i(1) == 1) {
                  var4.bL[var4.bK++] = var7;
               }
            } else if(var10 == 3) {
               var4.aV[var4.aU++] = var7;
            }
         }

         this.b(var2, var1);
         this.a(var2);

         int var12;
         for(var12 = 0; var12 < this.aU; ++var12) {
            int var11 = this.aV[var12];
            if(this.bH[var11].I != x) {
               this.bH[var11] = null;
            }
         }

         if(var2.b != var1) {
            SignLink.b("Error packet size mismatch in getplayer pos:" + var2.b + " psize:" + var1);
            throw new RuntimeException("eek");
         } else {
            for(var12 = 0; var12 < this.bI; ++var12) {
               if(this.bH[this.bJ[var12]] == null) {
                  SignLink.b(y + " null entry in pl list - pos:" + var12 + " size:" + this.bI);
                  throw new RuntimeException("eek");
               }
            }

         }
      }
   }

   private static void a(String var0, int var1) {
      Widget.e[var1].M = var0;
      int var10000 = Widget.e[var1].B;
   }

   private boolean X() {
      if(this.fV == null) {
         return false;
      } else {
         String var1;
         int var2;
         try {
            int var64;
            if((var64 = this.fV.c()) == 0) {
               return false;
            }

            if(this.dq == -1) {
               this.fV.a(this.ez.a, 1);
               this.dq = this.ez.a[0] & 255;
               if(this.dk != null) {
                  this.dq = this.dq - this.dk.a() & 255;
               }

               this.dp = PacketConstants.a[this.dq];
               --var64;
            }

            if(this.dp == -1) {
               if(var64 <= 0) {
                  return false;
               }

               this.fV.a(this.ez.a, 1);
               this.dp = this.ez.a[0] & 255;
               --var64;
            }

            if(this.dp == -2) {
               if(var64 <= 1) {
                  return false;
               }

               this.fV.a(this.ez.a, 2);
               this.ez.b = 0;
               this.dp = this.ez.g();
               var64 -= 2;
            }

            if(var64 < this.dp) {
               return false;
            }

            this.ez.b = 0;
            this.fV.a(this.ez.a, this.dp);
            this.dr = 0;
            this.aY = this.aX;
            this.aX = this.aW;
            this.aW = this.dq;
            int var3;
            int var4;
            boolean var5;
            long var6;
            int var8;
            int var9;
            int var10;
            int var12;
            int var14;
            int var30;
            int var39;
            int var40;
            int var43;
            int var44;
            int var45;
            int var46;
            int var47;
            int var49;
            int var54;
            String var66;
            String var67;
            int var70;
            boolean var72;
            switch(this.dq) {
            case 1:
               int var83;
               for(var83 = 0; var83 < this.bH.length; ++var83) {
                  if(this.bH[var83] != null) {
                     this.bH[var83].y = -1;
                  }
               }

               for(var83 = 0; var83 < this.aR.length; ++var83) {
                  if(this.aR[var83] != null) {
                     this.aR[var83].y = -1;
                  }
               }

               this.dq = -1;
               return true;
            case 4:
            case 44:
            case 84:
            case 101:
            case 105:
            case 117:
            case 147:
            case 151:
            case 156:
            case 160:
            case 215:
               this.c(this.ez, this.dq);
               this.dq = -1;
               return true;
            case 8:
               int var87 = this.ez.x();
               var30 = this.ez.g();
               Widget.e[var87].y = 1;
               Widget.e[var87].z = var30;
               this.dq = -1;
               return true;
            case 24:
               this.dZ = this.ez.t();
               if(this.dZ == C) {
                  if(this.dZ == 3) {
                     C = 1;
                  } else {
                     C = 3;
                  }
               }

               this.dq = -1;
               return true;
            case 27:
               this.hf = false;
               this.gF = 1;
               this.dm = "";
               D = true;
               this.dq = -1;
               return true;
            case 34:
               int var52 = this.ez.g();
               Widget var53 = Widget.e[var52];

               while(this.ez.b < this.dp) {
                  var54 = this.ez.q();
                  int var55 = this.ez.g();
                  int var56;
                  if((var56 = this.ez.e()) == 255) {
                     var56 = this.ez.j();
                  }

                  if(var54 >= 0 && var54 < var53.Q.length) {
                     var53.Q[var54] = var55;
                     var53.P[var54] = var56;
                  }
               }

               this.dq = -1;
               return true;
            case 35:
               var14 = this.ez.e();
               var64 = this.ez.e();
               var2 = this.ez.e();
               var3 = this.ez.e();
               this.bu[var14] = true;
               this.bt[var14] = var64;
               this.gv[var14] = var2;
               this.cd[var14] = var3;
               this.dG[var14] = 0;
               this.dq = -1;
               return true;
            case 36:
               var47 = this.ez.v();
               byte var88 = this.ez.f();
               this.dR[var47] = var88;
               if(this.m[var47] != var88) {
                  this.m[var47] = var88;
                  this.j(var47);
                  if(this.dP != -1) {
                     D = true;
                  }
               }

               this.dq = -1;
               return true;
            case 50:
               long var19 = this.ez.k();
               int var21 = this.ez.e();
               var67 = StringUtils.c(StringUtils.a(var19));

               for(var3 = 0; var3 < this.bO; ++var3) {
                  if(var19 == this.cB[var3]) {
                     if(this.aL[var3] != var21) {
                        this.aL[var3] = var21;
                        if(var21 >= 2) {
                           this.a(var67 + " has logged in.", 5, "");
                        }

                        if(var21 <= 1) {
                           this.a(var67 + " has logged out.", 5, "");
                        }
                     }

                     var67 = null;
                  }
               }

               if(var67 != null && this.bO < 200) {
                  this.cB[this.bO] = var19;
                  this.ey[this.bO] = var67;
                  this.aL[this.bO] = var21;
                  ++this.bO;
               }

               var72 = false;

               while(!var72) {
                  var72 = true;

                  for(var64 = 0; var64 < this.bO - 1; ++var64) {
                     if(this.aL[var64] != cF && this.aL[var64 + 1] == cF || this.aL[var64] == 0 && this.aL[var64 + 1] != 0) {
                        var2 = this.aL[var64];
                        this.aL[var64] = this.aL[var64 + 1];
                        this.aL[var64 + 1] = var2;
                        var66 = this.ey[var64];
                        this.ey[var64] = this.ey[var64 + 1];
                        this.ey[var64 + 1] = var66;
                        long var22 = this.cB[var64];
                        this.cB[var64] = this.cB[var64 + 1];
                        this.cB[var64 + 1] = var22;
                        var72 = false;
                     }
                  }
               }

               this.dq = -1;
               return true;
            case 53:
               int var36 = this.ez.g();
               Widget var37 = Widget.e[var36];
               int var38 = this.ez.g();

               for(var39 = 0; var39 < var38; ++var39) {
                  if((var40 = this.ez.e()) == 255) {
                     var40 = this.ez.B();
                  }

                  var37.Q[var39] = this.ez.x();
                  var37.P[var39] = var40;
               }

               for(var39 = var38; var39 < var37.Q.length; ++var39) {
                  var37.Q[var39] = 0;
                  var37.P[var39] = 0;
               }

               this.dq = -1;
               return true;
            case 60:
               this.hq = this.ez.e();
               this.hp = this.ez.s();

               while(this.ez.b < this.dp) {
                  var14 = this.ez.e();
                  this.c(this.ez, var14);
               }

               this.dq = -1;
               return true;
            case 61:
               this.ea = this.ez.e();
               this.dq = -1;
               return true;
            case 64:
               this.hp = this.ez.s();
               this.hq = this.ez.t();

               for(var64 = this.hp; var64 < this.hp + 8; ++var64) {
                  for(var2 = this.hq; var2 < this.hq + 8; ++var2) {
                     if(this.aM[this.bY][var64][var2] != null) {
                        this.aM[this.bY][var64][var2] = null;
                        this.b(var64, var2);
                     }
                  }
               }

               for(Ground var86 = (Ground)this.gb.b(); var86 != null; var86 = (Ground)this.gb.d()) {
                  if(var86.g >= this.hp && var86.g < this.hp + 8 && var86.h >= this.hq && var86.h < this.hq + 8 && var86.e == this.bY) {
                     var86.d = 0;
                  }
               }

               this.dq = -1;
               return true;
            case 65:
               this.a(this.ez, this.dp);
               this.dq = -1;
               return true;
            case 68:
               for(int var25 = 0; var25 < this.m.length; ++var25) {
                  if(this.m[var25] != this.dR[var25]) {
                     this.m[var25] = this.dR[var25];
                     this.j(var25);
                  }
               }

               this.dq = -1;
               return true;
            case 70:
               var64 = this.ez.h();
               var2 = this.ez.y();
               var3 = this.ez.v();
               Widget var85;
               (var85 = Widget.e[var3]).Y = var64;
               var85.Z = var2;
               this.dq = -1;
               return true;
            case 71:
               var9 = this.ez.g();
               var10 = this.ez.r();
               if(var9 == '\uffff') {
                  var9 = -1;
               }

               u[var10] = var9;
               fc = true;
               this.dq = -1;
               return true;
            case 72:
               var2 = this.ez.v();
               Widget var84 = Widget.e[var2];

               for(var3 = 0; var3 < var84.Q.length; ++var3) {
                  var84.Q[var3] = -1;
                  var84.Q[var3] = 0;
               }

               this.dq = -1;
               return true;
            case 73:
            case 241:
               var64 = this.el;
               var2 = this.em;
               if(this.dq == 73) {
                  var64 = this.ez.w();
                  var2 = this.ez.g();
                  this.fO = false;
               }

               if(this.dq == 241) {
                  var2 = this.ez.w();
                  this.ez.n();
                  var64 = 0;

                  while(true) {
                     if(var64 >= 4) {
                        this.ez.o();
                        var64 = this.ez.g();
                        this.fO = true;
                        break;
                     }

                     for(var3 = 0; var3 < 13; ++var3) {
                        for(var4 = 0; var4 < 13; ++var4) {
                           if(this.ez.i(1) == 1) {
                              this.fv[var64][var3][var4] = this.ez.i(26);
                           } else {
                              this.fv[var64][var3][var4] = -1;
                           }
                        }
                     }

                     ++var64;
                  }
               }

               if(this.el == var64 && this.em == var2 && this.dC == 2) {
                  this.dq = -1;
                  return true;
               }

               this.el = var64;
               this.em = var2;
               this.dJ = this.el - 6 << 3;
               this.dK = this.em - 6 << 3;
               this.fE = (this.el / 8 == 48 || this.el / 8 == 49) && this.em / 8 == 48;
               if(this.el / 8 == 48 && this.em / 8 == 148) {
                  this.fE = true;
               }

               this.dC = 1;
               this.aJ = System.currentTimeMillis();
               this.fS.a();
               var64 = s == 0?200:q / 2 - 55;
               var3 = s == 0?150:r / 2 - 45;
               Rasterizer2D.b(var64, 130, 22, 16777215, var3);
               Rasterizer2D.a(20, var3 + 1, var64 + 1, 0, 128);
               this.hs.a(0, "Loading - please wait.", var3 + 18, var64 + 68);
               this.hs.a(16777215, "Loading - please wait.", var3 + 17, var64 + 67);
               this.fS.a(s == 0?4:0, super.M, s == 0?4:0);
               if(this.dq == 73) {
                  var4 = 0;
                  var70 = (this.el - 6) / 8;

                  label1211:
                  while(true) {
                     if(var70 > (this.el + 6) / 8) {
                        this.gf = new byte[var4][];
                        this.gW = new byte[var4][];
                        this.gN = new int[var4];
                        this.gO = new int[var4];
                        this.gP = new int[var4];
                        var4 = 0;
                        var70 = (this.el - 6) / 8;

                        while(true) {
                           if(var70 > (this.el + 6) / 8) {
                              break label1211;
                           }

                           for(var64 = (this.em - 6) / 8; var64 <= (this.em + 6) / 8; ++var64) {
                              this.gN[var4] = (var70 << 8) + var64;
                              if(!this.fE || var64 != 49 && var64 != 149 && var64 != 147 && var70 != 50 && (var70 != 49 || var64 != 47)) {
                                 if((var2 = this.gO[var4] = this.o.a(0, var64, var70)) != -1) {
                                    this.o.a(3, var2);
                                 }

                                 if((var3 = this.gP[var4] = this.o.a(1, var64, var70)) != -1) {
                                    this.o.a(3, var3);
                                 }
                              } else {
                                 this.gO[var4] = -1;
                                 this.gP[var4] = -1;
                              }

                              ++var4;
                           }

                           ++var70;
                        }
                     }

                     for(var64 = (this.em - 6) / 8; var64 <= (this.em + 6) / 8; ++var64) {
                        ++var4;
                     }

                     ++var70;
                  }
               }

               if(this.dq == 241) {
                  var4 = 0;
                  int[] var73 = new int[676];
                  var64 = 0;

                  label1170:
                  while(true) {
                     int var11;
                     if(var64 >= 4) {
                        this.gf = new byte[var4][];
                        this.gW = new byte[var4][];
                        this.gN = new int[var4];
                        this.gO = new int[var4];
                        this.gP = new int[var4];
                        var64 = 0;

                        while(true) {
                           if(var64 >= var4) {
                              break label1170;
                           }

                           var3 = (var2 = this.gN[var64] = var73[var64]) >> 8 & 255;
                           var8 = var2 & 255;
                           if((var11 = this.gO[var64] = this.o.a(0, var8, var3)) != -1) {
                              this.o.a(3, var11);
                           }

                           if((var9 = this.gP[var64] = this.o.a(1, var8, var3)) != -1) {
                              this.o.a(3, var9);
                           }

                           ++var64;
                        }
                     }

                     for(var2 = 0; var2 < 13; ++var2) {
                        for(var3 = 0; var3 < 13; ++var3) {
                           if((var8 = this.fv[var64][var2][var3]) != -1) {
                              var11 = var8 >> 14 & 1023;
                              var9 = var8 >> 3 & 2047;
                              var10 = (var11 / 8 << 8) + var9 / 8;

                              for(var12 = 0; var12 < var4; ++var12) {
                                 if(var73[var12] == var10) {
                                    var10 = -1;
                                 }
                              }

                              if(var10 != -1) {
                                 var73[var4++] = var10;
                              }
                           }
                        }
                     }

                     ++var64;
                  }
               }

               var4 = this.dJ - this.dL;
               var70 = this.dK - this.dM;
               this.dL = this.dJ;
               this.dM = this.dK;

               for(var64 = 0; var64 < 16384; ++var64) {
                  Npc var78;
                  if((var78 = this.aR[var64]) != null) {
                     for(var3 = 0; var3 < 10; ++var3) {
                        var78.a[var3] -= var4;
                        var78.b[var3] -= var70;
                     }

                     var78.V -= var4 << 7;
                     var78.W -= var70 << 7;
                  }
               }

               for(var64 = 0; var64 < 2048; ++var64) {
                  Player var79;
                  if((var79 = this.bH[var64]) != null) {
                     for(var3 = 0; var3 < 10; ++var3) {
                        var79.a[var3] -= var4;
                        var79.b[var3] -= var70;
                     }

                     var79.V -= var4 << 7;
                     var79.W -= var70 << 7;
                  }
               }

               this.ex = true;
               byte var81 = 0;
               byte var80 = 104;
               byte var82 = 1;
               if(var4 < 0) {
                  var81 = 103;
                  var80 = -1;
                  var82 = -1;
               }

               byte var75 = 0;
               byte var76 = 104;
               byte var74 = 1;
               if(var70 < 0) {
                  var75 = 103;
                  var76 = -1;
                  var74 = -1;
               }

               for(var10 = var81; var10 != var80; var10 += var82) {
                  for(var12 = var75; var12 != var76; var12 += var74) {
                     var64 = var10 + var4;
                     int var13 = var12 + var70;

                     for(var14 = 0; var14 < 4; ++var14) {
                        if(var64 >= 0 && var13 >= 0 && var64 < 104 && var13 < 104) {
                           this.aM[var14][var10][var12] = this.aM[var14][var64][var13];
                        } else {
                           this.aM[var14][var10][var12] = null;
                        }
                     }
                  }
               }

               for(Ground var77 = (Ground)this.gb.b(); var77 != null; var77 = (Ground)this.gb.d()) {
                  var77.g -= var4;
                  var77.h -= var70;
                  if(var77.g < 0 || var77.h < 0 || var77.g >= 104 || var77.h >= 104) {
                     var77.C();
                  }
               }

               if(this.hi != 0) {
                  this.hi -= var4;
                  this.hj -= var70;
               }

               this.fP = false;
               this.dq = -1;
               return true;
            case 74:
               if((var8 = this.ez.v()) == '\uffff') {
                  var8 = -1;
               }

               if(var8 != this.cE && fI && this.hh == 0) {
                  this.gH = var8;
                  this.gI = true;
                  this.o.a(2, this.gH);
               }

               this.cE = var8;
               this.dq = -1;
               return true;
            case 75:
               var12 = this.ez.x();
               var64 = this.ez.x();
               Widget.e[var64].y = 2;
               Widget.e[var64].z = var12;
               this.dq = -1;
               return true;
            case 78:
               this.hi = 0;
               this.dq = -1;
               return true;
            case 79:
               var2 = this.ez.v();
               var3 = this.ez.w();
               Widget var24;
               if((var24 = Widget.e[var2]) != null && var24.X == 0) {
                  if(var3 < 0) {
                     var3 = 0;
                  }

                  if(var3 > var24.W - var24.ab) {
                     var3 = var24.W - var24.ab;
                  }

                  var24.q = var3;
               }

               this.dq = -1;
               return true;
            case 81:
               this.b(this.dp, this.ez);
               this.ex = false;
               this.dq = -1;
               return true;
            case 85:
               this.hq = this.ez.s();
               this.hp = this.ez.s();
               this.dq = -1;
               return true;
            case 87:
               var45 = this.ez.v();
               var46 = this.ez.A();
               this.dR[var45] = var46;
               if(this.m[var45] != var46) {
                  this.m[var45] = var46;
                  this.j(var45);
                  if(this.dP != -1) {
                     D = true;
                  }
               }

               this.dq = -1;
               return true;
            case 97:
               var43 = this.ez.g();
               this.m(var43);
               if(this.gl != -1) {
                  this.gl = -1;
                  fc = true;
               }

               if(this.hv != -1) {
                  this.hv = -1;
                  D = true;
               }

               if(this.gF != 0) {
                  this.gF = 0;
                  D = true;
               }

               i = var43;
               this.fG = false;
               this.N();
               this.e(0, 0);
               this.dq = -1;
               return true;
            case 99:
               this.dB = this.ez.e();
               this.dq = -1;
               return true;
            case 104:
               var64 = this.ez.s();
               var2 = this.ez.r();
               var66 = this.ez.l();
               if(var64 > 0 && var64 <= 5) {
                  if(var66.equalsIgnoreCase("null")) {
                     var66 = null;
                  }

                  this.ft[var64 - 1] = var66;
                  this.fu[var64 - 1] = var2 == 0;
               }

               this.dq = -1;
               return true;
            case 106:
               C = this.ez.s();
               fc = true;
               this.dq = -1;
               return true;
            case 107:
               this.fP = false;

               for(var2 = 0; var2 < 5; ++var2) {
                  this.bu[var2] = false;
               }

               this.dq = -1;
               return true;
            case 109:
               this.u();
               this.dq = -1;
               return false;
            case 110:
               this.fF = this.ez.e();
               this.dq = -1;
               return true;
            case 114:
               this.fd = this.ez.v() * 30;
               this.dq = -1;
               return true;
            case 115:
               if(this.ez.g() > 0) {
                  try {
                     this.fe = this.ez.l();
                  } catch (Exception var58) {
                     SignLink.b("cde1");
                  }
               } else {
                  this.fe = "";
               }

               this.dq = -1;
               return true;
            case 121:
               var64 = this.ez.x();
               var2 = this.ez.w();
               if(fI) {
                  this.gH = var64;
                  this.gI = false;
                  this.o.a(2, this.gH);
                  this.hh = var2;
               }

               this.dq = -1;
               return true;
            case 122:
               int var31 = this.ez.x();
               int var32;
               int var33 = (var32 = this.ez.x()) >> 10 & 31;
               int var34 = var32 >> 5 & 31;
               int var35 = var32 & 31;
               Widget.e[var31].x = (var33 << 19) + (var34 << 11) + (var35 << 3);
               this.dq = -1;
               return true;
            case 126:
               try {
                  String var29 = this.ez.l();
                  var30 = this.ez.w();
                  a(var29, var30);
               } catch (Exception var57) {
                  ;
               }

               this.dq = -1;
               return true;
            case 134:
               var3 = this.ez.e();
               var4 = this.ez.A();
               var70 = this.ez.e();
               if(this.E != null) {
                  this.E.a(var3, var4, var70);
               }

               this.bp[var3] = var4;
               this.bZ[var3] = var70;
               this.dQ[var3] = 1;

               for(var9 = 0; var9 < 98; ++var9) {
                  if(var4 >= dA[var9]) {
                     this.dQ[var3] = var9 + 2;
                  }
               }

               this.dq = -1;
               return true;
            case 142:
               int var28 = this.ez.v();
               this.m(var28);
               if(this.hv != -1) {
                  this.hv = -1;
                  D = true;
               }

               if(this.gF != 0) {
                  this.gF = 0;
                  D = true;
               }

               this.gl = var28;
               fc = true;
               i = -1;
               this.fG = false;
               this.dq = -1;
               return true;
            case 164:
               var54 = this.ez.v();
               this.m(var54);
               if(this.gl != -1) {
                  this.gl = -1;
                  fc = true;
               }

               this.hv = var54;
               D = true;
               i = -1;
               this.fG = false;
               this.dq = -1;
               return true;
            case 166:
               this.fP = true;
               this.eX = this.ez.e();
               this.eY = this.ez.e();
               this.eZ = this.ez.g();
               this.fa = this.ez.e();
               this.fb = this.ez.e();
               if(this.fb >= 100) {
                  this.bj = (this.eX << 7) + 64;
                  this.bl = (this.eY << 7) + 64;
                  this.bk = this.b(this.bY, this.bl, this.bj) - this.eZ;
               }

               this.dq = -1;
               return true;
            case 171:
               var72 = this.ez.e() == 1;
               var64 = this.ez.g();
               Widget.e[var64].aa = var72;
               this.dq = -1;
               return true;
            case 174:
               var64 = this.ez.g();
               var2 = this.ez.e();
               var3 = this.ez.g();
               if(this.bc && this.ef < 50) {
                  this.gw[this.ef] = var64;
                  this.gQ[this.ef] = var2;
                  this.gZ[this.ef] = var3 + Track.a[var64];
                  ++this.ef;
               }

               this.dq = -1;
               return true;
            case 176:
               this.fU = this.ez.s();
               this.fK = this.ez.w();
               this.fp = this.ez.e();
               this.gp = this.ez.B();
               this.do_ = this.ez.g();
               if(this.gp != 0 && i == -1) {
                  SignLink.a(StringUtils.a(this.gp));
                  this.Y();
                  short var71 = 650;
                  if(this.fU != 201 || this.fp == 1) {
                     var71 = 655;
                  }

                  this.bA = "";
                  this.fN = false;

                  for(var2 = 0; var2 < Widget.e.length; ++var2) {
                     if(Widget.e[var2] != null && Widget.e[var2].g == var71) {
                        i = Widget.e[var2].B;
                     }
                  }
               }

               this.dq = -1;
               return true;
            case 177:
               this.fP = true;
               this.df = this.ez.e();
               this.dg = this.ez.e();
               this.dh = this.ez.g();
               this.di = this.ez.e();
               this.dj = this.ez.e();
               if(this.dj >= 100) {
                  var43 = (this.df << 7) + 64;
                  var44 = (this.dg << 7) + 64;
                  var45 = this.b(this.bY, var44, var43) - this.dh;
                  var46 = var43 - this.bj;
                  var47 = var45 - this.bk;
                  int var48 = var44 - this.bl;
                  var49 = (int)Math.sqrt((double)(var46 * var46 + var48 * var48));
                  this.bm = (int)(Math.atan2((double)var47, (double)var49) * 325.949D) & 2047;
                  this.bn = (int)(Math.atan2((double)var46, (double)var48) * -325.949D) & 2047;
                  if(this.bm < 128) {
                     this.bm = 128;
                  }

                  if(this.bm > 383) {
                     this.bm = 383;
                  }
               }

               this.dq = -1;
               return true;
            case 185:
               var64 = this.ez.x();
               Widget.e[var64].y = 3;
               if(t.ae == null) {
                  Widget.e[var64].z = (t.ag[0] << 25) + (t.ag[4] << 20) + (t.aw[0] << 15) + (t.aw[8] << 10) + (t.aw[11] << 5) + t.aw[1];
               } else {
                  Widget.e[var64].z = (int)(305419896L + t.ae.l);
               }

               this.dq = -1;
               return true;
            case 187:
               this.hf = false;
               this.gF = 2;
               this.dm = "";
               D = true;
               this.dq = -1;
               return true;
            case 196:
               long var26 = this.ez.k();
               this.ez.j();
               var64 = this.ez.e();
               var2 = this.ez.e();
               var72 = false;
               if(var64 <= 1) {
                  for(var4 = 0; var4 < this.aI; ++var4) {
                     if(this.cb[var4] == var26) {
                        var72 = true;
                     }
                  }
               }

               if(!var72 && this.hb == 0) {
                  try {
                     String var69 = ChatMessageCodec.a(this.dp - 14, this.ez);
                     var67 = var2 > 0?h(var2):"";
                     if(var64 > 0 && var64 <= 3) {
                        this.a(var69, 7, var67 + StringUtils.c(StringUtils.a(var26)), var64);
                     } else {
                        this.a(var69, 3, var67 + StringUtils.c(StringUtils.a(var26)), var64);
                     }
                  } catch (Exception var59) {
                     SignLink.b("cde1");
                  }
               }

               this.dq = -1;
               return true;
            case 200:
               var49 = this.ez.g();
               int var50 = this.ez.h();
               Widget var51;
               (var51 = Widget.e[var49]).S = var50;
               if(var50 == -1) {
                  var51.K = 0;
                  var51.c = 0;
               }

               this.dq = -1;
               return true;
            case 206:
               this.hE = this.ez.e();
               this.ba = this.ez.e();
               this.gX = this.ez.e();
               D = true;
               this.dq = -1;
               return true;
            case 208:
               if((var10 = this.ez.y()) >= 0) {
                  this.m(var10);
               }

               this.dz = var10;
               this.N();
               this.e(0, 0);
               this.dq = -1;
               return true;
            case 213:
               this.bP = this.ez.e();
               if(this.bP > 0) {
                  for(var3 = 0; var3 < this.bP; ++var3) {
                     this.cC[var3] = this.ez.k();
                     this.cD[var3] = this.ez.e();
                  }
               }

               this.dq = -1;
               return true;
            case 214:
               this.aI = this.dp / 8;
               if(this.aI > 0) {
                  for(var3 = 0; var3 < this.aI; ++var3) {
                     this.cb[var3] = this.ez.k();
                  }
               }

               this.dq = -1;
               return true;
            case 216:
               try {
                  this.ax = this.ez.l();
                  var67 = this.ez.l();
                  var1 = this.ez.l();
                  var3 = this.ez.e();
                  var4 = this.ez.e();
                  var5 = false;
                  var6 = StringUtils.a(var67);

                  for(var8 = 0; var8 < this.aI; ++var8) {
                     if(this.cb[var8] == var6) {
                        var5 = true;
                     }
                  }

                  if(!var5) {
                     if(var4 > 0) {
                        this.a(var1, 16, h(var4) + StringUtils.c(var67), var3);
                     } else {
                        this.a(var1, 16, StringUtils.c(var67), var3);
                     }
                  }
               } catch (Exception var61) {
                  var61.printStackTrace();
               }

               this.dq = -1;
               return true;
            case 217:
               try {
                  this.ay = this.ez.l();
                  var67 = this.ez.l();
                  var1 = this.ez.l();
                  var3 = this.ez.e();
                  var4 = this.ez.e();
                  var5 = false;
                  var6 = StringUtils.a(var67);

                  for(var8 = 0; var8 < this.aI; ++var8) {
                     if(this.cb[var8] == var6) {
                        var5 = true;
                     }
                  }

                  if(!var5) {
                     if(var4 > 0) {
                        this.a(var1, 9, h(var4) + StringUtils.c(var67), var3);
                     } else {
                        this.a(var1, 9, StringUtils.c(var67), var3);
                     }
                  }
               } catch (Exception var60) {
                  var60.printStackTrace();
               }

               this.dq = -1;
               return true;
            case 218:
               var44 = this.ez.z();
               this.dP = var44;
               D = true;
               this.dq = -1;
               return true;
            case 219:
               if(this.gl != -1) {
                  this.gl = -1;
                  fc = true;
               }

               if(this.hv != -1) {
                  this.hv = -1;
                  D = true;
               }

               if(this.gF != 0) {
                  this.gF = 0;
                  D = true;
               }

               if(this.al) {
                  this.N();
               }

               i = -1;
               this.fG = false;
               this.dq = -1;
               return true;
            case 221:
               this.bQ = this.ez.e();
               this.dq = -1;
               return true;
            case 230:
               var39 = this.ez.w();
               var40 = this.ez.g();
               int var41 = this.ez.g();
               int var42 = this.ez.x();
               Widget.e[var40].ae = var41;
               Widget.e[var40].af = var42;
               Widget.e[var40].ad = var39;
               this.dq = -1;
               return true;
            case 240:
               this.bx = this.ez.h();
               this.dq = -1;
               return true;
            case 246:
               var4 = this.ez.v();
               var2 = this.ez.g();
               if((var64 = this.ez.g()) == '\uffff') {
                  Widget.e[var4].y = 0;
                  this.dq = -1;
                  return true;
               }

               ObjectDefinition var68 = ObjectDefinition.a(var64);
               Widget.e[var4].y = 4;
               Widget.e[var4].z = var64;
               Widget.e[var4].ae = var68.z;
               Widget.e[var4].af = var68.B;
               Widget.e[var4].ad = var68.t * 100 / var2;
               this.dq = -1;
               return true;
            case 248:
               var3 = this.ez.w();
               var64 = this.ez.g();
               if(this.hv != -1) {
                  this.hv = -1;
                  D = true;
               }

               if(this.gF != 0) {
                  this.gF = 0;
                  D = true;
               }

               if(!this.eK) {
                  this.eK = true;
               }

               i = var3;
               this.N();
               this.e(0, 0);
               this.gl = var64;
               fc = true;
               this.fG = false;
               this.dq = -1;
               return true;
            case 249:
               this.dS = this.ez.r();
               this.bB = this.ez.x();
               this.dq = -1;
               return true;
            case 253:
               var1 = this.ez.l();
               boolean var65 = this.ez.e() == 1;
               String var15;
               long var16;
               if(var1.endsWith(":tradereq:")) {
                  var16 = StringUtils.a(var15 = var1.substring(0, var1.indexOf(":")));
                  var65 = false;

                  for(var3 = 0; var3 < this.aI; ++var3) {
                     if(this.cb[var3] == var16) {
                        var65 = true;
                     }
                  }

                  if(!var65 && this.hb == 0) {
                     this.a("wishes to trade with you.", 4, var15);
                  }
               } else if(var1.endsWith(":clan:")) {
                  StringUtils.a(var15 = var1.substring(0, var1.indexOf(":")));
                  this.a("Clan: ", 8, var15);
               } else if(var1.endsWith("$link$") && var1.contains("+")) {
                  var15 = var1.substring(0, var1.indexOf("+"));
                  String var18 = (var1 = var1.substring(var15.length() + 1).trim()).substring(0, var1.indexOf("$"));
                  this.a(var15, 12, var18);
               } else if(var1.endsWith(":duelreq:")) {
                  var16 = StringUtils.a(var15 = var1.substring(0, var1.indexOf(":")));
                  var65 = false;

                  for(var3 = 0; var3 < this.aI; ++var3) {
                     if(this.cb[var3] == var16) {
                        var65 = true;
                     }
                  }

                  if(!var65 && this.hb == 0) {
                     this.a("wishes to duel with you.", 8, var15);
                  }
               } else if(!var1.endsWith(":chalreq:")) {
                  if(var1.endsWith(":resetautocast:")) {
                     this.aw = false;
                     this.aC = 0;
                  } else {
                     this.a(var1, 0, "", var65);
                  }
               } else {
                  var16 = StringUtils.a(var15 = var1.substring(0, var1.indexOf(":")));
                  var65 = false;

                  for(var3 = 0; var3 < this.aI; ++var3) {
                     if(this.cb[var3] == var16) {
                        var65 = true;
                     }
                  }

                  if(!var65 && this.hb == 0) {
                     var66 = var1.substring(var1.indexOf(":") + 1, var1.length() - 9);
                     this.a(var66, 8, var15);
                  }
               }

               this.dq = -1;
               return true;
            case 254:
               this.bi = this.ez.e();
               if(this.bi == 1) {
                  this.gE = this.ez.g();
               }

               if(this.bi >= 2 && this.bi <= 6) {
                  if(this.bi == 2) {
                     this.cl = 64;
                     this.cm = 64;
                  }

                  if(this.bi == 3) {
                     this.cl = 0;
                     this.cm = 64;
                  }

                  if(this.bi == 4) {
                     this.cl = 128;
                     this.cm = 64;
                  }

                  if(this.bi == 5) {
                     this.cl = 64;
                     this.cm = 0;
                  }

                  if(this.bi == 6) {
                     this.cl = 64;
                     this.cm = 128;
                  }

                  this.bi = 2;
                  this.ci = this.ez.g();
                  this.cj = this.ez.g();
                  this.ck = this.ez.e();
               }

               if(this.bi == 10) {
                  this.ch = this.ez.g();
               }

               this.dq = -1;
               return true;
            default:
               SignLink.b("T1 - " + this.dq + "," + this.dp + " - " + this.aX + "," + this.aY);
            }
         } catch (IOException var62) {
            this.C();
         } catch (Exception var63) {
            var1 = "T2 - " + this.dq + "," + this.aX + "," + this.aY + " - " + this.dp + "," + (this.dJ + t.a[0]) + "," + (this.dK + t.b[0]) + " - ";

            for(var2 = 0; var2 < this.dp && var2 < 50; ++var2) {
               var1 = var1 + this.ez.a[var2] + ",";
            }

            SignLink.b(var1);
         }

         this.dq = -1;
         return true;
      }
   }

   private void Y() {
      this.go.a(130);
      if(this.gl != -1) {
         this.gl = -1;
         this.fG = false;
         fc = true;
      }

      if(this.hv != -1) {
         this.hv = -1;
         D = true;
         this.fG = false;
      }

      i = -1;
      this.hI = -1;
   }

   public Client() {
      this.b = NumberFormat.getNumberInstance(Locale.US);
      this.ak = false;
      this.al = false;
      this.am = 0;
      this.an = 0;
      this.ao = false;
      this.ap = 0;
      this.aq = 0;
      this.ar = q / 2;
      this.as = r / 2;
      this.at = false;
      this.au = true;
      this.av = 0.8D;
      this.e = false;
      this.aC = 0;
      this.aP = 0;
      this.cM = new int[]{16776960, 16711680, '\uff00', '\uffff', 16711935, 16777215};
      this.eG = 3;
      this.eI = 765;
      this.eJ = 503;
      this.eK = true;
      this.eM = 1000;
      this.fe = "";
      this.fZ = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
      this.gJ = 256;

      try {
         if(Class4.a()) {
            this.gK = new MidiPlayer();
         }

         this.E = new Overlays(this);
      } catch (Exception var2) {
         var2.printStackTrace();
      }

      this.hI = -1;
      this.e(0);
      this.az = new int[500];
      this.aA = new boolean[500];
      this.aB = 0;
      this.f = 0;
      this.g = 0;
      this.h = 0;
      this.ah = -1;
      this.ai = 0;
      hG = "208.100.19.199";
      this.aK = new int[104][104];
      this.aL = new int[200];
      this.aM = new LinkedList[4][104][104];
      this.aN = false;
      this.aQ = new Buffer(new byte[5000]);
      this.aR = new Npc[16384];
      this.aT = new int[16384];
      this.aV = new int[1000];
      this.bb = Buffer.a();
      this.bc = true;
      i = -1;
      this.bp = new int[25];
      this.bs = false;
      this.bt = new int[5];
      this.bu = new boolean[5];
      this.bz = false;
      this.bA = "";
      this.bB = -1;
      this.bC = false;
      this.bE = "";
      this.bF = 2048;
      this.bG = 2047;
      this.bH = new Player[2048];
      this.bJ = new int[2048];
      this.bL = new int[2048];
      this.bM = new Buffer[2048];
      this.bR = new int[104][104];
      this.bS = new byte[16384];
      this.bZ = new int[25];
      this.cC = new long[100];
      this.cD = new int[100];
      this.cb = new long[100];
      this.cc = false;
      this.cd = new int[5];
      this.ce = new int[104][104];
      this.cn = new int[500];
      this.co = new String[500];
      this.cp = new String[500];
      this.cq = new String[500];
      this.ct = new Sprite[15];
      this.j = new Sprite[22];
      this.cA = true;
      this.cB = new long[200];
      this.cE = -1;
      this.cJ = false;
      this.cK = -1;
      this.cL = -1;
      this.cN = new int[33];
      this.l = new Index[5];
      this.m = new int[2000];
      this.cO = false;
      this.cP = 50;
      this.cQ = new int[50];
      this.cR = new int[50];
      this.cS = new int[50];
      this.cT = new int[50];
      this.cU = new int[50];
      this.cV = new int[50];
      this.cW = new int[50];
      this.cX = new String[50];
      this.cZ = -1;
      this.db = new Sprite[20];
      this.dd = new int[5];
      this.de = false;
      this.dm = "";
      this.du = new LinkedList();
      this.dy = false;
      this.dz = -1;
      this.dG = new int[5];
      this.dH = false;
      this.dI = new Sprite[100];
      this.dP = -1;
      this.dQ = new int[25];
      this.dR = new int[2000];
      this.dT = true;
      this.dX = new int[152];
      this.gL = new int[152];
      this.dZ = -1;
      this.eb = new LinkedList();
      this.ec = new int[33];
      this.ed = new Widget();
      this.ee = new IndexedImage[100];
      this.eg = 5063219;
      this.ei = new int[7];
      this.eo = new int[1000];
      this.ep = new int[1000];
      this.ex = false;
      this.ey = new String[200];
      this.ez = Buffer.a();
      this.eN = new int[9];
      this.eO = new int[500];
      this.eP = new int[500];
      this.eQ = new int[500];
      this.eR = new int[500];
      this.eT = new Sprite[20];
      this.eU = new Sprite[20];
      this.eV = new Sprite[20];
      fc = false;
      this.fq = "";
      this.ft = new String[5];
      this.fu = new boolean[5];
      this.fv = new int[4][13][13];
      this.fD = new Sprite[1000];
      this.fE = false;
      this.fG = false;
      this.fH = new Sprite[8];
      fI = true;
      this.w = false;
      this.fN = false;
      this.fO = false;
      this.fP = false;
      this.fY = false;
      this.ga = -1;
      this.gb = new LinkedList();
      this.gg = 128;
      this.gl = -1;
      this.go = Buffer.a();
      this.gs = new String[500];
      this.gv = new int[5];
      this.gw = new int[50];
      B = 78;
      this.gy = "";
      this.gD = new IndexedImage[2];
      C = 3;
      D = false;
      this.gI = true;
      this.gM = new CollisionMap[4];
      this.gQ = new int[50];
      this.gR = false;
      this.gZ = new int[50];
      this.ha = new int[50];
      this.hc = false;
      this.he = false;
      this.hf = false;
      this.hn = "";
      this.ho = "";
      this.hv = -1;
      this.hx = new int[4000];
      this.hy = new int[4000];
   }

   public final int[] j() {
      return this.bp;
   }

   private void Z() {
      if(super.N == null) {
         this.fT = null;
         this.fR = null;
         this.fQ = null;
         this.fS = null;
         this.fs = null;
         this.ff = null;
         this.fg = null;
         this.fh = null;
         this.fi = null;
         this.fj = null;
         this.fk = null;
         this.fl = null;
         this.fm = null;
         this.fn = null;
         super.N = new ProducingGraphicsBuffer(q, r, this.e());
         this.he = true;
      }
   }

   private void e(String var1) {
      String var2 = System.getProperty("os.name");

      try {
         if(var2.startsWith("Mac OS")) {
            Class.forName("com.apple.eio.FileManager").getDeclaredMethod("openURL", new Class[]{String.class}).invoke((Object)null, new Object[]{var1});
         } else if(var2.startsWith("Windows")) {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + var1);
         } else {
            String[] var6 = new String[]{"firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape", "safari"};
            String var3 = null;

            for(int var4 = 0; var4 < 7 && var3 == null; ++var4) {
               if(Runtime.getRuntime().exec(new String[]{"which", var6[var4]}).waitFor() == 0) {
                  var3 = var6[var4];
               }
            }

            if(var3 == null) {
               throw new Exception("Could not find web browser");
            } else {
               Runtime.getRuntime().exec(new String[]{var3, var1});
            }
         }
      } catch (Exception var5) {
         this.a("Failed to open URL.", 0, "");
      }
   }
}
