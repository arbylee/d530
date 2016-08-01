final class FileUnpacker {

  static int anInt1944;
  static FileUnpacker fileUnpacker13;
  static int sunColor;
  static boolean aBoolean1951 = false;
  static int updateMemoryCounter;
  private boolean aBoolean1945;
  private boolean aBoolean1946;
  private AbstractFileRequester aClass151_1947;
  private FileTable table = null;
  private Object[][] buffers;
  private Object[] anObjectArray1954;


  FileUnpacker(AbstractFileRequester var1, boolean var2, boolean var3) {
    try {
      this.aClass151_1947 = var1;
      this.aBoolean1945 = var2;
      this.aBoolean1946 = var3;
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "ve.<init>(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
    }
  }

  final boolean method2113(byte var1) {
    try {
      if (!this.method2122()) {
        return false;
      } else {
        if (var1 <= 15) {
          this.method2113((byte) 39);
        }

        boolean var2 = true;

        for (int var3 = 0; ~var3 > ~this.table.anIntArray953.length; ++var3) {
          int var4 = this.table.anIntArray953[var3];
          if (null == this.anObjectArray1954[var4]) {
            this.method2134(false, var4);
            if (null == this.anObjectArray1954[var4]) {
              var2 = false;
            }
          }
        }

        return var2;
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5, "ve.IA(" + var1 + ')');
    }
  }

  private final int method2114(int var1, int var2) {
    try {
      if (!this.method2130(false, var1)) {
        return 0;
      } else {
        if (var2 != 0) {
          this.method2115(36, false, true);
        }

        return this.anObjectArray1954[var1] != null ?
          100 :
          this.aClass151_1947.method2097(var1, '\uffff');
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "ve.J(" + var1 + ',' + var2 + ')');
    }
  }

  final void method2115(int var1, boolean var2, boolean var3) {
    try {
      int var4 = 9 / ((var1 - 35) / 44);
      if (this.method2122()) {
        if (var2) {
          this.table.anIntArray955 = null;
          this.table.fileNameTable = null;
        }

        if (var3) {
          this.table.childNameTables = null;
          this.table.unpackedNames = null;
        }

      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "ve.R(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  final int method2116(int var1, GameString var2) {
    try {
      if (!this.method2122()) {
        return 0;
      } else {
        var2 = var2.method1534();
        if (var1 != 22813) {
          return -12;
        } else {
          int var3 = this.table.fileNameTable.get(var2.getDbj2Hash(false));
          return this.method2114(var3, 0);
        }
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "ve.P(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
    }
  }

  final boolean method2117(int var1, int var2) {
    try {
      if (var1 >= -88) {
        this.aBoolean1945 = true;
      }

      if (this.method2130(false, var2)) {
        if (null == this.anObjectArray1954[var2]) {
          this.method2134(false, var2);
          return null != this.anObjectArray1954[var2];
        } else {
          return true;
        }
      } else {
        return false;
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "ve.GA(" + var1 + ',' + var2 + ')');
    }
  }

  final int getTableChecksum() {
    try {

      if (this.method2122()) {
        return this.table.checksum;
      } else {
        throw new IllegalStateException("");
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "ve.T()");
    }
  }

  final int getFileId(GameString var1) {
    try {
      if (this.method2122()) {
        var1 = var1.method1534();
        int var3 = this.table.fileNameTable.get(var1.getDbj2Hash(false));
        return this.method2130(false, var3) ? (var3) : -1;
      } else {
        return -1;
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "ve.EA(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  final int method2121(int var1) {
    try {
      if (!this.method2122()) {
        return -1;
      } else {
        if (var1 != 0) {
          this.method2139(45, 104, -3);
        }

        return this.table.unpackedLengths.length;
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "ve.D(" + var1 + ')');
    }
  }

  private final boolean method2122() {
    try {

      if (this.table == null) {
        this.table = this.aClass151_1947.method2094(0);
        if (null == this.table) {
          return false;
        }

        this.buffers = new Object[this.table.anInt960][];
        this.anObjectArray1954 = new Object[this.table.anInt960];
      }

      return true;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "ve.W()");
    }
  }

  final byte[] method2123(int var1, GameString var2, GameString var3) {
    try {
      if (!this.method2122()) {
        return null;
      } else {
        var3 = var3.method1534();
        var2 = var2.method1534();
        int var4 = this.table.fileNameTable.get(var3.getDbj2Hash(false));
        if (var1 != 0) {
          this.table = null;
        }

        if (this.method2130(false, var4)) {
          int var5 = this.table.childNameTables[var4].get(var2.getDbj2Hash(false));
          return this.getBytes(var4, var5);
        } else {
          return null;
        }
      }
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "ve.C(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + (var3 != null ?
          "{...}" :
          "null") + ')');
    }
  }

  final void method2124(int var1, GameString var2) {
    try {
      if (this.method2122()) {
        var2 = var2.method1534();
        int var3 = this.table.fileNameTable.get(var2.getDbj2Hash(false));
        this.method2131(119, var3);
        int var4 = 123 % ((var1 - -60) / 62);
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "ve.V(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
    }
  }

  final boolean method2125(GameString var1, byte var2, GameString var3) {
    try {
      if (!this.method2122()) {
        return false;
      } else {
        var3 = var3.method1534();
        var1 = var1.method1534();
        int var4 = this.table.fileNameTable.get(var3.getDbj2Hash(false));
        if (this.method2130(false, var4)) {
          int var5 = this.table.childNameTables[var4].get(var1.getDbj2Hash(false));
          if (var2 != 116) {
            this.aBoolean1945 = true;
          }

          return this.method2129((byte) 70, var5, var4);
        } else {
          return false;
        }
      }
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "ve.DA(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + (var3 != null ?
          "{...}" :
          "null") + ')');
    }
  }

  final byte[] unpack(int fileId, int[] var2, int var3, int childId) {
    try {
      if (!this.method2139(fileId, 0, childId)) {
        return null;
      } else {
        if (this.buffers[fileId] == null || this.buffers[fileId][childId] == null) {
          boolean var5 = this.method2132(fileId, false, var2);
          if (!var5) {
            this.method2134(false, fileId);
            var5 = this.method2132(fileId, false, var2);
            if (!var5) {
              return null;
            }
          }
        }

        if (var3 < 35) {
          return null;
        } else {
          byte[] var7 = NPC.method1985(-119, this.buffers[fileId][childId], false);
          if (this.aBoolean1946) {
            this.buffers[fileId][childId] = null;
            if (this.table.unpackedLengths[fileId] == 1) {
              this.buffers[fileId] = null;
            }
          }

          return var7;
        }
      }
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "ve.BA(" + fileId + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + childId
          + ')');
    }
  }

  final boolean method2127(byte var1, GameString var2) {
    try {
      if (this.method2122()) {
        var2 = var2.method1534();
        int var3 = this.table.fileNameTable.get(var2.getDbj2Hash(false));
        return var1 != -83 ? true : this.method2117(-104, var3);
      } else {
        return false;
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "ve.O(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
    }
  }

  final void method2128(int var1, int var2) {
    try {
      if (var1 == 7561) {
        if (this.method2130(false, var2)) {
          if (null != this.buffers) {
            this.buffers[var2] = null;
          }

        }
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "ve.B(" + var1 + ',' + var2 + ')');
    }
  }

  final boolean method2129(byte var1, int var2, int var3) {
    try {
      int var4 = 78 / ((-10 - var1) / 59);
      if (this.method2139(var3, 0, var2)) {
        if (this.buffers[var3] != null && null != this.buffers[var3][var2]) {
          return true;
        } else if (this.anObjectArray1954[var3] == null) {
          this.method2134(false, var3);
          return this.anObjectArray1954[var3] != null;
        } else {
          return true;
        }
      } else {
        return false;
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "ve.FA(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  private final boolean method2130(boolean var1, int var2) {
    try {
      if (var1) {
        aBoolean1951 = false;
      }

      if (this.method2122()) {
        if (var2 >= 0 && this.table.unpackedLengths.length > var2
          && ~this.table.unpackedLengths[var2] != -1) {
          return true;
        } else if (!DummyClass21.aBoolean1765) {
          return false;
        } else {
          throw new IllegalArgumentException(Integer.toString(var2));
        }
      } else {
        return false;
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "ve.E(" + var1 + ',' + var2 + ')');
    }
  }

  private final void method2131(int var1, int var2) {
    try {
      this.aClass151_1947.method2095(var2, 127);
      if (var1 < 101) {
        this.method2132(53, false, null);
      }

    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "ve.L(" + var1 + ',' + var2 + ')');
    }
  }

  private final boolean method2132(int var1, boolean var2, int[] var3) {
    try {
      if (!this.method2130(var2, var1)) {
        return false;
      } else if (this.anObjectArray1954[var1] == null) {
        return false;
      } else {
        int[] var5 = this.table.unpackedIds[var1];
        int var4 = this.table.unpackedSizes[var1];
        if (this.buffers[var1] == null) {
          this.buffers[var1] = new Object[this.table.unpackedLengths[var1]];
        }

        boolean var7 = true;
        Object[] var6 = this.buffers[var1];

        for (int var8 = 0; var8 < var4; ++var8) {
          int var9;
          if (var5 == null) {
            var9 = var8;
          } else {
            var9 = var5[var8];
          }

          if (var6[var9] == null) {
            var7 = false;
            break;
          }
        }

        if (var7) {
          return true;
        } else {
          byte[] var21;
          if (null != var3 && (~var3[0] != -1 || -1 != ~var3[1] || 0 != var3[2] || var3[3] != 0)) {
            var21 = NPC.method1985(-124, this.anObjectArray1954[var1], true);
            Buffer var22 = new Buffer(var21);
            var22.method770(var3, 120, 5, var22.bytes.length);
          } else {
            var21 = NPC.method1985(-128, this.anObjectArray1954[var1], false);
          }

          byte[] var23;
          try {
            var23 = ClientScriptEnum.method623((byte) -125, var21);
          } catch (RuntimeException var19) {
            throw AbstractGameWorld.cascadeException(var19,
              "T3 - " + (var3 != null) + "," + var1 + "," + var21.length + ","
                + DummyClass35.getChecksum(var21, var21.length, false) + ","
                + DummyClass35.getChecksum(var21, var21.length - 2, false) + ","
                + this.table.anIntArray945[var1] + "," + this.table.checksum);
          }

          if (this.aBoolean1945) {
            this.anObjectArray1954[var1] = null;
          }

          int var10;
          if (var4 > 1) {
            var10 = var23.length;
            --var10;
            int var11 = 255 & var23[var10];
            if (var11 > 1) {
              System.out.println(var11);
              int a = 5;
            }
            var10 -= var4 * var11 * 4;
            Buffer var12 = new Buffer(var23);
            var12.position = var10;
            int[] var13 = new int[var4];

            int var15;
            int var16;
            for (int var14 = 0; ~var14 > ~var11; ++var14) {
              var15 = 0;

              for (var16 = 0; ~var4 < ~var16; ++var16) {
                var15 += var12.readInt();
                if (null == var5) {
                }

                var13[var16] += var15;
              }
            }

            byte[][] var24 = new byte[var4][];

            for (var15 = 0; ~var15 > ~var4; ++var15) {
              var24[var15] = new byte[var13[var15]];
              var13[var15] = 0;
            }

            var12.position = var10;
            var15 = 0;

            int var17;
            for (var16 = 0; ~var16 > ~var11; ++var16) {
              var17 = 0;

              for (int var18 = 0; ~var4 < ~var18; ++var18) {
                var17 += var12.readInt();
                ArrayUtils.copy(var23, var15, var24[var18], var13[var18], var17);
                var15 += var17;
                var13[var18] += var17;
              }
            }

            for (var16 = 0; ~var4 < ~var16; ++var16) {
              if (var5 != null) {
                var17 = var5[var16];
              } else {
                var17 = var16;
              }

              if (this.aBoolean1946) {
                var6[var17] = var24[var16];
              } else {
                var6[var17] = AudioWorker.method890(false, -114, var24[var16]);
              }
            }
          } else {
            if (null != var5) {
              var10 = var5[0];
            } else {
              var10 = 0;
            }

            if (!this.aBoolean1946) {
              var6[var10] = AudioWorker.method890(false, -80, var23);
            } else {
              var6[var10] = var23;
            }
          }

          return true;
        }
      }
    } catch (RuntimeException var20) {
      throw AbstractGameWorld.cascadeException(var20,
        "ve.I(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
    }
  }

  final byte[] getBytes(int fileId, int childId) {
    try {
      return this.unpack(fileId, null, 52, childId);
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5, "ve.M(" + fileId + ',' + childId + ')');
    }
  }

  private final void method2134(boolean var1, int var2) {
    try {
      if (!this.aBoolean1945) {
        this.anObjectArray1954[var2] =
          AudioWorker.method890(false, -101, this.aClass151_1947.method2098(var2, 0));
      } else {
        this.anObjectArray1954[var2] = this.aClass151_1947.method2098(var2, 0);
      }

      if (var1) {
        this.aBoolean1945 = false;
      }

    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "ve.F(" + var1 + ',' + var2 + ')');
    }
  }

  final boolean method2135(GameString var1, int var2) {
    try {
      if (var2 >= -103) {
        return false;
      } else if (this.method2122()) {
        var1 = var1.method1534();
        int var3 = this.table.fileNameTable.get(var1.getDbj2Hash(false));
        return ~var3 <= -1;
      } else {
        return false;
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "ve.S(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
    }
  }

  final int method2136(byte var1) {
    try {
      if (var1 > -121) {
        sunColor = -3;
      }

      if (!this.method2122()) {
        return 0;
      } else {
        int var2 = 0;
        int var3 = 0;

        int var4;
        for (var4 = 0; var4 < this.anObjectArray1954.length; ++var4) {
          if (0 < this.table.unpackedSizes[var4]) {
            var2 += 100;
            var3 += this.method2114(var4, 0);
          }
        }

        if (var2 != 0) {
          var4 = var3 * 100 / var2;
          return var4;
        } else {
          return 100;
        }
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5, "ve.N(" + var1 + ')');
    }
  }

  final void method2137(byte var1) {
    try {
      if (var1 != 56) {
        this.buffers = null;
      }

      if (this.buffers != null) {
        for (int var2 = 0; this.buffers.length > var2; ++var2) {
          this.buffers[var2] = null;
        }
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "ve.Q(" + var1 + ')');
    }
  }

  final byte[] getBytes(int var1) {
    try {
      if (!this.method2122()) {
        return null;
      } else if (~this.table.unpackedLengths.length == -2) {
        return this.getBytes(0, var1);
      } else if (!this.method2130(false, var1)) {
        return null;
      } else if (~this.table.unpackedLengths[var1] != -2) {

        throw new RuntimeException();

      } else {
        return this.getBytes(var1, 0);
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "ve.HA(" + var1 + ')');
    }
  }

  private final boolean method2139(int var1, int var2, int var3) {
    try {
      if (this.method2122()) {
        if (var2 <= var1 && -1 >= ~var3 && ~this.table.unpackedLengths.length < ~var1
          && this.table.unpackedLengths[var1] > var3) {
          return true;
        } else if (!DummyClass21.aBoolean1765) {
          return false;
        } else {
          throw new IllegalArgumentException(var1 + "," + var3);
        }
      } else {
        return false;
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "ve.K(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  final byte[] getBytes(int var1, int var2, int var3) {
    try {
      if (!this.method2139(var2, var3 + var3, var1)) {
        return null;
      } else {
        if (this.buffers[var2] == null || null == this.buffers[var2][var1]) {
          boolean var4 = this.method2132(var2, false, null);
          if (!var4) {
            this.method2134(false, var2);
            var4 = this.method2132(var2, false, null);
            if (!var4) {
              return null;
            }
          }
        }

        byte[] var6 = NPC.method1985(-126, this.buffers[var2][var1], false);
        return var6;
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "ve.CA(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  final int[] getChildIds(byte var1, int var2) {
    try {
      if (var1 != -128) {
        updateMemoryCounter = -69;
      }

      if (!this.method2130(false, var2)) {
        return null;
      } else {
        int[] var3 = this.table.unpackedIds[var2];
        if (null == var3) {
          var3 = new int[this.table.unpackedSizes[var2]];

          for (int var4 = 0; var3.length > var4; var3[var4] = var4++) {
          }
        }

        return var3;
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5, "ve.G(" + var1 + ',' + var2 + ')');
    }
  }

  final int getAmountChildren(int var1, byte var2) {
    try {
      if (!this.method2130(false, var1)) {
        return 0;
      } else {
        if (var2 <= 60) {
          this.method2122();
        }

        return this.table.unpackedLengths[var1];
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "ve.H(" + var1 + ',' + var2 + ')');
    }
  }

  final boolean isLoaded(int fileId) {
    try {
      if (!this.method2122()) {
        return false;
      } else if (~this.table.unpackedLengths.length == -2) {
        return this.method2129((byte) 86, fileId, 0);
      } else if (this.method2130(false, fileId)) {
        if (1 == this.table.unpackedLengths[fileId]) {
          return this.method2129((byte) 109, 0, fileId);
        } else {
          throw new RuntimeException();
        }
      } else {
        return false;
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "ve.A(" + fileId + ')');
    }
  }

  public static void method2119(int var0) {
    try {
      if (var0 != 100) {
        method2143((byte) -45, -91, 7, -83, 24);
      }

      fileUnpacker13 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ve.AA(" + var0 + ')');
    }
  }

  static final void method2143(byte var0, int var1, int var2, int var3, int var4) {
    try {
      WidgetUpdate var5 = AudioStreamEncoder3.method466(4, 8, var2);
      var5.g((byte) 33);
      var5.anInt3596 = var1;
      if (var0 >= -120) {
        sunColor = -14;
      }

      var5.anInt3598 = var4;
      var5.anInt3597 = var3;
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "ve.U(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
    }
  }

}
