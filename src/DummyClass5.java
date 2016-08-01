import java.io.IOException;

class DummyClass5 extends DummyClass6 {

  private static GameString aClass94_2988 = SpawnedGameObject.createString("glow3:");
  static ObjectCache aClass93_2984 = new ObjectCache(2);
  static int[] anIntArray2985 = new int[2500];
  static long[] drawMemory = new long[32];
  static byte[][] aByteArrayArray2987;
  static int anInt2989 = 0;
  static Deque aClass61_2990 = new Deque();
  static int anInt2993 = 0;
  static int anInt2994;
  static GameString aClass94_2995 =
    SpawnedGameObject.createString("Veuillez commencer par supprimer ");
  static GameString aClass94_2991 = aClass94_2988;
  static GameString aClass94_2992 = aClass94_2988;

  static final void method2210(byte var0, boolean var1) {
    try {
      DummyClass43.method1194(-16385);
      if (30 == DummyClass15.state || ~DummyClass15.state == -26) {
        ++TextureSampler18.anInt4032;
        if (~TextureSampler18.anInt4032 <= -51 || var1) {
          TextureSampler18.anInt4032 = 0;
          if (var0 == -90) {
            if (!GlTexture2d.aBoolean3769 && SomethingVolume15.gameSocket != null) {
              TextureSampler12.secureBuffer.writePacket(93);

              try {
                SomethingVolume15.gameSocket.write(TextureSampler12.secureBuffer.bytes, 0,
                  TextureSampler12.secureBuffer.position);
                TextureSampler12.secureBuffer.position = 0;
              } catch (IOException var3) {
                GlTexture2d.aBoolean3769 = true;
              }

              ++SomethingQuickChat.anInt3569;
            }

            DummyClass43.method1194(var0 ^ 16473);
          }
        }
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "ah.B(" + var0 + ',' + var1 + ')');
    }
  }

  static final void method2211(int var0) {
    try {
      if (var0 == -48) {
        if (null == MouseRecorder.aClass11_1017) {
          if (null == DummyClass42.aClass11_886) {
            int var1 = Structure.anInt3644;
            int var3;
            int var4;
            if (!DummyClass36.aBoolean2615) {
              if (~var1 == -2 && 0 < TextureSampler25.amountContextActions) {
                short var2 =
                  TextureSampler27.aShortArray3095[-1 + TextureSampler25.amountContextActions];
                if (-26 == ~var2 || var2 == 23 || 48 == var2 || ~var2 == -8 || 13 == var2
                  || ~var2 == -48 || -6 == ~var2 || var2 == 43 || -36 == ~var2 || ~var2 == -59
                  || ~var2 == -23 || var2 == 1006) {
                  var3 = DummyClass26.anIntArray1613[-1 + TextureSampler25.amountContextActions];
                  var4 = DummyClass32.anIntArray512[TextureSampler25.amountContextActions + -1];
                  Widget var5 = EnumStringFetcher.getWidget((byte) 113, var4);
                  WidgetAccess var6 = GameClient.method44(var5);
                  if (var6.method100((byte) -9) || var6.method93(572878952)) {
                    DummyClass59.anInt677 = 0;
                    SomethingScene.aBoolean1074 = false;
                    if (MouseRecorder.aClass11_1017 != null) {
                      DummyClass29.method909(-67, MouseRecorder.aClass11_1017);
                    }

                    MouseRecorder.aClass11_1017 = EnumStringFetcher.getWidget((byte) 119, var4);
                    MilliFrameRegulator.anInt2693 = anInt2993;
                    DummyInputStream.anInt40 = DummyClass36.anInt2614;
                    DummyClass18.anInt86 = var3;
                    DummyClass29.method909(var0 + 166, MouseRecorder.aClass11_1017);
                    return;
                  }
                }
              }

              if (-2 == ~var1 && (
                -2 == ~OndemandRequester.anInt998 && 2 < TextureSampler25.amountContextActions
                  || TextureSampler8.method353(TextureSampler25.amountContextActions + -1, 0))) {
                var1 = 2;
              }

              if (~var1 == -3 && -1 > ~TextureSampler25.amountContextActions
                || -2 == ~ClientScriptEnum.anInt3660) {
                DummyClass22.method1801((byte) -105);
              }

              if (1 == var1 && TextureSampler25.amountContextActions > 0
                || -3 == ~ClientScriptEnum.anInt3660) {
                TextureSampler9.method203(100);
              }
            } else {
              int var11;
              if (-2 != ~var1) {
                var3 = HashTable.anInt1709;
                var11 = SomethingTilek.anInt1676;
                if (~var11 > ~(AbstractIndexedColorSprite.anInt1462 - 10) || ~var11 < ~(
                  SomethingWorldMapy.anInt3552 + (AbstractIndexedColorSprite.anInt1462 - -10))
                  || ~(-10 + TextureSampler29.anInt3395) < ~var3 || ~var3 < ~(
                  SomethingQuickChat2.anInt3537 + (TextureSampler29.anInt3395 - -10))) {
                  DummyClass36.aBoolean2615 = false;
                  AbstractSomethingTexture.method1340(AbstractIndexedColorSprite.anInt1462,
                    SomethingWorldMapy.anInt3552, (byte) -40, TextureSampler29.anInt3395,
                    SomethingQuickChat2.anInt3537);
                }
              }

              if (-2 == ~var1) {
                var11 = AbstractIndexedColorSprite.anInt1462;
                var3 = TextureSampler29.anInt3395;
                var4 = SomethingWorldMapy.anInt3552;
                int var12 = anInt2993;
                int var13 = DummyClass36.anInt2614;
                int var7 = -1;

                for (int var8 = 0; var8 < TextureSampler25.amountContextActions; ++var8) {
                  int var9;
                  if (FileUnpacker.aBoolean1951) {
                    var9 = 15 * (TextureSampler25.amountContextActions + -1 + -var8) + 35 + var3;
                  } else {
                    var9 = 15 * (-var8 + (TextureSampler25.amountContextActions - 1)) + var3 + 31;
                  }

                  if (~var12 < ~var11 && ~(var11 - -var4) < ~var12 && var9 + -13 < var13
                    && ~(3 + var9) < ~var13) {
                    var7 = var8;
                  }
                }

                if (~var7 != 0) {
                  GameBuffer.method806(2597, var7);
                }

                DummyClass36.aBoolean2615 = false;
                AbstractSomethingTexture.method1340(AbstractIndexedColorSprite.anInt1462,
                  SomethingWorldMapy.anInt3552, (byte) -40, TextureSampler29.anInt3395,
                  SomethingQuickChat2.anInt3537);
              }
            }

          }
        }
      }
    } catch (RuntimeException var10) {
      throw AbstractGameWorld.cascadeException(var10, "ah.A(" + var0 + ')');
    }
  }

  public static void method2212(boolean var0) {
    try {
      anIntArray2985 = null;
      aClass94_2988 = null;
      aClass93_2984 = null;
      aClass61_2990 = null;
      drawMemory = null;
      if (var0) {
        method2211(68);
      }

      aClass94_2992 = null;
      aByteArrayArray2987 = null;
      aClass94_2995 = null;
      aClass94_2991 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ah.C(" + var0 + ')');
    }
  }

}
