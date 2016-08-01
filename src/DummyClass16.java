import javax.media.opengl.GL;

final class DummyClass16 {

  private static int sceneHeightBlocks;
  private static int sceneWidthBlocks;
  static SoftwareIndexedColorSprite shadowsSprite;
  static BlockShadowMap[][] blockShadows;
  static SoftwareIndexedColorSprite[] floorShadows;

  private static final void method2034(SoftwareIndexedColorSprite var0,
                                       SoftwareIndexedColorSprite var1, int var2, int var3) {
    var2 += var0.offsetX;
    var3 += var0.offsetY;
    int var4 = var2 + var3 * var1.width;
    int var5 = 0;
    int var6 = var0.height;
    int var7 = var0.width;
    int var8 = var1.width - var7;
    int var9 = 0;
    int var10;
    if (var3 <= 0) {
      var10 = 1 - var3;
      var6 -= var10;
      var5 += var10 * var7;
      var4 += var10 * var1.width;
      var3 = 1;
    }

    if (var3 + var6 >= var1.height) {
      var10 = var3 + var6 + 1 - var1.height;
      var6 -= var10;
    }

    if (var2 <= 0) {
      var10 = 1 - var2;
      var7 -= var10;
      var5 += var10;
      var4 += var10;
      var9 += var10;
      var8 += var10;
      var2 = 1;
    }

    if (var2 + var7 >= var1.width) {
      var10 = var2 + var7 + 1 - var1.width;
      var7 -= var10;
      var9 += var10;
      var8 += var10;
    }

    if (var7 > 0 && var6 > 0) {
      method2044(var1.aByteArray2674, var0.aByteArray2674, var5, var4, var7, var6, var8, var9);
      method2036(var2, var3, var7, var6);
    }
  }

  private static final void method2035(byte[] var0, byte[] var1, int var2, int var3, int var4,
                                       int var5, int var6, int var7) {
    int var8 = -(var4 >> 2);
    var4 = -(var4 & 3);

    for (int var9 = -var5; var9 < 0; ++var9) {
      int var10;
      int var10001;
      for (var10 = var8; var10 < 0; ++var10) {
        var10001 = var3++;
        var0[var10001] -= var1[var2++];
        var10001 = var3++;
        var0[var10001] -= var1[var2++];
        var10001 = var3++;
        var0[var10001] -= var1[var2++];
        var10001 = var3++;
        var0[var10001] -= var1[var2++];
      }

      for (var10 = var4; var10 < 0; ++var10) {
        var10001 = var3++;
        var0[var10001] -= var1[var2++];
      }

      var3 += var6;
      var2 += var7;
    }

  }

  private static final void method2036(int var0, int var1, int var2, int var3) {
    int var4 = var0 - 1 >> 7;
    int var5 = var0 - 1 + var2 - 1 >> 7;
    int var6 = var1 - 1 >> 7;
    int var7 = var1 - 1 + var3 - 1 >> 7;

    for (int var8 = var4; var8 <= var5; ++var8) {
      for (int var9 = var6; var9 <= var7; ++var9) {
        blockShadows[var8][var9].needsUpdate = true;
      }
    }

  }

  static final void method2037(int var0, int var1, boolean var2, boolean var3, int var4, int var5,
                               int var6, int var7, int var8, int var9) {
    if (!var2 || !var3) {
      if (!var2 || var0 != 1) {
        if (!var3 || var0 != 0) {
          int var10 = var4 << 7;
          int var11 = var6 + var7 + var8 + var9 >> 2;
          int var12 = var5 << 7;
          int var13 = var10 - (var11 * GlEnvironment.anInt1314 >> 8) >> 3;
          int var14 = var12 - (var11 * GlEnvironment.anInt1315 >> 8) >> 3;
          if (var0 != 0 && var0 != 1 && (var2 || var3)) {
            method2050(floorShadows[var0], shadowsSprite, var13 + 1, var14 + 1, var1, var2);
          } else {
            method2034(floorShadows[1], shadowsSprite, var13 + 1, var14 + 1);
          }
        }
      }
    }
  }

  static final void drawShadows(int var0, int var1, int var2, int var3, boolean[][] var4,
                                int[][] var5) {
    GL gl = GlRenderer.gl;
    GlRenderer.method1856(1);
    GlRenderer.method1847(1);
    GlRenderer.loadIdentityTextureMatrix();
    GlRenderer.setLightingEnabled(false);
    SomethingQuickChat.method551(0, 0, 0);
    gl.glDepthMask(false);

    for (int blockX = 0; blockX < sceneWidthBlocks; ++blockX) {
      int blockY = 0;
      while (blockY < sceneHeightBlocks) {
        int var9 = blockX * 8;
        while (true) {
          if (var9 < blockX * 8 + 8) {
            label42:
            {
              if (var9 - var0 >= -var2 && var9 - var0 <= var2) {
                for (int var10 = blockY * 8; var10 < blockY * 8 + 8; ++var10) {
                  if (var10 - var1 >= -var2 && var10 - var1 <= var2 && var4[var9 - var0 + var2][
                    var10 - var1 + var2]) {
                    BlockShadowMap shadows = blockShadows[blockX][blockY];
                    if (shadows.needsUpdate) {
                      shadows.update(DummyClass16.shadowsSprite, blockX, blockY);
                      shadows.needsUpdate = false;
                    }
                    gl.glPushMatrix();
                    gl.glTranslatef((float) (blockX * 1024), 0.0F, (float) (blockY * 1024));
                    shadows.draw();
                    gl.glPopMatrix();
                    break label42;
                  }
                }
              }

              ++var9;
              continue;
            }
          }

          ++blockY;
          break;
        }
      }
    }

    gl.glEnableClientState('\u8076');
    gl.glDepthMask(true);
    GlRenderer.method1846();
  }

