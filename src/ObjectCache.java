final class ObjectCache {

  static int anInt1325;
  static GameString aClass94_1326 = SpawnedGameObject.createString(")2");
  static byte[][][] tileOrientation;
  static int anInt1330;
  private int anInt1327;
  private Queue aClass13_1329 = new Queue();
  private int anInt1331;
  private HashTable table;


  ObjectCache(int var1) {
    try {
      this.anInt1331 = var1;

      int var2;
      for (var2 = 1; var2 + var2 < var1; var2 += var2) {
      }

      this.anInt1327 = var1;
      this.table = new HashTable(var2);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "n.<init>(" + var1 + ')');
    }
  }

  static final void method1516(int var0, int var1) {
    try {
      WidgetUpdate var2 = AudioStreamEncoder3.method466(4, 3, var0);
      var2.createIndexedColorSprite(true);
      if (var1 < 87) {
        aClass94_1326 = null;
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "n.L(" + var0 + ',' + var1 + ')');
    }
  }

  static final void method1517(byte var0) {
    try {
      DummyClass17.aFontMetrics1822 = null;
      TextureSampler14.aFont3384 = null;
      if (var0 != -118) {
        method1516(64, 82);
      }

      MilliFrameRegulator.anImage2695 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "n.J(" + var0 + ')');
    }
  }

  static int bitXor(int var0, int var1) {
    try {
      return var0 ^ var1;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "n.E(" + var0 + ',' + var1 + ')');
    }
  }

  public static void method1521(int var0) {
    try {
      tileOrientation = null;
      aClass94_1326 = null;
      if (var0 != 3101) {
        method1516(99, -14);
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "n.A(" + var0 + ')');
    }
  }

  static final void method1525(int var0, int var1, int var2, int var3, int var4, int var5) {
    try {
      int var6 =
        DummyClass59.method1040(LightIntensity.anInt902, var3, (byte) 0, DummyClass13.anInt2020);
      int var7 =
        DummyClass59.method1040(LightIntensity.anInt902, var5, (byte) 0, DummyClass13.anInt2020);
      int var8 =
        DummyClass59.method1040(GlTexture2d.anInt3765, var4, (byte) 0, DummyClass55.anInt1425);
      if (var0 != 3074) {
        method1516(75, -7);
      }

      int var9 =
        DummyClass59.method1040(GlTexture2d.anInt3765, var2, (byte) 0, DummyClass55.anInt1425);

      for (int var10 = var6; var10 <= var7; ++var10) {
        TextureSampler18
          .method282(DummyClass35.anIntArrayArray663[var10], var8, var0 + -2974, var9, var1);
      }

    } catch (RuntimeException var11) {
      throw AbstractGameWorld.cascadeException(var11,
        "n.I(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
    }
  }

  final void get(byte var1, Object var2, long var3) {
    try {
      this.method1518(var3, (byte) -124);
      if (var1 > -72) {
        this.table = null;
      }

      if (-1 == ~this.anInt1327) {
        AbstractObjectNode var5 = (AbstractObjectNode) this.aClass13_1329.poll();
        var5.unlinkNode();
        var5.unlinkSubNode();
      } else {
        --this.anInt1327;
      }

      ObjectNode var7 = new ObjectNode(var2);
      this.table.put(var3, var7);
      this.aClass13_1329.addLast(var7);
      var7.subnodeKey = 0L;
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "n.F(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
    }
  }

  final void method1518(long var1, byte var3) {
    try {
      AbstractObjectNode var4 = (AbstractObjectNode) this.table.get(var1);
      if (var3 == -124) {
        if (null != var4) {
          var4.unlinkNode();
          var4.unlinkSubNode();
          ++this.anInt1327;
        }

      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5, "n.C(" + var1 + ',' + var3 + ')');
    }
  }

  final int method1520(int var1) {
    try {
      if (var1 != -12623) {
        return -85;
      } else {
        int var2 = 0;

        for (AbstractObjectNode var3 = (AbstractObjectNode) this.aClass13_1329.getFirst();
             var3 != null; var3 = (AbstractObjectNode) this.aClass13_1329.getNext()) {
          if (!var3.method568(-22358)) {
            ++var2;
          }
        }

        return var2;
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "n.D(" + var1 + ')');
    }
  }

  final void method1522(int var1, int var2) {
    try {
      if (null != Texture.aClass118_3794) {
        for (AbstractObjectNode var3 = (AbstractObjectNode) this.aClass13_1329.getFirst();
             null != var3; var3 = (AbstractObjectNode) this.aClass13_1329.getNext()) {
          if (!var3.method568(-22358)) {
            if (++var3.subnodeKey > (long) var2) {
              AbstractObjectNode var4 = Texture.aClass118_3794.wrap(var3, -108);
              this.table.put(var3.key, var4);
              DummyClass38.method1084(var3, var4, (byte) 121);
              var3.unlinkNode();
              var3.unlinkSubNode();
            }
          } else if (null == var3.getObject(true)) {
            var3.unlinkNode();
            var3.unlinkSubNode();
            ++this.anInt1327;
          }
        }
      }

      if (var1 > -124) {
        this.method1518(24L, (byte) -18);
      }

    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5, "n.G(" + var1 + ',' + var2 + ')');
    }
  }

  final void method1523(byte var1) {
    try {
      for (AbstractObjectNode var2 = (AbstractObjectNode) this.aClass13_1329.getFirst();
           var2 != null; var2 = (AbstractObjectNode) this.aClass13_1329.getNext()) {
        if (var2.method568(-22358)) {
          var2.unlinkNode();
          var2.unlinkSubNode();
          ++this.anInt1327;
        }
      }

      if (var1 > -98) {
        this.anInt1331 = 56;
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "n.B(" + var1 + ')');
    }
  }

  final void method1524(int var1) {
    try {
      if (var1 == 3) {
        this.aClass13_1329.clear();
        this.table.clear(114);
        this.anInt1327 = this.anInt1331;
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "n.H(" + var1 + ')');
    }
  }

  final Object get(long var1) {
    try {
      AbstractObjectNode var4 = (AbstractObjectNode) this.table.get(var1);
      if (null == var4) {
        return null;
      } else {
        Object var5 = var4.getObject(true);
        if (var5 != null) {
          if (var4.method568(-22358)) {
            ObjectNode var6 = new ObjectNode(var5);
            this.table.put(var4.key, var6);
            this.aClass13_1329.addLast(var6);
            var6.subnodeKey = 0L;
            var4.unlinkNode();
            var4.unlinkSubNode();
          } else {
            this.aClass13_1329.addLast(var4);
            var4.subnodeKey = 0L;
          }

          return var5;
        } else {
          var4.unlinkNode();
          var4.unlinkSubNode();
          ++this.anInt1327;
          return null;
        }
      }
    } catch (RuntimeException var7) {
      throw AbstractGameWorld.cascadeException(var7, "n.K(" + var1 + ')');
    }
  }

}
