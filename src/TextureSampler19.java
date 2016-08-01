final class TextureSampler19 extends AbstractTextureSampler {

  static FileUnpacker spotAnimations;
  static int[][] anIntArrayArray3215 = new int[][] {
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
    {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1},
    {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
    {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1},
    {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
    {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1},
    {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0},
    {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1},
    {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}
  };
  static int anInt3216 = 0;
  static int[] anIntArray3218 = new int[] {1, 4};
  private int anInt3217 = '\u8000';


  public TextureSampler19() {
    super(3, false);
  }

  static final void method254(boolean var0, SomethingPacket151 var1, boolean var2) {
    try {
      int var4 = (int) var1.key;
      if (var2) {
        method258(25);
      }

      int var3 = var1.anInt2602;
      var1.unlinkNode();
      if (var0) {
        DummyClass44.method1208((byte) 79, var3);
      }

      Something3d2.method2249((byte) 83, var3);
      Widget var5 = EnumStringFetcher.getWidget((byte) 109, var4);
      if (null != var5) {
        DummyClass29.method909(107, var5);
      }

      int var6 = TextureSampler25.amountContextActions;

      int var7;
      for (var7 = 0; var6 > var7; ++var7) {
        if (MapScene.method73(TextureSampler27.aShortArray3095[var7], 121)) {
          Inventory.method509(1, var7);
        }
      }

      if (-2 != ~TextureSampler25.amountContextActions) {
        AbstractSomethingTexture
          .method1340(AbstractIndexedColorSprite.anInt1462, SomethingWorldMapy.anInt3552, (byte) -40,
            TextureSampler29.anInt3395, SomethingQuickChat2.anInt3537);
        var7 = FloorOverlay.aClass3_Sub28_Sub17_2096.method682(SomethingTexture4.aClass94_2667);

        for (int var8 = 0; ~var8 > ~TextureSampler25.amountContextActions; ++var8) {
          int var9 = FloorOverlay.aClass3_Sub28_Sub17_2096.method682(Buffer.method802(var8, true));
          if (var7 < var9) {
            var7 = var9;
          }
        }

        SomethingQuickChat2.anInt3537 =
          TextureSampler25.amountContextActions * 15 + (FileUnpacker.aBoolean1951 ? 26 : 22);
        SomethingWorldMapy.anInt3552 = var7 + 8;
      } else {
        DummyClass36.aBoolean2615 = false;
        AbstractSomethingTexture
          .method1340(AbstractIndexedColorSprite.anInt1462, SomethingWorldMapy.anInt3552, (byte) -40,
            TextureSampler29.anInt3395, SomethingQuickChat2.anInt3537);
      }

      if (-1 != InventoryConfig.anInt3655) {
        ClassCheckRequest.method124(115, 1, InventoryConfig.anInt3655);
      }

    } catch (RuntimeException var10) {
      throw AbstractGameWorld.cascadeException(var10,
        "ke.O(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
    }
  }

  static final void method255(int var0, int var1, int var2) {
    try {
      WidgetUpdate var3 = AudioStreamEncoder3.method466(4, var2, var0);
      var3.g((byte) 33);
      var3.anInt3598 = var1;
    } catch (RuntimeException var4) {
      throw AbstractGameWorld
        .cascadeException(var4, "ke.Q(" + var0 + ',' + var1 + ',' + var2 + ')');
    }
  }

  static final void method256(int var0, int var1, int var2, byte var3, int var4) {
    try {
      WidgetUpdate var5 = AudioStreamEncoder3.method466(4, 4, var2);
      var5.g((byte) 33);
      var5.anInt3597 = var4;
      var5.anInt3596 = var0;
      if (var3 >= -108) {
        method258(-75);
      }

      var5.anInt3598 = var1;
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "ke.E(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
    }
  }

  static final void method257(byte var0) {
    try {
      int var1 = 0;
      if (var0 <= 122) {
        method259(null, 69, 54, -87, 72, -85, 88, 37, true);
      }

      for (int var2 = 0; -105 < ~var2; ++var2) {
        for (int var3 = 0; ~var3 > -105; ++var3) {
          if (GroundItem
            .method2031((byte) -106, true, var2, var3, SomethingTexture1.sceneGraphTiles, var1)) {
            ++var1;
          }

          if (var1 >= 512) {
            return;
          }
        }
      }

    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "ke.C(" + var0 + ')');
    }
  }

  public static void method258(int var0) {
    try {
      anIntArray3218 = null;
      anIntArrayArray3215 = null;
      int var1 = -20 % ((-31 - var0) / 39);
      spotAnimations = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ke.B(" + var0 + ')');
    }
  }

  static final void method259(SomethingTilek var0, int var1, int var2, int var3, int var4, int var5,
                              int var6, int var7, boolean var8) {
    int var9;
    int var10 = var9 = (var6 << 7) - MilliFrameRegulator.cameraPosX;
    int var11;
    int var12 = var11 = (var7 << 7) - TextureSampler13.cameraZ;
    int var13;
    int var14 = var13 = var10 + 128;
    int var15;
    int var16 = var15 = var12 + 128;
    int var17 = AbstractGameWorld.heightMap[var1][var6][var7] - ClientScriptEnum.cameraY;
    int var18 = AbstractGameWorld.heightMap[var1][var6 + 1][var7] - ClientScriptEnum.cameraY;
    int var19 = AbstractGameWorld.heightMap[var1][var6 + 1][var7 + 1] - ClientScriptEnum.cameraY;
    int var20 = AbstractGameWorld.heightMap[var1][var6][var7 + 1] - ClientScriptEnum.cameraY;
    int var21 = var12 * var4 + var10 * var5 >> 16;
    var12 = var12 * var5 - var10 * var4 >> 16;
    var10 = var21;
    var21 = var17 * var3 - var12 * var2 >> 16;
    var12 = var17 * var2 + var12 * var3 >> 16;
    var17 = var21;
    if (var12 >= 50) {
      var21 = var11 * var4 + var14 * var5 >> 16;
      var11 = var11 * var5 - var14 * var4 >> 16;
      var14 = var21;
      var21 = var18 * var3 - var11 * var2 >> 16;
      var11 = var18 * var2 + var11 * var3 >> 16;
      var18 = var21;
      if (var11 >= 50) {
        var21 = var16 * var4 + var13 * var5 >> 16;
        var16 = var16 * var5 - var13 * var4 >> 16;
        var13 = var21;
        var21 = var19 * var3 - var16 * var2 >> 16;
        var16 = var19 * var2 + var16 * var3 >> 16;
        var19 = var21;
        if (var16 >= 50) {
          var21 = var15 * var4 + var9 * var5 >> 16;
          var15 = var15 * var5 - var9 * var4 >> 16;
          var9 = var21;
          var21 = var20 * var3 - var15 * var2 >> 16;
          var15 = var20 * var2 + var15 * var3 >> 16;
          if (var15 >= 50) {
            int var22 = DummyClass40.anInt846 + (var10 << 9) / var12;
            int var23 = DummyClass40.anInt835 + (var17 << 9) / var12;
            int var24 = DummyClass40.anInt846 + (var14 << 9) / var11;
            int var25 = DummyClass40.anInt835 + (var18 << 9) / var11;
            int var26 = DummyClass40.anInt846 + (var13 << 9) / var16;
            int var27 = DummyClass40.anInt835 + (var19 << 9) / var16;
            int var28 = DummyClass40.anInt846 + (var9 << 9) / var15;
            int var29 = DummyClass40.anInt835 + (var21 << 9) / var15;
            DummyClass40.anInt850 = 0;
            int var30;
            if ((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) {
              if (TextureSampler37.aBoolean3261 && TextureSampler34
                .method185(GZipDecompressor.anInt819 + DummyClass40.anInt846,
                  TextureSampler18.anInt4039 + DummyClass40.anInt835, var27, var29, var25, var26,
                  var28, var24)) {
                DummyClass32.anInt515 = var6;
                OndemandRequester.anInt999 = var7;
              }

              if (!GlRenderer.useOpenGlRenderer && !var8) {
                DummyClass40.aBoolean849 =
                  var26 < 0 || var28 < 0 || var24 < 0 || var26 > DummyClass40.anInt847
                    || var28 > DummyClass40.anInt847 || var24 > DummyClass40.anInt847;

                if (var0.anInt1670 == -1) {
                  if (var0.anInt1664 != 12345678) {
                    DummyClass40
                      .method1154(var27, var29, var25, var26, var28, var24, var0.anInt1664,
                        var0.anInt1663, var0.anInt1667);
                  }
                } else if (TextureSampler0.aBoolean3275) {
                  if (var0.aBoolean1674) {
                    DummyClass40
                      .method1135(var27, var29, var25, var26, var28, var24, var0.anInt1664,
                        var0.anInt1663, var0.anInt1667, var10, var14, var9, var17, var18, var21,
                        var12, var11, var15, var0.anInt1670);
                  } else {
                    DummyClass40
                      .method1135(var27, var29, var25, var26, var28, var24, var0.anInt1664,
                        var0.anInt1663, var0.anInt1667, var13, var9, var14, var19, var21, var18,
                        var16, var15, var11, var0.anInt1670);
                  }
                } else {
                  var30 = DummyClass40.textureCache.method15(var0.anInt1670, '\uffff');
                  DummyClass40.method1154(var27, var29, var25, var26, var28, var24,
                    DummyClass2.repackHSL(var30, var0.anInt1664),
                    DummyClass2.repackHSL(var30, var0.anInt1663),
                    DummyClass2.repackHSL(var30, var0.anInt1667));
                }
              }
            }

            if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) {
              if (TextureSampler37.aBoolean3261 && TextureSampler34
                .method185(GZipDecompressor.anInt819 + DummyClass40.anInt846,
                  TextureSampler18.anInt4039 + DummyClass40.anInt835, var23, var25, var29, var22,
                  var24, var28)) {
                DummyClass32.anInt515 = var6;
                OndemandRequester.anInt999 = var7;
              }

              if (!GlRenderer.useOpenGlRenderer && !var8) {
                DummyClass40.aBoolean849 =
                  var22 < 0 || var24 < 0 || var28 < 0 || var22 > DummyClass40.anInt847
                    || var24 > DummyClass40.anInt847 || var28 > DummyClass40.anInt847;

                if (var0.anInt1670 == -1) {
                  if (var0.anInt1675 != 12345678) {
                    DummyClass40
                      .method1154(var23, var25, var29, var22, var24, var28, var0.anInt1675,
                        var0.anInt1667, var0.anInt1663);
                  }
                } else if (TextureSampler0.aBoolean3275) {
                  DummyClass40.method1135(var23, var25, var29, var22, var24, var28, var0.anInt1675,
                    var0.anInt1667, var0.anInt1663, var10, var14, var9, var17, var18, var21, var12,
                    var11, var15, var0.anInt1670);
                } else {
                  var30 = DummyClass40.textureCache.method15(var0.anInt1670, '\uffff');
                  DummyClass40.method1154(var23, var25, var29, var22, var24, var28,
                    DummyClass2.repackHSL(var30, var0.anInt1675),
                    DummyClass2.repackHSL(var30, var0.anInt1667),
                    DummyClass2.repackHSL(var30, var0.anInt1663));
                }
              }
            }

          }
        }
      }
    }
  }

  final int[][] method166(int var1, int var2) {
    try {
      if (var1 != -1) {
        spotAnimations = null;
      }

      int[][] var3 = this.triChromaticImageCache.method1594((byte) 4, var2);
      if (this.triChromaticImageCache.aBoolean1379) {
        int[] var4 = this.method152(1, var2, 32755);
        int[] var5 = this.method152(2, var2, 32755);
        int[] var8 = var3[2];
        int[] var7 = var3[1];
        int[] var6 = var3[0];

        for (int var9 = 0; SomethingLight0.anInt1559 > var9; ++var9) {
          int var10 = (var4[var9] * 255 & 1046259) >> 12;
          int var11 = var5[var9] * this.anInt3217 >> 12;
          int var12 = var11 * SomethingTexture1.anIntArray2639[var10] >> 12;
          int var13 = TextureSampler23.anIntArray3212[var10] * var11 >> 12;
          int var14 = (var12 >> 12) + var9 & RenderAnimation.anInt396;
          int var15 = TriChromaticImageBuffer.anInt2487 & var2 - -(var13 >> 12);
          int[][] var16 = this.method162(var15, 0, (byte) -117);
          var6[var9] = var16[0][var14];
          var7[var9] = var16[1][var14];
          var8[var9] = var16[2][var14];
        }
      }

      return var3;
    } catch (RuntimeException var17) {
      throw AbstractGameWorld.cascadeException(var17, "ke.T(" + var1 + ',' + var2 + ')');
    }
  }

  final int[] method154(int var1, byte var2) {
    try {
      int var3 = -89 / ((30 - var2) / 36);
      int[] var4 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        int[] var5 = this.method152(1, var1, 32755);
        int[] var6 = this.method152(2, var1, 32755);

        for (int var7 = 0; var7 < SomethingLight0.anInt1559; ++var7) {
          int var9 = this.anInt3217 * var6[var7] >> 12;
          int var8 = (var5[var7] & 4087) >> 4;
          int var10 = SomethingTexture1.anIntArray2639[var8] * var9 >> 12;
          int var11 = TextureSampler23.anIntArray3212[var8] * var9 >> 12;
          int var12 = RenderAnimation.anInt396 & (var10 >> 12) + var7;
          int var13 = TriChromaticImageBuffer.anInt2487 & (var11 >> 12) + var1;
          int[] var14 = this.method152(0, var13, 32755);
          var4[var7] = var14[var12];
        }
      }

      return var4;
    } catch (RuntimeException var15) {
      throw AbstractGameWorld.cascadeException(var15, "ke.D(" + var1 + ',' + var2 + ')');
    }
  }

  final void parseConfig(int var1, Buffer var2, boolean var3) {
    try {
      if (~var1 != -1) {
        if (var1 == 1) {
          this.monoChromatic = ~var2.readUnsignedByte() == -2;
        }
      } else {
        this.anInt3217 = var2.readUnsignedShort() << 4;
      }

      if (!var3) {
        anInt3216 = -7;
      }

    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "ke.A(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
    }
  }

  final void method158(int var1) {
    try {
      if (var1 != 16251) {
        method255(33, 78, 124);
      }

      FileSystem.method844((byte) -9);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "ke.P(" + var1 + ')');
    }
  }

}
