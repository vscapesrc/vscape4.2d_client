package com.runescape.a.c;
import java.util.Random;

import com.runescape.a.Archive;
import com.runescape.b.Rasterizer2D;
import com.runescape.d.Buffer;

public final class RSFont extends Rasterizer2D {
   private byte[][] b = new byte[256][];
   private int[] c = new int[256];
   private int[] d = new int[256];
   private int[] e = new int[256];
   private int[] f = new int[256];
   private int[] g = new int[256];
   public int a;
   private Random r = new Random();
   private boolean s = false;

   public RSFont(boolean var1, String var2, Archive var3) {
      Buffer var9 = new Buffer(var3.a(var2 + ".dat"));
      Buffer var10;
      (var10 = new Buffer(var3.a("index.dat"))).b = var9.g() + 4;
      int var4;
      if((var4 = var10.e()) > 0) {
         var10.b += 3 * (var4 - 1);
      }

      for(var4 = 0; var4 < 256; ++var4) {
         this.e[var4] = var10.e();
         this.f[var4] = var10.e();
         int var5 = this.c[var4] = var10.g();
         int var6 = this.d[var4] = var10.g();
         int var7 = var10.e();
         int var8 = var5 * var6;
         this.b[var4] = new byte[var8];
         if(var7 == 0) {
            for(var7 = 0; var7 < var8; ++var7) {
               this.b[var4][var7] = var9.f();
            }
         } else if(var7 == 1) {
            for(var7 = 0; var7 < var5; ++var7) {
               for(var8 = 0; var8 < var6; ++var8) {
                  this.b[var4][var7 + var8 * var5] = var9.f();
               }
            }
         }

         if(var6 > this.a && var4 < 128) {
            this.a = var6;
         }

         this.e[var4] = 1;
         this.g[var4] = var5 + 2;
         var7 = 0;

         for(var8 = var6 / 7; var8 < var6; ++var8) {
            var7 += this.b[var4][var8 * var5];
         }

         if(var7 <= var6 / 7) {
            --this.g[var4];
            this.e[var4] = 0;
         }

         var7 = 0;

         for(var8 = var6 / 7; var8 < var6; ++var8) {
            var7 += this.b[var4][var5 - 1 + var8 * var5];
         }

         if(var7 <= var6 / 7) {
            --this.g[var4];
         }
      }

      if(var1) {
         this.g[32] = this.g[73];
      } else {
         this.g[32] = this.g[105];
      }
   }

   public final void a(String var1, int var2, int var3, int var4) {
      this.b(var3, var1, var4, 507 - this.b(var1));
   }

   public final void a(int var1, String var2, int var3, int var4) {
      this.b(var1, var2, var3, var4 - this.b(var2) / 2);
   }

   public final void a(int var1, int var2, String var3, int var4, boolean var5) {
      this.a(var5, var2 - this.a(var3) / 2, var1, var3, var4);
   }

   public final void b(int var1, int var2, String var3, int var4, boolean var5) {
      this.a(false, var2, 255, var3, var4);
   }

   public final int a(String var1) {
      if(var1 == null) {
         return 0;
      } else {
         int var2 = 0;

         for(int var3 = 0; var3 < var1.length(); ++var3) {
            if(var1.charAt(var3) == 64 && var3 + 4 < var1.length() && var1.charAt(var3 + 4) == 64) {
               var3 += 4;
            } else {
               var2 += this.g[var1.charAt(var3)];
            }
         }

         return var2;
      }
   }

   public final int b(String var1) {
      if(var1 == null) {
         return 0;
      } else {
         int var2 = 0;

         for(int var3 = 0; var3 < var1.length(); ++var3) {
            var2 += this.g[var1.charAt(var3)];
         }

         return var2;
      }
   }

   public final void b(int var1, String var2, int var3, int var4) {
      if(var2 != null) {
         var3 -= this.a;

         for(int var5 = 0; var5 < var2.length(); ++var5) {
            char var6;
            if((var6 = var2.charAt(var5)) != 32) {
               this.a(this.b[var6], var4 + this.e[var6], var3 + this.f[var6], this.c[var6], this.d[var6], var1);
            }

            var4 += this.g[var6];
         }

      }
   }

   public final void a(int var1, String var2, int var3, int var4, int var5) {
      if(var2 != null) {
         var3 -= this.b(var2) / 2;
         var5 -= this.a;

         for(int var6 = 0; var6 < var2.length(); ++var6) {
            char var7;
            if((var7 = var2.charAt(var6)) != 32) {
               this.a(this.b[var7], var3 + this.e[var7], var5 + this.f[var7] + (int)(Math.sin((double)var6 / 2.0D + (double)var4 / 5.0D) * 5.0D), this.c[var7], this.d[var7], var1);
            }

            var3 += this.g[var7];
         }

      }
   }

