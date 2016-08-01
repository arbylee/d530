import java.awt.Frame;

final class DummyClass54 {

  static short[] aShortArray1398;
  static SomethingFont aClass33_1399;
  static int anInt1400;
  static ObjectCache aClass93_1401 = new ObjectCache(500);
  static Widget aClass11_1402;
  static int anInt1403 = -1;


  static final void method1596(GameString var0, byte var1, boolean var2) {
    try {
      if (var1 < 124) {
        aClass93_1401 = null;
      }

      if (!var2) {
        try {
          StringNode.applet.getAppletContext()
            .showDocument(var0.method1547(StringNode.applet.getCodeBase(), true), "_top");
        } catch (Exception var5) {
        }
      } else {
        if (GlRenderer.useOpenGlRenderer && WidgetUpdate.aBoolean3594) {
          try {
            JSObject.method1056(DummyClass35.signLink.applet, "openjs", new Object[] {
              var0.method1547(StringNode.applet.getCodeBase(), true).toString()
            }, (byte) 117);
            return;
          } catch (Throwable var6) {
          }
        }

        try {
          StringNode.applet.getAppletContext()
            .showDocument(var0.method1547(StringNode.applet.getCodeBase(), true), "_blank");
        } catch (Exception var4) {
        }
      }

    } catch (RuntimeException var7) {
      throw AbstractGameWorld.cascadeException(var7,
        "nf.C(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ')');
    }
  }

  static final Frame method1597(int var0, int var1, int var2, int var3, int var4, SignLink var5) {
    try {
      if (!var5.method1432(false)) {
        return null;
      } else {
        if (0 == var2) {
          DisplayMode[] var6 = OndemandFileRequest.method596(10, var5);
          if (null == var6) {
            return null;
          }

          boolean var7 = false;

          for (int var8 = 0; ~var8 > ~var6.length; ++var8) {
            if (var4 == var6[var8].anInt1447 && var3 == var6[var8].anInt1449 && (~var1 == -1
              || var1 == var6[var8].anInt1448) && (!var7 || var6[var8].anInt1450 > var2)) {
              var2 = var6[var8].anInt1450;
              var7 = true;
            }
          }

          if (!var7) {
            return null;
          }
        }

        SignLinkRequest var10 = var5.method1450(var1, var2, var3, var4, -121);

        while (0 == var10.status) {
          TextureSampler25.sleep(10L);
        }

        Frame var11 = (Frame) var10.result;
        if (null != var11) {
          if (var0 != var10.status) {
            return var11;
          } else {
            FileCacheRequest.method593(var11, true, var5);
            return null;
          }
        } else {
          return null;
        }
      }
    } catch (RuntimeException var9) {
      throw AbstractGameWorld.cascadeException(var9,
        "nf.D(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + (var5 != null ?
          "{...}" :
          "null") + ')');
    }
  }

  public static void method1598(int var0) {
    try {
      if (var0 <= -106) {
        aShortArray1398 = null;
        aClass11_1402 = null;
        aClass93_1401 = null;
        aClass33_1399 = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "nf.B(" + var0 + ')');
    }
  }

  static final int method1599(int var0, int var1, byte[] var2, byte var3) {
    try {
      int var4 = -1;
      int var5 = -16 % ((var3 - 61) / 57);

      for (int var6 = var0; var1 > var6; ++var6) {
        var4 = var4 >>> 8 ^ HuffmanEncoder.anIntArray634[255 & (var4 ^ var2[var6])];
      }

      var4 = ~var4;
      return var4;
    } catch (RuntimeException var7) {
      throw AbstractGameWorld.cascadeException(var7,
        "nf.A(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
    }
  }

}
