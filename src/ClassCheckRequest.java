final class ClassCheckRequest extends Node {

  static GameString aClass94_2297 = SpawnedGameObject.createString("Wordpack geladen)3");
  static GameString DETAILS = SpawnedGameObject.createString("details");
  static GameString aClass94_2306 = SpawnedGameObject.createString("<)4col> x");
  int anInt2296;
  SignLinkRequest[] aClass64Array2298;
  int[] anIntArray2299;
  int[] anIntArray2300;
  int[] anIntArray2301;
  byte[][][] aByteArrayArrayArray2302;
  SignLinkRequest[] aClass64Array2303;
  int anInt2305;

  static final void method124(int var0, int var1, int var2) {
    try {
      if (var0 <= 23) {
        aClass94_2306 = null;
      }

      if (ComponentCanvas.method57(var2, 104)) {
        MapScene.method75(SceneNode.aClass11ArrayArray1834[var2], true, var1);
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "ed.A(" + var0 + ',' + var1 + ',' + var2 + ')');
    }
  }

  static final void method125(int var0, byte var1, int var2, int var3, Widget var4) {
    try {
      DummyClass43.method1194(-16385);
      if (GlRenderer.useOpenGlRenderer) {
        GlUtils.clip(var3, var2, var3 + var4.anInt168, var2 + var4.anInt193);
      } else {
        DummyClass47.method1324(var3, var2, var3 - -var4.anInt168, var2 + var4.anInt193);
      }

      if (2 != DummyClass12.minimapMode && 5 != DummyClass12.minimapMode
        && GZipDecompressor.aClass3_Sub28_Sub16_812 != null) {
        int var19 = TextureSampler9.anInt3102 + SpotAnimationConfig.anInt531 & 2047;
        int var6 = 0 + TextureCache.localPlayer.anInt2819 / 32 + 48;
        int var7 = 0 + -(TextureCache.localPlayer.anInt2829 / 32) + 464;
        if (!GlRenderer.useOpenGlRenderer) {
          ((SoftwareDirectColorSprite) GZipDecompressor.aClass3_Sub28_Sub16_812).method664(var3,
            var2, var4.anInt168, var4.anInt193, var6, var7, var19, 256 - -Something3d2.anInt3020,
            var4.anIntArray207, var4.anIntArray291);
        } else {
          ((GlDirectColorSprite) GZipDecompressor.aClass3_Sub28_Sub16_812).draw(var3, var2,
            var4.anInt168, var4.anInt193, var6, var7, var19, Something3d2.anInt3020 + 256,
            (GlDirectColorSprite) var4.method866((byte) -113, false));
        }

        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var17;
        int var16;
        if (null != TextureSampler22.aClass131_3421) {
          for (int var8 = 0; var8 < TextureSampler22.aClass131_3421.anInt1720; ++var8) {
            if (TextureSampler22.aClass131_3421.method1789(var8, var1 ^ 553)) {
              var9 = 2 + 4 * (TextureSampler22.aClass131_3421.aShortArray1727[var8]
                + -WorldMapLabel.anInt1716) + -(TextureCache.localPlayer.anInt2819 / 32);
              var11 = DummyClass40.SINE_TABLE[var19];
              var12 = DummyClass40.COSINE_TABLE[var19];
              AbstractFont var15 = AbstractTextureSampler.aClass3_Sub28_Sub17_2379;
              var11 = var11 * 256 / (256 + Something3d2.anInt3020);
              var10 = 2 + 4 * (-ProceduralTexture.anInt1152
                + TextureSampler22.aClass131_3421.aShortArray1718[var8])
                - TextureCache.localPlayer.anInt2829 / 32;
              var12 = var12 * 256 / (256 + Something3d2.anInt3020);
              var14 = -(var9 * var11) + var10 * var12 >> 16;
              if (TextureSampler22.aClass131_3421.method1791(var8, var1 + -51) == 1) {
                var15 = SomethingTilek.p12Font;
              }

              if (2 == TextureSampler22.aClass131_3421.method1791(var8, 8)) {
                var15 = FloorOverlay.aClass3_Sub28_Sub17_2096;
              }

              var13 = var11 * var10 - -(var12 * var9) >> 16;
              var16 = var15.method680(TextureSampler22.aClass131_3421.aClass94Array1721[var8], 100);
              var13 -= var16 / 2;
              if (~var13 <= ~(-var4.anInt168) && var13 <= var4.anInt168 && var14 >= -var4.anInt193
                && var14 <= var4.anInt193) {
                var17 = 16777215;
                if (~TextureSampler22.aClass131_3421.anIntArray1725[var8] != 0) {
                  var17 = TextureSampler22.aClass131_3421.anIntArray1725[var8];
                }

                if (!GlRenderer.useOpenGlRenderer) {
                  DummyClass47.method1314(var4.anIntArray207, var4.anIntArray291);
                } else {
                  GlUtils.method936((GlDirectColorSprite) var4.method866((byte) -113, false));
                }

                var15.method693(TextureSampler22.aClass131_3421.aClass94Array1721[var8],
                  var3 + var13 + var4.anInt168 / 2, var2 + var4.anInt193 / 2 + -var14, var16, 50,
                  var17, 0, 256, 1, 0, 0);
                if (GlRenderer.useOpenGlRenderer) {
                  GlUtils.method921();
                } else {
                  DummyClass47.method1310();
                }
              }
            }
          }
        }

        for (var9 = 0; Mouse.anInt1924 > var9; ++var9) {
          var10 =
            -(TextureCache.localPlayer.anInt2819 / 32) + 2 + 4 * DummyClass51.anIntArray1163[var9]
              + 0;
          var11 =
            -(TextureCache.localPlayer.anInt2829 / 32) + 2 + (ObjectNode.anIntArray4050[var9] * 4
              - 0);
          GameObjectConfig var20 = DummyClass11.method2207(4, ClientScript.anIntArray3693[var9]);
          if (null != var20.anIntArray1524) {
            var20 = var20.method1685(var1 + -59);
            if (null == var20 || 0 == ~var20.anInt1482) {
              continue;
            }
          }

          DummyClass36.method1030(var4, Mobile.aClass3_Sub28_Sub16Array2839[var20.anInt1482], var11,
            var10, var2, (byte) 11, var3);
        }

        for (var9 = 0; 104 > var9; ++var9) {
          for (var10 = 0; -105 < ~var10; ++var10) {
            Deque var25 = TextureSampler0.groundItems[GameWorldSomething.currentPlane][var9][var10];
            if (null != var25) {
              var12 = 2 + var9 * 4 + -(TextureCache.localPlayer.anInt2819 / 32);
              var13 = -(TextureCache.localPlayer.anInt2829 / 32) + 2 + 4 * var10;
              DummyClass36.method1030(var4, HashTableIterator.aClass3_Sub28_Sub16Array1136[0],
                var13, var12, var2, (byte) 11, var3);
            }
          }
        }

        for (var9 = 0; ~DummyClass6.anInt2046 < ~var9; ++var9) {
          NPC var21 = TextureSampler5.npcs[AudioWorker.anIntArray347[var9]];
          if (var21 != null && var21.hasConfiguration((byte) 17)) {
            NpcConfiguration var22 = var21.config;
            if (null != var22 && null != var22.anIntArray1292) {
              var22 = var22.method1471((byte) -3);
            }

            if (var22 != null && var22.aBoolean1285 && var22.aBoolean1270) {
              var12 = var21.anInt2819 / 32 - TextureCache.localPlayer.anInt2819 / 32;
              var13 = var21.anInt2829 / 32 + -(TextureCache.localPlayer.anInt2829 / 32);
              if (~var22.anInt1283 != 0) {
                DummyClass36.method1030(var4, Mobile.aClass3_Sub28_Sub16Array2839[var22.anInt1283],
                  var13, var12, var2, (byte) 11, var3);
              } else {
                DummyClass36.method1030(var4, HashTableIterator.aClass3_Sub28_Sub16Array1136[1],
                  var13, var12, var2, (byte) 11, var3);
              }
            }
          }
        }

        for (var9 = 0; var9 < DummyClass13.anInt2022; ++var9) {
          Player var23 = TextureSampler0.players[DummyClass42.anIntArray887[var9]];
          if (null != var23 && var23.hasConfiguration((byte) 17)) {
            var12 = var23.anInt2829 / 32 - TextureCache.localPlayer.anInt2829 / 32;
            var11 = -(TextureCache.localPlayer.anInt2819 / 32) + var23.anInt2819 / 32;
            long var29 = var23.name.toBase37();
            boolean var28 = false;

            for (var16 = 0; ~FileSystem.anInt104 < ~var16; ++var16) {
              if (~var29 == ~VertexNormal.aLongArray826[var16]
                && 0 != Cursor.anIntArray882[var16]) {
                var28 = true;
                break;
              }
            }

            boolean var31 = false;

            for (var17 = 0; SubNode.anInt2572 > var17; ++var17) {
              if (var29 == ClientScript.aClass3_Sub19Array3694[var17].key) {
                var31 = true;
                break;
              }
            }

            boolean var32 = false;
            if (-1 != ~TextureCache.localPlayer.anInt3956 && 0 != var23.anInt3956
              && var23.anInt3956 == TextureCache.localPlayer.anInt3956) {
              var32 = true;
            }

            if (var28) {
              DummyClass36.method1030(var4, HashTableIterator.aClass3_Sub28_Sub16Array1136[3],
                var12, var11, var2, (byte) 11, var3);
            } else if (!var31) {
              if (var32) {
                DummyClass36.method1030(var4, HashTableIterator.aClass3_Sub28_Sub16Array1136[4],
                  var12, var11, var2, (byte) 11, var3);
              } else {
                DummyClass36.method1030(var4, HashTableIterator.aClass3_Sub28_Sub16Array1136[2],
                  var12, var11, var2, (byte) 11, var3);
              }
            } else {
              DummyClass36.method1030(var4, HashTableIterator.aClass3_Sub28_Sub16Array1136[5],
                var12, var11, var2, (byte) 11, var3);
            }
          }
        }

        HintMarker[] var24 = GameException.aClass96Array2114;

        for (var10 = 0; ~var10 > ~var24.length; ++var10) {
          HintMarker var26 = var24[var10];
          if (null != var26 && -1 != ~var26.anInt1360 && AbstractGameWorld.updateCycle % 20 < 10) {
            if (~var26.anInt1360 == -2 && var26.anInt1359 >= 0
              && var26.anInt1359 < TextureSampler5.npcs.length) {
              NPC var27 = TextureSampler5.npcs[var26.anInt1359];
              if (null != var27) {
                var13 = -(TextureCache.localPlayer.anInt2819 / 32) + var27.anInt2819 / 32;
                var14 = var27.anInt2829 / 32 + -(TextureCache.localPlayer.anInt2829 / 32);
                DummyClass41.method1171(var26.anInt1351, var2, var3, var13, var14, var4, false);
              }
            }

            if (-3 == ~var26.anInt1360) {
              var12 = (-WorldMapLabel.anInt1716 + var26.anInt1356) * 4 + 2
                - TextureCache.localPlayer.anInt2819 / 32;
              var13 = -(TextureCache.localPlayer.anInt2829 / 32) + 2
                + (-ProceduralTexture.anInt1152 + var26.anInt1347) * 4;
              DummyClass41.method1171(var26.anInt1351, var2, var3, var12, var13, var4, false);
            }

            if (var26.anInt1360 == 10 && -1 >= ~var26.anInt1359
              && TextureSampler0.players.length > var26.anInt1359) {
              Player var30 = TextureSampler0.players[var26.anInt1359];
              if (null != var30) {
                var14 = var30.anInt2829 / 32 + -(TextureCache.localPlayer.anInt2829 / 32);
                var13 = var30.anInt2819 / 32 + -(TextureCache.localPlayer.anInt2819 / 32);
                DummyClass41.method1171(var26.anInt1351, var2, var3, var13, var14, var4, false);
              }
            }
          }
        }

        if (DummyClass45.anInt987 != 0) {
          var9 = 4 * DummyClass45.anInt987 + (2 - TextureCache.localPlayer.anInt2819 / 32);
          var10 = 2 + 4 * DummyClass38.anInt733 - TextureCache.localPlayer.anInt2829 / 32;
          DummyClass36.method1030(var4, DummyClass38.aClass3_Sub28_Sub16_736, var10, var9, var2,
            (byte) 11, var3);
        }

        if (!GlRenderer.useOpenGlRenderer) {
          DummyClass47.method1323(-1 + var4.anInt168 / 2 + var3, -1 + var4.anInt193 / 2 + var2, 3,
            3, 16777215);
        } else {
          GlUtils.fillQuad(-1 + (var3 - -(var4.anInt168 / 2)), -1 + var2 - -(var4.anInt193 / 2), 3,
            3, 16777215);
        }
      } else if (!GlRenderer.useOpenGlRenderer) {
        DummyClass47.method1332(var3, var2, 0, var4.anIntArray207, var4.anIntArray291);
      } else {
        AbstractDirectColorSprite var5 = var4.method866((byte) -113, false);
        if (null != var5) {
          var5.method643(var3, var2);
        }
      }

      if (var1 == 59) {
        DummyClass9.aBooleanArray4008[var0] = true;
      }
    } catch (RuntimeException var18) {
      throw AbstractGameWorld.cascadeException(var18,
        "ed.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ?
          "{...}" :
          "null") + ')');
    }
  }

  static final void method126(boolean var0, int var1, int var2, int var3, int var4) {
    try {
      if (!var0) {
        if (~var4 <= ~DummyClass55.anInt1425 && var4 <= GlTexture2d.anInt3765) {
          var2 = DummyClass59.method1040(LightIntensity.anInt902, var2, (byte) 0,
            DummyClass13.anInt2020);
          var1 = DummyClass59.method1040(LightIntensity.anInt902, var1, (byte) 0,
            DummyClass13.anInt2020);
          TextureSampler15.method244(2, var2, var4, var1, var3);
        }

      }
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "ed.F(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
    }
  }

  static final void method127(short[] var0, int var1, GameString[] var2, int var3, int var4) {
    try {
      if (~var1 < ~var4) {
        int var6 = var4;
        int var5 = (var4 - -var1) / 2;
        GameString var7 = var2[var5];
        var2[var5] = var2[var1];
        var2[var1] = var7;
        short var8 = var0[var5];
        var0[var5] = var0[var1];
        var0[var1] = var8;

        for (int var9 = var4; ~var1 < ~var9; ++var9) {
          if (var7 == null || null != var2[var9] && var2[var9].method1559(var7, -1) < (var9 & 1)) {
            GameString var10 = var2[var9];
            var2[var9] = var2[var6];
            var2[var6] = var10;
            short var11 = var0[var9];
            var0[var9] = var0[var6];
            var0[var6++] = var11;
          }
        }

        var2[var1] = var2[var6];
        var2[var6] = var7;
        var0[var1] = var0[var6];
        var0[var6] = var8;
        method127(var0, -1 + var6, var2, -909, var4);
        method127(var0, var1, var2, -909, var6 - -1);
      }

      if (var3 != -909) {
        method125(-13, (byte) 113, -27, -120, null);
      }

    } catch (RuntimeException var12) {
      throw AbstractGameWorld.cascadeException(var12,
        "ed.E(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + (var2 != null ?
          "{...}" :
          "null") + ',' + var3 + ',' + var4 + ')');
    }
  }

  static final void method128(int var0) {
    try {
      AbstractGameWorld.floorUnderlays.method1524(3);
      if (var0 != 2) {
        method127(null, -27, null, -4, -64);
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ed.O(" + var0 + ')');
    }
  }

  static final int method129(int var0, int var1, int var2, int var3) {
    try {
      if (var1 != 2) {
        method131(14);
      }

      if (-244 <= ~var0) {
        if (~var0 < -218) {
          var2 >>= 3;
        } else if (var0 <= 192) {
          if (179 < var0) {
            var2 >>= 1;
          }
        } else {
          var2 >>= 2;
        }
      } else {
        var2 >>= 4;
      }

      return (var0 >> 1) + (var2 >> 5 << 7) + (var3 >> 2 << 10);
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "ed.D(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  static final GameWorld method130(int var0, int var1) {
    try {
      if (BufferedFile.aBoolean579 && ~var1 <= ~TextureSampler34.anInt3054
        && ~var1 >= ~FloorUnderlay.anInt1416) {
        int var2 = 120 / ((0 - var0) / 32);
        return DummyClass26.aClass44_Sub1Array1609[var1 - TextureSampler34.anInt3054];
      } else {
        return null;
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "ed.P(" + var0 + ',' + var1 + ')');
    }
  }

  public static void method131(int var0) {
    try {
      aClass94_2297 = null;
      DETAILS = null;
      aClass94_2306 = null;
      if (var0 >= -104) {
        method132((byte) -28);
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ed.Q(" + var0 + ')');
    }
  }

  static final void method132(byte var0) {
    try {
      for (int var1 = 0; var1 < SomethingLight0.anInt1552; ++var1) {
        --GameString.anIntArray2157[var1];
        if (~GameString.anIntArray2157[var1] > 9) {
          --SomethingLight0.anInt1552;

          for (int var2 = var1; var2 < SomethingLight0.anInt1552; ++var2) {
            Inventory.anIntArray2550[var2] = Inventory.anIntArray2550[var2 - -1];
            TextureCache.aClass135Array2131[var2] = TextureCache.aClass135Array2131[var2 + 1];
            SomethingIndex150.anIntArray2068[var2] = SomethingIndex150.anIntArray2068[1 + var2];
            GameString.anIntArray2157[var2] = GameString.anIntArray2157[1 + var2];
            TextureSampler26.anIntArray3083[var2] = TextureSampler26.anIntArray3083[var2 - -1];
          }

          --var1;
        } else {
          SoundEffect var11 = TextureCache.aClass135Array2131[var1];
          if (null == var11) {
            var11 = SoundEffect.method1811(AbstractMouseWheel.soundEffects,
              Inventory.anIntArray2550[var1], 0);
            if (null == var11) {
              continue;
            }

            GameString.anIntArray2157[var1] += var11.method1813();
            TextureCache.aClass135Array2131[var1] = var11;
          }

          if (0 > GameString.anIntArray2157[var1]) {
            int var3;
            if (~TextureSampler26.anIntArray3083[var1] != -1) {
              int var4 = 128 * (255 & TextureSampler26.anIntArray3083[var1]);
              int var7 = TextureSampler26.anIntArray3083[var1] >> 8 & 255;
              int var5 = 255 & TextureSampler26.anIntArray3083[var1] >> 16;
              int var8 = -TextureCache.localPlayer.anInt2829 + 64 + 128 * var7;
              if (var8 < 0) {
                var8 = -var8;
              }

              int var6 = -TextureCache.localPlayer.anInt2819 + 64 + var5 * 128;
              if (0 > var6) {
                var6 = -var6;
              }

              int var9 = -128 + var6 + var8;
              if (~var4 > ~var9) {
                GameString.anIntArray2157[var1] = -100;
                continue;
              }

              if (~var9 > -1) {
                var9 = 0;
              }

              var3 = DummyClass28.anInt340 * (var4 + -var9) / var4;
            } else {
              var3 = ClientScriptCall.anInt2453;
            }

            if (-1 > ~var3) {
              SomethingMusic0 var12 = var11.method1812().method151(DummyClass32.aClass157_524);
              AudioStreamEncoder1 var13 = AudioStreamEncoder1.method437(var12, 100, var3);
              var13.method429(SomethingIndex150.anIntArray2068[var1] + -1);
              MonoChromaticImageBuffer.aClass3_Sub24_Sub2_2563.method457(var13);
            }

            GameString.anIntArray2157[var1] = -100;
          }
        }
      }

      if (var0 != -92) {
        method126(true, 36, 42, 14, 51);
      }

      if (MidiSomething.aBoolean1158 && !BitVariable.method1391(-1)) {
        if (0 != BZipDecompressorState.anInt120 && AbstractFrameRegulator.anInt1691 != -1) {
          SceneSomething2.method1285(SomethingTexture1.fileUnpacker6, false,
            AbstractFrameRegulator.anInt1691, 0, false, BZipDecompressorState.anInt120);
        }

        MidiSomething.aBoolean1158 = false;
      } else if (-1 != ~BZipDecompressorState.anInt120 && ~AbstractFrameRegulator.anInt1691 != 0
        && !BitVariable.method1391(var0 + 91)) {
        TextureSampler12.secureBuffer.writePacket(137);
        TextureSampler12.secureBuffer.writeInt(AbstractFrameRegulator.anInt1691);
        AbstractFrameRegulator.anInt1691 = -1;
        ++Parameter.anInt3618;
      }

    } catch (RuntimeException var10) {
      throw AbstractGameWorld.cascadeException(var10, "ed.C(" + var0 + ')');
    }
  }

}
