final class FileSystem {

  static int anInt101;
  static int anInt104 = 0;
  static FileUnpacker aClass153_105;
  static GameString aClass94_106 = SpawnedGameObject.createString("showVideoAd");
  private Buffer updateTableBuffer;
  private OndemandFileRequest updateTableRequest;
  private OndemandRequester ondemandRequester;
  private FileCacheRequester fileCacheRequester;
  private FileRequester[] fileRequesters;

  FileSystem(OndemandRequester var1, FileCacheRequester var2) {
    try {
      this.fileCacheRequester = var2;
      this.ondemandRequester = var1;
      if (!this.ondemandRequester.method1251((byte) 111)) {
        this.updateTableRequest = this.ondemandRequester.request(110, 255, (byte) 0, 255, true);
      }

    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "al.<init>(" + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null")
          + ')');
    }
  }

  final boolean isUpdateTableReceived() {
    try {
      if (null == this.updateTableBuffer) {

        if (this.updateTableRequest == null) {
          if (this.ondemandRequester.method1251((byte) 89)) {
            return false;
          }

          this.updateTableRequest = this.ondemandRequester.request(123, 255, (byte) 0, 255, true);
        }

        if (this.updateTableRequest.aBoolean3632) {
          return false;
        } else {
          this.updateTableBuffer = new Buffer(this.updateTableRequest.method587(false));
          this.fileRequesters = new FileRequester[(this.updateTableBuffer.bytes.length + -5) / 8];
          return true;
        }
      } else {
        return true;
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "al.J()");
    }
  }

  final void method838(byte var1) {
    try {
      if (null != this.fileRequesters) {
        int var2;
        for (var2 = 0; ~this.fileRequesters.length < ~var2; ++var2) {
          if (this.fileRequesters[var2] != null) {
            this.fileRequesters[var2].method2110(0);
          }
        }

        for (var2 = 0; this.fileRequesters.length > var2; ++var2) {
          if (this.fileRequesters[var2] != null) {
            this.fileRequesters[var2].method2107(true);
          }
        }

        if (var1 >= -56) {
          this.updateTableRequest = null;
        }

      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "al.E(" + var1 + ')');
    }
  }

  private final FileRequester method839(int var1, int var2, FileCache var3, FileCache var4) {
    try {
      if (var1 != -1824885439) {
        createUnpacker(true, false, false, -22, true);
      }

      return this.method847(var4, -125, var2, true, var3);
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "al.L(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + (
          var4 != null ? "{...}" : "null") + ')');
    }
  }

  private final FileRequester method847(FileCache var1, int var2, int var3, boolean var4,
                                        FileCache var5) {
    try {
      if (null != this.updateTableBuffer) {
        this.updateTableBuffer.position = 5 + var3 * 8;
        if (var2 >= -1) {
          return null;
        } else if (this.updateTableBuffer.bytes.length > this.updateTableBuffer.position) {
          if (null == this.fileRequesters[var3]) {
            int var6 = this.updateTableBuffer.readInt();
            int var7 = this.updateTableBuffer.readInt();
            FileRequester var8 =
              new FileRequester(var3, var1, var5, this.ondemandRequester, this.fileCacheRequester,
                var6, var7, var4);
            this.fileRequesters[var3] = var8;
            return var8;
          } else {
            return this.fileRequesters[var3];
          }
        } else {
          throw new RuntimeException();
        }
      } else {
        throw new RuntimeException();
      }
    } catch (RuntimeException var9) {
      throw AbstractGameWorld.cascadeException(var9,
        "al.A(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ',' + (
          var5 != null ?
            "{...}" :
            "null") + ')');
    }
  }

  public static void method836(int var0) {
    try {
      aClass153_105 = null;
      if (var0 > -10) {
        method843(-80, null);
      }

      aClass94_106 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "al.I(" + var0 + ')');
    }
  }

  static final void method840(GameObjectConfig var0, byte var1, int var2, int var3, int var4,
                              int var5, int var6, int var7, int var8) {
    try {
      int var9 = 3 & var3;
      if (var1 >= -1) {
        aClass94_106 = null;
      }

      int var10;
      int var11;
      if (-2 != ~var9 && -4 != ~var9) {
        var11 = var0.anInt1485;
        var10 = var0.anInt1480;
      } else {
        var10 = var0.anInt1485;
        var11 = var0.anInt1480;
      }

      int var14;
      int var15;
      if (-105 > ~(var7 - -var11)) {
        var15 = 1 + var7;
        var14 = var7;
      } else {
        var14 = var7 - -(var11 >> 1);
        var15 = var7 - -(1 + var11 >> 1);
      }

      int var16 = (var6 << 7) - -(var10 << 6);
      int var17 = (var7 << 7) + (var11 << 6);
      int var12;
      int var13;
      if (104 < var6 - -var10) {
        var12 = var6;
        var13 = var6 + 1;
      } else {
        var12 = var6 + (var10 >> 1);
        var13 = (var10 - -1 >> 1) + var6;
      }

      int[][] var18 = AbstractGameWorld.heightMap[var8];
      int var20 = 0;
      int var19 =
        var18[var12][var15] + var18[var12][var14] + var18[var13][var14] + var18[var13][var15] >> 2;
      int[][] var21;
      if (~var8 != -1) {
        var21 = AbstractGameWorld.heightMap[0];
        var20 =
          -(var21[var12][var15] + var21[var13][var14] + (var21[var12][var14] - -var21[var13][var15])
            >> 2) + var19;
      }

      var21 = null;
      if (3 > var8) {
        var21 = AbstractGameWorld.heightMap[1 + var8];
      }

      SceneShadowMap var22 =
        var0.method1696(var3, var16, var18, var5, var19, var21, false, null, (byte) -69, true,
          var17);
      DummyClass16.method2047(var22.shadow, -var4 + var16, var20, var17 + -var2);
    } catch (RuntimeException var23) {
      throw AbstractGameWorld.cascadeException(var23,
        "al.K(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ',' + var3 + ','
          + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ')');
    }
  }

  static final void method841(boolean var0) {
    try {
      SceneNode.aClass11Array1836 = null;
      TextureSampler12.method171(-101, InventoryConfig.anInt3655, 0, DummyClass30.viewWidth, 0, -1,
        GroundItem.viewHeight, 0, 0);
      if (SceneNode.aClass11Array1836 != null) {
        Cache.method1095(0, FileCacheRequester.anInt1082, AbstractObjectNode.anInt3602,
          SceneNode.aClass11Array1836, DummyClass30.viewWidth, -1412584499, 0,
          GroundItem.viewHeight, (byte) 73, DummyClass18.aClass11_88.anInt292);
        SceneNode.aClass11Array1836 = null;
      }

      if (!var0) {
        method844((byte) -24);
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "al.G(" + var0 + ')');
    }
  }

  static final FileUnpacker createUnpacker(boolean var0, boolean var1, boolean var2, int var3,
                                           boolean var4) {
    try {
      if (!var4) {
        return null;
      } else {
        FileCache var5 = null;
        if (null != DummyClass55.cacheDataFile) {
          var5 = new FileCache(var3, DummyClass55.cacheDataFile, DummyClass7.cacheIndexFiles[var3],
            1000000);
        }

        Buffer.aClass151_Sub1Array2601[var3] =
          AbstractFileRequester.fileSystem.method839(-1824885439, var3, BlockConfig.tableCache,
            var5);
        if (var1) {
          Buffer.aClass151_Sub1Array2601[var3].method2101(true);
        }

        return new FileUnpacker(Buffer.aClass151_Sub1Array2601[var3], var0, var2);
      }
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "al.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
    }
  }

  static final SomethingTexture method843(int var0, Buffer var1) {
    try {
      return var0 != -5232 ?
        null :
        new SomethingTexture(var1.method787((byte) 46), var1.method787((byte) 109),
          var1.method787((byte) 68), var1.method787((byte) 127), var1.readUnsignedMedium((byte) 91),
          var1.readUnsignedByte());
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "al.D(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  static final void method844(byte var0) {
    try {
      if (var0 != -9) {
        aClass94_106 = null;
      }

      if (null == TextureSampler23.anIntArray3212 || null == SomethingTexture1.anIntArray2639) {
        TextureSampler23.anIntArray3212 = new int[256];
        SomethingTexture1.anIntArray2639 = new int[256];

        for (int var1 = 0; 256 > var1; ++var1) {
          double var2 = (double) var1 / 255.0D * 6.283185307179586D;
          TextureSampler23.anIntArray3212[var1] = (int) (Math.sin(var2) * 4096.0D);
          SomethingTexture1.anIntArray2639[var1] = (int) (4096.0D * Math.cos(var2));
        }
      }

    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "al.C(" + var0 + ')');
    }
  }

  static final void method845(boolean var0, int var1) {
    try {
      if (var0 == !DummyClass17.aBoolean1827) {
        DummyClass17.aBoolean1827 = var0;
        if (var1 != 255) {
          aClass94_106 = null;
        }

        MaterialShader5.method1626((byte) -126);
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "al.H(" + var0 + ',' + var1 + ')');
    }
  }

  static final boolean method846(int var0, int var1, int var2) {
    int var3 = DummyClass50.anIntArrayArrayArray1142[var0][var1][var2];
    if (var3 == -SomethingQuickChat2.anInt3539) {
      return false;
    } else if (var3 == SomethingQuickChat2.anInt3539) {
      return true;
    } else {
      int var4 = var1 << 7;
      int var5 = var2 << 7;
      if (TextureSampler10.method349(var4 + 1, AbstractGameWorld.heightMap[var0][var1][var2],
        var5 + 1) && TextureSampler10.method349(var4 + 128 - 1,
        AbstractGameWorld.heightMap[var0][var1 + 1][var2], var5 + 1) && TextureSampler10.method349(
        var4 + 128 - 1, AbstractGameWorld.heightMap[var0][var1 + 1][var2 + 1], var5 + 128 - 1)
        && TextureSampler10.method349(var4 + 1, AbstractGameWorld.heightMap[var0][var1][var2 + 1],
        var5 + 128 - 1)) {
        DummyClass50.anIntArrayArrayArray1142[var0][var1][var2] = SomethingQuickChat2.anInt3539;
        return true;
      } else {
        DummyClass50.anIntArrayArrayArray1142[var0][var1][var2] = -SomethingQuickChat2.anInt3539;
        return false;
      }
    }
  }

}
