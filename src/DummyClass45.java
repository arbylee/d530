final class DummyClass45 {

  static GameString aClass94_981 = SpawnedGameObject.createString("S-Blectionner");
  static GameString aClass94_982 = SpawnedGameObject.createString("niveau ");
  static Deque aClass61_983 = new Deque();
  static int anInt984 = 0;
  static GameString aClass94_985 = SpawnedGameObject.createString("Fps:");
  static Buffer[] configs = new Buffer[2048];
  static int anInt987 = 0;
  static GameString aClass94_988 =
    SpawnedGameObject.createString("voudrait faire un -Bchange avec vous)3");
  static GameString aClass94_989 =
    SpawnedGameObject.createString(" est d-Bj-9 dans votre liste d(Wamis)3");
  static int spawnSceneX;
  static int anInt991 = -1;
  static GameString aClass94_992 = SpawnedGameObject.createString("http:)4)4");


  static final int[] method1233(int[] var0, int var1) {
    try {
      if (null != var0) {
        if (var1 != 2) {
          anInt984 = 113;
        }

        int[] var2 = new int[var0.length];
        ArrayUtils.method1358(var0, 0, var2, 0, var0.length);
        return var2;
      } else {
        return null;
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld
        .cascadeException(var3, "ja.H(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

  static final int method1234(int var0, int var1, int var2, int var3) {
    try {
      int var4 = var1 / var0;
      int var6 = var2 / var0;
      int var7 = var2 & var0 - 1;
      int var5 = -1 + var0 & var1;
      int var8 = SomethingWorldMapy.method543(var4, var6, (byte) -82);
      int var9 = SomethingWorldMapy.method543(var4 + 1, var6, (byte) -104);
      int var10 = SomethingWorldMapy.method543(var4, 1 + var6, (byte) -100);
      if (var3 != 512) {
        return -57;
      } else {
        int var11 = SomethingWorldMapy.method543(1 + var4, var6 + 1, (byte) -109);
        int var12 = TextureSampler39.method275(var8, var9, var5, 96, var0);
        int var13 = TextureSampler39.method275(var10, var11, var5, 16, var0);
        return TextureSampler39.method275(var12, var13, var7, 87, var0);
      }
    } catch (RuntimeException var14) {
      throw AbstractGameWorld
        .cascadeException(var14, "ja.G(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  static final void method1235(int var0, int var1, int var2, int var3, byte var4) {
    try {
      if (HuffmanEncoder.anInt638 == 1) {
        DummyClass17.aClass3_Sub28_Sub16Array1825[FileRequester.anInt2958 / 100]
          .method643(-8 + SceneSomething2.anInt1053, -8 + FileCacheRequest.anInt4062);
      }

      if (var4 != -121) {
        spawnSceneX = -21;
      }

      if (~HuffmanEncoder.anInt638 == -3) {
        DummyClass17.aClass3_Sub28_Sub16Array1825[4 + FileRequester.anInt2958 / 100]
          .method643(SceneSomething2.anInt1053 + -8, -8 + FileCacheRequest.anInt4062);
      }

      TextureSampler10.method347(true);
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "ja.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
    }
  }

  static final void setQuickchatFileUnpackers(FileUnpacker var0, FileUnpacker var1, int var2) {
    try {
      Cache.quickchats = var1;
      if (var2 >= -94) {
        aClass94_992 = null;
      }

      Queue.globalQuickchats = var0;
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "ja.F(" + (var0 != null ? "{...}" : "null") + ',' + (var1 != null ? "{...}" : "null") + ','
          + var2 + ')');
    }
  }

  static final void method1237(int var0, int var1) {
    try {
      GameWorld.deltaTime = var1 / var0;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "ja.D(" + var0 + ',' + var1 + ')');
    }
  }

  public static void method1238(int var0) {
    try {
      aClass94_992 = null;
      if (var0 < -83) {
        aClass94_988 = null;
        aClass61_983 = null;
        aClass94_989 = null;
        aClass94_985 = null;
        aClass94_981 = null;
        configs = null;
        aClass94_982 = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ja.B(" + var0 + ')');
    }
  }

  static final void method1239(int var0, int var1, int var2, int var3, int var4, boolean var5) {
    try {
      if (-2 < ~var0) {
        var0 = 1;
      }

      if (1 > var3) {
        var3 = 1;
      }

      if (GlRenderer.useOpenGlRenderer) {
        int var6 = var3 + -334;
        if (0 <= var6) {
          if (~var6 < -101) {
            var6 = 100;
          }
        } else {
          var6 = 0;
        }

        int var7 = var6 * (TextureSampler33.aShort3052 + -DisplayMode.aShort1444) / 100
          + DisplayMode.aShort1444;
        if (TextureSampler4.aShort3241 <= var7) {
          if (DummyClass18.aShort83 < var7) {
            var7 = DummyClass18.aShort83;
          }
        } else {
          var7 = TextureSampler4.aShort3241;
        }

        int var8 = var7 * var3 * 512 / (var0 * 334);
        int var9;
        int var10;
        short var12;
        if (var8 >= GameWorldSomething.aShort505) {
          if (~TextureSampler18.aShort4038 > ~var8) {
            var12 = TextureSampler18.aShort4038;
            var7 = var12 * var0 * 334 / (var3 * 512);
            if (~TextureSampler4.aShort3241 < ~var7) {
              var7 = TextureSampler4.aShort3241;
              var9 = var12 * var0 * 334 / (512 * var7);
              var10 = (-var9 + var3) / 2;
              if (var5) {
                GlUtils.resetClip();
                GlUtils.fillQuad(var4, var2, var0, var10, 0);
                GlUtils.fillQuad(var4, var2 + (var3 - var10), var0, var10, 0);
              }

              var3 -= var10 * 2;
              var2 += var10;
            }
          }
        } else {
          var12 = GameWorldSomething.aShort505;
          var7 = 334 * var0 * var12 / (512 * var3);
          if (DummyClass18.aShort83 < var7) {
            var7 = DummyClass18.aShort83;
            var9 = 512 * var3 * var7 / (334 * var12);
            var10 = (var0 - var9) / 2;
            if (var5) {
              GlUtils.resetClip();
              GlUtils.fillQuad(var4, var2, var10, var3, 0);
              GlUtils.fillQuad(var0 + (var4 - var10), var2, var10, var3, 0);
            }

            var4 += var10;
            var0 -= 2 * var10;
          }
        }

        HashTable.anInt1705 = var7 * var3 / 334;
      }

      HintMarker.anInt1358 = (short) var0;
      ComponentCanvas.anInt31 = (short) var3;
      if (var1 < 11) {
        method1233(null, 18);
      }

      SomethingWorldMapy.anInt3564 = var2;
      DummyClass5.anInt2989 = var4;
    } catch (RuntimeException var11) {
      throw AbstractGameWorld.cascadeException(var11,
        "ja.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
    }
  }

  static final void method1240(boolean var0) {
    try {
      SomethingTilek.p12Font = null;
      SomethingTexture3.aClass3_Sub28_Sub16Array2656 = null;
      DummyClass17.aClass3_Sub28_Sub16Array1825 = null;
      TextureSampler0.aClass109Array3270 = null;
      SomethingAudio.aClass3_Sub28_Sub17_Sub1_2000 = null;
      TextureCache.aClass3_Sub28_Sub16_Sub2Array2140 = null;
      Mobile.aClass3_Sub28_Sub16Array2839 = null;
      MilliFrameRegulator.aClass3_Sub28_Sub16Array2690 = null;
      NPC.aClass3_Sub28_Sub16Array3977 = null;
      FloorOverlay.aClass3_Sub28_Sub17_2096 = null;
      LightIntensity.aClass3_Sub28_Sub16_895 = null;
      HashTableIterator.aClass3_Sub28_Sub16Array1136 = null;
      AbstractTextureSampler.aClass3_Sub28_Sub17_2379 = null;
      DummyClass38.aClass3_Sub28_Sub16_736 = null;
      OndemandRequester.aClass3_Sub28_Sub16Array996 = null;
      TextureSampler8.aClass3_Sub28_Sub16Array3458 = null;
      SomethingIndex150.aClass3_Sub28_Sub16Array2072 = null;
      TextureSampler2.aClass3_Sub28_Sub16Array3373 = null;
      SceneNode.aClass109Array1831 = null;
      if (var0) {
        method1233(null, -51);
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ja.E(" + var0 + ')');
    }
  }

}
