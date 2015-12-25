package com.runescape.c;
import com.runescape.a.b.ObjectDefinition;
import com.runescape.c.a.Model;

public final class Item extends Renderable {
   public int a;
   public int b;

   public final Model a() {
      return ObjectDefinition.a(this.a).b(this.b);
   }
}