   public final void b(int var1, String var2, int var3, int var4, int var5) {
      if(var2 != null) {
         var1 -= this.b(var2) / 2;
         var4 -= this.a;

         for(int var6 = 0; var6 < var2.length(); ++var6) {
            char var7;
            if((var7 = var2.charAt(var6)) != 32) {
               this.a(this.b[var7], var1 + this.e[var7] + (int)(Math.sin((double)var6 / 5.0D + (double)var3 / 5.0D) * 5.0D), var4 + this.f[var7] + (int)(Math.sin((double)var6 / 3.0D + (double)var3 / 5.0D) * 5.0D), this.c[var7], this.d[var7], var5);
            }

            var1 += this.g[var7];
         }

      }
   }

   public final void a(int var1, String var2, int var3, int var4, int var5, int var6) {
      if(var2 != null) {
         double var7;
         if((var7 = 7.0D - (double)var1 / 8.0D) < 0.0D) {
            var7 = 0.0D;
         }

         var5 -= this.b(var2) / 2;
         var4 -= this.a;

         for(var1 = 0; var1 < var2.length(); ++var1) {
            char var9;
            if((var9 = var2.charAt(var1)) != 32) {
               this.a(this.b[var9], var5 + this.e[var9], var4 + this.f[var9] + (int)(Math.sin((double)var1 / 1.5D + (double)var3) * var7), this.c[var9], this.d[var9], var6);
            }

            var5 += this.g[var9];
         }

      }
   }

   public final void a(boolean var1, int var2, int var3, String var4, int var5) {
      this.s = false;
      int var6 = var2;
      if(var4 != null) {
         var5 -= this.a;

         for(int var7 = 0; var7 < var4.length(); ++var7) {
            if(var4.charAt(var7) == 64 && var7 + 4 < var4.length() && var4.charAt(var7 + 4) == 64) {
               int var9;
               if((var9 = this.c(var4.substring(var7 + 1, var7 + 4))) != -1) {
                  var3 = var9;
               }

               var7 += 4;
            } else {
               char var8;
               if((var8 = var4.charAt(var7)) != 32) {
                  if(var1) {
                     this.a(this.b[var8], var2 + this.e[var8] + 1, var5 + this.f[var8] + 1, this.c[var8], this.d[var8], 0);
                  }

                  this.a(this.b[var8], var2 + this.e[var8], var5 + this.f[var8], this.c[var8], this.d[var8], var3);
               }

               var2 += this.g[var8];
            }
         }

         if(this.s) {
            Rasterizer2D.c(var5 + (int)((double)this.a * 0.7D), 8388608, var2 - var6, var6);
         }

      }
   }

   public final void a(int var1, int var2, String var3, int var4, int var5) {
      if(var3 != null) {
         this.r.setSeed((long)var4);
         var4 = 192 + (this.r.nextInt() & 31);
         var5 = 15 - this.a;

         for(int var6 = 0; var6 < var3.length(); ++var6) {
            if(var3.charAt(var6) == 64 && var6 + 4 < var3.length() && var3.charAt(var6 + 4) == 64) {
               int var8;
               if((var8 = this.c(var3.substring(var6 + 1, var6 + 4))) != -1) {
                  var2 = var8;
               }

               var6 += 4;
            } else {
               char var7;
               if((var7 = var3.charAt(var6)) != 32) {
                  this.a(192, var1 + this.e[var7] + 1, this.b[var7], this.c[var7], var5 + this.f[var7] + 1, this.d[var7], 0);
                  this.a(var4, var1 + this.e[var7], this.b[var7], this.c[var7], var5 + this.f[var7], this.d[var7], var2);
               }

               var1 += this.g[var7];
               if((this.r.nextInt() & 3) == 0) {
                  ++var1;
               }
            }
         }

      }
   }

