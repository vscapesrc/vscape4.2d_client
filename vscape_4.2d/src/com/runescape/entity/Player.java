package com.runescape.entity;
import com.runescape.Client;
import com.runescape.cache.anim.Animation;
import com.runescape.cache.anim.Frame;
import com.runescape.cache.anim.SpotAnimation;
import com.runescape.cache.def.ActorDefinition;
import com.runescape.cache.def.ObjectDefinition;
import com.runescape.data.Cache;
import com.runescape.entity.model.IdentityKit;
import com.runescape.entity.model.Model;
import com.runescape.stream.Buffer;
import com.runescape.utils.StringUtils;

public final class Player extends Actor {
   public int ad;
   private long aK = -1L;
   public ActorDefinition ae;
   public boolean af = false;
   public final int[] ag = new int[5];
   public int ah;
   private int aL;
   public String ai;
   public static Cache aj = new Cache(260);
   public int ak;
   public int al;
   public int am;
   public int an;
   public int ao;
   public int ap;
   public int aq;
   public boolean ar = false;
   public int as;
   public int at;
   public int au;
   public Model av;
   public final int[] aw = new int[12];
   private long aM;
   public int ax;
   public int ay;
   public int az;
   public int aA;
   public int aB;
   public boolean aC = false;

   public final Model a() {
      if(!this.ar) {
         return null;
      } else {
         Model var1;
         if((var1 = this.d()) == null) {
            return null;
         } else {
            super.h = var1.aE;
            var1.w = true;
            if(this.af) {
               return var1;
            } else {
               if(super.s != -1 && super.t != -1) {
                  SpotAnimation var2;
                  Model var3;
                  if((var3 = (var2 = SpotAnimation.a[super.s]).a()) == null) {
                     return null;
                  }

                  (var3 = new Model(true, Frame.b(super.t), false, var3)).a(0, -super.w, 0);
                  var3.d();
                  var3.c(var2.b.c[super.t]);
                  var3.v = null;
                  var3.u = null;
                  if(var2.c != 128 || var2.d != 128) {
                     var3.b(var2.c, var2.c, var2.d);
                  }

                  var3.a(64 + var2.f, 850 + var2.g, -30, -50, -30, true);
                  Model[] var4 = new Model[]{var1, var3};
                  var1 = new Model(var4);
               }

               if(this.av != null) {
                  if(Client.x >= this.ap) {
                     this.av = null;
                  }

                  if(Client.x >= this.ao && Client.x < this.ap) {
                     Model var5 = this.av;
                     this.av.a(this.as - super.V, this.at - this.aq, this.au - super.W);
                     if(super.i == 512) {
                        var5.e();
                        var5.e();
                        var5.e();
                     } else if(super.i == 1024) {
                        var5.e();
                        var5.e();
                     } else if(super.i == 1536) {
                        var5.e();
                     }

                     Model[] var6 = new Model[]{var1, var5};
                     var1 = new Model(var6);
                     if(super.i == 512) {
                        var5.e();
                     } else if(super.i == 1024) {
                        var5.e();
                        var5.e();
                     } else if(super.i == 1536) {
                        var5.e();
                        var5.e();
                        var5.e();
                     }

                     var5.a(super.V - this.as, this.aq - this.at, super.W - this.au);
                  }
               }

               var1.w = true;
               return var1;
            }
         }
      }
   }

   public final void a(Buffer var1) {
      var1.b = 0;
      this.aL = var1.e();
      this.al = var1.e();
      this.am = var1.e();
      this.ae = null;
      this.ah = 0;

      int var2;
      int var3;
      for(var2 = 0; var2 < 12; ++var2) {
         if((var3 = var1.e()) == 0) {
            this.aw[var2] = 0;
         } else {
            int var4 = var1.e();
            this.aw[var2] = (var3 << 8) + var4;
            if(var2 == 0 && this.aw[0] == '\uffff') {
               this.ae = ActorDefinition.a(var1.g());
               break;
            }

            if(this.aw[var2] >= 512 && this.aw[var2] - 512 < ObjectDefinition.E && (var3 = ObjectDefinition.a(this.aw[var2] - 512).D) != 0) {
               this.ah = var3;
            }
         }
      }

      for(var2 = 0; var2 < 5; ++var2) {
         if((var3 = var1.e()) < 0 || var3 >= Client.n[var2].length) {
            var3 = 0;
         }

         this.ag[var2] = var3;
      }

      super.j = var1.g();
      if(super.j == '\uffff') {
         super.j = -1;
      }

      super.k = var1.g();
      if(super.k == '\uffff') {
         super.k = -1;
      }

      super.Z = var1.g();
      if(super.Z == '\uffff') {
         super.Z = -1;
      }

      super.aa = var1.g();
      if(super.aa == '\uffff') {
         super.aa = -1;
      }

      super.ab = var1.g();
      if(super.ab == '\uffff') {
         super.ab = -1;
      }

      super.ac = var1.g();
      if(super.ac == '\uffff') {
         super.ac = -1;
      }

      super.f = var1.g();
      if(super.f == '\uffff') {
         super.f = -1;
      }

      this.ai = StringUtils.c(StringUtils.a(var1.k()));
      this.ak = var1.e();
      this.aB = var1.g();
      this.aC = var1.e() == 1;
      this.ar = true;
      this.aM = 0L;

      for(var2 = 0; var2 < 12; ++var2) {
         this.aM <<= 4;
         if(this.aw[var2] >= 256) {
            this.aM += (long)(this.aw[var2] - 256);
         }
      }

      if(this.aw[0] >= 256) {
         this.aM += (long)(this.aw[0] - 256 >> 4);
      }

      if(this.aw[1] >= 256) {
         this.aM += (long)(this.aw[1] - 256 >> 8);
      }

      for(var2 = 0; var2 < 5; ++var2) {
         this.aM <<= 3;
         this.aM += (long)this.ag[var2];
      }

      this.aM <<= 1;
      this.aM += (long)this.aL;
   }

