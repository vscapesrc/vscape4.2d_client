package com.runescape.a.c;
import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

import javax.swing.ImageIcon;

import com.runescape.a.Archive;
import com.runescape.b.Rasterizer2D;
import com.runescape.d.Buffer;
import com.runescape.i.SignLink;

public final class Sprite extends Rasterizer2D {
   private String f = SignLink.a() + "sprites/";
   public int[] a;
   public int b;
   public int c;
   private int g;
   private int r;
   public int d;
   public int e;

   public Sprite(int var1, int var2) {
      this.a = new int[var1 * var2];
      this.b = this.d = var1;
      this.c = this.e = var2;
      this.g = this.r = 0;
   }

   public Sprite(byte[] var1, Component var2) {
      try {
         Image var5 = Toolkit.getDefaultToolkit().createImage(var1);
         MediaTracker var3;
         (var3 = new MediaTracker(var2)).addImage(var5, 0);
         var3.waitForAll();
         this.b = var5.getWidth(var2);
         this.c = var5.getHeight(var2);
         this.d = this.b;
         this.e = this.c;
         this.g = 0;
         this.r = 0;
         this.a = new int[this.b * this.c];
         (new PixelGrabber(var5, 0, 0, this.b, this.c, this.a, 0, this.b)).grabPixels();
      } catch (Exception var4) {
         System.out.println("Error converting jpg");
      }
   }

   public Sprite(String var1) {
      try {
         Image var4 = Toolkit.getDefaultToolkit().getImage(this.f + var1 + ".png");
         ImageIcon var2 = new ImageIcon(var4);
         this.b = var2.getIconWidth();
         this.c = var2.getIconHeight();
         this.d = this.b;
         this.e = this.c;
         this.g = 0;
         this.r = 0;
         this.a = new int[this.b * this.c];
         (new PixelGrabber(var4, 0, 0, this.b, this.c, this.a, 0, this.b)).grabPixels();
         this.d(255, 0, 255);
      } catch (Exception var3) {
         System.out.println(var3);
      }
   }

   public final void a(int var1, int var2) {
      boolean var16 = true;
      int var3 = var2;
      var2 = var1 + this.g;
      var3 += this.r;
      int var4 = var2 + var3 * Rasterizer2D.i;
      int var5 = 0;
      int var6 = this.c;
      int var7 = this.b;
      int var8 = Rasterizer2D.i - var7;
      int var9 = 0;
      int var10;
      if(var3 < Rasterizer2D.k) {
         var10 = Rasterizer2D.k - var3;
         var6 -= var10;
         var3 = Rasterizer2D.k;
         var5 = 0 + var10 * var7;
         var4 += var10 * Rasterizer2D.i;
      }

      if(var3 + var6 > Rasterizer2D.l) {
         var6 -= var3 + var6 - Rasterizer2D.l;
      }

      if(var2 < Rasterizer2D.m) {
         var10 = Rasterizer2D.m - var2;
         var7 -= var10;
         var2 = Rasterizer2D.m;
         var5 += var10;
         var4 += var10;
         var9 = var10 + 0;
         var8 += var10;
      }

      if(var2 + var7 > Rasterizer2D.n) {
         var10 = var2 + var7 - Rasterizer2D.n;
         var7 -= var10;
         var9 += var10;
         var8 += var10;
      }

      if(var7 > 0 && var6 > 0) {
         int var10002 = var6;
         var10 = var8;
         var9 = var9;
         var8 = var5;
         short var20 = 256;
         var6 = var4;
         int[] var19 = Rasterizer2D.h;
         int[] var18 = this.a;
         var3 = var10002;
         var2 = var7;
         Sprite var17 = this;
         short var11 = var20;

         for(int var12 = -var3; var12 < 0; ++var12) {
            for(int var13 = -var2; var13 < 0; ++var13) {
               var7 = var17.a[var8] >> 24 & var11 - 1;
               int var14;
               if((var14 = 256 - var7) > 256) {
                  var7 = 0;
               }

               if(var11 == 0) {
                  var14 = 256;
                  var7 = 0;
               }

               if((var3 = var18[var8++]) != 0) {
                  int var15 = var19[var6];
                  var19[var6++] = ((var3 & 16711935) * var7 + (var15 & 16711935) * var14 & -16711936) + ((var3 & '\uff00') * var7 + (var15 & '\uff00') * var14 & 16711680) >> 8;
               } else {
                  ++var6;
               }
            }

            var6 += var10;
            var8 += var9;
         }
      }

   }

