package com.runescape.data;
public class CacheableNode extends Node {
   public CacheableNode aI;
   CacheableNode aJ;

   public final void D() {
      if(this.aJ != null) {
         this.aJ.aI = this.aI;
         this.aI.aJ = this.aJ;
         this.aI = null;
         this.aJ = null;
      }

   }
}
