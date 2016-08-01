import java.awt.Component;
import java.lang.reflect.Method;

final class TextureSampler34 extends AbstractTextureSampler {

  static int anInt3054;
  static GameString aClass94_3055 = SpawnedGameObject.createString("k");
  static byte[][] updatedLandscapesData;
  static int anInt3061;
  static boolean aBoolean3064 = true;
  int anInt3056 = 4;
  int anInt3058 = 4;
  int anInt3060 = 4;
  int anInt3062 = 1638;
  boolean aBoolean3065 = true;
  int anInt3067 = 0;
  private byte[] aByteArray3059 = new byte[512];
  private short[] aShortArray3063;
  private short[] aShortArray3066;


  public TextureSampler34() {
    super(0, true);
  }

  static final boolean method185(int var0, int var1, int var2, int var3, int var4, int var5,
                                 int var6, int var7) {
    if (var1 < var2 && var1 < var3 && var1 < var4) {
      return false;
    } else if (var1 > var2 && var1 > var3 && var1 > var4) {
      return false;
    } else if (var0 < var5 && var0 < var6 && var0 < var7) {
      return false;
    } else if (var0 > var5 && var0 > var6 && var0 > var7) {
      return false;
    } else {
      int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
      int var9 = (var1 - var4) * (var5 - var7) - (var0 - var7) * (var2 - var4);
      int var10 = (var1 - var3) * (var7 - var6) - (var0 - var6) * (var4 - var3);
      return var8 * var10 > 0 && var10 * var9 > 0;
    }
  }

