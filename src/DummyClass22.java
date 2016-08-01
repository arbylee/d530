final class DummyClass22 {

  static int anInt1734 = 0;
  static FileUnpacker particles;
  static int anInt1736;
  static int minimumDelta = 1;
  static GameString aClass94_1738 = SpawnedGameObject.createString("<col=ffff00>");
  static GameString[] aClass94Array1739 = new GameString[1000];
  static int anInt1740 = 0;
  static int anInt1741;


  static final void method1798(int var0, SpawnedGameObject var1) {
    try {
      long var2 = 0L;
      int var4 = -1;
      if (var0 <= 17) {
        anInt1740 = -43;
      }

      int var5 = 0;
      if (-1 == ~var1.anInt2263) {
        var2 = SomethingAudio.method2174(var1.anInt2250, var1.anInt2264, var1.anInt2248);
      }

      int var6 = 0;
      if (-2 == ~var1.anInt2263) {
        var2 = HashTableIterator.method1395(var1.anInt2250, var1.anInt2264, var1.anInt2248);
      }

      if (var1.anInt2263 == 2) {
        var2 = AnimationSomething.method557(var1.anInt2250, var1.anInt2264, var1.anInt2248);
      }

      if (~var1.anInt2263 == -4) {
        var2 = SceneGraphTile.method104(var1.anInt2250, var1.anInt2264, var1.anInt2248);
      }

      if (var2 != 0L) {
        var4 = Integer.MAX_VALUE & (int) (var2 >>> 32);
        var6 = (int) var2 >> 20 & 3;
        var5 = ((int) var2 & 516214) >> 14;
      }

      var1.anInt2254 = var4;
      var1.anInt2253 = var5;
      var1.anInt2257 = var6;
    } catch (RuntimeException var7) {
      throw AbstractGameWorld.cascadeException(var7,
        "sf.B(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  static final void method1799(byte var0, FileUnpacker var1) {
    try {
      TextureSampler27.aClass153_3098 = var1;
      int var2 = 113 / ((1 - var0) / 63);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "sf.C(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  public static void method1800(byte var0) {
    try {
      aClass94Array1739 = null;
      aClass94_1738 = null;
      particles = null;
      if (var0 <= 52) {
        aClass94Array1739 = null;
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "sf.A(" + var0 + ')');
    }
  }

  static final void method1801(byte var0) {
    try {
      if (var0 >= -94) {
        method1799((byte) -90, null);
      }

      int var1 = FloorOverlay.aClass3_Sub28_Sub17_2096.method682(SomethingTexture4.aClass94_2667);

      int var2;
      int var3;
      for (var2 = 0; TextureSampler25.amountContextActions > var2; ++var2) {
        var3 = FloorOverlay.aClass3_Sub28_Sub17_2096.method682(Buffer.method802(var2, true));
        if (var3 > var1) {
          var1 = var3;
        }
      }

      var2 = 15 * TextureSampler25.amountContextActions + 21;
      int var4 = DummyClass36.anInt2612;
      var1 += 8;
      var3 = NpcConfiguration.anInt1297 + -(var1 / 2);
      if (~(var4 + var2) < ~GroundItem.viewHeight) {
        var4 = GroundItem.viewHeight + -var2;
      }

      if (DummyClass30.viewWidth < var3 + var1) {
        var3 = -var1 + DummyClass30.viewWidth;
      }

      if (-1 < ~var3) {
        var3 = 0;
      }

      if (~var4 > -1) {
        var4 = 0;
      }

      if (-2 == ~ClientScriptEnum.anInt3660) {
        if (~NpcConfiguration.anInt1297 == ~TextureSampler8.anInt3460
          && ~FloorOverlay.anInt2099 == ~DummyClass36.anInt2612) {
          SomethingQuickChat2.anInt3537 =
            TextureSampler25.amountContextActions * 15 - -(!FileUnpacker.aBoolean1951 ? 22 : 26);
          ClientScriptEnum.anInt3660 = 0;
          TextureSampler29.anInt3395 = var4;
          AbstractIndexedColorSprite.anInt1462 = var3;
          DummyClass36.aBoolean2615 = true;
          SomethingWorldMapy.anInt3552 = var1;
        }
      } else if (~NpcConfiguration.anInt1297 == ~DummyClass5.anInt2993
        && ~DummyClass36.anInt2612 == ~DummyClass36.anInt2614) {
        AbstractIndexedColorSprite.anInt1462 = var3;
        ClientScriptEnum.anInt3660 = 0;
        SomethingWorldMapy.anInt3552 = var1;
        TextureSampler29.anInt3395 = var4;
        SomethingQuickChat2.anInt3537 =
          (FileUnpacker.aBoolean1951 ? 26 : 22) + TextureSampler25.amountContextActions * 15;
        DummyClass36.aBoolean2615 = true;
      } else {
        FloorOverlay.anInt2099 = DummyClass36.anInt2614;
        TextureSampler8.anInt3460 = DummyClass5.anInt2993;
        ClientScriptEnum.anInt3660 = 1;
      }

    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5, "sf.D(" + var0 + ')');
    }
  }

}
