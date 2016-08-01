import java.io.DataInputStream;
import java.net.URL;
import java.util.Random;
import java.util.zip.Inflater;

final class GZipDecompressor {

  static AbstractDirectColorSprite aClass3_Sub28_Sub16_812;
  static boolean[][] tileOnScreen;
  static int anInt815 = 0;
  static int anInt816;
  static int anInt817;
  static Cache aClass47_818 = new Cache(64);
  static int anInt819 = 0;
  private Inflater anInflater813;


  public GZipDecompressor() {
    this(-1, 1000000, 1000000);
  }

  private GZipDecompressor(int var1, int var2, int var3) {
  }

  static final void method1121(boolean var0, byte var1) {
    try {
      byte var2;
      byte[][] var3;
      if (GlRenderer.useOpenGlRenderer && var0) {
        var2 = 1;
        var3 = GroundItemNode.updatedMapsData;
      } else {
        var3 = Something3d2.aByteArrayArray3027;
        var2 = 4;
      }

      for (int var4 = 0; ~var4 > ~var2; ++var4) {
        DummyClass43.method1194(-16385);

        for (int var5 = 0; -14 < ~var5; ++var5) {
          for (int var6 = 0; -14 < ~var6; ++var6) {
            int var8 = GameObjectConfig.anIntArrayArrayArray1497[var4][var5][var6];
            boolean var7 = false;
            if (~var8 != 0) {
              int var9 = var8 >> 24 & 3;
              if (!var0 || 0 == var9) {
                int var12 = 2047 & var8 >> 3;
                int var10 = var8 >> 1 & 3;
                int var11 = 1023 & var8 >> 14;
                int var13 = (var11 / 8 << 8) + var12 / 8;

                for (int var14 = 0; ~AudioStreamEncoder3.regionHashes.length < ~var14; ++var14) {
                  if (~AudioStreamEncoder3.regionHashes[var14] == ~var13 && null != var3[var14]) {
                    ComponentCanvas
                      .method60(var10, 8 * var5, var4, BlockConfig.collisionMaps, var6 * 8,
                        (byte) -100, var3[var14], var9, (var12 & 7) * 8, 8 * (var11 & 7), var0);
                    var7 = true;
                    break;
                  }
                }
              }
            }

            if (!var7) {
              SomethingSceneJ.method870(var4, (byte) 84, 8 * var6, var5 * 8, 8, 8);
            }
          }
        }
      }

      if (var1 <= 49) {
        anInt817 = 32;
      }

    } catch (RuntimeException var15) {
      throw AbstractGameWorld.cascadeException(var15, "ha.E(" + var0 + ',' + var1 + ')');
    }
  }

