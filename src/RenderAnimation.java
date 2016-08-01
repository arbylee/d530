final class RenderAnimation {

  private static GameString aClass94_354 = SpawnedGameObject.createString("Discard");
  private static GameString aClass94_363 = SpawnedGameObject.createString("Aug");
  private static GameString aClass94_365 = SpawnedGameObject.createString("May");
  private static GameString aClass94_366 = SpawnedGameObject.createString("Loaded world list data");
  private static GameString aClass94_376 = SpawnedGameObject.createString("Jul");
  private static GameString aClass94_385 = SpawnedGameObject.createString("Jun");
  private static GameString aClass94_388 = SpawnedGameObject.createString("Dec");
  private static GameString aClass94_391 = SpawnedGameObject.createString("Oct");
  private static GameString aClass94_392 = SpawnedGameObject.createString("Jan");
  private static GameString aClass94_394 = SpawnedGameObject.createString("Sep");
  private static GameString aClass94_397 = SpawnedGameObject.createString("Nov");
  private static GameString aClass94_401 = SpawnedGameObject.createString("Apr");
  private static GameString aClass94_404 = SpawnedGameObject.createString("Mar");
  private static GameString aClass94_405 = SpawnedGameObject.createString("Feb");
  static GameString aClass94_355 = SpawnedGameObject.createString("Lade Konfiguration )2 ");
  static int[] anIntArray356 = new int[] {1, 0, -1, 0};
  static volatile int anInt362 = 0;
  static int anInt377 = 0;
  static GameString aClass94_378 = null;
  static int headIconsPrayerFileId;
  static byte[][][] aByteArrayArrayArray383;
  static int anInt384 = 0;
  static int anInt396;
  static boolean interfaceCounterUpdated = false;
  static GameString aClass94_361 = aClass94_354;
  static GameString aClass94_374 = aClass94_366;
  static GameString[] aClass94Array358 = new GameString[] {
    aClass94_392, aClass94_405, aClass94_404, aClass94_401, aClass94_365, aClass94_385,
    aClass94_376, aClass94_363, aClass94_394, aClass94_391, aClass94_397, aClass94_388
  };
  int anInt357 = 0;
  int[][] anIntArrayArray359;
  int anInt360 = -1;
  int anInt364 = -1;
  int anInt367 = -1;
  int anInt368 = -1;
  int anInt369 = 0;
  int anInt370 = 0;
  int anInt371 = 0;
  int anInt372 = -1;
  int anInt373 = -1;
  int anInt375 = -1;
  int anInt379 = -1;
  int anInt381 = 0;
  int anInt382 = -1;
  int anInt386 = -1;
  int anInt387 = 0;
  int anInt389 = -1;
  int anInt390 = -1;
  int anInt393 = -1;
  int anInt395 = 0;
  int anInt398 = -1;
  int anInt399 = 0;
  int anInt400 = 0;
  int anInt403 = 0;
  int anInt406 = -1;
  int anInt407 = -1;

  final void method899(int var1) {
    try {
      if (var1 <= 68) {
        method900(null, -23);
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "ck.B(" + var1 + ')');
    }
  }

  final void method901(int var1, Buffer var2) {
    try {
      if (var1 != -1) {
        method900(null, -18);
      }

      while (true) {
        int var3 = var2.readUnsignedByte();
        if (-1 == ~var3) {
          return;
        }

        this.method902(var3, (byte) -106, var2);
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "ck.H(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
    }
  }

  private final void method902(int var1, byte var2, Buffer var3) {
    try {
      if (var1 == 1) {
        this.anInt368 = var3.readUnsignedShort();
        this.anInt382 = var3.readUnsignedShort();
        if (-65536 == ~this.anInt382) {
          this.anInt382 = -1;
        }

        if ('\uffff' == this.anInt368) {
          this.anInt368 = -1;
        }
      } else if (-3 == ~var1) {
        this.anInt398 = var3.readUnsignedShort();
      } else if (-4 != ~var1) {
        if (4 == var1) {
          this.anInt406 = var3.readUnsignedShort();
        } else if (var1 != 5) {
          if (6 != var1) {
            if (7 == var1) {
              this.anInt386 = var3.readUnsignedShort();
            } else if (var1 != 8) {
              if (-10 != ~var1) {
                if (var1 == 26) {
                  this.anInt395 = (short) (4 * var3.readUnsignedByte());
                  this.anInt381 = (short) (4 * var3.readUnsignedByte());
                } else if (-28 != ~var1) {
                  if (-30 != ~var1) {
                    if (var1 != 30) {
                      if (~var1 == -32) {
                        this.anInt387 = var3.readUnsignedByte();
                      } else if (32 != var1) {
                        if (33 == var1) {
                          this.anInt400 = var3.method787((byte) 41);
                        } else if (34 == var1) {
                          this.anInt403 = var3.readUnsignedByte();
                        } else if (var1 != 35) {
                          if (var1 != 36) {
                            if (-38 != ~var1) {
                              if (var1 == 38) {
                                this.anInt367 = var3.readUnsignedShort();
                              } else if (39 == var1) {
                                this.anInt407 = var3.readUnsignedShort();
                              } else if (var1 == 40) {
                                this.anInt389 = var3.readUnsignedShort();
                              } else if (41 == var1) {
                                this.anInt390 = var3.readUnsignedShort();
                              } else if (var1 == 42) {
                                this.anInt364 = var3.readUnsignedShort();
                              } else if (-44 != ~var1) {
                                if (~var1 != -45) {
                                  if (~var1 == -46) {
                                    var3.readUnsignedShort();
                                  }
                                } else {
                                  var3.readUnsignedShort();
                                }
                              } else {
                                var3.readUnsignedShort();
                              }
                            } else {
                              this.anInt360 = var3.readUnsignedByte();
                            }
                          } else {
                            this.anInt371 = var3.method787((byte) 122);
                          }
                        } else {
                          this.anInt399 = var3.readUnsignedShort();
                        }
                      } else {
                        this.anInt370 = var3.readUnsignedShort();
                      }
                    } else {
                      this.anInt357 = var3.readUnsignedShort();
                    }
                  } else {
                    this.anInt369 = var3.readUnsignedByte();
                  }
                } else {
                  if (this.anIntArrayArray359 == null) {
                    this.anIntArrayArray359 = new int[12][];
                  }

                  int var4 = var3.readUnsignedByte();
                  this.anIntArrayArray359[var4] = new int[6];

                  for (int var5 = 0; var5 < 6; ++var5) {
                    this.anIntArrayArray359[var4][var5] = var3.method787((byte) 85);
                  }
                }
              } else {
                this.anInt375 = var3.readUnsignedShort();
              }
            } else {
              this.anInt373 = var3.readUnsignedShort();
            }
          } else {
            this.anInt393 = var3.readUnsignedShort();
          }
        } else {
          this.anInt379 = var3.readUnsignedShort();
        }
      } else {
        this.anInt372 = var3.readUnsignedShort();
      }

      if (var2 != -106) {
        this.method901(96, null);
      }

    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "ck.E(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
    }
  }

  public static void method896(boolean var0) {
    try {
      aClass94_388 = null;
      aClass94_374 = null;
      aClass94_392 = null;
      aClass94_385 = null;
      aClass94_355 = null;
      aClass94_376 = null;
      aClass94_397 = null;
      anIntArray356 = null;
      aClass94_366 = null;
      aClass94Array358 = null;
      aClass94_378 = null;
      aClass94_354 = null;
      aClass94_365 = null;
      aClass94_394 = null;
      if (!var0) {
        method898((byte) 20, -109);
      }

      aClass94_361 = null;
      aClass94_391 = null;
      aClass94_401 = null;
      aClass94_405 = null;
      aClass94_363 = null;
      aByteArrayArrayArray383 = null;
      aClass94_404 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ck.A(" + var0 + ')');
    }
  }

  static final boolean method897(int var0, AudioStreamEncoder4 var1, FileUnpacker var2,
                                 FileUnpacker midiInstruments, FileUnpacker soundEffects) {
    try {
      DummyClass23.aClass153_1661 = var2;
      if (var0 != 17770) {
        aClass94_366 = null;
      }

      DummyClass59.soundEffects = soundEffects;
      Texture.midiInstruments = midiInstruments;
      DummyClass55.aClass3_Sub24_Sub4_1421 = var1;
      return true;
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "ck.C(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ?
          "{...}" :
          "null") + ',' + (midiInstruments != null ? "{...}" : "null") + ',' + (
          soundEffects != null ? "{...}" : "null") + ')');
    }
  }

  static final SpotAnimationConfig method898(byte var0, int var1) {
    try {
      SpotAnimationConfig var2 =
        (SpotAnimationConfig) SomethingPacket151.aClass93_2604.get((long) var1);
      if (var2 != null) {
        return var2;
      } else {
        byte[] var3 =
          TextureSampler19.spotAnimations.getBytes(DummyInputStream.method64(true, var1),
            AbstractSomethingTexture.method1338(var1, var0 ^ 7));
        var2 = new SpotAnimationConfig();
        var2.anInt539 = var1;
        if (var0 != 42) {
          method898((byte) -83, -12);
        }

        if (null != var3) {
          var2.method963(new Buffer(var3), (byte) -113);
        }

        SomethingPacket151.aClass93_2604.get((byte) -109, var2, (long) var1);
        return var2;
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "ck.D(" + var0 + ',' + var1 + ')');
    }
  }

  static final void method900(Mobile var0, int var1) {
    try {
      var0.aBoolean2810 = false;
      AnimationSequence var2;
      if (-1 != var0.anInt2764) {
        var2 = GameClient.method45(var0.anInt2764, (byte) -20);
        if (null != var2 && null != var2.anIntArray1851) {
          ++var0.anInt2802;
          if (~var2.anIntArray1851.length < ~var0.anInt2813
            && var0.anInt2802 > var2.anIntArray1869[var0.anInt2813]) {
            var0.anInt2802 = 1;
            ++var0.anInt2813;
            ++var0.anInt2793;
            SocketStream.method1470(var0.anInt2829, var2, 183921384, var0.anInt2819,
              var0 == TextureCache.localPlayer, var0.anInt2813);
          }

          if (~var0.anInt2813 <= ~var2.anIntArray1851.length) {
            var0.anInt2813 = 0;
            var0.anInt2802 = 0;
            SocketStream.method1470(var0.anInt2829, var2, 183921384, var0.anInt2819,
              TextureCache.localPlayer == var0, var0.anInt2813);
          }

          var0.anInt2793 = var0.anInt2813 - -1;
          if (~var0.anInt2793 <= ~var2.anIntArray1851.length) {
            var0.anInt2793 = 0;
          }
        } else {
          var0.anInt2764 = -1;
        }
      }

      int var6;
      if (~var0.anInt2842 != 0 && ~AbstractGameWorld.updateCycle <= ~var0.anInt2759) {
        var6 = method898((byte) 42, var0.anInt2842).anInt542;
        if (0 != ~var6) {
          AnimationSequence var3 = GameClient.method45(var6, (byte) -20);
          if (var3 != null && var3.anIntArray1851 != null) {
            if (0 > var0.anInt2805) {
              var0.anInt2805 = 0;
              SocketStream.method1470(var0.anInt2829, var3, 183921384, var0.anInt2819,
                TextureCache.localPlayer == var0, 0);
            }

            ++var0.anInt2761;
            if (var0.anInt2805 < var3.anIntArray1851.length
              && ~var3.anIntArray1869[var0.anInt2805] > ~var0.anInt2761) {
              ++var0.anInt2805;
              var0.anInt2761 = 1;
              SocketStream.method1470(var0.anInt2829, var3, var1 ^ -183911469, var0.anInt2819,
                TextureCache.localPlayer == var0, var0.anInt2805);
            }

            if (var0.anInt2805 >= var3.anIntArray1851.length) {
              var0.anInt2842 = -1;
            }

            var0.anInt2826 = var0.anInt2805 - -1;
            if (~var3.anIntArray1851.length >= ~var0.anInt2826) {
              var0.anInt2826 = -1;
            }
          } else {
            var0.anInt2842 = -1;
          }
        } else {
          var0.anInt2842 = -1;
        }
      }

      if (~var0.animationId != 0 && -2 <= ~var0.anInt2828) {
        var2 = GameClient.method45(var0.animationId, (byte) -20);
        if (~var2.anInt1866 == -2 && var0.anInt2811 > 0
          && ~AbstractGameWorld.updateCycle <= ~var0.anInt2800
          && AbstractGameWorld.updateCycle > var0.anInt2790) {
          var0.anInt2828 = 1;
          return;
        }
      }

      if (var1 == -11973) {
        if (~var0.animationId != 0 && -1 == ~var0.anInt2828) {
          var2 = GameClient.method45(var0.animationId, (byte) -20);
          if (var2 != null && var2.anIntArray1851 != null) {
            ++var0.anInt2760;
            if (~var0.anInt2832 > ~var2.anIntArray1851.length
              && var0.anInt2760 > var2.anIntArray1869[var0.anInt2832]) {
              var0.anInt2760 = 1;
              ++var0.anInt2832;
              SocketStream.method1470(var0.anInt2829, var2, 183921384, var0.anInt2819,
                var0 == TextureCache.localPlayer, var0.anInt2832);
            }

            if (var2.anIntArray1851.length <= var0.anInt2832) {
              var0.anInt2832 -= var2.anInt1865;
              ++var0.anInt2773;
              if (~var0.anInt2773 > ~var2.anInt1861) {
                if (var0.anInt2832 >= 0 && ~var2.anIntArray1851.length < ~var0.anInt2832) {
                  SocketStream.method1470(var0.anInt2829, var2, var1 ^ -183911469, var0.anInt2819,
                    TextureCache.localPlayer == var0, var0.anInt2832);
                } else {
                  var0.animationId = -1;
                }
              } else {
                var0.animationId = -1;
              }
            }

            var0.anInt2776 = var0.anInt2832 + 1;
            if (var0.anInt2776 >= var2.anIntArray1851.length) {
              var0.anInt2776 -= var2.anInt1865;
              if (var2.anInt1861 > var0.anInt2773 + 1) {
                if (0 > var0.anInt2776 || var0.anInt2776 >= var2.anIntArray1851.length) {
                  var0.anInt2776 = -1;
                }
              } else {
                var0.anInt2776 = -1;
              }
            }

            var0.aBoolean2810 = var2.aBoolean1859;
          } else {
            var0.animationId = -1;
          }
        }

        if (0 < var0.anInt2828) {
          --var0.anInt2828;
        }

        for (var6 = 0; var0.aClass145Array2809.length > var6; ++var6) {
          Unsure var7 = var0.aClass145Array2809[var6];
          if (null != var7) {
            if (~var7.anInt1900 >= -1) {
              AnimationSequence var4 = GameClient.method45(var7.anInt1890, (byte) -20);
              if (null != var4 && var4.anIntArray1851 != null) {
                ++var7.anInt1897;
                if (var7.anInt1893 < var4.anIntArray1851.length
                  && var7.anInt1897 > var4.anIntArray1869[var7.anInt1893]) {
                  ++var7.anInt1893;
                  var7.anInt1897 = 1;
                  SocketStream.method1470(var0.anInt2829, var4, 183921384, var0.anInt2819,
                    var0 == TextureCache.localPlayer, var7.anInt1893);
                }

                if (~var4.anIntArray1851.length >= ~var7.anInt1893) {
                  ++var7.anInt1894;
                  var7.anInt1893 -= var4.anInt1865;
                  if (var4.anInt1861 > var7.anInt1894) {
                    if (-1 >= ~var7.anInt1893 && ~var7.anInt1893 > ~var4.anIntArray1851.length) {
                      SocketStream.method1470(var0.anInt2829, var4, 183921384, var0.anInt2819,
                        TextureCache.localPlayer == var0, var7.anInt1893);
                    } else {
                      var0.aClass145Array2809[var6] = null;
                    }
                  } else {
                    var0.aClass145Array2809[var6] = null;
                  }
                }

                var7.anInt1891 = 1 + var7.anInt1893;
                if (var4.anIntArray1851.length <= var7.anInt1891) {
                  var7.anInt1891 -= var4.anInt1865;
                  if (1 + var7.anInt1894 < var4.anInt1861) {
                    if (-1 < ~var7.anInt1891 || var4.anIntArray1851.length <= var7.anInt1891) {
                      var7.anInt1891 = -1;
                    }
                  } else {
                    var7.anInt1891 = -1;
                  }
                }
              } else {
                var0.aClass145Array2809[var6] = null;
              }
            } else {
              --var7.anInt1900;
            }
          }
        }

      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "ck.F(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

  static final GameString concat(GameString[] var0) {
    try {
      if (-3 >= ~var0.length) {

        return MouseRecorder.method1261(0, var0.length, var0, 2774);
      } else {
        throw new IllegalArgumentException();
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "ck.G(" + (var0 != null ? "{...}" : "null") + ')');
    }
  }

}
