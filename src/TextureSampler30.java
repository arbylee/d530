import java.awt.Frame;

final class TextureSampler30 extends AbstractTextureSampler {

  private static GameString aClass94_3120 = SpawnedGameObject.createString("M");
  static volatile boolean aBoolean3116 = true;
  static boolean[][] aBooleanArrayArray3118 = new boolean[][] {
    new boolean[0], {true, false, true}, {true, false, false, true}, {false, false, true, true},
    {true, true, false}, {false, true, true}, {true, false, false, true},
    {false, false, false, true, true}, {false, true, true}, {true, false, true, true, true},
    {false, true, true, true, true}, {false, true, true, true, true, false}
  };
  static GameString aClass94_3119 = SpawnedGameObject.createString("vert:");
  static Frame fullScreenFrame;
  static int anInt3122;
  static GameString COMMAND_NOCLIP = SpawnedGameObject.createString("::noclip");
  static SignLink signLink;
  static GameString aClass94_3124 = aClass94_3120;
  static GameString aClass94_3117 = aClass94_3120;
  private int anInt3126 = 2048;
  private int anInt3127 = 3072;
  private int anInt3128 = 1024;

  public TextureSampler30() {
    super(1, false);
  }

  final int[] method154(int var1, byte var2) {
    try {
      int var3 = 71 / ((var2 - 30) / 36);
      int[] var7 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        int[] var4 = this.method152(0, var1, 32755);

        for (int var5 = 0; var5 < SomethingLight0.anInt1559; ++var5) {
          var7[var5] = this.anInt3128 - -(var4[var5] * this.anInt3126 >> 12);
        }
      }

      return var7;
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6, "fh.D(" + var1 + ',' + var2 + ')');
    }
  }

  final void parseConfig(int var1, Buffer var2, boolean var3) {
    try {
      if (var1 != 0) {
        if (var1 == 1) {
          this.anInt3127 = var2.readUnsignedShort();
        } else if (-3 == ~var1) {
          this.monoChromatic = var2.readUnsignedByte() == 1;
        }
      } else {
        this.anInt3128 = var2.readUnsignedShort();
      }

      if (!var3) {
        this.parseConfig(56, null, true);
      }

    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "fh.A(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
    }
  }

  final void method158(int var1) {
    try {
      if (var1 == 16251) {
        this.anInt3126 = this.anInt3127 - this.anInt3128;
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "fh.P(" + var1 + ')');
    }
  }

  final int[][] method166(int var1, int var2) {
    try {
      int[][] var3 = this.triChromaticImageCache.method1594((byte) -118, var2);
      if (this.triChromaticImageCache.aBoolean1379) {
        int[][] var4 = this.method162(var2, 0, (byte) -50);
        int[] var6 = var4[1];
        int[] var7 = var4[2];
        int[] var5 = var4[0];
        int[] var8 = var3[0];
        int[] var9 = var3[1];
        int[] var10 = var3[2];

        for (int var11 = 0; ~var11 > ~SomethingLight0.anInt1559; ++var11) {
          var8[var11] = this.anInt3128 - -(this.anInt3126 * var5[var11] >> 12);
          var9[var11] = (this.anInt3126 * var6[var11] >> 12) + this.anInt3128;
          var10[var11] = this.anInt3128 + (this.anInt3126 * var7[var11] >> 12);
        }
      }

      if (var1 != -1) {
        method211(51);
      }

      return var3;
    } catch (RuntimeException var12) {
      throw AbstractGameWorld.cascadeException(var12, "fh.T(" + var1 + ',' + var2 + ')');
    }
  }

  static final int method210(int var0, int var1, int var2, int var3) {
    try {
      if (~var2 == ~var3) {
        return var2;
      } else {
        int var4 = -var1 + 128;
        if (var0 != 18348) {
          method213(82, -103, 50, -59, null, 126L, null, null);
        }

        int var5 =
          var1 * ((-16711936 & var3) >>> 7) + var4 * ((-16711936 & var2) >>> 7) & -16711936;
        int var6 = var4 * (16711935 & var2) - -((var3 & 16711935) * var1) & -16711936;
        return var5 - -(var6 >> 7);
      }
    } catch (RuntimeException var7) {
      throw AbstractGameWorld.cascadeException(var7,
        "fh.O(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  public static void method211(int var0) {
    try {
      aClass94_3124 = null;
      aClass94_3117 = null;
      if (var0 != 1024) {
        signLink = null;
      }

      aClass94_3120 = null;
      COMMAND_NOCLIP = null;
      fullScreenFrame = null;
      aBooleanArrayArray3118 = null;
      aClass94_3119 = null;
      signLink = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "fh.C(" + var0 + ')');
    }
  }

  static final void method212(long var0, int var2) {
    try {
      if (0L != var0) {
        for (int var3 = var2; ~var3 > ~AnimationSomething.anInt3591; ++var3) {
          if (MonoChromaticImageCache.aLongArray1574[var3] == var0) {
            ++DummyClass20.anInt1781;
            --AnimationSomething.anInt3591;

            for (int var4 = var3; ~AnimationSomething.anInt3591 < ~var4; ++var4) {
              MonoChromaticImageCache.aLongArray1574[var4] =
                MonoChromaticImageCache.aLongArray1574[var4 + 1];
              TextureSampler7.aClass94Array3341[var4] = TextureSampler7.aClass94Array3341[1 + var4];
            }

            DummyClass31.anInt1472 = TextureSampler23.anInt3213;
            TextureSampler12.secureBuffer.writePacket(213);
            TextureSampler12.secureBuffer.writeLong(var0);
            break;
          }
        }

      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5, "fh.E(" + var0 + ',' + var2 + ')');
    }
  }

  static final void method213(int var0, int var1, int var2, int var3, SceneNode var4, long var5,
                              SceneNode var7, SceneNode var8) {
    SomethingScene var9 = new SomethingScene();
    var9.aClass140_1073 = var4;
    var9.anInt1078 = var1 * 128 + 64;
    var9.anInt1075 = var2 * 128 + 64;
    var9.anInt1068 = var3;
    var9.aLong1079 = var5;
    var9.aClass140_1067 = var7;
    var9.aClass140_1069 = var8;
    int var10 = 0;
    SceneGraphTile var11 = SomethingTexture1.sceneGraphTiles[var0][var1][var2];
    if (var11 != null) {
      for (int var12 = 0; var12 < var11.anInt2223; ++var12) {
        SceneSomething var13 = var11.sceneGraphNodes[var12];
        if ((var13.aLong498 & 4194304L) == 4194304L) {
          int var14 = var13.sceneNode.getMinimumY();
          if (var14 != -32768 && var14 < var10) {
            var10 = var14;
          }
        }
      }
    }

    var9.anInt1077 = -var10;
    if (SomethingTexture1.sceneGraphTiles[var0][var1][var2] == null) {
      SomethingTexture1.sceneGraphTiles[var0][var1][var2] = new SceneGraphTile(var0, var1, var2);
    }

    SomethingTexture1.sceneGraphTiles[var0][var1][var2].aClass72_2245 = var9;
  }

  static final void method214(SceneNode var0, int var1, int var2, int var3, int var4, int var5) {
    boolean var6 = true;
    int var7 = var2;
    int var8 = var2 + var4;
    int var9 = var3 - 1;
    int var10 = var3 + var5;

    for (int var11 = var1; var11 <= var1 + 1; ++var11) {
      if (var11 != AnimationFrame.anInt2456) {
        for (int var12 = var7; var12 <= var8; ++var12) {
          if (var12 >= 0 && var12 < SocketStream.sceneWidth) {
            for (int var13 = var9; var13 <= var10; ++var13) {
              if (var13 >= 0 && var13 < TextureSampler17.sceneHeight && (!var6 || var12 >= var8
                || var13 >= var10 || var13 < var3 && var12 != var2)) {
                SceneGraphTile var14 = SomethingTexture1.sceneGraphTiles[var11][var12][var13];
                if (var14 != null) {
                  int var15 = (AbstractGameWorld.heightMap[var11][var12][var13]
                    + AbstractGameWorld.heightMap[var11][var12 + 1][var13]
                    + AbstractGameWorld.heightMap[var11][var12][var13 + 1]
                    + AbstractGameWorld.heightMap[var11][var12 + 1][var13 + 1]) / 4 -
                    (AbstractGameWorld.heightMap[var1][var2][var3]
                      + AbstractGameWorld.heightMap[var1][var2 + 1][var3]
                      + AbstractGameWorld.heightMap[var1][var2][var3 + 1]
                      + AbstractGameWorld.heightMap[var1][var2 + 1][var3 + 1]) / 4;
                  SceneSomething2 var16 = var14.aClass70_2234;
                  if (var16 != null) {
                    if (var16.sceneNode0.method1865()) {
                      var0.method1866(var16.sceneNode0, (var12 - var2) * 128 + (1 - var4) * 64,
                        var15, (var13 - var3) * 128 + (1 - var5) * 64, var6);
                    }

                    if (var16.sceneNode1 != null && var16.sceneNode1.method1865()) {
                      var0.method1866(var16.sceneNode1, (var12 - var2) * 128 + (1 - var4) * 64,
                        var15, (var13 - var3) * 128 + (1 - var5) * 64, var6);
                    }
                  }

                  for (int var17 = 0; var17 < var14.anInt2223; ++var17) {
                    SceneSomething var18 = var14.sceneGraphNodes[var17];
                    if (var18 != null && var18.sceneNode.method1865() && (var12 == var18.anInt483
                      || var12 == var7) && (var13 == var18.anInt478 || var13 == var9)) {
                      int var19 = var18.anInt495 - var18.anInt483 + 1;
                      int var20 = var18.anInt481 - var18.anInt478 + 1;
                      var0.method1866(var18.sceneNode,
                        (var18.anInt483 - var2) * 128 + (var19 - var4) * 64, var15,
                        (var18.anInt478 - var3) * 128 + (var20 - var5) * 64, var6);
                    }
                  }
                }
              }
            }
          }
        }

        --var7;
        var6 = false;
      }
    }

  }

  static final void method215(byte var0, SoftwareIndexedColorSprite var1) {
    try {
      short var2 = 256;
      int var3 = 0;
      if (var0 >= -80) {
        aBoolean3116 = true;
      }

      while (DummyClass12.anIntArray2026.length > var3) {
        DummyClass12.anIntArray2026[var3] = 0;
        ++var3;
      }

      int var4;
      for (var3 = 0; -5001 < ~var3; ++var3) {
        var4 = (int) ((double) var2 * Math.random() * 128.0D);
        DummyClass12.anIntArray2026[var4] = (int) (Math.random() * 284.0D);
      }

      int var5;
      int var6;
      for (var3 = 0; -21 < ~var3; ++var3) {
        for (var4 = 1; ~(-1 + var2) < ~var4; ++var4) {
          for (var5 = 1; var5 < 127; ++var5) {
            var6 = var5 - -(var4 << 7);
            DummyOutputStream.anIntArray49[var6] =
              (DummyClass12.anIntArray2026[128 + var6] + DummyClass12.anIntArray2026[-1 + var6]
                + DummyClass12.anIntArray2026[1 + var6] - -DummyClass12.anIntArray2026[-128 + var6])
                / 4;
          }
        }

        int[] var10 = DummyClass12.anIntArray2026;
        DummyClass12.anIntArray2026 = DummyOutputStream.anIntArray49;
        DummyOutputStream.anIntArray49 = var10;
      }

      if (var1 != null) {
        var3 = 0;

        for (var4 = 0; var1.height > var4; ++var4) {
          for (var5 = 0; var1.width > var5; ++var5) {
            if (var1.aByteArray2674[var3++] != 0) {
              var6 = var1.offsetX + var5 + 16;
              int var7 = var1.offsetY + (var4 - -16);
              int var8 = var6 - -(var7 << 7);
              DummyClass12.anIntArray2026[var8] = 0;
            }
          }
        }
      }

    } catch (RuntimeException var9) {
      throw AbstractGameWorld.cascadeException(var9,
        "fh.F(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  static final void method216(Buffer var0, int var1) {
    try {
      for (int var2 = 0; ~LightIntensity.anInt906 < ~var2; ++var2) {
        int var3 = var0.readUnsignedSmart(true);
        int var4 = var0.readUnsignedShort();
        if (~var4 == -65536) {
          var4 = -1;
        }

        if (null != DummyClass26.aClass44_Sub1Array1609[var3]) {
          DummyClass26.aClass44_Sub1Array1609[var3].anInt722 = var4;
        }
      }

      if (var1 != -14991) {
        COMMAND_NOCLIP = null;
      }

    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "fh.Q(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

}