   public final Model d() {
      if(this.ae != null) {
         int var1 = -1;
         if(super.y >= 0 && super.B == 0) {
            var1 = Animation.a[super.y].c[super.z];
         } else if(super.p >= 0) {
            var1 = Animation.a[super.p].c[super.q];
         }

         return this.ae.a(-1, var1, (int[])null);
      } else {
         long var3 = this.aM;
         int var5 = -1;
         int var6 = -1;
         int var7 = -1;
         int var8 = -1;
         if(super.y >= 0 && super.B == 0) {
            Animation var9;
            var5 = (var9 = Animation.a[super.y]).c[super.z];
            if(super.p >= 0 && super.p != super.j) {
               var6 = Animation.a[super.p].c[super.q];
            }

            if(var9.i >= 0) {
               var7 = var9.i;
               var3 += (long)(var7 - this.aw[5] << 40);
            }

            if(var9.j >= 0) {
               var8 = var9.j;
               var3 += (long)(var8 - this.aw[3] << 48);
            }
         } else if(super.p >= 0) {
            var5 = Animation.a[super.p].c[super.q];
         }

         int var11;
         int var12;
         int var13;
         ObjectDefinition var14;
         int var15;
         ObjectDefinition var10000;
         int var16;
         int var17;
         Model var19;
         if((var19 = (Model)aj.a(var3)) == null) {
            boolean var10 = false;

            for(var11 = 0; var11 < 12; ++var11) {
               var12 = this.aw[var11];
               if(var8 >= 0 && var11 == 3) {
                  var12 = var8;
               }

               if(var7 >= 0 && var11 == 5) {
                  var12 = var7;
               }

               if(var12 >= 256 && var12 < 512 && !IdentityKit.b[var12 - 256].a()) {
                  var10 = true;
               }

               if(var12 >= 512) {
                  var10000 = ObjectDefinition.a(var12 - 512);
                  var13 = this.aL;
                  var14 = var10000;
                  var15 = var10000.l;
                  var16 = var14.w;
                  var17 = var14.v;
                  if(var13 == 1) {
                     var15 = var14.C;
                     var16 = var14.k;
                     var17 = var14.i;
                  }

                  boolean var25;
                  if(var15 == -1) {
                     var25 = true;
                  } else {
                     boolean var18 = true;
                     if(!Model.b(var15)) {
                        var18 = false;
                     }

                     if(var16 != -1 && !Model.b(var16)) {
                        var18 = false;
                     }

                     if(var17 != -1 && !Model.b(var17)) {
                        var18 = false;
                     }

                     var25 = var18;
                  }

                  if(!var25) {
                     var10 = true;
                  }
               }
            }

            if(var10) {
               if(this.aK != -1L) {
                  var19 = (Model)aj.a(this.aK);
               }

               if(var19 == null) {
                  return null;
               }
            }
         }

         if(var19 == null) {
            Model[] var21 = new Model[12];
            var11 = 0;

            for(var12 = 0; var12 < 12; ++var12) {
               int var20 = this.aw[var12];
               if(var8 >= 0 && var12 == 3) {
                  var20 = var8;
               }

               if(var7 >= 0 && var12 == 5) {
                  var20 = var7;
               }

               Model var24;
               if(var20 >= 256 && var20 < 512 && (var24 = IdentityKit.b[var20 - 256].b()) != null) {
                  var21[var11++] = var24;
               }

               if(var20 >= 512) {
                  var10000 = ObjectDefinition.a(var20 - 512);
                  var13 = this.aL;
                  var14 = var10000;
                  var15 = var10000.l;
                  var16 = var14.w;
                  var17 = var14.v;
                  if(var13 == 1) {
                     var15 = var14.C;
                     var16 = var14.k;
                     var17 = var14.i;
                  }

                  Model var28;
                  if(var15 == -1) {
                     var28 = null;
                  } else {
                     Model var29 = Model.a(var15);
                     if(var16 != -1) {
                        if(var17 != -1) {
                           var19 = Model.a(var16);
                           Model var26 = Model.a(var17);
                           Model[] var23 = new Model[]{var29, var19, var26};
                           var29 = new Model(3, var23);
                        } else {
                           var19 = Model.a(var16);
                           Model[] var27 = new Model[]{var29, var19};
                           var29 = new Model(2, var27);
                        }
                     }

                     if(var13 == 0 && var14.F != 0) {
                        var29.a(0, var14.F, 0);
                     }

                     if(var13 == 1 && var14.a != 0) {
                        var29.a(0, var14.a, 0);
                     }

                     if(var14.g != null) {
                        for(var20 = 0; var20 < var14.g.length; ++var20) {
                           var29.a(var14.g[var20], var14.c[var20]);
                        }
                     }

                     var28 = var29;
                  }

                  var24 = var28;
                  if(var28 != null) {
                     var21[var11++] = var24;
                  }
               }
            }

            var19 = new Model(var11, var21);

            for(var12 = 0; var12 < 5; ++var12) {
               if(this.ag[var12] != 0) {
                  var19.a(Client.n[var12][0], Client.n[var12][this.ag[var12]]);
                  if(var12 == 1) {
                     var19.a(Client.A[0], Client.A[this.ag[var12]]);
                  }
               }
            }

            var19.d();
            var19.a(84, 1000, -90, -580, -90, true);
            aj.a(var19, var3);
            this.aK = var3;
         }

         if(this.af) {
            return var19;
         } else {
            Model var22;
            (var22 = Model.a).a(var19, Frame.b(var5) & Frame.b(var6));
            if(var5 != -1 && var6 != -1) {
               var22.a(Animation.a[super.y].f, var6, var5);
            } else if(var5 != -1) {
               var22.c(var5);
            }

            var22.c();
            var22.v = null;
            var22.u = null;
            return var22;
         }
      }
   }

