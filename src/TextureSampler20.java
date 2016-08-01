import java.awt.Point;
import java.io.IOException;

final class TextureSampler20 extends AbstractTextureSampler {

  static GameString aClass94_3146 = SpawnedGameObject.createString(" s(West connect-B)3");
  static int usageMode = 0;
  static GameString aClass94_3150 = SpawnedGameObject.createString("null");
  static int anInt3151;
  static GameString COMMAND_GC = SpawnedGameObject.createString("::gc");
  static int yawCosine;
  static FileUnpacker aClass153_3154;
  static int anInt3155;
  static int anInt3156 = -1;
  static GameString aClass94_3157 =
    SpawnedGameObject.createString(" est d-Bj-9 dans votre liste noire)3");
  private int anInt3147 = 4;
  private int anInt3149 = 4;


  public TextureSampler20() {
    super(1, false);
  }

  final int[] method154(int var1, byte var2) {
    try {
      int var3 = 39 % ((30 - var2) / 36);
      int[] var10 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        int var5 = SomethingLight0.anInt1559 / this.anInt3149;
        int var6 = DummyClass55.anInt1427 / this.anInt3147;
        int[] var4;
        int var7;
        if (-1 <= ~var6) {
          var4 = this.method152(0, 0, 32755);
        } else {
          var7 = var1 % var6;
          var4 = this.method152(0, DummyClass55.anInt1427 * var7 / var6, 32755);
        }

        for (var7 = 0; var7 < SomethingLight0.anInt1559; ++var7) {
          if (0 >= var5) {
            var10[var7] = var4[0];
          } else {
            int var8 = var7 % var5;
            var10[var7] = var4[SomethingLight0.anInt1559 * var8 / var5];
          }
        }
      }

      return var10;
    } catch (RuntimeException var9) {
      throw AbstractGameWorld.cascadeException(var9, "gg.D(" + var1 + ',' + var2 + ')');
    }
  }

  final void parseConfig(int var1, Buffer var2, boolean var3) {
    try {
      if (!var3) {
        usageMode = -117;
      }

      if (~var1 == -1) {
        this.anInt3149 = var2.readUnsignedByte();
      } else if (1 == var1) {
        this.anInt3147 = var2.readUnsignedByte();
      }

    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "gg.A(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
    }
  }

  final int[][] method166(int var1, int var2) {
    try {
      if (var1 != -1) {
        return null;
      } else {
        int[][] var3 = this.triChromaticImageCache.method1594((byte) -123, var2);
        if (this.triChromaticImageCache.aBoolean1379) {
          int var5 = SomethingLight0.anInt1559 / this.anInt3149;
          int var6 = DummyClass55.anInt1427 / this.anInt3147;
          int[][] var4;
          if (var6 > 0) {
            int var7 = var2 % var6;
            var4 = this.method162(var7 * DummyClass55.anInt1427 / var6, 0, (byte) -109);
          } else {
            var4 = this.method162(0, 0, (byte) -120);
          }

          int[] var17 = var4[0];
          int[] var9 = var4[2];
          int[] var10 = var3[0];
          int[] var8 = var4[1];
          int[] var11 = var3[1];
          int[] var12 = var3[2];

          for (int var13 = 0; ~var13 > ~SomethingLight0.anInt1559; ++var13) {
            int var14;
            if (var5 <= 0) {
              var14 = 0;
            } else {
              int var15 = var13 % var5;
              var14 = var15 * SomethingLight0.anInt1559 / var5;
            }

            var10[var13] = var17[var14];
            var11[var13] = var8[var14];
            var12[var13] = var9[var14];
          }
        }

        return var3;
      }
    } catch (RuntimeException var16) {
      throw AbstractGameWorld.cascadeException(var16, "gg.T(" + var1 + ',' + var2 + ')');
    }
  }

  static final void method229(int var0, int var1) {
    try {
      if (!DummyClass4.aBoolean3004) {
        var0 = -1;
      }

      if (var1 == 20827) {
        if (var0 != DummyClass45.anInt991) {
          if (~var0 != 0) {
            Cursor var2 = TextureSampler3.method311(var0, 5);
            SoftwareDirectColorSprite var3 = var2.method1179((byte) 95);
            if (null != var3) {
              DummyClass35.signLink.method1434(var3.method655(), 10000, var3.anInt3697,
                InventoryConfig.canvas, new Point(var2.anInt881, var2.anInt879), var3.anInt3706);
              DummyClass45.anInt991 = var0;
            } else {
              var0 = -1;
            }
          }

          if (0 == ~var0 && ~DummyClass45.anInt991 != 0) {
            DummyClass35.signLink.method1434(null, 10000, -1, InventoryConfig.canvas, new Point(),
              -1);
            DummyClass45.anInt991 = -1;
          }

        }
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "gg.C(" + var0 + ',' + var1 + ')');
    }
  }

  static final void method230(int[][] var0, boolean var1) {
    try {
      DummyClass35.anIntArrayArray663 = var0;
      if (!var1) {
        method234(20);
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "gg.Q(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

  static final IdentityKit getIdentityKit(int var0, int var1) {
    try {
      IdentityKit var2 = (IdentityKit) Mobile.aClass93_2792.get((long) var0);
      if (var2 == null) {
        byte[] var3 = DummyClass2.aClass153_1680.getBytes(3, var0);
        var2 = new IdentityKit();
        if (null != var3) {
          var2.method952(-31957, new Buffer(var3));
        }

        Mobile.aClass93_2792.get((byte) -89, var2, (long) var0);
        if (var1 != 0) {
          aClass153_3154 = null;
        }

        return var2;
      } else {
        return var2;
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "gg.B(" + var0 + ',' + var1 + ')');
    }
  }

  static final void method232(int var0, int var1) {
    try {
      if (ComponentCanvas.method57(var0, 104)) {
        Widget[] var2 = SceneNode.aClass11ArrayArray1834[var0];

        for (int var3 = 0; ~var2.length < ~var3; ++var3) {
          Widget var4 = var2[var3];
          if (null != var4) {
            var4.anInt260 = 1;
            var4.anInt283 = 0;
            var4.anInt267 = 0;
          }
        }

        if (var1 != 16182) {
          method229(25, -86);
        }

      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5, "gg.E(" + var0 + ',' + var1 + ')');
    }
  }

  static final void setRunesFileId(FileUnpacker var1) {
    try {
      NPC.runesFileId = var1.getFileId(BZipDecompressorState.FILE_RUNES);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "gg.R(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  public static void method234(int var0) {
    try {
      aClass94_3157 = null;
      aClass94_3150 = null;
      if (var0 != -3) {
        setRunesFileId(null);
      }

      aClass94_3146 = null;
      aClass153_3154 = null;
      COMMAND_GC = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "gg.O(" + var0 + ')');
    }
  }

  static final void method235(boolean var0) {
    try {
      if (-1 > ~DummyClass13.anInt2023) {
        --DummyClass13.anInt2023;
      }

      if (~DummyClass36.updateTime < -2) {
        --DummyClass36.updateTime;
        Projectile.anInt2905 = TextureSampler23.anInt3213;
      }

      if (GlTexture2d.aBoolean3769) {
        GlTexture2d.aBoolean3769 = false;
        TextureSampler5.method289(false);
      } else {
        int var1;
        for (var1 = 0; ~var1 > -101 && TextureSampler33.parsePacket(-15450); var1++) {
        }

        if (DummyClass15.state == 30) {
          DummyClass8.method2226(TextureSampler12.secureBuffer, 163, -116);
          Object var14 = DisplayMode.aClass67_1443.anObject1016;
          int var2;
          int var3;
          int var4;
          int var5;
          int var6;
          int var8;
          int var9;
          synchronized (var14) {
            if (ComponentCanvas.aBoolean29) {
              if (Structure.anInt3644 != 0 || DisplayMode.aClass67_1443.anInt1018 >= 40) {
                ++GameString.anInt2145;
                TextureSampler12.secureBuffer.writePacket(123);
                var3 = 0;
                TextureSampler12.secureBuffer.writeByte(0);
                var2 = TextureSampler12.secureBuffer.position;

                for (
                  var4 = 0; DisplayMode.aClass67_1443.anInt1018 > var4
                  && ~(TextureSampler12.secureBuffer.position - var2) > -241; ++var4) {
                  ++var3;
                  var5 = DisplayMode.aClass67_1443.anIntArray1019[var4];
                  var6 = DisplayMode.aClass67_1443.anIntArray1020[var4];
                  if (-1 < ~var5) {
                    var5 = 0;
                  } else if (-65535 > ~var5) {
                    var5 = '\ufffe';
                  }

                  if (var6 >= 0) {
                    if ('\ufffe' < var6) {
                      var6 = '\ufffe';
                    }
                  } else {
                    var6 = 0;
                  }

                  boolean var7 = false;
                  if (DisplayMode.aClass67_1443.anIntArray1019[var4] == -1
                    && 0 == ~DisplayMode.aClass67_1443.anIntArray1020[var4]) {
                    var7 = true;
                    var5 = -1;
                    var6 = -1;
                  }

                  if (AbstractAudioOutputStream.anInt1977 == var6 && var5 == DummyCanvas.anInt14) {
                    if (2047 > MonoChromaticImageBuffer.anInt2556) {
                      ++MonoChromaticImageBuffer.anInt2556;
                    }
                  } else {
                    var8 = -AbstractAudioOutputStream.anInt1977 + var6;
                    AbstractAudioOutputStream.anInt1977 = var6;
                    var9 = var5 + -DummyCanvas.anInt14;
                    DummyCanvas.anInt14 = var5;
                    if (~MonoChromaticImageBuffer.anInt2556 > -9 && var8 >= -32 && 31 >= var8
                      && -32 <= var9 && var9 <= 31) {
                      var9 += 32;
                      var8 += 32;
                      TextureSampler12.secureBuffer.writeShort(
                        var9 + (MonoChromaticImageBuffer.anInt2556 << 12) + (var8 << 6));
                      MonoChromaticImageBuffer.anInt2556 = 0;
                    } else if (MonoChromaticImageBuffer.anInt2556 < 32 && 127 >= ~var8
                      && -128 <= ~var8 && var9 >= -128 && var9 <= 127) {
                      TextureSampler12.secureBuffer.writeByte(
                        128 - -MonoChromaticImageBuffer.anInt2556);
                      var9 += 128;
                      var8 += 128;
                      TextureSampler12.secureBuffer.writeShort((var8 << 8) + var9);
                      MonoChromaticImageBuffer.anInt2556 = 0;
                    } else if (32 > MonoChromaticImageBuffer.anInt2556) {
                      TextureSampler12.secureBuffer.writeByte(
                        192 - -MonoChromaticImageBuffer.anInt2556);
                      if (var7) {
                        TextureSampler12.secureBuffer.writeInt(Integer.MIN_VALUE);
                      } else {
                        TextureSampler12.secureBuffer.writeInt(var6 | var5 << 16);
                      }

                      MonoChromaticImageBuffer.anInt2556 = 0;
                    } else {
                      TextureSampler12.secureBuffer.writeShort(
                        MonoChromaticImageBuffer.anInt2556 + '\ue000');
                      if (var7) {
                        TextureSampler12.secureBuffer.writeInt(Integer.MIN_VALUE);
                      } else {
                        TextureSampler12.secureBuffer.writeInt(var6 | var5 << 16);
                      }

                      MonoChromaticImageBuffer.anInt2556 = 0;
                    }
                  }
                }

                TextureSampler12.secureBuffer.method769((byte) -126,
                  -var2 + TextureSampler12.secureBuffer.position);
                if (~DisplayMode.aClass67_1443.anInt1018 < ~var3) {
                  DisplayMode.aClass67_1443.anInt1018 -= var3;

                  for (var4 = 0; DisplayMode.aClass67_1443.anInt1018 > var4; ++var4) {
                    DisplayMode.aClass67_1443.anIntArray1020[var4] =
                      DisplayMode.aClass67_1443.anIntArray1020[var3 + var4];
                    DisplayMode.aClass67_1443.anIntArray1019[var4] =
                      DisplayMode.aClass67_1443.anIntArray1019[var4 + var3];
                  }
                } else {
                  DisplayMode.aClass67_1443.anInt1018 = 0;
                }
              }
            } else {
              DisplayMode.aClass67_1443.anInt1018 = 0;
            }
          }

          if (-1 != ~Structure.anInt3644) {
            ++LightIntensity.anInt900;
            long var15 =
              (-AbstractIndexedColorSprite.aLong1465 + AbstractSomethingTexture.aLong1102) / 50L;
            var3 = DummyClass36.anInt2614;
            if (var3 >= 0) {
              if (var3 > '\uffff') {
                var3 = '\uffff';
              }
            } else {
              var3 = 0;
            }

            if (32767L < var15) {
              var15 = 32767L;
            }

            var4 = DummyClass5.anInt2993;
            AbstractIndexedColorSprite.aLong1465 = AbstractSomethingTexture.aLong1102;
            byte var19 = 0;
            if (~var4 <= -1) {
              if (var4 > '\uffff') {
                var4 = '\uffff';
              }
            } else {
              var4 = 0;
            }

            var6 = (int) var15;
            if (-3 == ~Structure.anInt3644) {
              var19 = 1;
            }

            TextureSampler12.secureBuffer.writePacket(75);
            TextureSampler12.secureBuffer.method765(var19 << 15 | var6, (byte) 3);
            TextureSampler12.secureBuffer.method759(-105, var4 | var3 << 16);
          }

          if (0 < WidgetAccess.anInt2212) {
            --WidgetAccess.anInt2212;
          }

          if (AudioWorker.aBoolean346) {
            for (var1 = 0; ~var1 > ~SomethingOtherWorldMap.anInt2537; ++var1) {
              var2 = SomethingPacket116.anIntArray1755[var1];
              if (98 == var2 || -100 == ~var2 || -97 == ~var2 || var2 == 97) {
                OndemandFileRequest.aBoolean4068 = true;
                break;
              }
            }
          } else if (GameObjectConfig.aBooleanArray1490[96]
            || GameObjectConfig.aBooleanArray1490[97] || GameObjectConfig.aBooleanArray1490[98]
            || GameObjectConfig.aBooleanArray1490[99]) {
            OndemandFileRequest.aBoolean4068 = true;
          }

          if (OndemandFileRequest.aBoolean4068 && 0 >= WidgetAccess.anInt2212) {
            WidgetAccess.anInt2212 = 20;
            OndemandFileRequest.aBoolean4068 = false;
            ++SomethingPacket116.anInt1756;
            TextureSampler12.secureBuffer.writePacket(21);
            TextureSampler12.secureBuffer.method783(AreaSoundEffect.anInt2309, -268435456);
            TextureSampler12.secureBuffer.writeShortLE(-1, SpotAnimationConfig.anInt531);
          }

          if (!TextureSampler26.focused != var0 && !Mobile.aBoolean2774) {
            ++TextureSampler17.anInt3187;
            Mobile.aBoolean2774 = true;
            TextureSampler12.secureBuffer.writePacket(22);
            TextureSampler12.secureBuffer.writeByte(1);
          }

          if (!TextureSampler26.focused && Mobile.aBoolean2774) {
            ++TextureSampler17.anInt3187;
            Mobile.aBoolean2774 = false;
            TextureSampler12.secureBuffer.writePacket(22);
            TextureSampler12.secureBuffer.writeByte(0);
          }

          if (!StillGraphic.aBoolean2705) {
            ++ClientScriptEnum.anInt3659;
            TextureSampler12.secureBuffer.writePacket(98);
            TextureSampler12.secureBuffer.writeInt(DummyClass51.getSettings());
            StillGraphic.aBoolean2705 = true;
          }

          DummyClass9.method2214(0);
          if (DummyClass15.state == 30) {
            Mouse.method2087((byte) -82);
            DummyClass27.method1713((byte) -91);
            ClassCheckRequest.method132((byte) -92);
            ++AbstractDirectColorSprite.anInt3699;
            if (AbstractDirectColorSprite.anInt3699 > 750) {
              TextureSampler5.method289(false);
            } else {
              DummyClass35.method1028(-102);
              DummyClass44.method1207(-72);
              TextureSampler34.method189((byte) -62);
              if (SomethingWorldMapy.aClass11_3551 != null) {
                BZipDecompressorState.method848(4);
              }

              for (
                var1 = SomethingInScenePacket202.method115(true, -1);
                ~var1 != 0; var1 = SomethingInScenePacket202.method115(false, -1)) {
                DummyClass39.method1087(40, var1);
                AbstractGameWorld.anIntArray726[ClientScript.bitAnd(HuffmanEncoder.anInt641++,
                  31)] = var1;
              }

              int var22;
              for (WidgetUpdate var16 = FileCacheRequester.method1302((byte) -36);
                   var16 != null; var16 = FileCacheRequester.method1302((byte) -36)) {
                var3 = var16.e(2063817568);
                var4 = var16.f((byte) 117);
                if (1 == var3) {
                  NpcConfiguration.anIntArray1277[var4] = var16.anInt3598;
                  NPC.anIntArray3986[ClientScript.bitAnd(31, DummyClass18.anInt87++)] = var4;
                } else if (var3 == 2) {
                  DummyClass22.aClass94Array1739[var4] = var16.text;
                  DummyClass8.anIntArray4025[ClientScript.bitAnd(31, AreaSoundEffect.anInt2317++)] =
                    var4;
                } else {
                  Widget var20;
                  if (~var3 != -4) {
                    if (~var3 == -5) {
                      var20 = EnumStringFetcher.getWidget((byte) 109, var4);
                      var6 = var16.anInt3598;
                      var8 = var16.anInt3596;
                      var22 = var16.anInt3597;
                      if (var20.anInt202 != var6 || ~var20.anInt201 != ~var22
                        || var8 != var20.anInt265) {
                        var20.anInt201 = var22;
                        var20.anInt265 = var8;
                        var20.anInt202 = var6;
                        DummyClass29.method909(120, var20);
                      }
                    } else if (-6 == ~var3) {
                      var20 = EnumStringFetcher.getWidget((byte) 117, var4);
                      if (~var20.anInt305 != ~var16.anInt3598 || ~var16.anInt3598 == 0) {
                        var20.anInt260 = 1;
                        var20.anInt267 = 0;
                        var20.anInt305 = var16.anInt3598;
                        var20.anInt283 = 0;
                        DummyClass29.method909(-117, var20);
                      }
                    } else if (-7 != ~var3) {
                      if (~var3 != -8) {
                        if (~var3 != -9) {
                          if (var3 != 9) {
                            if (-11 == ~var3) {
                              var20 = EnumStringFetcher.getWidget((byte) 121, var4);
                              if (~var20.anInt258 != ~var16.anInt3598
                                || ~var16.anInt3597 != ~var20.anInt264
                                || var20.rotationZ != var16.anInt3596) {
                                var20.anInt264 = var16.anInt3597;
                                var20.rotationZ = var16.anInt3596;
                                var20.anInt258 = var16.anInt3598;
                                DummyClass29.method909(-69, var20);
                              }
                            } else if (-12 == ~var3) {
                              var20 = EnumStringFetcher.getWidget((byte) 124, var4);
                              var20.anInt306 = var20.anInt316 = var16.anInt3598;
                              var20.aByte273 = 0;
                              var20.aByte162 = 0;
                              var20.anInt210 = var20.anInt166 = var16.anInt3597;
                              DummyClass29.method909(110, var20);
                            } else if (~var3 == -13) {
                              var20 = EnumStringFetcher.getWidget((byte) 116, var4);
                              var6 = var16.anInt3598;
                              if (null != var20 && 0 == var20.anInt187) {
                                if (var6 > var20.anInt252 + -var20.anInt193) {
                                  var6 = var20.anInt252 + -var20.anInt193;
                                }

                                if (0 > var6) {
                                  var6 = 0;
                                }

                                if (var6 != var20.anInt208) {
                                  var20.anInt208 = var6;
                                  DummyClass29.method909(-71, var20);
                                }
                              }
                            } else if (-14 == ~var3) {
                              var20 = EnumStringFetcher.getWidget((byte) 124, var4);
                              var20.anInt237 = var16.anInt3598;
                            }
                          } else {
                            var20 = EnumStringFetcher.getWidget((byte) 119, var4);
                            if (~var16.anInt3598 != ~var20.anInt192
                              || var20.anInt271 != var16.anInt3597) {
                              var20.anInt192 = var16.anInt3598;
                              var20.anInt271 = var16.anInt3597;
                              DummyClass29.method909(127, var20);
                            }
                          }
                        } else {
                          var20 = EnumStringFetcher.getWidget((byte) 122, var4);
                          if (var16.anInt3598 != var20.rotationX0
                            || var20.rotationY != var16.anInt3597
                            || ~var16.anInt3596 != ~var20.anInt164) {
                            var20.rotationX0 = var16.anInt3598;
                            var20.anInt164 = var16.anInt3596;
                            var20.rotationY = var16.anInt3597;
                            if (-1 != var20.anInt192) {
                              if (~var20.anInt184 >= -1) {
                                if (~var20.anInt177 < -1) {
                                  var20.anInt164 = 32 * var20.anInt164 / var20.anInt177;
                                }
                              } else {
                                var20.anInt164 = var20.anInt164 * 32 / var20.anInt184;
                              }
                            }

                            DummyClass29.method909(112, var20);
                          }
                        }
                      } else {
                        var20 = EnumStringFetcher.getWidget((byte) 124, var4);
                        boolean var24 = var16.anInt3598 == 1;
                        if (!var24 != !var20.aBoolean155) {
                          var20.aBoolean155 = var24;
                          DummyClass29.method909(119, var20);
                        }
                      }
                    } else {
                      var5 = var16.anInt3598;
                      var6 = (32195 & var5) >> 10;
                      var8 = var5 & 31;
                      var22 = (var5 & 1000) >> 5;
                      Widget var10 = EnumStringFetcher.getWidget((byte) 120, var4);
                      var9 = (var8 << 3) + (var22 << 11) + (var6 << 19);
                      if (~var9 != ~var10.anInt218) {
                        var10.anInt218 = var9;
                        DummyClass29.method909(123, var10);
                      }
                    }
                  } else {
                    var20 = EnumStringFetcher.getWidget((byte) 118, var4);
                    if (!var16.text.method1528((byte) -42, var20.aClass94_232)) {
                      var20.aClass94_232 = var16.text;
                      DummyClass29.method909(107, var20);
                    }
                  }
                }
              }

              if (HuffmanEncoder.anInt638 != 0) {
                FileRequester.anInt2958 += 20;
                if (400 <= FileRequester.anInt2958) {
                  HuffmanEncoder.anInt638 = 0;
                }
              }

              ++DisplayMode.loopCycle;
              if (AbstractFileRequester.aClass11_1933 != null) {
                ++AreaSoundEffect.anInt2330;
                if (15 <= AreaSoundEffect.anInt2330) {
                  DummyClass29.method909(-30, AbstractFileRequester.aClass11_1933);
                  AbstractFileRequester.aClass11_1933 = null;
                }
              }

              Widget var17;
              if (MouseRecorder.aClass11_1017 != null) {
                DummyClass29.method909(117, MouseRecorder.aClass11_1017);
                if (~(5 + MilliFrameRegulator.anInt2693) > ~SomethingTilek.anInt1676
                  || SomethingTilek.anInt1676 < -5 + MilliFrameRegulator.anInt2693
                  || ~(DummyInputStream.anInt40 + 5) > ~HashTable.anInt1709
                  || -5 + DummyInputStream.anInt40 > HashTable.anInt1709) {
                  SomethingScene.aBoolean1074 = true;
                }

                ++DummyClass59.anInt677;
                if (0 == TextureSampler21.anInt3069) {
                  if (SomethingScene.aBoolean1074 && 5 <= DummyClass59.anInt677) {
                    if (MouseRecorder.aClass11_1017 == DummyClass54.aClass11_1402
                      && DummyClass18.anInt86 != StillGraphic.anInt2701) {
                      ++SomethingOtherWorldMap.anInt2541;
                      var17 = MouseRecorder.aClass11_1017;
                      byte var18 = 0;
                      if (1 == DummyCanvas.anInt15 && 206 == var17.anInt189) {
                        var18 = 1;
                      }

                      if (var17.anIntArray254[StillGraphic.anInt2701] <= 0) {
                        var18 = 0;
                      }

                      if (!GameClient.method44(var17).method93(572878952)) {
                        if (~var18 == -2) {
                          var6 = StillGraphic.anInt2701;
                          var5 = DummyClass18.anInt86;

                          while (var6 != var5) {
                            if (var5 > var6) {
                              var17.method864(-1 + var5, var5, -71);
                              --var5;
                            } else if (~var6 < ~var5) {
                              var17.method864(1 + var5, var5, -95);
                              ++var5;
                            }
                          }
                        } else {
                          var17.method864(StillGraphic.anInt2701, DummyClass18.anInt86, -93);
                        }
                      } else {
                        var5 = DummyClass18.anInt86;
                        var6 = StillGraphic.anInt2701;
                        var17.anIntArray254[var6] = var17.anIntArray254[var5];
                        var17.anIntArray317[var6] = var17.anIntArray317[var5];
                        var17.anIntArray254[var5] = -1;
                        var17.anIntArray317[var5] = 0;
                      }

                      TextureSampler12.secureBuffer.writePacket(231);
                      TextureSampler12.secureBuffer.writeShort(DummyClass18.anInt86);
                      TextureSampler12.secureBuffer.method785(MouseRecorder.aClass11_1017.anInt279,
                        (byte) -125);
                      TextureSampler12.secureBuffer.method783(StillGraphic.anInt2701, -268435456);
                      TextureSampler12.secureBuffer.method743(10213, var18);
                    }
                  } else if ((-2 == ~OndemandRequester.anInt998 || TextureSampler8.method353(
                    -1 + TextureSampler25.amountContextActions, 0))
                    && TextureSampler25.amountContextActions > 2) {
                    DummyClass22.method1801((byte) -116);
                  } else if (-1 > ~TextureSampler25.amountContextActions) {
                    TextureSampler9.method203(56);
                  }

                  Structure.anInt3644 = 0;
                  AreaSoundEffect.anInt2330 = 10;
                  MouseRecorder.aClass11_1017 = null;
                }
              }

              DummyClass52.aBoolean1167 = false;
              DummyClass32.aClass11_526 = null;
              DummyClass60.aBoolean440 = false;
              SomethingOtherWorldMap.anInt2537 = 0;
              var17 = DummyClass56.aClass11_1453;
              DummyClass56.aClass11_1453 = null;
              Widget var21 = DummyClass29.aClass11_439;

              for (
                DummyClass29.aClass11_439 = null; FileCacheRequest.hasKeyInput()
                && 128 > SomethingOtherWorldMap.anInt2537; ++SomethingOtherWorldMap.anInt2537) {
                SomethingPacket116.anIntArray1755[SomethingOtherWorldMap.anInt2537] =
                  Parameter.anInt3624;
                FaceNormal.anIntArray1638[SomethingOtherWorldMap.anInt2537] =
                  TextureSampler7.anInt3342;
              }

              SomethingWorldMapy.aClass11_3551 = null;
              if (0 != ~InventoryConfig.anInt3655) {
                SpotAnimationConfig.method967(0, 0, 2, 0, DummyClass30.viewWidth,
                  InventoryConfig.anInt3655, 0, GroundItem.viewHeight);
              }

              ++TextureSampler23.anInt3213;

              while (true) {
                ClientScriptCall var26 =
                  (ClientScriptCall) DummyClass18.aClass61_82.method1220((byte) -3);
                Widget var23;
                Widget var25;
                if (var26 == null) {
                  while (true) {
                    var26 = (ClientScriptCall) DummyClass45.aClass61_983.method1220((byte) -3);
                    if (var26 == null) {
                      while (true) {
                        var26 = (ClientScriptCall) DummyClass31.aClass61_1471.method1220((byte) -3);
                        if (var26 == null) {
                          if (SomethingWorldMapy.aClass11_3551 == null) {
                            ClanChatUser.anInt2475 = 0;
                          }

                          if (DummyClass42.aClass11_886 != null) {
                            DummyClass18.method829(-1);
                          }

                          if (~TextureSampler35.rights < -1
                            && GameObjectConfig.aBooleanArray1490[82]
                            && GameObjectConfig.aBooleanArray1490[81]
                            && 0 != PlayerVariable.mouseWheelOffset) {
                            var5 =
                              GameWorldSomething.currentPlane - PlayerVariable.mouseWheelOffset;
                            if (0 > var5) {
                              var5 = 0;
                            } else if (var5 > 3) {
                              var5 = 3;
                            }

                            BufferedFile.method979(
                              TextureCache.localPlayer.waypointsX[0] + WorldMapLabel.anInt1716,
                              TextureCache.localPlayer.waypointsY[0] + ProceduralTexture.anInt1152,
                              var5, (byte) -4);
                          }

                          if (TextureSampler35.rights > 0 && GameObjectConfig.aBooleanArray1490[82]
                            && GameObjectConfig.aBooleanArray1490[81]) {
                            if (-1 != DummyClass32.anInt515) {
                              BufferedFile.method979(
                                WorldMapLabel.anInt1716 + DummyClass32.anInt515,
                                ProceduralTexture.anInt1152 - -OndemandRequester.anInt999,
                                GameWorldSomething.currentPlane, (byte) -4);
                            }

                            GameObjectConfig.anInt1521 = 0;
                            ClientScriptCall.anInt2440 = 0;
                          } else if (-3 == ~ClientScriptCall.anInt2440) {
                            if (~DummyClass32.anInt515 != 0) {
                              TextureSampler12.secureBuffer.writePacket(131);
                              ++SomethingTexture3.anInt2651;
                              TextureSampler12.secureBuffer.method759(-123, ScriptState.anInt872);
                              TextureSampler12.secureBuffer.method783(
                                WorldMapLabel.anInt1716 + DummyClass32.anInt515, -268435456);
                              TextureSampler12.secureBuffer.method765(Widget.anInt278, (byte) 3);
                              TextureSampler12.secureBuffer.method783(
                                OndemandRequester.anInt999 + ProceduralTexture.anInt1152,
                                -268435456);
                              HuffmanEncoder.anInt638 = 1;
                              FileRequester.anInt2958 = 0;
                              FileCacheRequest.anInt4062 = DummyClass36.anInt2614;
                              SceneSomething2.anInt1053 = DummyClass5.anInt2993;
                            }

                            ClientScriptCall.anInt2440 = 0;
                          } else if (2 == GameObjectConfig.anInt1521) {
                            if (-1 != DummyClass32.anInt515) {
                              TextureSampler12.secureBuffer.writePacket(179);
                              TextureSampler12.secureBuffer.writeShort(
                                ProceduralTexture.anInt1152 + OndemandRequester.anInt999);
                              ++TextureCache.anInt2130;
                              TextureSampler12.secureBuffer.writeShort(
                                DummyClass32.anInt515 + WorldMapLabel.anInt1716);
                              FileRequester.anInt2958 = 0;
                              HuffmanEncoder.anInt638 = 1;
                              SceneSomething2.anInt1053 = DummyClass5.anInt2993;
                              FileCacheRequest.anInt4062 = DummyClass36.anInt2614;
                            }

                            GameObjectConfig.anInt1521 = 0;
                          } else if (-1 != DummyClass32.anInt515 && 0 == ClientScriptCall.anInt2440
                            && GameObjectConfig.anInt1521 == 0) {
                            boolean var27 =
                              Parameter.method582(TextureCache.localPlayer.waypointsY[0], 0, 0,
                                true, 0, 2, DummyClass32.anInt515, 0, 0, 0,
                                OndemandRequester.anInt999, TextureCache.localPlayer.waypointsX[0]);
                            if (var27) {
                              FileCacheRequest.anInt4062 = DummyClass36.anInt2614;
                              FileRequester.anInt2958 = 0;
                              SceneSomething2.anInt1053 = DummyClass5.anInt2993;
                              HuffmanEncoder.anInt638 = 1;
                            }
                          }

                          DummyClass32.anInt515 = -1;
                          DummyClass5.method2211(-48);
                          if (DummyClass56.aClass11_1453 != var17) {
                            if (var17 != null) {
                              DummyClass29.method909(-52, var17);
                            }

                            if (null != DummyClass56.aClass11_1453) {
                              DummyClass29.method909(119, DummyClass56.aClass11_1453);
                            }
                          }

                          if (var21 != DummyClass29.aClass11_439
                            && ~TextureSampler35.anInt3323 == ~AbstractSomethingTexture.anInt1109) {
                            if (null != var21) {
                              DummyClass29.method909(112, var21);
                            }

                            if (null != DummyClass29.aClass11_439) {
                              DummyClass29.method909(-22, DummyClass29.aClass11_439);
                            }
                          }

                          if (DummyClass29.aClass11_439 == null) {
                            if (~AbstractSomethingTexture.anInt1109 < -1) {
                              --AbstractSomethingTexture.anInt1109;
                            }
                          } else if (AbstractSomethingTexture.anInt1109
                            < TextureSampler35.anInt3323) {
                            ++AbstractSomethingTexture.anInt1109;
                            if (TextureSampler35.anInt3323 == AbstractSomethingTexture.anInt1109) {
                              DummyClass29.method909(-48, DummyClass29.aClass11_439);
                            }
                          }

                          if (SomethingPacket116.anInt1753 == 1) {
                            Keyboard.method2086((byte) 68);
                          } else if (~SomethingPacket116.anInt1753 == -3) {
                            ClientScriptCall.method379(1024);
                          } else {
                            WidgetUpdate.d('\uffff');
                          }

                          for (var5 = 0; -6 < ~var5; ++var5) {
                            ++DummyClass9.anIntArray4009[var5];
                          }

                          var5 = ProceduralTexture.method1406((byte) -43);
                          var6 = TextureSampler32.method301((byte) -119);
                          if (~var5 < -15001 && -15001 > ~var6) {
                            DummyClass13.anInt2023 = 250;
                            DummyClass30.method940(112, 14500);
                            ++ObjectCache.anInt1330;
                            TextureSampler12.secureBuffer.writePacket(245);
                          }

                          if (AudioWorker.aClass64_351 != null
                            && AudioWorker.aClass64_351.status == 1) {
                            if (null != AudioWorker.aClass64_351.result) {
                              DummyClass54.method1596(TextureSampler5.aClass94_3295, (byte) 126,
                                GameString.aBoolean2154);
                            }

                            TextureSampler5.aClass94_3295 = null;
                            AudioWorker.aClass64_351 = null;
                            GameString.aBoolean2154 = false;
                          }

                          ++TextureSampler18.anInt4032;
                          ++Light.anInt716;
                          ++GameException.anInt2120;
                          if (GameException.anInt2120 > 500) {
                            GameException.anInt2120 = 0;
                            var22 = (int) (8.0D * Math.random());
                            if (-5 == ~(var22 & 4)) {
                              StringNode.anInt2589 += DummyHashTable.anInt1682;
                            }

                            if (-3 == ~(var22 & 2)) {
                              DummyInputStream.anInt42 += SceneGraphTile.anInt2217;
                            }

                            if (-2 == ~(var22 & 1)) {
                              TextureSampler19.anInt3216 += AbstractMouseWheel.anInt1901;
                            }
                          }

                          if (~Light.anInt716 < -501) {
                            Light.anInt716 = 0;
                            var22 = (int) (8.0D * Math.random());
                            if (-2 == ~(1 & var22)) {
                              TextureSampler9.anInt3102 += DummyOutputStream.anInt48;
                            }

                            if (~(2 & var22) == -3) {
                              Something3d2.anInt3020 += DummyCanvas.anInt25;
                            }
                          }

                          if (~TextureSampler19.anInt3216 > 49) {
                            AbstractMouseWheel.anInt1901 = 2;
                          }

                          if (59 < ~TextureSampler9.anInt3102) {
                            DummyOutputStream.anInt48 = 2;
                          }

                          if (~Something3d2.anInt3020 > 19) {
                            DummyCanvas.anInt25 = 1;
                          }

                          if (-55 > DummyInputStream.anInt42) {
                            SceneGraphTile.anInt2217 = 2;
                          }

                          if (DummyInputStream.anInt42 > 55) {
                            SceneGraphTile.anInt2217 = -2;
                          }

                          if (-40 > StringNode.anInt2589) {
                            DummyHashTable.anInt1682 = 1;
                          }

                          if (TextureSampler19.anInt3216 > 50) {
                            AbstractMouseWheel.anInt1901 = -2;
                          }

                          if (~StringNode.anInt2589 < -41) {
                            DummyHashTable.anInt1682 = -1;
                          }

                          if (10 < Something3d2.anInt3020) {
                            DummyCanvas.anInt25 = -1;
                          }

                          if (60 < TextureSampler9.anInt3102) {
                            DummyOutputStream.anInt48 = -2;
                          }

                          if (~TextureSampler18.anInt4032 < -51) {
                            ++SomethingQuickChat.anInt3569;
                            TextureSampler12.secureBuffer.writePacket(93);
                          }

                          if (RenderAnimation.interfaceCounterUpdated) {
                            DummyClass35.method1029(0);
                            RenderAnimation.interfaceCounterUpdated = false;
                          }

                          try {
                            if (SomethingVolume15.gameSocket != null
                              && ~TextureSampler12.secureBuffer.position < -1) {
                              SomethingVolume15.gameSocket.write(
                                TextureSampler12.secureBuffer.bytes, 0,
                                TextureSampler12.secureBuffer.position);
                              TextureSampler18.anInt4032 = 0;
                              TextureSampler12.secureBuffer.position = 0;
                            }
                          } catch (IOException var11) {
                            TextureSampler5.method289(false);
                          }

                          return;
                        }

                        var25 = var26.aClass11_2449;
                        if (-1 >= ~var25.anInt191) {
                          var23 = EnumStringFetcher.getWidget((byte) 118, var25.anInt190);
                          if (null == var23 || var23.aClass11Array262 == null
                            || ~var25.anInt191 <= ~var23.aClass11Array262.length
                            || var25 != var23.aClass11Array262[var25.anInt191]) {
                            continue;
                          }
                        }

                        Light.executeScript(var26);
                      }
                    }

                    var25 = var26.aClass11_2449;
                    if (~var25.anInt191 <= -1) {
                      var23 = EnumStringFetcher.getWidget((byte) 120, var25.anInt190);
                      if (var23 == null || null == var23.aClass11Array262
                        || var23.aClass11Array262.length <= var25.anInt191
                        || var23.aClass11Array262[var25.anInt191] != var25) {
                        continue;
                      }
                    }

                    Light.executeScript(var26);
                  }
                }

                var25 = var26.aClass11_2449;
                if (var25.anInt191 >= 0) {
                  var23 = EnumStringFetcher.getWidget((byte) 127, var25.anInt190);
                  if (var23 == null || var23.aClass11Array262 == null
                    || var25.anInt191 >= var23.aClass11Array262.length
                    || var23.aClass11Array262[var25.anInt191] != var25) {
                    continue;
                  }
                }

                Light.executeScript(var26);
              }
            }
          }
        }
      }
    } catch (RuntimeException var13) {
      throw AbstractGameWorld.cascadeException(var13, "gg.F(" + var0 + ')');
    }
  }

}
