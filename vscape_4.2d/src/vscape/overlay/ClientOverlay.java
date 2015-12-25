package vscape.overlay;
import java.util.LinkedList;
import java.util.List;

import vscape.Settings;

import com.runescape.Client;
import com.runescape.cache.gui.Sprite;

public final class ClientOverlay extends OverlayTemplate {
   private List b = new LinkedList();
   private int[] c = new int[]{0, 2, 1, 6, 3, 4, 5, 15, 17, 11, 14, 16, 10, 13, 12, 8, 7, 9, 19, 20, 18};
   private int d;
   private int e;
   private int f;
   private int g = 0;
   private boolean h = false;

   public ClientOverlay(Client var1) {
      super(var1);
   }

   public final void a() {
      if(this.h && this.b != null) {
         int var2;
         if(this.b.size() > 0) {
            ClientOverlay var1 = this;

            try {
               var1.d = Client.q - 250;
               var1.e = Client.r / 2 - 180;
               var1.f = Client.r - 180;
               if(var1.e <= 0) {
                  var1.e = 0;
               }

               if(var1.b != null && var1.b.size() <= 0) {
                  var1.b.clear();
               } else {
                  for(var2 = 0; var2 < var1.b.size(); ++var2) {
                     int[] var3;
                     if((var3 = (int[])var1.b.get(var2)) != null) {
                        int var4 = var3[0];
                        int var5 = var3[1];
                        int var6 = var3[2] += var1.f < var1.e?-1:1;
                        var6 += var1.e;
                        int[] var7;
                        if(var2 + 1 < var1.b.size() && (var7 = (int[])var1.b.get(var2 + 1)) != null && Math.abs(var1.e + var7[2] - var6) < 32) {
                           var3[2] = var7[2] + 32;
                           var6 = var3[2];
                           var6 += var1.e;
                        }

                        int var14;
                        if((var14 = Math.abs(var6 - var1.f)) > 2 && var6 <= var1.f) {
                           Sprite var11 = var1.a.j[var1.c[var4]];
                           var4 = var14 >= 255?255:var14;
                           String var13 = "+" + var1.a.b.format((long)var5);
                           var14 = var1.a.G.a(var13);
                           int var8 = var1.d;
                           if(var11 != null) {
                              if(var8 + var11.b + var14 > var1.d) {
                                 var8 -= var11.b + var14 + 12;
                              }

                              var11.a(var8, var6, var4);
                              var1.a.G.a("<trans=" + var4 + ">" + var13 + "</tans>", var8 + var11.b + 4, var6 + 16, 16777215, 0);
                           } else {
                              if(var8 + var14 > var1.d) {
                                 var8 -= var14 + 12;
                              }

                              var1.a.G.a("<trans=" + var4 + ">" + var13 + "</tans>", var8, var6 + 16, 16777215, 0);
                           }
                        } else {
                           var1.b.remove(var2);
                        }
                     }
                  }
               }
            } catch (Exception var9) {
               ;
            }
         }

         if(this.g > 0 || this.b.size() > 0) {
            String var10 = "Overall XP: " + this.a.b.format(this.a.h());
            var2 = this.a.G.a(var10);
            int var12 = this.d;
            if(this.d + var2 > this.d) {
               var12 -= var2 + 20;
            }

            this.a.H.a(var10, var12, this.f + 8, 16777215, 0);
            if(this.b.size() <= 0) {
               --this.g;
            }
         }
      }

   }

   public final void a(int var1, int var2) {
      if(this.h && var1 >= 0 && this.a.j()[var1] >= 0 && var2 > this.a.j()[var1] && (var2 = Math.abs(var2 - this.a.j()[var1])) > 0 && this.b != null) {
         this.b.add(new int[]{var1, var2, 0});
         this.g = 200;
      }

   }

   public final void a(String var1) {
      if(var1.equalsIgnoreCase("::xpdrop")) {
         this.h = !this.h;
         if(!this.h && this.b != null) {
            this.b.clear();
         }

         Settings.a();
      }

   }

   public final void b() {
      if(this.b != null) {
         this.b.clear();
         this.g = 0;
      }

   }

   public final void c() {
      if(this.b != null) {
         this.b.clear();
         this.g = 0;
      }

   }

   public final String d() {
      StringBuilder var1;
      (var1 = new StringBuilder()).append("xpDropEnabled = " + this.h).append("\n");
      return var1.toString();
   }

   public final void a(String var1, String var2) {
      switch(var1.hashCode()) {
      case 1074734906:
         if(var1.equals("xpDropEnabled")) {
            this.h = Boolean.parseBoolean(var2);
         }
      default:
      }
   }
}