   public final boolean c() {
      return this.ar;
   }

   public final Model e() {
      if(!this.ar) {
         return null;
      } else if(this.ae != null) {
         return this.ae.a();
      } else {
         boolean var1 = false;

         int var3;
         int var4;
         ObjectDefinition var5;
         int var6;
         int var7;
         ObjectDefinition var10000;
         for(int var2 = 0; var2 < 12; ++var2) {
            if((var3 = this.aw[var2]) >= 256 && var3 < 512 && !IdentityKit.b[var3 - 256].c()) {
               var1 = true;
            }

            if(var3 >= 512) {
               var10000 = ObjectDefinition.a(var3 - 512);
               var4 = this.aL;
               var5 = var10000;
               var6 = var10000.q;
               var7 = var5.m;
               if(var4 == 1) {
                  var6 = var5.A;
                  var7 = var5.p;
               }

               boolean var16;
               if(var6 == -1) {
                  var16 = true;
               } else {
                  boolean var11 = true;
                  if(!Model.b(var6)) {
                     var11 = false;
                  }

                  if(var7 != -1 && !Model.b(var7)) {
                     var11 = false;
                  }

                  var16 = var11;
               }

               if(!var16) {
                  var1 = true;
               }
            }
         }

         if(var1) {
            return null;
         } else {
            Model[] var9 = new Model[12];
            var3 = 0;

            int var12;
            for(int var8 = 0; var8 < 12; ++var8) {
               Model var13;
               if((var12 = this.aw[var8]) >= 256 && var12 < 512) {
                  var13 = IdentityKit.b[var12 - 256].d();
                  var9[var3++] = var13;
               }

               if(var12 >= 512) {
                  var10000 = ObjectDefinition.a(var12 - 512);
                  var4 = this.aL;
                  var5 = var10000;
                  var6 = var10000.q;
                  var7 = var5.m;
                  if(var4 == 1) {
                     var6 = var5.A;
                     var7 = var5.p;
                  }

                  Model var17;
                  if(var6 == -1) {
                     var17 = null;
                  } else {
                     var13 = Model.a(var6);
                     if(var7 != -1) {
                        Model var15 = Model.a(var7);
                        Model[] var14 = new Model[]{var13, var15};
                        var13 = new Model(2, var14);
                     }

                     if(var5.g != null) {
                        for(var6 = 0; var6 < var5.g.length; ++var6) {
                           var13.a(var5.g[var6], var5.c[var6]);
                        }
                     }

                     var17 = var13;
                  }

                  var13 = var17;
                  if(var17 != null) {
                     var9[var3++] = var13;
                  }
               }
            }

            Model var10 = new Model(var3, var9);

            for(var12 = 0; var12 < 5; ++var12) {
               if(this.ag[var12] != 0) {
                  var10.a(Client.n[var12][0], Client.n[var12][this.ag[var12]]);
                  if(var12 == 1) {
                     var10.a(Client.A[0], Client.A[this.ag[var12]]);
                  }
               }
            }

            return var10;
         }
      }
   }
}
