final class SpotAnimationConfig {

  static int anInt529;
  static int anInt531 = 0;
  static GameBuffer gameBuffer = new GameBuffer(5000);
  static int anInt544;
  static int anInt546;
  static int anInt548 = 0;
  static volatile int anInt549 = 0;
  static GameString aClass94_550 = SpawnedGameObject.createString("Jeter");
  static GameString aClass94_552 = SpawnedGameObject.createString("Sprites geladen)3");
  private static GameString aClass94_553 = SpawnedGameObject.createString("slide:");
  static GameString aClass94_547 = aClass94_553;
  static GameString aClass94_551 = aClass94_553;
  boolean aBoolean536 = false;
  int anInt539;
  int anInt542 = -1;
  private int scaleXZ = 128;
  private short[] faceIds;
  private short[] aShortArray534;
  private short[] aShortArray535;
  private int anInt537 = 0;
  private int anInt538 = 0;
  private int scaleY = 128;
  private int anInt541;
  private int rotationY = 0;
  private short[] colorIds;

  public static void method964(int var0) {
    try {
      aClass94_553 = null;
      gameBuffer = null;
      if (var0 != 6) {
        method964(-57);
      }

      aClass94_550 = null;
      aClass94_547 = null;
      aClass94_551 = null;
      aClass94_552 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "eg.E(" + var0 + ')');
    }
  }

  static final void method967(int var0, int var1, int var2, int var3, int var4, int var5, int var6,
                              int var7) {
    try {
      if (ComponentCanvas.method57(var5, 104)) {
        if (var2 == 2) {
          GameClient
            .method50(SceneNode.aClass11ArrayArray1834[var5], -1, var6, var1, var4, var7, var0,
              var3);
        }
      }
    } catch (RuntimeException var9) {
      throw AbstractGameWorld.cascadeException(var9,
        "eg.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6
          + ',' + var7 + ')');
    }
  }

  final void method963(Buffer var1, byte var2) {
    try {
      if (var2 != -113) {
        method967(88, -118, 75, -51, -96, -50, 45, 127);
      }

      while (true) {
        int var3 = var1.readUnsignedByte();
        if (var3 == 0) {
          return;
        }

        this.method965(var1, var3, 128);
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld
        .cascadeException(var4, "eg.A(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
    }
  }

  private final void method965(Buffer var1, int var2, int var3) {
    try {
      if (var2 == 1) {
        this.anInt541 = var1.readUnsignedShort();
      } else if (2 == var2) {
        this.anInt542 = var1.readUnsignedShort();
      } else if (var2 != 4) {
        if (~var2 != -6) {
          if (6 == var2) {
            this.rotationY = var1.readUnsignedShort();
          } else if (var2 == 7) {
            this.anInt538 = var1.readUnsignedByte();
          } else if (~var2 != -9) {
            if (~var2 != -10) {
              int var4;
              int var5;
              if (40 != var2) {
                if (41 == var2) {
                  var4 = var1.readUnsignedByte();
                  this.aShortArray534 = new short[var4];
                  this.aShortArray535 = new short[var4];

                  for (var5 = 0; ~var4 < ~var5; ++var5) {
                    this.aShortArray534[var5] = (short) var1.readUnsignedShort();
                    this.aShortArray535[var5] = (short) var1.readUnsignedShort();
                  }
                }
              } else {
                var4 = var1.readUnsignedByte();
                this.faceIds = new short[var4];
                this.colorIds = new short[var4];

                for (var5 = 0; ~var5 > ~var4; ++var5) {
                  this.faceIds[var5] = (short) var1.readUnsignedShort();
                  this.colorIds[var5] = (short) var1.readUnsignedShort();
                }
              }
            } else {
              this.aBoolean536 = true;
            }
          } else {
            this.anInt537 = var1.readUnsignedByte();
          }
        } else {
          this.scaleY = var1.readUnsignedShort();
        }
      } else {
        this.scaleXZ = var1.readUnsignedShort();
      }

      if (var3 != 128) {
        this.colorIds = null;
      }

    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "eg.D(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
    }
  }

  final AbstractModel method966(int var1, byte var2, int var3, int var4) {
    try {
      AbstractModel var5 = (AbstractModel) DummyClass32.aClass93_511.get((long) this.anInt539);
      if (var2 != -30) {
        return null;
      } else {
        if (var5 == null) {
          Model var6 = Model.getModel(ObjectNode.models, this.anInt541, 0);
          if (null == var6) {
            return null;
          }

          int var7;
          if (null != this.faceIds) {
            for (var7 = 0; this.faceIds.length > var7; ++var7) {
              var6.replaceColor(this.faceIds[var7], this.colorIds[var7]);
            }
          }

          if (this.aShortArray534 != null) {
            for (var7 = 0; var7 < this.aShortArray534.length; ++var7) {
              var6.replaceMaterial(this.aShortArray534[var7], this.aShortArray535[var7]);
            }
          }

          var5 = var6.method2008(64 - -this.anInt538, this.anInt537 + 850, -30, -50, -30);
          DummyClass32.aClass93_511.get((byte) -96, var5, (long) this.anInt539);
        }

        AbstractModel var9;
        if (0 != ~this.anInt542 && var3 != -1) {
          var9 = GameClient.method45(this.anInt542, (byte) -20)
            .method2059(var1, var4, var3, (byte) -52, var5);
        } else {
          var9 = var5.method1882(true, true, true);
        }

        if (128 != this.scaleXZ || 128 != this.scaleY) {
          var9.scale(this.scaleXZ, this.scaleY, this.scaleXZ);
        }

        if (this.rotationY != 0) {
          if (-91 == ~this.rotationY) {
            var9.rotateQuarterY();
          }

          if (180 == this.rotationY) {
            var9.method1874();
          }

          if (270 == this.rotationY) {
            var9.method1900();
          }
        }

        return var9;
      }
    } catch (RuntimeException var8) {
      throw AbstractGameWorld
        .cascadeException(var8, "eg.C(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
    }
  }

}
