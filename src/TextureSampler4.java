import java.util.Random;

final class TextureSampler4 extends AbstractTextureSampler {

  private static GameString LANG_PORTUGUESE = SpawnedGameObject.createString("pt");
  private static GameString LANG_ENGLISH = SpawnedGameObject.createString("en");
  private static GameString LANG_FRENCH = SpawnedGameObject.createString("fr");
  private static GameString LANG_GERMAN = SpawnedGameObject.createString("de");
  static GameString aClass94_3220;
  static SoftwareDirectColorSprite aClass3_Sub28_Sub16_Sub2_3221;
  static GameString[] aClass94Array3226 = new GameString[100];
  static FileUnpacker aClass153_3227;
  static int[] anIntArray3228 = new int[] {7, 8, 9, 10, 11, 12, 13, 15};
  static short aShort3241 = 1;
  static GameString[] LANGUAGES =
    new GameString[] {LANG_ENGLISH, LANG_GERMAN, LANG_FRENCH, LANG_PORTUGUESE};
  private int anInt3219 = 204;
  private int anInt3222;
  private int anInt3223;
  private int anInt3224 = 81;
  private int[][] anIntArrayArray3225;
  private int anInt3229 = 1024;
  private int[] anIntArray3230;
  private int anInt3231 = 0;
  private int anInt3233 = 8;
  private int anInt3234 = 1024;
  private int anInt3235;
  private int anInt3236 = 409;
  private int[][] anIntArrayArray3240;
  private int anInt3242 = 4;


  public TextureSampler4() {
    super(0, true);
  }

  private final void method263(int var1) {
    try {
      Random var2 = new Random((long) this.anInt3233);
      this.anInt3222 = 4096 / this.anInt3233;
      this.anInt3223 = this.anInt3224 / 2;
      this.anIntArrayArray3225 = new int[this.anInt3233][1 + this.anInt3242];
      int var4 = this.anInt3222 / 2;
      this.anIntArray3230 = new int[this.anInt3233 - -1];
      this.anIntArrayArray3240 = new int[this.anInt3233][this.anInt3242];
      this.anInt3235 = 4096 / this.anInt3242;
      this.anIntArray3230[0] = var1;
      int var3 = this.anInt3235 / 2;

      for (int var5 = 0; ~var5 > ~this.anInt3233; ++var5) {
        int var6;
        int var7;
        if (~var5 < -1) {
          var6 = this.anInt3222;
          var7 = (FloorUnderlay.method1603((byte) 59, 4096, var2) + -2048) * this.anInt3219 >> 12;
          var6 += var7 * var4 >> 12;
          this.anIntArray3230[var5] = this.anIntArray3230[var5 - 1] - -var6;
        }

        this.anIntArrayArray3225[var5][0] = 0;

        for (var6 = 0; ~var6 > ~this.anInt3242; ++var6) {
          if (0 < var6) {
            var7 = this.anInt3235;
            int var8 =
              (-2048 + FloorUnderlay.method1603((byte) -1, 4096, var2)) * this.anInt3236 >> 12;
            var7 += var3 * var8 >> 12;
            this.anIntArrayArray3225[var5][var6] =
              this.anIntArrayArray3225[var5][var6 + -1] - -var7;
          }

          this.anIntArrayArray3240[var5][var6] = ~this.anInt3229 >= -1 ?
            4096 :
            4096 + -FloorUnderlay.method1603((byte) 33, this.anInt3229, var2);
        }

        this.anIntArrayArray3225[var5][this.anInt3242] = 4096;
      }

      this.anIntArray3230[this.anInt3233] = 4096;
    } catch (RuntimeException var9) {
      throw AbstractGameWorld.cascadeException(var9, "mc.E(" + var1 + ')');
    }
  }

  final int[] method154(int var1, byte var2) {
    try {
      int[] var3 = this.monoChromaticImageCache.method1709(-16409, var1);
      int var4;
      if (this.monoChromaticImageCache.aBoolean1580) {
        int var7 = 0;

        int var9;
        for (var9 = DummyClass4.anIntArray2999[var1] + this.anInt3231; ~var9 > -1; var9 += 4096) {
        }

        while (4096 < var9) {
          var9 -= 4096;
        }

        while (this.anInt3233 > var7 && ~var9 <= ~this.anIntArray3230[var7]) {
          ++var7;
        }

        int var11 = var7 + -1;
        int var15 = this.anIntArray3230[var7];
        boolean var12 = 0 == (var7 & 1);
        int var16 = this.anIntArray3230[var7 - 1];
        if (var16 - -this.anInt3223 < var9 && ~(var15 - this.anInt3223) < ~var9) {
          for (var4 = 0; var4 < SomethingLight0.anInt1559; ++var4) {
            int var6 = 0;
            int var5 = !var12 ? -this.anInt3234 : this.anInt3234;

            int var8;
            for (
              var8 = TextureCache.anIntArray2125[var4] - -(this.anInt3235 * var5 >> 12);
              ~var8 > -1; var8 += 4096) {
            }

            while (var8 > 4096) {
              var8 -= 4096;
            }

            while (~this.anInt3242 < ~var6 && ~var8 <= ~this.anIntArrayArray3225[var11][var6]) {
              ++var6;
            }

            int var14 = this.anIntArrayArray3225[var11][var6];
            int var10 = var6 - 1;
            int var13 = this.anIntArrayArray3225[var11][var10];
            if (~(var13 - -this.anInt3223) > ~var8 && ~(-this.anInt3223 + var14) < ~var8) {
              var3[var4] = this.anIntArrayArray3240[var11][var10];
            } else {
              var3[var4] = 0;
            }
          }
        } else {
          ArrayUtils.fill(var3, 0, SomethingLight0.anInt1559, 0);
        }
      }

      var4 = -48 % ((30 - var2) / 36);
      return var3;
    } catch (RuntimeException var17) {
      throw AbstractGameWorld.cascadeException(var17, "mc.D(" + var1 + ',' + var2 + ')');
    }
  }

