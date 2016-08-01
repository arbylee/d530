import java.io.IOException;
import java.net.Socket;

final class TextureSampler37 extends AbstractTextureSampler {

  static int anInt3255;
  static int anInt3256;
  static int anInt3259;
  static int anInt3260 = -1;
  static boolean aBoolean3261 = false;
  static int anInt3263 = 0;
  static SomethingWorldMapy aClass3_Sub28_Sub3_3264;
  private int anInt3253 = 0;
  private int anInt3254 = 4096;
  private int anInt3257 = 12288;
  private int anInt3258 = 0;
  private int anInt3262 = 2048;
  private int anInt3265 = 2048;
  private int anInt3266 = 8192;


  public TextureSampler37() {
    super(0, true);
  }

  static final void method267(byte var0) {
    try {
      if (DummyCanvas.anInt23 != 0) {
        try {
          if (++DummyClass22.anInt1734 > 2000) {
            if (null != SomethingVolume15.gameSocket) {
              SomethingVolume15.gameSocket.destroy();
              SomethingVolume15.gameSocket = null;
            }

            if (~SpotAnimationConfig.anInt548 <= -2) {
              HashTable.anInt1711 = -5;
              DummyCanvas.anInt23 = 0;
              return;
            }

            DummyCanvas.anInt23 = 1;
            DummyClass22.anInt1734 = 0;
            ++SpotAnimationConfig.anInt548;
            if (Projectile.anInt2894 != DummyClass11.anInt2036) {
              Projectile.anInt2894 = DummyClass11.anInt2036;
            } else {
              Projectile.anInt2894 = GameWorldSomething.anInt506;
            }
          }

          if (DummyCanvas.anInt23 == 1) {
            AreaSoundEffect.socketRequest = DummyClass35.signLink
              .method1441((byte) 8, DummyClass36.aString2611, Projectile.anInt2894);
            DummyCanvas.anInt23 = 2;
          }

          int var1;
          if (-3 == ~DummyCanvas.anInt23) {
            if (-3 == ~AreaSoundEffect.socketRequest.status) {
              throw new IOException();
            }

            if (1 != AreaSoundEffect.socketRequest.status) {
              return;
            }

            SomethingVolume15.gameSocket =
              new SocketStream((Socket) AreaSoundEffect.socketRequest.result,
                DummyClass35.signLink);
            AreaSoundEffect.socketRequest = null;
            SomethingVolume15.gameSocket.write(TextureSampler12.secureBuffer.bytes, 0,
              TextureSampler12.secureBuffer.position);
            if (GameWorld.audioOutputStream0 != null) {
              GameWorld.audioOutputStream0.pause();
            }

            if (null != SomethingWorldMappy.audioOutputStream1) {
              SomethingWorldMappy.audioOutputStream1.pause();
            }

            var1 = SomethingVolume15.gameSocket.read();
            if (GameWorld.audioOutputStream0 != null) {
              GameWorld.audioOutputStream0.pause();
            }

            if (SomethingWorldMappy.audioOutputStream1 != null) {
              SomethingWorldMappy.audioOutputStream1.pause();
            }

            if (var1 != 21) {
              HashTable.anInt1711 = var1;
              DummyCanvas.anInt23 = 0;
              SomethingVolume15.gameSocket.destroy();
              SomethingVolume15.gameSocket = null;
              return;
            }

            DummyCanvas.anInt23 = 3;
          }

          if (var0 <= 26) {
            method269(-75, 44);
          }

          if (3 == DummyCanvas.anInt23) {
            if (~SomethingVolume15.gameSocket.available() > -2) {
              return;
            }

            TextureSampler29.aClass94Array3391 = new GameString[SomethingVolume15.gameSocket.read()];
            DummyCanvas.anInt23 = 4;
          }

          if (~DummyCanvas.anInt23 == -5) {
            if (~SomethingVolume15.gameSocket.available() > ~(8
              * TextureSampler29.aClass94Array3391.length)) {
              return;
            }

            SpotAnimationConfig.gameBuffer.position = 0;
            SomethingVolume15.gameSocket.read(SpotAnimationConfig.gameBuffer.bytes, 0,
              8 * TextureSampler29.aClass94Array3391.length);

            for (var1 = 0; ~TextureSampler29.aClass94Array3391.length < ~var1; ++var1) {
              TextureSampler29.aClass94Array3391[var1] =
                FileCache.stringFromBase37(-29664, SpotAnimationConfig.gameBuffer.readLong());
            }

            HashTable.anInt1711 = 21;
            DummyCanvas.anInt23 = 0;
            SomethingVolume15.gameSocket.destroy();
            SomethingVolume15.gameSocket = null;
            return;
          }
        } catch (IOException var2) {
          if (SomethingVolume15.gameSocket != null) {
            SomethingVolume15.gameSocket.destroy();
            SomethingVolume15.gameSocket = null;
          }

          if (~SpotAnimationConfig.anInt548 > -2) {
            ++SpotAnimationConfig.anInt548;
            if (DummyClass11.anInt2036 == Projectile.anInt2894) {
              Projectile.anInt2894 = GameWorldSomething.anInt506;
            } else {
              Projectile.anInt2894 = DummyClass11.anInt2036;
            }

            DummyClass22.anInt1734 = 0;
            DummyCanvas.anInt23 = 1;
          } else {
            HashTable.anInt1711 = -4;
            DummyCanvas.anInt23 = 0;
          }
        }

      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "mh.Q(" + var0 + ')');
    }
  }

