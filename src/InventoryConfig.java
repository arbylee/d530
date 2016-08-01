import java.awt.Canvas;

final class InventoryConfig extends SubNode {

  static GameString aClass94_3646 = SpawnedGameObject.createString("D-Bmarrage de la librairie 3D");
  static Canvas canvas;
  static GameString aClass94_3649 = SpawnedGameObject.createString("Fichiers config charg-Bs");
  static GameString aClass94_3650 = SpawnedGameObject.createString("Fermer");
  static GameString aClass94_3651 = SpawnedGameObject.createString("::mm");
  static int fogColor;
  static GameString aClass94_3653 = SpawnedGameObject.createString("Shift)2click disabled)3");
  static short[][] aShortArrayArray3654 = new short[][] {
    {
      (short) 6798, (short) 107, (short) 10283, (short) 16, (short) 4797, (short) 7744,
      (short) 5799, (short) 4634, (short) -31839, (short) 22433, (short) 2983, (short) -11343,
      (short) 8, (short) 5281, (short) 10438, (short) 3650, (short) -27322, (short) -21845,
      (short) 200, (short) 571, (short) 908, (short) 21830, (short) 28946, (short) -15701,
      (short) -14010
    }, {
    (short) 8741, (short) 12, (short) -1506, (short) -22374, (short) 7735, (short) 8404,
    (short) 1701, (short) -27106, (short) 24094, (short) 10153, (short) -8915, (short) 4783,
    (short) 1341, (short) 16578, (short) -30533, (short) 25239, (short) 8, (short) 5281,
    (short) 10438, (short) 3650, (short) -27322, (short) -21845, (short) 200, (short) 571,
    (short) 908, (short) 21830, (short) 28946, (short) -15701, (short) -14010
  }, {
    (short) 25238, (short) 8742, (short) 12, (short) -1506, (short) -22374, (short) 7735,
    (short) 8404, (short) 1701, (short) -27106, (short) 24094, (short) 10153, (short) -8915,
    (short) 4783, (short) 1341, (short) 16578, (short) -30533, (short) 8, (short) 5281,
    (short) 10438, (short) 3650, (short) -27322, (short) -21845, (short) 200, (short) 571,
    (short) 908, (short) 21830, (short) 28946, (short) -15701, (short) -14010
  }, {(short) 4626, (short) 11146, (short) 6439, (short) 12, (short) 4758, (short) 10270}, {
    (short) 4550, (short) 4537, (short) 5681, (short) 5673, (short) 5790, (short) 6806,
    (short) 8076, (short) 4574
  }
  };
  static int anInt3655 = -1;
  static GameString aClass94_3656 = SpawnedGameObject.createString("Impossible de trouver ");
  int size = 0;

  static final boolean method609(Widget var0, int var1) {
    try {
      if (null != var0.anIntArray275) {
        int var2 = 0;
        if (var1 <= 20) {
          aClass94_3651 = null;
        }

        for (; ~var2 > ~var0.anIntArray275.length; ++var2) {
          int var3 = Something3d2.method2247((byte) 119, var2, var0);
          int var4 = var0.anIntArray307[var2];
          if (~var0.anIntArray275[var2] != -3) {
            if (~var0.anIntArray275[var2] != -4) {
              if (4 == var0.anIntArray275[var2]) {
                if (~var3 == ~var4) {
                  return false;
                }
              } else if (~var4 != ~var3) {
                return false;
              }
            } else if (var3 <= var4) {
              return false;
            }
          } else if (~var4 >= ~var3) {
            return false;
          }
        }

        return true;
      } else {
        return false;
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld
        .cascadeException(var5, "md.C(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

  static final void method611(int var0, int var1, GameString var2, GameString var3, byte var4,
                              GameString var5) {
    try {
      if (var4 != 50) {
        aShortArrayArray3654 = null;
      }

      for (int var6 = 99; var6 > 0; --var6) {
        TextureSampler26.anIntArray3082[var6] = TextureSampler26.anIntArray3082[var6 - 1];
        TextureSampler4.aClass94Array3226[var6] = TextureSampler4.aClass94Array3226[var6 - 1];
        StringNode.aClass94Array2580[var6] = StringNode.aClass94Array2580[-1 + var6];
        DummyClass4.aClass94Array3003[var6] = DummyClass4.aClass94Array3003[var6 + -1];
        SceneNode.anIntArray1835[var6] = SceneNode.anIntArray1835[var6 - 1];
      }

      ++TextureSampler16.anInt3114;
      TextureSampler26.anIntArray3082[0] = var1;
      TextureSampler4.aClass94Array3226[0] = var5;
      IdentityKit.anInt472 = TextureSampler23.anInt3213;
      SceneNode.anIntArray1835[0] = var0;
      StringNode.aClass94Array2580[0] = var2;
      DummyClass4.aClass94Array3003[0] = var3;
    } catch (RuntimeException var7) {
      throw AbstractGameWorld.cascadeException(var7,
        "md.D(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + (
          var3 != null ? "{...}" : "null") + ',' + var4 + ',' + (var5 != null ? "{...}" : "null")
          + ')');
    }
  }

  static final GameString method612(long var0, byte var2) {
    try {
      return var2 <= 85 ? null : TextureSampler9.method207(10, false, 116, var0);
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "md.F(" + var0 + ',' + var2 + ')');
    }
  }

  public static void method613(int var0) {
    try {
      aClass94_3646 = null;
      aClass94_3656 = null;
      canvas = null;
      aClass94_3649 = null;
      aClass94_3653 = null;
      aShortArrayArray3654 = null;
      if (var0 > 22) {
        aClass94_3651 = null;
        aClass94_3650 = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "md.B(" + var0 + ')');
    }
  }

  final void method610(Buffer var1, int var2) {
    try {
      if (var2 != 0) {
        aClass94_3649 = null;
      }

      while (true) {
        int var3 = var1.readUnsignedByte();
        if (0 == var3) {
          return;
        }

        this.method614(var1, var3, false);
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld
        .cascadeException(var4, "md.E(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
    }
  }

  private final void method614(Buffer var1, int var2, boolean var3) {
    try {
      if (var3) {
        this.method610(null, -89);
      }

      if (~var2 == -3) {
        this.size = var1.readUnsignedShort();
      }

    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "md.A(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
    }
  }

}
