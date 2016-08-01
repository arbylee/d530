final class FaceNormal {

  static long[] aLongArray1631 = new long[256];
  static int anInt1633;
  static GameString aClass94_1636;
  static GameString aClass94_1637;
  static int[] anIntArray1638;

  static {
    for (int var2 = 0; 256 > var2; ++var2) {
      long var0 = (long) var2;

      for (int var3 = 0; 8 > var3; ++var3) {
        if (~(1L & var0) != -2L) {
          var0 >>>= 1;
        } else {
          var0 = var0 >>> 1 ^ -3932672073523589310L;
        }
      }

      aLongArray1631[var2] = var0;
    }

    aClass94_1637 = SpawnedGameObject.createString("Texturen geladen)3");
    aClass94_1636 = SpawnedGameObject.createString("rouge:");
    anIntArray1638 = new int[128];
  }

  int z;
  int x;
  int y;

  public static void method1731(int var0) {
    try {
      anIntArray1638 = null;
      aClass94_1637 = null;
      aClass94_1636 = null;
      aLongArray1631 = null;
      if (var0 != 12881) {
        method1732(null, (byte) -74, -125);
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "qj.A(" + var0 + ')');
    }
  }

  static final GameString method1732(Widget var0, byte var1, int var2) {
    try {
      if (var1 >= -8) {
        anIntArray1638 = null;
      }

      return
        !GameClient.method44(var0).method92(var2, (byte) -110) && var0.anObjectArray314 == null ?
          null :
          (null != var0.aClass94Array171 && var0.aClass94Array171.length > var2
            && var0.aClass94Array171[var2] != null
            && ~var0.aClass94Array171[var2].method1564(1).getLength() != -1 ?
            var0.aClass94Array171[var2] :
            (!LinearHashTable.aBoolean1040 ?
              null :
              RenderAnimation.concat(
                new GameString[] {BufferData.aClass94_1645, SomethingScene.toString(var2)})));
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "qj.B(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ')');
    }
  }
}
