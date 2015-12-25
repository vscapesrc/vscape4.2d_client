package a.b;
import com.runescape.Client;

public final class Class3 {
   private static Class1[] a;
   private Client b;

   public Class3(Client var1) {
      this.b = var1;
      a = new Class1[]{new Class2(this.b)};
   }

   public static Class1[] a() {
      return a;
   }

   public final void b() {
      Class1[] var1 = a;
      int var2 = a.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         var1[var3].a();
      }

   }

   public final void a(int var1, int var2, int var3) {
      Class1[] var4 = a;
      int var5 = a.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         var4[var6].a(var1, var2);
      }

   }

   public final void a(String var1) {
      Class1[] var2 = a;
      int var3 = a.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         var2[var4].a(var1);
      }

   }

   public final String c() {
      StringBuilder var1 = new StringBuilder();
      Class1[] var2 = a;
      int var3 = a.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         Class1 var5 = var2[var4];
         var1.append(var5.d());
      }

      return var1.toString();
   }

   public final void a(String var1, String var2) {
      Class1[] var3 = a;
      int var4 = a.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         var3[var5].a(var1, var2);
      }

   }
}
