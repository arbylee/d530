final class NPC extends Mobile {

  private static GameString aClass94_3978 = SpawnedGameObject.createString("Dec");
  private static GameString aClass94_3980 = SpawnedGameObject.createString("Jul");
  private static GameString aClass94_3982 = SpawnedGameObject.createString("May");
  private static GameString aClass94_3983 = SpawnedGameObject.createString("Nov");
  private static GameString aClass94_3984 = SpawnedGameObject.createString("Mar");
  private static GameString aClass94_3987 = SpawnedGameObject.createString("flash3:");
  private static GameString aClass94_3989 = SpawnedGameObject.createString("Jan");
  private static GameString aClass94_3990 = SpawnedGameObject.createString("Feb");
  private static GameString aClass94_3996 = SpawnedGameObject.createString("Aug");
  private static GameString aClass94_3999 = SpawnedGameObject.createString("Apr");
  private static GameString aClass94_4000 = SpawnedGameObject.createString("Jun");
  private static GameString aClass94_4003 = SpawnedGameObject.createString("Sep");
  private static GameString aClass94_4004 = SpawnedGameObject.createString("Oct");
  static boolean aBoolean3975 = false;
  static AbstractDirectColorSprite[] aClass3_Sub28_Sub16Array3977;
  static float aFloat3979;
  static int[] anIntArray3986 = new int[32];
  static GameString aClass94_3991 = SpawnedGameObject.createString("ondulation:");
  static GameString aClass94_3992 = SpawnedGameObject.createString("loginscreen");
  static FileUnpacker fileUnpacker17;
  static FileUnpacker fileUnpacker15;
  static int anInt3995;
  static int[] anIntArray3997 = new int[] {19, 55, 38, 155, 255, 110, 137, 205, 76};
  static GameString aClass94_3998 = SpawnedGameObject.createString(":trade:");
  static int runesFileId;
  static int anInt4002 = 0;
  static GameString aClass94_3988 = aClass94_3987;
  static GameString aClass94_3981 = aClass94_3987;
  static GameString[] aClass94Array3985 = new GameString[] {
    aClass94_3989, aClass94_3990, aClass94_3984, aClass94_3999, aClass94_3982, aClass94_4000,
    aClass94_3980, aClass94_3996, aClass94_4003, aClass94_4004, aClass94_3983, aClass94_3978
  };
  NpcConfiguration config;

  protected final void finalize() {
  }

  final void method1867(int var1, int var2, int var3, int var4, int var5) {
    try {
      if (this.config == null) {
      }
    } catch (RuntimeException var7) {
      throw AbstractGameWorld.cascadeException(var7,
        "km.IB(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
    }
  }

  final void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8,
                  long var9, int var11, DummyClass0 var12) {
    try {
      if (this.config != null) {
        AnimationSequence var13 = 0 != ~this.animationId && -1 == ~this.anInt2828 ?
          GameClient.method45(this.animationId, (byte) -20) :
          null;
        AnimationSequence var14 =
          -1 != this.anInt2764 && (~this.anInt2764 != ~this.getRenderAnimationId(false).anInt368
            || var13 == null) ? GameClient.method45(this.anInt2764, (byte) -20) : null;
        AbstractModel var15 =
          this.config.method1476(this.aClass145Array2809, this.anInt2793, (byte) -116,
            this.anInt2813, this.anInt2776, this.anInt2760, this.anInt2832, var14, this.anInt2802,
            var13);
        if (var15 != null) {
          this.anInt2820 = var15.getMinimumY();
          NpcConfiguration var16 = this.config;
          if (null != var16.anIntArray1292) {
            var16 = var16.method1471((byte) -110);
          }

          AbstractModel var17;
          if (Projectile.aBoolean2910 && var16.aBoolean1249) {
            var17 = GameObject.method1957(this.config.aByte1287, this.aBoolean2810,
              null == var14 ? var13 : var14, this.anInt2819, this.config.aShort1256, this.anInt2829,
              this.config.aShort1286, this.config.size, var15, var1,
              null != var14 ? this.anInt2813 : this.anInt2832, this.anInt2831,
              this.config.aByte1275, (byte) -49);
            if (GlRenderer.useOpenGlRenderer) {
              float var18 = GlRenderer.method1852();
              float var19 = GlRenderer.method1839();
              GlRenderer.method1851();
              GlRenderer.method1825(var18, -150.0F + var19);
              var17.draw(0, var2, var3, var4, var5, var6, var7, var8, -1L, var11,
                this.aClass127_Sub1_2801);
              GlRenderer.method1830();
              GlRenderer.method1825(var18, var19);
            } else {
              var17.draw(0, var2, var3, var4, var5, var6, var7, var8, -1L, var11,
                this.aClass127_Sub1_2801);
            }
          }

          this.method1971(var15, (byte) -111);
          this.method1969((byte) 115, var15, var1);
          var17 = null;
          if (~this.anInt2842 != 0 && -1 != this.anInt2805) {
            SpotAnimationConfig var21 = RenderAnimation.method898((byte) 42, this.anInt2842);
            var17 = var21.method966(this.anInt2826, (byte) -30, this.anInt2805, this.anInt2761);
            if (var17 != null) {
              var17.method1897(0, -this.anInt2799, 0);
              if (var21.aBoolean536) {
                if (-1 != ~TextureSampler15.anInt3198) {
                  var17.method1896(TextureSampler15.anInt3198);
                }

                if (~Parameter.anInt3623 != -1) {
                  var17.method1886(Parameter.anInt3623);
                }

                if (0 != TextureSampler16.anInt3111) {
                  var17.method1897(0, TextureSampler16.anInt3111, 0);
                }
              }
            }
          }

          if (!GlRenderer.useOpenGlRenderer) {
            if (null != var17) {
              var15 = ((SoftwareModel) var15).method1943(var17);
            }

            if (this.config.size == 1) {
              var15.aBoolean2699 = true;
            }

            var15.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11,
              this.aClass127_Sub1_2801);
          } else {
            if (-2 == ~this.config.size) {
              var15.aBoolean2699 = true;
            }

            var15.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11,
              this.aClass127_Sub1_2801);
            if (var17 != null) {
              if (-2 == ~this.config.size) {
                var17.aBoolean2699 = true;
              }

              var17.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11,
                this.aClass127_Sub1_2801);
            }
          }

        }
      }
    } catch (RuntimeException var20) {
      throw AbstractGameWorld.cascadeException(var20,
        "km.IA(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ','
          + var7 + ',' + var8 + ',' + var9 + ',' + var11 + ',' + (var12 != null ? "{...}" : "null")
          + ')');
    }
  }

  final int getMinimumY() {
    try {
      return this.anInt2820;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "km.MA()");
    }
  }

  final boolean hasConfiguration(byte var1) {
    try {
      if (var1 != 17) {
        method1984(-101, -40, 63);
      }

      return null != this.config;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "km.L(" + var1 + ')');
    }
  }

  final int getRenderAnimationId() {
    try {
      if (AbstractImageProducer.gameId != 0 && this.config.anIntArray1292 != null) {
        NpcConfiguration var2 = this.config.method1471((byte) 21);
        if (var2 != null && 0 != ~var2.renderAnimationId) {
          return var2.renderAnimationId;
        }
      }

      return this.renderAnimationId;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "km.B()");
    }
  }

  final void setConfiguration(int var1, NpcConfiguration var2) {
    try {
      this.config = var2;
      if (var1 == -1) {
        if (this.aClass127_Sub1_2801 != null) {
          this.aClass127_Sub1_2801.method1759();
        }

      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "km.R(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
    }
  }

  public static void method1983(int var0) {
    try {
      anIntArray3986 = null;
      aClass94_3984 = null;
      aClass94_3983 = null;
      aClass94_3989 = null;
      if (var0 == -3) {
        fileUnpacker15 = null;
        anIntArray3997 = null;
        aClass94_4004 = null;
        aClass94_3991 = null;
        aClass94_3998 = null;
        aClass94_3999 = null;
        aClass3_Sub28_Sub16Array3977 = null;
        aClass94_3978 = null;
        aClass94_3992 = null;
        aClass94_3990 = null;
        aClass94_3996 = null;
        aClass94_3981 = null;
        fileUnpacker17 = null;
        aClass94_3987 = null;
        aClass94Array3985 = null;
        aClass94_3982 = null;
        aClass94_3988 = null;
        aClass94_3980 = null;
        aClass94_4003 = null;
        aClass94_4000 = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "km.N(" + var0 + ')');
    }
  }

  static final int method1984(int var0, int var1, int var2) {
    try {
      if (var1 != 38) {
        return 88;
      } else {
        int var3 = 57 * var2 + var0;
        var3 ^= var3 << 13;
        int var4 = Integer.MAX_VALUE & 1376312589 + (var3 * var3 * 15731 - -789221) * var3;
        return (var4 & 133802063) >> 19;
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "km.S(" + var0 + ',' + var1 + ',' + var2 + ')');
    }
  }

  static final byte[] method1985(int var0, Object var1, boolean var2) {
    try {
      if (var1 == null) {
        return null;
      } else if (var1 instanceof byte[]) {
        byte[] var5 = (byte[]) var1;
        return var2 ? SomethingSceneJ.method873((byte) 62, var5) : var5;
      } else {
        if (var0 > -118) {
          method1983(19);
        }

        if (!(var1 instanceof BufferObject)) {
          throw new IllegalArgumentException();
        } else {
          BufferObject var3 = (BufferObject) var1;
          return var3.get(26);
        }
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "km.Q(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
    }
  }

  static final boolean method1986(int var0) {
    try {
      if (var0 <= 22) {
        method1984(-48, 88, 31);
      }

      return GlRenderer.useOpenGlRenderer ? true : ClientScriptEnum.aBoolean3665;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "km.O(" + var0 + ')');
    }
  }

  static final boolean method1988(boolean var0) {
    try {
      if (var0) {
        aClass94_3980 = null;
      }

      try {
        if (~SomethingQuickChatK.anInt154 == -3) {
          if (MidiSomething.aClass3_Sub27_1154 == null) {
            MidiSomething.aClass3_Sub27_1154 =
              MidiFile.method517(DummyClass55.aClass153_1423, TextureSampler8.anInt3463,
                DummyClass22.anInt1741);
            if (null == MidiSomething.aClass3_Sub27_1154) {
              return false;
            }
          }

          if (SomethingQuickChat.aClass83_3579 == null) {
            SomethingQuickChat.aClass83_3579 =
              new MidiSomething(DummyClass59.soundEffects, Texture.midiInstruments);
          }

          if (DummyClass55.aClass3_Sub24_Sub4_1421.method470(MidiSomething.aClass3_Sub27_1154, -122,
            DummyClass23.aClass153_1661, SomethingQuickChat.aClass83_3579, 22050)) {
            DummyClass55.aClass3_Sub24_Sub4_1421.method471((byte) 53);
            DummyClass55.aClass3_Sub24_Sub4_1421.method506(128, TextureSampler36.anInt3423);
            DummyClass55.aClass3_Sub24_Sub4_1421.method490(AreaSoundEffect.aBoolean2311,
              MidiSomething.aClass3_Sub27_1154, 17774);
            SomethingQuickChatK.anInt154 = 0;
            MidiSomething.aClass3_Sub27_1154 = null;
            SomethingQuickChat.aClass83_3579 = null;
            DummyClass55.aClass153_1423 = null;
            return true;
          }
        }
      } catch (Exception var2) {
        var2.printStackTrace();
        DummyClass55.aClass3_Sub24_Sub4_1421.method505((byte) -128);
        DummyClass55.aClass153_1423 = null;
        MidiSomething.aClass3_Sub27_1154 = null;
        SomethingQuickChatK.anInt154 = 0;
        SomethingQuickChat.aClass83_3579 = null;
      }

      return false;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "km.P(" + var0 + ')');
    }
  }

}
