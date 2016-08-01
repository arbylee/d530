import javax.media.opengl.GL;

final class DummyClass46 {

  static Light[] lights;
  static int anInt1032 = 0;
  private static float[] aFloatArray1022 = new float[] {0.0F, 0.0F, 0.0F, 1.0F};
  private static int[] anIntArray1023;
  private static int anInt1024;
  private static int anInt1025;
  private static boolean[] lightsActive;
  private static int[][][] anIntArrayArrayArray1027;
  private static int[] anIntArray1028;
  private static int anInt1029;
  private static int amountPlanes;
  private static int anInt1031;
  private static boolean[] aBooleanArray1033;
  private static int anInt1034;
  private static int sceneHeight;
  private static int sceneWidth;


  static final void method1263(int var0, int var1, int var2, int var3, int var4, int var5,
                               int var6) {
    if (DisplayMode.useBumpMaps) {
      if (var0 == 1 && var5 > 0) {
        method1268(var1, var2, var3, var4, var5 - 1, var6);
      } else if (var0 == 4 && var5 < sceneWidth - 1) {
        method1268(var1, var2, var3, var4, var5 + 1, var6);
      } else if (var0 == 8 && var6 > 0) {
        method1268(var1, var2, var3, var4, var5, var6 - 1);
      } else if (var0 == 2 && var6 < sceneHeight - 1) {
        method1268(var1, var2, var3, var4, var5, var6 + 1);
      } else if (var0 == 16 && var5 > 0 && var6 < sceneHeight - 1) {
        method1268(var1, var2, var3, var4, var5 - 1, var6 + 1);
      } else if (var0 == 32 && var5 < sceneWidth - 1 && var6 < sceneHeight - 1) {
        method1268(var1, var2, var3, var4, var5 + 1, var6 + 1);
      } else if (var0 == 128 && var5 > 0 && var6 > 0) {
        method1268(var1, var2, var3, var4, var5 - 1, var6 - 1);
      } else if (var0 == 64 && var5 < sceneWidth - 1 && var6 > 0) {
        method1268(var1, var2, var3, var4, var5 + 1, var6 - 1);
      }
    }
  }

  static final void method1264(Light var0) {
    if (anInt1032 >= 255) {
      System.out.println("Number of lights added exceeds maximum!");
    } else {
      lights[anInt1032++] = var0;
    }
  }

  static final void disableLights() {
    for (int var0 = 0; var0 < 4; ++var0) {
      anIntArray1028[var0] = -1;
      disableLight(var0);
    }

  }

  static final void method1266(int var0, int var1, int var2, int var3, int var4, int var5, int var6,
                               int var7) {
    if (DisplayMode.useBumpMaps) {
      if (anInt1029 != var3 || anInt1031 != var4 || anInt1024 != var5 || anInt1034 != var6
        || anInt1025 != var7) {
        int var8;
        for (var8 = 0; var8 < 4; ++var8) {
          aBooleanArray1033[var8] = false;
        }

        var8 = 0;
        int var9 = 0;

        int var10;
        int var11;
        label105:
        for (var10 = var4; var10 <= var6; ++var10) {
          for (var11 = var5; var11 <= var7; ++var11) {
            int var12 = anIntArrayArrayArray1027[var3][var10][var11];

            label101:
            while (var12 != 0) {
              int var13 = (var12 & 255) - 1;
              var12 >>>= 8;

              int var14;
              for (var14 = 0; var14 < var9; ++var14) {
                if (var13 == anIntArray1023[var14]) {
                  continue label101;
                }
              }

              for (var14 = 0; var14 < 4; ++var14) {
                if (var13 == anIntArray1028[var14]) {
                  if (!aBooleanArray1033[var14]) {
                    aBooleanArray1033[var14] = true;
                    ++var8;
                    if (var8 == 4) {
                      break label105;
                    }
                  }
                  continue label101;
                }
              }

              anIntArray1023[var9++] = var13;
              ++var8;
              if (var8 == 4) {
                break label105;
              }
            }
          }
        }

        var10 = 0;

        while (var10 < var9) {
          var11 = 0;

          while (true) {
            if (var11 < 4) {
              if (aBooleanArray1033[var11]) {
                ++var11;
                continue;
              }

              anIntArray1028[var11] = anIntArray1023[var10];
              aBooleanArray1033[var11] = true;
              method1278(var11, lights[anIntArray1023[var10]], var0, var1, var2);
            }

            ++var10;
            break;
          }
        }

        for (var10 = 0; var10 < 4; ++var10) {
          if (!aBooleanArray1033[var10]) {
            anIntArray1028[var10] = -1;
            disableLight(var10);
          }
        }

        anInt1029 = var3;
        anInt1031 = var4;
        anInt1024 = var5;
        anInt1034 = var6;
        anInt1025 = var7;
      }
    }
  }

