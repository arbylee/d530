final class ClientScriptEnum extends SubNode {

  static int cameraY;
  static int anInt3659;
  static int anInt3660 = 0;
  static GameString aClass94_3661 = SpawnedGameObject.createString("T");
  static boolean aBoolean3665 = true;
  int paramType;
  int someType;
  HashTable table;
  private GameString defaultValue;
  private HashTable aClass130_3666;
  private int defaultIntegerValue;


  public ClientScriptEnum() {
    this.defaultValue = Cache.aClass94_750;
  }

  static final SoftwareIndexedColorSprite[] createSprites(byte var0, int var1, FileUnpacker var2) {
    try {
      return GroundItem.loadSprites(var2, var1) ?
        (var0 <= 52 ? null : LinearHashTable.createSprites(0)) :
        null;
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "ml.A(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
    }
  }

  static final byte[] method623(byte var0, byte[] var1) {
    try {
      if (var0 > -112) {
        createSprites((byte) 43, -121, null);
      }

      Buffer var2 = new Buffer(var1);
      int var3 = var2.readUnsignedByte();
      int var4 = var2.readInt();
      if (0 <= var4 && (-1 == ~AbstractSomethingTexture.anInt1108
        || ~AbstractSomethingTexture.anInt1108 <= ~var4)) {
        if (-1 == ~var3) {
          byte[] var8 = new byte[var4];
          var2.method764(0, var4, var8, (byte) 93);
          return var8;
        } else {
          int var5 = var2.readInt();
          if (0 <= var5 && (AbstractSomethingTexture.anInt1108 == 0
            || ~AbstractSomethingTexture.anInt1108 <= ~var5)) {
            byte[] var6 = new byte[var5];
            if (1 != var3) {
              AudioSomethingSomething.aClass49_2505.decompress(var6, var2, false);
            } else {
              BZipDecompressor.method1640(var6, var5, var1, var4, 9);
            }

            return var6;
          } else {
            throw new RuntimeException();
          }
        }
      } else {
        throw new RuntimeException();
      }
    } catch (RuntimeException var7) {
      throw AbstractGameWorld
        .cascadeException(var7, "ml.R(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  public static void method624(int var0) {
    try {
      aClass94_3661 = null;
      if (var0 != -1) {
        method623((byte) -86, null);
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ml.P(" + var0 + ')');
    }
  }

  private final void parseOpcode(int opcode, Buffer var2, byte var3) {
    try {
      if (var3 > -29) {
        cameraY = 70;
      }

      if (~opcode != -2) {
        if (~opcode == -3) {
          this.paramType = var2.readUnsignedByte();
        } else if (3 != opcode) {
          if (opcode != 4) {
            if (5 == opcode || -7 == ~opcode) {
              int size = var2.readUnsignedShort();
              this.table = new HashTable(DummyClass53.nearestPo2((byte) 94, size));

              for (int var5 = 0; var5 < size; ++var5) {
                int key = var2.readInt();
                Object var7;
                if (~opcode == -6) {
                  var7 = new StringNode(var2.readString());
                } else {
                  var7 = new IntegerNode(var2.readInt());
                }

                this.table.put((long) key, (Node) var7);
              }
            }
          } else {
            this.defaultIntegerValue = var2.readInt();
          }
        } else {
          this.defaultValue = var2.readString();
        }
      } else {
        this.someType = var2.readUnsignedByte();
      }

    } catch (RuntimeException var8) {
      throw AbstractGameWorld.cascadeException(var8,
        "ml.C(" + opcode + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
    }
  }

  final GameString getString(int var1, byte var2) {
    try {
      int var3 = 10 / ((var2 - 68) / 50);
      if (null == this.table) {
        return this.defaultValue;
      } else {
        StringNode var4 = (StringNode) this.table.get((long) var1);
        return null == var4 ? this.defaultValue : var4.aClass94_2586;
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5, "ml.S(" + var1 + ',' + var2 + ')');
    }
  }

  final boolean hasValue(GameString name, int var2) {
    try {
      if (null == this.table) {
        return false;
      } else {
        if (var2 != 8729) {
          this.parseOpcode(-97, null, (byte) -91);
        }

        if (null == this.aClass130_3666) {
          this.method618(0);
        }

        for (StringNode0 var3 = (StringNode0) this.aClass130_3666.get(name.hash());
             var3 != null; var3 = (StringNode0) this.aClass130_3666.getLastFetchedNode()) {
          if (var3.aClass94_2341.method1528((byte) -42, name)) {
            return true;
          }
        }

        return false;
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld
        .cascadeException(var4, "ml.F(" + (name != null ? "{...}" : "null") + ',' + var2 + ')');
    }
  }

  private final void method618(int var1) {
    try {
      this.aClass130_3666 = new HashTable(this.table.getCapacity());
      StringNode var2 = (StringNode) this.table.getFirst(var1 + 88);
      if (var1 == 0) {
        while (var2 != null) {
          StringNode0 var3 = new StringNode0(var2.aClass94_2586, (int) var2.key);
          this.aClass130_3666.put(var2.aClass94_2586.hash(), var3);
          var2 = (StringNode) this.table.getNext(-99);
        }

      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "ml.O(" + var1 + ')');
    }
  }

  final int getInteger(int var1, int var2) {
    try {
      if (this.table != null) {
        IntegerNode var3 = (IntegerNode) this.table.get((long) var2);
        return var3 != null ? var3.anInt2467 : this.defaultIntegerValue;
      } else {
        return this.defaultIntegerValue;
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "ml.E(" + var1 + ',' + var2 + ')');
    }
  }

  final boolean method621(int var1, int var2) {
    try {
      if (null != this.table) {
        if (this.aClass130_3666 == null) {
          this.method622(109);
        }

        IntegerNode var3 = (IntegerNode) this.aClass130_3666.get((long) var2);
        return var3 != null;
      } else {
        return false;
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "ml.B(" + var1 + ',' + var2 + ')');
    }
  }

  private final void method622(int var1) {
    try {
      this.aClass130_3666 = new HashTable(this.table.getCapacity());
      int var3 = -48 % ((26 - var1) / 58);

      for (IntegerNode var2 = (IntegerNode) this.table.getFirst(123);
           null != var2; var2 = (IntegerNode) this.table.getNext(-88)) {
        IntegerNode var4 = new IntegerNode((int) var2.key);
        this.aClass130_3666.put((long) var2.anInt2467, var4);
      }

    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5, "ml.D(" + var1 + ')');
    }
  }

  final void parseConfig(Buffer buffer) {
    try {
      while (true) {
        int opcode = buffer.readUnsignedByte();
        if (-1 == ~opcode) {
          return;
        }

        this.parseOpcode(opcode, buffer, (byte) -84);
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld
        .cascadeException(var4, "ml.Q(" + (buffer != null ? "{...}" : "null") + ')');
    }
  }

}
