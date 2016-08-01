final class DummyClass23 {

  static HashTable aClass130_1659 = new HashTable(512);
  static GameString aClass94_1660 = SpawnedGameObject.createString("Versteckt");
  static FileUnpacker aClass153_1661;


  public static void method1744(boolean var0) {
    try {
      aClass130_1659 = null;
      aClass153_1661 = null;
      aClass94_1660 = null;
      if (!var0) {
        aClass130_1659 = null;
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "rb.A(" + var0 + ')');
    }
  }

  static final void method1745(int var0) {
    try {
      for (int var1 = var0; ~var1 > -105; ++var1) {
        for (int var2 = 0; 104 > var2; ++var2) {
          DummyClass9.anIntArrayArray4010[var1][var2] = 0;
        }
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "rb.B(" + var0 + ')');
    }
  }

  static final void method1746(boolean var0, byte var1) {
    try {
      if (var1 > -31) {
        aClass153_1661 = null;
      }

      SomethingTexture4.method1352(GroundItem.viewHeight, var0, -1, InventoryConfig.anInt3655,
        DummyClass30.viewWidth);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "rb.C(" + var0 + ',' + var1 + ')');
    }
  }

  static final SomethingWorldMapy method1747(Buffer var0, boolean var1) {
    try {
      SomethingWorldMapy var2 =
        new SomethingWorldMapy(var0.readString(), var0.readString(), var0.readUnsignedShort(),
          var0.readUnsignedShort(), var0.readInt(), var0.readUnsignedByte() == 1,
          var0.readUnsignedByte());
      int var3 = var0.readUnsignedByte();

      for (int var4 = 0; ~var4 > ~var3; ++var4) {
        var2.aClass61_3560.addLast(
          new SomethingWorldMappy(var0.readUnsignedShort(), var0.readUnsignedShort(),
            var0.readUnsignedShort(), var0.readUnsignedShort()));
      }

      var2.method538((byte) 103);
      return var2;
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "rb.D(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

}
