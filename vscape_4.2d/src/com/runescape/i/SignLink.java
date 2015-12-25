package com.runescape.i;
import java.applet.Applet;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.net.InetAddress;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.Synthesizer;

public final class SignLink implements Runnable {
   private static String f = "/.vscape2/";
   private static Sequencer g = null;
   private static Sequence h = null;
   private static Synthesizer i = null;
   public static RandomAccessFile a = null;
   public static final RandomAccessFile[] b = new RandomAccessFile[5];
   public static Applet c = null;
   private static boolean j;
   private static int k;
   private static InetAddress l;
   private static int m;
   private static int n = 1;
   private static Runnable o = null;
   private static String p = null;
   public static String d = null;
   private static String q = null;
   private static String r = null;
   private static byte[] s = null;
   private static String t = null;
   public static boolean e = true;

   public static String a() {
      if((new File(System.getProperty("user.home") + f)).exists()) {
         return System.getProperty("user.home") + f;
      } else {
         (new File(System.getProperty("user.home") + f)).mkdir();
         return System.getProperty("user.home") + f;
      }
   }

   public static void a(InetAddress var0) {
      k = (int)(Math.random() * 9.9999999E7D);
      if(j) {
         try {
            Thread.sleep(500L);
         } catch (Exception var2) {
            ;
         }

         j = false;
      }

      m = 0;
      o = null;
      p = null;
      r = null;
      q = null;
      l = var0;
      Thread var3;
      (var3 = new Thread(new SignLink())).setDaemon(true);
      var3.start();

      while(!j) {
         try {
            Thread.sleep(50L);
         } catch (Exception var1) {
            ;
         }
      }

   }

   public final void run() {
      j = true;
      String var1;
      c(var1 = a());

      int var2;
      try {
         a = new RandomAccessFile(var1 + "main_file_cache.dat", "rw");

         for(var2 = 0; var2 < 5; ++var2) {
            b[var2] = new RandomAccessFile(var1 + "main_file_cache.idx" + var2, "rw");
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      var2 = k;

      while(k == var2) {
         if(o != null) {
            Thread var6;
            (var6 = new Thread(o)).setDaemon(true);
            var6.start();
            var6.setPriority(n);
            o = null;
         } else if(p != null) {
            try {
               d = InetAddress.getByName(p).getHostName();
            } catch (Exception var4) {
               d = "unknown";
            }

            p = null;
         }

         try {
            Thread.sleep(50L);
         } catch (Exception var3) {
            ;
         }
      }

   }

   private static int c(String var0) {
      try {
         File var1;
         if(!(var1 = new File(var0 + "uid.dat")).exists() || var1.length() < 4L) {
            DataOutputStream var2;
            (var2 = new DataOutputStream(new FileOutputStream(var0 + "uid.dat"))).writeInt((int)(Math.random() * 9.9999999E7D));
            var2.close();
         }
      } catch (Exception var4) {
         ;
      }

      try {
         DataInputStream var5;
         int var6 = (var5 = new DataInputStream(new FileInputStream(var0 + "uid.dat"))).readInt();
         var5.close();
         return var6 + 1;
      } catch (Exception var3) {
         return 0;
      }
   }

   public static synchronized void a(String var0) {
      d = var0;
      p = var0;
   }

   public static void b(String var0) {
      System.out.println("Error: " + var0);
   }
}
