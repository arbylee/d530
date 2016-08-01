final class ISAACCipher {

  static GameString aClass94_965 = SpawnedGameObject.createString(":duelfriend:");
  static int anInt969;
  static GameString aClass94_973 = SpawnedGameObject.createString(" de votre liste noire)3");
  private int anInt966;
  private int anInt967;
  private int anInt968;
  private int[] anIntArray970;
  private int[] anIntArray971;
  private int anInt972;


  private ISAACCipher() {
  }

  ISAACCipher(int[] var1) {
    try {
      this.anIntArray970 = new int[256];
      this.anIntArray971 = new int[256];

      for (int var2 = 0; ~var2 > ~var1.length; ++var2) {
        this.anIntArray970[var2] = var1[var2];
      }

      this.method1227(true);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld
        .cascadeException(var3, "ij.<init>(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  static final void method1230(byte var0) {
    try {
      int var1 = AbstractIndexedColorSprite.anInt1462;
      int var2 = TextureSampler29.anInt3395;
      int var4 = SomethingQuickChat2.anInt3537;
      int var3 = SomethingWorldMapy.anInt3552;
      if (TextureSampler27.aClass3_Sub28_Sub16_3099 == null
        || null == DummyClass58.aClass3_Sub28_Sub16_1457) {
        if (Projectile.sprites.isLoaded(GameWorldSomething.anInt502) && Projectile.sprites
          .isLoaded(DummyClass54.anInt1400)) {
          TextureSampler27.aClass3_Sub28_Sub16_3099 = AbstractObjectNode
            .method562(Projectile.sprites, 0, GameWorldSomething.anInt502, (byte) 39);
          DummyClass58.aClass3_Sub28_Sub16_1457 =
            AbstractObjectNode.method562(Projectile.sprites, 0, DummyClass54.anInt1400, (byte) 39);
          if (GlRenderer.useOpenGlRenderer) {
            if (TextureSampler27.aClass3_Sub28_Sub16_3099 instanceof SoftwareDirectFullColorSprite) {
              TextureSampler27.aClass3_Sub28_Sub16_3099 = new GlDirectFullColorSprite(
                (SoftwareDirectColorSprite) TextureSampler27.aClass3_Sub28_Sub16_3099);
            } else {
              TextureSampler27.aClass3_Sub28_Sub16_3099 = new GlDirectColorSprite(
                (SoftwareDirectColorSprite) TextureSampler27.aClass3_Sub28_Sub16_3099);
            }

            if (DummyClass58.aClass3_Sub28_Sub16_1457 instanceof SoftwareDirectFullColorSprite) {
              DummyClass58.aClass3_Sub28_Sub16_1457 = new GlDirectFullColorSprite(
                (SoftwareDirectColorSprite) DummyClass58.aClass3_Sub28_Sub16_1457);
            } else {
              DummyClass58.aClass3_Sub28_Sub16_1457 = new GlDirectColorSprite(
                (SoftwareDirectColorSprite) DummyClass58.aClass3_Sub28_Sub16_1457);
            }
          }
        } else if (GlRenderer.useOpenGlRenderer) {
          GlUtils
            .fillQuad(var1, var2, var3, 20, WidgetUpdate.anInt3600, -FileTable.anInt963 + 256);
        } else {
          DummyClass47.method1312(var1, var2, var3, 20, WidgetUpdate.anInt3600,
            -FileTable.anInt963 + 256);
        }
      }

      int var5;
      int var6;
      if (TextureSampler27.aClass3_Sub28_Sub16_3099 != null
        && DummyClass58.aClass3_Sub28_Sub16_1457 != null) {
        var5 = var3 / TextureSampler27.aClass3_Sub28_Sub16_3099.anInt3707;

        for (var6 = 0; ~var5 < ~var6; ++var6) {
          TextureSampler27.aClass3_Sub28_Sub16_3099
            .method643(var6 * TextureSampler27.aClass3_Sub28_Sub16_3099.anInt3707 + var1, var2);
        }

        DummyClass58.aClass3_Sub28_Sub16_1457.method643(var1, var2);
        DummyClass58.aClass3_Sub28_Sub16_1457
          .method641(-DummyClass58.aClass3_Sub28_Sub16_1457.anInt3707 + (var1 - -var3), var2);
      }

      FloorOverlay.aClass3_Sub28_Sub17_2096
        .method681(SomethingTexture4.aClass94_2667, var1 - -3, 14 + var2,
          TextureSampler32.anInt3351, -1);
      if (GlRenderer.useOpenGlRenderer) {
        GlUtils.fillQuad(var1, 20 + var2, var3, var4 - 20, WidgetUpdate.anInt3600,
          -FileTable.anInt963 + 256);
      } else {
        DummyClass47.method1312(var1, 20 + var2, var3, -20 + var4, WidgetUpdate.anInt3600,
          -FileTable.anInt963 + 256);
      }

      var6 = HashTable.anInt1709;
      var5 = SomethingTilek.anInt1676;
      if (var0 < 85) {
        aClass94_965 = null;
      }

      int var7;
      int var8;
      for (var7 = 0; TextureSampler25.amountContextActions > var7; ++var7) {
        var8 = (-var7 + TextureSampler25.amountContextActions - 1) * 15 + var2 + 35;
        if (var1 < var5 && var5 < var1 - -var3 && ~var6 < ~(-13 + var8) && ~var6 > ~(var8 + 3)) {
          if (GlRenderer.useOpenGlRenderer) {
            GlUtils.fillQuad(var1, var8 + -13, var3, 16, Mouse.anInt1926,
              -SceneShadowMap.anInt1771 + 256);
          } else {
            DummyClass47.method1312(var1, var8 + -13, var3, 16, Mouse.anInt1926,
              -SceneShadowMap.anInt1771 + 256);
          }
        }
      }

      if ((DummyClass53.aClass3_Sub28_Sub16_1339 == null
        || VertexNormal.aClass3_Sub28_Sub16_824 == null
        || null == MonoChromaticImageBuffer.aClass3_Sub28_Sub16_2560) && Projectile.sprites
        .isLoaded(DummyClass39.anInt739) && Projectile.sprites.isLoaded(BitVariable.anInt1126)
        && Projectile.sprites.isLoaded(GroundItem.anInt2937)) {
        DummyClass53.aClass3_Sub28_Sub16_1339 =
          AbstractObjectNode.method562(Projectile.sprites, 0, DummyClass39.anInt739, (byte) 39);
        VertexNormal.aClass3_Sub28_Sub16_824 =
          AbstractObjectNode.method562(Projectile.sprites, 0, BitVariable.anInt1126, (byte) 39);
        MonoChromaticImageBuffer.aClass3_Sub28_Sub16_2560 =
          AbstractObjectNode.method562(Projectile.sprites, 0, GroundItem.anInt2937, (byte) 39);
        if (GlRenderer.useOpenGlRenderer) {
          if (!(DummyClass53.aClass3_Sub28_Sub16_1339 instanceof SoftwareDirectFullColorSprite)) {
            DummyClass53.aClass3_Sub28_Sub16_1339 = new GlDirectColorSprite(
              (SoftwareDirectColorSprite) DummyClass53.aClass3_Sub28_Sub16_1339);
          } else {
            DummyClass53.aClass3_Sub28_Sub16_1339 = new GlDirectFullColorSprite(
              (SoftwareDirectColorSprite) DummyClass53.aClass3_Sub28_Sub16_1339);
          }

          if (!(VertexNormal.aClass3_Sub28_Sub16_824 instanceof SoftwareDirectFullColorSprite)) {
            VertexNormal.aClass3_Sub28_Sub16_824 = new GlDirectColorSprite(
              (SoftwareDirectColorSprite) VertexNormal.aClass3_Sub28_Sub16_824);
          } else {
            VertexNormal.aClass3_Sub28_Sub16_824 = new GlDirectFullColorSprite(
              (SoftwareDirectColorSprite) VertexNormal.aClass3_Sub28_Sub16_824);
          }

          if (!(MonoChromaticImageBuffer.aClass3_Sub28_Sub16_2560 instanceof SoftwareDirectFullColorSprite)) {
            MonoChromaticImageBuffer.aClass3_Sub28_Sub16_2560 = new GlDirectColorSprite(
              (SoftwareDirectColorSprite) MonoChromaticImageBuffer.aClass3_Sub28_Sub16_2560);
          } else {
            MonoChromaticImageBuffer.aClass3_Sub28_Sub16_2560 = new GlDirectFullColorSprite(
              (SoftwareDirectColorSprite) MonoChromaticImageBuffer.aClass3_Sub28_Sub16_2560);
          }
        }
      }

      int var9;
      if (DummyClass53.aClass3_Sub28_Sub16_1339 != null
        && null != VertexNormal.aClass3_Sub28_Sub16_824
        && null != MonoChromaticImageBuffer.aClass3_Sub28_Sub16_2560) {
        var7 = var3 / DummyClass53.aClass3_Sub28_Sub16_1339.anInt3707;

        for (var8 = 0; var7 > var8; ++var8) {
          DummyClass53.aClass3_Sub28_Sub16_1339
            .method643(var1 + DummyClass53.aClass3_Sub28_Sub16_1339.anInt3707 * var8,
              var4 + var2 + -DummyClass53.aClass3_Sub28_Sub16_1339.anInt3696);
        }

        var8 = (-20 + var4) / VertexNormal.aClass3_Sub28_Sub16_824.anInt3696;

        for (var9 = 0; var9 < var8; ++var9) {
          VertexNormal.aClass3_Sub28_Sub16_824
            .method643(var1, var2 + 20 + var9 * VertexNormal.aClass3_Sub28_Sub16_824.anInt3696);
          VertexNormal.aClass3_Sub28_Sub16_824
            .method641(var1 - (-var3 - -VertexNormal.aClass3_Sub28_Sub16_824.anInt3707),
              var2 + 20 + var9 * VertexNormal.aClass3_Sub28_Sub16_824.anInt3696);
        }

        MonoChromaticImageBuffer.aClass3_Sub28_Sub16_2560
          .method643(var1, var4 + (var2 - MonoChromaticImageBuffer.aClass3_Sub28_Sub16_2560.anInt3696));
        MonoChromaticImageBuffer.aClass3_Sub28_Sub16_2560
          .method641(var1 + var3 - MonoChromaticImageBuffer.aClass3_Sub28_Sub16_2560.anInt3707,
            var2 - -var4 + -MonoChromaticImageBuffer.aClass3_Sub28_Sub16_2560.anInt3696);
      }

      for (var7 = 0; var7 < TextureSampler25.amountContextActions; ++var7) {
        var8 = 15 * (TextureSampler25.amountContextActions - 1 + -var7) + var2 + 35;
        var9 = TextureSampler32.anInt3351;
        if (var1 < var5 && var3 + var1 > var5 && ~(var8 - 13) > ~var6 && ~var6 > ~(var8 - -3)) {
          var9 = DummyClass14.anInt1957;
        }

        FloorOverlay.aClass3_Sub28_Sub17_2096
          .method681(Buffer.method802(var7, true), 3 + var1, var8, var9, 0);
      }

      LinearHashTable
        .method1282(AbstractIndexedColorSprite.anInt1462, (byte) 122, TextureSampler29.anInt3395,
          SomethingQuickChat2.anInt3537, SomethingWorldMapy.anInt3552);
    } catch (RuntimeException var10) {
      throw AbstractGameWorld.cascadeException(var10, "ij.F(" + var0 + ')');
    }
  }

  public static void method1231(int var0) {
    try {
      aClass94_973 = null;
      aClass94_965 = null;
      if (var0 <= 116) {
        method1230((byte) -73);
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ij.D(" + var0 + ')');
    }
  }

  static final int method1232(NPC var0, int var1) {
    try {
      if (var1 != -1) {
        return 103;
      } else {
        NpcConfiguration var2 = var0.config;
        if (null != var2.anIntArray1292) {
          var2 = var2.method1471((byte) -108);
          if (var2 == null) {
            return -1;
          }
        }

        int var3 = var2.anInt1293;
        RenderAnimation var4 = var0.getRenderAnimationId(false);
        if (~var4.anInt368 == ~var0.anInt2764) {
          var3 = var2.anInt1262;
        } else if (~var0.anInt2764 != ~var4.anInt393 && var4.anInt386 != var0.anInt2764
          && var0.anInt2764 != var4.anInt375 && var0.anInt2764 != var4.anInt373) {
          if (~var4.anInt398 == ~var0.anInt2764 || var0.anInt2764 == var4.anInt372
            || ~var0.anInt2764 == ~var4.anInt379 || ~var0.anInt2764 == ~var4.anInt406) {
            var3 = var2.anInt1290;
          }
        } else {
          var3 = var2.anInt1276;
        }

        return var3;
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld
        .cascadeException(var5, "ij.B(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

  private final void method1227(boolean var1) {
    try {
      if (!var1) {
        this.method1229(82);
      }

      int var10 = -1640531527;
      int var9 = -1640531527;
      int var8 = -1640531527;
      int var7 = -1640531527;
      int var6 = -1640531527;
      int var5 = -1640531527;
      int var4 = -1640531527;
      int var3 = -1640531527;

      int var2;
      for (var2 = 0; 4 > var2; ++var2) {
        var3 ^= var4 << 11;
        var6 += var3;
        var4 += var5;
        var4 ^= var5 >>> 2;
        var5 += var6;
        var5 ^= var6 << 8;
        var8 += var5;
        var7 += var4;
        var6 += var7;
        var6 ^= var7 >>> 16;
        var7 += var8;
        var9 += var6;
        var7 ^= var8 << 10;
        var10 += var7;
        var8 += var9;
        var8 ^= var9 >>> 4;
        var9 += var10;
        var9 ^= var10 << 8;
        var4 += var9;
        var3 += var8;
        var10 += var3;
        var10 ^= var3 >>> 9;
        var5 += var10;
        var3 += var4;
      }

      for (var2 = 0; ~var2 > -257; var2 += 8) {
        var6 += this.anIntArray970[3 + var2];
        var7 += this.anIntArray970[var2 - -4];
        var9 += this.anIntArray970[var2 + 6];
        var3 += this.anIntArray970[var2];
        var5 += this.anIntArray970[2 + var2];
        var8 += this.anIntArray970[var2 - -5];
        var10 += this.anIntArray970[7 + var2];
        var4 += this.anIntArray970[var2 - -1];
        var3 ^= var4 << 11;
        var4 += var5;
        var4 ^= var5 >>> 2;
        var6 += var3;
        var5 += var6;
        var5 ^= var6 << 8;
        var7 += var4;
        var6 += var7;
        var6 ^= var7 >>> 16;
        var8 += var5;
        var7 += var8;
        var7 ^= var8 << 10;
        var10 += var7;
        var9 += var6;
        var8 += var9;
        var8 ^= var9 >>> 4;
        var9 += var10;
        var9 ^= var10 << 8;
        var3 += var8;
        var10 += var3;
        var4 += var9;
        var10 ^= var3 >>> 9;
        var3 += var4;
        this.anIntArray971[var2] = var3;
        this.anIntArray971[1 + var2] = var4;
        var5 += var10;
        this.anIntArray971[2 + var2] = var5;
        this.anIntArray971[var2 + 3] = var6;
        this.anIntArray971[4 + var2] = var7;
        this.anIntArray971[5 + var2] = var8;
        this.anIntArray971[var2 - -6] = var9;
        this.anIntArray971[7 + var2] = var10;
      }

      for (var2 = 0; -257 < ~var2; var2 += 8) {
        var9 += this.anIntArray971[6 + var2];
        var8 += this.anIntArray971[var2 + 5];
        var7 += this.anIntArray971[4 + var2];
        var4 += this.anIntArray971[var2 + 1];
        var5 += this.anIntArray971[2 + var2];
        var3 += this.anIntArray971[var2];
        var3 ^= var4 << 11;
        var6 += this.anIntArray971[var2 + 3];
        var10 += this.anIntArray971[var2 + 7];
        var6 += var3;
        var4 += var5;
        var4 ^= var5 >>> 2;
        var5 += var6;
        var7 += var4;
        var5 ^= var6 << 8;
        var8 += var5;
        var6 += var7;
        var6 ^= var7 >>> 16;
        var7 += var8;
        var7 ^= var8 << 10;
        var9 += var6;
        var8 += var9;
        var8 ^= var9 >>> 4;
        var10 += var7;
        var9 += var10;
        var3 += var8;
        var9 ^= var10 << 8;
        var4 += var9;
        var10 += var3;
        var10 ^= var3 >>> 9;
        var5 += var10;
        var3 += var4;
        this.anIntArray971[var2] = var3;
        this.anIntArray971[1 + var2] = var4;
        this.anIntArray971[var2 - -2] = var5;
        this.anIntArray971[3 + var2] = var6;
        this.anIntArray971[4 + var2] = var7;
        this.anIntArray971[5 + var2] = var8;
        this.anIntArray971[var2 + 6] = var9;
        this.anIntArray971[var2 - -7] = var10;
      }

      this.method1229(-1879);
      this.anInt968 = 256;
    } catch (RuntimeException var11) {
      throw AbstractGameWorld.cascadeException(var11, "ij.E(" + var1 + ')');
    }
  }

  final int getNextValue(int var1) {
    try {
      if (this.anInt968-- == 0) {
        this.method1229(-1879);
        this.anInt968 = 255;
      }

      if (var1 != -9356) {
        this.getNextValue(-128);
      }

      return this.anIntArray970[this.anInt968];
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "ij.C(" + var1 + ')');
    }
  }

  private final void method1229(int var1) {
    try {
      this.anInt967 += ++this.anInt966;
      int var2 = 0;
      if (var1 != -1879) {
        this.anInt968 = -98;
      }

      while (-257 < ~var2) {
        int var3 = this.anIntArray971[var2];
        if ((2 & var2) != 0) {
          if (~(var2 & 1) != -1) {
            this.anInt972 ^= this.anInt972 >>> 16;
          } else {
            this.anInt972 ^= this.anInt972 << 2;
          }
        } else if ((var2 & 1) != 0) {
          this.anInt972 ^= this.anInt972 >>> 6;
        } else {
          this.anInt972 ^= this.anInt972 << 13;
        }

        this.anInt972 += this.anIntArray971[128 + var2 & 255];
        int var4;
        this.anIntArray971[var2] = var4 =
          this.anInt967 + this.anInt972 + this.anIntArray971[ClientScript.bitAnd(var3, 1020) >> 2];
        this.anIntArray970[var2] =
          this.anInt967 = var3 + this.anIntArray971[ClientScript.bitAnd(261347, var4) >> 8 >> 2];
        ++var2;
      }

    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5, "ij.A(" + var1 + ')');
    }
  }

}
