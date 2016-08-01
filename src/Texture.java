import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import java.nio.ByteBuffer;

final class Texture extends SubNode {

  static GameString aClass94_3785 = SpawnedGameObject.createString("Benutzeroberfl-=che geladen)3");
  static FileUnpacker midiInstruments;
  static GameString aClass94_3792 = SpawnedGameObject.createString("huffman");
  static AbstractObjectNodeWrapper aClass118_3794 = DummyClass60.method913(31431);
  static GameString aClass94_3798 =
    SpawnedGameObject.createString("RuneScape wird geladen )2 bitte warten)3)3)3");
  boolean needsUpdate = false;
  private boolean aBoolean3781;
  private float aFloat3782;
  private int anInt3783;
  private int textureEnvironmentOpcode;
  private boolean aBoolean3787;
  private int anInt3788;
  private boolean aBoolean3789;
  private ProceduralTexture proceduralTexture;
  private int anInt3791;
  private int[] anIntArray3793;
  private int anInt3795 = -1;
  private int anInt3796 = 0;
  private int anInt3799;
  private boolean aBoolean3800;


  Texture(Buffer var1) {
    try {
      this.proceduralTexture = new ProceduralTexture(var1);
      this.aBoolean3789 = var1.readUnsignedByte() == 1;
      this.aBoolean3800 = 1 == var1.readUnsignedByte();
      this.aBoolean3787 = -2 == ~var1.readUnsignedByte();
      this.aBoolean3781 = ~var1.readUnsignedByte() == -2;
      int var2 = 3 & var1.readUnsignedByte();
      this.anInt3783 = var1.readByte();
      this.anInt3799 = var1.readByte();
      int var3 = var1.readUnsignedByte();
      var1.readUnsignedByte();
      if (var2 == 1) {
        this.textureEnvironmentOpcode = 2;
      } else if (-3 == ~var2) {
        this.textureEnvironmentOpcode = 3;
      } else if (~var2 != -4) {
        this.textureEnvironmentOpcode = 0;
      } else {
        this.textureEnvironmentOpcode = 4;
      }

      this.anInt3788 = (var3 & 240) >> 4;
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "uh.<init>(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  final int[] method718(ITextureCache var1, int var2, float var3, FileUnpacker var4, boolean var5) {
    try {
      if (var2 != 0) {
        return null;
      } else {
        if (null == this.anIntArray3793 || this.aFloat3782 != var3) {
          if (!this.proceduralTexture.method1408(true, var1, var4)) {
            return null;
          }

          int var6 = !var5 ? 128 : 64;
          this.anIntArray3793 =
            this.proceduralTexture.method1404(var6, this.aBoolean3800, var6, (double) var3,
              var2 ^ 327680, var4, var1, true);
          this.aFloat3782 = var3;
          if (this.aBoolean3789) {
            int[] var7 = new int[var6];
            int[] var10 = new int[var6 * var6];
            int[] var8 = new int[var6];
            int[] var9 = new int[var6];
            int var15 = var6;
            int var14;
            int var13 = var14 = var6 * 1;
            int var19 = var6 * var6;
            int var18 = -1 + var6;
            int var17 = var6 - 1;

            int var11;
            int var20;
            for (var20 = 2; var20 >= 0; --var20) {
              for (var11 = var17; var11 >= 0; --var11) {
                --var14;
                int var12 = this.anIntArray3793[var14];
                var7[var11] += ClientScript.bitAnd(var12, 16726965) >> 16;
                var8[var11] += ClientScript.bitAnd('\uff72', var12) >> 8;
                var9[var11] += ClientScript.bitAnd(var12, 255);
              }

              if (var14 == 0) {
                var14 = var19;
              }
            }

            int var25 = var19;

            for (int var31 = var18; ~var31 <= -1; --var31) {
              int var30 = 0;
              int var29 = 0;
              int var28 = 0;
              int var26 = 1;
              int var27 = 1;

              for (var11 = 2; ~var11 <= -1; --var11) {
                --var27;
                var30 += var8[var27];
                var29 += var9[var27];
                var28 += var7[var27];
                if (var27 == 0) {
                  var27 = var15;
                }
              }

              for (var11 = var17; -1 >= ~var11; --var11) {
                --var26;
                int var21 = var30 / 9;
                int var22 = var29 / 9;
                --var27;
                var20 = var28 / 9;
                --var25;
                var10[var25] = TextureSampler3.method308(var22,
                  TextureSampler3.method308(var20 << 16, var21 << 8));
                var28 += var7[var27] + -var7[var26];
                var29 += var9[var27] - var9[var26];
                var30 += -var8[var26] + var8[var27];
                if (-1 == ~var26) {
                  var26 = var15;
                }

                if (~var27 == -1) {
                  var27 = var15;
                }
              }

              for (var11 = var17; ~var11 <= -1; --var11) {
                --var13;
                int var23 = this.anIntArray3793[var13];
                --var14;
                int var24 = this.anIntArray3793[var14];
                var7[var11] +=
                  (ClientScript.bitAnd(var24, 16729186) >> 16) + -ClientScript.bitAnd(var23 >> 16,
                    255);
                var8[var11] +=
                  (ClientScript.bitAnd('\uff8b', var24) >> 8) + -ClientScript.bitAnd(255,
                    var23 >> 8);
                var9[var11] += -ClientScript.bitAnd(var23, 255) + ClientScript.bitAnd(255, var24);
              }

              if (0 == var13) {
                var13 = var19;
              }

              if (0 == var14) {
                var14 = var19;
              }
            }

            this.anIntArray3793 = var10;
          }
        }

        return this.anIntArray3793;
      }
    } catch (RuntimeException var32) {
      throw AbstractGameWorld.cascadeException(var32,
        "uh.D(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + (
          var4 != null ? "{...}" : "null") + ',' + var5 + ')');
    }
  }

