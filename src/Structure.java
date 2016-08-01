final class Structure extends SubNode {

  static GameString aClass94_3637 = SpawnedGameObject.createString(")4p=");
  static int anInt3640;
  static boolean aBoolean3641 = false;
  static int anInt3642 = 0;
  static int anInt3644 = 0;
  private static GameString aClass94_3638 = SpawnedGameObject.createString("Loading fonts )2 ");
  static GameString aClass94_3643 = aClass94_3638;
  private static GameString aClass94_3639 =
    SpawnedGameObject.createString(" is already on your friend list)3");
  static GameString aClass94_3645 = aClass94_3639;
  private HashTable aClass130_3636;

  static final int method599(int var0, FileUnpacker var1) {
    try {
      int var2 = 0;
      if (var0 != -20916) {
        return -88;
      } else {
        if (var1.isLoaded(DummyClass14.titleBackgroundFileId)) {
          ++var2;
        }

        if (var1.isLoaded(BitVariable.logoFileId)) {
          ++var2;
        }

        return var2;
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld
        .cascadeException(var3, "lk.F(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  static final AbstractDirectColorSprite method602(int var0, int var1, byte var2,
                                                   FileUnpacker var3) {
    try {
      if (SomethingTexture4.loadSprites(var3, var0, var1, var2 ^ 30885)) {
        if (var2 != -18) {
          method607(true);
        }

        return Light.method1062(var2 + 103);
      } else {
        return null;
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "lk.R(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
    }
  }

  static final void method603(int var0, int var1, int var2, Widget var3, boolean var4) {
    try {
      int var5 = var3.anInt168;
      int var6 = var3.anInt193;
      if (var1 != 13987) {
        method602(-115, 65, (byte) -119, null);
      }

      if (-1 != ~var3.aByte304) {
        if (~var3.aByte304 != -2) {
          if (~var3.aByte304 == -3) {
            var3.anInt168 = var3.anInt177 * var2 >> 14;
          } else if (var3.aByte304 == 3) {
            if (~var3.anInt187 != -3) {
              if (var3.anInt187 == 7) {
                var3.anInt168 = 115 * var3.anInt177 + var3.anInt285 * (-1 + var3.anInt177);
              }
            } else {
              var3.anInt168 = var3.anInt177 * 32 - -((var3.anInt177 - 1) * var3.anInt285);
            }
          }
        } else {
          var3.anInt168 = var2 + -var3.anInt177;
        }
      } else {
        var3.anInt168 = var3.anInt177;
      }

      if (-1 == ~var3.aByte241) {
        var3.anInt193 = var3.anInt244;
      } else if (var3.aByte241 == 1) {
        var3.anInt193 = -var3.anInt244 + var0;
      } else if (~var3.aByte241 == -3) {
        var3.anInt193 = var0 * var3.anInt244 >> 14;
      } else if (var3.aByte241 == 3) {
        if (~var3.anInt187 == -3) {
          var3.anInt193 = (var3.anInt244 + -1) * var3.anInt290 + var3.anInt244 * 32;
        } else if (~var3.anInt187 == -8) {
          var3.anInt193 = var3.anInt244 * 12 + (-1 + var3.anInt244) * var3.anInt290;
        }
      }

      if (-5 == ~var3.aByte304) {
        var3.anInt168 = var3.anInt216 * var3.anInt193 / var3.anInt160;
      }

      if (var3.aByte241 == 4) {
        var3.anInt193 = var3.anInt160 * var3.anInt168 / var3.anInt216;
      }

      if (LinearHashTable.aBoolean1040 && (-1 != ~GameClient.method44(var3).anInt2205
        || ~var3.anInt187 == -1)) {
        if (var3.anInt193 < 5 && 5 > var3.anInt168) {
          var3.anInt193 = 5;
          var3.anInt168 = 5;
        } else {
          if (~var3.anInt168 >= -1) {
            var3.anInt168 = 5;
          }

          if (0 >= var3.anInt193) {
            var3.anInt193 = 5;
          }
        }
      }

      if (1337 == var3.anInt189) {
        FloorOverlay.aClass11_2091 = var3;
      }

      if (var4 && null != var3.anObjectArray235 && (~var5 != ~var3.anInt168
        || var3.anInt193 != var6)) {
        ClientScriptCall var7 = new ClientScriptCall();
        var7.arguments = var3.anObjectArray235;
        var7.aClass11_2449 = var3;
        DummyClass31.aClass61_1471.addLast(var7);
      }

    } catch (RuntimeException var8) {
      throw AbstractGameWorld.cascadeException(var8,
        "lk.E(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ','
          + var4 + ')');
    }
  }

  public static void method605(int var0) {
    try {
      aClass94_3637 = null;
      aClass94_3638 = null;
      aClass94_3639 = null;
      aClass94_3643 = null;
      if (var0 != 221301966) {
        method603(-111, -64, -10, null, false);
      }

      aClass94_3645 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "lk.D(" + var0 + ')');
    }
  }

  static final void method606(int var0, AreaSoundEffect var1, int var2, int var3, int var4,
                              int var5) {
    try {
      if (var5 > 44) {
        if (~var1.anInt2332 != 0 || var1.anIntArray2333 != null) {
          int var6 = 0;
          if (var1.anInt2321 < var0) {
            var6 += -var1.anInt2321 + var0;
          } else if (var1.anInt2326 > var0) {
            var6 += var1.anInt2326 - var0;
          }

          if (var1.anInt2307 >= var4) {
            if (var4 < var1.anInt2308) {
              var6 += -var4 + var1.anInt2308;
            }
          } else {
            var6 += -var1.anInt2307 + var4;
          }

          if (0 != var1.anInt2328 && ~var1.anInt2328 <= ~(var6 - 64) && 0 != DummyClass28.anInt340
            && var2 == var1.anInt2314) {
            var6 -= 64;
            if (var6 < 0) {
              var6 = 0;
            }

            int var7 = (-var6 + var1.anInt2328) * DummyClass28.anInt340 / var1.anInt2328;
            if (var1.aClass3_Sub24_Sub1_2312 == null) {
              if (-1 >= ~var1.anInt2332) {
                SoundEffect var8 =
                  SoundEffect.method1811(AbstractMouseWheel.soundEffects, var1.anInt2332, 0);
                if (null != var8) {
                  SomethingMusic0 var9 = var8.method1812().method151(DummyClass32.aClass157_524);
                  AudioStreamEncoder1 var10 = AudioStreamEncoder1.method437(var9, 100, var7);
                  var10.method429(-1);
                  MonoChromaticImageBuffer.aClass3_Sub24_Sub2_2563.method457(var10);
                  var1.aClass3_Sub24_Sub1_2312 = var10;
                }
              }
            } else {
              var1.aClass3_Sub24_Sub1_2312.method419(var7);
            }

            if (null != var1.aClass3_Sub24_Sub1_2315) {
              var1.aClass3_Sub24_Sub1_2315.method419(var7);
              if (!var1.aClass3_Sub24_Sub1_2315.method82(0)) {
                var1.aClass3_Sub24_Sub1_2315 = null;
              }
            } else if (var1.anIntArray2333 != null && ~(var1.anInt2316 -= var3) >= -1) {
              int var13 = (int) ((double) var1.anIntArray2333.length * Math.random());
              SoundEffect var14 = SoundEffect
                .method1811(AbstractMouseWheel.soundEffects, var1.anIntArray2333[var13], 0);
              if (null != var14) {
                SomethingMusic0 var15 = var14.method1812().method151(DummyClass32.aClass157_524);
                AudioStreamEncoder1 var11 = AudioStreamEncoder1.method437(var15, 100, var7);
                var11.method429(0);
                MonoChromaticImageBuffer.aClass3_Sub24_Sub2_2563.method457(var11);
                var1.anInt2316 = (int) ((double) (-var1.anInt2310 + var1.anInt2325) * Math.random())
                  + var1.anInt2310;
                var1.aClass3_Sub24_Sub1_2315 = var11;
              }
            }

          } else {
            if (null != var1.aClass3_Sub24_Sub1_2312) {
              MonoChromaticImageBuffer.aClass3_Sub24_Sub2_2563.method461(var1.aClass3_Sub24_Sub1_2312);
              var1.aClass3_Sub24_Sub1_2312 = null;
            }

            if (var1.aClass3_Sub24_Sub1_2315 != null) {
              MonoChromaticImageBuffer.aClass3_Sub24_Sub2_2563.method461(var1.aClass3_Sub24_Sub1_2315);
              var1.aClass3_Sub24_Sub1_2315 = null;
            }

          }
        }
      }
    } catch (RuntimeException var12) {
      throw AbstractGameWorld.cascadeException(var12,
        "lk.O(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ','
          + var4 + ',' + var5 + ')');
    }
  }

  static final void method607(boolean var0) {
    try {
      GameObject.aClass94_2751 = SomethingLight0.aClass94_1546;
      TextureSampler36.aClass94_3426 = MonoChromaticImageCache.aClass94_1575;
      DummyClass35.aClass94_662 = IdentityKit.aClass94_463;
      TextureSampler24.aClass94_3142 = SceneGraphTile.aClass94_2215;
      DummyClass15.aClass94_1879 = TextureSampler36.aClass94_3432;
      OndemandFileRequest.aClass94_4071 = PlayerVariable.aClass94_560;
      SomethingMidiFile.aClass94_2285 = PlayerVariable.aClass94_559;
      NPC.aClass94_3988 = DummyClass36.aClass94_2616;
      DummyClass8.aClass94_4024 = DummyClass37.aClass94_669;
      DummyClass53.aClass94_1335 = TextureSampler7.aClass94_3344;
      SomethingSceneJ.aClass94_327 = SpawnedGameObject.aClass94_2255;
      WidgetAccess.aClass94_2210 = Mouse.aClass94_1922;
      GameObject.OPTION_DROP = MilliFrameRegulator.aClass94_2687;
      FileCacheRequest.aClass94_4058 = TextureSampler35.aClass94_3324;
      AudioSomethingSomething.aClass94_2526 = HintMarker.aClass94_1348;
      AnimationSomething.aClass94_3586 = ClientScriptEnum.aClass94_3661;
      DummyClass24.aClass94_1653 = AbstractImageProducer.aClass94_2013;
      DummyInputStream.aClass94_43 = SomethingLight0.aClass94_1558;
      ItemConfig.aClass94_809 = DummyClass52.aClass94_1173;
      MapScene.aClass94_62 = TextureSampler35.aClass94_3326;
      FloorUnderlay.aClass94_1409 = WorldMapLabel.aClass94_1728;
      TriChromaticImageBuffer.aClass94_2481 = SomethingInScenePacket202.aClass94_2276;
      DummyClass27.aClass94_1583 = AudioSomethingSomething.aClass94_2499;
      SceneSomething.aClass94_485 = Texture.aClass94_3798;
      if (var0) {
        aBoolean3641 = false;
      }

      VertexNormal.aClass94_825 = SomethingInScenePacket202.aClass94_2269;
      AbstractFileRequest.aClass94_3629 = AudioStreamEncoder4.aClass94_3496;
      DummyClass35.aClass94_666 = IdentityKit.aClass94_463;
      aClass94_3643 = TextureSampler33.aClass94_3053;
      DummyClass12.aClass94_2031 = TriChromaticImageCache.aClass94_1377;
      DummyHashTable.aClass94_1688 = TextureSampler39.aClass94_3281;
      BufferObject.aClass94_1884 = LightIntensity.aClass94_901;
      DummyClass44.aClass94_935 = TextureSampler29.aClass94_3401;
      TextureSampler39.LOADING_PLEASE_WAIT = DummyClass44.aClass94_933;
      TextureSampler36.aClass94_3427 = TextureSampler32.aClass94_3355;
      HashTable.aClass94_1707 = SpotAnimationConfig.aClass94_552;
      Unsure.aClass94_1892 = Queue.aClass94_334;
      GameClient.aClass94_2196 = Light.aClass94_700;
      BlockConfig.aClass94_1180 = TextureSampler25.aClass94_3408;
      SceneShadowMap.CONNECTION_LOST = DummyClass1.aClass94_414;
      DummyClass32.SKILL = MaterialShader5.aClass94_2170;
      ClientScript.aClass94_3691 = EnumStringFetcher.aClass94_2163;
      RenderAnimation.aClass94_374 = GlTexture2d.aClass94_3763;
      GameStub.aClass94_4 = ItemConfig.aClass94_808;
      SceneGraphTile.aClass94_2216 = StringNode0.aClass94_2340;
      VertexNormal.aClass94_822 = DummyClass56.aClass94_1455;
      SomethingInScenePacket202.aClass94_2267 = AudioSomethingSomething.aClass94_2524;
      AnimationSomething.aClass94_3584 = ClientScriptEnum.aClass94_3661;
      WorldMapLabel.aClass94_1722 = SomethingQuickChatK.aClass94_150;
      DummyClass14.aClass94_1962 = DummyClass38.aClass94_728;
      TextureSampler29.aClass94_3397 = Widget.aClass94_297;
      Light.aClass94_691 = DummyClass6.aClass94_2042;
      IdentityKit.aClass94_461 = AbstractIndexedColorSprite.aClass94_1466;
      SomethingAudio.CONNECTING_TO_UPDATE_SERVER = AbstractAudioOutputStream.aClass94_1974;
      DummyClass42.DEFAULT_WALK_TOOLTIP = SomethingTexture3.aClass94_2653;
      GlTexture2d.aClass94_3762 = HashTable.aClass94_1702;
      TextureSampler38.aClass94_3445 = TextureSampler31.aClass94_3169;
      TextureSampler30.aClass94_3124 = StringNode0.aClass94_2336;
      SomethingTexture4.aClass94_2667 = AbstractDirectColorSprite.aClass94_3705;
      SubNode.aClass94_2576 = AnimationFrame.aClass94_2461;
      TextureSampler14.aClass94_3388 = ScriptState.aClass94_875;
      TextureSampler18.aClass94_4040 = StillGraphicNode.aClass94_3547;
      DummyClass14.ATTEMPTING_TO_RECONNECT = GameString.aClass94_2149;
      Buffer.LOADED_INTERFACES = Texture.aClass94_3785;
      SpotAnimationConfig.aClass94_551 = BufferData.aClass94_1647;
      GameWorld.aClass94_2624 = Something3dRoot.aClass94_2053;
      StillGraphicNode.aClass94_3544 = BZipDecompressorState.aClass94_145;
      ComponentCanvas.aClass94_36 = Unsure.aClass94_1889;
      TextureSampler11.aClass94_3249 = DummyClass7.aClass94_2997;
      IdentityKit.aClass94_462 = TextureSampler39.aClass94_3279;
      TextureSampler30.aClass94_3117 = StringNode0.aClass94_2336;
      StillGraphicNode.aClass94_3546 = RenderAnimation.aClass94_355;
      GameString.aClass94_2151 = SomethingTexture4.aClass94_2662;
      SomethingQuickChat.aClass94_3575 = LinearHashTable.aClass94_1044;
      DummyClass5.aClass94_2991 = DummyCanvas.aClass94_22;
      FileTable.aClass94_957 = AbstractFrameRegulator.aClass94_1696;
      DummyClass26.aClass94_1615 = ClassCheckRequest.aClass94_2297;
      TextureSampler28.aClass94_3311 = DummyClass50.aClass94_1140;
      DisplayMode.CONNECTED_TO_UPDATE_SERVER = AbstractObjectNodeWrapper.aClass94_1618;
      RenderAnimation.aClass94_361 = DummyClass28.aClass94_338;
      TextureSampler33.aClass94_3051 = DummyClass23.aClass94_1660;
      TextureSampler35.aClass94_3333 = SceneGraphTile.aClass94_2242;
      FileRequester.aClass94_2961 = DummyClass34.aClass94_591;
      aClass94_3645 = AnimationSequence.aClass94_1863;
      DummyClass30.aClass94_459 = TextureCache.aClass94_2132;
      TextureSampler27.aClass94_3097 = TextureSampler5.aClass94_3291;
      DummyClass32.aClass94_523 = SomethingWorldMappy.aClass94_2496;
      TextureSampler31.aClass94_3167 = FaceNormal.aClass94_1637;
      BlockConfig.aClass94_1183 = SpawnedGameObject.aClass94_2260;
      WorldMapLabel.aClass94_1731 = TextureSampler25.aClass94_3409;
      DummyClass32.aClass94_525 = GameWorld.aClass94_2628;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "lk.A(" + var0 + ')');
    }
  }

  final int method600(int var1, int var2, byte var3) {
    try {
      if (this.aClass130_3636 != null) {
        if (var3 != -29) {
          this.method604(null, (byte) 56, 110);
        }

        IntegerNode var4 = (IntegerNode) this.aClass130_3636.get((long) var1);
        return null == var4 ? var2 : var4.anInt2467;
      } else {
        return var2;
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld
        .cascadeException(var5, "lk.Q(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  private final void method601(Buffer var1, int var2, byte var3) {
    try {
      if (var3 < -2) {
        if (249 == var2) {
          int var4 = var1.readUnsignedByte();
          int var5;
          if (this.aClass130_3636 == null) {
            var5 = DummyClass53.nearestPo2((byte) 105, var4);
            this.aClass130_3636 = new HashTable(var5);
          }

          for (var5 = 0; var4 > var5; ++var5) {
            boolean var6 = 1 == var1.readUnsignedByte();
            int var7 = var1.readUnsignedMedium((byte) 95);
            Object var8;
            if (!var6) {
              var8 = new IntegerNode(var1.readInt());
            } else {
              var8 = new StringNode(var1.readString());
            }

            this.aClass130_3636.put((long) var7, (Node) var8);
          }
        }

      }
    } catch (RuntimeException var9) {
      throw AbstractGameWorld.cascadeException(var9,
        "lk.P(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
    }
  }

  final GameString method604(GameString var1, byte var2, int var3) {
    try {
      if (this.aClass130_3636 == null) {
        return var1;
      } else {
        StringNode var4 = (StringNode) this.aClass130_3636.get((long) var3);
        if (var2 != -44) {
          method607(false);
        }

        return null != var4 ? var4.aClass94_2586 : var1;
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "lk.B(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
    }
  }

  final void method608(int var1, Buffer var2) {
    try {
      while (true) {
        int var3 = var2.readUnsignedByte();
        if (0 == var3) {
          if (var1 != 5) {
            method607(false);
          }

          return;
        }

        this.method601(var2, var3, (byte) -5);
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld
        .cascadeException(var4, "lk.C(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
    }
  }

}
