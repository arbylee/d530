final class SomethingQuickChatK {

  static GameString aClass94_148 = SpawnedGameObject.createString("(U(Y");
  static GameString aClass94_150 = SpawnedGameObject.createString("Ausw-=hlen");
  static FileUnpacker aClass153_152;
  static int anInt154 = 0;
  int anInt149;
  SomethingQuickChat aClass3_Sub28_Sub4_151;
  int[] anIntArray153;

  static final SoftwareDirectColorSprite[] createSprites() {
    try {
      SoftwareDirectColorSprite[] var1 = new SoftwareDirectColorSprite[DummyClass53.spriteCount];
      for (int var2 = 0; ~var2 > ~DummyClass53.spriteCount; ++var2) {
        int var3 = TextureSampler26.anIntArray3076[var2] * GroundItem.anIntArray2931[var2];
        byte[] var4 = DummyClass5.aByteArrayArray2987[var2];
        int[] var5 = new int[var3];

        for (int var6 = 0; ~var6 > ~var3; ++var6) {
          var5[var6] = TextureSampler38.anIntArray3446[ClientScript.bitAnd(255, var4[var6])];
        }

        var1[var2] =
          new SoftwareDirectColorSprite(SomethingVolume15.anInt2426, SomethingPacket116.anInt1748,
            Something3dRoot.anIntArray2048[var2], Buffer.anIntArray2591[var2],
            GroundItem.anIntArray2931[var2], TextureSampler26.anIntArray3076[var2], var5);
      }

      DummyClass37.method1035((byte) 113);
      return var1;
    } catch (RuntimeException var7) {
      throw AbstractGameWorld.cascadeException(var7, "bd.B()");
    }
  }

  static final void method852(byte var0, int var1) {
    try {
      Inventory var2 =
        (Inventory) SceneGraphTile.aClass130_2220.get((long) var1);
      if (var2 != null) {
        if (var0 != 114) {
          aClass153_152 = null;
        }

        for (int var3 = 0; var2.ids.length > var3; ++var3) {
          var2.ids[var3] = -1;
          var2.counts[var3] = 0;
        }

      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "bd.C(" + var0 + ',' + var1 + ')');
    }
  }

  public static void method853(int var0) {
    try {
      aClass94_148 = null;
      aClass94_150 = null;
      if (var0 != 0) {
        aClass94_148 = null;
      }

      aClass153_152 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "bd.A(" + var0 + ')');
    }
  }

}
