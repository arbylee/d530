final class TextureCache implements ITextureCache {

  static int[] anIntArray2125;
  static int anInt2130;
  static SoundEffect[] aClass135Array2131 = new SoundEffect[50];
  static GameString aClass94_2132 = SpawnedGameObject.createString("Titelbild ge-Offnet)3");
  static int anInt2136;
  static SoftwareDirectColorSprite[] aClass3_Sub28_Sub16_Sub2Array2140;
  static Player localPlayer;
  private boolean[] aBooleanArray2122;
  private FileUnpacker sprites;
  private boolean[] aBooleanArray2124;
  private byte[] aByteArray2126;
  private FileUnpacker textures;
  private boolean[] aBooleanArray2128;
  private byte[] aByteArray2129;
  private boolean[] materialActive;
  private boolean aBoolean2134 = false;
  private boolean[] aBooleanArray2135;
  private short[] textureColors;
  private Cache glTextures;
  private int cacheSize = 50;
  private Cache aClass47_2142;
  private byte[] aByteArray2143;
  private byte[] aByteArray2144;


  TextureCache(FileUnpacker textures, FileUnpacker materials, FileUnpacker sprites, int var4,
               boolean var5) {
    try {
      this.sprites = sprites;
      this.aBoolean2134 = var5;
      this.cacheSize = var4;
      this.textures = textures;
      this.aClass47_2142 = new Cache(this.cacheSize);
      if (!GlRenderer.useOpenGlRenderer) {
        this.glTextures = null;
      } else {
        this.glTextures = new Cache(this.cacheSize);
      }

      Buffer var6 = new Buffer(materials.getBytes(0, 0));
      int amountMaterials = var6.readUnsignedShort();
      this.aByteArray2143 = new byte[amountMaterials];
      this.aByteArray2129 = new byte[amountMaterials];
      this.aByteArray2126 = new byte[amountMaterials];
      this.textureColors = new short[amountMaterials];
      this.aByteArray2144 = new byte[amountMaterials];
      this.aBooleanArray2128 = new boolean[amountMaterials];
      this.aBooleanArray2122 = new boolean[amountMaterials];
      this.aBooleanArray2124 = new boolean[amountMaterials];
      this.materialActive = new boolean[amountMaterials];
      this.aBooleanArray2135 = new boolean[amountMaterials];

      int var8;
      for (var8 = 0; ~amountMaterials < ~var8; ++var8) {
        this.materialActive[var8] = 1 == var6.readUnsignedByte();
      }

      for (var8 = 0; ~amountMaterials < ~var8; ++var8) {
        if (this.materialActive[var8]) {
          this.aBooleanArray2124[var8] = ~var6.readUnsignedByte() == -2;
        }
      }

      for (var8 = 0; ~var8 > ~amountMaterials; ++var8) {
        if (this.materialActive[var8]) {
          this.aBooleanArray2128[var8] = 1 == var6.readUnsignedByte();
        }
      }

      for (var8 = 0; ~var8 > ~amountMaterials; ++var8) {
        if (this.materialActive[var8]) {
          this.aBooleanArray2122[var8] = -2 == ~var6.readUnsignedByte();
        }
      }

      for (var8 = 0; var8 < amountMaterials; ++var8) {
        if (this.materialActive[var8]) {
          this.aBooleanArray2135[var8] = -2 == ~var6.readUnsignedByte();
        }
      }

      for (var8 = 0; amountMaterials > var8; ++var8) {
        if (this.materialActive[var8]) {
          this.aByteArray2126[var8] = var6.readByte();
        }
      }

      for (var8 = 0; amountMaterials > var8; ++var8) {
        if (this.materialActive[var8]) {
          this.aByteArray2129[var8] = var6.readByte();
        }
      }

      for (var8 = 0; var8 < amountMaterials; ++var8) {
        if (this.materialActive[var8]) {
          this.aByteArray2144[var8] = var6.readByte();
        }
      }

      for (var8 = 0; ~var8 > ~amountMaterials; ++var8) {
        if (this.materialActive[var8]) {
          this.aByteArray2143[var8] = var6.readByte();
        }
      }

      for (var8 = 0; amountMaterials > var8; ++var8) {
        if (this.materialActive[var8]) {
          this.textureColors[var8] = (short) var6.readUnsignedShort();
        }
      }

    } catch (RuntimeException var9) {
      throw AbstractGameWorld.cascadeException(var9,
        "nk.<init>(" + (textures != null ? "{...}" : "null") + ',' + (materials != null ?
          "{...}" :
          "null") + ',' + (sprites != null ? "{...}" : "null") + ',' + var4 + ',' + var5 + ')');
    }
  }

  static final void method1611(int var0, boolean var1) {
    try {
      int var2;
      NPC var3;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      for (var2 = 0; var2 < DummyClass6.anInt2046; ++var2) {
        var3 = TextureSampler5.npcs[AudioWorker.anIntArray347[var2]];
        if (null != var3 && var3.hasConfiguration((byte) 17) && !var3.config.aBoolean1263 != var1
          && var3.config.method1472((byte) 74)) {
          int var4 = var3.getSize();
          int var5;
          if (1 != var4) {
            if ((~(1 & var4) != -1 || ~(127 & var3.anInt2819) == -1 && 0 == (127 & var3.anInt2829))
              && ((var4 & 1) != 1 || -65 == ~(127 & var3.anInt2819) && 64 == (127
              & var3.anInt2829))) {
              var5 = var3.anInt2819 + -(var4 * 64) >> 7;
              var6 = -(var4 * 64) + var3.anInt2829 >> 7;
              var7 = var3.getSize() + var5;
              if (~var5 > -1) {
                var5 = 0;
              }

              if (~var7 < -105) {
                var7 = 104;
              }

              var8 = var6 + var3.getSize();
              if (-1 < ~var6) {
                var6 = 0;
              }

              if (104 < var8) {
                var8 = 104;
              }

              for (var9 = var5; ~var7 < ~var9; ++var9) {
                for (var10 = var6; ~var10 > ~var8; ++var10) {
                  ++DummyClass9.anIntArrayArray4010[var9][var10];
                }
              }
            }
          } else if (-65 == ~(127 & var3.anInt2819) && (var3.anInt2829 & 127) == 64) {
            var5 = var3.anInt2819 >> 7;
            var6 = var3.anInt2829 >> 7;
            if (-1 >= ~var5 && var5 < 104 && ~var6 <= -1 && -105 < ~var6) {
              ++DummyClass9.anIntArrayArray4010[var5][var6];
            }
          }
        }
      }

      label200:
      for (var2 = 0; ~var2 > ~DummyClass6.anInt2046; ++var2) {
        var3 = TextureSampler5.npcs[AudioWorker.anIntArray347[var2]];
        long var15 = (long) AudioWorker.anIntArray347[var2] << 32 | 536870912L;
        if (var3 != null && var3.hasConfiguration((byte) 17) && !var3.config.aBoolean1263 == !var1
          && var3.config.method1472((byte) 74)) {
          var6 = var3.getSize();
          if (-2 != ~var6) {
            if ((var6 & 1) == 0 && -1 == ~(var3.anInt2819 & 127) && -1 == ~(127 & var3.anInt2829)
              || ~(var6 & 1) == -2 && -65 == ~(var3.anInt2819 & 127)
              && (127 & var3.anInt2829) == 64) {
              var7 = -(64 * var6) + var3.anInt2819 >> 7;
              var8 = -(var6 * 64) + var3.anInt2829 >> 7;
              var10 = var8 - -var6;
              if (var8 < 0) {
                var8 = 0;
              }

              boolean var11 = true;
              var9 = var7 + var6;
              if (-105 > ~var10) {
                var10 = 104;
              }

              if (-1 < ~var7) {
                var7 = 0;
              }

              if (~var9 < -105) {
                var9 = 104;
              }

              int var12;
              int var13;
              for (var12 = var7; var12 < var9; ++var12) {
                for (var13 = var8; ~var13 > ~var10; ++var13) {
                  if (~DummyClass9.anIntArrayArray4010[var12][var13] >= -2) {
                    var11 = false;
                    break;
                  }
                }
              }

              if (var11) {
                var12 = var7;

                while (true) {
                  if (var12 >= var9) {
                    continue label200;
                  }

                  for (var13 = var8; var13 < var10; ++var13) {
                    --DummyClass9.anIntArrayArray4010[var12][var13];
                  }

                  ++var12;
                }
              }
            }
          } else if ((127 & var3.anInt2819) == 64 && ~(127 & var3.anInt2829) == -65) {
            var7 = var3.anInt2819 >> 7;
            var8 = var3.anInt2829 >> 7;
            if (0 > var7 || ~var7 <= -105 || var8 < 0 || ~var8 <= -105) {
              continue;
            }

            if (1 < DummyClass9.anIntArrayArray4010[var7][var8]) {
              --DummyClass9.anIntArrayArray4010[var7][var8];
              continue;
            }
          }

          if (!var3.config.aBoolean1270) {
            var15 |= Long.MIN_VALUE;
          }

          var3.anInt2831 = BufferData
            .method1736(GameWorldSomething.currentPlane, 1, var3.anInt2819, var3.anInt2829);
          DummyClass29
            .addNodeToSceneGraph(GameWorldSomething.currentPlane, var3.anInt2819, var3.anInt2829,
              var3.anInt2831, -64 + 64 * var6 + 60, var3, var3.rotationY, var15, var3.aBoolean2810);
        }
      }

      var2 = -28 / ((var0 - -7) / 34);
    } catch (RuntimeException var14) {
      throw AbstractGameWorld.cascadeException(var14, "nk.V(" + var0 + ',' + var1 + ')');
    }
  }

  public static void method1612(int var0) {
    try {
      localPlayer = null;
      if (var0 != -11565) {
        method1614(false, null, null);
      }

      anIntArray2125 = null;
      aClass94_2132 = null;
      aClass3_Sub28_Sub16_Sub2Array2140 = null;
      aClass135Array2131 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "nk.W(" + var0 + ')');
    }
  }

  static final void method1614(boolean var0, long[] var1, int[] var2) {
    try {
      AbstractGameWorld.method1069(var1, 0, -1 + var1.length, var2, -24337);
      if (!var0) {
        method1612(103);
      }

    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "nk.Q(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ?
          "{...}" :
          "null") + ')');
    }
  }

  static final void method1617(int var0, int var1, int var2, int var3, int var4, byte var5) {
    try {
      if (~var4 >= ~LightIntensity.anInt902 && ~var2 <= ~DummyClass13.anInt2020) {
        boolean var6;
        if (DummyClass55.anInt1425 <= var1) {
          if (GlTexture2d.anInt3765 >= var1) {
            var6 = true;
          } else {
            var6 = false;
            var1 = GlTexture2d.anInt3765;
          }
        } else {
          var6 = false;
          var1 = DummyClass55.anInt1425;
        }

        boolean var7;
        if (var3 < DummyClass55.anInt1425) {
          var3 = DummyClass55.anInt1425;
          var7 = false;
        } else if (~var3 < ~GlTexture2d.anInt3765) {
          var3 = GlTexture2d.anInt3765;
          var7 = false;
        } else {
          var7 = true;
        }

        if (DummyClass13.anInt2020 > var4) {
          var4 = DummyClass13.anInt2020;
        } else {
          TextureSampler18
            .method282(DummyClass35.anIntArrayArray663[var4++], var1, -66, var3, var0);
        }

        if (var2 <= LightIntensity.anInt902) {
          TextureSampler18
            .method282(DummyClass35.anIntArrayArray663[var2--], var1, -54, var3, var0);
        } else {
          var2 = LightIntensity.anInt902;
        }

        int var8;
        if (var6 && var7) {
          for (var8 = var4; var8 <= var2; ++var8) {
            int[] var9 = DummyClass35.anIntArrayArray663[var8];
            var9[var1] = var9[var3] = var0;
          }
        } else if (!var6) {
          if (var7) {
            for (var8 = var4; ~var2 <= ~var8; ++var8) {
              DummyClass35.anIntArrayArray663[var8][var3] = var0;
            }
          }
        } else {
          for (var8 = var4; ~var8 >= ~var2; ++var8) {
            DummyClass35.anIntArrayArray663[var8][var1] = var0;
          }
        }
      }

      if (var5 == 29) {
      }
    } catch (RuntimeException var10) {
      throw AbstractGameWorld.cascadeException(var10,
        "nk.R(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
    }
  }

  final void update(boolean var1, int cycle) {
    try {
      if (!var1) {
        this.method7((byte) 113, 17);
      }

      for (Texture var3 = (Texture) this.aClass47_2142.method1094(0);
           null != var3; var3 = (Texture) this.aClass47_2142.method1099(-1)) {
        if (var3.needsUpdate) {
          var3.update(cycle, (byte) -120);
          var3.needsUpdate = false;
        }
      }

    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "nk.P(" + var1 + ',' + cycle + ')');
    }
  }

  public final int[] method16(int var1, int var2) {
    try {
      if (var1 != 64) {
        this.method12(105, -92);
      }

      Texture var3 = this.getConfig(var2, 1);
      return null == var3 ?
        null :
        var3
          .method720(false, this.aBoolean2134 || this.aBooleanArray2122[var2], this, this.sprites);
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "nk.F(" + var1 + ',' + var2 + ')');
    }
  }

  public final void initializeMaterial(int var1, boolean var2) {
    try {
      SomethingQuickChat
        .method551(0, 255 & this.aByteArray2143[var1], this.aByteArray2144[var1] & 255);
      if (var2) {
        boolean var3 = false;
        Texture var4 = this.getConfig(var1, 1);
        if (var4 != null) {
          var3 = var4.method719(this.sprites, this, 579100487,
            this.aBoolean2134 || this.aBooleanArray2122[var1]);
        }

        if (!var3) {
          GlTexture2d var6 = this.getTexture(var1);
          var6.initialize((byte) 6);
        }

      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5, "nk.G(" + var1 + ',' + var2 + ')');
    }
  }

  private final Texture getConfig(int var1, int var2) {
    try {
      if (var2 != 1) {
        this.aBooleanArray2128 = null;
      }

      Texture var3 = (Texture) this.aClass47_2142.get((long) var1, 1400);
      if (null != var3) {
        return var3;
      } else {
        byte[] var4 = this.textures.getBytes(var1, 0);
        if (null != var4) {
          Buffer var5 = new Buffer(var4);
          var3 = new Texture(var5);
          this.aClass47_2142.put((long) var1, var3);
          return var3;
        } else {
          return null;
        }
      }
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6, "nk.T(" + var1 + ',' + var2 + ')');
    }
  }

  public final int method9(int var1, boolean var2) {
    try {
      return var2 ? -63 : 255 & this.aByteArray2143[var1];
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "nk.D(" + var1 + ',' + var2 + ')');
    }
  }

  public final int method18(int var1, int var2) {
    try {
      if (var2 != 255) {
        method1612(-48);
      }

      return 255 & this.aByteArray2144[var1];
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "nk.B(" + var1 + ',' + var2 + ')');
    }
  }

  public final int method10(int var1, int var2) {
    try {
      int var3 = -81 % ((var1 - 4) / 55);
      return this.aByteArray2126[var2] & 255;
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "nk.C(" + var1 + ',' + var2 + ')');
    }
  }

  public final boolean method7(byte var1, int var2) {
    try {
      if (var1 != 88) {
        this.method19(-99, -37);
      }

      return this.aBooleanArray2128[var2];
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "nk.M(" + var1 + ',' + var2 + ')');
    }
  }

  private final GlTexture2d getTexture(int textureId) {
    try {
      GlTexture2d var4 = (GlTexture2d) this.glTextures.get((long) textureId, 1400);
      if (null == var4) {
        var4 = new GlTexture2d(this.textureColors[textureId] & '\uffff');
        this.glTextures.put((long) textureId, var4);
        return var4;
      } else {
        return var4;
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5, "nk.U(" + textureId + ')');
    }
  }

  public final boolean method11(int var1, int var2) {
    try {
      if (var1 < 0) {
        this.method7((byte) 68, -47);
      }

      Texture var3 = this.getConfig(var2, 1);
      return null != var3 ? var3.method722(-5, this, this.sprites) : false;
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "nk.H(" + var1 + ',' + var2 + ')');
    }
  }

  final void method1616(boolean var1, int var2) {
    try {
      this.aBoolean2134 = var1;
      this.method1618(var2 ^ var2);
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "nk.S(" + var1 + ',' + var2 + ')');
    }
  }

  public final boolean method12(int var1, int var2) {
    try {
      if (var2 != -65) {
        method1614(false, null, null);
      }

      return this.aBooleanArray2135[var1];
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "nk.I(" + var1 + ',' + var2 + ')');
    }
  }

  public final int method19(int var1, int var2) {
    try {
      int var3 = -115 / ((-12 - var1) / 56);
      return 255 & this.aByteArray2129[var2];
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "nk.A(" + var1 + ',' + var2 + ')');
    }
  }

  final void method1618(int var1) {
    try {
      this.aClass47_2142.method1101(2);
      if (var1 == 0) {
        if (null != this.glTextures) {
          this.glTextures.method1101(2);
        }

      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "nk.O(" + var1 + ')');
    }
  }

  public final int method15(int var1, int var2) {
    try {
      if (var2 != '\uffff') {
        this.method11(-82, -17);
      }

      return '\uffff' & this.textureColors[var1];
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "nk.E(" + var1 + ',' + var2 + ')');
    }
  }

  public final boolean method14(byte var1, int var2) {
    try {
      return var1 >= -97 ? true : this.aBoolean2134 || this.aBooleanArray2122[var2];
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "nk.J(" + var1 + ',' + var2 + ')');
    }
  }

  final void method1619(int var1, int var2) {
    try {
      if (var2 != -1) {
        localPlayer = null;
      }

      this.cacheSize = var1;
      this.aClass47_2142 = new Cache(this.cacheSize);
      if (!GlRenderer.useOpenGlRenderer) {
        this.glTextures = null;
      } else {
        this.glTextures = new Cache(this.cacheSize);
      }

    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "nk.N(" + var1 + ',' + var2 + ')');
    }
  }

  public final boolean method17(int var1, int var2) {
    try {
      int var3 = -8 / ((20 - var2) / 45);
      return this.aBooleanArray2124[var1];
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "nk.K(" + var1 + ',' + var2 + ')');
    }
  }

  public final int[] method13(int var1, boolean var2, float var3) {
    try {
      Texture var4 = this.getConfig(var1, 1);
      if (null == var4) {
        return null;
      } else {
        var4.needsUpdate = var2;
        return var4.method718(this, 0, var3, this.sprites,
          this.aBoolean2134 || this.aBooleanArray2122[var1]);
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld
        .cascadeException(var5, "nk.L(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

}
