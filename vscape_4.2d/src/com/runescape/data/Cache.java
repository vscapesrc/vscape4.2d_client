package com.runescape.data;
import com.runescape.sign.SignLink;

public final class Cache {
   private final CacheableNode a = new CacheableNode();
   private final int b;
   private int c;
   private final HashTable d;
   private final Queue e = new Queue();

   public Cache(int var1) {
      this.b = var1;
      this.c = var1;
      this.d = new HashTable();
   }

   public final CacheableNode a(long var1) {
      CacheableNode var3;
      if((var3 = (CacheableNode)this.d.a(var1)) != null) {
         this.e.a(var3);
      }

      return var3;
   }

   public final void a(CacheableNode var1, long var2) {
      try {
         if(this.c == 0) {
            CacheableNode var4;
            (var4 = this.e.a()).C();
            var4.D();
            if(var4 == this.a) {
               (var4 = this.e.a()).C();
               var4.D();
            }
         } else {
            --this.c;
         }

         this.d.a(var1, var2);
         this.e.a(var1);
      } catch (RuntimeException var5) {
         SignLink.b("47547, " + var1 + ", " + var2 + ", 2" + ", " + var5.toString());
         throw new RuntimeException();
      }
   }

   public final void a() {
      CacheableNode var1;
      while((var1 = this.e.a()) != null) {
         var1.C();
         var1.D();
      }

      this.c = this.b;
   }
}
