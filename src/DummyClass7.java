class DummyClass7 extends DummyClass6 {

  static GameString settings = null;
  static GameString aClass94_2997 = SpawnedGameObject.createString("blinken1:");
  static BufferedFile[] cacheIndexFiles = new BufferedFile[28];


  static final SceneSomething method2217(int var0, int var1, int var2) {
    SceneGraphTile var3 = SomethingTexture1.sceneGraphTiles[var0][var1][var2];
    if (var3 == null) {
      return null;
    } else {
      for (int var4 = 0; var4 < var3.anInt2223; ++var4) {
        SceneSomething var5 = var3.sceneGraphNodes[var4];
        if ((var5.aLong498 >> 29 & 3L) == 2L && var5.anInt483 == var1 && var5.anInt478 == var2) {
          AbstractImageProducer.method2186(var5);
          return var5;
        }
      }

      return null;
    }
  }

  public static void method2218(byte var0) {
    try {
      settings = null;
      aClass94_2997 = null;
      if (var0 != -83) {
        method2218((byte) -9);
      }

      cacheIndexFiles = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "dk.B(" + var0 + ')');
    }
  }

  static final void method2219(Buffer var0, boolean var1) {
    try {
      if (var1) {
        cacheIndexFiles = null;
      }

      while (~var0.position > ~var0.bytes.length) {
        int var4 = 0;
        boolean var3 = false;
        int var5 = 0;
        if (var0.readUnsignedByte() == 1) {
          var3 = true;
          var4 = var0.readUnsignedByte();
          var5 = var0.readUnsignedByte();
        }

        int var6 = var0.readUnsignedByte();
        int var7 = var0.readUnsignedByte();
        int var9 = -(var7 * 64) - (-MapScene.anInt65 - DummyClass58.anInt1460 + 1);
        int var8 = var6 * 64 + -TextureSampler37.anInt3256;
        byte var2;
        int var10;
        if (var8 >= 0 && var9 + -63 >= 0 && ~(var8 - -63) > ~DummyClass30.anInt455
          && var9 < DummyClass58.anInt1460) {
          var10 = var8 >> 6;
          int var11 = var9 >> 6;

          for (int var12 = 0; ~var12 > -65; ++var12) {
            for (int var13 = 0; var13 < 64; ++var13) {
              if (!var3
                || ~var12 <= ~(8 * var4) && var12 < 8 + var4 * 8 && var13 >= var5 * 8 && ~var13 > ~(
                8 + var5 * 8)) {
                var2 = var0.readByte();
                if (-1 != ~var2) {
                  if (RenderAnimation.aByteArrayArrayArray383[var10][var11] == null) {
                    RenderAnimation.aByteArrayArrayArray383[var10][var11] = new byte[4096];
                  }

                  RenderAnimation.aByteArrayArrayArray383[var10][var11][var12 + (-var13 + 63
                    << 6)] = var2;
                  byte var14 = var0.readByte();
                  if (StringNode0.aByteArrayArrayArray2339[var10][var11] == null) {
                    StringNode0.aByteArrayArrayArray2339[var10][var11] = new byte[4096];
                  }

                  StringNode0.aByteArrayArrayArray2339[var10][var11][var12 + (63 - var13 << 6)] =
                    var14;
                }
              }
            }
          }
        } else {
          for (var10 = 0; ~(var3 ? 64 : 4096) < ~var10; ++var10) {
            var2 = var0.readByte();
            if (0 != var2) {
              ++var0.position;
            }
          }
        }
      }

    } catch (RuntimeException var15) {
      throw AbstractGameWorld.cascadeException(var15,
        "dk.C(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

}
