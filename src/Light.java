final class Light {

  static int anInt692 = 0;
  static GameString aClass94_699 = SpawnedGameObject.createString("clignotant3:");
  static GameString aClass94_700 = SpawnedGameObject.createString("blaugr-Un:");
  static GameString aClass94_701 = SpawnedGameObject.createString("Chargement de la liste des serveurs");
  static int anInt715;
  static int anInt716 = 0;
  private static GameString aClass94_695 = SpawnedGameObject.createString("Unable to find ");
  static GameString aClass94_691 = aClass94_695;
  boolean aBoolean690;
  boolean aBoolean696 = false;
  int anInt697;
  int anInt698;
  int anInt703;
  int anInt704;
  int anInt705;
  short[] aShortArray706;
  float aFloat707;
  int anInt708;
  float aFloat710;
  boolean aBoolean711;
  SomethingLight aClass37_712;
  int color;
  float[] colors = new float[4];
  private int anInt693;
  private int anInt694;
  private int anInt702;
  private int anInt709;
  private int anInt714;

  protected Light() {
    try {
      if (TextureSampler16.anIntArray3107 == null) {
        DummyClass38.method1083((byte) -90);
      }

      this.method1064(3);
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "gi.<init>()");
    }
  }

  Light(Buffer var1) {
    try {
      if (null == TextureSampler16.anIntArray3107) {
        DummyClass38.method1083((byte) -94);
      }

      this.anInt704 = var1.readUnsignedByte();
      this.aBoolean690 = -1 != ~(this.anInt704 & 16);
      this.aBoolean711 = -1 != ~(this.anInt704 & 8);
      this.anInt704 &= 7;
      this.anInt703 = var1.readUnsignedShort();
      this.anInt708 = var1.readUnsignedShort();
      this.anInt697 = var1.readUnsignedShort();
      this.anInt698 = var1.readUnsignedByte();
      this.method1061(66);
      this.aShortArray706 = new short[this.anInt698 * 2 + 1];

      int var2;
      for (var2 = 0; var2 < this.aShortArray706.length; ++var2) {
        this.aShortArray706[var2] = (short) var1.readUnsignedShort();
      }

      this.color = DummyClass40.hslTable[var1.readUnsignedShort()];
      var2 = var1.readUnsignedByte();
      this.anInt714 = 1792 & var2 << 3;
      this.anInt705 = var2 & 31;
      if (31 != this.anInt705) {
        this.method1064(3);
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld
        .cascadeException(var3, "gi.<init>(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  static final void method1058(int var0, int var1, int var2, int var3, byte var4) {
    try {
      int var5 = 25 % ((25 - var4) / 52);
      if (~(var1 + -var0) <= ~DummyClass55.anInt1425 && GlTexture2d.anInt3765 >= var0 + var1
        && var3 + -var0 >= DummyClass13.anInt2020 && LightIntensity.anInt902 >= var0 + var3) {
        IdentityKit.method949(var1, (byte) 118, var0, var2, var3);
      } else {
        GZipDecompressor.method1129(var2, var3, var0, 0, var1);
      }

    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "gi.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
    }
  }

  public static void method1059(byte var0) {
    try {
      aClass94_695 = null;
      aClass94_701 = null;
      aClass94_699 = null;
      aClass94_691 = null;
      if (var0 == -2) {
        aClass94_700 = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "gi.E(" + var0 + ')');
    }
  }

  static final AbstractDirectColorSprite method1062(int var0) {
    try {
      byte[] var2 = DummyClass5.aByteArrayArray2987[0];
      int var1 = GroundItem.anIntArray2931[0] * TextureSampler26.anIntArray3076[0];
      int[] var3 = new int[var1];
      if (var0 < 70) {
        method1062(67);
      }

      for (int var4 = 0; ~var1 < ~var4; ++var4) {
        var3[var4] = TextureSampler38.anIntArray3446[ClientScript.bitAnd(var2[var4], 255)];
      }

      Object var6;
      if (!GlRenderer.useOpenGlRenderer) {
        var6 = new SoftwareDirectColorSprite(SomethingVolume15.anInt2426, SomethingPacket116.anInt1748,
          Something3dRoot.anIntArray2048[0], Buffer.anIntArray2591[0], GroundItem.anIntArray2931[0],
          TextureSampler26.anIntArray3076[0], var3);
      } else {
        var6 = new GlDirectColorSprite(SomethingVolume15.anInt2426, SomethingPacket116.anInt1748,
          Something3dRoot.anIntArray2048[0], Buffer.anIntArray2591[0], GroundItem.anIntArray2931[0],
          TextureSampler26.anIntArray3076[0], var3);
      }

      DummyClass37.method1035((byte) 111);
      return (AbstractDirectColorSprite) var6;
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5, "gi.D(" + var0 + ')');
    }
  }

  static final void executeScript(ClientScriptCall var1) {
    try {

      ItemConfig.callScript((byte) -93, 200000, var1);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld
        .cascadeException(var3, "gi.H(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  final void method1060(byte var1, int var2, int var3, int var4, int var5) {
    try {
      this.anInt694 = var2;
      this.anInt702 = var4;
      this.anInt693 = var5;
      int var6 = -4 % ((var1 - 7) / 62);
      this.anInt709 = var3;
    } catch (RuntimeException var7) {
      throw AbstractGameWorld.cascadeException(var7,
        "gi.F(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
    }
  }

  private final void method1061(int var1) {
    try {
      int var2 = (this.anInt698 << 7) - -64;
      this.aFloat710 = 1.0F / (float) (var2 * var2);
      int var3 = 9 % ((9 - var1) / 57);
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "gi.C(" + var1 + ')');
    }
  }

  final void method1063(boolean var1, int var2, int var3) {
    try {
      if (var3 != -3696) {
        method1058(-127, -32, -68, -32, (byte) -77);
      }

      int var5 = this.anInt714 + var2 * this.anInt709 / 50 & 2047;
      int var6 = this.anInt694;
      int var4;
      if (var6 == 1) {
        var4 = 1024 - -(DummyClass40.SINE_TABLE[var5] >> 6);
      } else if (var6 != 3) {
        if (var6 == 4) {
          var4 = var5 >> 10 << 11;
        } else if (~var6 != -3) {
          if (~var6 != -6) {
            var4 = 2048;
          } else {
            var4 = (var5 < 1024 ? var5 : 2048 - var5) << 1;
          }
        } else {
          var4 = var5;
        }
      } else {
        var4 = TextureSampler16.anIntArray3107[var5] >> 1;
      }

      if (var1) {
        var4 = 2048;
      }

      this.aFloat707 = (float) (this.anInt693 + (var4 * this.anInt702 >> 11)) / 2048.0F;
      float var8 = this.aFloat707 / 255.0F;
      this.colors[0] = (float) (ClientScript.bitAnd(this.color, 16771365) >> 16) * var8;
      this.colors[2] = var8 * (float) ClientScript.bitAnd(255, this.color);
      this.colors[1] = (float) (ClientScript.bitAnd(this.color, '\uffe7') >> 8) * var8;
    } catch (RuntimeException var7) {
      throw AbstractGameWorld
        .cascadeException(var7, "gi.A(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  private final void method1064(int var1) {
    try {
      int var2 = this.anInt705;
      if (var2 != 2) {
        if (-4 == ~var2) {
          this.anInt693 = 0;
          this.anInt709 = 4096;
          this.anInt694 = 1;
          this.anInt702 = 2048;
        } else if (~var2 != -5) {
          if (-6 == ~var2) {
            this.anInt694 = 4;
            this.anInt702 = 2048;
            this.anInt709 = 8192;
            this.anInt693 = 0;
          } else if (-13 != ~var2) {
            if (var2 == 13) {
              this.anInt709 = 8192;
              this.anInt702 = 2048;
              this.anInt694 = 2;
              this.anInt693 = 0;
            } else if (-11 != ~var2) {
              if (var2 == 11) {
                this.anInt694 = 3;
                this.anInt709 = 4096;
                this.anInt702 = 512;
                this.anInt693 = 1536;
              } else if (-7 != ~var2) {
                if (~var2 == -8) {
                  this.anInt702 = 768;
                  this.anInt693 = 1280;
                  this.anInt709 = 4096;
                  this.anInt694 = 3;
                } else if (-9 == ~var2) {
                  this.anInt709 = 2048;
                  this.anInt694 = 3;
                  this.anInt702 = 1024;
                  this.anInt693 = 1024;
                } else if (var2 == 9) {
                  this.anInt709 = 4096;
                  this.anInt693 = 1024;
                  this.anInt702 = 1024;
                  this.anInt694 = 3;
                } else if (-15 != ~var2) {
                  if (~var2 == -16) {
                    this.anInt702 = 512;
                    this.anInt709 = 4096;
                    this.anInt693 = 1536;
                    this.anInt694 = 1;
                  } else if (~var2 != -17) {
                    this.anInt709 = 2048;
                    this.anInt693 = 0;
                    this.anInt702 = 2048;
                    this.anInt694 = 0;
                  } else {
                    this.anInt709 = 8192;
                    this.anInt693 = 1792;
                    this.anInt694 = 1;
                    this.anInt702 = 256;
                  }
                } else {
                  this.anInt709 = 2048;
                  this.anInt693 = 1280;
                  this.anInt694 = 1;
                  this.anInt702 = 768;
                }
              } else {
                this.anInt702 = 768;
                this.anInt693 = 1280;
                this.anInt694 = 3;
                this.anInt709 = 2048;
              }
            } else {
              this.anInt702 = 512;
              this.anInt694 = 3;
              this.anInt693 = 1536;
              this.anInt709 = 2048;
            }
          } else {
            this.anInt702 = 2048;
            this.anInt694 = 2;
            this.anInt709 = 2048;
            this.anInt693 = 0;
          }
        } else {
          this.anInt693 = 0;
          this.anInt702 = 2048;
          this.anInt694 = 4;
          this.anInt709 = 2048;
        }
      } else {
        this.anInt702 = 2048;
        this.anInt693 = 0;
        this.anInt694 = 1;
        this.anInt709 = 2048;
      }

      if (var1 != 3) {
        this.anInt714 = -84;
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "gi.G(" + var1 + ')');
    }
  }

}