  public static void method187(boolean var0) {
    try {
      updatedLandscapesData = null;
      if (var0) {
        aClass94_3055 = null;
      }

      aClass94_3055 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "bi.S(" + var0 + ')');
    }
  }

  static final void method188(int var0, int var1) {
    try {
      if (var1 != 0) {
        method188(38, 29);
      }

      DummyClass14.aClass93_1955.method1522(-125, var0);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "bi.U(" + var0 + ',' + var1 + ')');
    }
  }

  static final void method189(byte var0) {
    try {
      int var2 = -18 / ((28 - var0) / 32);

      int var1;
      for (var1 = -1; DummyClass13.anInt2022 > var1; ++var1) {
        int var3;
        if (~var1 != 0) {
          var3 = DummyClass42.anIntArray887[var1];
        } else {
          var3 = 2047;
        }

        Player var4 = TextureSampler0.players[var3];
        if (var4 != null && 0 < var4.anInt2814) {
          --var4.anInt2814;
          if (-1 == ~var4.anInt2814) {
            var4.aClass94_2825 = null;
          }
        }
      }

      for (var1 = 0; ~DummyClass6.anInt2046 < ~var1; ++var1) {
        var2 = AudioWorker.anIntArray347[var1];
        NPC var6 = TextureSampler5.npcs[var2];
        if (null != var6 && -1 > ~var6.anInt2814) {
          --var6.anInt2814;
          if (-1 == ~var6.anInt2814) {
            var6.aClass94_2825 = null;
          }
        }
      }

    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5, "bi.B(" + var0 + ')');
    }
  }

  static final int method190(int var0, int hsl, byte var2, int lightness) {
    try {
      int var5 = DummyClass40.hslTable[SoftwareModel.repackHSL(hsl, lightness)];
      if (-1 > ~var0) {
        int var6 = DummyClass40.textureCache.method19(111, var0 & '\uffff');
        int var7;
        int var9;
        if (~var6 != -1) {
          if (-1 >= ~lightness) {
            if (-128 > ~lightness) {
              var7 = 16777215;
            } else {
              var7 = 131586 * lightness;
            }
          } else {
            var7 = 0;
          }

          if (var6 == 256) {
            var5 = var7;
          } else {
            var9 = -var6 + 256;
            var5 = (16711680 & (var7 & '\uff00') * var6 + var9 * (var5 & '\uff00')) + (
              var6 * (var7 & 16711935) - -((16711935 & var5) * var9) & -16711936) >> 8;
          }
        }

        var7 = DummyClass40.textureCache.method10(106, '\uffff' & var0);
        if (~var7 != -1) {
          var7 += 256;
          int var8 = ((16711680 & var5) >> 16) * var7;
          if ('\uffff' < var8) {
            var8 = '\uffff';
          }

          var9 = ((var5 & '\uff00') >> 8) * var7;
          if (var9 > '\uffff') {
            var9 = '\uffff';
          }

          int var10 = var7 * (var5 & 255);
          if (var10 > '\uffff') {
            var10 = '\uffff';
          }

          var5 = (var10 >> 8) + ('\uff00' & var9) + (16711711 & var8 << 8);
        }
      }

      return var5;
    } catch (RuntimeException var11) {
      throw AbstractGameWorld
        .cascadeException(var11, "bi.E(" + var0 + ',' + hsl + ',' + var2 + ',' + lightness + ')');
    }
  }

  static final void method193(byte var0, Component var1) {
    try {
      if (var0 < 49) {
        anInt3054 = 85;
      }

      Method var2 = SignLink.setFocusTraversalKeyEnabledMethod;
      if (null != var2) {
        try {
          var2.invoke(var1, Boolean.FALSE);
        } catch (Throwable var4) {
        }
      }

      var1.addKeyListener(TextureSampler33.keyboard);
      var1.addFocusListener(TextureSampler33.keyboard);
    } catch (RuntimeException var5) {
      throw AbstractGameWorld
        .cascadeException(var5, "bi.Q(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  final void method186(boolean var1, int var2, int[] var3) {
    try {
      int var5 = this.anInt3056 * DummyClass4.anIntArray2999[var2];
      if (var1) {
        int var4;
        int var6;
        int var8;
        short var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var17;
        int var16;
        int var18;
        if (-2 != ~this.anInt3058) {
          var9 = this.aShortArray3066[0];
          if (var9 > 8 || -8 > var9) {
            var8 = this.aShortArray3063[0] << 12;
            var13 = var8 * this.anInt3056 >> 12;
            var12 = this.anInt3060 * var8 >> 12;
            var11 = var5 * var8 >> 12;
            var15 = var11 >> 12;
            var16 = 1 + var15;
            var17 = this.aByteArray3059[var15 & 255] & 255;
            var11 &= 4095;
            var14 = DummyClass3.anIntArray52[var11];
            if (~var16 <= ~var13) {
              var16 = 0;
            }

            var18 = 255 & this.aByteArray3059[255 & var16];

            for (var10 = 0; SomethingLight0.anInt1559 > var10; ++var10) {
              var4 = TextureCache.anIntArray2125[var10] * this.anInt3060;
              var6 = this.method192(var4 * var8 >> 12, var18, var17, var12, 122, var11, var14);
              var3[var10] = var6 * var9 >> 12;
            }
          }

          for (int var7 = 1; this.anInt3058 > var7; ++var7) {
            var9 = this.aShortArray3066[var7];
            if (8 < var9 || var9 < -8) {
              var8 = this.aShortArray3063[var7] << 12;
              var11 = var8 * var5 >> 12;
              var15 = var11 >> 12;
              var17 = this.aByteArray3059[255 & var15] & 255;
              var12 = this.anInt3060 * var8 >> 12;
              var16 = var15 + 1;
              var11 &= 4095;
              var14 = DummyClass3.anIntArray52[var11];
              var13 = this.anInt3056 * var8 >> 12;
              if (~var16 <= ~var13) {
                var16 = 0;
              }

              var18 = 255 & this.aByteArray3059[var16 & 255];
              if (this.aBoolean3065 && ~var7 == ~(this.anInt3058 + -1)) {
                for (var10 = 0; ~SomethingLight0.anInt1559 < ~var10; ++var10) {
                  var4 = TextureCache.anIntArray2125[var10] * this.anInt3060;
                  var6 = this.method192(var8 * var4 >> 12, var18, var17, var12, 120, var11, var14);
                  var6 = (var9 * var6 >> 12) + var3[var10];
                  var3[var10] = (var6 >> 1) + 2048;
                }
              } else {
                for (var10 = 0; ~var10 > ~SomethingLight0.anInt1559; ++var10) {
                  var4 = TextureCache.anIntArray2125[var10] * this.anInt3060;
                  var6 = this.method192(var4 * var8 >> 12, var18, var17, var12, 126, var11, var14);
                  var3[var10] += var6 * var9 >> 12;
                }
              }
            }
          }
        } else {
          var9 = this.aShortArray3066[0];
          var8 = this.aShortArray3063[0] << 12;
          var11 = var5 * var8 >> 12;
          var12 = this.anInt3060 * var8 >> 12;
          var13 = var8 * this.anInt3056 >> 12;
          var15 = var11 >> 12;
          var17 = this.aByteArray3059[255 & var15] & 255;
          var11 &= 4095;
          var14 = DummyClass3.anIntArray52[var11];
          var16 = var15 - -1;
          if (~var13 >= ~var16) {
            var16 = 0;
          }

          var18 = 255 & this.aByteArray3059[255 & var16];
          if (this.aBoolean3065) {
            for (var10 = 0; SomethingLight0.anInt1559 > var10; ++var10) {
              var4 = this.anInt3060 * TextureCache.anIntArray2125[var10];
              var6 = this.method192(var8 * var4 >> 12, var18, var17, var12, 121, var11, var14);
              var6 = var9 * var6 >> 12;
              var3[var10] = 2048 - -(var6 >> 1);
            }
          } else {
            for (var10 = 0; var10 < SomethingLight0.anInt1559; ++var10) {
              var4 = this.anInt3060 * TextureCache.anIntArray2125[var10];
              var6 = this.method192(var8 * var4 >> 12, var18, var17, var12, 124, var11, var14);
              var3[var10] = var9 * var6 >> 12;
            }
          }
        }

      }
    } catch (RuntimeException var19) {
      throw AbstractGameWorld.cascadeException(var19,
        "bi.C(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
    }
  }

  final void method158(int var1) {
    try {
      this.aByteArray3059 = GZipDecompressor.method1123(16711935, this.anInt3067);
      this.method191(true);

      for (int var2 = -1 + this.anInt3058; var2 >= 1; --var2) {
        short var3 = this.aShortArray3066[var2];
        if (8 < var3 || var3 < -8) {
          break;
        }

        --this.anInt3058;
      }

      if (var1 != 16251) {
        this.anInt3062 = 101;
      }

    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "bi.P(" + var1 + ')');
    }
  }

  final void parseConfig(int var1, Buffer var2, boolean var3) {
    try {
      if (!var3) {
        this.method192(49, -110, -55, -117, 117, 10, -51);
      }

      if (var1 == 0) {
        this.aBoolean3065 = var2.readUnsignedByte() == 1;
      } else if (~var1 == -2) {
        this.anInt3058 = var2.readUnsignedByte();
      } else if (var1 == 2) {
        this.anInt3062 = var2.method787((byte) 30);
        if (0 > this.anInt3062) {
          this.aShortArray3066 = new short[this.anInt3058];

          for (int var4 = 0; this.anInt3058 > var4; ++var4) {
            this.aShortArray3066[var4] = (short) var2.method787((byte) 19);
          }
        }
      } else if (var1 == 3) {
        this.anInt3060 = this.anInt3056 = var2.readUnsignedByte();
      } else if (var1 == 4) {
        this.anInt3067 = var2.readUnsignedByte();
      } else if (~var1 == -6) {
        this.anInt3060 = var2.readUnsignedByte();
      } else if (var1 == 6) {
        this.anInt3056 = var2.readUnsignedByte();
      }

    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "bi.A(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
    }
  }

  private final void method191(boolean var1) {
    try {
      int var2;
      if (this.anInt3062 <= 0) {
        if (this.aShortArray3066 != null && this.aShortArray3066.length == this.anInt3058) {
          this.aShortArray3063 = new short[this.anInt3058];

          for (var2 = 0; var2 < this.anInt3058; ++var2) {
            this.aShortArray3063[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
          }
        }
      } else {
        this.aShortArray3066 = new short[this.anInt3058];
        this.aShortArray3063 = new short[this.anInt3058];

        for (var2 = 0; var2 < this.anInt3058; ++var2) {
          this.aShortArray3066[var2] =
            (short) ((int) (Math.pow((double) ((float) this.anInt3062 / 4096.0F), (double) var2)
              * 4096.0D));
          this.aShortArray3063[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
      }

      if (!var1) {
        this.method192(54, 5, -23, 103, -114, -67, -27);
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "bi.F(" + var1 + ')');
    }
  }

  private final int method192(int var1, int var2, int var3, int var4, int var5, int var6,
                              int var7) {
    try {
      if (var5 < 117) {
        this.method158(89);
      }

      int var10 = -4096 + var6;
      int var13 = var1 >> 12;
      int var12 = 1 + var13;
      var13 &= 255;
      if (~var12 <= ~var4) {
        var12 = 0;
      }

      var1 &= 4095;
      int var14 = this.aByteArray3059[var13 - -var3] & 3;
      int var15 = DummyClass3.anIntArray52[var1];
      int var8;
      if (var14 > 1) {
        var8 = 2 != var14 ? -var1 + -var6 : var1 - var6;
      } else {
        var8 = 0 == var14 ? var6 + var1 : -var1 + var6;
      }

      var12 &= 255;
      int var11 = -4096 + var1;
      var14 = this.aByteArray3059[var3 + var12] & 3;
      int var9;
      if (~var14 >= -2) {
        var9 = 0 == var14 ? var6 + var11 : -var11 + var6;
      } else {
        var9 = 2 == var14 ? -var6 + var11 : -var11 + -var6;
      }

      var14 = this.aByteArray3059[var13 - -var2] & 3;
      int var16 = var8 + ((var9 + -var8) * var15 >> 12);
      if (1 < var14) {
        var8 = 2 != var14 ? -var1 - var10 : var1 + -var10;
      } else {
        var8 = 0 != var14 ? var10 + -var1 : var1 - -var10;
      }

      var14 = 3 & this.aByteArray3059[var2 + var12];
      if (1 < var14) {
        var9 = ~var14 != -3 ? -var10 + -var11 : var11 - var10;
      } else {
        var9 = var14 == 0 ? var11 + var10 : var10 + -var11;
      }

      int var17 = var8 + ((-var8 + var9) * var15 >> 12);
      return var16 - -(var7 * (var17 + -var16) >> 12);
    } catch (RuntimeException var18) {
      throw AbstractGameWorld.cascadeException(var18,
        "bi.R(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7
          + ')');
    }
  }

  final int[] method154(int var1, byte var2) {
    try {
      int var4 = 111 % ((30 - var2) / 36);
      int[] var3 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        this.method186(true, var1, var3);
      }

      return var3;
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5, "bi.D(" + var1 + ',' + var2 + ')');
    }
  }

}
