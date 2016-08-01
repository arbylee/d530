import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

final class DirectImageProducer extends AbstractImageProducer
  implements ImageProducer, ImageObserver {

  static GameString[] aClass94Array2977 = new GameString[5];
  static WidgetAccess aClass3_Sub1_2980 = new WidgetAccess(0, -1);
  static boolean aBoolean2981 = false;
  static ObjectCache aClass93_2982 = new ObjectCache(32);
  private ImageConsumer anImageConsumer2978;
  private ColorModel aColorModel2979;

  public final synchronized void addConsumer(ImageConsumer var1) {
    try {
      this.anImageConsumer2978 = var1;
      var1.setDimensions(this.anInt2012, this.anInt2011);
      var1.setProperties(null);
      var1.setColorModel(this.aColorModel2979);
      var1.setHints(14);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "di.addConsumer(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  public final synchronized boolean isConsumer(ImageConsumer var1) {
    try {
      return this.anImageConsumer2978 == var1;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "di.isConsumer(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  public final synchronized void removeConsumer(ImageConsumer var1) {
    try {
      if (this.anImageConsumer2978 == var1) {
        this.anImageConsumer2978 = null;
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "di.removeConsumer(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  public final void startProduction(ImageConsumer var1) {
    try {
      this.addConsumer(var1);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "di.startProduction(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  public final void requestTopDownLeftRightResend(ImageConsumer var1) {
  }

  private final synchronized void method2188(int var1, int var2, int var3, byte var4, int var5) {
    try {
      if (null != this.anImageConsumer2978) {
        this.anImageConsumer2978.setPixels(var3, var5, var1, var2, this.aColorModel2979,
          this.anIntArray2007, var5 * this.anInt2012 + var3, this.anInt2012);
        this.anImageConsumer2978.imageComplete(2);
        if (var4 > -29) {
          method2189(null, false, -53);
        }

      }
    } catch (RuntimeException var7) {
      throw AbstractGameWorld.cascadeException(var7,
        "di.N(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
    }
  }

  private final synchronized void method2190(int var1) {
    try {
      if (var1 == 19661184) {
        if (this.anImageConsumer2978 != null) {
          this.anImageConsumer2978.setPixels(0, 0, this.anInt2012, this.anInt2011,
            this.aColorModel2979, this.anIntArray2007, 0, this.anInt2012);
          this.anImageConsumer2978.imageComplete(2);
        }
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "di.L(" + var1 + ')');
    }
  }

  final void draw(int var1, int var2, Graphics var3, int var4) {
    try {
      if (var4 != 0) {
        aBoolean2981 = true;
      }

      this.method2190(var4 ^ 19661184);
      var3.drawImage(this.anImage2009, var1, var2, this);
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "di.C(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ')');
    }
  }

  final void draw(Graphics var5, int var1, int var2, int var4, int var6, int var3) {
    try {
      this.method2188(var1, var4, var2, (byte) -124, var6);
      if (var3 == 6260) {
        Shape var7 = var5.getClip();
        var5.clipRect(var2, var6, var1, var4);
        var5.drawImage(this.anImage2009, 0, 0, this);
        var5.setClip(var7);
      }
    } catch (RuntimeException var8) {
      throw AbstractGameWorld.cascadeException(var8,
        "di.E(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + (var5 != null ?
          "{...}" :
          "null") + ',' + var6 + ')');
    }
  }

  final void setDimensions(int var1, boolean var2, int var3, Component var4) {
    try {
      this.anInt2011 = var1;
      this.anIntArray2007 = new int[var3 * var1 + 1];
      this.anInt2012 = var3;
      this.aColorModel2979 = new DirectColorModel(32, 16711680, '\uff00', 255);
      this.anImage2009 = var4.createImage(this);
      this.method2190(19661184);
      var4.prepareImage(this.anImage2009, this);
      this.method2190(19661184);
      var4.prepareImage(this.anImage2009, this);
      this.method2190(19661184);
      var4.prepareImage(this.anImage2009, this);
      this.method2182(0);
      if (var2) {
        this.addConsumer(null);
      }

    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "di.F(" + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ')');
    }
  }

  public final boolean imageUpdate(Image var1, int var2, int var3, int var4, int var5, int var6) {
    try {
      return true;
    } catch (RuntimeException var8) {
      throw AbstractGameWorld.cascadeException(var8,
        "di.imageUpdate(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4
          + ',' + var5 + ',' + var6 + ')');
    }
  }

  public static void method2187(int var0) {
    try {
      aClass94Array2977 = null;
      aClass93_2982 = null;
      aClass3_Sub1_2980 = null;
      if (var0 != 27316) {
        aBoolean2981 = true;
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "di.I(" + var0 + ')');
    }
  }

  static final void method2189(CollisionMap[] collisionMaps, boolean var1, int var2) {
    try {
      int var4;
      int var5;
      if (!var1) {
        for (var4 = 0; var4 < 4; ++var4) {
          for (var5 = 0; ~var5 > -105; ++var5) {
            for (int var6 = 0; -105 < ~var6; ++var6) {
              if (~(1 & BZipDecompressorState.tileFlags[var4][var5][var6]) == -2) {
                int var7 = var4;
                if (~(2 & BZipDecompressorState.tileFlags[1][var5][var6]) == -3) {
                  var7 = var4 - 1;
                }

                if (~var7 <= -1) {
                  collisionMaps[var7].method1497(var6, 7605, var5);
                }
              }
            }
          }
        }

        AbstractIndexedColorSprite.anInt1463 += (int) (Math.random() * 5.0D) - 2;
        if (~AbstractIndexedColorSprite.anInt1463 > 15) {
          AbstractIndexedColorSprite.anInt1463 = -16;
        }

        if (-17 > ~AbstractIndexedColorSprite.anInt1463) {
          AbstractIndexedColorSprite.anInt1463 = 16;
        }

        TextureSampler31.anInt3158 += (int) (Math.random() * 5.0D) - 2;
        if (-8 > TextureSampler31.anInt3158) {
          TextureSampler31.anInt3158 = -8;
        }

        if (-9 > ~TextureSampler31.anInt3158) {
          TextureSampler31.anInt3158 = 8;
        }
      }

      byte var3;
      if (!var1) {
        var3 = 4;
      } else {
        var3 = 1;
      }

      var4 = TextureSampler31.anInt3158 >> 2 << 10;
      int[][] var34 = new int[104][104];
      int[][] var35 = new int[104][104];
      var5 = AbstractIndexedColorSprite.anInt1463 >> 1;

      int var8;
      int lightPosX;
      int lightPosY;
      int lightMagnitude;
      int var14;
      int var15;
      int var16;
      int var19;
      int var18;
      int var20;
      int lightPosZ;
      int var44;
      for (var8 = 0; var3 > var8; ++var8) {
        byte[][] var9 = MouseRecorder.aByteArrayArrayArray1014[var8];
        int var21;
        int var23;
        int var22;
        int var24;
        if (GlRenderer.useOpenGlRenderer) {
          if (!DisplayMode.useBumpMaps) {
            lightPosX = (int) GlEnvironment.diffuseLight0[0];
            lightPosY = (int) GlEnvironment.diffuseLight0[1];
            lightPosZ = (int) GlEnvironment.diffuseLight0[2];
            lightMagnitude = (int) Math.sqrt(
              (double) (lightPosY * lightPosY + (lightPosX * lightPosX - -(lightPosZ
                * lightPosZ))));
            var14 = 1024 * lightMagnitude >> 8;

            for (var15 = 1; -104 < ~var15; ++var15) {
              for (var16 = 1; var16 < 103; ++var16) {
                byte var17 = 96;
                var18 = AbstractGameWorld.heightMap[var8][var16 - -1][var15]
                  - AbstractGameWorld.heightMap[var8][-1 + var16][var15];
                var19 = AbstractGameWorld.heightMap[var8][var16][var15 + 1]
                  - AbstractGameWorld.heightMap[var8][var16][-1 + var15];
                var20 = (int) Math.sqrt((double) (var18 * var18 + 65536 + var19 * var19));
                var21 = (var18 << 8) / var20;
                var24 = (var9[var16][1 + var15] >> 3) + (var9[var16][var15 - 1] >> 2) + (
                  (var9[var16 - 1][var15] >> 2) + (var9[var16 + 1][var15] >> 3) - -(
                    var9[var16][var15] >> 1));
                var22 = -65536 / var20;
                var23 = (var19 << 8) / var20;
                var44 =
                  var17 + (lightPosZ * var23 + (lightPosX * var21 - -(var22 * lightPosY))) / var14;
                var35[var16][var15] = var44 + -((int) ((float) var24 * 1.7F));
              }
            }
          } else {
            for (lightPosX = 1; lightPosX < 103; ++lightPosX) {
              for (lightPosY = 1; ~lightPosY > -104; ++lightPosY) {
                lightMagnitude =
                  (var9[1 + lightPosY][lightPosX] >> 3) + (var9[-1 + lightPosY][lightPosX] >> 2)
                    - -(var9[lightPosY][-1 + lightPosX] >> 2) - -(var9[lightPosY][1 + lightPosX]
                    >> 3) - -(var9[lightPosY][lightPosX] >> 1);
                byte var12 = 74;
                var35[lightPosY][lightPosX] = -lightMagnitude + var12;
              }
            }
          }
        } else {
          lightPosX = (int) Math.sqrt(5100.0D);
          lightPosY = 768 * lightPosX >> 8;

          for (lightPosZ = 1; lightPosZ < 103; ++lightPosZ) {
            for (lightMagnitude = 1; 103 > lightMagnitude; ++lightMagnitude) {
              var16 = -AbstractGameWorld.heightMap[var8][lightMagnitude][-1 + lightPosZ]
                + AbstractGameWorld.heightMap[var8][lightMagnitude][lightPosZ + 1];
              byte var41 = 74;
              var15 = -AbstractGameWorld.heightMap[var8][lightMagnitude + -1][lightPosZ]
                + AbstractGameWorld.heightMap[var8][lightMagnitude - -1][lightPosZ];
              var44 = (int) Math.sqrt((double) (var15 * var15 - -65536 - -(var16 * var16)));
              var20 = (var16 << 8) / var44;
              var19 = -65536 / var44;
              var18 = (var15 << 8) / var44;
              var21 =
                (var9[lightMagnitude][lightPosZ] >> 1) + (var9[lightMagnitude][-1 + lightPosZ] >> 2)
                  + (var9[lightMagnitude - -1][lightPosZ] >> 3) + (
                  (var9[lightMagnitude - 1][lightPosZ] >> 2) - -(var9[lightMagnitude][lightPosZ + 1]
                    >> 3));
              var14 = var41 + (var20 * -50 + var18 * -50 - -(var19 * -10)) / lightPosY;
              var35[lightMagnitude][lightPosZ] = var14 - var21;
            }
          }
        }

        for (lightPosX = 0; 104 > lightPosX; ++lightPosX) {
          AbstractFrameRegulator.anIntArray1695[lightPosX] = 0;
          HashTableIterator.anIntArray1138[lightPosX] = 0;
          SomethingPacket151.anIntArray2606[lightPosX] = 0;
          Mouse.anIntArray1920[lightPosX] = 0;
          IntegerNode.anIntArray2469[lightPosX] = 0;
        }

        for (lightPosX = -5; ~lightPosX > -105; ++lightPosX) {
          for (lightPosY = 0; 104 > lightPosY; ++lightPosY) {
            lightPosZ = lightPosX - -5;
            if (lightPosZ < 104) {
              lightMagnitude = 255 & TextureSampler36.floorUnderlayIds[var8][lightPosZ][lightPosY];
              if (lightMagnitude > 0) {
                FloorUnderlay underlay = ClientScript.getFloorUnderlay(-1 + lightMagnitude);
                AbstractFrameRegulator.anIntArray1695[lightPosY] += underlay.anInt1408;
                HashTableIterator.anIntArray1138[lightPosY] += underlay.anInt1406;
                SomethingPacket151.anIntArray2606[lightPosY] += underlay.anInt1417;
                Mouse.anIntArray1920[lightPosY] += underlay.anInt1418;
                ++IntegerNode.anIntArray2469[lightPosY];
              }
            }

            lightMagnitude = -5 + lightPosX;
            if (0 <= lightMagnitude) {
              var14 = 255 & TextureSampler36.floorUnderlayIds[var8][lightMagnitude][lightPosY];
              if (var14 > 0) {
                FloorUnderlay var42 = ClientScript.getFloorUnderlay(-1 + var14);
                AbstractFrameRegulator.anIntArray1695[lightPosY] -= var42.anInt1408;
                HashTableIterator.anIntArray1138[lightPosY] -= var42.anInt1406;
                SomethingPacket151.anIntArray2606[lightPosY] -= var42.anInt1417;
                Mouse.anIntArray1920[lightPosY] -= var42.anInt1418;
                --IntegerNode.anIntArray2469[lightPosY];
              }
            }
          }

          if (lightPosX >= 0) {
            lightPosY = 0;
            lightMagnitude = 0;
            lightPosZ = 0;
            var14 = 0;
            var15 = 0;

            for (var16 = -5; var16 < 104; ++var16) {
              var44 = var16 - -5;
              if (104 > var44) {
                lightPosZ += HashTableIterator.anIntArray1138[var44];
                var15 += IntegerNode.anIntArray2469[var44];
                lightPosY += AbstractFrameRegulator.anIntArray1695[var44];
                var14 += Mouse.anIntArray1920[var44];
                lightMagnitude += SomethingPacket151.anIntArray2606[var44];
              }

              var18 = var16 + -5;
              if (~var18 <= -1) {
                lightPosZ -= HashTableIterator.anIntArray1138[var18];
                var14 -= Mouse.anIntArray1920[var18];
                lightPosY -= AbstractFrameRegulator.anIntArray1695[var18];
                var15 -= IntegerNode.anIntArray2469[var18];
                lightMagnitude -= SomethingPacket151.anIntArray2606[var18];
              }

              if (0 <= var16 && -1 > ~var15) {
                var34[lightPosX][var16] =
                  ClassCheckRequest.method129(lightMagnitude / var15, 2, lightPosZ / var15,
                    256 * lightPosY / var14);
              }
            }
          }
        }

        for (lightPosX = 1; ~lightPosX > -104; ++lightPosX) {
          label754:
          for (lightPosY = 1; ~lightPosY > -104; ++lightPosY) {
            if (var1 || NPC.method1986(66)
              || ~(2 & BZipDecompressorState.tileFlags[0][lightPosX][lightPosY]) != -1
              || ~(16 & BZipDecompressorState.tileFlags[var8][lightPosX][lightPosY]) == -1
              && DummyClass18.method823(lightPosY, lightPosX, -87, var8) == GameObject.plane) {
              if (~DummyClass52.anInt1174 < ~var8) {
                DummyClass52.anInt1174 = var8;
              }

              lightPosZ = 255 & TextureSampler36.floorUnderlayIds[var8][lightPosX][lightPosY];
              lightMagnitude = DummyClass17.tileFloors[var8][lightPosX][lightPosY] & 255;
              if (0 < lightPosZ || -1 > ~lightMagnitude) {
                var15 = AbstractGameWorld.heightMap[var8][lightPosX + 1][lightPosY];
                var14 = AbstractGameWorld.heightMap[var8][lightPosX][lightPosY];
                var44 = AbstractGameWorld.heightMap[var8][lightPosX][1 + lightPosY];
                var16 = AbstractGameWorld.heightMap[var8][1 + lightPosX][lightPosY + 1];
                if (0 < var8) {
                  boolean var47 = true;
                  if (lightPosZ == 0
                    && ObjectCache.tileOrientation[var8][lightPosX][lightPosY] != 0) {
                    var47 = false;
                  }

                  if (-1 > ~lightMagnitude && !TextureSampler10.method350((byte) -73,
                    lightMagnitude + -1).aBoolean2102) {
                    var47 = false;
                  }

                  if (var47 && var14 == var15 && ~var14 == ~var16 && ~var44 == ~var14) {
                    DummyClass36.anIntArrayArrayArray2609[var8][lightPosX][lightPosY] =
                      TextureSampler3.method308(
                        DummyClass36.anIntArrayArrayArray2609[var8][lightPosX][lightPosY], 4);
                  }
                }

                if (-1 <= ~lightPosZ) {
                  var18 = -1;
                  var19 = 0;
                } else {
                  var18 = var34[lightPosX][lightPosY];
                  var20 = (var18 & 127) + var5;
                  if (-1 >= ~var20) {
                    if (-128 > ~var20) {
                      var20 = 127;
                    }
                  } else {
                    var20 = 0;
                  }

                  var21 = (896 & var18) + (var18 + var4 & '\ufc00') + var20;
                  var19 = DummyClass40.hslTable[Cache.repackHSL(96, true, var21)];
                }

                var20 = var35[lightPosX][lightPosY];
                var23 = var35[lightPosX][lightPosY + 1];
                var21 = var35[1 + lightPosX][lightPosY];
                var22 = var35[lightPosX - -1][lightPosY - -1];
                if (lightMagnitude != 0) {
                  var24 = 1 + ObjectCache.tileOrientation[var8][lightPosX][lightPosY];
                  byte var25 = DummyClass18.aByteArrayArrayArray81[var8][lightPosX][lightPosY];
                  FloorOverlay var26 = TextureSampler10.method350((byte) -105, lightMagnitude + -1);
                  int var27;
                  int var29;
                  int var28;
                  if (GlRenderer.useOpenGlRenderer && !var1
                    && null != TextureSampler16.anIntArrayArray3115 && 0 == var8) {
                    if (-1 != var26.anInt2095
                      && DummyClass40.textureCache.method18(var26.anInt2095, 255) == 4) {
                      TextureSampler16.anIntArrayArray3115[lightPosX][lightPosY] =
                        (var26.anInt2101 << 24) + var26.anInt2094;
                    } else {
                      label722:
                      for (var27 = lightPosX + -1; ~var27 >= ~(1 + lightPosX); ++var27) {
                        for (var28 = lightPosY + -1; ~var28 >= ~(1 + lightPosY); ++var28) {
                          if ((~lightPosX != ~var27 || ~var28 != ~lightPosY) && -1 >= ~var27
                            && var27 < 104 && var28 >= 0 && -105 < ~var28) {
                            var29 = DummyClass17.tileFloors[var8][var27][var28] & 255;
                            if (-1 != ~var29) {
                              FloorOverlay var30 =
                                TextureSampler10.method350((byte) -14, -1 + var29);
                              if (0 != ~var30.anInt2095
                                && -5 == ~DummyClass40.textureCache.method18(var30.anInt2095,
                                255)) {
                                TextureSampler16.anIntArrayArray3115[lightPosX][lightPosY] =
                                  var30.anInt2094 + (var30.anInt2101 << 24);
                                break label722;
                              }
                            }
                          }
                        }
                      }
                    }
                  }

                  var27 = var26.anInt2095;
                  if (0 <= var27 && !DummyClass40.textureCache.method17(var27, 101)) {
                    var27 = -1;
                  }

                  int var31;
                  int var55;
                  if (var27 < 0) {
                    if (var26.anInt2103 != -1) {
                      var28 = var26.anInt2103;
                      var55 = var5 + (var28 & 127);
                      if (-1 >= ~var55) {
                        if (~var55 < -128) {
                          var55 = 127;
                        }
                      } else {
                        var55 = 0;
                      }

                      var31 = (var28 & 896) + (('\ufc00' & var28 + var4) - -var55);
                      var29 = DummyClass40.hslTable[StringNode.method729((byte) -85, var31, 96)];
                    } else {
                      var28 = -2;
                      var29 = 0;
                    }
                  } else {
                    var28 = -1;
                    var29 = DummyClass40.hslTable[StringNode.method729((byte) -126,
                      DummyClass40.textureCache.method15(var27, '\uffff'), 96)];
                  }

                  if (~var26.anInt2098 <= -1) {
                    var55 = var26.anInt2098;
                    var31 = var5 + (var55 & 127);
                    if (-1 >= ~var31) {
                      if (127 < var31) {
                        var31 = 127;
                      }
                    } else {
                      var31 = 0;
                    }

                    int var32 = (896 & var55) + (('\ufc00' & var55 + var4) - -var31);
                    var29 = DummyClass40.hslTable[StringNode.method729((byte) -101, var32, 96)];
                  }

                  MaterialShader5.method1629(var8, lightPosX, lightPosY, var24, var25, var27, var14,
                    var15, var16, var44, Cache.repackHSL(var20, true, var18),
                    Cache.repackHSL(var21, true, var18), Cache.repackHSL(var22, true, var18),
                    Cache.repackHSL(var23, true, var18),
                    StringNode.method729((byte) -72, var28, var20),
                    StringNode.method729((byte) -107, var28, var21),
                    StringNode.method729((byte) -82, var28, var22),
                    StringNode.method729((byte) -93, var28, var23), var19, var29);
                  if (GlRenderer.useOpenGlRenderer && -1 > ~var8) {
                    DummyClass16.method2037(var24, var25, 1 == ~var28 || !var26.aBoolean2093,
                      -1 == var18 || !ClientScript.getFloorUnderlay(-1 + lightPosZ).aBoolean1411,
                      lightPosX, lightPosY,
                      -AbstractGameWorld.heightMap[0][lightPosX][lightPosY] + var14,
                      var15 - AbstractGameWorld.heightMap[0][1 + lightPosX][lightPosY],
                      -AbstractGameWorld.heightMap[0][1 + lightPosX][lightPosY + 1] + var16,
                      -AbstractGameWorld.heightMap[0][lightPosX][1 + lightPosY] + var44);
                  }
                } else {
                  MaterialShader5.method1629(var8, lightPosX, lightPosY, 0, 0, -1, var14, var15,
                    var16, var44, Cache.repackHSL(var20, true, var18),
                    Cache.repackHSL(var21, true, var18), Cache.repackHSL(var22, true, var18),
                    Cache.repackHSL(var23, true, var18), 0, 0, 0, 0, var19, 0);
                  if (GlRenderer.useOpenGlRenderer && var8 > 0 && 0 != ~var18
                    && ClientScript.getFloorUnderlay(-1 + lightPosZ).aBoolean1411) {
                    DummyClass16.method2037(0, 0, true, false, lightPosX, lightPosY,
                      var14 - AbstractGameWorld.heightMap[0][lightPosX][lightPosY],
                      -AbstractGameWorld.heightMap[0][1 + lightPosX][lightPosY] + var15,
                      var16 - AbstractGameWorld.heightMap[0][1 + lightPosX][1 + lightPosY],
                      var44 - AbstractGameWorld.heightMap[0][lightPosX][1 + lightPosY]);
                  }

                  if (GlRenderer.useOpenGlRenderer && !var1
                    && TextureSampler16.anIntArrayArray3115 != null && 0 == var8) {
                    for (var24 = lightPosX + -1; ~var24 >= ~(lightPosX - -1); ++var24) {
                      for (int var52 = -1 + lightPosY; ~(1 + lightPosY) <= ~var52; ++var52) {
                        if ((var24 != lightPosX || lightPosY != var52) && var24 >= 0 && var24 < 104
                          && 0 <= var52 && -105 < ~var52) {
                          int var54 = DummyClass17.tileFloors[var8][var24][var52] & 255;
                          if (var54 != 0) {
                            FloorOverlay var53 = TextureSampler10.method350((byte) -25, -1 + var54);
                            if (~var53.anInt2095 != 0 && 4 == DummyClass40.textureCache.method18(
                              var53.anInt2095, 255)) {
                              TextureSampler16.anIntArrayArray3115[lightPosX][lightPosY] =
                                var53.anInt2094 + (var53.anInt2101 << 24);
                              continue label754;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }

        if (GlRenderer.useOpenGlRenderer) {
          float[][] var38 = new float[105][105];
          int[][] var45 = AbstractGameWorld.heightMap[var8];
          float[][] var40 = new float[105][105];
          float[][] var43 = new float[105][105];

          for (var14 = 1; ~var14 >= -104; ++var14) {
            for (var15 = 1; -104 <= ~var15; ++var15) {
              var44 = var45[var15][var14 - -1] + -var45[var15][-1 + var14];
              var16 = -var45[var15 - 1][var14] + var45[var15 + 1][var14];
              float var51 = (float) Math.sqrt((double) (var16 * var16 - -65536 - -(var44 * var44)));
              var38[var15][var14] = (float) var16 / var51;
              var40[var15][var14] = -256.0F / var51;
              var43[var15][var14] = (float) var44 / var51;
            }
          }

          SomethingGl0[] var50;
          if (!var1) {
            var50 = TextureSampler7.method298(BZipDecompressorState.tileFlags,
              ObjectCache.tileOrientation[var8], TextureSampler36.floorUnderlayIds[var8], var35,
              var40, null, DummyClass17.tileFloors[var8], DummyClass18.aByteArrayArrayArray81[var8],
              var38, var8, var43, var34, AbstractGameWorld.heightMap[var8], null, 4096);
            SomethingGl0[] var46 =
              DummyClass3.method70(var40, var38, AbstractGameWorld.heightMap[var8], var8, var43,
                DummyClass18.aByteArrayArrayArray81[var8], var35, 0,
                ObjectCache.tileOrientation[var8], TextureSampler36.floorUnderlayIds[var8],
                DummyClass17.tileFloors[var8], BZipDecompressorState.tileFlags);
            SomethingGl0[] var49 = new SomethingGl0[var50.length - -var46.length];

            for (var44 = 0; ~var50.length < ~var44; ++var44) {
              var49[var44] = var50[var44];
            }

            for (var44 = 0; ~var46.length < ~var44; ++var44) {
              var49[var50.length + var44] = var46[var44];
            }

            Deque.method1213(var8, var49);
            AbstractFrameRegulator.method1769(var43, TextureSampler36.floorUnderlayIds[var8],
              DummyClass18.aByteArrayArrayArray81[var8], DummyClass46.lights, var8,
              DummyClass46.anInt1032, var40, ObjectCache.tileOrientation[var8],
              DummyClass17.tileFloors[var8], AbstractGameWorld.heightMap[var8], -8771, var38);
          } else {
            var50 = TextureSampler7.method298(BZipDecompressorState.tileFlags,
              ObjectCache.tileOrientation[var8], TextureSampler36.floorUnderlayIds[var8], var35,
              var40, TextureSampler16.anIntArrayArray3115, DummyClass17.tileFloors[var8],
              DummyClass18.aByteArrayArrayArray81[var8], var38, var8, var43, var34,
              AbstractGameWorld.heightMap[var8], DummyClass43.somethingHeightMap[0], 4096);
            Deque.method1213(var8, var50);
          }
        }

        TextureSampler36.floorUnderlayIds[var8] = null;
        DummyClass17.tileFloors[var8] = null;
        ObjectCache.tileOrientation[var8] = null;
        DummyClass18.aByteArrayArrayArray81[var8] = null;
        MouseRecorder.aByteArrayArrayArray1014[var8] = null;
      }

      if (var2 <= 26) {
        method2187(86);
      }

      DummyHashTable.method1764(-50, -10, -50);
      if (!var1) {
        int var36;
        for (var8 = 0; 104 > var8; ++var8) {
          for (var36 = 0; ~var36 > -105; ++var36) {
            if ((BZipDecompressorState.tileFlags[1][var8][var36] & 2) == 2) {
              GlTexture2d.method709(var8, var36);
            }
          }
        }

        for (var8 = 0; 4 > var8; ++var8) {
          for (var36 = 0; -105 <= ~var36; ++var36) {
            for (lightPosX = 0; ~lightPosX >= -105; ++lightPosX) {
              short var48;
              if (-1 != ~(DummyClass36.anIntArrayArrayArray2609[var8][lightPosX][var36] & 1)) {
                var14 = var8;

                for (
                  lightPosY = var36; lightPosY > 0 && -1 != ~(1
                  & DummyClass36.anIntArrayArrayArray2609[var8][lightPosX][-1
                  + lightPosY]); --lightPosY) {
                }

                lightMagnitude = var8;

                for (
                  lightPosZ = var36; ~lightPosZ > -105
                  && (1 & DummyClass36.anIntArrayArrayArray2609[var8][lightPosX][lightPosZ - -1])
                  != 0; ++lightPosZ) {
                }

                label453:
                while (lightMagnitude > 0) {
                  for (var15 = lightPosY; var15 <= lightPosZ; ++var15) {
                    if (-1 == ~(
                      DummyClass36.anIntArrayArrayArray2609[lightMagnitude + -1][lightPosX][var15]
                        & 1)) {
                      break label453;
                    }
                  }

                  --lightMagnitude;
                }

                label464:
                while (~var14 > -4) {
                  for (var15 = lightPosY; ~lightPosZ <= ~var15; ++var15) {
                    if (~(1 & DummyClass36.anIntArrayArrayArray2609[var14 + 1][lightPosX][var15])
                      == -1) {
                      break label464;
                    }
                  }

                  ++var14;
                }

                var15 = (var14 - (-1 + lightMagnitude)) * (-lightPosY + (lightPosZ - -1));
                if (var15 >= 8) {
                  var48 = 240;
                  var44 = -var48 + AbstractGameWorld.heightMap[var14][lightPosX][lightPosY];
                  var18 = AbstractGameWorld.heightMap[lightMagnitude][lightPosX][lightPosY];
                  DummyClass10.method2263(1, 128 * lightPosX, 128 * lightPosX, 128 * lightPosY,
                    lightPosZ * 128 + 128, var44, var18);

                  for (var19 = lightMagnitude; ~var14 <= ~var19; ++var19) {
                    for (var20 = lightPosY; lightPosZ >= var20; ++var20) {
                      DummyClass36.anIntArrayArrayArray2609[var19][lightPosX][var20] =
                        ClientScript.bitAnd(
                          DummyClass36.anIntArrayArrayArray2609[var19][lightPosX][var20], -2);
                    }
                  }
                }
              }

              if ((2 & DummyClass36.anIntArrayArrayArray2609[var8][lightPosX][var36]) != 0) {
                for (
                  lightPosY = lightPosX; 0 < lightPosY
                  && ~(DummyClass36.anIntArrayArrayArray2609[var8][-1 + lightPosY][var36] & 2)
                  != -1; --lightPosY) {
                }

                var14 = var8;
                lightMagnitude = var8;

                for (
                  lightPosZ = lightPosX; 104 > lightPosZ
                  && (2 & DummyClass36.anIntArrayArrayArray2609[var8][lightPosZ - -1][var36])
                  != 0; ++lightPosZ) {
                }

                label503:
                while (~lightMagnitude < -1) {
                  for (var15 = lightPosY; var15 <= lightPosZ; ++var15) {
                    if (0 == (2 & DummyClass36.anIntArrayArrayArray2609[-1
                      + lightMagnitude][var15][var36])) {
                      break label503;
                    }
                  }

                  --lightMagnitude;
                }

                label514:
                while (~var14 > -4) {
                  for (var15 = lightPosY; var15 <= lightPosZ; ++var15) {
                    if (~(2 & DummyClass36.anIntArrayArrayArray2609[var14 + 1][var15][var36])
                      == -1) {
                      break label514;
                    }
                  }

                  ++var14;
                }

                var15 = (-lightPosY + lightPosZ - -1) * (-lightMagnitude + var14 - -1);
                if (8 <= var15) {
                  var48 = 240;
                  var44 = AbstractGameWorld.heightMap[var14][lightPosY][var36] - var48;
                  var18 = AbstractGameWorld.heightMap[lightMagnitude][lightPosY][var36];
                  DummyClass10.method2263(2, lightPosY * 128, 128 * lightPosZ + 128, 128 * var36,
                    var36 * 128, var44, var18);

                  for (var19 = lightMagnitude; var14 >= var19; ++var19) {
                    for (var20 = lightPosY; var20 <= lightPosZ; ++var20) {
                      DummyClass36.anIntArrayArrayArray2609[var19][var20][var36] =
                        ClientScript.bitAnd(
                          DummyClass36.anIntArrayArrayArray2609[var19][var20][var36], -3);
                    }
                  }
                }
              }

              if ((4 & DummyClass36.anIntArrayArrayArray2609[var8][lightPosX][var36]) != 0) {
                lightPosY = lightPosX;
                lightPosZ = lightPosX;

                for (
                  lightMagnitude = var36; 0 < lightMagnitude && 0 != (4
                  & DummyClass36.anIntArrayArrayArray2609[var8][lightPosX][-1
                  + lightMagnitude]); --lightMagnitude) {
                }

                for (
                  var14 = var36; ~var14 > -105
                  && ~(DummyClass36.anIntArrayArrayArray2609[var8][lightPosX][var14 + 1] & 4)
                  != -1; ++var14) {
                }

                label554:
                while (~lightPosY < -1) {
                  for (var15 = lightMagnitude; ~var15 >= ~var14; ++var15) {
                    if (0 == (DummyClass36.anIntArrayArrayArray2609[var8][lightPosY + -1][var15]
                      & 4)) {
                      break label554;
                    }
                  }

                  --lightPosY;
                }

                label565:
                while (lightPosZ < 104) {
                  for (var15 = lightMagnitude; var14 >= var15; ++var15) {
                    if (0 == (4 & DummyClass36.anIntArrayArrayArray2609[var8][1
                      + lightPosZ][var15])) {
                      break label565;
                    }
                  }

                  ++lightPosZ;
                }

                if (4 <= (1 + -lightPosY + lightPosZ) * (var14 - (lightMagnitude - 1))) {
                  var15 = AbstractGameWorld.heightMap[var8][lightPosY][lightMagnitude];
                  DummyClass10.method2263(4, lightPosY * 128, 128 * lightPosZ - -128,
                    lightMagnitude * 128, 128 + 128 * var14, var15, var15);

                  for (var16 = lightPosY; lightPosZ >= var16; ++var16) {
                    for (var44 = lightMagnitude; var14 >= var44; ++var44) {
                      DummyClass36.anIntArrayArrayArray2609[var8][var16][var44] =
                        ClientScript.bitAnd(
                          DummyClass36.anIntArrayArrayArray2609[var8][var16][var44], -5);
                    }
                  }
                }
              }
            }
          }
        }
      }

    } catch (RuntimeException var33) {
      throw AbstractGameWorld.cascadeException(var33,
        "di.K(" + (collisionMaps != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ')');
    }
  }

  static final boolean method2191(int var0, int var1, int var2, int var3, int var4, int var5,
                                  int var6, int var7, boolean var8, int var9, int var10,
                                  int var11) {
    try {
      int var12;
      int var13;
      for (var12 = 0; -105 < ~var12; ++var12) {
        for (var13 = 0; -105 < ~var13; ++var13) {
          DummyClass51.anIntArrayArray1160[var12][var13] = 0;
          TriChromaticImageCache.anIntArrayArray1373[var12][var13] = 99999999;
        }
      }

      var12 = var2;
      DummyClass51.anIntArrayArray1160[var2][var10] = 99;
      var13 = var10;
      TriChromaticImageCache.anIntArrayArray1373[var2][var10] = 0;
      byte var14 = 0;
      boolean var16 = false;
      if (var3 != -1001) {
        return false;
      } else {
        int var15 = 0;
        TextureSampler38.anIntArray3456[var14] = var2;
        int var27 = var14 + 1;
        DummyClass38.anIntArray729[var14] = var10;
        int[][] var17 =
          BlockConfig.collisionMaps[GameWorldSomething.currentPlane].anIntArrayArray1304;

        int var18;
        while (~var27 != ~var15) {
          var13 = DummyClass38.anIntArray729[var15];
          var12 = TextureSampler38.anIntArray3456[var15];
          var15 = 4095 & var15 + 1;
          if (var12 == var0 && var13 == var4) {
            var16 = true;
            break;
          }

          if (~var9 != -1) {
            if ((~var9 > -6 || 10 == var9)
              && BlockConfig.collisionMaps[GameWorldSomething.currentPlane].method1488(var4, var12,
              false, var13, var0, var9 + -1, 1, var7)) {
              var16 = true;
              break;
            }

            if (-11 < ~var9
              && BlockConfig.collisionMaps[GameWorldSomething.currentPlane].method1492(var4,
              -1 + var9, var0, var13, 1, var7, var12, 95)) {
              var16 = true;
              break;
            }
          }

          if (var11 != 0 && 0 != var6
            && BlockConfig.collisionMaps[GameWorldSomething.currentPlane].method1498(true, var0,
            var13, var12, 1, var11, var1, var4, var6)) {
            var16 = true;
            break;
          }

          var18 = 1 + TriChromaticImageCache.anIntArrayArray1373[var12][var13];
          if (0 < var12 && DummyClass51.anIntArrayArray1160[var12 + -1][var13] == 0
            && ~(19661064 & var17[var12 + -1][var13]) == -1) {
            TextureSampler38.anIntArray3456[var27] = -1 + var12;
            DummyClass38.anIntArray729[var27] = var13;
            var27 = var27 - -1 & 4095;
            DummyClass51.anIntArrayArray1160[-1 + var12][var13] = 2;
            TriChromaticImageCache.anIntArrayArray1373[-1 + var12][var13] = var18;
          }

          if (103 > var12 && DummyClass51.anIntArrayArray1160[var12 + 1][var13] == 0 && -1 == ~(
            var17[var12 + 1][var13] & 19661184)) {
            TextureSampler38.anIntArray3456[var27] = var12 - -1;
            DummyClass38.anIntArray729[var27] = var13;
            var27 = 1 + var27 & 4095;
            DummyClass51.anIntArrayArray1160[var12 - -1][var13] = 8;
            TriChromaticImageCache.anIntArrayArray1373[1 + var12][var13] = var18;
          }

          if (~var13 < -1 && -1 == ~DummyClass51.anIntArrayArray1160[var12][var13 - 1] && -1 == ~(
            19661058 & var17[var12][-1 + var13])) {
            TextureSampler38.anIntArray3456[var27] = var12;
            DummyClass38.anIntArray729[var27] = -1 + var13;
            DummyClass51.anIntArrayArray1160[var12][var13 - 1] = 1;
            var27 = var27 + 1 & 4095;
            TriChromaticImageCache.anIntArrayArray1373[var12][-1 + var13] = var18;
          }

          if (103 > var13 && ~DummyClass51.anIntArrayArray1160[var12][1 + var13] == -1 && -1 == ~(
            19661088 & var17[var12][var13 + 1])) {
            TextureSampler38.anIntArray3456[var27] = var12;
            DummyClass38.anIntArray729[var27] = var13 - -1;
            var27 = 1 + var27 & 4095;
            DummyClass51.anIntArrayArray1160[var12][1 + var13] = 4;
            TriChromaticImageCache.anIntArrayArray1373[var12][var13 - -1] = var18;
          }

          if (~var12 < -1 && ~var13 < -1
            && ~DummyClass51.anIntArrayArray1160[-1 + var12][var13 - 1] == -1
            && ~(var17[var12 - 1][-1 + var13] & 19661070) == -1
            && ~(19661064 & var17[var12 - 1][var13]) == -1
            && (19661058 & var17[var12][-1 + var13]) == 0) {
            TextureSampler38.anIntArray3456[var27] = -1 + var12;
            DummyClass38.anIntArray729[var27] = var13 + -1;
            var27 = 1 + var27 & 4095;
            DummyClass51.anIntArrayArray1160[-1 + var12][-1 + var13] = 3;
            TriChromaticImageCache.anIntArrayArray1373[var12 - 1][var13 + -1] = var18;
          }

          if (~var12 > -104 && 0 < var13 && -1 == ~DummyClass51.anIntArrayArray1160[var12 - -1][
            var13 - 1] && 0 == (19661187 & var17[var12 - -1][-1 + var13]) && -1 == ~(19661184
            & var17[var12 - -1][var13]) && -1 == ~(19661058 & var17[var12][-1 + var13])) {
            TextureSampler38.anIntArray3456[var27] = var12 + 1;
            DummyClass38.anIntArray729[var27] = -1 + var13;
            var27 = 4095 & var27 + 1;
            DummyClass51.anIntArrayArray1160[1 + var12][var13 + -1] = 9;
            TriChromaticImageCache.anIntArrayArray1373[var12 - -1][-1 + var13] = var18;
          }

          if (0 < var12 && -104 < ~var13 && 0 == DummyClass51.anIntArrayArray1160[var12 + -1][var13
            + 1] && 0 == (19661112 & var17[var12 + -1][1 + var13]) && 0 == (var17[var12 + -1][var13]
            & 19661064) && -1 == ~(19661088 & var17[var12][1 + var13])) {
            TextureSampler38.anIntArray3456[var27] = var12 - 1;
            DummyClass38.anIntArray729[var27] = 1 + var13;
            DummyClass51.anIntArrayArray1160[-1 + var12][var13 - -1] = 6;
            var27 = 4095 & 1 + var27;
            TriChromaticImageCache.anIntArrayArray1373[-1 + var12][1 + var13] = var18;
          }

          if (var12 < 103 && ~var13 > -104 && -1 == ~DummyClass51.anIntArrayArray1160[var12 - -1][1
            + var13] && (19661280 & var17[1 + var12][var13 + 1]) == 0
            && ~(var17[1 + var12][var13] & 19661184) == -1 && -1 == ~(19661088 & var17[var12][var13
            - -1])) {
            TextureSampler38.anIntArray3456[var27] = var12 + 1;
            DummyClass38.anIntArray729[var27] = var13 - -1;
            DummyClass51.anIntArrayArray1160[var12 + 1][1 + var13] = 12;
            var27 = var27 - -1 & 4095;
            TriChromaticImageCache.anIntArrayArray1373[1 + var12][var13 - -1] = var18;
          }
        }

        AbstractFrameRegulator.anInt1692 = 0;
        int var19;
        if (!var16) {
          if (!var8) {
            return false;
          }

          var18 = 1000;
          var19 = 100;
          byte var20 = 10;

          for (int var21 = var0 + -var20; var20 + var0 >= var21; ++var21) {
            for (int var22 = var4 + -var20; ~var22 >= ~(var4 - -var20); ++var22) {
              if (-1 >= ~var21 && ~var22 <= -1 && 104 > var21 && ~var22 > -105
                && 100 > TriChromaticImageCache.anIntArrayArray1373[var21][var22]) {
                int var24 = 0;
                if (~var22 > ~var4) {
                  var24 = var4 + -var22;
                } else if (var6 + var4 - 1 < var22) {
                  var24 = 1 + (-var4 - var6) + var22;
                }

                int var23 = 0;
                if (~var21 <= ~var0) {
                  if (~var21 < ~(-1 + var11 + var0)) {
                    var23 = 1 - var11 - (var0 - var21);
                  }
                } else {
                  var23 = var0 + -var21;
                }

                int var25 = var24 * var24 + var23 * var23;
                if (~var25 > ~var18 || ~var25 == ~var18
                  && TriChromaticImageCache.anIntArrayArray1373[var21][var22] < var19) {
                  var13 = var22;
                  var18 = var25;
                  var12 = var21;
                  var19 = TriChromaticImageCache.anIntArrayArray1373[var21][var22];
                }
              }
            }
          }

          if (-1001 == ~var18) {
            return false;
          }

          if (var2 == var12 && ~var13 == ~var10) {
            return false;
          }

          AbstractFrameRegulator.anInt1692 = 1;
        }

        byte var28 = 0;
        TextureSampler38.anIntArray3456[var28] = var12;
        var15 = var28 + 1;
        DummyClass38.anIntArray729[var28] = var13;

        for (
          var18 = var19 = DummyClass51.anIntArrayArray1160[var12][var13];
          var2 != var12 || var13 != var10; var18 = DummyClass51.anIntArrayArray1160[var12][var13]) {
          if (var19 != var18) {
            var19 = var18;
            TextureSampler38.anIntArray3456[var15] = var12;
            DummyClass38.anIntArray729[var15++] = var13;
          }

          if (~(var18 & 2) == -1) {
            if (0 != (8 & var18)) {
              --var12;
            }
          } else {
            ++var12;
          }

          if (~(1 & var18) == -1) {
            if (0 != (4 & var18)) {
              --var13;
            }
          } else {
            ++var13;
          }
        }

        if (-1 > ~var15) {
          TextureSampler7.method299(100, var15, var5);
          return true;
        } else {
          return -2 != ~var5;
        }
      }
    } catch (RuntimeException var26) {
      throw AbstractGameWorld.cascadeException(var26,
        "di.J(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6
          + ',' + var7 + ',' + var8 + ',' + var9 + ',' + var10 + ',' + var11 + ')');
    }
  }

  static final void method2192(int var0) {
    try {
      if (var0 > -26) {
        method2191(-54, -79, 96, 36, -65, 4, -120, 29, false, -60, -74, 43);
      }

      DummyClass14.aClass93_1955.method1523((byte) -110);
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "di.M(" + var0 + ')');
    }
  }

}
