import java.awt.Component;

class AbstractAudioOutputStream {

  static int[] quadx0 = new int[100];
  static GameString aClass94_1970 = SpawnedGameObject.createString(":");
  static int anInt1971;
  static GameString aClass94_1974 = SpawnedGameObject.createString("Verbindung mit Update)2Server)3)3)3");
  static int[] anIntArray1976 = new int[] {1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0};
  static int anInt1977 = 0;
  static int[] otherKeyQueue = new int[128];
  int[] samples;
  int sampleRate;
  int sampleBufferSize;
  private int anInt1968 = 32;
  private long aLong1972 = Time.getCurrentTimeMillis();
  private AudioStreamEncoder aClass3_Sub24_1973;
  private long aLong1979 = 0L;
  private AudioStreamEncoder[] aClass3_Sub24Array1980 = new AudioStreamEncoder[8];
  private int anInt1981 = 0;
  private long pauseTime = 0L;
  private AudioStreamEncoder[] aClass3_Sub24Array1983 = new AudioStreamEncoder[8];
  private boolean paused = true;
  private int anInt1985 = 0;
  private int overflow;
  private int anInt1987 = 0;
  private int anInt1988 = 0;

  static final SomethingQuickChatK method2156(int var0, Buffer var1) {
    try {
      SomethingQuickChatK var2 = new SomethingQuickChatK();
      var2.anInt149 = var1.readUnsignedShort();
      if (var0 != 1024) {
        method2162(null, 34, 103, -93);
      }

      var2.aClass3_Sub28_Sub4_151 = StringNode.method733(12345678, var2.anInt149);
      return var2;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld
        .cascadeException(var3, "vh.M(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  static final void method2162(SceneNode var0, int var1, int var2, int var3) {
    SceneGraphTile var4;
    if (var2 < SocketStream.sceneWidth) {
      var4 = SomethingTexture1.sceneGraphTiles[var1][var2 + 1][var3];
      if (var4 != null && var4.aClass12_2230 != null && var4.aClass12_2230.aClass140_320
        .method1865()) {
        var0.method1866(var4.aClass12_2230.aClass140_320, 128, 0, 0, true);
      }
    }

    if (var3 < SocketStream.sceneWidth) {
      var4 = SomethingTexture1.sceneGraphTiles[var1][var2][var3 + 1];
      if (var4 != null && var4.aClass12_2230 != null && var4.aClass12_2230.aClass140_320
        .method1865()) {
        var0.method1866(var4.aClass12_2230.aClass140_320, 0, 0, 128, true);
      }
    }

    if (var2 < SocketStream.sceneWidth && var3 < TextureSampler17.sceneHeight) {
      var4 = SomethingTexture1.sceneGraphTiles[var1][var2 + 1][var3 + 1];
      if (var4 != null && var4.aClass12_2230 != null && var4.aClass12_2230.aClass140_320
        .method1865()) {
        var0.method1866(var4.aClass12_2230.aClass140_320, 128, 0, 128, true);
      }
    }

    if (var2 < SocketStream.sceneWidth && var3 > 0) {
      var4 = SomethingTexture1.sceneGraphTiles[var1][var2 + 1][var3 - 1];
      if (var4 != null && var4.aClass12_2230 != null && var4.aClass12_2230.aClass140_320
        .method1865()) {
        var0.method1866(var4.aClass12_2230.aClass140_320, 128, 0, -128, true);
      }
    }

  }

  public static void method2165(int var0) {
    try {
      aClass94_1970 = null;
      aClass94_1974 = null;
      anIntArray1976 = null;
      if (var0 != 0) {
        method2165(-20);
      }

      quadx0 = null;
      otherKeyQueue = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "vh.G(" + var0 + ')');
    }
  }

  void write() throws Exception {
  }

  void setBufferSize(int var1) throws Exception {
  }

  void flush() throws Exception {
  }

  private final void fill(int[] samples, int len) {
    int length = len;
    if (GameString.stereo) {
      length = len << 1;
    }

    ArrayUtils.clear(samples, 0, length);
    this.anInt1987 -= len;
    if (this.aClass3_Sub24_1973 != null && this.anInt1987 <= 0) {
      this.anInt1987 += DummyClass60.sampleRate >> 4;
      TriChromaticImageCache.method1591(true, this.aClass3_Sub24_1973);
      this.method2155(this.aClass3_Sub24_1973, this.aClass3_Sub24_1973.method412(), (byte) -24);
      int var4 = 0;
      int var5 = 255;

      int var6;
      label101:
      for (var6 = 7; var5 != 0; --var6) {
        int var7;
        int var8;
        if (var6 < 0) {
          var7 = var6 & 3;
          var8 = -(var6 >> 2);
        } else {
          var7 = var6;
          var8 = 0;
        }

        for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
          if ((var9 & 1) != 0) {
            var5 &= ~(1 << var7);
            AudioStreamEncoder var10 = null;
            AudioStreamEncoder var11 = this.aClass3_Sub24Array1980[var7];

            while (var11 != null) {
              AbstractSomethingMusic var12 = var11.aClass3_Sub12_2544;
              if (var12 != null && var12.anInt2374 > var8) {
                var5 |= 1 << var7;
                var10 = var11;
                var11 = var11.aClass3_Sub24_2546;
              } else {
                var11.aBoolean2545 = true;
                int var13 = var11.method409();
                var4 += var13;
                if (var12 != null) {
                  var12.anInt2374 += var13;
                }

                if (var4 >= this.anInt1968) {
                  break label101;
                }

                AudioStreamEncoder var14 = var11.method411();
                if (var14 != null) {
                  for (int var15 = var11.anInt2543; var14 != null; var14 = var11.method414()) {
                    this.method2155(var14, var15 * var14.method412() >> 8, (byte) -24);
                  }
                }

                AudioStreamEncoder var18 = var11.aClass3_Sub24_2546;
                var11.aClass3_Sub24_2546 = null;
                if (var10 == null) {
                  this.aClass3_Sub24Array1980[var7] = var18;
                } else {
                  var10.aClass3_Sub24_2546 = var18;
                }

                if (var18 == null) {
                  this.aClass3_Sub24Array1983[var7] = var10;
                }

                var11 = var18;
              }
            }
          }

          var7 += 4;
          ++var8;
        }
      }

      for (var6 = 0; var6 < 8; ++var6) {
        AudioStreamEncoder var16 = this.aClass3_Sub24Array1980[var6];

        AudioStreamEncoder var17;
        for (
          this.aClass3_Sub24Array1980[var6] = this.aClass3_Sub24Array1983[var6] = null;
          var16 != null; var16 = var17) {
          var17 = var16.aClass3_Sub24_2546;
          var16.aClass3_Sub24_2546 = null;
        }
      }
    }

    if (this.anInt1987 < 0) {
      this.anInt1987 = 0;
    }

    if (this.aClass3_Sub24_1973 != null) {
      this.aClass3_Sub24_1973.method413(samples, 0, len);
    }

    this.aLong1972 = Time.getCurrentTimeMillis();
  }

