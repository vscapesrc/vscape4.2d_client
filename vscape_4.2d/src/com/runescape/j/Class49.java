package com.runescape.j;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.FloatControl.Type;

public final class Class49 implements Runnable {
   private AudioInputStream b;
   private Info c;
   private Clip d;
   private InputStream e;
   private Thread f;
   private int g;
   private int h;
   public static int a;

   public Class49(InputStream var1, int var2) {
      if(a != 4 && 9 - a > 0) {
         this.e = var1;
         this.h = 9;
         this.g = var2;
         this.f = new Thread(this);
         this.f.start();
      }
   }

   public final void run() {
      try {
         this.b = AudioSystem.getAudioInputStream(this.e);
         this.c = new Info(Clip.class, this.b.getFormat());
         this.d = (Clip)AudioSystem.getLine(this.c);
         this.d.open(this.b);
         FloatControl var10000 = (FloatControl)this.d.getControl(Type.MASTER_GAIN);
         float var10001;
         int var1;
         switch(var1 = this.h - a) {
         case 1:
            var10001 = -80.0F;
            break;
         case 2:
            var10001 = -70.0F;
            break;
         case 3:
            var10001 = -60.0F;
            break;
         case 4:
            var10001 = -50.0F;
            break;
         case 5:
            var10001 = -40.0F;
            break;
         case 6:
            var10001 = -30.0F;
            break;
         case 7:
            var10001 = -20.0F;
            break;
         case 8:
            var10001 = -10.0F;
            break;
         case 9:
            var10001 = -0.0F;
            break;
         case 10:
            var10001 = 6.0F;
            break;
         default:
            var10001 = 0.0F;
         }

         var10000.setValue(var10001);
         if(this.g > 0) {
            Thread.sleep((long)this.g);
         }

         this.d.start();

         while(this.d.isActive()) {
            Thread.sleep(250L);
         }

         Thread.sleep(10000L);
         this.d.close();
         this.b.close();
         this.f.interrupt();
      } catch (Exception var2) {
         this.f.interrupt();
         var2.printStackTrace();
      }
   }
}
