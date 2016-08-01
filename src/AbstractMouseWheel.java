import javax.media.opengl.GL;
import java.awt.Component;

abstract class AbstractMouseWheel {

  static int anInt1901 = 2;
  static FileUnpacker soundEffects;
  static int[][][] anIntArrayArrayArray1903;
  static int anInt1904;

  abstract int pollOffset(int var1);

  abstract void unbind(boolean var1, Component var2);

  abstract void bind(Component var1, int var2);

  static final boolean updateInterfaceCounter(int counter, byte var1) {
    try {
      SomethingLight0.interfaceCounter = counter - -1 & '\uffff';
      RenderAnimation.interfaceCounterUpdated = true;
      return true;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "uc.D(" + counter + ',' + var1 + ')');
    }
  }

  static final int compact(int var0, int var1) {
    try {
      var0 = (0xd5555555 & var0 >>> 1) + (0x55555555 & var0);
      var0 = ((0xcccccccc & var0) >>> 2) + (var0 & 0x33333333);
      var0 = 0xf0f0f0f & (var0 >>> 4) + var0;
      var0 += var0 >>> 8;
      var0 += var0 >>> 16;
      return 255 & var0;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "uc.E(" + var0 + ',' + var1 + ')');
    }
  }

  public static void method2081(int var0) {
    try {
      anIntArrayArrayArray1903 = null;
      if (var0 == 0) {
        soundEffects = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "uc.A(" + var0 + ')');
    }
  }

  static final void drawScene(int var0, int var1, int var2, byte[][][] var3, int var4, byte var5,
                              int var6, int var7) {
    ++SomethingQuickChat2.anInt3539;
    GameStub.anInt3 = 0;
    int var8 = var6 - 16; // 32
    int var9 = var6 + 16;
    int var10 = var7 - 16;
    int var11 = var7 + 16;

    int var14;
    int var15;
    int var29;
    for (int var12 = TextureSampler22.anInt3419; var12 < AnimationFrame.anInt2456; ++var12) {
      SceneGraphTile[][] var13 = SomethingTexture1.sceneGraphTiles[var12];

      for (var14 = DummyClass9.viewportLowerX; var14 < MapScene.viewportUpperX; ++var14) {
        for (
          var15 = AbstractObjectNode.viewportLowerZ;
          var15 < SomethingTilek.viewportUpperZ; ++var15) {
          SceneGraphTile var16 = var13[var14][var15];
          if (var16 != null) {
            if (DummyClass30.adjacentTileOnScreen[var14 - TriChromaticImageCache.cameraTileX
              + TextureSampler8.viewportLength][var15 - TextureSampler7.cameraTileZ
              + TextureSampler8.viewportLength] && (var3 == null || var12 < var4
              || var3[var12][var14][var15] != var5)) {
              var16.aBoolean2222 = true;
              var16.aBoolean2225 = true;
              var16.aBoolean2236 = var16.anInt2223 > 0;

              ++GameStub.anInt3;
            } else {
              var16.aBoolean2222 = false;
              var16.aBoolean2225 = false;
              var16.anInt2227 = 0;
              if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                if (var16.aClass70_2234 != null) {
                  SceneSomething2 var17 = var16.aClass70_2234;
                  var17.sceneNode0.method1867(0, var12, var17.positionY, var17.positionX,
                    var17.positionZ);
                  if (var17.sceneNode1 != null) {
                    var17.sceneNode1.method1867(0, var12, var17.positionY, var17.positionX,
                      var17.positionZ);
                  }
                }

                if (var16.aClass19_2233 != null) {
                  SomethingSceneI var31 = var16.aClass19_2233;
                  var31.aClass140_429.method1867(var31.anInt420, var12, var31.anInt425,
                    var31.anInt424, var31.anInt427);
                  if (var31.aClass140_423 != null) {
                    var31.aClass140_423.method1867(var31.anInt420, var12, var31.anInt425,
                      var31.anInt424, var31.anInt427);
                  }
                }

                if (var16.aClass12_2230 != null) {
                  SomethingSceneJ var30 = var16.aClass12_2230;
                  var30.aClass140_320.method1867(0, var12, var30.anInt326, var30.anInt324,
                    var30.anInt330);
                }

                if (var16.sceneGraphNodes != null) {
                  for (var29 = 0; var29 < var16.anInt2223; ++var29) {
                    SceneSomething var18 = var16.sceneGraphNodes[var29];
                    var18.sceneNode.method1867(var18.anInt496, var12, var18.anInt489,
                      var18.anInt482, var18.anInt484);
                  }
                }
              }
            }
          }
        }
      }
    }

    boolean var22 = AbstractGameWorld.heightMap == AbstractObjectNode.othrrHeightMap;
    if (GlRenderer.useOpenGlRenderer) {
      GL var24 = GlRenderer.gl;
      var24.glPushMatrix();
      var24.glTranslatef((float) (-var0), (float) (-var1), (float) (-var2));
      if (var22) {
        AudioSomethingSomething.method403();
        SomethingQuickChat.method551(0, -1, 3);
        TextureSampler23.aBoolean3207 = true;
        MaterialShader3.method2254();
        SocketStream.anInt1244 = -1;
        TextureSampler21.anInt3072 = -1;

        for (
          var14 = 0;
          var14 < SomethingOtherWorldMap.aClass3_Sub11ArrayArray2542[0].length; ++var14) {
          SomethingGl0 var28 = SomethingOtherWorldMap.aClass3_Sub11ArrayArray2542[0][var14];
          float var26 = 251.5F - (var28.aBoolean2364 ? 1.0F : 0.5F);
          if (var28.anInt2355 != SocketStream.anInt1244) {
            SocketStream.anInt1244 = var28.anInt2355;
            StillGraphicNode.method535((byte) 56, var28.anInt2355);
            GlEnvironment.setFogColor(SomethingScene.method1297((byte) -50));
          }

          var28.method149(SomethingTexture1.sceneGraphTiles, var26, false);
        }

        MaterialShader3.method2253();
      } else {
        for (var14 = TextureSampler22.anInt3419; var14 < AnimationFrame.anInt2456; ++var14) {
          for (
            var15 = 0;
            var15 < SomethingOtherWorldMap.aClass3_Sub11ArrayArray2542[var14].length; ++var15) {
            SomethingGl0 var25 = SomethingOtherWorldMap.aClass3_Sub11ArrayArray2542[var14][var15];
            float var33 = 201.5F - 50.0F * (float) var14 - (var25.aBoolean2364 ? 1.0F : 0.5F);
            if (var25.materialId != -1
              && DummyClass40.textureCache.method18(var25.materialId, 255) == 4
              && DummyHashTable.aBoolean1685) {
              StillGraphicNode.method535((byte) 56, var25.anInt2355);
            }

            var25.method149(SomethingTexture1.sceneGraphTiles, var33, false);
          }

          if (var14 == 0 && HashTableIterator.anInt1137 > 0) {
            GlRenderer.method1832(101.5F);
            DummyClass16.drawShadows(TriChromaticImageCache.cameraTileX,
              TextureSampler7.cameraTileZ, TextureSampler8.viewportLength, var1,
              DummyClass30.adjacentTileOnScreen, AbstractGameWorld.heightMap[0]);
          }
        }

        DummyClass46.method1277(TriChromaticImageCache.cameraTileX, TextureSampler7.cameraTileZ,
          SomethingTexture1.sceneGraphTiles);
      }

      var24.glPopMatrix();
    }

    int var19;
    SceneGraphTile var21;
    int var20;
    int var23;
    SceneGraphTile[][] var27;
    int var34;
    int var32;
    for (var23 = TextureSampler22.anInt3419; var23 < AnimationFrame.anInt2456; ++var23) {
      var27 = SomethingTexture1.sceneGraphTiles[var23];

      for (var15 = -TextureSampler8.viewportLength; var15 <= 0; ++var15) {
        var32 = TriChromaticImageCache.cameraTileX + var15;
        var29 = TriChromaticImageCache.cameraTileX - var15;
        if (var32 >= DummyClass9.viewportLowerX || var29 < MapScene.viewportUpperX) {
          for (var34 = -TextureSampler8.viewportLength; var34 <= 0; ++var34) {
            var19 = TextureSampler7.cameraTileZ + var34;
            var20 = TextureSampler7.cameraTileZ - var34;
            if (var32 >= DummyClass9.viewportLowerX) {
              if (var19 >= AbstractObjectNode.viewportLowerZ) {
                var21 = var27[var32][var19];
                if (var21 != null && var21.aBoolean2222) {
                  Unsure.drawSceneTile(var21, true);
                }
              }

              if (var20 < SomethingTilek.viewportUpperZ) {
                var21 = var27[var32][var20];
                if (var21 != null && var21.aBoolean2222) {
                  Unsure.drawSceneTile(var21, true);
                }
              }
            }

            if (var29 < MapScene.viewportUpperX) {
              if (var19 >= AbstractObjectNode.viewportLowerZ) {
                var21 = var27[var29][var19];
                if (var21 != null && var21.aBoolean2222) {
                  Unsure.drawSceneTile(var21, true);
                }
              }

              if (var20 < SomethingTilek.viewportUpperZ) {
                var21 = var27[var29][var20];
                if (var21 != null && var21.aBoolean2222) {
                  Unsure.drawSceneTile(var21, true);
                }
              }
            }

            if (GameStub.anInt3 == 0) {
              if (!var22) {
                TextureSampler37.aBoolean3261 = false;
              }

              return;
            }
          }
        }
      }
    }

    for (var23 = TextureSampler22.anInt3419; var23 < AnimationFrame.anInt2456; ++var23) {
      var27 = SomethingTexture1.sceneGraphTiles[var23];

      for (var15 = -TextureSampler8.viewportLength; var15 <= 0; ++var15) {
        var32 = TriChromaticImageCache.cameraTileX + var15;
        var29 = TriChromaticImageCache.cameraTileX - var15;
        if (var32 >= DummyClass9.viewportLowerX || var29 < MapScene.viewportUpperX) {
          for (var34 = -TextureSampler8.viewportLength; var34 <= 0; ++var34) {
            var19 = TextureSampler7.cameraTileZ + var34;
            var20 = TextureSampler7.cameraTileZ - var34;
            if (var32 >= DummyClass9.viewportLowerX) {
              if (var19 >= AbstractObjectNode.viewportLowerZ) {
                var21 = var27[var32][var19];
                if (var21 != null && var21.aBoolean2222) {
                  Unsure.drawSceneTile(var21, false);
                }
              }

              if (var20 < SomethingTilek.viewportUpperZ) {
                var21 = var27[var32][var20];
                if (var21 != null && var21.aBoolean2222) {
                  Unsure.drawSceneTile(var21, false);
                }
              }
            }

            if (var29 < MapScene.viewportUpperX) {
              if (var19 >= AbstractObjectNode.viewportLowerZ) {
                var21 = var27[var29][var19];
                if (var21 != null && var21.aBoolean2222) {
                  Unsure.drawSceneTile(var21, false);
                }
              }

              if (var20 < SomethingTilek.viewportUpperZ) {
                var21 = var27[var29][var20];
                if (var21 != null && var21.aBoolean2222) {
                  Unsure.drawSceneTile(var21, false);
                }
              }
            }

            if (GameStub.anInt3 == 0) {
              if (!var22) {
                TextureSampler37.aBoolean3261 = false;
              }

              return;
            }
          }
        }
      }
    }

    TextureSampler37.aBoolean3261 = false;
  }

}
