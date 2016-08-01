abstract class AbstractFileRequester {

  static GameString aClass94_1932 = SpawnedGameObject.createString(")4a=");
  static Widget aClass11_1933;
  static float[] aFloatArray1934 = new float[] {0.073F, 0.169F, 0.24F, 1.0F};
  static GameString COMMAND_DROP_CLIENT = SpawnedGameObject.createString("::clientdrop");
  static FileSystem fileSystem;


  public static void method2093(int var0) {
    try {
      fileSystem = null;
      aClass94_1932 = null;
      aFloatArray1934 = null;
      COMMAND_DROP_CLIENT = null;
      aClass11_1933 = null;
      if (var0 != 1) {
        method2096(-83, 44, -77, 121L);
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "v.R(" + var0 + ')');
    }
  }

  static final boolean method2096(int var0, int var1, int var2, long var3) {
    SceneGraphTile var5 = SomethingTexture1.sceneGraphTiles[var0][var1][var2];
    if (var5 == null) {
      return false;
    } else if (var5.aClass70_2234 != null && var5.aClass70_2234.key == var3) {
      return true;
    } else if (var5.aClass19_2233 != null && var5.aClass19_2233.aLong428 == var3) {
      return true;
    } else if (var5.aClass12_2230 != null && var5.aClass12_2230.aLong328 == var3) {
      return true;
    } else {
      for (int var6 = 0; var6 < var5.anInt2223; ++var6) {
        if (var5.sceneGraphNodes[var6].aLong498 == var3) {
          return true;
        }
      }

      return false;
    }
  }

  static final void method2099(boolean var0, int var1, int var2, FileUnpacker var3, boolean var4,
                               int var5, int var6) {
    try {
      DummyClass55.aClass153_1423 = var3;
      DummyClass22.anInt1741 = var2;
      TextureSampler8.anInt3463 = var1;
      AreaSoundEffect.aBoolean2311 = var4;
      SomethingQuickChatK.anInt154 = 1;
      SpotAnimationConfig.anInt546 = var6;
      if (!var0) {
        method2096(-8, 46, 45, -6L);
      }

      TextureSampler36.anInt3423 = var5;
    } catch (RuntimeException var8) {
      throw AbstractGameWorld.cascadeException(var8,
        "v.Q(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ','
          + var4 + ',' + var5 + ',' + var6 + ')');
    }
  }

  abstract FileTable method2094(int var1);

  abstract void method2095(int var1, int var2);

  abstract int method2097(int var1, int var2);

  abstract byte[] method2098(int var1, int var2);

}
