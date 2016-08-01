final class DummyClass60 {

  static boolean aBoolean440 = false;
  static int[] anIntArray441 = new int[2048];
  static GameString aClass94_442 =
    SpawnedGameObject.createString("Number of player models in cache:");
  static int sampleRate;
  static GameString aClass94_444 = SpawnedGameObject.createString("<img=1>");


  public static void method911(int var0) {
    try {
      if (var0 != 26) {
        anIntArray441 = null;
      }

      anIntArray441 = null;
      aClass94_444 = null;
      aClass94_442 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "dh.B(" + var0 + ')');
    }
  }

  static final void method912(boolean var0) {
    try {
      TextureSampler12.secureBuffer.position = 0;
      EnumStringFetcher.lastPacketId1 = -1;
      DummyClass36.aBoolean2615 = var0;
      HashTable.packetLength = 0;
      DummyClass45.anInt987 = 0;
      TextureSampler25.amountContextActions = 0;
      StringNode.lastPacketId0 = -1;
      DummyClass12.minimapMode = 0;
      DummyClass36.updateTime = 0;
      IdentityKit.lastPacketId2 = -1;
      SpotAnimationConfig.gameBuffer.position = 0;
      AbstractDirectColorSprite.anInt3699 = 0;
      GameString.packetId = -1;

      int var1;
      for (var1 = 0; TextureSampler0.players.length > var1; ++var1) {
        if (null != TextureSampler0.players[var1]) {
          TextureSampler0.players[var1].anInt2772 = -1;
        }
      }

      for (var1 = 0; ~var1 > ~TextureSampler5.npcs.length; ++var1) {
        if (TextureSampler5.npcs[var1] != null) {
          TextureSampler5.npcs[var1].anInt2772 = -1;
        }
      }

      Parameter.method580((byte) 80);
      SomethingPacket116.anInt1753 = 1;
      DummyClass26.setState(30, 5);

      for (var1 = 0; var1 < 100; ++var1) {
        GroundItemNode.aBooleanArray3674[var1] = true;
      }

      TextureSampler9.method204(-3);
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "dh.F(" + var0 + ')');
    }
  }

  static final AbstractObjectNodeWrapper method913(int var0) {
    try {
      try {
        if (var0 != 31431) {
          method913(123);
        }

        return (AbstractObjectNodeWrapper) Class.forName("SoftReferenceObjectNodeWrapper")
          .newInstance();
      } catch (Throwable var2) {
        return null;
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "dh.C(" + var0 + ')');
    }
  }

  static final SomethingPacket151 method914(int var0, int var1, int var2, int var3) {
    try {
      SomethingPacket151 var4 = new SomethingPacket151();
      var4.anInt2603 = var3;
      var4.anInt2602 = var1;
      TextureSampler23.aClass130_3208.put((long) var2, var4);
      TextureSampler20.method232(var1, 16182);
      Widget var5 = EnumStringFetcher.getWidget((byte) 122, var2);
      if (var5 != null) {
        DummyClass29.method909(120, var5);
      }

      if (null != TextureSampler27.aClass11_3087) {
        DummyClass29.method909(117, TextureSampler27.aClass11_3087);
        TextureSampler27.aClass11_3087 = null;
      }

      int var6 = TextureSampler25.amountContextActions;
      if (var0 != 6422) {
        aClass94_444 = null;
      }

      int var7;
      for (var7 = 0; var6 > var7; ++var7) {
        if (MapScene.method73(TextureSampler27.aShortArray3095[var7], var0 + -6301)) {
          Inventory.method509(1, var7);
        }
      }

      if (1 == TextureSampler25.amountContextActions) {
        DummyClass36.aBoolean2615 = false;
        AbstractSomethingTexture.method1340(AbstractIndexedColorSprite.anInt1462,
          SomethingWorldMapy.anInt3552, (byte) -40, TextureSampler29.anInt3395,
          SomethingQuickChat2.anInt3537);
      } else {
        AbstractSomethingTexture.method1340(AbstractIndexedColorSprite.anInt1462,
          SomethingWorldMapy.anInt3552, (byte) -40, TextureSampler29.anInt3395,
          SomethingQuickChat2.anInt3537);
        var7 = FloorOverlay.aClass3_Sub28_Sub17_2096.method682(SomethingTexture4.aClass94_2667);

        for (int var8 = 0; TextureSampler25.amountContextActions > var8; ++var8) {
          int var9 = FloorOverlay.aClass3_Sub28_Sub17_2096.method682(Buffer.method802(var8, true));
          if (~var9 < ~var7) {
            var7 = var9;
          }
        }

        SomethingWorldMapy.anInt3552 = 8 + var7;
        SomethingQuickChat2.anInt3537 =
          15 * TextureSampler25.amountContextActions + (!FileUnpacker.aBoolean1951 ? 22 : 26);
      }

      if (var5 != null) {
        FileRequester.method2104(var5, false, 55);
      }

      TextureSampler24.method226(var1, 58);
      if (0 != ~InventoryConfig.anInt3655) {
        ClassCheckRequest.method124(var0 ^ 6509, 1, InventoryConfig.anInt3655);
      }

      return var4;
    } catch (RuntimeException var10) {
      throw AbstractGameWorld.cascadeException(var10,
        "dh.D(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  static final void method915(GameString var0, int var1) {
    try {
      int var2 = ByteArrayNode.method576(var0, false);
      if (var1 != var2) {
        AbstractObjectNode.method565((byte) 86, DummyClass25.aClass131_1624.aShortArray1727[var2],
          DummyClass25.aClass131_1624.aShortArray1718[var2]);
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "dh.A(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

  static final AbstractMouseWheel createMouseWheel(byte var0) {
    try {
      if (var0 != 15) {
        aClass94_442 = null;
      }

      try {
        return (AbstractMouseWheel) Class.forName("MouseWheel").newInstance();
      } catch (Throwable var2) {
        return null;
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "dh.E(" + var0 + ')');
    }
  }

}
