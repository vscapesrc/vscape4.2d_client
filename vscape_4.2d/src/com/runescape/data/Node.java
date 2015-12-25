package com.runescape.data;
public class Node {
   public long aF;
   public Node aG;
   public Node aH;

   public final void C() {
      if(this.aH != null) {
         this.aH.aG = this.aG;
         this.aG.aH = this.aH;
         this.aG = null;
         this.aH = null;
      }

   }
}