  static final void setSceneDimensions(int var0, int var1, int var2) {
    amountPlanes = var0;
    sceneWidth = var1;
    sceneHeight = var2;
    anIntArrayArrayArray1027 = new int[amountPlanes][sceneWidth][sceneHeight];
  }

  static final void method1268(int var0, int var1, int var2, int var3, int var4, int var5) {
    if (DisplayMode.useBumpMaps) {
      if (anInt1029 != var3 || anInt1031 != var4 || anInt1024 != var5 || anInt1034 != var4
        || anInt1025 != var5) {
        int var6;
        for (var6 = 0; var6 < 4; ++var6) {
          aBooleanArray1033[var6] = false;
        }

        var6 = 0;
        int var7 = anIntArrayArrayArray1027[var3][var4][var5];

        int var8;
        int var9;
        label71:
        while (var7 != 0) {
          var8 = (var7 & 255) - 1;
          var7 >>>= 8;

          for (var9 = 0; var9 < 4; ++var9) {
            if (var8 == anIntArray1028[var9]) {
              aBooleanArray1033[var9] = true;
              continue label71;
            }
          }

          anIntArray1023[var6++] = var8;
        }

        var8 = 0;

        while (var8 < var6) {
          var9 = 0;

          while (true) {
            if (var9 < 4) {
              if (aBooleanArray1033[var9]) {
                ++var9;
                continue;
              }

              anIntArray1028[var9] = anIntArray1023[var8];
              aBooleanArray1033[var9] = true;
              method1278(var9, lights[anIntArray1023[var8]], var0, var1, var2);
            }

            ++var8;
            break;
          }
        }

        for (var8 = 0; var8 < 4; ++var8) {
          if (!aBooleanArray1033[var8]) {
            anIntArray1028[var8] = -1;
            disableLight(var8);
          }
        }

        anInt1029 = var3;
        anInt1031 = var4;
        anInt1024 = var5;
        anInt1034 = var4;
        anInt1025 = var5;
      }
    }
  }

  static final void method1269(int var0, boolean var1) {
    for (int var2 = 0; var2 < anInt1032; ++var2) {
      lights[var2].method1063(var1, var0, -3696);
    }

    anInt1029 = -1;
    anInt1031 = -1;
    anInt1024 = -1;
    anInt1034 = -1;
    anInt1025 = -1;
  }

