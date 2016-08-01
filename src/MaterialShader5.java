import javax.media.opengl.GL;

final class MaterialShader5 implements MaterialShader {

  private static GameString aClass94_2175 = SpawnedGameObject.createString(")4a=");
  static boolean[] aBooleanArray2169 = new boolean[5];
  static GameString aClass94_2170 = SpawnedGameObject.createString("Fertigkeit: ");
  static GameString aClass94_2171 = SpawnedGameObject.createString("");
  static FileUnpacker aClass153_2172;
  static GameString aClass94_2176 =
    SpawnedGameObject.createString("(U0a )2 non)2existant gosub script)2num: ");
  private int anInt2173;
  private float[] aFloatArray2174 = new float[4];


  public MaterialShader5() {
    try {
      this.method1631(2);
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ob.<init>()");
    }
  }

  public final void disable() {
    try {
      GL var1 = GlRenderer.gl;
      var1.glCallList(1 + this.anInt2173);
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ob.A()");
    }
  }

  public final void enable() {
    try {
      GL var1 = GlRenderer.gl;
      var1.glCallList(this.anInt2173);
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ob.D()");
    }
  }

  public final void set(int var1) {
    try {
      GL var2 = GlRenderer.gl;
      float var4 = (float) (1 + (var1 >> 3 & 3)) * 0.01F;
      float var3 = -0.01F * (float) (1 + (var1 & 3));
      float var5 = 0 == (var1 & 64) ? 4.8828125E-4F : 9.765625E-4F;
      boolean var6 = -1 != ~(128 & var1);
      if (var6) {
        this.aFloatArray2174[0] = var5;
        this.aFloatArray2174[1] = 0.0F;
        this.aFloatArray2174[2] = 0.0F;
        this.aFloatArray2174[3] = 0.0F;
      } else {
        this.aFloatArray2174[2] = var5;
        this.aFloatArray2174[1] = 0.0F;
        this.aFloatArray2174[3] = 0.0F;
        this.aFloatArray2174[0] = 0.0F;
      }

      var2.glActiveTexture('\u84c1');
      var2.glMatrixMode(5888);
      var2.glPushMatrix();
      var2.glLoadIdentity();
      var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      var2.glRotatef((float) GroundItem.anInt2938 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
      var2.glRotatef(360.0F * (float) TextureSampler9.anInt3103 / 2048.0F, 0.0F, 1.0F, 0.0F);
      var2.glTranslatef((float) (-BZipDecompressorState.anInt144),
        (float) (-ClientScript.anInt3695), (float) (-StringNode.anInt2587));
      var2.glTexGenfv(8192, 9474, this.aFloatArray2174, 0);
      this.aFloatArray2174[3] = var3 * (float) GlRenderer.anInt1791;
      this.aFloatArray2174[0] = 0.0F;
      this.aFloatArray2174[2] = 0.0F;
      this.aFloatArray2174[1] = var5;
      var2.glTexGenfv(8193, 9474, this.aFloatArray2174, 0);
      var2.glPopMatrix();
      if (!SomethingGl.aBoolean1227) {
        int var7 = (int) ((float) GlRenderer.anInt1791 * var4 * 64.0F);
        var2.glBindTexture(3553, SomethingGl.anIntArray1223[var7 % 64]);
      } else {
        this.aFloatArray2174[3] = (float) GlRenderer.anInt1791 * var4;
        this.aFloatArray2174[1] = 0.0F;
        this.aFloatArray2174[0] = 0.0F;
        this.aFloatArray2174[2] = 0.0F;
        var2.glTexGenfv(8194, 9473, this.aFloatArray2174, 0);
      }

      var2.glActiveTexture('\u84c0');
    } catch (RuntimeException var8) {
      throw AbstractGameWorld.cascadeException(var8, "ob.B(" + var1 + ')');
    }
  }

  public final int method24() {
    try {
      return 0;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ob.C()");
    }
  }

  private final void method1631(int var1) {
    try {
      GL var2 = GlRenderer.gl;
      this.anInt2173 = var2.glGenLists(var1);
      var2.glNewList(this.anInt2173, 4864);
      var2.glActiveTexture('\u84c1');
      if (!SomethingGl.aBoolean1227) {
        var2.glEnable(3553);
      } else {
        var2.glBindTexture('\u806f', SomethingGl.anInt1229);
        var2.glTexGeni(8194, 9472, 9217);
        var2.glEnable(3170);
        var2.glEnable('\u806f');
      }

      var2.glTexGeni(8192, 9472, 9216);
      var2.glTexGeni(8193, 9472, 9216);
      var2.glEnable(3168);
      var2.glEnable(3169);
      var2.glActiveTexture('\u84c0');
      var2.glEndList();
      var2.glNewList(this.anInt2173 + 1, 4864);
      var2.glActiveTexture('\u84c1');
      if (SomethingGl.aBoolean1227) {
        var2.glDisable('\u806f');
        var2.glDisable(3170);
      } else {
        var2.glDisable(3553);
      }

      var2.glDisable(3168);
      var2.glDisable(3169);
      var2.glActiveTexture('\u84c0');
      var2.glEndList();
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "ob.I(" + var1 + ')');
    }
  }

