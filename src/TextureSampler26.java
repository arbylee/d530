final class TextureSampler26 extends AbstractTextureSampler {

  static Deque aClass61_3075 = new Deque();
  static int[] anIntArray3076;
  static FileUnpacker maps;
  static boolean focused;
  static GameString aClass94_3079 = SpawnedGameObject.createString("Examiner");
  static GameString aClass94_3080 = DummyClass53.method1586(23161, 160);
  static int anInt3081 = 0;
  static int[] anIntArray3082 = new int[100];
  static int[] anIntArray3083 = new int[50];
  static int anInt3084;
  private int anInt3073 = 0;
  private int anInt3074 = 4096;


  public TextureSampler26() {
    super(1, true);
  }

  final int[] method154(int var1, byte var2) {
    try {
      int var3 = 69 / ((var2 - 30) / 36);
      int[] var4 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        int[] var5 = this.method152(0, var1, 32755);

        for (int var6 = 0; var6 < SomethingLight0.anInt1559; ++var6) {
          int var7 = var5[var6];
          var4[var6] = ~this.anInt3073 >= ~var7 && ~var7 >= ~this.anInt3074 ? 4096 : 0;
        }
      }

      return var4;
    } catch (RuntimeException var8) {
      throw AbstractGameWorld.cascadeException(var8, "ca.D(" + var1 + ',' + var2 + ')');
    }
  }

  final void parseConfig(int var1, Buffer var2, boolean var3) {
    try {
      if (!var3) {
        method196(true);
      }

      if (~var1 != -1) {
        if (1 == var1) {
          this.anInt3074 = var2.readUnsignedShort();
        }
      } else {
        this.anInt3073 = var2.readUnsignedShort();
      }

    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "ca.A(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
    }
  }

  static final void method195(int var0) {
    try {
      int var1 = (NPC.anInt3995 >> 10) - -(WorldMapLabel.anInt1716 >> 3);
      int var2 = (DummyClass49.anInt1111 >> 10) - -(ProceduralTexture.anInt1152 >> 3);
      if (var0 == 20479) {
        byte var3 = 0;
        byte var4 = 8;
        byte var6 = 18;
        AudioSomethingSomething.landscapesData = new byte[var6][];
        AnimationSomething.updatedLandscapeIds = new int[var6];
        TextureSampler35.aByteArrayArray3335 = new byte[var6][];
        GameClient.mapFileIds = new int[var6];
        AreaSoundEffect.landscapeEncryptionKeys = new int[var6][4];
        GroundItemNode.updatedMapsData = new byte[var6][];
        AudioStreamEncoder3.regionHashes = new int[var6];
        Something3d2.aByteArrayArray3027 = new byte[var6][];
        TextureSampler5.anIntArray3290 = new int[var6];
        TextureSampler17.updatedMapIds = new int[var6];
        DummyClass55.landscapeFileIds = new int[var6];
        byte var5 = 8;
        TextureSampler34.updatedLandscapesData = new byte[var6][];
        int var11 = 0;

        int var7;
        for (var7 = (-6 + var1) / 8; ~var7 >= ~((6 + var1) / 8); ++var7) {
          for (int var8 = (-6 + var2) / 8; ~((var2 + 6) / 8) <= ~var8; ++var8) {
            int var9 = (var7 << 8) - -var8;
            AudioStreamEncoder3.regionHashes[var11] = var9;
            GameClient.mapFileIds[var11] = maps.getFileId(RenderAnimation.concat(new GameString[] {
              GameBuffer.MAP_PREFIX, SomethingScene.toString(var7), TextureSampler31.UNDERSCORE,
              SomethingScene.toString(var8)
            }));
            DummyClass55.landscapeFileIds[var11] =
              maps.getFileId(RenderAnimation.concat(new GameString[] {
                DummyClass12.LANDSCAPE_PREFIX, SomethingScene.toString(var7),
                TextureSampler31.UNDERSCORE, SomethingScene.toString(var8)
              }));
            TextureSampler5.anIntArray3290[var11] =
              maps.getFileId(RenderAnimation.concat(new GameString[] {
                DummyCanvas.aClass94_26, SomethingScene.toString(var7), TextureSampler31.UNDERSCORE,
                SomethingScene.toString(var8)
              }));
            TextureSampler17.updatedMapIds[var11] =
              maps.getFileId(RenderAnimation.concat(new GameString[] {
                DummyClass53.UM_PREFIX, SomethingScene.toString(var7), TextureSampler31.UNDERSCORE,
                SomethingScene.toString(var8)
              }));
            AnimationSomething.updatedLandscapeIds[var11] =
              maps.getFileId(RenderAnimation.concat(new GameString[] {
                DummyClass10.UL_PREFIX, SomethingScene.toString(var7), TextureSampler31.UNDERSCORE,
                SomethingScene.toString(var8)
              }));
            if (~TextureSampler5.anIntArray3290[var11] == 0) {
              GameClient.mapFileIds[var11] = -1;
              DummyClass55.landscapeFileIds[var11] = -1;
              TextureSampler17.updatedMapIds[var11] = -1;
              AnimationSomething.updatedLandscapeIds[var11] = -1;
            }

            ++var11;
          }
        }

        for (var7 = var11; ~var7 > ~TextureSampler5.anIntArray3290.length; ++var7) {
          TextureSampler5.anIntArray3290[var7] = -1;
          GameClient.mapFileIds[var7] = -1;
          DummyClass55.landscapeFileIds[var7] = -1;
          TextureSampler17.updatedMapIds[var7] = -1;
          AnimationSomething.updatedLandscapeIds[var7] = -1;
        }

        FileCacheRequester.rebuildScene(var3, var2, var1, var5, true, var4, true);
      }
    } catch (RuntimeException var10) {
      throw AbstractGameWorld.cascadeException(var10, "ca.F(" + var0 + ')');
    }
  }

  static final void method196(boolean var0) {
    try {
      FileCache.aClass93_684.method1523((byte) -117);
      DummyClass5.aClass93_2984.method1523((byte) -111);
      if (var0) {
        anIntArray3083 = null;
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ca.B(" + var0 + ')');
    }
  }

  public static void method197(int var0) {
    try {
      aClass94_3079 = null;
      anIntArray3076 = null;
      aClass61_3075 = null;
      anIntArray3082 = null;
      aClass94_3080 = null;
      if (var0 == 1) {
        anIntArray3083 = null;
        maps = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ca.O(" + var0 + ')');
    }
  }

  static final void method198(boolean var0, int var1) {
    try {
      if (var1 != -32624) {
        method196(true);
      }

      int var3 = Something3d2.aByteArrayArray3027.length;
      byte[][] var2;
      if (GlRenderer.useOpenGlRenderer && var0) {
        var2 = TextureSampler34.updatedLandscapesData;
      } else {
        var2 = AudioSomethingSomething.landscapesData;
      }

      for (int var4 = 0; var4 < var3; ++var4) {
        byte[] var5 = var2[var4];
        if (var5 != null) {
          int var6 = -WorldMapLabel.anInt1716 + 64 * (AudioStreamEncoder3.regionHashes[var4] >> 8);
          int var7 =
            (AudioStreamEncoder3.regionHashes[var4] & 255) * 64 + -ProceduralTexture.anInt1152;
          DummyClass43.method1194(var1 + 16239);
          SomethingVolume15.method374(var6, var0, var5, var7, 0, BlockConfig.collisionMaps);
        }
      }

    } catch (RuntimeException var8) {
      throw AbstractGameWorld.cascadeException(var8, "ca.E(" + var0 + ',' + var1 + ')');
    }
  }

  static final void method199(int var0, int var1, int var2, int var3) {
    try {
      if (var3 != -799) {
        focused = true;
      }

      if (-1 != ~ClientScriptCall.anInt2453 && var0 != 0 && ~SomethingLight0.anInt1552 > -51
        && 0 != ~var1) {
        Inventory.anIntArray2550[SomethingLight0.anInt1552] = var1;
        SomethingIndex150.anIntArray2068[SomethingLight0.anInt1552] = var0;
        GameString.anIntArray2157[SomethingLight0.anInt1552] = var2;
        TextureCache.aClass135Array2131[SomethingLight0.anInt1552] = null;
        anIntArray3083[SomethingLight0.anInt1552] = 0;
        ++SomethingLight0.anInt1552;
      }

    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "ca.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

}
