final class AnimationFrame extends Node {

  private static GameString aClass94_2465 = SpawnedGameObject.createString("");
  static int anInt2456;
  static float aFloat2457;
  static GameString aClass94_2458 = SpawnedGameObject.createString("Module texte charg-B");
  static int anInt2459;
  static GameString aClass94_2461 =
    SpawnedGameObject.createString("3D)2Softwarebibliothek gestartet)3");
  static GameString loadingText = aClass94_2465;
  int anInt2454;
  int[] anIntArray2455;
  int[][] anIntArrayArray2460;
  int anInt2462;
  boolean[] aBooleanArray2463;
  int[] anIntArray2466;

  AnimationFrame(int var1, byte[] var2) {
    try {
      this.anInt2454 = var1;
      Buffer var3 = new Buffer(var2);
      this.anInt2462 = var3.readUnsignedByte();
      this.anIntArrayArray2460 = new int[this.anInt2462][];
      this.anIntArray2466 = new int[this.anInt2462];
      this.aBooleanArray2463 = new boolean[this.anInt2462];
      this.anIntArray2455 = new int[this.anInt2462];

      int var4;
      for (var4 = 0; ~var4 > ~this.anInt2462; ++var4) {
        this.anIntArray2466[var4] = var3.readUnsignedByte();
      }

      for (var4 = 0; ~this.anInt2462 < ~var4; ++var4) {
        this.aBooleanArray2463[var4] = ~var3.readUnsignedByte() == -2;
      }

      for (var4 = 0; var4 < this.anInt2462; ++var4) {
        this.anIntArray2455[var4] = var3.readUnsignedShort();
      }

      for (var4 = 0; var4 < this.anInt2462; ++var4) {
        this.anIntArrayArray2460[var4] = new int[var3.readUnsignedByte()];
      }

      for (var4 = 0; this.anInt2462 > var4; ++var4) {
        for (int var5 = 0; ~var5 > ~this.anIntArrayArray2460[var4].length; ++var5) {
          this.anIntArrayArray2460[var4][var5] = var3.readUnsignedByte();
        }
      }

    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "jm.<init>(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
    }
  }

  public static void method380(int var0) {
    try {
      loadingText = null;
      if (var0 != -29113) {
        method381(false);
      }

      aClass94_2458 = null;
      aClass94_2465 = null;
      aClass94_2461 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "jm.B(" + var0 + ')');
    }
  }

  static final void method381(boolean var0) {
    try {
      if (0 != ~InventoryConfig.anInt3655) {
        PlayerAppearance.method1160(-120, InventoryConfig.anInt3655);
      }

      for (int var1 = 0; var1 < SomethingWorldMapy.widgetQuads; ++var1) {
        if (GroundItemNode.aBooleanArray3674[var1]) {
          DummyClass9.aBooleanArray4008[var1] = true;
        }

        HashTable.aBooleanArray1712[var1] = GroundItemNode.aBooleanArray3674[var1];
        GroundItemNode.aBooleanArray3674[var1] = false;
      }

      DummyClass41.anInt865 = -1;
      DummyClass54.aClass11_1402 = null;
      SomethingOtherWorldMap.anInt2535 = AbstractGameWorld.updateCycle;
      if (GlRenderer.useOpenGlRenderer) {
        DummyOutputStream.aBoolean47 = true;
      }

      SubNode.anInt2567 = -1;
      if (!var0) {
        method380(-78);
      }

      if (~InventoryConfig.anInt3655 != 0) {
        SomethingWorldMapy.widgetQuads = 0;
        FileSystem.method841(true);
      }

      if (GlRenderer.useOpenGlRenderer) {
        GlUtils.resetClip();
      } else {
        DummyClass47.method1331();
      }

      DisplayMode.loopCycle = 0;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "jm.A(" + var0 + ')');
    }
  }

}
