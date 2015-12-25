package com.runescape.data;
import com.runescape.sign.SignLink;

final class HashTable {
   private final int a = 1024;
   private final Node[] b = new Node[1024];

   public HashTable() {
      for(int var1 = 0; var1 < 1024; ++var1) {
         Node var2;
         (var2 = this.b[var1] = new Node()).aG = var2;
         var2.aH = var2;
      }

   }

   public final Node a(long var1) {
      Node var3;
      for(Node var4 = (var3 = this.b[(int)(var1 & 1023L)]).aG; var4 != var3; var4 = var4.aG) {
         if(var4.aF == var1) {
            return var4;
         }
      }

      return null;
   }

   public final void a(Node var1, long var2) {
      try {
         if(var1.aH != null) {
            var1.C();
         }

         Node var4 = this.b[(int)(var2 & 1023L)];
         var1.aH = var4.aH;
         var1.aG = var4;
         var1.aH.aG = var1;
         var1.aG.aH = var1;
         var1.aF = var2;
      } catch (RuntimeException var5) {
         SignLink.b("91499, " + var1 + ", " + var2 + ", 7" + ", " + var5.toString());
         throw new RuntimeException();
      }
   }
}
