package com.runescape.f;
import com.runescape.c.GameObject;
import com.runescape.e.Node;
import com.runescape.f.a.GroundDecoration;
import com.runescape.f.a.Wall;
import com.runescape.f.a.WallDecoration;

public final class SceneTile extends Node {
   int a;
   final int b;
   final int c;
   final int d;
   public SimpleTile e;
   public ShapedTile f;
   public Wall g;
   public WallDecoration h;
   public GroundDecoration i;
   public GroundItem j;
   int k;
   public final GameObject[] l = new GameObject[5];
   final int[] m = new int[5];
   int n;
   int o;
   boolean p;
   boolean q;
   boolean r;
   int s;
   int t;
   int u;
   int v;
   public SceneTile w;

   public SceneTile(int var1, int var2, int var3) {
      this.d = this.a = var1;
      this.b = var2;
      this.c = var3;
   }
}
