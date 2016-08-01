final class DummyClass52 {

  static int anInt1166;
  static boolean aBoolean1167 = false;
  static AnimationSequence[] aClass142Array1168 = new AnimationSequence[14];
  static float aFloat1169;
  static int anInt1170;
  static FileUnpacker aClass153_1171;
  static int anInt1172;
  static GameString aClass94_1173 = SpawnedGameObject.createString("gr-Un:");
  static int anInt1174 = 99;


  static final int method1423(boolean var0, Buffer var1, GameString var2) {
    try {
      if (var0) {
        method1426(17);
      }

      int var3 = var1.position;
      byte[] var4 = var2.method1568(0);
      var1.writeSmart(-32769, var4.length);
      var1.position += TextureSampler16.huffmanEncoder
        .method1015(var4.length, -81, var1.bytes, var4, 0, var1.position);
      return var1.position + -var3;
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "lg.A(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ?
          "{...}" :
          "null") + ')');
    }
  }

  static final AbstractIndexedColorSprite[] method1424(FileUnpacker var0, byte var1, int var2,
                                                       int var3) {
    try {
      if (var1 != -12) {
        anInt1174 = 37;
      }

      return SomethingTexture4.loadSprites(var0, var2, var3, -30901) ?
        TextureSampler36.method343(1854847236) :
        null;
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "lg.C(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  static final void method1425(int var0) {
    TextureSampler22.anInt3419 = var0;

    for (int var1 = 0; var1 < SocketStream.sceneWidth; ++var1) {
      for (int var2 = 0; var2 < TextureSampler17.sceneHeight; ++var2) {
        if (SomethingTexture1.sceneGraphTiles[var0][var1][var2] == null) {
          SomethingTexture1.sceneGraphTiles[var0][var1][var2] =
            new SceneGraphTile(var0, var1, var2);
        }
      }
    }

  }

  public static void method1426(int var0) {
    try {
      aClass153_1171 = null;
      if (var0 != -25247) {
        aClass142Array1168 = null;
      }

      aClass94_1173 = null;
      aClass142Array1168 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "lg.B(" + var0 + ')');
    }
  }

}
