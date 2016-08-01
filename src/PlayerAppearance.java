final class PlayerAppearance {

  static GameString aClass94_852 = SpawnedGameObject.createString("(U4");
  static GameString aClass94_853 = SpawnedGameObject.createString("::tele ");
  static GameString COMMAND_WM0 = SpawnedGameObject.createString("::wm0");
  static int[] anIntArray859;
  static int[] anIntArray861;
  int npcId;
  boolean aBoolean864;
  private long aLong855;
  private int[] anIntArray857;
  private int anInt858;
  private long aLong860;
  private int[] anIntArray862;
  private int[][] anIntArrayArray863;

  static final void method1160(int var0, int var1) {
    try {
      if (ComponentCanvas.method57(var1, 104)) {
        if (var0 > -100) {
          method1168(52);
        }

        MouseRecorder.method1260(23206, -1, SceneNode.aClass11ArrayArray1834[var1]);
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "hh.B(" + var0 + ',' + var1 + ')');
    }
  }

  static final boolean method1166(int var0, byte var1, int var2, int var3, int var4, int var5,
                                  int var6, int var7, int var8, int var9, int var10, boolean var11,
                                  int var12) {
    try {
      int var13;
      int var14;
      for (var13 = 0; ~var13 > -105; ++var13) {
        for (var14 = 0; var14 < 104; ++var14) {
          DummyClass51.anIntArrayArray1160[var13][var14] = 0;
          TriChromaticImageCache.anIntArrayArray1373[var13][var14] = 99999999;
        }
      }

      var13 = var9;
      var14 = var12;
      DummyClass51.anIntArrayArray1160[var9][var12] = 99;
      TriChromaticImageCache.anIntArrayArray1373[var9][var12] = 0;
      byte var15 = 0;
      if (var1 != 34) {
        return true;
      } else {
        TextureSampler38.anIntArray3456[var15] = var9;
        int var28 = var15 + 1;
        DummyClass38.anIntArray729[var15] = var12;
        int var16 = 0;
        boolean var17 = false;
        int[][] var18 =
          BlockConfig.collisionMaps[GameWorldSomething.currentPlane].anIntArrayArray1304;

        int var19;
        int var20;
        label410:
        while (~var16 != ~var28) {
          var13 = TextureSampler38.anIntArray3456[var16];
          var14 = DummyClass38.anIntArray729[var16];
          var16 = 1 + var16 & 4095;
          if (~var6 == ~var13 && ~var14 == ~var0) {
            var17 = true;
            break;
          }

          if (0 != var7) {
            if ((var7 < 5 || 10 == var7)
              && BlockConfig.collisionMaps[GameWorldSomething.currentPlane]
              .method1488(var0, var13, false, var14, var6, var7 + -1, var5, var4)) {
              var17 = true;
              break;
            }

            if (var7 < 10 && BlockConfig.collisionMaps[GameWorldSomething.currentPlane]
              .method1492(var0, -1 + var7, var6, var14, var5, var4, var13, 95)) {
              var17 = true;
              break;
            }
          }

          if (var2 != 0 && -1 != ~var10
            && BlockConfig.collisionMaps[GameWorldSomething.currentPlane]
            .method1498(true, var6, var14, var13, var5, var2, var8, var0, var10)) {
            var17 = true;
            break;
          }

          var19 = 1 + TriChromaticImageCache.anIntArrayArray1373[var13][var14];
          if (var13 > 0 && DummyClass51.anIntArrayArray1160[-1 + var13][var14] == 0
            && (var18[var13 + -1][var14] & 19661070) == 0 && 0 == (19661112 & var18[-1 + var13][-1
            + var5 + var14])) {
            var20 = 1;

            while (true) {
              if (-1 + var5 <= var20) {
                TextureSampler38.anIntArray3456[var28] = -1 + var13;
                DummyClass38.anIntArray729[var28] = var14;
                DummyClass51.anIntArrayArray1160[-1 + var13][var14] = 2;
                var28 = 4095 & 1 + var28;
                TriChromaticImageCache.anIntArrayArray1373[var13 + -1][var14] = var19;
                break;
              }

              if (-1 != ~(19661118 & var18[-1 + var13][var14 + var20])) {
                break;
              }

              ++var20;
            }
          }

          if (-103 < ~var13 && ~DummyClass51.anIntArrayArray1160[1 + var13][var14] == -1
            && (19661187 & var18[var13 + var5][var14]) == 0
            && ~(19661280 & var18[var5 + var13][var14 + var5 + -1]) == -1) {
            var20 = 1;

            while (true) {
              if (var20 >= -1 + var5) {
                TextureSampler38.anIntArray3456[var28] = var13 + 1;
                DummyClass38.anIntArray729[var28] = var14;
                DummyClass51.anIntArrayArray1160[var13 + 1][var14] = 8;
                TriChromaticImageCache.anIntArrayArray1373[var13 + 1][var14] = var19;
                var28 = 4095 & var28 - -1;
                break;
              }

              if (~(var18[var5 + var13][var14 + var20] & 19661283) != -1) {
                break;
              }

              ++var20;
            }
          }

          if (-1 > ~var14 && 0 == DummyClass51.anIntArrayArray1160[var13][-1 + var14]
            && (19661070 & var18[var13][-1 + var14]) == 0 && 0 == (19661187 & var18[-1 + var5
            + var13][var14 + -1])) {
            var20 = 1;

            while (true) {
              if (-1 + var5 <= var20) {
                TextureSampler38.anIntArray3456[var28] = var13;
                DummyClass38.anIntArray729[var28] = -1 + var14;
                DummyClass51.anIntArrayArray1160[var13][-1 + var14] = 1;
                var28 = 4095 & 1 + var28;
                TriChromaticImageCache.anIntArrayArray1373[var13][-1 + var14] = var19;
                break;
              }

              if ((var18[var13 + var20][var14 + -1] & 19661199) != 0) {
                break;
              }

              ++var20;
            }
          }

          if (102 > var14 && ~DummyClass51.anIntArrayArray1160[var13][1 + var14] == -1
            && ~(var18[var13][var14 + var5] & 19661112) == -1 && -1 == ~(19661280 & var18[-1 + var13
            + var5][var5 + var14])) {
            var20 = 1;

            while (true) {
              if (~var20 <= ~(var5 + -1)) {
                TextureSampler38.anIntArray3456[var28] = var13;
                DummyClass38.anIntArray729[var28] = var14 + 1;
                DummyClass51.anIntArrayArray1160[var13][1 + var14] = 4;
                TriChromaticImageCache.anIntArrayArray1373[var13][1 + var14] = var19;
                var28 = 4095 & var28 + 1;
                break;
              }

              if (-1 != ~(19661304 & var18[var13 - -var20][var5 + var14])) {
                break;
              }

              ++var20;
            }
          }

          if (var13 > 0 && -1 > ~var14 && -1 == ~DummyClass51.anIntArrayArray1160[var13 + -1][var14
            + -1] && ~(var18[var13 + -1][-1 + var5 + -1 + var14] & 19661112) == -1 && 0 == (19661070
            & var18[-1 + var13][var14 - 1])
            && ~(var18[var5 + -1 + (var13 - 1)][-1 + var14] & 19661187) == -1) {
            var20 = 1;

            while (true) {
              if (var5 - 1 <= var20) {
                TextureSampler38.anIntArray3456[var28] = var13 - 1;
                DummyClass38.anIntArray729[var28] = -1 + var14;
                var28 = 4095 & var28 + 1;
                DummyClass51.anIntArrayArray1160[var13 + -1][-1 + var14] = 3;
                TriChromaticImageCache.anIntArrayArray1373[-1 + var13][var14 + -1] = var19;
                break;
              }

              if ((var18[var13 - 1][var14 - 1 + var20] & 19661118) != 0 || 0 != (19661199 & var18[
                var20 + -1 + var13][-1 + var14])) {
                break;
              }

              ++var20;
            }
          }

          if (102 > var13 && ~var14 < -1 && -1 == ~DummyClass51.anIntArrayArray1160[1 + var13][-1
            + var14] && -1 == ~(19661070 & var18[1 + var13][-1 + var14])
            && (var18[var5 + var13][-1 + var14] & 19661187) == 0
            && (var18[var13 - -var5][-1 + var14 + var5 + -1] & 19661280) == 0) {
            var20 = 1;

            while (true) {
              if (~var20 <= ~(-1 + var5)) {
                TextureSampler38.anIntArray3456[var28] = 1 + var13;
                DummyClass38.anIntArray729[var28] = -1 + var14;
                var28 = 1 + var28 & 4095;
                DummyClass51.anIntArrayArray1160[var13 - -1][-1 + var14] = 9;
                TriChromaticImageCache.anIntArrayArray1373[1 + var13][-1 + var14] = var19;
                break;
              }

              if (-1 != ~(19661283 & var18[var13 + var5][var14 - (1 + -var20)])
                || ~(19661199 & var18[var20 + (var13 - -1)][-1 + var14]) != -1) {
                break;
              }

              ++var20;
            }
          }

          if (~var13 < -1 && 102 > var14 && -1 == ~DummyClass51.anIntArrayArray1160[-1 + var13][
            var14 - -1] && 0 == (19661070 & var18[var13 - 1][1 + var14])
            && (19661112 & var18[-1 + var13][var14 + var5]) == 0 && 0 == (19661280 & var18[var13][
            var14 + var5])) {
            var20 = 1;

            while (true) {
              if (-1 + var5 <= var20) {
                TextureSampler38.anIntArray3456[var28] = var13 - 1;
                DummyClass38.anIntArray729[var28] = var14 + 1;
                var28 = 4095 & var28 - -1;
                DummyClass51.anIntArrayArray1160[-1 + var13][1 + var14] = 6;
                TriChromaticImageCache.anIntArrayArray1373[-1 + var13][1 + var14] = var19;
                break;
              }

              if ((var18[var13 - 1][var14 - -1 - -var20] & 19661118) != 0
                || ~(var18[var20 + -1 + var13][var5 + var14] & 19661304) != -1) {
                break;
              }

              ++var20;
            }
          }

          if (~var13 > -103 && -103 < ~var14
            && DummyClass51.anIntArrayArray1160[var13 - -1][1 + var14] == 0 && 0 == (19661112
            & var18[var13 + 1][var14 + var5]) && 0 == (var18[var13 - -var5][var14 + var5]
            & 19661280) && ~(19661187 & var18[var5 + var13][1 + var14]) == -1) {
            for (var20 = 1; var20 < -1 + var5; ++var20) {
              if (-1 != ~(var18[var20 + var13 - -1][var14 - -var5] & 19661304) || 0 != (
                var18[var5 + var13][var20 + (var14 - -1)] & 19661283)) {
                continue label410;
              }
            }

            TextureSampler38.anIntArray3456[var28] = 1 + var13;
            DummyClass38.anIntArray729[var28] = var14 - -1;
            DummyClass51.anIntArrayArray1160[1 + var13][1 + var14] = 12;
            TriChromaticImageCache.anIntArrayArray1373[1 + var13][1 + var14] = var19;
            var28 = 1 + var28 & 4095;
          }
        }

        AbstractFrameRegulator.anInt1692 = 0;
        if (!var17) {
          if (!var11) {
            return false;
          }

          var19 = 1000;
          var20 = 100;
          byte var21 = 10;

          for (int var22 = var6 - var21; var22 <= var21 + var6; ++var22) {
            for (int var23 = -var21 + var0; ~var23 >= ~(var0 - -var21); ++var23) {
              if (var22 >= 0 && -1 >= ~var23 && ~var22 > -105 && ~var23 > -105
                && -101 < ~TriChromaticImageCache.anIntArrayArray1373[var22][var23]) {
                int var24 = 0;
                if (~var6 < ~var22) {
                  var24 = -var22 + var6;
                } else if (~(var6 - (-var2 - -1)) > ~var22) {
                  var24 = -var2 + -var6 - -1 + var22;
                }

                int var25 = 0;
                if (~var23 > ~var0) {
                  var25 = -var23 + var0;
                } else if (~(var0 + var10 + -1) > ~var23) {
                  var25 = var23 + 1 + -var0 + -var10;
                }

                int var26 = var24 * var24 + var25 * var25;
                if (~var26 > ~var19 || var26 == var19
                  && ~var20 < ~TriChromaticImageCache.anIntArrayArray1373[var22][var23]) {
                  var20 = TriChromaticImageCache.anIntArrayArray1373[var22][var23];
                  var13 = var22;
                  var19 = var26;
                  var14 = var23;
                }
              }
            }
          }

          if (var19 == 1000) {
            return false;
          }

          if (~var13 == ~var9 && var12 == var14) {
            return false;
          }

          AbstractFrameRegulator.anInt1692 = 1;
        }

        byte var29 = 0;
        TextureSampler38.anIntArray3456[var29] = var13;
        var16 = var29 + 1;
        DummyClass38.anIntArray729[var29] = var14;

        for (
          var19 = var20 = DummyClass51.anIntArrayArray1160[var13][var14];
          ~var13 != ~var9 || ~var12 != ~var14;
          var19 = DummyClass51.anIntArrayArray1160[var13][var14]) {
          if (~var20 != ~var19) {
            TextureSampler38.anIntArray3456[var16] = var13;
            var20 = var19;
            DummyClass38.anIntArray729[var16++] = var14;
          }

          if (-1 == ~(2 & var19)) {
            if (0 != (8 & var19)) {
              --var13;
            }
          } else {
            ++var13;
          }

          if (~(var19 & 1) != -1) {
            ++var14;
          } else if (-1 != ~(var19 & 4)) {
            --var14;
          }
        }

        if (0 >= var16) {
          return var3 != 1;
        } else {
          TextureSampler7.method299(93, var16, var3);
          return true;
        }
      }
    } catch (RuntimeException var27) {
      throw AbstractGameWorld.cascadeException(var27,
        "hh.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6
          + ',' + var7 + ',' + var8 + ',' + var9 + ',' + var10 + ',' + var11 + ',' + var12 + ')');
    }
  }

  public static void method1168(int var0) {
    try {
      aClass94_853 = null;
      aClass94_852 = null;
      if (var0 == 8160) {
        anIntArray859 = null;
        COMMAND_WM0 = null;
        anIntArray861 = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "hh.H(" + var0 + ')');
    }
  }

  final AbstractModel method1157(int var1, int var2, int var3, int var4, AnimationSequence var5,
                                 int var6, int var7, int var8) {
    try {
      if (var8 != -2012759707) {
        this.npcId = -32;
      }

      long var9 = (long) var3 | (long) (var7 << 16) | (long) var2 << 32;
      AbstractModel var11 = (AbstractModel) HashTableIterator.aClass93_1131.get(var9);
      if (null == var11) {
        Model[] var12 = new Model[3];
        int var13 = 0;
        if (!TextureSampler20.getIdentityKit(var3, 0).method948(var8 ^ -2012744886)
          || !TextureSampler20.getIdentityKit(var7, 0).method948(18991) || !TextureSampler20
          .getIdentityKit(var2, 0).method948(18991)) {
          return null;
        }

        Model var14 = TextureSampler20.getIdentityKit(var3, 0).method941(true);
        if (null != var14) {
          var12[var13++] = var14;
        }

        var14 = TextureSampler20.getIdentityKit(var7, 0).method941(true);
        if (var14 != null) {
          var12[var13++] = var14;
        }

        var14 = TextureSampler20.getIdentityKit(var2, 0).method941(true);
        if (var14 != null) {
          var12[var13++] = var14;
        }

        var14 = new Model(var12, var13);

        for (int var15 = 0; ~var15 > -6; ++var15) {
          if (~this.anIntArray862[var15] > ~AudioWorker.aShortArrayArray344[var15].length) {
            var14.replaceColor(Inventory.aShortArray2548[var15],
              AudioWorker.aShortArrayArray344[var15][this.anIntArray862[var15]]);
          }

          if (~DummyClass55.aShortArrayArray1429[var15].length < ~this.anIntArray862[var15]) {
            var14.replaceColor(CollisionMap.aShortArray1311[var15],
              DummyClass55.aShortArrayArray1429[var15][this.anIntArray862[var15]]);
          }
        }

        var11 = var14.method2008(64, 768, -50, -10, -50);
        HashTableIterator.aClass93_1131.get((byte) -111, var11, var9);
      }

      if (null != var5) {
        var11 = var5.method2055(var11, (byte) -86, var1, var4, var6);
      }

      return var11;
    } catch (RuntimeException var16) {
      throw AbstractGameWorld.cascadeException(var16,
        "hh.J(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + (var5 != null ?
          "{...}" :
          "null") + ',' + var6 + ',' + var7 + ',' + var8 + ')');
    }
  }

  private final void method1158(int var1) {
    try {
      long var2 = this.aLong860;
      this.aLong860 = -1L;
      long[] var4 = FaceNormal.aLongArray1631;
      this.aLong860 =
        var4[(int) (255L & ((long) (this.anInt858 >> 8) ^ this.aLong860))] ^ this.aLong860 >>> 8;
      this.aLong860 =
        var4[(int) (255L & (this.aLong860 ^ (long) this.anInt858))] ^ this.aLong860 >>> 8;

      int var5;
      for (var5 = 0; 12 > var5; ++var5) {
        this.aLong860 = this.aLong860 >>> 8 ^ var4[(int) (
          (this.aLong860 ^ (long) (this.anIntArray857[var5] >> 24)) & 255L)];
        this.aLong860 =
          this.aLong860 >>> 8 ^ var4[(int) (255L & (this.aLong860 ^ (long) (this.anIntArray857[var5]
            >> 16)))];
        this.aLong860 =
          var4[(int) (255L & ((long) (this.anIntArray857[var5] >> 8) ^ this.aLong860))]
            ^ this.aLong860 >>> 8;
        this.aLong860 =
          this.aLong860 >>> 8 ^ var4[(int) ((this.aLong860 ^ (long) this.anIntArray857[var5])
            & 255L)];
      }

      if (var1 != 459557008) {
        this.anIntArray862 = null;
      }

      for (var5 = 0; var5 < 5; ++var5) {
        this.aLong860 = var4[(int) (((long) this.anIntArray862[var5] ^ this.aLong860) & 255L)]
          ^ this.aLong860 >>> 8;
      }

      this.aLong860 = var4[(int) (((long) (this.aBoolean864 ? 1 : 0) ^ this.aLong860) & 255L)]
        ^ this.aLong860 >>> 8;
      if (-1L != ~var2 && this.aLong860 != var2) {
        Keyboard.aClass93_1911.method1518(var2, (byte) -124);
      }

    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6, "hh.K(" + var1 + ')');
    }
  }

  final void method1159(boolean var1, boolean var2) {
    try {
      if (!var2) {
        anIntArray859 = null;
      }

      this.aBoolean864 = var1;
      this.method1158(459557008);
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "hh.A(" + var1 + ',' + var2 + ')');
    }
  }

  final void update(int[] var1, int var2, boolean var3, int var4, int[] var5, int var6) {
    try {
      if (var6 != this.anInt858) {
        this.anInt858 = var6;
        this.anIntArrayArray863 = null;
      }

      if (null == var5) {
        var5 = new int[12];

        for (int var7 = 0; -9 < ~var7; ++var7) {
          for (int var8 = 0; SceneSomething.anInt497 > var8; ++var8) {
            IdentityKit var9 = TextureSampler20.getIdentityKit(var8, 0);
            if (null != var9 && !var9.aBoolean476 && ~var9.anInt466 == ~(!var3 ?
              MonoChromaticImageBuffer.anIntArray2559[var7] :
              TextureSampler4.anIntArray3228[var7])) {
              var5[DummyClass6.anIntArray2043[var7]] =
                TextureSampler3.method308(Integer.MIN_VALUE, var8);
              break;
            }
          }
        }
      }

      this.npcId = var2;
      this.aBoolean864 = var3;
      if (var4 == 0) {
        this.anIntArray862 = var1;
        this.anIntArray857 = var5;
        this.method1158(var4 + 459557008);
      }
    } catch (RuntimeException var10) {
      throw AbstractGameWorld.cascadeException(var10,
        "hh.G(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ',' + (
          var5 != null ?
            "{...}" :
            "null") + ',' + var6 + ')');
    }
  }

  final void method1162(int var1, boolean var2, int var3) {
    try {
      this.anIntArray862[var1] = var3;
      this.method1158(459557008);
      if (var2) {
        this.method1159(false, false);
      }

    } catch (RuntimeException var5) {
      throw AbstractGameWorld
        .cascadeException(var5, "hh.L(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  final int method1163(int var1) {
    try {
      if (var1 != -24861) {
        anIntArray859 = null;
      }

      return this.npcId != -1 ?
        305419896 + SubNode.getNpcConfiguration(this.npcId).anInt1284 :
        (this.anIntArray857[8] << 10) + ((this.anIntArray862[0] << 25) - -(this.anIntArray862[4]
          << 20)) - (-(this.anIntArray857[0] << 15) - ((this.anIntArray857[11] << 5)
          + this.anIntArray857[1]));
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "hh.E(" + var1 + ')');
    }
  }

  final void method1164(int var1, int var2, int var3) {
    try {
      int var4 = DummyClass6.anIntArray2043[var1];
      if (-1 != ~this.anIntArray857[var4]) {
        if (TextureSampler20.getIdentityKit(var2, var3) != null) {
          this.anIntArray857[var4] = TextureSampler3.method308(var2, Integer.MIN_VALUE);
          this.method1158(459557008);
        }
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld
        .cascadeException(var5, "hh.I(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  final AbstractModel method1165(Unsure[] var1, int var2, AnimationSequence var3,
                                 AnimationSequence var4, int var5, int var6, int var7, int var8,
                                 boolean var9, int var10, int var11) {
    try {
      int var12 = 102 % ((var7 - -39) / 61);
      if (0 != ~this.npcId) {
        return SubNode.getNpcConfiguration(this.npcId)
          .method1476(var1, var6, (byte) -128, var11, var2, var8, var10, var3, var5, var4);
      } else {
        int[] var15 = this.anIntArray857;
        long var13 = this.aLong860;
        if (var4 != null && (~var4.anInt1854 <= -1 || ~var4.anInt1849 <= -1)) {
          var15 = new int[12];

          for (int var16 = 0; 12 > var16; ++var16) {
            var15[var16] = this.anIntArray857[var16];
          }

          if (0 <= var4.anInt1854) {
            if (-65536 == ~var4.anInt1854) {
              var13 ^= -4294967296L;
              var15[5] = 0;
            } else {
              var15[5] = TextureSampler3.method308(1073741824, var4.anInt1854);
              var13 ^= (long) var15[5] << 32;
            }
          }

          if (~var4.anInt1849 <= -1) {
            if (-65536 != ~var4.anInt1849) {
              var15[3] = TextureSampler3.method308(1073741824, var4.anInt1849);
              var13 ^= (long) var15[3];
            } else {
              var15[3] = 0;
              var13 ^= 4294967295L;
            }
          }
        }

        AbstractModel var37 = (AbstractModel) Keyboard.aClass93_1911.get(var13);
        boolean var17;
        int var23;
        int var22;
        int var25;
        int var24;
        int var26;
        int var29;
        int var28;
        int var34;
        int var32;
        int var33;
        int var45;
        if (var37 == null) {
          var17 = false;

          int var19;
          for (int var18 = 0; -13 < ~var18; ++var18) {
            var19 = var15[var18];
            if (~(var19 & 1073741824) != -1) {
              if (!DummyClass35.getItemConfig(1073741823 & var19, (byte) 92)
                .method1108((byte) 95, this.aBoolean864)) {
                var17 = true;
              }
            } else if (~(var19 & Integer.MIN_VALUE) != -1 && !TextureSampler20
              .getIdentityKit(1073741823 & var19, 0).method942(101)) {
              var17 = true;
            }
          }

          if (var17) {
            if (this.aLong855 != -1L) {
              var37 = (AbstractModel) Keyboard.aClass93_1911.get(this.aLong855);
            }

            if (null == var37) {
              return null;
            }
          }

          if (null == var37) {
            Model[] var39 = new Model[12];

            int var20;
            for (var19 = 0; ~var19 > -13; ++var19) {
              var20 = var15[var19];
              Model var21;
              if (~(var20 & 1073741824) == -1) {
                if (-1 != ~(Integer.MIN_VALUE & var20)) {
                  var21 =
                    TextureSampler20.getIdentityKit(var20 & 1073741823, 0).method947((byte) -26);
                  if (null != var21) {
                    var39[var19] = var21;
                  }
                }
              } else {
                var21 = DummyClass35.getItemConfig(var20 & 1073741823, (byte) 115)
                  .method1117(this.aBoolean864, 80);
                if (null != var21) {
                  var39[var19] = var21;
                }
              }
            }

            RenderAnimation var40 = null;
            if (this.anInt858 != -1) {
              var40 = StringNode0.getRenderAnimation(false, this.anInt858);
            }

            if (var40 != null && null != var40.anIntArrayArray359) {
              for (var20 = 0; var20 < var40.anIntArrayArray359.length; ++var20) {
                if (null != var40.anIntArrayArray359[var20] && null != var39[var20]) {
                  var45 = var40.anIntArrayArray359[var20][0];
                  var22 = var40.anIntArrayArray359[var20][1];
                  var23 = var40.anIntArrayArray359[var20][2];
                  var25 = var40.anIntArrayArray359[var20][4];
                  var24 = var40.anIntArrayArray359[var20][3];
                  var26 = var40.anIntArrayArray359[var20][5];
                  if (null == this.anIntArrayArray863) {
                    this.anIntArrayArray863 = new int[var40.anIntArrayArray359.length][];
                  }

                  if (this.anIntArrayArray863[var20] == null) {
                    int[] var27 = this.anIntArrayArray863[var20] = new int[15];
                    if (~var24 == -1 && -1 == ~var25 && var26 == 0) {
                      var27[12] = -var45;
                      var27[13] = -var22;
                      var27[0] = var27[4] = var27[8] = '\u8000';
                      var27[14] = -var23;
                    } else {
                      var28 = DummyClass40.COSINE_TABLE[var24] >> 1;
                      var29 = DummyClass40.SINE_TABLE[var24] >> 1;
                      int var30 = DummyClass40.COSINE_TABLE[var25] >> 1;
                      int var31 = DummyClass40.SINE_TABLE[var25] >> 1;
                      var32 = DummyClass40.COSINE_TABLE[var26] >> 1;
                      var33 = DummyClass40.SINE_TABLE[var26] >> 1;
                      var27[4] = var28 * var32 + 16384 >> 15;
                      var27[5] = -var29;
                      var27[3] = 16384 + var33 * var28 >> 15;
                      var27[2] = 16384 + var28 * var31 >> 15;
                      var27[8] = var30 * var28 - -16384 >> 15;
                      int var35 = 16384 + var33 * var29 >> 15;
                      var27[0] = var31 * var35 + var32 * var30 - -16384 >> 15;
                      var27[14] =
                        16384 + var27[8] * -var23 + -var22 * var27[5] + var27[2] * -var45 >> 15;
                      var27[6] = var30 * var35 + (var32 * -var31 - -16384) >> 15;
                      var34 = 16384 + var32 * var29 >> 15;
                      var27[7] = 16384 + -var33 * -var31 + var34 * var30 >> 15;
                      var27[1] = var31 * var34 + (var30 * -var33 - -16384) >> 15;
                      var27[12] =
                        -var22 * var27[3] + var27[0] * -var45 + -var23 * var27[6] - -16384 >> 15;
                      var27[13] =
                        16384 + -var22 * var27[4] + var27[1] * -var45 + -var23 * var27[7] >> 15;
                    }

                    var27[9] = var45;
                    var27[11] = var23;
                    var27[10] = var22;
                  }

                  if (0 != var24 || ~var25 != -1 || ~var26 != -1) {
                    var39[var20].rotate(var24, var25, var26);
                  }

                  if (var45 != 0 || 0 != var22 || 0 != var23) {
                    var39[var20].translate(var45, var22, var23);
                  }
                }
              }
            }

            Model var43 = new Model(var39, var39.length);

            for (var45 = 0; 5 > var45; ++var45) {
              if (AudioWorker.aShortArrayArray344[var45].length > this.anIntArray862[var45]) {
                var43.replaceColor(Inventory.aShortArray2548[var45],
                  AudioWorker.aShortArrayArray344[var45][this.anIntArray862[var45]]);
              }

              if (DummyClass55.aShortArrayArray1429[var45].length > this.anIntArray862[var45]) {
                var43.replaceColor(CollisionMap.aShortArray1311[var45],
                  DummyClass55.aShortArrayArray1429[var45][this.anIntArray862[var45]]);
              }
            }

            var37 = var43.method2008(64, 850, -30, -50, -30);
            if (GlRenderer.useOpenGlRenderer) {
              ((GlModel) var37).method1920(false, false, true, true, false, false, true);
            }

            if (var9) {
              Keyboard.aClass93_1911.get((byte) -115, var37, var13);
              this.aLong855 = var13;
            }
          }
        }

        var17 = false;
        boolean var38 = false;
        var45 = var1 != null ? var1.length : 0;
        boolean var42 = false;
        boolean var44 = false;

        int var47;
        for (var22 = 0; ~var45 < ~var22; ++var22) {
          if (var1[var22] != null) {
            AnimationSequence var41 = GameClient.method45(var1[var22].anInt1890, (byte) -20);
            if (var41.anIntArray1851 != null) {
              var17 = true;
              DummyClass24.aClass142Array1654[var22] = var41;
              var24 = var1[var22].anInt1893;
              var25 = var1[var22].anInt1891;
              var26 = var41.anIntArray1851[var24];
              SomethingIndex150.aClass3_Sub28_Sub5Array2070[var22] =
                AreaSoundEffect.method133(var26 >>> 16, 0);
              var26 &= '\uffff';
              SceneNode.anIntArray1833[var22] = var26;
              if (SomethingIndex150.aClass3_Sub28_Sub5Array2070[var22] != null) {
                var42 |= SomethingIndex150.aClass3_Sub28_Sub5Array2070[var22].method561(var26, (byte) 119);
                var38 |= SomethingIndex150.aClass3_Sub28_Sub5Array2070[var22].method559(1317095745, var26);
                var44 |= var41.aBoolean1848;
              }

              if ((var41.tween || MonoChromaticImageBuffer.tweening) && 0 != ~var25
                && var25 < var41.anIntArray1851.length) {
                DummyClass14.anIntArray1960[var22] = var41.anIntArray1869[var24];
                TextureSampler1.anIntArray3139[var22] = var1[var22].anInt1897;
                var47 = var41.anIntArray1851[var25];
                AbstractSomethingTexture.aClass3_Sub28_Sub5Array1103[var22] =
                  AreaSoundEffect.method133(var47 >>> 16, 0);
                var47 &= '\uffff';
                DummyClass2.anIntArray1679[var22] = var47;
                if (null != AbstractSomethingTexture.aClass3_Sub28_Sub5Array1103[var22]) {
                  var42 |= AbstractSomethingTexture.aClass3_Sub28_Sub5Array1103[var22]
                    .method561(var47, (byte) 117);
                  var38 |= AbstractSomethingTexture.aClass3_Sub28_Sub5Array1103[var22]
                    .method559(1317095745, var47);
                }
              } else {
                DummyClass14.anIntArray1960[var22] = 0;
                TextureSampler1.anIntArray3139[var22] = 0;
                AbstractSomethingTexture.aClass3_Sub28_Sub5Array1103[var22] = null;
                DummyClass2.anIntArray1679[var22] = -1;
              }
            }
          }
        }

        if (!var17 && null == var4 && null == var3) {
          return var37;
        } else {
          var22 = -1;
          var23 = -1;
          var24 = 0;
          AnimationSomething var48 = null;
          AnimationSomething var46 = null;
          if (null != var4) {
            var22 = var4.anIntArray1851[var10];
            var47 = var22 >>> 16;
            var46 = AreaSoundEffect.method133(var47, 0);
            var22 &= '\uffff';
            if (var46 != null) {
              var42 |= var46.method561(var22, (byte) 124);
              var38 |= var46.method559(1317095745, var22);
              var44 |= var4.aBoolean1848;
            }

            if ((var4.tween || MonoChromaticImageBuffer.tweening) && var2 != -1
              && var4.anIntArray1851.length > var2) {
              var23 = var4.anIntArray1851[var2];
              var28 = var23 >>> 16;
              var23 &= '\uffff';
              var24 = var4.anIntArray1869[var10];
              if (~var47 != ~var28) {
                var48 = AreaSoundEffect.method133(var23 >>> 16, 0);
              } else {
                var48 = var46;
              }

              if (null != var48) {
                var42 |= var48.method561(var23, (byte) 122);
                var38 |= var48.method559(1317095745, var23);
              }
            }
          }

          var47 = -1;
          var28 = -1;
          AnimationSomething var49 = null;
          AnimationSomething var50 = null;
          var29 = 0;
          if (var3 != null) {
            var47 = var3.anIntArray1851[var11];
            var32 = var47 >>> 16;
            var47 &= '\uffff';
            var49 = AreaSoundEffect.method133(var32, 0);
            if (null != var49) {
              var42 |= var49.method561(var47, (byte) 123);
              var38 |= var49.method559(1317095745, var47);
              var44 |= var3.aBoolean1848;
            }

            if ((var3.tween || MonoChromaticImageBuffer.tweening) && 0 != ~var6
              && var3.anIntArray1851.length > var6) {
              var29 = var3.anIntArray1869[var11];
              var28 = var3.anIntArray1851[var6];
              var33 = var28 >>> 16;
              var28 &= '\uffff';
              if (~var32 != ~var33) {
                var50 = AreaSoundEffect.method133(var28 >>> 16, 0);
              } else {
                var50 = var49;
              }

              if (null != var50) {
                var42 |= var50.method561(var28, (byte) 122);
                var38 |= var50.method559(1317095745, var28);
              }
            }
          }

          AbstractModel var51 = var37.method1894(!var38, !var42, !var44);
          var33 = 0;

          for (var34 = 1; var33 < var45; var34 <<= 1) {
            if (SomethingIndex150.aClass3_Sub28_Sub5Array2070[var33] != null) {
              var51.method1887(SomethingIndex150.aClass3_Sub28_Sub5Array2070[var33],
                SceneNode.anIntArray1833[var33],
                AbstractSomethingTexture.aClass3_Sub28_Sub5Array1103[var33],
                DummyClass2.anIntArray1679[var33], TextureSampler1.anIntArray3139[var33] + -1,
                DummyClass14.anIntArray1960[var33], var34,
                DummyClass24.aClass142Array1654[var33].aBoolean1848,
                this.anIntArrayArray863[var33]);
            }

            ++var33;
          }

          if (null != var46 && null != var49) {
            var51
              .method1892(var46, var22, var48, var23, var8 - 1, var24, var49, var47, var50, var28,
                var5 + -1, var29, var4.aBooleanArray1855, var4.aBoolean1848 | var3.aBoolean1848);
          } else if (var46 == null) {
            if (null != var49) {
              var51.method1880(var49, var47, var50, var28, var5 - 1, var29, var3.aBoolean1848);
            }
          } else {
            var51.method1880(var46, var22, var48, var23, var8 + -1, var24, var4.aBoolean1848);
          }

          for (var33 = 0; var33 < var45; ++var33) {
            SomethingIndex150.aClass3_Sub28_Sub5Array2070[var33] = null;
            AbstractSomethingTexture.aClass3_Sub28_Sub5Array1103[var33] = null;
            DummyClass24.aClass142Array1654[var33] = null;
          }

          return var51;
        }
      }
    } catch (RuntimeException var36) {
      throw AbstractGameWorld.cascadeException(var36,
        "hh.D(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + (var3 != null ?
          "{...}" :
          "null") + ',' + (var4 != null ? "{...}" : "null") + ',' + var5 + ',' + var6 + ',' + var7
          + ',' + var8 + ',' + var9 + ',' + var10 + ',' + var11 + ')');
    }
  }

  final AbstractModel method1167(int var1, byte var2, AnimationSequence var3, int var4, int var5) {
    try {
      if (0 == ~this.npcId) {
        AbstractModel var6 = (AbstractModel) HashTableIterator.aClass93_1131.get(this.aLong860);
        if (var2 < 122) {
          this.anIntArray862 = null;
        }

        if (var6 == null) {
          boolean var7 = false;

          int var9;
          for (int var8 = 0; var8 < 12; ++var8) {
            var9 = this.anIntArray857[var8];
            if (0 == (1073741824 & var9)) {
              if (~(var9 & Integer.MIN_VALUE) != -1 && !TextureSampler20
                .getIdentityKit(var9 & 1073741823, 0).method948(18991)) {
                var7 = true;
              }
            } else if (!DummyClass35.getItemConfig(1073741823 & var9, (byte) 127)
              .method1102(this.aBoolean864, false)) {
              var7 = true;
            }
          }

          if (var7) {
            return null;
          }

          Model[] var14 = new Model[12];
          var9 = 0;

          int var11;
          for (int var10 = 0; ~var10 > -13; ++var10) {
            var11 = this.anIntArray857[var10];
            Model var12;
            if (~(1073741824 & var11) == -1) {
              if (0 != (Integer.MIN_VALUE & var11)) {
                var12 = TextureSampler20.getIdentityKit(1073741823 & var11, 0).method941(true);
                if (null != var12) {
                  var14[var9++] = var12;
                }
              }
            } else {
              var12 = DummyClass35.getItemConfig(var11 & 1073741823, (byte) 89)
                .method1116(this.aBoolean864, (byte) -109);
              if (var12 != null) {
                var14[var9++] = var12;
              }
            }
          }

          Model var15 = new Model(var14, var9);

          for (var11 = 0; ~var11 > -6; ++var11) {
            if (~AudioWorker.aShortArrayArray344[var11].length < ~this.anIntArray862[var11]) {
              var15.replaceColor(Inventory.aShortArray2548[var11],
                AudioWorker.aShortArrayArray344[var11][this.anIntArray862[var11]]);
            }

            if (DummyClass55.aShortArrayArray1429[var11].length > this.anIntArray862[var11]) {
              var15.replaceColor(CollisionMap.aShortArray1311[var11],
                DummyClass55.aShortArrayArray1429[var11][this.anIntArray862[var11]]);
            }
          }

          var6 = var15.method2008(64, 768, -50, -10, -50);
          HashTableIterator.aClass93_1131.get((byte) -102, var6, this.aLong860);
        }

        if (var3 != null) {
          var6 = var3.method2055(var6, (byte) 120, var5, var1, var4);
        }

        return var6;
      } else {
        return SubNode.getNpcConfiguration(this.npcId).method1482(var3, var1, var5, -109, var4);
      }
    } catch (RuntimeException var13) {
      throw AbstractGameWorld.cascadeException(var13,
        "hh.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ','
          + var5 + ')');
    }
  }

}
