package com.runescape.entity;
import com.runescape.cache.def.ObjectDefinition;
import com.runescape.entity.model.Model;

public final class Item extends Renderable {
   public int a;
   public int b;

   public final Model a() {
      return ObjectDefinition.a(this.a).b(this.b);
   }
}
