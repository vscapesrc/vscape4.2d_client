package com.runescape.data;
public final class Queue {
   private final CacheableNode a = new CacheableNode();
   private CacheableNode b;

   public Queue() {
      this.a.aI = this.a;
      this.a.aJ = this.a;
   }

   public final void a(CacheableNode var1) {
      if(var1.aJ != null) {
         var1.D();
      }

      var1.aJ = this.a.aJ;
      var1.aI = this.a;
      var1.aJ.aI = var1;
      var1.aI.aJ = var1;
   }

   public final CacheableNode a() {
      CacheableNode var1 = this.a.aI;
      if(this.a.aI == this.a) {
         return null;
      } else {
         var1.D();
         return var1;
      }
   }

   public final CacheableNode b() {
      CacheableNode var1 = this.a.aI;
      if(this.a.aI == this.a) {
         this.b = null;
         return null;
      } else {
         this.b = var1.aI;
         return var1;
      }
   }

   public final CacheableNode c() {
      CacheableNode var1 = this.b;
      if(this.b == this.a) {
         this.b = null;
         return null;
      } else {
         this.b = var1.aI;
         return var1;
      }
   }

   public final int d() {
      int var1 = 0;

      for(CacheableNode var2 = this.a.aI; var2 != this.a; var2 = var2.aI) {
         ++var1;
      }

      return var1;
   }
}