  final synchronized void process(byte var1) {
    try {
      if (null != this.samples) {
        long start = Time.getCurrentTimeMillis();

        try {
          if (0L != this.pauseTime) {
            if (start < this.pauseTime) {
              return;
            }

            setBufferSize(sampleBufferSize);
            this.paused = true;
            this.pauseTime = 0L;
          }

          int amountBufferedSamples = getAmountBufferedSamples();
          if (this.anInt1981 < (this.anInt1985 - amountBufferedSamples)) {
            this.anInt1981 = this.anInt1985 - amountBufferedSamples;
          }

          int writeLen = sampleRate + this.overflow;
          if (writeLen + 256 > 16384) {
            writeLen = 16128;
          }

          if (sampleBufferSize < writeLen + 256) {
            sampleBufferSize += 1024;
            if (sampleBufferSize > 16384) {
              sampleBufferSize = 16384;
            }

            close();
            amountBufferedSamples = 0;
            setBufferSize(sampleBufferSize);
            if (sampleBufferSize < 256 + writeLen) {
              writeLen = this.sampleBufferSize - 256;
              overflow = writeLen - sampleRate;
            }

            paused = true;
          }

          while (writeLen > amountBufferedSamples) {
            amountBufferedSamples += 256;
            fill(samples, 256);
            write();
          }

          if (~start < ~this.aLong1979) {
            if (this.paused) {
              this.paused = false;
            } else {
              if (-1 == ~this.anInt1981 && ~this.anInt1988 == -1) {
                this.close();
                this.pauseTime = start + 2000L;
                return;
              }

              this.overflow = Math.min(this.anInt1988, this.anInt1981);
              this.anInt1988 = this.anInt1981;
            }

            this.aLong1979 = 2000L + start;
            this.anInt1981 = 0;
          }

          this.anInt1985 = amountBufferedSamples;
        } catch (Exception var7) {
          this.close();
          this.pauseTime = start + 2000L;
        }

        try {
          if (start > 500000L + this.aLong1972) {
            start = this.aLong1972;
          }

          if (var1 != -34) {
            return;
          }

          while (start > this.aLong1972 + 5000L) {
            this.method2161(256, 1);
            this.aLong1972 += (long) (256000 / DummyClass60.sampleRate);
          }
        } catch (Exception var6) {
          this.aLong1972 = start;
        }

      }
    } catch (RuntimeException var8) {
      throw AbstractGameWorld.cascadeException(var8, "vh.Q(" + var1 + ')');
    }
  }

