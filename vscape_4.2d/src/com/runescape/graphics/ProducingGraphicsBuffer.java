package com.runescape.graphics;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;

public final class ProducingGraphicsBuffer implements ImageObserver, ImageProducer {
   public final int[] a;
   public final int b;
   public final int c;
   private final ColorModel d;
   private ImageConsumer e;
   private final Image f;

   public ProducingGraphicsBuffer(int var1, int var2, Component var3) {
      this.b = var1;
      this.c = var2;
      this.a = new int[var1 * var2];
      this.d = new DirectColorModel(32, 16711680, '\uff00', 255);
      this.f = var3.createImage(this);
      this.b();
      var3.prepareImage(this.f, this);
      this.b();
      var3.prepareImage(this.f, this);
      this.b();
      var3.prepareImage(this.f, this);
      this.a();
   }

   public final void a() {
      Rasterizer2D.a(this.c, this.b, this.a);
   }

   public final void a(int var1, Graphics var2, int var3) {
      this.b();
      var2.drawImage(this.f, var3, var1, this);
   }

   public final synchronized void addConsumer(ImageConsumer var1) {
      this.e = var1;
      var1.setDimensions(this.b, this.c);
      var1.setProperties((Hashtable)null);
      var1.setColorModel(this.d);
      var1.setHints(14);
   }

   public final synchronized boolean isConsumer(ImageConsumer var1) {
      return this.e == var1;
   }

   public final synchronized void removeConsumer(ImageConsumer var1) {
      if(this.e == var1) {
         this.e = null;
      }

   }

   public final void startProduction(ImageConsumer var1) {
      this.addConsumer(var1);
   }

   public final void requestTopDownLeftRightResend(ImageConsumer var1) {
      System.out.println("TDLR");
   }

   private synchronized void b() {
      if(this.e != null) {
         this.e.setPixels(0, 0, this.b, this.c, this.d, this.a, 0, this.b);
         this.e.imageComplete(2);
      }

   }

   public final boolean imageUpdate(Image var1, int var2, int var3, int var4, int var5, int var6) {
      return true;
   }
}
