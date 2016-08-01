final class SoftwareFont extends AbstractFont {

  private byte[][] aByteArrayArray4082 = new byte[256][];


  SoftwareFont(byte[] var1) {
    super(var1);
  }

  SoftwareFont(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, byte[][] var6) {
    super(var1, var2, var3, var4, var5);
    this.aByteArrayArray4082 = var6;
  }

  final void method678(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
    int var8 = var2 + var3 * DummyClass47.anInt1092;
    int var9 = DummyClass47.anInt1092 - var4;
    int var10 = 0;
    int var11 = 0;
    int var12;
    if (var3 < DummyClass47.anInt1095) {
      var12 = DummyClass47.anInt1095 - var3;
      var5 -= var12;
      var3 = DummyClass47.anInt1095;
      var11 += var12 * var4;
      var8 += var12 * DummyClass47.anInt1092;
    }

    if (var3 + var5 > DummyClass47.anInt1099) {
      var5 -= var3 + var5 - DummyClass47.anInt1099;
    }

    if (var2 < DummyClass47.anInt1093) {
      var12 = DummyClass47.anInt1093 - var2;
      var4 -= var12;
      var2 = DummyClass47.anInt1093;
      var11 += var12;
      var8 += var12;
      var10 += var12;
      var9 += var12;
    }

    if (var2 + var4 > DummyClass47.anInt1096) {
      var12 = var2 + var4 - DummyClass47.anInt1096;
      var4 -= var12;
      var10 += var12;
      var9 += var12;
    }

    if (var4 > 0 && var5 > 0) {
      if (DummyClass47.anIntArray1097 != null) {
        method705(DummyClass47.anIntArray1100, this.aByteArrayArray4082[var1], var2, var3, var4,
          var5, var6, var11, var8, var9, var10, DummyClass47.anIntArray1097,
          DummyClass47.anIntArray1098);
      } else {
        method704(DummyClass47.anIntArray1100, this.aByteArrayArray4082[var1], var6, var11, var8,
          var4, var5, var9, var10);
      }

    }
  }

  final void method679(int var1, int var2, int var3, int var4, int var5, int var6, int var7,
                       boolean var8) {
    int var9 = var2 + var3 * DummyClass47.anInt1092;
    int var10 = DummyClass47.anInt1092 - var4;
    int var11 = 0;
    int var12 = 0;
    int var13;
    if (var3 < DummyClass47.anInt1095) {
      var13 = DummyClass47.anInt1095 - var3;
      var5 -= var13;
      var3 = DummyClass47.anInt1095;
      var12 += var13 * var4;
      var9 += var13 * DummyClass47.anInt1092;
    }

    if (var3 + var5 > DummyClass47.anInt1099) {
      var5 -= var3 + var5 - DummyClass47.anInt1099;
    }

    if (var2 < DummyClass47.anInt1093) {
      var13 = DummyClass47.anInt1093 - var2;
      var4 -= var13;
      var2 = DummyClass47.anInt1093;
      var12 += var13;
      var9 += var13;
      var11 += var13;
      var10 += var13;
    }

    if (var2 + var4 > DummyClass47.anInt1096) {
      var13 = var2 + var4 - DummyClass47.anInt1096;
      var4 -= var13;
      var11 += var13;
      var10 += var13;
    }

    if (var4 > 0 && var5 > 0) {
      method706(DummyClass47.anIntArray1100, this.aByteArrayArray4082[var1], var6, var12, var9,
        var4, var5, var10, var11, var7);
    }
  }

  private static final void method704(int[] var0, byte[] var1, int var2, int var3, int var4,
                                      int var5, int var6, int var7, int var8) {
    int var9 = -(var5 >> 2);
    var5 = -(var5 & 3);

    for (int var10 = -var6; var10 < 0; ++var10) {
      int var11;
      for (var11 = var9; var11 < 0; ++var11) {
        if (var1[var3++] != 0) {
          var0[var4++] = var2;
        } else {
          ++var4;
        }

        if (var1[var3++] != 0) {
          var0[var4++] = var2;
        } else {
          ++var4;
        }

        if (var1[var3++] != 0) {
          var0[var4++] = var2;
        } else {
          ++var4;
        }

        if (var1[var3++] != 0) {
          var0[var4++] = var2;
        } else {
          ++var4;
        }
      }

      for (var11 = var5; var11 < 0; ++var11) {
        if (var1[var3++] != 0) {
          var0[var4++] = var2;
        } else {
          ++var4;
        }
      }

      var4 += var7;
      var3 += var8;
    }

  }

  private static final void method705(int[] var0, byte[] var1, int var2, int var3, int var4,
                                      int var5, int var6, int var7, int var8, int var9, int var10,
                                      int[] var11, int[] var12) {
    int var13 = var2 - DummyClass47.anInt1093;
    int var14 = var3 - DummyClass47.anInt1095;

    for (int var15 = var14; var15 < var14 + var5; ++var15) {
      int var16 = var11[var15];
      int var17 = var12[var15];
      int var18 = var4;
      int var19;
      if (var13 > var16) {
        var19 = var13 - var16;
        if (var19 >= var17) {
          var7 += var4 + var10;
          var8 += var4 + var9;
          continue;
        }

        var17 -= var19;
      } else {
        var19 = var16 - var13;
        if (var19 >= var4) {
          var7 += var4 + var10;
          var8 += var4 + var9;
          continue;
        }

        var7 += var19;
        var18 = var4 - var19;
        var8 += var19;
      }

      var19 = 0;
      if (var18 < var17) {
        var17 = var18;
      } else {
        var19 = var18 - var17;
      }

      for (int var20 = -var17; var20 < 0; ++var20) {
        if (var1[var7++] != 0) {
          DummyClass47.anIntArray1100[var8++] = var6;
        } else {
          ++var8;
        }
      }

      var7 += var19 + var10;
      var8 += var19 + var9;
    }

  }

  private static final void method706(int[] var0, byte[] var1, int var2, int var3, int var4,
                                      int var5, int var6, int var7, int var8, int var9) {
    var2 = ((var2 & 16711935) * var9 & -16711936) + ((var2 & '\uff00') * var9 & 16711680) >> 8;
    var9 = 256 - var9;

    for (int var10 = -var6; var10 < 0; ++var10) {
      for (int var11 = -var5; var11 < 0; ++var11) {
        if (var1[var3++] != 0) {
          int var12 = var0[var4];
          var0[var4++] =
            (((var12 & 16711935) * var9 & -16711936) + ((var12 & '\uff00') * var9 & 16711680) >> 8)
              + var2;
        } else {
          ++var4;
        }
      }

      var4 += var7;
      var3 += var8;
    }

  }
}
