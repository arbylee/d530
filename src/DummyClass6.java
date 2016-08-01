class DummyClass6 {

  static Cache aClass47_2041 = new Cache(64);
  static GameString aClass94_2042 =
    SpawnedGameObject.createString("Spieler kann nicht gefunden werden: ");
  static int[] anIntArray2043 = new int[] {8, 11, 4, 6, 9, 7, 10, 0};
  static GameString COOKIE_PREFIX = SpawnedGameObject.createString("cookieprefix");
  static GameString COMMAND_ERROR_TEST = SpawnedGameObject.createString("::errortest");
  static int anInt2046 = 0;


  public static void method2208(int var0) {
    try {
      aClass47_2041 = null;
      anIntArray2043 = null;
      COMMAND_ERROR_TEST = null;
      COOKIE_PREFIX = null;
      if (var0 != 30358) {
        COMMAND_ERROR_TEST = null;
      }

      aClass94_2042 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "wd.L(" + var0 + ')');
    }
  }

  static final void method2209(byte var0, int var1, int var2) {
    try {
      if (var0 >= -99) {
        method2209((byte) 57, -14, 120);
      }

      BitVariable var3 = ClientScriptCall.method378(var2, (byte) 127);
      int variableId = var3.id;
      int high = var3.high;
      int low = var3.low;
      int var7 = SomethingMidiFile.BIT_MASKS[high - low];
      if (~var1 > -1 || var7 < var1) {
        var1 = 0;
      }

      var7 <<= low;
      TextureSampler39.updateVariable(variableId,
        var1 << low & var7 | ~var7 & LightIntensity.variables[variableId]);
    } catch (RuntimeException var8) {
      throw AbstractGameWorld.cascadeException(var8,
        "wd.K(" + var0 + ',' + var1 + ',' + var2 + ')');
    }
  }

}
