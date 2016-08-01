import javax.media.opengl.GL;

final class AudioSomethingSomething extends Node {

  private static GameString aClass94_2525 = SpawnedGameObject.createString("rating: ");
  static GameString aClass94_2499 = SpawnedGameObject.createString("Okay");
  static int anInt2500;
  static GZipDecompressor aClass49_2505 = new GZipDecompressor();
  static GameString aClass94_2518 = SpawnedGameObject.createString("Poser");
  static byte[][] landscapesData;
  static GameString aClass94_2524 =
    SpawnedGameObject.createString("Starte 3D)2Softwarebibliothek)3");
  static FileUnpacker fileUnpacker22;
  static int anInt2529;
  static GameString aClass94_2526 = aClass94_2525;
  int anInt2501;
  int anInt2502;
  int anInt2503;
  SomethingIndex150 aClass166_2504;
  int anInt2506;
  AudioStreamEncoder1 aClass3_Sub24_Sub1_2507;
  int anInt2508;
  SomethingMusic0 aClass3_Sub12_Sub1_2509;
  int anInt2510;
  int anInt2511;
  int anInt2512;
  int anInt2513;
  int anInt2514;
  int anInt2515;
  int anInt2516;
  int anInt2517;
  int anInt2519;
  int anInt2520;
  int anInt2522;
  int anInt2523;
  SomethingVolume15 aClass3_Sub15_2527;

  final void method401(int var1) {
    try {
      this.aClass166_2504 = null;
      this.aClass3_Sub12_Sub1_2509 = null;
      this.aClass3_Sub24_Sub1_2507 = null;
      this.aClass3_Sub15_2527 = null;
      if (var1 != 221) {
        aClass94_2518 = null;
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "mf.A(" + var1 + ')');
    }
  }