  static final void method1626(byte var0) {
    try {
      SomethingQuickChat.aClass93_3572.method1524(3);
      DummyClass15.aClass93_1874.method1524(3);
      if (var0 <= -124) {
        MouseRecorder.aClass93_1013.method1524(3);
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ob.F(" + var0 + ')');
    }
  }

  static final boolean method1627(int var0, byte var1) {
    try {
      GameWorld var2 = ClassCheckRequest.method130(97, var0);
      if (var2 != null) {
        if (1 != SignLink.anInt1214 && -3 != ~SignLink.anInt1214
          && -3 != ~AbstractGameWorld.usageLocation) {
          GameString var9 = GameStub.aClass94_8;
          if (AbstractGameWorld.usageLocation != 0) {
            var9 = RenderAnimation.concat(new GameString[] {
              DummyClass9.aClass94_4007, SomethingScene.toString(var2.anInt2621 - -7000)
            });
          }

          if (var1 > -2) {
            return false;
          } else {
            GameString var4 = GameStub.aClass94_8;
            if (DummyClass7.settings != null) {
              var4 = RenderAnimation.concat(
                new GameString[] {TriChromaticImageCache.aClass94_1380, DummyClass7.settings});
            }

            GameString var5 = RenderAnimation.concat(new GameString[] {
              DummyClass45.aClass94_992, var2.aClass94_2625, var9, SomethingPacket151.aClass94_2608,
              SomethingScene.toString(TriChromaticImageBuffer.languageId), aClass94_2175,
              SomethingScene.toString(MonoChromaticImageBuffer.affiliateId), var4,
              HashTableIterator.aClass94_1133,
              !Structure.aBoolean3641 ? Something3d.ZERO : DummyClass28.aClass94_339,
              DummyClass36.aClass94_2610,
              !DummyClass8.aBoolean4018 ? Something3d.ZERO : DummyClass28.aClass94_339,
              AbstractObjectNodeWrapper.aClass94_1617,
              ProjectileNode.aBoolean3779 ? DummyClass28.aClass94_339 : Something3d.ZERO
            });

            try {
              SomethingTilek.client.getAppletContext()
                .showDocument(var5.method1527(false), "_self");
            } catch (Exception var7) {
              return false;
            }

            return true;
          }
        } else {
          byte[] var3 = var2.aClass94_2625.method1568(0);
          DummyClass36.aString2611 = new String(var3, 0, var3.length);
          ClientScriptCall.anInt2451 = var2.anInt2621;
          if (-1 != ~AbstractGameWorld.usageLocation) {
            DummyClass11.anInt2036 = '\u9c40' + ClientScriptCall.anInt2451;
            Projectile.anInt2894 = DummyClass11.anInt2036;
            GameWorldSomething.anInt506 = ClientScriptCall.anInt2451 + '\uc350';
          }

          return true;
        }
      } else {
        return false;
      }
    } catch (RuntimeException var8) {
      throw AbstractGameWorld.cascadeException(var8, "ob.E(" + var0 + ',' + var1 + ')');
    }
  }

  static final void method1628(int var0, int var1, int var2, int var3, int var4, int var5,
                               byte var6) {
    try {
      int var9;
      int var12;
      if (~Something3d.anInt3012 == -1) {
        int var10 = BlockConfig.screenLowerY;
        var9 = DummyClass3.screenUpperY;
        int var8 = Unsure.screenUpperX;
        int var7 = DummyClass17.screenLowerX;
        int var11 = (var5 - var3) * (-var7 + var8) / var1 - -var7;
        var12 = var9 + (var10 + -var9) * (-var0 + var4) / var2;
        if (SceneNode.aBoolean1837 && ~(64 & Something3dRoot.anInt2051) != -1) {
          Widget var13 =
            AbstractDirectColorSprite.method638((byte) -19, ScriptState.anInt872, Widget.anInt278);
          if (var13 != null) {
            ScriptState.method1177(BufferObject.anInt1887, 0L, (byte) -53,
              WorldMapLabel.aClass94_1724, var11, (short) 11, Parameter.aClass94_3621, var12);
          } else {
            SceneSomething.method958((byte) -87);
          }
        } else {
          ++SubNode.anInt2571;
          if (~AbstractImageProducer.gameId == -2) {
            ScriptState.method1177(-1, 0L, (byte) -62, GroundItemNode.EMPTY_STRING, var11,
              (short) 36, GlTexture2d.aClass94_3762, var12);
          }

          ScriptState.method1177(-1, 0L, (byte) -75, GroundItemNode.EMPTY_STRING, var11, (short) 60,
            TextureSampler32.walkTooltip, var12);
        }
      }

      if (var6 > 48) {
        long var25 = -1L;

        for (var9 = 0; MapScene.anInt59 > var9; ++var9) {
          long var26 = TextureSampler38.entityKeys[var9];
          var12 = (int) var26 & 127;
          int var14 = ((int) var26 & 2009320690) >> 29;
          int var15 = (int) (var26 >>> 32) & Integer.MAX_VALUE;
          int var27 = 127 & (int) var26 >> 7;
          if (~var26 != ~var25) {
            var25 = var26;
            int var18;
            if (~var14 == -3 && AbstractFileRequester.method2096(GameWorldSomething.currentPlane,
              var12, var27, var26)) {
              GameObjectConfig var16 = DummyClass11.method2207(4, var15);
              if (null != var16.anIntArray1524) {
                var16 = var16.method1685(0);
              }

              if (null == var16) {
                continue;
              }

              if (-2 == ~Something3d.anInt3012) {
                ScriptState.method1177(DummyClass54.anInt1403, var26, (byte) -58,
                  RenderAnimation.concat(new GameString[] {
                    RenderAnimation.aClass94_378, SomethingQuickChat.aClass94_3573,
                    var16.aClass94_1504
                  }), var12, (short) 14, TextureSampler14.aClass94_3388, var27);
                ++Light.anInt715;
              } else if (!SceneNode.aBoolean1837) {
                ++DummyClass28.anInt336;
                GameString[] var29 = var16.aClass94Array1499;
                if (DummyClass24.aBoolean1656) {
                  var29 = SomethingPacket151.method822(19406, var29);
                }

                if (var29 != null) {
                  for (var18 = 4; var18 >= 0; --var18) {
                    if (null != var29[var18]) {
                      ++StringNode0.anInt2337;
                      short var19 = 0;
                      if (var18 == 0) {
                        var19 = 42;
                      }

                      if (-2 == ~var18) {
                        var19 = 50;
                      }

                      int var20 = -1;
                      if (2 == var18) {
                        var19 = 49;
                      }

                      if (var16.anInt1493 == var18) {
                        var20 = var16.anInt1517;
                      }

                      if (-4 == ~var18) {
                        var19 = 46;
                      }

                      if (var18 == var16.anInt1520) {
                        var20 = var16.anInt1522;
                      }

                      if (-5 == ~var18) {
                        var19 = 1001;
                      }

                      ScriptState.method1177(var20, var26, (byte) -91, RenderAnimation.concat(
                        new GameString[] {DummyClass17.aClass94_1826, var16.aClass94_1504}), var12,
                        var19, var29[var18], var27);
                    }
                  }
                }

                ScriptState.method1177(WorldMapLabel.anInt1719, (long) var16.anInt1527, (byte) -26,
                  RenderAnimation.concat(
                    new GameString[] {DummyClass17.aClass94_1826, var16.aClass94_1504}), var12,
                  (short) 1004, BlockConfig.aClass94_1180, var27);
              } else {
                Parameter var17 = -1 == LinearHashTable.anInt1038 ?
                  null :
                  Deque.method1210(64, LinearHashTable.anInt1038);
                if (0 != (Something3dRoot.anInt2051 & 4) && (var17 == null
                  || ~var16.method1691(var17.anInt3614, LinearHashTable.anInt1038, (byte) 98)
                  != ~var17.anInt3614)) {
                  ScriptState.method1177(BufferObject.anInt1887, var26, (byte) -77,
                    RenderAnimation.concat(new GameString[] {
                      DummyClass59.aClass94_676, SomethingQuickChat.aClass94_3573,
                      var16.aClass94_1504
                    }), var12, (short) 38, Parameter.aClass94_3621, var27);
                  ++DummyClass9.anInt4011;
                }
              }
            }

            int var21;
            int var22;
            int var33;
            Player var38;
            NPC var36;
            int var37;
            if (-2 == ~var14) {
              NPC var31 = TextureSampler5.npcs[var15];
              if (~(var31.config.size & 1) == -1 && -1 == ~(127 & var31.anInt2819)
                && ~(var31.anInt2829 & 127) == -1
                || 1 == (var31.config.size & 1) && (127 & var31.anInt2819) == 64 && -65 == ~(
                var31.anInt2829 & 127)) {
                var33 = var31.anInt2819 - -64 - 64 * var31.config.size;
                var18 = -((-1 + var31.config.size) * 64) + var31.anInt2829;

                for (var37 = 0; var37 < DummyClass6.anInt2046; ++var37) {
                  var36 = TextureSampler5.npcs[AudioWorker.anIntArray347[var37]];
                  var21 = -(var36.config.size * 64) - -64 + var36.anInt2819;
                  var22 = var36.anInt2829 + -(var36.config.size * 64) - -64;
                  if (var36 != null && var31 != var36 && ~var21 <= ~var33
                    && var31.config.size - (-var33 + var21 >> 7) >= var36.config.size
                    && var18 <= var22
                    && var36.config.size <= -(-var18 + var22 >> 7) + var31.config.size) {
                    BufferObject.method2068(var36.config, var12, -126,
                      AudioWorker.anIntArray347[var37], var27);
                  }
                }

                for (var37 = 0; ~DummyClass13.anInt2022 < ~var37; ++var37) {
                  var38 = TextureSampler0.players[DummyClass42.anIntArray887[var37]];
                  var21 = var38.anInt2819 + 64 + -(64 * var38.getSize());
                  var22 = var38.anInt2829 - (var38.getSize() * 64 + -64);
                  if (var38 != null && var21 >= var33 && ~var38.getSize() >= ~(var31.config.size - (
                    var21 - var33 >> 7)) && ~var22 <= ~var18
                    && var38.getSize() <= -(-var18 + var22 >> 7) + var31.config.size) {
                    TextureSampler13.method312(DummyClass42.anIntArray887[var37], 5, var27, var38,
                      var12);
                  }
                }
              }

              BufferObject.method2068(var31.config, var12, -108, var15, var27);
            }

            if (var14 == 0) {
              Player var30 = TextureSampler0.players[var15];
              if ((127 & var30.anInt2819) == 64 && 64 == (127 & var30.anInt2829)) {
                var33 = var30.anInt2819 + -(64 * (-1 + var30.getSize()));
                var18 = var30.anInt2829 + 64 + -(var30.getSize() * 64);

                for (var37 = 0; var37 < DummyClass6.anInt2046; ++var37) {
                  var36 = TextureSampler5.npcs[AudioWorker.anIntArray347[var37]];
                  var21 = var36.anInt2819 + -(var36.config.size * 64) - -64;
                  var22 = var36.anInt2829 - 64 * var36.config.size - -64;
                  if (var36 != null && var21 >= var33
                    && var36.config.size <= -(var21 - var33 >> 7) + var30.getSize()
                    && ~var22 <= ~var18 && ~var36.config.size >= ~(-(-var18 + var22 >> 7)
                    + var30.getSize())) {
                    BufferObject.method2068(var36.config, var12, -121,
                      AudioWorker.anIntArray347[var37], var27);
                  }
                }

                for (var37 = 0; var37 < DummyClass13.anInt2022; ++var37) {
                  var38 = TextureSampler0.players[DummyClass42.anIntArray887[var37]];
                  var21 = var38.anInt2819 - (var38.getSize() + -1) * 64;
                  var22 = var38.anInt2829 - (-64 + 64 * var38.getSize());
                  if (null != var38 && var38 != var30 && ~var33 >= ~var21
                    && var38.getSize() <= var30.getSize() - (var21 - var33 >> 7) && ~var22 <= ~var18
                    && ~var38.getSize() >= ~(-(var22 + -var18 >> 7) + var30.getSize())) {
                    TextureSampler13.method312(DummyClass42.anIntArray887[var37], 9, var27, var38,
                      var12);
                  }
                }
              }

              TextureSampler13.method312(var15, 31, var27, var30, var12);
            }

            if (~var14 == -4) {
              Deque var28 =
                TextureSampler0.groundItems[GameWorldSomething.currentPlane][var12][var27];
              if (null != var28) {
                for (GroundItemNode var32 = (GroundItemNode) var28.method1212(2);
                     null != var32; var32 = (GroundItemNode) var28.method1219(41)) {
                  var18 = var32.aClass140_Sub7_3676.anInt2936;
                  ItemConfig var40 = DummyClass35.getItemConfig(var18, (byte) 71);
                  if (-2 == ~Something3d.anInt3012) {
                    ++SomethingMidiFile.anInt2290;
                    ScriptState.method1177(DummyClass54.anInt1403, (long) var18, (byte) -75,
                      RenderAnimation.concat(new GameString[] {
                        RenderAnimation.aClass94_378, HashTable.aClass94_1699, var40.aClass94_770
                      }), var12, (short) 33, TextureSampler14.aClass94_3388, var27);
                  } else if (!SceneNode.aBoolean1837) {
                    ++Projectile.anInt2901;
                    GameString[] var34 = var40.aClass94Array801;
                    if (DummyClass24.aBoolean1656) {
                      var34 = SomethingPacket151.method822(19406, var34);
                    }

                    for (var21 = 4; ~var21 <= -1; --var21) {
                      if (var34 != null && null != var34[var21]) {
                        ++ComponentCanvas.anInt27;
                        byte var35 = 0;
                        if (~var21 == -1) {
                          var35 = 21;
                        }

                        if (1 == var21) {
                          var35 = 34;
                        }

                        int var23 = -1;
                        if (~var21 == ~var40.anInt767) {
                          var23 = var40.anInt758;
                        }

                        if (var21 == 2) {
                          var35 = 18;
                        }

                        if (var40.anInt788 == var21) {
                          var23 = var40.anInt756;
                        }

                        if (~var21 == -4) {
                          var35 = 20;
                        }

                        if (-5 == ~var21) {
                          var35 = 24;
                        }

                        ScriptState.method1177(var23, (long) var18, (byte) -43,
                          RenderAnimation.concat(
                            new GameString[] {TextureSampler6.aClass94_3042, var40.aClass94_770}),
                          var12, var35, var34[var21], var27);
                      }
                    }

                    ScriptState.method1177(WorldMapLabel.anInt1719, (long) var18, (byte) -43,
                      RenderAnimation.concat(
                        new GameString[] {TextureSampler6.aClass94_3042, var40.aClass94_770}),
                      var12, (short) 1002, BlockConfig.aClass94_1180, var27);
                  } else {
                    Parameter var39 = LinearHashTable.anInt1038 == -1 ?
                      null :
                      Deque.method1210(64, LinearHashTable.anInt1038);
                    if ((Something3dRoot.anInt2051 & 1) != 0 && (null == var39
                      || ~var40.method1115(var39.anInt3614, 100, LinearHashTable.anInt1038)
                      != ~var39.anInt3614)) {
                      ++DisplayMode.anInt1439;
                      ScriptState.method1177(BufferObject.anInt1887, (long) var18, (byte) -70,
                        RenderAnimation.concat(new GameString[] {
                          DummyClass59.aClass94_676, HashTable.aClass94_1699, var40.aClass94_770
                        }), var12, (short) 39, Parameter.aClass94_3621, var27);
                    }
                  }
                }
              }
            }
          }
        }

      }
    } catch (RuntimeException var24) {
      throw AbstractGameWorld.cascadeException(var24,
        "ob.K(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6
          + ')');
    }
  }

  static final void method1629(int var0, int var1, int var2, int var3, int var4, int var5, int var6,
                               int var7, int var8, int var9, int var10, int var11, int var12,
                               int var13, int var14, int var15, int var16, int var17, int var18,
                               int var19) {
    int var21;
    SomethingTilek var20;
    if (var3 == 0) {
      var20 = new SomethingTilek(var10, var11, var12, var13, -1, var18, false);

      for (var21 = var0; var21 >= 0; --var21) {
        if (SomethingTexture1.sceneGraphTiles[var21][var1][var2] == null) {
          SomethingTexture1.sceneGraphTiles[var21][var1][var2] =
            new SceneGraphTile(var21, var1, var2);
        }
      }

      SomethingTexture1.sceneGraphTiles[var0][var1][var2].aClass126_2240 = var20;
    } else if (var3 != 1) {
      SomethingSceneTile var22 =
        new SomethingSceneTile(var3, var4, var5, var1, var2, var6, var7, var8, var9, var10, var11,
          var12, var13, var14, var15, var16, var17, var18, var19);

      for (var21 = var0; var21 >= 0; --var21) {
        if (SomethingTexture1.sceneGraphTiles[var21][var1][var2] == null) {
          SomethingTexture1.sceneGraphTiles[var21][var1][var2] =
            new SceneGraphTile(var21, var1, var2);
        }
      }

      SomethingTexture1.sceneGraphTiles[var0][var1][var2].aClass35_2226 = var22;
    } else {
      var20 = new SomethingTilek(var14, var15, var16, var17, var5, var19,
        var6 == var7 && var6 == var8 && var6 == var9);

      for (var21 = var0; var21 >= 0; --var21) {
        if (SomethingTexture1.sceneGraphTiles[var21][var1][var2] == null) {
          SomethingTexture1.sceneGraphTiles[var21][var1][var2] =
            new SceneGraphTile(var21, var1, var2);
        }
      }

      SomethingTexture1.sceneGraphTiles[var0][var1][var2].aClass126_2240 = var20;
    }
  }

  public static void method1630(byte var0) {
    try {
      aClass94_2171 = null;
      aClass153_2172 = null;
      aBooleanArray2169 = null;
      aClass94_2176 = null;
      if (var0 > -112) {
        method1632(-116, 108, 54, -120, 44, 6);
      }

      aClass94_2170 = null;
      aClass94_2175 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ob.J(" + var0 + ')');
    }
  }

  static final void method1632(int var0, int var1, int var2, int var3, int var4, int var5) {
    try {
      if (var0 <= 66) {
        method1630((byte) -33);
      }

      for (int var6 = var3; ~var1 <= ~var6; ++var6) {
        TextureSampler18.method282(DummyClass35.anIntArrayArray663[var6], var4, 121, var2, var5);
      }

    } catch (RuntimeException var7) {
      throw AbstractGameWorld.cascadeException(var7,
        "ob.G(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
    }
  }

}