  static final void method1270() {
    for (int var0 = 0; var0 < anInt1032; ++var0) {
      Light var1 = lights[var0];
      int var2 = var1.anInt704;
      if (var1.aBoolean690) {
        var2 = 0;
      }

      int var3 = var1.anInt704;
      if (var1.aBoolean711) {
        var3 = 3;
      }

      for (int var4 = var2; var4 <= var3; ++var4) {
        int var5 = 0;
        int var6 = (var1.anInt708 >> 7) - var1.anInt698;
        if (var6 < 0) {
          var5 -= var6;
          var6 = 0;
        }

        int var7 = (var1.anInt708 >> 7) + var1.anInt698;
        if (var7 > sceneHeight - 1) {
          var7 = sceneHeight - 1;
        }

        for (int var8 = var6; var8 <= var7; ++var8) {
          short var9 = var1.aShortArray706[var5++];
          int var10 = (var1.anInt703 >> 7) - var1.anInt698 + (var9 >> 8);
          int var11 = var10 + (var9 & 255) - 1;
          if (var10 < 0) {
            var10 = 0;
          }

          if (var11 > sceneWidth - 1) {
            var11 = sceneWidth - 1;
          }

          for (int var12 = var10; var12 <= var11; ++var12) {
            int var13 = anIntArrayArrayArray1027[var4][var12][var8];
            if ((var13 & 255) == 0) {
              anIntArrayArrayArray1027[var4][var12][var8] = var13 | var0 + 1;
            } else if ((var13 & '\uff00') == 0) {
              anIntArrayArrayArray1027[var4][var12][var8] = var13 | var0 + 1 << 8;
            } else if ((var13 & 16711680) == 0) {
              anIntArrayArrayArray1027[var4][var12][var8] = var13 | var0 + 1 << 16;
            } else if ((var13 & -16777216) == 0) {
              anIntArrayArrayArray1027[var4][var12][var8] = var13 | var0 + 1 << 24;
            }
          }
        }
      }
    }

  }

  private static final void disableLight(int id) {
    if (lightsActive[id]) {
      lightsActive[id] = false;
      int var1 = id + 16384 + 4;
      GL var2 = GlRenderer.gl;
      var2.glDisable(var1);
    }
  }

  static final void method1272(int var0, int var1, int var2, int var3, int var4) {
    if (DisplayMode.useBumpMaps) {
      label44:
      for (int var5 = 0; var5 < 4; ++var5) {
        if (anIntArray1028[var5] != -1) {
          int var6 = anIntArrayArrayArray1027[var0][var1][var2];

          int var7;
          while (var6 != 0) {
            var7 = (var6 & 255) - 1;
            var6 >>>= 8;
            if (var7 == anIntArray1028[var5]) {
              continue label44;
            }
          }

          var6 = anIntArrayArrayArray1027[var0][var3][var4];

          while (var6 != 0) {
            var7 = (var6 & 255) - 1;
            var6 >>>= 8;
            if (var7 == anIntArray1028[var5]) {
              continue label44;
            }
          }
        }

        anIntArray1028[var5] = -1;
        disableLight(var5);
      }

    }
  }

  static final void method1273() {
    lights = null;
    anIntArray1028 = null;
    lightsActive = null;
    anIntArray1023 = null;
    aBooleanArray1033 = null;
    anIntArrayArrayArray1027 = null;
  }

  public static void method1274() {
    lights = null;
    anIntArrayArrayArray1027 = null;
    anIntArray1028 = null;
    lightsActive = null;
    aFloatArray1022 = null;
    anIntArray1023 = null;
    aBooleanArray1033 = null;
  }

  static final void method1275() {
    GL var0 = GlRenderer.gl;

    int var1;
    for (var1 = 0; var1 < 4; ++var1) {
      int var2 = 16388 + var1;
      var0.glLightfv(var2, 4608, new float[] {0.0F, 0.0F, 0.0F, 1.0F}, 0);
      var0.glLightf(var2, 4616, 0.0F);
      var0.glLightf(var2, 4615, 0.0F);
    }

    for (var1 = 0; var1 < 4; ++var1) {
      anIntArray1028[var1] = -1;
      disableLight(var1);
    }

  }

  static final void setupSceneGl() {
    lights = new Light[255];
    anIntArray1028 = new int[4];
    lightsActive = new boolean[4];
    anIntArray1023 = new int[4];
    aBooleanArray1033 = new boolean[4];
    anIntArrayArrayArray1027 = new int[amountPlanes][sceneWidth][sceneHeight];
  }

