final class TextureSampler5 extends AbstractTextureSampler {

  static int[] anIntArray3290;
  static GameString aClass94_3291 = SpawnedGameObject.createString("Schlie-8en");
  static NPC[] npcs = new NPC['\u8000'];
  static int anInt3293 = 0;
  static GameString aClass94_3295;
  static long aLong3296 = 0L;
  static GameString aClass94_3298 = SpawnedGameObject.createString("<col=ff0000>");
  private int anInt3294 = 1;
  private int anInt3297 = 1;


  public TextureSampler5() {
    super(1, false);
  }

  public static void method288(byte var0) {
    try {
      if (var0 < 31) {
        method289(false);
      }

      anIntArray3290 = null;
      aClass94_3298 = null;
      aClass94_3291 = null;
      npcs = null;
      aClass94_3295 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "nm.C(" + var0 + ')');
    }
  }

  static final void method289(boolean var0) {
    try {
      if (var0) {
        aClass94_3295 = null;
      }

      if (DummyClass13.anInt2023 > 0) {
        DummyClass10.destroyGame((byte) 46);
      } else {
        DummyClass8.aClass89_4012 = SomethingVolume15.gameSocket;
        SomethingVolume15.gameSocket = null;
        DummyClass26.setState(40, 5);
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "nm.B(" + var0 + ')');
    }
  }

  final int[] method154(int var1, byte var2) {
    try {
      int var3 = 74 % ((30 - var2) / 36);
      int[] var4 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        int var5 = 1 + this.anInt3297 + this.anInt3297;
        int var6 = 65536 / var5;
        int var7 = 1 + this.anInt3294 + this.anInt3294;
        int var8 = 65536 / var7;
        int[][] var9 = new int[var5][];

        int var10;
        for (var10 = -this.anInt3297 + var1; ~var10 >= ~(var1 - -this.anInt3297); ++var10) {
          int[] var11 = this.method152(0, var10 & TriChromaticImageBuffer.anInt2487, 32755);
          int[] var12 = new int[SomethingLight0.anInt1559];
          int var13 = 0;

          int var14;
          for (var14 = -this.anInt3294; ~this.anInt3294 <= ~var14; ++var14) {
            var13 += var11[var14 & RenderAnimation.anInt396];
          }

          for (
            var14 = 0;
            ~SomethingLight0.anInt1559 < ~var14;
            var13 += var11[RenderAnimation.anInt396 & this.anInt3294 + var14]) {
            var12[var14] = var8 * var13 >> 16;
            var13 -= var11[RenderAnimation.anInt396 & var14 - this.anInt3294];
            ++var14;
          }

          var9[this.anInt3297 + var10 + -var1] = var12;
        }

        for (var10 = 0; ~SomethingLight0.anInt1559 < ~var10; ++var10) {
          int var16 = 0;

          for (int var17 = 0; ~var17 > ~var5; ++var17) {
            var16 += var9[var17][var10];
          }

          var4[var10] = var6 * var16 >> 16;
        }
      }

      return var4;
    } catch (RuntimeException var15) {
      throw AbstractGameWorld.cascadeException(var15, "nm.D(" + var1 + ',' + var2 + ')');
    }
  }

  final int[][] method166(int var1, int var2) {
    try {
      if (var1 != -1) {
        aClass94_3298 = null;
      }

      int[][] var3 = this.triChromaticImageCache.method1594((byte) 90, var2);
      if (this.triChromaticImageCache.aBoolean1379) {
        int var6 = this.anInt3294 - -this.anInt3294 - -1;
        int var7 = 65536 / var6;
        int var4 = this.anInt3297 + (this.anInt3297 - -1);
        int var5 = 65536 / var4;
        int[][][] var8 = new int[var4][][];

        int var12;
        int var13;
        int var14;
        for (int var9 = var2 - this.anInt3297; this.anInt3297 + var2 >= var9; ++var9) {
          int[][] var10 = this.method162(TriChromaticImageBuffer.anInt2487 & var9, 0, (byte) -59);
          var12 = 0;
          var13 = 0;
          int[][] var11 = new int[3][SomethingLight0.anInt1559];
          var14 = 0;
          int[] var15 = var10[0];
          int[] var16 = var10[1];
          int[] var17 = var10[2];

          for (int var18 = -this.anInt3294; var18 <= this.anInt3294; ++var18) {
            int var19 = var18 & RenderAnimation.anInt396;
            var13 += var16[var19];
            var12 += var15[var19];
            var14 += var17[var19];
          }

          int[] var20 = var11[2];
          int[] var31 = var11[0];
          int[] var30 = var11[1];

          int var22;
          for (int var21 = 0; SomethingLight0.anInt1559 > var21; var12 += var15[var22]) {
            var31[var21] = var12 * var7 >> 16;
            var30[var21] = var13 * var7 >> 16;
            var20[var21] = var7 * var14 >> 16;
            var22 = RenderAnimation.anInt396 & var21 + -this.anInt3294;
            var14 -= var17[var22];
            ++var21;
            var12 -= var15[var22];
            var13 -= var16[var22];
            var22 = this.anInt3294 + var21 & RenderAnimation.anInt396;
            var14 += var17[var22];
            var13 += var16[var22];
          }

          var8[-var2 + this.anInt3297 + var9] = var11;
        }

        int[] var24 = var3[0];
        int[] var26 = var3[1];
        int[] var25 = var3[2];

        for (var12 = 0; ~SomethingLight0.anInt1559 < ~var12; ++var12) {
          var14 = 0;
          var13 = 0;
          int var27 = 0;

          for (int var28 = 0; ~var4 < ~var28; ++var28) {
            int[][] var29 = var8[var28];
            var27 += var29[2][var12];
            var14 += var29[1][var12];
            var13 += var29[0][var12];
          }

          var24[var12] = var5 * var13 >> 16;
          var26[var12] = var5 * var14 >> 16;
          var25[var12] = var27 * var5 >> 16;
        }
      }

      return var3;
    } catch (RuntimeException var23) {
      throw AbstractGameWorld.cascadeException(var23, "nm.T(" + var1 + ',' + var2 + ')');
    }
  }

  final void parseConfig(int var1, Buffer var2, boolean var3) {
    try {
      if (~var1 == -1) {
        this.anInt3294 = var2.readUnsignedByte();
      } else if (var1 != 1) {
        if (2 == var1) {
          this.monoChromatic = var2.readUnsignedByte() == 1;
        }
      } else {
        this.anInt3297 = var2.readUnsignedByte();
      }

      if (!var3) {
        this.anInt3294 = 60;
      }

    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "nm.A(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
    }
  }

}
