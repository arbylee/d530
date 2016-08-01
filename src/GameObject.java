final class GameObject extends SceneNode {

  static GameString aClass94_2723 = SpawnedGameObject.createString("<col=c0ff00>");
  static FileUnpacker widgets;
  static GameString aClass94_2735 = SpawnedGameObject.createString(")4");
  static int anInt2737 = 0;
  static volatile int anInt2743 = 0;
  static int plane = 0;
  static byte[][] aByteArrayArray2747 = new byte[50][];
  private static GameString aClass94_2731 = SpawnedGameObject.createString("wave:");
  static GameString aClass94_2740 = aClass94_2731;
  static GameString aClass94_2751 = aClass94_2731;
  private static GameString aClass94_2739 = SpawnedGameObject.createString("Drop");
  static GameString OPTION_DROP = aClass94_2739;
  private int anInt2720 = 0;
  private boolean aBoolean2721 = false;
  private AnimationSequence aClass142_2722;
  private int anInt2724;
  private int anInt2725 = 0;
  private int anInt2726;
  private boolean aBoolean2728 = true;
  private int anInt2729;
  private int anInt2730;
  private int anInt2732;
  private int anInt2733;
  private int anInt2734;
  private int anInt2736;
  private SoftwareIndexedColorSprite aClass109_Sub1_2738 = null;
  private int anInt2741 = -32768;
  private DummyClass0 aClass127_Sub1_2742;
  private int anInt2746;
  private int anInt2748 = 0;
  private int anInt2749;
  private int anInt2750 = -1;
  private int anInt2752 = -1;


  GameObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8,
             SceneNode var9) {
    try {
      this.anInt2732 = var4;
      this.anInt2724 = var3;
      this.anInt2736 = var5;
      this.anInt2734 = var2;
      this.anInt2729 = var1;
      this.anInt2730 = var6;
      GameObjectConfig var10;
      if (GlRenderer.useOpenGlRenderer && null != var9) {
        if (var9 instanceof GameObject) {
          ((GameObject) var9).method1960(-1);
        } else {
          var10 = DummyClass11.method2207(4, this.anInt2729);
          if (var10.anIntArray1524 != null) {
            var10 = var10.method1685(0);
          }

          if (null != var10) {
            FileSystem
              .method840(var10, (byte) -76, 0, this.anInt2724, 0, this.anInt2734, this.anInt2736,
                this.anInt2730, this.anInt2732);
          }
        }
      }

      if (-1 != var7) {
        this.aClass142_2722 = GameClient.method45(var7, (byte) -20);
        this.anInt2726 = 0;
        if (1 >= this.aClass142_2722.anIntArray1851.length) {
          this.anInt2733 = 0;
        } else {
          this.anInt2733 = 1;
        }

        this.anInt2746 = 1;
        this.anInt2749 = -1 + AbstractGameWorld.updateCycle;
        if (-1 == ~this.aClass142_2722.anInt1845 && null != var9 && var9 instanceof GameObject) {
          GameObject var12 = (GameObject) var9;
          if (this.aClass142_2722 == var12.aClass142_2722) {
            this.anInt2726 = var12.anInt2726;
            this.anInt2749 = var12.anInt2749;
            this.anInt2746 = var12.anInt2746;
            this.anInt2733 = var12.anInt2733;
            return;
          }
        }

        if (var8 && this.aClass142_2722.anInt1865 != -1) {
          this.anInt2726 =
            (int) (Math.random() * (double) this.aClass142_2722.anIntArray1851.length);
          this.anInt2733 = this.anInt2726 - -1;
          if (~this.anInt2733 <= ~this.aClass142_2722.anIntArray1851.length) {
            this.anInt2733 -= this.aClass142_2722.anInt1865;
            if (this.anInt2733 < 0
              || ~this.anInt2733 <= ~this.aClass142_2722.anIntArray1851.length) {
              this.anInt2733 = -1;
            }
          }

          this.anInt2746 = 1 - -((int) (Math.random()
            * (double) this.aClass142_2722.anIntArray1869[this.anInt2726]));
          this.anInt2749 = -this.anInt2746 + AbstractGameWorld.updateCycle;
        }
      }

      if (GlRenderer.useOpenGlRenderer && var9 != null) {
        this.method1962(true, -2);
      }

      if (var9 == null) {
        var10 = DummyClass11.method2207(4, this.anInt2729);
        if (null != var10.anIntArray1524) {
          this.aBoolean2721 = true;
        }
      }

    } catch (RuntimeException var11) {
      throw AbstractGameWorld.cascadeException(var11,
        "dc.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ','
          + var7 + ',' + var8 + ',' + (var9 != null ? "{...}" : "null") + ')');
    }
  }

  static final AbstractModel method1957(int var0, boolean var1, AnimationSequence var2, int var3,
                                        int var4, int var5, int var6, int var7, AbstractModel var8,
                                        int var9, int var10, int var11, int var12, byte var13) {
    try {
      long var14 =
        ((long) var4 << 48) + (long) (var7 + (var0 << 16) - -(var12 << 24)) + ((long) var6 << 32);
      AbstractModel var16 = (AbstractModel) DirectImageProducer.aClass93_2982.get(var14);
      int var21;
      int var23;
      int var25;
      int var24;
      int var28;
      if (var16 == null) {
        byte var17;
        if (1 == var7) {
          var17 = 9;
        } else if (var7 == 2) {
          var17 = 12;
        } else if (-4 != ~var7) {
          if (4 == var7) {
            var17 = 18;
          } else {
            var17 = 21;
          }
        } else {
          var17 = 15;
        }

        int[] var19 = new int[] {64, 96, 128};
        byte var18 = 3;
        Model var20 = new Model(1 + var18 * var17, -var17 + var17 * var18 * 2, 0);
        var21 = var20.addVertex(0, 0, 0);
        int[][] var22 = new int[var18][var17];

        for (var23 = 0; ~var23 > ~var18; ++var23) {
          var24 = var19[var23];
          var25 = var19[var23];

          for (int var26 = 0; var26 < var17; ++var26) {
            int var27 = (var26 << 11) / var17;
            int var29 = var5 - -(DummyClass40.COSINE_TABLE[var27] * var25) >> 16;
            var28 = var3 + DummyClass40.SINE_TABLE[var27] * var24 >> 16;
            var22[var23][var26] = var20.addVertex(var28, 0, var29);
          }
        }

        for (var23 = 0; var23 < var18; ++var23) {
          var24 = (256 * var23 - -128) / var18;
          var25 = 256 + -var24;
          byte var38 = (byte) (var12 * var24 + var0 * var25 >> 8);
          short var39 = (short) (((var6 & 127) * var25 + (127 & var4) * var24 & 32512) + (
            var25 * (var6 & 896) + var24 * (var4 & 896) & 229376) + (
            var24 * (var4 & '\ufc00') + ('\ufc00' & var6) * var25 & 16515072) >> 8);

          for (var28 = 0; var28 < var17; ++var28) {
            if (var23 == 0) {
              var20
                .appendFace(var21, var22[0][(1 + var28) % var17], var22[0][var28], (byte) 1, var39,
                  var38);
            } else {
              var20.appendFace(var22[var23 - 1][var28], var22[var23 + -1][(var28 + 1) % var17],
                var22[var23][(var28 - -1) % var17], (byte) 1, var39, var38);
              var20.appendFace(var22[-1 + var23][var28], var22[var23][(1 + var28) % var17],
                var22[var23][var28], (byte) 1, var39, var38);
            }
          }
        }

        var16 = var20.method2008(64, 768, -50, -10, -50);
        DirectImageProducer.aClass93_2982.get((byte) -125, var16, var14);
      }

      int var32 = var7 * 64 + -1;
      if (var13 != -49) {
        return null;
      } else {
        int var33 = -var32;
        int var31 = -var32;
        int var34 = var32;
        int var35 = var8.method1884();
        AnimationSomething var40 = null;
        var23 = var8.method1883();
        var24 = var8.method1898();
        var25 = var8.method1872();
        if (var2 != null) {
          var10 = var2.anIntArray1851[var10];
          var40 = AreaSoundEffect.method133(var10 >> 16, 0);
          var10 &= '\uffff';
        }

        var21 = var32;
        if (var1) {
          if (1664 < var9 || 384 > var9) {
            var31 -= 128;
          }

          if (var9 > 1152 && var9 < 1920) {
            var34 = var32 + 128;
          }

          if (640 < var9 && ~var9 > -1409) {
            var21 = var32 + 128;
          }

          if (-129 > ~var9 && ~var9 > -897) {
            var33 -= 128;
          }
        }

        if (var21 < var25) {
          var25 = var21;
        }

        if (var33 > var35) {
          var35 = var33;
        }

        if (var24 < var31) {
          var24 = var31;
        }

        if (var34 < var23) {
          var23 = var34;
        }

        if (null == var40) {
          var16 = var16.method1882(true, true, true);
          var16.scale((var23 + -var35) / 2, 128, (var25 - var24) / 2);
          var16.method1897((var35 + var23) / 2, 0, (var24 - -var25) / 2);
        } else {
          var16 = var16
            .method1882(!var40.method559(1317095745, var10), !var40.method561(var10, (byte) 115),
              true);
          var16.scale((var23 + -var35) / 2, 128, (var25 + -var24) / 2);
          var16.method1897((var35 + var23) / 2, 0, (var24 + var25) / 2);
          var16.method1877(var40, var10);
        }

        if (var9 != 0) {
          var16.method1876(var9);
        }

        if (!GlRenderer.useOpenGlRenderer) {
          SoftwareModel var37 = (SoftwareModel) var16;
          if (
            ~BufferData.method1736(GameWorldSomething.currentPlane, 1, var3 - -var35, var5 - -var24)
              != ~var11 || var11 != BufferData
              .method1736(GameWorldSomething.currentPlane, 1, var3 + var23, var5 - -var25)) {
            for (var28 = 0; ~var37.anInt3891 < ~var28; ++var28) {
              var37.anIntArray3883[var28] += -var11 + BufferData
                .method1736(GameWorldSomething.currentPlane, 1, var3 + var37.anIntArray3885[var28],
                  var5 + var37.anIntArray3895[var28]);
            }

            var37.aBoolean3897 = false;
          }
        } else {
          GlModel var36 = (GlModel) var16;
          if (~BufferData
            .method1736(GameWorldSomething.currentPlane, var13 ^ -50, var3 - -var35, var24 + var5)
            != ~var11 ||
            ~BufferData.method1736(GameWorldSomething.currentPlane, 1, var23 + var3, var5 - -var25)
              != ~var11) {
            for (var28 = 0; var28 < var36.vertexCCC; ++var28) {
              var36.vy[var28] += -var11 + BufferData
                .method1736(GameWorldSomething.currentPlane, ObjectCache.bitXor(var13, -50),
                  var36.vx[var28] - -var3, var5 + var36.vz[var28]);
            }

            var36.aClass6_3835.aBoolean98 = false;
            var36.vertexPositionData.updated = false;
          }
        }

        return var16;
      }
    } catch (RuntimeException var30) {
      throw AbstractGameWorld.cascadeException(var30,
        "dc.E(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ','
          + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + (var8 != null ? "{...}" : "null")
          + ',' + var9 + ',' + var10 + ',' + var11 + ',' + var12 + ',' + var13 + ')');
    }
  }

  public static void method1958(int var0) {
    try {
      aClass94_2751 = null;
      OPTION_DROP = null;
      aClass94_2723 = null;
      widgets = null;
      aClass94_2731 = null;
      if (var0 != 2) {
        method1958(64);
      }

      aClass94_2740 = null;
      aByteArrayArray2747 = null;
      aClass94_2735 = null;
      aClass94_2739 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "dc.G(" + var0 + ')');
    }
  }

  static final void method1959(int var0, int var1, int var2, boolean var3) {
    try {
      if (~var2 <= -8001 && var2 <= '\ubb80') {
        AudioStreamEncoder4.anInt3507 = var1;
        if (var0 != 256) {
          OPTION_DROP = null;
        }

        GameString.stereo = var3;
        DummyClass60.sampleRate = var2;
      } else {
        throw new IllegalArgumentException();
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld
        .cascadeException(var5, "dc.D(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  static final void method1964(boolean var0) {
    try {
      int var1 = SpotAnimationConfig.gameBuffer.readBits(8);
      int var2;
      if (~DummyClass13.anInt2022 < ~var1) {
        for (var2 = var1; ~var2 > ~DummyClass13.anInt2022; ++var2) {
          VariableUpdate.anIntArray2292[DummyClass17.anInt1829++] =
            DummyClass42.anIntArray887[var2];
        }
      }

      if (~var1 >= ~DummyClass13.anInt2022) {
        DummyClass13.anInt2022 = 0;
        var2 = 0;
        if (var0) {
          method1959(-121, -69, 115, false);
        }

        for (; ~var2 > ~var1; ++var2) {
          int var3 = DummyClass42.anIntArray887[var2];
          Player var4 = TextureSampler0.players[var3];
          int var5 = SpotAnimationConfig.gameBuffer.readBits(1);
          if (~var5 == -1) {
            DummyClass42.anIntArray887[DummyClass13.anInt2022++] = var3;
            var4.anInt2838 = AbstractGameWorld.updateCycle;
          } else {
            int var6 = SpotAnimationConfig.gameBuffer.readBits(2);
            if (var6 != 0) {
              int var7;
              int var8;
              if (-2 != ~var6) {
                if (-3 != ~var6) {
                  if (-4 == ~var6) {
                    VariableUpdate.anIntArray2292[DummyClass17.anInt1829++] = var3;
                  }
                } else {
                  DummyClass42.anIntArray887[DummyClass13.anInt2022++] = var3;
                  var4.anInt2838 = AbstractGameWorld.updateCycle;
                  if (SpotAnimationConfig.gameBuffer.readBits(1) != 1) {
                    var7 = SpotAnimationConfig.gameBuffer.readBits(3);
                    var4.method1968(0, (byte) 113, var7);
                  } else {
                    var7 = SpotAnimationConfig.gameBuffer.readBits(3);
                    var4.method1968(2, (byte) -92, var7);
                    var8 = SpotAnimationConfig.gameBuffer.readBits(3);
                    var4.method1968(2, (byte) 88, var8);
                  }

                  var7 = SpotAnimationConfig.gameBuffer.readBits(1);
                  if (1 == var7) {
                    DummyClass60.anIntArray441[OndemandRequester.anInt997++] = var3;
                  }
                }
              } else {
                DummyClass42.anIntArray887[DummyClass13.anInt2022++] = var3;
                var4.anInt2838 = AbstractGameWorld.updateCycle;
                var7 = SpotAnimationConfig.gameBuffer.readBits(3);
                var4.method1968(1, (byte) 46, var7);
                var8 = SpotAnimationConfig.gameBuffer.readBits(1);
                if (~var8 == -2) {
                  DummyClass60.anIntArray441[OndemandRequester.anInt997++] = var3;
                }
              }
            } else {
              DummyClass42.anIntArray887[DummyClass13.anInt2022++] = var3;
              var4.anInt2838 = AbstractGameWorld.updateCycle;
              DummyClass60.anIntArray441[OndemandRequester.anInt997++] = var3;
            }
          }
        }

      } else {
        throw new RuntimeException("gppov1");
      }
    } catch (RuntimeException var9) {
      throw AbstractGameWorld.cascadeException(var9, "dc.B(" + var0 + ')');
    }
  }

  final void method1867(int var1, int var2, int var3, int var4, int var5) {
    try {
      if (GlRenderer.useOpenGlRenderer) {
        this.method1962(true, -2);
      } else {
        this.method1961(var5, var4, -101);
      }

    } catch (RuntimeException var7) {
      throw AbstractGameWorld.cascadeException(var7,
        "dc.IB(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
    }
  }

  final void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8,
                  long var9, int var11, DummyClass0 var12) {
    try {
      SceneNode var13 = this.method1963(3);
      if (null != var13) {
        var13.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11,
          this.aClass127_Sub1_2742);
      }
    } catch (RuntimeException var14) {
      throw AbstractGameWorld.cascadeException(var14,
        "dc.IA(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ','
          + var7 + ',' + var8 + ',' + var9 + ',' + var11 + ',' + (var12 != null ? "{...}" : "null")
          + ')');
    }
  }

  final void method1960(int var1) {
    try {
      if (this.aClass109_Sub1_2738 != null) {
        DummyClass16
          .method2047(this.aClass109_Sub1_2738, this.anInt2725, this.anInt2720, this.anInt2748);
      }

      this.anInt2750 = -1;
      this.anInt2752 = var1;
      this.aClass109_Sub1_2738 = null;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "dc.F(" + var1 + ')');
    }
  }

  protected final void finalize() {
  }

  private final void method1961(int var1, int var2, int var3) {
    try {
      if (this.aClass142_2722 != null) {
        int var4 = AbstractGameWorld.updateCycle - this.anInt2749;
        if (-101 > ~var4 && this.aClass142_2722.anInt1865 > 0) {
          int var5;
          for (
            var5 = this.aClass142_2722.anIntArray1851.length - this.aClass142_2722.anInt1865;
            ~this.anInt2726 > ~var5
              && ~this.aClass142_2722.anIntArray1869[this.anInt2726] > ~var4; ++this.anInt2726) {
            var4 -= this.aClass142_2722.anIntArray1869[this.anInt2726];
          }

          if (~this.anInt2726 <= ~var5) {
            int var6 = 0;

            for (int var7 = var5; ~this.aClass142_2722.anIntArray1851.length < ~var7; ++var7) {
              var6 += this.aClass142_2722.anIntArray1869[var7];
            }

            var4 %= var6;
          }

          this.anInt2733 = 1 + this.anInt2726;
          if (this.anInt2733 >= this.aClass142_2722.anIntArray1851.length) {
            this.anInt2733 -= this.aClass142_2722.anInt1865;
            if (~this.anInt2733 > -1
              || this.aClass142_2722.anIntArray1851.length <= this.anInt2733) {
              this.anInt2733 = -1;
            }
          }
        }

        while (~var4 < ~this.aClass142_2722.anIntArray1869[this.anInt2726]) {
          SocketStream
            .method1470(var1, this.aClass142_2722, 183921384, var2, false, this.anInt2726);
          var4 -= this.aClass142_2722.anIntArray1869[this.anInt2726];
          ++this.anInt2726;
          if (~this.aClass142_2722.anIntArray1851.length >= ~this.anInt2726) {
            this.anInt2726 -= this.aClass142_2722.anInt1865;
            if (0 > this.anInt2726
              || ~this.aClass142_2722.anIntArray1851.length >= ~this.anInt2726) {
              this.aClass142_2722 = null;
              break;
            }
          }

          this.anInt2733 = this.anInt2726 - -1;
          if (~this.aClass142_2722.anIntArray1851.length >= ~this.anInt2733) {
            this.anInt2733 -= this.aClass142_2722.anInt1865;
            if (~this.anInt2733 > -1
              || ~this.anInt2733 <= ~this.aClass142_2722.anIntArray1851.length) {
              this.anInt2733 = -1;
            }
          }
        }

        this.anInt2746 = var4;
        this.anInt2749 = -var4 + AbstractGameWorld.updateCycle;
      }

      if (var3 == -101) {
      }
    } catch (RuntimeException var8) {
      throw AbstractGameWorld
        .cascadeException(var8, "dc.A(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  private final SceneNode method1962(boolean var1, int var2) {
    try {
      boolean var3 = DummyClass43.somethingHeightMap != AbstractGameWorld.heightMap;
      GameObjectConfig var4 = DummyClass11.method2207(var2 + 6, this.anInt2729);
      int var5 = var4.anInt1531;
      if (null != var4.anIntArray1524) {
        var4 = var4.method1685(0);
      }

      if (null == var4) {
        if (GlRenderer.useOpenGlRenderer && !var3) {
          this.method1960(-1);
        }

        return null;
      } else {
        int var6;
        if (AbstractImageProducer.gameId != 0 && this.aBoolean2721 && (null == this.aClass142_2722
          || null != this.aClass142_2722 && ~this.aClass142_2722.anInt1864 != ~var4.anInt1531)) {
          var6 = var4.anInt1531;
          if (0 == ~var4.anInt1531) {
            var6 = var5;
          }

          if (0 == ~var6) {
            this.aClass142_2722 = null;
          } else {
            this.aClass142_2722 = GameClient.method45(var6, (byte) -20);
          }

          if (null != this.aClass142_2722) {
            if (var4.aBoolean1492 && -1 != this.aClass142_2722.anInt1865) {
              this.anInt2726 =
                (int) (Math.random() * (double) this.aClass142_2722.anIntArray1851.length);
              this.anInt2749 -=
                (int) (Math.random() * (double) this.aClass142_2722.anIntArray1869[this.anInt2726]);
            } else {
              this.anInt2726 = 0;
              this.anInt2749 = AbstractGameWorld.updateCycle + -1;
            }
          }
        }

        var6 = this.anInt2724 & 3;
        int var7;
        int var8;
        if (~var6 != var2 && -4 != ~var6) {
          var7 = var4.anInt1480;
          var8 = var4.anInt1485;
        } else {
          var8 = var4.anInt1480;
          var7 = var4.anInt1485;
        }

        int var10 = this.anInt2736 - -(1 + var7 >> 1);
        int var9 = (var7 >> 1) + this.anInt2736;
        int var11 = (var8 >> 1) + this.anInt2730;
        int var12 = (var8 - -1 >> 1) + this.anInt2730;
        this.method1961(128 * var11, var9 * 128, -101);
        boolean var13 = !var3 && var4.aBoolean1503 && (var4.anInt1527 != this.anInt2750 ||
          (~this.anInt2726 != ~this.anInt2752 || this.aClass142_2722 != null && (
            this.aClass142_2722.aBoolean1872 || MonoChromaticImageBuffer.tweening)
            && ~this.anInt2726 != ~this.anInt2733) && ~HashTableIterator.anInt1137 <= -3);
        if (var1 && !var13) {
          return null;
        } else {
          int[][] var14 = AbstractGameWorld.heightMap[this.anInt2732];
          int var15 =
            var14[var10][var12] + var14[var9][var12] + var14[var9][var11] + var14[var10][var11]
              >> 2;
          int var16 = (var7 << 6) + (this.anInt2736 << 7);
          int var17 = (var8 << 6) + (this.anInt2730 << 7);
          int[][] var18 = null;
          if (!var3) {
            if (-4 < ~this.anInt2732) {
              var18 = AbstractGameWorld.heightMap[1 + this.anInt2732];
            }
          } else {
            var18 = DummyClass43.somethingHeightMap[0];
          }

          if (GlRenderer.useOpenGlRenderer && var13) {
            DummyClass16
              .method2047(this.aClass109_Sub1_2738, this.anInt2725, this.anInt2720, this.anInt2748);
          }

          boolean var19 = null == this.aClass109_Sub1_2738;
          SceneShadowMap var20;
          if (this.aClass142_2722 != null) {
            var20 = var4.method1697(var17, var16,
              !var19 ? this.aClass109_Sub1_2738 : SomethingTexture.aClass109_Sub1_2631, var15,
              this.aClass142_2722, this.anInt2724, var14, var13, this.anInt2726, var2 ^ -8310,
              var18, this.anInt2733, this.anInt2734, this.anInt2746);
          } else {
            var20 = var4
              .method1696(this.anInt2724, var16, var14, this.anInt2734, var15, var18, false,
                var19 ? SomethingTexture.aClass109_Sub1_2631 : this.aClass109_Sub1_2738,
                (byte) -128, var13, var17);
          }

          if (null == var20) {
            return null;
          } else {
            if (GlRenderer.useOpenGlRenderer && var13) {
              if (var19) {
                SomethingTexture.aClass109_Sub1_2631 = var20.shadow;
              }

              int var21 = 0;
              if (-1 != ~this.anInt2732) {
                int[][] var22 = AbstractGameWorld.heightMap[0];
                var21 = var15 - (var22[var10][var11] + var22[var9][var11] - (-var22[var9][var12]
                  - var22[var10][var12]) >> 2);
              }

              SoftwareIndexedColorSprite var24 = var20.shadow;
              if (this.aBoolean2728 && DummyClass16.method2049(var24, var16, var21, var17)) {
                this.aBoolean2728 = false;
              }

              if (!this.aBoolean2728) {
                DummyClass16.method2051(var24, var16, var21, var17);
                this.aClass109_Sub1_2738 = var24;
                this.anInt2748 = var17;
                if (var19) {
                  SomethingTexture.aClass109_Sub1_2631 = null;
                }

                this.anInt2720 = var21;
                this.anInt2725 = var16;
              }

              this.anInt2750 = var4.anInt1527;
              this.anInt2752 = this.anInt2726;
            }

            return var20.node;
          }
        }
      }
    } catch (RuntimeException var23) {
      throw AbstractGameWorld.cascadeException(var23, "dc.H(" + var1 + ',' + var2 + ')');
    }
  }

  final SceneNode method1963(int var1) {
    try {
      if (var1 != 3) {
        aClass94_2731 = null;
      }

      return this.method1962(false, var1 + -5);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "dc.C(" + var1 + ')');
    }
  }

  final int getMinimumY() {
    try {
      return this.anInt2741;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "dc.MA()");
    }
  }

}
