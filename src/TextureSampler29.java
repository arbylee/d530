final class TextureSampler29 extends AbstractTextureSampler {

  private static GameString aClass94_3400 = SpawnedGameObject.createString("Take");
  static byte[][][] aByteArrayArrayArray3390;
  static GameString[] aClass94Array3391;
  static SomethingPacket116[] aClass133Array3393 = new SomethingPacket116[6];
  static GameString aClass94_3394 = SpawnedGameObject.createString("<col=ffb000>");
  static int anInt3395;
  static byte[] aByteArray3396;
  static volatile int anInt3398 = 0;
  static GameString aClass94_3399 = SpawnedGameObject.createString("<br>(X");
  static GameString aClass94_3401 = SpawnedGameObject.createString("Weiter");
  static GameString aClass94_3397 = aClass94_3400;
  private AbstractSomethingTexture[] aClass75Array3392;

  public TextureSampler29() {
    super(0, true);
  }

  final int[] method154(int var1, byte var2) {
    try {
      int var4 = -75 % ((30 - var2) / 36);
      int[] var3 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        this.method323(-60, this.monoChromaticImageCache.method1710((byte) 124));
      }

      return var3;
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5, "si.D(" + var1 + ',' + var2 + ')');
    }
  }

  final void parseConfig(int var1, Buffer var2, boolean var3) {
    try {
      if (var1 == 0) {
        this.aClass75Array3392 = new AbstractSomethingTexture[var2.readUnsignedByte()];

        for (int var4 = 0; ~this.aClass75Array3392.length < ~var4; ++var4) {
          int var5 = var2.readUnsignedByte();
          if (var5 == 0) {
            this.aClass75Array3392[var4] = FileSystem.method843(-5232, var2);
          } else if (-2 == ~var5) {
            this.aClass75Array3392[var4] = StillGraphicNode.method536((byte) 54, var2);
          } else if (var5 != 2) {
            if (3 == var5) {
              this.aClass75Array3392[var4] = ClanChatUser.method384(var2, (byte) 80);
            }
          } else {
            this.aClass75Array3392[var4] = AudioSomethingSomething.method404((byte) -110, var2);
          }
        }
      } else if (1 == var1) {
        this.monoChromatic = var2.readUnsignedByte() == 1;
      }

      if (!var3) {
        this.method323(124, null);
      }

    } catch (RuntimeException var7) {
      throw AbstractGameWorld.cascadeException(var7,
        "si.A(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
    }
  }

  final int[][] method166(int var1, int var2) {
    try {
      if (var1 != -1) {
        return null;
      } else {
        int[][] var3 = this.triChromaticImageCache.method1594((byte) -117, var2);
        if (this.triChromaticImageCache.aBoolean1379) {
          int var4 = SomethingLight0.anInt1559;
          int var5 = DummyClass55.anInt1427;
          int[][] var6 = new int[var5][var4];
          int[][][] var7 = this.triChromaticImageCache.method1589((byte) -56);
          this.method323(-60, var6);

          for (int var8 = 0; var8 < DummyClass55.anInt1427; ++var8) {
            int[] var9 = var6[var8];
            int[][] var10 = var7[var8];
            int[] var11 = var10[0];
            int[] var12 = var10[1];
            int[] var13 = var10[2];

            for (int var14 = 0; ~var14 > ~SomethingLight0.anInt1559; ++var14) {
              int var15 = var9[var14];
              var13[var14] = ClientScript.bitAnd(255, var15) << 4;
              var12[var14] = ClientScript.bitAnd(4080, var15 >> 4);
              var11[var14] = ClientScript.bitAnd(var15 >> 12, 4080);
            }
          }
        }

        return var3;
      }
    } catch (RuntimeException var16) {
      throw AbstractGameWorld.cascadeException(var16, "si.T(" + var1 + ',' + var2 + ')');
    }
  }

  private final void method323(int var1, int[][] var2) {
    try {
      int var4 = DummyClass55.anInt1427;
      int var3 = SomethingLight0.anInt1559;
      TextureSampler20.method230(var2, true);
      DummyClass43.method1196(0, 0, (byte) 111, TriChromaticImageBuffer.anInt2487,
        RenderAnimation.anInt396);
      if (this.aClass75Array3392 != null) {
        for (int var5 = 0; this.aClass75Array3392.length > var5; ++var5) {
          AbstractSomethingTexture var6 = this.aClass75Array3392[var5];
          int var7 = var6.anInt1101;
          int var8 = var6.anInt1104;
          if (var7 >= 0) {
            if (~var8 > -1) {
              var6.method1341(2, var3, var4);
            } else {
              var6.method1335(var4, var3, 4898);
            }
          } else if (~var8 <= -1) {
            var6.method1337(var4, true, var3);
          }
        }
      }

      if (var1 != -60) {
        getByteLength(null);
      }

    } catch (RuntimeException var9) {
      throw AbstractGameWorld.cascadeException(var9,
        "si.F(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
    }
  }

  static final int method322(boolean var0, byte var1) {
    try {
      return !var0 ? 104 : 255 & var1;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "si.C(" + var0 + ',' + var1 + ')');
    }
  }

  static final void setupDefaultSun(int brightness) {
    try {
      GlEnvironment.setSunColor(GlEnvironment.defaultSunColor,
        (0.7F + (float) brightness * 0.1F) * 1.1523438F, 0.69921875F, 0.69921875F);
      GlEnvironment.setSunPosition(-50.0F, -60.0F, -50.0F);
      GlEnvironment.setFogColor(GlEnvironment.defaultFogColor, 0);
      GlEnvironment.updateSunPosition();
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "si.Q(" + brightness + ')');
    }
  }

  public static void method325(int var0) {
    try {
      aClass94_3401 = null;
      aByteArrayArrayArray3390 = null;
      if (var0 == 0) {
        aByteArray3396 = null;
        aClass133Array3393 = null;
        aClass94_3400 = null;
        aClass94Array3391 = null;
        aClass94_3397 = null;
        aClass94_3399 = null;
        aClass94_3394 = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "si.E(" + var0 + ')');
    }
  }

  static final int getByteLength(GameString var1) {
    try {
      return var1.getLength() + 1;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "si.O(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  static final void method327(int var0, int var1, byte var2) {
    try {
      if (var2 != 68) {
        aClass94_3397 = null;
      }

      WidgetUpdate var3 = AudioStreamEncoder3.method466(var2 + -64, 12, var1);
      var3.g((byte) 33);
      var3.anInt3598 = var0;
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "si.B(" + var0 + ',' + var1 + ',' + var2 + ')');
    }
  }

}