  static final void drawScene(int cameraX, int cameraY, int cameraZ, int pitch, int yaw,
                              byte[][][] var5, int[] var6, int[] var7, int[] var8, int[] var9,
                              int[] var10, int var11, byte var12, int var13, int var14) {
    if (cameraX < 0) {
      cameraX = 0;
    } else if (cameraX >= SocketStream.sceneWidth * 128) {
      cameraX = SocketStream.sceneWidth * 128 - 1;
    }

    if (cameraZ < 0) {
      cameraZ = 0;
    } else if (cameraZ >= TextureSampler17.sceneHeight * 128) {
      cameraZ = TextureSampler17.sceneHeight * 128 - 1;
    }

    DummyClass44.pitchSine = DummyClass40.SINE_TABLE[pitch];
    LinearHashTable.pitchCosine = DummyClass40.COSINE_TABLE[pitch];
    TextureSampler25.yawSine = DummyClass40.SINE_TABLE[yaw];
    TextureSampler20.yawCosine = DummyClass40.COSINE_TABLE[yaw];
    MilliFrameRegulator.cameraPosX = cameraX;
    ClientScriptEnum.cameraY = cameraY;
    TextureSampler13.cameraZ = cameraZ;
    TriChromaticImageCache.cameraTileX = cameraX / 128;
    TextureSampler7.cameraTileZ = cameraZ / 128;
    DummyClass9.viewportLowerX =
      TriChromaticImageCache.cameraTileX - TextureSampler8.viewportLength;
    if (DummyClass9.viewportLowerX < 0) {
      DummyClass9.viewportLowerX = 0;
    }

    AbstractObjectNode.viewportLowerZ =
      TextureSampler7.cameraTileZ - TextureSampler8.viewportLength;
    if (AbstractObjectNode.viewportLowerZ < 0) {
      AbstractObjectNode.viewportLowerZ = 0;
    }

    MapScene.viewportUpperX = TriChromaticImageCache.cameraTileX + TextureSampler8.viewportLength;
    if (MapScene.viewportUpperX > SocketStream.sceneWidth) {
      MapScene.viewportUpperX = SocketStream.sceneWidth;
    }

    SomethingTilek.viewportUpperZ = TextureSampler7.cameraTileZ + TextureSampler8.viewportLength;
    if (SomethingTilek.viewportUpperZ > TextureSampler17.sceneHeight) {
      SomethingTilek.viewportUpperZ = TextureSampler17.sceneHeight;
    }

    short far;
    if (GlRenderer.useOpenGlRenderer) {
      far = 3584;
    } else {
      far = 3500;
    }

    int offsetX;
    int offsetZ;
    for (
      offsetX = 0;
      offsetX < TextureSampler8.viewportLength + TextureSampler8.viewportLength + 2; offsetX++) {
      for (
        offsetZ = 0;
        offsetZ < TextureSampler8.viewportLength + TextureSampler8.viewportLength + 2; offsetZ++) {
        int sceneX =
          (offsetX - TextureSampler8.viewportLength << 7) - (MilliFrameRegulator.cameraPosX & 127);
        int sceneZ =
          (offsetZ - TextureSampler8.viewportLength << 7) - (TextureSampler13.cameraZ & 127);
        int sceneTileX =
          offsetX + TriChromaticImageCache.cameraTileX - TextureSampler8.viewportLength;
        int sceneTileZ = offsetZ + TextureSampler7.cameraTileZ - TextureSampler8.viewportLength;
        if (sceneTileX >= 0 && sceneTileZ >= 0 && sceneTileX < SocketStream.sceneWidth
          && sceneTileZ < TextureSampler17.sceneHeight) {
          int lowerZ;
          if (AbstractObjectNode.othrrHeightMap != null) {
            lowerZ = AbstractObjectNode.othrrHeightMap[0][sceneTileX][sceneTileZ]
              - ClientScriptEnum.cameraY + 128;
          } else {
            lowerZ =
              DummyClass43.somethingHeightMap[0][sceneTileX][sceneTileZ] - ClientScriptEnum.cameraY
                + 128;
          }

          int upperZ =
            DummyClass43.somethingHeightMap[3][sceneTileX][sceneTileZ] - ClientScriptEnum.cameraY
              - 1000;
          GZipDecompressor.tileOnScreen[offsetX][offsetZ] =
            CollisionMap.isOnScreen(sceneX, upperZ, lowerZ, sceneZ, far);
        } else {
          GZipDecompressor.tileOnScreen[offsetX][offsetZ] = false;
        }
      }
    }

    for (
      offsetX = 0;
      offsetX < TextureSampler8.viewportLength + TextureSampler8.viewportLength + 1; offsetX++) {
      for (
        offsetZ = 0;
        offsetZ < TextureSampler8.viewportLength + TextureSampler8.viewportLength + 1; offsetZ++) {
        DummyClass30.adjacentTileOnScreen[offsetX][offsetZ] =
          GZipDecompressor.tileOnScreen[offsetX][offsetZ] || GZipDecompressor.tileOnScreen[offsetX
            + 1][offsetZ] || GZipDecompressor.tileOnScreen[offsetX][offsetZ + 1]
            || GZipDecompressor.tileOnScreen[offsetX + 1][offsetZ + 1];
      }
    }

    TextureSampler6.anIntArray3045 = var6;
    FileCacheRequester.anIntArray1083 = var7;
    PlayerAppearance.anIntArray859 = var8;
    SomethingTexture4.anIntArray2663 = var9;
    DummyInputStream.anIntArray39 = var10;
    SomethingScene.method1294();
    if (SomethingIndex150.aClass3_Sub2ArrayArrayArray2065 != null) {
      DummyClass10.method2264(true);
      AbstractMouseWheel.drawScene(cameraX, cameraY, cameraZ, null, 0, (byte) 0, var13, var14);
      if (GlRenderer.useOpenGlRenderer) {
        TextureSampler23.aBoolean3207 = false;
        SomethingQuickChat.method551(0, 0, 0);
        GlEnvironment.setFogColor(null);
        DummyClass46.disableLights();
      }

      DummyClass10.method2264(false);
    }

    AbstractMouseWheel.drawScene(cameraX, cameraY, cameraZ, var5, var11, var12, var13, var14);
  }

