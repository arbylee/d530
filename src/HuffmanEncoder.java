final class HuffmanEncoder {

  static int[] anIntArray634 = new int[256];
  static AbstractDirectColorSprite aClass3_Sub28_Sub16_637;
  static int anInt638;
  static int anInt639;
  static byte[][][] aByteArrayArrayArray640;
  static int anInt641;

  static {
    for (int var1 = 0; var1 < 256; ++var1) {
      int var0 = var1;

      for (int var2 = 0; ~var2 > -9; ++var2) {
        if (1 != (1 & var0)) {
          var0 >>>= 1;
        } else {
          var0 = var0 >>> 1 ^ -306674912;
        }
      }

      anIntArray634[var1] = var0;
    }

    anInt639 = 0;
    anInt638 = 0;
    anInt641 = 0;
  }

  private int[] anIntArray633;
  private byte[] codewords;
  private int[] lengths;

  HuffmanEncoder(byte[] var1) {
    try {
      int[] var3 = new int[33];
      int var2 = var1.length;
      this.anIntArray633 = new int[8];
      this.lengths = new int[var2];
      this.codewords = var1;
      int var4 = 0;

      for (int var5 = 0; ~var2 < ~var5; ++var5) {
        byte var6 = var1[var5];
        if (~var6 != -1) {
          int var7 = 1 << 32 + -var6;
          int var8 = var3[var6];
          this.lengths[var5] = var8;
          int var9;
          int var10;
          int var11;
          int var12;
          if (0 == (var8 & var7)) {
            for (var10 = -1 + var6; ~var10 <= -2; --var10) {
              var11 = var3[var10];
              if (~var8 != ~var11) {
                break;
              }

              var12 = 1 << -var10 + 32;
              if ((var11 & var12) != 0) {
                var3[var10] = var3[-1 + var10];
                break;
              }

              var3[var10] = TextureSampler3.method308(var12, var11);
            }

            var9 = var8 | var7;
          } else {
            var9 = var3[-1 + var6];
          }

          var3[var6] = var9;

          for (var10 = var6 + 1; var10 <= 32; ++var10) {
            if (~var8 == ~var3[var10]) {
              var3[var10] = var9;
            }
          }

          var10 = 0;

          for (var11 = 0; var11 < var6; ++var11) {
            var12 = Integer.MIN_VALUE >>> var11;
            if (0 == (var8 & var12)) {
              ++var10;
            } else {
              if (0 == this.anIntArray633[var10]) {
                this.anIntArray633[var10] = var4;
              }

              var10 = this.anIntArray633[var10];
            }

            if (this.anIntArray633.length <= var10) {
              int[] var13 = new int[this.anIntArray633.length * 2];

              for (int var14 = 0; ~var14 > ~this.anIntArray633.length; ++var14) {
                var13[var14] = this.anIntArray633[var14];
              }

              this.anIntArray633 = var13;
            }

            var12 >>>= 1;
          }

          this.anIntArray633[var10] = ~var5;
          if (~var10 <= ~var4) {
            var4 = var10 - -1;
          }
        }
      }

    } catch (RuntimeException var15) {
      throw AbstractGameWorld
        .cascadeException(var15, "fi.<init>(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  static final AbstractFrameRegulator method1012(byte var0) {
    try {
      try {
        if (var0 != -31) {
          aClass3_Sub28_Sub16_637 = null;
        }

        return (AbstractFrameRegulator) Class.forName("NanoFrameRegulator").newInstance();
      } catch (Throwable var2) {
        return new MilliFrameRegulator();
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "fi.F(" + var0 + ')');
    }
  }

  static final GameString method1013(byte var0, int var1) {
    try {
      GameString var2 = SomethingScene.toString(var1);
      if (var0 >= -87) {
        return null;
      } else {
        for (int var3 = var2.getLength() + -3; var3 > 0; var3 -= 3) {
          var2 = RenderAnimation.concat(new GameString[] {
            var2.substring(var3, 0, 0), TextureSampler0.aClass94_3268, var2.substring(var3)
          });
        }

        return var2.getLength() > 9 ? RenderAnimation.concat(new GameString[] {
          Keyboard.aClass94_1917, var2.substring(-8 + var2.getLength(), 0, 0),
          TextureSampler30.aClass94_3124, SomethingScene.aClass94_1072, var2,
          OndemandRequester.aClass94_995
        }) : (6 < var2.getLength() ?
          RenderAnimation.concat(new GameString[] {
            TextureSampler23.aClass94_3211, var2.substring(-4 + var2.getLength(), 0, 0),
            AnimationSomething.aClass94_3586, SomethingScene.aClass94_1072, var2,
            OndemandRequester.aClass94_995
          }) :
          RenderAnimation
            .concat(new GameString[] {DummyClass10.aClass94_2082, var2, StringNode.aClass94_2584}));
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "fi.D(" + var0 + ',' + var1 + ')');
    }
  }

  static final void method1014(int var0, int var1, int var2) {
    try {
      int var3 = 120 / ((15 - var0) / 41);

      for (int var4 = 0; var4 < ScriptState.amountFloors; ++var4) {
        FloorOverlay var5 = TextureSampler10.method350((byte) 120, var4);
        if (null != var5) {
          int var6 = var5.anInt2095;
          if (0 <= var6 && !DummyClass40.textureCache.method17(var6, 126)) {
            var6 = -1;
          }

          int var7;
          int var8;
          int var9;
          int var10;
          if (-1 < ~var5.anInt2098) {
            if (var6 >= 0) {
              var7 = DummyClass40.hslTable[StringNode
                .method729((byte) -74, DummyClass40.textureCache.method15(var6, '\uffff'), 96)];
            } else if (-1 == var5.anInt2103) {
              var7 = -1;
            } else {
              var8 = var5.anInt2103;
              var9 = var1 + (var8 & 127);
              if (var9 < 0) {
                var9 = 0;
              } else if (var9 > 127) {
                var9 = 127;
              }

              var10 = var9 + (896 & var8) + ('\ufc00' & var8 + var2);
              var7 = DummyClass40.hslTable[StringNode.method729((byte) -127, var10, 96)];
            }
          } else {
            var8 = var5.anInt2098;
            var9 = (127 & var8) + var1;
            if (~var9 > -1) {
              var9 = 0;
            } else if (-128 > ~var9) {
              var9 = 127;
            }

            var10 = (896 & var8) + ('\ufc00' & var2 + var8) + var9;
            var7 = DummyClass40.hslTable[StringNode.method729((byte) -63, var10, 96)];
          }

          DummyClass51.anIntArray1161[1 + var4] = var7;
        }
      }

    } catch (RuntimeException var11) {
      throw AbstractGameWorld
        .cascadeException(var11, "fi.B(" + var0 + ',' + var1 + ',' + var2 + ')');
    }
  }

  public static void method1016(byte var0) {
    try {
      aByteArrayArrayArray640 = null;
      if (var0 <= 85) {
        anInt638 = 33;
      }

      anIntArray634 = null;
      aClass3_Sub28_Sub16_637 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "fi.C(" + var0 + ')');
    }
  }

  final int method1015(int var1, int var2, byte[] var3, byte[] var4, int var5, int var6) {
    try {
      var1 += var5;
      int var7 = 0;

      int var8;
      for (var8 = var6 << 3; var1 > var5; ++var5) {
        int var9 = var4[var5] & 255;
        int var10 = this.lengths[var9];
        byte var11 = this.codewords[var9];
        if (0 == var11) {
          throw new RuntimeException("No codeword for data value " + var9);
        }

        int var12 = var8 >> 3;
        int var13 = var8 & 7;
        var8 += var11;
        int var14 = var12 + (var13 + var11 - 1 >> 3);
        var7 &= -var13 >> 31;
        var13 += 24;
        var3[var12] = (byte) (var7 = TextureSampler3.method308(var7, var10 >>> var13));
        if (~var12 > ~var14) {
          ++var12;
          var13 -= 8;
          var3[var12] = (byte) (var7 = var10 >>> var13);
          if (var12 < var14) {
            var13 -= 8;
            ++var12;
            var3[var12] = (byte) (var7 = var10 >>> var13);
            if (~var14 < ~var12) {
              var13 -= 8;
              ++var12;
              var3[var12] = (byte) (var7 = var10 >>> var13);
              if (var14 > var12) {
                ++var12;
                var13 -= 8;
                var3[var12] = (byte) (var7 = var10 << -var13);
              }
            }
          }
        }
      }

      if (var2 >= -73) {
        this.anIntArray633 = null;
      }

      return -var6 + (var8 + 7 >> 3);
    } catch (RuntimeException var15) {
      throw AbstractGameWorld.cascadeException(var15,
        "fi.A(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + (
          var4 != null ? "{...}" : "null") + ',' + var5 + ',' + var6 + ')');
    }
  }

  final int decompress(byte[] src, int srcOff, byte[] dest, int destOff, int len) {
    try {
      if (~len == -1) {
        return 0;
      } else {
        int var7 = 0;
        len += destOff;
        int var8 = srcOff;

        while (true) {
          byte b = src[var8];
          if (b < 0) {
            var7 = this.anIntArray633[var7];
          } else {
            ++var7;
          }

          int var10;
          if ((var10 = this.anIntArray633[var7]) < 0) {
            dest[destOff++] = (byte) (~var10);
            if (destOff >= len) {
              break;
            }

            var7 = 0;
          }

          if (~(64 & b) != -1) {
            var7 = this.anIntArray633[var7];
          } else {
            ++var7;
          }

          if (-1 < ~(var10 = this.anIntArray633[var7])) {
            dest[destOff++] = (byte) (~var10);
            if (len <= destOff) {
              break;
            }

            var7 = 0;
          }

          if (~(32 & b) == -1) {
            ++var7;
          } else {
            var7 = this.anIntArray633[var7];
          }

          if ((var10 = this.anIntArray633[var7]) < 0) {
            dest[destOff++] = (byte) (~var10);
            if (~len >= ~destOff) {
              break;
            }

            var7 = 0;
          }

          if ((b & 16) != 0) {
            var7 = this.anIntArray633[var7];
          } else {
            ++var7;
          }

          if (-1 < ~(var10 = this.anIntArray633[var7])) {
            dest[destOff++] = (byte) (~var10);
            if (destOff >= len) {
              break;
            }

            var7 = 0;
          }

          if (~(b & 8) != -1) {
            var7 = this.anIntArray633[var7];
          } else {
            ++var7;
          }

          if ((var10 = this.anIntArray633[var7]) < 0) {
            dest[destOff++] = (byte) (~var10);
            if (len <= destOff) {
              break;
            }

            var7 = 0;
          }

          if (~(b & 4) != -1) {
            var7 = this.anIntArray633[var7];
          } else {
            ++var7;
          }

          if (~(var10 = this.anIntArray633[var7]) > -1) {
            dest[destOff++] = (byte) (~var10);
            if (~destOff <= ~len) {
              break;
            }

            var7 = 0;
          }

          if ((b & 2) == 0) {
            ++var7;
          } else {
            var7 = this.anIntArray633[var7];
          }

          if (-1 < ~(var10 = this.anIntArray633[var7])) {
            dest[destOff++] = (byte) (~var10);
            if (~destOff <= ~len) {
              break;
            }

            var7 = 0;
          }

          if ((1 & b) != 0) {
            var7 = this.anIntArray633[var7];
          } else {
            ++var7;
          }

          if (0 > (var10 = this.anIntArray633[var7])) {
            dest[destOff++] = (byte) (~var10);
            if (destOff >= len) {
              break;
            }

            var7 = 0;
          }

          ++var8;
        }

        return -srcOff + 1 + var8;
      }
    } catch (RuntimeException var11) {
      throw AbstractGameWorld.cascadeException(var11,
        "fi.E(" + destOff + ',' + len + ',' + (dest != null ? "{...}" : "null") + ',' + (
          src != null ?
            "{...}" :
            "null") + ',' + srcOff + ')');
    }
  }
}
