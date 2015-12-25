package com.runescape.data;
public final class LinkedList {
   private final Node a = new Node();
   private Node b;

   public LinkedList() {
      this.a.aG = this.a;
      this.a.aH = this.a;
   }

   public final void a(Node var1) {
      if(var1.aH != null) {
         var1.C();
      }

      var1.aH = this.a.aH;
      var1.aG = this.a;
      var1.aH.aG = var1;
      var1.aG.aH = var1;
   }

   public final void b(Node var1) {
      if(var1.aH != null) {
         var1.C();
      }

      var1.aH = this.a;
      var1.aG = this.a.aG;
      var1.aH.aG = var1;
      var1.aG.aH = var1;
   }

   public final Node a() {
      Node var1 = this.a.aG;
      if(this.a.aG == this.a) {
         return null;
      } else {
         var1.C();
         return var1;
      }
   }

   public final Node b() {
      Node var1 = this.a.aG;
      if(this.a.aG == this.a) {
         this.b = null;
         return null;
      } else {
         this.b = var1.aG;
         return var1;
      }
   }

   public final Node c() {
      Node var1 = this.a.aH;
      if(this.a.aH == this.a) {
         this.b = null;
         return null;
      } else {
         this.b = var1.aH;
         return var1;
      }
   }

   public final Node d() {
      Node var1 = this.b;
      if(this.b == this.a) {
         this.b = null;
         return null;
      } else {
         this.b = var1.aG;
         return var1;
      }
   }

   public final Node e() {
      Node var1 = this.b;
      if(this.b == this.a) {
         this.b = null;
         return null;
      } else {
         this.b = var1.aH;
         return var1;
      }
   }

   public final void f() {
      if(this.a.aG != this.a) {
         while(true) {
            Node var1 = this.a.aG;
            if(this.a.aG == this.a) {
               return;
            }

            var1.C();
         }
      }
   }
}