   public final void b(int var1, int var2) {
      var1 += this.g;
      var2 += this.r;
      int var3 = var1 + var2 * Rasterizer2D.i;
      int var4 = 0;
      int var5 = this.c;
      int var6 = this.b;
      int var7 = Rasterizer2D.i - var6;
      int var8 = 0;
      int var9;
      if(var2 < Rasterizer2D.k) {
         var9 = Rasterizer2D.k - var2;
         var5 -= var9;
         var2 = Rasterizer2D.k;
         var4 = 0 + var9 * var6;
         var3 += var9 * Rasterizer2D.i;
      }

      if(var2 + var5 > Rasterizer2D.l) {
         var5 -= var2 + var5 - Rasterizer2D.l;
      }

      if(var1 < Rasterizer2D.m) {
         var9 = Rasterizer2D.m - var1;
         var6 -= var9;
         var1 = Rasterizer2D.m;
         var4 += var9;
         var3 += var9;
         var8 = var9 + 0;
         var7 += var9;
      }

      if(var1 + var6 > Rasterizer2D.n) {
         var9 = var1 + var6 - Rasterizer2D.n;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if(var6 > 0 && var5 > 0) {
         int var10001 = var6;
         var9 = var8;
         var8 = var7;
         var7 = var4;
         var6 = var3;
         int[] var17 = this.a;
         int[] var16 = Rasterizer2D.h;
         var2 = var10001;
         Sprite var15 = this;

         for(int var10 = -var5; var10 < 0; ++var10) {
            for(int var11 = -var2; var11 < 0; ++var11) {
               var3 = var15.a[var7] >>> 24;
               int var12 = 256 - var3;
               int var13;
               if((var13 = var17[var7++]) != 0 && var13 != 16777215) {
                  int var14 = var16[var6];
                  var16[var6++] = ((var13 & 16711935) * var3 + (var14 & 16711935) * var12 & -16711936) + ((var13 & '\uff00') * var3 + (var14 & '\uff00') * var12 & 16711680) >> 8;
               } else {
                  ++var6;
               }
            }

            var6 += var8;
            var7 += var9;
         }
      }

   }

   public final void a(int var1, int var2, int var3) {
      var1 += this.g;
      var2 += this.r;
      int var4 = var1 + var2 * Rasterizer2D.i;
      int var5 = 0;
      int var6 = this.c;
      int var7 = this.b;
      int var8 = Rasterizer2D.i - var7;
      int var9 = 0;
      int var10;
      if(var2 < Rasterizer2D.k) {
         var10 = Rasterizer2D.k - var2;
         var6 -= var10;
         var2 = Rasterizer2D.k;
         var5 = 0 + var10 * var7;
         var4 += var10 * Rasterizer2D.i;
      }

      if(var2 + var6 > Rasterizer2D.l) {
         var6 -= var2 + var6 - Rasterizer2D.l;
      }

      if(var1 < Rasterizer2D.m) {
         var10 = Rasterizer2D.m - var1;
         var7 -= var10;
         var1 = Rasterizer2D.m;
         var5 += var10;
         var4 += var10;
         var9 = var10 + 0;
         var8 += var10;
      }

      if(var1 + var7 > Rasterizer2D.n) {
         var10 = var1 + var7 - Rasterizer2D.n;
         var7 -= var10;
         var9 += var10;
         var8 += var10;
      }

      if(var7 > 0 && var6 > 0) {
         a(var5, var7, Rasterizer2D.h, this.a, var9, var6, var8, var3, var4);
      }

   }

   private void d(int var1, int var2, int var3) {
      for(var1 = 0; var1 < this.a.length; ++var1) {
         if((this.a[var1] >> 16 & 255) == 255 && (this.a[var1] >> 8 & 255) == 0 && (this.a[var1] & 255) == 255) {
            this.a[var1] = 0;
         }
      }

   }

   public Sprite(Archive var1, String var2, int var3) {
      Buffer var9 = new Buffer(var1.a(var2 + ".dat"));
      Buffer var7;
      (var7 = new Buffer(var1.a("index.dat"))).b = var9.g();
      this.d = var7.g();
      this.e = var7.g();
      int var4;
      int[] var5 = new int[var4 = var7.e()];

      int var6;
      for(var6 = 0; var6 < var4 - 1; ++var6) {
         var5[var6 + 1] = var7.i();
         if(var5[var6 + 1] == 0) {
            var5[var6 + 1] = 1;
         }
      }

      for(var6 = 0; var6 < var3; ++var6) {
         var7.b += 2;
         var9.b += var7.g() * var7.g();
         ++var7.b;
      }

      this.g = var7.e();
      this.r = var7.e();
      this.b = var7.g();
      this.c = var7.g();
      var6 = var7.e();
      int var8 = this.b * this.c;
      this.a = new int[var8];
      if(var6 == 0) {
         for(var3 = 0; var3 < var8; ++var3) {
            this.a[var3] = var5[var9.e()];
         }

         this.d(255, 0, 255);
      } else {
         if(var6 == 1) {
            for(var3 = 0; var3 < this.b; ++var3) {
               for(var8 = 0; var8 < this.c; ++var8) {
                  this.a[var3 + var8 * this.b] = var5[var9.e()];
               }
            }
         }

         this.d(255, 0, 255);
      }
   }

   public final void b(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.a.length; ++var4) {
         int var5;
         if((var5 = this.a[var4]) != 0) {
            int var6;
            if((var6 = (var5 >> 16 & 255) + var1) <= 0) {
               var6 = 1;
            } else if(var6 > 255) {
               var6 = 255;
            }

            int var7;
            if((var7 = (var5 >> 8 & 255) + var2) <= 0) {
               var7 = 1;
            } else if(var7 > 255) {
               var7 = 255;
            }

            if((var5 = (var5 &= 255) + var3) <= 0) {
               var5 = 1;
            } else if(var5 > 255) {
               var5 = 255;
            }

            this.a[var4] = (var6 << 16) + (var7 << 8) + var5;
         }
      }

   }

