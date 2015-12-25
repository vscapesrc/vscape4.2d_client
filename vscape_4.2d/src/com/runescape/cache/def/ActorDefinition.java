package com.runescape.cache.def;
import com.runescape.Client;
import com.runescape.cache.Archive;
import com.runescape.cache.anim.Frame;
import com.runescape.data.Cache;
import com.runescape.entity.model.Model;
import com.runescape.stream.Buffer;
import com.runescape.var.VarBits;

public final class ActorDefinition {
   public static int a;
   public int b;
   public int c = -1;
   private static int u;
   private int v = -1;
   public int d = -1;
   private int w = -1;
   private static Buffer x;
   public int e = -1;
   public String f;
   public String[] g;
   public int h = -1;
   public byte i = 1;
   private int[] y;
   private static int[] z;
   private int[] A;
   public int j = -1;
   private int[] B;
   public int k = -1;
   public long l = -1L;
   public int m = 32;
   private static ActorDefinition[] C;
   public static Client n;
   public int o = -1;
   public boolean p = true;
   private int D;
   private int E = 128;
   public boolean q = true;
   public int[] r;
   private int F = 128;
   private int G;
   public boolean s = false;
   private int[] H;
   public static Cache t = new Cache(30);

   public static ActorDefinition a(int var0) {
      for(int var1 = 0; var1 < 20; ++var1) {
         if(C[var1].l == (long)var0) {
            return C[var1];
         }
      }

      u = (u + 1) % 20;
      ActorDefinition var6 = C[u] = new ActorDefinition();
      x.b = z[var0];
      var6.b = var0;
      var6.l = (long)var0;
      Buffer var2 = x;
      ActorDefinition var3 = var6;

      while(true) {
         int var4;
         while((var4 = var2.e()) != 0) {
            int var5;
            if(var4 == 1) {
               var4 = var2.e();
               var3.H = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  var3.H[var5] = var2.g();
               }
            } else if(var4 == 2) {
               var3.f = var2.d();
            } else if(var4 == 3) {
               var2.m();
            } else if(var4 == 12) {
               var3.i = var2.f();
            } else if(var4 == 13) {
               var3.k = var2.g();
            } else if(var4 == 14) {
               var3.h = var2.g();
            } else if(var4 == 17) {
               var3.h = var2.g();
               var3.d = var2.g();
               var3.o = var2.g();
               var3.c = var2.g();
            } else if(var4 >= 30 && var4 < 40) {
               if(var3.g == null) {
                  var3.g = new String[5];
               }

               var3.g[var4 - 30] = var2.d();
               if(var3.g[var4 - 30].equalsIgnoreCase("hidden")) {
                  var3.g[var4 - 30] = null;
               }
            } else if(var4 == 40) {
               var4 = var2.e();
               var3.B = new int[var4];
               var3.y = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  var3.B[var5] = var2.g();
                  var3.y[var5] = var2.g();
               }
            } else if(var4 == 60) {
               var4 = var2.e();
               var3.A = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  var3.A[var5] = var2.g();
               }
            } else if(var4 == 90) {
               var2.g();
            } else if(var4 == 91) {
               var2.g();
            } else if(var4 == 92) {
               var2.g();
            } else if(var4 == 93) {
               var3.q = false;
            } else if(var4 == 95) {
               var3.e = var2.g();
            } else if(var4 == 97) {
               var3.F = var2.g();
            } else if(var4 == 98) {
               var3.E = var2.g();
            } else if(var4 == 99) {
               var3.s = true;
            } else if(var4 == 100) {
               var3.D = var2.f();
            } else if(var4 == 101) {
               var3.G = var2.f() * 5;
            } else if(var4 == 102) {
               var3.j = var2.g();
            } else if(var4 == 103) {
               var3.m = var2.g();
            } else if(var4 == 106) {
               var3.v = var2.g();
               if(var3.v == '\uffff') {
                  var3.v = -1;
               }

               var3.w = var2.g();
               if(var3.w == '\uffff') {
                  var3.w = -1;
               }

               var4 = var2.e();
               var3.r = new int[var4 + 1];

               for(var5 = 0; var5 <= var4; ++var5) {
                  var3.r[var5] = var2.g();
                  if(var3.r[var5] == '\uffff') {
                     var3.r[var5] = -1;
                  }
               }
            } else if(var4 == 107) {
               var3.p = false;
            }
         }

         switch(var0) {
         case 26:
            var6.k = 808;
            break;
         case 2028:
            var6.k = 2074;
            break;
         case 6142:
         case 6143:
         case 6144:
         case 6145:
         case 6146:
         case 6147:
         case 6148:
         case 6149:
         case 6150:
         case 6151:
         case 6152:
         case 6153:
         case 6154:
         case 6155:
         case 6156:
         case 6157:
            var6.q = false;
         }

         return var6;
      }
   }

   public final Model a() {
	  ActorDefinition this_ = this;
	  
      while(this_.r != null) {
         ActorDefinition var1;
         if((var1 = this_.b()) == null) {
            return null;
         }

         this_ = var1;
      }

      if(this_.A == null) {
         return null;
      } else {
         boolean var3 = false;

         int var2;
         for(var2 = 0; var2 < this_.A.length; ++var2) {
            if(!Model.b(this_.A[var2])) {
               var3 = true;
            }
         }

         if(var3) {
            return null;
         } else {
            Model[] var5 = new Model[this_.A.length];

            for(int var4 = 0; var4 < this_.A.length; ++var4) {
               var5[var4] = Model.a(this_.A[var4]);
            }

            Model var6;
            if(var5.length == 1) {
               var6 = var5[0];
            } else {
               var6 = new Model(var5.length, var5);
            }

            if(this_.B != null) {
               for(var2 = 0; var2 < this_.B.length; ++var2) {
                  var6.a(this_.B[var2], this_.y[var2]);
               }
            }

            return var6;
         }
      }
   }

   public final ActorDefinition b() {
      int var1 = -1;
      if(this.v != -1) {
         VarBits var4;
         int var2 = (var4 = VarBits.a[this.v]).b;
         int var3 = var4.c;
         var1 = var4.d;
         var1 = Client.F[var1 - var3];
         var1 &= n.m[var2] >> var3;
      } else if(this.w != -1) {
         var1 = n.m[this.w];
      }

      return var1 >= 0 && var1 < this.r.length && this.r[var1] != -1?a(this.r[var1]):null;
   }

   public static void a(Archive var0) {
      x = new Buffer(var0.a("npc.dat"));
      Buffer var3;
      z = new int[a = (var3 = new Buffer(var0.a("npc.idx"))).g()];
      int var1 = 2;

      int var2;
      for(var2 = 0; var2 < a; ++var2) {
         z[var2] = var1;
         var1 += var3.g();
      }

      C = new ActorDefinition[20];

      for(var2 = 0; var2 < 20; ++var2) {
         C[var2] = new ActorDefinition();
      }

      for(var2 = 0; var2 < a; ++var2) {
         a(var2);
      }

   }

   public static void c() {
      t = null;
      z = null;
      C = null;
      x = null;
   }

   public final Model a(int var1, int var2, int[] var3) {
      ActorDefinition this_ = this;
	   
	   while(this_.r != null) {
         ActorDefinition var4;
         if((var4 = this_.b()) == null) {
            return null;
         }

         var2 = var2;
         var1 = var1;
         this_ = var4;
      }

      Model var6;
      if((var6 = (Model)t.a(this_.l)) == null) {
         boolean var5 = false;

         for(int var7 = 0; var7 < this_.H.length; ++var7) {
            if(!Model.b(this_.H[var7])) {
               var5 = true;
            }
         }

         if(var5) {
            return null;
         }

         Model[] var8 = new Model[this_.H.length];

         int var9;
         for(var9 = 0; var9 < this_.H.length; ++var9) {
            var8[var9] = Model.a(this_.H[var9]);
         }

         if(var8.length == 1) {
            var6 = var8[0];
         } else {
            var6 = new Model(var8.length, var8);
         }

         if(this_.B != null) {
            for(var9 = 0; var9 < this_.B.length; ++var9) {
               var6.a(this_.B[var9], this_.y[var9]);
            }
         }

         var6.d();
         var6.a(64 + this_.D, 850 + this_.G, -30, -50, -30, true);
         t.a(var6, this_.l);
      }

      Model var10;
      (var10 = Model.a).a(var6, Frame.b(var2) & Frame.b(var1));
      if(var2 != -1 && var1 != -1) {
         var10.a(var3, var1, var2);
      } else if(var2 != -1) {
         var10.c(var2);
      }

      if(this_.F != 128 || this_.E != 128) {
         var10.b(this_.F, this_.F, this_.E);
      }

      var10.c();
      var10.v = null;
      var10.u = null;
      if(this_.i == 1) {
         var10.w = true;
      }

      return var10;
   }
}
