package vscape;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.runescape.Client;
import com.runescape.sign.SignLink;

public final class Settings {
   private static String g = SignLink.a() + "settings.ini";
   public static String a = "";
   public static String b = "";
   public static int c = 0;
   public static int d = 900;
   public static int e = 600;
   public static int f = 4;

   public static void a() {
      File var0 = new File(g);

      try {
         if(!var0.exists()) {
            var0.createNewFile();
         }
      } catch (IOException var11) {
         System.out.println("error writing settings file.");
      }

      if(var0.exists()) {
         try {
            Throwable var14 = null;

            //try {
               BufferedWriter var1 = new BufferedWriter(new FileWriter(g));

               try {
                  var1.write("[CHARACTER]");
                  var1.newLine();
                  var1.write("remember = " + Client.c);
                  var1.newLine();
                  var1.write("username = " + (Client.c?Client.y:""));
                  var1.newLine();
                  var1.write("password = " + (Client.c?Client.z:""));
                  var1.newLine();
                  var1.newLine();
                  var1.write("[CHAT]");
                  var1.newLine();
                  var1.write("game = " + Client.a.h);
                  var1.newLine();
                  var1.write("clan = " + Client.a.f);
                  var1.newLine();
                  var1.write("global = " + Client.a.g);
                  var1.newLine();
                  var1.newLine();
                  var1.write("[GRAPHICAL]");
                  var1.newLine();
                  var1.write("sizeMode = " + (Client.s > 0?"1":"0"));
                  var1.newLine();
                  var1.write("resizableW = " + Client.q);
                  var1.newLine();
                  var1.write("resizableH = " + Client.r);
                  var1.newLine();
                  var1.write("roofs = " + !Client.a.e);
                  var1.newLine();
                  var1.newLine();
                  var1.write("[MISC]");
                  var1.newLine();
                  var1.write("loginMusic = " + Client.v);
                  var1.newLine();
                  var1.write("camDragSensitivity = " + f);
                  var1.newLine();
                  var1.newLine();
                  var1.write("[WIDGETS]");
                  var1.newLine();
                  var1.write(Client.c().E.c());
                  var1.newLine();
                  var1.flush();
                  var1.close();
               } finally {
                  var1.close();
               }
          /*  } catch (Throwable var12) {
               if(var14 == null) {
                  var14 = var12;
               } else if(var14 != var12) {
                  var14.addSuppressed(var12);
               }

               throw var14;
            }*/
         } catch (IOException var13) {
            System.out.println("error writing settings file.");
         }
      }

      a = Client.c?Client.y:"";
      b = Client.c?Client.z:"";
      c = Client.s > 0?1:0;
      d = Client.q;
      e = Client.r;
   }

   public static void b() {
      if((new File(g)).exists()) {
         String var1 = "";

         try {
            //Throwable var2 = null;

            //try {
               BufferedReader var3 = new BufferedReader(new FileReader(g));

               try {
                  for(String var0 = var3.readLine(); var0 != null; var0 = var3.readLine()) {
                     if((var0 = var0.trim()).startsWith("[") && var0.endsWith("]")) {
                        var1 = var0;
                     }

                     int var4;
                     if((var4 = var0.indexOf("=")) >= 0) {
                        String var5 = var0.substring(0, var4).trim();
                        if(!(var0 = var0.substring(var4 + 1).trim()).isEmpty() && var0.length() > 0) {
                           switch(var1.hashCode()) {
                           case -1886171895:
                              if(var1.equals("[WIDGETS]")) {
                                 Client.c().E.a(var5, var0);
                              }
                              break;
                           case -1833601947:
                              if(var1.equals("[GRAPHICAL]")) {
                                 switch(var5.hashCode()) {
                                 case 108698143:
                                    if(var5.equals("roofs")) {
                                       Client.a.e = !Boolean.parseBoolean(var0);
                                    }
                                    break;
                                 case 846767428:
                                    if(var5.equals("sizeMode")) {
                                       c = Integer.parseInt(var0);
                                    }
                                    break;
                                 case 2046685949:
                                    if(var5.equals("resizableH")) {
                                       e = Integer.parseInt(var0);
                                    }
                                    break;
                                 case 2046685964:
                                    if(var5.equals("resizableW")) {
                                       d = Integer.parseInt(var0);
                                    }
                                 }
                              }
                              break;
                           case -1625628534:
                              if(var1.equals("[CHAT]")) {
                                 switch(var5.hashCode()) {
                                 case -1243020381:
                                    if(var5.equals("global")) {
                                       Client.a.g = Integer.parseInt(var0);
                                    }
                                    break;
                                 case 3056214:
                                    if(var5.equals("clan")) {
                                       Client.a.f = Integer.parseInt(var0);
                                    }
                                    break;
                                 case 3165170:
                                    if(var5.equals("game")) {
                                       Client.a.h = Integer.parseInt(var0);
                                    }
                                 }
                              }
                              break;
                           case -1616346762:
                              if(var1.equals("[MISC]")) {
                                 switch(var5.hashCode()) {
                                 case -1764210628:
                                    if(var5.equals("loginMusic")) {
                                       Client.v = Boolean.parseBoolean(var0);
                                    }
                                    break;
                                 case 270258428:
                                    if(var5.equals("camDragSensitivity")) {
                                       if((f = Integer.parseInt(var0)) <= 0) {
                                          f = 1;
                                       }

                                       if(f > 10) {
                                          f = 10;
                                       }
                                    }
                                 }
                              }
                              break;
                           case 1416700175:
                              if(var1.equals("[CHARACTER]")) {
                                 switch(var5.hashCode()) {
                                 case -522328435:
                                    if(var5.equals("remember")) {
                                       Client.c = Boolean.parseBoolean(var0);
                                    }
                                    break;
                                 case -265713450:
                                    if(var5.equals("username")) {
                                       a = var0;
                                       Client.y = var0;
                                    }
                                    break;
                                 case 1216985755:
                                    if(var5.equals("password")) {
                                       b = var0;
                                       Client.z = var0;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }

                  var3.close();
                  return;
               } finally {
                  var3.close();
               }
            } /*catch (Throwable var13) {
               if(var2 == null) {
                  var2 = var13;
               } else if(var2 != var13) {
                  var2.addSuppressed(var13);
               }

               throw var2;
            }
         } */catch (IOException var14) {
            System.out.println("error writing settings file.");
         }
      }

   }
}
