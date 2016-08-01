final class SceneSomething2 {

  static GameString[] aClass94Array1046 = new GameString[200];
  static int windowHeight;
  static double aDouble1050 = -1.0D;
  static GameString aClass94_1051 = SpawnedGameObject.createString("(Udns");
  static int anInt1053 = 0;
  static SomethingQuickChatK aClass10_1056;
  static FileUnpacker fileUnpacker21;
  static int anInt1060;
  int positionZ;
  long key = 0L;
  SceneNode sceneNode0;
  SceneNode sceneNode1;
  int positionX;
  int anInt1055;
  int positionY;
  int anInt1059;

  public static void method1284(byte var0) {
    try {
      if (var0 != -87) {
        aClass94Array1046 = null;
      }

      fileUnpacker21 = null;
      aClass94_1051 = null;
      aClass94Array1046 = null;
      aClass10_1056 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "jh.A(" + var0 + ')');
    }
  }

  static final void method1285(FileUnpacker var0, boolean var1, int var2, int var3, boolean var4,
                               int var5) {
    try {
      DummyClass55.aClass153_1423 = var0;
      SomethingQuickChatK.anInt154 = 1;
      TextureSampler36.anInt3423 = var5;
      DummyClass22.anInt1741 = var3;
      TextureSampler8.anInt3463 = var2;
      AreaSoundEffect.aBoolean2311 = var4;
      if (var1) {
        anInt1053 = 125;
      }

      SpotAnimationConfig.anInt546 = 10000;
    } catch (RuntimeException var7) {
      throw AbstractGameWorld.cascadeException(var7,
        "jh.D(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ',' + var3 + ','
          + var4 + ',' + var5 + ')');
    }
  }

  static final void method1286(int var0, boolean var1, GameObjectConfig var2, int var3, NPC var4,
                               int var5, int var6, Player var7) {
    try {
      if (var1) {
        windowHeight = 94;
      }

      AreaSoundEffect var8 = new AreaSoundEffect();
      var8.anInt2308 = var0 * 128;
      var8.anInt2326 = 128 * var5;
      var8.anInt2314 = var6;
      if (null != var2) {
        var8.anIntArray2333 = var2.anIntArray1539;
        var8.anInt2328 = var2.anInt1484 * 128;
        var8.anInt2325 = var2.anInt1515;
        var8.aClass111_2320 = var2;
        var8.anInt2332 = var2.anInt1512;
        var8.anInt2310 = var2.anInt1518;
        int var9 = var2.anInt1480;
        int var10 = var2.anInt1485;
        if (-2 == ~var3 || 3 == var3) {
          var9 = var2.anInt1485;
          var10 = var2.anInt1480;
        }

        var8.anInt2307 = (var10 + var0) * 128;
        var8.anInt2321 = (var5 + var9) * 128;
        if (var2.anIntArray1524 != null) {
          var8.aBoolean2329 = true;
          var8.method134(1);
        }

        if (null != var8.anIntArray2333) {
          var8.anInt2316 =
            var8.anInt2310 - -((int) (Math.random() * (double) (-var8.anInt2310 + var8.anInt2325)));
        }

        Node.aClass61_78.addLast(var8);
      } else if (null != var4) {
        var8.aClass140_Sub4_Sub2_2324 = var4;
        NpcConfiguration var12 = var4.config;
        if (null != var12.anIntArray1292) {
          var8.aBoolean2329 = true;
          var12 = var12.method1471((byte) -112);
        }

        if (var12 != null) {
          var8.anInt2307 = 128 * (var12.size + var0);
          var8.anInt2321 = 128 * (var5 - -var12.size);
          var8.anInt2332 = ISAACCipher.method1232(var4, -1);
          var8.anInt2328 = 128 * var12.anInt1291;
        }

        SocketStream.aClass61_1242.addLast(var8);
      } else if (null != var7) {
        var8.aClass140_Sub4_Sub1_2327 = var7;
        var8.anInt2321 = (var7.getSize() + var5) * 128;
        var8.anInt2307 = 128 * (var7.getSize() + var0);
        var8.anInt2332 = DummyClass50.method1398(0, var7);
        var8.anInt2328 = 128 * var7.anInt3969;
        ObjectNode.aClass130_4046.put(var7.name.toBase37(), var8);
      }

    } catch (RuntimeException var11) {
      throw AbstractGameWorld.cascadeException(var11,
        "jh.C(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + (
          var4 != null ?
            "{...}" :
            "null") + ',' + var5 + ',' + var6 + ',' + (var7 != null ? "{...}" : "null") + ')');
    }
  }

  static final SoftwareFont method1287(int var0, int var1, FileUnpacker var2, FileUnpacker var3,
                                       int var4) {
    try {
      if (SomethingTexture4.loadSprites(var3, var1, var0, var4 ^ 30900)) {
        if (var4 != -1) {
          method1284((byte) -124);
        }

        return AbstractTextureSampler.method163(var2.getBytes(var0, var1), 25208);
      } else {
        return null;
      }
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "jh.B(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + (
          var3 != null ? "{...}" : "null") + ',' + var4 + ')');
    }
  }

}
