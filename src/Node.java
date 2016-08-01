class Node {

  static int anInt72 = 0;
  static boolean[] aBooleanArray73 = new boolean[200];
  static GameString[] aClass94Array75 = new GameString[1000];
  static GameString aClass94_77 = SpawnedGameObject.createString("Objet d(Wabonn-Bs");
  static Deque aClass61_78 = new Deque();
  long key;
  Node nextNode;
  Node prevNode;

  public static void method83(byte var0) {
    try {
      aClass94_77 = null;
      aClass94Array75 = null;
      if (var0 != 30) {
        method84(null, 89);
      }

      aClass61_78 = null;
      aBooleanArray73 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ab.H(" + var0 + ')');
    }
  }

  static final void method84(GameString var0, int var1) {
    try {
      if (var1 != -801) {
        aClass94_77 = null;
      }

      int var2 = FloorUnderlay.method1602(0, var0);
      if (~var2 != 0) {
        AbstractObjectNode.method565((byte) 86, DummyClass25.aClass131_1624.aShortArray1727[var2],
          DummyClass25.aClass131_1624.aShortArray1718[var2]);
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld
        .cascadeException(var3, "ab.N(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

  static final void method85(byte var0) {
    try {
      int var1 = -122 % ((var0 - -63) / 48);
      SceneShadowMap.aClass93_1772.method1523((byte) -99);
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ab.G(" + var0 + ')');
    }
  }

  static final void setupLanguagePacket(int var1) {
    try {
      if (var1 != 0) {
        if (var1 != 1) {
          if (var1 != 2) {
            throw new RuntimeException("Invalid language ID.");
          }
          BZipDecompressorState.method850((byte) 121);
        } else {
          Structure.method607(false);
        }

      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "ab.K(" + var1 + ')');
    }
  }

  static final DisplayMode[] method88(byte var0) {
    try {
      if (var0 != 28) {
        aBooleanArray73 = null;
      }

      if (DummyClass42.aClass106Array890 == null) {
        DisplayMode[] var1 = OndemandFileRequest.method596(var0 ^ 22, DummyClass35.signLink);
        DisplayMode[] var2 = new DisplayMode[var1.length];
        int var3 = 0;

        label58:
        for (int var4 = 0; var4 < var1.length; ++var4) {
          DisplayMode var5 = var1[var4];
          if ((0 >= var5.anInt1450 || var5.anInt1450 >= 24) && ~var5.anInt1447 <= -801
            && 600 <= var5.anInt1449) {
            for (int var6 = 0; var3 > var6; ++var6) {
              DisplayMode var7 = var2[var6];
              if (var5.anInt1447 == var7.anInt1447 && ~var7.anInt1449 == ~var5.anInt1449) {
                if (~var5.anInt1450 < ~var7.anInt1450) {
                  var2[var6] = var5;
                }
                continue label58;
              }
            }

            var2[var3] = var5;
            ++var3;
          }
        }

        DummyClass42.aClass106Array890 = new DisplayMode[var3];
        ArrayUtils.copy(var2, 0, DummyClass42.aClass106Array890, 0, var3);
        int[] var9 = new int[DummyClass42.aClass106Array890.length];

        for (int var10 = 0; DummyClass42.aClass106Array890.length > var10; ++var10) {
          DisplayMode var11 = DummyClass42.aClass106Array890[var10];
          var9[var10] = var11.anInt1449 * var11.anInt1447;
        }

        DummyClass58.method1658(21, var9, DummyClass42.aClass106Array890);
      }

      return DummyClass42.aClass106Array890;
    } catch (RuntimeException var8) {
      throw AbstractGameWorld.cascadeException(var8, "ab.M(" + var0 + ')');
    }
  }

  static final void method89(boolean var0, FileUnpacker var1, FileUnpacker var2, FileUnpacker var3,
                             FileUnpacker var4) {
    try {
      SomethingSceneJ.aClass153_323 = var2;
      TriChromaticImageCache.aClass153_1378 = var1;
      TextureSampler3.aClass153_3361 = var3;
      DummyClass25.aClass153_1628 = var4;
      if (!var0) {
        setupLanguagePacket(11);
      }

      SceneNode.aClass11ArrayArray1834 = new Widget[TextureSampler3.aClass153_3361.method2121(0)][];
      HashTable.aBooleanArray1703 = new boolean[TextureSampler3.aClass153_3361.method2121(0)];
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "ab.J(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ?
          "{...}" :
          "null") + ',' + (var3 != null ? "{...}" : "null") + ',' + (var4 != null ?
          "{...}" :
          "null") + ')');
    }
  }

  final boolean method82(int var1) {
    try {
      return var1 != 0 ? false : null != this.prevNode;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "ab.I(" + var1 + ')');
    }
  }

  final void unlinkNode() {
    try {
      if (null != this.prevNode) {
        this.prevNode.nextNode = this.nextNode;
        this.nextNode.prevNode = this.prevNode;
        this.prevNode = null;
        this.nextNode = null;
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "ab.L()");
    }
  }

}
