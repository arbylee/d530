final class Player extends Mobile {

  static int[] anIntArray3951 = new int[4];
  static byte aByte3953;
  static int[] quady0 = new int[100];
  static GameString aClass94_3957 = SpawnedGameObject.createString("Gestionnaire de saisie charg-B");
  static int[] anIntArray3959 = new int[2];
  static GameString FORCED_TWEENING_ENABLED = SpawnedGameObject.createString("Forced tweening ENABLED(Q");
  static GameString LABELS = SpawnedGameObject.createString("_labels");
  static GameString aClass94_3971 = SpawnedGameObject.createString("www)2wtqa");
  int anInt3952 = -1;
  int anInt3955 = -1;
  int anInt3956 = 0;
  int combatLevel = 0;
  PlayerAppearance appearance;
  int anInt3963 = -1;
  int anInt3965 = 0;
  int anInt3966 = -1;
  GameString name;
  boolean aBoolean3968 = false;
  int anInt3969 = 0;
  int anInt3970 = -1;
  int anInt3972 = -1;
  int anInt3973 = -1;
  int skillTotal = 0;
  private int titleId = 0;

  public static void method1982(byte var0) {
    try {
      aClass94_3971 = null;
      aClass94_3957 = null;
      anIntArray3951 = null;
      FORCED_TWEENING_ENABLED = null;
      anIntArray3959 = null;
      if (var0 <= 116) {
        method1982((byte) -48);
      }

      quady0 = null;
      LABELS = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "e.R(" + var0 + ')');
    }
  }

  final int getSize() {
    try {
      if (this.appearance != null && this.appearance.npcId != -1) {
        return SubNode.getNpcConfiguration(this.appearance.npcId).size;
      } else {
        return super.getSize();
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "e.H((");
    }
  }

  final int getRenderAnimationId() {
    try {
      return this.renderAnimationId;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "e.B()");
    }
  }

  final void parseConfig(Buffer buffer) {
    try {
      buffer.position = 0;
      int var3 = buffer.readUnsignedByte();
      int var8 = -1;
      int var4 = 1 & var3;
      boolean var6 = ~(var3 & 4) != -1;
      int var7 = super.getSize();
      int[] var9 = new int[12];
      this.method1976(1 + (var3 >> 3 & 7), 2);
      this.titleId = 3 & var3 >> 6;
      this.anInt2819 += (-var7 + this.getSize()) * 64;
      this.anInt2829 += 64 * (this.getSize() + -var7);
      this.anInt3972 = buffer.readByte();
      this.anInt3955 = buffer.readByte();
      this.anInt3956 = 0;

      int var11;
      int var12;
      int var13;
      int var14;
      for (int var10 = 0; -13 < ~var10; ++var10) {
        var11 = buffer.readUnsignedByte();
        if (~var11 != -1) {
          var12 = buffer.readUnsignedByte();
          var13 = (var11 << 8) - -var12;
          if (~var10 == -1 && -65536 == ~var13) {
            var8 = buffer.readUnsignedShort();
            this.anInt3956 = buffer.readUnsignedByte();
            break;
          }

          if ('\u8000' <= var13) {
            var13 = SomethingTexture4.anIntArray2664[var13 - '\u8000'];
            var9[var10] = TextureSampler3.method308(1073741824, var13);
            var14 = DummyClass35.getItemConfig(var13, (byte) 119).anInt782;
            if (var14 != 0) {
              this.anInt3956 = var14;
            }
          } else {
            var9[var10] = TextureSampler3.method308(-256 + var13, Integer.MIN_VALUE);
          }
        } else {
          var9[var10] = 0;
        }
      }

      int[] var19 = new int[5];

      for (var11 = 0; var11 < 5; ++var11) {
        var12 = buffer.readUnsignedByte();
        if (-1 < ~var12 || var12 >= AudioWorker.aShortArrayArray344[var11].length) {
          var12 = 0;
        }

        var19[var11] = var12;
      }

      this.renderAnimationId = buffer.readUnsignedShort();
      long var20 = buffer.readLong();
      this.name = FileCache.stringFromBase37(-29664, var20).formatName((byte) -50);
      this.combatLevel = buffer.readUnsignedByte();
      if (var6) {
        this.skillTotal = buffer.readUnsignedShort();
        this.anInt3965 = this.combatLevel;
        this.anInt3970 = -1;
      } else {
        this.skillTotal = 0;
        this.anInt3965 = buffer.readUnsignedByte();
        this.anInt3970 = buffer.readUnsignedByte();
        if (-256 == ~this.anInt3970) {
          this.anInt3970 = -1;
        }
      }

      var13 = this.anInt3969;
      this.anInt3969 = buffer.readUnsignedByte();
      if (-1 == ~this.anInt3969) {
        DummyClass11.method2203(this, 8);
      } else {
        int var15 = this.anInt3966;
        int var16 = this.anInt3963;
        int var17 = this.anInt3973;
        var14 = this.anInt3952;
        this.anInt3952 = buffer.readUnsignedShort();
        this.anInt3966 = buffer.readUnsignedShort();
        this.anInt3963 = buffer.readUnsignedShort();
        this.anInt3973 = buffer.readUnsignedShort();
        if (this.anInt3969 != var13 || ~this.anInt3952 != ~var14 || ~this.anInt3966 != ~var15
          || var16 != this.anInt3963 || ~this.anInt3973 != ~var17) {
          SubNode.method518(this, -110);
        }
      }

      if (null == this.appearance) {
        this.appearance = new PlayerAppearance();
      }

      var14 = this.appearance.npcId;
      this.appearance.update(var19, var8, ~var4 == -2, 0, var9, this.renderAnimationId);
      if (~var14 != ~var8) {
        this.anInt2819 = 128 * this.waypointsX[0] + this.getSize() * 64;
        this.anInt2829 = 128 * this.waypointsY[0] - -(64 * this.getSize());
      }

      if (this.aClass127_Sub1_2801 != null) {
        this.aClass127_Sub1_2801.method1759();
      }

    } catch (RuntimeException var18) {
      throw AbstractGameWorld
        .cascadeException(var18, "e.P(" + (buffer != null ? "{...}" : "null") + ')');
    }
  }

  final void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8,
                  long var9, int var11, DummyClass0 var12) {
    try {
      if (this.appearance != null) {
        AnimationSequence var13 = this.animationId != -1 && 0 == this.anInt2828 ?
          GameClient.method45(this.animationId, (byte) -20) :
          null;
        AnimationSequence var14 = 0 != ~this.anInt2764 && !this.aBoolean3968 && (
          ~this.anInt2764 != ~this.getRenderAnimationId(false).anInt368 || var13 == null) ?
          GameClient.method45(this.anInt2764, (byte) -20) :
          null;
        AbstractModel var15 = this.appearance
          .method1165(this.aClass145Array2809, this.anInt2776, var14, var13, this.anInt2802,
            this.anInt2793, -120, this.anInt2760, true, this.anInt2832, this.anInt2813);
        int var16 = AbstractObjectNodeWrapper.method1727((byte) 123);
        if (GlRenderer.useOpenGlRenderer && AudioStreamEncoder3.anInt3492 < 96 && ~var16 < -51) {
          WidgetAccess.method90(1);
        }

        int var17;
        if (0 != TextureSampler20.usageMode && var16 < 50) {
          for (var17 = 50 - var16; DummyClass42.anInt893 < var17; ++DummyClass42.anInt893) {
            SomethingMidiFile.byteArrayPool[DummyClass42.anInt893] = new byte[102400];
          }

          while (DummyClass42.anInt893 > var17) {
            --DummyClass42.anInt893;
            SomethingMidiFile.byteArrayPool[DummyClass42.anInt893] = null;
          }
        }

        if (var15 != null) {
          this.anInt2820 = var15.getMinimumY();
          AbstractModel var23;
          if (Projectile.aBoolean2910 && (-1 == this.appearance.npcId || SubNode
            .getNpcConfiguration(this.appearance.npcId).aBoolean1249)) {
            var23 = GameObject
              .method1957(160, this.aBoolean2810, var14 == null ? var13 : var14, this.anInt2819, 0,
                this.anInt2829, 0, 1, var15, var1, null != var14 ? this.anInt2813 : this.anInt2832,
                this.anInt2831, 240, (byte) -49);
            if (GlRenderer.useOpenGlRenderer) {
              float var18 = GlRenderer.method1852();
              float var19 = GlRenderer.method1839();
              GlRenderer.method1851();
              GlRenderer.method1825(var18, -150.0F + var19);
              var23.draw(0, var2, var3, var4, var5, var6, var7, var8, -1L, var11, null);
              GlRenderer.method1830();
              GlRenderer.method1825(var18, var19);
            } else {
              var23.draw(0, var2, var3, var4, var5, var6, var7, var8, -1L, var11, null);
            }
          }

          if (TextureCache.localPlayer == this) {
            for (var17 = GameException.aClass96Array2114.length + -1; -1 >= ~var17; --var17) {
              HintMarker var27 = GameException.aClass96Array2114[var17];
              if (var27 != null && ~var27.anInt1355 != 0) {
                int var21;
                int var20;
                if (-2 == ~var27.anInt1360 && 0 <= var27.anInt1359
                  && ~TextureSampler5.npcs.length < ~var27.anInt1359) {
                  NPC var24 = TextureSampler5.npcs[var27.anInt1359];
                  if (null != var24) {
                    var20 = var24.anInt2819 / 32 - TextureCache.localPlayer.anInt2819 / 32;
                    var21 = -(TextureCache.localPlayer.anInt2829 / 32) + var24.anInt2829 / 32;
                    this.draw(null, var21, var15, var20, var6, var11, 2047, var1, var8, var5, var4,
                      var2, var27.anInt1355, var3, var7);
                  }
                }

                if (var27.anInt1360 == 2) {
                  int var29 = 4 * (-WorldMapLabel.anInt1716 + var27.anInt1356) + 2 + -(
                    TextureCache.localPlayer.anInt2819 / 32);
                  var20 = 2 + (4 * (var27.anInt1347 - ProceduralTexture.anInt1152)
                    - TextureCache.localPlayer.anInt2829 / 32);
                  this.draw(null, var20, var15, var29, var6, var11, 2047, var1, var8, var5, var4,
                    var2, var27.anInt1355, var3, var7);
                }

                if (-11 == ~var27.anInt1360 && var27.anInt1359 >= 0
                  && ~TextureSampler0.players.length < ~var27.anInt1359) {
                  Player var28 = TextureSampler0.players[var27.anInt1359];
                  if (null != var28) {
                    var20 = -(TextureCache.localPlayer.anInt2819 / 32) + var28.anInt2819 / 32;
                    var21 = var28.anInt2829 / 32 + -(TextureCache.localPlayer.anInt2829 / 32);
                    this.draw(null, var21, var15, var20, var6, var11, 2047, var1, var8, var5, var4,
                      var2, var27.anInt1355, var3, var7);
                  }
                }
              }
            }
          }

          this.method1971(var15, (byte) -103);
          this.method1969((byte) 110, var15, var1);
          var23 = null;
          if (!this.aBoolean3968 && 0 != ~this.anInt2842 && this.anInt2805 != -1) {
            SpotAnimationConfig var26 = RenderAnimation.method898((byte) 42, this.anInt2842);
            var23 = var26.method966(this.anInt2826, (byte) -30, this.anInt2805, this.anInt2761);
            if (var23 != null) {
              var23.method1897(0, -this.anInt2799, 0);
              if (var26.aBoolean536) {
                if (TextureSampler15.anInt3198 != 0) {
                  var23.method1896(TextureSampler15.anInt3198);
                }

                if (0 != Parameter.anInt3623) {
                  var23.method1886(Parameter.anInt3623);
                }

                if (TextureSampler16.anInt3111 != 0) {
                  var23.method1897(0, TextureSampler16.anInt3111, 0);
                }
              }
            }
          }

          AbstractModel var25 = null;
          if (!this.aBoolean3968 && this.anObject2796 != null) {
            if (AbstractGameWorld.updateCycle >= this.anInt2778) {
              this.anObject2796 = null;
            }

            if (~this.anInt2797 >= ~AbstractGameWorld.updateCycle
              && this.anInt2778 > AbstractGameWorld.updateCycle) {
              if (!(this.anObject2796 instanceof GameObject)) {
                var25 = (AbstractModel) this.anObject2796;
              } else {
                var25 = (AbstractModel) ((GameObject) this.anObject2796).method1963(3);
              }

              var25.method1897(this.anInt2782 + -this.anInt2819, this.anInt2812 + -this.anInt2831,
                this.anInt2833 + -this.anInt2829);
              if (-513 != ~this.anInt2806) {
                if (~this.anInt2806 != -1025) {
                  if (-1537 == ~this.anInt2806) {
                    var25.rotateQuarterY();
                  }
                } else {
                  var25.method1874();
                }
              } else {
                var25.method1900();
              }
            }
          }

          if (GlRenderer.useOpenGlRenderer) {
            var15.aBoolean2699 = true;
            var15.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11,
              this.aClass127_Sub1_2801);
            if (var23 != null) {
              var23.aBoolean2699 = true;
              var23.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11,
                this.aClass127_Sub1_2801);
            }
          } else {
            if (null != var23) {
              var15 = ((SoftwareModel) var15).method1943(var23);
            }

            if (var25 != null) {
              var15 = ((SoftwareModel) var15).method1943(var25);
            }

            var15.aBoolean2699 = true;
            var15.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11,
              this.aClass127_Sub1_2801);
          }

          if (null != var25) {
            if (this.anInt2806 == 512) {
              var25.rotateQuarterY();
            } else if (1024 == this.anInt2806) {
              var25.method1874();
            } else if (1536 == this.anInt2806) {
              var25.method1900();
            }

            var25.method1897(-this.anInt2782 + this.anInt2819, -this.anInt2812 + this.anInt2831,
              -this.anInt2833 + this.anInt2829);
          }

        }
      }
    } catch (RuntimeException var22) {
      throw AbstractGameWorld.cascadeException(var22,
        "e.IA(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7
          + ',' + var8 + ',' + var9 + ',' + var11 + ',' + (var12 != null ? "{...}" : "null") + ')');
    }
  }

  private final void draw(DummyClass0 var1, int var2, AbstractModel var3, int var4, int var5,
                          int var6, int var7, int var8, int var9, int var10, int var11, int var12,
                          int var13, int var14, int var15) {
    try {
      int var16 = var4 * var4 - -(var2 * var2);
      if (-17 >= ~var16 && -360001 <= ~var16) {
        int var17 = (int) (325.949D * Math.atan2((double) var4, (double) var2)) & var7;
        AbstractModel var18 = DummyHashTable
          .method1763(true, var17, this.anInt2829, var13, this.anInt2819, var3, this.anInt2831);
        if (var18 != null) {
          if (GlRenderer.useOpenGlRenderer) {
            float var19 = GlRenderer.method1852();
            float var20 = GlRenderer.method1839();
            GlRenderer.method1851();
            GlRenderer.method1825(var19, var20 - 150.0F);
            var18.draw(0, var12, var14, var11, var10, var5, var15, var9, -1L, var6, var1);
            GlRenderer.method1830();
            GlRenderer.method1825(var19, var20);
          } else {
            var18.draw(0, var12, var14, var11, var10, var5, var15, var9, -1L, var6, var1);
          }
        }

      }
    } catch (RuntimeException var21) {
      throw AbstractGameWorld.cascadeException(var21,
        "e.N(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + (var3 != null ?
          "{...}" :
          "null") + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9
          + ',' + var10 + ',' + var11 + ',' + var12 + ',' + var13 + ',' + var14 + ',' + var15
          + ')');
    }
  }

  final boolean hasConfiguration(byte var1) {
    try {
      if (var1 != 17) {
        quady0 = null;
      }

      return this.appearance != null;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "e.L(" + var1 + ')');
    }
  }

  final GameString getFullName() {
    try {
      GameString name = this.name;

      if (GameBuffer.titlePrefixes != null) {
        name =
          RenderAnimation.concat(new GameString[] {GameBuffer.titlePrefixes[this.titleId], name});
      }

      if (null != DummyOutputStream.titleSuffixes) {
        name = RenderAnimation
          .concat(new GameString[] {name, DummyOutputStream.titleSuffixes[this.titleId]});
      }

      return name;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "e.Q()");
    }
  }

  final void method1867(int var1, int var2, int var3, int var4, int var5) {
  }

  final void setPosition(byte var1, int x, boolean var3, int y) {
    try {
      super.setPosition(this.getSize(), x, y, var3);
    } catch (RuntimeException var6) {
      throw AbstractGameWorld
        .cascadeException(var6, "e.O(" + var1 + ',' + x + ',' + var3 + ',' + y + ')');
    }
  }

  protected final void finalize() {
  }

  final int getMinimumY() {
    try {
      return this.anInt2820;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "e.MA()");
    }
  }

}
