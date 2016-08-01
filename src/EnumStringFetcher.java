final class EnumStringFetcher implements Interface4 {

  static FileUnpacker animationFrames;
  static int anInt2161 = -1;
  static int anInt2162;
  static GameString aClass94_2163 = SpawnedGameObject.createString("Gegenstand f-Ur Mitglieder");
  static GameString aClass94_2164 = SpawnedGameObject.createString("hint_mapedge");
  static int anInt2165;
  static int lastPacketId1 = 0;
  static short[] aShortArray2167 = new short[] {
    (short) 30, (short) 6, (short) 31, (short) 29, (short) 10, (short) 44, (short) 37, (short) 57
  };
  static GameString aClass94_2168 = SpawnedGameObject.createString("<br>");


  static final void printError(int var0, String var1) {
    System.out
      .println("Error: " + WidgetUpdate.createIndexedColorSprite("%0a", "\n", 105, var1));
    if (var0 < 33) {
      aClass94_2163 = null;
    }

  }

  static final Widget getWidget(byte var0, int var1) {
    try {
      int var2 = var1 >> 16;
      if (var0 < 108) {
        getWidget((byte) 87, 19);
      }

      int var3 = '\uffff' & var1;
      if (SceneNode.aClass11ArrayArray1834[var2] == null
        || null == SceneNode.aClass11ArrayArray1834[var2][var3]) {
        boolean var4 = ComponentCanvas.method57(var2, 104);
        if (!var4) {
          return null;
        }
      }

      return SceneNode.aClass11ArrayArray1834[var2][var3];
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5, "af.F(" + var0 + ',' + var1 + ')');
    }
  }

  public static void method833(byte var0) {
    try {
      aShortArray2167 = null;
      animationFrames = null;
      aClass94_2164 = null;
      aClass94_2168 = null;
      int var1 = 124 / ((var0 - 28) / 41);
      aClass94_2163 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "af.E(" + var0 + ')');
    }
  }

  static final void method834(byte var0) {
    try {
      OndemandRequester.method1250(43, false);
      System.gc();
      DummyClass26.setState(25, 5);
      if (var0 >= -80) {
        lastPacketId1 = -89;
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "af.D(" + var0 + ')');
    }
  }

  static final boolean method835(int var0, int var1, int var2, int var3, int var4, int var5,
                                 SceneNode var6, int var7, long var8) {
    if (var6 == null) {
      return true;
    } else {
      int var10 = var1 * 128 + 64 * var4;
      int var11 = var2 * 128 + 64 * var5;
      return DummyClass42
        .addNodeToSceneGraph(var0, var1, var2, var4, var5, var10, var11, var3, var6, var7, false,
          var8);
    }
  }

  public final GameString method20(int var1, int[] enums, int var3, long key) {
    try {
      if (var1 != 0) {
        if (var1 != 1 && ~var1 != -11) {
          return var1 != 6 && var1 != 7 && 11 != var1 ?
            (var3 != 4936 ? (GameString) null : null) :
            TextureSampler36.getEnum(enums[0], true).getString((int) key, (byte) -69);
        } else {
          ItemConfig var8 = DummyClass35.getItemConfig((int) key, (byte) 82);
          return var8.aClass94_770;
        }
      } else {
        ClientScriptEnum var6 = TextureSampler36.getEnum(enums[0], true);
        return var6.getString((int) key, (byte) 120);
      }
    } catch (RuntimeException var7) {
      throw AbstractGameWorld.cascadeException(var7,
        "af.A(" + var1 + ',' + (enums != null ? "{...}" : "null") + ',' + var3 + ',' + key + ')');
    }
  }

}