   private int c(String var1) {
      if(var1.equals("369")) {
         return 3368601;
      } else if(var1.equals("mon")) {
         return '\uff80';
      } else if(var1.equals("red")) {
         return 16711680;
      } else if(var1.equals("gre")) {
         return '\uff00';
      } else if(var1.equals("blu")) {
         return 255;
      } else if(var1.equals("ind")) {
         return 4809928;
      } else if(var1.equals("yel")) {
         return 16776960;
      } else if(var1.equals("cya")) {
         return '\uffff';
      } else if(var1.equals("mag")) {
         return 16711935;
      } else if(var1.equals("vio")) {
         return 7999717;
      } else if(var1.equals("whi")) {
         return 16777215;
      } else if(var1.equals("bla")) {
         return 0;
      } else if(var1.equals("lre")) {
         return 16748608;
      } else if(var1.equals("dre")) {
         return 8388608;
      } else if(var1.equals("dbl")) {
         return 128;
      } else if(var1.equals("or1")) {
         return 16756736;
      } else if(var1.equals("or2")) {
         return 16740352;
      } else if(var1.equals("or3")) {
         return 16723968;
      } else if(var1.equals("dor")) {
         return 9724672;
      } else if(var1.equals("gr1")) {
         return 12648192;
      } else if(var1.equals("gr2")) {
         return 8453888;
      } else if(var1.equals("gr3")) {
         return 4259584;
      } else {
         if(var1.equals("str")) {
            this.s = true;
         }

         if(var1.equals("end")) {
            this.s = false;
         }

         return -1;
      }
   }

   private void a(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var2 + var3 * i;
      int var8 = i - var4;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if(var3 < k) {
         var11 = k - var3;
         var5 -= var11;
         var3 = k;
         var10 = 0 + var11 * var4;
         var7 += var11 * i;
      }

      if(var3 + var5 >= l) {
         var5 -= var3 + var5 - l;
      }

      if(var2 < m) {
         var11 = m - var2;
         var4 -= var11;
         var2 = m;
         var10 += var11;
         var7 += var11;
         var9 = var11 + 0;
         var8 += var11;
      }

      if(var2 + var4 >= n) {
         var11 = var2 + var4 - n;
         var4 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if(var4 > 0 && var5 > 0) {
         int var10002 = var6;
         int var10004 = var7;
         var9 = var9;
         var8 = var8;
         var7 = var5;
         var6 = var4;
         var5 = var10004;
         var4 = var10;
         var3 = var10002;
         byte[] var13 = var1;
         int[] var12 = h;
         var10 = -(var6 >> 2);
         var6 = -(var6 & 3);

         for(var7 = -var7; var7 < 0; ++var7) {
            for(var11 = var10; var11 < 0; ++var11) {
               if(var13[var4++] != 0) {
                  var12[var5++] = var3;
               } else {
                  ++var5;
               }

               if(var13[var4++] != 0) {
                  var12[var5++] = var3;
               } else {
                  ++var5;
               }

               if(var13[var4++] != 0) {
                  var12[var5++] = var3;
               } else {
                  ++var5;
               }

               if(var13[var4++] != 0) {
                  var12[var5++] = var3;
               } else {
                  ++var5;
               }
            }

            for(var11 = var6; var11 < 0; ++var11) {
               if(var13[var4++] != 0) {
                  var12[var5++] = var3;
               } else {
                  ++var5;
               }
            }

            var5 += var8;
            var4 += var9;
         }
      }

   }

   private void a(int var1, int var2, byte[] var3, int var4, int var5, int var6, int var7) {
      int var8 = var2 + var5 * i;
      int var9 = i - var4;
      int var10 = 0;
      int var11 = 0;
      int var12;
      if(var5 < k) {
         var12 = k - var5;
         var6 -= var12;
         var5 = k;
         var11 = 0 + var12 * var4;
         var8 += var12 * i;
      }

      if(var5 + var6 >= l) {
         var6 -= var5 + var6 - l;
      }

      if(var2 < m) {
         var12 = m - var2;
         var4 -= var12;
         var2 = m;
         var11 += var12;
         var8 += var12;
         var10 = var12 + 0;
         var9 += var12;
      }

      if(var2 + var4 >= n) {
         var12 = var2 + var4 - n;
         var4 -= var12;
         var10 += var12;
         var9 += var12;
      }

      if(var4 > 0 && var6 > 0) {
         int var10001 = var6;
         int var10002 = var8;
         int var10007 = var9;
         var9 = var7;
         var8 = var10007;
         var7 = var10;
         var6 = var4;
         var5 = var11;
         int[] var15 = h;
         int var14 = var10002;
         var2 = var10001;
         byte[] var13 = var3;
         var9 = ((var9 & 16711935) * var1 & -16711936) + ((var9 & '\uff00') * var1 & 16711680) >> 8;
         var10 = 256 - var1;

         for(var2 = -var2; var2 < 0; ++var2) {
            for(var11 = -var6; var11 < 0; ++var11) {
               if(var13[var5++] != 0) {
                  var12 = var15[var14];
                  var15[var14++] = (((var12 & 16711935) * var10 & -16711936) + ((var12 & '\uff00') * var10 & 16711680) >> 8) + var9;
               } else {
                  ++var14;
               }
            }

            var14 += var8;
            var5 += var7;
         }

      }
   }
}
