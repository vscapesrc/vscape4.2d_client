package com.runescape.entity;
import com.runescape.data.CacheableNode;
import com.runescape.entity.model.Model;
import com.runescape.entity.model.VertexNormal;

public class Renderable extends CacheableNode {
   public VertexNormal[] aD;
   public int aE = 1000;

   public void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      Model var10;
      if((var10 = this.a()) != null) {
         this.aE = var10.aE;
         var10.a(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      }

   }

   Model a() {
      return null;
   }
}
