final class DummyClass38 {

  static GameString aClass94_728 = SpawnedGameObject.createString("leuchten2:");
  static int[] anIntArray729 = new int[4096];
  static float aFloat730;
  static FileUnpacker aClass153_731;
  static boolean aBoolean732 = false;
  static int anInt733 = 0;
  static int anInt734 = 0;
  static int floorShadowsFileId;
  static AbstractDirectColorSprite aClass3_Sub28_Sub16_736;


  static final void method1080(int var0, int var1, byte var2, Player var3) {
    try {
      int var4;
      int var5;
      int var7;
      if (0 != (var0 & 128)) {
        var4 = SpotAnimationConfig.gameBuffer.readUnsignedShortLE();
        var5 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        int var6 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        var7 = SpotAnimationConfig.gameBuffer.position;
        boolean var8 = -1 != ~('\u8000' & var4);
        if (null != var3.name && var3.appearance != null) {
          long var9 = var3.name.toBase37();
          boolean var11 = false;
          if (var5 <= 1) {
            if (!var8 && (SomethingVolume15.aBoolean2433 && !BufferData.aBoolean1641
              || TextureSampler31.aBoolean3166)) {
              var11 = true;
            } else {
              for (int var12 = 0; var12 < AnimationSomething.anInt3591; ++var12) {
                if (MonoChromaticImageCache.aLongArray1574[var12] == var9) {
                  var11 = true;
                  break;
                }
              }
            }
          }

          if (!var11 && 0 == GameWorld.anInt2622) {
            DummyClass12.aClass3_Sub30_2030.position = 0;
            SpotAnimationConfig.gameBuffer
              .method774(2, var6, DummyClass12.aClass3_Sub30_2030.bytes, 0);
            DummyClass12.aClass3_Sub30_2030.position = 0;
            int var13 = -1;
            GameString var25;
            if (var8) {
              SomethingQuickChatK var14 =
                AbstractAudioOutputStream.method2156(1024, DummyClass12.aClass3_Sub30_2030);
              var4 &= 32767;
              var13 = var14.anInt149;
              var25 = var14.aClass3_Sub28_Sub4_151
                .method555(var2 + 28100, DummyClass12.aClass3_Sub30_2030);
            } else {
              var25 = AbstractFont.otherFormat(
                DummyClass34.decompressString(DummyClass12.aClass3_Sub30_2030).format(78));
            }

            var3.aClass94_2825 = var25.method1564(1);
            var3.anInt2753 = var4 & 255;
            var3.anInt2814 = 150;
            var3.anInt2837 = var4 >> 8;
            if (-3 != ~var5) {
              if (~var5 != -2) {
                InventoryConfig
                  .method611(var13, var8 ? 17 : 2, var25, null, (byte) 50, var3.getFullName());
              } else {
                InventoryConfig.method611(var13, var8 ? 17 : 1, var25, null, (byte) 50,
                  RenderAnimation
                    .concat(new GameString[] {DummyClass34.aClass94_592, var3.getFullName()}));
              }
            } else {
              InventoryConfig.method611(var13, !var8 ? 1 : 17, var25, null, (byte) 50,
                RenderAnimation
                  .concat(new GameString[] {DummyClass60.aClass94_444, var3.getFullName()}));
            }
          }
        }

        SpotAnimationConfig.gameBuffer.position = var7 + var6;
      }

      if (~(var0 & 1) != -1) {
        var4 = SpotAnimationConfig.gameBuffer.readUnsignedSmart(true);
        var5 = SpotAnimationConfig.gameBuffer.method751((byte) -99);
        var3.method1970(var5, -8, AbstractGameWorld.updateCycle, var4);
        var3.anInt2781 = 300 + AbstractGameWorld.updateCycle;
        var3.anInt2775 = SpotAnimationConfig.gameBuffer.method754(true);
      }

      if ((var0 & 8) != 0) {
        var4 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
        if (-65536 == ~var4) {
          var4 = -1;
        }

        var5 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        GroundItemNode.method628(0, var5, var4, var3);
      }

      if (0 != (4 & var0)) {
        var4 = SpotAnimationConfig.gameBuffer.method751((byte) -118);
        byte[] var16 = new byte[var4];
        Buffer var19 = new Buffer(var16);
        SpotAnimationConfig.gameBuffer.method764(0, var4, var16, (byte) 93);
        DummyClass45.configs[var1] = var19;
        var3.parseConfig(var19);
      }

      if ((2 & var0) != 0) {
        var3.anInt2772 = SpotAnimationConfig.gameBuffer.readUnsignedShortAdd();
        if (-65536 == ~var3.anInt2772) {
          var3.anInt2772 = -1;
        }
      }

      if (~(1024 & var0) != -1) {
        var3.anInt2784 = SpotAnimationConfig.gameBuffer.method786(true);
        var3.anInt2835 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        var3.anInt2823 = SpotAnimationConfig.gameBuffer.method751((byte) -106);
        var3.anInt2798 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        var3.anInt2800 =
          SpotAnimationConfig.gameBuffer.readUnsignedShortLE() + AbstractGameWorld.updateCycle;
        var3.anInt2790 =
          SpotAnimationConfig.gameBuffer.readUnsignedShortLE() - -AbstractGameWorld.updateCycle;
        var3.anInt2840 = SpotAnimationConfig.gameBuffer.method786(true);
        var3.anInt2816 = 1;
        var3.anInt2811 = 0;
      }

      if (~(var0 & 32) != -1) {
        var3.aClass94_2825 = SpotAnimationConfig.gameBuffer.readString();
        if (~var3.aClass94_2825.charAt(0) == -127) {
          var3.aClass94_2825 = var3.aClass94_2825.substring(1);
          GameBuffer.printMessage(var3.getFullName(), 2, var3.aClass94_2825, var2 ^ 78);
        } else if (var3 == TextureCache.localPlayer) {
          GameBuffer.printMessage(var3.getFullName(), 2, var3.aClass94_2825, var2 + 78);
        }

        var3.anInt2753 = 0;
        var3.anInt2837 = 0;
        var3.anInt2814 = 150;
      }

      if (~(var0 & 512) != -1) {
        var4 = SpotAnimationConfig.gameBuffer.readUnsignedSmart(true);
        var5 = SpotAnimationConfig.gameBuffer.method754(true);
        var3.method1970(var5, var2 + 71, AbstractGameWorld.updateCycle, var4);
      }

      if (~(2048 & var0) != -1) {
        var4 = SpotAnimationConfig.gameBuffer.method786(true);
        int[] var18 = new int[var4];
        int[] var17 = new int[var4];
        int[] var20 = new int[var4];

        for (int var22 = 0; ~var4 < ~var22; ++var22) {
          int var23 = SpotAnimationConfig.gameBuffer.readUnsignedShortLE();
          if ('\uffff' == var23) {
            var23 = -1;
          }

          var18[var22] = var23;
          var17[var22] = SpotAnimationConfig.gameBuffer.method751((byte) 125);
          var20[var22] = SpotAnimationConfig.gameBuffer.readUnsignedShort();
        }

        SomethingTexture.method1342(var17, var18, var3, (byte) -113, var20);
      }

      if ((256 & var0) != 0) {
        var4 = SpotAnimationConfig.gameBuffer.readUnsignedShortLE();
        if (var4 == '\uffff') {
          var4 = -1;
        }

        var5 = SpotAnimationConfig.gameBuffer.readInt((byte) -73);
        boolean var21 = true;
        if (~var4 != 0 && 0 != ~var3.anInt2842 && GameClient
          .method45(RenderAnimation.method898((byte) 42, var4).anInt542, (byte) -20).anInt1857
          < GameClient.method45(RenderAnimation.method898((byte) 42, var3.anInt2842).anInt542,
          (byte) -20).anInt1857) {
          var21 = false;
        }

        if (var21) {
          var3.anInt2759 = (var5 & '\uffff') + AbstractGameWorld.updateCycle;
          var3.anInt2761 = 0;
          var3.anInt2805 = 0;
          var3.anInt2842 = var4;
          if (~var3.anInt2759 < ~AbstractGameWorld.updateCycle) {
            var3.anInt2805 = -1;
          }

          var3.anInt2799 = var5 >> 16;
          var3.anInt2826 = 1;
          if (~var3.anInt2842 != 0 && AbstractGameWorld.updateCycle == var3.anInt2759) {
            var7 = RenderAnimation.method898((byte) 42, var3.anInt2842).anInt542;
            if (0 != ~var7) {
              AnimationSequence var24 = GameClient.method45(var7, (byte) -20);
              if (null != var24 && var24.anIntArray1851 != null) {
                SocketStream.method1470(var3.anInt2829, var24, 183921384, var3.anInt2819,
                  var3 == TextureCache.localPlayer, 0);
              }
            }
          }
        }
      }

      if (var2 == -79) {
        if (~(var0 & 64) != -1) {
          var3.anInt2786 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
          var3.anInt2762 = SpotAnimationConfig.gameBuffer.readShortLEAdd();
        }

      }
    } catch (RuntimeException var15) {
      throw AbstractGameWorld.cascadeException(var15,
        "gk.A(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
    }
  }

  public static void method1081(byte var0) {
    try {
      aClass3_Sub28_Sub16_736 = null;
      anIntArray729 = null;
      aClass94_728 = null;
      if (var0 <= 63) {
        loadSprites(null, -60);
      }

      aClass153_731 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "gk.E(" + var0 + ')');
    }
  }

