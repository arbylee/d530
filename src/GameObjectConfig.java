final class GameObjectConfig {

  static boolean[] aBooleanArray1490 = new boolean[112];
  static int[][][] anIntArrayArrayArray1497 = new int[4][13][13];
  static GameString aClass94_1508 = SpawnedGameObject.createString("Choisir une option");
  static GameString aClass94_1509 = SpawnedGameObject.createString("Chargement des textures )2 ");
  static int portOffset = 1;
  static int anInt1521 = 0;
  static GameString aClass94_1523 =
    SpawnedGameObject.createString("Chargement en cours)3 Veuillez patienter)3");
  static short aShort1535 = 320;
  int anInt1478;
  int anInt1480 = 1;
  int anInt1482;
  boolean aBoolean1483 = false;
  int anInt1484;
  int anInt1485 = 1;
  boolean aBoolean1486;
  boolean aBoolean1491;
  boolean aBoolean1492;
  int anInt1493;
  boolean aBoolean1498;
  GameString[] aClass94Array1499;
  boolean aBoolean1502 = false;
  boolean aBoolean1503;
  GameString aClass94_1504;
  boolean aBoolean1507;
  boolean aBoolean1510;
  int anInt1512;
  int anInt1515;
  int anInt1516;
  int anInt1517;
  int anInt1518;
  int anInt1520;
  int anInt1522;
  int[] anIntArray1524;
  boolean aBoolean1525;
  int anInt1527;
  int anInt1528;
  int anInt1529;
  boolean aBoolean1530;
  int anInt1531;
  int anInt1533;
  boolean aBoolean1537;
  int anInt1538;
  int[] anIntArray1539;
  int anInt1540;
  boolean aBoolean1542;
  private short[] aShortArray1476;
  private short[] aShortArray1477;
  private int anInt1479;
  private int anInt1481;
  private int[] anIntArray1487;
  private int anInt1488;
  private int anInt1489;
  private int anInt1494 = 0;
  private short[] aShortArray1495;
  private int anInt1496;
  private short aShort1500;
  private HashTable aClass130_1501;
  private byte aByte1505;
  private short[] aShortArray1506;
  private int anInt1511;
  private byte[] aByteArray1513;
  private int[] anIntArray1519;
  private int anInt1526;
  private int anInt1532;
  private int anInt1534;
  private boolean aBoolean1536;
  private boolean aBoolean1541;


  public GameObjectConfig() {
    this.aClass94_1504 = TextureSampler20.aClass94_3150;
    this.aBoolean1503 = true;
    this.anInt1493 = -1;
    this.anInt1515 = 0;
    this.anInt1516 = -1;
    this.aByte1505 = 0;
    this.aBoolean1491 = false;
    this.anInt1517 = -1;
    this.anInt1496 = 0;
    this.anInt1518 = 0;
    this.anInt1482 = -1;
    this.aBoolean1510 = false;
    this.anInt1520 = -1;
    this.aShort1500 = -1;
    this.anInt1481 = 128;
    this.aClass94Array1499 = new GameString[5];
    this.anInt1479 = 128;
    this.aBoolean1492 = true;
    this.anInt1488 = 128;
    this.aBoolean1498 = false;
    this.anInt1529 = -1;
    this.aBoolean1530 = false;
    this.aBoolean1525 = true;
    this.anInt1532 = -1;
    this.anInt1522 = -1;
    this.anInt1533 = 0;
    this.aBoolean1486 = true;
    this.anInt1534 = 0;
    this.anInt1478 = 0;
    this.anInt1528 = 16;
    this.aBoolean1537 = false;
    this.anInt1511 = 0;
    this.anInt1484 = 0;
    this.anInt1489 = 0;
    this.anInt1531 = -1;
    this.aBoolean1507 = false;
    this.anInt1512 = -1;
    this.anInt1538 = 2;
    this.aBoolean1536 = false;
    this.anInt1526 = -1;
    this.anInt1540 = -1;
    this.aBoolean1541 = false;
    this.aBoolean1542 = false;
  }

  final boolean method1684(int var1, int var2) {
    try {
      int var3 = -1 % ((31 - var1) / 41);
      if (this.anIntArray1487 != null) {
        for (int var7 = 0; ~this.anIntArray1487.length < ~var7; ++var7) {
          if (~var2 == ~this.anIntArray1487[var7]) {
            return LinearHashTable.aClass153_1043.method2129((byte) 72, 0,
              this.anIntArray1519[var7] & '\uffff');
          }
        }

        return true;
      } else if (null == this.anIntArray1519) {
        return true;
      } else if (-11 != ~var2) {
        return true;
      } else {
        boolean var4 = true;

        for (int var5 = 0; this.anIntArray1519.length > var5; ++var5) {
          var4 &= LinearHashTable.aClass153_1043.method2129((byte) 71, 0,
            '\uffff' & this.anIntArray1519[var5]);
        }

        return var4;
      }
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6, "pb.H(" + var1 + ',' + var2 + ')');
    }
  }

  final GameObjectConfig method1685(int var1) {
    try {
      if (var1 != 0) {
        this.method1697(-92, 83, null, -13, null, 18, null, true, 114, 123, null, 118, 85, -116);
      }

      int var2 = -1;
      if (this.anInt1526 != -1) {
        var2 = NpcConfiguration.method1484(64835055, this.anInt1526);
      } else if (this.anInt1532 != -1) {
        var2 = DummyClass5.anIntArray2985[this.anInt1532];
      }

      if (~var2 <= -1 && ~var2 > ~(this.anIntArray1524.length - 1)
        && ~this.anIntArray1524[var2] != 0) {
        return DummyClass11.method2207(4, this.anIntArray1524[var2]);
      } else {
        int var3 = this.anIntArray1524[-1 + this.anIntArray1524.length];
        return ~var3 == 0 ? null : DummyClass11.method2207(4, var3);
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "pb.C(" + var1 + ')');
    }
  }

  private final Model method1686(int var1, int var2, int var3) {
    try {
      Model var4 = null;
      boolean var5 = this.aBoolean1536;
      if (-3 == ~var2 && 3 < var1) {
        var5 = !var5;
      }

      int var6;
      int var7;
      if (null == this.anIntArray1487) {
        if (-11 != ~var2) {
          return null;
        }

        if (this.anIntArray1519 == null) {
          return null;
        }

        var6 = this.anIntArray1519.length;

        for (var7 = 0; ~var7 > ~var6; ++var7) {
          int var8 = this.anIntArray1519[var7];
          if (var5) {
            var8 += 65536;
          }

          var4 = (Model) DummyClass54.aClass93_1401.get((long) var8);
          if (var4 == null) {
            var4 = Model.getModel(LinearHashTable.aClass153_1043, var8 & '\uffff', 0);
            if (var4 == null) {
              return null;
            }

            if (var5) {
              var4.method2002();
            }

            DummyClass54.aClass93_1401.get((byte) -91, var4, (long) var8);
          }

          if (1 < var6) {
            Something3dRoot.aClass140_Sub5Array2058[var7] = var4;
          }
        }

        if (~var6 < -2) {
          var4 = new Model(Something3dRoot.aClass140_Sub5Array2058, var6);
        }
      } else {
        var6 = -1;

        for (var7 = 0; this.anIntArray1487.length > var7; ++var7) {
          if (var2 == this.anIntArray1487[var7]) {
            var6 = var7;
            break;
          }
        }

        if (~var6 == 0) {
          return null;
        }

        var7 = this.anIntArray1519[var6];
        if (var5) {
          var7 += 65536;
        }

        var4 = (Model) DummyClass54.aClass93_1401.get((long) var7);
        if (null == var4) {
          var4 = Model.getModel(LinearHashTable.aClass153_1043, var7 & '\uffff', 0);
          if (null == var4) {
            return null;
          }

          if (var5) {
            var4.method2002();
          }

          DummyClass54.aClass93_1401.get((byte) -122, var4, (long) var7);
        }
      }

      boolean var11;
      var11 = !(128 == this.anInt1479 && ~this.anInt1488 == -129 && 128 == this.anInt1481);

      boolean var12;
      var12 = !(this.anInt1496 == 0 && -1 == ~this.anInt1511 && 0 == this.anInt1534);

      Model var13 = new Model(var4, var3 == ~var1 && !var11 && !var12, this.aShortArray1477 == null,
        null == this.aShortArray1476, true);
      if (~var2 == -5 && var1 > 3) {
        var13.method2011(256);
        var13.translate(45, 0, -45);
      }

      var1 &= 3;
      if (-2 != ~var1) {
        if (-3 != ~var1) {
          if (3 == var1) {
            var13.method2018();
          }
        } else {
          var13.rotateHalfY();
        }
      } else {
        var13.rotateQuarterY();
      }

      int var9;
      if (null != this.aShortArray1477) {
        for (var9 = 0; this.aShortArray1477.length > var9; ++var9) {
          if (null != this.aByteArray1513 && this.aByteArray1513.length > var9) {
            var13.replaceColor(this.aShortArray1477[var9],
              TextureSampler16.aShortArray3110[255 & this.aByteArray1513[var9]]);
          } else {
            var13.replaceColor(this.aShortArray1477[var9], this.aShortArray1506[var9]);
          }
        }
      }

      if (this.aShortArray1476 != null) {
        for (var9 = 0; this.aShortArray1476.length > var9; ++var9) {
          var13.replaceMaterial(this.aShortArray1476[var9], this.aShortArray1495[var9]);
        }
      }

      if (var11) {
        var13.scale(this.anInt1479, this.anInt1488, this.anInt1481);
      }

      if (var12) {
        var13.translate(this.anInt1496, this.anInt1511, this.anInt1534);
      }

      return var13;
    } catch (RuntimeException var10) {
      throw AbstractGameWorld.cascadeException(var10,
        "pb.O(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  final void method1689(int var1) {
    try {
      if (this.anInt1529 == -1) {
        this.anInt1529 = 0;
        if (null != this.anIntArray1519 && (null == this.anIntArray1487
          || -11 == ~this.anIntArray1487[0])) {
          this.anInt1529 = 1;
        }

        for (int var2 = 0; var2 < 5; ++var2) {
          if (this.aClass94Array1499[var2] != null) {
            this.anInt1529 = 1;
            break;
          }
        }
      }

      if (var1 != -2116) {
        this.method1692(67, null);
      }

      if (-1 == this.anInt1540) {
        this.anInt1540 = ~this.anInt1538 != -1 ? 1 : 0;
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "pb.D(" + var1 + ')');
    }
  }

  final boolean method1690(int var1) {
    try {
      if (this.anIntArray1524 != null) {
        if (var1 != 28933) {
          this.method1696(34, 54, null, 55, 80, null, true, null, (byte) 127, true, -38);
        }

        for (int var2 = 0; ~var2 > ~this.anIntArray1524.length; ++var2) {
          if (0 != ~this.anIntArray1524[var2]) {
            GameObjectConfig var3 =
              DummyClass11.method2207(var1 + -28929, this.anIntArray1524[var2]);
            if (0 != ~var3.anInt1512 || var3.anIntArray1539 != null) {
              return true;
            }
          }
        }

        return false;
      } else {
        return this.anInt1512 != -1 || this.anIntArray1539 != null;
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "pb.F(" + var1 + ')');
    }
  }

  final int method1691(int var1, int var2, byte var3) {
    try {
      if (var3 <= 76) {
        return -40;
      } else if (this.aClass130_1501 == null) {
        return var1;
      } else {
        IntegerNode var4 = (IntegerNode) this.aClass130_1501.get((long) var2);
        return var4 != null ? var4.anInt2467 : var1;
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "pb.N(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  final void method1692(int var1, Buffer var2) {
    try {
      while (true) {
        int var3 = var2.readUnsignedByte();
        if (-1 == ~var3) {
          if (var1 != 6219) {
            this.method1696(105, -55, null, -39, 71, null, true, null, (byte) -117, false, -25);
          }

          return;
        }

        this.method1693(var2, var3, -80);
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "pb.G(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
    }
  }

  private final void method1693(Buffer var1, int var2, int var3) {
    try {
      if (var3 != -80) {
        this.anInt1522 = -122;
      }

      int var4;
      int var5;
      if (1 == var2) {
        var4 = var1.readUnsignedByte();
        if (~var4 < -1) {
          if (this.anIntArray1519 != null && !Cache.aBoolean742) {
            var1.position += var4 * 3;
          } else {
            this.anIntArray1487 = new int[var4];
            this.anIntArray1519 = new int[var4];

            for (var5 = 0; var4 > var5; ++var5) {
              this.anIntArray1519[var5] = var1.readUnsignedShort();
              this.anIntArray1487[var5] = var1.readUnsignedByte();
            }
          }
        }
      } else if (-3 == ~var2) {
        this.aClass94_1504 = var1.readString();
      } else if (-6 != ~var2) {
        if (~var2 == -15) {
          this.anInt1480 = var1.readUnsignedByte();
        } else if (-16 != ~var2) {
          if (~var2 != -18) {
            if (18 != var2) {
              if (var2 != 19) {
                if (~var2 != -22) {
                  if (~var2 != -23) {
                    if (-24 != ~var2) {
                      if (~var2 == -25) {
                        this.anInt1531 = var1.readUnsignedShort();
                        if (~this.anInt1531 == -65536) {
                          this.anInt1531 = -1;
                        }
                      } else if (-28 != ~var2) {
                        if (28 == var2) {
                          this.anInt1528 = var1.readUnsignedByte();
                        } else if (-30 != ~var2) {
                          if (39 == var2) {
                            this.anInt1489 = var1.readByte() * 5;
                          } else if (~var2 <= -31 && -36 < ~var2) {
                            this.aClass94Array1499[var2 - 30] = var1.readString();
                            if (this.aClass94Array1499[-30 + var2].method1531(
                              TextureSampler33.aClass94_3051)) {
                              this.aClass94Array1499[-30 + var2] = null;
                            }
                          } else if (var2 == 40) {
                            var4 = var1.readUnsignedByte();
                            this.aShortArray1477 = new short[var4];
                            this.aShortArray1506 = new short[var4];

                            for (var5 = 0; var5 < var4; ++var5) {
                              this.aShortArray1477[var5] = (short) var1.readUnsignedShort();
                              this.aShortArray1506[var5] = (short) var1.readUnsignedShort();
                            }
                          } else if (var2 != 41) {
                            if (var2 == 42) {
                              var4 = var1.readUnsignedByte();
                              this.aByteArray1513 = new byte[var4];

                              for (var5 = 0; ~var5 > ~var4; ++var5) {
                                this.aByteArray1513[var5] = var1.readByte();
                              }
                            } else if (var2 != 60) {
                              if (~var2 == -63) {
                                this.aBoolean1536 = true;
                              } else if (-65 != ~var2) {
                                if (~var2 == -66) {
                                  this.anInt1479 = var1.readUnsignedShort();
                                } else if (-67 == ~var2) {
                                  this.anInt1488 = var1.readUnsignedShort();
                                } else if (-68 == ~var2) {
                                  this.anInt1481 = var1.readUnsignedShort();
                                } else if (var2 != 69) {
                                  if (70 == var2) {
                                    this.anInt1496 = var1.method787((byte) 123);
                                  } else if (71 == var2) {
                                    this.anInt1511 = var1.method787((byte) 94);
                                  } else if (72 == var2) {
                                    this.anInt1534 = var1.method787((byte) 76);
                                  } else if (var2 != 73) {
                                    if (var2 != 74) {
                                      if (75 == var2) {
                                        this.anInt1540 = var1.readUnsignedByte();
                                      } else if (~var2 != -78 && -93 != ~var2) {
                                        if (78 != var2) {
                                          if (~var2 != -80) {
                                            if (81 != var2) {
                                              if (~var2 != -83) {
                                                if (var2 != 88) {
                                                  if (-90 != ~var2) {
                                                    if (90 != var2) {
                                                      if (var2 == 91) {
                                                        this.aBoolean1491 = true;
                                                      } else if (-94 == ~var2) {
                                                        this.aByte1505 = 3;
                                                        this.aShort1500 =
                                                          (short) var1.readUnsignedShort();
                                                      } else if (var2 != 94) {
                                                        if (~var2 == -96) {
                                                          this.aByte1505 = 5;
                                                        } else if (~var2 != -97) {
                                                          if (~var2 == -98) {
                                                            this.aBoolean1537 = true;
                                                          } else if (var2 == 98) {
                                                            this.aBoolean1510 = true;
                                                          } else if (~var2 != -100) {
                                                            if (-101 == ~var2) {
                                                              this.anInt1520 =
                                                                var1.readUnsignedByte();
                                                              this.anInt1522 =
                                                                var1.readUnsignedShort();
                                                            } else if (~var2 != -102) {
                                                              if (var2 != 102) {
                                                                if (249 == var2) {
                                                                  var4 = var1.readUnsignedByte();
                                                                  if (null == this.aClass130_1501) {
                                                                    var5 = DummyClass53.nearestPo2(
                                                                      (byte) 83, var4);
                                                                    this.aClass130_1501 =
                                                                      new HashTable(var5);
                                                                  }

                                                                  for (
                                                                    var5 = 0; var4 > var5; ++var5) {
                                                                    boolean var10 = -2
                                                                      == ~var1.readUnsignedByte();
                                                                    int var7 =
                                                                      var1.readUnsignedMedium(
                                                                        (byte) 122);
                                                                    Object var8;
                                                                    if (!var10) {
                                                                      var8 = new IntegerNode(
                                                                        var1.readInt());
                                                                    } else {
                                                                      var8 = new StringNode(
                                                                        var1.readString());
                                                                    }

                                                                    this.aClass130_1501.put(
                                                                      (long) var7, (Node) var8);
                                                                  }
                                                                }
                                                              } else {
                                                                this.anInt1516 =
                                                                  var1.readUnsignedShort();
                                                              }
                                                            } else {
                                                              this.anInt1478 =
                                                                var1.readUnsignedByte();
                                                            }
                                                          } else {
                                                            this.anInt1493 =
                                                              var1.readUnsignedByte();
                                                            this.anInt1517 =
                                                              var1.readUnsignedShort();
                                                          }
                                                        } else {
                                                          this.aBoolean1507 = true;
                                                        }
                                                      } else {
                                                        this.aByte1505 = 4;
                                                      }
                                                    } else {
                                                      this.aBoolean1502 = true;
                                                    }
                                                  } else {
                                                    this.aBoolean1492 = false;
                                                  }
                                                } else {
                                                  this.aBoolean1503 = false;
                                                }
                                              } else {
                                                this.aBoolean1530 = true;
                                              }
                                            } else {
                                              this.aByte1505 = 2;
                                              this.aShort1500 =
                                                (short) (256 * var1.readUnsignedByte());
                                            }
                                          } else {
                                            this.anInt1518 = var1.readUnsignedShort();
                                            this.anInt1515 = var1.readUnsignedShort();
                                            this.anInt1484 = var1.readUnsignedByte();
                                            var4 = var1.readUnsignedByte();
                                            this.anIntArray1539 = new int[var4];

                                            for (var5 = 0; ~var4 < ~var5; ++var5) {
                                              this.anIntArray1539[var5] = var1.readUnsignedShort();
                                            }
                                          }
                                        } else {
                                          this.anInt1512 = var1.readUnsignedShort();
                                          this.anInt1484 = var1.readUnsignedByte();
                                        }
                                      } else {
                                        var4 = -1;
                                        this.anInt1526 = var1.readUnsignedShort();
                                        if ('\uffff' == this.anInt1526) {
                                          this.anInt1526 = -1;
                                        }

                                        this.anInt1532 = var1.readUnsignedShort();
                                        if ('\uffff' == this.anInt1532) {
                                          this.anInt1532 = -1;
                                        }

                                        if (92 == var2) {
                                          var4 = var1.readUnsignedShort();
                                          if (var4 == '\uffff') {
                                            var4 = -1;
                                          }
                                        }

                                        var5 = var1.readUnsignedByte();
                                        this.anIntArray1524 = new int[var5 - -2];

                                        for (int var6 = 0; var5 >= var6; ++var6) {
                                          this.anIntArray1524[var6] = var1.readUnsignedShort();
                                          if ('\uffff' == this.anIntArray1524[var6]) {
                                            this.anIntArray1524[var6] = -1;
                                          }
                                        }

                                        this.anIntArray1524[1 + var5] = var4;
                                      }
                                    } else {
                                      this.aBoolean1498 = true;
                                    }
                                  } else {
                                    this.aBoolean1483 = true;
                                  }
                                } else {
                                  this.anInt1533 = var1.readUnsignedByte();
                                }
                              } else {
                                this.aBoolean1525 = false;
                              }
                            } else {
                              this.anInt1482 = var1.readUnsignedShort();
                            }
                          } else {
                            var4 = var1.readUnsignedByte();
                            this.aShortArray1495 = new short[var4];
                            this.aShortArray1476 = new short[var4];

                            for (var5 = 0; ~var5 > ~var4; ++var5) {
                              this.aShortArray1476[var5] = (short) var1.readUnsignedShort();
                              this.aShortArray1495[var5] = (short) var1.readUnsignedShort();
                            }
                          }
                        } else {
                          this.anInt1494 = var1.readByte();
                        }
                      } else {
                        this.anInt1538 = 1;
                      }
                    } else {
                      this.aBoolean1542 = true;
                    }
                  } else {
                    this.aBoolean1541 = true;
                  }
                } else {
                  this.aByte1505 = 1;
                }
              } else {
                this.anInt1529 = var1.readUnsignedByte();
              }
            } else {
              this.aBoolean1486 = false;
            }
          } else {
            this.anInt1538 = 0;
            this.aBoolean1486 = false;
          }
        } else {
          this.anInt1485 = var1.readUnsignedByte();
        }
      } else {
        var4 = var1.readUnsignedByte();
        if (~var4 < -1) {
          if (null != this.anIntArray1519 && !Cache.aBoolean742) {
            var1.position += var4 * 2;
          } else {
            this.anIntArray1519 = new int[var4];
            this.anIntArray1487 = null;

            for (var5 = 0; var4 > var5; ++var5) {
              this.anIntArray1519[var5] = var1.readUnsignedShort();
            }
          }
        }
      }

    } catch (RuntimeException var9) {
      throw AbstractGameWorld.cascadeException(var9,
        "pb.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
    }
  }

  final boolean method1694(boolean var1) {
    try {
      if (null == this.anIntArray1519) {
        return true;
      } else {
        boolean var2 = true;

        for (int var3 = 0; ~this.anIntArray1519.length < ~var3; ++var3) {
          var2 &= LinearHashTable.aClass153_1043.method2129((byte) 64, 0,
            '\uffff' & this.anIntArray1519[var3]);
        }

        return var1 ? true : var2;
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "pb.I(" + var1 + ')');
    }
  }

  private final GlModel method1695(int var1, boolean var2, boolean var3, int var4) {
    try {
      int var6 = this.anInt1494 + 64;
      int var7 = 5 * this.anInt1489 + 768;
      GlModel var5 = null;
      int var8;
      int var12;
      if (this.anIntArray1487 != null) {
        var8 = -1;

        int var9;
        for (var9 = 0; ~var9 > ~this.anIntArray1487.length; ++var9) {
          if (~this.anIntArray1487[var9] == ~var4) {
            var8 = var9;
            break;
          }
        }

        if (0 == ~var8) {
          return null;
        }

        var9 = this.anIntArray1519[var8];
        if (var2) {
          var9 += 65536;
        }

        var5 = (GlModel) DummyClass54.aClass93_1401.get((long) var9);
        if (null == var5) {
          Model var10 = Model.getModel(LinearHashTable.aClass153_1043, '\uffff' & var9, 0);
          if (null == var10) {
            return null;
          }

          var5 = new GlModel(var10, var6, var7, var2);
          DummyClass54.aClass93_1401.get((byte) -101, var5, (long) var9);
        }
      } else {
        if (var4 != 10) {
          return null;
        }

        if (this.anIntArray1519 == null) {
          return null;
        }

        var8 = this.anIntArray1519.length;
        if (-1 == ~var8) {
          return null;
        }

        long var16 = 0L;

        for (int var11 = 0; ~var8 < ~var11; ++var11) {
          var16 = (long) this.anIntArray1519[var11] + var16 * 67783L;
        }

        if (var2) {
          var16 = ~var16;
        }

        var5 = (GlModel) DummyClass54.aClass93_1401.get(var16);
        if (null == var5) {
          Model var17 = null;

          for (var12 = 0; ~var8 < ~var12; ++var12) {
            var17 =
              Model.getModel(LinearHashTable.aClass153_1043, this.anIntArray1519[var12] & '\uffff',
                0);
            if (null == var17) {
              return null;
            }

            if (var8 > 1) {
              Something3dRoot.aClass140_Sub5Array2058[var12] = var17;
            }
          }

          if (1 < var8) {
            var17 = new Model(Something3dRoot.aClass140_Sub5Array2058, var8);
          }

          var5 = new GlModel(var17, var6, var7, var2);
          DummyClass54.aClass93_1401.get((byte) -75, var5, var16);
        }
      }

      boolean var14 = this.aBoolean1536;
      if (~var4 == -3 && var1 > 3) {
        var14 = !var14;
      }

      boolean var15 = 128 == this.anInt1488 && -1 == ~this.anInt1511;
      boolean var18 =
        -1 == ~var1 && 128 == this.anInt1479 && ~this.anInt1481 == -129 && ~this.anInt1496 == -1
          && this.anInt1534 == 0 && !var14;
      GlModel var19 = var5.createCopy(var18, var15, this.aShortArray1477 == null, true,
        ~var5.method1903() == ~var6, -1 == ~var1 && !var14, var3, ~var7 == ~var5.method1924(), true,
        !var14, this.aShortArray1476 == null);
      if (var14) {
        var19.method1931();
      }

      if (var4 == 4 && 3 < var1) {
        var19.method1932(256);
        var19.method1897(45, 0, -45);
      }

      var1 &= 3;
      if (1 == var1) {
        var19.method1925();
      } else if (~var1 != -3) {
        if (~var1 == -4) {
          var19.method1902();
        }
      } else {
        var19.method1911();
      }

      if (null != this.aShortArray1477) {
        for (var12 = 0; ~this.aShortArray1477.length < ~var12; ++var12) {
          var19.method1918(this.aShortArray1477[var12], this.aShortArray1506[var12]);
        }
      }

      if (null != this.aShortArray1476) {
        for (var12 = 0; ~this.aShortArray1476.length < ~var12; ++var12) {
          var19.method1916(this.aShortArray1476[var12], this.aShortArray1495[var12]);
        }
      }

      if (this.anInt1479 != 128 || -129 != ~this.anInt1488 || ~this.anInt1481 != -129) {
        var19.scale(this.anInt1479, this.anInt1488, this.anInt1481);
      }

      if (-1 != ~this.anInt1496 || this.anInt1511 != 0 || 0 != this.anInt1534) {
        var19.method1897(this.anInt1496, this.anInt1511, this.anInt1534);
      }

      if (var6 != var19.method1903()) {
        var19.method1914(var6);
      }

      if (var19.method1924() != var7) {
        var19.method1909(var7);
      }

      return var19;
    } catch (RuntimeException var13) {
      throw AbstractGameWorld.cascadeException(var13,
        "pb.L(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
    }
  }

  final SceneShadowMap method1696(int var1, int var2, int[][] var3, int var4, int var5,
                                  int[][] var6, boolean var7, SoftwareIndexedColorSprite var8,
                                  byte var9, boolean var10, int var11) {
    try {
      if (var9 >= -5) {
        return null;
      } else {
        long var12;
        if (!GlRenderer.useOpenGlRenderer) {
          if (this.anIntArray1487 != null) {
            var12 = (long) ((var4 << 3) + ((this.anInt1527 << 10) - -var1));
          } else {
            var12 = (long) ((this.anInt1527 << 10) + var1);
          }

          boolean var20;
          if (var7 && this.aBoolean1541) {
            var12 |= Long.MIN_VALUE;
            var20 = true;
          } else {
            var20 = false;
          }

          Object var22 = ObjectNode.aClass93_4051.get(var12);
          if (null == var22) {
            Model var21 = this.method1686(var1, var4, -1);
            if (var21 == null) {
              FloorUnderlay.aClass136_1413.node = null;
              return FloorUnderlay.aClass136_1413;
            }

            var21.method2010();
            if (-11 == ~var4 && var1 > 3) {
              var21.method2011(256);
            }

            if (!var20) {
              var22 =
                new SoftwareModel(var21, 64 - -this.anInt1494, 5 * this.anInt1489 + 768, -50, -10,
                  -50);
            } else {
              var21.aShort2879 = (short) (64 + this.anInt1494);
              var22 = var21;
              var21.aShort2876 = (short) (768 + 5 * this.anInt1489);
              var21.updateNormals();
            }

            ObjectNode.aClass93_4051.get((byte) -89, var22, var12);
          }

          if (var20) {
            var22 = ((Model) var22).copy();
          }

          if (0 != this.aByte1505) {
            if (!(var22 instanceof SoftwareModel)) {
              if (var22 instanceof Model) {
                var22 =
                  ((Model) var22).method1999(this.aByte1505, this.aShort1500, var3, var6, var2,
                    var5, var11, true, false);
              }
            } else {
              var22 =
                ((SoftwareModel) var22).method1941(this.aByte1505, this.aShort1500, var3, var6,
                  var2, var5, var11, true);
            }
          }

          FloorUnderlay.aClass136_1413.node = (SceneNode) var22;
          return FloorUnderlay.aClass136_1413;
        } else {
          if (null != this.anIntArray1487) {
            var12 = (long) (var1 + (this.anInt1527 << 10) - -(var4 << 3));
          } else {
            var12 = (long) ((this.anInt1527 << 10) + var1);
          }

          SceneShadowMap var16 = (SceneShadowMap) ObjectNode.aClass93_4051.get(var12);
          GlModel var14;
          SoftwareIndexedColorSprite var15;
          if (null == var16) {
            var14 = this.method1695(var1, false, true, var4);
            if (null == var14) {
              FloorUnderlay.aClass136_1413.node = null;
              FloorUnderlay.aClass136_1413.shadow = null;
              return FloorUnderlay.aClass136_1413;
            }

            if (~var4 == -11 && var1 > 3) {
              var14.method1876(256);
            }

            if (var10) {
              var15 = var14.createShadowMap(var8);
            } else {
              var15 = null;
            }

            var16 = new SceneShadowMap();
            var16.node = var14;
            var16.shadow = var15;
            ObjectNode.aClass93_4051.get((byte) -93, var16, var12);
          } else {
            var14 = (GlModel) var16.node;
            var15 = var16.shadow;
          }

          boolean var17 = this.aBoolean1541 & var7;
          GlModel var18 =
            var14.createCopy(3 != this.aByte1505, ~this.aByte1505 == -1, true, true, true, true,
              !var17, true, true, true, true);
          if (~this.aByte1505 != -1) {
            var18.method1919(this.aByte1505, this.aShort1500, var14, var3, var6, var2, var5, var11);
          }

          var18.method1920(~this.anInt1529 == -1 && !this.aBoolean1510, true, true, true,
            -1 == ~this.anInt1529, true, false);
          FloorUnderlay.aClass136_1413.node = var18;
          var18.aBoolean3809 = var17;
          FloorUnderlay.aClass136_1413.shadow = var15;
          return FloorUnderlay.aClass136_1413;
        }
      }
    } catch (RuntimeException var19) {
      throw AbstractGameWorld.cascadeException(var19,
        "pb.A(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ','
          + var5 + ',' + (var6 != null ? "{...}" : "null") + ',' + var7 + ',' + (var8 != null ?
          "{...}" :
          "null") + ',' + var9 + ',' + var10 + ',' + var11 + ')');
    }
  }

  final SceneShadowMap method1697(int var1, int var2, SoftwareIndexedColorSprite var3, int var4,
                                  AnimationSequence var5, int var6, int[][] var7, boolean var8,
                                  int var9, int var10, int[][] var11, int var12, int var13,
                                  int var14) {
    try {
      if (var10 != 8308) {
        this.method1694(false);
      }

      long var15;
      if (GlRenderer.useOpenGlRenderer) {
        if (this.anIntArray1487 != null) {
          var15 = (long) ((var13 << 3) + ((this.anInt1527 << 10) - -var6));
        } else {
          var15 = (long) (var6 + (this.anInt1527 << 10));
        }

        GlModel var23 = (GlModel) DummyClass14.aClass93_1965.get(var15);
        if (var23 == null) {
          var23 = this.method1695(var6, true, true, var13);
          if (null == var23) {
            return null;
          }

          var23.method1908();
          var23.method1920(false, false, false, true, false, false, true);
          DummyClass14.aClass93_1965.get((byte) -75, var23, var15);
        }

        boolean var19 = false;
        GlModel var22 = var23;
        if (null != var5) {
          var22 = (GlModel) var5.method2056(var12, var9, var14, var6, var23, 3);
          var19 = true;
        }

        if (~var13 == -11 && 3 < var6) {
          if (!var19) {
            var22 = (GlModel) var22.method1890(true, true, true);
            var19 = true;
          }

          var22.method1876(256);
        }

        if (var8) {
          FloorUnderlay.aClass136_1413.shadow = var22.createShadowMap(var3);
        } else {
          FloorUnderlay.aClass136_1413.shadow = null;
        }

        if (this.aByte1505 != 0) {
          if (!var19) {
            var19 = true;
            var22 = (GlModel) var22.method1890(true, true, true);
          }

          var22.method1919(this.aByte1505, this.aShort1500, var23, var7, var11, var2, var4, var1);
        }

        FloorUnderlay.aClass136_1413.node = var22;
        return FloorUnderlay.aClass136_1413;
      } else {
        if (this.anIntArray1487 == null) {
          var15 = (long) ((this.anInt1527 << 10) + var6);
        } else {
          var15 = (long) (var6 + (this.anInt1527 << 10) + (var13 << 3));
        }

        SoftwareModel var17 = (SoftwareModel) DummyClass14.aClass93_1965.get(var15);
        if (var17 == null) {
          Model var18 = this.method1686(var6, var13, -1);
          if (var18 == null) {
            return null;
          }

          var17 =
            new SoftwareModel(var18, 64 + this.anInt1494, this.anInt1489 * 5 + 768, -50, -10, -50);
          DummyClass14.aClass93_1965.get((byte) -94, var17, var15);
        }

        boolean var21 = false;
        if (var5 != null) {
          var21 = true;
          var17 = (SoftwareModel) var5.method2054(19749, var9, var12, var17, var6, var14);
        }

        if (-11 == ~var13 && var6 > 3) {
          if (!var21) {
            var21 = true;
            var17 = (SoftwareModel) var17.method1890(true, true, true);
          }

          var17.method1876(256);
        }

        if (this.aByte1505 != 0) {
          if (!var21) {
            var17 = (SoftwareModel) var17.method1890(true, true, true);
            var21 = true;
          }

          var17 =
            var17.method1941(this.aByte1505, this.aShort1500, var7, var11, var2, var4, var1, false);
        }

        FloorUnderlay.aClass136_1413.node = var17;
        return FloorUnderlay.aClass136_1413;
      }
    } catch (RuntimeException var20) {
      throw AbstractGameWorld.cascadeException(var20,
        "pb.M(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ',' + (
          var5 != null ?
            "{...}" :
            "null") + ',' + var6 + ',' + (var7 != null ? "{...}" : "null") + ',' + var8 + ',' + var9
          + ',' + var10 + ',' + (var11 != null ? "{...}" : "null") + ',' + var12 + ',' + var13 + ','
          + var14 + ')');
    }
  }

  final GameString method1698(GameString var1, int var2, int var3) {
    try {
      if (var2 != -23085) {
        method1688(108, -11, 57);
      }

      if (null != this.aClass130_1501) {
        StringNode var4 = (StringNode) this.aClass130_1501.get((long) var3);
        return var4 == null ? var1 : var4.aClass94_2586;
      } else {
        return var1;
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "pb.E(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
    }
  }

  public static void method1687(int var0) {
    try {
      aClass94_1508 = null;
      aClass94_1523 = null;
      anIntArrayArrayArray1497 = null;
      aBooleanArray1490 = null;
      aClass94_1509 = null;
      if (var0 != -11) {
        anInt1521 = -96;
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "pb.B(" + var0 + ')');
    }
  }

  static final SomethingScene method1688(int var0, int var1, int var2) {
    SceneGraphTile var3 = SomethingTexture1.sceneGraphTiles[var0][var1][var2];
    if (var3 == null) {
      return null;
    } else {
      SomethingScene var4 = var3.aClass72_2245;
      var3.aClass72_2245 = null;
      return var4;
    }
  }

}
