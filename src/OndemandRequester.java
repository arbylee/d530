import java.io.IOException;

final class OndemandRequester {

  static int anInt994;
  static GameString aClass94_995 = SpawnedGameObject.createString("(Y<)4col>");
  static AbstractDirectColorSprite[] aClass3_Sub28_Sub16Array996;
  static int anInt997 = 0;
  static int anInt998 = 0;
  static int anInt999 = -1;
  static int anInt1002 = 0;
  volatile int anInt1010 = 0;
  volatile int anInt1011 = 0;
  private Queue aClass13_993 = new Queue();
  private Queue priorityRequests = new Queue();
  private Queue aClass13_1001 = new Queue();
  private Queue normalRequests = new Queue();
  private long lastUpdatedTime;
  private SocketStream socketStream;
  private int timeDiff;
  private Buffer buffer = new Buffer(4);
  private Buffer aClass3_Sub30_1008 = new Buffer(8);
  private byte encryptionKey = 0;
  private OndemandFileRequest currentRequest;

  final boolean method1241(int var1) {
    try {
      if (var1 != -30064) {
        this.priorityRequests = null;
      }

      return 20 <= this.method1246(11706);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "jb.N(" + var1 + ')');
    }
  }

  final boolean method1243(byte var1) {
    try {
      int avail;
      if (null != this.socketStream) {
        long currentTime = Time.getCurrentTimeMillis();
        int diff = (int) (currentTime - lastUpdatedTime);
        this.lastUpdatedTime = currentTime;
        if (diff > 200) {
          diff = 200;
        }

        this.timeDiff += diff;
        if (30000 < this.timeDiff) {
          try {
            this.socketStream.destroy();
          } catch (Exception var18) {
          }

          this.socketStream = null;
        }
      }

      if (this.socketStream == null) {
        return 0 == this.method1253(4) && -1 == ~this.method1246(11706);
      } else {
        try {
          this.socketStream.method1466(127);

          OndemandFileRequest var21;
          for (
            var21 = (OndemandFileRequest) this.aClass13_993.getFirst();
            null != var21; var21 = (OndemandFileRequest) this.aClass13_993.getNext()) {
            this.buffer.position = 0;
            this.buffer.writeByte(1);
            this.buffer.writeMedium((int) var21.subnodeKey);
            this.socketStream.write(this.buffer.bytes, 0, 4);
            this.priorityRequests.addLast(var21);
          }

          for (
            var21 = (OndemandFileRequest) this.aClass13_1001.getFirst();
            var21 != null; var21 = (OndemandFileRequest) this.aClass13_1001.getNext()) {
            this.buffer.position = 0;
            this.buffer.writeByte(0);
            this.buffer.writeMedium((int) var21.subnodeKey);
            this.socketStream.write(this.buffer.bytes, 0, 4);
            this.normalRequests.addLast(var21);
          }

          for (int var3 = 0; 100 > var3; ++var3) {
            avail = this.socketStream.available();
            if (avail < 0) {
              throw new IOException();
            }

            if (-1 == ~avail) {
              break;
            }

            this.timeDiff = 0;
            byte read = 0;
            if (null != this.currentRequest) {
              if (~this.currentRequest.anInt4067 == -1) {
                read = 1;
              }
            } else {
              read = 8;
            }

            int var6;
            int var7;
            int var8;
            if (0 >= read) {
              var6 = -this.currentRequest.aByte4064 + this.currentRequest.buffer.bytes.length;
              var7 = -this.currentRequest.anInt4067 + 512;
              if (var7 > -this.currentRequest.buffer.position + var6) {
                var7 = -this.currentRequest.buffer.position + var6;
              }

              if (~var7 < ~avail) {
                var7 = avail;
              }

              this.socketStream.read(this.currentRequest.buffer.bytes,
                this.currentRequest.buffer.position, var7);
              if (-1 != ~this.encryptionKey) {
                for (var8 = 0; ~var7 < ~var8; ++var8) {
                  this.currentRequest.buffer.bytes[this.currentRequest.buffer.position - -var8] =
                    (byte) ObjectCache.bitXor(
                      this.currentRequest.buffer.bytes[this.currentRequest.buffer.position + var8],
                      this.encryptionKey);
                }
              }

              this.currentRequest.anInt4067 += var7;
              this.currentRequest.buffer.position += var7;
              if (~this.currentRequest.buffer.position != ~var6) {
                if (~this.currentRequest.anInt4067 == -513) {
                  this.currentRequest.anInt4067 = 0;
                }
              } else {
                this.currentRequest.unlinkSubNode();
                this.currentRequest.aBoolean3632 = false;
                this.currentRequest = null;
              }
            } else {
              var6 = -this.aClass3_Sub30_1008.position + read;
              if (avail < var6) {
                var6 = avail;
              }

              this.socketStream.read(this.aClass3_Sub30_1008.bytes,
                this.aClass3_Sub30_1008.position, var6);
              if (0 != this.encryptionKey) {
                for (var7 = 0; var7 < var6; ++var7) {
                  this.aClass3_Sub30_1008.bytes[var7 + this.aClass3_Sub30_1008.position] =
                    (byte) ObjectCache.bitXor(
                      this.aClass3_Sub30_1008.bytes[var7 + this.aClass3_Sub30_1008.position],
                      this.encryptionKey);
                }
              }

              this.aClass3_Sub30_1008.position += var6;
              if (~this.aClass3_Sub30_1008.position <= ~read) {
                if (this.currentRequest != null) {
                  if (this.currentRequest.anInt4067 != 0) {
                    throw new IOException();
                  }

                  if (~this.aClass3_Sub30_1008.bytes[0] != 0) {
                    this.currentRequest = null;
                  } else {
                    this.currentRequest.anInt4067 = 1;
                    this.aClass3_Sub30_1008.position = 0;
                  }
                } else {
                  this.aClass3_Sub30_1008.position = 0;
                  var7 = this.aClass3_Sub30_1008.readUnsignedByte();
                  var8 = this.aClass3_Sub30_1008.readUnsignedShort();
                  int var9 = this.aClass3_Sub30_1008.readUnsignedByte();
                  int length = this.aClass3_Sub30_1008.readInt();
                  int compression = 127 & var9;
                  boolean priority = -1 != ~(var9 & 128);
                  OndemandFileRequest var15 = null;
                  long var13 = (long) ((var7 << 16) - -var8);
                  if (!priority) {
                    for (
                      var15 = (OndemandFileRequest) this.priorityRequests.getFirst();
                      var15 != null && ~var13 != ~var15.subnodeKey;
                      var15 = (OndemandFileRequest) this.priorityRequests.getNext()) {
                    }
                  } else {
                    for (
                      var15 = (OndemandFileRequest) this.normalRequests.getFirst();
                      null != var15 && ~var15.subnodeKey != ~var13;
                      var15 = (OndemandFileRequest) this.normalRequests.getNext()) {
                    }
                  }

                  if (null == var15) {
                    throw new IOException();
                  }

                  int var16 = compression != 0 ? 9 : 5;
                  this.currentRequest = var15;
                  this.currentRequest.buffer =
                    new Buffer(length - (-var16 - this.currentRequest.aByte4064));
                  this.currentRequest.buffer.writeByte(compression);
                  this.currentRequest.buffer.writeInt(length);
                  this.currentRequest.anInt4067 = 8;
                  this.aClass3_Sub30_1008.position = 0;
                }
              }
            }
          }

          return true;
        } catch (IOException var19) {
          try {
            this.socketStream.destroy();
          } catch (Exception var17) {
          }

          this.anInt1010 = -2;
          ++this.anInt1011;
          this.socketStream = null;
          return 0 == this.method1253(4) && ~this.method1246(11706) == -1;
        }
      }
    } catch (RuntimeException var20) {
      throw AbstractGameWorld.cascadeException(var20, "jb.H(" + var1 + ')');
    }
  }

  final void drop(boolean var1) {
    try {
      if (this.socketStream != null) {
        try {
          this.buffer.position = 0;
          if (!var1) {
            this.method1256((byte) 21);
          }

          this.buffer.writeByte(7);
          this.buffer.writeMedium(0);
          this.socketStream.write(this.buffer.bytes, 0, 4);
        } catch (IOException var5) {
          try {
            this.socketStream.destroy();
          } catch (Exception var4) {
          }

          ++this.anInt1011;
          this.anInt1010 = -2;
          this.socketStream = null;
        }

      }
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6, "jb.O(" + var1 + ')');
    }
  }

  private final int method1246(int var1) {
    try {
      if (var1 != 11706) {
        aClass3_Sub28_Sub16Array996 = null;
      }

      return this.aClass13_1001.size() - -this.normalRequests.size();
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "jb.K(" + var1 + ')');
    }
  }

  final void writeStatus(boolean var1, boolean var2) {
    try {
      if (var2) {
        if (null != this.socketStream) {
          try {
            this.buffer.position = 0;
            this.buffer.writeByte(var1 ? 2 : 3);
            this.buffer.writeMedium(0);
            this.socketStream.write(this.buffer.bytes, 0, 4);
          } catch (IOException var6) {
            try {
              this.socketStream.destroy();
            } catch (Exception var5) {
            }

            ++this.anInt1011;
            this.anInt1010 = -2;
            this.socketStream = null;
          }

        }
      }
    } catch (RuntimeException var7) {
      throw AbstractGameWorld.cascadeException(var7, "jb.B(" + var1 + ',' + var2 + ')');
    }
  }

  final void method1248(int var1) {
    try {
      if (var1 != -29340) {
        this.method1246(-28);
      }

      if (this.socketStream != null) {
        this.socketStream.method1467();
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "jb.P(" + var1 + ')');
    }
  }

  final void setSocket(boolean var1, SocketStream var2) {
    try {
      if (null != this.socketStream) {
        try {
          this.socketStream.destroy();
        } catch (Exception var8) {
        }

        this.socketStream = null;
      }

      this.socketStream = var2;
      this.method1256((byte) -77);
      this.writeStatus(var1, true);
      this.aClass3_Sub30_1008.position = 0;
      this.currentRequest = null;

      while (true) {
        OndemandFileRequest var4 = (OndemandFileRequest) this.priorityRequests.poll();
        if (null == var4) {
          while (true) {
            var4 = (OndemandFileRequest) this.normalRequests.poll();
            if (var4 == null) {
              if (this.encryptionKey != 0) {
                try {
                  this.buffer.position = 0;
                  this.buffer.writeByte(4);
                  this.buffer.writeByte(this.encryptionKey);
                  this.buffer.writeShort(0);
                  this.socketStream.write(this.buffer.bytes, 0, 4);
                } catch (IOException var7) {
                  try {
                    this.socketStream.destroy();
                  } catch (Exception var6) {
                  }

                  this.anInt1010 = -2;
                  ++this.anInt1011;
                  this.socketStream = null;
                }
              }

              this.timeDiff = 0;
              this.lastUpdatedTime = Time.getCurrentTimeMillis();
              return;
            }

            this.aClass13_1001.addLast(var4);
          }
        }

        this.aClass13_993.addLast(var4);
      }
    } catch (RuntimeException var9) {
      throw AbstractGameWorld.cascadeException(var9,
        "jb.M(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
    }
  }

  final boolean method1251(byte var1) {
    try {
      int var2 = 33 % ((2 - var1) / 58);
      return 20 <= this.method1253(4);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "jb.L(" + var1 + ')');
    }
  }

  final void method1252(byte var1) {
    try {
      int var2 = -116 / ((var1 - 45) / 51);

      try {
        this.socketStream.destroy();
      } catch (Exception var4) {
      }

      this.anInt1010 = -1;
      this.encryptionKey = (byte) ((int) (255.0D * Math.random() + 1.0D));
      this.socketStream = null;
      ++this.anInt1011;
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5, "jb.A(" + var1 + ')');
    }
  }

  final int method1253(int var1) {
    try {
      if (var1 != 4) {
        this.method1252((byte) -45);
      }

      return this.aClass13_993.size() - -this.priorityRequests.size();
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "jb.C(" + var1 + ')');
    }
  }

  final void shutdown(boolean var1) {
    try {
      if (this.socketStream != null) {
        this.socketStream.destroy();
      }

      if (var1) {
        this.writeStatus(true, false);
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "jb.D(" + var1 + ')');
    }
  }

  final OndemandFileRequest request(int var1, int var2, byte var3, int var4, boolean var5) {
    try {
      OndemandFileRequest var8 = new OndemandFileRequest();
      long var6 = (long) (var4 + (var2 << 16));
      var8.aBoolean3628 = var5;
      var8.subnodeKey = var6;
      var8.aByte4064 = var3;
      int var9 = 120 / ((63 - var1) / 47);
      if (var5) {
        if (~this.method1253(4) <= -21) {
          throw new RuntimeException();
        }

        this.aClass13_993.addLast(var8);
      } else {
        if (this.method1246(11706) >= 20) {
          throw new RuntimeException();
        }

        this.aClass13_1001.addLast(var8);
      }

      return var8;
    } catch (RuntimeException var10) {
      throw AbstractGameWorld.cascadeException(var10,
        "jb.I(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
    }
  }

  private final void method1256(byte var1) {
    try {
      if (this.socketStream != null) {
        if (var1 == -77) {
          try {
            this.buffer.position = 0;
            this.buffer.writeByte(6);
            this.buffer.writeMedium(3);
            this.socketStream.write(this.buffer.bytes, 0, 4);
          } catch (IOException var5) {
            try {
              this.socketStream.destroy();
            } catch (Exception var4) {
            }

            ++this.anInt1011;
            this.socketStream = null;
            this.anInt1010 = -2;
          }

        }
      }
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6, "jb.J(" + var1 + ')');
    }
  }

  public static void method1242(byte var0) {
    try {
      aClass3_Sub28_Sub16Array996 = null;
      if (var0 != -88) {
        method1250(-72, true);
      }

      aClass94_995 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "jb.G(" + var0 + ')');
    }
  }

  static final SomethingVolume15 method1245(int var0, FileUnpacker var1, int var2) {
    try {
      if (var0 <= 12) {
        anInt1002 = 107;
      }

      byte[] var3 = var1.getBytes(var2);
      return var3 != null ? new SomethingVolume15(var3) : null;
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "jb.F(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
    }
  }

  static final void method1250(int var0, boolean var1) {
    try {
      StringNode0.aByteArrayArrayArray2339 = null;
      AbstractGameWorld.anIntArrayArrayArray720 = null;
      if (var0 < 14) {
        method1250(10, true);
      }

      SomethingWorldMapy.aClass11_3551 = null;
      RenderAnimation.aByteArrayArrayArray383 = null;
      DummyClass51.anIntArray1161 = null;
      ClientScriptCall.aByteArrayArrayArray2452 = null;
      if (var1 && null != Buffer.aClass3_Sub28_Sub3_2600) {
        TextureSampler4.aClass94_3220 = Buffer.aClass3_Sub28_Sub3_2600.aClass94_3561;
      } else {
        TextureSampler4.aClass94_3220 = null;
      }

      HuffmanEncoder.aByteArrayArrayArray640 = null;
      TextureSampler29.aByteArrayArrayArray3390 = null;
      PlayerVariable.anIntArrayArrayArray558 = null;
      AbstractMouseWheel.anIntArrayArrayArray1903 = null;
      GameObject.anInt2737 = 0;
      Buffer.aClass3_Sub28_Sub3_2600 = null;
      DummyClass51.aClass61_1162.clear(-108);
      DummyClass25.aClass131_1624 = null;
      TextureSampler13.anInt3362 = -1;
      SomethingTexture1.aClass33_2648 = null;
      CollisionMap.aClass33_1305 = null;
      SocketStream.aClass33_1238 = null;
      DummyClass12.aClass33_2034 = null;
      Something3d2.aClass33_3019 = null;
      DummyClass54.aClass33_1399 = null;
      SomethingTexture1.aClass33_2637 = null;
      DummyClass25.aClass33_1626 = null;
      HuffmanEncoder.aClass3_Sub28_Sub16_637 = null;
      ProceduralTexture.anInt1150 = -1;
      TextureSampler4.aClass3_Sub28_Sub16_Sub2_3221 = null;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "jb.E(" + var0 + ',' + var1 + ')');
    }
  }

}
