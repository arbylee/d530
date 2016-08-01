final class NpcConfiguration {

  static int anInt1252 = -1;
  static int[] anIntArray1277 = new int[2000];
  static GameString aClass94_1281 = SpawnedGameObject.createString("violet:");
  static GameString aClass94_1294 =
    SpawnedGameObject.createString("Votre liste noire est pleine (X100 noms maximum(Y)3");
  static int anInt1297;
  int size = 1;
  boolean aBoolean1249;
  int anInt1253;
  boolean aBoolean1255 = true;
  short aShort1256 = 0;
  GameString[] aClass94Array1259;
  int anInt1260;
  int anInt1262 = -1;
  boolean aBoolean1263;
  int anInt1265;
  byte aByte1267;
  byte defaultFaceDirection;
  int anInt1269;
  boolean aBoolean1270 = true;
  GameString aClass94_1273;
  int anInt1274;
  byte aByte1275;
  int anInt1276 = -1;
  int anInt1278;
  int anInt1279;
  int renderAnimationId;
  int anInt1283;
  int anInt1284;
  boolean aBoolean1285;
  short aShort1286;
  byte aByte1287;
  int anInt1289;
  int anInt1290;
  int anInt1291;
  int[] anIntArray1292;
  int anInt1293;
  int anInt1296;
  int anInt1298;
  private short[] aShortArray1246;
  private byte[] aByteArray1247;
  private short[] aShortArray1248;
  private int[] anIntArray1250;
  private int anInt1251;
  private short[] aShortArray1254;
  private int anInt1257;
  private int[][] anIntArrayArray1258;
  private int[][] anIntArrayArray1261;
  private int anInt1264;
  private int anInt1266;
  private short[] aShortArray1271;
  private HashTable aClass130_1272;
  private int anInt1282;
  private int[] anIntArray1288;
  private int anInt1295;


  public NpcConfiguration() {
    this.aClass94_1273 = AbstractImageProducer.aClass94_2006;
    this.anInt1260 = -1;
    this.aBoolean1285 = true;
    this.anInt1253 = -1;
    this.anInt1282 = 0;
    this.anInt1283 = -1;
    this.anInt1264 = 128;
    this.aByte1275 = -16;
    this.anInt1269 = -1;
    this.aByte1267 = 0;
    this.aBoolean1249 = true;
    this.aShort1286 = 0;
    this.anInt1289 = -1;
    this.anInt1279 = -1;
    this.anInt1251 = 0;
    this.aBoolean1263 = false;
    this.anInt1274 = 32;
    this.aClass94Array1259 = new GameString[5];
    this.anInt1293 = -1;
    this.aByte1287 = -96;
    this.defaultFaceDirection = 7;
    this.renderAnimationId = -1;
    this.anInt1296 = -1;
    this.anInt1291 = 0;
    this.anInt1266 = 128;
    this.anInt1257 = -1;
    this.anInt1290 = -1;
    this.anInt1265 = -1;
    this.anInt1278 = -1;
    this.anInt1295 = -1;
    this.anInt1298 = -1;
  }

  public static void method1473(byte var0) {
    try {
      anIntArray1277 = null;
      if (var0 != 103) {
        anInt1297 = -20;
      }

      aClass94_1294 = null;
      aClass94_1281 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "me.K(" + var0 + ')');
    }
  }

  static final void method1479(int var0, byte var1) {
    try {
      TextureSampler13.anInt3362 = -1;
      if (var1 < 5) {
        anIntArray1277 = null;
      }

      if (-38 == ~var0) {
        NPC.aFloat3979 = 3.0F;
      } else if (50 != var0) {
        if (var0 == 75) {
          NPC.aFloat3979 = 6.0F;
        } else if (var0 != 100) {
          if (var0 == 200) {
            NPC.aFloat3979 = 16.0F;
          }
        } else {
          NPC.aFloat3979 = 8.0F;
        }
      } else {
        NPC.aFloat3979 = 4.0F;
      }

      TextureSampler13.anInt3362 = -1;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "me.C(" + var0 + ',' + var1 + ')');
    }
  }

  static final void method1480(boolean var0, GameString var1, int var2) {
    try {
      short[] var3 = new short[16];
      var1 = var1.method1534();
      int var4 = 0;

      for (int var5 = 0; ~var5 > ~TextureSampler39.anInt3287; ++var5) {
        ItemConfig var6 = DummyClass35.getItemConfig(var5, (byte) 93);
        if ((!var0 || var6.aBoolean807) && var6.anInt791 == -1 && -1 == var6.anInt762
          && -1 == ~var6.anInt800 && var6.aClass94_770.method1534().indexOf(var1) != -1) {
          if (~var4 <= -251) {
            DummyClass54.aShortArray1398 = null;
            FileTable.anInt952 = -1;
            return;
          }

          if (~var4 <= ~var3.length) {
            short[] var7 = new short[2 * var3.length];

            for (int var8 = 0; var8 < var4; ++var8) {
              var7[var8] = var3[var8];
            }

            var3 = var7;
          }

          var3[var4++] = (short) var5;
        }
      }

      DummyClass54.aShortArray1398 = var3;
      Mobile.anInt2756 = 0;
      FileTable.anInt952 = var4;
      GameString[] var10 = new GameString[FileTable.anInt952];

      for (int var11 = 0; FileTable.anInt952 > var11; ++var11) {
        var10[var11] = DummyClass35.getItemConfig(var3[var11], (byte) 112).aClass94_770;
      }

      int var12 = -44 / ((45 - var2) / 33);
      TextureSampler3.method307(var10, DummyClass54.aShortArray1398, 77);
    } catch (RuntimeException var9) {
      throw AbstractGameWorld.cascadeException(var9,
        "me.J(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
    }
  }

  static final int method1484(int var0, int var1) {
    try {
      if (var0 != 64835055) {
        anIntArray1277 = null;
      }

      BitVariable var2 = ClientScriptCall.method378(var1, (byte) 127);
      int var3 = var2.id;
      int var5 = var2.high;
      int var4 = var2.low;
      int var6 = SomethingMidiFile.BIT_MASKS[var5 + -var4];
      return DummyClass5.anIntArray2985[var3] >> var4 & var6;
    } catch (RuntimeException var7) {
      throw AbstractGameWorld.cascadeException(var7, "me.B(" + var0 + ',' + var1 + ')');
    }
  }

  final NpcConfiguration method1471(byte var1) {
    try {
      int var2 = -1;
      if (~this.anInt1257 == 0) {
        if (this.anInt1295 != -1) {
          var2 = DummyClass5.anIntArray2985[this.anInt1295];
        }
      } else {
        var2 = method1484(64835055, this.anInt1257);
      }

      int var3;
      if (0 <= var2 && ~var2 > ~(-1 + this.anIntArray1292.length)
        && this.anIntArray1292[var2] != -1) {
        var3 = -24 % ((-46 - var1) / 41);
        return SubNode.getNpcConfiguration(this.anIntArray1292[var2]);
      } else {
        var3 = this.anIntArray1292[-1 + this.anIntArray1292.length];
        return ~var3 == 0 ? null : SubNode.getNpcConfiguration(var3);
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "me.G(" + var1 + ')');
    }
  }

  final boolean method1472(byte var1) {
    try {
      if (var1 != 74) {
        return true;
      } else if (null == this.anIntArray1292) {
        return true;
      } else {
        int var2 = -1;
        if (-1 == this.anInt1257) {
          if (~this.anInt1295 != 0) {
            var2 = DummyClass5.anIntArray2985[this.anInt1295];
          }
        } else {
          var2 = method1484(64835055, this.anInt1257);
        }

        if (var2 >= 0 && var2 < -1 + this.anIntArray1292.length
          && -1 != this.anIntArray1292[var2]) {
          return true;
        } else {
          int var3 = this.anIntArray1292[-1 + this.anIntArray1292.length];
          return 0 != ~var3;
        }
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "me.L(" + var1 + ')');
    }
  }

  final boolean method1474(int var1) {
    try {
      if (var1 != -1) {
        method1480(false, null, -57);
      }

      if (this.anIntArray1292 != null) {
        for (int var2 = 0; ~this.anIntArray1292.length < ~var2; ++var2) {
          if (0 != ~this.anIntArray1292[var2]) {
            NpcConfiguration var3 = SubNode.getNpcConfiguration(this.anIntArray1292[var2]);
            if (0 != ~var3.anInt1262 || 0 != ~var3.anInt1293 || var3.anInt1276 != -1) {
              return true;
            }
          }
        }

        return false;
      } else {
        return -1 != this.anInt1262 || this.anInt1293 != -1 || this.anInt1276 != -1;
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "me.E(" + var1 + ')');
    }
  }

  final int method1475(int var1, int var2, int var3) {
    try {
      if (null != this.aClass130_1272) {
        IntegerNode var4 = (IntegerNode) this.aClass130_1272.get((long) var1);
        if (var2 != -26460) {
          aClass94_1294 = null;
        }

        return var4 != null ? var4.anInt2467 : var3;
      } else {
        return var3;
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld
        .cascadeException(var5, "me.N(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  final AbstractModel method1476(Unsure[] var1, int var2, byte var3, int var4, int var5, int var6,
                                 int var7, AnimationSequence var8, int var9,
                                 AnimationSequence var10) {
    try {
      if (this.anIntArray1292 != null) {
        NpcConfiguration var33 = this.method1471((byte) 32);
        return null != var33 ?
          var33.method1476(var1, var2, (byte) -102, var4, var5, var6, var7, var8, var9, var10) :
          null;
      } else {
        AbstractModel var11 =
          (AbstractModel) ClientScriptCall.aClass93_2442.get((long) this.anInt1284);
        boolean var12;
        int var17;
        int var16;
        int var19;
        int var18;
        int var21;
        int var20;
        int var22;
        int var24;
        int var27;
        int var29;
        int var28;
        if (null == var11) {
          var12 = false;

          for (int var13 = 0; var13 < this.anIntArray1288.length; ++var13) {
            if (this.anIntArray1288[var13] != -1 && !TextureSampler31.aClass153_3173
              .method2129((byte) 102, 0, this.anIntArray1288[var13])) {
              var12 = true;
            }
          }

          if (var12) {
            return null;
          }

          Model[] var14 = new Model[this.anIntArray1288.length];

          for (int var15 = 0; ~this.anIntArray1288.length < ~var15; ++var15) {
            if (0 != ~this.anIntArray1288[var15]) {
              var14[var15] =
                Model.getModel(TextureSampler31.aClass153_3173, this.anIntArray1288[var15], 0);
              if (null != this.anIntArrayArray1261 && this.anIntArrayArray1261[var15] != null
                && var14[var15] != null) {
                var14[var15]
                  .translate(this.anIntArrayArray1261[var15][0], this.anIntArrayArray1261[var15][1],
                    this.anIntArrayArray1261[var15][2]);
              }
            }
          }

          RenderAnimation var38 = null;
          if (-1 != this.renderAnimationId) {
            var38 = StringNode0.getRenderAnimation(false, this.renderAnimationId);
          }

          if (var38 != null && null != var38.anIntArrayArray359) {
            for (var16 = 0; var16 < var38.anIntArrayArray359.length; ++var16) {
              if (var38.anIntArrayArray359[var16] != null && var14.length > var16
                && var14[var16] != null) {
                var19 = var38.anIntArrayArray359[var16][2];
                var20 = var38.anIntArrayArray359[var16][3];
                var21 = var38.anIntArrayArray359[var16][4];
                var18 = var38.anIntArrayArray359[var16][1];
                var22 = var38.anIntArrayArray359[var16][5];
                var17 = var38.anIntArrayArray359[var16][0];
                if (this.anIntArrayArray1258 == null) {
                  this.anIntArrayArray1258 = new int[var38.anIntArrayArray359.length][];
                }

                if (null == this.anIntArrayArray1258[var16]) {
                  int[] var23 = this.anIntArrayArray1258[var16] = new int[15];
                  if (var20 == 0 && var21 == 0 && var22 == 0) {
                    var23[13] = -var18;
                    var23[14] = -var19;
                    var23[0] = var23[4] = var23[8] = '\u8000';
                    var23[12] = -var17;
                  } else {
                    var24 = DummyClass40.COSINE_TABLE[var20] >> 1;
                    int var25 = DummyClass40.SINE_TABLE[var20] >> 1;
                    int var26 = DummyClass40.COSINE_TABLE[var21] >> 1;
                    var28 = DummyClass40.COSINE_TABLE[var22] >> 1;
                    var27 = DummyClass40.SINE_TABLE[var21] >> 1;
                    var29 = DummyClass40.SINE_TABLE[var22] >> 1;
                    var23[3] = var24 * var29 - -16384 >> 15;
                    var23[8] = 16384 + var24 * var26 >> 15;
                    var23[5] = -var25;
                    int var31 = 16384 + var25 * var29 >> 15;
                    int var30 = var28 * var25 + 16384 >> 15;
                    var23[1] = 16384 + -var29 * var26 - -(var30 * var27) >> 15;
                    var23[2] = 16384 + var27 * var24 >> 15;
                    var23[6] = 16384 + -var27 * var28 + var31 * var26 >> 15;
                    var23[14] =
                      16384 + var23[8] * -var19 + -var18 * var23[5] + var23[2] * -var17 >> 15;
                    var23[4] = 16384 + var24 * var28 >> 15;
                    var23[7] = 16384 + -var27 * -var29 + var30 * var26 >> 15;
                    var23[0] = var27 * var31 + var26 * var28 + 16384 >> 15;
                    var23[12] =
                      16384 + var23[6] * -var19 + var23[3] * -var18 + -var17 * var23[0] >> 15;
                    var23[13] =
                      -var19 * var23[7] + -var17 * var23[1] + (-var18 * var23[4] - -16384) >> 15;
                  }

                  var23[10] = var18;
                  var23[9] = var17;
                  var23[11] = var19;
                }

                if (-1 != ~var20 || ~var21 != -1 || var22 != 0) {
                  var14[var16].rotate(var20, var21, var22);
                }

                if (var17 != 0 || 0 != var18 || -1 != ~var19) {
                  var14[var16].translate(var17, var18, var19);
                }
              }
            }
          }

          Model var34;
          if (var14.length == 1) {
            var34 = var14[0];
          } else {
            var34 = new Model(var14, var14.length);
          }

          if (this.aShortArray1248 != null) {
            for (var16 = 0; ~this.aShortArray1248.length < ~var16; ++var16) {
              if (null != this.aByteArray1247 && ~this.aByteArray1247.length < ~var16) {
                var34.replaceColor(this.aShortArray1248[var16],
                  SceneShadowMap.aShortArray1779[this.aByteArray1247[var16] & 255]);
              } else {
                var34.replaceColor(this.aShortArray1248[var16], this.aShortArray1254[var16]);
              }
            }
          }

          if (null != this.aShortArray1271) {
            for (var16 = 0; this.aShortArray1271.length > var16; ++var16) {
              var34.replaceMaterial(this.aShortArray1271[var16], this.aShortArray1246[var16]);
            }
          }

          var11 = var34.method2008(this.anInt1251 + 64, this.anInt1282 + 850, -30, -50, -30);
          if (GlRenderer.useOpenGlRenderer) {
            ((GlModel) var11).method1920(false, false, false, true, false, false, true);
          }

          ClientScriptCall.aClass93_2442.get((byte) -90, var11, (long) this.anInt1284);
        }

        var12 = false;
        boolean var37 = false;
        boolean var35 = false;
        boolean var36 = false;
        var16 = null != var1 ? var1.length : 0;

        for (var17 = 0; ~var16 < ~var17; ++var17) {
          if (var1[var17] != null) {
            AnimationSequence var39 = GameClient.method45(var1[var17].anInt1890, (byte) -20);
            if (null != var39.anIntArray1851) {
              DummyClass52.aClass142Array1168[var17] = var39;
              var20 = var1[var17].anInt1891;
              var12 = true;
              var19 = var1[var17].anInt1893;
              var21 = var39.anIntArray1851[var19];
              TextureSampler12.aClass3_Sub28_Sub5Array3041[var17] =
                AreaSoundEffect.method133(var21 >>> 16, 0);
              var21 &= '\uffff';
              DummyClass43.anIntArray912[var17] = var21;
              if (TextureSampler12.aClass3_Sub28_Sub5Array3041[var17] != null) {
                var35 |=
                  TextureSampler12.aClass3_Sub28_Sub5Array3041[var17].method561(var21, (byte) 124);
                var37 |=
                  TextureSampler12.aClass3_Sub28_Sub5Array3041[var17].method559(1317095745, var21);
                var36 |= var39.aBoolean1848;
              }

              if ((var39.tween || MonoChromaticImageBuffer.tweening) && 0 != ~var20
                && ~var39.anIntArray1851.length < ~var20) {
                DummyClass35.anIntArray664[var17] = var39.anIntArray1869[var19];
                SubNode.anIntArray2574[var17] = var1[var17].anInt1897;
                var22 = var39.anIntArray1851[var20];
                TextureSampler18.aClass3_Sub28_Sub5Array4031[var17] =
                  AreaSoundEffect.method133(var22 >>> 16, 0);
                var22 &= '\uffff';
                BufferedFile.anIntArray574[var17] = var22;
                if (null != TextureSampler18.aClass3_Sub28_Sub5Array4031[var17]) {
                  var35 |= TextureSampler18.aClass3_Sub28_Sub5Array4031[var17]
                    .method561(var22, (byte) 124);
                  var37 |= TextureSampler18.aClass3_Sub28_Sub5Array4031[var17]
                    .method559(1317095745, var22);
                }
              } else {
                DummyClass35.anIntArray664[var17] = 0;
                SubNode.anIntArray2574[var17] = 0;
                TextureSampler18.aClass3_Sub28_Sub5Array4031[var17] = null;
                BufferedFile.anIntArray574[var17] = -1;
              }
            }
          }
        }

        if (!var12 && null == var10 && var8 == null) {
          AbstractModel var41 = var11.method1894(true, true, true);
          if (this.anInt1264 != 128 || -129 != ~this.anInt1266) {
            var41.scale(this.anInt1264, this.anInt1266, this.anInt1264);
          }

          return var41;
        } else {
          var18 = -1;
          var17 = -1;
          var19 = 0;
          AnimationSomething var40 = null;
          AnimationSomething var43 = null;
          int var42;
          if (var10 != null) {
            var17 = var10.anIntArray1851[var7];
            var22 = var17 >>> 16;
            var17 &= '\uffff';
            var40 = AreaSoundEffect.method133(var22, 0);
            if (null != var40) {
              var35 |= var40.method561(var17, (byte) 126);
              var37 |= var40.method559(1317095745, var17);
              var36 |= var10.aBoolean1848;
            }

            if ((var10.tween || MonoChromaticImageBuffer.tweening) && 0 != ~var5
              && ~var10.anIntArray1851.length < ~var5) {
              var19 = var10.anIntArray1869[var7];
              var18 = var10.anIntArray1851[var5];
              var42 = var18 >>> 16;
              var18 &= '\uffff';
              if (var22 != var42) {
                var43 = AreaSoundEffect.method133(var18 >>> 16, 0);
              } else {
                var43 = var40;
              }

              if (var43 != null) {
                var35 |= var43.method561(var18, (byte) 115);
                var37 |= var43.method559(1317095745, var18);
              }
            }
          }

          var22 = -1;
          if (var3 > -63) {
            this.method1483(79, 73, null);
          }

          var42 = -1;
          AnimationSomething var44 = null;
          var24 = 0;
          AnimationSomething var46 = null;
          if (var8 != null) {
            var22 = var8.anIntArray1851[var4];
            var27 = var22 >>> 16;
            var22 &= '\uffff';
            var44 = AreaSoundEffect.method133(var27, 0);
            if (var44 != null) {
              var35 |= var44.method561(var22, (byte) 124);
              var37 |= var44.method559(1317095745, var22);
              var36 |= var8.aBoolean1848;
            }

            if ((var8.tween || MonoChromaticImageBuffer.tweening) && 0 != ~var2
              && var2 < var8.anIntArray1851.length) {
              var24 = var8.anIntArray1869[var4];
              var42 = var8.anIntArray1851[var2];
              var28 = var42 >>> 16;
              var42 &= '\uffff';
              if (~var28 == ~var27) {
                var46 = var44;
              } else {
                var46 = AreaSoundEffect.method133(var42 >>> 16, 0);
              }

              if (null != var46) {
                var35 |= var46.method561(var42, (byte) 124);
                var37 |= var46.method559(1317095745, var42);
              }
            }
          }

          AbstractModel var45 = var11.method1894(!var37, !var35, !var36);
          var29 = 1;

          for (var28 = 0; var28 < var16; ++var28) {
            if (TextureSampler12.aClass3_Sub28_Sub5Array3041[var28] != null) {
              var45.method1887(TextureSampler12.aClass3_Sub28_Sub5Array3041[var28],
                DummyClass43.anIntArray912[var28],
                TextureSampler18.aClass3_Sub28_Sub5Array4031[var28],
                BufferedFile.anIntArray574[var28], -1 + SubNode.anIntArray2574[var28],
                DummyClass35.anIntArray664[var28], var29,
                DummyClass52.aClass142Array1168[var28].aBoolean1848,
                this.anIntArrayArray1258[var28]);
            }

            var29 <<= 1;
          }

          if (var40 != null && var44 != null) {
            var45
              .method1892(var40, var17, var43, var18, var6 + -1, var19, var44, var22, var46, var42,
                var9 + -1, var24, var10.aBooleanArray1855, var10.aBoolean1848 | var8.aBoolean1848);
          } else if (var40 == null) {
            if (null != var44) {
              var45.method1880(var44, var22, var46, var42, -1 + var9, var24, var8.aBoolean1848);
            }
          } else {
            var45.method1880(var40, var17, var43, var18, var6 + -1, var19, var10.aBoolean1848);
          }

          for (var28 = 0; ~var28 > ~var16; ++var28) {
            TextureSampler12.aClass3_Sub28_Sub5Array3041[var28] = null;
            TextureSampler18.aClass3_Sub28_Sub5Array4031[var28] = null;
            DummyClass52.aClass142Array1168[var28] = null;
          }

          if (~this.anInt1264 != -129 || -129 != ~this.anInt1266) {
            var45.scale(this.anInt1264, this.anInt1266, this.anInt1264);
          }

          return var45;
        }
      }
    } catch (RuntimeException var32) {
      throw AbstractGameWorld.cascadeException(var32,
        "me.M(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ','
          + var5 + ',' + var6 + ',' + var7 + ',' + (var8 != null ? "{...}" : "null") + ',' + var9
          + ',' + (var10 != null ? "{...}" : "null") + ')');
    }
  }

  final GameString method1477(int var1, GameString var2, boolean var3) {
    try {
      if (null != this.aClass130_1272) {
        StringNode var4 = (StringNode) this.aClass130_1272.get((long) var1);
        return !var3 ? null : (null == var4 ? var2 : var4.aClass94_2586);
      } else {
        return var2;
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "me.I(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
    }
  }

  final void method1478(Buffer var1, int var2) {
    try {
      while (true) {
        int var3 = var1.readUnsignedByte();
        if (-1 == ~var3) {
          var3 = -88 % ((5 - var2) / 52);
          return;
        }

        this.method1483(27, var3, var1);
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld
        .cascadeException(var4, "me.F(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
    }
  }

  final void method1481(int var1) {
    try {
      int var2 = 36 % ((12 - var1) / 41);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "me.D(" + var1 + ')');
    }
  }

  final AbstractModel method1482(AnimationSequence var1, int var2, int var3, int var4, int var5) {
    try {
      if (this.anIntArray1292 == null) {
        if (null == this.anIntArray1250) {
          return null;
        } else {
          AbstractModel var12 =
            (AbstractModel) DummyClass14.aClass93_1964.get((long) this.anInt1284);
          if (var12 == null) {
            boolean var7 = false;

            for (int var8 = 0; ~var8 > ~this.anIntArray1250.length; ++var8) {
              if (!TextureSampler31.aClass153_3173
                .method2129((byte) -69, 0, this.anIntArray1250[var8])) {
                var7 = true;
              }
            }

            if (var7) {
              return null;
            }

            Model[] var14 = new Model[this.anIntArray1250.length];

            for (int var9 = 0; ~var9 > ~this.anIntArray1250.length; ++var9) {
              var14[var9] =
                Model.getModel(TextureSampler31.aClass153_3173, this.anIntArray1250[var9], 0);
            }

            Model var15;
            if (-2 != ~var14.length) {
              var15 = new Model(var14, var14.length);
            } else {
              var15 = var14[0];
            }

            int var10;
            if (null != this.aShortArray1248) {
              for (var10 = 0; ~this.aShortArray1248.length < ~var10; ++var10) {
                if (this.aByteArray1247 != null && ~var10 > ~this.aByteArray1247.length) {
                  var15.replaceColor(this.aShortArray1248[var10],
                    SceneShadowMap.aShortArray1779[255 & this.aByteArray1247[var10]]);
                } else {
                  var15.replaceColor(this.aShortArray1248[var10], this.aShortArray1254[var10]);
                }
              }
            }

            if (this.aShortArray1271 != null) {
              for (var10 = 0; ~var10 > ~this.aShortArray1271.length; ++var10) {
                var15.replaceMaterial(this.aShortArray1271[var10], this.aShortArray1246[var10]);
              }
            }

            var12 = var15.method2008(64, 768, -50, -10, -50);
            DummyClass14.aClass93_1964.get((byte) -119, var12, (long) this.anInt1284);
          }

          if (null != var1) {
            var12 = var1.method2055(var12, (byte) -75, var3, var2, var5);
          }

          int var13 = 5 % ((var4 - -64) / 36);
          return var12;
        }
      } else {
        NpcConfiguration var6 = this.method1471((byte) -100);
        return null == var6 ? null : var6.method1482(var1, var2, var3, 54, var5);
      }
    } catch (RuntimeException var11) {
      throw AbstractGameWorld.cascadeException(var11,
        "me.A(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ','
          + var5 + ')');
    }
  }

  private final void method1483(int var1, int var2, Buffer var3) {
    try {
      int var4;
      int var5;
      if (1 == var2) {
        var4 = var3.readUnsignedByte();
        this.anIntArray1288 = new int[var4];

        for (var5 = 0; var4 > var5; ++var5) {
          this.anIntArray1288[var5] = var3.readUnsignedShort();
          if (this.anIntArray1288[var5] == '\uffff') {
            this.anIntArray1288[var5] = -1;
          }
        }
      } else if (var2 != 2) {
        if (~var2 != -13) {
          if (var2 >= 30 && ~var2 > -36) {
            this.aClass94Array1259[-30 + var2] = var3.readString();
            if (this.aClass94Array1259[-30 + var2].method1531(TextureSampler33.aClass94_3051)) {
              this.aClass94Array1259[var2 - 30] = null;
            }
          } else if (var2 != 40) {
            if (-42 != ~var2) {
              if (-43 == ~var2) {
                var4 = var3.readUnsignedByte();
                this.aByteArray1247 = new byte[var4];

                for (var5 = 0; var4 > var5; ++var5) {
                  this.aByteArray1247[var5] = var3.readByte();
                }
              } else if (~var2 == -61) {
                var4 = var3.readUnsignedByte();
                this.anIntArray1250 = new int[var4];

                for (var5 = 0; ~var4 < ~var5; ++var5) {
                  this.anIntArray1250[var5] = var3.readUnsignedShort();
                }
              } else if (93 != var2) {
                if (~var2 != -96) {
                  if (var2 != 97) {
                    if (-99 == ~var2) {
                      this.anInt1266 = var3.readUnsignedShort();
                    } else if (~var2 != -100) {
                      if (var2 != 100) {
                        if (-102 == ~var2) {
                          this.anInt1282 = var3.readByte() * 5;
                        } else if (~var2 == -103) {
                          this.anInt1269 = var3.readUnsignedShort();
                        } else if (103 == var2) {
                          this.anInt1274 = var3.readUnsignedShort();
                        } else {
                          int var6;
                          if (106 != var2 && ~var2 != -119) {
                            if (-108 == ~var2) {
                              this.aBoolean1270 = false;
                            } else if (var2 != 109) {
                              if (var2 == 111) {
                                this.aBoolean1249 = false;
                              } else if (-114 == ~var2) {
                                this.aShort1286 = (short) var3.readUnsignedShort();
                                this.aShort1256 = (short) var3.readUnsignedShort();
                              } else if (-115 == ~var2) {
                                this.aByte1287 = var3.readByte();
                                this.aByte1275 = var3.readByte();
                              } else if (~var2 != -116) {
                                if (119 == var2) {
                                  this.aByte1267 = var3.readByte();
                                } else if (121 == var2) {
                                  this.anIntArrayArray1261 = new int[this.anIntArray1288.length][];
                                  var4 = var3.readUnsignedByte();

                                  for (var5 = 0; var5 < var4; ++var5) {
                                    var6 = var3.readUnsignedByte();
                                    int[] var7 = this.anIntArrayArray1261[var6] = new int[3];
                                    var7[0] = var3.readByte();
                                    var7[1] = var3.readByte();
                                    var7[2] = var3.readByte();
                                  }
                                } else if (122 == var2) {
                                  this.anInt1279 = var3.readUnsignedShort();
                                } else if (-124 == ~var2) {
                                  this.anInt1265 = var3.readUnsignedShort();
                                } else if (-126 != ~var2) {
                                  if (126 != var2) {
                                    if (127 == var2) {
                                      this.renderAnimationId = var3.readUnsignedShort();
                                    } else if (128 == var2) {
                                      var3.readUnsignedByte();
                                    } else if (var2 != 134) {
                                      if (~var2 == -136) {
                                        this.anInt1296 = var3.readUnsignedByte();
                                        this.anInt1253 = var3.readUnsignedShort();
                                      } else if (var2 == 136) {
                                        this.anInt1289 = var3.readUnsignedByte();
                                        this.anInt1278 = var3.readUnsignedShort();
                                      } else if (-138 != ~var2) {
                                        if (~var2 == -250) {
                                          var4 = var3.readUnsignedByte();
                                          if (null == this.aClass130_1272) {
                                            var5 = DummyClass53.nearestPo2((byte) 109, var4);
                                            this.aClass130_1272 = new HashTable(var5);
                                          }

                                          for (var5 = 0; ~var5 > ~var4; ++var5) {
                                            boolean var11 = 1 == var3.readUnsignedByte();
                                            int var10 = var3.readUnsignedMedium((byte) 83);
                                            Object var8;
                                            if (!var11) {
                                              var8 = new IntegerNode(var3.readInt());
                                            } else {
                                              var8 = new StringNode(var3.readString());
                                            }

                                            this.aClass130_1272.put((long) var10, (Node) var8);
                                          }
                                        }
                                      } else {
                                        this.anInt1298 = var3.readUnsignedShort();
                                      }
                                    } else {
                                      this.anInt1262 = var3.readUnsignedShort();
                                      if (this.anInt1262 == '\uffff') {
                                        this.anInt1262 = -1;
                                      }

                                      this.anInt1290 = var3.readUnsignedShort();
                                      if (~this.anInt1290 == -65536) {
                                        this.anInt1290 = -1;
                                      }

                                      this.anInt1293 = var3.readUnsignedShort();
                                      if (-65536 == ~this.anInt1293) {
                                        this.anInt1293 = -1;
                                      }

                                      this.anInt1276 = var3.readUnsignedShort();
                                      if (-65536 == ~this.anInt1276) {
                                        this.anInt1276 = -1;
                                      }

                                      this.anInt1291 = var3.readUnsignedByte();
                                    }
                                  } else {
                                    this.anInt1283 = var3.readUnsignedShort();
                                  }
                                } else {
                                  this.defaultFaceDirection = var3.readByte();
                                }
                              } else {
                                var3.readUnsignedByte();
                                var3.readUnsignedByte();
                              }
                            } else {
                              this.aBoolean1255 = false;
                            }
                          } else {
                            this.anInt1257 = var3.readUnsignedShort();
                            var4 = -1;
                            if (-65536 == ~this.anInt1257) {
                              this.anInt1257 = -1;
                            }

                            this.anInt1295 = var3.readUnsignedShort();
                            if (~this.anInt1295 == -65536) {
                              this.anInt1295 = -1;
                            }

                            if (-119 == ~var2) {
                              var4 = var3.readUnsignedShort();
                              if (-65536 == ~var4) {
                                var4 = -1;
                              }
                            }

                            var5 = var3.readUnsignedByte();
                            this.anIntArray1292 = new int[2 + var5];

                            for (var6 = 0; ~var5 <= ~var6; ++var6) {
                              this.anIntArray1292[var6] = var3.readUnsignedShort();
                              if (~this.anIntArray1292[var6] == -65536) {
                                this.anIntArray1292[var6] = -1;
                              }
                            }

                            this.anIntArray1292[1 + var5] = var4;
                          }
                        }
                      } else {
                        this.anInt1251 = var3.readByte();
                      }
                    } else {
                      this.aBoolean1263 = true;
                    }
                  } else {
                    this.anInt1264 = var3.readUnsignedShort();
                  }
                } else {
                  this.anInt1260 = var3.readUnsignedShort();
                }
              } else {
                this.aBoolean1285 = false;
              }
            } else {
              var4 = var3.readUnsignedByte();
              this.aShortArray1246 = new short[var4];
              this.aShortArray1271 = new short[var4];

              for (var5 = 0; ~var4 < ~var5; ++var5) {
                this.aShortArray1271[var5] = (short) var3.readUnsignedShort();
                this.aShortArray1246[var5] = (short) var3.readUnsignedShort();
              }
            }
          } else {
            var4 = var3.readUnsignedByte();
            this.aShortArray1254 = new short[var4];
            this.aShortArray1248 = new short[var4];

            for (var5 = 0; var4 > var5; ++var5) {
              this.aShortArray1248[var5] = (short) var3.readUnsignedShort();
              this.aShortArray1254[var5] = (short) var3.readUnsignedShort();
            }
          }
        } else {
          this.size = var3.readUnsignedByte();
        }
      } else {
        this.aClass94_1273 = var3.readString();
      }

      var4 = 11 % ((-39 - var1) / 60);
    } catch (RuntimeException var9) {
      throw AbstractGameWorld.cascadeException(var9,
        "me.H(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
    }
  }

}