  public static void method399(int var0) {
    try {
      if (var0 != 186) {
        aClass94_2518 = null;
      }

      aClass94_2525 = null;
      landscapesData = null;
      aClass94_2524 = null;
      fileUnpacker22 = null;
      aClass94_2526 = null;
      aClass94_2499 = null;
      aClass49_2505 = null;
      aClass94_2518 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "mf.E(" + var0 + ')');
    }
  }

  static final void method400(long var0, int var2) {
    try {
      if ((long) var2 != var0) {
        TextureSampler12.secureBuffer.writePacket(104);
        TextureSampler12.secureBuffer.writeLong(var0);
        ++DummyClass4.anInt3001;
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "mf.F(" + var0 + ',' + var2 + ')');
    }
  }

  static final void initializeKeyTable() {
    try {
      if (~SignLink.aString1216.toLowerCase().indexOf("microsoft") != 0) {
        DummyClass26.keyTable[187] = 27;
        DummyClass26.keyTable[223] = 28;
        DummyClass26.keyTable[221] = 43;
        DummyClass26.keyTable[188] = 71;
        DummyClass26.keyTable[222] = 59;
        DummyClass26.keyTable[192] = 58;
        DummyClass26.keyTable[191] = 73;
        DummyClass26.keyTable[219] = 42;
        DummyClass26.keyTable[190] = 72;
        DummyClass26.keyTable[186] = 57;
        DummyClass26.keyTable[220] = 74;
        DummyClass26.keyTable[189] = 26;
      } else {
        if (null == SignLink.setFocusTraversalKeyEnabledMethod) {
          DummyClass26.keyTable[192] = 58;
          DummyClass26.keyTable[222] = 59;
        } else {
          DummyClass26.keyTable[222] = 58;
          DummyClass26.keyTable[192] = 28;
          DummyClass26.keyTable[520] = 59;
        }

        DummyClass26.keyTable[45] = 26;
        DummyClass26.keyTable[61] = 27;
        DummyClass26.keyTable[91] = 42;
        DummyClass26.keyTable[59] = 57;
        DummyClass26.keyTable[93] = 43;
        DummyClass26.keyTable[44] = 71;
        DummyClass26.keyTable[92] = 74;
        DummyClass26.keyTable[46] = 72;
        DummyClass26.keyTable[47] = 73;
      }


    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "mf.O()");
    }
  }

  static final void method403() {
    GL var0 = GlRenderer.gl;
    var0.glDisableClientState('\u8076');
    GlRenderer.setLightingEnabled(false);
    var0.glDisable(2929);
    var0.glPushAttrib(128);
    var0.glFogf(2915, 3072.0F);
    GlRenderer.method1851();

    for (int var1 = 0; var1 < GameClient.aClass3_Sub11ArrayArray2199[0].length; ++var1) {
      SomethingGl0 var2 = GameClient.aClass3_Sub11ArrayArray2199[0][var1];
      if (var2.materialId >= 0 && DummyClass40.textureCache.method18(var2.materialId, 255) == 4) {
        var0.glColor4fv(MonoChromaticImageCache.method1705(var2.anInt2355, 0), 0);
        float var3 = 201.5F - (var2.aBoolean2364 ? 1.0F : 0.5F);
        var2.method149(SomethingTexture1.sceneGraphTiles, var3, true);
      }
    }

    var0.glEnableClientState('\u8076');
    GlRenderer.method1846();
    var0.glEnable(2929);
    var0.glPopAttrib();
    GlRenderer.method1830();
  }

  static final SomethingTexture4 method404(byte var0, Buffer var1) {
    try {
      return var0 > -55 ?
        null :
        new SomethingTexture4(var1.method787((byte) 93), var1.method787((byte) 55),
          var1.method787((byte) 81), var1.method787((byte) 95), var1.readUnsignedMedium((byte) 124),
          var1.readUnsignedMedium((byte) 120), var1.readUnsignedByte());
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "mf.C(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
    }
  }

}
