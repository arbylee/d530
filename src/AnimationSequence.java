final class AnimationSequence {

  static volatile long canvasInitializedTime = 0L;
  static FileUnpacker aClass153_1852;
  static int anInt1853;
  static AbstractIndexedColorSprite logoSprite;
  static int anInt1858;
  static FileUnpacker animationSequences;
  static int fps = 0;
  static GameString aClass94_1863 =
    SpawnedGameObject.createString(" steht bereits auf Ihrer Freunde)2Liste(Q");
  static SceneSomething[] aClass25Array1868;
  static int[] anIntArray1871 = new int[2];
  int anInt1845 = 2;
  boolean tween = false;
  boolean aBoolean1848 = false;
  int anInt1849 = -1;
  int anInt1850 = -1;
  int[] anIntArray1851;
  int anInt1854 = -1;
  boolean[] aBooleanArray1855;
  int anInt1857 = 5;
  boolean aBoolean1859 = false;
  int anInt1861 = 99;
  int anInt1864;
  int anInt1865 = -1;
  int anInt1866 = -1;
  int[][] anIntArrayArray1867;
  int[] anIntArray1869;
  boolean aBoolean1872 = false;
  private int[] anIntArray1870;

  static final SomethingGl0 method2052(HashTable var0, boolean var1, FloorOverlay var2) {
    try {
      long var3 =
        (long) ((var2.anInt2095 - -1 << 16) + var2.anInt2090) + (((long) var2.anInt2100 << 56) - -(
          (long) var2.anInt2094 << 32));
      if (var1) {
        aClass94_1863 = null;
      }

      SomethingGl0 var5 = (SomethingGl0) var0.get(var3);
      if (null == var5) {
        var5 =
          new SomethingGl0(var2.anInt2095, (float) var2.anInt2090, true, false, var2.anInt2094);
        var0.put(var3, var5);
      }

      return var5;
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "tk.J(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + (var2 != null ?
          "{...}" :
          "null") + ')');
    }
  }

  public static void method2057(byte var0) {
    try {
      aClass25Array1868 = null;
      logoSprite = null;
      animationSequences = null;
      aClass153_1852 = null;
      if (var0 != -108) {
        aClass153_1852 = null;
      }

      aClass94_1863 = null;
      anIntArray1871 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "tk.F(" + var0 + ')');
    }
  }

  static final void method2061(boolean var0) {
    try {
      MonoChromaticImageBuffer.anInt2556 = 0;
      Mobile.aBoolean2774 = true;
      AbstractIndexedColorSprite.aLong1465 = 0L;
      SceneSomething2.anInt1060 = 0;
      ByteArrayNode.anInt3613 = 0;
      DummyClass52.anInt1172 = 0;
      ISAACCipher.anInt969 = 0;
      LightIntensity.anInt903 = 0;
      HintMarker.anInt1361 = 0;
      GroundItemNode.anInt3677 = 0;
      GameStub.anInt2 = 0;
      DummyClass50.anInt1141 = 0;
      AudioSomethingSomething.anInt2500 = 0;
      TextureSampler15.anInt3199 = 0;
      SomethingQuickChat.anInt3569 = 0;
      TextureSampler11.anInt3248 = 0;
      TextureSampler27.anInt3090 = 0;
      DummyClass32.anInt513 = 0;
      ObjectCache.anInt1330 = 0;
      DummyClass14.anInt1956 = 0;
      TextureSampler1.anInt3136 = 0;
      DummyCanvas.anInt16 = 0;
      FileCacheRequest.anInt4054 = 0;
      SomethingTilek.anInt1677 = 0;
      SocketStream.anInt1240 = 0;
      DummyCanvas.anInt19 = 0;
      AbstractFileRequest.anInt3630 = 0;
      TextureSampler17.anInt3187 = 0;
      SomethingOtherWorldMap.anInt2541 = 0;
      Deque.anInt937 = 0;
      CollisionMap.anInt1307 = 0;
      Cursor.anInt880 = 0;
      TextureSampler37.anInt3259 = 0;
      ClientScriptCall.anInt2437 = 0;
      EnumStringFetcher.anInt2165 = 0;
      TextureSampler20.anInt3151 = 0;
      DummyClass52.anInt1170 = 0;
      FloorUnderlay.anInt1405 = 0;
      ClientScriptEnum.anInt3659 = 0;
      LightIntensity.anInt900 = 0;
      WidgetAccess.anInt2204 = 0;
      DummyClass18.anInt79 = 0;
      HashTable.anInt1701 = 0;
      TextureSampler13.anInt3365 = 0;
      BufferObject.anInt1886 = 0;
      TextureSampler10.anInt3442 = 0;
      SomethingIndex150.anInt2081 = 0;
      Light.anInt715 = 0;
      GameString.anInt2145 = 0;
      ByteArrayNode.anInt3609 = 0;
      SomethingOtherWorldMap.anInt2540 = 0;
      TextureSampler25.anInt3402 = 0;
      TextureSampler10.anInt3439 = 0;
      DummyClass59.anInt674 = 0;
      DummyClass10.anInt2085 = 0;
      Keyboard.anInt1910 = 0;
      TextureSampler24.anInt3144 = 0;
      DummyCanvas.anInt17 = 0;
      FaceNormal.anInt1633 = 0;
      AudioWorker.anInt342 = 0;
      DummyClass15.anInt1873 = 0;
      SomethingTexture3.anInt2651 = 0;
      Keyboard.anInt1909 = 0;
      SceneShadowMap.anInt1776 = 0;
      DummyClass30.anInt456 = 0;
      SomethingMidiFile.anInt2290 = 0;
      DummyClass4.anInt3001 = 0;
      anInt1858 = 0;
      OndemandFileRequest.anInt4065 = 0;
      Deque.anInt938 = 0;
      SomethingSceneI.anInt421 = 0;
      ItemConfig.anInt763 = 0;
      Keyboard.anInt1906 = 0;
      AudioWorker.anInt348 = 0;
      ScriptState.anInt876 = 0;
      DummyClass42.anInt889 = 0;
      StringNode0.anInt2337 = 0;
      DisplayMode.anInt1439 = 0;
      ClanChatUser.anInt2479 = 0;
      SomethingOtherWorldMap.anInt2534 = 0;
      Unsure.anInt1896 = 0;
      AbstractObjectNodeWrapper.anInt1623 = 0;
      DummyClass11.anInt2037 = 0;
      DummyClass24.anInt1657 = 0;
      DummyClass52.anInt1166 = 0;
      TextureSampler37.anInt3255 = 0;
      DummyClass9.anInt4011 = 0;
      ComponentCanvas.anInt27 = 0;
      SomethingTexture1.anInt2640 = 0;
      BufferObject.anInt1883 = 0;
      TextureSampler0.anInt3277 = 0;
      TextureSampler8.anInt3459 = 0;
      TextureSampler30.anInt3122 = 0;
      MilliFrameRegulator.anInt2684 = 0;
      DummyClass28.anInt336 = 0;
      DummyClass29.anInt437 = 0;
      OndemandRequester.anInt994 = 0;
      Parameter.anInt3618 = 0;
      DummyClass37.anInt671 = 0;
      Projectile.anInt2901 = 0;
      SomethingPacket116.anInt1756 = 0;
      GroundItemNode.anInt3670 = 0;
      TextureSampler22.anInt3420 = 0;
      Mobile.anInt2770 = 0;
      DummyClass25.anInt1629 = 0;
      SpotAnimationConfig.anInt544 = 0;
      anInt1853 = 0;
      Parameter.anInt3615 = 0;
      FileUnpacker.anInt1944 = 0;
      Something3dRoot.anInt2059 = 0;
      SubNode.anInt2571 = 0;
      GameWorldSomething.anInt503 = 0;
      TextureSampler0.anInt3267 = 0;
      StillGraphicNode.anInt3542 = 0;
      SceneSomething.anInt494 = 0;
      Something3d.anInt3017 = 0;
      GZipDecompressor.anInt816 = 0;
      DummyCanvas.anInt18 = 0;
      PlayerVariable.anInt562 = 0;
      Structure.anInt3640 = 0;
      AbstractFileRequest.anInt3627 = 0;
      Inventory.anInt2549 = 0;
      ItemConfig.anInt759 = 0;
      TextureCache.anInt2130 = 0;
      FileCache.anInt685 = 0;
      TextureSampler15.anInt3205 = 0;
      DummyClass1.anInt411 = 0;
      PlayerVariable.anInt555 = 0;
      DummyClass30.anInt452 = 0;
      AnimationFrame.anInt2459 = 0;
      AudioWorker.anInt349 = 0;
      DummyClass20.anInt1781 = 0;
      ClientScript.anInt3681 = 0;
      AudioStreamEncoder4.anInt3517 = 0;
      Buffer.anInt2592 = 0;
      FloorOverlay.anInt2088 = 0;
      TextureSampler26.anInt3084 = 0;
      DisplayMode.aClass67_1443.anInt1018 = 0;
      TextureSampler26.focused = true;
      AbstractTextureSampler.method153(112);
      IdentityKit.lastPacketId2 = -1;
      EnumStringFetcher.lastPacketId1 = -1;
      GameString.packetId = -1;
      DummyClass13.anInt2023 = 0;
      DummyClass36.updateTime = 0;
      TextureSampler12.secureBuffer.position = 0;
      StringNode.lastPacketId0 = -1;
      AbstractDirectColorSprite.anInt3699 = 0;
      SpotAnimationConfig.gameBuffer.position = 0;

      int var1;
      for (var1 = 0; ~var1 > ~GameException.aClass96Array2114.length; ++var1) {
        GameException.aClass96Array2114[var1] = null;
      }

      TextureSampler25.amountContextActions = 0;
      DummyClass36.aBoolean2615 = false;
      DummyClass30.method940(119, 0);

      for (var1 = 0; -101 < ~var1; ++var1) {
        StringNode.aClass94Array2580[var1] = null;
      }

      Something3d.anInt3012 = 0;
      TextureSampler19.anInt3216 = (int) (Math.random() * 100.0D) + -50;
      DummyClass38.anInt733 = 0;
      SpotAnimationConfig.anInt531 = 2047 & (int) (Math.random() * 20.0D) - 10;
      DummyClass43.anInt909 = -1;
      DummyClass13.anInt2022 = 0;
      DummyClass12.minimapMode = 0;
      DummyInputStream.anInt42 = (int) (110.0D * Math.random()) + -55;
      SceneNode.aBoolean1837 = false;
      Something3d2.anInt3020 = -20 + (int) (30.0D * Math.random());
      SomethingLight0.anInt1552 = 0;
      DummyClass45.anInt987 = 0;
      TextureSampler9.anInt3102 = -60 + (int) (Math.random() * 120.0D);
      TextureSampler16.anInt3114 = 0;
      StringNode.anInt2589 = (int) (80.0D * Math.random()) - 40;
      DummyClass6.anInt2046 = 0;

      for (var1 = 0; 2048 > var1; ++var1) {
        TextureSampler0.players[var1] = null;
        DummyClass45.configs[var1] = null;
      }

      for (var1 = 0; var1 < '\u8000'; ++var1) {
        TextureSampler5.npcs[var1] = null;
      }

      TextureCache.localPlayer = TextureSampler0.players[2047] = new Player();
      TextureSampler13.projectiles.clear(-112);
      TextureSampler17.stillGraphics.clear(-58);
      if (null != TextureSampler0.groundItems) {
        for (var1 = 0; 4 > var1; ++var1) {
          for (int var2 = 0; ~var2 > -105; ++var2) {
            for (int var3 = 0; ~var3 > -105; ++var3) {
              TextureSampler0.groundItems[var1][var2][var3] = null;
            }
          }
        }
      }

      TextureSampler26.aClass61_3075 = new Deque();
      HintMarker.anInt1357 = 0;
      FileSystem.anInt104 = 0;
      TextureSampler6.resetVariables(-114);
      SceneGraphTile.method103((byte) 24);
      AbstractSomethingTexture.anInt1105 = 0;
      DummyClass8.anInt4014 = 0;
      SomethingAudio.anInt1996 = 0;
      TextureSampler25.anInt3414 = 0;
      AbstractMouseWheel.anInt1904 = 0;
      ComponentCanvas.anInt30 = 0;
      SpotAnimationConfig.anInt529 = 0;
      Mouse.anInt1923 = 0;
      AbstractFileRequest.anInt3631 = 0;
      DummyClass8.anInt4021 = 0;

      for (var1 = 0; ~NpcConfiguration.anIntArray1277.length < ~var1; ++var1) {
        NpcConfiguration.anIntArray1277[var1] = -1;
      }

      if (0 != ~InventoryConfig.anInt3655) {
        DummyClass44.method1208((byte) -128, InventoryConfig.anInt3655);
      }

      for (SomethingPacket151 var7 =
           (SomethingPacket151) TextureSampler23.aClass130_3208.getFirst(82);
           var7 != null;
           var7 = (SomethingPacket151) TextureSampler23.aClass130_3208.getNext(-104)) {
        TextureSampler19.method254(true, var7, false);
      }

      InventoryConfig.anInt3655 = -1;
      TextureSampler23.aClass130_3208 = new HashTable(8);
      VariableUpdate.method122(-113);
      TextureSampler27.aClass11_3087 = null;
      DummyClass36.aBoolean2615 = false;
      TextureSampler25.amountContextActions = 0;
      DummyClass49.aClass52_1112.update(new int[] {0, 0, 0, 0, 0}, -1, false, 0, null, -1);

      for (var1 = 0; 8 > var1; ++var1) {
        CollisionMap.playerOptions[var1] = null;
        DummyClass3.aBooleanArray54[var1] = false;
        TextureSampler35.anIntArray3328[var1] = -1;
      }

      Parameter.method580((byte) 80);
      TextureSampler34.aBoolean3064 = true;

      for (var1 = 0; var1 < 100; ++var1) {
        GroundItemNode.aBooleanArray3674[var1] = true;
      }

      SubNode.anInt2572 = 0;
      ClientScript.aClass3_Sub19Array3694 = null;
      Widget.aClass94_251 = null;

      for (var1 = 0; 6 > var1; ++var1) {
        TextureSampler29.aClass133Array3393[var1] = new SomethingPacket116();
      }

      for (var1 = 0; -26 < ~var1; ++var1) {
        TextureSampler17.anIntArray3185[var1] = 0;
        TriChromaticImageBuffer.anIntArray2480[var1] = 0;
        SomethingPacket116.anIntArray1743[var1] = 0;
      }

      if (GlRenderer.useOpenGlRenderer) {
        TextureSampler31.method236((byte) 64);
      }

      OndemandFileRequest.aBoolean4068 = var0;
      SomethingLight0.interfaceCounter = 0;
      TextureSampler32.walkTooltip = DummyClass42.DEFAULT_WALK_TOOLTIP;
      FileCacheRequester.aBoolean1084 = false;
      TextureSampler38.aShortArray3455 = TextureSampler16.aShortArray3110 =
        SceneShadowMap.aShortArray1779 = TextureSampler38.aShortArray3453 = new short[256];
      AbstractTextureSampler.method165(-7878);
      FileUnpacker.aBoolean1951 = false;
      TextureSampler9.method204(-3);
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6, "tk.A(" + var0 + ')');
    }
  }

  final void method2053(Buffer var1, byte var2) {
    try {
      if (var2 != -102) {
        this.method2055(null, (byte) 88, 7, 103, 54);
      }

      while (true) {
        int var3 = var1.readUnsignedByte();
        if (var3 == 0) {
          return;
        }

        this.method2060(var3, (byte) -73, var1);
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld
        .cascadeException(var4, "tk.I(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
    }
  }

  final AbstractModel method2054(int var1, int var2, int var3, AbstractModel var4, int var5,
                                 int var6) {
    try {
      int var7 = this.anIntArray1869[var2];
      var2 = this.anIntArray1851[var2];
      AnimationSomething var8 = AreaSoundEffect.method133(var2 >> 16, var1 + -19749);
      var2 &= '\uffff';
      if (var8 == null) {
        return var4.method1890(true, true, true);
      } else {
        var5 &= 3;
        AnimationSomething var9 = null;
        if (var1 != 19749) {
          this.method2053(null, (byte) -126);
        }

        if ((this.tween || MonoChromaticImageBuffer.tweening) && ~var3 != 0
          && this.anIntArray1851.length > var3) {
          var3 = this.anIntArray1851[var3];
          var9 = AreaSoundEffect.method133(var3 >> 16, 0);
          var3 &= '\uffff';
        }

        AbstractModel var10;
        if (var9 != null) {
          var10 = var4
            .method1890(!var8.method559(1317095745, var2) & !var9.method559(1317095745, var3),
              !var8.method561(var2, (byte) 125) & !var9.method561(var3, (byte) 118),
              !this.aBoolean1848);
        } else {
          var10 = var4
            .method1890(!var8.method559(1317095745, var2), !var8.method561(var2, (byte) 121),
              !this.aBoolean1848);
        }

        if (GlRenderer.useOpenGlRenderer && this.aBoolean1848) {
          if (-2 != ~var5) {
            if (2 != var5) {
              if (~var5 == -4) {
                ((GlModel) var10).method1925();
              }
            } else {
              ((GlModel) var10).method1911();
            }
          } else {
            ((GlModel) var10).method1902();
          }
        } else if (var5 != 1) {
          if (2 != var5) {
            if (3 == var5) {
              var10.rotateQuarterY();
            }
          } else {
            var10.method1874();
          }
        } else {
          var10.method1900();
        }

        var10.method1880(var8, var2, var9, var3, -1 + var6, var7, this.aBoolean1848);
        if (GlRenderer.useOpenGlRenderer && this.aBoolean1848) {
          if (1 != var5) {
            if (var5 == 2) {
              ((GlModel) var10).method1911();
            } else if (var5 == 3) {
              ((GlModel) var10).method1902();
            }
          } else {
            ((GlModel) var10).method1925();
          }
        } else if (~var5 != -2) {
          if (-3 != ~var5) {
            if (var5 == 3) {
              var10.method1900();
            }
          } else {
            var10.method1874();
          }
        } else {
          var10.rotateQuarterY();
        }

        return var10;
      }
    } catch (RuntimeException var11) {
      throw AbstractGameWorld.cascadeException(var11,
        "tk.D(" + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ','
          + var5 + ',' + var6 + ')');
    }
  }

  final AbstractModel method2055(AbstractModel var1, byte var2, int var3, int var4, int var5) {
    try {
      int var7 = this.anIntArray1851[var5];
      int var6 = this.anIntArray1869[var5];
      AnimationSomething var8 = AreaSoundEffect.method133(var7 >> 16, 0);
      var7 &= '\uffff';
      if (null == var8) {
        return var1.method1894(true, true, true);
      } else {
        AnimationSomething var9 = null;
        if ((this.tween || MonoChromaticImageBuffer.tweening) && 0 != ~var3
          && ~var3 > ~this.anIntArray1851.length) {
          var3 = this.anIntArray1851[var3];
          var9 = AreaSoundEffect.method133(var3 >> 16, 0);
          var3 &= '\uffff';
        }

        AnimationSomething var10 = null;
        int var12 = 47 % ((var2 - 66) / 45);
        AnimationSomething var11 = null;
        int var13 = 0;
        int var14 = 0;
        if (null != this.anIntArray1870) {
          if (~this.anIntArray1870.length < ~var5) {
            var13 = this.anIntArray1870[var5];
            if (~var13 != -65536) {
              var10 = AreaSoundEffect.method133(var13 >> 16, 0);
              var13 &= '\uffff';
            }
          }

          if ((this.tween || MonoChromaticImageBuffer.tweening) && -1 != var3
            && this.anIntArray1870.length > var3) {
            var14 = this.anIntArray1870[var3];
            if (~var14 != -65536) {
              var11 = AreaSoundEffect.method133(var14 >> 16, 0);
              var14 &= '\uffff';
            }
          }
        }

        boolean var15 = !var8.method559(1317095745, var7);
        boolean var16 = !var8.method561(var7, (byte) 119);
        if (var10 != null) {
          var15 &= !var10.method559(1317095745, var13);
          var16 &= !var10.method561(var13, (byte) 115);
        }

        if (null != var9) {
          var15 &= !var9.method559(1317095745, var3);
          var16 &= !var9.method561(var3, (byte) 123);
        }

        if (null != var11) {
          var15 &= !var11.method559(1317095745, var14);
          var16 &= !var11.method561(var14, (byte) 121);
        }

        AbstractModel var17 = var1.method1894(var15, var16, !this.aBoolean1848);
        var17.method1880(var8, var7, var9, var3, var4 - 1, var6, this.aBoolean1848);
        if (null != var10) {
          var17.method1880(var10, var13, var11, var14, var4 + -1, var6, this.aBoolean1848);
        }

        return var17;
      }
    } catch (RuntimeException var18) {
      throw AbstractGameWorld.cascadeException(var18,
        "tk.E(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ','
          + var5 + ')');
    }
  }

  final AbstractModel method2056(int var1, int var2, int var3, int var4, AbstractModel var5,
                                 int var6) {
    try {
      int var7 = this.anIntArray1869[var2];
      var2 = this.anIntArray1851[var2];
      AnimationSomething var8 = AreaSoundEffect.method133(var2 >> 16, var6 + -3);
      var2 &= '\uffff';
      if (null == var8) {
        return var5.method1894(true, true, true);
      } else {
        var4 &= var6;
        AnimationSomething var9 = null;
        if ((this.tween || MonoChromaticImageBuffer.tweening) && ~var1 != 0
          && ~var1 > ~this.anIntArray1851.length) {
          var1 = this.anIntArray1851[var1];
          var9 = AreaSoundEffect.method133(var1 >> 16, var6 + -3);
          var1 &= '\uffff';
        }

        AbstractModel var10;
        if (null == var9) {
          var10 = var5
            .method1894(!var8.method559(1317095745, var2), !var8.method561(var2, (byte) 123),
              !this.aBoolean1848);
        } else {
          var10 = var5
            .method1894(!var8.method559(1317095745, var2) & !var9.method559(1317095745, var1),
              !var8.method561(var2, (byte) 125) & !var9.method561(var1, (byte) 123),
              !this.aBoolean1848);
        }

        if (this.aBoolean1848 && GlRenderer.useOpenGlRenderer) {
          if (1 != var4) {
            if (-3 == ~var4) {
              ((GlModel) var10).method1911();
            } else if (-4 == ~var4) {
              ((GlModel) var10).method1925();
            }
          } else {
            ((GlModel) var10).method1902();
          }
        } else if (var4 == 1) {
          var10.method1900();
        } else if (var4 == 2) {
          var10.method1874();
        } else if (var4 == 3) {
          var10.rotateQuarterY();
        }

        var10.method1880(var8, var2, var9, var1, var3 + -1, var7, this.aBoolean1848);
        if (this.aBoolean1848 && GlRenderer.useOpenGlRenderer) {
          if (~var4 == -2) {
            ((GlModel) var10).method1925();
          } else if (-3 == ~var4) {
            ((GlModel) var10).method1911();
          } else if (~var4 == -4) {
            ((GlModel) var10).method1902();
          }
        } else if (1 != var4) {
          if (var4 == 2) {
            var10.method1874();
          } else if (3 == var4) {
            var10.method1900();
          }
        } else {
          var10.rotateQuarterY();
        }

        return var10;
      }
    } catch (RuntimeException var11) {
      throw AbstractGameWorld.cascadeException(var11,
        "tk.B(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + (var5 != null ?
          "{...}" :
          "null") + ',' + var6 + ')');
    }
  }

  final void method2058(byte var1) {
    try {
      if (var1 == -41) {
        if (0 == ~this.anInt1866) {
          if (null == this.aBooleanArray1855) {
            this.anInt1866 = 0;
          } else {
            this.anInt1866 = 2;
          }
        }

        if (-1 == this.anInt1850) {
          if (null != this.aBooleanArray1855) {
            this.anInt1850 = 2;
          } else {
            this.anInt1850 = 0;
          }
        }

      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "tk.C(" + var1 + ')');
    }
  }

  final AbstractModel method2059(int var1, int var2, int var3, byte var4, AbstractModel var5) {
    try {
      int var8 = 43 / ((var4 - 4) / 54);
      int var6 = this.anIntArray1869[var3];
      var3 = this.anIntArray1851[var3];
      AnimationSomething var7 = AreaSoundEffect.method133(var3 >> 16, 0);
      var3 &= '\uffff';
      if (var7 == null) {
        return var5.method1882(true, true, true);
      } else {
        AnimationSomething var9 = null;
        if ((this.tween || MonoChromaticImageBuffer.tweening) && ~var1 != 0
          && ~this.anIntArray1851.length < ~var1) {
          var1 = this.anIntArray1851[var1];
          var9 = AreaSoundEffect.method133(var1 >> 16, 0);
          var1 &= '\uffff';
        }

        AbstractModel var10;
        if (null == var9) {
          var10 = var5
            .method1882(!var7.method559(1317095745, var3), !var7.method561(var3, (byte) 118),
              !this.aBoolean1848);
        } else {
          var10 = var5
            .method1882(!var7.method559(1317095745, var3) & !var9.method559(1317095745, var1),
              !var7.method561(var3, (byte) 119) & !var9.method561(var1, (byte) 118),
              !this.aBoolean1848);
        }

        var10.method1880(var7, var3, var9, var1, var2 + -1, var6, this.aBoolean1848);
        return var10;
      }
    } catch (RuntimeException var11) {
      throw AbstractGameWorld.cascadeException(var11,
        "tk.G(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + (var5 != null ?
          "{...}" :
          "null") + ')');
    }
  }

  private final void method2060(int var1, byte var2, Buffer var3) {
    try {
      int var4;
      int var5;
      if (~var1 == -2) {
        var4 = var3.readUnsignedShort();
        this.anIntArray1869 = new int[var4];

        for (var5 = 0; var4 > var5; ++var5) {
          this.anIntArray1869[var5] = var3.readUnsignedShort();
        }

        this.anIntArray1851 = new int[var4];

        for (var5 = 0; ~var5 > ~var4; ++var5) {
          this.anIntArray1851[var5] = var3.readUnsignedShort();
        }

        for (var5 = 0; var4 > var5; ++var5) {
          this.anIntArray1851[var5] += var3.readUnsignedShort() << 16;
        }
      } else if (var1 == 2) {
        this.anInt1865 = var3.readUnsignedShort();
      } else if (-4 != ~var1) {
        if (var1 == 4) {
          this.aBoolean1859 = true;
        } else if (-6 != ~var1) {
          if (6 != var1) {
            if (-8 == ~var1) {
              this.anInt1849 = var3.readUnsignedShort();
            } else if (8 == var1) {
              this.anInt1861 = var3.readUnsignedByte();
            } else if (9 == var1) {
              this.anInt1866 = var3.readUnsignedByte();
            } else if (10 != var1) {
              if (-12 != ~var1) {
                if (12 != var1) {
                  if (13 == var1) {
                    var4 = var3.readUnsignedShort();
                    this.anIntArrayArray1867 = new int[var4][];

                    for (var5 = 0; ~var4 < ~var5; ++var5) {
                      int var6 = var3.readUnsignedByte();
                      if (var6 > 0) {
                        this.anIntArrayArray1867[var5] = new int[var6];
                        this.anIntArrayArray1867[var5][0] = var3.readUnsignedMedium((byte) 102);

                        for (int var7 = 1; ~var6 < ~var7; ++var7) {
                          this.anIntArrayArray1867[var5][var7] = var3.readUnsignedShort();
                        }
                      }
                    }
                  } else if (~var1 != -15) {
                    if (15 != var1) {
                      if (16 == var1) {
                        this.aBoolean1872 = true;
                      }
                    } else {
                      this.tween = true;
                    }
                  } else {
                    this.aBoolean1848 = true;
                  }
                } else {
                  var4 = var3.readUnsignedByte();
                  this.anIntArray1870 = new int[var4];

                  for (var5 = 0; ~var4 < ~var5; ++var5) {
                    this.anIntArray1870[var5] = var3.readUnsignedShort();
                  }

                  for (var5 = 0; ~var4 < ~var5; ++var5) {
                    this.anIntArray1870[var5] += var3.readUnsignedShort() << 16;
                  }
                }
              } else {
                this.anInt1845 = var3.readUnsignedByte();
              }
            } else {
              this.anInt1850 = var3.readUnsignedByte();
            }
          } else {
            this.anInt1854 = var3.readUnsignedShort();
          }
        } else {
          this.anInt1857 = var3.readUnsignedByte();
        }
      } else {
        this.aBooleanArray1855 = new boolean[256];
        var4 = var3.readUnsignedByte();

        for (var5 = 0; var5 < var4; ++var5) {
          this.aBooleanArray1855[var3.readUnsignedByte()] = true;
        }
      }

      var4 = 49 % ((-12 - var2) / 34);
    } catch (RuntimeException var8) {
      throw AbstractGameWorld.cascadeException(var8,
        "tk.H(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
    }
  }

}
