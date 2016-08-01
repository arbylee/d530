final class SomethingOtherWorldMap extends Node {

  static int anInt2530 = 2301979;
  static int[] anIntArray2533;
  static int anInt2534;
  static int anInt2535 = -2;
  static FileUnpacker aClass153_2536;
  static int anInt2537 = 0;
  static boolean[] aBooleanArray2538 = new boolean[] {
    true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true,
    true, true, true, true, true, true, true, true, false
  };
  static int anInt2540;
  static int anInt2541;
  static SomethingGl0[][] aClass3_Sub11ArrayArray2542;
  int anInt2531;
  int anInt2532;
  int anInt2539;

  public static void method405(boolean var0) {
    try {
      aClass153_2536 = null;
      anIntArray2533 = null;
      aClass3_Sub11ArrayArray2542 = null;
      aBooleanArray2538 = null;
      if (!var0) {
        method408(-65, (byte) -3, 110, null, -123, 122);
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "oj.B(" + var0 + ')');
    }
  }

  static final void drawLoadingScreen(AbstractFont var2, boolean var1) {
    try {
      int var3;
      if (GlRenderer.useOpenGlRenderer || var1) {
        var3 = GroundItem.viewHeight;
        int var4 = var3 * 956 / 503;
        DummyClass59.titlebackground.draw((DummyClass30.viewWidth + -var4) / 2, 0, var4, var3);
        AnimationSequence.logoSprite
          .draw(-(AnimationSequence.logoSprite.width / 2) + DummyClass30.viewWidth / 2, 18);
      }

      var2.draw(SceneSomething.aClass94_485, DummyClass30.viewWidth / 2,
        GroundItem.viewHeight / 2 - 26, 16777215, -1);
      var3 = GroundItem.viewHeight / 2 + -18;
      if (GlRenderer.useOpenGlRenderer) {
        GlUtils.drawQuad(DummyClass30.viewWidth / 2 - 152, var3, 304, 34, 9179409);
        GlUtils.drawQuad(-151 + DummyClass30.viewWidth / 2, var3 - -1, 302, 32, 0);
        GlUtils
          .fillQuad(DummyClass30.viewWidth / 2 - 150, var3 + 2, ClientScript.loadingPercent * 3, 30,
            9179409);
        GlUtils.fillQuad(DummyClass30.viewWidth / 2 + -150 - -(3 * ClientScript.loadingPercent),
          2 + var3, 300 + -(3 * ClientScript.loadingPercent), 30, 0);
      } else {
        DummyClass47.method1311(DummyClass30.viewWidth / 2 + -152, var3, 304, 34, 9179409);
        DummyClass47.method1311(-151 + DummyClass30.viewWidth / 2, var3 + 1, 302, 32, 0);
        DummyClass47
          .method1323(DummyClass30.viewWidth / 2 + -150, var3 + 2, ClientScript.loadingPercent * 3,
            30, 9179409);
        DummyClass47
          .method1323(3 * ClientScript.loadingPercent + -150 + DummyClass30.viewWidth / 2, 2 + var3,
            -(3 * ClientScript.loadingPercent) + 300, 30, 0);
      }

      var2
        .draw(AnimationFrame.loadingText, DummyClass30.viewWidth / 2, 4 + GroundItem.viewHeight / 2,
          16777215, -1);


    } catch (RuntimeException var5) {
      throw AbstractGameWorld
        .cascadeException(var5, "oj.D(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
    }
  }

  static final GameString method407(int var0, boolean var1, int var2, long var3, int var5) {
    try {
      GameString var6 = Cache.createString(0);
      if (~var3 > -1L) {
        var3 = -var3;
        var6.append(TextureSampler1.aClass94_3133);
      }

      GameString var8 = DummyClass15.aClass94_1880;
      GameString var7 = DummyClass28.aClass94_341;
      if (~var0 == -2) {
        var8 = DummyClass28.aClass94_341;
        var7 = DummyClass15.aClass94_1880;
      }

      if (-3 == ~var0) {
        var7 = DummyClass15.aClass94_1880;
        var8 = TextureSampler26.aClass94_3080;
      }

      if (-4 == ~var0) {
        var8 = DummyClass28.aClass94_341;
        var7 = DummyClass15.aClass94_1880;
      }

      GameString var10 = Cache.createString(0);

      int var11;
      for (var11 = 0; ~var11 > ~var2; ++var11) {
        var10.append(SomethingScene.toString((int) (var3 % 10L)));
        var3 /= 10L;
      }

      var11 = 0;
      GameString var9;
      if (var3 != 0L) {
        GameString var12;
        for (var12 = Cache.createString(0); var3 > 0L; var3 /= 10L) {
          if (var1 && ~var11 != -1 && -1 == ~(var11 % 3)) {
            var12.append(var8);
          }

          var12.append(SomethingScene.toString((int) (var3 % 10L)));
          ++var11;
        }

        var9 = var12;
      } else {
        var9 = TextureSampler12.aClass94_3039;
      }

      if (var5 != 2) {
        return null;
      } else {
        if (~var10.getLength() < -1) {
          var10.append(var7);
        }

        return RenderAnimation
          .concat(new GameString[] {var6, var9.method1544(true), var10.method1544(true)});
      }
    } catch (RuntimeException var13) {
      throw AbstractGameWorld.cascadeException(var13,
        "oj.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var5 + ')');
    }
  }

  static final int method408(int var0, byte var1, int var2, int[][] var3, int var4, int var5) {
    try {
      int var6 = var0 * var3[1 + var4][var2] + (128 - var0) * var3[var4][var2] >> 7;
      int var7 = var3[var4][1 + var2] * (-var0 + 128) + var3[var4 - -1][var2 - -1] * var0 >> 7;
      int var8 = -121 / ((var1 - 5) / 46);
      return var6 * (128 + -var5) - -(var5 * var7) >> 7;
    } catch (RuntimeException var9) {
      throw AbstractGameWorld.cascadeException(var9,
        "oj.A(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ','
          + var4 + ',' + var5 + ')');
    }
  }

}
