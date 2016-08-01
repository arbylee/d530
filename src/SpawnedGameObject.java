final class SpawnedGameObject extends Node {

  static int anInt2249;
  static int anInt2251;
  static GameString aClass94_2252 = createString("Atteindre");
  static GameString aClass94_2255 = createString("Suche nach Updates )2 ");
  static FileUnpacker fileUnpacker25;
  static GameString aClass94_2260 = createString("Lade Wordpack )2 ");
  int anInt2248;
  int anInt2250;
  int anInt2253;
  int anInt2254;
  int anInt2256;
  int anInt2257;
  int aliveTime = -1;
  int anInt2261 = 0;
  int anInt2262;
  int anInt2263;
  int anInt2264;
  int anInt2265;


  static final int method107(FileUnpacker var0, byte var1) {
    try {
      int var2 = 0;
      if (var0.isLoaded(FloorOverlay.anInt2104)) {
        ++var2;
      }

      if (var0.isLoaded(TextureSampler18.anInt4042)) {
        ++var2;
      }

      if (var0.isLoaded(GameClient.anInt2195)) {
        ++var2;
      }

      if (var0.isLoaded(SubNode.anInt2575)) {
        ++var2;
      }

      if (var0.isLoaded(RenderAnimation.headIconsPrayerFileId)) {
        ++var2;
      }

      if (var0.isLoaded(TextureSampler3.hintHeadIconsFileId)) {
        ++var2;
      }

      if (var0.isLoaded(MilliFrameRegulator.anInt2689)) {
        ++var2;
      }

      if (var1 > -124) {
        method109(68);
      }

      if (var0.isLoaded(TextureSampler34.anInt3061)) {
        ++var2;
      }

      if (var0.isLoaded(SomethingTexture.anInt2633)) {
        ++var2;
      }

      if (var0.isLoaded(DummyClass59.anInt678)) {
        ++var2;
      }

      if (var0.isLoaded(SomethingVolume15.anInt2436)) {
        ++var2;
      }

      if (var0.isLoaded(GlTexture2d.anInt3757)) {
        ++var2;
      }

      if (var0.isLoaded(DummyClass38.floorShadowsFileId)) {
        ++var2;
      }

      if (var0.isLoaded(ObjectCache.anInt1325)) {
        ++var2;
      }

      if (var0.isLoaded(IntegerNode.anInt2471)) {
        ++var2;
      }

      return var2;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "cd.B(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

  static final GameString createString(String string) {
    try {
      byte[] bytes = string.getBytes();
      int len = bytes.length;
      GameString str = new GameString();
      int i = 0;
      str.bytes = new byte[len];

      while (len > i) {
        int ch = bytes[i++] & 255;
        // Special case for symbols: ()*+,-
        if (ch >= 40 && ch <= 45) {
          if (i >= len) {
            break;
          }
          // 0-9
          int offset = bytes[i++] & 255;
          str.bytes[str.length++] = (byte) (offset - 48 + 43 * (ch - 40));
        } else if (~ch != -1) {
          str.bytes[str.length++] = (byte) ch;
        }
      }
      str.pack();
      return str.cache();
    } catch (RuntimeException var8) {
      throw AbstractGameWorld.cascadeException(var8,
        "cd.D(" + (string != null ? "{...}" : "null") + ')');
    }
  }

  public static void method109(int var0) {
    try {
      aClass94_2255 = null;
      aClass94_2260 = null;
      aClass94_2252 = null;
      if (var0 != 2) {
        method109(-22);
      }

      fileUnpacker25 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "cd.A(" + var0 + ')');
    }
  }

  static final void initializeScene(int planes, int sceneWidth, int sceneHeight, int viewportLength,
                                    boolean var4) {
    SocketStream.sceneWidth = sceneWidth;
    TextureSampler17.sceneHeight = sceneHeight;
    TextureSampler8.viewportLength = viewportLength;
    OndemandFileRequest.tiles =
      new SceneGraphTile[planes][SocketStream.sceneWidth][TextureSampler17.sceneHeight];
    DummyClass43.somethingHeightMap =
      new int[planes][SocketStream.sceneWidth + 1][TextureSampler17.sceneHeight + 1];
    if (GlRenderer.useOpenGlRenderer) {
      GameClient.aClass3_Sub11ArrayArray2199 = new SomethingGl0[4][];
    }

    if (var4) {
      SomethingIndex150.aClass3_Sub2ArrayArrayArray2065 =
        new SceneGraphTile[1][SocketStream.sceneWidth][TextureSampler17.sceneHeight];
      TextureSampler16.anIntArrayArray3115 =
        new int[SocketStream.sceneWidth][TextureSampler17.sceneHeight];
      AbstractObjectNode.othrrHeightMap =
        new int[1][SocketStream.sceneWidth + 1][TextureSampler17.sceneHeight + 1];
      if (GlRenderer.useOpenGlRenderer) {
        TextureSampler32.aClass3_Sub11ArrayArray3346 = new SomethingGl0[1][];
      }
    } else {
      SomethingIndex150.aClass3_Sub2ArrayArrayArray2065 = null;
      TextureSampler16.anIntArrayArray3115 = null;
      AbstractObjectNode.othrrHeightMap = null;
      TextureSampler32.aClass3_Sub11ArrayArray3346 = null;
    }

    DummyClass10.method2264(false);
    ByteArrayNode.aClass113Array3610 = new SomethingLight0[500];
    anInt2249 = 0;
    Unsure.aClass113Array1895 = new SomethingLight0[500];
    SomethingTilek.anInt1672 = 0;
    DummyClass50.anIntArrayArrayArray1142 =
      new int[planes][SocketStream.sceneWidth + 1][TextureSampler17.sceneHeight + 1];
    AnimationSequence.aClass25Array1868 = new SceneSomething[5000];
    TextureSampler21.anInt3070 = 0;
    FileCacheRequest.aClass25Array4060 = new SceneSomething[100];
    DummyClass30.adjacentTileOnScreen =
      new boolean[TextureSampler8.viewportLength + TextureSampler8.viewportLength + 1][
        TextureSampler8.viewportLength + TextureSampler8.viewportLength + 1];
    GZipDecompressor.tileOnScreen =
      new boolean[TextureSampler8.viewportLength + TextureSampler8.viewportLength + 2][
        TextureSampler8.viewportLength + TextureSampler8.viewportLength + 2];
    SceneShadowMap.aByteArrayArrayArray1774 =
      new byte[planes][SocketStream.sceneWidth][TextureSampler17.sceneHeight];
  }

}
