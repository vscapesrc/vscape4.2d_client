package com.runescape.scene;
public final class CollisionMap {
   private final int b = 0;
   private final int c = 0;
   private final int d = 104;
   private final int e = 104;
   public final int[][] a = new int[104][104];

   public CollisionMap() {
      this.a();
   }

   public final void a() {
      for(int var1 = 0; var1 < 104; ++var1) {
         for(int var2 = 0; var2 < 104; ++var2) {
            if(var1 != 0 && var2 != 0 && var1 != 103 && var2 != 103) {
               this.a[var1][var2] = 16777216;
            } else {
               this.a[var1][var2] = 16777215;
            }
         }
      }

   }

   public final void a(int var1, int var2, int var3, int var4, boolean var5) {
      if(var4 == 0) {
         if(var2 == 0) {
            this.a(var3, var1, 128);
            this.a(var3 - 1, var1, 8);
         }

         if(var2 == 1) {
            this.a(var3, var1, 2);
            this.a(var3, var1 + 1, 32);
         }

         if(var2 == 2) {
            this.a(var3, var1, 8);
            this.a(var3 + 1, var1, 128);
         }

         if(var2 == 3) {
            this.a(var3, var1, 32);
            this.a(var3, var1 - 1, 2);
         }
      }

      if(var4 == 1 || var4 == 3) {
         if(var2 == 0) {
            this.a(var3, var1, 1);
            this.a(var3 - 1, var1 + 1, 16);
         }

         if(var2 == 1) {
            this.a(var3, var1, 4);
            this.a(var3 + 1, var1 + 1, 64);
         }

         if(var2 == 2) {
            this.a(var3, var1, 16);
            this.a(var3 + 1, var1 - 1, 1);
         }

         if(var2 == 3) {
            this.a(var3, var1, 64);
            this.a(var3 - 1, var1 - 1, 4);
         }
      }

      if(var4 == 2) {
         if(var2 == 0) {
            this.a(var3, var1, 130);
            this.a(var3 - 1, var1, 8);
            this.a(var3, var1 + 1, 32);
         }

         if(var2 == 1) {
            this.a(var3, var1, 10);
            this.a(var3, var1 + 1, 32);
            this.a(var3 + 1, var1, 128);
         }

         if(var2 == 2) {
            this.a(var3, var1, 40);
            this.a(var3 + 1, var1, 128);
            this.a(var3, var1 - 1, 2);
         }

         if(var2 == 3) {
            this.a(var3, var1, 160);
            this.a(var3, var1 - 1, 2);
            this.a(var3 - 1, var1, 8);
         }
      }

      if(var5) {
         if(var4 == 0) {
            if(var2 == 0) {
               this.a(var3, var1, 65536);
               this.a(var3 - 1, var1, 4096);
            }

            if(var2 == 1) {
               this.a(var3, var1, 1024);
               this.a(var3, var1 + 1, 16384);
            }

            if(var2 == 2) {
               this.a(var3, var1, 4096);
               this.a(var3 + 1, var1, 65536);
            }

            if(var2 == 3) {
               this.a(var3, var1, 16384);
               this.a(var3, var1 - 1, 1024);
            }
         }

         if(var4 == 1 || var4 == 3) {
            if(var2 == 0) {
               this.a(var3, var1, 512);
               this.a(var3 - 1, var1 + 1, 8192);
            }

            if(var2 == 1) {
               this.a(var3, var1, 2048);
               this.a(var3 + 1, var1 + 1, '\u8000');
            }

            if(var2 == 2) {
               this.a(var3, var1, 8192);
               this.a(var3 + 1, var1 - 1, 512);
            }

            if(var2 == 3) {
               this.a(var3, var1, '\u8000');
               this.a(var3 - 1, var1 - 1, 2048);
            }
         }

         if(var4 == 2) {
            if(var2 == 0) {
               this.a(var3, var1, 66560);
               this.a(var3 - 1, var1, 4096);
               this.a(var3, var1 + 1, 16384);
            }

            if(var2 == 1) {
               this.a(var3, var1, 5120);
               this.a(var3, var1 + 1, 16384);
               this.a(var3 + 1, var1, 65536);
            }

            if(var2 == 2) {
               this.a(var3, var1, 20480);
               this.a(var3 + 1, var1, 65536);
               this.a(var3, var1 - 1, 1024);
            }

            if(var2 == 3) {
               this.a(var3, var1, 81920);
               this.a(var3, var1 - 1, 1024);
               this.a(var3 - 1, var1, 4096);
            }
         }
      }

   }

   public final void a(boolean var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 256;
      if(var1) {
         var7 = 131328;
      }

      var4 = var4;
      var5 = var5;
      int var8;
      if(var6 == 1 || var6 == 3) {
         var8 = var2;
         var2 = var3;
         var3 = var8;
      }

      for(var8 = var4; var8 < var4 + var2; ++var8) {
         if(var8 >= 0 && var8 < 104) {
            for(var6 = var5; var6 < var5 + var3; ++var6) {
               if(var6 >= 0 && var6 < 104) {
                  this.a(var8, var6, var7);
               }
            }
         }
      }

   }