  static final void method1277(int var0, int var1, SceneGraphTile[][][] var2) {
    if (DisplayMode.useBumpMaps) {
      GL var3 = GlRenderer.gl;
      SomethingQuickChat.method551(0, 0, 0);
      GlRenderer.method1856(0);
      GlRenderer.loadIdentityTextureMatrix();
      GlRenderer.bindTexture(GlRenderer.anInt1810);
      var3.glDepthMask(false);
      GlRenderer.setLightingEnabled(false);
      var3.glBlendFunc(774, 1);
      // GL_FOG_COLOR
      var3.glFogfv(2918, new float[] {0.0F, 0.0F, 0.0F, 0.0F}, 0);
      var3.glTexEnvi(8960, '\u8580', '\u8576');
      var3.glTexEnvi(8960, '\u8590', 770);

      label69:
      for (int var4 = 0; var4 < anInt1032; ++var4) {
        Light var5 = lights[var4];
        int var6 = var5.anInt704;
        if (var5.aBoolean696) {
          --var6;
        }

        if (var5.aClass37_712 != null) {
          int var7 = 0;
          int var8 = (var5.anInt708 >> 7) - var5.anInt698;
          int var9 = (var5.anInt708 >> 7) + var5.anInt698;
          if (var9 >= SomethingTilek.viewportUpperZ) {
            var9 = SomethingTilek.viewportUpperZ - 1;
          }

          if (var8 < AbstractObjectNode.viewportLowerZ) {
            var7 += AbstractObjectNode.viewportLowerZ - var8;
            var8 = AbstractObjectNode.viewportLowerZ;
          }

          int var10 = var8;

          while (var10 <= var9) {
            short var11 = var5.aShortArray706[var7++];
            int var12 = (var5.anInt703 >> 7) - var5.anInt698 + (var11 >> 8);
            int var13 = var12 + (var11 & 255) - 1;
            if (var12 < DummyClass9.viewportLowerX) {
              var12 = DummyClass9.viewportLowerX;
            }

            if (var13 >= MapScene.viewportUpperX) {
              var13 = MapScene.viewportUpperX - 1;
            }

            int var14 = var12;

            while (true) {
              if (var14 <= var13) {
                SceneGraphTile var15 = null;
                if (var6 >= 0) {
                  var15 = var2[var6][var14][var10];
                }

                if (var6 >= 0 && (var15 == null || !var15.aBoolean2222)) {
                  ++var14;
                  continue;
                }

                GlRenderer.method1832(201.5F - (float) var5.anInt704 * 50.0F - 1.5F);
                var3.glTexEnvfv(8960, 8705, new float[] {0.0F, 0.0F, 0.0F, var5.aFloat707}, 0);
                var5.aClass37_712.draw();
                continue label69;
              }

              ++var10;
              break;
            }
          }
        }
      }

      var3.glTexEnvi(8960, '\u8580', 5890);
      var3.glTexEnvi(8960, '\u8590', 768);
      var3.glBlendFunc(770, 771);
      var3.glDepthMask(true);
      var3.glFogfv(2918, GlEnvironment.fogColorRgb, 0);
      var3.glEnableClientState('\u8078');
      GlRenderer.method1846();
    }
  }

  private static final void method1278(int var0, Light var1, int var2, int var3, int var4) {
    int var5 = var0 + 16384 + 4;
    GL var6 = GlRenderer.gl;
    if (!lightsActive[var0]) {
      var6.glEnable(var5);
      lightsActive[var0] = true;
    }

    var6.glLightf(var5, 4617, var1.aFloat710);
    var6.glLightfv(var5, 4609, var1.colors, 0);
    aFloatArray1022[0] = (float) (var1.anInt703 - var2);
    aFloatArray1022[1] = (float) (var1.anInt697 - var3);
    aFloatArray1022[2] = (float) (var1.anInt708 - var4);
    var6.glLightfv(var5, 4611, aFloatArray1022, 0);
  }

  static final void method1279() {
    anInt1032 = 0;

    for (int var0 = 0; var0 < amountPlanes; ++var0) {
      for (int var1 = 0; var1 < sceneWidth; ++var1) {
        for (int var2 = 0; var2 < sceneHeight; ++var2) {
          anIntArrayArrayArray1027[var0][var1][var2] = 0;
        }
      }
    }

  }

}
