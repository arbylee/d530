abstract class AbstractIndexedColorSprite {

  static int anInt1462;
  static int anInt1463 = -16 + (int) (Math.random() * 33.0D);
  static long aLong1465 = 0L;
  static GameString aClass94_1466 = SpawnedGameObject.createString("Lade Titelbild )2 ");
  int width;
  int offsetY;
  int anInt1467;
  int height;
  int anInt1469;
  int offsetX;


  static final void addLast(Node first, Node second) {
    try {
      if (null != first.prevNode) {
        first.unlinkNode();
      }

      first.nextNode = second;
      first.prevNode = second.prevNode;
      first.prevNode.nextNode = first;
      first.nextNode.prevNode = first;
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "ok.C(" + (first != null ? "{...}" : "null") + ',' + (second != null ? "{...}" : "null")
          + ')');
    }
  }

  public static void method1663(int var0) {
    try {
      aClass94_1466 = null;
      if (var0 != 33) {
        anInt1463 = 15;
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ok.D(" + var0 + ')');
    }
  }

  static final Queue method1664(int var0, int var1, byte var2) {
    try {
      Queue var3 = new Queue();

      for (SomethingWorldMapy var4 = (SomethingWorldMapy) DummyClass21.aClass61_1758.getFirst();
           var4 != null; var4 = (SomethingWorldMapy) DummyClass21.aClass61_1758.getNext()) {
        if (var4.aBoolean3553 && var4.method537(var1, (byte) 97, var0)) {
          var3.addLast(var4);
        }
      }

      int var6 = 30 % ((64 - var2) / 54);
      return var3;
    } catch (RuntimeException var5) {
      throw AbstractGameWorld
        .cascadeException(var5, "ok.B(" + var0 + ',' + var1 + ',' + var2 + ')');
    }
  }

  static final void method1665(int var0, int var1, int var2, int var3, int var4, int var5,
                               int var6) {
    try {
      int var7 = var5 + var2;
      int var8 = -var5 + var4;
      if (var0 != -19619) {
        method1665(-17, 11, -118, -38, 115, -2, 113);
      }

      int var9 = var5 + var6;

      int var11;
      for (var11 = var2; ~var11 > ~var7; ++var11) {
        TextureSampler18.method282(DummyClass35.anIntArrayArray663[var11], var6, -91, var1, var3);
      }

      for (var11 = var4; var8 < var11; --var11) {
        TextureSampler18.method282(DummyClass35.anIntArrayArray663[var11], var6, -113, var1, var3);
      }

      int var10 = -var5 + var1;

      for (var11 = var7; ~var8 <= ~var11; ++var11) {
        int[] var12 = DummyClass35.anIntArrayArray663[var11];
        TextureSampler18.method282(var12, var6, -111, var9, var3);
        TextureSampler18.method282(var12, var10, -124, var1, var3);
      }

    } catch (RuntimeException var13) {
      throw AbstractGameWorld.cascadeException(var13,
        "ok.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6
          + ')');
    }
  }

  abstract void draw(int var1, int var2, int var3);

  abstract void draw(int var1, int var2);

}
