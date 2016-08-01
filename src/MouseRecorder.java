final class MouseRecorder implements Runnable {

  static ObjectCache aClass93_1013 = new ObjectCache(100);
  static byte[][][] aByteArrayArrayArray1014;
  static Widget aClass11_1017;
  boolean aBoolean1015 = true;
  Object anObject1016 = new Object();
  int anInt1018 = 0;
  int[] anIntArray1019 = new int[500];
  int[] anIntArray1020 = new int[500];

  public final void run() {
    try {
      for (; this.aBoolean1015; TextureSampler25.sleep(50L)) {
        Object var1 = this.anObject1016;
        synchronized (var1) {
          if (-501 < ~this.anInt1018) {
            this.anIntArray1020[this.anInt1018] = SomethingTilek.anInt1676;
            this.anIntArray1019[this.anInt1018] = HashTable.anInt1709;
            ++this.anInt1018;
          }
        }
      }

    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "jd.run()");
    }
  }

  public static void method1257(int var0) {
    try {
      if (var0 == 25951) {
        aClass11_1017 = null;
        aByteArrayArrayArray1014 = null;
        aClass93_1013 = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "jd.B(" + var0 + ')');
    }
  }

  static final int method1258(byte var0) {
    try {
      SceneShadowMap.anInt1780 = 0;
      if (var0 != -53) {
        method1258((byte) -35);
      }

      return TextureSampler23.method251(-1);
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "jd.D(" + var0 + ')');
    }
  }

  static final void method1259(int var0, byte var1) {
    try {
      if (var1 > 12) {
        WidgetUpdate var2 = AudioStreamEncoder3.method466(4, 12, var0);
        var2.createIndexedColorSprite(true);
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "jd.A(" + var0 + ',' + var1 + ')');
    }
  }

  static final void method1260(int var0, int var1, Widget[] var2) {
    try {
      for (int var3 = 0; var3 < var2.length; ++var3) {
        Widget var4 = var2[var3];
        if (null != var4 && ~var4.anInt190 == ~var1 && (!var4.aBoolean233 || !GameClient.method51(
          var4))) {
          if (-1 == ~var4.anInt187) {
            if (!var4.aBoolean233 && GameClient.method51(var4)
              && var4 != DummyClass56.aClass11_1453) {
              continue;
            }

            method1260(var0 ^ 0, var4.anInt279, var2);
            if (var4.aClass11Array262 != null) {
              method1260(23206, var4.anInt279, var4.aClass11Array262);
            }

            SomethingPacket151 var5 =
              (SomethingPacket151) TextureSampler23.aClass130_3208.get((long) var4.anInt279);
            if (var5 != null) {
              PlayerAppearance.method1160(-111, var5.anInt2602);
            }
          }

          if (var4.anInt187 == 6) {
            int var6;
            if (0 != ~var4.anInt305 || ~var4.anInt198 != 0) {
              boolean var9 = InventoryConfig.method609(var4, var0 + -23173);
              if (var9) {
                var6 = var4.anInt198;
              } else {
                var6 = var4.anInt305;
              }

              if (var6 != -1) {
                AnimationSequence var7 = GameClient.method45(var6, (byte) -20);
                if (null != var7) {
                  for (
                    var4.anInt267 += DisplayMode.loopCycle;
                    ~var4.anInt267 < ~var7.anIntArray1869[var4.anInt283]; DummyClass29.method909(
                    115, var4)) {
                    var4.anInt267 -= var7.anIntArray1869[var4.anInt283];
                    ++var4.anInt283;
                    if (var7.anIntArray1851.length <= var4.anInt283) {
                      var4.anInt283 -= var7.anInt1865;
                      if (~var4.anInt283 > -1 || var7.anIntArray1851.length <= var4.anInt283) {
                        var4.anInt283 = 0;
                      }
                    }

                    var4.anInt260 = var4.anInt283 + 1;
                    if (var7.anIntArray1851.length <= var4.anInt260) {
                      var4.anInt260 -= var7.anInt1865;
                      if (~var4.anInt260 > -1 || var7.anIntArray1851.length <= var4.anInt260) {
                        var4.anInt260 = -1;
                      }
                    }
                  }
                }
              }
            }

            if (0 != var4.anInt237 && !var4.aBoolean233) {
              int var10 = var4.anInt237 >> 16;
              var10 *= DisplayMode.loopCycle;
              var6 = var4.anInt237 << 16 >> 16;
              var4.rotationX0 = 2047 & var10 + var4.rotationX0;
              var6 *= DisplayMode.loopCycle;
              var4.rotationY = var4.rotationY - -var6 & 2047;
              DummyClass29.method909(117, var4);
            }
          }
        }
      }

      if (var0 != 23206) {
        method1257(107);
      }

    } catch (RuntimeException var8) {
      throw AbstractGameWorld.cascadeException(var8,
        "jd.E(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
    }
  }

  static final GameString method1261(int var0, int var1, GameString[] var2, int var3) {
    try {
      int var4 = 0;

      for (int var5 = 0; var1 > var5; ++var5) {
        if (null == var2[var0 - -var5]) {
          var2[var5 + var0] = TextureSampler7.aClass94_3339;
        }

        var4 += var2[var5 + var0].length;
      }

      byte[] var10 = new byte[var4];
      int var6 = 0;

      for (int var7 = 0; var1 > var7; ++var7) {
        GameString var8 = var2[var7 + var0];
        ArrayUtils.copy(var8.bytes, 0, var10, var6, var8.length);
        var6 += var8.length;
      }

      GameString var11 = new GameString();
      var11.length = var4;
      if (var3 != 2774) {
        method1262(83, 28);
      }

      var11.bytes = var10;
      return var11;
    } catch (RuntimeException var9) {
      throw AbstractGameWorld.cascadeException(var9,
        "jd.C(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
    }
  }

  static final int method1262(int var0, int var1) {
    try {
      if (var0 < 20) {
        method1262(15, 87);
      }

      return var1 & 127;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "jd.F(" + var0 + ',' + var1 + ')');
    }
  }

}