  private static final boolean method2039(byte[] var0, int var1, int var2, int var3, int var4,
                                          int var5) {
    int var6 = var2 % var5;
    int var7;
    if (var6 != 0) {
      var7 = var5 - var6;
    } else {
      var7 = 0;
    }

    int var8 = -((var3 + var5 - 1) / var5);
    int var9 = -((var2 + var5 - 1) / var5);

    for (int var10 = var8; var10 < 0; ++var10) {
      for (int var11 = var9; var11 < 0; ++var11) {
        if (var0[var1] == 0) {
          return true;
        }

        var1 += var5;
      }

      var1 -= var7;
      if (var0[var1 - 1] == 0) {
        return true;
      }

      var1 += var4;
    }

    return false;
  }

  private static final boolean method2040(SoftwareIndexedColorSprite var0,
                                          SoftwareIndexedColorSprite var1, int var2, int var3) {
    var2 += var0.offsetX;
    var3 += var0.offsetY;
    int var4 = var2 + var3 * var1.width;
    int var5 = var0.height;
    int var6 = var0.width;
    int var7 = var1.width - var6;
    int var8;
    if (var3 <= 0) {
      var8 = 1 - var3;
      var5 -= var8;
      var4 += var8 * var1.width;
      var3 = 1;
    }

    if (var3 + var5 >= var1.height) {
      var8 = var3 + var5 + 1 - var1.height;
      var5 -= var8;
    }

    if (var2 <= 0) {
      var8 = 1 - var2;
      var6 -= var8;
      var4 += var8;
      var7 += var8;
      var2 = 1;
    }

    if (var2 + var6 >= var1.width) {
      var8 = var2 + var6 + 1 - var1.width;
      var6 -= var8;
      var7 += var8;
    }

    if (var6 > 0 && var5 > 0) {
      byte var9 = 8;
      var7 += (var9 - 1) * var1.width;
      method2036(var2, var3, var6, var5);
      return method2039(var1.aByteArray2674, var4, var6, var5, var7, var9);
    } else {
      return false;
    }
  }

  static final void initializeShadows(int var0, int var1) {
    sceneWidthBlocks = var0 + 7 >> 3;
    sceneHeightBlocks = var1 + 7 >> 3;
    shadowsSprite =
      new SoftwareIndexedColorSprite(sceneWidthBlocks * 128 + 2, sceneHeightBlocks * 128 + 2, 0);
    blockShadows = new BlockShadowMap[sceneWidthBlocks][sceneHeightBlocks];

    for (int var2 = 0; var2 < sceneWidthBlocks; ++var2) {
      for (int var3 = 0; var3 < sceneHeightBlocks; ++var3) {
        blockShadows[var2][var3] = new BlockShadowMap();
      }
    }

  }

  private static final void method2042(SoftwareIndexedColorSprite var0,
                                       SoftwareIndexedColorSprite var1, int var2, int var3) {
    var2 += var0.offsetX;
    var3 += var0.offsetY;
    int var4 = var2 + var3 * var1.width;
    int var5 = 0;
    int var6 = var0.height;
    int var7 = var0.width;
    int var8 = var1.width - var7;
    int var9 = 0;
    int var10;
    if (var3 <= 0) {
      var10 = 1 - var3;
      var6 -= var10;
      var5 += var10 * var7;
      var4 += var10 * var1.width;
      var3 = 1;
    }

    if (var3 + var6 >= var1.height) {
      var10 = var3 + var6 + 1 - var1.height;
      var6 -= var10;
    }

    if (var2 <= 0) {
      var10 = 1 - var2;
      var7 -= var10;
      var5 += var10;
      var4 += var10;
      var9 += var10;
      var8 += var10;
      var2 = 1;
    }

    if (var2 + var7 >= var1.width) {
      var10 = var2 + var7 + 1 - var1.width;
      var7 -= var10;
      var9 += var10;
      var8 += var10;
    }

    if (var7 > 0 && var6 > 0) {
      method2035(var1.aByteArray2674, var0.aByteArray2674, var5, var4, var7, var6, var8, var9);
      method2036(var2, var3, var7, var6);
    }
  }

  static final void method2043() {
    shadowsSprite = null;
    floorShadows = null;
    blockShadows = null;
  }

