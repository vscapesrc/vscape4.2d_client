package vscape.overlay;
import com.runescape.Client;

public final class Overlays {
   private static OverlayTemplate[] a;
   private Client b;

   public Overlays(Client var1) {
      this.b = var1;
      a = new OverlayTemplate[]{new ClientOverlay(this.b)};
   }

   public static OverlayTemplate[] a() {
      return a;
   }

   public final void b() {
      OverlayTemplate[] var1 = a;
      int var2 = a.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         var1[var3].a();
      }

   }

   public final void a(int var1, int var2, int var3) {
      OverlayTemplate[] var4 = a;
      int var5 = a.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         var4[var6].a(var1, var2);
      }

   }

   public final void a(String var1) {
      OverlayTemplate[] var2 = a;
      int var3 = a.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         var2[var4].a(var1);
      }

   }

   public final String c() {
      StringBuilder var1 = new StringBuilder();
      OverlayTemplate[] var2 = a;
      int var3 = a.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         OverlayTemplate var5 = var2[var4];
         var1.append(var5.d());
      }

      return var1.toString();
   }

   public final void a(String var1, String var2) {
      OverlayTemplate[] var3 = a;
      int var4 = a.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         var3[var5].a(var1, var2);
      }

   }
}