  final boolean method719(FileUnpacker var1, ITextureCache var2, int var3, boolean var4) {
    try {
      if (var3 != 579100487) {
        return false;
      } else if (this.proceduralTexture.method1408(true, var2, var1)) {
        GL var5 = GlRenderer.gl;
        int var6 = !var4 ? 128 : 64;
        int flags = DummyClass32.method961(1536);
        if (~(1 & flags) == -1) {
          if (0 != ~this.anInt3795) {
            GlRenderer.bindTexture(this.anInt3795);
          } else {
            int[] var8 = new int[1];
            var5.glGenTextures(1, var8, 0);
            this.anInt3791 = DummyClass33.anInt582;
            this.anInt3795 = var8[0];
            GlRenderer.bindTexture(this.anInt3795);
            ByteBuffer var9 = ByteBuffer.wrap(
              this.proceduralTexture.method1407(var6, var6, this.aBoolean3800, var2, 0.7D, 8839,
                var1));
            if (2 != this.anInt3788) {
              if (~this.anInt3788 != -2) {
                var5.glTexImage2D(3553, 0, 6408, var6, var6, 0, 6408, 5121, var9);
                var5.glTexParameteri(3553, 10241, 9729);
                var5.glTexParameteri(3553, 10240, 9729);
                DummyClass33.textureMemory += var9.limit() - this.anInt3796;
                this.anInt3796 = var9.limit();
              } else {
                int var10 = 0;

                while (true) {
                  var5.glTexImage2D(3553, var10++, 6408, var6, var6, 0, 6408, 5121, var9);
                  var6 >>= 1;
                  if (0 == var6) {
                    var5.glTexParameteri(3553, 10241, 9987);
                    var5.glTexParameteri(3553, 10240, 9729);
                    DummyClass33.textureMemory += var9.limit() * 4 / 3 - this.anInt3796;
                    this.anInt3796 = 4 * var9.limit() / 3;
                    break;
                  }

                  var9 = ByteBuffer.wrap(
                    this.proceduralTexture.method1407(var6, var6, this.aBoolean3800, var2, 0.7D,
                      8839, var1));
                }
              }
            } else {
              GLU var14 = new GLU();
              var14.gluBuild2DMipmaps(3553, 6408, var6, var6, 6408, 5121, var9);
              var5.glTexParameteri(3553, 10241, 9987);
              var5.glTexParameteri(3553, 10240, 9729);
              DummyClass33.textureMemory += 4 * var9.limit() / 3 - this.anInt3796;
              this.anInt3796 = var9.limit() * 4 / 3;
            }

            var5.glTexParameteri(3553, 10242, !this.aBoolean3787 ? '\u812f' : 10497);
            var5.glTexParameteri(3553, 10243, this.aBoolean3781 ? 10497 : '\u812f');
          }
        }

        if (~(2 & flags) == -1) {
          GlRenderer.method1856(this.textureEnvironmentOpcode);
        }

        if ((4 & flags) == 0) {
          GlRenderer.method1847(0);
        }

        if ((flags & 8) == 0) {
          if (-1 == ~this.anInt3799 && 0 == this.anInt3783) {
            GlRenderer.loadIdentityTextureMatrix();
          } else {
            float var12 = (float) (this.anInt3799 * GlRenderer.anInt1791) / (float) var6;
            float var13 = (float) (this.anInt3783 * GlRenderer.anInt1791) / (float) var6;
            GlRenderer.translateTexture(var13, var12, 0.0F);
          }
        }

        return true;
      } else {
        return false;
      }
    } catch (RuntimeException var11) {
      throw AbstractGameWorld.cascadeException(var11,
        "uh.F(" + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ','
          + var3 + ',' + var4 + ')');
    }
  }

