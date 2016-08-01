final class Inventory extends Node {

  static short[] aShortArray2548;
  static int anInt2549;
  static int[] anIntArray2550 = new int[50];
  static AbstractFrameRegulator frameRateRegulator;
  int[] ids = new int[] {-1};
  int[] counts = new int[] {0};

  static final void method509(int var0, int var1) {
    try {
      --TextureSampler25.amountContextActions;
      if (TextureSampler25.amountContextActions != var1) {
        ArrayUtils.copy(GroundItem.aClass94Array2935, var1 + 1, GroundItem.aClass94Array2935, var1,
          -var1 + TextureSampler25.amountContextActions);
        ArrayUtils.copy(DummyClass8.aClass94Array4016, 1 + var1, DummyClass8.aClass94Array4016,
          var1, TextureSampler25.amountContextActions - var1);
        ArrayUtils.method1358(MonoChromaticImageCache.anIntArray1578, 1 + var1,
          MonoChromaticImageCache.anIntArray1578, var1,
          -var1 + TextureSampler25.amountContextActions);
        ArrayUtils.method1361(TextureSampler27.aShortArray3095, 1 + var1,
          TextureSampler27.aShortArray3095, var1, TextureSampler25.amountContextActions + -var1);
        ArrayUtils.method1356(TextureSampler0.aLongArray3271, 1 + var1,
          TextureSampler0.aLongArray3271, var1, -var1 + TextureSampler25.amountContextActions);
        ArrayUtils.method1358(DummyClass26.anIntArray1613, var1 + var0, DummyClass26.anIntArray1613,
          var1, -var1 + TextureSampler25.amountContextActions);
        ArrayUtils.method1358(DummyClass32.anIntArray512, 1 + var1, DummyClass32.anIntArray512,
          var1, TextureSampler25.amountContextActions + -var1);
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "qe.A(" + var0 + ',' + var1 + ')');
    }
  }

  public static void method510(int var0) {
    try {
      if (var0 > -73) {
        method510(-59);
      }

      frameRateRegulator = null;
      aShortArray2548 = null;
      anIntArray2550 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "qe.B(" + var0 + ')');
    }
  }

}