  private static final void method2044(byte[] var0, byte[] var1, int var2, int var3, int var4,
                                       int var5, int var6, int var7) {
    int var8 = -(var4 >> 2);
    var4 = -(var4 & 3);

    for (int var9 = -var5; var9 < 0; ++var9) {
      int var10;
      int var10001;
      for (var10 = var8; var10 < 0; ++var10) {
        var10001 = var3++;
        var0[var10001] += var1[var2++];
        var10001 = var3++;
        var0[var10001] += var1[var2++];
        var10001 = var3++;
        var0[var10001] += var1[var2++];
        var10001 = var3++;
        var0[var10001] += var1[var2++];
      }

      for (var10 = var4; var10 < 0; ++var10) {
        var10001 = var3++;
        var0[var10001] += var1[var2++];
      }

      var3 += var6;
      var2 += var7;
    }

  }

  public static void method2045() {
    shadowsSprite = null;
    floorShadows = null;
    blockShadows = null;
  }

  private static final void method2046(byte[] var0, byte[] var1, int var2, int var3, int var4,
                                       int var5, int var6) {
    for (int var7 = -16; var7 < 0; ++var7) {
      for (int var8 = -4; var8 < 0; ++var8) {
        int var10001 = var3++;
        var0[var10001] = (byte) (var0[var10001] + (1 - var1[var2]));
        var2 += var5;
        var10001 = var3++;
        var0[var10001] = (byte) (var0[var10001] + (1 - var1[var2]));
        var2 += var5;
        var10001 = var3++;
        var0[var10001] = (byte) (var0[var10001] + (1 - var1[var2]));
        var2 += var5;
        var10001 = var3++;
        var0[var10001] = (byte) (var0[var10001] + (1 - var1[var2]));
        var2 += var5;
      }

      var3 += var4;
      var2 += var6;
    }

  }

  static final void method2047(SoftwareIndexedColorSprite var0, int var1, int var2, int var3) {
    if (var0 != null) {
      int var4 = var1 - (var2 * GlEnvironment.anInt1314 >> 8) >> 3;
      int var5 = var3 - (var2 * GlEnvironment.anInt1315 >> 8) >> 3;
      method2042(var0, shadowsSprite, var4 + 1, var5 + 1);
    }
  }

  private static final void method2048(byte[] var0, byte[] var1, int var2, int var3, int var4,
                                       int var5, int var6) {
    for (int var7 = -16; var7 < 0; ++var7) {
      for (int var8 = -4; var8 < 0; ++var8) {
        int var10001 = var3++;
        var0[var10001] += var1[var2];
        var2 += var5;
        var10001 = var3++;
        var0[var10001] += var1[var2];
        var2 += var5;
        var10001 = var3++;
        var0[var10001] += var1[var2];
        var2 += var5;
        var10001 = var3++;
        var0[var10001] += var1[var2];
        var2 += var5;
      }

      var3 += var4;
      var2 += var6;
    }

  }

  static final boolean method2049(SoftwareIndexedColorSprite var0, int var1, int var2, int var3) {
    if (var0 == null) {
      return false;
    } else {
      int var4 = var1 - (var2 * GlEnvironment.anInt1314 >> 8) >> 3;
      int var5 = var3 - (var2 * GlEnvironment.anInt1315 >> 8) >> 3;
      return method2040(var0, shadowsSprite, var4 + 1, var5 + 1);
    }
  }

  private static final void method2050(SoftwareIndexedColorSprite var0,
                                       SoftwareIndexedColorSprite var1, int var2, int var3,
                                       int var4, boolean var5) {
    if (var2 > 0 && var3 > 0 && var2 + 16 < var1.width && var3 + 16 < var1.height) {
      int var6 = var2 + var3 * var1.width;
      int var7 = var1.width - 16;
      short var8;
      byte var9;
      int var10;
      if (var4 == 0) {
        var8 = 240;
        var9 = 1;
        var10 = -var9 * 16 - 16;
      } else if (var4 == 1) {
        var8 = 255;
        var9 = -16;
        var10 = -var9 * 16 - 1;
      } else if (var4 == 2) {
        var8 = 15;
        var9 = -1;
        var10 = -var9 * 16 + 16;
      } else {
        var8 = 0;
        var9 = 16;
        var10 = -var9 * 16 + 1;
      }

      if (var5) {
        method2046(var1.aByteArray2674, var0.aByteArray2674, var8, var6, var7, var9, var10);
      } else {
        method2048(var1.aByteArray2674, var0.aByteArray2674, var8, var6, var7, var9, var10);
      }

      method2036(var2, var3, 16, 16);
    }
  }

  static final void method2051(SoftwareIndexedColorSprite var0, int var1, int var2, int var3) {
    if (var0 != null) {
      int var4 = var1 - (var2 * GlEnvironment.anInt1314 >> 8) >> 3;
      int var5 = var3 - (var2 * GlEnvironment.anInt1315 >> 8) >> 3;
      method2034(var0, shadowsSprite, var4 + 1, var5 + 1);
    }
  }
}