  final int[] method720(boolean var1, boolean var2, ITextureCache var3, FileUnpacker var4) {
    try {

      if (!this.proceduralTexture.method1408(true, var3, var4)) {
        return null;
      } else {
        int size = !var2 ? 128 : 64;
        return this.proceduralTexture.method1404(size, this.aBoolean3800, size, 1.0D, 327680, var4,
          var3, false);
      }
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "uh.O(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + (
          var4 != null ? "{...}" : "null") + ')');
    }
  }

  final boolean method722(int var1, ITextureCache var2, FileUnpacker var3) {
    try {
      return var1 != -5 ? true : this.proceduralTexture.method1408(true, var2, var3);
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "uh.P(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + (var3 != null ?
          "{...}" :
          "null") + ')');
    }
  }

  final void update(int var1, byte var2) {
    try {
      if (var2 != -120) {
        method721(-42);
      }

      if (this.anIntArray3793 != null) {
        if (0 != this.anInt3799 || ~this.anInt3783 != -1) {
          if (null == SomethingOtherWorldMap.anIntArray2533
            || ~SomethingOtherWorldMap.anIntArray2533.length > ~this.anIntArray3793.length) {
            SomethingOtherWorldMap.anIntArray2533 = new int[this.anIntArray3793.length];
          }

          int var5 = var1 * this.anInt3783;
          int var3 = ~this.anIntArray3793.length == -4097 ? 64 : 128;
          int var4 = this.anIntArray3793.length;
          int var6 = var3 + -1;
          int var7 = this.anInt3799 * var1 * var3;
          int var8 = -1 + var4;

          for (int var9 = 0; var4 > var9; var9 += var3) {
            int var10 = var7 + var9 & var8;

            for (int var11 = 0; var3 > var11; ++var11) {
              int var13 = (var6 & var11 - -var5) + var10;
              int var12 = var11 + var9;
              SomethingOtherWorldMap.anIntArray2533[var12] = this.anIntArray3793[var13];
            }
          }

          int[] var15 = this.anIntArray3793;
          this.anIntArray3793 = SomethingOtherWorldMap.anIntArray2533;
          SomethingOtherWorldMap.anIntArray2533 = var15;
        }

      }
    } catch (RuntimeException var14) {
      throw AbstractGameWorld.cascadeException(var14, "uh.E(" + var1 + ',' + var2 + ')');
    }
  }

  protected final void finalize() throws Throwable {
    try {
      if (this.anInt3795 != -1) {
        DummyClass33.method985(this.anInt3795, this.anInt3796, this.anInt3791);
        this.anInt3796 = 0;
        this.anInt3795 = -1;
      }

      super.finalize();
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "uh.finalize()");
    }
  }

  public static void method721(int var0) {
    try {
      aClass94_3785 = null;
      aClass94_3792 = null;
      aClass94_3798 = null;
      midiInstruments = null;
      aClass118_3794 = null;
      if (var0 != 20413) {
        aClass118_3794 = null;
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "uh.C(" + var0 + ')');
    }
  }

  static final void method724(int var0) {
    try {
      DummyClass8.aClass93_4015.method1523((byte) -102);
      if (var0 > -106) {
        method725(71);
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "uh.B(" + var0 + ')');
    }
  }

  static final void method725(int var0) {
    try {
      int var1 = 67 / ((-60 - var0) / 41);
      if (~DummyClass20.method1817((byte) 70) == -3) {
        byte var2 = (byte) (255 & BitVariable.anInt1127 + -4);
        int var3 = BitVariable.anInt1127 % 104;

        int var4;
        int var5;
        for (var4 = 0; -5 < ~var4; ++var4) {
          for (var5 = 0; 104 > var5; ++var5) {
            AbstractImageProducer.aByteArrayArrayArray2008[var4][var3][var5] = var2;
          }
        }

        if (GameWorldSomething.currentPlane != 3) {
          for (var4 = 0; -3 < ~var4; ++var4) {
            FileCache.anIntArray686[var4] = -1000000;
            MilliFrameRegulator.anIntArray2696[var4] = 1000000;
            DummyClass13.anIntArray2021[var4] = 0;
            AnimationSequence.anIntArray1871[var4] = 1000000;
            Player.anIntArray3959[var4] = 0;
          }

          if (1 == SomethingPacket116.anInt1753) {
            if ((4 & BZipDecompressorState.tileFlags[GameWorldSomething.currentPlane][
              TextureCache.localPlayer.anInt2819 >> 7][TextureCache.localPlayer.anInt2829 >> 7])
              != 0) {
              GroundItem.method2031((byte) -85, false, TextureCache.localPlayer.anInt2819 >> 7,
                TextureCache.localPlayer.anInt2829 >> 7, SomethingTexture1.sceneGraphTiles, 0);
            }

            if (-311 < ~DummyClass17.anInt1823) {
              int var7 = TextureCache.localPlayer.anInt2829 >> 7;
              var5 = DummyClass49.anInt1111 >> 7;
              int var9;
              if (var5 < var7) {
                var9 = var7 - var5;
              } else {
                var9 = -var7 + var5;
              }

              var4 = NPC.anInt3995 >> 7;
              int var6 = TextureCache.localPlayer.anInt2819 >> 7;
              int var8;
              if (~var6 < ~var4) {
                var8 = -var4 + var6;
              } else {
                var8 = -var6 + var4;
              }

              int var10;
              int var11;
              if (var8 > var9) {
                var11 = '\u8000';
                var10 = var9 * 65536 / var8;

                while (var6 != var4) {
                  if (var6 <= var4) {
                    if (var4 > var6) {
                      --var4;
                    }
                  } else {
                    ++var4;
                  }

                  if (~(BZipDecompressorState.tileFlags[GameWorldSomething.currentPlane][var4][var5]
                    & 4) != -1) {
                    GroundItem.method2031((byte) -29, false, var4, var5,
                      SomethingTexture1.sceneGraphTiles, 1);
                    break;
                  }

                  var11 += var10;
                  if (var11 >= 65536) {
                    if (var5 >= var7) {
                      if (var7 < var5) {
                        --var5;
                      }
                    } else {
                      ++var5;
                    }

                    var11 -= 65536;
                    if (~(4
                      & BZipDecompressorState.tileFlags[GameWorldSomething.currentPlane][var4][var5])
                      != -1) {
                      GroundItem.method2031((byte) -120, false, var4, var5,
                        SomethingTexture1.sceneGraphTiles, 1);
                      break;
                    }
                  }
                }
              } else {
                var11 = '\u8000';
                var10 = 65536 * var8 / var9;

                while (~var5 != ~var7) {
                  if (var5 < var7) {
                    ++var5;
                  } else if (var5 > var7) {
                    --var5;
                  }

                  if (~(4
                    & BZipDecompressorState.tileFlags[GameWorldSomething.currentPlane][var4][var5])
                    != -1) {
                    GroundItem.method2031((byte) -13, false, var4, var5,
                      SomethingTexture1.sceneGraphTiles, 1);
                    break;
                  }

                  var11 += var10;
                  if (~var11 <= -65537) {
                    if (var6 > var4) {
                      ++var4;
                    } else if (var6 < var4) {
                      --var4;
                    }

                    var11 -= 65536;
                    if ((4
                      & BZipDecompressorState.tileFlags[GameWorldSomething.currentPlane][var4][var5])
                      != 0) {
                      GroundItem.method2031((byte) -37, false, var4, var5,
                        SomethingTexture1.sceneGraphTiles, 1);
                      break;
                    }
                  }
                }
              }
            }
          } else {
            var4 = BufferData.method1736(GameWorldSomething.currentPlane, 1, NPC.anInt3995,
              DummyClass49.anInt1111);
            if (800 > var4 + -EnumStringFetcher.anInt2162 &&
              (4 & BZipDecompressorState.tileFlags[GameWorldSomething.currentPlane][NPC.anInt3995
                >> 7][DummyClass49.anInt1111 >> 7]) != 0) {
              GroundItem.method2031((byte) -107, false, NPC.anInt3995 >> 7,
                DummyClass49.anInt1111 >> 7, SomethingTexture1.sceneGraphTiles, 1);
            }
          }

        }
      }
    } catch (RuntimeException var12) {
      throw AbstractGameWorld.cascadeException(var12, "uh.A(" + var0 + ')');
    }
  }

}