  final void parseConfig(int var1, Buffer var2, boolean var3) {
    try {
      if (0 != var1) {
        if (~var1 == -2) {
          this.anInt3233 = var2.readUnsignedByte();
        } else if (-3 != ~var1) {
          if (var1 != 3) {
            if (4 != var1) {
              if (-6 != ~var1) {
                if (-7 != ~var1) {
                  if (var1 == 7) {
                    this.anInt3229 = var2.readUnsignedShort();
                  }
                } else {
                  this.anInt3224 = var2.readUnsignedShort();
                }
              } else {
                this.anInt3231 = var2.readUnsignedShort();
              }
            } else {
              this.anInt3234 = var2.readUnsignedShort();
            }
          } else {
            this.anInt3219 = var2.readUnsignedShort();
          }
        } else {
          this.anInt3236 = var2.readUnsignedShort();
        }
      } else {
        this.anInt3242 = var2.readUnsignedByte();
      }

      if (!var3) {
        LANG_FRENCH = null;
      }

    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "mc.A(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
    }
  }

  final void method158(int var1) {
    try {
      if (var1 != 16251) {
        this.method158(-93);
      }

      this.method263(0);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "mc.P(" + var1 + ')');
    }
  }

  static final void method260(int var0, int var1, int var2) {
    try {
      if (var0 != -16207) {
        LANG_PORTUGUESE = null;
      }

      WidgetUpdate var3 = AudioStreamEncoder3.method466(4, 7, var1);
      var3.g((byte) 33);
      var3.anInt3598 = var2;
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "mc.O(" + var0 + ',' + var1 + ',' + var2 + ')');
    }
  }

  public static void method261(int var0) {
    try {
      int var1 = -31 / ((-43 - var0) / 55);
      aClass153_3227 = null;
      LANG_GERMAN = null;
      LANG_PORTUGUESE = null;
      LANG_FRENCH = null;
      aClass94_3220 = null;
      anIntArray3228 = null;
      LANGUAGES = null;
      aClass94Array3226 = null;
      LANG_ENGLISH = null;
      aClass3_Sub28_Sub16_Sub2_3221 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "mc.F(" + var0 + ')');
    }
  }

  static final void method262(int var0, int var1, int var2, int var3, int var4, int var5, int var6,
                              int var7) {
    try {
      int var8 = var5 + var2;
      int var10 = var5 + var7;

      int var12;
      for (var12 = var2; var12 < var8; ++var12) {
        TextureSampler18.method282(DummyClass35.anIntArrayArray663[var12], var7, 125, var6, var0);
      }

      int var9 = -var5 + var3;
      int var11 = -var5 + var6;

      for (var12 = var3; var12 > var9; --var12) {
        TextureSampler18.method282(DummyClass35.anIntArrayArray663[var12], var7, 103, var6, var0);
      }

      if (var1 > 118) {
        for (var12 = var8; ~var9 <= ~var12; ++var12) {
          int[] var13 = DummyClass35.anIntArrayArray663[var12];
          TextureSampler18.method282(var13, var7, 117, var10, var0);
          TextureSampler18.method282(var13, var10, 111, var11, var4);
          TextureSampler18.method282(var13, var11, -75, var6, var0);
        }

      }
    } catch (RuntimeException var14) {
      throw AbstractGameWorld.cascadeException(var14,
        "mc.Q(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6
          + ',' + var7 + ')');
    }
  }

  static final void method264(byte var0) {
    try {
      ++TextureSampler25.anInt3402;
      TextureSampler12.secureBuffer.writePacket(184);

      for (SomethingPacket151 var1 =
           (SomethingPacket151) TextureSampler23.aClass130_3208.getFirst(124);
           null != var1; var1 = (SomethingPacket151) TextureSampler23.aClass130_3208.getNext(-79)) {
        if (var1.anInt2603 == 0) {
          TextureSampler19.method254(true, var1, false);
        }
      }

      if (var0 < 83) {
        LANG_PORTUGUESE = null;
      }

      if (null != TextureSampler27.aClass11_3087) {
        DummyClass29.method909(125, TextureSampler27.aClass11_3087);
        TextureSampler27.aClass11_3087 = null;
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "mc.C(" + var0 + ')');
    }
  }

  static final void method265(byte var0, int var1) {
    try {
      WidgetUpdate var2 = AudioStreamEncoder3.method466(4, 8, var1);
      var2.createIndexedColorSprite(true);
      if (var0 != -42) {
        LANG_FRENCH = null;
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "mc.B(" + var0 + ',' + var1 + ')');
    }
  }

}
