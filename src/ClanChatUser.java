final class ClanChatUser extends Node {

  static FileUnpacker midiInstruments;
  static int anInt2475 = 0;
  static GameString aClass94_2477 = SpawnedGameObject.createString("<col=ffffff>");
  static int anInt2479;
  byte aByte2472;
  GameString aClass94_2473;
  GameString name;
  int anInt2478;

  static final SomethingTexture1 method384(Buffer var0, byte var1) {
    try {
      if (var1 <= 40) {
        midiInstruments = null;
      }

      return new SomethingTexture1(var0.method787((byte) 38), var0.method787((byte) 51),
        var0.method787((byte) 66), var0.method787((byte) 68), var0.readUnsignedMedium((byte) 86),
        var0.readUnsignedMedium((byte) 86), var0.readUnsignedByte());
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "kl.C(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

  static final boolean method385(int var0, int var1) {
    try {
      int var2 = var0;
      byte var3 = 0;
      int var5;
      int var6;
      int var7;
      int var8;
      if (null == DummyClass32.aClass3_Sub28_Sub16_Sub2_518) {
        if (!GlRenderer.useOpenGlRenderer && null != GZipDecompressor.aClass3_Sub28_Sub16_812) {
          DummyClass32.aClass3_Sub28_Sub16_Sub2_518 =
            (SoftwareDirectColorSprite) GZipDecompressor.aClass3_Sub28_Sub16_812;
        } else {
          DummyClass32.aClass3_Sub28_Sub16_Sub2_518 = new SoftwareDirectColorSprite(512, 512);
        }

        int[] var4 = DummyClass32.aClass3_Sub28_Sub16_Sub2_518.pixels;
        var5 = var4.length;

        for (var6 = 0; ~var6 > ~var5; ++var6) {
          var4[var6] = 1;
        }

        for (var6 = var3 + 1; -1 + -var3 + 104 > var6; ++var6) {
          var7 = 4 * 512 * (var3 + 103 + -var6) + 24628;

          for (var8 = 1 + var2; ~var8 > ~(-var2 + 104 + -1); ++var8) {
            if (-1 == ~(BZipDecompressorState.tileFlags[var1][var8][var6] & 24)) {
              SocketStream.method1469(var4, var7, 512, var1, var8, var6);
            }

            if (~var1 > -4 && 0 != (BZipDecompressorState.tileFlags[1 + var1][var8][var6] & 8)) {
              SocketStream.method1469(var4, var7, 512, var1 + 1, var8, var6);
            }

            var7 += 4;
          }
        }

        Mouse.anInt1924 = 0;

        for (var6 = 0; 104 > var6; ++var6) {
          for (var7 = 0; 104 > var7; ++var7) {
            long var20 =
              SceneGraphTile.method104(GameWorldSomething.currentPlane, var6 + var2, var7 - -var3);
            if (~var20 != -1L) {
              GameObjectConfig var10 =
                DummyClass11.method2207(4, (int) (var20 >>> 32) & Integer.MAX_VALUE);
              int var11 = var10.anInt1482;
              int var12;
              if (null != var10.anIntArray1524) {
                for (var12 = 0; ~var10.anIntArray1524.length < ~var12; ++var12) {
                  if (-1 != var10.anIntArray1524[var12]) {
                    GameObjectConfig var13 =
                      DummyClass11.method2207(4, var10.anIntArray1524[var12]);
                    if (0 <= var13.anInt1482) {
                      var11 = var13.anInt1482;
                      break;
                    }
                  }
                }
              }

              if (~var11 <= -1) {
                int var21 = var3 + var7;
                var12 = var2 + var6;
                if (22 != var11 && var11 != 29 && 34 != var11 && -37 != ~var11 && 46 != var11
                  && var11 != 47 && var11 != 48) {
                  int[][] var14 =
                    BlockConfig.collisionMaps[GameWorldSomething.currentPlane].anIntArrayArray1304;

                  for (int var15 = 0; -11 < ~var15; ++var15) {
                    int var16 = (int) (Math.random() * 4.0D);
                    if (var16 == 0 && var12 > 0 && ~(var6 - 3) > ~var12
                      && ~(var14[var12 - 1][var21] & 19661064) == -1) {
                      --var12;
                    }

                    if (var16 == 1 && -104 < ~var12 && ~(3 + var6) < ~var12
                      && (var14[var12 - -1][var21] & 19661184) == 0) {
                      ++var12;
                    }

                    if (2 == var16 && var21 > 0 && ~(-3 + var7) > ~var21 && 0 == (
                      var14[var12][-1 + var21] & 19661058)) {
                      --var21;
                    }

                    if (3 == var16 && var21 < 103 && ~var21 > ~(var7 - -3) && 0 == (19661088
                      & var14[var12][1 + var21])) {
                      ++var21;
                    }
                  }
                }

                ClientScript.anIntArray3693[Mouse.anInt1924] = var10.anInt1527;
                DummyClass51.anIntArray1163[Mouse.anInt1924] = -var2 + var12;
                ObjectNode.anIntArray4050[Mouse.anInt1924] = var21 + -var3;
                ++Mouse.anInt1924;
              }
            }
          }
        }
      }

      DummyClass32.aClass3_Sub28_Sub16_Sub2_518.method658();
      int var18 =
        (238 + (int) (20.0D * Math.random()) - 10 << 8) + (-10 + (int) (Math.random() * 20.0D) + 238
          << 16) + (228 - -((int) (20.0D * Math.random())));
      var5 = (int) (Math.random() * 20.0D) + 238 + -10 << 16;

      for (var6 = 1; ~var6 > -104; ++var6) {
        for (var7 = 1; 103 > var7; ++var7) {
          if (0 == (BZipDecompressorState.tileFlags[var1][var7 + var2][var6 - -var3] & 24)
            && !GameString.method1529(var3, var7, var18, var6, var5, var2, var1, true)) {
            if (GlRenderer.useOpenGlRenderer) {
              DummyClass47.anIntArray1100 = null;
            } else {
              Something3d.viewImageProducer.method2182(0);
            }

            return false;
          }

          if (-4 < ~var1
            && ~(BZipDecompressorState.tileFlags[1 + var1][var7 + var2][var6 + var3] & 8) != -1
            && !GameString.method1529(var3, var7, var18, var6, var5, var2, 1 + var1, true)) {
            if (!GlRenderer.useOpenGlRenderer) {
              Something3d.viewImageProducer.method2182(0);
            } else {
              DummyClass47.anIntArray1100 = null;
            }

            return false;
          }
        }
      }

      if (GlRenderer.useOpenGlRenderer) {
        int[] var19 = DummyClass32.aClass3_Sub28_Sub16_Sub2_518.pixels;
        var7 = var19.length;

        for (var8 = 0; var7 > var8; ++var8) {
          if (var19[var8] == 0) {
            var19[var8] = 1;
          }
        }

        GZipDecompressor.aClass3_Sub28_Sub16_812 =
          new GlDirectColorSprite(DummyClass32.aClass3_Sub28_Sub16_Sub2_518);
      } else {
        GZipDecompressor.aClass3_Sub28_Sub16_812 = DummyClass32.aClass3_Sub28_Sub16_Sub2_518;
      }

      if (!GlRenderer.useOpenGlRenderer) {
        Something3d.viewImageProducer.method2182(0);
      } else {
        DummyClass47.anIntArray1100 = null;
      }

      DummyClass32.aClass3_Sub28_Sub16_Sub2_518 = null;
      return true;
    } catch (RuntimeException var17) {
      throw AbstractGameWorld.cascadeException(var17, "kl.B(" + var0 + ',' + var1 + ')');
    }
  }

  static final void method386(int var0, int var1) {
    try {
      SomethingPacket151.aClass93_2604.method1522(-128, var0);
      if (var1 <= -109) {
        DummyClass32.aClass93_511.method1522(-126, var0);
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "kl.D(" + var0 + ',' + var1 + ')');
    }
  }

  public static void method387(int var0) {
    try {
      int var1 = 41 % ((var0 - -70) / 32);
      aClass94_2477 = null;
      midiInstruments = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "kl.A(" + var0 + ')');
    }
  }

}
