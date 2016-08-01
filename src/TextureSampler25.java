final class TextureSampler25 extends AbstractTextureSampler {

  static int anInt3402;
  static Cache aClass47_3407 = new Cache(64);
  static GameString aClass94_3408 = SpawnedGameObject.createString("Untersuchen");
  static GameString aClass94_3409 = SpawnedGameObject.createString("Musik)2Engine vorbereitet)3");
  static long aLong3411 = 0L;
  static ObjectCache aClass93_3412 = new ObjectCache(64);
  static int anInt3413 = 0;
  static int anInt3414;
  static int amountContextActions = 0;
  static boolean aBoolean3416 = false;
  static int yawSine;
  private int[] anIntArray3403 = new int[3];
  private int anInt3404 = 409;
  private int anInt3405 = 4096;
  private int anInt3406 = 4096;
  private int anInt3410 = 4096;


  public TextureSampler25() {
    super(1, false);
  }

  static final void method328(int var0, Buffer var1) {
    try {
      if (var0 != -21774) {
        method330(-115, 107, 60, 70, -41, 115);
      }

      while (var1.position < var1.bytes.length) {
        int var4 = 0;
        boolean var3 = false;
        int var5 = 0;
        if (var1.readUnsignedByte() == 1) {
          var3 = true;
          var4 = var1.readUnsignedByte();
          var5 = var1.readUnsignedByte();
        }

        int var6 = var1.readUnsignedByte();
        int var7 = var1.readUnsignedByte();
        int var8 = -TextureSampler37.anInt3256 + var6 * 64;
        int var9 = DummyClass58.anInt1460 + -1 - -MapScene.anInt65 - 64 * var7;
        byte var2;
        int var10;
        if (-1 >= ~var8 && ~(-63 + var9) <= -1 && DummyClass30.anInt455 > var8 + 63
          && ~var9 > ~DummyClass58.anInt1460) {
          var10 = var8 >> 6;
          int var11 = var9 >> 6;

          for (int var12 = 0; 64 > var12; ++var12) {
            for (int var13 = 0; ~var13 > -65; ++var13) {
              if (!var3 || ~(var4 * 8) >= ~var12 && 8 + 8 * var4 > var12 && var13 >= var5 * 8
                && 8 + var5 * 8 > var13) {
                var2 = var1.readByte();
                if (var2 != 0) {
                  if (null == TextureSampler29.aByteArrayArrayArray3390[var10][var11]) {
                    TextureSampler29.aByteArrayArrayArray3390[var10][var11] = new byte[4096];
                  }

                  TextureSampler29.aByteArrayArrayArray3390[var10][var11][(63 + -var13 << 6)
                    + var12] = var2;
                  byte var14 = var1.readByte();
                  if (null == ClientScriptCall.aByteArrayArrayArray2452[var10][var11]) {
                    ClientScriptCall.aByteArrayArrayArray2452[var10][var11] = new byte[4096];
                  }

                  ClientScriptCall.aByteArrayArrayArray2452[var10][var11][var12 + (-var13 + 63
                    << 6)] = var14;
                }
              }
            }
          }
        } else {
          for (var10 = 0; ~var10 > ~(!var3 ? 4096 : 64); ++var10) {
            var2 = var1.readByte();
            if (-1 != ~var2) {
              ++var1.position;
            }
          }
        }
      }

    } catch (RuntimeException var15) {
      throw AbstractGameWorld
        .cascadeException(var15, "sk.F(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  static final void method329(int var0, int var1, int var2, int var3, byte var4, int var5, int var6,
                              int var7) {
    try {
      int var8 = 0;
      int var11 = -var3 + var0;
      int var10 = 0;
      int var9 = var7;
      int var14 = var7 * var7;
      int var12 = -var3 + var7;
      int var13 = var0 * var0;
      int var17 = var14 << 1;
      int var16 = var12 * var12;
      int var15 = var11 * var11;
      int var18 = var13 << 1;
      int var19 = var16 << 1;
      int var20 = var15 << 1;
      int var22 = var12 << 1;
      int var21 = var7 << 1;
      int var23 = var17 + var13 * (1 + -var21);
      int var24 = var14 + -((var21 + -1) * var18);
      int var25 = var19 + var15 * (1 + -var22);
      int var26 = var16 - var20 * (var22 + -1);
      int var28 = var14 << 2;
      int var27 = var13 << 2;
      int var30 = var16 << 2;
      int var31 = var17 * 3;
      int var32 = (var21 + -3) * var18;
      int var34 = -113 % ((var4 - 56) / 41);
      int var29 = var15 << 2;
      int var33 = var19 * 3;
      int var35 = (-3 + var22) * var20;
      int var37 = (-1 + var7) * var27;
      int var38 = var30;
      int var36 = var28;
      int var39 = (-1 + var12) * var29;
      int var42;
      int var43;
      int var41;
      int var44;
      if (var5 >= DummyClass13.anInt2020 && LightIntensity.anInt902 >= var5) {
        int[] var40 = DummyClass35.anIntArrayArray663[var5];
        var41 = DummyClass59
          .method1040(GlTexture2d.anInt3765, var6 - var0, (byte) 0, DummyClass55.anInt1425);
        var42 = DummyClass59
          .method1040(GlTexture2d.anInt3765, var6 - -var0, (byte) 0, DummyClass55.anInt1425);
        var43 = DummyClass59
          .method1040(GlTexture2d.anInt3765, var6 + -var11, (byte) 0, DummyClass55.anInt1425);
        var44 = DummyClass59
          .method1040(GlTexture2d.anInt3765, var6 - -var11, (byte) 0, DummyClass55.anInt1425);
        TextureSampler18.method282(var40, var41, 127, var43, var2);
        TextureSampler18.method282(var40, var43, 105, var44, var1);
        TextureSampler18.method282(var40, var44, -67, var42, var2);
      }

      while (var9 > 0) {
        if (var23 < 0) {
          while (var23 < 0) {
            var23 += var31;
            var31 += var28;
            ++var8;
            var24 += var36;
            var36 += var28;
          }
        }

        boolean var49 = ~var9 >= ~var12;
        if (0 > var24) {
          var24 += var36;
          var23 += var31;
          ++var8;
          var36 += var28;
          var31 += var28;
        }

        if (var49) {
          if (-1 < ~var25) {
            while (var25 < 0) {
              ++var10;
              var26 += var38;
              var38 += var30;
              var25 += var33;
              var33 += var30;
            }
          }

          if (var26 < 0) {
            ++var10;
            var26 += var38;
            var25 += var33;
            var38 += var30;
            var33 += var30;
          }

          var25 += -var39;
          var39 -= var29;
          var26 += -var35;
          var35 -= var29;
        }

        var24 += -var32;
        var23 += -var37;
        var37 -= var27;
        var32 -= var27;
        --var9;
        var42 = var5 - -var9;
        var41 = -var9 + var5;
        if (DummyClass13.anInt2020 <= var42 && LightIntensity.anInt902 >= var41) {
          var43 = DummyClass59
            .method1040(GlTexture2d.anInt3765, var6 + var8, (byte) 0, DummyClass55.anInt1425);
          var44 = DummyClass59
            .method1040(GlTexture2d.anInt3765, -var8 + var6, (byte) 0, DummyClass55.anInt1425);
          if (var49) {
            int var45 = DummyClass59
              .method1040(GlTexture2d.anInt3765, var6 + var10, (byte) 0, DummyClass55.anInt1425);
            int var46 = DummyClass59
              .method1040(GlTexture2d.anInt3765, var6 - var10, (byte) 0, DummyClass55.anInt1425);
            int[] var47;
            if (DummyClass13.anInt2020 <= var41) {
              var47 = DummyClass35.anIntArrayArray663[var41];
              TextureSampler18.method282(var47, var44, 120, var46, var2);
              TextureSampler18.method282(var47, var46, -107, var45, var1);
              TextureSampler18.method282(var47, var45, -102, var43, var2);
            }

            if (~var42 >= ~LightIntensity.anInt902) {
              var47 = DummyClass35.anIntArrayArray663[var42];
              TextureSampler18.method282(var47, var44, 87, var46, var2);
              TextureSampler18.method282(var47, var46, -92, var45, var1);
              TextureSampler18.method282(var47, var45, 124, var43, var2);
            }
          } else {
            if (~DummyClass13.anInt2020 >= ~var41) {
              TextureSampler18
                .method282(DummyClass35.anIntArrayArray663[var41], var44, -122, var43, var2);
            }

            if (LightIntensity.anInt902 >= var42) {
              TextureSampler18
                .method282(DummyClass35.anIntArrayArray663[var42], var44, 89, var43, var2);
            }
          }
        }
      }

    } catch (RuntimeException var48) {
      throw AbstractGameWorld.cascadeException(var48,
        "sk.Q(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6
          + ',' + var7 + ')');
    }
  }

  static final void method330(int var0, int var1, int var2, int var3, int var4, int var5) {
    try {
      if (var1 > -83) {
        amountContextActions = 115;
      }

      int var6 = -var3 + var5;
      int var7 = var2 - var4;
      if (var6 == 0) {
        if (0 != var7) {
          ClassCheckRequest.method126(false, var2, var4, var0, var3);
        }

      } else if (-1 == ~var7) {
        SomethingTexture4.method1354(var3, var0, true, var5, var4);
      } else {
        int var12 = (var7 << 12) / var6;
        int var13 = -(var12 * var3 >> 12) + var4;
        int var8;
        int var10;
        if (~DummyClass55.anInt1425 < ~var3) {
          var8 = DummyClass55.anInt1425;
          var10 = (DummyClass55.anInt1425 * var12 >> 12) + var13;
        } else if (var3 > GlTexture2d.anInt3765) {
          var10 = (GlTexture2d.anInt3765 * var12 >> 12) + var13;
          var8 = GlTexture2d.anInt3765;
        } else {
          var8 = var3;
          var10 = var4;
        }

        int var9;
        int var11;
        if (~var5 <= ~DummyClass55.anInt1425) {
          if (GlTexture2d.anInt3765 < var5) {
            var9 = GlTexture2d.anInt3765;
            var11 = var13 - -(var12 * GlTexture2d.anInt3765 >> 12);
          } else {
            var11 = var2;
            var9 = var5;
          }
        } else {
          var9 = DummyClass55.anInt1425;
          var11 = var13 + (var12 * DummyClass55.anInt1425 >> 12);
        }

        if (~DummyClass13.anInt2020 >= ~var11) {
          if (~var11 < ~LightIntensity.anInt902) {
            var11 = LightIntensity.anInt902;
            var9 = (LightIntensity.anInt902 - var13 << 12) / var12;
          }
        } else {
          var9 = (DummyClass13.anInt2020 - var13 << 12) / var12;
          var11 = DummyClass13.anInt2020;
        }

        if (~var10 > ~DummyClass13.anInt2020) {
          var10 = DummyClass13.anInt2020;
          var8 = (DummyClass13.anInt2020 + -var13 << 12) / var12;
        } else if (LightIntensity.anInt902 < var10) {
          var10 = LightIntensity.anInt902;
          var8 = (-var13 + LightIntensity.anInt902 << 12) / var12;
        }

        SceneNode.method1869((byte) 6, var0, var11, var10, var9, var8);
      }
    } catch (RuntimeException var14) {
      throw AbstractGameWorld.cascadeException(var14,
        "sk.E(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
    }
  }

  static final void sleep(long var0) {
    try {
      if (0L < var0) {
        if (0L != var0 % 10L) {
          DummyHashTable.sleep(var0);
        } else {
          DummyHashTable.sleep(var0 + -1L);
          DummyHashTable.sleep(1L);
        }


      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "sk.O(" + var0 + ')');
    }
  }

  static final int method332(int var0, int var1) {
    try {
      if (var0 != 2) {
        anInt3414 = -40;
      }

      return (~var1 > -66 || var1 > 90) && (-193 < ~var1 || var1 > 222 || var1 == 215) ?
        (~var1 != -160 ? (var1 != 140 ? var1 : 156) : 255) :
        32 + var1;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "sk.C(" + var0 + ',' + var1 + ')');
    }
  }

  public static void method333(byte var0) {
    try {
      int var1 = 100 / ((76 - var0) / 44);
      aClass93_3412 = null;
      aClass94_3409 = null;
      aClass94_3408 = null;
      aClass47_3407 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "sk.B(" + var0 + ')');
    }
  }

  static final boolean isRunesSpritesLoaded(FileUnpacker var0) {
    try {
      return var0.isLoaded(NPC.runesFileId);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld
        .cascadeException(var3, "sk.R(" + (var0 != null ? "{...}" : "null") + ')');
    }
  }

  final void parseConfig(int var1, Buffer var2, boolean var3) {
    try {
      if (var3) {
        if (var1 == 0) {
          this.anInt3404 = var2.readUnsignedShort();
        } else if (1 != var1) {
          if (~var1 == -3) {
            this.anInt3406 = var2.readUnsignedShort();
          } else if (var1 != 3) {
            if (4 == var1) {
              int var4 = var2.readUnsignedMedium((byte) 107);
              this.anIntArray3403[2] = ClientScript.bitAnd(var4, 255) >> 12;
              this.anIntArray3403[1] = ClientScript.bitAnd(var4 >> 4, 4080);
              this.anIntArray3403[0] = ClientScript.bitAnd(16711680, var4) << 4;
            }
          } else {
            this.anInt3410 = var2.readUnsignedShort();
          }
        } else {
          this.anInt3405 = var2.readUnsignedShort();
        }

      }
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "sk.A(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
    }
  }

  final int[][] method166(int var1, int var2) {
    try {
      if (var1 != -1) {
        this.method166(51, 104);
      }

      int[][] var3 = this.triChromaticImageCache.method1594((byte) 91, var2);
      if (this.triChromaticImageCache.aBoolean1379) {
        int[][] var4 = this.method162(var2, 0, (byte) -96);
        int[] var5 = var4[0];
        int[] var6 = var4[1];
        int[] var7 = var4[2];
        int[] var8 = var3[0];
        int[] var9 = var3[1];
        int[] var10 = var3[2];

        for (int var11 = 0; var11 < SomethingLight0.anInt1559; ++var11) {
          int var13 = var5[var11];
          int var12 = -this.anIntArray3403[0] + var13;
          if (~var12 > -1) {
            var12 = -var12;
          }

          if (this.anInt3404 < var12) {
            var8[var11] = var13;
            var9[var11] = var6[var11];
            var10[var11] = var7[var11];
          } else {
            int var14 = var6[var11];
            var12 = var14 + -this.anIntArray3403[1];
            if (-1 < ~var12) {
              var12 = -var12;
            }

            if (var12 > this.anInt3404) {
              var8[var11] = var13;
              var9[var11] = var14;
              var10[var11] = var7[var11];
            } else {
              int var15 = var7[var11];
              var12 = -this.anIntArray3403[2] + var15;
              if (var12 < 0) {
                var12 = -var12;
              }

              if (~var12 >= ~this.anInt3404) {
                var8[var11] = this.anInt3410 * var13 >> 12;
                var9[var11] = this.anInt3406 * var14 >> 12;
                var10[var11] = this.anInt3405 * var15 >> 12;
              } else {
                var8[var11] = var13;
                var9[var11] = var14;
                var10[var11] = var15;
              }
            }
          }
        }
      }

      return var3;
    } catch (RuntimeException var16) {
      throw AbstractGameWorld.cascadeException(var16, "sk.T(" + var1 + ',' + var2 + ')');
    }
  }

}
