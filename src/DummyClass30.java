final class DummyClass30 {

  static int anInt452;
  static int anInt453 = 0;
  static int viewWidth;
  static int anInt455;
  static int anInt456;
  static boolean[][] adjacentTileOnScreen;
  private static GameString aClass94_458 = SpawnedGameObject.createString("Opened title screen");
  static GameString aClass94_459 = aClass94_458;


  public static void method937(int var0) {
    try {
      adjacentTileOnScreen = null;
      aClass94_458 = null;
      if (var0 != 0) {
        adjacentTileOnScreen = null;
      }

      aClass94_459 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "dl.A(" + var0 + ')');
    }
  }

  static final void method938(int var0, int var1, int var2, int var3, int var4, int var5, int var6,
                              int var7, int var8) {
    try {
      if (var6 != 1) {
        aClass94_458 = null;
      }

      int var9 = var2 - var7;
      int var10 = var3 - var8;
      int var11 = (-var1 + var0 << 16) / var9;
      int var12 = (-var5 + var4 << 16) / var10;
      SceneShadowMap.method1814(var1, var3, var2, var12, var7, 0, 0, 127, var11, var8, var5);
    } catch (RuntimeException var13) {
      throw AbstractGameWorld.cascadeException(var13,
        "dl.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6
          + ',' + var7 + ',' + var8 + ')');
    }
  }

  static final Buffer method939(byte var0) {
    try {
      Buffer var1 = new Buffer(34);
      var1.writeByte(11);
      var1.writeByte(AbstractFileRequest.brightnessSetting);
      var1.writeByte(!ClientScriptEnum.aBoolean3665 ? 0 : 1);
      var1.writeByte(AbstractObjectNode.aBoolean3604 ? 1 : 0);
      var1.writeByte(Keyboard.aBoolean1905 ? 1 : 0);
      var1.writeByte(SceneSomething.aBoolean488 ? 1 : 0);
      var1.writeByte(!Widget.aBoolean236 ? 0 : 1);
      var1.writeByte(!GameWorld.aBoolean2623 ? 0 : 1);
      var1.writeByte(TextureSampler0.aBoolean3275 ? 1 : 0);
      var1.writeByte(!Projectile.aBoolean2910 ? 0 : 1);
      var1.writeByte(HashTableIterator.anInt1137);
      var1.writeByte(!DisplayMode.useBumpMaps ? 0 : 1);
      var1.writeByte(DummyHashTable.aBoolean1685 ? 1 : 0);
      var1.writeByte(DummyClass35.aBoolean661 ? 1 : 0);
      var1.writeByte(Parameter.anInt3622);
      var1.writeByte(!TextureSampler17.aBoolean3184 ? 0 : 1);
      var1.writeByte(ClientScriptCall.anInt2453);
      var1.writeByte(BZipDecompressorState.anInt120);
      var1.writeByte(DummyClass28.anInt340);
      var1.writeShort(AbstractTextureSampler.anInt2378);
      var1.writeShort(TextureSampler21.anInt3071);
      var1.writeByte(DummyClass0.method1757());
      var1.writeInt(GameString.anInt2148);
      var1.writeByte(SubNode.anInt2577);
      var1.writeByte(GameString.safemode ? 1 : 0);
      var1.writeByte(!AudioWorker.aBoolean346 ? 0 : 1);
      var1.writeByte(TriChromaticImageBuffer.anInt2488);
      var1.writeByte(FileCacheRequester.aBoolean1080 ? 1 : 0);
      var1.writeByte(DummyClass4.aBoolean3004 ? 1 : 0);
      return var1;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "dl.C(" + var0 + ')');
    }
  }

  static final void method940(int var0, int var1) {
    try {
      if (var0 >= 101) {
        Mouse var2 = ObjectNode.mouse;
        synchronized (var2) {
          ObjectNode.anInt4045 = var1;
        }
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5, "dl.D(" + var0 + ',' + var1 + ')');
    }
  }

}
