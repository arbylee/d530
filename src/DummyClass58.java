final class DummyClass58 {

  static GameString COMMAND_QA_OP_TEST = SpawnedGameObject.createString("::qa_op_test");
  static AbstractDirectColorSprite aClass3_Sub28_Sub16_1457;
  static GameString COMMAND_WM1 = SpawnedGameObject.createString("::wm1");
  static GameString aClass94_1459 = SpawnedGameObject.createString("cyan:");
  static int anInt1460;


  static final void method1652(int var0, int var1, int var2, int var3, int var4, int var5, int var6,
                               int var7, int var8, int var9) {
    try {
      if (var9 != 0) {
        COMMAND_WM1 = null;
      }

      if (~var5 <= ~DummyClass55.anInt1425 && ~var5 >= ~GlTexture2d.anInt3765
        && var0 >= DummyClass55.anInt1425 && ~var0 >= ~GlTexture2d.anInt3765
        && ~var6 <= ~DummyClass55.anInt1425 && ~GlTexture2d.anInt3765 <= ~var6
        && ~DummyClass55.anInt1425 >= ~var1 && ~var1 >= ~GlTexture2d.anInt3765
        && ~DummyClass13.anInt2020 >= ~var4 && ~var4 >= ~LightIntensity.anInt902
        && ~var7 <= ~DummyClass13.anInt2020 && LightIntensity.anInt902 >= var7
        && var2 >= DummyClass13.anInt2020 && ~LightIntensity.anInt902 <= ~var2
        && ~var3 <= ~DummyClass13.anInt2020 && ~var3 >= ~LightIntensity.anInt902) {
        SomethingInScenePacket202
          .method114(3, var2, var8, var7, var6, var1, var3, var4, var0, var5);
      } else {
        DummyClass53.method1583(var5, var0, var7, 3, var8, var3, var2, var1, var6, var4);
      }

    } catch (RuntimeException var11) {
      throw AbstractGameWorld.cascadeException(var11,
        "oi.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6
          + ',' + var7 + ',' + var8 + ',' + var9 + ')');
    }
  }

  static final GameString method1653(int var0, int var1) {
    try {
      if (var1 != 0) {
        method1660(-41);
      }

      return RenderAnimation.concat(new GameString[] {
        SomethingScene.toString(255 & var0 >> 24), DummyClass8.aClass94_4023,
        SomethingScene.toString((var0 & 16712751) >> 16), DummyClass8.aClass94_4023,
        SomethingScene.toString(255 & var0 >> 8), DummyClass8.aClass94_4023,
        SomethingScene.toString(var0 & 255)
      });
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "oi.F(" + var0 + ',' + var1 + ')');
    }
  }

  static final void method1654(int var0) {
    try {
      Mobile.aClass93_2792.method1523((byte) -108);
      if (var0 == -15447) {
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "oi.E(" + var0 + ')');
    }
  }

  static final byte[] method1655(byte var0, byte[] var1) {
    try {
      if (var1 == null) {
        return null;
      } else {
        if (var0 > -30) {
          aClass3_Sub28_Sub16_1457 = null;
        }

        byte[] var2 = new byte[var1.length];
        ArrayUtils.copy(var1, 0, var2, 0, var1.length);
        return var2;
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld
        .cascadeException(var3, "oi.H(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  static final void loadTitleScreenSprites(FileUnpacker var0, byte var1) {
    try {
      if (!StillGraphic.aBoolean2713) {
        if (!GlRenderer.useOpenGlRenderer) {
          DummyClass47.method1320();
        } else {
          GlUtils.clear();
        }

        DummyClass59.titlebackground =
          SomethingTexture1.method1344(117, var0, DummyClass14.titleBackgroundFileId);
        int var2 = GroundItem.viewHeight;
        int var3 = var2 * 956 / 503;
        DummyClass59.titlebackground.draw((DummyClass30.viewWidth + -var3) / 2, 0, var3, var2);
        AnimationSequence.logoSprite =
          WidgetUpdate.createIndexedColorSprite(var0, BitVariable.logoFileId);
        AnimationSequence.logoSprite
          .draw(DummyClass30.viewWidth / 2 + -(AnimationSequence.logoSprite.width / 2), 18);
        StillGraphic.aBoolean2713 = true;
        if (var1 > -50) {
          method1654(-27);
        }

      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld
        .cascadeException(var4, "oi.B(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

  static final void method1657(int var0, int var1) {
    try {
      WidgetUpdate var2 = AudioStreamEncoder3.method466(4, 5, var0);
      var2.createIndexedColorSprite(true);
      if (var1 != -903) {
        COMMAND_WM1 = null;
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "oi.J(" + var0 + ',' + var1 + ')');
    }
  }

  static final void method1658(int var0, int[] var1, Object[] var2) {
    try {
      SceneSomething.method956(var2, var1.length - 1, var1, 74, 0);
      int var3 = 113 % ((76 - var0) / 45);
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "oi.I(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ?
          "{...}" :
          "null") + ')');
    }
  }

  static final void method1659(int var0) {
    try {
      Deque.aClass93_939.method1524(3);
      if (var0 == 16712751) {
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "oi.G(" + var0 + ')');
    }
  }

  public static void method1660(int var0) {
    try {
      aClass3_Sub28_Sub16_1457 = null;
      COMMAND_WM1 = null;
      COMMAND_QA_OP_TEST = null;
      if (var0 != 13123) {
        COMMAND_WM1 = null;
      }

      aClass94_1459 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "oi.A(" + var0 + ')');
    }
  }

  static final void method1661(int var0, FileUnpacker var1, FileUnpacker var2, boolean var3) {
    try {
      DummyClass28.aBoolean337 = var3;
      LinearHashTable.aClass153_1043 = var2;
      if (var0 != 2) {
        method1658(22, null, null);
      }

      DummyClass52.aClass153_1171 = var1;
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "oi.D(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ?
          "{...}" :
          "null") + ',' + var3 + ')');
    }
  }

}
