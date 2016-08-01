final class FileRequester extends AbstractFileRequester {

  private static GameString aClass94_2960 =
    SpawnedGameObject.createString("Loading interfaces )2 ");
  static GameBuffer loginBuffer = new GameBuffer(5000);
  static GameString aClass94_2945 = SpawnedGameObject.createString(
    "Votre liste d(Wamis est pleine (X100 noms maximum pour la version gratuite et 200 pour les abonn-Bs(Y)3");
  static GameString aClass94_2951 = SpawnedGameObject.createString("k");
  static int[] anIntArray2952 = new int[128];
  static int anInt2958 = 0;
  static GameString aClass94_2959 = SpawnedGameObject.createString("mapfunction");
  static GameString aClass94_2961 = aClass94_2960;
  private FileCache aClass41_2943;
  private FileTable aClass62_2944;
  private HashTable aClass130_2946 = new HashTable(16);
  private int anInt2947;
  private int anInt2948 = 0;
  private byte[] aByteArray2949;
  private AbstractFileRequest aClass3_Sub28_Sub10_2950;
  private OndemandRequester aClass66_2953;
  private FileCache aClass41_2954;
  private int anInt2955;
  private FileCacheRequester aClass73_2956;
  private int anInt2957;
  private boolean aBoolean2962;
  private Deque aClass61_2963 = new Deque();
  private int anInt2964 = 0;
  private boolean aBoolean2965;
  private Deque aClass61_2966;
  private long aLong2967 = 0L;
  private boolean aBoolean2968;


  FileRequester(int var1, FileCache var2, FileCache var3, OndemandRequester var4,
                FileCacheRequester var5, int var6, int var7, boolean var8) {
    try {
      this.anInt2957 = var1;
      this.aClass41_2954 = var2;
      if (this.aClass41_2954 != null) {
        this.aBoolean2962 = true;
        this.aClass61_2966 = new Deque();
      } else {
        this.aBoolean2962 = false;
      }

      this.aClass73_2956 = var5;
      this.anInt2955 = var6;
      this.aBoolean2968 = var8;
      this.aClass41_2943 = var3;
      this.aClass66_2953 = var4;
      this.anInt2947 = var7;
      if (null != this.aClass41_2943) {
        this.aClass3_Sub28_Sub10_2950 =
          this.aClass73_2956.method1309(this.aClass41_2943, (byte) 113, this.anInt2957);
      }

    } catch (RuntimeException var10) {
      throw AbstractGameWorld.cascadeException(var10,
        "bg.<init>(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + (var3 != null ?
          "{...}" :
          "null") + ',' + (var4 != null ? "{...}" : "null") + ',' + (var5 != null ?
          "{...}" :
          "null") + ',' + var6 + ',' + var7 + ',' + var8 + ')');
    }
  }

  final FileTable method2094(int var1) {
    try {
      if (this.aClass62_2944 != null) {
        return this.aClass62_2944;
      } else if (var1 != 0) {
        return null;
      } else {
        if (null == this.aClass3_Sub28_Sub10_2950) {
          if (this.aClass66_2953.method1251((byte) 73)) {
            return null;
          }

          this.aClass3_Sub28_Sub10_2950 =
            this.aClass66_2953.request(var1 ^ 115, 255, (byte) 0, this.anInt2957, true);
        }

        if (this.aClass3_Sub28_Sub10_2950.aBoolean3632) {
          return null;
        } else {
          byte[] var2 = this.aClass3_Sub28_Sub10_2950.method587(false);
          if (this.aClass3_Sub28_Sub10_2950 instanceof FileCacheRequest) {
            try {
              if (var2 == null) {
                throw new RuntimeException();
              }

              this.aClass62_2944 = new FileTable(var2, this.anInt2955);
              if (~this.anInt2947 != ~this.aClass62_2944.version) {
                throw new RuntimeException();
              }
            } catch (RuntimeException var4) {
              this.aClass62_2944 = null;
              if (this.aClass66_2953.method1251((byte) 124)) {
                this.aClass3_Sub28_Sub10_2950 = null;
              } else {
                this.aClass3_Sub28_Sub10_2950 =
                  this.aClass66_2953.request(-81, 255, (byte) 0, this.anInt2957, true);
              }

              return null;
            }
          } else {
            try {
              if (var2 == null) {
                throw new RuntimeException();
              }

              this.aClass62_2944 = new FileTable(var2, this.anInt2955);
            } catch (RuntimeException var5) {
              this.aClass66_2953.method1252((byte) -107);
              this.aClass62_2944 = null;
              if (!this.aClass66_2953.method1251((byte) -71)) {
                this.aClass3_Sub28_Sub10_2950 =
                  this.aClass66_2953.request(var1 + 120, 255, (byte) 0, this.anInt2957, true);
              } else {
                this.aClass3_Sub28_Sub10_2950 = null;
              }

              return null;
            }

            if (this.aClass41_2943 != null) {
              this.aClass73_2956.method1305(this.aClass41_2943, 2, var2, this.anInt2957);
            }
          }

          if (null != this.aClass41_2954) {
            this.aByteArray2949 = new byte[this.aClass62_2944.anInt960];
            this.anInt2948 = 0;
          }

          this.aClass3_Sub28_Sub10_2950 = null;
          return this.aClass62_2944;
        }
      }
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6, "bg.B(" + var1 + ')');
    }
  }

  final void method2095(int var1, int var2) {
    try {
      if (null != this.aClass41_2954) {
        Node var3;
        for (
          var3 = this.aClass61_2963.getFirst(); null != var3; var3 = this.aClass61_2963.getNext()) {
          if (~var3.key == ~((long) var1)) {
            return;
          }
        }

        int var4 = -66 / ((var2 - 53) / 56);
        var3 = new Node();
        var3.key = (long) var1;
        this.aClass61_2963.addLast(var3);
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5, "bg.H(" + var1 + ',' + var2 + ')');
    }
  }

  final int method2097(int var1, int var2) {
    try {
      if (var2 != '\uffff') {
        this.anInt2964 = 25;
      }

      AbstractFileRequest var3 = (AbstractFileRequest) this.aClass130_2946.get((long) var1);
      return null != var3 ? var3.method586(false) : 0;
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "bg.L(" + var1 + ',' + var2 + ')');
    }
  }

  final byte[] method2098(int var1, int var2) {
    try {
      AbstractFileRequest var3 = this.method2109(var2, var1, 103);
      if (var3 == null) {
        return null;
      } else {
        byte[] var4 = var3.method587(false);
        var3.unlinkNode();
        return var4;
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5, "bg.K(" + var1 + ',' + var2 + ')');
    }
  }

  final void method2101(boolean var1) {
    try {
      if (this.aClass41_2954 != null) {
        this.aBoolean2965 = var1;
        if (this.aClass61_2966 == null) {
          this.aClass61_2966 = new Deque();
        }

      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "bg.A(" + var1 + ')');
    }
  }

  final int method2102(int var1) {
    try {
      if (var1 != 0) {
        this.method2106(-4);
      }

      return this.anInt2948;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "bg.I(" + var1 + ')');
    }
  }

  final int method2106(int var1) {
    try {
      if (null != this.aClass62_2944) {
        if (this.aBoolean2962) {
          Node var2 = this.aClass61_2966.getFirst();
          if (null != var2) {
            if (var1 != 1) {
              this.anInt2964 = -91;
            }

            return (int) var2.key;
          } else {
            return 0;
          }
        } else {
          return this.aClass62_2944.anInt947;
        }
      } else {
        return 0;
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "bg.O(" + var1 + ')');
    }
  }

  final void method2107(boolean var1) {
    try {
      if (var1) {
        if (null != this.aClass61_2966) {
          if (this.method2094(0) == null) {
            return;
          }

          boolean var2;
          Node var3;
          int var4;
          if (!this.aBoolean2962) {
            if (!this.aBoolean2965) {
              this.aClass61_2966 = null;
            } else {
              var2 = true;

              for (
                var3 = this.aClass61_2966.getFirst();
                var3 != null; var3 = this.aClass61_2966.getNext()) {
                var4 = (int) var3.key;
                if (this.aByteArray2949[var4] != 1) {
                  this.method2109(2, var4, 96);
                }

                if (this.aByteArray2949[var4] == 1) {
                  var3.unlinkNode();
                } else {
                  var2 = false;
                }
              }

              while (~this.aClass62_2944.unpackedSizes.length < ~this.anInt2964) {
                if (-1 != ~this.aClass62_2944.unpackedSizes[this.anInt2964]) {
                  if (this.aClass66_2953.method1241(-30064)) {
                    var2 = false;
                    break;
                  }

                  if (1 != this.aByteArray2949[this.anInt2964]) {
                    this.method2109(2, this.anInt2964, 47);
                  }

                  if (-2 != ~this.aByteArray2949[this.anInt2964]) {
                    var3 = new Node();
                    var3.key = (long) this.anInt2964;
                    this.aClass61_2966.addLast(var3);
                    var2 = false;
                  }

                  ++this.anInt2964;
                } else {
                  ++this.anInt2964;
                }
              }

              if (var2) {
                this.anInt2964 = 0;
                this.aBoolean2965 = false;
              }
            }
          } else {
            var2 = true;

            for (
              var3 = this.aClass61_2966.getFirst();
              null != var3; var3 = this.aClass61_2966.getNext()) {
              var4 = (int) var3.key;
              if (~this.aByteArray2949[var4] == -1) {
                this.method2109(1, var4, 51);
              }

              if (~this.aByteArray2949[var4] != -1) {
                var3.unlinkNode();
              } else {
                var2 = false;
              }
            }

            while (this.aClass62_2944.unpackedSizes.length > this.anInt2964) {
              if (~this.aClass62_2944.unpackedSizes[this.anInt2964] == -1) {
                ++this.anInt2964;
              } else {
                if (-251 >= ~this.aClass73_2956.anInt1087) {
                  var2 = false;
                  break;
                }

                if (0 == this.aByteArray2949[this.anInt2964]) {
                  this.method2109(1, this.anInt2964, 99);
                }

                if (-1 == ~this.aByteArray2949[this.anInt2964]) {
                  var2 = false;
                  var3 = new Node();
                  var3.key = (long) this.anInt2964;
                  this.aClass61_2966.addLast(var3);
                }

                ++this.anInt2964;
              }
            }

            if (var2) {
              this.aBoolean2962 = false;
              this.anInt2964 = 0;
            }
          }
        }

        if (this.aBoolean2968 && this.aLong2967 <= Time.getCurrentTimeMillis()) {
          for (AbstractFileRequest var6 = (AbstractFileRequest) this.aClass130_2946.getFirst(71);
               var6 != null; var6 = (AbstractFileRequest) this.aClass130_2946.getNext(-115)) {
            if (!var6.aBoolean3632) {
              if (var6.aBoolean3635) {
                if (!var6.aBoolean3628) {
                  throw new RuntimeException();
                }

                var6.unlinkNode();
              } else {
                var6.aBoolean3635 = true;
              }
            }
          }

          this.aLong2967 = 1000L + Time.getCurrentTimeMillis();
        }

      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5, "bg.J(" + var1 + ')');
    }
  }

  final int method2108(byte var1) {
    try {
      if (this.aClass62_2944 != null) {
        if (var1 != 1) {
          anInt2958 = 100;
        }

        return this.aClass62_2944.anInt947;
      } else {
        return 0;
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "bg.M(" + var1 + ')');
    }
  }

  private final AbstractFileRequest method2109(int var1, int var2, int var3) {
    try {
      Object var4 = this.aClass130_2946.get((long) var2);
      if (null != var4 && ~var1 == -1 && !((AbstractFileRequest) var4).aBoolean3628
        && ((AbstractFileRequest) var4).aBoolean3632) {
        ((AbstractFileRequest) var4).unlinkNode();
        var4 = null;
      }

      if (null == var4) {
        if (0 == var1) {
          if (null != this.aClass41_2954 && ~this.aByteArray2949[var2] != 0) {
            var4 = this.aClass73_2956.method1309(this.aClass41_2954, (byte) 106, var2);
          } else {
            if (this.aClass66_2953.method1251((byte) -83)) {
              return null;
            }

            var4 = this.aClass66_2953.request(-51, this.anInt2957, (byte) 2, var2, true);
          }
        } else if (1 != var1) {
          if (~var1 != -3) {
            throw new RuntimeException();
          }

          if (this.aClass41_2954 == null) {
            throw new RuntimeException();
          }

          if (~this.aByteArray2949[var2] != 0) {
            throw new RuntimeException();
          }

          if (this.aClass66_2953.method1241(-30064)) {
            return null;
          }

          var4 = this.aClass66_2953.request(-37, this.anInt2957, (byte) 2, var2, false);
        } else {
          if (this.aClass41_2954 == null) {
            throw new RuntimeException();
          }

          var4 = this.aClass73_2956.method1307(var2, -27447, this.aClass41_2954);
        }

        this.aClass130_2946.put((long) var2, (Node) var4);
      }

      if (((AbstractFileRequest) var4).aBoolean3632) {
        return null;
      } else {
        byte[] var5 = ((AbstractFileRequest) var4).method587(false);
        int var6 = -57 % ((var3 - -10) / 55);
        int var7;
        OndemandFileRequest var12;
        if (var4 instanceof FileCacheRequest) {
          try {
            if (var5 != null && ~var5.length < -3) {
              TextureSampler24.aCRC32_3143.reset();
              TextureSampler24.aCRC32_3143.update(var5, 0, -2 + var5.length);
              var7 = (int) TextureSampler24.aCRC32_3143.getValue();
              if (this.aClass62_2944.anIntArray945[var2] != var7) {
                throw new RuntimeException();
              } else {
                int var8 =
                  (var5[-2 + var5.length] << 8 & '\uff00') - -(255 & var5[-1 + var5.length]);
                if (~var8 != ~('\uffff' & this.aClass62_2944.anIntArray958[var2])) {
                  throw new RuntimeException();
                } else {
                  if (1 != this.aByteArray2949[var2]) {
                    if (-1 != ~this.aByteArray2949[var2]) {
                    }

                    ++this.anInt2948;
                    this.aByteArray2949[var2] = 1;
                  }

                  if (!((AbstractFileRequest) var4).aBoolean3628) {
                    ((AbstractFileRequest) var4).unlinkNode();
                  }

                  return (AbstractFileRequest) var4;
                }
              }
            } else {
              throw new RuntimeException();
            }
          } catch (Exception var9) {
            this.aByteArray2949[var2] = -1;
            ((AbstractFileRequest) var4).unlinkNode();
            if (((AbstractFileRequest) var4).aBoolean3628 && !this.aClass66_2953.method1251(
              (byte) -78)) {
              var12 = this.aClass66_2953.request(-13, this.anInt2957, (byte) 2, var2, true);
              this.aClass130_2946.put((long) var2, var12);
            }

            return null;
          }
        } else {
          try {
            if (null == var5 || -3 <= ~var5.length) {
              throw new RuntimeException();
            }

            TextureSampler24.aCRC32_3143.reset();
            TextureSampler24.aCRC32_3143.update(var5, 0, var5.length - 2);
            var7 = (int) TextureSampler24.aCRC32_3143.getValue();
            if (~this.aClass62_2944.anIntArray945[var2] != ~var7) {
              throw new RuntimeException();
            }

            this.aClass66_2953.anInt1011 = 0;
            this.aClass66_2953.anInt1010 = 0;
          } catch (RuntimeException var10) {
            this.aClass66_2953.method1252((byte) -67);
            ((AbstractFileRequest) var4).unlinkNode();
            if (((AbstractFileRequest) var4).aBoolean3628 && !this.aClass66_2953.method1251(
              (byte) 90)) {
              var12 = this.aClass66_2953.request(112, this.anInt2957, (byte) 2, var2, true);
              this.aClass130_2946.put((long) var2, var12);
            }

            return null;
          }

          var5[var5.length + -2] = (byte) (this.aClass62_2944.anIntArray958[var2] >>> 8);
          var5[var5.length - 1] = (byte) this.aClass62_2944.anIntArray958[var2];
          if (null != this.aClass41_2954) {
            this.aClass73_2956.method1305(this.aClass41_2954, 2, var5, var2);
            if (1 != this.aByteArray2949[var2]) {
              ++this.anInt2948;
              this.aByteArray2949[var2] = 1;
            }
          }

          if (!((AbstractFileRequest) var4).aBoolean3628) {
            ((AbstractFileRequest) var4).unlinkNode();
          }

          return (AbstractFileRequest) var4;
        }
      }
    } catch (RuntimeException var11) {
      throw AbstractGameWorld.cascadeException(var11,
        "bg.C(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  final void method2110(int var1) {
    try {
      if (this.aClass61_2966 != null) {
        if (null != this.method2094(var1)) {
          for (Node var2 = this.aClass61_2963.getFirst();
               null != var2; var2 = this.aClass61_2963.getNext()) {
            int var3 = (int) var2.key;
            if (0 <= var3 && this.aClass62_2944.anInt960 > var3
              && ~this.aClass62_2944.unpackedSizes[var3] != -1) {
              if (this.aByteArray2949[var3] == 0) {
                this.method2109(1, var3, var1 + 80);
              }

              if (-1 == this.aByteArray2949[var3]) {
                this.method2109(2, var3, var1 + 78);
              }

              if (~this.aByteArray2949[var3] == -2) {
                var2.unlinkNode();
              }
            } else {
              var2.unlinkNode();
            }
          }

        }
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "bg.D(" + var1 + ')');
    }
  }

  final int method2111(int var1) {
    try {
      int var2 = -96 / ((20 - var1) / 33);
      return null != this.method2094(0) ?
        100 :
        (null == this.aClass3_Sub28_Sub10_2950 ?
          0 :
          this.aClass3_Sub28_Sub10_2950.method586(false));
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "bg.E(" + var1 + ')');
    }
  }

  static final void method2100(byte var0) {
    try {
      SpotAnimationConfig.gameBuffer.method807((byte) 118);
      int var1 = SpotAnimationConfig.gameBuffer.readBits(1);
      if (-1 != ~var1) {
        int var2 = SpotAnimationConfig.gameBuffer.readBits(2);
        if (0 != var2) {
          int var3 = -112 / ((var0 - 26) / 40);
          int var4;
          int var5;
          if (~var2 == -2) {
            var4 = SpotAnimationConfig.gameBuffer.readBits(3);
            TextureCache.localPlayer.method1968(1, (byte) -128, var4);
            var5 = SpotAnimationConfig.gameBuffer.readBits(1);
            if (-2 == ~var5) {
              DummyClass60.anIntArray441[OndemandRequester.anInt997++] = 2047;
            }

          } else if (2 != var2) {
            if (-4 == ~var2) {
              var4 = SpotAnimationConfig.gameBuffer.readBits(7);
              var5 = SpotAnimationConfig.gameBuffer.readBits(1);
              GameWorldSomething.currentPlane = SpotAnimationConfig.gameBuffer.readBits(2);
              int var6 = SpotAnimationConfig.gameBuffer.readBits(1);
              if (~var6 == -2) {
                DummyClass60.anIntArray441[OndemandRequester.anInt997++] = 2047;
              }

              int var7 = SpotAnimationConfig.gameBuffer.readBits(7);
              TextureCache.localPlayer.setPosition((byte) 126, var7, var5 == 1, var4);
            }
          } else {
            if (SpotAnimationConfig.gameBuffer.readBits(1) == 1) {
              var4 = SpotAnimationConfig.gameBuffer.readBits(3);
              TextureCache.localPlayer.method1968(2, (byte) -104, var4);
              var5 = SpotAnimationConfig.gameBuffer.readBits(3);
              TextureCache.localPlayer.method1968(2, (byte) -126, var5);
            } else {
              var4 = SpotAnimationConfig.gameBuffer.readBits(3);
              TextureCache.localPlayer.method1968(0, (byte) -109, var4);
            }

            var4 = SpotAnimationConfig.gameBuffer.readBits(1);
            if (var4 == 1) {
              DummyClass60.anIntArray441[OndemandRequester.anInt997++] = 2047;
            }

          }
        } else {
          DummyClass60.anIntArray441[OndemandRequester.anInt997++] = 2047;
        }
      }
    } catch (RuntimeException var8) {
      throw AbstractGameWorld.cascadeException(var8, "bg.G(" + var0 + ')');
    }
  }

  static final boolean method2103(int var0, int var1) {
    try {
      return var1 >= -78 ?
        true :
        -199 == ~var0 || 230 == var0 || var0 == 156 || ~var0 == -141 || 223 == var0;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "bg.P(" + var0 + ',' + var1 + ')');
    }
  }

  static final void method2104(Widget var0, boolean var1, int var2) {
    try {
      int var3 = 57 % ((var2 - -58) / 47);
      int var4 = var0.anInt240 != 0 ? var0.anInt240 : var0.anInt168;
      int var5 = -1 != ~var0.anInt252 ? var0.anInt252 : var0.anInt193;
      AbstractImageProducer.method2183(var0.anInt279, var1, var4, 235, var5,
        SceneNode.aClass11ArrayArray1834[var0.anInt279 >> 16]);
      if (var0.aClass11Array262 != null) {
        AbstractImageProducer.method2183(var0.anInt279, var1, var4, 235, var5,
          var0.aClass11Array262);
      }

      SomethingPacket151 var6 =
        (SomethingPacket151) TextureSampler23.aClass130_3208.get((long) var0.anInt279);
      if (var6 != null) {
        SomethingTexture4.method1352(var5, var1, -1, var6.anInt2602, var4);
      }

    } catch (RuntimeException var7) {
      throw AbstractGameWorld.cascadeException(var7,
        "bg.N(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ')');
    }
  }

  public static void method2105(boolean var0) {
    try {
      aClass94_2959 = null;
      aClass94_2951 = null;
      if (!var0) {
        anIntArray2952 = null;
        loginBuffer = null;
        aClass94_2960 = null;
        aClass94_2961 = null;
        aClass94_2945 = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "bg.F(" + var0 + ')');
    }
  }

}
