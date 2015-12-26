package vscape.content;
import java.io.DataInputStream;
import java.io.IOException;

import com.runescape.cache.gui.Sprite;

public final class SpriteArchive {
   public String a;
   public int b;
   public Sprite[] c = null;

   public SpriteArchive(String var1) {
      this.a = var1;
   }

   public final void a(DataInputStream var1, DataInputStream var2) throws IOException {
      this.b = var1.readInt();
      this.c = new Sprite[this.b];

      for(int var4 = 0; var4 < this.b; ++var4) {
         byte[] var3 = new byte[var2.readInt()];
         var2.readFully(var3);
         this.c[var4] = new Sprite(var3);
      }

   }
}
