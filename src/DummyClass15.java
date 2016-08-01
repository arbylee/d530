final class DummyClass15 {

  static int anInt1873;
  static ObjectCache aClass93_1874 = new ObjectCache(50);
  static int state = 0;
  static GameString aClass94_1877 = SpawnedGameObject.createString(":assist:");
  static GameString aClass94_1878 = SpawnedGameObject.createString("tremblement:");
  static GameString aClass94_1880 = SpawnedGameObject.createString(")1");
  private static GameString aClass94_1876 = SpawnedGameObject.createString("Loaded fonts");
  static GameString aClass94_1879 = aClass94_1876;

  static final void method2062(int var0, int var1, int var2, int var3, int var4, int var5, int var6,
                               int var7) {
    try {
      int var12 =
        DummyClass59.method1040(LightIntensity.anInt902, var6, (byte) 0, DummyClass13.anInt2020);
      int var13 =
        DummyClass59.method1040(LightIntensity.anInt902, var3, (byte) 0, DummyClass13.anInt2020);
      int var14 =
        DummyClass59.method1040(GlTexture2d.anInt3765, var7, (byte) 0, DummyClass55.anInt1425);
      int var15 =
        DummyClass59.method1040(GlTexture2d.anInt3765, var0, (byte) 0, DummyClass55.anInt1425);
      int var8 = DummyClass59
        .method1040(LightIntensity.anInt902, var4 + var6, (byte) 0, DummyClass13.anInt2020);
      int var9 = DummyClass59
        .method1040(LightIntensity.anInt902, -var4 + var3, (byte) 0, DummyClass13.anInt2020);

      int var16;
      for (var16 = var12; ~var16 > ~var8; ++var16) {
        TextureSampler18.method282(DummyClass35.anIntArrayArray663[var16], var14, 97, var15, var5);
      }

      for (var16 = var13; ~var16 < ~var9; --var16) {
        TextureSampler18.method282(DummyClass35.anIntArrayArray663[var16], var14, 94, var15, var5);
      }

      int var10 = DummyClass59
        .method1040(GlTexture2d.anInt3765, var4 + var7, (byte) 0, DummyClass55.anInt1425);
      int var11 = DummyClass59
        .method1040(GlTexture2d.anInt3765, -var4 + var0, (byte) 0, DummyClass55.anInt1425);
      if (var2 >= -88) {
        aClass94_1876 = null;
      }

      for (var16 = var8; ~var16 >= ~var9; ++var16) {
        int[] var17 = DummyClass35.anIntArrayArray663[var16];
        TextureSampler18.method282(var17, var14, 105, var10, var5);
        TextureSampler18.method282(var17, var10, 111, var11, var1);
        TextureSampler18.method282(var17, var11, 109, var15, var5);
      }

    } catch (RuntimeException var18) {
      throw AbstractGameWorld.cascadeException(var18,
        "tl.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6
          + ',' + var7 + ')');
    }
  }

  public static void method2063(int var0) {
    try {
      aClass94_1878 = null;
      aClass93_1874 = null;
      aClass94_1880 = null;
      aClass94_1877 = null;
      aClass94_1876 = null;
      if (var0 == 0) {
        aClass94_1879 = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "tl.A(" + var0 + ')');
    }
  }

}
