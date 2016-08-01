final class SomethingWorldMappy extends Node {

  static AbstractAudioOutputStream audioOutputStream1;
  static volatile int anInt2493 = -1;
  static GameString aClass94_2496 = SpawnedGameObject.createString("scrollen:");
  static GameString aClass94_2498 = SpawnedGameObject.createString("(U (X");
  int anInt2492;
  int anInt2494;
  int anInt2495;
  int anInt2497;


  SomethingWorldMappy(int var1, int var2, int var3, int var4) {
    try {
      this.anInt2497 = var4;
      this.anInt2494 = var2;
      this.anInt2495 = var3;
      this.anInt2492 = var1;
    } catch (RuntimeException var6) {
      throw AbstractGameWorld
        .cascadeException(var6, "lh.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
    }
  }

  static final void method394(int var0, int var1) {
    try {
      TextureSampler39.anInt3285 = var0;
      IntegerNode.method383(-32584, 3);
      IntegerNode.method383(-32584, 4);
      if (var1 <= 83) {
        method395(null, -43, -61, -51, 101, -106, -58, true);
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "lh.E(" + var0 + ',' + var1 + ')');
    }
  }

  static final void method395(SomethingSceneTile var0, int var1, int var2, int var3, int var4,
                              int var5, int var6, boolean var7) {
    int var8 = var0.anIntArray627.length;

    int var9;
    int var10;
    int var11;
    int var12;
    int var13;
    for (var9 = 0; var9 < var8; ++var9) {
      var10 = var0.anIntArray627[var9] - MilliFrameRegulator.cameraPosX;
      var11 = var0.anIntArray615[var9] - ClientScriptEnum.cameraY;
      var12 = var0.anIntArray618[var9] - TextureSampler13.cameraZ;
      var13 = var12 * var3 + var10 * var4 >> 16;
      var12 = var12 * var4 - var10 * var3 >> 16;
      var10 = var13;
      var13 = var11 * var2 - var12 * var1 >> 16;
      var12 = var11 * var1 + var12 * var2 >> 16;
      if (var12 < 50) {
        return;
      }

      if (var0.anIntArray616 != null) {
        SomethingSceneTile.anIntArray614[var9] = var10;
        SomethingSceneTile.anIntArray630[var9] = var13;
        SomethingSceneTile.anIntArray628[var9] = var12;
      }

      SomethingSceneTile.anIntArray623[var9] = DummyClass40.anInt846 + (var10 << 9) / var12;
      SomethingSceneTile.anIntArray622[var9] = DummyClass40.anInt835 + (var13 << 9) / var12;
    }

    DummyClass40.anInt850 = 0;
    var8 = var0.anIntArray624.length;

    for (var9 = 0; var9 < var8; ++var9) {
      var10 = var0.anIntArray624[var9];
      var11 = var0.anIntArray617[var9];
      var12 = var0.anIntArray613[var9];
      var13 = SomethingSceneTile.anIntArray623[var10];
      int var14 = SomethingSceneTile.anIntArray623[var11];
      int var15 = SomethingSceneTile.anIntArray623[var12];
      int var16 = SomethingSceneTile.anIntArray622[var10];
      int var17 = SomethingSceneTile.anIntArray622[var11];
      int var18 = SomethingSceneTile.anIntArray622[var12];
      if ((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
        if (TextureSampler37.aBoolean3261 && TextureSampler34
          .method185(GZipDecompressor.anInt819 + DummyClass40.anInt846,
            TextureSampler18.anInt4039 + DummyClass40.anInt835, var16, var17, var18, var13, var14,
            var15)) {
          DummyClass32.anInt515 = var5;
          OndemandRequester.anInt999 = var6;
        }

        if (!GlRenderer.useOpenGlRenderer && !var7) {
          DummyClass40.aBoolean849 =
            var13 < 0 || var14 < 0 || var15 < 0 || var13 > DummyClass40.anInt847
              || var14 > DummyClass40.anInt847 || var15 > DummyClass40.anInt847;

          if (var0.anIntArray616 != null && var0.anIntArray616[var9] != -1) {
            if (TextureSampler0.aBoolean3275) {
              if (var0.aBoolean629) {
                DummyClass40
                  .method1135(var16, var17, var18, var13, var14, var15, var0.anIntArray625[var9],
                    var0.anIntArray632[var9], var0.anIntArray631[var9],
                    SomethingSceneTile.anIntArray614[0], SomethingSceneTile.anIntArray614[1],
                    SomethingSceneTile.anIntArray614[3], SomethingSceneTile.anIntArray630[0],
                    SomethingSceneTile.anIntArray630[1], SomethingSceneTile.anIntArray630[3],
                    SomethingSceneTile.anIntArray628[0], SomethingSceneTile.anIntArray628[1],
                    SomethingSceneTile.anIntArray628[3], var0.anIntArray616[var9]);
              } else {
                DummyClass40
                  .method1135(var16, var17, var18, var13, var14, var15, var0.anIntArray625[var9],
                    var0.anIntArray632[var9], var0.anIntArray631[var9],
                    SomethingSceneTile.anIntArray614[var10],
                    SomethingSceneTile.anIntArray614[var11],
                    SomethingSceneTile.anIntArray614[var12],
                    SomethingSceneTile.anIntArray630[var10],
                    SomethingSceneTile.anIntArray630[var11],
                    SomethingSceneTile.anIntArray630[var12],
                    SomethingSceneTile.anIntArray628[var10],
                    SomethingSceneTile.anIntArray628[var11],
                    SomethingSceneTile.anIntArray628[var12], var0.anIntArray616[var9]);
              }
            } else {
              int var19 = DummyClass40.textureCache.method15(var0.anIntArray616[var9], '\uffff');
              DummyClass40.method1154(var16, var17, var18, var13, var14, var15,
                DummyClass2.repackHSL(var19, var0.anIntArray625[var9]),
                DummyClass2.repackHSL(var19, var0.anIntArray632[var9]),
                DummyClass2.repackHSL(var19, var0.anIntArray631[var9]));
            }
          } else if (var0.anIntArray625[var9] != 12345678) {
            DummyClass40
              .method1154(var16, var17, var18, var13, var14, var15, var0.anIntArray625[var9],
                var0.anIntArray632[var9], var0.anIntArray631[var9]);
          }
        }
      }
    }

  }

  public static void method396(int var0) {
    try {
      if (var0 != 0) {
        method397((byte) 35);
      }

      audioOutputStream1 = null;
      aClass94_2498 = null;
      aClass94_2496 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "lh.B(" + var0 + ')');
    }
  }

  static final void method397(byte var0) {
    try {
      MonoChromaticImageCache.aClass93_1569.method1524(3);
      SomethingVolume15.aClass93_2428.method1524(3);
      if (var0 != -41) {
        method394(14, 52);
      }

      Cache.aClass93_743.method1524(3);
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "lh.C(" + var0 + ')');
    }
  }

  final boolean method393(byte var1, int var2, int var3) {
    try {
      if (var1 != -45) {
        method394(6, -105);
      }

      return var3 >= this.anInt2492 && ~this.anInt2495 <= ~var3 && this.anInt2494 <= var2
        && var2 <= this.anInt2497;
    } catch (RuntimeException var5) {
      throw AbstractGameWorld
        .cascadeException(var5, "lh.D(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

}
