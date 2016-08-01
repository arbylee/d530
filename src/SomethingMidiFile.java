final class SomethingMidiFile extends Node {


  static byte[][] byteArrayPool;
  static int[] BIT_MASKS = new int[32];
  static int anInt2290;
  static int anInt2291;
  private static GameString aClass94_2286 = SpawnedGameObject.createString("wishes to trade with you)3");
  static GameString aClass94_2285 = aClass94_2286;

  static {
    int var0 = 2;

    for (int var1 = 0; var1 < 32; ++var1) {
      BIT_MASKS[var1] = -1 + var0;
      var0 += var0;
    }

    anInt2291 = 1;
  }

  byte[] aByteArray2289;

  SomethingMidiFile(byte[] var1) {
    try {
      this.aByteArray2289 = var1;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld
        .cascadeException(var3, "ea.<init>(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  public static void method118(int var0) {
    try {
      BIT_MASKS = null;
      byteArrayPool = null;
      aClass94_2285 = null;
      if (var0 != 2) {
        method119(null, 91);
      }

      aClass94_2286 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ea.A(" + var0 + ')');
    }
  }

  static final float[] method119(float[] var0, int var1) {
    try {
      if (var0 != null) {
        float[] var2 = new float[var0.length];
        ArrayUtils.method1360(var0, var1, var2, 0, var0.length);
        return var2;
      } else {
        return null;
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld
        .cascadeException(var3, "ea.B(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }
}
