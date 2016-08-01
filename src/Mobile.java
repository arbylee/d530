abstract class Mobile extends SceneNode {

  static int anInt2756;
  static GameString aClass94_2765 = SpawnedGameObject.createString(" ");
  static int anInt2770;
  static boolean aBoolean2774 = true;
  static ObjectCache aClass93_2792 = new ObjectCache(64);
  static int[] quady1 = new int[100];
  static AbstractDirectColorSprite[] aClass3_Sub28_Sub16Array2839;
  static ScriptState[] aClass54Array2841 = new ScriptState[50];
  int anInt2753 = 0;
  int[] waypointsY = new int[10];
  int anInt2758 = 0;
  int anInt2759;
  int anInt2760 = 0;
  int anInt2761 = 0;
  int anInt2762 = 0;
  int renderAnimationId = -1;
  int anInt2764 = -1;
  int[] waypointsX = new int[10];
  int[] anIntArray2768 = new int[4];
  boolean aBoolean2769 = false;
  int animationId = -1;
  int anInt2772 = -1;
  int anInt2773 = 0;
  int anInt2775;
  int anInt2776 = -1;
  int anInt2777;
  int anInt2778 = 0;
  int anInt2779 = 32;
  int anInt2780 = 0;
  int anInt2781 = -1000;
  int anInt2782;
  int anInt2784;
  int rotationY;
  int anInt2786 = 0;
  int anInt2788;
  int anInt2789 = 0;
  int anInt2790;
  int anInt2791 = 0;
  int anInt2793 = -1;
  byte[] aByteArray2795 = new byte[10];
  Object anObject2796;
  int anInt2797 = 0;
  int anInt2798;
  int anInt2799;
  int anInt2800;
  DummyClass0 aClass127_Sub1_2801;
  int anInt2802 = 0;
  int anInt2803 = 0;
  int anInt2805 = 0;
  int anInt2806;
  int anInt2808 = 0;
  Unsure[] aClass145Array2809 = new Unsure[12];
  boolean aBoolean2810 = false;
  int anInt2811 = 0;
  int anInt2812;
  int anInt2813 = 0;
  int anInt2814 = 100;
  int[] anIntArray2815 = new int[4];
  int anInt2816 = 0;
  int anInt2817;
  int anInt2818;
  int anInt2819;
  int anInt2820 = -32768;
  int anInt2821 = 0;
  int anInt2823;
  int anInt2824 = 0;
  GameString aClass94_2825 = null;
  int anInt2826 = -1;
  int anInt2828 = 0;
  int anInt2829;
  int anInt2831;
  int anInt2832 = 0;
  int anInt2833;
  int anInt2835;
  int[] anIntArray2836 = new int[4];
  int anInt2837 = 0;
  int anInt2838 = 0;
  int anInt2840;
  int anInt2842 = -1;
  private int anInt2754 = 0;
  private int anInt2757 = 0;
  private int anInt2766 = 0;
  private boolean aBoolean2783 = false;
  private int anInt2787 = 0;
  private int anInt2804 = 0;
  private boolean aBoolean2807 = false;
  private int size = 1;
  private int anInt2827 = 0;
  private int anInt2830 = 0;
  private int anInt2834 = 0;

  final RenderAnimation getRenderAnimationId(boolean var1) {
    try {
      int var2 = this.getRenderAnimationId();
      return var1 ?
        null :
        (0 == ~var2 ?
          DummyClass18.DEFAULT_RENDER_ANIMATION :
          StringNode0.getRenderAnimation(false, var2));
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "fe.D(" + var1 + ')');
    }
  }

  boolean hasConfiguration(byte var1) {
    try {
      if (var1 != 17) {
        this.method1975(-109);
      }

      return false;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "fe.L(" + var1 + ')');
    }
  }

  final void setPosition(int size, int x, int y, boolean var5) {
    try {
      if (~this.animationId != 0 && -2 == ~GameClient.method45(this.animationId,
        (byte) -20).anInt1850) {
        this.animationId = -1;
      }

      if (!var5) {
        int var6 = x + -this.waypointsX[0];
        int var7 = y + -this.waypointsY[0];
        if (~var6 <= 7 && 8 >= var6 && 7 >= ~var7 && ~var7 >= -9) {
          if (this.anInt2816 < 9) {
            ++this.anInt2816;
          }

          for (int var8 = this.anInt2816; ~var8 < -1; --var8) {
            this.waypointsX[var8] = this.waypointsX[-1 + var8];
            this.waypointsY[var8] = this.waypointsY[var8 + -1];
            this.aByteArray2795[var8] = this.aByteArray2795[var8 - 1];
          }

          this.aByteArray2795[0] = 1;
          this.waypointsX[0] = x;
          this.waypointsY[0] = y;
          return;
        }
      }

      this.anInt2824 = 0;
      this.waypointsX[0] = x;
      this.waypointsY[0] = y;
      this.anInt2816 = 0;
      this.anInt2811 = 0;
      this.anInt2829 = 64 * size + this.waypointsY[0] * 128;
      this.anInt2819 = size * 64 + 128 * this.waypointsX[0];
      if (GlRenderer.useOpenGlRenderer && TextureCache.localPlayer == this) {
        TextureSampler31.method236((byte) 64);
      }

    } catch (RuntimeException var9) {
      throw AbstractGameWorld.cascadeException(var9,
        "fe.J(" + size + ',' + x + ',' + y + ',' + var5 + ')');
    }
  }

  final void method1968(int var1, byte var2, int var3) {
    try {
      int var4 = this.waypointsX[0];
      int var5 = this.waypointsY[0];
      if (0 == var3) {
        --var4;
        ++var5;
      }

      if (~this.animationId != 0 && 1 == GameClient.method45(this.animationId,
        (byte) -20).anInt1850) {
        this.animationId = -1;
      }

      if (-10 < ~this.anInt2816) {
        ++this.anInt2816;
      }

      int var6;
      for (var6 = this.anInt2816; -1 > ~var6; --var6) {
        this.waypointsX[var6] = this.waypointsX[-1 + var6];
        this.waypointsY[var6] = this.waypointsY[-1 + var6];
        this.aByteArray2795[var6] = this.aByteArray2795[-1 + var6];
      }

      if (-2 == ~var3) {
        ++var5;
      }

      this.aByteArray2795[0] = (byte) var1;
      if (2 == var3) {
        ++var5;
        ++var4;
      }

      if (-4 == ~var3) {
        --var4;
      }

      if (4 == var3) {
        ++var4;
      }

      if (5 == var3) {
        --var5;
        --var4;
      }

      if (var3 == 6) {
        --var5;
      }

      if (-8 == ~var3) {
        --var5;
        ++var4;
      }

      this.waypointsX[0] = var4;
      var6 = -106 / ((var2 - -10) / 40);
      this.waypointsY[0] = var5;
    } catch (RuntimeException var7) {
      throw AbstractGameWorld.cascadeException(var7,
        "fe.E(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  final void method1969(byte var1, AbstractModel var2, int var3) {
    try {
      if (var1 <= 33) {
        this.method1971(null, (byte) -26);
      }

      Parameter.anInt3623 = 0;
      TextureSampler15.anInt3198 = 0;
      TextureSampler16.anInt3111 = 0;
      RenderAnimation var4 = this.getRenderAnimationId(false);
      int var5 = var4.anInt395;
      int var6 = var4.anInt381;
      if (-1 != ~var5 && var6 != 0) {
        int var7 = DummyClass40.SINE_TABLE[var3];
        int var8 = DummyClass40.COSINE_TABLE[var3];
        int var9 = -var5 / 2;
        int var10 = -var6 / 2;
        int var12 = -(var9 * var7) + var10 * var8 >> 16;
        int var11 = var7 * var10 - -(var8 * var9) >> 16;
        int var13 =
          BufferData.method1736(GameWorldSomething.currentPlane, 1, var11 + this.anInt2819,
            this.anInt2829 + var12);
        int var14 = var5 / 2;
        int var15 = -var6 / 2;
        int var16 = var14 * var8 + var15 * var7 >> 16;
        int var20 = var6 / 2;
        int var17 = var15 * var8 + -(var14 * var7) >> 16;
        int var18 =
          BufferData.method1736(GameWorldSomething.currentPlane, 1, var16 + this.anInt2819,
            this.anInt2829 - -var17);
        int var19 = -var5 / 2;
        int var22 = -(var7 * var19) + var20 * var8 >> 16;
        int var25 = var6 / 2;
        int var24 = var5 / 2;
        int var21 = var7 * var20 - -(var8 * var19) >> 16;
        int var27 = var25 * var8 - var7 * var24 >> 16;
        int var26 = var7 * var25 + var8 * var24 >> 16;
        int var23 =
          BufferData.method1736(GameWorldSomething.currentPlane, 1, this.anInt2819 + var21,
            var22 + this.anInt2829);
        int var29 = ~var18 < ~var13 ? var13 : var18;
        int var28 =
          BufferData.method1736(GameWorldSomething.currentPlane, 1, var26 + this.anInt2819,
            var27 + this.anInt2829);
        int var30 = var28 > var23 ? var23 : var28;
        int var31 = var28 > var18 ? var18 : var28;
        int var32 = var23 <= var13 ? var23 : var13;
        TextureSampler15.anInt3198 =
          2047 & (int) (325.95D * Math.atan2((double) (var29 - var30), (double) var6));
        if (TextureSampler15.anInt3198 != 0) {
          var2.method1896(TextureSampler15.anInt3198);
        }

        Parameter.anInt3623 =
          2047 & (int) (325.95D * Math.atan2((double) (-var31 + var32), (double) var5));
        if (Parameter.anInt3623 != 0) {
          var2.method1886(Parameter.anInt3623);
        }

        TextureSampler16.anInt3111 = var28 + var13;
        if (~(var23 + var18) > ~TextureSampler16.anInt3111) {
          TextureSampler16.anInt3111 = var23 + var18;
        }

        TextureSampler16.anInt3111 = (TextureSampler16.anInt3111 >> 1) - this.anInt2831;
        if (TextureSampler16.anInt3111 != 0) {
          var2.method1897(0, TextureSampler16.anInt3111, 0);
        }
      }

    } catch (RuntimeException var33) {
      throw AbstractGameWorld.cascadeException(var33,
        "fe.M(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
    }
  }

  final void method1970(int var1, int var2, int var3, int var4) {
    try {
      if (var2 == -8) {
        for (int var5 = 0; -5 < ~var5; ++var5) {
          if (var3 >= this.anIntArray2768[var5]) {
            this.anIntArray2836[var5] = var4;
            this.anIntArray2815[var5] = var1;
            this.anIntArray2768[var5] = 70 + var3;
            return;
          }
        }

      }
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "fe.G(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
    }
  }

  final void method1971(AbstractModel var1, byte var2) {
    try {
      if (var2 > -102) {
        this.method1976(1, -96);
      }

      RenderAnimation var3 = this.getRenderAnimationId(false);
      if (0 != var3.anInt400 || 0 != var3.anInt371) {
        int var4 = 0;
        int var5 = 0;
        if (this.aBoolean2769 && ~this.anInt2821 != -1) {
          var5 = var3.anInt371;
          if (this.anInt2821 >= 0) {
            var4 = var3.anInt400;
          } else {
            var4 = -var3.anInt400;
          }
        }

        int var6;
        int var7;
        int var8;
        int var9;
        if (this.anInt2827 != var4) {
          this.anInt2827 = var4;
          if (-1 > ~this.anInt2754 && this.anInt2787 < var4) {
            var6 = this.anInt2754 * this.anInt2754 / (2 * var3.anInt387);
            var7 = -this.anInt2787 + var4;
            if (var6 <= var7) {
              this.aBoolean2807 = true;
              this.anInt2804 = (var4 + this.anInt2787 - var6) / 2;
              var8 = var3.anInt370 * var3.anInt370 / (var3.anInt387 * 2);
              var9 = -var8 + var4;
              if (this.anInt2804 < var9) {
                this.anInt2804 = var9;
              }
            } else {
              this.aBoolean2807 = false;
            }
          } else if (-1 < ~this.anInt2754 && ~this.anInt2787 < ~var4) {
            var6 = this.anInt2754 * this.anInt2754 / (var3.anInt387 * 2);
            var7 = var4 - this.anInt2787;
            if (var7 >= var6) {
              this.aBoolean2807 = true;
              this.anInt2804 = (this.anInt2787 + var6 - -var4) / 2;
              var8 = var3.anInt370 * var3.anInt370 / (2 * var3.anInt387);
              var9 = var8 + var4;
              if (this.anInt2804 > var9) {
                this.anInt2804 = var9;
              }
            } else {
              this.aBoolean2807 = false;
            }
          } else {
            this.aBoolean2807 = false;
          }
        }

        if (~this.anInt2754 != -1) {
          if (this.anInt2754 > 0) {
            if (~this.anInt2787 <= ~this.anInt2804) {
              this.aBoolean2807 = false;
            }

            if (!this.aBoolean2807) {
              this.anInt2754 -= var3.anInt387;
              if (-1 < ~this.anInt2754) {
                this.anInt2754 = 0;
              }
            } else if (var3.anInt370 > this.anInt2754) {
              this.anInt2754 += var3.anInt387;
            }
          } else {
            if (~this.anInt2804 <= ~this.anInt2787) {
              this.aBoolean2807 = false;
            }

            if (this.aBoolean2807) {
              if (~this.anInt2754 < ~(-var3.anInt370)) {
                this.anInt2754 -= var3.anInt387;
              }
            } else {
              this.anInt2754 += var3.anInt387;
              if (this.anInt2754 > 0) {
                this.anInt2754 = 0;
              }
            }
          }
        } else {
          var6 = -this.anInt2787 + this.anInt2827;
          if (-var3.anInt387 < var6 && ~var3.anInt387 < ~var6) {
            this.anInt2787 = this.anInt2827;
          } else {
            this.aBoolean2807 = true;
            var7 = var3.anInt370 * var3.anInt370 / (var3.anInt387 * 2);
            this.anInt2804 = (this.anInt2827 + this.anInt2787) / 2;
            if (var6 >= 0) {
              var8 = -var7 + this.anInt2827;
              this.anInt2754 = var3.anInt387;
              if (~var8 < ~this.anInt2804) {
                this.anInt2804 = var8;
              }
            } else {
              this.anInt2754 = -var3.anInt387;
              var8 = var7 + this.anInt2827;
              if (~this.anInt2804 < ~var8) {
                this.anInt2804 = var8;
              }
            }
          }
        }

        this.anInt2787 += this.anInt2754;
        if (~this.anInt2787 != -1) {
          var6 = (this.anInt2787 & '\ufff1') >> 5;
          var7 = var1.getMinimumY() / 2;
          var1.method1897(0, -var7, 0);
          var1.method1886(var6);
          var1.method1897(0, var7, 0);
        }

        if (var5 != this.anInt2766) {
          this.anInt2766 = var5;
          if (-1 > ~this.anInt2830 && this.anInt2834 < var5) {
            var6 = this.anInt2830 * this.anInt2830 / (2 * var3.anInt403);
            var7 = -this.anInt2834 + var5;
            if (var6 > var7) {
              this.aBoolean2783 = false;
            } else {
              this.anInt2757 = (-var6 + this.anInt2834 + var5) / 2;
              this.aBoolean2783 = true;
              var8 = var3.anInt399 * var3.anInt399 / (2 * var3.anInt403);
              var9 = var5 + -var8;
              if (~this.anInt2757 > ~var9) {
                this.anInt2757 = var9;
              }
            }
          } else if (-1 < ~this.anInt2830 && this.anInt2834 > var5) {
            var7 = -this.anInt2834 + var5;
            var6 = this.anInt2830 * this.anInt2830 / (2 * var3.anInt403);
            if (var7 >= var6) {
              this.anInt2757 = (var6 + this.anInt2834 - -var5) / 2;
              this.aBoolean2783 = true;
              var8 = var3.anInt399 * var3.anInt399 / (2 * var3.anInt403);
              var9 = var8 + var5;
              if (var9 < this.anInt2757) {
                this.anInt2757 = var9;
              }
            } else {
              this.aBoolean2783 = false;
            }
          } else {
            this.aBoolean2783 = false;
          }
        }

        if (~this.anInt2830 != -1) {
          if (-1 > ~this.anInt2830) {
            if (~this.anInt2834 <= ~this.anInt2757) {
              this.aBoolean2783 = false;
            }

            if (this.aBoolean2783) {
              if (~this.anInt2830 > ~var3.anInt399) {
                this.anInt2830 += var3.anInt403;
              }
            } else {
              this.anInt2830 -= var3.anInt403;
              if (0 > this.anInt2830) {
                this.anInt2830 = 0;
              }
            }
          } else {
            if (this.anInt2757 >= this.anInt2834) {
              this.aBoolean2783 = false;
            }

            if (this.aBoolean2783) {
              if (~(-var3.anInt399) > ~this.anInt2830) {
                this.anInt2830 -= var3.anInt403;
              }
            } else {
              this.anInt2830 += var3.anInt403;
              if (0 < this.anInt2830) {
                this.anInt2830 = 0;
              }
            }
          }
        } else {
          var6 = -this.anInt2834 + this.anInt2766;
          if (~var6 < ~(-var3.anInt403) && var3.anInt403 > var6) {
            this.anInt2834 = this.anInt2766;
          } else {
            this.anInt2757 = (this.anInt2766 + this.anInt2834) / 2;
            this.aBoolean2783 = true;
            var7 = var3.anInt399 * var3.anInt399 / (2 * var3.anInt403);
            if (-1 < ~var6) {
              this.anInt2830 = -var3.anInt403;
              var8 = var7 + this.anInt2766;
              if (this.anInt2757 > var8) {
                this.anInt2757 = var8;
              }
            } else {
              this.anInt2830 = var3.anInt403;
              var8 = -var7 + this.anInt2766;
              if (~this.anInt2757 > ~var8) {
                this.anInt2757 = var8;
              }
            }
          }
        }

        this.anInt2834 += this.anInt2830;
        if (-1 != ~this.anInt2834) {
          var6 = (this.anInt2834 & '\uffe6') >> 5;
          var7 = var1.getMinimumY() / 2;
          var1.method1897(0, -var7, 0);
          var1.method1896(var6);
          var1.method1897(0, var7, 0);
        }
      }

    } catch (RuntimeException var10) {
      throw AbstractGameWorld.cascadeException(var10,
        "fe.A(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
    }
  }

  abstract int getRenderAnimationId();

  final void method1973(int var1) {
    try {
      if (var1 < -75) {
        this.anInt2816 = 0;
        this.anInt2811 = 0;
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "fe.I(" + var1 + ')');
    }
  }

  final int method1975(int var1) {
    try {
      return var1 != 27855 ? 107 : (this.anInt2820 != -32768 ? -this.anInt2820 : 200);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "fe.F(" + var1 + ')');
    }
  }

  final void method1976(int var1, int var2) {
    try {
      this.size = var1;
      if (var2 != 2) {
        this.aBoolean2807 = false;
      }

    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "fe.C(" + var1 + ',' + var2 + ')');
    }
  }

  int getSize() {
    try {
      return this.size;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "fe.H()");
    }
  }

  public static void method1974(byte var0) {
    try {
      if (var0 > -101) {
        aClass3_Sub28_Sub16Array2839 = null;
      }

      aClass54Array2841 = null;
      aClass94_2765 = null;
      aClass93_2792 = null;
      aClass3_Sub28_Sub16Array2839 = null;
      quady1 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "fe.K(" + var0 + ')');
    }
  }

}
