class Something3d2 extends Something3dRoot {

  static SomethingFont aClass33_3019;
  static int anInt3020 = 0;
  static byte[][] aByteArrayArray3027;
  private int anInt3018;
  private int anInt3021;
  private int anInt3022;
  private int anInt3023;
  private int anInt3024;
  private byte[] aByteArray3025;
  private int anInt3026;
  private int anInt3028;
  private int anInt3029;


  Something3d2(int var1, int var2, int var3, int var4, int var5, float var6, float var7,
               float var8) {
    super(var1, var2, var3, var4, var5);

    try {
      this.anInt3022 = (int) (4096.0F * var8);
      this.anInt3026 = (int) (var7 * 4096.0F);
      this.anInt3018 = this.anInt3021 = (int) (Math.pow(0.5D, (double) (-var6)) * 4096.0D);
    } catch (RuntimeException var10) {
      throw AbstractGameWorld.cascadeException(var10,
        "we.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ','
          + var7 + ',' + var8 + ')');
    }
  }

  void method2244(int var1, byte var2) {
    try {
      this.aByteArray3025[var1] = var2;
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "we.G(" + var1 + ',' + var2 + ')');
    }
  }

  final void method2231(byte var1) {
    try {
      this.anInt3018 = this.anInt3021;
      this.anInt3029 >>= 4;
      if (0 > this.anInt3029) {
        this.anInt3029 = 0;
      } else if (255 < this.anInt3029) {
        this.anInt3029 = 255;
      }

      this.method2244(this.anInt3028++, (byte) this.anInt3029);
      if (var1 == -92) {
        this.anInt3029 = 0;
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "we.A(" + var1 + ')');
    }
  }

  final void method2233(int var1) {
    try {
      this.anInt3028 = 0;
      this.anInt3029 = 0;
      if (var1 != -949697716) {
        method2249((byte) -82, -73);
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "we.C(" + var1 + ')');
    }
  }

  final void method2237(int var1, int var2, int var3) {
    try {
      if (0 != var2) {
        this.anInt3023 = this.anInt3022 * this.anInt3024 >> 12;
        if (-1 >= ~this.anInt3023) {
          if (~this.anInt3023 < -4097) {
            this.anInt3023 = 4096;
          }
        } else {
          this.anInt3023 = 0;
        }

        this.anInt3024 = -(-1 >= ~var1 ? var1 : -var1) + this.anInt3026;
        this.anInt3024 = this.anInt3024 * this.anInt3024 >> 12;
        this.anInt3024 = this.anInt3024 * this.anInt3023 >> 12;
        this.anInt3029 += this.anInt3018 * this.anInt3024 >> 12;
        this.anInt3018 = this.anInt3021 * this.anInt3018 >> 12;
      } else {
        this.anInt3023 = 4096;
        this.anInt3024 = -(-1 >= ~var1 ? var1 : -var1) + this.anInt3026;
        this.anInt3024 = this.anInt3024 * this.anInt3024 >> 12;
        this.anInt3029 = this.anInt3024;
      }

      if (var3 != -20975) {
        this.method2244(-80, (byte) -24);
      }

    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "we.H(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  public static void method2245(byte var0) {
    try {
      aClass33_3019 = null;
      if (var0 != -74) {
        aByteArrayArray3027 = null;
      }

      aByteArrayArray3027 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "we.I(" + var0 + ')');
    }
  }

  static final int method2246(byte var0, int var1) {
    try {
      int var2 = var1 * (var1 * var1 >> 12) >> 12;
      if (var0 <= 59) {
        aByteArrayArray3027 = null;
      }

      int var3 = 6 * var1 - '\uf000';
      int var4 = (var1 * var3 >> 12) + '\ua000';
      return var2 * var4 >> 12;
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5, "we.E(" + var0 + ',' + var1 + ')');
    }
  }

  static final int method2247(byte var0, int var1, Widget var2) {
    try {
      if (var2.anIntArrayArray298 != null && ~var1 > ~var2.anIntArrayArray298.length) {
        int var3 = -92 % ((var0 - 71) / 34);

        try {
          int[] var4 = var2.anIntArrayArray298[var1];
          byte var7 = 0;
          int var5 = 0;
          int var6 = 0;

          while (true) {
            int var9 = 0;
            int var8 = var4[var6++];
            byte var10 = 0;
            if (~var8 == -1) {
              return var5;
            }

            if (15 == var8) {
              var10 = 1;
            }

            if (16 == var8) {
              var10 = 2;
            }

            if (~var8 == -2) {
              var9 = TextureSampler17.anIntArray3185[var4[var6++]];
            }

            if (-18 == ~var8) {
              var10 = 3;
            }

            if (-3 == ~var8) {
              var9 = TriChromaticImageBuffer.anIntArray2480[var4[var6++]];
            }

            if (~var8 == -4) {
              var9 = SomethingPacket116.anIntArray1743[var4[var6++]];
            }

            int var11;
            Widget var12;
            int var13;
            int var14;
            if (-5 == ~var8) {
              var11 = var4[var6++] << 16;
              var11 += var4[var6++];
              var12 = EnumStringFetcher.getWidget((byte) 124, var11);
              var13 = var4[var6++];
              if (-1 != var13 && (!DummyClass35.getItemConfig(var13, (byte) 109).aBoolean779
                || MapScene.aBoolean66)) {
                for (var14 = 0; ~var12.anIntArray254.length < ~var14; ++var14) {
                  if (1 + var13 == var12.anIntArray254[var14]) {
                    var9 += var12.anIntArray317[var14];
                  }
                }
              }
            }

            if (var8 == 5) {
              var9 = DummyClass5.anIntArray2985[var4[var6++]];
            }

            if (6 == var8) {
              var9 =
                ItemConfig.anIntArray781[-1 + TriChromaticImageBuffer.anIntArray2480[var4[var6++]]];
            }

            if (~var8 == -8) {
              var9 = 100 * DummyClass5.anIntArray2985[var4[var6++]] / '\ub71b';
            }

            if (-9 == ~var8) {
              var9 = TextureCache.localPlayer.combatLevel;
            }

            if (9 == var8) {
              for (var11 = 0; -26 < ~var11; ++var11) {
                if (SomethingOtherWorldMap.aBooleanArray2538[var11]) {
                  var9 += TriChromaticImageBuffer.anIntArray2480[var11];
                }
              }
            }

            if (var8 == 10) {
              var11 = var4[var6++] << 16;
              var11 += var4[var6++];
              var12 = EnumStringFetcher.getWidget((byte) 115, var11);
              var13 = var4[var6++];
              if (~var13 != 0 && (!DummyClass35.getItemConfig(var13, (byte) 88).aBoolean779
                || MapScene.aBoolean66)) {
                for (var14 = 0; ~var12.anIntArray254.length < ~var14; ++var14) {
                  if (~var12.anIntArray254[var14] == ~(1 + var13)) {
                    var9 = 999999999;
                    break;
                  }
                }
              }
            }

            if (-12 == ~var8) {
              var9 = BZipDecompressorState.anInt136;
            }

            if (12 == var8) {
              var9 = Mouse.anInt1925;
            }

            if (-14 == ~var8) {
              var11 = DummyClass5.anIntArray2985[var4[var6++]];
              int var17 = var4[var6++];
              var9 = ~(1 << var17 & var11) == -1 ? 0 : 1;
            }

            if (-15 == ~var8) {
              var11 = var4[var6++];
              var9 = NpcConfiguration.method1484(64835055, var11);
            }

            if (~var8 == -19) {
              var9 = (TextureCache.localPlayer.anInt2819 >> 7) - -WorldMapLabel.anInt1716;
            }

            if (-20 == ~var8) {
              var9 = (TextureCache.localPlayer.anInt2829 >> 7) - -ProceduralTexture.anInt1152;
            }

            if (var8 == 20) {
              var9 = var4[var6++];
            }

            if (0 == var10) {
              if (0 == var7) {
                var5 += var9;
              }

              if (-2 == ~var7) {
                var5 -= var9;
              }

              if (2 == var7 && ~var9 != -1) {
                var5 /= var9;
              }

              if (var7 == 3) {
                var5 *= var9;
              }

              var7 = 0;
            } else {
              var7 = var10;
            }
          }
        } catch (Exception var15) {
          return -1;
        }
      } else {
        return -2;
      }
    } catch (RuntimeException var16) {
      throw AbstractGameWorld.cascadeException(var16,
        "we.D(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
    }
  }

  static final boolean method2248(int var0, int var1) {
    try {
      if (var0 != -157) {
        aClass33_3019 = null;
      }

      return 32 <= var1 && -127 <= ~var1 ?
        true :
        (~var1 <= -161 && 255 >= var1 ?
          true :
          ~var1 == -129 || -141 == ~var1 || ~var1 == -152 || ~var1 == -157 || var1 == 159);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "we.B(" + var0 + ',' + var1 + ')');
    }
  }

  static final void method2249(byte var0, int var1) {
    try {
      Node var2 = DummyClass23.aClass130_1659.getFirst(var0 + -6);
      if (var0 != 83) {
        aClass33_3019 = null;
      }

      for (; var2 != null; var2 = DummyClass23.aClass130_1659.getNext(-97)) {
        if (~(65535L & var2.key >> 48) == ~((long) var1)) {
          var2.unlinkNode();
        }
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "we.F(" + var0 + ',' + var1 + ')');
    }
  }

}
