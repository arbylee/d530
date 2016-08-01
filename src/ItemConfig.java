import java.awt.Component;
import java.io.UnsupportedEncodingException;
import java.util.Date;

final class ItemConfig {

  private static GameString aClass94_806;
  private static GameString aClass94_811;
  static int anInt759;
  static int anInt763;
  static int[] anIntArray781 = new int[99];
  static GameString aClass94_808;
  static GameString aClass94_809;

  static {
    int var0 = 0;

    for (int var1 = 0; var1 < 99; ++var1) {
      int var2 = 1 + var1;
      int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
      var0 += var3;
      anIntArray781[var1] = var0 / 4;
    }

    aClass94_808 = SpawnedGameObject.createString(" zuerst von Ihrer Ignorieren)2Liste(Q");
    aClass94_811 = SpawnedGameObject.createString("green:");
    aClass94_809 = aClass94_811;
    aClass94_806 = aClass94_811;
  }

  int translateOther;
  int anInt756 = -1;
  int anInt757 = 1;
  int anInt758;
  int anInt761;
  int anInt762;
  int anInt764;
  int[] anIntArray766;
  int anInt767;
  int rotationZ;
  GameString aClass94_770;
  boolean aBoolean779;
  int anInt782 = 0;
  GameString[] inventoryOptions;
  int rotationX;
  int anInt787;
  int anInt788;
  int anInt789;
  int anInt791;
  int translateX;
  int anInt793;
  int anInt795;
  HashTable aClass130_798;
  int rotationY;
  int anInt800;
  GameString[] aClass94Array801;
  int[] anIntArray804;
  boolean aBoolean807;
  int anInt810;
  private short[] aShortArray751;
  private int anInt752;
  private int anInt753 = -1;
  private int anInt755;
  private int anInt760 = 0;
  private short[] aShortArray765;
  private int anInt769;
  private int anInt771;
  private short[] aShortArray772;
  private int anInt773 = -1;
  private short[] aShortArray774;
  private int anInt775;
  private int anInt776 = -1;
  private int anInt777;
  private int anInt778;
  private int anInt780;
  private int anInt784;
  private byte[] aByteArray785;
  private int anInt790;
  private int anInt794;
  private int anInt796;
  private int anInt797;
  private int anInt802;
  private int anInt803;
  private int anInt805;

  public ItemConfig() {
    this.aClass94_770 = DummyClass59.aClass94_672;
    this.anInt775 = 0;
    this.anInt784 = 0;
    this.anInt769 = -1;
    this.anInt796 = -1;
    this.anInt791 = -1;
    this.anInt777 = 0;
    this.anInt780 = 128;
    this.anInt767 = -1;
    this.anInt758 = -1;
    this.rotationZ = 0;
    this.anInt762 = -1;
    this.anInt795 = -1;
    this.anInt761 = -1;
    this.anInt771 = -1;
    this.translateOther = 0;
    this.rotationX = 0;
    this.rotationY = 0;
    this.anInt800 = 0;
    this.anInt764 = 0;
    this.anInt789 = -1;
    this.anInt794 = -1;
    this.anInt788 = -1;
    this.anInt797 = 128;
    this.aBoolean779 = false;
    this.anInt752 = 0;
    this.translateX = 0;
    this.anInt803 = -1;
    this.anInt802 = 0;
    this.anInt793 = -1;
    this.aClass94Array801 =
      new GameString[] {null, null, TextureSampler29.aClass94_3397, null, null};
    this.anInt805 = 128;
    this.anInt790 = 0;
    this.anInt778 = 0;
    this.inventoryOptions = new GameString[] {null, null, null, null, GameObject.OPTION_DROP};
    this.anInt810 = 2000;
    this.aBoolean807 = false;
  }

