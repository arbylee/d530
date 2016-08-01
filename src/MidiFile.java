final class MidiFile extends Node {

  HashTable aClass130_2564;
  byte[] aByteArray2565;


  private MidiFile(Buffer var1) {
    var1.position = var1.bytes.length - 3;
    int var2 = var1.readUnsignedByte();
    int var3 = var1.readUnsignedShort();
    int var4 = 14 + var2 * 10;
    var1.position = 0;
    int var5 = 0;
    int var6 = 0;
    int var7 = 0;
    int var8 = 0;
    int var9 = 0;
    int var10 = 0;
    int var11 = 0;
    int var12 = 0;
    int var13 = 0;

    int var14;
    int var15;
    while (var13 < var2) {
      var14 = -1;

      while (true) {
        var15 = var1.readUnsignedByte();
        if (var15 != var14) {
          ++var4;
        }

        var14 = var15 & 15;
        if (var15 == 7) {
          ++var13;
          break;
        }

        if (var15 == 23) {
          ++var5;
        } else if (var14 == 0) {
          ++var7;
        } else if (var14 == 1) {
          ++var8;
        } else if (var14 == 2) {
          ++var6;
        } else if (var14 == 3) {
          ++var9;
        } else if (var14 == 4) {
          ++var10;
        } else if (var14 == 5) {
          ++var11;
        } else {
          if (var14 != 6) {
            throw new RuntimeException();
          }

          ++var12;
        }
      }
    }

    var4 += 5 * var5;
    var4 += 2 * (var7 + var8 + var6 + var9 + var11);
    var4 += var10 + var12;
    var13 = var1.position;
    var14 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;

    for (var15 = 0; var15 < var14; ++var15) {
      var1.method741((byte) 127);
    }

    var4 += var1.position - var13;
    var15 = var1.position;
    int var16 = 0;
    int var17 = 0;
    int var18 = 0;
    int var19 = 0;
    int var20 = 0;
    int var21 = 0;
    int var22 = 0;
    int var23 = 0;
    int var24 = 0;
    int var25 = 0;
    int var26 = 0;
    int var27 = 0;
    int var28 = 0;

    int var29;
    for (var29 = 0; var29 < var6; ++var29) {
      var28 = var28 + var1.readUnsignedByte() & 127;
      if (var28 != 0 && var28 != 32) {
        if (var28 == 1) {
          ++var16;
        } else if (var28 == 33) {
          ++var17;
        } else if (var28 == 7) {
          ++var18;
        } else if (var28 == 39) {
          ++var19;
        } else if (var28 == 10) {
          ++var20;
        } else if (var28 == 42) {
          ++var21;
        } else if (var28 == 99) {
          ++var22;
        } else if (var28 == 98) {
          ++var23;
        } else if (var28 == 101) {
          ++var24;
        } else if (var28 == 100) {
          ++var25;
        } else if (var28 != 64 && var28 != 65 && var28 != 120 && var28 != 121 && var28 != 123) {
          ++var27;
        } else {
          ++var26;
        }
      } else {
        ++var12;
      }
    }

    var29 = 0;
    int var30 = var1.position;
    var1.position += var26;
    int var31 = var1.position;
    var1.position += var11;
    int var32 = var1.position;
    var1.position += var10;
    int var33 = var1.position;
    var1.position += var9;
    int var34 = var1.position;
    var1.position += var16;
    int var35 = var1.position;
    var1.position += var18;
    int var36 = var1.position;
    var1.position += var20;
    int var37 = var1.position;
    var1.position += var7 + var8 + var11;
    int var38 = var1.position;
    var1.position += var7;
    int var39 = var1.position;
    var1.position += var27;
    int var40 = var1.position;
    var1.position += var8;
    int var41 = var1.position;
    var1.position += var17;
    int var42 = var1.position;
    var1.position += var19;
    int var43 = var1.position;
    var1.position += var21;
    int var44 = var1.position;
    var1.position += var12;
    int var45 = var1.position;
    var1.position += var9;
    int var46 = var1.position;
    var1.position += var22;
    int var47 = var1.position;
    var1.position += var23;
    int var48 = var1.position;
    var1.position += var24;
    int var49 = var1.position;
    var1.position += var25;
    int var50 = var1.position;
    var1.position += var5 * 3;
    this.aByteArray2565 = new byte[var4];
    Buffer var51 = new Buffer(this.aByteArray2565);
    var51.writeInt(1297377380);
    var51.writeInt(6);
    var51.writeShort(var2 > 1 ? 1 : 0);
    var51.writeShort(var2);
    var51.writeShort(var3);
    var1.position = var13;
    int var52 = 0;
    int var53 = 0;
    int var54 = 0;
    int var55 = 0;
    int var56 = 0;
    int var57 = 0;
    int var58 = 0;
    int[] var59 = new int[128];
    var28 = 0;
    int var60 = 0;

    while (var60 < var2) {
      var51.writeInt(1297379947);
      var51.position += 4;
      int var61 = var51.position;
      int var62 = -1;

      while (true) {
        int var63 = var1.method741((byte) 113);
        var51.method771(17038, var63);
        int var64 = var1.bytes[var29++] & 255;
        boolean var65 = var64 != var62;
        var62 = var64 & 15;
        if (var64 == 7) {
          if (var65) {
            var51.writeByte(255);
          }

          var51.writeByte(47);
          var51.writeByte(0);
          var51.method742(83, var51.position - var61);
          ++var60;
          break;
        }

        if (var64 == 23) {
          if (var65) {
            var51.writeByte(255);
          }

          var51.writeByte(81);
          var51.writeByte(3);
          var51.writeByte(var1.bytes[var50++]);
          var51.writeByte(var1.bytes[var50++]);
          var51.writeByte(var1.bytes[var50++]);
        } else {
          var52 ^= var64 >> 4;
          if (var62 == 0) {
            if (var65) {
              var51.writeByte(144 + var52);
            }

            var53 += var1.bytes[var37++];
            var54 += var1.bytes[var38++];
            var51.writeByte(var53 & 127);
            var51.writeByte(var54 & 127);
          } else if (var62 == 1) {
            if (var65) {
              var51.writeByte(128 + var52);
            }

            var53 += var1.bytes[var37++];
            var55 += var1.bytes[var40++];
            var51.writeByte(var53 & 127);
            var51.writeByte(var55 & 127);
          } else if (var62 == 2) {
            if (var65) {
              var51.writeByte(176 + var52);
            }

            var28 = var28 + var1.bytes[var15++] & 127;
            var51.writeByte(var28);
            byte var66;
            if (var28 != 0 && var28 != 32) {
              if (var28 == 1) {
                var66 = var1.bytes[var34++];
              } else if (var28 == 33) {
                var66 = var1.bytes[var41++];
              } else if (var28 == 7) {
                var66 = var1.bytes[var35++];
              } else if (var28 == 39) {
                var66 = var1.bytes[var42++];
              } else if (var28 == 10) {
                var66 = var1.bytes[var36++];
              } else if (var28 == 42) {
                var66 = var1.bytes[var43++];
              } else if (var28 == 99) {
                var66 = var1.bytes[var46++];
              } else if (var28 == 98) {
                var66 = var1.bytes[var47++];
              } else if (var28 == 101) {
                var66 = var1.bytes[var48++];
              } else if (var28 == 100) {
                var66 = var1.bytes[var49++];
              } else if (var28 != 64 && var28 != 65 && var28 != 120 && var28 != 121
                && var28 != 123) {
                var66 = var1.bytes[var39++];
              } else {
                var66 = var1.bytes[var30++];
              }
            } else {
              var66 = var1.bytes[var44++];
            }

            int var67 = var66 + var59[var28];
            var59[var28] = var67;
            var51.writeByte(var67 & 127);
          } else if (var62 == 3) {
            if (var65) {
              var51.writeByte(224 + var52);
            }

            var56 += var1.bytes[var45++];
            var56 += var1.bytes[var33++] << 7;
            var51.writeByte(var56 & 127);
            var51.writeByte(var56 >> 7 & 127);
          } else if (var62 == 4) {
            if (var65) {
              var51.writeByte(208 + var52);
            }

            var57 += var1.bytes[var32++];
            var51.writeByte(var57 & 127);
          } else if (var62 == 5) {
            if (var65) {
              var51.writeByte(160 + var52);
            }

            var53 += var1.bytes[var37++];
            var58 += var1.bytes[var31++];
            var51.writeByte(var53 & 127);
            var51.writeByte(var58 & 127);
          } else {
            if (var62 != 6) {
              throw new RuntimeException();
            }

            if (var65) {
              var51.writeByte(192 + var52);
            }

            var51.writeByte(var1.bytes[var44++]);
          }
        }
      }
    }

  }

  final void method515() {
    this.aClass130_2564 = null;
  }

  final void method516() {
    if (this.aClass130_2564 == null) {
      this.aClass130_2564 = new HashTable(16);
      int[] var1 = new int[16];
      int[] var2 = new int[16];
      var1[9] = var2[9] = 128;
      SomethingMidiFile0 var3 = new SomethingMidiFile0(this.aByteArray2565);
      int var4 = var3.method1374();

      int var5;
      for (var5 = 0; var5 < var4; ++var5) {
        var3.method1376(var5);
        var3.method1377(var5);
        var3.method1381(var5);
      }

      while (true) {
        var5 = var3.method1382();
        int var6 = var3.anIntArray1114[var5];

        while (var3.anIntArray1114[var5] == var6) {
          var3.method1376(var5);
          int var7 = var3.method1375(var5);
          if (var7 == 1) {
            var3.method1384();
            var3.method1381(var5);
            if (var3.method1371()) {
              return;
            }
            break;
          }

          int var8 = var7 & 240;
          int var9;
          int var10;
          int var11;
          if (var8 == 176) {
            var9 = var7 & 15;
            var10 = var7 >> 8 & 127;
            var11 = var7 >> 16 & 127;
            if (var10 == 0) {
              var1[var9] = (var1[var9] & -2080769) + (var11 << 14);
            }

            if (var10 == 32) {
              var1[var9] = (var1[var9] & -16257) + (var11 << 7);
            }
          }

          if (var8 == 192) {
            var9 = var7 & 15;
            var10 = var7 >> 8 & 127;
            var2[var9] = var1[var9] + var10;
          }

          if (var8 == 144) {
            var9 = var7 & 15;
            var10 = var7 >> 8 & 127;
            var11 = var7 >> 16 & 127;
            if (var11 > 0) {
              int var12 = var2[var9];
              SomethingMidiFile var13 = (SomethingMidiFile) this.aClass130_2564.get((long) var12);
              if (var13 == null) {
                var13 = new SomethingMidiFile(new byte[128]);
                this.aClass130_2564.put((long) var12, var13);
              }

              var13.aByteArray2289[var10] = 1;
            }
          }

          var3.method1377(var5);
          var3.method1381(var5);
        }
      }
    }
  }

  static final MidiFile method517(FileUnpacker unpacker, int fileId, int childId) {
    byte[] bytes = unpacker.getBytes(fileId, childId);
    return bytes == null ? null : new MidiFile(new Buffer(bytes));
  }
}
