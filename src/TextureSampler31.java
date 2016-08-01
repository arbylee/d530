import java.math.BigInteger;

final class TextureSampler31 extends AbstractTextureSampler {

  static int anInt3158 = -8 + (int) (17.0D * Math.random());
  static FileCacheRequester fileCacheRequester;
  static GameString UNDERSCORE = SpawnedGameObject.createString("_");
  static BigInteger PUBLIC_EXPONENT = new BigInteger("65537");
  static boolean aBoolean3166 = false;
  static GameString aClass94_3168 = SpawnedGameObject.createString("cross");
  static GameString aClass94_3169 = SpawnedGameObject.createString("Lade Sprites )2 ");
  static int[] anIntArray3171 = new int[] {0, 4, 4, 8, 0, 0, 8, 0, 0};
  static GameString aClass94_3172 = SpawnedGameObject.createString("Regarder dans cette direction");
  static FileUnpacker aClass153_3173;
  private static GameString aClass94_3170 = SpawnedGameObject.createString("Loaded textures");
  static GameString aClass94_3167 = aClass94_3170;
  private int anInt3160 = 0;
  private int anInt3163 = 20;
  private int anInt3164 = 1365;
  private int anInt3165 = 0;

  public TextureSampler31() {
    super(0, true);
  }

  static final void method236(byte var0) {
    try {
      if (var0 == 64) {
        TextureSampler14.aBoolean3387 = true;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "gm.C(" + var0 + ')');
    }
  }

  static final void parseNpcUpdate() {
    try {
      OndemandRequester.anInt997 = 0;
      DummyClass17.anInt1829 = 0;
      IdentityKit.method945((byte) -11);
      DummyClass10.method2261(113);
      SomethingTexture4.method1349();

      int var1;
      for (var1 = 0; ~var1 > ~DummyClass17.anInt1829; ++var1) {
        int var2 = VariableUpdate.anIntArray2292[var1];
        if (~TextureSampler5.npcs[var2].anInt2838 != ~AbstractGameWorld.updateCycle) {
          if (TextureSampler5.npcs[var2].config.method1474(-1)) {
            ByteArrayNode.method574(TextureSampler5.npcs[var2], false);
          }

          TextureSampler5.npcs[var2].setConfiguration(-1, null);
          TextureSampler5.npcs[var2] = null;
        }
      }
      if (HashTable.packetLength == SpotAnimationConfig.gameBuffer.position) {
        for (var1 = 0; var1 < DummyClass6.anInt2046; ++var1) {
          if (null == TextureSampler5.npcs[AudioWorker.anIntArray347[var1]]) {
            throw new RuntimeException("gnp2 pos:" + var1 + " size:" + DummyClass6.anInt2046);
          }
        }

      } else {
        throw new RuntimeException("gnp1 pos:" + SpotAnimationConfig.gameBuffer.position + " psize:"
          + HashTable.packetLength);
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "gm.B()");
    }
  }

  public static void method238(int var0) {
    try {
      if (var0 == 9423) {
        PUBLIC_EXPONENT = null;
        aClass94_3169 = null;
        anIntArray3171 = null;
        fileCacheRequester = null;
        aClass153_3173 = null;
        aClass94_3168 = null;
        aClass94_3167 = null;
        UNDERSCORE = null;
        aClass94_3170 = null;
        aClass94_3172 = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "gm.E(" + var0 + ')');
    }
  }

  final void parseConfig(int var1, Buffer var2, boolean var3) {
    try {
      if (!var3) {
        aClass94_3168 = null;
      }

      if (-1 != ~var1) {
        if (-2 != ~var1) {
          if (~var1 != -3) {
            if (var1 == 3) {
              this.anInt3165 = var2.readUnsignedShort();
            }
          } else {
            this.anInt3160 = var2.readUnsignedShort();
          }
        } else {
          this.anInt3163 = var2.readUnsignedShort();
        }
      } else {
        this.anInt3164 = var2.readUnsignedShort();
      }

    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "gm.A(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
    }
  }

  final int[] method154(int var1, byte var2) {
    try {
      int var4 = -72 % ((30 - var2) / 36);
      int[] var3 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        for (int var5 = 0; ~SomethingLight0.anInt1559 < ~var5; ++var5) {
          int var7 = this.anInt3165 + (DummyClass4.anIntArray2999[var1] << 12) / this.anInt3164;
          int var6 = this.anInt3160 + (TextureCache.anIntArray2125[var5] << 12) / this.anInt3164;
          int var8 = var6;
          int var10 = var6;
          int var9 = var7;
          int var11 = var7;
          int var14 = 0;
          int var12 = var6 * var6 >> 12;

          for (int var13 = var7 * var7 >> 12;
               ~(var12 - -var13) > -16385 && ~this.anInt3163 < ~var14;
               var12 = var10 * var10 >> 12) {
            var11 = (var10 * var11 >> 12) * 2 + var9;
            ++var14;
            var10 = var12 + -var13 + var8;
            var13 = var11 * var11 >> 12;
          }

          var3[var5] = ~var14 <= ~(this.anInt3163 + -1) ? 0 : (var14 << 12) / this.anInt3163;
        }
      }

      return var3;
    } catch (RuntimeException var15) {
      throw AbstractGameWorld.cascadeException(var15, "gm.D(" + var1 + ',' + var2 + ')');
    }
  }

}
