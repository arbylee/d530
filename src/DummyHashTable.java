final class DummyHashTable {

  static int anInt1682 = 1;
  static ObjectCache aClass93_1683 = new ObjectCache(64);
  static boolean aBoolean1685 = true;
  static GameString aClass94_1687 = SpawnedGameObject.createString("(Z");
  private static GameString aClass94_1686 = SpawnedGameObject.createString("shake:");
  static GameString aClass94_1688 = aClass94_1686;
  static GameString aClass94_1689 = aClass94_1686;
  private SubNode[] aClass3_Sub28Array1684;


  DummyHashTable(int var1) {
    try {
      this.aClass3_Sub28Array1684 = new SubNode[var1];

      for (int var2 = 0; ~var2 > ~var1; ++var2) {
        SubNode var3 = this.aClass3_Sub28Array1684[var2] = new SubNode();
        var3.prevSubNode = var3;
        var3.nextSubNode = var3;
      }

    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "rm.<init>(" + var1 + ')');
    }
  }

  static final void method1760(int var0, byte var1, int var2) {
    try {
      Deque var3 = TextureSampler0.groundItems[GameWorldSomething.currentPlane][var2][var0];
      if (var3 != null) {
        if (var1 == 65) {
          int var4 = -99999999;
          GroundItemNode var5 = null;

          GroundItemNode var6;
          for (
            var6 = (GroundItemNode) var3.getFirst();
            null != var6; var6 = (GroundItemNode) var3.getNext()) {
            ItemConfig var7 =
              DummyClass35.getItemConfig(var6.aClass140_Sub7_3676.anInt2936, (byte) 104);
            int var8 = var7.anInt757;
            if (var7.anInt764 == 1) {
              var8 *= 1 + var6.aClass140_Sub7_3676.anInt2930;
            }

            if (var4 < var8) {
              var4 = var8;
              var5 = var6;
            }
          }

          if (null != var5) {
            var3.method1216(64, var5);
            GroundItem var12 = null;
            GroundItem var14 = null;

            for (
              var6 = (GroundItemNode) var3.getFirst();
              var6 != null; var6 = (GroundItemNode) var3.getNext()) {
              GroundItem var9 = var6.aClass140_Sub7_3676;
              if (~var9.anInt2936 != ~var5.aClass140_Sub7_3676.anInt2936) {
                if (null == var12) {
                  var12 = var9;
                }

                if (~var9.anInt2936 != ~var12.anInt2936 && null == var14) {
                  var14 = var9;
                }
              }
            }

            long var13 = (long) (1610612736 + (var0 << 7) + var2);
            TextureSampler30.method213(GameWorldSomething.currentPlane, var2, var0, BufferData
                .method1736(GameWorldSomething.currentPlane, 1, 64 + 128 * var2, 64 + var0 * 128),
              var5.aClass140_Sub7_3676, var13, var12, var14);
          } else {
            GameObjectConfig.method1688(GameWorldSomething.currentPlane, var2, var0);
          }
        }
      } else {
        GameObjectConfig.method1688(GameWorldSomething.currentPlane, var2, var0);
      }
    } catch (RuntimeException var11) {
      throw AbstractGameWorld
        .cascadeException(var11, "rm.E(" + var0 + ',' + var1 + ',' + var2 + ')');
    }
  }

  public static void method1761(byte var0) {
    try {
      aClass94_1688 = null;
      aClass94_1686 = null;
      aClass94_1689 = null;
      aClass94_1687 = null;
      if (var0 < -46) {
        aClass93_1683 = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "rm.C(" + var0 + ')');
    }
  }

  static final void sleep(long var0) {
    try {
      try {

        Thread.sleep(var0);
      } catch (InterruptedException var4) {
      }

    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5, "rm.B(" + var0 + ')');
    }
  }

  static final AbstractModel method1763(boolean var0, int var1, int var2, int var3, int var4,
                                        AbstractModel var5, int var6) {
    try {
      long var7 = (long) var3;
      AbstractModel var9 = (AbstractModel) Deque.aClass93_939.get(var7);
      if (var9 == null) {
        Model var10 = Model.getModel(DummyClass13.models, var3, 0);
        if (var10 == null) {
          return null;
        }

        var9 = var10.method2008(64, 768, -50, -10, -50);
        Deque.aClass93_939.get((byte) -95, var9, var7);
      }

      int var17 = var5.method1884();
      int var11 = var5.method1883();
      int var12 = var5.method1898();
      int var13 = var5.method1872();
      var9 = var9.method1882(var0, true, true);
      if (var1 != 0) {
        var9.method1876(var1);
      }

      int var15;
      if (GlRenderer.useOpenGlRenderer) {
        GlModel var14 = (GlModel) var9;
        if (var6 != BufferData
          .method1736(GameWorldSomething.currentPlane, 1, var4 + var17, var2 + var12)
          || var6 != BufferData
          .method1736(GameWorldSomething.currentPlane, 1, var4 - -var11, var13 + var2)) {
          for (var15 = 0; ~var15 > ~var14.vertexCCC; ++var15) {
            var14.vy[var15] += BufferData
              .method1736(GameWorldSomething.currentPlane, 1, var14.vx[var15] + var4,
                var14.vz[var15] + var2) - var6;
          }

          var14.vertexPositionData.updated = false;
          var14.aClass6_3835.aBoolean98 = false;
        }
      } else {
        SoftwareModel var18 = (SoftwareModel) var9;
        if (var6 != BufferData
          .method1736(GameWorldSomething.currentPlane, 1, var17 + var4, var12 + var2)
          || var6 != BufferData
          .method1736(GameWorldSomething.currentPlane, 1, var4 - -var11, var13 + var2)) {
          for (var15 = 0; var18.anInt3891 > var15; ++var15) {
            var18.anIntArray3883[var15] += BufferData
              .method1736(GameWorldSomething.currentPlane, 1, var4 + var18.anIntArray3885[var15],
                var18.anIntArray3895[var15] + var2) - var6;
          }

          var18.aBoolean3897 = false;
        }
      }

      return var9;
    } catch (RuntimeException var16) {
      throw AbstractGameWorld.cascadeException(var16,
        "rm.D(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + (var5 != null ?
          "{...}" :
          "null") + ',' + var6 + ')');
    }
  }

  static final void method1764(int var0, int var1, int var2) {
    for (int var3 = 0; var3 < AnimationFrame.anInt2456; ++var3) {
      for (int var4 = 0; var4 < SocketStream.sceneWidth; ++var4) {
        for (int var5 = 0; var5 < TextureSampler17.sceneHeight; ++var5) {
          SceneGraphTile var6 = SomethingTexture1.sceneGraphTiles[var3][var4][var5];
          if (var6 != null) {
            SceneSomething2 var7 = var6.aClass70_2234;
            if (var7 != null && var7.sceneNode0.method1865()) {
              TextureSampler30.method214(var7.sceneNode0, var3, var4, var5, 1, 1);
              if (var7.sceneNode1 != null && var7.sceneNode1.method1865()) {
                TextureSampler30.method214(var7.sceneNode1, var3, var4, var5, 1, 1);
                var7.sceneNode0.method1866(var7.sceneNode1, 0, 0, 0, false);
                var7.sceneNode1 = var7.sceneNode1.method1861(var0, var1, var2);
              }

              var7.sceneNode0 = var7.sceneNode0.method1861(var0, var1, var2);
            }

            for (int var8 = 0; var8 < var6.anInt2223; ++var8) {
              SceneSomething var9 = var6.sceneGraphNodes[var8];
              if (var9 != null && var9.sceneNode.method1865()) {
                TextureSampler30
                  .method214(var9.sceneNode, var3, var4, var5, var9.anInt495 - var9.anInt483 + 1,
                    var9.anInt481 - var9.anInt478 + 1);
                var9.sceneNode = var9.sceneNode.method1861(var0, var1, var2);
              }
            }

            SomethingSceneJ var10 = var6.aClass12_2230;
            if (var10 != null && var10.aClass140_320.method1865()) {
              AbstractAudioOutputStream.method2162(var10.aClass140_320, var3, var4, var5);
              var10.aClass140_320 = var10.aClass140_320.method1861(var0, var1, var2);
            }
          }
        }
      }
    }

  }

}
