import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;

final class OndemandFileRequest extends AbstractFileRequest {

  private static GameString aClass94_4072 =
    SpawnedGameObject.createString(" from your friend list first)3");
  static int anInt4065;
  static GameString aClass94_4066 = SpawnedGameObject.createString("<br>");
  static boolean aBoolean4068 = true;
  static SceneGraphTile[][][] tiles;
  static int anInt4073;
  static GameString aClass94_4071 = aClass94_4072;
  byte aByte4064;
  int anInt4067;
  Buffer buffer;

  final int method586(boolean var1) {
    try {
      return var1 ?
        92 :
        (this.buffer == null ?
          0 :
          this.buffer.position * 100 / (-this.aByte4064 + this.buffer.bytes.length));
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "pm.A(" + var1 + ')');
    }
  }

  final byte[] method587(boolean var1) {
    try {
      if (!this.aBoolean3632 && ~this.buffer.position <= ~(-this.aByte4064
        + this.buffer.bytes.length)) {
        if (var1) {
          this.method586(false);
        }

        return this.buffer.bytes;
      } else {
        throw new RuntimeException();
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "pm.E(" + var1 + ')');
    }
  }

  static final DisplayMode[] method596(int var0, SignLink var1) {
    try {
      if (!var1.method1432(false)) {
        return new DisplayMode[0];
      } else {
        SignLinkRequest var2 = var1.method1453((byte) 8);

        while (0 == var2.status) {
          TextureSampler25.sleep(10L);
        }

        if (2 == var2.status) {
          return new DisplayMode[0];
        } else {
          int[] var3 = (int[]) var2.result;
          DisplayMode[] var4 = new DisplayMode[var3.length >> 2];

          for (int var5 = 0; ~var4.length < ~var5; ++var5) {
            DisplayMode var6 = new DisplayMode();
            var4[var5] = var6;
            var6.anInt1447 = var3[var5 << 2];
            var6.anInt1449 = var3[(var5 << 2) + 1];
            var6.anInt1450 = var3[(var5 << 2) - -2];
            var6.anInt1448 = var3[(var5 << 2) - -3];
          }

          if (var0 != 10) {
            method597((byte) -74);
          }

          return var4;
        }
      }
    } catch (RuntimeException var7) {
      throw AbstractGameWorld.cascadeException(var7,
        "pm.P(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  public static void method597(byte var0) {
    try {
      aClass94_4072 = null;
      tiles = null;
      aClass94_4066 = null;
      if (var0 < 91) {
        tiles = null;
      }

      aClass94_4071 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "pm.O(" + var0 + ')');
    }
  }

  static final void setWindowMode(boolean replaceCanvas, int var1, boolean var2, int var3,
                                  boolean var4, int var5, int var6) {
    try {
      if (var2) {
        GlRenderer.releaseGlResources();
      }

      if (null != TextureSampler30.fullScreenFrame && (3 != var1
        || ~var5 != ~AbstractTextureSampler.anInt2378 || ~var6 != ~TextureSampler21.anInt3071)) {
        FileCacheRequest.method593(TextureSampler30.fullScreenFrame, true, DummyClass35.signLink);
        TextureSampler30.fullScreenFrame = null;
      }

      if (3 == var1 && null == TextureSampler30.fullScreenFrame) {
        TextureSampler30.fullScreenFrame =
          DummyClass54.method1597(2, 0, 0, var6, var5, DummyClass35.signLink);
        if (null != TextureSampler30.fullScreenFrame) {
          TextureSampler21.anInt3071 = var6;
          AbstractTextureSampler.anInt2378 = var5;
          DummyClass25.writeSettings(DummyClass35.signLink);
        }
      }

      if (~var1 == -4 && TextureSampler30.fullScreenFrame == null) {
        setWindowMode(true, SubNode.anInt2577, true, var3, var4, -1, -1);
      } else {
        Object var7;
        if (null == TextureSampler30.fullScreenFrame) {
          if (null != TextureSampler27.frame) {
            var7 = TextureSampler27.frame;
          } else {
            var7 = DummyClass35.signLink.applet;
          }
        } else {
          var7 = TextureSampler30.fullScreenFrame;
        }

        AreaSoundEffect.windowWidth = ((Container) var7).getSize().width;
        SceneSomething2.windowHeight = ((Container) var7).getSize().height;
        Insets var8;
        if (TextureSampler27.frame == var7) {
          var8 = TextureSampler27.frame.getInsets();
          AreaSoundEffect.windowWidth -= var8.right + var8.left;
          SceneSomething2.windowHeight -= var8.bottom + var8.top;
        }

        if (var4) {
          aClass94_4071 = null;
        }

        if (-3 >= ~var1) {
          DummyClass30.viewWidth = AreaSoundEffect.windowWidth;
          GroundItem.viewHeight = SceneSomething2.windowHeight;
          DummyClass51.viewX = 0;
          DisplayMode.viewY = 0;
        } else {
          DisplayMode.viewY = 0;
          DummyClass51.viewX = (AreaSoundEffect.windowWidth + -765) / 2;
          DummyClass30.viewWidth = 765;
          GroundItem.viewHeight = 503;
        }

        if (!replaceCanvas) {
          if (GlRenderer.useOpenGlRenderer) {
            GlRenderer.setViewportDimensions(DummyClass30.viewWidth, GroundItem.viewHeight);
          }

          InventoryConfig.canvas.setSize(DummyClass30.viewWidth, GroundItem.viewHeight);
          if (TextureSampler27.frame == var7) {
            var8 = TextureSampler27.frame.getInsets();
            InventoryConfig.canvas.setLocation(var8.left - -DummyClass51.viewX,
              var8.top + DisplayMode.viewY);
          } else {
            InventoryConfig.canvas.setLocation(DummyClass51.viewX, DisplayMode.viewY);
          }
        } else {
          DummyClass9.unbindKeyboard(InventoryConfig.canvas, -9320);
          HashTable.unbindMouse(4, InventoryConfig.canvas);
          if (null != DummyClass35.mouseWheel) {
            DummyClass35.mouseWheel.unbind(false, InventoryConfig.canvas);
          }

          SomethingTilek.client.initializeCanvas();
          TextureSampler34.method193((byte) 97, InventoryConfig.canvas);
          ItemConfig.method1119(InventoryConfig.canvas, var4);
          if (DummyClass35.mouseWheel != null) {
            DummyClass35.mouseWheel.bind(InventoryConfig.canvas, -103);
          }
        }

        if (0 == var1 && -1 > ~var3) {
          GlRenderer.method1834(InventoryConfig.canvas);
        }

        if (var2 && var1 > 0) {
          InventoryConfig.canvas.setIgnoreRepaint(true);
          if (!GameStub.aBoolean11) {
            DummyClass34.method995();
            Something3d.viewImageProducer = null;
            Something3d.viewImageProducer =
              TextureSampler18.createImageProducer(GroundItem.viewHeight, DummyClass30.viewWidth,
                true, InventoryConfig.canvas);
            DummyClass47.method1320();
            if (5 != DummyClass15.state) {
              AbstractTextureSampler.drawLoadingBox(TextureSampler39.LOADING_PLEASE_WAIT, false);
            } else {
              SomethingOtherWorldMap.drawLoadingScreen(FloorOverlay.aClass3_Sub28_Sub17_2096, true);
            }

            try {
              Graphics var11 = InventoryConfig.canvas.getGraphics();
              Something3d.viewImageProducer.draw(0, 0, var11, 0);
            } catch (Exception var9) {
            }

            HashTableIterator.method1396(-1);
            if (-1 != ~var3) {
              Something3d.viewImageProducer = null;
            } else {
              Something3d.viewImageProducer =
                TextureSampler18.createImageProducer(503, 765, true, InventoryConfig.canvas);
            }

            SignLinkRequest var13 =
              DummyClass35.signLink.method1444(-43, SomethingTilek.client.getClass());

            while (~var13.status == -1) {
              TextureSampler25.sleep(100L);
            }

            if (1 == var13.status) {
              GameStub.aBoolean11 = true;
            }
          }

          if (GameStub.aBoolean11) {
            GlRenderer.bindCanvas(InventoryConfig.canvas, 2 * GroundItemNode.anInt3671);
          }
        }

        if (!GlRenderer.useOpenGlRenderer && 0 < var1) {
          setWindowMode(true, 0, true, var3, false, -1, -1);
        } else {
          if (~var1 < -1 && -1 == ~var3) {
            DummyClass1.gameThread.setPriority(5);
            Something3d.viewImageProducer = null;
            SoftwareModel.method1935();
            ((TextureCache) DummyClass40.textureCache).method1619(200, -1);
            if (DisplayMode.useBumpMaps) {
              DummyClass40.updateLightness(0.7F);
            }

            AbstractTextureSampler.method165(-7878);
          } else if (0 == var1 && var3 > 0) {
            DummyClass1.gameThread.setPriority(1);
            Something3d.viewImageProducer =
              TextureSampler18.createImageProducer(503, 765, true, InventoryConfig.canvas);
            SoftwareModel.method1938();
            DummyClass0.method1756();
            ((TextureCache) DummyClass40.textureCache).method1619(20, -1);
            if (DisplayMode.useBumpMaps) {
              if (1 == AbstractFileRequest.brightnessSetting) {
                DummyClass40.updateLightness(0.9F);
              }

              if (-3 == ~AbstractFileRequest.brightnessSetting) {
                DummyClass40.updateLightness(0.8F);
              }

              if (3 == AbstractFileRequest.brightnessSetting) {
                DummyClass40.updateLightness(0.7F);
              }

              if (-5 == ~AbstractFileRequest.brightnessSetting) {
                DummyClass40.updateLightness(0.6F);
              }
            }

            SomethingGl0.method144();
            AbstractTextureSampler.method165(-7878);
          }

          Cache.aBoolean742 = !NPC.method1986(89);
          if (var2) {
            TriChromaticImageBuffer.method389(false);
          }

          SomethingVolume15.aBoolean2427 = ~var1 <= -3;

          if (-1 != InventoryConfig.anInt3655) {
            DummyClass23.method1746(true, (byte) -107);
          }

          if (null != SomethingVolume15.gameSocket && (~DummyClass15.state == -31
            || DummyClass15.state == 25)) {
            TextureSampler9.method204(-3);
          }

          for (int var12 = 0; var12 < 100; ++var12) {
            GroundItemNode.aBooleanArray3674[var12] = true;
          }

          TextureSampler30.aBoolean3116 = true;
        }
      }
    } catch (RuntimeException var10) {
      throw AbstractGameWorld.cascadeException(var10,
        "pm.F(" + replaceCanvas + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5
          + ',' + var6 + ')');
    }
  }

}
