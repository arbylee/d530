final class DummyClass13 {

  static ObjectCache aClass93_2016 = new ObjectCache(100);
  static int[] anIntArray2017 = new int[] {1, 2, 4, 8};
  static GameString aClass94_2018 = SpawnedGameObject.createString("Cabbage");
  static FileUnpacker models;
  static int anInt2020 = 0;
  static int[] anIntArray2021 = new int[2];
  static int anInt2022 = 0;
  static int anInt2023 = 0;
  static int anInt2024 = 0;


  static final SomethingSceneJ method2193(int var0, int var1, int var2) {
    SceneGraphTile var3 = SomethingTexture1.sceneGraphTiles[var0][var1][var2];
    if (var3 == null) {
      return null;
    } else {
      SomethingSceneJ var4 = var3.aClass12_2230;
      var3.aClass12_2230 = null;
      return var4;
    }
  }

  static final boolean method2194(int var0) {
    try {
      if (Structure.aBoolean3641) {
        try {
          return !((Boolean) TextureSampler23.aClass94_3209
            .method1577(var0 + -2112, DummyClass35.signLink.applet)).booleanValue();
        } catch (Throwable var2) {
        }
      }

      return var0 != 255 ? true : true;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "vl.B(" + var0 + ')');
    }
  }

  static final void method2195(int var0, int var1) {
    try {
      short var2 = 256;
      if (var0 > var2) {
        var0 = var2;
      }

      if (~var0 < -11) {
        var0 = 10;
      }

      SomethingScene.anInt1071 += var0 * 128;
      int var3;
      if (DummyClass12.anIntArray2026.length < SomethingScene.anInt1071) {
        SomethingScene.anInt1071 -= DummyClass12.anIntArray2026.length;
        var3 = (int) (12.0D * Math.random());
        TextureSampler30.method215((byte) -119, DummyClass8.aClass109_Sub1Array4027[var3]);
      }

      var3 = var1;
      int var5 = (var2 + -var0) * 128;
      int var4 = 128 * var0;

      int var6;
      int var7;
      for (var6 = 0; ~var5 < ~var6; ++var6) {
        var7 = DummyClass2.anIntArray1681[var3 - -var4] -
          var0 * DummyClass12.anIntArray2026[-1 + DummyClass12.anIntArray2026.length
            & SomethingScene.anInt1071 + var3] / 6;
        if (0 > var7) {
          var7 = 0;
        }

        DummyClass2.anIntArray1681[var3++] = var7;
      }

      int var8;
      int var9;
      for (var6 = var2 + -var0; var2 > var6; ++var6) {
        var7 = var6 * 128;

        for (var8 = 0; 128 > var8; ++var8) {
          var9 = (int) (100.0D * Math.random());
          if (-51 < ~var9 && ~var8 < -11 && ~var8 > -119) {
            DummyClass2.anIntArray1681[var8 + var7] = 255;
          } else {
            DummyClass2.anIntArray1681[var8 + var7] = 0;
          }
        }
      }

      for (var6 = 0; var2 + -var0 > var6; ++var6) {
        AnimationSomething.anIntArray3592[var6] = AnimationSomething.anIntArray3592[var6 - -var0];
      }

      for (var6 = var2 - var0; var2 > var6; ++var6) {
        AnimationSomething.anIntArray3592[var6] =
          (int) (Math.sin((double) DummyClass3.anInt57 / 14.0D) * 16.0D + 14.0D * Math
            .sin((double) DummyClass3.anInt57 / 15.0D) + 12.0D * Math
            .sin((double) DummyClass3.anInt57 / 16.0D));
        ++DummyClass3.anInt57;
      }

      DummyClass22.anInt1740 += var0;
      var6 = (var0 - -(1 & AbstractGameWorld.updateCycle)) / 2;
      if (~var6 < -1) {
        for (var7 = 0; DummyClass22.anInt1740 > var7; ++var7) {
          var8 = 2 + (int) (124.0D * Math.random());
          var9 = (int) (128.0D * Math.random()) + 128;
          DummyClass2.anIntArray1681[var8 - -(var9 << 7)] = 192;
        }

        DummyClass22.anInt1740 = 0;

        int var10;
        for (var7 = 0; ~var2 < ~var7; ++var7) {
          var9 = var7 * 128;
          var8 = 0;

          for (var10 = -var6; ~var10 > -129; ++var10) {
            if (128 > var6 + var10) {
              var8 += DummyClass2.anIntArray1681[var9 + (var10 - -var6)];
            }

            if (-1 >= ~(-1 + -var6 + var10)) {
              var8 -= DummyClass2.anIntArray1681[-var6 + -1 + var10 + var9];
            }

            if (0 <= var10) {
              GameBuffer.anIntArray3805[var10 + var9] = var8 / (1 + var6 * 2);
            }
          }
        }

        for (var7 = 0; 128 > var7; ++var7) {
          var8 = 0;

          for (var9 = -var6; var2 > var9; ++var9) {
            var10 = var9 * 128;
            if (~(var9 + var6) > ~var2) {
              var8 += GameBuffer.anIntArray3805[var6 * 128 + (var7 - -var10)];
            }

            if (0 <= var9 - var6 - 1) {
              var8 -= GameBuffer.anIntArray3805[-((1 + var6) * 128) + (var7 - -var10)];
            }

            if (var9 >= 0) {
              DummyClass2.anIntArray1681[var10 + var7] = var8 / (var6 * 2 - -1);
            }
          }
        }
      }

    } catch (RuntimeException var11) {
      throw AbstractGameWorld.cascadeException(var11, "vl.E(" + var0 + ',' + var1 + ')');
    }
  }

  static final void method2196(int var0) {
    try {
      TextureSampler25.aClass93_3412.method1523((byte) -107);
      if (var0 != 128) {
        anInt2024 = 111;
      }

      TextureSampler2.aClass93_3369.method1523((byte) -110);
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "vl.D(" + var0 + ')');
    }
  }

  public static void method2197(boolean var0) {
    try {
      if (var0) {
        anIntArray2021 = null;
        aClass94_2018 = null;
        anIntArray2017 = null;
        models = null;
        aClass93_2016 = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "vl.C(" + var0 + ')');
    }
  }

}
