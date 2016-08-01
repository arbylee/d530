import java.awt.event.KeyEvent;

final class BitVariable {

  static GameString aClass94_1122 = SpawnedGameObject.createString("M-Bmoire en cours d(Wattribution");
  static int logoFileId = -1;
  static int anInt1126;
  static int anInt1127 = 0;
  static GameString CLIENT_SCRIPT_ERROR =
    SpawnedGameObject.createString("Clientscript error )2 check log for details");
  int low;
  int high;
  int id;

  static final void method1385(int var0, int var1, byte var2) {
    try {
      WidgetUpdate var3 = AudioStreamEncoder3.method466(4, 6, var1);
      var3.g((byte) 33);
      if (var2 >= -103) {
        aClass94_1122 = null;
      }

      var3.anInt3598 = var0;
    } catch (RuntimeException var4) {
      throw AbstractGameWorld
        .cascadeException(var4, "kk.E(" + var0 + ',' + var1 + ',' + var2 + ')');
    }
  }

  static final int method1386(boolean var0, KeyEvent var1) {
    try {
      int var2 = var1.getKeyChar();
      if (!var0) {
        return -90;
      } else if (8364 == var2) {
        return 128;
      } else {
        if (~var2 >= -1 || 256 <= var2) {
          var2 = -1;
        }

        return var2;
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld
        .cascadeException(var3, "kk.C(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  public static void method1388(boolean var0) {
    try {
      aClass94_1122 = null;
      CLIENT_SCRIPT_ERROR = null;
      if (!var0) {
        anInt1126 = 8;
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "kk.D(" + var0 + ')');
    }
  }

  static final void parseSettings(Buffer var0, int var1) {
    try {
      if (-2 >= ~(-var0.position + var0.bytes.length)) {
        int var2 = var0.readUnsignedByte();
        if (var2 >= 0 && ~var2 >= -12) {
          byte var3;
          if (var2 == 11) {
            var3 = 33;
          } else if (var2 != 10) {
            if (var2 == 9) {
              var3 = 31;
            } else if (~var2 == -9) {
              var3 = 30;
            } else if (~var2 == -8) {
              var3 = 29;
            } else if (-7 != ~var2) {
              if (~var2 == -6) {
                var3 = 28;
              } else if (-5 != ~var2) {
                if (-4 == ~var2) {
                  var3 = 23;
                } else if (-3 == ~var2) {
                  var3 = 22;
                } else if (1 == var2) {
                  var3 = 23;
                } else {
                  var3 = 19;
                }
              } else {
                var3 = 24;
              }
            } else {
              var3 = 28;
            }
          } else {
            var3 = 32;
          }

          if (~(var0.bytes.length - var0.position) <= ~var3) {
            AbstractFileRequest.brightnessSetting = var0.readUnsignedByte();
            if (-2 >= ~AbstractFileRequest.brightnessSetting) {
              if (-5 > ~AbstractFileRequest.brightnessSetting) {
                AbstractFileRequest.brightnessSetting = 4;
              }
            } else {
              AbstractFileRequest.brightnessSetting = 1;
            }

            SceneSomething.method957(var1 + 97, 1 == var0.readUnsignedByte());
            AbstractObjectNode.aBoolean3604 = var0.readUnsignedByte() == 1;
            Keyboard.aBoolean1905 = 1 == var0.readUnsignedByte();
            SceneSomething.aBoolean488 = 1 == var0.readUnsignedByte();
            Widget.aBoolean236 = var0.readUnsignedByte() == 1;
            GameWorld.aBoolean2623 = ~var0.readUnsignedByte() == -2;
            TextureSampler0.aBoolean3275 = -2 == ~var0.readUnsignedByte();
            Projectile.aBoolean2910 = 1 == var0.readUnsignedByte();
            HashTableIterator.anInt1137 = var0.readUnsignedByte();
            if (2 < HashTableIterator.anInt1137) {
              HashTableIterator.anInt1137 = 2;
            }

            if (var2 < 2) {
              DisplayMode.useBumpMaps = ~var0.readUnsignedByte() == -2;
              var0.readUnsignedByte();
            } else {
              DisplayMode.useBumpMaps = -2 == ~var0.readUnsignedByte();
            }

            DummyHashTable.aBoolean1685 = 1 == var0.readUnsignedByte();
            DummyClass35.aBoolean661 = ~var0.readUnsignedByte() == -2;
            Parameter.anInt3622 = var0.readUnsignedByte();
            if (~Parameter.anInt3622 < -3) {
              Parameter.anInt3622 = 2;
            }

            GroundItemNode.anInt3671 = Parameter.anInt3622;
            TextureSampler17.aBoolean3184 = ~var0.readUnsignedByte() == -2;
            ClientScriptCall.anInt2453 = var0.readUnsignedByte();
            if (~ClientScriptCall.anInt2453 < -128) {
              ClientScriptCall.anInt2453 = 127;
            }

            BZipDecompressorState.anInt120 = var0.readUnsignedByte();
            DummyClass28.anInt340 = var0.readUnsignedByte();
            if (-128 > ~DummyClass28.anInt340) {
              DummyClass28.anInt340 = 127;
            }

            if (~var2 <= -2) {
              AbstractTextureSampler.anInt2378 = var0.readUnsignedShort();
              TextureSampler21.anInt3071 = var0.readUnsignedShort();
            }

            if (-4 >= ~var2 && ~var2 > -7) {
              var0.readUnsignedByte();
            }

            if (~var2 <= -5) {
              int var4 = var0.readUnsignedByte();
              if (-97 < ~AudioStreamEncoder3.anInt3492) {
                var4 = 0;
              }

              DummyClass0.method1758(var4);
            }

            if (~var2 <= -6) {
              GameString.anInt2148 = var0.readInt();
            }

            if (var1 != -1) {
              CLIENT_SCRIPT_ERROR = null;
            }

            if (6 <= var2) {
              SubNode.anInt2577 = var0.readUnsignedByte();
            }

            if (~var2 <= -8) {
              GameString.safemode = 1 == var0.readUnsignedByte();
            }

            if (8 <= var2) {
              AudioWorker.aBoolean346 = ~var0.readUnsignedByte() == -2;
            }

            if (9 <= var2) {
              TriChromaticImageBuffer.anInt2488 = var0.readUnsignedByte();
            }

            if (10 <= var2) {
              FileCacheRequester.aBoolean1080 = 0 != var0.readUnsignedByte();
            }

            if (-12 >= ~var2) {
              DummyClass4.aBoolean3004 = ~var0.readUnsignedByte() != -1;
            }

          }
        }
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld
        .cascadeException(var5, "kk.F(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

  static final boolean method1391(int var0) {
    try {
      return var0 == ~SomethingQuickChatK.anInt154 ?
        DummyClass55.aClass3_Sub24_Sub4_1421.method473(-128) :
        true;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "kk.A(" + var0 + ')');
    }
  }

  final void method1387(Buffer var1, int var2) {
    try {
      while (true) {
        int var3 = var1.readUnsignedByte();
        if (var3 == 0) {
          var3 = -26 % ((-36 - var2) / 58);
          return;
        }

        this.method1389(var1, 1, var3);
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld
        .cascadeException(var4, "kk.G(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
    }
  }

  private final void method1389(Buffer var1, int var2, int var3) {
    try {
      if (var2 == var3) {
        this.id = var1.readUnsignedShort();
        this.low = var1.readUnsignedByte();
        this.high = var1.readUnsignedByte();
      }

    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "kk.B(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
    }
  }

}
