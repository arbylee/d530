final class DummyClass14 {

  static ObjectCache aClass93_1955 = new ObjectCache(64);
  static int anInt1956;
  static int anInt1957;
  static int[] anIntArray1960 = new int[14];
  static ObjectCache aClass93_1964 = new ObjectCache(5);
  static ObjectCache aClass93_1965 = new ObjectCache(50);
  static int titleBackgroundFileId = -1;
  static FileUnpacker aClass153_1967;
  private static GameString aClass94_1958 =
    SpawnedGameObject.createString("Please wait )2 attempting to reestablish)3");
  static GameString ATTEMPTING_TO_RECONNECT = aClass94_1958;
  private static GameString aClass94_1963 = SpawnedGameObject.createString("glow2:");
  static GameString aClass94_1961 = aClass94_1963;
  static GameString aClass94_1962 = aClass94_1963;

  public static void method2145(byte var0) {
    try {
      aClass93_1955 = null;
      aClass94_1962 = null;
      ATTEMPTING_TO_RECONNECT = null;
      if (var0 >= -41) {
        method2147(-28, 103, -37);
      }

      aClass94_1958 = null;
      aClass94_1963 = null;
      anIntArray1960 = null;
      aClass153_1967 = null;
      aClass93_1965 = null;
      aClass94_1961 = null;
      aClass93_1964 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "vf.A(" + var0 + ')');
    }
  }

  static final void method2146(int var0, int var1, int var2, int var3, SceneNode var4,
                               SceneNode var5, int var6, int var7, long var8) {
    if (var4 != null || var5 != null) {
      SceneSomething2 var10 = new SceneSomething2();
      var10.key = var8;
      var10.positionX = var1 * 128 + 64;
      var10.positionZ = var2 * 128 + 64;
      var10.positionY = var3;
      var10.sceneNode0 = var4;
      var10.sceneNode1 = var5;
      var10.anInt1055 = var6;
      var10.anInt1059 = var7;

      for (int var11 = var0; var11 >= 0; --var11) {
        if (SomethingTexture1.sceneGraphTiles[var11][var1][var2] == null) {
          SomethingTexture1.sceneGraphTiles[var11][var1][var2] =
            new SceneGraphTile(var11, var1, var2);
        }
      }

      SomethingTexture1.sceneGraphTiles[var0][var1][var2].aClass70_2234 = var10;
    }
  }

  static final SceneSomething2 method2147(int var0, int var1, int var2) {
    SceneGraphTile var3 = SomethingTexture1.sceneGraphTiles[var0][var1][var2];
    return var3 == null ? null : var3.aClass70_2234;
  }

  static final GameString method2148(int var0, byte var1) {
    try {
      if (999999999 <= var0) {
        if (var1 != -78) {
          method2145((byte) -8);
        }

        return DummyHashTable.aClass94_1687;
      } else {
        return SomethingScene.toString(var0);
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "vf.C(" + var0 + ',' + var1 + ')');
    }
  }

}