   public final void a(int var1, int var2) {
      this.a[var2][var1] |= 2097152;
   }

   private void a(int var1, int var2, int var3) {
      this.a[var1][var2] |= var3;
   }

   public final void a(int var1, int var2, boolean var3, int var4, int var5) {
      if(var2 == 0) {
         if(var1 == 0) {
            this.b(128, var4, var5);
            this.b(8, var4 - 1, var5);
         }

         if(var1 == 1) {
            this.b(2, var4, var5);
            this.b(32, var4, var5 + 1);
         }

         if(var1 == 2) {
            this.b(8, var4, var5);
            this.b(128, var4 + 1, var5);
         }

         if(var1 == 3) {
            this.b(32, var4, var5);
            this.b(2, var4, var5 - 1);
         }
      }

      if(var2 == 1 || var2 == 3) {
         if(var1 == 0) {
            this.b(1, var4, var5);
            this.b(16, var4 - 1, var5 + 1);
         }

         if(var1 == 1) {
            this.b(4, var4, var5);
            this.b(64, var4 + 1, var5 + 1);
         }

         if(var1 == 2) {
            this.b(16, var4, var5);
            this.b(1, var4 + 1, var5 - 1);
         }

         if(var1 == 3) {
            this.b(64, var4, var5);
            this.b(4, var4 - 1, var5 - 1);
         }
      }

      if(var2 == 2) {
         if(var1 == 0) {
            this.b(130, var4, var5);
            this.b(8, var4 - 1, var5);
            this.b(32, var4, var5 + 1);
         }

         if(var1 == 1) {
            this.b(10, var4, var5);
            this.b(32, var4, var5 + 1);
            this.b(128, var4 + 1, var5);
         }

         if(var1 == 2) {
            this.b(40, var4, var5);
            this.b(128, var4 + 1, var5);
            this.b(2, var4, var5 - 1);
         }

         if(var1 == 3) {
            this.b(160, var4, var5);
            this.b(2, var4, var5 - 1);
            this.b(8, var4 - 1, var5);
         }
      }

      if(var3) {
         if(var2 == 0) {
            if(var1 == 0) {
               this.b(65536, var4, var5);
               this.b(4096, var4 - 1, var5);
            }

            if(var1 == 1) {
               this.b(1024, var4, var5);
               this.b(16384, var4, var5 + 1);
            }

            if(var1 == 2) {
               this.b(4096, var4, var5);
               this.b(65536, var4 + 1, var5);
            }

            if(var1 == 3) {
               this.b(16384, var4, var5);
               this.b(1024, var4, var5 - 1);
            }
         }

         if(var2 == 1 || var2 == 3) {
            if(var1 == 0) {
               this.b(512, var4, var5);
               this.b(8192, var4 - 1, var5 + 1);
            }

            if(var1 == 1) {
               this.b(2048, var4, var5);
               this.b('\u8000', var4 + 1, var5 + 1);
            }

            if(var1 == 2) {
               this.b(8192, var4, var5);
               this.b(512, var4 + 1, var5 - 1);
            }

            if(var1 == 3) {
               this.b('\u8000', var4, var5);
               this.b(2048, var4 - 1, var5 - 1);
            }
         }

         if(var2 == 2) {
            if(var1 == 0) {
               this.b(66560, var4, var5);
               this.b(4096, var4 - 1, var5);
               this.b(16384, var4, var5 + 1);
            }

            if(var1 == 1) {
               this.b(5120, var4, var5);
               this.b(16384, var4, var5 + 1);
               this.b(65536, var4 + 1, var5);
            }

            if(var1 == 2) {
               this.b(20480, var4, var5);
               this.b(65536, var4 + 1, var5);
               this.b(1024, var4, var5 - 1);
            }

            if(var1 == 3) {
               this.b(81920, var4, var5);
               this.b(1024, var4, var5 - 1);
               this.b(4096, var4 - 1, var5);
            }
         }
      }

   }

   public final void a(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = 256;
      if(var6) {
         var7 = 131328;
      }

      var3 = var3;
      var4 = var4;
      if(var1 == 1 || var1 == 3) {
         var1 = var2;
         var2 = var5;
         var5 = var1;
      }

      for(var1 = var3; var1 < var3 + var2; ++var1) {
         if(var1 >= 0 && var1 < 104) {
            for(int var8 = var4; var8 < var4 + var5; ++var8) {
               if(var8 >= 0 && var8 < 104) {
                  this.b(var7, var1, var8);
               }
            }
         }
      }

   }

   private void b(int var1, int var2, int var3) {
      this.a[var2][var3] &= 16777215 - var1;
   }
}
