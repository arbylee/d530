final class GameException extends RuntimeException {

  static int[] anIntArray2113 = new int[] {2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0};
  static HintMarker[] aClass96Array2114 = new HintMarker[4];
  static int anInt2115 = -1;
  static GameString aClass94_2116 = SpawnedGameObject.createString("Hidden)2use");
  static GameString[] DEFAULT_INVENTORY_OPTIONS = null;
  static int anInt2120 = 0;
  static String serverHost;
  String source;
  Throwable aThrowable2118;


  GameException(Throwable var1, String var2) {
    this.source = var2;
    this.aThrowable2118 = var1;
  }

  static final void method2285(int var0, int var1, int var2, int var3, boolean var4, int var5) {
    try {
      StringNode.anInt2587 = var1;
      if (!var4) {
        TextureSampler9.anInt3103 = var5;
        GroundItem.anInt2938 = var0;
        BZipDecompressorState.anInt144 = var3;
        ClientScript.anInt3695 = var2;
      }
    } catch (RuntimeException var7) {
      throw AbstractGameWorld.cascadeException(var7,
        "ld.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
    }
  }

  static final int method2286(byte var0) {
    try {
      if (var0 != -5) {
        serverHost = null;
      }

      return 6;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ld.A(" + var0 + ')');
    }
  }

  static final int method2287(int var0, byte var1) {
    try {
      return (-98 < ~var0 || ~var0 < -123) && (-225 < ~var0 || ~var0 < -255 || 247 == var0) ?
        (-256 != ~var0 ? (var0 != 156 ? (var1 != 59 ? 72 : var0) : 140) : 159) :
        var0 + -32;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "ld.C(" + var0 + ',' + var1 + ')');
    }
  }

  public static void method2288(boolean var0) {
    anIntArray2113 = null;
    aClass94_2116 = null;
    aClass96Array2114 = null;
    DEFAULT_INVENTORY_OPTIONS = null;
    if (var0) {
      method2287(-64, (byte) -87);
    }

    serverHost = null;
  }

}