  public static void method268(byte var0) {
    try {
      if (var0 != -91) {
        method268((byte) 7);
      }

      aClass3_Sub28_Sub3_3264 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "mh.R(" + var0 + ')');
    }
  }

  static final void method269(int var0, int var1) {
    try {
      if (var0 != -5) {
        anInt3263 = 109;
      }

      Deque.aClass93_939.method1522(-128, var1);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "mh.O(" + var0 + ',' + var1 + ')');
    }
  }

  static final void method272(byte var0) {
    try {
      if (var0 != -124) {
        aClass3_Sub28_Sub3_3264 = null;
      }

      int var1 = TextureSampler35.aByteArrayArray3335.length;

      for (int var2 = 0; var2 < var1; ++var2) {
        if (TextureSampler35.aByteArrayArray3335[var2] != null) {
          int var3 = -1;

          for (int var4 = 0; ~var4 > ~TextureSampler11.anInt3244; ++var4) {
            if (TextureSampler13.anIntArray3367[var4] == AudioStreamEncoder3.regionHashes[var2]) {
              var3 = var4;
              break;
            }
          }

          if (0 == ~var3) {
            TextureSampler13.anIntArray3367[TextureSampler11.anInt3244] =
              AudioStreamEncoder3.regionHashes[var2];
            var3 = TextureSampler11.anInt3244++;
          }

          int var5 = 0;
          Buffer var16 = new Buffer(TextureSampler35.aByteArrayArray3335[var2]);

          while (~var16.position > ~TextureSampler35.aByteArrayArray3335[var2].length
            && 511 > var5) {
            int var6 = var5++ << 6 | var3;
            int var7 = var16.readUnsignedShort();
            int var8 = var7 >> 14;
            int var9 = 63 & var7 >> 7;
            int var11 =
              var9 + 64 * (AudioStreamEncoder3.regionHashes[var2] >> 8) - WorldMapLabel.anInt1716;
            int var10 = var7 & 63;
            int var12 = var10 + -ProceduralTexture.anInt1152 + 64 * (255
              & AudioStreamEncoder3.regionHashes[var2]);
            NpcConfiguration var13 = SubNode.getNpcConfiguration(var16.readUnsignedShort());
            if (TextureSampler5.npcs[var6] == null && (var13.aByte1267 & 1) > 0
              && ~var8 == ~GameObject.plane && -1 >= ~var11 && 104 > var13.size + var11
              && ~var12 <= -1 && 104 > var12 - -var13.size) {
              TextureSampler5.npcs[var6] = new NPC();
              NPC npc = TextureSampler5.npcs[var6];
              AudioWorker.anIntArray347[DummyClass6.anInt2046++] = var6;
              npc.anInt2838 = AbstractGameWorld.updateCycle;
              npc.setConfiguration(-1, var13);
              npc.method1976(npc.config.size, 2);
              npc.anInt2806 =
                npc.rotationY = DummyClass32.anIntArray510[npc.config.defaultFaceDirection];
              npc.anInt2779 = npc.config.anInt1274;
              if (~npc.anInt2779 == -1) {
                npc.rotationY = 0;
              }

              npc.renderAnimationId = npc.config.renderAnimationId;
              npc.setPosition(npc.getSize(), var11, var12, true);
            }
          }
        }
      }

    } catch (RuntimeException var15) {
      throw AbstractGameWorld.cascadeException(var15, "mh.E(" + var0 + ')');
    }
  }

  final void parseConfig(int var1, Buffer var2, boolean var3) {
    try {
      if (~var1 == -1) {
        this.anInt3265 = var2.readUnsignedShort();
      } else if (var1 == 1) {
        this.anInt3253 = var2.readUnsignedShort();
      } else if (-3 == ~var1) {
        this.anInt3258 = var2.readUnsignedShort();
      } else if (var1 != 3) {
        if (var1 != 4) {
          if (-6 == ~var1) {
            this.anInt3254 = var2.readUnsignedShort();
          } else if (var1 == 6) {
            this.anInt3266 = var2.readUnsignedShort();
          }
        } else {
          this.anInt3257 = var2.readUnsignedShort();
        }
      } else {
        this.anInt3262 = var2.readUnsignedShort();
      }

      if (!var3) {
        this.anInt3266 = 85;
      }

    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "mh.A(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
    }
  }

  final int[] method154(int var1, byte var2) {
    try {
      int var4 = 15 % ((30 - var2) / 36);
      int[] var3 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        int var5 = -2048 + DummyClass4.anIntArray2999[var1];

        for (int var6 = 0; var6 < SomethingLight0.anInt1559; ++var6) {
          int var9 = var5 + this.anInt3253;
          int var7 = TextureCache.anIntArray2125[var6] + -2048;
          int var8 = this.anInt3265 + var7;
          var9 = 2047 < ~var9 ? var9 - -4096 : var9;
          var9 = 2048 < var9 ? -4096 + var9 : var9;
          int var10 = var7 + this.anInt3258;
          var8 = var8 < -2048 ? var8 + 4096 : var8;
          var8 = -2049 <= ~var8 ? var8 : -4096 + var8;
          var10 = ~var10 <= 2047 ? var10 : 4096 + var10;
          var10 = -2049 > ~var10 ? var10 - 4096 : var10;
          int var11 = var5 - -this.anInt3262;
          var11 = -2048 > var11 ? var11 + 4096 : var11;
          var11 = -2049 > ~var11 ? var11 - 4096 : var11;
          var3[var6] =
            !this.method271(var8, var9, (byte) 113) && !this.method270((byte) -44, var10, var11) ?
              0 :
              4096;
        }
      }

      return var3;
    } catch (RuntimeException var12) {
      throw AbstractGameWorld.cascadeException(var12, "mh.D(" + var1 + ',' + var2 + ')');
    }
  }

  private final boolean method270(byte var1, int var2, int var3) {
    try {
      int var4 = this.anInt3257 * (var2 + var3) >> 12;
      if (var1 > -17) {
        method267((byte) 89);
      }

      int var5 = SomethingTexture1.anIntArray2639[var4 * 255 >> 12 & 255];
      var5 = (var5 << 12) / this.anInt3257;
      var5 = (var5 << 12) / this.anInt3266;
      var5 = var5 * this.anInt3254 >> 12;
      return var5 > -var2 + var3 && ~(-var5) > ~(var3 + -var2);
    } catch (RuntimeException var6) {
      throw AbstractGameWorld
        .cascadeException(var6, "mh.S(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  final void method158(int var1) {
    try {
      FileSystem.method844((byte) -9);
      if (var1 != 16251) {
        method272((byte) -85);
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "mh.P(" + var1 + ')');
    }
  }

  private final boolean method271(int var1, int var2, byte var3) {
    try {
      int var4 = (var2 - var1) * this.anInt3257 >> 12;
      if (var3 != 113) {
        this.method270((byte) -91, -79, -4);
      }

      int var5 = SomethingTexture1.anIntArray2639[(1047948 & var4 * 255) >> 12];
      var5 = (var5 << 12) / this.anInt3257;
      var5 = (var5 << 12) / this.anInt3266;
      var5 = var5 * this.anInt3254 >> 12;
      return ~(var2 + var1) > ~var5 && -var5 < var2 + var1;
    } catch (RuntimeException var6) {
      throw AbstractGameWorld
        .cascadeException(var6, "mh.F(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

}
