final class DummyClass27 {

  private static GameString aClass94_1582 = SpawnedGameObject.createString("Ok");
  static BlockConfig[][] blockConfigs = new BlockConfig[13][13];
  static GameString aClass94_1583 = aClass94_1582;


  public static void method1712(int var0) {
    try {
      blockConfigs = null;
      aClass94_1583 = null;
      aClass94_1582 = null;
      if (var0 <= 15) {
        aClass94_1582 = null;
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ph.B(" + var0 + ')');
    }
  }

  static final void method1713(byte var0) {
    try {
      if (var0 > -45) {
        blockConfigs = null;
      }

      while (true) {
        SomethingInScenePacket202 var1 =
          (SomethingInScenePacket202) IntegerNode.aClass61_2468.method1220((byte) -3);
        if (var1 == null) {
          return;
        }

        Object var2;
        int var3;
        if (0 > var1.anInt2273) {
          var3 = -var1.anInt2273 - 1;
          if (~var3 != ~WidgetAccess.localPlayerId) {
            var2 = TextureSampler0.players[var3];
          } else {
            var2 = TextureCache.localPlayer;
          }
        } else {
          var3 = var1.anInt2273 - 1;
          var2 = TextureSampler5.npcs[var3];
        }

        if (var2 != null) {
          GameObjectConfig var20 = DummyClass11.method2207(4, var1.anInt2270);
          if (~GameWorldSomething.currentPlane > -4) {
          }

          int var4;
          int var5;
          if (~var1.anInt2284 != -2 && ~var1.anInt2284 != -4) {
            var4 = var20.anInt1480;
            var5 = var20.anInt1485;
          } else {
            var5 = var20.anInt1480;
            var4 = var20.anInt1485;
          }

          int var7 = (var4 - -1 >> 1) + var1.anInt2271;
          int var6 = (var4 >> 1) + var1.anInt2271;
          int var8 = (var5 >> 1) + var1.anInt2282;
          int var9 = (var5 + 1 >> 1) + var1.anInt2282;
          int[][] var10 = AbstractGameWorld.heightMap[GameWorldSomething.currentPlane];
          int var11 =
            var10[var7][var9] + var10[var6][var9] + (var10[var6][var8] - -var10[var7][var8]) >> 2;
          SceneNode var12 = null;
          int var13 = AbstractSomethingTexture.OBJECT_TYPES[var1.anInt2278];
          if (-1 == ~var13) {
            SceneSomething2 var14 =
              DummyClass14.method2147(GameWorldSomething.currentPlane, var1.anInt2271,
                var1.anInt2282);
            if (var14 != null) {
              var12 = var14.sceneNode0;
            }
          } else if (~var13 != -2) {
            if (2 == var13) {
              SceneSomething var23 =
                AbstractSomethingTexture.method1336(GameWorldSomething.currentPlane, var1.anInt2271,
                  var1.anInt2282);
              if (null != var23) {
                var12 = var23.sceneNode;
              }
            } else if (var13 == 3) {
              SomethingSceneJ var24 =
                Buffer.method784(GameWorldSomething.currentPlane, var1.anInt2271, var1.anInt2282);
              if (null != var24) {
                var12 = var24.aClass140_320;
              }
            }
          } else {
            SomethingSceneI var21 =
              AbstractGameWorld.method1068(GameWorldSomething.currentPlane, var1.anInt2271,
                var1.anInt2282);
            if (null != var21) {
              var12 = var21.aClass140_429;
            }
          }

          if (null != var12) {
            Queue.method881(GameWorldSomething.currentPlane, var1.anInt2282, -96, 0, var1.anInt2271,
              var1.anInt2283 - -1, -1, var13, 0, var1.anInt2266 - -1);
            ((Mobile) var2).anInt2778 = var1.anInt2283 + AbstractGameWorld.updateCycle;
            ((Mobile) var2).anInt2833 = 64 * var5 + var1.anInt2282 * 128;
            ((Mobile) var2).anInt2782 = var4 * 64 + 128 * var1.anInt2271;
            ((Mobile) var2).anObject2796 = var12;
            int var22 = var1.anInt2268;
            ((Mobile) var2).anInt2812 = var11;
            ((Mobile) var2).anInt2797 = AbstractGameWorld.updateCycle + var1.anInt2266;
            int var15 = var1.anInt2272;
            int var16 = var1.anInt2277;
            int var17 = var1.anInt2279;
            int var18;
            if (var22 > var15) {
              var18 = var22;
              var22 = var15;
              var15 = var18;
            }

            ((Mobile) var2).anInt2818 = var1.anInt2271 + var15;
            if (~var16 < ~var17) {
              var18 = var16;
              var16 = var17;
              var17 = var18;
            }

            ((Mobile) var2).anInt2777 = var1.anInt2282 + var16;
            ((Mobile) var2).anInt2817 = var17 + var1.anInt2282;
            ((Mobile) var2).anInt2788 = var1.anInt2271 - -var22;
          }
        }
      }
    } catch (RuntimeException var19) {
      throw AbstractGameWorld.cascadeException(var19, "ph.A(" + var0 + ')');
    }
  }

  static final void method1714(byte var0) {
    try {
      Keyboard.aClass93_1911.method1523((byte) -112);
      if (var0 != -6) {
        method1712(-114);
      }

      HashTableIterator.aClass93_1131.method1523((byte) -100);
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ph.C(" + var0 + ')');
    }
  }

}
