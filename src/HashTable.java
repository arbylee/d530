import java.awt.Component;

final class HashTable {

  static GameString aClass94_1698 = SpawnedGameObject.createString("(R");
  static GameString aClass94_1699 = SpawnedGameObject.createString(" )2> <col=ff9040>");
  static int anInt1701;
  static GameString aClass94_1702 = SpawnedGameObject.createString("Hierhin drehen");
  static boolean[] aBooleanArray1703;
  static int packetLength = 0;
  static int anInt1705 = 0;
  static int anInt1709 = 0;
  static int anInt1711 = -2;
  static boolean[] aBooleanArray1712 = new boolean[100];
  static GameString aClass94_1714 = SpawnedGameObject.createString("<col=ff7000>");
  private static GameString aClass94_1710 = SpawnedGameObject.createString("Loaded sprites");
  static GameString aClass94_1707 = aClass94_1710;
  Node[] nodes;
  int capacity;
  private Node iterator;
  private long lastFetchedKey;
  private Node aClass3_1713;
  private int iteratorBucketId = 0;


  HashTable(int var1) {
    try {
      this.nodes = new Node[var1];
      this.capacity = var1;

      for (int var2 = 0; var2 < var1; ++var2) {
        Node var3 = this.nodes[var2] = new Node();
        var3.prevNode = var3;
        var3.nextNode = var3;
      }

    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "sc.<init>(" + var1 + ')');
    }
  }

  static final void method1772(int var0, int var1, int var2, NPC var3) {
    try {
      if (var3.animationId == var1 && -1 != var1) {
        AnimationSequence var4 = GameClient.method45(var1, (byte) -20);
        int var5 = var4.anInt1845;
        if (var5 == 1) {
          var3.anInt2776 = 1;
          var3.anInt2832 = 0;
          var3.anInt2760 = 0;
          var3.anInt2773 = 0;
          var3.anInt2828 = var0;
          SocketStream
            .method1470(var3.anInt2829, var4, 183921384, var3.anInt2819, false, var3.anInt2832);
        }

        if (-3 == ~var5) {
          var3.anInt2773 = 0;
        }
      } else if (~var1 == 0 || -1 == var3.animationId
        || GameClient.method45(var1, (byte) -20).anInt1857 >= GameClient
        .method45(var3.animationId, (byte) -20).anInt1857) {
        var3.anInt2760 = 0;
        var3.animationId = var1;
        var3.anInt2776 = 1;
        var3.anInt2773 = 0;
        var3.anInt2828 = var0;
        var3.anInt2811 = var3.anInt2816;
        var3.anInt2832 = 0;
        if (var3.animationId != -1) {
          SocketStream.method1470(var3.anInt2829, GameClient.method45(var3.animationId, (byte) -20),
            var2 + 183921345, var3.anInt2819, false, var3.anInt2832);
        }
      }

      if (var2 != 39) {
        anInt1711 = 41;
      }

    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "sc.J(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
    }
  }

  public static void method1774(int var0) {
    try {
      aClass94_1698 = null;
      aClass94_1707 = null;
      aBooleanArray1712 = null;
      aClass94_1702 = null;
      aBooleanArray1703 = null;
      aClass94_1699 = null;
      aClass94_1714 = null;
      if (var0 <= 96) {
        unbindMouse(-63, null);
      }

      aClass94_1710 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "sc.H(" + var0 + ')');
    }
  }

  static final void method1775() {
    for (int var0 = 0; var0 < TextureSampler21.anInt3070; ++var0) {
      SceneSomething var1 = AnimationSequence.aClass25Array1868[var0];
      AbstractImageProducer.method2186(var1);
      AnimationSequence.aClass25Array1868[var0] = null;
    }

    TextureSampler21.anInt3070 = 0;
  }

  static final AbstractTextureSampler createTextureSampler(int type, boolean var1) {
    try {
      if (-1 == ~type) {
        return new TextureSampler0();
      } else if (-2 != ~type) {
        if (2 != type) {
          if (~type == -4) {
            return new TextureSampler3();
          } else if (type != 4) {
            if (type == 5) {
              return new TextureSampler5();
            } else if (type == 6) {
              return new TextureSampler6();
            } else if (type != 7) {
              if (type != 8) {
                if (9 != type) {
                  if (10 == type) {
                    return new TextureSampler10();
                  } else if (type != 11) {
                    if (-13 == ~type) {
                      return new TextureSampler12();
                    } else if (-14 != ~type) {
                      if (14 == type) {
                        return new TextureSampler14();
                      } else if (~type != -16) {
                        if (type == 16) {
                          return new TextureSampler16();
                        } else if (17 != type) {
                          if (~type == -19) {
                            return new TextureSampler18();
                          } else if (-20 == ~type) {
                            return new TextureSampler19();
                          } else if (~type == -21) {
                            return new TextureSampler20();
                          } else if (21 == type) {
                            return new TextureSampler21();
                          } else if (22 != type) {
                            if (~type != -24) {
                              if (24 != type) {
                                if (type != 25) {
                                  if (~type != -27) {
                                    if (27 != type) {
                                      if (-29 == ~type) {
                                        return new TextureSampler28();
                                      } else if (-30 != ~type) {
                                        if (type != 30) {
                                          if (31 != type) {
                                            if (32 != type) {
                                              if (33 == type) {
                                                return new TextureSampler33();
                                              } else if (-35 == ~type) {
                                                return new TextureSampler34();
                                              } else if (type == 35) {
                                                return new TextureSampler35();
                                              } else if (~type != -37) {
                                                if (type == 37) {
                                                  return new TextureSampler37();
                                                } else if (38 != type) {
                                                  if (39 == type) {
                                                    return new TextureSampler39();
                                                  } else {
                                                    if (!var1) {
                                                      method1772(8, 6, 81, null);
                                                    }

                                                    return null;
                                                  }
                                                } else {
                                                  return new TextureSampler38();
                                                }
                                              } else {
                                                return new TextureSampler36();
                                              }
                                            } else {
                                              return new TextureSampler32();
                                            }
                                          } else {
                                            return new TextureSampler31();
                                          }
                                        } else {
                                          return new TextureSampler30();
                                        }
                                      } else {
                                        return new TextureSampler29();
                                      }
                                    } else {
                                      return new TextureSampler27();
                                    }
                                  } else {
                                    return new TextureSampler26();
                                  }
                                } else {
                                  return new TextureSampler25();
                                }
                              } else {
                                return new TextureSampler24();
                              }
                            } else {
                              return new TextureSampler23();
                            }
                          } else {
                            return new TextureSampler22();
                          }
                        } else {
                          return new TextureSampler17();
                        }
                      } else {
                        return new TextureSampler15();
                      }
                    } else {
                      return new TextureSampler13();
                    }
                  } else {
                    return new TextureSampler11();
                  }
                } else {
                  return new TextureSampler9();
                }
              } else {
                return new TextureSampler8();
              }
            } else {
              return new TextureSampler7();
            }
          } else {
            return new TextureSampler4();
          }
        } else {
          return new TextureSampler2();
        }
      } else {
        return new TextureSampler1();
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "sc.I(" + type + ',' + var1 + ')');
    }
  }

  static final void unbindMouse(int var0, Component var1) {
    try {
      if (var0 != 4) {
        createTextureSampler(-104, false);
      }

      var1.removeMouseListener(ObjectNode.mouse);
      var1.removeMouseMotionListener(ObjectNode.mouse);
      var1.removeFocusListener(ObjectNode.mouse);
      SpotAnimationConfig.anInt549 = 0;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld
        .cascadeException(var3, "sc.M(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  final void clear(int var1) {
    try {
      int var2 = 0;

      while (var2 < this.capacity) {
        Node var3 = this.nodes[var2];

        while (true) {
          Node var4 = var3.nextNode;
          if (var3 == var4) {
            ++var2;
            break;
          }

          var4.unlinkNode();
        }
      }

      this.aClass3_1713 = null;
      var2 = 1 % ((73 - var1) / 34);
      this.iterator = null;
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5, "sc.G(" + var1 + ')');
    }
  }

  final Node getFirst(int var1) {
    try {
      this.iteratorBucketId = 0;
      return this.getNext(-66);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "sc.B(" + var1 + ')');
    }
  }

  final Node getNext(int var1) {
    try {
      Node var2;
      if (-1 > ~this.iteratorBucketId && this.aClass3_1713 != this.nodes[this.iteratorBucketId
        - 1]) {
        var2 = this.aClass3_1713;
        this.aClass3_1713 = var2.nextNode;
        return var2;
      } else {
        do {
          if (~this.iteratorBucketId <= ~this.capacity) {
            if (var1 > -61) {
              this.clear(119);
            }

            return null;
          }

          var2 = this.nodes[this.iteratorBucketId++].nextNode;
        } while (this.nodes[this.iteratorBucketId + -1] == var2);

        this.aClass3_1713 = var2.nextNode;
        return var2;
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "sc.K(" + var1 + ')');
    }
  }

  final void put(long var3, Node var2) {
    try {
      if (null != var2.prevNode) {
        var2.unlinkNode();
      }

      Node var5 = this.nodes[(int) (var3 & (long) (this.capacity - 1))];
      var2.nextNode = var5;
      var2.key = var3;
      var2.prevNode = var5.prevNode;
      var2.prevNode.nextNode = var2;
      var2.nextNode.prevNode = var2;
    } catch (RuntimeException var6) {
      throw AbstractGameWorld
        .cascadeException(var6, "sc.E(" + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
    }
  }

  final Node get(long var1) {
    try {

      this.lastFetchedKey = var1;
      Node var4 = this.nodes[(int) (var1 & (long) (-1 + this.capacity))];
      for (
        this.iterator = var4.nextNode;
        var4 != this.iterator; this.iterator = this.iterator.nextNode) {
        if (~var1 == ~this.iterator.key) {
          Node var5 = this.iterator;
          this.iterator = this.iterator.nextNode;
          return var5;
        }
      }

      this.iterator = null;
      return null;
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6, "sc.C(" + var1 + ')');
    }
  }

  final int getSize() {
    try {
      int var3 = 0;

      for (int var4 = 0; var4 < this.capacity; ++var4) {
        Node var5 = this.nodes[var4];

        for (Node var6 = var5.nextNode; var6 != var5; ++var3) {
          var6 = var6.nextNode;
        }
      }

      return var3;
    } catch (RuntimeException var7) {
      throw AbstractGameWorld.cascadeException(var7, "sc.N()");
    }
  }

  final int getNodes(Node[] var1) {
    try {

      int var3 = 0;

      for (int var4 = 0; var4 < this.capacity; ++var4) {
        Node var5 = this.nodes[var4];

        for (Node var6 = var5.nextNode; var6 != var5; var6 = var6.nextNode) {
          var1[var3++] = var6;
        }
      }

      return var3;
    } catch (RuntimeException var7) {
      throw AbstractGameWorld
        .cascadeException(var7, "sc.D(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  final Node getLastFetchedNode() {
    try {
      if (null != this.iterator) {
        Node var2 = this.nodes[(int) (this.lastFetchedKey & (long) (-1 + this.capacity))];
        while (var2 != this.iterator) {
          if (this.iterator.key == this.lastFetchedKey) {
            Node var3 = this.iterator;
            this.iterator = this.iterator.nextNode;
            return var3;
          }

          this.iterator = this.iterator.nextNode;
        }

        this.iterator = null;
        return null;
      } else {
        return null;
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "sc.A()");
    }
  }

  final int getCapacity() {
    try {
      return this.capacity;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "sc.F()");
    }
  }

}
