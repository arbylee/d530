final class FloorOverlay {

  static int anInt2088;
  static GameString aClass94_2089 = SpawnedGameObject.createString("compass");
  static Widget aClass11_2091 = null;
  static AbstractFont aClass3_Sub28_Sub17_2096;
  static FileUnpacker fileUnpacker16;
  static int anInt2099 = 0;
  static int anInt2104;
  int anInt2090 = 128;
  boolean aBoolean2092 = false;
  boolean aBoolean2093 = true;
  int anInt2094 = 0x122b3d;
  int anInt2095 = -1;
  int anInt2098 = -1;
  int anInt2100 = 8;
  int anInt2101 = 16;
  boolean aBoolean2102 = true;
  int anInt2103 = 0;

  final void method2274(int var1, Buffer var2, int var3) {
    try {
      while (true) {
        int var4 = var2.readUnsignedByte();
        if (var4 == 0) {
          if (var1 != 24559) {
            method2276(-85);
          }

          return;
        }

        this.method2279(0, var4, var2, var3);
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "wl.H(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
    }
  }

  private final void method2279(int var1, int var2, Buffer var3, int var4) {
    try {
      if (var1 == 0) {
        if (-2 != ~var2) {
          if (var2 != 2) {
            if (3 != var2) {
              if (5 != var2) {
                if (-8 != ~var2) {
                  if (~var2 != -9) {
                    if (-10 != ~var2) {
                      if (-11 != ~var2) {
                        if (var2 != 11) {
                          if (12 != var2) {
                            if (13 != var2) {
                              if (~var2 == -15) {
                                this.anInt2101 = var3.readUnsignedByte();
                              }
                            } else {
                              this.anInt2094 = var3.readUnsignedMedium((byte) 110);
                            }
                          } else {
                            this.aBoolean2092 = true;
                          }
                        } else {
                          this.anInt2100 = var3.readUnsignedByte();
                        }
                      } else {
                        this.aBoolean2093 = false;
                      }
                    } else {
                      this.anInt2090 = var3.readUnsignedShort();
                    }
                  } else {
                    TextureSampler26.anInt3081 = var4;
                  }
                } else {
                  this.anInt2098 = Widget.method869(116, var3.readUnsignedMedium((byte) 82));
                }
              } else {
                this.aBoolean2102 = false;
              }
            } else {
              this.anInt2095 = var3.readUnsignedShort();
              if (this.anInt2095 == '\uffff') {
                this.anInt2095 = -1;
              }
            }
          } else {
            this.anInt2095 = var3.readUnsignedByte();
          }
        } else {
          this.anInt2103 = Widget.method869(116, var3.readUnsignedMedium((byte) 83));
        }

      }
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "wl.E(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ')');
    }
  }

  static final void method2270(Mobile var0, byte var1) {
    try {
      if (AbstractGameWorld.updateCycle == var0.anInt2790 || ~var0.animationId == 0
        || var0.anInt2828 != 0 || ~(1 + var0.anInt2760) < ~GameClient.method45(var0.animationId,
        (byte) -20).anIntArray1869[var0.anInt2832]) {
        int var2 = var0.anInt2790 + -var0.anInt2800;
        int var3 = AbstractGameWorld.updateCycle + -var0.anInt2800;
        int var4 = var0.anInt2784 * 128 + 64 * var0.getSize();
        int var5 = var0.anInt2835 * 128 - -(var0.getSize() * 64);
        int var6 = 128 * var0.anInt2823 + var0.getSize() * 64;
        int var7 = 128 * var0.anInt2798 + var0.getSize() * 64;
        var0.anInt2819 = (var3 * var6 + var4 * (var2 - var3)) / var2;
        var0.anInt2829 = (var7 * var3 + var5 * (var2 - var3)) / var2;
      }

      if (var1 <= -51) {
        var0.anInt2824 = 0;
        if (-1 == ~var0.anInt2840) {
          var0.anInt2806 = 1024;
        }

        if (1 == var0.anInt2840) {
          var0.anInt2806 = 1536;
        }

        if (-3 == ~var0.anInt2840) {
          var0.anInt2806 = 0;
        }

        if (var0.anInt2840 == 3) {
          var0.anInt2806 = 512;
        }

        var0.rotationY = var0.anInt2806;
      }
    } catch (RuntimeException var8) {
      throw AbstractGameWorld.cascadeException(var8,
        "wl.K(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

  static final void method2271(int var0, int var1, int var2, int var3) {
    try {
      if (var2 != 1) {
        method2273(null, 43);
      }

      WidgetUpdate var4 = AudioStreamEncoder3.method466(var2 ^ 5, 11, var1);
      var4.g((byte) 33);
      var4.anInt3597 = var3;
      var4.anInt3598 = var0;
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "wl.F(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  static final void method2272(int[] var0, int var1, int var2, int var3, int var4, int var5,
                               int var6, int var7, int var8, boolean var9, byte var10) {
    try {
      int var11 = var2;
      if (~DummyClass47.anInt1096 < ~var2) {
        if (~var2 > ~DummyClass47.anInt1093) {
          var11 = DummyClass47.anInt1093;
        }

        int var12 = var7 + var2;
        if (DummyClass47.anInt1093 < var12) {
          if (DummyClass47.anInt1096 < var12) {
            var12 = DummyClass47.anInt1096;
          }

          int var13 = var8;
          if (~DummyClass47.anInt1099 < ~var8) {
            int var14 = var8 + var6;
            if (~var8 > ~DummyClass47.anInt1095) {
              var13 = DummyClass47.anInt1095;
            }

            if (var14 > DummyClass47.anInt1095) {
              if (var10 == 21) {
                int var15 = var11 + DummyClass47.anInt1092 * var13;
                if (-10 == ~var5) {
                  var3 = 3 & var3 - -1;
                  var5 = 1;
                }

                int var16 = -var12 + var11 + DummyClass47.anInt1092;
                var13 -= var8;
                int var20 = var6 + -var13;
                if (DummyClass47.anInt1099 < var14) {
                  var14 = DummyClass47.anInt1099;
                }

                if (~var5 == -11) {
                  var3 = var3 - -3 & 3;
                  var5 = 1;
                }

                var11 -= var2;
                int var18 = -var11 + var7;
                if (11 == var5) {
                  var3 = 3 & var3 + 3;
                  var5 = 8;
                }

                var12 -= var2;
                int var17 = var7 + -var12;
                var14 -= var8;
                int var19 = var6 - var14;
                int var21;
                int var22;
                if (-2 != ~var5) {
                  if (2 == var5) {
                    if (-1 != ~var3) {
                      if (1 == var3) {
                        for (var21 = var13; ~var21 > ~var14; ++var21) {
                          for (var22 = var11; ~var12 < ~var22; ++var22) {
                            if (0 <= var15 && ~var15 > ~var0.length) {
                              if (~(var21 << 1) >= ~var22) {
                                var0[var15] = var1;
                              } else if (var9) {
                                var0[var15] = var4;
                              }

                              ++var15;
                            } else {
                              ++var15;
                            }
                          }

                          var15 += var16;
                        }

                      } else if (var3 != 2) {
                        if (3 == var3) {
                          for (var21 = var20 + -1; var19 <= var21; --var21) {
                            for (var22 = -1 + var18; var17 <= var22; --var22) {
                              if (var21 << 1 > var22) {
                                if (var9) {
                                  var0[var15] = var4;
                                }
                              } else {
                                var0[var15] = var1;
                              }

                              ++var15;
                            }

                            var15 += var16;
                          }

                        }
                      } else {
                        for (var21 = var13; ~var14 < ~var21; ++var21) {
                          for (var22 = var18 + -1; var17 <= var22; --var22) {
                            if (var21 >> 1 >= var22) {
                              var0[var15] = var1;
                            } else if (var9) {
                              var0[var15] = var4;
                            }

                            ++var15;
                          }

                          var15 += var16;
                        }

                      }
                    } else {
                      for (var21 = var20 + -1; var19 <= var21; --var21) {
                        for (var22 = var11; ~var22 > ~var12; ++var22) {
                          if (~(var21 >> 1) <= ~var22) {
                            var0[var15] = var1;
                          } else if (var9) {
                            var0[var15] = var4;
                          }

                          ++var15;
                        }

                        var15 += var16;
                      }

                    }
                  } else if (~var5 != -4) {
                    if (~var5 != -5) {
                      if (var5 != 5) {
                        if (~var5 == -7) {
                          if (~var3 == -1) {
                            for (var21 = var13; var14 > var21; ++var21) {
                              for (var22 = var11; var12 > var22; ++var22) {
                                if (var22 > var7 / 2) {
                                  if (var9) {
                                    var0[var15] = var4;
                                  }
                                } else {
                                  var0[var15] = var1;
                                }

                                ++var15;
                              }

                              var15 += var16;
                            }

                            return;
                          }

                          if (~var3 == -2) {
                            for (var21 = var13; ~var21 > ~var14; ++var21) {
                              for (var22 = var11; var12 > var22; ++var22) {
                                if (var21 > var6 / 2) {
                                  if (var9) {
                                    var0[var15] = var4;
                                  }
                                } else {
                                  var0[var15] = var1;
                                }

                                ++var15;
                              }

                              var15 += var16;
                            }

                            return;
                          }

                          if (2 == var3) {
                            for (var21 = var13; ~var21 > ~var14; ++var21) {
                              for (var22 = var11; ~var12 < ~var22; ++var22) {
                                if (var22 >= var7 / 2) {
                                  var0[var15] = var1;
                                } else if (var9) {
                                  var0[var15] = var4;
                                }

                                ++var15;
                              }

                              var15 += var16;
                            }

                            return;
                          }

                          if (~var3 == -4) {
                            for (var21 = var13; ~var21 > ~var14; ++var21) {
                              for (var22 = var11; ~var22 > ~var12; ++var22) {
                                if (~var21 > ~(var6 / 2)) {
                                  if (var9) {
                                    var0[var15] = var4;
                                  }
                                } else {
                                  var0[var15] = var1;
                                }

                                ++var15;
                              }

                              var15 += var16;
                            }

                            return;
                          }
                        }

                        if (7 == var5) {
                          if (0 == var3) {
                            for (var21 = var13; ~var14 < ~var21; ++var21) {
                              for (var22 = var11; ~var12 < ~var22; ++var22) {
                                if (var22 <= var21 + -(var6 / 2)) {
                                  var0[var15] = var1;
                                } else if (var9) {
                                  var0[var15] = var4;
                                }

                                ++var15;
                              }

                              var15 += var16;
                            }

                            return;
                          }

                          if (var3 == 1) {
                            for (var21 = var20 + -1; var21 >= var19; --var21) {
                              for (var22 = var11; var12 > var22; ++var22) {
                                if (~(-(var6 / 2) + var21) > ~var22) {
                                  if (var9) {
                                    var0[var15] = var4;
                                  }
                                } else {
                                  var0[var15] = var1;
                                }

                                ++var15;
                              }

                              var15 += var16;
                            }

                            return;
                          }

                          if (~var3 == -3) {
                            for (var21 = var20 + -1; ~var19 >= ~var21; --var21) {
                              for (var22 = -1 + var18; ~var17 >= ~var22; --var22) {
                                if (var22 > var21 + -(var6 / 2)) {
                                  if (var9) {
                                    var0[var15] = var4;
                                  }
                                } else {
                                  var0[var15] = var1;
                                }

                                ++var15;
                              }

                              var15 += var16;
                            }

                            return;
                          }

                          if (3 == var3) {
                            for (var21 = var13; ~var21 > ~var14; ++var21) {
                              for (var22 = -1 + var18; ~var22 <= ~var17; --var22) {
                                if (var21 + -(var6 / 2) >= var22) {
                                  var0[var15] = var1;
                                } else if (var9) {
                                  var0[var15] = var4;
                                }

                                ++var15;
                              }

                              var15 += var16;
                            }

                            return;
                          }
                        }

                        if (~var5 == -9) {
                          if (0 == var3) {
                            for (var21 = var13; var14 > var21; ++var21) {
                              for (var22 = var11; ~var12 < ~var22; ++var22) {
                                if (-(var6 / 2) + var21 <= var22) {
                                  var0[var15] = var1;
                                } else if (var9) {
                                  var0[var15] = var4;
                                }

                                ++var15;
                              }

                              var15 += var16;
                            }

                            return;
                          }

                          if (var3 == 1) {
                            for (var21 = -1 + var20; var21 >= var19; --var21) {
                              for (var22 = var11; ~var12 < ~var22; ++var22) {
                                if (-(var6 / 2) + var21 > var22) {
                                  if (var9) {
                                    var0[var15] = var4;
                                  }
                                } else {
                                  var0[var15] = var1;
                                }

                                ++var15;
                              }

                              var15 += var16;
                            }

                            return;
                          }

                          if (var3 == 2) {
                            for (var21 = var20 - 1; ~var21 <= ~var19; --var21) {
                              for (var22 = -1 + var18; ~var17 >= ~var22; --var22) {
                                if (~var22 > ~(var21 - var6 / 2)) {
                                  if (var9) {
                                    var0[var15] = var4;
                                  }
                                } else {
                                  var0[var15] = var1;
                                }

                                ++var15;
                              }

                              var15 += var16;
                            }

                            return;
                          }

                          if (~var3 == -4) {
                            for (var21 = var13; ~var14 < ~var21; ++var21) {
                              for (var22 = -1 + var18; ~var22 <= ~var17; --var22) {
                                if (var21 + -(var6 / 2) > var22) {
                                  if (var9) {
                                    var0[var15] = var4;
                                  }
                                } else {
                                  var0[var15] = var1;
                                }

                                ++var15;
                              }

                              var15 += var16;
                            }

                            return;
                          }
                        }

                      } else if (0 == var3) {
                        for (var21 = var20 + -1; var21 >= var19; --var21) {
                          for (var22 = -1 + var18; ~var17 >= ~var22; --var22) {
                            if (var21 >> 1 <= var22) {
                              var0[var15] = var1;
                            } else if (var9) {
                              var0[var15] = var4;
                            }

                            ++var15;
                          }

                          var15 += var16;
                        }

                      } else if (1 == var3) {
                        for (var21 = -1 + var20; ~var19 >= ~var21; --var21) {
                          for (var22 = var11; var22 < var12; ++var22) {
                            if (var22 > var21 << 1) {
                              if (var9) {
                                var0[var15] = var4;
                              }
                            } else {
                              var0[var15] = var1;
                            }

                            ++var15;
                          }

                          var15 += var16;
                        }

                      } else if (~var3 != -3) {
                        if (~var3 == -4) {
                          for (var21 = var13; ~var14 < ~var21; ++var21) {
                            for (var22 = var18 + -1; var17 <= var22; --var22) {
                              if (var21 << 1 >= var22) {
                                var0[var15] = var1;
                              } else if (var9) {
                                var0[var15] = var4;
                              }

                              ++var15;
                            }

                            var15 += var16;
                          }

                        }
                      } else {
                        for (var21 = var13; var14 > var21; ++var21) {
                          for (var22 = var11; ~var12 < ~var22; ++var22) {
                            if (~var22 > ~(var21 >> 1)) {
                              if (var9) {
                                var0[var15] = var4;
                              }
                            } else {
                              var0[var15] = var1;
                            }

                            ++var15;
                          }

                          var15 += var16;
                        }

                      }
                    } else if (~var3 != -1) {
                      if (1 == var3) {
                        for (var21 = var13; var21 < var14; ++var21) {
                          for (var22 = var11; var22 < var12; ++var22) {
                            if (~(var21 << 1) <= ~var22) {
                              var0[var15] = var1;
                            } else if (var9) {
                              var0[var15] = var4;
                            }

                            ++var15;
                          }

                          var15 += var16;
                        }

                      } else if (2 == var3) {
                        for (var21 = var13; var21 < var14; ++var21) {
                          for (var22 = var18 + -1; ~var17 >= ~var22; --var22) {
                            if (~var22 <= ~(var21 >> 1)) {
                              var0[var15] = var1;
                            } else if (var9) {
                              var0[var15] = var4;
                            }

                            ++var15;
                          }

                          var15 += var16;
                        }

                      } else if (var3 == 3) {
                        for (var21 = -1 + var20; ~var19 >= ~var21; --var21) {
                          for (var22 = -1 + var18; ~var17 >= ~var22; --var22) {
                            if (var22 <= var21 << 1) {
                              var0[var15] = var1;
                            } else if (var9) {
                              var0[var15] = var4;
                            }

                            ++var15;
                          }

                          var15 += var16;
                        }

                      }
                    } else {
                      for (var21 = var20 + -1; ~var19 >= ~var21; --var21) {
                        for (var22 = var11; ~var22 > ~var12; ++var22) {
                          if (~(var21 >> 1) < ~var22) {
                            if (var9) {
                              var0[var15] = var4;
                            }
                          } else {
                            var0[var15] = var1;
                          }

                          ++var15;
                        }

                        var15 += var16;
                      }

                    }
                  } else if (-1 == ~var3) {
                    for (var21 = var20 - 1; ~var19 >= ~var21; --var21) {
                      for (var22 = -1 + var18; var17 <= var22; --var22) {
                        if (~(var21 >> 1) <= ~var22) {
                          var0[var15] = var1;
                        } else if (var9) {
                          var0[var15] = var4;
                        }

                        ++var15;
                      }

                      var15 += var16;
                    }

                  } else if (~var3 == -2) {
                    for (var21 = -1 + var20; ~var21 <= ~var19; --var21) {
                      for (var22 = var11; ~var22 > ~var12; ++var22) {
                        if (var22 >= var21 << 1) {
                          var0[var15] = var1;
                        } else if (var9) {
                          var0[var15] = var4;
                        }

                        ++var15;
                      }

                      var15 += var16;
                    }

                  } else if (2 == var3) {
                    for (var21 = var13; ~var14 < ~var21; ++var21) {
                      for (var22 = var11; ~var22 > ~var12; ++var22) {
                        if (~var22 >= ~(var21 >> 1)) {
                          var0[var15] = var1;
                        } else if (var9) {
                          var0[var15] = var4;
                        }

                        ++var15;
                      }

                      var15 += var16;
                    }

                  } else if (3 == var3) {
                    for (var21 = var13; ~var14 < ~var21; ++var21) {
                      for (var22 = var18 - 1; ~var22 <= ~var17; --var22) {
                        if (~(var21 << 1) < ~var22) {
                          if (var9) {
                            var0[var15] = var4;
                          }
                        } else {
                          var0[var15] = var1;
                        }

                        ++var15;
                      }

                      var15 += var16;
                    }

                  }
                } else if (var3 == 0) {
                  for (var21 = var13; ~var14 < ~var21; ++var21) {
                    for (var22 = var11; ~var12 < ~var22; ++var22) {
                      if (~var22 >= ~var21) {
                        var0[var15] = var1;
                      } else if (var9) {
                        var0[var15] = var4;
                      }

                      ++var15;
                    }

                    var15 += var16;
                  }

                } else if (1 != var3) {
                  if (2 != var3) {
                    if (-4 == ~var3) {
                      for (var21 = var20 + -1; var19 <= var21; --var21) {
                        for (var22 = var11; ~var22 > ~var12; ++var22) {
                          if (var22 < var21) {
                            if (var9) {
                              var0[var15] = var4;
                            }
                          } else {
                            var0[var15] = var1;
                          }

                          ++var15;
                        }

                        var15 += var16;
                      }

                    }
                  } else {
                    for (var21 = var13; var21 < var14; ++var21) {
                      for (var22 = var11; var12 > var22; ++var22) {
                        if (var22 >= var21) {
                          var0[var15] = var1;
                        } else if (var9) {
                          var0[var15] = var4;
                        }

                        ++var15;
                      }

                      var15 += var16;
                    }

                  }
                } else {
                  for (var21 = var20 + -1; var21 >= var19; --var21) {
                    for (var22 = var11; ~var12 < ~var22; ++var22) {
                      if (var21 >= var22) {
                        var0[var15] = var1;
                      } else if (var9) {
                        var0[var15] = var4;
                      }

                      ++var15;
                    }

                    var15 += var16;
                  }

                }
              }
            }
          }
        }
      }
    } catch (RuntimeException var23) {
      throw AbstractGameWorld.cascadeException(var23,
        "wl.C(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ',' + var3 + ','
          + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ',' + var10
          + ')');
    }
  }

  static final Widget method2273(Widget var0, int var1) {
    try {
      if (var1 < 57) {
        method2273(null, -22);
      }

      if (var0.anInt190 == -1) {
        int var3 = var0.anInt279 >>> 16;
        HashTableIterator var4 = new HashTableIterator(TextureSampler23.aClass130_3208);

        for (SomethingPacket151 var2 = (SomethingPacket151) var4.getFirst();
             null != var2; var2 = (SomethingPacket151) var4.getNext()) {
          if (~var3 == ~var2.anInt2602) {
            return EnumStringFetcher.getWidget((byte) 127, (int) var2.key);
          }
        }

        return null;
      } else {
        return EnumStringFetcher.getWidget((byte) 118, var0.anInt190);
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "wl.J(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

  static final void method2275(int var0, byte var1, int var2, int var3, int var4, int var5,
                               int var6) {
    try {
      if (var1 <= 68) {
        method2273(null, 38);
      }

      int var8 = -var5 + var3;
      Mouse.method2091(var3, 4);
      int var7 = 0;
      if (~var8 > -1) {
        var8 = 0;
      }

      int var9 = var3;
      int var10 = -var3;
      int var12 = -var8;
      int var11 = var8;
      int var13 = -1;
      int var17;
      int var16;
      int var19;
      int var18;
      if (var2 >= DummyClass13.anInt2020 && LightIntensity.anInt902 >= var2) {
        int[] var15 = DummyClass35.anIntArrayArray663[var2];
        var16 = DummyClass59.method1040(GlTexture2d.anInt3765, -var3 + var6, (byte) 0,
          DummyClass55.anInt1425);
        var17 = DummyClass59.method1040(GlTexture2d.anInt3765, var3 + var6, (byte) 0,
          DummyClass55.anInt1425);
        var18 = DummyClass59.method1040(GlTexture2d.anInt3765, var6 + -var8, (byte) 0,
          DummyClass55.anInt1425);
        var19 = DummyClass59.method1040(GlTexture2d.anInt3765, var6 - -var8, (byte) 0,
          DummyClass55.anInt1425);
        TextureSampler18.method282(var15, var16, 102, var18, var4);
        TextureSampler18.method282(var15, var18, -44, var19, var0);
        TextureSampler18.method282(var15, var19, -61, var17, var4);
      }

      int var14 = -1;

      while (~var7 > ~var9) {
        var13 += 2;
        var14 += 2;
        var12 += var14;
        var10 += var13;
        if (-1 >= ~var12 && ~var11 <= -2) {
          --var11;
          SceneNode.anIntArray1838[var11] = var7;
          var12 -= var11 << 1;
        }

        ++var7;
        int var21;
        int var20;
        int[] var22;
        int var24;
        if (0 <= var10) {
          --var9;
          var10 -= var9 << 1;
          var24 = var2 + -var9;
          var16 = var2 + var9;
          if (~DummyClass13.anInt2020 >= ~var16 && ~LightIntensity.anInt902 <= ~var24) {
            if (~var9 <= ~var8) {
              var17 = DummyClass59.method1040(GlTexture2d.anInt3765, var7 + var6, (byte) 0,
                DummyClass55.anInt1425);
              var18 = DummyClass59.method1040(GlTexture2d.anInt3765, -var7 + var6, (byte) 0,
                DummyClass55.anInt1425);
              if (~LightIntensity.anInt902 <= ~var16) {
                TextureSampler18.method282(DummyClass35.anIntArrayArray663[var16], var18, -53,
                  var17, var4);
              }

              if (var24 >= DummyClass13.anInt2020) {
                TextureSampler18.method282(DummyClass35.anIntArrayArray663[var24], var18, 96, var17,
                  var4);
              }
            } else {
              var17 = SceneNode.anIntArray1838[var9];
              var18 = DummyClass59.method1040(GlTexture2d.anInt3765, var7 + var6, (byte) 0,
                DummyClass55.anInt1425);
              var19 = DummyClass59.method1040(GlTexture2d.anInt3765, -var7 + var6, (byte) 0,
                DummyClass55.anInt1425);
              var20 = DummyClass59.method1040(GlTexture2d.anInt3765, var6 - -var17, (byte) 0,
                DummyClass55.anInt1425);
              var21 = DummyClass59.method1040(GlTexture2d.anInt3765, -var17 + var6, (byte) 0,
                DummyClass55.anInt1425);
              if (LightIntensity.anInt902 >= var16) {
                var22 = DummyClass35.anIntArrayArray663[var16];
                TextureSampler18.method282(var22, var19, 116, var21, var4);
                TextureSampler18.method282(var22, var21, 125, var20, var0);
                TextureSampler18.method282(var22, var20, 87, var18, var4);
              }

              if (~var24 <= ~DummyClass13.anInt2020) {
                var22 = DummyClass35.anIntArrayArray663[var24];
                TextureSampler18.method282(var22, var19, 110, var21, var4);
                TextureSampler18.method282(var22, var21, -114, var20, var0);
                TextureSampler18.method282(var22, var20, -88, var18, var4);
              }
            }
          }
        }

        var24 = -var7 + var2;
        var16 = var2 - -var7;
        if (~DummyClass13.anInt2020 >= ~var16 && ~LightIntensity.anInt902 <= ~var24) {
          var17 = var6 + var9;
          var18 = var6 + -var9;
          if (var17 >= DummyClass55.anInt1425 && ~GlTexture2d.anInt3765 <= ~var18) {
            var17 = DummyClass59.method1040(GlTexture2d.anInt3765, var17, (byte) 0,
              DummyClass55.anInt1425);
            var18 = DummyClass59.method1040(GlTexture2d.anInt3765, var18, (byte) 0,
              DummyClass55.anInt1425);
            if (var7 < var8) {
              var19 = var11 >= var7 ? var11 : SceneNode.anIntArray1838[var7];
              var20 = DummyClass59.method1040(GlTexture2d.anInt3765, var19 + var6, (byte) 0,
                DummyClass55.anInt1425);
              var21 = DummyClass59.method1040(GlTexture2d.anInt3765, var6 - var19, (byte) 0,
                DummyClass55.anInt1425);
              if (LightIntensity.anInt902 >= var16) {
                var22 = DummyClass35.anIntArrayArray663[var16];
                TextureSampler18.method282(var22, var18, 126, var21, var4);
                TextureSampler18.method282(var22, var21, 103, var20, var0);
                TextureSampler18.method282(var22, var20, -61, var17, var4);
              }

              if (var24 >= DummyClass13.anInt2020) {
                var22 = DummyClass35.anIntArrayArray663[var24];
                TextureSampler18.method282(var22, var18, 102, var21, var4);
                TextureSampler18.method282(var22, var21, -94, var20, var0);
                TextureSampler18.method282(var22, var20, 99, var17, var4);
              }
            } else {
              if (~LightIntensity.anInt902 <= ~var16) {
                TextureSampler18.method282(DummyClass35.anIntArrayArray663[var16], var18, 94, var17,
                  var4);
              }

              if (var24 >= DummyClass13.anInt2020) {
                TextureSampler18.method282(DummyClass35.anIntArrayArray663[var24], var18, 126,
                  var17, var4);
              }
            }
          }
        }
      }

    } catch (RuntimeException var23) {
      throw AbstractGameWorld.cascadeException(var23,
        "wl.I(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6
          + ')');
    }
  }

  public static void method2276(int var0) {
    try {
      aClass3_Sub28_Sub17_2096 = null;
      if (var0 == -2) {
        aClass94_2089 = null;
        fileUnpacker16 = null;
        aClass11_2091 = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "wl.G(" + var0 + ')');
    }
  }

  static final void method2277(int var0, int var1, int var2, int var3, byte var4) {
    try {
      Inventory var5 = (Inventory) SceneGraphTile.aClass130_2220.get((long) var3);
      if (var5 == null) {
        var5 = new Inventory();
        SceneGraphTile.aClass130_2220.put((long) var3, var5);
      }

      if (var4 > 16) {
        if (var1 >= var5.ids.length) {
          int[] var6 = new int[var1 - -1];
          int[] var7 = new int[1 + var1];

          int var8;
          for (var8 = 0; ~var5.ids.length < ~var8; ++var8) {
            var6[var8] = var5.ids[var8];
            var7[var8] = var5.counts[var8];
          }

          for (var8 = var5.ids.length; ~var8 > ~var1; ++var8) {
            var6[var8] = -1;
            var7[var8] = 0;
          }

          var5.ids = var6;
          var5.counts = var7;
        }

        var5.ids[var1] = var0;
        var5.counts[var1] = var2;
      }
    } catch (RuntimeException var9) {
      throw AbstractGameWorld.cascadeException(var9,
        "wl.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
    }
  }

  static final void method2278(int var0) {
    try {
      boolean var1 = false;

      while (!var1) {
        var1 = true;

        for (int var2 = 0; ~var2 > ~(-1 + TextureSampler25.amountContextActions); ++var2) {
          if (TextureSampler27.aShortArray3095[var2] < 1000
            && -1001 > ~TextureSampler27.aShortArray3095[1 + var2]) {
            GameString var3 = DummyClass8.aClass94Array4016[var2];
            var1 = false;
            DummyClass8.aClass94Array4016[var2] = DummyClass8.aClass94Array4016[1 + var2];
            DummyClass8.aClass94Array4016[1 + var2] = var3;
            GameString var4 = GroundItem.aClass94Array2935[var2];
            GroundItem.aClass94Array2935[var2] = GroundItem.aClass94Array2935[var2 + 1];
            GroundItem.aClass94Array2935[var2 - -1] = var4;
            int var5 = DummyClass26.anIntArray1613[var2];
            DummyClass26.anIntArray1613[var2] = DummyClass26.anIntArray1613[1 + var2];
            DummyClass26.anIntArray1613[var2 + 1] = var5;
            var5 = DummyClass32.anIntArray512[var2];
            DummyClass32.anIntArray512[var2] = DummyClass32.anIntArray512[var2 + 1];
            DummyClass32.anIntArray512[1 + var2] = var5;
            var5 = MonoChromaticImageCache.anIntArray1578[var2];
            MonoChromaticImageCache.anIntArray1578[var2] =
              MonoChromaticImageCache.anIntArray1578[1 + var2];
            MonoChromaticImageCache.anIntArray1578[var2 - -1] = var5;
            short var6 = TextureSampler27.aShortArray3095[var2];
            TextureSampler27.aShortArray3095[var2] = TextureSampler27.aShortArray3095[1 + var2];
            TextureSampler27.aShortArray3095[var2 + 1] = var6;
            long var7 = TextureSampler0.aLongArray3271[var2];
            TextureSampler0.aLongArray3271[var2] = TextureSampler0.aLongArray3271[var2 + 1];
            TextureSampler0.aLongArray3271[var2 - -1] = var7;
          }
        }
      }

      if (var0 <= 103) {
        aClass94_2089 = null;
      }

    } catch (RuntimeException var9) {
      throw AbstractGameWorld.cascadeException(var9, "wl.D(" + var0 + ')');
    }
  }

  static final void method2280(int var0, int var1) {
    try {
      if (var0 != 2714) {
        method2277(-80, -123, -59, 60, (byte) 40);
      }

      WidgetUpdate var2 = AudioStreamEncoder3.method466(4, 11, var1);
      var2.createIndexedColorSprite(true);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "wl.B(" + var0 + ',' + var1 + ')');
    }
  }

}
