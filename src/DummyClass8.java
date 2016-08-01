import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class DummyClass8 extends DummyClass7 {

  static SocketStream aClass89_4012;
  static volatile boolean focused = true;
  static int anInt4014;
  static ObjectCache aClass93_4015 = new ObjectCache(64);
  static GameString[] aClass94Array4016 = new GameString[500];
  static long[] aLongArray4017 = new long[100];
  static boolean aBoolean4018 = false;
  static int anInt4019 = 0;
  static int anInt4020 = 0;
  static int anInt4021;
  static GameString aClass94_4023 = SpawnedGameObject.createString(")3");
  static int[] anIntArray4025 = new int[32];
  static int anInt4026 = 0;
  static SoftwareIndexedColorSprite[] aClass109_Sub1Array4027;
  private static GameString aClass94_4022 = SpawnedGameObject
    .createString("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");
  static GameString aClass94_4024 = aClass94_4022;

  static final void method2220(int var0) {
    try {
      if (var0 == 0) {
        Mobile.aClass93_2792.method1524(3);
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "t.H(" + var0 + ')');
    }
  }

  static final void method2221(int var0, int var1, int var2, boolean var3, int var4, int var5,
                               int var6) {
    try {
      int var8 = 0;

      for (HintMarker[] var7 = GameException.aClass96Array2114;
           ~var7.length < ~var8; ++var8) {
        HintMarker var9 = var7[var8];
        if (null != var9 && var9.anInt1360 == 2) {
          AbstractObjectNodeWrapper.method1724(var0 >> 1, var5,
            (-ProceduralTexture.anInt1152 + var9.anInt1347 << 7) - -var9.anInt1350,
            var9.anInt1353 * 2, var2 >> 1,
            var9.anInt1346 + (var9.anInt1356 + -WorldMapLabel.anInt1716 << 7), (byte) -114, var4);
          if (-1 < DummyClass34.anInt590 && ~(AbstractGameWorld.updateCycle % 20) > -11) {
            SomethingIndex150.aClass3_Sub28_Sub16Array2072[var9.anInt1351]
              .method643(-12 + var1 + DummyClass34.anInt590, -28 + var6 - -WidgetAccess.anInt2208);
          }
        }
      }

      if (!var3) {
        aBoolean4018 = true;
      }

    } catch (RuntimeException var10) {
      throw AbstractGameWorld.cascadeException(var10,
        "t.E(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6
          + ')');
    }
  }

  static final void method2222(byte var0) {
    try {
      ObjectNode.aClass93_4043.method1523((byte) -117);
      ClientScriptCall.aClass93_2442.method1523((byte) -108);
      DummyClass14.aClass93_1964.method1523((byte) -117);
      if (var0 <= 122) {
        method2223(true, (byte) -67);
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "t.G(" + var0 + ')');
    }
  }

  static final void method2223(boolean var0, byte var1) {
    try {
      int var2 = 85 % ((-17 - var1) / 59);
      byte var3;
      byte[][] var4;
      if (GlRenderer.useOpenGlRenderer && var0) {
        var4 = TextureSampler34.updatedLandscapesData;
        var3 = 1;
      } else {
        var3 = 4;
        var4 = AudioSomethingSomething.landscapesData;
      }

      for (int var5 = 0; var5 < var3; ++var5) {
        DummyClass43.method1194(-16385);

        for (int var6 = 0; ~var6 > -14; ++var6) {
          for (int var7 = 0; ~var7 > -14; ++var7) {
            int var8 = GameObjectConfig.anIntArrayArrayArray1497[var5][var6][var7];
            if (0 != ~var8) {
              int var9 = var8 >> 24 & 3;
              if (!var0 || var9 == 0) {
                int var10 = (6 & var8) >> 1;
                int var11 = var8 >> 14 & 1023;
                int var12 = 2047 & var8 >> 3;
                int var13 = var12 / 8 + (var11 / 8 << 8);

                for (int var14 = 0; AudioStreamEncoder3.regionHashes.length > var14; ++var14) {
                  if (~AudioStreamEncoder3.regionHashes[var14] == ~var13 && var4[var14] != null) {
                    TextureSampler13
                      .method316(BlockConfig.collisionMaps, var5, var4[var14], var9, var10,
                        8 * var6, var7 * 8, var0, (var11 & 7) * 8, 8 * (7 & var12), (byte) -54);
                    break;
                  }
                }
              }
            }
          }
        }
      }

    } catch (RuntimeException var15) {
      throw AbstractGameWorld.cascadeException(var15, "t.J(" + var0 + ',' + var1 + ')');
    }
  }

  static final boolean method2224(byte var0, long var1, int var3, int var4) {
    try {
      int var5 = (int) var1 >> 14 & 31;
      if (var0 != 39) {
        method2220(-62);
      }

      int var6 = (int) var1 >> 20 & 3;
      int var7 = (int) (var1 >>> 32) & Integer.MAX_VALUE;
      if (var5 != 10 && -12 != ~var5 && var5 != 22) {
        Parameter
          .method582(TextureCache.localPlayer.waypointsY[0], var6, 0, true, 0, 2, var4, 0, 1 + var5,
            2, var3, TextureCache.localPlayer.waypointsX[0]);
      } else {
        GameObjectConfig var8 = DummyClass11.method2207(4, var7);
        int var9;
        int var10;
        if (~var6 != -1 && ~var6 != -3) {
          var10 = var8.anInt1480;
          var9 = var8.anInt1485;
        } else {
          var10 = var8.anInt1485;
          var9 = var8.anInt1480;
        }

        int var11 = var8.anInt1533;
        if (-1 != ~var6) {
          var11 = (var11 << var6 & 15) - -(var11 >> -var6 + 4);
        }

        Parameter
          .method582(TextureCache.localPlayer.waypointsY[0], 0, var10, true, var11, 2, var4, var9,
            0, 2, var3, TextureCache.localPlayer.waypointsX[0]);
      }

      FileCacheRequest.anInt4062 = DummyClass36.anInt2614;
      FileRequester.anInt2958 = 0;
      HuffmanEncoder.anInt638 = 2;
      SceneSomething2.anInt1053 = DummyClass5.anInt2993;
      return true;
    } catch (RuntimeException var12) {
      throw AbstractGameWorld
        .cascadeException(var12, "t.D(" + var0 + ',' + var1 + ',' + var3 + ',' + var4 + ')');
    }
  }

  public static void method2225(byte var0) {
    try {
      int var1 = 58 % ((var0 - 7) / 43);
      aClass89_4012 = null;
      aClass94_4024 = null;
      aClass109_Sub1Array4027 = null;
      anIntArray4025 = null;
      aClass94Array4016 = null;
      aClass93_4015 = null;
      aLongArray4017 = null;
      aClass94_4022 = null;
      aClass94_4023 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "t.F(" + var0 + ')');
    }
  }

  static final void method2226(GameBuffer var0, int var1, int var2) {
    try {
      if (var2 > -109) {
        method2226(null, 67, 54);
      }

      while (true) {
        ClassCheckRequest var3 = (ClassCheckRequest) MonoChromaticImageBuffer.aClass61_2557.getFirst();
        if (var3 == null) {
          return;
        }

        boolean var4 = false;

        int var5;
        for (var5 = 0; ~var5 > ~var3.anInt2296; ++var5) {
          if (var3.aClass64Array2303[var5] != null) {
            if (-3 == ~var3.aClass64Array2303[var5].status) {
              var3.anIntArray2300[var5] = -5;
            }

            if (-1 == ~var3.aClass64Array2303[var5].status) {
              var4 = true;
            }
          }

          if (null != var3.aClass64Array2298[var5]) {
            if (-3 == ~var3.aClass64Array2298[var5].status) {
              var3.anIntArray2300[var5] = -6;
            }

            if (-1 == ~var3.aClass64Array2298[var5].status) {
              var4 = true;
            }
          }
        }

        if (var4) {
          return;
        }

        var0.writePacket(var1);
        var0.writeByte(0);
        var5 = var0.position;
        var0.writeInt(var3.anInt2305);

        for (int var6 = 0; ~var3.anInt2296 < ~var6; ++var6) {
          if (~var3.anIntArray2300[var6] != -1) {
            var0.writeByte(var3.anIntArray2300[var6]);
          } else {
            try {
              int var7 = var3.anIntArray2301[var6];
              Field var8;
              int var9;
              if (-1 != ~var7) {
                if (~var7 == -2) {
                  var8 = (Field) var3.aClass64Array2303[var6].result;
                  var8.setInt(null, var3.anIntArray2299[var6]);
                  var0.writeByte(0);
                } else if (2 == var7) {
                  var8 = (Field) var3.aClass64Array2303[var6].result;
                  var9 = var8.getModifiers();
                  var0.writeByte(0);
                  var0.writeInt(var9);
                }
              } else {
                var8 = (Field) var3.aClass64Array2303[var6].result;
                var9 = var8.getInt(null);
                var0.writeByte(0);
                var0.writeInt(var9);
              }

              Method var26;
              if (3 == var7) {
                var26 = (Method) var3.aClass64Array2298[var6].result;
                byte[][] var27 = var3.aByteArrayArrayArray2302[var6];
                Object[] var10 = new Object[var27.length];

                for (int var11 = 0; var11 < var27.length; ++var11) {
                  ObjectInputStream var12 =
                    new ObjectInputStream(new ByteArrayInputStream(var27[var11]));
                  var10[var11] = var12.readObject();
                }

                Object var28 = var26.invoke(null, var10);
                if (var28 == null) {
                  var0.writeByte(0);
                } else if (!(var28 instanceof Number)) {
                  if (var28 instanceof GameString) {
                    var0.writeByte(2);
                    var0.writeString((GameString) var28);
                  } else {
                    var0.writeByte(4);
                  }
                } else {
                  var0.writeByte(1);
                  var0.writeLong(((Number) var28).longValue());
                }
              } else if (var7 == 4) {
                var26 = (Method) var3.aClass64Array2298[var6].result;
                var9 = var26.getModifiers();
                var0.writeByte(0);
                var0.writeInt(var9);
              }
            } catch (ClassNotFoundException var13) {
              var0.writeByte(-10);
            } catch (InvalidClassException var14) {
              var0.writeByte(-11);
            } catch (StreamCorruptedException var15) {
              var0.writeByte(-12);
            } catch (OptionalDataException var16) {
              var0.writeByte(-13);
            } catch (IllegalAccessException var17) {
              var0.writeByte(-14);
            } catch (IllegalArgumentException var18) {
              var0.writeByte(-15);
            } catch (InvocationTargetException var19) {
              var0.writeByte(-16);
            } catch (SecurityException var20) {
              var0.writeByte(-17);
            } catch (IOException var21) {
              var0.writeByte(-18);
            } catch (NullPointerException var22) {
              var0.writeByte(-19);
            } catch (Exception var23) {
              var0.writeByte(-20);
            } catch (Throwable var24) {
              var0.writeByte(-21);
            }
          }
        }

        var0.writeChecksum((byte) 86, var5);
        var0.method769((byte) -127, var0.position - var5);
        var3.unlinkNode();
      }
    } catch (RuntimeException var25) {
      throw AbstractGameWorld.cascadeException(var25,
        "t.I(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ')');
    }
  }

}
