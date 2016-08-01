final class TextureSampler16 extends AbstractTextureSampler {

  static int[] anIntArray3107;
  static short[] aShortArray3110 = new short[256];
  static int anInt3111 = 0;
  static HuffmanEncoder huffmanEncoder;
  static int anInt3114 = 0;
  static int[][] anIntArrayArray3115;
  private int anInt3108 = 1;
  private int anInt3109 = 204;
  private int anInt3113 = 1;


  public TextureSampler16() {
    super(0, true);
  }

  static final int method208(int var0) {
    try {
      if (var0 > -22) {
        aShortArray3110 = null;
      }

      return 15;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "f.B(" + var0 + ')');
    }
  }

  public static void method209(byte var0) {
    try {
      aShortArray3110 = null;
      huffmanEncoder = null;
      if (var0 >= 30) {
        anIntArray3107 = null;
        anIntArrayArray3115 = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "f.C(" + var0 + ')');
    }
  }

  final void parseConfig(int var1, Buffer var2, boolean var3) {
    try {
      if (var3) {
        if (~var1 != -1) {
          if (var1 == 1) {
            this.anInt3113 = var2.readUnsignedByte();
          } else if (var1 == 2) {
            this.anInt3109 = var2.readUnsignedShort();
          }
        } else {
          this.anInt3108 = var2.readUnsignedByte();
        }

      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "f.A(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
    }
  }

  final int[] method154(int var1, byte var2) {
    try {
      int var3 = -24 / ((var2 - 30) / 36);
      int[] var4 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        for (int var5 = 0; SomethingLight0.anInt1559 > var5; ++var5) {
          int var6 = TextureCache.anIntArray2125[var5];
          int var7 = DummyClass4.anIntArray2999[var1];
          int var8 = this.anInt3108 * var6 >> 12;
          int var9 = var7 * this.anInt3113 >> 12;
          int var10 = this.anInt3108 * (var6 % (4096 / this.anInt3108));
          int var11 = var7 % (4096 / this.anInt3113) * this.anInt3113;
          if (~this.anInt3109 < ~var11) {
            for (var8 -= var9; ~var8 > -1; var8 += 4) {
            }

            while (3 < var8) {
              var8 -= 4;
            }

            if (1 != var8) {
              var4[var5] = 0;
              continue;
            }

            if (~this.anInt3109 < ~var10) {
              var4[var5] = 0;
              continue;
            }
          }

          if (var10 < this.anInt3109) {
            for (var8 -= var9; 0 > var8; var8 += 4) {
            }

            while (~var8 < -4) {
              var8 -= 4;
            }

            if (var8 > 0) {
              var4[var5] = 0;
              continue;
            }
          }

          var4[var5] = 4096;
        }
      }

      return var4;
    } catch (RuntimeException var12) {
      throw AbstractGameWorld.cascadeException(var12, "f.D(" + var1 + ',' + var2 + ')');
    }
  }

}