   public final void a() {
      int[] var1 = new int[this.d * this.e];

      for(int var2 = 0; var2 < this.c; ++var2) {
         System.arraycopy(this.a, var2 * this.b, var1, var2 + this.r * this.d + this.g, this.b);
      }

      this.a = var1;
      this.b = this.d;
      this.c = this.e;
      this.g = 0;
      this.r = 0;
   }

   public final void c(int var1, int var2) {
      var1 += this.g;
      var2 += this.r;
      int var3 = var1 + var2 * Rasterizer2D.i;
      int var4 = 0;
      int var5 = this.c;
      int var6 = this.b;
      int var7 = Rasterizer2D.i - var6;
      int var8 = 0;
      int var9;
      if(var2 < Rasterizer2D.k) {
         var9 = Rasterizer2D.k - var2;
         var5 -= var9;
         var2 = Rasterizer2D.k;
         var4 = 0 + var9 * var6;
         var3 += var9 * Rasterizer2D.i;
      }

      if(var2 + var5 > Rasterizer2D.l) {
         var5 -= var2 + var5 - Rasterizer2D.l;
      }

      if(var1 < Rasterizer2D.m) {
         var9 = Rasterizer2D.m - var1;
         var6 -= var9;
         var1 = Rasterizer2D.m;
         var4 += var9;
         var3 += var9;
         var8 = var9 + 0;
         var7 += var9;
      }

      if(var1 + var6 > Rasterizer2D.n) {
         var9 = var1 + var6 - Rasterizer2D.n;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if(var6 > 0 && var5 > 0) {
         int var10000 = var3;
         int var10001 = var6;
         int var10002 = var5;
         int[] var12 = Rasterizer2D.h;
         int[] var11 = this.a;
         var6 = var7;
         var5 = var4;
         var4 = var8;
         var3 = var10002;
         var2 = var10001;
         var1 = var10000;
         var9 = -(var2 >> 2);
         var2 = -(var2 & 3);

         for(var3 = -var3; var3 < 0; ++var3) {
            int var10;
            for(var10 = var9; var10 < 0; ++var10) {
               var12[var1++] = var11[var5++];
               var12[var1++] = var11[var5++];
               var12[var1++] = var11[var5++];
               var12[var1++] = var11[var5++];
            }

            for(var10 = var2; var10 < 0; ++var10) {
               var12[var1++] = var11[var5++];
            }

            var1 += var6;
            var5 += var4;
         }
      }

   }

   public final void d(int var1, int var2) {
      var1 += this.g;
      var2 += this.r;
      int var3 = var1 + var2 * Rasterizer2D.i;
      int var4 = 0;
      int var5 = this.c;
      int var6 = this.b;
      int var7 = Rasterizer2D.i - var6;
      int var8 = 0;
      int var9;
      if(var2 < Rasterizer2D.k) {
         var9 = Rasterizer2D.k - var2;
         var5 -= var9;
         var2 = Rasterizer2D.k;
         var4 = 0 + var9 * var6;
         var3 += var9 * Rasterizer2D.i;
      }

      if(var2 + var5 > Rasterizer2D.l) {
         var5 -= var2 + var5 - Rasterizer2D.l;
      }

      if(var1 < Rasterizer2D.m) {
         var9 = Rasterizer2D.m - var1;
         var6 -= var9;
         var1 = Rasterizer2D.m;
         var4 += var9;
         var3 += var9;
         var8 = var9 + 0;
         var7 += var9;
      }

      if(var1 + var6 > Rasterizer2D.n) {
         var9 = var1 + var6 - Rasterizer2D.n;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if(var6 > 0 && var5 > 0) {
         a(var4, var6, Rasterizer2D.h, this.a, var8, var5, var7, 128, var3);
      }

   }

   public final void e(int var1, int var2) {
      var1 += this.g;
      var2 += this.r;
      int var3 = var1 + var2 * Rasterizer2D.i;
      int var4 = 0;
      int var5 = this.c;
      int var6 = this.b;
      int var7 = Rasterizer2D.i - var6;
      int var8 = 0;
      int var9;
      if(var2 < Rasterizer2D.k) {
         var9 = Rasterizer2D.k - var2;
         var5 -= var9;
         var2 = Rasterizer2D.k;
         var4 = 0 + var9 * var6;
         var3 += var9 * Rasterizer2D.i;
      }

      if(var2 + var5 > Rasterizer2D.l) {
         var5 -= var2 + var5 - Rasterizer2D.l;
      }

      if(var1 < Rasterizer2D.m) {
         var9 = Rasterizer2D.m - var1;
         var6 -= var9;
         var1 = Rasterizer2D.m;
         var4 += var9;
         var3 += var9;
         var8 = var9 + 0;
         var7 += var9;
      }

      if(var1 + var6 > Rasterizer2D.n) {
         var9 = var1 + var6 - Rasterizer2D.n;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if(var6 > 0 && var5 > 0) {
         a(Rasterizer2D.h, this.a, var4, var3, var6, var5, var7, var8);
      }

   }

   public final void c(int var1, int var2, int var3) {
      int var4 = this.b + 2;
      int var5 = this.c + 2;
      int[] var6 = new int[var4 * var5];

      int var7;
      int var8;
      for(var7 = 0; var7 < this.b; ++var7) {
         for(var8 = 0; var8 < this.c; ++var8) {
            if(this.a[var7 + var8 * this.b] != 0) {
               var6[var7 + 1 + (var8 + 1) * var4] = this.a[var7 + var8 * this.b];
            }
         }
      }

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = 0; var8 < var5; ++var8) {
            if(var6[var7 + var8 * var4] == 0) {
               if(var7 < var4 - 1 && var6[var7 + 1 + var8 * var4] > 0 && var6[var7 + 1 + var8 * var4] != 16777215) {
                  var6[var7 + var8 * var4] = var3;
               }

               if(var7 > 0 && var6[var7 - 1 + var8 * var4] > 0 && var6[var7 - 1 + var8 * var4] != 16777215) {
                  var6[var7 + var8 * var4] = var3;
               }

               if(var8 < var5 - 1 && var6[var7 + (var8 + 1) * var4] > 0 && var6[var7 + (var8 + 1) * var4] != 16777215) {
                  var6[var7 + var8 * var4] = var3;
               }

               if(var8 > 0 && var6[var7 + (var8 - 1) * var4] > 0 && var6[var7 + (var8 - 1) * var4] != 16777215) {
                  var6[var7 + var8 * var4] = var3;
               }
            }
         }
      }

      --var1;
      --var2;
      var1 += this.g;
      var2 += this.r;
      var7 = var1 + var2 * Rasterizer2D.i;
      var8 = 0;
      var3 = var5;
      var4 = var4;
      var5 = Rasterizer2D.i - var4;
      int var9 = 0;
      int var10;
      if(var2 < Rasterizer2D.k) {
         var10 = Rasterizer2D.k - var2;
         var3 -= var10;
         var2 = Rasterizer2D.k;
         var8 = 0 + var10 * var4;
         var7 += var10 * Rasterizer2D.i;
      }

      if(var2 + var3 > Rasterizer2D.l) {
         var3 -= var2 + var3 - Rasterizer2D.l;
      }

      if(var1 < Rasterizer2D.m) {
         var10 = Rasterizer2D.m - var1;
         var4 -= var10;
         var1 = Rasterizer2D.m;
         var8 += var10;
         var7 += var10;
         var9 = var10 + 0;
         var5 += var10;
      }

      if(var1 + var4 > Rasterizer2D.n) {
         var10 = var1 + var4 - Rasterizer2D.n;
         var4 -= var10;
         var9 += var10;
         var5 += var10;
      }

      if(var4 > 0 && var3 > 0) {
         a(Rasterizer2D.h, var6, var8, var7, var4, var3, var5, var9);
      }

   }

   private static void a(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = -(var4 >> 2);
      var4 = -(var4 & 3);

      for(int var9 = -var5; var9 < 0; ++var9) {
         int var10;
         for(var10 = var8; var10 < 0; ++var10) {
            if((var5 = var1[var2++]) != 0 && var5 != -1) {
               var0[var3++] = var5;
            } else {
               ++var3;
            }

            if((var5 = var1[var2++]) != 0 && var5 != -1) {
               var0[var3++] = var5;
            } else {
               ++var3;
            }

            if((var5 = var1[var2++]) != 0 && var5 != -1) {
               var0[var3++] = var5;
            } else {
               ++var3;
            }

            if((var5 = var1[var2++]) != 0 && var5 != -1) {
               var0[var3++] = var5;
            } else {
               ++var3;
            }
         }

         for(var10 = var4; var10 < 0; ++var10) {
            if((var5 = var1[var2++]) != 0 && var5 != -1) {
               var0[var3++] = var5;
            } else {
               ++var3;
            }
         }

         var3 += var6;
         var2 += var7;
      }

   }

   private static void a(int var0, int var1, int[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = 256 - var7;

      for(int var10 = -var5; var10 < 0; ++var10) {
         for(int var11 = -var1; var11 < 0; ++var11) {
            if((var5 = var3[var0++]) != 0) {
               int var12 = var2[var8];
               var2[var8++] = ((var5 & 16711935) * var7 + (var12 & 16711935) * var9 & -16711936) + ((var5 & '\uff00') * var7 + (var12 & '\uff00') * var9 & 16711680) >> 8;
            } else {
               ++var8;
            }
         }

         var8 += var6;
         var0 += var4;
      }

   }

   public final void a(int var1, int var2, int[] var3, int var4, int[] var5, int var6, int var7, int var8, int var9, int var10) {
      try {
         var9 = -var9 / 2;
         int var11 = -var1 / 2;
         int var12 = (int)(Math.sin((double)var2 / 326.11D) * 65536.0D);
         var2 = (int)(Math.cos((double)var2 / 326.11D) * 65536.0D);
         var12 = var12 * var4 >> 8;
         var2 = var2 * var4 >> 8;
         var4 = (var10 << 16) + var11 * var12 + var9 * var2;
         var6 = (var6 << 16) + (var11 * var2 - var9 * var12);
         var9 = var8 + var7 * Rasterizer2D.i;

         for(var7 = 0; var7 < var1; ++var7) {
            var8 = var5[var7];
            var10 = var9 + var8;
            var11 = var4 + var2 * var8;
            int var13 = var6 - var12 * var8;

            for(var8 = -var3[var7]; var8 < 0; ++var8) {
               Rasterizer2D.h[var10++] = this.a[(var11 >> 16) + (var13 >> 16) * this.b];
               var11 += var2;
               var13 -= var12;
            }

            var4 += var12;
            var6 += var2;
            var9 += Rasterizer2D.i;
         }

      } catch (Exception var14) {
         ;
      }
   }

   public Sprite(byte[] var1) {
      try {
         Image var4 = Toolkit.getDefaultToolkit().createImage(var1);
         ImageIcon var2 = new ImageIcon(var4);
         this.b = var2.getIconWidth();
         this.c = var2.getIconHeight();
         this.d = this.b;
         this.e = this.c;
         this.g = 0;
         this.r = 0;
         this.a = new int[this.b * this.c];
         (new PixelGrabber(var4, 0, 0, this.b, this.c, this.a, 0, this.b)).grabPixels();
         this.d(255, 0, 255);
      } catch (Exception var3) {
         System.out.println(var3);
      }
   }
}
