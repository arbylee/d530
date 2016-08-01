final class MapScene {

  static int anInt59 = 0;
  static short[] aShortArray63 =
    new short[] {(short) 960, (short) 957, (short) -21568, (short) -21571, (short) 22464};
  static int anInt65;
  static boolean aBoolean66 = false;
  static int viewportUpperX;
  static MaterialShader[] anInterface5Array70;
  private static GameString aClass94_68 = SpawnedGameObject.createString("glow1:");
  static GameString aClass94_60 = aClass94_68;
  static GameString aClass94_62 = aClass94_68;
  int anInt61;
  int spriteId;
  boolean aBoolean69 = false;

  static final boolean method73(short var0, int var1) {
    try {
      if (var0 != 47 && ~var0 != -6 && var0 != 43 && ~var0 != -36 && ~var0 != -59 && -23 != ~var0
        && var0 != 40 && var0 != 3) {
        if (-10 != ~var0 && ~var0 != -13 && -1007 != ~var0 && -1004 != ~var0) {
          if (var1 <= 42) {
            anInt59 = 1;
          }

          return var0 != 25 && -24 != ~var0 && 48 != var0 && var0 != 7 && -14 != ~var0 ?
            var0 == 8 || var0 == 32 || ~var0 == -29 || ~var0 == -60 || ~var0 == -52
              || -42 == ~var0 :
            true;
        } else {
          return true;
        }
      } else {
        return true;
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "aa.C(" + var0 + ',' + var1 + ')');
    }
  }

  static final void method75(Widget[] var0, boolean var1, int var2) {
    try {
      if (var1) {
        for (int var3 = 0; ~var3 > ~var0.length; ++var3) {
          Widget var4 = var0[var3];
          if (null != var4) {
            if (var4.anInt187 == 0) {
              if (null != var4.aClass11Array262) {
                method75(var4.aClass11Array262, true, var2);
              }

              SomethingPacket151 var5 = (SomethingPacket151) TextureSampler23.aClass130_3208
                .get((long) var4.anInt279);
              if (null != var5) {
                ClassCheckRequest.method124(49, var2, var5.anInt2602);
              }
            }

            ClientScriptCall var7;
            if (~var2 == -1 && null != var4.anObjectArray206) {
              var7 = new ClientScriptCall();
              var7.arguments = var4.anObjectArray206;
              var7.aClass11_2449 = var4;
              Light.executeScript(var7);
            }

            if (-2 == ~var2 && var4.anObjectArray176 != null) {
              if (-1 >= ~var4.anInt191) {
                Widget var8 = EnumStringFetcher.getWidget((byte) 121, var4.anInt279);
                if (null == var8 || null == var8.aClass11Array262
                  || ~var4.anInt191 <= ~var8.aClass11Array262.length
                  || var8.aClass11Array262[var4.anInt191] != var4) {
                  continue;
                }
              }

              var7 = new ClientScriptCall();
              var7.arguments = var4.anObjectArray176;
              var7.aClass11_2449 = var4;
              Light.executeScript(var7);
            }
          }
        }

      }
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "aa.I(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ')');
    }
  }

  static final boolean method76(int var0, int var1, int var2, int var3, int var4, boolean var5,
                                int var6, int var7, int var8, int var9, int var10, int var11) {
    try {
      int var12;
      int var13;
      for (var12 = 0; 104 > var12; ++var12) {
        for (var13 = 0; -105 < ~var13; ++var13) {
          DummyClass51.anIntArrayArray1160[var12][var13] = 0;
          TriChromaticImageCache.anIntArrayArray1373[var12][var13] = 99999999;
        }
      }

      DummyClass51.anIntArrayArray1160[var11][var3] = 99;
      TriChromaticImageCache.anIntArrayArray1373[var11][var3] = 0;
      var13 = var3;
      var12 = var11;
      byte var14 = 0;
      TextureSampler38.anIntArray3456[var14] = var11;
      boolean var16 = false;
      int var15 = 0;
      int var27 = var14 + 1;
      DummyClass38.anIntArray729[var14] = var3;
      int[][] var17 =
        BlockConfig.collisionMaps[GameWorldSomething.currentPlane].anIntArrayArray1304;

      int var18;
      while (var15 != var27) {
        var12 = TextureSampler38.anIntArray3456[var15];
        var13 = DummyClass38.anIntArray729[var15];
        var15 = 4095 & var15 - -1;
        if (var8 == var12 && ~var4 == ~var13) {
          var16 = true;
          break;
        }

        if (-1 != ~var1) {
          if ((5 > var1 || -11 == ~var1)
            && BlockConfig.collisionMaps[GameWorldSomething.currentPlane]
            .method1488(var4, var12, false, var13, var8, -1 + var1, 2, var7)) {
            var16 = true;
            break;
          }

          if (var1 < 10 && BlockConfig.collisionMaps[GameWorldSomething.currentPlane]
            .method1492(var4, var1 + -1, var8, var13, 2, var7, var12, 88)) {
            var16 = true;
            break;
          }
        }

        if (0 != var0 && ~var6 != -1 && BlockConfig.collisionMaps[GameWorldSomething.currentPlane]
          .method1498(true, var8, var13, var12, 2, var0, var2, var4, var6)) {
          var16 = true;
          break;
        }

        var18 = TriChromaticImageCache.anIntArrayArray1373[var12][var13] - -1;
        if (var12 > 0 && ~DummyClass51.anIntArrayArray1160[var12 + -1][var13] == -1 && 0 == (
          var17[-1 + var12][var13] & 19661070)
          && ~(var17[-1 + var12][var13 + 1] & 19661112) == -1) {
          TextureSampler38.anIntArray3456[var27] = var12 + -1;
          DummyClass38.anIntArray729[var27] = var13;
          var27 = 1 + var27 & 4095;
          DummyClass51.anIntArrayArray1160[var12 - 1][var13] = 2;
          TriChromaticImageCache.anIntArrayArray1373[-1 + var12][var13] = var18;
        }

        if (102 > var12 && ~DummyClass51.anIntArrayArray1160[1 + var12][var13] == -1 && 0 == (
          var17[2 + var12][var13] & 19661187) && 0 == (var17[var12 + 2][1 + var13] & 19661280)) {
          TextureSampler38.anIntArray3456[var27] = 1 + var12;
          DummyClass38.anIntArray729[var27] = var13;
          var27 = 4095 & var27 + 1;
          DummyClass51.anIntArrayArray1160[var12 - -1][var13] = 8;
          TriChromaticImageCache.anIntArrayArray1373[var12 - -1][var13] = var18;
        }

        if (var13 > 0 && ~DummyClass51.anIntArrayArray1160[var12][var13 + -1] == -1
          && (19661070 & var17[var12][-1 + var13]) == 0
          && ~(var17[var12 + 1][var13 - 1] & 19661187) == -1) {
          TextureSampler38.anIntArray3456[var27] = var12;
          DummyClass38.anIntArray729[var27] = -1 + var13;
          DummyClass51.anIntArrayArray1160[var12][-1 + var13] = 1;
          TriChromaticImageCache.anIntArrayArray1373[var12][-1 + var13] = var18;
          var27 = 4095 & 1 + var27;
        }

        if (~var13 > -103 && ~DummyClass51.anIntArrayArray1160[var12][var13 + 1] == -1
          && ~(var17[var12][2 + var13] & 19661112) == -1 && -1 == ~(var17[1 + var12][var13 + 2]
          & 19661280)) {
          TextureSampler38.anIntArray3456[var27] = var12;
          DummyClass38.anIntArray729[var27] = var13 + 1;
          DummyClass51.anIntArrayArray1160[var12][1 + var13] = 4;
          var27 = 1 + var27 & 4095;
          TriChromaticImageCache.anIntArrayArray1373[var12][var13 - -1] = var18;
        }

        if (var12 > 0 && var13 > 0 && -1 == ~DummyClass51.anIntArrayArray1160[-1 + var12][-1
          + var13] && -1 == ~(19661112 & var17[-1 + var12][var13]) && 0 == (
          var17[-1 + var12][-1 + var13] & 19661070) && 0 == (19661187 & var17[var12][-1 + var13])) {
          TextureSampler38.anIntArray3456[var27] = -1 + var12;
          DummyClass38.anIntArray729[var27] = -1 + var13;
          DummyClass51.anIntArrayArray1160[-1 + var12][-1 + var13] = 3;
          TriChromaticImageCache.anIntArrayArray1373[-1 + var12][-1 + var13] = var18;
          var27 = 4095 & var27 + 1;
        }

        if (-103 < ~var12 && 0 < var13
          && ~DummyClass51.anIntArrayArray1160[1 + var12][var13 + -1] == -1 && -1 == ~(
          var17[var12 - -1][var13 - 1] & 19661070) && -1 == ~(19661187 & var17[2 + var12][var13
          + -1]) && -1 == ~(19661280 & var17[var12 + 2][var13])) {
          TextureSampler38.anIntArray3456[var27] = var12 - -1;
          DummyClass38.anIntArray729[var27] = var13 - 1;
          var27 = 4095 & 1 + var27;
          DummyClass51.anIntArrayArray1160[var12 - -1][-1 + var13] = 9;
          TriChromaticImageCache.anIntArrayArray1373[1 + var12][var13 + -1] = var18;
        }

        if (-1 > ~var12 && -103 < ~var13 && 0 == DummyClass51.anIntArrayArray1160[var12 - 1][var13
          + 1] && ~(var17[-1 + var12][var13 - -1] & 19661070) == -1 && 0 == (19661112 & var17[-1
          + var12][var13 - -2]) && ~(19661280 & var17[var12][var13 + 2]) == -1) {
          TextureSampler38.anIntArray3456[var27] = var12 - 1;
          DummyClass38.anIntArray729[var27] = 1 + var13;
          DummyClass51.anIntArrayArray1160[var12 - 1][1 + var13] = 6;
          TriChromaticImageCache.anIntArrayArray1373[-1 + var12][1 + var13] = var18;
          var27 = 1 + var27 & 4095;
        }

        if (-103 < ~var12 && ~var13 > -103 && -1 == ~DummyClass51.anIntArrayArray1160[1 + var12][1
          + var13] && -1 == ~(19661112 & var17[var12 - -1][2 + var13]) && -1 == ~(19661280 & var17[
          var12 + 2][var13 - -2]) && (19661187 & var17[var12 - -2][var13 + 1]) == 0) {
          TextureSampler38.anIntArray3456[var27] = 1 + var12;
          DummyClass38.anIntArray729[var27] = var13 + 1;
          var27 = var27 - -1 & 4095;
          DummyClass51.anIntArrayArray1160[var12 - -1][var13 + 1] = 12;
          TriChromaticImageCache.anIntArrayArray1373[1 + var12][1 + var13] = var18;
        }
      }

      AbstractFrameRegulator.anInt1692 = 0;
      int var19;
      if (!var16) {
        if (!var5) {
          return false;
        }

        var18 = 1000;
        var19 = 100;
        byte var20 = 10;

        for (int var21 = -var20 + var8; ~var21 >= ~(var20 + var8); ++var21) {
          for (int var22 = var4 + -var20; ~var22 >= ~(var20 + var4); ++var22) {
            if (-1 >= ~var21 && -1 >= ~var22 && -105 < ~var21 && 104 > var22
              && TriChromaticImageCache.anIntArrayArray1373[var21][var22] < 100) {
              int var23 = 0;
              int var24 = 0;
              if (~var21 <= ~var8) {
                if (~var21 < ~(-1 + var0 + var8)) {
                  var23 = var21 + 1 + -var0 + -var8;
                }
              } else {
                var23 = var8 - var21;
              }

              if (~var4 >= ~var22) {
                if (~var22 < ~(-1 + var4 + var6)) {
                  var24 = -var4 + -var6 + 1 + var22;
                }
              } else {
                var24 = -var22 + var4;
              }

              int var25 = var23 * var23 + var24 * var24;
              if (var25 < var18 || ~var18 == ~var25
                && TriChromaticImageCache.anIntArrayArray1373[var21][var22] < var19) {
                var13 = var22;
                var19 = TriChromaticImageCache.anIntArrayArray1373[var21][var22];
                var18 = var25;
                var12 = var21;
              }
            }
          }
        }

        if (~var18 == -1001) {
          return false;
        }

        if (var11 == var12 && ~var13 == ~var3) {
          return false;
        }

        AbstractFrameRegulator.anInt1692 = 1;
      }

      byte var28 = 0;
      TextureSampler38.anIntArray3456[var28] = var12;
      var15 = var28 + 1;
      DummyClass38.anIntArray729[var28] = var13;
      var18 = var19 = DummyClass51.anIntArrayArray1160[var12][var13];
      if (var10 <= 2) {
        aClass94_60 = null;
      }

      for (;
           ~var11 != ~var12 || ~var3 != ~var13;
           var18 = DummyClass51.anIntArrayArray1160[var12][var13]) {
        if (var19 != var18) {
          TextureSampler38.anIntArray3456[var15] = var12;
          DummyClass38.anIntArray729[var15++] = var13;
          var19 = var18;
        }

        if ((var18 & 2) != 0) {
          ++var12;
        } else if (~(8 & var18) != -1) {
          --var12;
        }

        if ((var18 & 1) == 0) {
          if (~(var18 & 4) != -1) {
            --var13;
          }
        } else {
          ++var13;
        }
      }

      if (~var15 >= -1) {
        return 1 != var9;
      } else {
        TextureSampler7.method299(113, var15, var9);
        return true;
      }
    } catch (RuntimeException var26) {
      throw AbstractGameWorld.cascadeException(var26,
        "aa.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6
          + ',' + var7 + ',' + var8 + ',' + var9 + ',' + var10 + ',' + var11 + ')');
    }
  }

  static final void method78(int var0, boolean var1, int var2) {
    try {
      ++FileUnpacker.anInt1944;
      TextureSampler12.secureBuffer.writePacket(132);
      TextureSampler12.secureBuffer.method775(var2, 1437452424);
      if (!var1) {
        TextureSampler12.secureBuffer.writeShortLE(-1, var0);
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld
        .cascadeException(var4, "aa.E(" + var0 + ',' + var1 + ',' + var2 + ')');
    }
  }

  public static void method80(int var0) {
    try {
      aClass94_60 = null;
      aShortArray63 = null;
      if (var0 != -27401) {
        anInt65 = 93;
      }

      aClass94_68 = null;
      anInterface5Array70 = null;
      aClass94_62 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "aa.G(" + var0 + ')');
    }
  }

  static final void method81(byte var0, Widget var1) {
    try {
      if (var0 != -128) {
        method75(null, true, 21);
      }

      int var2 = var1.anInt189;
      if (324 != var2) {
        if (-326 != ~var2) {
          if (var2 == 327) {
            var1.rotationX0 = 150;
            var1.rotationY =
              2047 & (int) (Math.sin((double) AbstractGameWorld.updateCycle / 40.0D) * 256.0D);
            var1.anInt202 = 5;
            var1.anInt201 = -1;
          } else if (var2 == 328) {
            if (null == TextureCache.localPlayer.name) {
              var1.anInt201 = 0;
            } else {
              var1.rotationX0 = 150;
              var1.rotationY =
                2047 & (int) (256.0D * Math.sin((double) AbstractGameWorld.updateCycle / 40.0D));
              var1.anInt202 = 5;
              var1.anInt201 = 2047 + ((int) TextureCache.localPlayer.name.toBase37() << 11);
              var1.anInt260 = TextureCache.localPlayer.anInt2793;
              var1.anInt267 = 0;
              var1.anInt305 = TextureCache.localPlayer.anInt2764;
              var1.anInt283 = TextureCache.localPlayer.anInt2813;
            }
          }
        } else {
          if (-1 == TextureSampler37.anInt3260) {
            DummyClass51.anInt1165 = var1.anInt296;
            TextureSampler37.anInt3260 = var1.anInt224;
          }

          if (!DummyClass49.aClass52_1112.aBoolean864) {
            var1.anInt224 = TextureSampler37.anInt3260;
          } else {
            var1.anInt224 = DummyClass51.anInt1165;
          }

        }
      } else {
        if (-1 == TextureSampler37.anInt3260) {
          TextureSampler37.anInt3260 = var1.anInt224;
          DummyClass51.anInt1165 = var1.anInt296;
        }

        if (DummyClass49.aClass52_1112.aBoolean864) {
          var1.anInt224 = TextureSampler37.anInt3260;
        } else {
          var1.anInt224 = DummyClass51.anInt1165;
        }

      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld
        .cascadeException(var3, "aa.H(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  final void method74(byte var1, Buffer var2, int var3) {
    try {
      while (true) {
        int var4 = var2.readUnsignedByte();
        if (-1 == ~var4) {
          if (var1 > -108) {
            this.method74((byte) 85, null, 63);
          }

          return;
        }

        this.method79(var4, var2, var3, 95);
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "aa.F(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
    }
  }

  final SoftwareIndexedColorSprite getSprite(int var1, byte var2) {
    try {
      SoftwareIndexedColorSprite var3 = (SoftwareIndexedColorSprite) TextureSampler2.aClass93_3369
        .get((long) (var1 << 16 | this.spriteId));
      if (var3 != null) {
        return var3;
      } else {
        Keyboard.sprites.isLoaded(this.spriteId);
        int var4 = 125 % ((var2 - -21) / 50);
        var3 = GameString.createSprite(0, true, this.spriteId, Keyboard.sprites);
        if (var3 != null) {
          var3.method1668(TextureCache.anInt2136, DummyClass39.anInt740,
            AbstractImageProducer.anInt2015);
          var3.anInt1469 = var3.width;
          var3.anInt1467 = var3.height;

          for (int var5 = 0; ~var1 < ~var5; ++var5) {
            var3.method1674();
          }

          TextureSampler2.aClass93_3369.get((byte) -125, var3, (long) (var1 << 16 | this.spriteId));
        }

        return var3;
      }
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6, "aa.D(" + var1 + ',' + var2 + ')');
    }
  }

  private final void method79(int var1, Buffer var2, int var3, int var4) {
    try {
      if (var1 == 1) {
        this.spriteId = var2.readUnsignedShort();
      } else if (var1 != 2) {
        if (~var1 != -4) {
          if (var1 == 4) {
            this.spriteId = -1;
          }
        } else {
          this.aBoolean69 = true;
        }
      } else {
        this.anInt61 = var2.readUnsignedMedium((byte) 96);
      }

      if (var4 <= 7) {
        anInt65 = 123;
      }

    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "aa.B(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ')');
    }
  }

}