  final boolean method1102(boolean var1, boolean var2) {
    try {
      int var3 = this.anInt803;
      int var4 = this.anInt796;
      if (var1) {
        var3 = this.anInt773;
        var4 = this.anInt753;
      }

      if (var2) {
        this.method1113(41, null);
      }

      if (~var3 == 0) {
        return true;
      } else {
        boolean var5 = true;
        if (!StringNode.aClass153_2581.method2129((byte) -75, 0, var3)) {
          var5 = false;
        }

        if (~var4 != 0 && !StringNode.aClass153_2581.method2129((byte) 58, 0, var4)) {
          var5 = false;
        }

        return var5;
      }
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6, "h.G(" + var1 + ',' + var2 + ')');
    }
  }

  private final GameString method1105(int var1, GameString var2, int var3) {
    try {
      if (this.aClass130_798 == null) {
        return var2;
      } else {
        if (var1 < 90) {
          method1111(-111);
        }

        StringNode var4 = (StringNode) this.aClass130_798.get((long) var3);
        return null != var4 ? var4.aClass94_2586 : var2;
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "h.S(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
    }
  }

  final ItemConfig method1106(int var1, int var2) {
    try {
      int var3 = 58 % ((-28 - var2) / 48);
      if (this.anIntArray804 != null && -2 > ~var1) {
        int var4 = -1;

        for (int var5 = 0; 10 > var5; ++var5) {
          if (this.anIntArray766[var5] <= var1 && -1 != ~this.anIntArray766[var5]) {
            var4 = this.anIntArray804[var5];
          }
        }

        if (0 != ~var4) {
          return DummyClass35.getItemConfig(var4, (byte) 97);
        }
      }

      return this;
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6, "h.H(" + var1 + ',' + var2 + ')');
    }
  }

  final boolean method1108(byte var1, boolean var2) {
    try {
      int var4 = this.anInt771;
      int var3 = this.anInt793;
      int var6 = 106 % ((var1 - 24) / 58);
      int var5 = this.anInt769;
      if (var2) {
        var5 = this.anInt776;
        var3 = this.anInt761;
        var4 = this.anInt794;
      }

      if (~var3 != 0) {
        boolean var7 = true;
        if (!StringNode.aClass153_2581.method2129((byte) -90, 0, var3)) {
          var7 = false;
        }

        if (~var4 != 0 && !StringNode.aClass153_2581.method2129((byte) -114, 0, var4)) {
          var7 = false;
        }

        if (-1 != var5 && !StringNode.aClass153_2581.method2129((byte) 83, 0, var5)) {
          var7 = false;
        }

        return var7;
      } else {
        return true;
      }
    } catch (RuntimeException var8) {
      throw AbstractGameWorld.cascadeException(var8, "h.C(" + var1 + ',' + var2 + ')');
    }
  }

  final void method1109(byte var1, ItemConfig var2, ItemConfig var3) {
    try {
      this.aByteArray785 = var2.aByteArray785;
      this.anInt778 = var2.anInt778;
      this.aClass130_798 = var2.aClass130_798;
      this.anInt769 = var2.anInt769;
      this.anInt761 = var2.anInt761;
      this.anInt775 = var2.anInt775;
      this.inventoryOptions = new GameString[5];
      this.anInt755 = var3.anInt755;
      this.anInt810 = var3.anInt810;
      this.anInt757 = 0;
      this.anInt782 = var2.anInt782;
      this.anInt773 = var2.anInt773;
      this.aShortArray774 = var2.aShortArray774;
      this.rotationZ = var3.rotationZ;
      this.anInt771 = var2.anInt771;
      this.rotationY = var3.rotationY;
      this.anInt803 = var2.anInt803;
      this.anInt796 = var2.anInt796;
      this.anInt760 = var2.anInt760;
      this.rotationX = var3.rotationX;
      this.translateOther = var3.translateOther;
      this.anInt753 = var2.anInt753;
      this.anInt777 = var2.anInt777;
      this.aShortArray772 = var2.aShortArray772;
      this.anInt802 = var2.anInt802;
      this.anInt752 = var2.anInt752;
      this.translateX = var3.translateX;
      if (var1 != 69) {
        this.anInt757 = 109;
      }

      this.anInt793 = var2.anInt793;
      this.anInt794 = var2.anInt794;
      this.aClass94_770 = var2.aClass94_770;
      this.aShortArray751 = var2.aShortArray751;
      this.aShortArray765 = var2.aShortArray765;
      this.aClass94Array801 = var2.aClass94Array801;
      this.aBoolean779 = var2.aBoolean779;
      this.anInt776 = var2.anInt776;
      if (null != var2.inventoryOptions) {
        for (int var4 = 0; -5 < ~var4; ++var4) {
          this.inventoryOptions[var4] = var2.inventoryOptions[var4];
        }
      }

      this.inventoryOptions[4] = RenderAnimation.aClass94_361;
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "h.J(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + (var3 != null ?
          "{...}" :
          "null") + ')');
    }
  }

  final AbstractModel getModel(int var1, int var2, int var3, AnimationSequence var4, int var5,
                               int var6) {
    try {
      if (var1 < 94) {
        this.anInt755 = -67;
      }

      if (this.anIntArray804 != null && -2 > ~var5) {
        int var7 = -1;

        for (int var8 = 0; var8 < 10; ++var8) {
          if (~var5 <= ~this.anIntArray766[var8] && ~this.anIntArray766[var8] != -1) {
            var7 = this.anIntArray804[var8];
          }
        }

        if (~var7 != 0) {
          return DummyClass35.getItemConfig(var7, (byte) 109)
            .getModel(113, var2, var3, var4, 1, var6);
        }
      }

      AbstractModel var11 = (AbstractModel) DummyClass15.aClass93_1874.get((long) this.anInt787);
      if (var11 == null) {
        Model var12 = Model.getModel(StringNode.aClass153_2581, this.anInt755, 0);
        if (null == var12) {
          return null;
        }

        int var9;
        if (null != this.aShortArray774) {
          for (var9 = 0; this.aShortArray774.length > var9; ++var9) {
            if (null != this.aByteArray785 && ~var9 > ~this.aByteArray785.length) {
              var12.replaceColor(this.aShortArray774[var9],
                TextureSampler38.aShortArray3453[this.aByteArray785[var9] & 255]);
            } else {
              var12.replaceColor(this.aShortArray774[var9], this.aShortArray772[var9]);
            }
          }
        }

        if (this.aShortArray765 != null) {
          for (var9 = 0; var9 < this.aShortArray765.length; ++var9) {
            var12.replaceMaterial(this.aShortArray765[var9], this.aShortArray751[var9]);
          }
        }

        var11 = var12.method2008(this.anInt784 + 64, 768 + this.anInt790, -50, -10, -50);
        if (~this.anInt805 != -129 || this.anInt780 != 128 || ~this.anInt797 != -129) {
          var11.scale(this.anInt805, this.anInt780, this.anInt797);
        }

        var11.aBoolean2699 = true;
        if (GlRenderer.useOpenGlRenderer) {
          ((GlModel) var11).method1920(false, false, false, true, false, false, true);
        }

        DummyClass15.aClass93_1874.get((byte) -123, var11, (long) this.anInt787);
      }

      if (var4 != null) {
        var11 = var4.method2055(var11, (byte) -88, var2, var3, var6);
      }

      return var11;
    } catch (RuntimeException var10) {
      throw AbstractGameWorld.cascadeException(var10,
        "h.E(" + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ','
          + var5 + ',' + var6 + ')');
    }
  }

  final void method1112(int var1) {
    try {
      if (var1 != 5401) {
        method1103(null, null, true);
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "h.O(" + var1 + ')');
    }
  }

  final void method1113(int var1, Buffer var2) {
    try {
      while (true) {
        int var3 = var2.readUnsignedByte();
        if (0 == var3) {
          if (var1 != 1) {
            this.anInt789 = -40;
          }

          return;
        }

        this.method1114((byte) -72, var2, var3);
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "h.M(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
    }
  }

  private final void method1114(byte var1, Buffer var2, int var3) {
    try {
      int var4 = -118 % ((var1 - 48) / 61);
      if (~var3 != -2) {
        if (var3 != 2) {
          if (-5 == ~var3) {
            this.anInt810 = var2.readUnsignedShort();
          } else if (~var3 == -6) {
            this.rotationX = var2.readUnsignedShort();
          } else if (~var3 == -7) {
            this.rotationY = var2.readUnsignedShort();
          } else if (~var3 == -8) {
            this.translateX = var2.readUnsignedShort();
            if (~this.translateX < -32768) {
              this.translateX -= 65536;
            }
          } else if (~var3 != -9) {
            if (var3 == 11) {
              this.anInt764 = 1;
            } else if (-13 == ~var3) {
              this.anInt757 = var2.readInt();
            } else if (-17 != ~var3) {
              if (23 == var3) {
                this.anInt793 = var2.readUnsignedShort();
              } else if (var3 != 24) {
                if (~var3 != -26) {
                  if (~var3 != -27) {
                    if (var3 >= 30 && -36 < ~var3) {
                      this.aClass94Array801[-30 + var3] = var2.readString();
                      if (this.aClass94Array801[var3 + -30].method1531(
                        TextureSampler33.aClass94_3051)) {
                        this.aClass94Array801[-30 + var3] = null;
                      }
                    } else if (35 <= var3 && 40 > var3) {
                      this.inventoryOptions[-35 + var3] = var2.readString();
                    } else {
                      int var5;
                      int var6;
                      if (-41 != ~var3) {
                        if (-42 == ~var3) {
                          var5 = var2.readUnsignedByte();
                          this.aShortArray751 = new short[var5];
                          this.aShortArray765 = new short[var5];

                          for (var6 = 0; ~var5 < ~var6; ++var6) {
                            this.aShortArray765[var6] = (short) var2.readUnsignedShort();
                            this.aShortArray751[var6] = (short) var2.readUnsignedShort();
                          }
                        } else if (42 == var3) {
                          var5 = var2.readUnsignedByte();
                          this.aByteArray785 = new byte[var5];

                          for (var6 = 0; ~var6 > ~var5; ++var6) {
                            this.aByteArray785[var6] = var2.readByte();
                          }
                        } else if (var3 == 65) {
                          this.aBoolean807 = true;
                        } else if (-79 != ~var3) {
                          if (-80 == ~var3) {
                            this.anInt776 = var2.readUnsignedShort();
                          } else if (90 == var3) {
                            this.anInt803 = var2.readUnsignedShort();
                          } else if (var3 == 91) {
                            this.anInt773 = var2.readUnsignedShort();
                          } else if (var3 != 92) {
                            if (var3 != 93) {
                              if (-96 == ~var3) {
                                this.rotationZ = var2.readUnsignedShort();
                              } else if (-97 == ~var3) {
                                this.anInt800 = var2.readUnsignedByte();
                              } else if (var3 == 97) {
                                this.anInt789 = var2.readUnsignedShort();
                              } else if (-99 == ~var3) {
                                this.anInt791 = var2.readUnsignedShort();
                              } else if (-101 >= ~var3 && ~var3 > -111) {
                                if (null == this.anIntArray804) {
                                  this.anIntArray804 = new int[10];
                                  this.anIntArray766 = new int[10];
                                }

                                this.anIntArray804[-100 + var3] = var2.readUnsignedShort();
                                this.anIntArray766[var3 + -100] = var2.readUnsignedShort();
                              } else if (110 != var3) {
                                if (~var3 != -112) {
                                  if (-113 == ~var3) {
                                    this.anInt797 = var2.readUnsignedShort();
                                  } else if (-114 != ~var3) {
                                    if (~var3 == -115) {
                                      this.anInt790 = 5 * var2.readByte();
                                    } else if (var3 == 115) {
                                      this.anInt782 = var2.readUnsignedByte();
                                    } else if (var3 != 121) {
                                      if (var3 == 122) {
                                        this.anInt762 = var2.readUnsignedShort();
                                      } else if (125 != var3) {
                                        if (~var3 == -127) {
                                          this.anInt777 = var2.readByte();
                                          this.anInt802 = var2.readByte();
                                          this.anInt752 = var2.readByte();
                                        } else if (var3 == 127) {
                                          this.anInt767 = var2.readUnsignedByte();
                                          this.anInt758 = var2.readUnsignedShort();
                                        } else if (~var3 != -129) {
                                          if (-130 != ~var3) {
                                            if (-131 == ~var3) {
                                              var2.readUnsignedByte();
                                              var2.readUnsignedShort();
                                            } else if (249 == var3) {
                                              var5 = var2.readUnsignedByte();
                                              if (null == this.aClass130_798) {
                                                var6 = DummyClass53.nearestPo2((byte) 97, var5);
                                                this.aClass130_798 = new HashTable(var6);
                                              }

                                              for (var6 = 0; var6 < var5; ++var6) {
                                                boolean var7 = var2.readUnsignedByte() == 1;
                                                int var8 = var2.readUnsignedMedium((byte) 122);
                                                Object var9;
                                                if (!var7) {
                                                  var9 = new IntegerNode(var2.readInt());
                                                } else {
                                                  var9 = new StringNode(var2.readString());
                                                }

                                                this.aClass130_798.put((long) var8, (Node) var9);
                                              }
                                            }
                                          } else {
                                            var2.readUnsignedByte();
                                            var2.readUnsignedShort();
                                          }
                                        } else {
                                          this.anInt788 = var2.readUnsignedByte();
                                          this.anInt756 = var2.readUnsignedShort();
                                        }
                                      } else {
                                        this.anInt760 = var2.readByte();
                                        this.anInt778 = var2.readByte();
                                        this.anInt775 = var2.readByte();
                                      }
                                    } else {
                                      this.anInt795 = var2.readUnsignedShort();
                                    }
                                  } else {
                                    this.anInt784 = var2.readByte();
                                  }
                                } else {
                                  this.anInt780 = var2.readUnsignedShort();
                                }
                              } else {
                                this.anInt805 = var2.readUnsignedShort();
                              }
                            } else {
                              this.anInt753 = var2.readUnsignedShort();
                            }
                          } else {
                            this.anInt796 = var2.readUnsignedShort();
                          }
                        } else {
                          this.anInt769 = var2.readUnsignedShort();
                        }
                      } else {
                        var5 = var2.readUnsignedByte();
                        this.aShortArray772 = new short[var5];
                        this.aShortArray774 = new short[var5];

                        for (var6 = 0; var5 > var6; ++var6) {
                          this.aShortArray774[var6] = (short) var2.readUnsignedShort();
                          this.aShortArray772[var6] = (short) var2.readUnsignedShort();
                        }
                      }
                    }
                  } else {
                    this.anInt794 = var2.readUnsignedShort();
                  }
                } else {
                  this.anInt761 = var2.readUnsignedShort();
                }
              } else {
                this.anInt771 = var2.readUnsignedShort();
              }
            } else {
              this.aBoolean779 = true;
            }
          } else {
            this.translateOther = var2.readUnsignedShort();
            if (this.translateOther > 32767) {
              this.translateOther -= 65536;
            }
          }
        } else {
          this.aClass94_770 = var2.readString();
        }
      } else {
        this.anInt755 = var2.readUnsignedShort();
      }

    } catch (RuntimeException var10) {
      throw AbstractGameWorld.cascadeException(var10,
        "h.Q(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
    }
  }

  final int method1115(int var1, int var2, int var3) {
    try {
      int var4 = -82 % ((-63 - var2) / 55);
      if (this.aClass130_798 != null) {
        IntegerNode var5 = (IntegerNode) this.aClass130_798.get((long) var3);
        return null != var5 ? var5.anInt2467 : var1;
      } else {
        return var1;
      }
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6, "h.I(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  final Model method1116(boolean var1, byte var2) {
    try {
      int var4 = this.anInt796;
      if (var2 != -109) {
        return null;
      } else {
        int var3 = this.anInt803;
        if (var1) {
          var4 = this.anInt753;
          var3 = this.anInt773;
        }

        if (-1 != var3) {
          Model var5 = Model.getModel(StringNode.aClass153_2581, var3, 0);
          if (-1 != var4) {
            Model var6 = Model.getModel(StringNode.aClass153_2581, var4, 0);
            Model[] var7 = new Model[] {var5, var6};
            var5 = new Model(var7, 2);
          }

          int var9;
          if (this.aShortArray774 != null) {
            for (var9 = 0; var9 < this.aShortArray774.length; ++var9) {
              var5.replaceColor(this.aShortArray774[var9], this.aShortArray772[var9]);
            }
          }

          if (this.aShortArray765 != null) {
            for (var9 = 0; ~this.aShortArray765.length < ~var9; ++var9) {
              var5.replaceMaterial(this.aShortArray765[var9], this.aShortArray751[var9]);
            }
          }

          return var5;
        } else {
          return null;
        }
      }
    } catch (RuntimeException var8) {
      throw AbstractGameWorld.cascadeException(var8, "h.A(" + var1 + ',' + var2 + ')');
    }
  }

  final Model method1117(boolean var1, int var2) {
    try {
      int var3 = this.anInt793;
      if (var2 < 77) {
        this.aClass130_798 = null;
      }

      int var4 = this.anInt771;
      int var5 = this.anInt769;
      if (var1) {
        var5 = this.anInt776;
        var3 = this.anInt761;
        var4 = this.anInt794;
      }

      if (~var3 == 0) {
        return null;
      } else {
        Model var6 = Model.getModel(StringNode.aClass153_2581, var3, 0);
        if (0 != ~var4) {
          Model var7 = Model.getModel(StringNode.aClass153_2581, var4, 0);
          if (-1 == var5) {
            Model[] var8 = new Model[] {var6, var7};
            var6 = new Model(var8, 2);
          } else {
            Model var12 = Model.getModel(StringNode.aClass153_2581, var5, 0);
            Model[] var9 = new Model[] {var6, var7, var12};
            var6 = new Model(var9, 3);
          }
        }

        if (!var1 && (~this.anInt760 != -1 || ~this.anInt778 != -1 || -1 != ~this.anInt775)) {
          var6.translate(this.anInt760, this.anInt778, this.anInt775);
        }

        if (var1 && (~this.anInt777 != -1 || ~this.anInt802 != -1 || ~this.anInt752 != -1)) {
          var6.translate(this.anInt777, this.anInt802, this.anInt752);
        }

        int var11;
        if (this.aShortArray774 != null) {
          for (var11 = 0; var11 < this.aShortArray774.length; ++var11) {
            var6.replaceColor(this.aShortArray774[var11], this.aShortArray772[var11]);
          }
        }

        if (this.aShortArray765 != null) {
          for (var11 = 0; var11 < this.aShortArray765.length; ++var11) {
            var6.replaceMaterial(this.aShortArray765[var11], this.aShortArray751[var11]);
          }
        }

        return var6;
      }
    } catch (RuntimeException var10) {
      throw AbstractGameWorld.cascadeException(var10, "h.D(" + var1 + ',' + var2 + ')');
    }
  }

  final void method1118(ItemConfig var1, ItemConfig var2, boolean var3) {
    try {
      this.aClass94_770 = var1.aClass94_770;
      this.anInt810 = var2.anInt810;
      if (var3) {
        this.anInt780 = -70;
      }

      this.aShortArray774 = var2.aShortArray774;
      this.aShortArray772 = var2.aShortArray772;
      this.rotationX = var2.rotationX;
      this.rotationY = var2.rotationY;
      this.aShortArray751 = var2.aShortArray751;
      this.anInt755 = var2.anInt755;
      this.aByteArray785 = var2.aByteArray785;
      this.rotationZ = var2.rotationZ;
      this.anInt757 = var1.anInt757;
      this.anInt764 = 1;
      this.translateOther = var2.translateOther;
      this.translateX = var2.translateX;
      this.aShortArray765 = var2.aShortArray765;
      this.aBoolean779 = var1.aBoolean779;
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "h.N(" + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ','
          + var3 + ')');
    }
  }

  final SoftwareModel method1120(int var1) {
    try {
      Model var2 = Model.getModel(StringNode.aClass153_2581, this.anInt755, 0);
      if (var2 == null) {
        return null;
      } else {
        int var3;
        if (this.aShortArray774 != null) {
          for (var3 = 0; this.aShortArray774.length > var3; ++var3) {
            if (null != this.aByteArray785 && ~var3 > ~this.aByteArray785.length) {
              var2.replaceColor(this.aShortArray774[var3],
                TextureSampler38.aShortArray3453[this.aByteArray785[var3] & 255]);
            } else {
              var2.replaceColor(this.aShortArray774[var3], this.aShortArray772[var3]);
            }
          }
        }

        if (this.aShortArray765 != null) {
          for (var3 = 0; var3 < this.aShortArray765.length; ++var3) {
            var2.replaceMaterial(this.aShortArray765[var3], this.aShortArray751[var3]);
          }
        }

        SoftwareModel var5 =
          var2.method2000(64 - -this.anInt784, 768 - -this.anInt790, -50, -10, -50);
        if (var1 != 18206) {
          this.method1105(-67, null, -37);
        }

        if (-129 != ~this.anInt805 || -129 != ~this.anInt780 || -129 != ~this.anInt797) {
          var5.scale(this.anInt805, this.anInt780, this.anInt797);
        }

        return var5;
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "h.L(" + var1 + ')');
    }
  }

  static final void method1103(FileUnpacker var0, FileUnpacker var1, boolean var2) {
    try {
      TextureSampler31.aClass153_3173 = var0;
      PlayerVariable.aClass153_557 = var1;
      if (!var2) {
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "h.B(" + (var0 != null ? "{...}" : "null") + ',' + (var1 != null ? "{...}" : "null") + ','
          + var2 + ')');
    }
  }

  static final void callScript(byte byte0, int i, ClientScriptCall class3_sub16) {
    Object aobj[] = class3_sub16.arguments;
    int j = ((Integer) aobj[0]).intValue();
    ClientScript class3_sub28_sub15 = ByteArrayNode.method572(j, (byte) -91);
    if (null == class3_sub28_sub15) {
      return;
    }
    NPC.anInt4002 = 0;
    int l = 0;
    int k = 0;
    int i1 = -1;
    int ai1[] = class3_sub28_sub15.anIntArray3690;
    int ai[] = class3_sub28_sub15.anIntArray3683;
    if (byte0 > -9) {
      aClass94_811 = null;
    }
    byte byte1 = -1;
    SomethingTilek.anIntArray1662 = new int[class3_sub28_sub15.anInt3680];
    int k1 = 0;
    DummyClass56.aClass94Array1454 = new GameString[class3_sub28_sub15.anInt3687];
    int l1 = 0;
    for (int i2 = 1; ~i2 > ~aobj.length; i2++) {
      if (aobj[i2] instanceof Integer) {
        int k2 = ((Integer) aobj[i2]).intValue();
        if (~k2 == 0x7ffffffe) {
          k2 = class3_sub16.anInt2447;
        }
        if (0x80000002 == k2) {
          k2 = class3_sub16.anInt2441;
        }
        if (0x7ffffffc == ~k2) {
          k2 = null == class3_sub16.aClass11_2449 ? -1 : class3_sub16.aClass11_2449.anInt279;
        }
        if (0x80000004 == k2) {
          k2 = class3_sub16.anInt2445;
        }
        if (0x7ffffffa == ~k2) {
          k2 = null == class3_sub16.aClass11_2449 ? -1 : class3_sub16.aClass11_2449.anInt191;
        }
        if (~k2 == 0x7ffffff9) {
          k2 = null == class3_sub16.aClass11_2438 ? -1 : class3_sub16.aClass11_2438.anInt279;
        }
        if (0x7ffffff8 == ~k2) {
          k2 = class3_sub16.aClass11_2438 != null ? class3_sub16.aClass11_2438.anInt191 : -1;
        }
        if (0x7ffffff7 == ~k2) {
          k2 = class3_sub16.anInt2444;
        }
        if (0x7ffffff6 == ~k2) {
          k2 = class3_sub16.anInt2443;
        }
        SomethingTilek.anIntArray1662[k1++] = k2;
        continue;
      }
      if (!(aobj[i2] instanceof GameString)) {
        continue;
      }
      GameString class94 = (GameString) aobj[i2];
      if (class94.method1528((byte) -42, Widget.EVENT_OP_BASE)) {
        class94 = class3_sub16.aClass94_2439;
      }
      DummyClass56.aClass94Array1454[l1++] = class94;
    }

    int j2 = 0;
    label0:
    do {
      j2++;
      if (i < j2) {
        throw new RuntimeException("slow");
      }
      int j1 = ai[++i1];
      if (j1 < 100) {
        if (~j1 == -1) {
          GroundItem.anIntArray2929[k++] = ai1[i1];
          continue;
        }
        if (~j1 == -2) {
          int l2 = ai1[i1];
          GroundItem.anIntArray2929[k++] = DummyClass5.anIntArray2985[l2];
          continue;
        }
        if (-3 == ~j1) {
          int i3 = ai1[i1];
          BlockConfig.method1428(i3, 63, GroundItem.anIntArray2929[--k]);
          continue;
        }
        if (~j1 == -4) {
          Node.aClass94Array75[l++] = class3_sub28_sub15.aClass94Array3688[i1];
          continue;
        }
        if (j1 == 6) {
          i1 += ai1[i1];
          continue;
        }
        if (7 == j1) {
          k -= 2;
          if (GroundItem.anIntArray2929[k] != GroundItem.anIntArray2929[1 + k]) {
            i1 += ai1[i1];
          }
          continue;
        }
        if (~j1 == -9) {
          k -= 2;
          if (~GroundItem.anIntArray2929[k + 1] == ~GroundItem.anIntArray2929[k]) {
            i1 += ai1[i1];
          }
          continue;
        }
        if (9 == j1) {
          k -= 2;
          if (~GroundItem.anIntArray2929[k] > ~GroundItem.anIntArray2929[1 + k]) {
            i1 += ai1[i1];
          }
          continue;
        }
        if (-11 == ~j1) {
          k -= 2;
          if (GroundItem.anIntArray2929[k - -1] < GroundItem.anIntArray2929[k]) {
            i1 += ai1[i1];
          }
          continue;
        }
        if (j1 == 21) {
          if (-1 == ~NPC.anInt4002) {
            return;
          }
          ScriptState class54 = Mobile.aClass54Array2841[--NPC.anInt4002];
          class3_sub28_sub15 = class54.aClass3_Sub28_Sub15_874;
          SomethingTilek.anIntArray1662 = class54.anIntArray870;
          ai = class3_sub28_sub15.anIntArray3683;
          i1 = class54.anInt877;
          DummyClass56.aClass94Array1454 = class54.aClass94Array873;
          ai1 = class3_sub28_sub15.anIntArray3690;
          continue;
        }
        if (~j1 == -26) {
          int j3 = ai1[i1];
          GroundItem.anIntArray2929[k++] = NpcConfiguration.method1484(0x3dd4def, j3);
          continue;
        }
        if (~j1 == -28) {
          int k3 = ai1[i1];
          TextureSampler3.method306(k3, false, GroundItem.anIntArray2929[--k]);
          continue;
        }
        if (31 == j1) {
          k -= 2;
          if (~GroundItem.anIntArray2929[1 + k] <= ~GroundItem.anIntArray2929[k]) {
            i1 += ai1[i1];
          }
          continue;
        }
        if (j1 == 32) {
          k -= 2;
          if (~GroundItem.anIntArray2929[k] <= ~GroundItem.anIntArray2929[1 + k]) {
            i1 += ai1[i1];
          }
          continue;
        }
        if (33 == j1) {
          GroundItem.anIntArray2929[k++] = SomethingTilek.anIntArray1662[ai1[i1]];
          continue;
        }
        if (~j1 == -35) {
          SomethingTilek.anIntArray1662[ai1[i1]] = GroundItem.anIntArray2929[--k];
          continue;
        }
        if (j1 == 35) {
          Node.aClass94Array75[l++] = DummyClass56.aClass94Array1454[ai1[i1]];
          continue;
        }
        if (-37 == ~j1) {
          DummyClass56.aClass94Array1454[ai1[i1]] = Node.aClass94Array75[--l];
          continue;
        }
        if (j1 == 37) {
          int l3 = ai1[i1];
          l -= l3;
          GameString class94_2 = MouseRecorder.method1261(l, l3, Node.aClass94Array75, 2774);
          Node.aClass94Array75[l++] = class94_2;
          continue;
        }
        if (38 == j1) {
          k--;
          continue;
        }
        if (-40 == ~j1) {
          l--;
          continue;
        }
        if (j1 == 40) {
          int i4 = ai1[i1];
          ClientScript class3_sub28_sub15_1 = ByteArrayNode.method572(i4, (byte) -91);
          int ai2[] = new int[class3_sub28_sub15_1.anInt3680];
          GameString aclass94[] = new GameString[class3_sub28_sub15_1.anInt3687];
          for (int l75 = 0; class3_sub28_sub15_1.anInt3678 > l75; l75++) {
            ai2[l75] = GroundItem.anIntArray2929[l75 + (k - class3_sub28_sub15_1.anInt3678)];
          }

          for (int i76 = 0; class3_sub28_sub15_1.anInt3682 > i76; i76++) {
            aclass94[i76] = Node.aClass94Array75[i76 + -class3_sub28_sub15_1.anInt3682 + l];
          }

          k -= class3_sub28_sub15_1.anInt3678;
          l -= class3_sub28_sub15_1.anInt3682;
          ScriptState class54_1 = new ScriptState();
          class54_1.aClass94Array873 = DummyClass56.aClass94Array1454;
          class54_1.anIntArray870 = SomethingTilek.anIntArray1662;
          class54_1.anInt877 = i1;
          class54_1.aClass3_Sub28_Sub15_874 = class3_sub28_sub15;
          if (~NPC.anInt4002 <= ~Mobile.aClass54Array2841.length) {
            throw new RuntimeException();
          }
          class3_sub28_sub15 = class3_sub28_sub15_1;
          i1 = -1;
          Mobile.aClass54Array2841[NPC.anInt4002++] = class54_1;
          SomethingTilek.anIntArray1662 = ai2;
          ai1 = class3_sub28_sub15.anIntArray3690;
          ai = class3_sub28_sub15.anIntArray3683;
          DummyClass56.aClass94Array1454 = aclass94;
          continue;
        }
        if (42 == j1) {
          GroundItem.anIntArray2929[k++] = NpcConfiguration.anIntArray1277[ai1[i1]];
          continue;
        }
        if (-44 == ~j1) {
          int j4 = ai1[i1];
          NpcConfiguration.anIntArray1277[j4] = GroundItem.anIntArray2929[--k];
          DummyClass18.method825((byte) 92, j4);
          continue;
        }
        if (44 == j1) {
          int k4 = ai1[i1] >> 16;
          int l43 = GroundItem.anIntArray2929[--k];
          int k5 = 0xffff & ai1[i1];
          if (-1 < ~l43 || 5000 < l43) {
            throw new RuntimeException();
          }
          GameWorldSomething.anIntArray509[k4] = l43;
          byte byte2 = -1;
          if (~k5 == -106) {
            byte2 = 0;
          }
          int j76 = 0;
          while (~l43 < ~j76) {
            DummyCanvas.anIntArrayArray20[k4][j76] = byte2;
            j76++;
          }
          continue;
        }
        if (j1 == 45) {
          int l4 = ai1[i1];
          int l5 = GroundItem.anIntArray2929[--k];
          if (0 > l5 || ~l5 <= ~GameWorldSomething.anIntArray509[l4]) {
            throw new RuntimeException();
          }
          GroundItem.anIntArray2929[k++] = DummyCanvas.anIntArrayArray20[l4][l5];
          continue;
        }
        if (~j1 == -47) {
          int i5 = ai1[i1];
          k -= 2;
          int i6 = GroundItem.anIntArray2929[k];
          if (~i6 > -1 || ~i6 <= ~GameWorldSomething.anIntArray509[i5]) {
            throw new RuntimeException();
          }
          DummyCanvas.anIntArrayArray20[i5][i6] = GroundItem.anIntArray2929[1 + k];
          continue;
        }
        if (47 == j1) {
          GameString class94_1 = DummyClass22.aClass94Array1739[ai1[i1]];
          if (null == class94_1) {
            class94_1 = GroundItem.aClass94_2928;
          }
          Node.aClass94Array75[l++] = class94_1;
          continue;
        }
        if (~j1 == -49) {
          int j5 = ai1[i1];
          DummyClass22.aClass94Array1739[j5] = Node.aClass94Array75[--l];
          GZipDecompressor.method1126(-94, j5);
          continue;
        }
        if (j1 == 51) {
          HashTable class130 = class3_sub28_sub15.aClass130Array3685[ai1[i1]];
          IntegerNode class3_sub18 = (IntegerNode) class130.get(GroundItem.anIntArray2929[--k]);
          if (null != class3_sub18) {
            i1 += class3_sub18.anInt2467;
          }
          continue;
        }
      }
      boolean flag;
      flag = 1 == ai1[i1];
      if (-301 < ~j1) {
        if (-101 == ~j1) {
          k -= 3;
          int j6 = GroundItem.anIntArray2929[k];
          int i44 = GroundItem.anIntArray2929[1 + k];
          int k66 = GroundItem.anIntArray2929[2 + k];
          if (i44 == 0) {
            throw new RuntimeException();
          }
          Widget class11_21 = EnumStringFetcher.getWidget((byte) 121, j6);
          if (null == class11_21.aClass11Array262) {
            class11_21.aClass11Array262 = new Widget[k66 + 1];
          }
          if (k66 >= class11_21.aClass11Array262.length) {
            Widget aclass11[] = new Widget[k66 + 1];
            for (int k81 = 0; ~k81 > ~class11_21.aClass11Array262.length; k81++) {
              aclass11[k81] = class11_21.aClass11Array262[k81];
            }

            class11_21.aClass11Array262 = aclass11;
          }
          if (0 < k66 && class11_21.aClass11Array262[-1 + k66] == null) {
            throw new RuntimeException("Gap at:" + (-1 + k66));
          }
          Widget class11_23 = new Widget();
          class11_23.aBoolean233 = true;
          class11_23.anInt191 = k66;
          class11_23.anInt190 = class11_23.anInt279 = class11_21.anInt279;
          class11_23.anInt187 = i44;
          class11_21.aClass11Array262[k66] = class11_23;
          if (flag) {
            Something3dRoot.aClass11_2055 = class11_23;
          } else {
            SomethingPacket116.aClass11_1749 = class11_23;
          }
          DummyClass29.method909(110, class11_21);
          continue;
        }
        if (~j1 == -102) {
          Widget class11 = flag ? Something3dRoot.aClass11_2055 : SomethingPacket116.aClass11_1749;
          if (class11.anInt191 == -1) {
            if (!flag) {
              throw new RuntimeException("Tried to cc_delete static active-component!");
            } else {
              throw new RuntimeException("Tried to .cc_delete static .active-component!");
            }
          }
          Widget class11_17 = EnumStringFetcher.getWidget((byte) 111, class11.anInt279);
          class11_17.aClass11Array262[class11.anInt191] = null;
          DummyClass29.method909(-8, class11_17);
          continue;
        }
        if (-103 == ~j1) {
          Widget class11_1 =
            EnumStringFetcher.getWidget((byte) 109, GroundItem.anIntArray2929[--k]);
          class11_1.aClass11Array262 = null;
          DummyClass29.method909(-50, class11_1);
          continue;
        }
        if (~j1 == -201) {
          k -= 2;
          int k6 = GroundItem.anIntArray2929[k];
          int j44 = GroundItem.anIntArray2929[k - -1];
          Widget class11_19 = AbstractDirectColorSprite.method638((byte) -19, k6, j44);
          if (null == class11_19 || ~j44 == 0) {
            GroundItem.anIntArray2929[k++] = 0;
          } else {
            GroundItem.anIntArray2929[k++] = 1;
            if (!flag) {
              SomethingPacket116.aClass11_1749 = class11_19;
            } else {
              Something3dRoot.aClass11_2055 = class11_19;
            }
          }
          continue;
        }
        if (-202 != ~j1) {
          break;
        }
        int l6 = GroundItem.anIntArray2929[--k];
        Widget class11_18 = EnumStringFetcher.getWidget((byte) 113, l6);
        if (null != class11_18) {
          GroundItem.anIntArray2929[k++] = 1;
          if (flag) {
            Something3dRoot.aClass11_2055 = class11_18;
          } else {
            SomethingPacket116.aClass11_1749 = class11_18;
          }
        } else {
          GroundItem.anIntArray2929[k++] = 0;
        }
        continue;
      }
      if (500 <= j1) {
        if (1000 <= j1 && j1 < 1100 || 2000 <= j1 && j1 < 2100) {
          Widget class11_2;
          if (j1 < 2000) {
            class11_2 = flag ? Something3dRoot.aClass11_2055 : SomethingPacket116.aClass11_1749;
          } else {
            class11_2 = EnumStringFetcher.getWidget((byte) 122, GroundItem.anIntArray2929[--k]);
            j1 -= 1000;
          }
          if (-1001 == ~j1) {
            k -= 4;
            class11_2.anInt316 = GroundItem.anIntArray2929[k];
            class11_2.anInt166 = GroundItem.anIntArray2929[k + 1];
            int l66 = GroundItem.anIntArray2929[3 + k];
            if (~l66 > -1) {
              l66 = 0;
            } else if (-6 > ~l66) {
              l66 = 5;
            }
            int k44 = GroundItem.anIntArray2929[k + 2];
            if (k44 >= 0) {
              if (~k44 < -6) {
                k44 = 5;
              }
            } else {
              k44 = 0;
            }
            class11_2.aByte162 = (byte) l66;
            class11_2.aByte273 = (byte) k44;
            DummyClass29.method909(109, class11_2);
            TextureSampler24.method225(14, class11_2);
            if (~class11_2.anInt191 == 0) {
              FloorOverlay.method2280(2714, class11_2.anInt279);
            }
            continue;
          }
          if (j1 == 1001) {
            k -= 4;
            class11_2.anInt177 = GroundItem.anIntArray2929[k];
            class11_2.anInt244 = GroundItem.anIntArray2929[1 + k];
            class11_2.anInt184 = 0;
            class11_2.anInt312 = 0;
            int l44 = GroundItem.anIntArray2929[k + 2];
            int i67 = GroundItem.anIntArray2929[3 + k];
            if (-1 >= ~i67) {
              if (i67 > 4) {
                i67 = 4;
              }
            } else {
              i67 = 0;
            }
            class11_2.aByte241 = (byte) i67;
            if (~l44 > -1) {
              l44 = 0;
            } else if (~l44 < -5) {
              l44 = 4;
            }
            class11_2.aByte304 = (byte) l44;
            DummyClass29.method909(122, class11_2);
            TextureSampler24.method225(14, class11_2);
            if (-1 == ~class11_2.anInt187) {
              FileRequester.method2104(class11_2, false, 32);
            }
            continue;
          }
          if (j1 == 1003) {
            boolean flag3 = ~GroundItem.anIntArray2929[--k] == -2;
            if (flag3 == (!class11_2.aBoolean155)) {
              class11_2.aBoolean155 = flag3;
              DummyClass29.method909(-103, class11_2);
            }
            if (-1 == class11_2.anInt191) {
              ObjectNode.method569(-82, class11_2.anInt279);
            }
            continue;
          }
          if (~j1 == -1005) {
            k -= 2;
            class11_2.anInt216 = GroundItem.anIntArray2929[k];
            class11_2.anInt160 = GroundItem.anIntArray2929[k - -1];
            DummyClass29.method909(-99, class11_2);
            TextureSampler24.method225(14, class11_2);
            if (class11_2.anInt187 == 0) {
              FileRequester.method2104(class11_2, false, -127);
            }
            continue;
          }
          if (-1006 != ~j1) {
            break;
          }
          class11_2.aBoolean219 = GroundItem.anIntArray2929[--k] == 1;
          continue;
        }
        if ((-1101 < ~j1 || 1200 <= j1) && (~j1 > -2101 || 2200 <= j1)) {
          if ((j1 < 1200 || 1300 <= j1) && (2200 > j1 || -2301 >= ~j1)) {
            if (~j1 <= -1301 && -1401 < ~j1 || -2301 >= ~j1 && -2401 < ~j1) {
              Widget class11_3;
              if (2000 <= j1) {
                class11_3 = EnumStringFetcher.getWidget((byte) 119, GroundItem.anIntArray2929[--k]);
                j1 -= 1000;
              } else {
                class11_3 = flag ? Something3dRoot.aClass11_2055 : SomethingPacket116.aClass11_1749;
              }
              if (-1301 == ~j1) {
                int i45 = GroundItem.anIntArray2929[--k] + -1;
                if (0 > i45 || ~i45 < -10) {
                  l--;
                } else {
                  class11_3.method857((byte) 112, Node.aClass94Array75[--l], i45);
                }
                continue;
              }
              if (~j1 == -1302) {
                k -= 2;
                int j67 = GroundItem.anIntArray2929[1 + k];
                int j45 = GroundItem.anIntArray2929[k];
                class11_3.aClass11_302 = AbstractDirectColorSprite.method638((byte) -19, j45, j67);
                continue;
              }
              if (j1 == 1302) {
                class11_3.aBoolean200 = ~GroundItem.anIntArray2929[--k] == -2;
                continue;
              }
              if (j1 == 1303) {
                class11_3.anInt214 = GroundItem.anIntArray2929[--k];
                continue;
              }
              if (j1 == 1304) {
                class11_3.anInt179 = GroundItem.anIntArray2929[--k];
                continue;
              }
              if (1305 == j1) {
                class11_3.aClass94_277 = Node.aClass94Array75[--l];
                continue;
              }
              if (-1307 == ~j1) {
                class11_3.aClass94_245 = Node.aClass94Array75[--l];
                continue;
              }
              if (~j1 == -1308) {
                class11_3.aClass94Array171 = null;
                continue;
              }
              if (-1309 == ~j1) {
                class11_3.anInt238 = GroundItem.anIntArray2929[--k];
                class11_3.anInt266 = GroundItem.anIntArray2929[--k];
                continue;
              }
              if (1309 != j1) {
                break;
              }
              int k45 = GroundItem.anIntArray2929[--k];
              int k67 = GroundItem.anIntArray2929[--k];
              if (~k67 <= -2 && ~k67 >= -11) {
                class11_3.method854(k67 + -1, k45, (byte) 43);
              }
              continue;
            }
            if ((-1401 < ~j1 || ~j1 <= -1501) && (2400 > j1 || j1 >= 2500)) {
              if (1600 > j1) {
                Widget class11_4 =
                  flag ? Something3dRoot.aClass11_2055 : SomethingPacket116.aClass11_1749;
                if (j1 == 1500) {
                  GroundItem.anIntArray2929[k++] = class11_4.anInt306;
                  continue;
                }
                if (~j1 == -1502) {
                  GroundItem.anIntArray2929[k++] = class11_4.anInt210;
                  continue;
                }
                if (j1 == 1502) {
                  GroundItem.anIntArray2929[k++] = class11_4.anInt168;
                  continue;
                }
                if (-1504 == ~j1) {
                  GroundItem.anIntArray2929[k++] = class11_4.anInt193;
                  continue;
                }
                if (j1 == 1504) {
                  GroundItem.anIntArray2929[k++] = class11_4.aBoolean155 ? 1 : 0;
                  continue;
                }
                if (-1506 != ~j1) {
                  break;
                }
                GroundItem.anIntArray2929[k++] = class11_4.anInt190;
                continue;
              }
              if (j1 < 1700) {
                Widget class11_5 =
                  flag ? Something3dRoot.aClass11_2055 : SomethingPacket116.aClass11_1749;
                if (~j1 == -1601) {
                  GroundItem.anIntArray2929[k++] = class11_5.anInt247;
                  continue;
                }
                if (~j1 == -1602) {
                  GroundItem.anIntArray2929[k++] = class11_5.anInt208;
                  continue;
                }
                if (-1603 == ~j1) {
                  Node.aClass94Array75[l++] = class11_5.aClass94_232;
                  continue;
                }
                if (j1 == 1603) {
                  GroundItem.anIntArray2929[k++] = class11_5.anInt240;
                  continue;
                }
                if (-1605 == ~j1) {
                  GroundItem.anIntArray2929[k++] = class11_5.anInt252;
                  continue;
                }
                if (-1606 == ~j1) {
                  GroundItem.anIntArray2929[k++] = class11_5.anInt164;
                  continue;
                }
                if (~j1 == -1607) {
                  GroundItem.anIntArray2929[k++] = class11_5.rotationX0;
                  continue;
                }
                if (1607 == j1) {
                  GroundItem.anIntArray2929[k++] = class11_5.rotationZ;
                  continue;
                }
                if (~j1 == -1609) {
                  GroundItem.anIntArray2929[k++] = class11_5.rotationY;
                  continue;
                }
                if (~j1 == -1610) {
                  GroundItem.anIntArray2929[k++] = class11_5.anInt223;
                  continue;
                }
                if (1610 == j1) {
                  GroundItem.anIntArray2929[k++] = class11_5.anInt258;
                  continue;
                }
                if (-1612 == ~j1) {
                  GroundItem.anIntArray2929[k++] = class11_5.anInt264;
                  continue;
                }
                if (-1613 != ~j1) {
                  break;
                }
                GroundItem.anIntArray2929[k++] = class11_5.anInt224;
                continue;
              }
              if (-1801 >= ~j1) {
                if (j1 < 1900) {
                  Widget class11_6 =
                    flag ? Something3dRoot.aClass11_2055 : SomethingPacket116.aClass11_1749;
                  if (1800 == j1) {
                    GroundItem.anIntArray2929[k++] = GameClient.method44(class11_6).method101(-95);
                    continue;
                  }
                  if (1801 == j1) {
                    int l45 = GroundItem.anIntArray2929[--k];
                    l45--;
                    if (null == class11_6.aClass94Array171
                      || ~l45 <= ~class11_6.aClass94Array171.length
                      || null == class11_6.aClass94Array171[l45]) {
                      Node.aClass94Array75[l++] = AreaSoundEffect.aClass94_2331;
                    } else {
                      Node.aClass94Array75[l++] = class11_6.aClass94Array171[l45];
                    }
                    continue;
                  }
                  if (-1803 != ~j1) {
                    break;
                  }
                  if (null != class11_6.aClass94_277) {
                    Node.aClass94Array75[l++] = class11_6.aClass94_277;
                  } else {
                    Node.aClass94Array75[l++] = AreaSoundEffect.aClass94_2331;
                  }
                  continue;
                }
                if (2600 > j1) {
                  Widget class11_7 =
                    EnumStringFetcher.getWidget((byte) 114, GroundItem.anIntArray2929[--k]);
                  if (j1 == 2500) {
                    GroundItem.anIntArray2929[k++] = class11_7.anInt306;
                    continue;
                  }
                  if (-2502 == ~j1) {
                    GroundItem.anIntArray2929[k++] = class11_7.anInt210;
                    continue;
                  }
                  if (2502 == j1) {
                    GroundItem.anIntArray2929[k++] = class11_7.anInt168;
                    continue;
                  }
                  if (j1 == 2503) {
                    GroundItem.anIntArray2929[k++] = class11_7.anInt193;
                    continue;
                  }
                  if (2504 == j1) {
                    GroundItem.anIntArray2929[k++] = class11_7.aBoolean155 ? 1 : 0;
                    continue;
                  }
                  if (j1 != 2505) {
                    break;
                  }
                  GroundItem.anIntArray2929[k++] = class11_7.anInt190;
                  continue;
                }
                if (-2701 >= ~j1) {
                  if (2800 <= j1) {
                    if (j1 >= 2900) {
                      if (~j1 > -3201) {
                        if (-3101 == ~j1) {
                          GameString class94_3 = Node.aClass94Array75[--l];
                          GameBuffer.printMessage(AreaSoundEffect.aClass94_2331, 0, class94_3, -1);
                          continue;
                        }
                        if (-3102 == ~j1) {
                          k -= 2;
                          GroundItemNode.method628(0, GroundItem.anIntArray2929[k - -1],
                            GroundItem.anIntArray2929[k], TextureCache.localPlayer);
                          continue;
                        }
                        if (j1 == 3103) {
                          TextureSampler4.method264((byte) 87);
                          continue;
                        }
                        if (j1 == 3104) {
                          FloorUnderlay.anInt1405++;
                          GameString class94_4 = Node.aClass94Array75[--l];
                          int i46 = 0;
                          if (class94_4.method1543(82)) {
                            i46 = class94_4.toInteger();
                          }
                          TextureSampler12.secureBuffer.writePacket(23);
                          TextureSampler12.secureBuffer.writeInt(i46);
                          continue;
                        }
                        if (~j1 == -3106) {
                          AudioSomethingSomething.anInt2500++;
                          GameString class94_5 = Node.aClass94Array75[--l];
                          TextureSampler12.secureBuffer.writePacket(244);
                          TextureSampler12.secureBuffer.writeLong(class94_5.toBase37());
                          continue;
                        }
                        if (j1 == 3106) {
                          EnumStringFetcher.anInt2165++;
                          GameString class94_6 = Node.aClass94Array75[--l];
                          TextureSampler12.secureBuffer.writePacket(65);
                          TextureSampler12.secureBuffer.writeByte(1 + class94_6.getLength());
                          TextureSampler12.secureBuffer.writeString(class94_6);
                          continue;
                        }
                        if (j1 == 3107) {
                          int i7 = GroundItem.anIntArray2929[--k];
                          GameString class94_44 = Node.aClass94Array75[--l];
                          SomethingIndex150.method2258(i7, 0, class94_44);
                          continue;
                        }
                        if (-3109 == ~j1) {
                          k -= 3;
                          int j46 = GroundItem.anIntArray2929[k - -1];
                          int j7 = GroundItem.anIntArray2929[k];
                          int l67 = GroundItem.anIntArray2929[2 + k];
                          Widget class11_22 = EnumStringFetcher.getWidget((byte) 114, l67);
                          WidgetUpdate.createIndexedColorSprite(j46, j7, 115, class11_22);
                          continue;
                        }
                        if (-3110 == ~j1) {
                          k -= 2;
                          int k7 = GroundItem.anIntArray2929[k];
                          Widget class11_20 =
                            flag ? Something3dRoot.aClass11_2055 : SomethingPacket116.aClass11_1749;
                          int k46 = GroundItem.anIntArray2929[1 + k];
                          WidgetUpdate.createIndexedColorSprite(k46, k7, 79, class11_20);
                          continue;
                        }
                        if (-3111 != ~j1) {
                          break;
                        }
                        TextureSampler15.anInt3199++;
                        int l7 = GroundItem.anIntArray2929[--k];
                        TextureSampler12.secureBuffer.writePacket(111);
                        TextureSampler12.secureBuffer.writeShort(l7);
                        continue;
                      }
                      if (~j1 > -3301) {
                        if (~j1 == -3201) {
                          k -= 3;
                          TextureSampler26.method199(GroundItem.anIntArray2929[k - -1],
                            GroundItem.anIntArray2929[k], GroundItem.anIntArray2929[k + 2], -799);
                          continue;
                        }
                        if (~j1 == -3202) {
                          BlockConfig.method1427(true, GroundItem.anIntArray2929[--k]);
                          continue;
                        }
                        if (-3203 != ~j1) {
                          break;
                        }
                        k -= 2;
                        DummyClass10.method2266(GroundItem.anIntArray2929[1 + k],
                          GroundItem.anIntArray2929[k], (byte) -1);
                        continue;
                      }
                      if (~j1 > -3401) {
                        if (-3301 == ~j1) {
                          GroundItem.anIntArray2929[k++] = AbstractGameWorld.updateCycle;
                          continue;
                        }
                        if (-3302 == ~j1) {
                          k -= 2;
                          int i8 = GroundItem.anIntArray2929[k];
                          int l46 = GroundItem.anIntArray2929[1 + k];
                          GroundItem.anIntArray2929[k++] = Widget.method861(i8, 89, l46);
                          continue;
                        }
                        if (~j1 == -3303) {
                          k -= 2;
                          int i47 = GroundItem.anIntArray2929[k + 1];
                          int j8 = GroundItem.anIntArray2929[k];
                          GroundItem.anIntArray2929[k++] = SomethingSceneJ.method872(-1, j8, i47);
                          continue;
                        }
                        if (3303 == j1) {
                          k -= 2;
                          int j47 = GroundItem.anIntArray2929[k - -1];
                          int k8 = GroundItem.anIntArray2929[k];
                          GroundItem.anIntArray2929[k++] =
                            DummyClass10.method2268((byte) -107, k8, j47);
                          continue;
                        }
                        if (3304 == j1) {
                          int l8 = GroundItem.anIntArray2929[--k];
                          GroundItem.anIntArray2929[k++] = BufferObject.method2069(l8, -127).size;
                          continue;
                        }
                        if (~j1 == -3306) {
                          int i9 = GroundItem.anIntArray2929[--k];
                          GroundItem.anIntArray2929[k++] = TextureSampler17.anIntArray3185[i9];
                          continue;
                        }
                        if (j1 == 3306) {
                          int j9 = GroundItem.anIntArray2929[--k];
                          GroundItem.anIntArray2929[k++] =
                            TriChromaticImageBuffer.anIntArray2480[j9];
                          continue;
                        }
                        if (3307 == j1) {
                          int k9 = GroundItem.anIntArray2929[--k];
                          GroundItem.anIntArray2929[k++] = SomethingPacket116.anIntArray1743[k9];
                          continue;
                        }
                        if (-3309 == ~j1) {
                          int l9 = GameWorldSomething.currentPlane;
                          int k47 =
                            WorldMapLabel.anInt1716 + (TextureCache.localPlayer.anInt2819 >> 7);
                          int i68 = (TextureCache.localPlayer.anInt2829 >> 7)
                            - -ProceduralTexture.anInt1152;
                          GroundItem.anIntArray2929[k++] = (l9 << 28) - (-(k47 << 14) - i68);
                          continue;
                        }
                        if (~j1 == -3310) {
                          int i10 = GroundItem.anIntArray2929[--k];
                          GroundItem.anIntArray2929[k++] = ClientScript.bitAnd(16383, i10 >> 14);
                          continue;
                        }
                        if (3310 == j1) {
                          int j10 = GroundItem.anIntArray2929[--k];
                          GroundItem.anIntArray2929[k++] = j10 >> 28;
                          continue;
                        }
                        if (-3312 == ~j1) {
                          int k10 = GroundItem.anIntArray2929[--k];
                          GroundItem.anIntArray2929[k++] = ClientScript.bitAnd(k10, 16383);
                          continue;
                        }
                        if (~j1 == -3313) {
                          GroundItem.anIntArray2929[k++] = MapScene.aBoolean66 ? 1 : 0;
                          continue;
                        }
                        if (3313 == j1) {
                          k -= 2;
                          int l10 = 32768 + GroundItem.anIntArray2929[k];
                          int l47 = GroundItem.anIntArray2929[k - -1];
                          GroundItem.anIntArray2929[k++] = Widget.method861(l10, 118, l47);
                          continue;
                        }
                        if (3314 == j1) {
                          k -= 2;
                          int i11 = GroundItem.anIntArray2929[k] - -32768;
                          int i48 = GroundItem.anIntArray2929[1 + k];
                          GroundItem.anIntArray2929[k++] = SomethingSceneJ.method872(-1, i11, i48);
                          continue;
                        }
                        if (3315 == j1) {
                          k -= 2;
                          int j11 = 32768 + GroundItem.anIntArray2929[k];
                          int j48 = GroundItem.anIntArray2929[1 + k];
                          GroundItem.anIntArray2929[k++] =
                            DummyClass10.method2268((byte) -52, j11, j48);
                          continue;
                        }
                        if (~j1 == -3317) {
                          if (-3 < ~TextureSampler35.rights) {
                            GroundItem.anIntArray2929[k++] = 0;
                          } else {
                            GroundItem.anIntArray2929[k++] = TextureSampler35.rights;
                          }
                          continue;
                        }
                        if (-3318 == ~j1) {
                          GroundItem.anIntArray2929[k++] = DummyClass36.updateTime;
                          continue;
                        }
                        if (3318 == j1) {
                          GroundItem.anIntArray2929[k++] = ClientScriptCall.anInt2451;
                          continue;
                        }
                        if (3321 == j1) {
                          GroundItem.anIntArray2929[k++] = BZipDecompressorState.anInt136;
                          continue;
                        }
                        if (-3323 == ~j1) {
                          GroundItem.anIntArray2929[k++] = Mouse.anInt1925;
                          continue;
                        }
                        if (3323 == j1) {
                          if (~ProjectileNode.anInt3775 <= -6 && -10 <= ~ProjectileNode.anInt3775) {
                            GroundItem.anIntArray2929[k++] = 1;
                          } else {
                            GroundItem.anIntArray2929[k++] = 0;
                          }
                          continue;
                        }
                        if (~j1 == -3325) {
                          if (~ProjectileNode.anInt3775 > -6 || ProjectileNode.anInt3775 > 9) {
                            GroundItem.anIntArray2929[k++] = 0;
                          } else {
                            GroundItem.anIntArray2929[k++] = ProjectileNode.anInt3775;
                          }
                          continue;
                        }
                        if (3325 == j1) {
                          GroundItem.anIntArray2929[k++] = TextureSampler3.aBoolean3358 ? 1 : 0;
                          continue;
                        }
                        if (3326 == j1) {
                          GroundItem.anIntArray2929[k++] = TextureCache.localPlayer.combatLevel;
                          continue;
                        }
                        if (3327 == j1) {
                          GroundItem.anIntArray2929[k++] =
                            TextureCache.localPlayer.appearance.aBoolean864 ? 1 : 0;
                          continue;
                        }
                        if (3328 == j1) {
                          GroundItem.anIntArray2929[k++] =
                            !SomethingVolume15.aBoolean2433 || BufferData.aBoolean1641 ? 0 : 1;
                          continue;
                        }
                        if (3329 == j1) {
                          GroundItem.anIntArray2929[k++] = TextureSampler31.aBoolean3166 ? 1 : 0;
                          continue;
                        }
                        if (~j1 == -3331) {
                          int k11 = GroundItem.anIntArray2929[--k];
                          GroundItem.anIntArray2929[k++] =
                            GameWorld.getInventoryFreeSpace(k11, (byte) -80);
                          continue;
                        }
                        if (~j1 == -3332) {
                          k -= 2;
                          int k48 = GroundItem.anIntArray2929[1 + k];
                          int l11 = GroundItem.anIntArray2929[k];
                          GroundItem.anIntArray2929[k++] =
                            DisplayMode.method1643(10131, false, l11, k48);
                          continue;
                        }
                        if (3332 == j1) {
                          k -= 2;
                          int i12 = GroundItem.anIntArray2929[k];
                          int l48 = GroundItem.anIntArray2929[k + 1];
                          GroundItem.anIntArray2929[k++] =
                            DisplayMode.method1643(10131, true, i12, l48);
                          continue;
                        }
                        if (3333 == j1) {
                          GroundItem.anIntArray2929[k++] = EnumStringFetcher.anInt2161;
                          continue;
                        }
                        if (3335 == j1) {
                          GroundItem.anIntArray2929[k++] = TriChromaticImageBuffer.languageId;
                          continue;
                        }
                        if (-3337 == ~j1) {
                          k -= 4;
                          int i49 = GroundItem.anIntArray2929[k - -1];
                          int j12 = GroundItem.anIntArray2929[k];
                          j12 += i49 << 14;
                          int k76 = GroundItem.anIntArray2929[3 + k];
                          int j68 = GroundItem.anIntArray2929[2 + k];
                          j12 += j68 << 28;
                          j12 += k76;
                          GroundItem.anIntArray2929[k++] = j12;
                          continue;
                        }
                        if (j1 != 3337) {
                          break;
                        }
                        GroundItem.anIntArray2929[k++] = MonoChromaticImageBuffer.affiliateId;
                        continue;
                      }
                      if (j1 < 3500) {
                        if (~j1 == -3401) {
                          k -= 2;
                          int k12 = GroundItem.anIntArray2929[k];
                          int j49 = GroundItem.anIntArray2929[1 + k];
                          ClientScriptEnum class3_sub28_sub13_1 =
                            TextureSampler36.getEnum(k12, true);
                          if (-116 != ~class3_sub28_sub13_1.paramType) {
                          }
                          Node.aClass94Array75[l++] =
                            class3_sub28_sub13_1.getString(j49, (byte) 121);
                          continue;
                        }
                        if (3408 == j1) {
                          k -= 4;
                          int l12 = GroundItem.anIntArray2929[k];
                          int k49 = GroundItem.anIntArray2929[1 + k];
                          int l76 = GroundItem.anIntArray2929[3 + k];
                          int k68 = GroundItem.anIntArray2929[k - -2];
                          ClientScriptEnum class3_sub28_sub13_4 =
                            TextureSampler36.getEnum(k68, true);
                          if (class3_sub28_sub13_4.someType != l12
                            || ~class3_sub28_sub13_4.paramType != ~k49) {
                            throw new RuntimeException("C3408-1");
                          }
                          if (-116 != ~k49) {
                            GroundItem.anIntArray2929[k++] =
                              class3_sub28_sub13_4.getInteger(0, l76);
                          } else {
                            Node.aClass94Array75[l++] =
                              class3_sub28_sub13_4.getString(l76, (byte) -25);
                          }
                          continue;
                        }
                        if (~j1 == -3410) {
                          k -= 3;
                          int l49 = GroundItem.anIntArray2929[k - -1];
                          int l68 = GroundItem.anIntArray2929[k + 2];
                          int i13 = GroundItem.anIntArray2929[k];
                          if (0 == ~l49) {
                            throw new RuntimeException("C3409-2");
                          }
                          ClientScriptEnum class3_sub28_sub13_3 =
                            TextureSampler36.getEnum(l49, true);
                          if (~class3_sub28_sub13_3.paramType != ~i13) {
                            throw new RuntimeException("C3409-1");
                          }
                          GroundItem.anIntArray2929[k++] =
                            class3_sub28_sub13_3.method621(-8143, l68) ? 1 : 0;
                          continue;
                        }
                        if (~j1 == -3411) {
                          int j13 = GroundItem.anIntArray2929[--k];
                          GameString class94_45 = Node.aClass94Array75[--l];
                          if (j13 == -1) {
                            throw new RuntimeException("C3410-2");
                          }
                          ClientScriptEnum class3_sub28_sub13_2 =
                            TextureSampler36.getEnum(j13, true);
                          if (-116 != ~class3_sub28_sub13_2.paramType) {
                            throw new RuntimeException("C3410-1");
                          }
                          GroundItem.anIntArray2929[k++] =
                            class3_sub28_sub13_2.hasValue(class94_45, 8729) ? 1 : 0;
                          continue;
                        }
                        if (-3412 != ~j1) {
                          break;
                        }
                        int k13 = GroundItem.anIntArray2929[--k];
                        ClientScriptEnum class3_sub28_sub13 = TextureSampler36.getEnum(k13, true);
                        GroundItem.anIntArray2929[k++] = class3_sub28_sub13.table.getSize();
                        continue;
                      }
                      if (3700 > j1) {
                        if (3600 == j1) {
                          if (HintMarker.anInt1357 == 0) {
                            GroundItem.anIntArray2929[k++] = -2;
                          } else if (HintMarker.anInt1357 != 1) {
                            GroundItem.anIntArray2929[k++] = FileSystem.anInt104;
                          } else {
                            GroundItem.anIntArray2929[k++] = -1;
                          }
                          continue;
                        }
                        if (3601 == j1) {
                          int l13 = GroundItem.anIntArray2929[--k];
                          if (-3 != ~HintMarker.anInt1357 || ~l13 <= ~FileSystem.anInt104) {
                            Node.aClass94Array75[l++] = AreaSoundEffect.aClass94_2331;
                          } else {
                            Node.aClass94Array75[l++] = SceneSomething2.aClass94Array1046[l13];
                          }
                          continue;
                        }
                        if (-3603 == ~j1) {
                          int i14 = GroundItem.anIntArray2929[--k];
                          if (-3 != ~HintMarker.anInt1357 || ~FileSystem.anInt104 >= ~i14) {
                            GroundItem.anIntArray2929[k++] = 0;
                          } else {
                            GroundItem.anIntArray2929[k++] = Cursor.anIntArray882[i14];
                          }
                          continue;
                        }
                        if (j1 == 3603) {
                          int j14 = GroundItem.anIntArray2929[--k];
                          if (2 == HintMarker.anInt1357 && FileSystem.anInt104 > j14) {
                            GroundItem.anIntArray2929[k++] = LightIntensity.anIntArray904[j14];
                          } else {
                            GroundItem.anIntArray2929[k++] = 0;
                          }
                          continue;
                        }
                        if (3604 == j1) {
                          int i50 = GroundItem.anIntArray2929[--k];
                          GameString class94_7 = Node.aClass94Array75[--l];
                          FloorUnderlay.method1605(255, class94_7, i50);
                          continue;
                        }
                        if (-3606 == ~j1) {
                          GameString class94_8 = Node.aClass94Array75[--l];
                          DummyClass4.method2229(class94_8.toBase37(), (byte) -91);
                          continue;
                        }
                        if (j1 == 3606) {
                          GameString class94_9 = Node.aClass94Array75[--l];
                          TextureSampler7.method297(class94_9.toBase37(), 1);
                          continue;
                        }
                        if (j1 == 3607) {
                          GameString class94_10 = Node.aClass94Array75[--l];
                          DummyClass50.method1399(32, class94_10.toBase37());
                          continue;
                        }
                        if (~j1 == -3609) {
                          GameString class94_11 = Node.aClass94Array75[--l];
                          TextureSampler30.method212(class94_11.toBase37(), 0);
                          continue;
                        }
                        if (~j1 == -3610) {
                          GameString class94_12 = Node.aClass94Array75[--l];
                          if (class94_12.method1558(AreaSoundEffect.aClass94_2323, 0)
                            || class94_12.method1558(TextureSampler15.aClass94_3190, 0)) {
                            class94_12 = class94_12.substring(7);
                          }
                          GroundItem.anIntArray2929[k++] =
                            ScriptState.method1176(class94_12, (byte) -82) ? 1 : 0;
                          continue;
                        }
                        if (j1 == 3610) {
                          int k14 = GroundItem.anIntArray2929[--k];
                          if (~HintMarker.anInt1357 == -3 && FileSystem.anInt104 > k14) {
                            Node.aClass94Array75[l++] = SubNode.aClass94Array2566[k14];
                          } else {
                            Node.aClass94Array75[l++] = AreaSoundEffect.aClass94_2331;
                          }
                          continue;
                        }
                        if (j1 == 3611) {
                          if (Widget.aClass94_251 != null) {
                            Node.aClass94Array75[l++] = Widget.aClass94_251.formatName((byte) -50);
                          } else {
                            Node.aClass94Array75[l++] = AreaSoundEffect.aClass94_2331;
                          }
                          continue;
                        }
                        if (~j1 == -3613) {
                          if (null != Widget.aClass94_251) {
                            GroundItem.anIntArray2929[k++] = SubNode.anInt2572;
                          } else {
                            GroundItem.anIntArray2929[k++] = 0;
                          }
                          continue;
                        }
                        if (~j1 == -3614) {
                          int l14 = GroundItem.anIntArray2929[--k];
                          if (Widget.aClass94_251 == null || ~SubNode.anInt2572 >= ~l14) {
                            Node.aClass94Array75[l++] = AreaSoundEffect.aClass94_2331;
                          } else {
                            Node.aClass94Array75[l++] =
                              ClientScript.aClass3_Sub19Array3694[l14].name.formatName((byte) -50);
                          }
                          continue;
                        }
                        if (-3615 == ~j1) {
                          int i15 = GroundItem.anIntArray2929[--k];
                          if (Widget.aClass94_251 == null || i15 >= SubNode.anInt2572) {
                            GroundItem.anIntArray2929[k++] = 0;
                          } else {
                            GroundItem.anIntArray2929[k++] =
                              ClientScript.aClass3_Sub19Array3694[i15].anInt2478;
                          }
                          continue;
                        }
                        if (3615 == j1) {
                          int j15 = GroundItem.anIntArray2929[--k];
                          if (null == Widget.aClass94_251 || ~SubNode.anInt2572 >= ~j15) {
                            GroundItem.anIntArray2929[k++] = 0;
                          } else {
                            GroundItem.anIntArray2929[k++] =
                              ClientScript.aClass3_Sub19Array3694[j15].aByte2472;
                          }
                          continue;
                        }
                        if (3616 == j1) {
                          GroundItem.anIntArray2929[k++] = Player.aByte3953;
                          continue;
                        }
                        if (-3618 == ~j1) {
                          GameString class94_13 = Node.aClass94Array75[--l];
                          DisplayMode.method1642(3803, class94_13);
                          continue;
                        }
                        if (~j1 == -3619) {
                          GroundItem.anIntArray2929[k++] = CollisionMap.aByte1308;
                          continue;
                        }
                        if (j1 == 3619) {
                          GameString class94_14 = Node.aClass94Array75[--l];
                          AudioSomethingSomething.method400(class94_14.toBase37(), 0);
                          continue;
                        }
                        if (j1 == 3620) {
                          DummyClass49.method1368(-90);
                          continue;
                        }
                        if (-3622 == ~j1) {
                          if (HintMarker.anInt1357 == 0) {
                            GroundItem.anIntArray2929[k++] = -1;
                          } else {
                            GroundItem.anIntArray2929[k++] = AnimationSomething.anInt3591;
                          }
                          continue;
                        }
                        if (3622 == j1) {
                          int k15 = GroundItem.anIntArray2929[--k];
                          if (HintMarker.anInt1357 == 0 || AnimationSomething.anInt3591 <= k15) {
                            Node.aClass94Array75[l++] = AreaSoundEffect.aClass94_2331;
                          } else {
                            Node.aClass94Array75[l++] = FileCache.stringFromBase37(-29664,
                              MonoChromaticImageCache.aLongArray1574[k15]).formatName((byte) -50);
                          }
                          continue;
                        }
                        if (3623 == j1) {
                          GameString class94_15 = Node.aClass94Array75[--l];
                          if (class94_15.method1558(AreaSoundEffect.aClass94_2323, 0)
                            || class94_15.method1558(TextureSampler15.aClass94_3190, 0)) {
                            class94_15 = class94_15.substring(7);
                          }
                          GroundItem.anIntArray2929[k++] =
                            AudioStreamEncoder3.method467(class94_15, 0) ? 1 : 0;
                          continue;
                        }
                        if (-3625 == ~j1) {
                          int l15 = GroundItem.anIntArray2929[--k];
                          if (null != ClientScript.aClass3_Sub19Array3694
                            && ~SubNode.anInt2572 < ~l15
                            && ClientScript.aClass3_Sub19Array3694[l15].name.method1531(
                            TextureCache.localPlayer.name)) {
                            GroundItem.anIntArray2929[k++] = 1;
                          } else {
                            GroundItem.anIntArray2929[k++] = 0;
                          }
                          continue;
                        }
                        if (-3626 == ~j1) {
                          if (DummyClass12.aClass94_2035 == null) {
                            Node.aClass94Array75[l++] = AreaSoundEffect.aClass94_2331;
                          } else {
                            Node.aClass94Array75[l++] =
                              DummyClass12.aClass94_2035.formatName((byte) -50);
                          }
                          continue;
                        }
                        if (3626 == j1) {
                          int i16 = GroundItem.anIntArray2929[--k];
                          if (Widget.aClass94_251 == null || ~SubNode.anInt2572 >= ~i16) {
                            Node.aClass94Array75[l++] = AreaSoundEffect.aClass94_2331;
                          } else {
                            Node.aClass94Array75[l++] =
                              ClientScript.aClass3_Sub19Array3694[i16].aClass94_2473;
                          }
                          continue;
                        }
                        if (~j1 == -3628) {
                          int j16 = GroundItem.anIntArray2929[--k];
                          if (HintMarker.anInt1357 != 2 || 0 > j16
                            || ~j16 <= ~FileSystem.anInt104) {
                            GroundItem.anIntArray2929[k++] = 0;
                          } else {
                            GroundItem.anIntArray2929[k++] = Node.aBooleanArray73[j16] ? 1 : 0;
                          }
                          continue;
                        }
                        if (j1 == 3628) {
                          GameString class94_16 = Node.aClass94Array75[--l];
                          if (class94_16.method1558(AreaSoundEffect.aClass94_2323, 0)
                            || class94_16.method1558(TextureSampler15.aClass94_3190, 0)) {
                            class94_16 = class94_16.substring(7);
                          }
                          GroundItem.anIntArray2929[k++] = DummyClass18.method826(class94_16, -1);
                          continue;
                        }
                        if (~j1 != -3630) {
                          break;
                        }
                        GroundItem.anIntArray2929[k++] = SomethingPacket151.anInt2607;
                        continue;
                      }
                      if (j1 < 4000) {
                        if (j1 == 3903) {
                          int k16 = GroundItem.anIntArray2929[--k];
                          GroundItem.anIntArray2929[k++] =
                            TextureSampler29.aClass133Array3393[k16].method1805((byte) -33);
                          continue;
                        }
                        if (-3905 == ~j1) {
                          int l16 = GroundItem.anIntArray2929[--k];
                          GroundItem.anIntArray2929[k++] =
                            TextureSampler29.aClass133Array3393[l16].anInt1752;
                          continue;
                        }
                        if (-3906 == ~j1) {
                          int i17 = GroundItem.anIntArray2929[--k];
                          GroundItem.anIntArray2929[k++] =
                            TextureSampler29.aClass133Array3393[i17].anInt1757;
                          continue;
                        }
                        if (~j1 == -3907) {
                          int j17 = GroundItem.anIntArray2929[--k];
                          GroundItem.anIntArray2929[k++] =
                            TextureSampler29.aClass133Array3393[j17].anInt1747;
                          continue;
                        }
                        if (~j1 == -3908) {
                          int k17 = GroundItem.anIntArray2929[--k];
                          GroundItem.anIntArray2929[k++] =
                            TextureSampler29.aClass133Array3393[k17].anInt1746;
                          continue;
                        }
                        if (3908 == j1) {
                          int l17 = GroundItem.anIntArray2929[--k];
                          GroundItem.anIntArray2929[k++] =
                            TextureSampler29.aClass133Array3393[l17].anInt1750;
                          continue;
                        }
                        if (3910 == j1) {
                          int i18 = GroundItem.anIntArray2929[--k];
                          int j50 = TextureSampler29.aClass133Array3393[i18].method1804(false);
                          GroundItem.anIntArray2929[k++] = -1 == ~j50 ? 1 : 0;
                          continue;
                        }
                        if (3911 == j1) {
                          int j18 = GroundItem.anIntArray2929[--k];
                          int k50 = TextureSampler29.aClass133Array3393[j18].method1804(false);
                          GroundItem.anIntArray2929[k++] = ~k50 != -3 ? 0 : 1;
                          continue;
                        }
                        if (-3913 == ~j1) {
                          int k18 = GroundItem.anIntArray2929[--k];
                          int l50 = TextureSampler29.aClass133Array3393[k18].method1804(false);
                          GroundItem.anIntArray2929[k++] = ~l50 == -6 ? 1 : 0;
                          continue;
                        }
                        if (-3914 != ~j1) {
                          break;
                        }
                        int l18 = GroundItem.anIntArray2929[--k];
                        int i51 = TextureSampler29.aClass133Array3393[l18].method1804(false);
                        GroundItem.anIntArray2929[k++] = 1 == i51 ? 1 : 0;
                        continue;
                      }
                      if (j1 < 4100) {
                        if (j1 == 4000) {
                          k -= 2;
                          int i19 = GroundItem.anIntArray2929[k];
                          int j51 = GroundItem.anIntArray2929[k - -1];
                          GroundItem.anIntArray2929[k++] = j51 + i19;
                          continue;
                        }
                        if (-4002 == ~j1) {
                          k -= 2;
                          int j19 = GroundItem.anIntArray2929[k];
                          int k51 = GroundItem.anIntArray2929[1 + k];
                          GroundItem.anIntArray2929[k++] = -k51 + j19;
                          continue;
                        }
                        if (4002 == j1) {
                          k -= 2;
                          int k19 = GroundItem.anIntArray2929[k];
                          int l51 = GroundItem.anIntArray2929[1 + k];
                          GroundItem.anIntArray2929[k++] = l51 * k19;
                          continue;
                        }
                        if (4003 == j1) {
                          k -= 2;
                          int l19 = GroundItem.anIntArray2929[k];
                          int i52 = GroundItem.anIntArray2929[k - -1];
                          GroundItem.anIntArray2929[k++] = l19 / i52;
                          continue;
                        }
                        if (~j1 == -4005) {
                          int i20 = GroundItem.anIntArray2929[--k];
                          GroundItem.anIntArray2929[k++] = (int) ((double) i20 * Math.random());
                          continue;
                        }
                        if (4005 == j1) {
                          int j20 = GroundItem.anIntArray2929[--k];
                          GroundItem.anIntArray2929[k++] =
                            (int) (Math.random() * (double) (1 + j20));
                          continue;
                        }
                        if (4006 == j1) {
                          k -= 5;
                          int k20 = GroundItem.anIntArray2929[k];
                          int j52 = GroundItem.anIntArray2929[k - -1];
                          int i77 = GroundItem.anIntArray2929[k - -3];
                          int i69 = GroundItem.anIntArray2929[2 + k];
                          int j79 = GroundItem.anIntArray2929[k + 4];
                          GroundItem.anIntArray2929[k++] =
                            ((-k20 + j52) * (j79 + -i69)) / (-i69 + i77) + k20;
                          continue;
                        }
                        if (-4008 == ~j1) {
                          k -= 2;
                          long l20 = GroundItem.anIntArray2929[k];
                          long l69 = GroundItem.anIntArray2929[k + 1];
                          GroundItem.anIntArray2929[k++] = (int) ((l20 * l69) / 100L + l20);
                          continue;
                        }
                        if (-4009 == ~j1) {
                          k -= 2;
                          int i21 = GroundItem.anIntArray2929[k];
                          int k52 = GroundItem.anIntArray2929[1 + k];
                          GroundItem.anIntArray2929[k++] = TextureSampler3.method308(i21, 1 << k52);
                          continue;
                        }
                        if (4009 == j1) {
                          k -= 2;
                          int j21 = GroundItem.anIntArray2929[k];
                          int l52 = GroundItem.anIntArray2929[1 + k];
                          GroundItem.anIntArray2929[k++] =
                            ClientScript.bitAnd(-1 - (1 << l52), j21);
                          continue;
                        }
                        if (-4011 == ~j1) {
                          k -= 2;
                          int k21 = GroundItem.anIntArray2929[k];
                          int i53 = GroundItem.anIntArray2929[k - -1];
                          GroundItem.anIntArray2929[k++] =
                            ClientScript.bitAnd(k21, 1 << i53) != 0 ? 1 : 0;
                          continue;
                        }
                        if (j1 == 4011) {
                          k -= 2;
                          int j53 = GroundItem.anIntArray2929[k - -1];
                          int l21 = GroundItem.anIntArray2929[k];
                          GroundItem.anIntArray2929[k++] = l21 % j53;
                          continue;
                        }
                        if (-4013 == ~j1) {
                          k -= 2;
                          int k53 = GroundItem.anIntArray2929[k + 1];
                          int i22 = GroundItem.anIntArray2929[k];
                          if (0 != i22) {
                            GroundItem.anIntArray2929[k++] = (int) Math.pow(i22, k53);
                          } else {
                            GroundItem.anIntArray2929[k++] = 0;
                          }
                          continue;
                        }
                        if (~j1 == -4014) {
                          k -= 2;
                          int l53 = GroundItem.anIntArray2929[k - -1];
                          int j22 = GroundItem.anIntArray2929[k];
                          if (-1 != ~j22) {
                            if (~l53 == -1) {
                              GroundItem.anIntArray2929[k++] = 0x7fffffff;
                            } else {
                              GroundItem.anIntArray2929[k++] =
                                (int) Math.pow(j22, 1.0D / (double) l53);
                            }
                          } else {
                            GroundItem.anIntArray2929[k++] = 0;
                          }
                          continue;
                        }
                        if (~j1 == -4015) {
                          k -= 2;
                          int i54 = GroundItem.anIntArray2929[k + 1];
                          int k22 = GroundItem.anIntArray2929[k];
                          GroundItem.anIntArray2929[k++] = ClientScript.bitAnd(i54, k22);
                          continue;
                        }
                        if (j1 == 4015) {
                          k -= 2;
                          int l22 = GroundItem.anIntArray2929[k];
                          int j54 = GroundItem.anIntArray2929[k + 1];
                          GroundItem.anIntArray2929[k++] = TextureSampler3.method308(l22, j54);
                          continue;
                        }
                        if (-4017 == ~j1) {
                          k -= 2;
                          int i23 = GroundItem.anIntArray2929[k];
                          int k54 = GroundItem.anIntArray2929[1 + k];
                          GroundItem.anIntArray2929[k++] = ~i23 <= ~k54 ? k54 : i23;
                          continue;
                        }
                        if (~j1 == -4018) {
                          k -= 2;
                          int l54 = GroundItem.anIntArray2929[1 + k];
                          int j23 = GroundItem.anIntArray2929[k];
                          GroundItem.anIntArray2929[k++] = ~l54 > ~j23 ? j23 : l54;
                          continue;
                        }
                        if (j1 != 4018) {
                          break;
                        }
                        k -= 3;
                        long l23 = GroundItem.anIntArray2929[k];
                        long l70 = GroundItem.anIntArray2929[k + 1];
                        long l79 = GroundItem.anIntArray2929[2 + k];
                        GroundItem.anIntArray2929[k++] = (int) ((l23 * l79) / l70);
                        continue;
                      }
                      if (4200 <= j1) {
                        if (~j1 <= -4301) {
                          if (~j1 > -4401) {
                            if (4300 != j1) {
                              break;
                            }
                            k -= 2;
                            int k23 = GroundItem.anIntArray2929[k];
                            int i55 = GroundItem.anIntArray2929[1 + k];
                            Parameter class3_sub28_sub9 = Deque.method1210(64, i55);
                            if (!class3_sub28_sub9.method585(0)) {
                              GroundItem.anIntArray2929[k++] = SubNode.getNpcConfiguration(k23)
                                .method1475(i55, -26460, class3_sub28_sub9.anInt3614);
                            } else {
                              Node.aClass94Array75[l++] = SubNode.getNpcConfiguration(k23)
                                .method1477(i55, class3_sub28_sub9.aClass94_3619, true);
                            }
                            continue;
                          }
                          if (~j1 <= -4501) {
                            if (~j1 <= -4601) {
                              if (~j1 > -5101) {
                                if (j1 == 5000) {
                                  GroundItem.anIntArray2929[k++] = TextureSampler9.anInt3101;
                                  continue;
                                }
                                if (~j1 == -5002) {
                                  DummyClass24.anInt1657++;
                                  k -= 3;
                                  TextureSampler9.anInt3101 = GroundItem.anIntArray2929[k];
                                  IdentityKit.anInt467 = GroundItem.anIntArray2929[1 + k];
                                  DummyClass38.anInt734 = GroundItem.anIntArray2929[2 + k];
                                  TextureSampler12.secureBuffer.writePacket(157);
                                  TextureSampler12.secureBuffer.writeByte(
                                    TextureSampler9.anInt3101);
                                  TextureSampler12.secureBuffer.writeByte(IdentityKit.anInt467);
                                  TextureSampler12.secureBuffer.writeByte(DummyClass38.anInt734);
                                  continue;
                                }
                                if (j1 == 5002) {
                                  GameString class94_17 = Node.aClass94Array75[--l];
                                  k -= 2;
                                  int j55 = GroundItem.anIntArray2929[k];
                                  DummyClass14.anInt1956++;
                                  int j69 = GroundItem.anIntArray2929[1 + k];
                                  TextureSampler12.secureBuffer.writePacket(99);
                                  TextureSampler12.secureBuffer.writeLong(class94_17.toBase37());
                                  TextureSampler12.secureBuffer.writeByte(j55 - 1);
                                  TextureSampler12.secureBuffer.writeByte(j69);
                                  continue;
                                }
                                if (j1 == 5003) {
                                  GameString class94_46 = null;
                                  int i24 = GroundItem.anIntArray2929[--k];
                                  if (i24 < 100) {
                                    class94_46 = StringNode.aClass94Array2580[i24];
                                  }
                                  if (class94_46 == null) {
                                    class94_46 = AreaSoundEffect.aClass94_2331;
                                  }
                                  Node.aClass94Array75[l++] = class94_46;
                                  continue;
                                }
                                if (-5005 == ~j1) {
                                  int j24 = GroundItem.anIntArray2929[--k];
                                  int k55 = -1;
                                  if (j24 < 100 && null != StringNode.aClass94Array2580[j24]) {
                                    k55 = TextureSampler26.anIntArray3082[j24];
                                  }
                                  GroundItem.anIntArray2929[k++] = k55;
                                  continue;
                                }
                                if (j1 == 5005) {
                                  GroundItem.anIntArray2929[k++] = IdentityKit.anInt467;
                                  continue;
                                }
                                if (j1 == 5008) {
                                  GameString string = Node.aClass94Array75[--l];
                                  if (string.method1558(BZipDecompressorState.COMMAND_PREFIX, 0)) {
                                    FileCacheRequester.handleCommand(string);
                                  } else if (TextureSampler35.rights != 0
                                    || (!SomethingVolume15.aBoolean2433 || BufferData.aBoolean1641)
                                    && !TextureSampler31.aBoolean3166) {
                                    GameString class94_47 = string.method1534();
                                    DummyClass11.anInt2037++;
                                    byte byte3 = 0;
                                    if (class94_47.method1558(StillGraphicNode.aClass94_3548, 0)) {
                                      byte3 = 0;
                                      string = string.substring(
                                        StillGraphicNode.aClass94_3548.getLength());
                                    } else if (!class94_47.method1558(
                                      TriChromaticImageBuffer.aClass94_2490, 0)) {
                                      if (!class94_47.method1558(aClass94_806, 0)) {
                                        if (class94_47.method1558(GameClient.aClass94_2197, 0)) {
                                          byte3 = 3;
                                          string =
                                            string.substring(GameClient.aClass94_2197.getLength());
                                        } else if (class94_47.method1558(VertexNormal.aClass94_833,
                                          0)) {
                                          string =
                                            string.substring(VertexNormal.aClass94_833.getLength());
                                          byte3 = 4;
                                        } else if (class94_47.method1558(WidgetAccess.aClass94_2214,
                                          0)) {
                                          string = string.substring(
                                            WidgetAccess.aClass94_2214.getLength());
                                          byte3 = 5;
                                        } else if (!class94_47.method1558(
                                          TextureSampler11.aClass94_3246, 0)) {
                                          if (!class94_47.method1558(ComponentCanvas.aClass94_32,
                                            0)) {
                                            if (class94_47.method1558(NPC.aClass94_3981, 0)) {
                                              string =
                                                string.substring(NPC.aClass94_3981.getLength());
                                              byte3 = 8;
                                            } else if (!class94_47.method1558(MapScene.aClass94_60,
                                              0)) {
                                              if (class94_47.method1558(DummyClass14.aClass94_1961,
                                                0)) {
                                                byte3 = 10;
                                                string = string.substring(
                                                  DummyClass14.aClass94_1961.getLength());
                                              } else if (!class94_47.method1558(
                                                DummyClass5.aClass94_2992, 0)) {
                                                if (0 != TriChromaticImageBuffer.languageId) {
                                                  if (class94_47.method1558(
                                                    StillGraphicNode.aClass94_3544, 0)) {
                                                    byte3 = 0;
                                                    string = string.substring(
                                                      StillGraphicNode.aClass94_3544.getLength());
                                                  } else if (class94_47.method1558(
                                                    TriChromaticImageBuffer.aClass94_2481, 0)) {
                                                    string = string.substring(
                                                      TriChromaticImageBuffer.aClass94_2481.getLength());
                                                    byte3 = 1;
                                                  } else if (class94_47.method1558(aClass94_809,
                                                    0)) {
                                                    string =
                                                      string.substring(aClass94_809.getLength());
                                                    byte3 = 2;
                                                  } else if (!class94_47.method1558(
                                                    GameClient.aClass94_2196, 0)) {
                                                    if (!class94_47.method1558(
                                                      VertexNormal.aClass94_825, 0)) {
                                                      if (class94_47.method1558(
                                                        WidgetAccess.aClass94_2210, 0)) {
                                                        byte3 = 5;
                                                        string = string.substring(
                                                          WidgetAccess.aClass94_2210.getLength());
                                                      } else if (class94_47.method1558(
                                                        TextureSampler11.aClass94_3249, 0)) {
                                                        string = string.substring(
                                                          TextureSampler11.aClass94_3249.getLength());
                                                        byte3 = 6;
                                                      } else if (class94_47.method1558(
                                                        ComponentCanvas.aClass94_36, 0)) {
                                                        byte3 = 7;
                                                        string = string.substring(
                                                          ComponentCanvas.aClass94_36.getLength());
                                                      } else if (class94_47.method1558(
                                                        NPC.aClass94_3988, 0)) {
                                                        byte3 = 8;
                                                        string = string.substring(
                                                          NPC.aClass94_3988.getLength());
                                                      } else if (class94_47.method1558(
                                                        MapScene.aClass94_62, 0)) {
                                                        byte3 = 9;
                                                        string = string.substring(
                                                          MapScene.aClass94_62.getLength());
                                                      } else if (class94_47.method1558(
                                                        DummyClass14.aClass94_1962, 0)) {
                                                        string = string.substring(
                                                          DummyClass14.aClass94_1962.getLength());
                                                        byte3 = 10;
                                                      } else if (class94_47.method1558(
                                                        DummyClass5.aClass94_2991, 0)) {
                                                        string = string.substring(
                                                          DummyClass5.aClass94_2991.getLength());
                                                        byte3 = 11;
                                                      }
                                                    } else {
                                                      string = string.substring(
                                                        VertexNormal.aClass94_825.getLength());
                                                      byte3 = 4;
                                                    }
                                                  } else {
                                                    string = string.substring(
                                                      GameClient.aClass94_2196.getLength());
                                                    byte3 = 3;
                                                  }
                                                }
                                              } else {
                                                string = string.substring(
                                                  DummyClass5.aClass94_2992.getLength());
                                                byte3 = 11;
                                              }
                                            } else {
                                              byte3 = 9;
                                              string =
                                                string.substring(MapScene.aClass94_60.getLength());
                                            }
                                          } else {
                                            byte3 = 7;
                                            string = string.substring(
                                              ComponentCanvas.aClass94_32.getLength());
                                          }
                                        } else {
                                          byte3 = 6;
                                          string = string.substring(
                                            TextureSampler11.aClass94_3246.getLength());
                                        }
                                      } else {
                                        string = string.substring(aClass94_806.getLength());
                                        byte3 = 2;
                                      }
                                    } else {
                                      string = string.substring(
                                        TriChromaticImageBuffer.aClass94_2490.getLength());
                                      byte3 = 1;
                                    }
                                    byte byte4 = 0;
                                    class94_47 = string.method1534();
                                    if (class94_47.method1558(GameObject.aClass94_2740, 0)) {
                                      string =
                                        string.substring(GameObject.aClass94_2740.getLength());
                                      byte4 = 1;
                                    } else if (!class94_47.method1558(
                                      TextureSampler35.aClass94_3325, 0)) {
                                      if (!class94_47.method1558(DummyHashTable.aClass94_1689, 0)) {
                                        if (!class94_47.method1558(DummyClass32.aClass94_528, 0)) {
                                          if (class94_47.method1558(
                                            SpotAnimationConfig.aClass94_547, 0)) {
                                            byte4 = 5;
                                            string = string.substring(
                                              SpotAnimationConfig.aClass94_547.getLength());
                                          } else if (0 != TriChromaticImageBuffer.languageId) {
                                            if (!class94_47.method1558(GameObject.aClass94_2751,
                                              0)) {
                                              if (!class94_47.method1558(
                                                TextureSampler35.aClass94_3333, 0)) {
                                                if (!class94_47.method1558(
                                                  DummyHashTable.aClass94_1688, 0)) {
                                                  if (!class94_47.method1558(
                                                    DummyClass32.aClass94_523, 0)) {
                                                    if (class94_47.method1558(
                                                      SpotAnimationConfig.aClass94_551, 0)) {
                                                      string = string.substring(
                                                        SpotAnimationConfig.aClass94_551.getLength());
                                                      byte4 = 5;
                                                    }
                                                  } else {
                                                    byte4 = 4;
                                                    string = string.substring(
                                                      DummyClass32.aClass94_523.getLength());
                                                  }
                                                } else {
                                                  byte4 = 3;
                                                  string = string.substring(
                                                    DummyHashTable.aClass94_1688.getLength());
                                                }
                                              } else {
                                                byte4 = 2;
                                                string = string.substring(
                                                  TextureSampler35.aClass94_3333.getLength());
                                              }
                                            } else {
                                              string = string.substring(
                                                GameObject.aClass94_2751.getLength());
                                              byte4 = 1;
                                            }
                                          }
                                        } else {
                                          byte4 = 4;
                                          string =
                                            string.substring(DummyClass32.aClass94_528.getLength());
                                        }
                                      } else {
                                        string = string.substring(
                                          DummyHashTable.aClass94_1689.getLength());
                                        byte4 = 3;
                                      }
                                    } else {
                                      byte4 = 2;
                                      string = string.substring(
                                        TextureSampler35.aClass94_3325.getLength());
                                    }
                                    TextureSampler12.secureBuffer.writePacket(237);
                                    TextureSampler12.secureBuffer.writeByte(0);
                                    int k79 = TextureSampler12.secureBuffer.position;
                                    TextureSampler12.secureBuffer.writeByte(byte3);
                                    TextureSampler12.secureBuffer.writeByte(byte4);
                                    DummyClass52.method1423(false, TextureSampler12.secureBuffer,
                                      string);
                                    TextureSampler12.secureBuffer.method769((byte) -127,
                                      -k79 + TextureSampler12.secureBuffer.position);
                                  }
                                  continue;
                                }
                                if (~j1 == -5010) {
                                  l -= 2;
                                  GameString class94_48 = Node.aClass94Array75[l + 1];
                                  GameString class94_19 = Node.aClass94Array75[l];
                                  if (~TextureSampler35.rights != -1
                                    || (!SomethingVolume15.aBoolean2433 || BufferData.aBoolean1641)
                                    && !TextureSampler31.aBoolean3166) {
                                    TextureSampler12.secureBuffer.writePacket(201);
                                    AudioWorker.anInt348++;
                                    TextureSampler12.secureBuffer.writeByte(0);
                                    int k69 = TextureSampler12.secureBuffer.position;
                                    TextureSampler12.secureBuffer.writeLong(class94_19.toBase37());
                                    DummyClass52.method1423(false, TextureSampler12.secureBuffer,
                                      class94_48);
                                    TextureSampler12.secureBuffer.method769((byte) -127,
                                      TextureSampler12.secureBuffer.position - k69);
                                  }
                                  continue;
                                }
                                if (~j1 == -5011) {
                                  int k24 = GroundItem.anIntArray2929[--k];
                                  GameString class94_49 = null;
                                  if (~k24 > -101) {
                                    class94_49 = TextureSampler4.aClass94Array3226[k24];
                                  }
                                  if (null == class94_49) {
                                    class94_49 = AreaSoundEffect.aClass94_2331;
                                  }
                                  Node.aClass94Array75[l++] = class94_49;
                                  continue;
                                }
                                if (-5012 == ~j1) {
                                  int l24 = GroundItem.anIntArray2929[--k];
                                  GameString class94_50 = null;
                                  if (l24 < 100) {
                                    class94_50 = DummyClass4.aClass94Array3003[l24];
                                  }
                                  if (class94_50 == null) {
                                    class94_50 = AreaSoundEffect.aClass94_2331;
                                  }
                                  Node.aClass94Array75[l++] = class94_50;
                                  continue;
                                }
                                if (j1 == 5012) {
                                  int i25 = GroundItem.anIntArray2929[--k];
                                  int l55 = -1;
                                  if (i25 < 100) {
                                    l55 = SceneNode.anIntArray1835[i25];
                                  }
                                  GroundItem.anIntArray2929[k++] = l55;
                                  continue;
                                }
                                if (j1 == 5015) {
                                  GameString class94_20;
                                  if (TextureCache.localPlayer == null
                                    || null == TextureCache.localPlayer.name) {
                                    class94_20 = GroundItemNode.username;
                                  } else {
                                    class94_20 = TextureCache.localPlayer.getFullName();
                                  }
                                  Node.aClass94Array75[l++] = class94_20;
                                  continue;
                                }
                                if (-5017 == ~j1) {
                                  GroundItem.anIntArray2929[k++] = DummyClass38.anInt734;
                                  continue;
                                }
                                if (j1 == 5017) {
                                  GroundItem.anIntArray2929[k++] = TextureSampler16.anInt3114;
                                  continue;
                                }
                                if (5050 == j1) {
                                  int j25 = GroundItem.anIntArray2929[--k];
                                  Node.aClass94Array75[l++] =
                                    TextureSampler22.method336(j25, (byte) -54).aClass94_3538;
                                  continue;
                                }
                                if (-5052 == ~j1) {
                                  int k25 = GroundItem.anIntArray2929[--k];
                                  SomethingQuickChat2 class3_sub28_sub1 =
                                    TextureSampler22.method336(k25, (byte) -54);
                                  if (class3_sub28_sub1.anIntArray3534 != null) {
                                    GroundItem.anIntArray2929[k++] =
                                      class3_sub28_sub1.anIntArray3534.length;
                                  } else {
                                    GroundItem.anIntArray2929[k++] = 0;
                                  }
                                  continue;
                                }
                                if (j1 == 5052) {
                                  k -= 2;
                                  int l25 = GroundItem.anIntArray2929[k];
                                  int i56 = GroundItem.anIntArray2929[k - -1];
                                  SomethingQuickChat2 class3_sub28_sub1_2 =
                                    TextureSampler22.method336(l25, (byte) -54);
                                  int j77 = class3_sub28_sub1_2.anIntArray3534[i56];
                                  GroundItem.anIntArray2929[k++] = j77;
                                  continue;
                                }
                                if (~j1 == -5054) {
                                  int i26 = GroundItem.anIntArray2929[--k];
                                  SomethingQuickChat2 class3_sub28_sub1_1 =
                                    TextureSampler22.method336(i26, (byte) -54);
                                  if (class3_sub28_sub1_1.anIntArray3540 != null) {
                                    GroundItem.anIntArray2929[k++] =
                                      class3_sub28_sub1_1.anIntArray3540.length;
                                  } else {
                                    GroundItem.anIntArray2929[k++] = 0;
                                  }
                                  continue;
                                }
                                if (~j1 == -5055) {
                                  k -= 2;
                                  int j56 = GroundItem.anIntArray2929[1 + k];
                                  int j26 = GroundItem.anIntArray2929[k];
                                  GroundItem.anIntArray2929[k++] =
                                    TextureSampler22.method336(j26, (byte) -54).anIntArray3540[j56];
                                  continue;
                                }
                                if (-5056 == ~j1) {
                                  int k26 = GroundItem.anIntArray2929[--k];
                                  Node.aClass94Array75[l++] =
                                    StringNode.method733(0xbc614e, k26).method554(-1);
                                  continue;
                                }
                                if (-5057 == ~j1) {
                                  int l26 = GroundItem.anIntArray2929[--k];
                                  SomethingQuickChat class3_sub28_sub4 =
                                    StringNode.method733(0xbc614e, l26);
                                  if (null != class3_sub28_sub4.anIntArray3567) {
                                    GroundItem.anIntArray2929[k++] =
                                      class3_sub28_sub4.anIntArray3567.length;
                                  } else {
                                    GroundItem.anIntArray2929[k++] = 0;
                                  }
                                  continue;
                                }
                                if (~j1 == -5058) {
                                  k -= 2;
                                  int k56 = GroundItem.anIntArray2929[1 + k];
                                  int i27 = GroundItem.anIntArray2929[k];
                                  GroundItem.anIntArray2929[k++] =
                                    StringNode.method733(0xbc614e, i27).anIntArray3567[k56];
                                  continue;
                                }
                                if (j1 == 5058) {
                                  SceneSomething2.aClass10_1056 = new SomethingQuickChatK();
                                  SceneSomething2.aClass10_1056.anInt149 =
                                    GroundItem.anIntArray2929[--k];
                                  SceneSomething2.aClass10_1056.aClass3_Sub28_Sub4_151 =
                                    StringNode.method733(0xbc614e,
                                      SceneSomething2.aClass10_1056.anInt149);
                                  SceneSomething2.aClass10_1056.anIntArray153 =
                                    new int[SceneSomething2.aClass10_1056.aClass3_Sub28_Sub4_151.method552(
                                      true)];
                                  continue;
                                }
                                if (5059 == j1) {
                                  ByteArrayNode.anInt3613++;
                                  TextureSampler12.secureBuffer.writePacket(167);
                                  TextureSampler12.secureBuffer.writeByte(0);
                                  int j27 = TextureSampler12.secureBuffer.position;
                                  TextureSampler12.secureBuffer.writeByte(0);
                                  TextureSampler12.secureBuffer.writeShort(
                                    SceneSomething2.aClass10_1056.anInt149);
                                  SceneSomething2.aClass10_1056.aClass3_Sub28_Sub4_151.method545(
                                    TextureSampler12.secureBuffer,
                                    SceneSomething2.aClass10_1056.anIntArray153, false);
                                  TextureSampler12.secureBuffer.method769((byte) -126,
                                    -j27 + TextureSampler12.secureBuffer.position);
                                  continue;
                                }
                                if (5060 == j1) {
                                  Keyboard.anInt1906++;
                                  GameString class94_21 = Node.aClass94Array75[--l];
                                  TextureSampler12.secureBuffer.writePacket(178);
                                  TextureSampler12.secureBuffer.writeByte(0);
                                  int l56 = TextureSampler12.secureBuffer.position;
                                  TextureSampler12.secureBuffer.writeLong(class94_21.toBase37());
                                  TextureSampler12.secureBuffer.writeShort(
                                    SceneSomething2.aClass10_1056.anInt149);
                                  SceneSomething2.aClass10_1056.aClass3_Sub28_Sub4_151.method545(
                                    TextureSampler12.secureBuffer,
                                    SceneSomething2.aClass10_1056.anIntArray153, false);
                                  TextureSampler12.secureBuffer.method769((byte) 108,
                                    TextureSampler12.secureBuffer.position + -l56);
                                  continue;
                                }
                                if (-5062 == ~j1) {
                                  TextureSampler12.secureBuffer.writePacket(167);
                                  ByteArrayNode.anInt3613++;
                                  TextureSampler12.secureBuffer.writeByte(0);
                                  int k27 = TextureSampler12.secureBuffer.position;
                                  TextureSampler12.secureBuffer.writeByte(1);
                                  TextureSampler12.secureBuffer.writeShort(
                                    SceneSomething2.aClass10_1056.anInt149);
                                  SceneSomething2.aClass10_1056.aClass3_Sub28_Sub4_151.method545(
                                    TextureSampler12.secureBuffer,
                                    SceneSomething2.aClass10_1056.anIntArray153, false);
                                  TextureSampler12.secureBuffer.method769((byte) -126,
                                    -k27 + TextureSampler12.secureBuffer.position);
                                  continue;
                                }
                                if (-5063 == ~j1) {
                                  k -= 2;
                                  int i57 = GroundItem.anIntArray2929[1 + k];
                                  int l27 = GroundItem.anIntArray2929[k];
                                  GroundItem.anIntArray2929[k++] =
                                    TextureSampler22.method336(l27, (byte) -54).anIntArray3535[i57];
                                  continue;
                                }
                                if (-5064 == ~j1) {
                                  k -= 2;
                                  int j57 = GroundItem.anIntArray2929[k - -1];
                                  int i28 = GroundItem.anIntArray2929[k];
                                  GroundItem.anIntArray2929[k++] =
                                    TextureSampler22.method336(i28, (byte) -54).anIntArray3533[j57];
                                  continue;
                                }
                                if (5064 == j1) {
                                  k -= 2;
                                  int k57 = GroundItem.anIntArray2929[1 + k];
                                  int j28 = GroundItem.anIntArray2929[k];
                                  if (k57 != -1) {
                                    GroundItem.anIntArray2929[k++] =
                                      TextureSampler22.method336(j28, (byte) -54)
                                        .method529((byte) 50, k57);
                                  } else {
                                    GroundItem.anIntArray2929[k++] = -1;
                                  }
                                  continue;
                                }
                                if (j1 == 5065) {
                                  k -= 2;
                                  int k28 = GroundItem.anIntArray2929[k];
                                  int l57 = GroundItem.anIntArray2929[k + 1];
                                  if (l57 != -1) {
                                    GroundItem.anIntArray2929[k++] =
                                      TextureSampler22.method336(k28, (byte) -54).method526(l57, 0);
                                  } else {
                                    GroundItem.anIntArray2929[k++] = -1;
                                  }
                                  continue;
                                }
                                if (-5067 == ~j1) {
                                  int l28 = GroundItem.anIntArray2929[--k];
                                  GroundItem.anIntArray2929[k++] =
                                    StringNode.method733(0xbc614e, l28).method552(true);
                                  continue;
                                }
                                if (~j1 == -5068) {
                                  k -= 2;
                                  int i58 = GroundItem.anIntArray2929[k + 1];
                                  int i29 = GroundItem.anIntArray2929[k];
                                  int i70 = StringNode.method733(0xbc614e, i29).method550(49, i58);
                                  GroundItem.anIntArray2929[k++] = i70;
                                  continue;
                                }
                                if (5068 == j1) {
                                  k -= 2;
                                  int j29 = GroundItem.anIntArray2929[k];
                                  int j58 = GroundItem.anIntArray2929[1 + k];
                                  SceneSomething2.aClass10_1056.anIntArray153[j29] = j58;
                                  continue;
                                }
                                if (~j1 == -5070) {
                                  k -= 2;
                                  int k29 = GroundItem.anIntArray2929[k];
                                  int k58 = GroundItem.anIntArray2929[k + 1];
                                  SceneSomething2.aClass10_1056.anIntArray153[k29] = k58;
                                  continue;
                                }
                                if (j1 == 5070) {
                                  k -= 3;
                                  int l29 = GroundItem.anIntArray2929[k];
                                  int j70 = GroundItem.anIntArray2929[k - -2];
                                  int l58 = GroundItem.anIntArray2929[k + 1];
                                  SomethingQuickChat class3_sub28_sub4_1 =
                                    StringNode.method733(0xbc614e, l29);
                                  if (0 != class3_sub28_sub4_1.method550(73, l58)) {
                                    throw new RuntimeException("bad command");
                                  }
                                  GroundItem.anIntArray2929[k++] =
                                    class3_sub28_sub4_1.method549(-117, j70, l58);
                                  continue;
                                }
                                if (j1 == 5071) {
                                  GameString class94_22 = Node.aClass94Array75[--l];
                                  boolean flag4 = 1 == GroundItem.anIntArray2929[--k];
                                  SomethingWorldMapy.method541((byte) 123, flag4, class94_22);
                                  GroundItem.anIntArray2929[k++] = FileTable.anInt952;
                                  continue;
                                }
                                if (5072 == j1) {
                                  if (DummyClass54.aShortArray1398 == null
                                    || ~Mobile.anInt2756 <= ~FileTable.anInt952) {
                                    GroundItem.anIntArray2929[k++] = -1;
                                  } else {
                                    GroundItem.anIntArray2929[k++] = ClientScript.bitAnd(
                                      DummyClass54.aShortArray1398[Mobile.anInt2756++], 65535);
                                  }
                                  continue;
                                }
                                if (j1 != 5073) {
                                  break;
                                }
                                Mobile.anInt2756 = 0;
                                continue;
                              }
                              if (5200 > j1) {
                                if (5100 == j1) {
                                  if (!GameObjectConfig.aBooleanArray1490[86]) {
                                    GroundItem.anIntArray2929[k++] = 0;
                                  } else {
                                    GroundItem.anIntArray2929[k++] = 1;
                                  }
                                  continue;
                                }
                                if (5101 == j1) {
                                  if (GameObjectConfig.aBooleanArray1490[82]) {
                                    GroundItem.anIntArray2929[k++] = 1;
                                  } else {
                                    GroundItem.anIntArray2929[k++] = 0;
                                  }
                                  continue;
                                }
                                if (5102 != j1) {
                                  break;
                                }
                                if (GameObjectConfig.aBooleanArray1490[81]) {
                                  GroundItem.anIntArray2929[k++] = 1;
                                } else {
                                  GroundItem.anIntArray2929[k++] = 0;
                                }
                                continue;
                              }
                              if (~j1 > -5301) {
                                if (-5201 == ~j1) {
                                  NpcConfiguration.method1479(GroundItem.anIntArray2929[--k],
                                    (byte) 56);
                                  continue;
                                }
                                if (5201 == j1) {
                                  GroundItem.anIntArray2929[k++] = ByteArrayNode.method571(-109);
                                  continue;
                                }
                                if (j1 == 5202) {
                                  AudioStreamEncoder4.method503((byte) -53,
                                    GroundItem.anIntArray2929[--k]);
                                  continue;
                                }
                                if (5203 == j1) {
                                  Node.method84(Node.aClass94Array75[--l], -801);
                                  continue;
                                }
                                if (5204 == j1) {
                                  Node.aClass94Array75[l - 1] =
                                    GameStub.method27(Node.aClass94Array75[l - 1], true);
                                  continue;
                                }
                                if (5205 == j1) {
                                  StringNode0.method138(Node.aClass94Array75[--l], 0);
                                  continue;
                                }
                                if (~j1 == -5207) {
                                  int i30 = GroundItem.anIntArray2929[--k];
                                  SomethingWorldMapy class3_sub28_sub3_4 =
                                    Queue.method884(0x3fff & i30 >> 0x36628f6e, (byte) 111,
                                      0x3fff & i30);
                                  if (class3_sub28_sub3_4 != null) {
                                    Node.aClass94Array75[l++] = class3_sub28_sub3_4.aClass94_3561;
                                  } else {
                                    Node.aClass94Array75[l++] = AreaSoundEffect.aClass94_2331;
                                  }
                                  continue;
                                }
                                if (~j1 == -5208) {
                                  SomethingWorldMapy class3_sub28_sub3 =
                                    SomethingVolume15.method371(2, Node.aClass94Array75[--l]);
                                  if (null != class3_sub28_sub3
                                    && class3_sub28_sub3.aClass94_3554 != null) {
                                    Node.aClass94Array75[l++] = class3_sub28_sub3.aClass94_3554;
                                  } else {
                                    Node.aClass94Array75[l++] = AreaSoundEffect.aClass94_2331;
                                  }
                                  continue;
                                }
                                if (5208 == j1) {
                                  GroundItem.anIntArray2929[k++] = GZipDecompressor.anInt817;
                                  GroundItem.anIntArray2929[k++] = DummyClass1.anInt410;
                                  continue;
                                }
                                if (5209 == j1) {
                                  GroundItem.anIntArray2929[k++] =
                                    TextureSampler37.anInt3256 + SomethingQuickChat2.anInt3536;
                                  GroundItem.anIntArray2929[k++] =
                                    MapScene.anInt65 + -SpawnedGameObject.anInt2251 + (-1
                                      + DummyClass58.anInt1460);
                                  continue;
                                }
                                if (~j1 == -5211) {
                                  SomethingWorldMapy class3_sub28_sub3_1 =
                                    SubNode.method520((byte) -82);
                                  if (class3_sub28_sub3_1 == null) {
                                    GroundItem.anIntArray2929[k++] = 0;
                                    GroundItem.anIntArray2929[k++] = 0;
                                  } else {
                                    GroundItem.anIntArray2929[k++] =
                                      class3_sub28_sub3_1.anInt3558 * 64;
                                    GroundItem.anIntArray2929[k++] =
                                      64 * class3_sub28_sub3_1.anInt3556;
                                  }
                                  continue;
                                }
                                if (j1 == 5211) {
                                  SomethingWorldMapy class3_sub28_sub3_2 =
                                    SubNode.method520((byte) -121);
                                  if (class3_sub28_sub3_2 != null) {
                                    GroundItem.anIntArray2929[k++] =
                                      class3_sub28_sub3_2.anInt3559 - class3_sub28_sub3_2.anInt3555;
                                    GroundItem.anIntArray2929[k++] = -class3_sub28_sub3_2.anInt3562
                                      + class3_sub28_sub3_2.anInt3549;
                                  } else {
                                    GroundItem.anIntArray2929[k++] = 0;
                                    GroundItem.anIntArray2929[k++] = 0;
                                  }
                                  continue;
                                }
                                if (~j1 == -5213) {
                                  int j30 = MouseRecorder.method1258((byte) -53);
                                  int k70 = 0;
                                  GameString class94_51;
                                  if (~j30 != 0) {
                                    class94_51 = DummyClass25.aClass131_1624.aClass94Array1721[j30];
                                    k70 = DummyClass25.aClass131_1624.method1791(j30, 8);
                                  } else {
                                    class94_51 = AreaSoundEffect.aClass94_2331;
                                  }
                                  class94_51 = class94_51.method1560(Mobile.aClass94_2765, true,
                                    EnumStringFetcher.aClass94_2168);
                                  Node.aClass94Array75[l++] = class94_51;
                                  GroundItem.anIntArray2929[k++] = k70;
                                  continue;
                                }
                                if (j1 == 5213) {
                                  int i71 = 0;
                                  int k30 = TextureSampler23.method251(-1);
                                  GameString class94_52;
                                  if (0 != ~k30) {
                                    class94_52 = DummyClass25.aClass131_1624.aClass94Array1721[k30];
                                    i71 = DummyClass25.aClass131_1624.method1791(k30, 8);
                                  } else {
                                    class94_52 = AreaSoundEffect.aClass94_2331;
                                  }
                                  class94_52 = class94_52.method1560(Mobile.aClass94_2765, true,
                                    EnumStringFetcher.aClass94_2168);
                                  Node.aClass94Array75[l++] = class94_52;
                                  GroundItem.anIntArray2929[k++] = i71;
                                  continue;
                                }
                                if (j1 == 5214) {
                                  int l30 = GroundItem.anIntArray2929[--k];
                                  AbstractObjectNode.method565((byte) 86,
                                    0x3fff & l30 >> 0xa1b3276e, 0x3fff & l30);
                                  continue;
                                }
                                if (~j1 == -5216) {
                                  int i31 = GroundItem.anIntArray2929[--k];
                                  GameString class94_53 = Node.aClass94Array75[--l];
                                  boolean flag10 = false;
                                  Queue class13 = AbstractIndexedColorSprite.method1664(
                                    0x3fff & i31 >> 0xa4e408ae, 0x3fff & i31, (byte) -118);
                                  SomethingWorldMapy class3_sub28_sub3_5 =
                                    (SomethingWorldMapy) class13.getFirst();
                                  do {
                                    if (class3_sub28_sub3_5 == null) {
                                      break;
                                    }
                                    if (class3_sub28_sub3_5.aClass94_3561.method1531(class94_53)) {
                                      flag10 = true;
                                      break;
                                    }
                                    class3_sub28_sub3_5 = (SomethingWorldMapy) class13.getNext();
                                  } while (true);
                                  if (!flag10) {
                                    GroundItem.anIntArray2929[k++] = 0;
                                  } else {
                                    GroundItem.anIntArray2929[k++] = 1;
                                  }
                                  continue;
                                }
                                if (-5217 == ~j1) {
                                  int j31 = GroundItem.anIntArray2929[--k];
                                  TextureSampler36.method344(j31, 4);
                                  continue;
                                }
                                if (-5218 == ~j1) {
                                  int k31 = GroundItem.anIntArray2929[--k];
                                  if (!StringNode0.method140(k31, 20)) {
                                    GroundItem.anIntArray2929[k++] = 0;
                                  } else {
                                    GroundItem.anIntArray2929[k++] = 1;
                                  }
                                  continue;
                                }
                                if (-5219 == ~j1) {
                                  SomethingWorldMapy class3_sub28_sub3_3 =
                                    SubNode.method520((byte) -124);
                                  if (null != class3_sub28_sub3_3) {
                                    GroundItem.anIntArray2929[k++] = class3_sub28_sub3_3.anInt3563;
                                  } else {
                                    GroundItem.anIntArray2929[k++] = -1;
                                  }
                                  continue;
                                }
                                if (~j1 == -5220) {
                                  DummyClass60.method915(Node.aClass94Array75[--l], -1);
                                  continue;
                                }
                                if (-5221 != ~j1) {
                                  break;
                                }
                                GroundItem.anIntArray2929[k++] =
                                  ~GameObject.anInt2737 != -101 ? 0 : 1;
                                continue;
                              }
                              if (j1 < 5400) {
                                if (j1 == 5300) {
                                  k -= 2;
                                  int i59 = GroundItem.anIntArray2929[1 + k];
                                  int l31 = GroundItem.anIntArray2929[k];
                                  SceneNode.setWindowMode(false, 3, -8914, l31, i59);
                                  GroundItem.anIntArray2929[k++] =
                                    null != TextureSampler30.fullScreenFrame ? 1 : 0;
                                  continue;
                                }
                                if (-5302 == ~j1) {
                                  if (null != TextureSampler30.fullScreenFrame) {
                                    SceneNode.setWindowMode(false, SubNode.anInt2577, -8914, -1,
                                      -1);
                                  }
                                  continue;
                                }
                                if (5302 == j1) {
                                  DisplayMode aclass106[] = Node.method88((byte) 28);
                                  GroundItem.anIntArray2929[k++] = aclass106.length;
                                  continue;
                                }
                                if (5303 == j1) {
                                  int i32 = GroundItem.anIntArray2929[--k];
                                  DisplayMode aclass106_1[] = Node.method88((byte) 28);
                                  GroundItem.anIntArray2929[k++] = aclass106_1[i32].anInt1447;
                                  GroundItem.anIntArray2929[k++] = aclass106_1[i32].anInt1449;
                                  continue;
                                }
                                if (~j1 == -5306) {
                                  int j59 = TextureSampler21.anInt3071;
                                  int j32 = AbstractTextureSampler.anInt2378;
                                  int j71 = -1;
                                  DisplayMode aclass106_2[] = Node.method88((byte) 28);
                                  int i80 = 0;
                                  do {
                                    if (aclass106_2.length <= i80) {
                                      break;
                                    }
                                    DisplayMode class106 = aclass106_2[i80];
                                    if (j32 == class106.anInt1447 && class106.anInt1449 == j59) {
                                      j71 = i80;
                                      break;
                                    }
                                    i80++;
                                  } while (true);
                                  GroundItem.anIntArray2929[k++] = j71;
                                  continue;
                                }
                                if (j1 == 5306) {
                                  GroundItem.anIntArray2929[k++] = MidiSomething.getWindowMode();
                                  continue;
                                }
                                if (j1 == 5307) {
                                  int k32 = GroundItem.anIntArray2929[--k];
                                  if (-1 < ~k32 || -3 > ~k32) {
                                    k32 = 0;
                                  }
                                  SceneNode.setWindowMode(false, k32, -8914, -1, -1);
                                  continue;
                                }
                                if (5308 == j1) {
                                  GroundItem.anIntArray2929[k++] = SubNode.anInt2577;
                                  continue;
                                }
                                if (5309 != j1) {
                                  break;
                                }
                                int l32 = GroundItem.anIntArray2929[--k];
                                if (~l32 > -1 || -3 > ~l32) {
                                  l32 = 0;
                                }
                                SubNode.anInt2577 = l32;
                                DummyClass25.writeSettings(DummyClass35.signLink);
                                continue;
                              }
                              if (5500 > j1) {
                                if (-5401 == ~j1) {
                                  l -= 2;
                                  GameString class94_23 = Node.aClass94Array75[l];
                                  GameString class94_54 = Node.aClass94Array75[l - -1];
                                  int k71 = GroundItem.anIntArray2929[--k];
                                  AnimationSequence.anInt1853++;
                                  TextureSampler12.secureBuffer.writePacket(117);
                                  TextureSampler12.secureBuffer.writeByte(
                                    TextureSampler29.getByteLength(class94_23) - (
                                      -TextureSampler29.getByteLength(class94_54) + -1));
                                  TextureSampler12.secureBuffer.writeString(class94_23);
                                  TextureSampler12.secureBuffer.writeString(class94_54);
                                  TextureSampler12.secureBuffer.writeByte(k71);
                                  continue;
                                }
                                if (j1 == 5401) {
                                  k -= 2;
                                  TextureSampler38.aShortArray3455[GroundItem.anIntArray2929[k]] =
                                    (short) DummyClass42.method1186(0,
                                      GroundItem.anIntArray2929[k + 1]);
                                  GameStub.method28(true);
                                  Buffer.method746((byte) -29);
                                  DummyClass10.method2265(0);
                                  GameWorld.method1076(88);
                                  Cache.method1093(false);
                                  continue;
                                }
                                if (~j1 == -5406) {
                                  k -= 2;
                                  int i33 = GroundItem.anIntArray2929[k];
                                  int k59 = GroundItem.anIntArray2929[1 + k];
                                  if (i33 >= 0 && -3 < ~i33) {
                                    DummyClass43.anIntArrayArrayArray911[i33] =
                                      new int[k59 << 0x27e6541][4];
                                  }
                                  continue;
                                }
                                if (~j1 == -5407) {
                                  k -= 7;
                                  int j33 = GroundItem.anIntArray2929[k];
                                  int l59 = GroundItem.anIntArray2929[1 + k] << 0xee994ea1;
                                  int k77 = GroundItem.anIntArray2929[k - -3];
                                  int l71 = GroundItem.anIntArray2929[2 + k];
                                  int j80 = GroundItem.anIntArray2929[4 + k];
                                  int j82 = GroundItem.anIntArray2929[6 + k];
                                  int l81 = GroundItem.anIntArray2929[5 + k];
                                  if (~j33 <= -1 && ~j33 > -3
                                    && null != DummyClass43.anIntArrayArrayArray911[j33]
                                    && ~l59 <= -1
                                    && DummyClass43.anIntArrayArrayArray911[j33].length > l59) {
                                    DummyClass43.anIntArrayArrayArray911[j33][l59] = (new int[] {
                                      (ClientScript.bitAnd(0xfffc3b9, l71) >> 0x5f43122e) * 128,
                                      k77, 128 * ClientScript.bitAnd(l71, 16383), j82
                                    });
                                    DummyClass43.anIntArrayArrayArray911[j33][l59 + 1] =
                                      (new int[] {
                                        128 * (ClientScript.bitAnd(j80, 0xfffed27) >> 0xe3e5364e),
                                        l81, 128 * ClientScript.bitAnd(j80, 16383)
                                      });
                                  }
                                  continue;
                                }
                                if (~j1 == -5408) {
                                  int k33 =
                                    DummyClass43.anIntArrayArrayArray911[GroundItem.anIntArray2929[--k]].length
                                      >> 0x2b932e01;
                                  GroundItem.anIntArray2929[k++] = k33;
                                  continue;
                                }
                                if (-5412 == ~j1) {
                                  if (TextureSampler30.fullScreenFrame != null) {
                                    SceneNode.setWindowMode(false, SubNode.anInt2577, -8914, -1,
                                      -1);
                                  }
                                  if (null == TextureSampler27.frame) {
                                    DummyClass54.method1596(Widget.method856(true), (byte) 126,
                                      false);
                                  } else {
                                    System.exit(0);
                                  }
                                  continue;
                                }
                                if (j1 == 5419) {
                                  GameString class94_24 = AreaSoundEffect.aClass94_2331;
                                  if (null != SceneShadowMap.aClass64_1778) {
                                    class94_24 =
                                      DummyClass58.method1653(SceneShadowMap.aClass64_1778.anInt979,
                                        0);
                                    if (SceneShadowMap.aClass64_1778.result != null) {
                                      byte abyte0[] = null;
                                      try {
                                        abyte0 =
                                          ((String) SceneShadowMap.aClass64_1778.result).getBytes(
                                            "ISO-8859-1");
                                      } catch (UnsupportedEncodingException e) {
                                        // TODO Auto-generated catch block
                                        e.printStackTrace();
                                      }
                                      class94_24 =
                                        TextureSampler33.createString(abyte0, 0, abyte0.length);
                                    }
                                  }
                                  Node.aClass94Array75[l++] = class94_24;
                                  continue;
                                }
                                if (-5421 == ~j1) {
                                  GroundItem.anIntArray2929[k++] = SignLink.anInt1214 != 3 ? 0 : 1;
                                  continue;
                                }
                                if (j1 == 5421) {
                                  if (null != TextureSampler30.fullScreenFrame) {
                                    SceneNode.setWindowMode(false, SubNode.anInt2577, -8914, -1,
                                      -1);
                                  }
                                  boolean flag5 = 1 == GroundItem.anIntArray2929[--k];
                                  GameString class94_25 = Node.aClass94Array75[--l];
                                  GameString class94_64 = RenderAnimation.concat(new GameString[] {
                                    Widget.method856(true), class94_25
                                  });
                                  if (null == TextureSampler27.frame && (!flag5
                                    || -4 == ~SignLink.anInt1214
                                    || !SignLink.formattedOsName.startsWith("win")
                                    || DisplayMode.aBoolean1451)) {
                                    DummyClass54.method1596(class94_64, (byte) 127, flag5);
                                  } else {
                                    GameString.aBoolean2154 = flag5;
                                    TextureSampler5.aClass94_3295 = class94_64;
                                    try {
                                      AudioWorker.aClass64_351 = DummyClass35.signLink.method1452(
                                        new String(class94_64.method1568(0), "ISO-8859-1"), true);
                                    } catch (UnsupportedEncodingException e) {
                                      // TODO Auto-generated catch block
                                      e.printStackTrace();
                                    }
                                  }
                                  continue;
                                }
                                if (5422 == j1) {
                                  int i72 = GroundItem.anIntArray2929[--k];
                                  l -= 2;
                                  GameString class94_55 = Node.aClass94Array75[1 + l];
                                  GameString class94_26 = Node.aClass94Array75[l];
                                  if (-1 > ~class94_26.getLength()) {
                                    if (null == GameBuffer.titlePrefixes) {
                                      GameBuffer.titlePrefixes =
                                        new GameString[TextureSampler19.anIntArray3218[AbstractImageProducer.gameId]];
                                    }
                                    GameBuffer.titlePrefixes[i72] = class94_26;
                                  }
                                  if (~class94_55.getLength() < -1) {
                                    if (DummyOutputStream.titleSuffixes == null) {
                                      DummyOutputStream.titleSuffixes =
                                        new GameString[TextureSampler19.anIntArray3218[AbstractImageProducer.gameId]];
                                    }
                                    DummyOutputStream.titleSuffixes[i72] = class94_55;
                                  }
                                  continue;
                                }
                                if (-5424 == ~j1) {
                                  Node.aClass94Array75[--l].method1549(false);
                                  continue;
                                }
                                if (5424 == j1) {
                                  k -= 11;
                                  WidgetUpdate.anInt3600 = GroundItem.anIntArray2929[k];
                                  FileTable.anInt963 = GroundItem.anIntArray2929[k - -1];
                                  Mouse.anInt1926 = GroundItem.anIntArray2929[k + 2];
                                  SceneShadowMap.anInt1771 = GroundItem.anIntArray2929[3 + k];
                                  GameWorldSomething.anInt502 = GroundItem.anIntArray2929[4 + k];
                                  DummyClass54.anInt1400 = GroundItem.anIntArray2929[5 + k];
                                  DummyClass39.anInt739 = GroundItem.anIntArray2929[6 + k];
                                  BitVariable.anInt1126 = GroundItem.anIntArray2929[7 + k];
                                  GroundItem.anInt2937 = GroundItem.anIntArray2929[8 + k];
                                  TextureSampler32.anInt3351 = GroundItem.anIntArray2929[k + 9];
                                  DummyClass14.anInt1957 = GroundItem.anIntArray2929[10 + k];
                                  Projectile.sprites.isLoaded(GameWorldSomething.anInt502);
                                  Projectile.sprites.isLoaded(DummyClass54.anInt1400);
                                  Projectile.sprites.isLoaded(DummyClass39.anInt739);
                                  Projectile.sprites.isLoaded(BitVariable.anInt1126);
                                  Projectile.sprites.isLoaded(GroundItem.anInt2937);
                                  FileUnpacker.aBoolean1951 = true;
                                  continue;
                                }
                                if (~j1 == -5426) {
                                  AbstractTextureSampler.method165(-7878);
                                  FileUnpacker.aBoolean1951 = false;
                                  continue;
                                }
                                if (-5427 == ~j1) {
                                  DummyClass12.anInt2027 = GroundItem.anIntArray2929[--k];
                                  continue;
                                }
                                if (-5428 != ~j1) {
                                  break;
                                }
                                k -= 2;
                                DummyClass54.anInt1403 = GroundItem.anIntArray2929[k];
                                WorldMapLabel.anInt1719 = GroundItem.anIntArray2929[k + 1];
                                continue;
                              }
                              if (5600 > j1) {
                                if (5500 == j1) {
                                  k -= 4;
                                  int l33 = GroundItem.anIntArray2929[k];
                                  int l77 = GroundItem.anIntArray2929[k - -3];
                                  int j72 = GroundItem.anIntArray2929[k - -2];
                                  int i60 = GroundItem.anIntArray2929[k + 1];
                                  TriChromaticImageBuffer.method390(false, j72, i60, l77,
                                    (byte) -128, -ProceduralTexture.anInt1152 + (0x3fff & l33),
                                    ((0xffffe30 & l33) >> 0x372f8c2e) - WorldMapLabel.anInt1716);
                                  continue;
                                }
                                if (j1 == 5501) {
                                  k -= 4;
                                  int j60 = GroundItem.anIntArray2929[1 + k];
                                  int i34 = GroundItem.anIntArray2929[k];
                                  int i78 = GroundItem.anIntArray2929[k - -3];
                                  int k72 = GroundItem.anIntArray2929[k + 2];
                                  Something3d.method2238(j60,
                                    (0x3fff & i34) - ProceduralTexture.anInt1152, k72,
                                    -WorldMapLabel.anInt1716 + ((0xffff221 & i34) >> 0xcd90732e),
                                    (byte) -21, i78);
                                  continue;
                                }
                                if (~j1 == -5503) {
                                  k -= 6;
                                  int j34 = GroundItem.anIntArray2929[k];
                                  if (~j34 <= -3) {
                                    throw new RuntimeException();
                                  }
                                  NpcConfiguration.anInt1252 = j34;
                                  int k60 = GroundItem.anIntArray2929[k - -1];
                                  if (
                                    ~(DummyClass43.anIntArrayArrayArray911[NpcConfiguration.anInt1252].length
                                      >> 0x84afc601) >= ~(1 + k60)) {
                                    throw new RuntimeException();
                                  }
                                  FileCacheRequester.anInt1081 = k60;
                                  DummyClass8.anInt4020 = 0;
                                  DummyClass21.anInt1759 = GroundItem.anIntArray2929[k + 2];
                                  AbstractTextureSampler.anInt2383 =
                                    GroundItem.anIntArray2929[k + 3];
                                  int l72 = GroundItem.anIntArray2929[k + 4];
                                  if (2 <= l72) {
                                    throw new RuntimeException();
                                  }
                                  VariableUpdate.anInt2293 = l72;
                                  int j78 = GroundItem.anIntArray2929[5 + k];
                                  if (
                                    DummyClass43.anIntArrayArrayArray911[VariableUpdate.anInt2293].length
                                      >> 0x4d73ee21 <= 1 + j78) {
                                    throw new RuntimeException();
                                  }
                                  DummyClass37.anInt670 = j78;
                                  SomethingPacket116.anInt1753 = 3;
                                  continue;
                                }
                                if (-5504 == ~j1) {
                                  AnimationSomething.method560(-21556);
                                  continue;
                                }
                                if (5504 == j1) {
                                  k -= 2;
                                  AreaSoundEffect.anInt2309 = GroundItem.anIntArray2929[k];
                                  SpotAnimationConfig.anInt531 = GroundItem.anIntArray2929[k + 1];
                                  if (SomethingPacket116.anInt1753 == 2) {
                                    TextureSampler28.anInt3315 = SpotAnimationConfig.anInt531;
                                    DummyClass17.anInt1823 = AreaSoundEffect.anInt2309;
                                  }
                                  Cache.method1098((byte) -74);
                                  continue;
                                }
                                if (j1 == 5505) {
                                  GroundItem.anIntArray2929[k++] = AreaSoundEffect.anInt2309;
                                  continue;
                                }
                                if (5506 != j1) {
                                  break;
                                }
                                GroundItem.anIntArray2929[k++] = SpotAnimationConfig.anInt531;
                                continue;
                              }
                              if (~j1 <= -5701) {
                                if (6100 > j1) {
                                  if (j1 == 6001) {
                                    int k34 = GroundItem.anIntArray2929[--k];
                                    if (-2 < ~k34) {
                                      k34 = 1;
                                    }
                                    if (-5 > ~k34) {
                                      k34 = 4;
                                    }
                                    AbstractFileRequest.brightnessSetting = k34;
                                    if (!GlRenderer.useOpenGlRenderer || !DisplayMode.useBumpMaps) {
                                      if (~AbstractFileRequest.brightnessSetting == -2) {
                                        DummyClass40.updateLightness(0.9F);
                                      }
                                      if (AbstractFileRequest.brightnessSetting == 2) {
                                        DummyClass40.updateLightness(0.8F);
                                      }
                                      if (3 == AbstractFileRequest.brightnessSetting) {
                                        DummyClass40.updateLightness(0.7F);
                                      }
                                      if (-5 == ~AbstractFileRequest.brightnessSetting) {
                                        DummyClass40.updateLightness(0.6F);
                                      }
                                    }
                                    if (GlRenderer.useOpenGlRenderer) {
                                      TextureSampler31.method236((byte) 64);
                                      if (!DisplayMode.useBumpMaps) {
                                        DummyClass51.method1417(104);
                                      }
                                    }
                                    Buffer.method746((byte) -29);
                                    DummyClass25.writeSettings(DummyClass35.signLink);
                                    StillGraphic.aBoolean2705 = false;
                                    continue;
                                  }
                                  if (j1 == 6002) {
                                    SceneSomething.method957(96,
                                      1 == GroundItem.anIntArray2929[--k]);
                                    StringNode0.method139(66);
                                    DummyClass51.method1417(101);
                                    Buffer.method792(0x8c1111);
                                    DummyClass25.writeSettings(DummyClass35.signLink);
                                    StillGraphic.aBoolean2705 = false;
                                    continue;
                                  }
                                  if (~j1 == -6004) {
                                    AbstractObjectNode.aBoolean3604 =
                                      ~GroundItem.anIntArray2929[--k] == -2;
                                    Buffer.method792(0x8c1111);
                                    DummyClass25.writeSettings(DummyClass35.signLink);
                                    StillGraphic.aBoolean2705 = false;
                                    continue;
                                  }
                                  if (~j1 == -6006) {
                                    Keyboard.aBoolean1905 = -2 == ~GroundItem.anIntArray2929[--k];
                                    DummyClass51.method1417(112);
                                    DummyClass25.writeSettings(DummyClass35.signLink);
                                    StillGraphic.aBoolean2705 = false;
                                    continue;
                                  }
                                  if (-6007 == ~j1) {
                                    SceneSomething.aBoolean488 =
                                      GroundItem.anIntArray2929[--k] == 1;
                                    ((TextureCache) DummyClass40.textureCache).method1616(
                                      !SceneSomething.aBoolean488, -17830);
                                    DummyClass25.writeSettings(DummyClass35.signLink);
                                    StillGraphic.aBoolean2705 = false;
                                    continue;
                                  }
                                  if (-6008 == ~j1) {
                                    Widget.aBoolean236 = -2 == ~GroundItem.anIntArray2929[--k];
                                    DummyClass25.writeSettings(DummyClass35.signLink);
                                    StillGraphic.aBoolean2705 = false;
                                    continue;
                                  }
                                  if (~j1 == -6009) {
                                    GameWorld.aBoolean2623 = GroundItem.anIntArray2929[--k] == 1;
                                    DummyClass25.writeSettings(DummyClass35.signLink);
                                    StillGraphic.aBoolean2705 = false;
                                    continue;
                                  }
                                  if (~j1 == -6010) {
                                    TextureSampler0.aBoolean3275 =
                                      -2 == ~GroundItem.anIntArray2929[--k];
                                    DummyClass25.writeSettings(DummyClass35.signLink);
                                    StillGraphic.aBoolean2705 = false;
                                    continue;
                                  }
                                  if (j1 == 6010) {
                                    Projectile.aBoolean2910 = 1 == GroundItem.anIntArray2929[--k];
                                    DummyClass25.writeSettings(DummyClass35.signLink);
                                    StillGraphic.aBoolean2705 = false;
                                    continue;
                                  }
                                  if (-6012 == ~j1) {
                                    int l34 = GroundItem.anIntArray2929[--k];
                                    if (-1 < ~l34 || l34 > 2) {
                                      l34 = 0;
                                    }
                                    HashTableIterator.anInt1137 = l34;
                                    DummyClass25.writeSettings(DummyClass35.signLink);
                                    StillGraphic.aBoolean2705 = false;
                                    continue;
                                  }
                                  if (6012 == j1) {
                                    if (GlRenderer.useOpenGlRenderer) {
                                      SomethingQuickChat.method551(0, 0, 0);
                                    }
                                    DisplayMode.useBumpMaps = -2 == ~GroundItem.anIntArray2929[--k];
                                    if (GlRenderer.useOpenGlRenderer && DisplayMode.useBumpMaps) {
                                      DummyClass40.updateLightness(0.7F);
                                    } else {
                                      if (AbstractFileRequest.brightnessSetting == 1) {
                                        DummyClass40.updateLightness(0.9F);
                                      }
                                      if (-3 == ~AbstractFileRequest.brightnessSetting) {
                                        DummyClass40.updateLightness(0.8F);
                                      }
                                      if (AbstractFileRequest.brightnessSetting == 3) {
                                        DummyClass40.updateLightness(0.7F);
                                      }
                                      if (AbstractFileRequest.brightnessSetting == 4) {
                                        DummyClass40.updateLightness(0.6F);
                                      }
                                    }
                                    DummyClass51.method1417(108);
                                    DummyClass25.writeSettings(DummyClass35.signLink);
                                    StillGraphic.aBoolean2705 = false;
                                    continue;
                                  }
                                  if (-6015 == ~j1) {
                                    DummyHashTable.aBoolean1685 =
                                      GroundItem.anIntArray2929[--k] == 1;
                                    if (GlRenderer.useOpenGlRenderer) {
                                      DummyClass51.method1417(109);
                                    }
                                    DummyClass25.writeSettings(DummyClass35.signLink);
                                    StillGraphic.aBoolean2705 = false;
                                    continue;
                                  }
                                  if (~j1 == -6016) {
                                    DummyClass35.aBoolean661 =
                                      -2 == ~GroundItem.anIntArray2929[--k];
                                    if (GlRenderer.useOpenGlRenderer) {
                                      TextureSampler31.method236((byte) 64);
                                    }
                                    DummyClass25.writeSettings(DummyClass35.signLink);
                                    StillGraphic.aBoolean2705 = false;
                                    continue;
                                  }
                                  if (6016 == j1) {
                                    int i35 = GroundItem.anIntArray2929[--k];
                                    if (GlRenderer.useOpenGlRenderer) {
                                      AnimationSomething.replaceCanvas = true;
                                    }
                                    if (0 > i35 || -3 > ~i35) {
                                      i35 = 0;
                                    }
                                    GroundItemNode.anInt3671 = i35;
                                    continue;
                                  }
                                  if (-6018 == ~j1) {
                                    TextureSampler17.aBoolean3184 =
                                      -2 == ~GroundItem.anIntArray2929[--k];
                                    GameStub.method34(-32589);
                                    DummyClass25.writeSettings(DummyClass35.signLink);
                                    StillGraphic.aBoolean2705 = false;
                                    continue;
                                  }
                                  if (~j1 == -6019) {
                                    int j35 = GroundItem.anIntArray2929[--k];
                                    if (j35 < 0) {
                                      j35 = 0;
                                    }
                                    if (-128 > ~j35) {
                                      j35 = 127;
                                    }
                                    ClientScriptCall.anInt2453 = j35;
                                    DummyClass25.writeSettings(DummyClass35.signLink);
                                    StillGraphic.aBoolean2705 = false;
                                    continue;
                                  }
                                  if (j1 == 6019) {
                                    int k35 = GroundItem.anIntArray2929[--k];
                                    if (k35 < 0) {
                                      k35 = 0;
                                    }
                                    if (-256 > ~k35) {
                                      k35 = 255;
                                    }
                                    if (~k35 != ~BZipDecompressorState.anInt120) {
                                      if (-1 == ~BZipDecompressorState.anInt120
                                        && 0 != ~AbstractFrameRegulator.anInt1691) {
                                        SceneSomething2.method1285(SomethingTexture1.fileUnpacker6,
                                          false, AbstractFrameRegulator.anInt1691, 0, false, k35);
                                        MidiSomething.aBoolean1158 = false;
                                      } else if (-1 == ~k35) {
                                        SceneNode.method1870(false);
                                        MidiSomething.aBoolean1158 = false;
                                      } else {
                                        StringNode.method736(k35, 115);
                                      }
                                      BZipDecompressorState.anInt120 = k35;
                                    }
                                    DummyClass25.writeSettings(DummyClass35.signLink);
                                    StillGraphic.aBoolean2705 = false;
                                    continue;
                                  }
                                  if (-6021 == ~j1) {
                                    int l35 = GroundItem.anIntArray2929[--k];
                                    if (-1 < ~l35) {
                                      l35 = 0;
                                    }
                                    if (127 < l35) {
                                      l35 = 127;
                                    }
                                    DummyClass28.anInt340 = l35;
                                    DummyClass25.writeSettings(DummyClass35.signLink);
                                    StillGraphic.aBoolean2705 = false;
                                    continue;
                                  }
                                  if (j1 == 6021) {
                                    FileCacheRequester.aBoolean1084 =
                                      ~GroundItem.anIntArray2929[--k] == -2;
                                    Buffer.method792(0x8c1111);
                                    continue;
                                  }
                                  if (~j1 == -6024) {
                                    int i36 = GroundItem.anIntArray2929[--k];
                                    if (0 > i36) {
                                      i36 = 0;
                                    }
                                    if (~i36 < -3) {
                                      i36 = 2;
                                    }
                                    boolean flag6 = false;
                                    if (96 > AudioStreamEncoder3.anInt3492) {
                                      flag6 = true;
                                      i36 = 0;
                                    }
                                    DummyClass0.method1758(i36);
                                    DummyClass25.writeSettings(DummyClass35.signLink);
                                    StillGraphic.aBoolean2705 = false;
                                    GroundItem.anIntArray2929[k++] = flag6 ? 0 : 1;
                                    continue;
                                  }
                                  if (-6025 == ~j1) {
                                    int j36 = GroundItem.anIntArray2929[--k];
                                    if (j36 < 0 || 2 < j36) {
                                      j36 = 0;
                                    }
                                    Parameter.anInt3622 = j36;
                                    DummyClass25.writeSettings(DummyClass35.signLink);
                                    continue;
                                  }
                                  if (~j1 != -6029) {
                                    break;
                                  }
                                  DummyClass4.aBoolean3004 = ~GroundItem.anIntArray2929[--k] != -1;
                                  DummyClass25.writeSettings(DummyClass35.signLink);
                                  continue;
                                }
                                if (-6201 < ~j1) {
                                  if (j1 == 6101) {
                                    GroundItem.anIntArray2929[k++] =
                                      AbstractFileRequest.brightnessSetting;
                                    continue;
                                  }
                                  if (j1 == 6102) {
                                    GroundItem.anIntArray2929[k++] = NPC.method1986(109) ? 1 : 0;
                                    continue;
                                  }
                                  if (-6104 == ~j1) {
                                    GroundItem.anIntArray2929[k++] =
                                      AbstractObjectNode.aBoolean3604 ? 1 : 0;
                                    continue;
                                  }
                                  if (-6106 == ~j1) {
                                    GroundItem.anIntArray2929[k++] = Keyboard.aBoolean1905 ? 1 : 0;
                                    continue;
                                  }
                                  if (-6107 == ~j1) {
                                    GroundItem.anIntArray2929[k++] =
                                      SceneSomething.aBoolean488 ? 1 : 0;
                                    continue;
                                  }
                                  if (-6108 == ~j1) {
                                    GroundItem.anIntArray2929[k++] = Widget.aBoolean236 ? 1 : 0;
                                    continue;
                                  }
                                  if (~j1 == -6109) {
                                    GroundItem.anIntArray2929[k++] = GameWorld.aBoolean2623 ? 1 : 0;
                                    continue;
                                  }
                                  if (6109 == j1) {
                                    GroundItem.anIntArray2929[k++] =
                                      TextureSampler0.aBoolean3275 ? 1 : 0;
                                    continue;
                                  }
                                  if (-6111 == ~j1) {
                                    GroundItem.anIntArray2929[k++] =
                                      Projectile.aBoolean2910 ? 1 : 0;
                                    continue;
                                  }
                                  if (~j1 == -6112) {
                                    GroundItem.anIntArray2929[k++] = HashTableIterator.anInt1137;
                                    continue;
                                  }
                                  if (6112 == j1) {
                                    GroundItem.anIntArray2929[k++] =
                                      DisplayMode.useBumpMaps ? 1 : 0;
                                    continue;
                                  }
                                  if (6114 == j1) {
                                    GroundItem.anIntArray2929[k++] =
                                      DummyHashTable.aBoolean1685 ? 1 : 0;
                                    continue;
                                  }
                                  if (~j1 == -6116) {
                                    GroundItem.anIntArray2929[k++] =
                                      DummyClass35.aBoolean661 ? 1 : 0;
                                    continue;
                                  }
                                  if (~j1 == -6117) {
                                    GroundItem.anIntArray2929[k++] = GroundItemNode.anInt3671;
                                    continue;
                                  }
                                  if (6117 == j1) {
                                    GroundItem.anIntArray2929[k++] =
                                      TextureSampler17.aBoolean3184 ? 1 : 0;
                                    continue;
                                  }
                                  if (~j1 == -6119) {
                                    GroundItem.anIntArray2929[k++] = ClientScriptCall.anInt2453;
                                    continue;
                                  }
                                  if (6119 == j1) {
                                    GroundItem.anIntArray2929[k++] = BZipDecompressorState.anInt120;
                                    continue;
                                  }
                                  if (-6121 == ~j1) {
                                    GroundItem.anIntArray2929[k++] = DummyClass28.anInt340;
                                    continue;
                                  }
                                  if (-6122 == ~j1) {
                                    if (GlRenderer.useOpenGlRenderer) {
                                      GroundItem.anIntArray2929[k++] =
                                        GlRenderer.multiSampleSupport ? 1 : 0;
                                    } else {
                                      GroundItem.anIntArray2929[k++] = 0;
                                    }
                                    continue;
                                  }
                                  if (j1 == 6123) {
                                    GroundItem.anIntArray2929[k++] = DummyClass0.method1757();
                                    continue;
                                  }
                                  if (-6125 == ~j1) {
                                    GroundItem.anIntArray2929[k++] = Parameter.anInt3622;
                                    continue;
                                  }
                                  if (j1 != 6128) {
                                    break;
                                  }
                                  GroundItem.anIntArray2929[k++] = DummyClass4.aBoolean3004 ? 1 : 0;
                                  continue;
                                }
                                if (~j1 <= -6301) {
                                  if (j1 < 6400) {
                                    if (~j1 == -6301) {
                                      GroundItem.anIntArray2929[k++] =
                                        (int) (Time.getCurrentTimeMillis() / 60000L);
                                      continue;
                                    }
                                    if (-6302 == ~j1) {
                                      GroundItem.anIntArray2929[k++] =
                                        -11745 + (int) (Time.getCurrentTimeMillis() / 0x5265c00L);
                                      continue;
                                    }
                                    if (j1 == 6302) {
                                      k -= 3;
                                      int i73 = GroundItem.anIntArray2929[k + 2];
                                      int l60 = GroundItem.anIntArray2929[k - -1];
                                      int k36 = GroundItem.anIntArray2929[k];
                                      Parameter.aCalendar3616.clear();
                                      Parameter.aCalendar3616.set(11, 12);
                                      Parameter.aCalendar3616.set(i73, l60, k36);
                                      GroundItem.anIntArray2929[k++] =
                                        -11745 + (int) (Parameter.aCalendar3616.getTime().getTime()
                                          / 0x5265c00L);
                                      continue;
                                    }
                                    if (6303 == j1) {
                                      Parameter.aCalendar3616.clear();
                                      Parameter.aCalendar3616.setTime(
                                        new Date(Time.getCurrentTimeMillis()));
                                      GroundItem.anIntArray2929[k++] =
                                        Parameter.aCalendar3616.get(1);
                                      continue;
                                    }
                                    if (~j1 != -6305) {
                                      break;
                                    }
                                    boolean flag7 = true;
                                    int l36 = GroundItem.anIntArray2929[--k];
                                    if (-1 >= ~l36) {
                                      if (l36 >= 1582) {
                                        if (~(l36 % 4) == -1) {
                                          if (-1 != ~(l36 % 100)) {
                                            flag7 = true;
                                          } else if (0 != l36 % 400) {
                                            flag7 = false;
                                          }
                                        } else {
                                          flag7 = false;
                                        }
                                      } else {
                                        flag7 = l36 % 4 == 0;
                                      }
                                    } else {
                                      flag7 = ~((1 + l36) % 4) == -1;
                                    }
                                    GroundItem.anIntArray2929[k++] = flag7 ? 1 : 0;
                                    continue;
                                  }
                                  if (~j1 <= -6501) {
                                    if (j1 < 6600) {
                                      if (j1 == 6500) {
                                        if (-11 != ~DummyClass15.state
                                          || ~TextureSampler2.anInt3375 != -1
                                          || 0 != TextureSampler28.loginState
                                          || 0 != DummyCanvas.anInt23) {
                                          GroundItem.anIntArray2929[k++] = 1;
                                        } else {
                                          GroundItem.anIntArray2929[k++] =
                                            ~BufferData.method1735(29984) == 0 ? 0 : 1;
                                        }
                                        continue;
                                      }
                                      if (-6502 == ~j1) {
                                        GameWorld class44_sub1 =
                                          StillGraphic.method1953((byte) 124);
                                        if (class44_sub1 == null) {
                                          GroundItem.anIntArray2929[k++] = -1;
                                          GroundItem.anIntArray2929[k++] = 0;
                                          Node.aClass94Array75[l++] = AreaSoundEffect.aClass94_2331;
                                          GroundItem.anIntArray2929[k++] = 0;
                                          Node.aClass94Array75[l++] = AreaSoundEffect.aClass94_2331;
                                          GroundItem.anIntArray2929[k++] = 0;
                                        } else {
                                          GroundItem.anIntArray2929[k++] = class44_sub1.anInt2621;
                                          GroundItem.anIntArray2929[k++] = class44_sub1.flags;
                                          Node.aClass94Array75[l++] = class44_sub1.aClass94_2620;
                                          GameWorldSomething class26 = class44_sub1.method1078(60);
                                          GroundItem.anIntArray2929[k++] = class26.anInt507;
                                          Node.aClass94Array75[l++] = class26.aClass94_508;
                                          GroundItem.anIntArray2929[k++] = class44_sub1.anInt722;
                                        }
                                        continue;
                                      }
                                      if (~j1 == -6503) {
                                        GameWorld class44_sub1_1 = method1107(5422);
                                        if (null == class44_sub1_1) {
                                          GroundItem.anIntArray2929[k++] = -1;
                                          GroundItem.anIntArray2929[k++] = 0;
                                          Node.aClass94Array75[l++] = AreaSoundEffect.aClass94_2331;
                                          GroundItem.anIntArray2929[k++] = 0;
                                          Node.aClass94Array75[l++] = AreaSoundEffect.aClass94_2331;
                                          GroundItem.anIntArray2929[k++] = 0;
                                        } else {
                                          GroundItem.anIntArray2929[k++] = class44_sub1_1.anInt2621;
                                          GroundItem.anIntArray2929[k++] = class44_sub1_1.flags;
                                          Node.aClass94Array75[l++] = class44_sub1_1.aClass94_2620;
                                          GameWorldSomething class26_1 =
                                            class44_sub1_1.method1078(70);
                                          GroundItem.anIntArray2929[k++] = class26_1.anInt507;
                                          Node.aClass94Array75[l++] = class26_1.aClass94_508;
                                          GroundItem.anIntArray2929[k++] = class44_sub1_1.anInt722;
                                        }
                                        continue;
                                      }
                                      if (-6504 == ~j1) {
                                        int i37 = GroundItem.anIntArray2929[--k];
                                        if (~DummyClass15.state != -11
                                          || -1 != ~TextureSampler2.anInt3375
                                          || TextureSampler28.loginState != 0
                                          || -1 != ~DummyCanvas.anInt23) {
                                          GroundItem.anIntArray2929[k++] = 0;
                                        } else {
                                          GroundItem.anIntArray2929[k++] =
                                            MaterialShader5.method1627(i37, (byte) -7) ? 1 : 0;
                                        }
                                        continue;
                                      }
                                      if (j1 == 6504) {
                                        GameString.anInt2148 = GroundItem.anIntArray2929[--k];
                                        DummyClass25.writeSettings(DummyClass35.signLink);
                                        continue;
                                      }
                                      if (6505 == j1) {
                                        GroundItem.anIntArray2929[k++] = GameString.anInt2148;
                                        continue;
                                      }
                                      if (~j1 == -6507) {
                                        int j37 = GroundItem.anIntArray2929[--k];
                                        GameWorld class44_sub1_2 =
                                          ClassCheckRequest.method130(120, j37);
                                        if (class44_sub1_2 != null) {
                                          GroundItem.anIntArray2929[k++] = class44_sub1_2.flags;
                                          Node.aClass94Array75[l++] = class44_sub1_2.aClass94_2620;
                                          GameWorldSomething class26_2 =
                                            class44_sub1_2.method1078(-87);
                                          GroundItem.anIntArray2929[k++] = class26_2.anInt507;
                                          Node.aClass94Array75[l++] = class26_2.aClass94_508;
                                          GroundItem.anIntArray2929[k++] = class44_sub1_2.anInt722;
                                        } else {
                                          GroundItem.anIntArray2929[k++] = -1;
                                          Node.aClass94Array75[l++] = AreaSoundEffect.aClass94_2331;
                                          GroundItem.anIntArray2929[k++] = 0;
                                          Node.aClass94Array75[l++] = AreaSoundEffect.aClass94_2331;
                                          GroundItem.anIntArray2929[k++] = 0;
                                        }
                                        continue;
                                      }
                                      if (~j1 != -6508) {
                                        break;
                                      }
                                      k -= 4;
                                      int j73 = GroundItem.anIntArray2929[k + 2];
                                      int k37 = GroundItem.anIntArray2929[k];
                                      boolean flag11 = ~GroundItem.anIntArray2929[k - -3] == -2;
                                      boolean flag8 = GroundItem.anIntArray2929[1 + k] == 1;
                                      DummyClass21.method1808(j73, flag8, (byte) 30, k37, flag11);
                                      continue;
                                    }
                                    if (~j1 <= -6701) {
                                      break;
                                    }
                                    if (6600 == j1) {
                                      AudioWorker.aBoolean346 = GroundItem.anIntArray2929[--k] == 1;
                                      DummyClass25.writeSettings(DummyClass35.signLink);
                                      continue;
                                    }
                                    if (j1 != 6601) {
                                      break;
                                    }
                                    GroundItem.anIntArray2929[k++] =
                                      AudioWorker.aBoolean346 ? 1 : 0;
                                    continue;
                                  }
                                  if (6405 == j1) {
                                    GroundItem.anIntArray2929[k++] =
                                      Cache.method1088(false) ? 1 : 0;
                                    continue;
                                  }
                                  if (~j1 != -6407) {
                                    break;
                                  }
                                  GroundItem.anIntArray2929[k++] =
                                    DummyClass13.method2194(255) ? 1 : 0;
                                  continue;
                                }
                                if (j1 == 6200) {
                                  k -= 2;
                                  DisplayMode.aShort1444 = (short) GroundItem.anIntArray2929[k];
                                  if (0 >= DisplayMode.aShort1444) {
                                    DisplayMode.aShort1444 = 256;
                                  }
                                  TextureSampler33.aShort3052 =
                                    (short) GroundItem.anIntArray2929[1 + k];
                                  if (~TextureSampler33.aShort3052 >= -1) {
                                    TextureSampler33.aShort3052 = 205;
                                  }
                                  continue;
                                }
                                if (-6202 == ~j1) {
                                  k -= 2;
                                  DummyOutputStream.aShort46 = (short) GroundItem.anIntArray2929[k];
                                  if (~DummyOutputStream.aShort46 >= -1) {
                                    DummyOutputStream.aShort46 = 256;
                                  }
                                  GameObjectConfig.aShort1535 =
                                    (short) GroundItem.anIntArray2929[1 + k];
                                  if (GameObjectConfig.aShort1535 <= 0) {
                                    GameObjectConfig.aShort1535 = 320;
                                  }
                                  continue;
                                }
                                if (-6203 == ~j1) {
                                  k -= 4;
                                  TextureSampler4.aShort3241 = (short) GroundItem.anIntArray2929[k];
                                  if (~TextureSampler4.aShort3241 >= -1) {
                                    TextureSampler4.aShort3241 = 1;
                                  }
                                  DummyClass18.aShort83 = (short) GroundItem.anIntArray2929[1 + k];
                                  if (DummyClass18.aShort83 > 0) {
                                    if (TextureSampler4.aShort3241 > DummyClass18.aShort83) {
                                      DummyClass18.aShort83 = TextureSampler4.aShort3241;
                                    }
                                  } else {
                                    DummyClass18.aShort83 = 32767;
                                  }
                                  GameWorldSomething.aShort505 =
                                    (short) GroundItem.anIntArray2929[2 + k];
                                  if (-1 <= ~GameWorldSomething.aShort505) {
                                    GameWorldSomething.aShort505 = 1;
                                  }
                                  TextureSampler18.aShort4038 =
                                    (short) GroundItem.anIntArray2929[k - -3];
                                  if (TextureSampler18.aShort4038 > 0) {
                                    if (~TextureSampler18.aShort4038
                                      > ~GameWorldSomething.aShort505) {
                                      TextureSampler18.aShort4038 = GameWorldSomething.aShort505;
                                    }
                                  } else {
                                    TextureSampler18.aShort4038 = 32767;
                                  }
                                  continue;
                                }
                                if (~j1 == -6204) {
                                  DummyClass45.method1239(FloorOverlay.aClass11_2091.anInt168, 81,
                                    0, FloorOverlay.aClass11_2091.anInt193, 0, false);
                                  GroundItem.anIntArray2929[k++] = HintMarker.anInt1358;
                                  GroundItem.anIntArray2929[k++] = ComponentCanvas.anInt31;
                                  continue;
                                }
                                if (6204 == j1) {
                                  GroundItem.anIntArray2929[k++] = DummyOutputStream.aShort46;
                                  GroundItem.anIntArray2929[k++] = GameObjectConfig.aShort1535;
                                  continue;
                                }
                                if (j1 != 6205) {
                                  break;
                                }
                                GroundItem.anIntArray2929[k++] = DisplayMode.aShort1444;
                                GroundItem.anIntArray2929[k++] = TextureSampler33.aShort3052;
                                continue;
                              }
                              if (-5601 == ~j1) {
                                l -= 2;
                                GameString class94_27 = Node.aClass94Array75[l];
                                GameString class94_56 = Node.aClass94Array75[l + 1];
                                int k73 = GroundItem.anIntArray2929[--k];
                                if (-11 == ~DummyClass15.state && ~TextureSampler2.anInt3375 == -1
                                  && -1 == ~TextureSampler28.loginState
                                  && ~DummyCanvas.anInt23 == -1 && -1 == ~Light.anInt692) {
                                  WorldMapLabel.method1793(class94_27, class94_56, k73, (byte) -38);
                                }
                                continue;
                              }
                              if (-5602 == ~j1) {
                                DummyClass31.method1681(-1);
                                continue;
                              }
                              if (-5603 == ~j1) {
                                if (0 == TextureSampler28.loginState) {
                                  AbstractImageProducer.loginResponse = -2;
                                }
                                continue;
                              }
                              if (j1 == 5603) {
                                k -= 4;
                                if (DummyClass15.state == 10 && 0 == TextureSampler2.anInt3375
                                  && -1 == ~TextureSampler28.loginState
                                  && -1 == ~DummyCanvas.anInt23 && ~Light.anInt692 == -1) {
                                  ClientScriptCall.method377(GroundItem.anIntArray2929[k - -2],
                                    GroundItem.anIntArray2929[k + 3], GroundItem.anIntArray2929[k],
                                    GroundItem.anIntArray2929[k + 1], 1);
                                }
                                continue;
                              }
                              if (~j1 == -5605) {
                                l--;
                                if (~DummyClass15.state == -11 && TextureSampler2.anInt3375 == 0
                                  && ~TextureSampler28.loginState == -1
                                  && -1 == ~DummyCanvas.anInt23 && ~Light.anInt692 == -1) {
                                  DummyClass59.method1041(Node.aClass94Array75[l].toBase37(),
                                    -28236);
                                }
                                continue;
                              }
                              if (j1 == 5605) {
                                k -= 4;
                                l -= 2;
                                if (~DummyClass15.state == -11 && 0 == TextureSampler2.anInt3375
                                  && ~TextureSampler28.loginState == -1 && DummyCanvas.anInt23 == 0
                                  && Light.anInt692 == 0) {
                                  WidgetUpdate.createIndexedColorSprite(
                                    GroundItem.anIntArray2929[k], 10603,
                                    GroundItem.anIntArray2929[k - -3],
                                    GroundItem.anIntArray2929[1 + k], Node.aClass94Array75[1 + l],
                                    Node.aClass94Array75[l].toBase37(),
                                    GroundItem.anIntArray2929[2 + k]);
                                }
                                continue;
                              }
                              if (j1 == 5606) {
                                if (DummyCanvas.anInt23 == 0) {
                                  HashTable.anInt1711 = -2;
                                }
                                continue;
                              }
                              if (-5608 == ~j1) {
                                GroundItem.anIntArray2929[k++] =
                                  AbstractImageProducer.loginResponse;
                                continue;
                              }
                              if (j1 == 5608) {
                                GroundItem.anIntArray2929[k++] = TextureSampler25.anInt3413;
                                continue;
                              }
                              if (5609 == j1) {
                                GroundItem.anIntArray2929[k++] = HashTable.anInt1711;
                                continue;
                              }
                              if (j1 == 5610) {
                                for (int l37 = 0; l37 < 5; l37++) {
                                  Node.aClass94Array75[l++] =
                                    TextureSampler29.aClass94Array3391.length <= l37 ?
                                      AreaSoundEffect.aClass94_2331 :
                                      TextureSampler29.aClass94Array3391[l37].formatName(
                                        (byte) -50);
                                }

                                TextureSampler29.aClass94Array3391 = null;
                                continue;
                              }
                              if (j1 != 5611) {
                                break;
                              }
                              GroundItem.anIntArray2929[k++] = MonoChromaticImageBuffer.anInt2561;
                              continue;
                            }
                            if (4500 != j1) {
                              break;
                            }
                            k -= 2;
                            int i38 = GroundItem.anIntArray2929[k];
                            int i61 = GroundItem.anIntArray2929[k - -1];
                            Parameter class3_sub28_sub9_1 = Deque.method1210(64, i61);
                            if (!class3_sub28_sub9_1.method585(0)) {
                              GroundItem.anIntArray2929[k++] =
                                SomethingScene.method1292((byte) 94, i38)
                                  .method600(i61, class3_sub28_sub9_1.anInt3614, (byte) -29);
                            } else {
                              Node.aClass94Array75[l++] = SomethingScene.method1292((byte) 31, i38)
                                .method604(class3_sub28_sub9_1.aClass94_3619, (byte) -44, i61);
                            }
                            continue;
                          }
                          if (~j1 != -4401) {
                            break;
                          }
                          k -= 2;
                          int j61 = GroundItem.anIntArray2929[k - -1];
                          int j38 = GroundItem.anIntArray2929[k];
                          Parameter class3_sub28_sub9_2 = Deque.method1210(64, j61);
                          if (!class3_sub28_sub9_2.method585(0)) {
                            GroundItem.anIntArray2929[k++] = DummyClass11.method2207(4, j38)
                              .method1691(class3_sub28_sub9_2.anInt3614, j61, (byte) 105);
                          } else {
                            Node.aClass94Array75[l++] = DummyClass11.method2207(4, j38)
                              .method1698(class3_sub28_sub9_2.aClass94_3619, -23085, j61);
                          }
                          continue;
                        }
                        if (j1 == 4200) {
                          int k38 = GroundItem.anIntArray2929[--k];
                          Node.aClass94Array75[l++] =
                            DummyClass35.getItemConfig(k38, (byte) 72).aClass94_770;
                          continue;
                        }
                        if (j1 == 4201) {
                          k -= 2;
                          int l38 = GroundItem.anIntArray2929[k];
                          int k61 = GroundItem.anIntArray2929[k - -1];
                          ItemConfig class48_2 = DummyClass35.getItemConfig(l38, (byte) 77);
                          if (~k61 > -2 || k61 > 5
                            || class48_2.aClass94Array801[-1 + k61] == null) {
                            Node.aClass94Array75[l++] = AreaSoundEffect.aClass94_2331;
                          } else {
                            Node.aClass94Array75[l++] = class48_2.aClass94Array801[k61 - 1];
                          }
                          continue;
                        }
                        if (~j1 == -4203) {
                          k -= 2;
                          int i39 = GroundItem.anIntArray2929[k];
                          int l61 = GroundItem.anIntArray2929[k + 1];
                          ItemConfig class48_3 = DummyClass35.getItemConfig(i39, (byte) 70);
                          if (l61 >= 1 && ~l61 >= -6 && null != class48_3.inventoryOptions[l61
                            + -1]) {
                            Node.aClass94Array75[l++] = class48_3.inventoryOptions[-1 + l61];
                          } else {
                            Node.aClass94Array75[l++] = AreaSoundEffect.aClass94_2331;
                          }
                          continue;
                        }
                        if (j1 == 4203) {
                          int j39 = GroundItem.anIntArray2929[--k];
                          GroundItem.anIntArray2929[k++] =
                            DummyClass35.getItemConfig(j39, (byte) 85).anInt757;
                          continue;
                        }
                        if (~j1 == -4205) {
                          int k39 = GroundItem.anIntArray2929[--k];
                          GroundItem.anIntArray2929[k++] =
                            ~DummyClass35.getItemConfig(k39, (byte) 99).anInt764 == -2 ? 1 : 0;
                          continue;
                        }
                        if (4205 == j1) {
                          int l39 = GroundItem.anIntArray2929[--k];
                          ItemConfig class48 = DummyClass35.getItemConfig(l39, (byte) 96);
                          if (-1 == class48.anInt791 && -1 >= ~class48.anInt789) {
                            GroundItem.anIntArray2929[k++] = class48.anInt789;
                          } else {
                            GroundItem.anIntArray2929[k++] = l39;
                          }
                          continue;
                        }
                        if (~j1 == -4207) {
                          int i40 = GroundItem.anIntArray2929[--k];
                          ItemConfig class48_1 = DummyClass35.getItemConfig(i40, (byte) 126);
                          if (0 <= class48_1.anInt791 && ~class48_1.anInt789 <= -1) {
                            GroundItem.anIntArray2929[k++] = class48_1.anInt789;
                          } else {
                            GroundItem.anIntArray2929[k++] = i40;
                          }
                          continue;
                        }
                        if (-4208 == ~j1) {
                          int j40 = GroundItem.anIntArray2929[--k];
                          GroundItem.anIntArray2929[k++] =
                            DummyClass35.getItemConfig(j40, (byte) 121).aBoolean779 ? 1 : 0;
                          continue;
                        }
                        if (-4209 == ~j1) {
                          k -= 2;
                          int k40 = GroundItem.anIntArray2929[k];
                          int i62 = GroundItem.anIntArray2929[k - -1];
                          Parameter class3_sub28_sub9_3 = Deque.method1210(64, i62);
                          if (class3_sub28_sub9_3.method585(0)) {
                            Node.aClass94Array75[l++] = DummyClass35.getItemConfig(k40, (byte) 126)
                              .method1105(107, class3_sub28_sub9_3.aClass94_3619, i62);
                          } else {
                            GroundItem.anIntArray2929[k++] =
                              DummyClass35.getItemConfig(k40, (byte) 79)
                                .method1115(class3_sub28_sub9_3.anInt3614, -119, i62);
                          }
                          continue;
                        }
                        if (4210 == j1) {
                          GameString class94_28 = Node.aClass94Array75[--l];
                          int j62 = GroundItem.anIntArray2929[--k];
                          NpcConfiguration.method1480(-2 == ~j62, class94_28, 102);
                          GroundItem.anIntArray2929[k++] = FileTable.anInt952;
                          continue;
                        }
                        if (-4212 == ~j1) {
                          if (null == DummyClass54.aShortArray1398
                            || Mobile.anInt2756 >= FileTable.anInt952) {
                            GroundItem.anIntArray2929[k++] = -1;
                          } else {
                            GroundItem.anIntArray2929[k++] =
                              ClientScript.bitAnd(DummyClass54.aShortArray1398[Mobile.anInt2756++],
                                65535);
                          }
                          continue;
                        }
                        if (4212 != j1) {
                          break;
                        }
                        Mobile.anInt2756 = 0;
                        continue;
                      }
                      if (4100 == j1) {
                        GameString class94_29 = Node.aClass94Array75[--l];
                        int k62 = GroundItem.anIntArray2929[--k];
                        Node.aClass94Array75[l++] = RenderAnimation.concat(new GameString[] {
                          class94_29, SomethingScene.toString(k62)
                        });
                        continue;
                      }
                      if (-4102 == ~j1) {
                        l -= 2;
                        GameString class94_57 = Node.aClass94Array75[l + 1];
                        GameString class94_30 = Node.aClass94Array75[l];
                        Node.aClass94Array75[l++] = RenderAnimation.concat(new GameString[] {
                          class94_30, class94_57
                        });
                        continue;
                      }
                      if (4102 == j1) {
                        GameString class94_31 = Node.aClass94Array75[--l];
                        int l62 = GroundItem.anIntArray2929[--k];
                        Node.aClass94Array75[l++] = RenderAnimation.concat(new GameString[] {
                          class94_31, Deque.method1218(true, 127, l62)
                        });
                        continue;
                      }
                      if (~j1 == -4104) {
                        GameString class94_32 = Node.aClass94Array75[--l];
                        Node.aClass94Array75[l++] = class94_32.method1534();
                        continue;
                      }
                      if (4104 == j1) {
                        int l40 = GroundItem.anIntArray2929[--k];
                        long l63 = 0xec44e2dc00L + (long) l40 * 0x5265c00L;
                        Parameter.aCalendar3616.setTime(new Date(l63));
                        int k78 = Parameter.aCalendar3616.get(5);
                        int k80 = Parameter.aCalendar3616.get(2);
                        int i82 = Parameter.aCalendar3616.get(1);
                        Node.aClass94Array75[l++] = RenderAnimation.concat(new GameString[] {
                          SomethingScene.toString(k78), ObjectCache.aClass94_1326,
                          RenderAnimation.aClass94Array358[k80], ObjectCache.aClass94_1326,
                          SomethingScene.toString(i82)
                        });
                        continue;
                      }
                      if (4105 == j1) {
                        l -= 2;
                        GameString class94_58 = Node.aClass94Array75[l + 1];
                        GameString class94_33 = Node.aClass94Array75[l];
                        if (TextureCache.localPlayer.appearance == null
                          || !TextureCache.localPlayer.appearance.aBoolean864) {
                          Node.aClass94Array75[l++] = class94_33;
                        } else {
                          Node.aClass94Array75[l++] = class94_58;
                        }
                        continue;
                      }
                      if (~j1 == -4107) {
                        int i41 = GroundItem.anIntArray2929[--k];
                        Node.aClass94Array75[l++] = SomethingScene.toString(i41);
                        continue;
                      }
                      if (~j1 == -4108) {
                        l -= 2;
                        GroundItem.anIntArray2929[k++] =
                          Node.aClass94Array75[l].method1546((byte) -63,
                            Node.aClass94Array75[l - -1]);
                        continue;
                      }
                      if (4108 == j1) {
                        GameString class94_34 = Node.aClass94Array75[--l];
                        k -= 2;
                        int l73 = GroundItem.anIntArray2929[k - -1];
                        int i63 = GroundItem.anIntArray2929[k];
                        GroundItem.anIntArray2929[k++] =
                          BlockConfig.method1430(-28922, l73).method684(class94_34, i63);
                        continue;
                      }
                      if (~j1 == -4110) {
                        k -= 2;
                        GameString class94_35 = Node.aClass94Array75[--l];
                        int i74 = GroundItem.anIntArray2929[1 + k];
                        int j63 = GroundItem.anIntArray2929[k];
                        GroundItem.anIntArray2929[k++] =
                          BlockConfig.method1430(-28922, i74).method680(class94_35, j63);
                        continue;
                      }
                      if (~j1 == -4111) {
                        l -= 2;
                        GameString class94_36 = Node.aClass94Array75[l];
                        GameString class94_59 = Node.aClass94Array75[l - -1];
                        if (1 == GroundItem.anIntArray2929[--k]) {
                          Node.aClass94Array75[l++] = class94_36;
                        } else {
                          Node.aClass94Array75[l++] = class94_59;
                        }
                        continue;
                      }
                      if (4111 == j1) {
                        GameString class94_37 = Node.aClass94Array75[--l];
                        Node.aClass94Array75[l++] = AbstractFont.otherFormat(class94_37);
                        continue;
                      }
                      if (4112 == j1) {
                        GameString class94_38 = Node.aClass94Array75[--l];
                        int k63 = GroundItem.anIntArray2929[--k];
                        if (~k63 == 0) {
                          throw new RuntimeException("null char");
                        }
                        Node.aClass94Array75[l++] = class94_38.method1548(false, k63);
                        continue;
                      }
                      if (-4114 == ~j1) {
                        int j41 = GroundItem.anIntArray2929[--k];
                        GroundItem.anIntArray2929[k++] = Something3d2.method2248(-157, j41) ? 1 : 0;
                        continue;
                      }
                      if (-4115 == ~j1) {
                        int k41 = GroundItem.anIntArray2929[--k];
                        GroundItem.anIntArray2929[k++] =
                          AbstractGameWorld.method1066(k41, -32) ? 1 : 0;
                        continue;
                      }
                      if (-4116 == ~j1) {
                        int l41 = GroundItem.anIntArray2929[--k];
                        GroundItem.anIntArray2929[k++] =
                          AudioStreamEncoder4.method487(l41, (byte) -85) ? 1 : 0;
                        continue;
                      }
                      if (4116 == j1) {
                        int i42 = GroundItem.anIntArray2929[--k];
                        GroundItem.anIntArray2929[k++] =
                          SomethingWorldMapy.method544(-49, i42) ? 1 : 0;
                        continue;
                      }
                      if (-4118 == ~j1) {
                        GameString class94_39 = Node.aClass94Array75[--l];
                        if (class94_39 != null) {
                          GroundItem.anIntArray2929[k++] = class94_39.getLength();
                        } else {
                          GroundItem.anIntArray2929[k++] = 0;
                        }
                        continue;
                      }
                      if (j1 == 4118) {
                        k -= 2;
                        GameString class94_40 = Node.aClass94Array75[--l];
                        int i64 = GroundItem.anIntArray2929[k];
                        int j74 = GroundItem.anIntArray2929[1 + k];
                        Node.aClass94Array75[l++] = class94_40.substring(j74, 0, i64);
                        continue;
                      }
                      if (-4120 == ~j1) {
                        GameString class94_41 = Node.aClass94Array75[--l];
                        GameString class94_60 = Cache.createString(class94_41.getLength());
                        boolean flag9 = false;
                        for (int l78 = 0; ~l78 > ~class94_41.getLength(); l78++) {
                          int l80 = class94_41.charAt(l78);
                          if (l80 == 60) {
                            flag9 = true;
                            continue;
                          }
                          if (~l80 != -63) {
                            if (!flag9) {
                              class94_60.method1572(l80, (byte) 125);
                            }
                          } else {
                            flag9 = false;
                          }
                        }

                        class94_60.pack();
                        Node.aClass94Array75[l++] = class94_60;
                        continue;
                      }
                      if (-4121 == ~j1) {
                        k -= 2;
                        GameString class94_42 = Node.aClass94Array75[--l];
                        int j64 = GroundItem.anIntArray2929[k];
                        int k74 = GroundItem.anIntArray2929[1 + k];
                        GroundItem.anIntArray2929[k++] = class94_42.method1555(j64, k74, 1536);
                        continue;
                      }
                      if (j1 == 4121) {
                        l -= 2;
                        GameString class94_43 = Node.aClass94Array75[l];
                        GameString class94_61 = Node.aClass94Array75[1 + l];
                        int l74 = GroundItem.anIntArray2929[--k];
                        GroundItem.anIntArray2929[k++] = class94_43.indexOf(class94_61, l74, -1);
                        continue;
                      }
                      if (j1 == 4122) {
                        int j42 = GroundItem.anIntArray2929[--k];
                        GroundItem.anIntArray2929[k++] = TextureSampler25.method332(2, j42);
                        continue;
                      }
                      if (~j1 == -4124) {
                        int k42 = GroundItem.anIntArray2929[--k];
                        GroundItem.anIntArray2929[k++] = GameException.method2287(k42, (byte) 59);
                        continue;
                      }
                      if (j1 != 4124) {
                        break;
                      }
                      boolean flag1 = ~GroundItem.anIntArray2929[--k] != -1;
                      int k64 = GroundItem.anIntArray2929[--k];
                      Node.aClass94Array75[l++] =
                        SomethingOtherWorldMap.method407(TriChromaticImageBuffer.languageId, flag1,
                          0, k64, 2);
                      continue;
                    }
                    Widget class11_8 =
                      EnumStringFetcher.getWidget((byte) 115, GroundItem.anIntArray2929[--k]);
                    if (-2801 == ~j1) {
                      GroundItem.anIntArray2929[k++] =
                        GameClient.method44(class11_8).method101(-94);
                      continue;
                    }
                    if (-2802 == ~j1) {
                      int l64 = GroundItem.anIntArray2929[--k];
                      l64--;
                      if (class11_8.aClass94Array171 != null
                        && class11_8.aClass94Array171.length > l64
                        && null != class11_8.aClass94Array171[l64]) {
                        Node.aClass94Array75[l++] = class11_8.aClass94Array171[l64];
                      } else {
                        Node.aClass94Array75[l++] = AreaSoundEffect.aClass94_2331;
                      }
                      continue;
                    }
                    if (j1 != 2802) {
                      break;
                    }
                    if (class11_8.aClass94_277 != null) {
                      Node.aClass94Array75[l++] = class11_8.aClass94_277;
                    } else {
                      Node.aClass94Array75[l++] = AreaSoundEffect.aClass94_2331;
                    }
                    continue;
                  }
                  if (~j1 == -2701) {
                    Widget class11_9 =
                      EnumStringFetcher.getWidget((byte) 126, GroundItem.anIntArray2929[--k]);
                    GroundItem.anIntArray2929[k++] = class11_9.anInt192;
                    continue;
                  }
                  if (-2702 == ~j1) {
                    Widget class11_10 =
                      EnumStringFetcher.getWidget((byte) 117, GroundItem.anIntArray2929[--k]);
                    if (-1 != class11_10.anInt192) {
                      GroundItem.anIntArray2929[k++] = class11_10.anInt271;
                    } else {
                      GroundItem.anIntArray2929[k++] = 0;
                    }
                    continue;
                  }
                  if (-2703 == ~j1) {
                    int l42 = GroundItem.anIntArray2929[--k];
                    SomethingPacket151 class3_sub31 =
                      (SomethingPacket151) TextureSampler23.aClass130_3208.get(l42);
                    if (class3_sub31 == null) {
                      GroundItem.anIntArray2929[k++] = 0;
                    } else {
                      GroundItem.anIntArray2929[k++] = 1;
                    }
                    continue;
                  }
                  if (j1 == 2703) {
                    Widget class11_11 =
                      EnumStringFetcher.getWidget((byte) 125, GroundItem.anIntArray2929[--k]);
                    if (null == class11_11.aClass11Array262) {
                      GroundItem.anIntArray2929[k++] = 0;
                    } else {
                      int i65 = class11_11.aClass11Array262.length;
                      int i75 = 0;
                      do {
                        if (class11_11.aClass11Array262.length <= i75) {
                          break;
                        }
                        if (null == class11_11.aClass11Array262[i75]) {
                          i65 = i75;
                          break;
                        }
                        i75++;
                      } while (true);
                      GroundItem.anIntArray2929[k++] = i65;
                    }
                    continue;
                  }
                  if (-2705 != ~j1 && 2705 != j1) {
                    break;
                  }
                  k -= 2;
                  int i43 = GroundItem.anIntArray2929[k];
                  int j65 = GroundItem.anIntArray2929[k + 1];
                  SomethingPacket151 class3_sub31_1 =
                    (SomethingPacket151) TextureSampler23.aClass130_3208.get(i43);
                  if (class3_sub31_1 == null || class3_sub31_1.anInt2602 != j65) {
                    GroundItem.anIntArray2929[k++] = 0;
                  } else {
                    GroundItem.anIntArray2929[k++] = 1;
                  }
                  continue;
                }
                Widget class11_12 =
                  EnumStringFetcher.getWidget((byte) 124, GroundItem.anIntArray2929[--k]);
                if (2600 == j1) {
                  GroundItem.anIntArray2929[k++] = class11_12.anInt247;
                  continue;
                }
                if (-2602 == ~j1) {
                  GroundItem.anIntArray2929[k++] = class11_12.anInt208;
                  continue;
                }
                if (-2603 == ~j1) {
                  Node.aClass94Array75[l++] = class11_12.aClass94_232;
                  continue;
                }
                if (~j1 == -2604) {
                  GroundItem.anIntArray2929[k++] = class11_12.anInt240;
                  continue;
                }
                if (~j1 == -2605) {
                  GroundItem.anIntArray2929[k++] = class11_12.anInt252;
                  continue;
                }
                if (-2606 == ~j1) {
                  GroundItem.anIntArray2929[k++] = class11_12.anInt164;
                  continue;
                }
                if (-2607 == ~j1) {
                  GroundItem.anIntArray2929[k++] = class11_12.rotationX0;
                  continue;
                }
                if (-2608 == ~j1) {
                  GroundItem.anIntArray2929[k++] = class11_12.rotationZ;
                  continue;
                }
                if (2608 == j1) {
                  GroundItem.anIntArray2929[k++] = class11_12.rotationY;
                  continue;
                }
                if (~j1 == -2610) {
                  GroundItem.anIntArray2929[k++] = class11_12.anInt223;
                  continue;
                }
                if (j1 == 2610) {
                  GroundItem.anIntArray2929[k++] = class11_12.anInt258;
                  continue;
                }
                if (-2612 == ~j1) {
                  GroundItem.anIntArray2929[k++] = class11_12.anInt264;
                  continue;
                }
                if (2612 != j1) {
                  break;
                }
                GroundItem.anIntArray2929[k++] = class11_12.anInt224;
                continue;
              }
              Widget class11_13 =
                flag ? Something3dRoot.aClass11_2055 : SomethingPacket116.aClass11_1749;
              if (j1 == 1700) {
                GroundItem.anIntArray2929[k++] = class11_13.anInt192;
                continue;
              }
              if (1701 == j1) {
                if (~class11_13.anInt192 == 0) {
                  GroundItem.anIntArray2929[k++] = 0;
                } else {
                  GroundItem.anIntArray2929[k++] = class11_13.anInt271;
                }
                continue;
              }
              if (j1 != 1702) {
                break;
              }
              GroundItem.anIntArray2929[k++] = class11_13.anInt191;
            } else {
              Widget class11_14;
              if (-2001 < ~j1) {
                class11_14 =
                  flag ? Something3dRoot.aClass11_2055 : SomethingPacket116.aClass11_1749;
              } else {
                j1 -= 1000;
                class11_14 =
                  EnumStringFetcher.getWidget((byte) 115, GroundItem.anIntArray2929[--k]);
              }
              int ai3[] = null;
              GameString class94_62 = Node.aClass94Array75[--l];
              if (~class94_62.getLength() < -1 && -90 == ~class94_62.charAt(
                class94_62.getLength() + -1)) {
                int i79 = GroundItem.anIntArray2929[--k];
                if (i79 > 0) {
                  ai3 = new int[i79];
                  while (i79-- > 0) {
                    ai3[i79] = GroundItem.anIntArray2929[--k];
                  }
                }
                class94_62 = class94_62.substring(class94_62.getLength() - 1, 0, 0);
              }
              Object aobj1[] = new Object[class94_62.getLength() - -1];
              for (int i81 = -1 + aobj1.length; 1 <= i81; i81--) {
                if (115 != class94_62.charAt(i81 + -1)) {
                  aobj1[i81] = new Integer(GroundItem.anIntArray2929[--k]);
                } else {
                  aobj1[i81] = Node.aClass94Array75[--l];
                }
              }

              int j81 = GroundItem.anIntArray2929[--k];
              if (~j81 == 0) {
                aobj1 = null;
              } else {
                aobj1[0] = new Integer(j81);
              }
              class11_14.aBoolean195 = true;
              if (1400 == j1) {
                class11_14.anObjectArray165 = aobj1;
              } else if (~j1 == -1402) {
                class11_14.anObjectArray180 = aobj1;
              } else if (j1 != 1402) {
                if (~j1 != -1404) {
                  if (j1 != 1404) {
                    if (1405 == j1) {
                      class11_14.anObjectArray295 = aobj1;
                    } else if (1406 == j1) {
                      class11_14.anObjectArray303 = aobj1;
                    } else if (1407 != j1) {
                      if (~j1 == -1409) {
                        class11_14.anObjectArray269 = aobj1;
                      } else if (~j1 != -1410) {
                        if (1410 != j1) {
                          if (-1412 != ~j1) {
                            if (-1413 == ~j1) {
                              class11_14.anObjectArray276 = aobj1;
                            } else if (j1 == 1414) {
                              class11_14.anIntArray175 = ai3;
                              class11_14.anObjectArray174 = aobj1;
                            } else if (1415 == j1) {
                              class11_14.anIntArray274 = ai3;
                              class11_14.anObjectArray158 = aobj1;
                            } else if (1416 == j1) {
                              class11_14.anObjectArray203 = aobj1;
                            } else if (1417 != j1) {
                              if (-1419 == ~j1) {
                                class11_14.anObjectArray256 = aobj1;
                              } else if (~j1 == -1420) {
                                class11_14.anObjectArray220 = aobj1;
                              } else if (-1421 == ~j1) {
                                class11_14.anObjectArray156 = aobj1;
                              } else if (~j1 != -1422) {
                                if (1422 == j1) {
                                  class11_14.anObjectArray315 = aobj1;
                                } else if (1423 != j1) {
                                  if (~j1 == -1425) {
                                    class11_14.anObjectArray176 = aobj1;
                                  } else if (j1 == 1425) {
                                    class11_14.anObjectArray268 = aobj1;
                                  } else if (-1427 != ~j1) {
                                    if (1427 != j1) {
                                      if (~j1 == -1429) {
                                        class11_14.anObjectArray161 = aobj1;
                                        class11_14.anIntArray211 = ai3;
                                      } else if (j1 == 1429) {
                                        class11_14.anIntArray185 = ai3;
                                        class11_14.anObjectArray221 = aobj1;
                                      }
                                    } else {
                                      class11_14.anObjectArray235 = aobj1;
                                    }
                                  } else {
                                    class11_14.anObjectArray217 = aobj1;
                                  }
                                } else {
                                  class11_14.anObjectArray206 = aobj1;
                                }
                              } else {
                                class11_14.anObjectArray313 = aobj1;
                              }
                            } else {
                              class11_14.anObjectArray183 = aobj1;
                            }
                          } else {
                            class11_14.anObjectArray170 = aobj1;
                          }
                        } else {
                          class11_14.anObjectArray229 = aobj1;
                        }
                      } else {
                        class11_14.anObjectArray314 = aobj1;
                      }
                    } else {
                      class11_14.anIntArray286 = ai3;
                      class11_14.anObjectArray282 = aobj1;
                    }
                  } else {
                    class11_14.anObjectArray281 = aobj1;
                  }
                } else {
                  class11_14.anObjectArray248 = aobj1;
                }
              } else {
                class11_14.anObjectArray239 = aobj1;
              }
            }
            continue;
          }
          Widget class11_15;
          if (j1 < 2000) {
            class11_15 = flag ? Something3dRoot.aClass11_2055 : SomethingPacket116.aClass11_1749;
          } else {
            class11_15 = EnumStringFetcher.getWidget((byte) 118, GroundItem.anIntArray2929[--k]);
            j1 -= 1000;
          }
          DummyClass29.method909(-21, class11_15);
          if (~j1 == -1201 || 1205 == j1) {
            k -= 2;
            int j75 = GroundItem.anIntArray2929[1 + k];
            int k65 = GroundItem.anIntArray2929[k];
            if (-1 == class11_15.anInt191) {
              Mouse.method2092(class11_15.anInt279, (byte) -47);
              TextureSampler4.method265((byte) -42, class11_15.anInt279);
              DummyClass56.method1649(class11_15.anInt279, -101);
            }
            if (-1 == k65) {
              class11_15.anInt201 = -1;
              class11_15.anInt202 = 1;
              class11_15.anInt192 = -1;
            } else {
              class11_15.anInt192 = k65;
              class11_15.anInt271 = j75;
              ItemConfig class48_4 = DummyClass35.getItemConfig(k65, (byte) 108);
              class11_15.rotationZ = class48_4.rotationZ;
              class11_15.anInt258 = class48_4.translateX;
              class11_15.rotationX0 = class48_4.rotationX;
              class11_15.anInt264 = class48_4.translateOther;
              class11_15.rotationY = class48_4.rotationY;
              class11_15.anInt164 = class48_4.anInt810;
              if (class11_15.anInt184 > 0) {
                class11_15.anInt164 = (class11_15.anInt164 * 32) / class11_15.anInt184;
              } else if (class11_15.anInt177 > 0) {
                class11_15.anInt164 = (class11_15.anInt164 * 32) / class11_15.anInt177;
              }
              class11_15.aBoolean227 = 1205 != j1;
            }
            continue;
          }
          if (j1 == 1201) {
            class11_15.anInt202 = 2;
            class11_15.anInt201 = GroundItem.anIntArray2929[--k];
            if (class11_15.anInt191 == -1) {
              DummyClass11.method2206(true, class11_15.anInt279);
            }
            continue;
          }
          if (j1 == 1202) {
            class11_15.anInt202 = 3;
            class11_15.anInt201 = TextureCache.localPlayer.appearance.method1163(-24861);
            if (class11_15.anInt191 == -1) {
              DummyClass11.method2206(true, class11_15.anInt279);
            }
            continue;
          }
          if (1203 == j1) {
            class11_15.anInt202 = 6;
            class11_15.anInt201 = GroundItem.anIntArray2929[--k];
            if (~class11_15.anInt191 == 0) {
              DummyClass11.method2206(true, class11_15.anInt279);
            }
            continue;
          }
          if (~j1 != -1205) {
            break;
          }
          class11_15.anInt202 = 5;
          class11_15.anInt201 = GroundItem.anIntArray2929[--k];
          if (~class11_15.anInt191 == 0) {
            DummyClass11.method2206(true, class11_15.anInt279);
          }
          continue;
        }
        Widget class11_16;
        if (~j1 > -2001) {
          class11_16 = flag ? Something3dRoot.aClass11_2055 : SomethingPacket116.aClass11_1749;
        } else {
          j1 -= 1000;
          class11_16 = EnumStringFetcher.getWidget((byte) 120, GroundItem.anIntArray2929[--k]);
        }
        if (j1 == 1100) {
          k -= 2;
          class11_16.anInt247 = GroundItem.anIntArray2929[k];
          if (~class11_16.anInt247 < ~(class11_16.anInt240 + -class11_16.anInt168)) {
            class11_16.anInt247 = class11_16.anInt240 + -class11_16.anInt168;
          }
          if (~class11_16.anInt247 > -1) {
            class11_16.anInt247 = 0;
          }
          class11_16.anInt208 = GroundItem.anIntArray2929[k + 1];
          if (class11_16.anInt208 > class11_16.anInt252 + -class11_16.anInt193) {
            class11_16.anInt208 = class11_16.anInt252 + -class11_16.anInt193;
          }
          if (~class11_16.anInt208 > -1) {
            class11_16.anInt208 = 0;
          }
          DummyClass29.method909(111, class11_16);
          if (-1 == class11_16.anInt191) {
            MouseRecorder.method1259(class11_16.anInt279, (byte) 109);
          }
          continue;
        }
        if (1101 == j1) {
          class11_16.anInt218 = GroundItem.anIntArray2929[--k];
          DummyClass29.method909(-123, class11_16);
          if (0 == ~class11_16.anInt191) {
            ComponentCanvas.method56(class11_16.anInt279, 99);
          }
          continue;
        }
        if (~j1 == -1103) {
          class11_16.aBoolean226 = GroundItem.anIntArray2929[--k] == 1;
          DummyClass29.method909(107, class11_16);
          continue;
        }
        if (1103 == j1) {
          class11_16.anInt223 = GroundItem.anIntArray2929[--k];
          DummyClass29.method909(-64, class11_16);
          continue;
        }
        if (-1105 == ~j1) {
          class11_16.anInt250 = GroundItem.anIntArray2929[--k];
          DummyClass29.method909(-52, class11_16);
          continue;
        }
        if (~j1 == -1106) {
          class11_16.anInt224 = GroundItem.anIntArray2929[--k];
          DummyClass29.method909(-122, class11_16);
          continue;
        }
        if (1106 == j1) {
          class11_16.anInt301 = GroundItem.anIntArray2929[--k];
          DummyClass29.method909(-33, class11_16);
          continue;
        }
        if (1107 == j1) {
          class11_16.aBoolean186 = -2 == ~GroundItem.anIntArray2929[--k];
          DummyClass29.method909(114, class11_16);
          continue;
        }
        if (-1109 == ~j1) {
          class11_16.anInt202 = 1;
          class11_16.anInt201 = GroundItem.anIntArray2929[--k];
          DummyClass29.method909(2, class11_16);
          if (~class11_16.anInt191 == 0) {
            DummyClass11.method2206(true, class11_16.anInt279);
          }
          continue;
        }
        if (j1 == 1109) {
          k -= 6;
          class11_16.anInt258 = GroundItem.anIntArray2929[k];
          class11_16.anInt264 = GroundItem.anIntArray2929[k + 1];
          class11_16.rotationX0 = GroundItem.anIntArray2929[2 + k];
          class11_16.rotationY = GroundItem.anIntArray2929[k - -3];
          class11_16.rotationZ = GroundItem.anIntArray2929[k - -4];
          class11_16.anInt164 = GroundItem.anIntArray2929[5 + k];
          DummyClass29.method909(-59, class11_16);
          if (~class11_16.anInt191 == 0) {
            TextureSampler4.method265((byte) -42, class11_16.anInt279);
            DummyClass56.method1649(class11_16.anInt279, -106);
          }
          continue;
        }
        if (j1 == 1110) {
          int l65 = GroundItem.anIntArray2929[--k];
          if (class11_16.anInt305 != l65) {
            class11_16.anInt305 = l65;
            class11_16.anInt283 = 0;
            class11_16.anInt267 = 0;
            class11_16.anInt260 = 1;
            DummyClass29.method909(116, class11_16);
          }
          if (~class11_16.anInt191 == 0) {
            DummyClass58.method1657(class11_16.anInt279, -903);
          }
          continue;
        }
        if (j1 == 1111) {
          class11_16.aBoolean181 = 1 == GroundItem.anIntArray2929[--k];
          DummyClass29.method909(118, class11_16);
          continue;
        }
        if (1112 == j1) {
          GameString class94_63 = Node.aClass94Array75[--l];
          if (!class94_63.method1528((byte) -42, class11_16.aClass94_232)) {
            class11_16.aClass94_232 = class94_63;
            DummyClass29.method909(117, class11_16);
          }
          if (0 == ~class11_16.anInt191) {
            ObjectCache.method1516(class11_16.anInt279, 91);
          }
          continue;
        }
        if (~j1 == -1114) {
          class11_16.anInt270 = GroundItem.anIntArray2929[--k];
          DummyClass29.method909(111, class11_16);
          continue;
        }
        if (~j1 == -1115) {
          k -= 3;
          class11_16.anInt194 = GroundItem.anIntArray2929[k];
          class11_16.anInt225 = GroundItem.anIntArray2929[1 + k];
          class11_16.anInt205 = GroundItem.anIntArray2929[2 + k];
          DummyClass29.method909(113, class11_16);
          continue;
        }
        if (1115 == j1) {
          class11_16.aBoolean215 = 1 == GroundItem.anIntArray2929[--k];
          DummyClass29.method909(-33, class11_16);
          continue;
        }
        if (~j1 == -1117) {
          class11_16.anInt288 = GroundItem.anIntArray2929[--k];
          DummyClass29.method909(-26, class11_16);
          continue;
        }
        if (~j1 == -1118) {
          class11_16.anInt287 = GroundItem.anIntArray2929[--k];
          DummyClass29.method909(117, class11_16);
          continue;
        }
        if (~j1 == -1119) {
          class11_16.aBoolean178 = GroundItem.anIntArray2929[--k] == 1;
          DummyClass29.method909(123, class11_16);
          continue;
        }
        if (j1 == 1119) {
          class11_16.aBoolean199 = -2 == ~GroundItem.anIntArray2929[--k];
          DummyClass29.method909(-20, class11_16);
          continue;
        }
        if (~j1 == -1121) {
          k -= 2;
          class11_16.anInt240 = GroundItem.anIntArray2929[k];
          class11_16.anInt252 = GroundItem.anIntArray2929[1 + k];
          DummyClass29.method909(117, class11_16);
          if (-1 == ~class11_16.anInt187) {
            FileRequester.method2104(class11_16, false, -116);
          }
          continue;
        }
        if (~j1 == -1122) {
          k -= 2;
          class11_16.aShort293 = (short) GroundItem.anIntArray2929[k];
          class11_16.aShort169 = (short) GroundItem.anIntArray2929[k + 1];
          DummyClass29.method909(126, class11_16);
          continue;
        }
        if (1122 == j1) {
          class11_16.aBoolean157 = ~GroundItem.anIntArray2929[--k] == -2;
          DummyClass29.method909(-66, class11_16);
          continue;
        }
        if (j1 != 1123) {
          break;
        }
        class11_16.anInt164 = GroundItem.anIntArray2929[--k];
        DummyClass29.method909(-126, class11_16);
        if (0 == ~class11_16.anInt191) {
          TextureSampler4.method265((byte) -42, class11_16.anInt279);
        }
        continue;
      }
      if (j1 == 403) {
        k -= 2;
        int i66 = GroundItem.anIntArray2929[k - -1];
        int j43 = GroundItem.anIntArray2929[k];
        int k75 = 0;
        do {
          if (MonoChromaticImageBuffer.anIntArray2559.length <= k75) {
            break;
          }
          if (j43 == MonoChromaticImageBuffer.anIntArray2559[k75]) {
            TextureCache.localPlayer.appearance.method1164(k75, i66, 0);
            continue label0;
          }
          k75++;
        } while (true);
        k75 = 0;
        do {
          if (~k75 <= ~TextureSampler4.anIntArray3228.length) {
            continue label0;
          }
          if (~j43 == ~TextureSampler4.anIntArray3228[k75]) {
            TextureCache.localPlayer.appearance.method1164(k75, i66, 0);
            continue label0;
          }
          k75++;
        } while (true);
      }
      if (404 == j1) {
        k -= 2;
        int k43 = GroundItem.anIntArray2929[k];
        int j66 = GroundItem.anIntArray2929[1 + k];
        TextureCache.localPlayer.appearance.method1162(k43, false, j66);
        continue;
      }
      if (j1 != 410) {
        break;
      }
      boolean flag2 = 0 != GroundItem.anIntArray2929[--k];
      TextureCache.localPlayer.appearance.method1159(flag2, true);
    } while (true);
    throw new IllegalStateException();
  }

  static final GameWorld method1107(int var0) {
    try {
      if (TextureSampler15.aClass44_Sub1Array3201.length > SomethingMidiFile.anInt2291) {
        return TextureSampler15.aClass44_Sub1Array3201[SomethingMidiFile.anInt2291++];
      } else {
        if (var0 != 5422) {
          method1107(-66);
        }

        return null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "h.R(" + var0 + ')');
    }
  }

  public static void method1111(int var0) {
    try {
      aClass94_808 = null;
      anIntArray781 = null;
      aClass94_809 = null;
      if (var0 == 3327) {
        aClass94_806 = null;
        aClass94_811 = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "h.P(" + var0 + ')');
    }
  }

  static final void method1119(Component var0, boolean var1) {
    try {
      var0.addMouseListener(ObjectNode.mouse);
      if (var1) {
        aClass94_811 = null;
      }

      var0.addMouseMotionListener(ObjectNode.mouse);
      var0.addFocusListener(ObjectNode.mouse);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "h.K(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }
}
