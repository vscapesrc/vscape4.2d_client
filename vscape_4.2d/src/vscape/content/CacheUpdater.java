package vscape.content;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import com.runescape.Client;
import com.runescape.sign.SignLink;

public final class CacheUpdater {
   private Client a;
   private String b = "https://dl.dropboxusercontent.com/u/31306161/vscape/cacheVersion.dat";
   private String c = "https://dl.dropboxusercontent.com/u/31306161/vscape/vscape2.zip";
   private int d = 0;
   private String e = SignLink.a() + this.d();

   public CacheUpdater(Client var1) {
      this.a = var1;
   }

   private int b() {
      BufferedReader var1 = null;

      try {
    	 var1 = var1 = new BufferedReader(new InputStreamReader((new URL(this.b)).openStream()));
         String var2;
         if((var2 = var1.readLine()) != null) {
            var1.close();
            return Integer.parseInt(var2);
         } else {
            var1.close();
            return 0;
         }
      } catch (IOException var3) {
         System.out.println("problem reading remote cache version");
         try {
			var1.close();
		} catch (Exception e) {
		}
         return 0;
      }
   }

   private int c() {
      File var1 = new File(SignLink.a() + "cacheVersion.dat");
      BufferedReader var2;
      
      try {
    	  var2 = new BufferedReader(new FileReader(var1));
      }
      catch(IOException e) {
    	  return 0;
      }
      
      if(!var1.exists()) {
         try {
			var2.close();
		} catch (IOException e) {
		}
         return 0;
      } else {
         try {
            String var4;
            if((var4 = var2.readLine()) != null) {
               var2.close();
               return Integer.parseInt(var4);
            } else {
               var2.close();
               return 0;
            }
         } catch (IOException var3) {
            try {
				var2.close();
			} catch (IOException e) {
			}
            return 0;
         }
      }
   }

   public final CacheUpdater a() {
      try {
         File var1 = new File(SignLink.a() + "cacheVersion.dat");
         int var2 = this.b();
         BufferedWriter var4;
         if(!var1.exists()) {
            this.a(this.c, this.d());
            this.e();
            this.d = this.b();
            (var4 = new BufferedWriter(new FileWriter(var1))).write(String.valueOf(this.d));
            var4.flush();
            var4.close();
         } else {
            this.d = this.c();
            if(var2 == this.d) {
               return null;
            }

            this.a(this.c, this.d());
            this.e();
            this.d = this.b();
            (var4 = new BufferedWriter(new FileWriter(var1))).write(String.valueOf(this.d));
            var4.flush();
            var4.close();
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }

      return null;
   }

   private void a(String var1, String var2) {
      BufferedOutputStream var3 = null;
      InputStream var4 = null;
      int var5 = 0;
      boolean var16 = false;

      label124: {
         try {
            var16 = true;
            URL var22 = new URL(var1);
            var3 = new BufferedOutputStream(new FileOutputStream(SignLink.a() + var2));
            URLConnection var23;
            var4 = (var23 = var22.openConnection()).getInputStream();
            byte[] var25 = new byte[1024];
            long var6 = 0L;
            int var8 = var23.getContentLength();

            int var24;
            while((var24 = var4.read(var25)) != -1) {
               var3.write(var25, 0, var24);
               if((var24 = (int)((double)(var6 += (long)var24) / (double)var8 * 100.0D)) > var5) {
                  String var9 = "Downloading Cache " + var24 + "%";
                  this.a.a(var24, var9);
                  System.out.println(var9);
                  var5 = var24;
               }
            }

            String var10 = "Finished downloading " + this.d() + "!";
            this.a.a(35, (String)var10);
            System.out.println(var10);
            var16 = false;
            break label124;
         } catch (Exception var20) {
            var20.printStackTrace();
            var16 = false;
         } finally {
            if(var16) {
               try {
                  if(var4 != null) {
                     var4.close();
                  }

                  if(var3 != null) {
                     var3.close();
                  }
               } catch (IOException var17) {
                  ;
               }

            }
         }

         try {
            if(var4 != null) {
               var4.close();
            }

            if(var3 != null) {
               var3.close();
               return;
            }

            return;
         } catch (IOException var18) {
            return;
         }
      }

      try {
         if(var4 != null) {
            var4.close();
         }

         var3.close();
      } catch (IOException var19) {
         ;
      }
   }

   private String d() {
      int var2;
      if((var2 = this.c.lastIndexOf(47)) >= 0 && var2 < this.c.length() - 1) {
         return this.c.substring(var2 + 1);
      } else {
         System.err.println("error retreiving archivaed name.");
         return "";
      }
   }

   private void e() {
      try {
         BufferedInputStream var1 = new BufferedInputStream(new FileInputStream(this.e));
         ZipInputStream var5 = new ZipInputStream(var1);

         ZipEntry var2;
         while((var2 = var5.getNextEntry()) != null) {
            if(var2.isDirectory()) {
               (new File(SignLink.a() + var2.getName())).mkdir();
            } else {
               if(var2.getName().equals(this.e)) {
                  a(var5, this.e);
                  break;
               }

               a(var5, SignLink.a() + var2.getName());
            }
         }

         var5.close();
         File var6;
         String var7 = (var6 = new File(this.e)).getName();
         if(!var6.exists()) {
            throw new IllegalArgumentException("Cache Delete: no such file or directory: " + var7);
         } else if(!var6.canWrite()) {
            throw new IllegalArgumentException("Cache Delete: write protected: " + var7);
         } else if(var6.isDirectory() && var6.list().length > 0) {
            throw new IllegalArgumentException("Cache Delete: directory not empty: " + var7);
         } else if(!var6.delete()) {
            throw new IllegalArgumentException("Cache Delete: deletion failed");
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   private static void a(ZipInputStream var0, String var1) {
	  try {
	      FileOutputStream var4 = new FileOutputStream(var1);
	      byte[] var2 = new byte[1024];
	
	      int var3;
	      while((var3 = var0.read(var2)) != -1) {
	         var4.write(var2, 0, var3);
	      }
	
	      var4.close();
		  }
	  catch(IOException e) {
		  
	  }
   }
}