  static final Widget method1122(int var0, Widget var1) {
    try {
      if (var0 != 0) {
        method1123(103, 118);
      }

      Widget var2 = GameClient.method42(var1);
      if (null == var2) {
        var2 = var1.aClass11_302;
      }

      return var2;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld
        .cascadeException(var3, "ha.J(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  static final byte[] method1123(int var0, int var1) {
    try {
      ByteArrayNode var2 =
        (ByteArrayNode) SceneSomething.aClass47_480.get((long) var1, var0 + -16710535);
      if (null == var2) {
        Random var4 = new Random((long) var1);
        byte[] var3 = new byte[512];

        int var5;
        for (var5 = 0; -256 < ~var5; ++var5) {
          var3[var5] = (byte) var5;
        }

        for (var5 = 0; ~var5 > -256; ++var5) {
          int var6 = 255 - var5;
          int var7 = FloorUnderlay.method1603((byte) 125, var6, var4);
          byte var8 = var3[var7];
          var3[var7] = var3[var6];
          var3[var6] = var3[511 + -var5] = var8;
        }

        var2 = new ByteArrayNode(var3);
        SceneSomething.aClass47_480.put((long) var1, var2);
      }

      return var0 != 16711935 ? null : var2.aByteArray3612;
    } catch (RuntimeException var9) {
      throw AbstractGameWorld.cascadeException(var9, "ha.B(" + var0 + ',' + var1 + ')');
    }
  }

  static final GameString method1124(int[] var0, long var1, int var3, boolean var4) {
    try {
      if (var4) {
        return null;
      } else {
        if (DummyClass43.anInterface4_915 != null) {
          GameString var5 = DummyClass43.anInterface4_915.method20(var3, var0, 4936, var1);
          if (var5 != null) {
            return var5;
          }
        }

        return InventoryConfig.method612(var1, (byte) 124);
      }
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "ha.H(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var3 + ',' + var4 + ')');
    }
  }

  static final void reportError(String var0, Throwable var1, byte var2) {
    if (var2 <= 100) {
      aClass47_818 = null;
    }

    try {
      String var3 = "";
      if (null != var1) {
        var3 = DummyClass41.method1172(-95, var1);
      }

      if (var0 != null) {
        if (null != var1) {
          var3 = var3 + " | ";
        }

        var3 = var3 + var0;
      }

      EnumStringFetcher.printError(104, var3);
      var3 = WidgetUpdate.createIndexedColorSprite(":", "%3a", 126, var3);
      var3 = WidgetUpdate.createIndexedColorSprite("@", "%40", -31, var3);
      var3 = WidgetUpdate.createIndexedColorSprite("&", "%26", -16, var3);
      var3 = WidgetUpdate.createIndexedColorSprite("#", "%23", 6, var3);
      if (TextureSampler30.signLink.applet == null) {
        return;
      }

      SignLinkRequest var4 = TextureSampler30.signLink.method1439(false,
        new URL(TextureSampler30.signLink.applet.getCodeBase(),
          "clienterror.ws?c=" + TextureSampler18.build + "&u=" + TextureSampler15.encodedUsername
            + "&v1=" + SignLink.aString1216 + "&v2=" + SignLink.aString1196 + "&e=" + var3));

      while (var4.status == 0) {
        TextureSampler25.sleep(1L);
      }

      if (~var4.status == -2) {
        DataInputStream var5 = (DataInputStream) var4.result;
        var5.read();
        var5.close();
      }
    } catch (Exception var6) {
    }

  }

  static final void method1126(int var0, int var1) {
    try {
      WidgetUpdate var2 = AudioStreamEncoder3.method466(4, 2, var1);
      int var3 = -67 % ((var0 - -37) / 48);
      var2.createIndexedColorSprite(true);
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "ha.I(" + var0 + ',' + var1 + ')');
    }
  }

  static final void method1127(int var0) {
    try {
      if (!DummyClass36.aBoolean2615) {
        if (ClientScriptEnum.anInt3660 != 0) {
          NpcConfiguration.anInt1297 = TextureSampler8.anInt3460;
          DummyClass36.anInt2612 = FloorOverlay.anInt2099;
        } else if (Structure.anInt3644 == 0) {
          NpcConfiguration.anInt1297 = SomethingTilek.anInt1676;
          DummyClass36.anInt2612 = HashTable.anInt1709;
        } else {
          NpcConfiguration.anInt1297 = DummyClass5.anInt2993;
          DummyClass36.anInt2612 = DummyClass36.anInt2614;
        }

        TextureSampler25.amountContextActions = 1;
        GroundItem.aClass94Array2935[0] = DummyClass12.aClass94_2031;
        DummyClass8.aClass94Array4016[0] = GroundItemNode.EMPTY_STRING;
        TextureSampler27.aShortArray3095[0] = 1005;
        MonoChromaticImageCache.anIntArray1578[0] = AnimationSomething.anInt3590;
      }

      if (0 != ~InventoryConfig.anInt3655) {
        PlayerAppearance.method1160(-113, InventoryConfig.anInt3655);
      }

      if (var0 == 0) {
        int var1;
        for (var1 = 0; var1 < SomethingWorldMapy.widgetQuads; ++var1) {
          if (GroundItemNode.aBooleanArray3674[var1]) {
            DummyClass9.aBooleanArray4008[var1] = true;
          }

          HashTable.aBooleanArray1712[var1] = GroundItemNode.aBooleanArray3674[var1];
          GroundItemNode.aBooleanArray3674[var1] = false;
        }

        AbstractDirectColorSprite.aClass11_3708 = null;
        DummyClass41.anInt865 = -1;
        SubNode.anInt2567 = -1;
        DummyClass54.aClass11_1402 = null;
        if (GlRenderer.useOpenGlRenderer) {
          DummyOutputStream.aBoolean47 = true;
        }

        SomethingOtherWorldMap.anInt2535 = AbstractGameWorld.updateCycle;
        if (~InventoryConfig.anInt3655 != 0) {
          SomethingWorldMapy.widgetQuads = 0;
          FileSystem.method841(true);
        }

        if (GlRenderer.useOpenGlRenderer) {
          GlUtils.resetClip();
        } else {
          DummyClass47.method1331();
        }

        FloorOverlay.method2278(var0 + 122);
        if (DummyClass36.aBoolean2615) {
          if (FileUnpacker.aBoolean1951) {
            ISAACCipher.method1230((byte) 116);
          } else {
            DummyClass51.method1419(-117);
          }
        } else if (null == AbstractDirectColorSprite.aClass11_3708) {
          if (0 != ~DummyClass41.anInt865) {
            IdentityKit.method950(null, -86, SubNode.anInt2567, DummyClass41.anInt865);
          }
        } else {
          IdentityKit
            .method950(AbstractDirectColorSprite.aClass11_3708, -120, GameException.anInt2115,
              TextureSampler18.anInt4041);
        }

        var1 = DummyClass36.aBoolean2615 ? -1 : TextureSampler22.method335(var0 + 16859);
        if (var1 == -1) {
          var1 = DummyClass12.anInt2027;
        }

        TextureSampler20.method229(var1, 20827);
        if (-2 == ~ClientScriptCall.anInt2440) {
          ClientScriptCall.anInt2440 = 2;
        }

        if (1 == GameObjectConfig.anInt1521) {
          GameObjectConfig.anInt1521 = 2;
        }

        if (~ClientScript.rectangleDebugType == -4) {
          for (int var2 = 0; ~var2 > ~SomethingWorldMapy.widgetQuads; ++var2) {
            if (!HashTable.aBooleanArray1712[var2]) {
              if (DummyClass9.aBooleanArray4008[var2]) {
                if (!GlRenderer.useOpenGlRenderer) {
                  DummyClass47
                    .method1312(AbstractAudioOutputStream.quadx0[var2], Player.quady0[var2],
                      GlTexture2d.quadx1[var2], Mobile.quady1[var2], 0xff0000, 0x80);
                } else {
                  GlUtils.fillQuad(AbstractAudioOutputStream.quadx0[var2], Player.quady0[var2],
                    GlTexture2d.quadx1[var2], Mobile.quady1[var2], 0xff0000, 0x80);
                }
              }
            } else if (!GlRenderer.useOpenGlRenderer) {
              DummyClass47.method1312(AbstractAudioOutputStream.quadx0[var2], Player.quady0[var2],
                GlTexture2d.quadx1[var2], Mobile.quady1[var2], 16711935, 128);
            } else {
              GlUtils.fillQuad(AbstractAudioOutputStream.quadx0[var2], Player.quady0[var2],
                GlTexture2d.quadx1[var2], Mobile.quady1[var2], 16711935, 128);
            }
          }
        }

        Deque.method1214(DisplayMode.loopCycle, TextureCache.localPlayer.anInt2819,
          TextureCache.localPlayer.anInt2829, GameWorldSomething.currentPlane, 1);
        DisplayMode.loopCycle = 0;
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "ha.G(" + var0 + ')');
    }
  }

  static final void method1129(int var0, int var1, int var2, int var3, int var4) {
    try {
      int var5 = var3;
      int var6 = var2;
      int var7 = -var2;
      int var8 = -1;
      int var9 = DummyClass59
        .method1040(GlTexture2d.anInt3765, var2 + var4, (byte) 0, DummyClass55.anInt1425);
      int var10 = DummyClass59
        .method1040(GlTexture2d.anInt3765, var4 - var2, (byte) 0, DummyClass55.anInt1425);
      TextureSampler18.method282(DummyClass35.anIntArrayArray663[var1], var10, -98, var9, var0);

      while (~var5 > ~var6) {
        var8 += 2;
        var7 += var8;
        int var11;
        int var12;
        int var13;
        int var14;
        if (var7 > 0) {
          --var6;
          var11 = -var6 + var1;
          var7 -= var6 << 1;
          var12 = var1 + var6;
          if (var12 >= DummyClass13.anInt2020 && var11 <= LightIntensity.anInt902) {
            var13 = DummyClass59
              .method1040(GlTexture2d.anInt3765, var4 - -var5, (byte) 0, DummyClass55.anInt1425);
            var14 = DummyClass59
              .method1040(GlTexture2d.anInt3765, -var5 + var4, (byte) 0, DummyClass55.anInt1425);
            if (LightIntensity.anInt902 >= var12) {
              TextureSampler18
                .method282(DummyClass35.anIntArrayArray663[var12], var14, var3 ^ 111, var13, var0);
            }

            if (DummyClass13.anInt2020 <= var11) {
              TextureSampler18
                .method282(DummyClass35.anIntArrayArray663[var11], var14, -84, var13, var0);
            }
          }
        }

        ++var5;
        var11 = -var5 + var1;
        var12 = var5 + var1;
        if (var12 >= DummyClass13.anInt2020 && ~LightIntensity.anInt902 <= ~var11) {
          var13 = DummyClass59
            .method1040(GlTexture2d.anInt3765, var4 - -var6, (byte) 0, DummyClass55.anInt1425);
          var14 = DummyClass59
            .method1040(GlTexture2d.anInt3765, -var6 + var4, (byte) 0, DummyClass55.anInt1425);
          if (var12 <= LightIntensity.anInt902) {
            TextureSampler18
              .method282(DummyClass35.anIntArrayArray663[var12], var14, 90, var13, var0);
          }

          if (var11 >= DummyClass13.anInt2020) {
            TextureSampler18
              .method282(DummyClass35.anIntArrayArray663[var11], var14, -103, var13, var0);
          }
        }
      }

    } catch (RuntimeException var15) {
      throw AbstractGameWorld.cascadeException(var15,
        "ha.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
    }
  }

  public static void method1130(int var0) {
    try {
      aClass3_Sub28_Sub16_812 = null;
      if (var0 < 54) {
        anInt819 = -109;
      }

      aClass47_818 = null;
      tileOnScreen = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ha.F(" + var0 + ')');
    }
  }

  final void decompress(byte[] var1, Buffer var2, boolean var3) {
    try {
      if (var3) {
        anInt815 = -81;
      }

      if (31 == var2.bytes[var2.position] && var2.bytes[var2.position + 1] == -117) {
        if (this.anInflater813 == null) {
          this.anInflater813 = new Inflater(true);
        }

        try {
          this.anInflater813.setInput(var2.bytes, var2.position + 10,
            -8 - (10 + var2.position) + var2.bytes.length);
          this.anInflater813.inflate(var1);
        } catch (Exception var5) {
          this.anInflater813.reset();
          throw new RuntimeException("Invalid GZIP compressed data!");
        }

        this.anInflater813.reset();
      } else {
        throw new RuntimeException("Invalid GZIP header!");
      }
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "ha.D(" + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ','
          + var3 + ')');
    }
  }

}
