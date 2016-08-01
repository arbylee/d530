final class DummyClass51 {

  static int[][] anIntArrayArray1160 = new int[104][104];
  static int[] anIntArray1161;
  static Deque aClass61_1162 = new Deque();
  static int[] anIntArray1163 = new int[1000];
  static int viewX = 0;
  static int anInt1165 = -1;


  static final void method1417(int var0) {
    try {
      if (var0 < 98) {
        method1418(55, null);
      }

      if (~DummyClass15.state == -11 && GlRenderer.useOpenGlRenderer) {
        DummyClass26.setState(28, 5);
      }

      if (~DummyClass15.state == -31) {
        DummyClass26.setState(25, 5);
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "lf.D(" + var0 + ')');
    }
  }

  static final void method1418(int var0, FileUnpacker var1) {
    try {
      DummyClass8.aClass109_Sub1Array4027 =
        ClientScriptEnum.createSprites((byte) 65, NPC.runesFileId, var1);
      PlayerAppearance.anIntArray861 = new int[256];

      int var2;
      for (var2 = 0; -4 < ~var2; ++var2) {
        int var4 = (WorldMapLabel.anIntArray1729[1 + var2] & 16711680) >> 16;
        float var3 = (float) ((WorldMapLabel.anIntArray1729[var2] & 16711680) >> 16);
        float var6 = (float) (WorldMapLabel.anIntArray1729[var2] >> 8 & 255);
        float var9 = (float) (WorldMapLabel.anIntArray1729[var2] & 255);
        float var5 = ((float) var4 - var3) / 64.0F;
        int var7 = (WorldMapLabel.anIntArray1729[var2 + 1] & '\uff00') >> 8;
        float var8 = (-var6 + (float) var7) / 64.0F;
        int var10 = WorldMapLabel.anIntArray1729[var2 + 1] & 255;
        float var11 = ((float) var10 - var9) / 64.0F;

        for (int var12 = 0; -65 < ~var12; ++var12) {
          PlayerAppearance.anIntArray861[var12 + 64 * var2] = TextureSampler3
            .method308((int) var9, TextureSampler3.method308((int) var6 << 8, (int) var3 << 16));
          var6 += var8;
          var9 += var11;
          var3 += var5;
        }
      }

      for (var2 = 192; var2 < 255; ++var2) {
        PlayerAppearance.anIntArray861[var2] = WorldMapLabel.anIntArray1729[3];
      }

      var2 = -35 / ((-51 - var0) / 42);
      DummyClass12.anIntArray2026 = new int['\u8000'];
      DummyOutputStream.anIntArray49 = new int['\u8000'];
      TextureSampler30.method215((byte) -89, null);
      GameBuffer.anIntArray3805 = new int['\u8000'];
      DummyClass2.anIntArray1681 = new int['\u8000'];
      TriChromaticImageCache.aClass3_Sub28_Sub16_Sub2_1381 =
        new SoftwareDirectColorSprite(128, 254);
    } catch (RuntimeException var13) {
      throw AbstractGameWorld
        .cascadeException(var13, "lf.E(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  static final void method1419(int var0) {
    try {
      int var2 = TextureSampler29.anInt3395;
      int var3 = SomethingWorldMapy.anInt3552;
      int var1 = AbstractIndexedColorSprite.anInt1462;
      int var5 = 6116423;
      int var4 = SomethingQuickChat2.anInt3537;
      if (!GlRenderer.useOpenGlRenderer) {
        DummyClass47.method1323(var1, var2, var3, var4, var5);
        DummyClass47.method1323(1 + var1, 1 + var2, var3 + -2, 16, 0);
        DummyClass47.method1311(1 + var1, var2 + 18, -2 + var3, -19 + var4, 0);
      } else {
        GlUtils.fillQuad(var1, var2, var3, var4, var5);
        GlUtils.fillQuad(1 + var1, 1 + var2, var3 + -2, 16, 0);
        GlUtils.drawQuad(1 + var1, var2 + 18, var3 + -2, -19 + var4, 0);
      }

      FloorOverlay.aClass3_Sub28_Sub17_2096
        .method681(SomethingTexture4.aClass94_2667, var1 - -3, var2 + 14, var5, -1);
      int var7 = HashTable.anInt1709;
      int var6 = SomethingTilek.anInt1676;
      if (var0 >= -113) {
        anIntArrayArray1160 = null;
      }

      for (int var8 = 0; ~TextureSampler25.amountContextActions < ~var8; ++var8) {
        int var9 = (-var8 + -1 + TextureSampler25.amountContextActions) * 15 + var2 - -31;
        int var10 = 16777215;
        if (~var1 > ~var6 && ~var6 > ~(var1 - -var3) && -13 + var9 < var7 && ~var7 > ~(3 + var9)) {
          var10 = 16776960;
        }

        FloorOverlay.aClass3_Sub28_Sub17_2096
          .method681(Buffer.method802(var8, true), var1 - -3, var9, var10, 0);
      }

      LinearHashTable
        .method1282(AbstractIndexedColorSprite.anInt1462, (byte) 107, TextureSampler29.anInt3395,
          SomethingQuickChat2.anInt3537, SomethingWorldMapy.anInt3552);
    } catch (RuntimeException var11) {
      throw AbstractGameWorld.cascadeException(var11, "lf.A(" + var0 + ')');
    }
  }

  static final void method1420(int var0, int var1, int var2, int var3, byte var4) {
    try {
      WidgetUpdate var5 = AudioStreamEncoder3.method466(4, 10, var0);
      var5.g((byte) 33);
      var5.anInt3597 = var2;
      var5.anInt3598 = var3;
      var5.anInt3596 = var1;
      if (var4 >= -35) {
        anInt1165 = 86;
      }

    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "lf.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
    }
  }

  static final int getSettings() {
    try {
      return ((TextureSampler17.aBoolean3184 ? 1 : 0) << 19) + (
        ((DummyClass35.aBoolean661 ? 1 : 0) << 16) + ((!DummyHashTable.aBoolean1685 ? 0 : 1) << 15)
          + ((!DisplayMode.useBumpMaps ? 0 : 1) << 13) + ((Projectile.aBoolean2910 ? 1 : 0) << 10)
          + ((TextureSampler0.aBoolean3275 ? 1 : 0) << 9) + ((Widget.aBoolean236 ? 1 : 0) << 7) + (
          (!SceneSomething.aBoolean488 ? 0 : 1) << 6) + ((Keyboard.aBoolean1905 ? 1 : 0) << 5) + (
          ((!ClientScriptEnum.aBoolean3665 ? 0 : 1) << 3) + (AbstractFileRequest.brightnessSetting
            & 7) - (-((!AbstractObjectNode.aBoolean3604 ? 0 : 1) << 4) + -(
            (GameWorld.aBoolean2623 ? 1 : 0) << 8)) - (
            -(HashTableIterator.anInt1137 << 11 & 6144) + -(
              (-1 == ~ClientScriptCall.anInt2453 ? 0 : 1) << 20) - (
              ((~BZipDecompressorState.anInt120 != -1 ? 1 : 0) << 21) + (
                (~DummyClass28.anInt340 == -1 ? 0 : 1) << 22)))) - -(DummyClass0.method1757()
          << 23));
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "lf.F()");
    }
  }

  public static void method1422(byte var0) {
    try {
      anIntArrayArray1160 = null;
      anIntArray1161 = null;
      aClass61_1162 = null;
      anIntArray1163 = null;
      if (var0 != 24) {
        method1420(-74, 65, 51, 91, (byte) -26);
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "lf.B(" + var0 + ')');
    }
  }

}
