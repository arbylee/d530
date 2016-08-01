import java.io.UnsupportedEncodingException;

final class StringNode extends Node {

  static int anInt2579 = 1;
  static GameString[] aClass94Array2580 = new GameString[100];
  static FileUnpacker aClass153_2581;
  static int lastPacketId0 = 0;
  static boolean dynamicScene = false;
  static GameString aClass94_2584 = SpawnedGameObject.createString("<)4col>");
  static GameString aClass94_2585 =
    SpawnedGameObject.createString("Connexion au serveur de mise -9 jour en cours");
  static int anInt2587;
  static GameStub applet = null;
  static int anInt2589 = 0;
  GameString aClass94_2586;


  public StringNode() {
  }

  StringNode(GameString var1) {
    try {
      this.aClass94_2586 = var1;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld
        .cascadeException(var3, "sj.<init>(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  static final void method727(int var0) {
    try {
      Keyboard.aClass93_1911.method1524(3);
      int var1 = 56 / ((var0 - 7) / 54);
      HashTableIterator.aClass93_1131.method1524(3);
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "sj.O(" + var0 + ')');
    }
  }

  static final void method728(boolean var0) {
    try {
      if (var0) {
        method731(null, (byte) 118);
      }

      try {
        if (SomethingQuickChatK.anInt154 == 1) {
          int var1 = DummyClass55.aClass3_Sub24_Sub4_1421.method499(var0);
          if (-1 > ~var1 && DummyClass55.aClass3_Sub24_Sub4_1421.method473(-124)) {
            var1 -= SpotAnimationConfig.anInt546;
            if (-1 < ~var1) {
              var1 = 0;
            }

            DummyClass55.aClass3_Sub24_Sub4_1421.method506(128, var1);
            return;
          }

          DummyClass55.aClass3_Sub24_Sub4_1421.method505((byte) -128);
          DummyClass55.aClass3_Sub24_Sub4_1421.method485(-110);
          MidiSomething.aClass3_Sub27_1154 = null;
          SomethingQuickChat.aClass83_3579 = null;
          if (DummyClass55.aClass153_1423 != null) {
            SomethingQuickChatK.anInt154 = 2;
          } else {
            SomethingQuickChatK.anInt154 = 0;
          }
        }
      } catch (Exception var2) {
        var2.printStackTrace();
        DummyClass55.aClass3_Sub24_Sub4_1421.method505((byte) -127);
        DummyClass55.aClass153_1423 = null;
        MidiSomething.aClass3_Sub27_1154 = null;
        SomethingQuickChatK.anInt154 = 0;
        SomethingQuickChat.aClass83_3579 = null;
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "sj.A(" + var0 + ')');
    }
  }

  static final int method729(byte var0, int var1, int var2) {
    try {
      if (var0 > -32) {
        return 88;
      } else if (var1 == -2) {
        return 12345678;
      } else if (~var1 == 0) {
        if (2 > var2) {
          var2 = 2;
        } else if (~var2 < -127) {
          var2 = 126;
        }

        return var2;
      } else {
        var2 = (127 & var1) * var2 >> 7;
        if (var2 < 2) {
          var2 = 2;
        } else if (var2 > 126) {
          var2 = 126;
        }

        return (var1 & '\uff80') - -var2;
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld
        .cascadeException(var4, "sj.E(" + var0 + ',' + var1 + ',' + var2 + ')');
    }
  }

  static final void method730(int var0, int var1, byte var2, int var3, int var4, int var5) {
    try {
      int var6 = 19 % ((var2 - -44) / 47);
      if (~var0 <= ~DummyClass55.anInt1425 && var4 <= GlTexture2d.anInt3765
        && DummyClass13.anInt2020 <= var5 && LightIntensity.anInt902 >= var3) {
        MaterialShader5.method1632(95, var3, var4, var5, var0, var1);
      } else {
        ObjectCache.method1525(3074, var1, var4, var5, var0, var3);
      }

    } catch (RuntimeException var7) {
      throw AbstractGameWorld.cascadeException(var7,
        "sj.R(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
    }
  }

  static final void method731(FileUnpacker var0, byte var1) {
    try {
      int var2 = 3 / ((var1 - -62) / 37);
      TextureSampler20.aClass153_3154 = var0;
      DummyClass53.anInt1344 = TextureSampler20.aClass153_3154.getAmountChildren(16, (byte) 71);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld
        .cascadeException(var3, "sj.B(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

  static final GameString method732(String var0, int var1) {
    try {
      if (var1 != 27307) {
        anInt2589 = -93;
      }

      byte[] var2;
      try {
        var2 = var0.getBytes("ISO-8859-1");
      } catch (UnsupportedEncodingException var5) {
        var2 = var0.getBytes();
      }

      GameString var3 = new GameString();
      var3.bytes = var2;
      var3.length = 0;

      for (int var4 = 0; var4 < var2.length; ++var4) {
        if (-1 != ~var2[var4]) {
          var2[var3.length++] = var2[var4];
        }
      }

      return var3;
    } catch (RuntimeException var6) {
      throw AbstractGameWorld
        .cascadeException(var6, "sj.D(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

  static final SomethingQuickChat method733(int var0, int var1) {
    try {
      SomethingQuickChat var2 =
        (SomethingQuickChat) ProjectileNode.aClass47_3776.get((long) var1, 1400);
      if (null == var2) {
        byte[] var3;
        if (-32769 < ~var1) {
          var3 = AudioStreamEncoder3.aClass153_3490.getBytes(1, var1);
        } else {
          var3 = DummyClass14.aClass153_1967.getBytes(1, 32767 & var1);
        }

        var2 = new SomethingQuickChat();
        if (var0 != 12345678) {
          lastPacketId0 = 56;
        }

        if (var3 != null) {
          var2.method546(new Buffer(var3), -1);
        }

        if (var1 >= '\u8000') {
          var2.method548(60);
        }

        ProjectileNode.aClass47_3776.put((long) var1, var2);
        return var2;
      } else {
        return var2;
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "sj.Q(" + var0 + ',' + var1 + ')');
    }
  }

  static final void setSettings(int var0, GameString var1) {
    try {
      DummyClass7.settings = var1;
      if (null != DummyClass35.signLink.applet) {
        try {
          GameString var2 =
            DummyClass6.COOKIE_PREFIX.getParameter((byte) 125, DummyClass35.signLink.applet);
          GameString var3 =
            BufferObject.COOKIE_HOST.getParameter((byte) 126, DummyClass35.signLink.applet);
          GameString var4 = RenderAnimation.concat(new GameString[] {
            var2, ProceduralTexture.SETTINGS_EQ, var1, SomethingIndex150.aClass94_2074, var3
          });
          if (var0 == var1.getLength()) {
            var4 = RenderAnimation.concat(new GameString[] {var4, ComponentCanvas.aClass94_28});
          } else {
            var4 = RenderAnimation.concat(new GameString[] {
              var4, DummyOutputStream.aClass94_51,
              AudioWorker.method894(94608000000L + Time.getCurrentTimeMillis(), (byte) 52),
              DummyClass4.aClass94_3000, InventoryConfig.method612(94608000L, (byte) 102)
            });
          }

          RenderAnimation.concat(
            new GameString[] {AbstractFrameRegulator.aClass94_1694, var4, HashTable.aClass94_1698})
            .method1554(true, DummyClass35.signLink.applet);
        } catch (Throwable var5) {
        }

      }
    } catch (RuntimeException var6) {
      throw AbstractGameWorld
        .cascadeException(var6, "sj.F(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  public static void method735(int var0) {
    try {
      aClass153_2581 = null;
      aClass94Array2580 = null;
      aClass94_2584 = null;
      if (var0 != -22749) {
        anInt2579 = 66;
      }

      aClass94_2585 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "sj.C(" + var0 + ')');
    }
  }

  static final void method736(int var0, int var1) {
    try {
      if (var1 <= 61) {
        method736(-60, -93);
      }

      if (-1 != ~SomethingQuickChatK.anInt154) {
        TextureSampler36.anInt3423 = var0;
      } else {
        DummyClass55.aClass3_Sub24_Sub4_1421.method506(128, var0);
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "sj.P(" + var0 + ',' + var1 + ')');
    }
  }

}