  final synchronized void method2154(int var1, AudioStreamEncoder var2) {
    try {
      int var3 = -128 / ((var1 - -58) / 54);
      this.aClass3_Sub24_1973 = var2;
    } catch (RuntimeException var4) {
      throw AbstractGameWorld
        .cascadeException(var4, "vh.I(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
    }
  }

  private final void method2155(AudioStreamEncoder var1, int var2, byte var3) {
    try {
      if (var3 != -24) {
        this.method2155(null, -105, (byte) 87);
      }

      int var4 = var2 >> 5;
      AudioStreamEncoder var5 = this.aClass3_Sub24Array1983[var4];
      if (null == var5) {
        this.aClass3_Sub24Array1980[var4] = var1;
      } else {
        var5.aClass3_Sub24_2546 = var1;
      }

      this.aClass3_Sub24Array1983[var4] = var1;
      var1.anInt2543 = var2;
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "vh.H(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
    }
  }

  int getAmountBufferedSamples() throws Exception {
    try {
      return this.sampleBufferSize;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "vh.B()");
    }
  }

  final synchronized void method2158(byte var1) {
    try {
      this.paused = true;

      try {
        this.flush();
      } catch (Exception var3) {
        this.close();
        this.pauseTime = Time.getCurrentTimeMillis() + 2000L;
      }

      int var2 = 91 % ((var1 - 47) / 60);
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "vh.L(" + var1 + ')');
    }
  }

  final void pause() {
    try {
      this.paused = true;

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "vh.J()");
    }
  }

  void close() {
  }

  private final void method2161(int var1, int var2) {
    try {
      this.anInt1987 -= var1;
      if (0 > this.anInt1987) {
        this.anInt1987 = 0;
      }

      if (var2 != 1) {
        this.aLong1972 = -60L;
      }

      if (null != this.aClass3_Sub24_1973) {
        this.aClass3_Sub24_1973.method415(var1);
      }

    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "vh.K(" + var1 + ',' + var2 + ')');
    }
  }

  final synchronized void method2163(boolean var1) {
    try {
      if (null != DummyClass36.aClass15_2613) {
        boolean var2 = true;

        for (int var3 = 0; ~var3 > -3; ++var3) {
          if (this == DummyClass36.aClass15_2613.aClass155Array352[var3]) {
            DummyClass36.aClass15_2613.aClass155Array352[var3] = null;
          }

          if (null != DummyClass36.aClass15_2613.aClass155Array352[var3]) {
            var2 = false;
          }
        }

        if (var2) {
          DummyClass36.aClass15_2613.aBoolean345 = true;

          while (DummyClass36.aClass15_2613.aBoolean353) {
            TextureSampler25.sleep(50L);
          }

          DummyClass36.aClass15_2613 = null;
        }
      }

      this.close();
      this.samples = null;
      if (!var1) {
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "vh.P(" + var1 + ')');
    }
  }

  void bind(Component var1) throws Exception {
  }

}