  static final void loadSprites(byte[] var0, int var1) {
    try {
      Buffer var2 = new Buffer(var0);
      var2.position = -2 + var0.length;
      DummyClass53.spriteCount = var2.readUnsignedShort();
      TextureSampler26.anIntArray3076 = new int[DummyClass53.spriteCount];
      GroundItem.anIntArray2931 = new int[DummyClass53.spriteCount];
      Something3dRoot.anIntArray2048 = new int[DummyClass53.spriteCount];
      TextureSampler0.aBooleanArray3272 = new boolean[DummyClass53.spriteCount];
      DummyClass4.aByteArrayArray3005 = new byte[DummyClass53.spriteCount][];
      Buffer.anIntArray2591 = new int[DummyClass53.spriteCount];
      DummyClass5.aByteArrayArray2987 = new byte[DummyClass53.spriteCount][];
      var2.position = -(8 * DummyClass53.spriteCount) + var0.length - 7;
      SomethingVolume15.anInt2426 = var2.readUnsignedShort();
      SomethingPacket116.anInt1748 = var2.readUnsignedShort();
      int var3 = (var2.readUnsignedByte() & 255) - -1;

      int var4;
      for (var4 = 0; ~var4 > ~DummyClass53.spriteCount; ++var4) {
        Something3dRoot.anIntArray2048[var4] = var2.readUnsignedShort();
      }

      if (var1 < 11) {
        method1081((byte) -52);
      }

      for (var4 = 0; ~var4 > ~DummyClass53.spriteCount; ++var4) {
        Buffer.anIntArray2591[var4] = var2.readUnsignedShort();
      }

      for (var4 = 0; DummyClass53.spriteCount > var4; ++var4) {
        GroundItem.anIntArray2931[var4] = var2.readUnsignedShort();
      }

      for (var4 = 0; ~var4 > ~DummyClass53.spriteCount; ++var4) {
        TextureSampler26.anIntArray3076[var4] = var2.readUnsignedShort();
      }

      var2.position = -(8 * DummyClass53.spriteCount) + var0.length + -7 + 3 + -(var3 * 3);
      TextureSampler38.anIntArray3446 = new int[var3];

      for (var4 = 1; ~var4 > ~var3; ++var4) {
        TextureSampler38.anIntArray3446[var4] = var2.readUnsignedMedium((byte) 122);
        if (0 == TextureSampler38.anIntArray3446[var4]) {
          TextureSampler38.anIntArray3446[var4] = 1;
        }
      }

      var2.position = 0;

      for (var4 = 0; var4 < DummyClass53.spriteCount; ++var4) {
        int var5 = GroundItem.anIntArray2931[var4];
        int var6 = TextureSampler26.anIntArray3076[var4];
        int var7 = var5 * var6;
        byte[] var8 = new byte[var7];
        boolean var10 = false;
        DummyClass5.aByteArrayArray2987[var4] = var8;
        byte[] var9 = new byte[var7];
        DummyClass4.aByteArrayArray3005[var4] = var9;
        int var11 = var2.readUnsignedByte();
        int var12;
        if (-1 != ~(1 & var11)) {
          int var13;
          for (var12 = 0; ~var12 > ~var5; ++var12) {
            for (var13 = 0; var13 < var6; ++var13) {
              var8[var12 + var13 * var5] = var2.readByte();
            }
          }

          if (-1 != ~(var11 & 2)) {
            for (var12 = 0; ~var12 > ~var5; ++var12) {
              for (var13 = 0; var13 < var6; ++var13) {
                byte var14 = var9[var5 * var13 + var12] = var2.readByte();
                var10 |= -1 != var14;
              }
            }
          }
        } else {
          for (var12 = 0; ~var7 < ~var12; ++var12) {
            var8[var12] = var2.readByte();
          }

          if ((2 & var11) != 0) {
            for (var12 = 0; ~var12 > ~var7; ++var12) {
              byte var16 = var9[var12] = var2.readByte();
              var10 |= var16 != -1;
            }
          }
        }

        TextureSampler0.aBooleanArray3272[var4] = var10;
      }

    } catch (RuntimeException var15) {
      throw AbstractGameWorld
        .cascadeException(var15, "gk.B(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

  static final void method1083(byte var0) {
    try {
      TextureSampler16.anIntArray3107 =
        DummyInputStream.method62(true, 14585, 8, 2048, 4, 0.4F, 8, 35);
      int var1 = -5 / ((var0 - 45) / 59);
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "gk.C(" + var0 + ')');
    }
  }

  static final void method1084(SubNode var0, SubNode var1, byte var2) {
    try {
      if (var1.prevSubNode != null) {
        var1.unlinkSubNode();
      }

      var1.prevSubNode = var0;
      var1.nextSubNode = var0.nextSubNode;
      var1.prevSubNode.nextSubNode = var1;
      if (var2 <= 101) {
        aBoolean732 = true;
      }

      var1.nextSubNode.prevSubNode = var1;
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "gk.D(" + (var0 != null ? "{...}" : "null") + ',' + (var1 != null ? "{...}" : "null") + ','
          + var2 + ')');
    }
  }

}
