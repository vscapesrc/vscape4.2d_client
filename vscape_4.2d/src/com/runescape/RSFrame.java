package com.runescape;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Toolkit;

final class RSFrame extends Frame {
   private final RSApplet a;
   private Toolkit b = Toolkit.getDefaultToolkit();
   private Dimension c;

   public RSFrame(RSApplet var1, int var2, int var3, boolean var4) {
      this.c = this.b.getScreenSize();
      this.c.getWidth();
      this.c.getHeight();
      this.a = var1;
      this.setTitle("/v/scape");
      this.setUndecorated(var4);
      this.setBackground(Color.BLACK);
      this.setVisible(true);
      this.requestFocus();
      this.toFront();
      this.setResizable(Client.s != 0);
      this.setFocusTraversalKeysEnabled(false);
      this.toFront();
      Insets var5 = this.getInsets();
      this.setSize(var2 + var5.left + var5.right, var3 + var5.top + var5.bottom);
      this.setLocationRelativeTo((Component)null);
   }

   public final Graphics getGraphics() {
      Graphics var1 = super.getGraphics();
      Insets var2 = this.getInsets();
      var1.translate(var2.left, var2.top);
      return var1;
   }

   public final int a() {
      Insets var1 = this.getInsets();
      return this.getWidth() - (var1.left + var1.right);
   }

   public final int b() {
      Insets var1 = this.getInsets();
      return this.getHeight() - (var1.top + var1.bottom);
   }

   public final void update(Graphics var1) {
      this.a.update(var1);
   }

   public final void paint(Graphics var1) {
      this.a.paint(var1);
   }
}
