final class LinearHashTable {

  static int pitchCosine;
  static int anInt1038;
  static BufferedFile uidFile;
  static boolean aBoolean1040 = false;
  static int anInt1042;
  static FileUnpacker aClass153_1043;
  static GameString aClass94_1044 = SpawnedGameObject.createString("Titelbild geladen)3");
  private int[] anIntArray1041;


  LinearHashTable(int[] var1) {
    try {
      int var2;
      for (var2 = 1; (var1.length >> 1) + var1.length >= var2; var2 <<= 1) {
      }

      this.anIntArray1041 = new int[var2 + var2];

      int var3;
      for (var3 = 0; var2 + var2 > var3; ++var3) {
        this.anIntArray1041[var3] = -1;
      }

      int var4;
      for (var3 = 0; var1.length > var3; this.anIntArray1041[var4 - -var4 - -1] = var3++) {
        for (
          var4 = -1 + var2 & var1[var3];
          0 != ~this.anIntArray1041[1 + var4 - -var4]; var4 = -1 + var2 & 1 + var4) {
        }

        this.anIntArray1041[var4 + var4] = var1[var3];
      }

    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "jg.<init>(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  final int get(int var1) {
    try {

      int var3 = (this.anIntArray1041.length >> 1) + -1;
      int var4 = var3 & var1;

      while (true) {
        int var5 = this.anIntArray1041[1 + var4 + var4];
        if (var5 == -1) {
          return -1;
        }

        if (var1 == this.anIntArray1041[var4 + var4]) {
          return var5;
        }

        var4 = var4 - -1 & var3;
      }

    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6, "jg.D(" + var1 + ')');
    }
  }

  static final SoftwareIndexedColorSprite[] createSprites(int var0) {
    try {
      SoftwareIndexedColorSprite[] var1 = new SoftwareIndexedColorSprite[DummyClass53.spriteCount];

      for (int var2 = var0; ~var2 > ~DummyClass53.spriteCount; ++var2) {
        var1[var2] =
          new SoftwareIndexedColorSprite(SomethingVolume15.anInt2426, SomethingPacket116.anInt1748,
            Something3dRoot.anIntArray2048[var2], Buffer.anIntArray2591[var2],
            GroundItem.anIntArray2931[var2], TextureSampler26.anIntArray3076[var2],
            DummyClass5.aByteArrayArray2987[var2], TextureSampler38.anIntArray3446);
      }

      DummyClass37.method1035((byte) 116);
      return var1;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "jg.A(" + var0 + ')');
    }
  }

  static final void method1282(int var0, byte var1, int var2, int var3, int var4) {
    try {
      int var5 = 0;

      for (int var6 = 58 / ((56 - var1) / 49); ~SomethingWorldMapy.widgetQuads < ~var5; ++var5) {
        if (var0 < AbstractAudioOutputStream.quadx0[var5] - -GlTexture2d.quadx1[var5]
          && var0 + var4 > AbstractAudioOutputStream.quadx0[var5]
          && ~(Player.quady0[var5] - -Mobile.quady1[var5]) < ~var2 && ~Player.quady0[var5] > ~(var3
          + var2)) {
          DummyClass9.aBooleanArray4008[var5] = true;
        }
      }

    } catch (RuntimeException var7) {
      throw AbstractGameWorld.cascadeException(var7,
        "jg.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
    }
  }

  public static void method1283(byte var0) {
    try {
      aClass153_1043 = null;
      uidFile = null;
      aClass94_1044 = null;
      int var1 = -9 / ((var0 - 64) / 53);
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "jg.B(" + var0 + ')');
    }
  }

}
