final class SomethingQuickChat extends SubNode {

  static int[] anIntArray3565 = new int[32];
  static int anInt3569;
  static ObjectCache aClass93_3572 = new ObjectCache(64);
  static GameString aClass94_3573 = SpawnedGameObject.createString(" )2> <col=00ffff>");
  static GameString TITLE_BACKGROUND = SpawnedGameObject.createString("titlebg");
  static GameString aClass94_3576 = SpawnedGameObject.createString("name_icons");
  static GameString aClass94_3577 = SpawnedGameObject.createString(": ");
  static MidiSomething aClass83_3579;
  private static GameString aClass94_3578 = SpawnedGameObject.createString("Loaded title screen");
  static GameString aClass94_3575 = aClass94_3578;
  int[] anIntArray3567;
  boolean aBoolean3568 = true;
  private int[] anIntArray3566;
  private int[][] anIntArrayArray3570;
  private GameString[] strings;

  public static void method547(int var0) {
    try {
      if (var0 != -2951) {
        aClass94_3576 = null;
      }

      aClass94_3578 = null;
      aClass93_3572 = null;
      aClass94_3575 = null;
      TITLE_BACKGROUND = null;
      aClass94_3577 = null;
      aClass94_3576 = null;
      aClass94_3573 = null;
      aClass83_3579 = null;
      anIntArray3565 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "cb.F(" + var0 + ')');
    }
  }

  static final void method551(int var0, int var1, int var2) {
    try {
      if (var0 == 0) {
        if (4 == var2 && !DummyHashTable.aBoolean1685) {
          var2 = 2;
          var1 = 2;
        }

        if (~DummyClass30.anInt453 == ~var2) {
          if (0 != var2 && var1 != TextureSampler37.anInt3263) {
            MapScene.anInterface5Array70[var2].set(var1);
            TextureSampler37.anInt3263 = var1;
          }
        } else {
          if (TextureSampler23.aBoolean3207) {
            return;
          }

          if (~DummyClass30.anInt453 != -1) {
            MapScene.anInterface5Array70[DummyClass30.anInt453].disable();
          }

          if (-1 != ~var2) {
            MaterialShader var3 = MapScene.anInterface5Array70[var2];
            var3.enable();
            var3.set(var1);
          }

          DummyClass30.anInt453 = var2;
          TextureSampler37.anInt3263 = var1;
        }

      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld
        .cascadeException(var4, "cb.A(" + var0 + ',' + var1 + ',' + var2 + ')');
    }
  }

  final void method545(Buffer var1, int[] var2, boolean var3) {
    try {
      if (!var3) {
        if (this.anIntArray3566 != null) {
          for (int var4 = 0; ~this.anIntArray3566.length < ~var4 && ~var4 > ~var2.length; ++var4) {
            int var5 = GameException.anIntArray2113[this.method550(89, var4)];
            if (~var5 < -1) {
              var1.method739(0, var5, (long) var2[var4]);
            }
          }

        }
      }
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "cb.O(" + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ','
          + var3 + ')');
    }
  }

  final void method546(Buffer var1, int var2) {
    try {
      while (true) {
        int var3 = var1.readUnsignedByte();
        if (0 == var3) {
          if (var2 != -1) {
            this.anIntArray3567 = null;
          }

          return;
        }

        this.method553(var1, var3, -14637);
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld
        .cascadeException(var4, "cb.D(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
    }
  }

  final void method548(int var1) {
    try {
      if (null != this.anIntArray3567) {
        for (int var2 = 0; ~this.anIntArray3567.length < ~var2; ++var2) {
          this.anIntArray3567[var2] =
            TextureSampler3.method308(this.anIntArray3567[var2], '\u8000');
        }
      }

      if (var1 != 60) {
        this.method552(true);
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "cb.Q(" + var1 + ')');
    }
  }

  final int method549(int var1, int var2, int var3) {
    try {
      if (var1 > -99) {
        aClass94_3577 = null;
      }

      return null != this.anIntArray3566 && var3 >= 0 && ~var3 >= ~this.anIntArray3566.length ?
        (this.anIntArrayArray3570[var3] != null && -1 >= ~var2
          && ~var2 >= ~this.anIntArrayArray3570[var3].length ?
          this.anIntArrayArray3570[var3][var2] :
          -1) :
        -1;
    } catch (RuntimeException var5) {
      throw AbstractGameWorld
        .cascadeException(var5, "cb.P(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  final int method550(int var1, int var2) {
    try {
      if (null != this.anIntArray3566 && -1 >= ~var2 && var2 <= this.anIntArray3566.length) {
        if (var1 <= 33) {
          aClass94_3578 = null;
        }

        return this.anIntArray3566[var2];
      } else {
        return -1;
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "cb.S(" + var1 + ',' + var2 + ')');
    }
  }

  final int method552(boolean var1) {
    try {
      return !var1 ? -22 : (this.anIntArray3566 != null ? this.anIntArray3566.length : 0);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "cb.E(" + var1 + ')');
    }
  }

  private final void method553(Buffer var1, int var2, int var3) {
    try {
      if (var3 != -14637) {
        this.method548(-20);
      }

      if (var2 != 1) {
        int var4;
        int var5;
        if (var2 != 2) {
          if (var2 != 3) {
            if (var2 == 4) {
              this.aBoolean3568 = false;
            }
          } else {
            var4 = var1.readUnsignedByte();
            this.anIntArray3566 = new int[var4];
            this.anIntArrayArray3570 = new int[var4][];

            for (var5 = 0; var4 > var5; ++var5) {
              int var6 = var1.readUnsignedShort();
              this.anIntArray3566[var5] = var6;
              this.anIntArrayArray3570[var5] =
                new int[AbstractAudioOutputStream.anIntArray1976[var6]];

              for (int var7 = 0; AbstractAudioOutputStream.anIntArray1976[var6] > var7; ++var7) {
                this.anIntArrayArray3570[var5][var7] = var1.readUnsignedShort();
              }
            }
          }
        } else {
          var4 = var1.readUnsignedByte();
          this.anIntArray3567 = new int[var4];

          for (var5 = 0; var5 < var4; ++var5) {
            this.anIntArray3567[var5] = var1.readUnsignedShort();
          }
        }
      } else {
        this.strings = var1.readString().split(60);
      }

    } catch (RuntimeException var8) {
      throw AbstractGameWorld.cascadeException(var8,
        "cb.R(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
    }
  }

  final GameString method554(int var1) {
    try {
      if (var1 != -1) {
        return null;
      } else {
        GameString var2 = Cache.createString(80);
        if (null == this.strings) {
          return TextureSampler3.aClass94_3357;
        } else {
          var2.append(this.strings[0]);

          for (int var3 = 1; var3 < this.strings.length; ++var3) {
            var2.append(GameStub.aClass94_9);
            var2.append(this.strings[var3]);
          }

          return var2.pack();
        }
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "cb.C(" + var1 + ')');
    }
  }

  final GameString method555(int var1, Buffer var2) {
    try {
      if (var1 != 28021) {
        this.anIntArrayArray3570 = null;
      }

      GameString string = Cache.createString(80);
      if (this.anIntArray3566 != null) {
        for (int var4 = 0; var4 < this.anIntArray3566.length; ++var4) {
          string.append(this.strings[var4]);
          string.append(GZipDecompressor.method1124(this.anIntArrayArray3570[var4], var2
            .readVariableLengthValue(WidgetAccess.anIntArray2209[this.anIntArray3566[var4]],
              var1 + -28021), this.anIntArray3566[var4], false));
        }
      }

      string.append(this.strings[-1 + this.strings.length]);
      return string.pack();
    } catch (RuntimeException var5) {
      throw AbstractGameWorld
        .cascadeException(var5, "cb.B(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
    }
  }

}
