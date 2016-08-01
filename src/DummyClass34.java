final class DummyClass34 {

  static int anInt590 = -1;
  static GameString aClass94_591 = SpawnedGameObject.createString("Lade Benutzeroberfl-=che )2 ");
  static GameString aClass94_592 = SpawnedGameObject.createString("<img=0>");
  static GameString aClass94_593 = SpawnedGameObject.createString("Utiliser");


  static final GameString decompressString(Buffer var0) {
    try {
      return GroundItem.decompressString(var0, 32767);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld
        .cascadeException(var3, "fc.C(" + (var0 != null ? "{...}" : "null") + ')');
    }
  }

  static final int perlinNoise(int var0, int var2) {
    try {
      int var3 = -128 + (DummyClass45.method1234(4, var2 + '\ub135', var0 - -91923, 512) + (
        DummyClass45.method1234(2, var2 + 10294, '\u93bd' + var0, 512) + -128 >> 1) - -(
        DummyClass45.method1234(1, var2, var0, 512) + -128 >> 2));
      var3 = 35 + (int) (0.3D * (double) var3);
      if (-11 >= ~var3) {
        if (var3 > 60) {
          var3 = 60;
        }
      } else {
        var3 = 10;
      }

      return var3;
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "fc.B(" + var0 + ',' + var2 + ')');
    }
  }

  public static void method994(int var0) {
    try {
      aClass94_591 = null;
      if (var0 == '\u93bd') {
        aClass94_592 = null;
        aClass94_593 = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "fc.A(" + var0 + ')');
    }
  }

  static final void method995() {
    int var0;
    int var1;
    int var2;
    if (OndemandFileRequest.tiles != null) {
      for (var0 = 0; var0 < OndemandFileRequest.tiles.length; ++var0) {
        for (var1 = 0; var1 < SocketStream.sceneWidth; ++var1) {
          for (var2 = 0; var2 < TextureSampler17.sceneHeight; ++var2) {
            OndemandFileRequest.tiles[var0][var1][var2] = null;
          }
        }
      }
    }

    GameClient.aClass3_Sub11ArrayArray2199 = null;
    if (SomethingIndex150.aClass3_Sub2ArrayArrayArray2065 != null) {
      for (var0 = 0; var0 < SomethingIndex150.aClass3_Sub2ArrayArrayArray2065.length; ++var0) {
        for (var1 = 0; var1 < SocketStream.sceneWidth; ++var1) {
          for (var2 = 0; var2 < TextureSampler17.sceneHeight; ++var2) {
            SomethingIndex150.aClass3_Sub2ArrayArrayArray2065[var0][var1][var2] = null;
          }
        }
      }
    }

    TextureSampler32.aClass3_Sub11ArrayArray3346 = null;
    SpawnedGameObject.anInt2249 = 0;
    if (ByteArrayNode.aClass113Array3610 != null) {
      for (var0 = 0; var0 < SpawnedGameObject.anInt2249; ++var0) {
        ByteArrayNode.aClass113Array3610[var0] = null;
      }
    }

    if (AnimationSequence.aClass25Array1868 != null) {
      for (var0 = 0; var0 < TextureSampler21.anInt3070; ++var0) {
        AnimationSequence.aClass25Array1868[var0] = null;
      }

      TextureSampler21.anInt3070 = 0;
    }

    if (FileCacheRequest.aClass25Array4060 != null) {
      for (var0 = 0; var0 < FileCacheRequest.aClass25Array4060.length; ++var0) {
        FileCacheRequest.aClass25Array4060[var0] = null;
      }
    }

  }

  static final void method996(int var0) {
    try {
      if (var0 >= -35) {
        perlinNoise(3, -24);
      }

      Keyboard var1 = TextureSampler33.keyboard;
      synchronized (var1) {
        Parameter.anInt3620 = DummyClass21.anInt1762;
        ++TextureSampler29.anInt3398;
        int var2;
        if (AbstractTextureSampler.anInt2384 < 0) {
          for (var2 = 0; ~var2 > -113; ++var2) {
            GameObjectConfig.aBooleanArray1490[var2] = false;
          }

          AbstractTextureSampler.anInt2384 = SomethingPacket116.anInt1744;
        } else {
          while (AbstractTextureSampler.anInt2384 != SomethingPacket116.anInt1744) {
            var2 = FileRequester.anIntArray2952[SomethingPacket116.anInt1744];
            SomethingPacket116.anInt1744 = 127 & 1 + SomethingPacket116.anInt1744;
            if (0 <= var2) {
              GameObjectConfig.aBooleanArray1490[var2] = true;
            } else {
              GameObjectConfig.aBooleanArray1490[~var2] = false;
            }
          }
        }

        DummyClass21.anInt1762 = SceneSomething.anInt491;
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5, "fc.E(" + var0 + ')');
    }
  }

}
