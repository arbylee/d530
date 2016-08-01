final class Model extends SceneNode {

  private static int[] anIntArray2861 = new int[10000];
  private static int[] COSINE_TABLE = DummyClass40.COSINE_TABLE;
  private static int anInt2868 = 0;
  private static int[] SINE_TABLE = DummyClass40.SINE_TABLE;
  private static int[] anIntArray2875 = new int[10000];
  byte[] aByteArray2843;
  byte[] aByteArray2845;
  short[] aShortArray2846;
  int[] anIntArray2847;
  byte aByte2848 = 0;
  int amountFaces = 0;
  short[] aShortArray2851;
  byte[] aByteArray2852;
  short[] aShortArray2855;
  int[][] skinGroups;
  byte[] aByteArray2857;
  short[] materials;
  byte[] normalTypes;
  int[] anIntArray2860;
  int anInt2862;
  int[] v2;
  int[] v0;
  byte[] aByteArray2866;
  byte[] aByteArray2867;
  byte[] aByteArray2869;
  short[] triangleColors;
  VertexNormal[] vertexNormals;
  short aShort2876;
  byte[] aByteArray2877;
  int[] v1;
  short aShort2879;
  int[] vy;
  short[] aShortArray2882;
  VertexNormal[] aClass50Array2883;
  short[] aShortArray2884;
  int[] vx;
  FaceNormal[] faceNormals;
  int amountVertices = 0;
  short[] aShortArray2888;
  byte[] aByteArray2889;
  int[][] boneGroups;
  short[] aShortArray2891;
  int[] vz;
  short[] aShortArray2893;
  private short maximumY;
  private short minimumX;
  private boolean dimensionsUpdated = false;
  private short minimumY;
  private short maximumX;
  private short maximumZ;
  private short minimumZ;


  private Model() {
  }

  private Model(byte[] bytes) {
    if (bytes[bytes.length - 1] == -1 && bytes[bytes.length - 2] == -1) {
      parseRt4Config(bytes);
    } else {
      parseRt3Config(bytes);
    }
  }

  Model(int var1, int var2, int var3) {
    this.vx = new int[var1];
    this.vy = new int[var1];
    this.vz = new int[var1];
    this.anIntArray2860 = new int[var1];
    this.v0 = new int[var2];
    this.v1 = new int[var2];
    this.v2 = new int[var2];
    this.normalTypes = new byte[var2];
    this.aByteArray2889 = new byte[var2];
    this.aByteArray2843 = new byte[var2];
    this.triangleColors = new short[var2];
    this.materials = new short[var2];
    this.aByteArray2866 = new byte[var2];
    this.anIntArray2847 = new int[var2];
    if (var3 > 0) {
      this.aByteArray2857 = new byte[var3];
      this.aShortArray2884 = new short[var3];
      this.aShortArray2846 = new short[var3];
      this.aShortArray2891 = new short[var3];
      this.aShortArray2888 = new short[var3];
      this.aShortArray2882 = new short[var3];
      this.aShortArray2851 = new short[var3];
      this.aByteArray2845 = new byte[var3];
      this.aByteArray2867 = new byte[var3];
      this.aByteArray2877 = new byte[var3];
      this.aByteArray2852 = new byte[var3];
      this.aByteArray2869 = new byte[var3];
    }

  }

  Model(Model[] var1, int var2) {
    boolean var3 = false;
    boolean var4 = false;
    boolean var5 = false;
    boolean var6 = false;
    boolean var7 = false;
    boolean var8 = false;
    this.amountVertices = 0;
    this.amountFaces = 0;
    this.anInt2862 = 0;
    byte var9 = 0;
    byte var10 = 0;
    this.aByte2848 = -1;

    int var11;
    for (var11 = 0; var11 < var2; ++var11) {
      Model var12 = var1[var11];
      if (var12 != null) {
        this.amountVertices += var12.amountVertices;
        this.amountFaces += var12.amountFaces;
        this.anInt2862 += var12.anInt2862;
        if (var12.aByteArray2889 != null) {
          var4 = true;
        } else {
          if (this.aByte2848 == -1) {
            this.aByte2848 = var12.aByte2848;
          }

          if (this.aByte2848 != var12.aByte2848) {
            var4 = true;
          }
        }

        var3 |= var12.normalTypes != null;
        var5 |= var12.aByteArray2843 != null;
        var6 |= var12.anIntArray2847 != null;
        var7 |= var12.materials != null;
        var8 |= var12.aByteArray2866 != null;
      }
    }

    this.vx = new int[this.amountVertices];
    this.vy = new int[this.amountVertices];
    this.vz = new int[this.amountVertices];
    this.anIntArray2860 = new int[this.amountVertices];
    this.aShortArray2893 = new short[this.amountVertices];
    this.v0 = new int[this.amountFaces];
    this.v1 = new int[this.amountFaces];
    this.v2 = new int[this.amountFaces];
    if (var3) {
      this.normalTypes = new byte[this.amountFaces];
    }

    if (var4) {
      this.aByteArray2889 = new byte[this.amountFaces];
    }

    if (var5) {
      this.aByteArray2843 = new byte[this.amountFaces];
    }

    if (var6) {
      this.anIntArray2847 = new int[this.amountFaces];
    }

    if (var7) {
      this.materials = new short[this.amountFaces];
    }

    if (var8) {
      this.aByteArray2866 = new byte[this.amountFaces];
    }

    if (var9 > 0) {
    }

    if (var10 > 0) {
    }

    this.triangleColors = new short[this.amountFaces];
    this.aShortArray2855 = new short[this.amountFaces];
    if (this.anInt2862 > 0) {
      this.aByteArray2857 = new byte[this.anInt2862];
      this.aShortArray2884 = new short[this.anInt2862];
      this.aShortArray2846 = new short[this.anInt2862];
      this.aShortArray2891 = new short[this.anInt2862];
      this.aShortArray2888 = new short[this.anInt2862];
      this.aShortArray2882 = new short[this.anInt2862];
      this.aShortArray2851 = new short[this.anInt2862];
      this.aByteArray2845 = new byte[this.anInt2862];
      this.aByteArray2867 = new byte[this.anInt2862];
      this.aByteArray2877 = new byte[this.anInt2862];
      this.aByteArray2852 = new byte[this.anInt2862];
      this.aByteArray2869 = new byte[this.anInt2862];
    }

    this.amountVertices = 0;
    this.amountFaces = 0;
    this.anInt2862 = 0;
    boolean var16 = false;
    boolean var17 = false;

    for (var11 = 0; var11 < var2; ++var11) {
      short var18 = (short) (1 << var11);
      Model var13 = var1[var11];
      if (var13 != null) {
        int var14;
        for (var14 = 0; var14 < var13.amountFaces; ++var14) {
          if (var3 && var13.normalTypes != null) {
            this.normalTypes[this.amountFaces] = var13.normalTypes[var14];
          }

          if (var4) {
            if (var13.aByteArray2889 != null) {
              this.aByteArray2889[this.amountFaces] = var13.aByteArray2889[var14];
            } else {
              this.aByteArray2889[this.amountFaces] = var13.aByte2848;
            }
          }

          if (var5 && var13.aByteArray2843 != null) {
            this.aByteArray2843[this.amountFaces] = var13.aByteArray2843[var14];
          }

          if (var6 && var13.anIntArray2847 != null) {
            this.anIntArray2847[this.amountFaces] = var13.anIntArray2847[var14];
          }

          if (var7) {
            if (var13.materials != null) {
              this.materials[this.amountFaces] = var13.materials[var14];
            } else {
              this.materials[this.amountFaces] = -1;
            }
          }

          if (var8) {
            if (var13.aByteArray2866 != null && var13.aByteArray2866[var14] != -1) {
              this.aByteArray2866[this.amountFaces] =
                (byte) (var13.aByteArray2866[var14] + this.anInt2862);
            } else {
              this.aByteArray2866[this.amountFaces] = -1;
            }
          }

          this.triangleColors[this.amountFaces] = var13.triangleColors[var14];
          this.aShortArray2855[this.amountFaces] = var18;
          this.v0[this.amountFaces] = this.method1995(var13, var13.v0[var14], var18);
          this.v1[this.amountFaces] = this.method1995(var13, var13.v1[var14], var18);
          this.v2[this.amountFaces] = this.method1995(var13, var13.v2[var14], var18);
          ++this.amountFaces;
        }

        for (var14 = 0; var14 < var13.anInt2862; ++var14) {
          byte var15 = this.aByteArray2857[this.anInt2862] = var13.aByteArray2857[var14];
          if (var15 == 0) {
            this.aShortArray2884[this.anInt2862] =
              (short) this.method1995(var13, var13.aShortArray2884[var14], var18);
            this.aShortArray2846[this.anInt2862] =
              (short) this.method1995(var13, var13.aShortArray2846[var14], var18);
            this.aShortArray2891[this.anInt2862] =
              (short) this.method1995(var13, var13.aShortArray2891[var14], var18);
          }

          if (var15 >= 1 && var15 <= 3) {
            this.aShortArray2884[this.anInt2862] = var13.aShortArray2884[var14];
            this.aShortArray2846[this.anInt2862] = var13.aShortArray2846[var14];
            this.aShortArray2891[this.anInt2862] = var13.aShortArray2891[var14];
            this.aShortArray2888[this.anInt2862] = var13.aShortArray2888[var14];
            this.aShortArray2882[this.anInt2862] = var13.aShortArray2882[var14];
            this.aShortArray2851[this.anInt2862] = var13.aShortArray2851[var14];
            this.aByteArray2845[this.anInt2862] = var13.aByteArray2845[var14];
            this.aByteArray2867[this.anInt2862] = var13.aByteArray2867[var14];
            this.aByteArray2877[this.anInt2862] = var13.aByteArray2877[var14];
          }

          if (var15 == 2) {
            this.aByteArray2852[this.anInt2862] = var13.aByteArray2852[var14];
            this.aByteArray2869[this.anInt2862] = var13.aByteArray2869[var14];
          }

          ++this.anInt2862;
        }
      }
    }

  }

  Model(Model var1, boolean var2, boolean var3, boolean var4, boolean var5) {
    this.amountVertices = var1.amountVertices;
    this.amountFaces = var1.amountFaces;
    this.anInt2862 = var1.anInt2862;
    int var6;
    if (var2) {
      this.vx = var1.vx;
      this.vy = var1.vy;
      this.vz = var1.vz;
    } else {
      this.vx = new int[this.amountVertices];
      this.vy = new int[this.amountVertices];
      this.vz = new int[this.amountVertices];

      for (var6 = 0; var6 < this.amountVertices; ++var6) {
        this.vx[var6] = var1.vx[var6];
        this.vy[var6] = var1.vy[var6];
        this.vz[var6] = var1.vz[var6];
      }
    }

    if (var3) {
      this.triangleColors = var1.triangleColors;
    } else {
      this.triangleColors = new short[this.amountFaces];

      for (var6 = 0; var6 < this.amountFaces; ++var6) {
        this.triangleColors[var6] = var1.triangleColors[var6];
      }
    }

    if (!var4 && var1.materials != null) {
      this.materials = new short[this.amountFaces];

      for (var6 = 0; var6 < this.amountFaces; ++var6) {
        this.materials[var6] = var1.materials[var6];
      }
    } else {
      this.materials = var1.materials;
    }

    if (var5) {
      this.aByteArray2843 = var1.aByteArray2843;
    } else {
      this.aByteArray2843 = new byte[this.amountFaces];
      if (var1.aByteArray2843 == null) {
        for (var6 = 0; var6 < this.amountFaces; ++var6) {
          this.aByteArray2843[var6] = 0;
        }
      } else {
        for (var6 = 0; var6 < this.amountFaces; ++var6) {
          this.aByteArray2843[var6] = var1.aByteArray2843[var6];
        }
      }
    }

    this.v0 = var1.v0;
    this.v1 = var1.v1;
    this.v2 = var1.v2;
    this.normalTypes = var1.normalTypes;
    this.aByteArray2889 = var1.aByteArray2889;
    this.aByteArray2866 = var1.aByteArray2866;
    this.aByte2848 = var1.aByte2848;
    this.aByteArray2857 = var1.aByteArray2857;
    this.aShortArray2884 = var1.aShortArray2884;
    this.aShortArray2846 = var1.aShortArray2846;
    this.aShortArray2891 = var1.aShortArray2891;
    this.aShortArray2888 = var1.aShortArray2888;
    this.aShortArray2882 = var1.aShortArray2882;
    this.aShortArray2851 = var1.aShortArray2851;
    this.aByteArray2845 = var1.aByteArray2845;
    this.aByteArray2867 = var1.aByteArray2867;
    this.aByteArray2877 = var1.aByteArray2877;
    this.aByteArray2852 = var1.aByteArray2852;
    this.aByteArray2869 = var1.aByteArray2869;
    this.anIntArray2860 = var1.anIntArray2860;
    this.anIntArray2847 = var1.anIntArray2847;
    this.boneGroups = var1.boneGroups;
    this.skinGroups = var1.skinGroups;
    this.vertexNormals = var1.vertexNormals;
    this.faceNormals = var1.faceNormals;
    this.aClass50Array2883 = var1.aClass50Array2883;
    this.aShort2879 = var1.aShort2879;
    this.aShort2876 = var1.aShort2876;
  }

  final void rotateHalfY() {
    for (int var1 = 0; var1 < this.amountVertices; ++var1) {
      this.vx[var1] = -this.vx[var1];
      this.vz[var1] = -this.vz[var1];
    }

    this.invalidate();
  }

  final void rotateQuarterY() {
    for (int var1 = 0; var1 < this.amountVertices; ++var1) {
      int var2 = this.vx[var1];
      this.vx[var1] = this.vz[var1];
      this.vz[var1] = -var2;
    }

    this.invalidate();
  }

  private final void rotateZ(int angle) {
    int sine = SINE_TABLE[angle];
    int cosine = COSINE_TABLE[angle];

    for (int var4 = 0; var4 < this.amountVertices; ++var4) {
      int var5 = this.vy[var4] * sine + this.vx[var4] * cosine >> 16;
      this.vy[var4] = this.vy[var4] * cosine - this.vx[var4] * sine >> 16;
      this.vx[var4] = var5;
    }

    this.invalidate();
  }

  private final void updateDimensions() {
    if (!this.dimensionsUpdated) {
      this.dimensionsUpdated = true;
      int minimumX = 32767;
      int minimumY = 32767;
      int minimumZ = 32767;
      int maximumX = -32768;
      int maximumY = -32768;
      int maximumZ = -32768;

      for (int var7 = 0; var7 < this.amountVertices; ++var7) {
        int vx = this.vx[var7];
        int vy = this.vy[var7];
        int vz = this.vz[var7];
        if (vx < minimumX) {
          minimumX = vx;
        }

        if (vx > maximumX) {
          maximumX = vx;
        }

        if (vy < minimumY) {
          minimumY = vy;
        }

        if (vy > maximumY) {
          maximumY = vy;
        }

        if (vz < minimumZ) {
          minimumZ = vz;
        }

        if (vz > maximumZ) {
          maximumZ = vz;
        }
      }

      this.minimumX = (short) minimumX;
      this.maximumX = (short) maximumX;
      this.minimumY = (short) minimumY;
      this.maximumY = (short) maximumY;
      this.minimumZ = (short) minimumZ;
      this.maximumZ = (short) maximumZ;
    }
  }

  final void scale(int scalarX, int scalarY, int scalarZ) {
    for (int var4 = 0; var4 < this.amountVertices; ++var4) {
      this.vx[var4] = this.vx[var4] * scalarX / 128;
      this.vy[var4] = this.vy[var4] * scalarY / 128;
      this.vz[var4] = this.vz[var4] * scalarZ / 128;
    }

    this.invalidate();
  }

  final SceneNode method1861(int var1, int var2, int var3) {
    return this.method2008(this.aShort2879, this.aShort2876, var1, var2, var3);
  }

  final boolean method1865() {
    return true;
  }

  final void method1866(SceneNode var1, int var2, int var3, int var4, boolean var5) {
    Model var6 = (Model) var1;
    var6.updateDimensions();
    var6.updateNormals();
    ++anInt2868;
    int var7 = 0;
    int[] var8 = var6.vx;
    int var9 = var6.amountVertices;

    int var10;
    for (var10 = 0; var10 < this.amountVertices; ++var10) {
      VertexNormal var11 = this.vertexNormals[var10];
      if (var11.c != 0) {
        int var12 = this.vy[var10] - var3;
        if (var12 >= var6.minimumY && var12 <= var6.maximumY) {
          int var13 = this.vx[var10] - var2;
          if (var13 >= var6.minimumX && var13 <= var6.maximumX) {
            int var14 = this.vz[var10] - var4;
            if (var14 >= var6.minimumZ && var14 <= var6.maximumZ) {
              for (int var15 = 0; var15 < var9; ++var15) {
                VertexNormal var16 = var6.vertexNormals[var15];
                if (var13 == var8[var15] && var14 == var6.vz[var15] && var12 == var6.vy[var15]
                  && var16.c != 0) {
                  if (this.aClass50Array2883 == null) {
                    this.aClass50Array2883 = new VertexNormal[this.amountVertices];
                  }

                  if (var6.aClass50Array2883 == null) {
                    var6.aClass50Array2883 = new VertexNormal[var9];
                  }

                  VertexNormal var17 = this.aClass50Array2883[var10];
                  if (var17 == null) {
                    var17 = this.aClass50Array2883[var10] = new VertexNormal(var11);
                  }

                  VertexNormal var18 = var6.aClass50Array2883[var15];
                  if (var18 == null) {
                    var18 = var6.aClass50Array2883[var15] = new VertexNormal(var16);
                  }

                  var17.x += var16.x;
                  var17.y += var16.y;
                  var17.z += var16.z;
                  var17.c += var16.c;
                  var18.x += var11.x;
                  var18.y += var11.y;
                  var18.z += var11.z;
                  var18.c += var11.c;
                  ++var7;
                  anIntArray2861[var10] = anInt2868;
                  anIntArray2875[var15] = anInt2868;
                }
              }
            }
          }
        }
      }
    }

    if (var7 >= 3 && var5) {
      for (var10 = 0; var10 < this.amountFaces; ++var10) {
        if (anIntArray2861[this.v0[var10]] == anInt2868
          && anIntArray2861[this.v1[var10]] == anInt2868
          && anIntArray2861[this.v2[var10]] == anInt2868) {
          if (this.normalTypes == null) {
            this.normalTypes = new byte[this.amountFaces];
          }

          this.normalTypes[var10] = 2;
        }
      }

      for (var10 = 0; var10 < var6.amountFaces; ++var10) {
        if (anIntArray2875[var6.v0[var10]] == anInt2868
          && anIntArray2875[var6.v1[var10]] == anInt2868
          && anIntArray2875[var6.v2[var10]] == anInt2868) {
          if (var6.normalTypes == null) {
            var6.normalTypes = new byte[var6.amountFaces];
          }

          var6.normalTypes[var10] = 2;
        }
      }

    }
  }

  final void method1867(int var1, int var2, int var3, int var4, int var5) {
  }

  final void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8,
                  long var9, int var11, DummyClass0 var12) {
  }

  final int getMinimumY() {
    if (!this.dimensionsUpdated) {
      this.updateDimensions();
    }

    return this.minimumY;
  }

  private final int method1995(Model var1, int var2, short var3) {
    int var4 = var1.vx[var2];
    int var5 = var1.vy[var2];
    int var6 = var1.vz[var2];

    for (int var7 = 0; var7 < this.amountVertices; ++var7) {
      if (var4 == this.vx[var7] && var5 == this.vy[var7] && var6 == this.vz[var7]) {
        this.aShortArray2893[var7] |= var3;
        return var7;
      }
    }

    this.vx[this.amountVertices] = var4;
    this.vy[this.amountVertices] = var5;
    this.vz[this.amountVertices] = var6;
    this.aShortArray2893[this.amountVertices] = var3;
    if (var1.anIntArray2860 != null) {
      this.anIntArray2860[this.amountVertices] = var1.anIntArray2860[var2];
    }

    return this.amountVertices++;
  }

  private final void method1996(int[][] var1, int var2, int var3, int var4, int var5, int var6) {
    boolean var7 = false;
    boolean var8 = false;
    boolean var9 = false;
    int var10 = -var5 / 2;
    int var11 = -var6 / 2;
    int var12 = method2009(var1, var2 + var10, var4 + var11);
    int var13 = var5 / 2;
    int var14 = -var6 / 2;
    int var15 = method2009(var1, var2 + var13, var4 + var14);
    int var16 = -var5 / 2;
    int var17 = var6 / 2;
    int var18 = method2009(var1, var2 + var16, var4 + var17);
    int var19 = var5 / 2;
    int var20 = var6 / 2;
    int var21 = method2009(var1, var2 + var19, var4 + var20);
    int var22 = var12 < var15 ? var12 : var15;
    int var23 = var18 < var21 ? var18 : var21;
    int var24 = var15 < var21 ? var15 : var21;
    int var25 = var12 < var18 ? var12 : var18;
    if (var6 != 0) {
      int var26 = (int) (Math.atan2((double) (var22 - var23), (double) var6) * 325.95D) & 2047;
      if (var26 != 0) {
        this.rotateX(var26);
      }
    }

    if (var5 != 0) {
      int var27 = (int) (Math.atan2((double) (var25 - var24), (double) var5) * 325.95D) & 2047;
      if (var27 != 0) {
        this.rotateZ(var27);
      }
    }

    int ty = var12 + var21;
    if (var15 + var18 < ty) {
      ty = var15 + var18;
    }

    ty = (ty >> 1) - var3;
    if (ty != 0) {
      this.translate(0, ty, 0);
    }
  }

  final void updateNormals() {
    if (this.vertexNormals == null) {
      this.vertexNormals = new VertexNormal[this.amountVertices];

      int face;
      for (face = 0; face < this.amountVertices; ++face) {
        this.vertexNormals[face] = new VertexNormal();
      }

      for (face = 0; face < this.amountFaces; ++face) {
        int v0 = this.v0[face];
        int v1 = this.v1[face];
        int v2 = this.v2[face];
        int vx0 = this.vx[v1] - this.vx[v0];
        int vy0 = this.vy[v1] - this.vy[v0];
        int vz0 = this.vz[v1] - this.vz[v0];
        int vx1 = this.vx[v2] - this.vx[v0];
        int vy1 = this.vy[v2] - this.vy[v0];
        int vz1 = this.vz[v2] - this.vz[v0];
        int vx = vy0 * vz1 - vy1 * vz0;
        int vy = vz0 * vx1 - vz1 * vx0;

        int vz;
        for (
          vz = vx0 * vy1 - vx1 * vy0;
          vx > 8192 || vy > 8192 || vz > 8192 || vx < -8192 || vy < -8192 || vz < -8192; vz >>= 1) {
          vx >>= 1;
          vy >>= 1;
        }

        int magnitude = (int) Math.sqrt((double) (vx * vx + vy * vy + vz * vz));
        if (magnitude <= 0) {
          magnitude = 1;
        }

        vx = vx * 256 / magnitude;
        vy = vy * 256 / magnitude;
        vz = vz * 256 / magnitude;
        byte var15;
        if (this.normalTypes == null) {
          var15 = 0;
        } else {
          var15 = this.normalTypes[face];
        }

        if (var15 == 0) {
          VertexNormal normal = this.vertexNormals[v0];
          normal.x += vx;
          normal.y += vy;
          normal.z += vz;
          ++normal.c;
          normal = this.vertexNormals[v1];
          normal.x += vx;
          normal.y += vy;
          normal.z += vz;
          ++normal.c;
          normal = this.vertexNormals[v2];
          normal.x += vx;
          normal.y += vy;
          normal.z += vz;
          ++normal.c;
        } else if (var15 == 1) {
          if (this.faceNormals == null) {
            this.faceNormals = new FaceNormal[this.amountFaces];
          }

          FaceNormal normal = this.faceNormals[face] = new FaceNormal();
          normal.x = vx;
          normal.y = vy;
          normal.z = vz;
        }
      }

    }
  }

  final void replaceMaterial(short var1, short var2) {
    if (this.materials != null) {
      for (int var3 = 0; var3 < this.amountFaces; ++var3) {
        if (this.materials[var3] == var1) {
          this.materials[var3] = var2;
        }
      }

    }
  }

  final Model method1999(int var1, int var2, int[][] var3, int[][] var4, int var5, int var6,
                         int var7, boolean var8, boolean var9) {
    this.updateDimensions();
    int var10 = var5 + this.minimumX;
    int var11 = var5 + this.maximumX;
    int var12 = var7 + this.minimumZ;
    int var13 = var7 + this.maximumZ;
    if ((var1 == 1 || var1 == 2 || var1 == 3 || var1 == 5) && (var10 < 0
      || var11 + 128 >> 7 >= var3.length || var12 < 0 || var13 + 128 >> 7 >= var3[0].length)) {
      return this;
    } else {
      if (var1 != 4 && var1 != 5) {
        var10 >>= 7;
        var11 = var11 + 127 >> 7;
        var12 >>= 7;
        var13 = var13 + 127 >> 7;
        if (var3[var10][var12] == var6 && var3[var11][var12] == var6 && var3[var10][var13] == var6
          && var3[var11][var13] == var6) {
          return this;
        }
      } else {
        if (var4 == null) {
          return this;
        }

        if (var10 < 0 || var11 + 128 >> 7 >= var4.length || var12 < 0
          || var13 + 128 >> 7 >= var4[0].length) {
          return this;
        }
      }

      Model var14;
      if (var8) {
        var14 = new Model();
        var14.amountVertices = this.amountVertices;
        var14.amountFaces = this.amountFaces;
        var14.anInt2862 = this.anInt2862;
        var14.v0 = this.v0;
        var14.v1 = this.v1;
        var14.v2 = this.v2;
        var14.normalTypes = this.normalTypes;
        var14.aByteArray2889 = this.aByteArray2889;
        var14.aByteArray2843 = this.aByteArray2843;
        var14.aByteArray2866 = this.aByteArray2866;
        var14.triangleColors = this.triangleColors;
        var14.materials = this.materials;
        var14.aByte2848 = this.aByte2848;
        var14.aByteArray2857 = this.aByteArray2857;
        var14.aShortArray2884 = this.aShortArray2884;
        var14.aShortArray2846 = this.aShortArray2846;
        var14.aShortArray2891 = this.aShortArray2891;
        var14.aShortArray2888 = this.aShortArray2888;
        var14.aShortArray2882 = this.aShortArray2882;
        var14.aShortArray2851 = this.aShortArray2851;
        var14.aByteArray2845 = this.aByteArray2845;
        var14.aByteArray2867 = this.aByteArray2867;
        var14.aByteArray2877 = this.aByteArray2877;
        var14.aByteArray2852 = this.aByteArray2852;
        var14.aByteArray2869 = this.aByteArray2869;
        var14.anIntArray2860 = this.anIntArray2860;
        var14.anIntArray2847 = this.anIntArray2847;
        var14.boneGroups = this.boneGroups;
        var14.skinGroups = this.skinGroups;
        var14.aShort2879 = this.aShort2879;
        var14.aShort2876 = this.aShort2876;
        var14.vertexNormals = this.vertexNormals;
        var14.faceNormals = this.faceNormals;
        var14.aClass50Array2883 = this.aClass50Array2883;
        if (var1 == 3) {
          var14.vx = DummyClass45.method1233(this.vx, 2);
          var14.vy = DummyClass45.method1233(this.vy, 2);
          var14.vz = DummyClass45.method1233(this.vz, 2);
        } else {
          var14.vx = this.vx;
          var14.vy = new int[var14.amountVertices];
          var14.vz = this.vz;
        }
      } else {
        var14 = this;
      }

      int var15;
      int var17;
      int var16;
      int var19;
      int var18;
      int var21;
      int var20;
      int var23;
      int var22;
      int var24;
      if (var1 == 1) {
        for (var15 = 0; var15 < var14.amountVertices; ++var15) {
          var16 = this.vx[var15] + var5;
          var17 = this.vz[var15] + var7;
          var18 = var16 & 127;
          var19 = var17 & 127;
          var20 = var16 >> 7;
          var21 = var17 >> 7;
          var22 = var3[var20][var21] * (128 - var18) + var3[var20 + 1][var21] * var18 >> 7;
          var23 = var3[var20][var21 + 1] * (128 - var18) + var3[var20 + 1][var21 + 1] * var18 >> 7;
          var24 = var22 * (128 - var19) + var23 * var19 >> 7;
          var14.vy[var15] = this.vy[var15] + var24 - var6;
        }
      } else {
        int var25;
        if (var1 == 2) {
          for (var15 = 0; var15 < var14.amountVertices; ++var15) {
            var16 = (this.vy[var15] << 16) / this.minimumY;
            if (var16 < var2) {
              var17 = this.vx[var15] + var5;
              var18 = this.vz[var15] + var7;
              var19 = var17 & 127;
              var20 = var18 & 127;
              var21 = var17 >> 7;
              var22 = var18 >> 7;
              var23 = var3[var21][var22] * (128 - var19) + var3[var21 + 1][var22] * var19 >> 7;
              var24 =
                var3[var21][var22 + 1] * (128 - var19) + var3[var21 + 1][var22 + 1] * var19 >> 7;
              var25 = var23 * (128 - var20) + var24 * var20 >> 7;
              var14.vy[var15] = this.vy[var15] + (var25 - var6) * (var2 - var16) / var2;
            } else {
              var14.vy[var15] = this.vy[var15];
            }
          }
        } else if (var1 == 3) {
          var15 = (var2 & 255) * 4;
          var16 = (var2 >> 8 & 255) * 4;
          this.method1996(var3, var5, var6, var7, var15, var16);
        } else if (var1 == 4) {
          var15 = this.maximumY - this.minimumY;

          for (var16 = 0; var16 < this.amountVertices; ++var16) {
            var17 = this.vx[var16] + var5;
            var18 = this.vz[var16] + var7;
            var19 = var17 & 127;
            var20 = var18 & 127;
            var21 = var17 >> 7;
            var22 = var18 >> 7;
            var23 = var4[var21][var22] * (128 - var19) + var4[var21 + 1][var22] * var19 >> 7;
            var24 =
              var4[var21][var22 + 1] * (128 - var19) + var4[var21 + 1][var22 + 1] * var19 >> 7;
            var25 = var23 * (128 - var20) + var24 * var20 >> 7;
            var14.vy[var16] = this.vy[var16] + (var25 - var6) + var15;
          }
        } else if (var1 == 5) {
          var15 = this.maximumY - this.minimumY;

          for (var16 = 0; var16 < this.amountVertices; ++var16) {
            var17 = this.vx[var16] + var5;
            var18 = this.vz[var16] + var7;
            var19 = var17 & 127;
            var20 = var18 & 127;
            var21 = var17 >> 7;
            var22 = var18 >> 7;
            var23 = var3[var21][var22] * (128 - var19) + var3[var21 + 1][var22] * var19 >> 7;
            var24 =
              var3[var21][var22 + 1] * (128 - var19) + var3[var21 + 1][var22 + 1] * var19 >> 7;
            var25 = var23 * (128 - var20) + var24 * var20 >> 7;
            var23 = var4[var21][var22] * (128 - var19) + var4[var21 + 1][var22] * var19 >> 7;
            var24 =
              var4[var21][var22 + 1] * (128 - var19) + var4[var21 + 1][var22 + 1] * var19 >> 7;
            int var26 = var23 * (128 - var20) + var24 * var20 >> 7;
            int var27 = var25 - var26;
            var14.vy[var16] = ((this.vy[var16] << 8) / var15 * var27 >> 8) - (var6 - var25);
          }
        }
      }

      if (var9) {
        var14.invalidate();
      } else {
        this.dimensionsUpdated = false;
      }

      return var14;
    }
  }

  final SoftwareModel method2000(int var1, int var2, int var3, int var4, int var5) {
    return new SoftwareModel(this, var1, var2, var3, var4, var5);
  }

  final void translate(int vx, int vy, int vz) {
    for (int var4 = 0; var4 < this.amountVertices; var4++) {
      this.vx[var4] += vx;
      this.vy[var4] += vy;
      this.vz[var4] += vz;
    }

    this.invalidate();
  }

  final void method2002() {
    int var1;
    for (var1 = 0; var1 < this.amountVertices; ++var1) {
      this.vz[var1] = -this.vz[var1];
    }

    for (var1 = 0; var1 < this.amountFaces; ++var1) {
      int var2 = this.v0[var1];
      this.v0[var1] = this.v2[var1];
      this.v2[var1] = var2;
    }

    this.invalidate();
  }

  private final void parseRt4Config(byte[] var1) {
    Buffer var2 = new Buffer(var1);
    Buffer var3 = new Buffer(var1);
    Buffer var4 = new Buffer(var1);
    Buffer var5 = new Buffer(var1);
    Buffer var6 = new Buffer(var1);
    Buffer var7 = new Buffer(var1);
    Buffer var8 = new Buffer(var1);
    var2.position = var1.length - 23;
    int var9 = var2.readUnsignedShort();
    int var10 = var2.readUnsignedShort();
    int var11 = var2.readUnsignedByte();
    int var12 = var2.readUnsignedByte();
    boolean var13 = (var12 & 1) == 1;
    boolean var14 = (var12 & 2) == 2;
    int var15 = var2.readUnsignedByte();
    int var16 = var2.readUnsignedByte();
    int var17 = var2.readUnsignedByte();
    int var18 = var2.readUnsignedByte();
    int var19 = var2.readUnsignedByte();
    int var20 = var2.readUnsignedShort();
    int var21 = var2.readUnsignedShort();
    int var22 = var2.readUnsignedShort();
    int var23 = var2.readUnsignedShort();
    int var24 = var2.readUnsignedShort();
    int var25 = 0;
    int var26 = 0;
    int var27 = 0;
    int var28;
    if (var11 > 0) {
      this.aByteArray2857 = new byte[var11];
      var2.position = 0;

      for (var28 = 0; var28 < var11; ++var28) {
        byte var29 = this.aByteArray2857[var28] = var2.readByte();
        if (var29 == 0) {
          ++var25;
        }

        if (var29 >= 1 && var29 <= 3) {
          ++var26;
        }

        if (var29 == 2) {
          ++var27;
        }
      }
    }

    var28 = var11 + var9;
    int var30 = var28;
    if (var13) {
      var28 += var10;
    }

    int var31 = var28;
    var28 += var10;
    int var32 = var28;
    if (var15 == 255) {
      var28 += var10;
    }

    int var33 = var28;
    if (var17 == 1) {
      var28 += var10;
    }

    int var34 = var28;
    if (var19 == 1) {
      var28 += var9;
    }

    int var35 = var28;
    if (var16 == 1) {
      var28 += var10;
    }

    int var36 = var28;
    var28 += var23;
    int var37 = var28;
    if (var18 == 1) {
      var28 += var10 * 2;
    }

    int var38 = var28;
    var28 += var24;
    int var39 = var28;
    var28 += var10 * 2;
    int var40 = var28;
    var28 += var20;
    int var41 = var28;
    var28 += var21;
    int var42 = var28;
    var28 += var22;
    int var43 = var28;
    var28 += var25 * 6;
    int var44 = var28;
    var28 += var26 * 6;
    int var45 = var28;
    var28 += var26 * 6;
    int var46 = var28;
    var28 += var26;
    int var47 = var28;
    var28 += var26;
    int var48 = var28;
    var28 += var26 + var27 * 2;
    this.amountVertices = var9;
    this.amountFaces = var10;
    this.anInt2862 = var11;
    this.vx = new int[var9];
    this.vy = new int[var9];
    this.vz = new int[var9];
    this.v0 = new int[var10];
    this.v1 = new int[var10];
    this.v2 = new int[var10];
    if (var19 == 1) {
      this.anIntArray2860 = new int[var9];
    }

    if (var13) {
      this.normalTypes = new byte[var10];
    }

    if (var15 == 255) {
      this.aByteArray2889 = new byte[var10];
    } else {
      this.aByte2848 = (byte) var15;
    }

    if (var16 == 1) {
      this.aByteArray2843 = new byte[var10];
    }

    if (var17 == 1) {
      this.anIntArray2847 = new int[var10];
    }

    if (var18 == 1) {
      this.materials = new short[var10];
    }

    if (var18 == 1 && var11 > 0) {
      this.aByteArray2866 = new byte[var10];
    }

    this.triangleColors = new short[var10];
    if (var11 > 0) {
      this.aShortArray2884 = new short[var11];
      this.aShortArray2846 = new short[var11];
      this.aShortArray2891 = new short[var11];
      if (var26 > 0) {
        this.aShortArray2888 = new short[var26];
        this.aShortArray2882 = new short[var26];
        this.aShortArray2851 = new short[var26];
        this.aByteArray2845 = new byte[var26];
        this.aByteArray2867 = new byte[var26];
        this.aByteArray2877 = new byte[var26];
      }

      if (var27 > 0) {
        this.aByteArray2852 = new byte[var27];
        this.aByteArray2869 = new byte[var27];
      }
    }

    var2.position = var11;
    var3.position = var40;
    var4.position = var41;
    var5.position = var42;
    var6.position = var34;
    int var50 = 0;
    int var51 = 0;
    int var52 = 0;

    int var55;
    int var54;
    int var53;
    int var57;
    int var56;
    for (var53 = 0; var53 < var9; ++var53) {
      var54 = var2.readUnsignedByte();
      var55 = 0;
      if ((var54 & 1) != 0) {
        var55 = var3.readUnsignedSmart();
      }

      var56 = 0;
      if ((var54 & 2) != 0) {
        var56 = var4.readUnsignedSmart();
      }

      var57 = 0;
      if ((var54 & 4) != 0) {
        var57 = var5.readUnsignedSmart();
      }

      this.vx[var53] = var50 + var55;
      this.vy[var53] = var51 + var56;
      this.vz[var53] = var52 + var57;
      var50 = this.vx[var53];
      var51 = this.vy[var53];
      var52 = this.vz[var53];
      if (var19 == 1) {
        this.anIntArray2860[var53] = var6.readUnsignedByte();
      }
    }

    var2.position = var39;
    var3.position = var30;
    var4.position = var32;
    var5.position = var35;
    var6.position = var33;
    var7.position = var37;
    var8.position = var38;

    for (var53 = 0; var53 < var10; ++var53) {
      this.triangleColors[var53] = (short) var2.readUnsignedShort();
      if (var13) {
        this.normalTypes[var53] = var3.readByte();
      }

      if (var15 == 255) {
        this.aByteArray2889[var53] = var4.readByte();
      }

      if (var16 == 1) {
        this.aByteArray2843[var53] = var5.readByte();
      }

      if (var17 == 1) {
        this.anIntArray2847[var53] = var6.readUnsignedByte();
      }

      if (var18 == 1) {
        this.materials[var53] = (short) (var7.readUnsignedShort() - 1);
      }

      if (this.aByteArray2866 != null) {
        if (this.materials[var53] != -1) {
          this.aByteArray2866[var53] = (byte) (var8.readUnsignedByte() - 1);
        } else {
          this.aByteArray2866[var53] = -1;
        }
      }
    }

    var2.position = var36;
    var3.position = var31;
    var53 = 0;
    var54 = 0;
    var55 = 0;
    var56 = 0;

    int var58;
    for (var57 = 0; var57 < var10; ++var57) {
      var58 = var3.readUnsignedByte();
      if (var58 == 1) {
        var53 = var2.readUnsignedSmart() + var56;
        var54 = var2.readUnsignedSmart() + var53;
        var55 = var2.readUnsignedSmart() + var54;
        var56 = var55;
        this.v0[var57] = var53;
        this.v1[var57] = var54;
        this.v2[var57] = var55;
      }

      if (var58 == 2) {
        var54 = var55;
        var55 = var2.readUnsignedSmart() + var56;
        var56 = var55;
        this.v0[var57] = var53;
        this.v1[var57] = var54;
        this.v2[var57] = var55;
      }

      if (var58 == 3) {
        var53 = var55;
        var55 = var2.readUnsignedSmart() + var56;
        var56 = var55;
        this.v0[var57] = var53;
        this.v1[var57] = var54;
        this.v2[var57] = var55;
      }

      if (var58 == 4) {
        int var59 = var53;
        var53 = var54;
        var54 = var59;
        var55 = var2.readUnsignedSmart() + var56;
        var56 = var55;
        this.v0[var57] = var53;
        this.v1[var57] = var59;
        this.v2[var57] = var55;
      }
    }

    var2.position = var43;
    var3.position = var44;
    var4.position = var45;
    var5.position = var46;
    var6.position = var47;
    var7.position = var48;

    for (var57 = 0; var57 < var11; ++var57) {
      var58 = this.aByteArray2857[var57] & 255;
      if (var58 == 0) {
        this.aShortArray2884[var57] = (short) var2.readUnsignedShort();
        this.aShortArray2846[var57] = (short) var2.readUnsignedShort();
        this.aShortArray2891[var57] = (short) var2.readUnsignedShort();
      }

      if (var58 == 1) {
        this.aShortArray2884[var57] = (short) var3.readUnsignedShort();
        this.aShortArray2846[var57] = (short) var3.readUnsignedShort();
        this.aShortArray2891[var57] = (short) var3.readUnsignedShort();
        this.aShortArray2888[var57] = (short) var4.readUnsignedShort();
        this.aShortArray2882[var57] = (short) var4.readUnsignedShort();
        this.aShortArray2851[var57] = (short) var4.readUnsignedShort();
        this.aByteArray2845[var57] = var5.readByte();
        this.aByteArray2867[var57] = var6.readByte();
        this.aByteArray2877[var57] = var7.readByte();
      }

      if (var58 == 2) {
        this.aShortArray2884[var57] = (short) var3.readUnsignedShort();
        this.aShortArray2846[var57] = (short) var3.readUnsignedShort();
        this.aShortArray2891[var57] = (short) var3.readUnsignedShort();
        this.aShortArray2888[var57] = (short) var4.readUnsignedShort();
        this.aShortArray2882[var57] = (short) var4.readUnsignedShort();
        this.aShortArray2851[var57] = (short) var4.readUnsignedShort();
        this.aByteArray2845[var57] = var5.readByte();
        this.aByteArray2867[var57] = var6.readByte();
        this.aByteArray2877[var57] = var7.readByte();
        this.aByteArray2852[var57] = var7.readByte();
        this.aByteArray2869[var57] = var7.readByte();
      }

      if (var58 == 3) {
        this.aShortArray2884[var57] = (short) var3.readUnsignedShort();
        this.aShortArray2846[var57] = (short) var3.readUnsignedShort();
        this.aShortArray2891[var57] = (short) var3.readUnsignedShort();
        this.aShortArray2888[var57] = (short) var4.readUnsignedShort();
        this.aShortArray2882[var57] = (short) var4.readUnsignedShort();
        this.aShortArray2851[var57] = (short) var4.readUnsignedShort();
        this.aByteArray2845[var57] = var5.readByte();
        this.aByteArray2867[var57] = var6.readByte();
        this.aByteArray2877[var57] = var7.readByte();
      }
    }

    if (var14) {
      var2.position = var28;
      var57 = var2.readUnsignedByte();
      if (var57 > 0) {
        var2.position += 4 * var57;
      }

      var58 = var2.readUnsignedByte();
      if (var58 > 0) {
        var2.position += 4 * var58;
      }
    }

  }

  final Model copy() {
    Model var1 = new Model();
    if (this.normalTypes != null) {
      var1.normalTypes = new byte[this.amountFaces];

      for (int var2 = 0; var2 < this.amountFaces; ++var2) {
        var1.normalTypes[var2] = this.normalTypes[var2];
      }
    }

    var1.amountVertices = this.amountVertices;
    var1.amountFaces = this.amountFaces;
    var1.anInt2862 = this.anInt2862;
    var1.vx = this.vx;
    var1.vy = this.vy;
    var1.vz = this.vz;
    var1.v0 = this.v0;
    var1.v1 = this.v1;
    var1.v2 = this.v2;
    var1.aByteArray2889 = this.aByteArray2889;
    var1.aByteArray2843 = this.aByteArray2843;
    var1.aByteArray2866 = this.aByteArray2866;
    var1.triangleColors = this.triangleColors;
    var1.materials = this.materials;
    var1.aByte2848 = this.aByte2848;
    var1.aByteArray2857 = this.aByteArray2857;
    var1.aShortArray2884 = this.aShortArray2884;
    var1.aShortArray2846 = this.aShortArray2846;
    var1.aShortArray2891 = this.aShortArray2891;
    var1.aShortArray2888 = this.aShortArray2888;
    var1.aShortArray2882 = this.aShortArray2882;
    var1.aShortArray2851 = this.aShortArray2851;
    var1.aByteArray2845 = this.aByteArray2845;
    var1.aByteArray2867 = this.aByteArray2867;
    var1.aByteArray2877 = this.aByteArray2877;
    var1.aByteArray2852 = this.aByteArray2852;
    var1.aByteArray2869 = this.aByteArray2869;
    var1.anIntArray2860 = this.anIntArray2860;
    var1.anIntArray2847 = this.anIntArray2847;
    var1.boneGroups = this.boneGroups;
    var1.skinGroups = this.skinGroups;
    var1.vertexNormals = this.vertexNormals;
    var1.faceNormals = this.faceNormals;
    var1.aShort2879 = this.aShort2879;
    var1.aShort2876 = this.aShort2876;
    return var1;
  }

  final int appendFace(int v0, int v1, int v2, byte normalType, short color, byte var6) {
    this.v0[this.amountFaces] = v0;
    this.v1[this.amountFaces] = v1;
    this.v2[this.amountFaces] = v2;
    this.normalTypes[this.amountFaces] = normalType;
    this.aByteArray2866[this.amountFaces] = -1;
    this.triangleColors[this.amountFaces] = color;
    this.materials[this.amountFaces] = -1;
    this.aByteArray2843[this.amountFaces] = var6;
    return this.amountFaces++;
  }

  private final void rotateX(int var1) {
    int var2 = SINE_TABLE[var1];
    int var3 = COSINE_TABLE[var1];

    for (int var4 = 0; var4 < this.amountVertices; ++var4) {
      int var5 = this.vy[var4] * var3 - this.vz[var4] * var2 >> 16;
      this.vz[var4] = this.vy[var4] * var2 + this.vz[var4] * var3 >> 16;
      this.vy[var4] = var5;
    }

    this.invalidate();
  }

  private final void invalidate() {
    this.vertexNormals = null;
    this.aClass50Array2883 = null;
    this.faceNormals = null;
    this.dimensionsUpdated = false;
  }

  final AbstractModel method2008(int var1, int var2, int var3, int var4, int var5) {
    if (GlRenderer.useOpenGlRenderer) {
      GlModel var6 = new GlModel(this, var1, var2, true);
      var6.method1908();
      return var6;
    } else {
      return new SoftwareModel(this, var1, var2, var3, var4, var5);
    }
  }

  final void method2010() {
    this.anIntArray2860 = null;
    this.anIntArray2847 = null;
    this.boneGroups = null;
    this.skinGroups = null;
  }

  final void method2011(int var1) {
    int var2 = SINE_TABLE[var1];
    int var3 = COSINE_TABLE[var1];

    for (int var4 = 0; var4 < this.amountVertices; ++var4) {
      int var5 = this.vz[var4] * var2 + this.vx[var4] * var3 >> 16;
      this.vz[var4] = this.vz[var4] * var3 - this.vx[var4] * var2 >> 16;
      this.vx[var4] = var5;
    }

    this.invalidate();
  }

  final void initializeSkinAndBoneGroups() {
    int[] var1;
    int var2;
    int var3;
    int var4;
    if (this.anIntArray2860 != null) {
      var1 = new int[256];
      var2 = 0;

      for (var3 = 0; var3 < this.amountVertices; ++var3) {
        var4 = this.anIntArray2860[var3];
        ++var1[var4];
        if (var4 > var2) {
          var2 = var4;
        }
      }

      this.boneGroups = new int[var2 + 1][];

      for (var3 = 0; var3 <= var2; ++var3) {
        this.boneGroups[var3] = new int[var1[var3]];
        var1[var3] = 0;
      }

      for (var3 = 0; var3 < this.amountVertices; this.boneGroups[var4][var1[var4]++] = var3++) {
        var4 = this.anIntArray2860[var3];
      }

      this.anIntArray2860 = null;
    }

    if (this.anIntArray2847 != null) {
      var1 = new int[256];
      var2 = 0;

      for (var3 = 0; var3 < this.amountFaces; ++var3) {
        var4 = this.anIntArray2847[var3];
        ++var1[var4];
        if (var4 > var2) {
          var2 = var4;
        }
      }

      this.skinGroups = new int[var2 + 1][];

      for (var3 = 0; var3 <= var2; ++var3) {
        this.skinGroups[var3] = new int[var1[var3]];
        var1[var3] = 0;
      }

      for (var3 = 0; var3 < this.amountFaces; this.skinGroups[var4][var1[var4]++] = var3++) {
        var4 = this.anIntArray2847[var3];
      }

      this.anIntArray2847 = null;
    }

  }

  final void rotate(int rotationX, int rotationY, int rotationZ) {
    int var4;
    int var5;
    int var6;
    int var7;
    if (rotationZ != 0) {
      var4 = SINE_TABLE[rotationZ];
      var5 = COSINE_TABLE[rotationZ];

      for (var6 = 0; var6 < this.amountVertices; ++var6) {
        var7 = this.vy[var6] * var4 + this.vx[var6] * var5 >> 16;
        this.vy[var6] = this.vy[var6] * var5 - this.vx[var6] * var4 >> 16;
        this.vx[var6] = var7;
      }
    }

    if (rotationX != 0) {
      var4 = SINE_TABLE[rotationX];
      var5 = COSINE_TABLE[rotationX];

      for (var6 = 0; var6 < this.amountVertices; ++var6) {
        var7 = this.vy[var6] * var5 - this.vz[var6] * var4 >> 16;
        this.vz[var6] = this.vy[var6] * var4 + this.vz[var6] * var5 >> 16;
        this.vy[var6] = var7;
      }
    }

    if (rotationY != 0) {
      var4 = SINE_TABLE[rotationY];
      var5 = COSINE_TABLE[rotationY];

      for (var6 = 0; var6 < this.amountVertices; ++var6) {
        var7 = this.vz[var6] * var4 + this.vx[var6] * var5 >> 16;
        this.vz[var6] = this.vz[var6] * var5 - this.vx[var6] * var4 >> 16;
        this.vx[var6] = var7;
      }
    }

  }

  final int addVertex(int x, int y, int z) {
    for (int var4 = 0; var4 < this.amountVertices; ++var4) {
      if (this.vx[var4] == x && this.vy[var4] == y && this.vz[var4] == z) {
        return var4;
      }
    }

    this.vx[this.amountVertices] = x;
    this.vy[this.amountVertices] = y;
    this.vz[this.amountVertices] = z;
    return this.amountVertices++;
  }

  final void replaceColor(short color, short replace) {
    for (int var3 = 0; var3 < this.amountFaces; ++var3) {
      if (this.triangleColors[var3] == color) {
        this.triangleColors[var3] = replace;
      }
    }

  }

  private final void parseRt3Config(byte[] bytes) {
    boolean var2 = false;
    boolean var3 = false;
    Buffer var4 = new Buffer(bytes);
    Buffer var5 = new Buffer(bytes);
    Buffer var6 = new Buffer(bytes);
    Buffer var7 = new Buffer(bytes);
    Buffer var8 = new Buffer(bytes);
    var4.position = bytes.length - 18;
    int var9 = var4.readUnsignedShort();
    int var10 = var4.readUnsignedShort();
    int var11 = var4.readUnsignedByte();
    int var12 = var4.readUnsignedByte();
    int var13 = var4.readUnsignedByte();
    int var14 = var4.readUnsignedByte();
    int var15 = var4.readUnsignedByte();
    int var16 = var4.readUnsignedByte();
    int var17 = var4.readUnsignedShort();
    int var18 = var4.readUnsignedShort();
    int var19 = var4.readUnsignedShort();
    int var20 = var4.readUnsignedShort();
    byte var21 = 0;
    int var45 = var21 + var9;
    int var23 = var45;
    var45 += var10;
    int var24 = var45;
    if (var13 == 255) {
      var45 += var10;
    }

    int var25 = var45;
    if (var15 == 1) {
      var45 += var10;
    }

    int var26 = var45;
    if (var12 == 1) {
      var45 += var10;
    }

    int var27 = var45;
    if (var16 == 1) {
      var45 += var9;
    }

    int var28 = var45;
    if (var14 == 1) {
      var45 += var10;
    }

    int var29 = var45;
    var45 += var20;
    int var30 = var45;
    var45 += var10 * 2;
    int var31 = var45;
    var45 += var11 * 6;
    int var32 = var45;
    var45 += var17;
    int var33 = var45;
    var45 += var18;
    int var10000 = var45 + var19;
    this.amountVertices = var9;
    this.amountFaces = var10;
    this.anInt2862 = var11;
    this.vx = new int[var9];
    this.vy = new int[var9];
    this.vz = new int[var9];
    this.v0 = new int[var10];
    this.v1 = new int[var10];
    this.v2 = new int[var10];
    if (var11 > 0) {
      this.aByteArray2857 = new byte[var11];
      this.aShortArray2884 = new short[var11];
      this.aShortArray2846 = new short[var11];
      this.aShortArray2891 = new short[var11];
    }

    if (var16 == 1) {
      this.anIntArray2860 = new int[var9];
    }

    if (var12 == 1) {
      this.normalTypes = new byte[var10];
      this.aByteArray2866 = new byte[var10];
      this.materials = new short[var10];
    }

    if (var13 == 255) {
      this.aByteArray2889 = new byte[var10];
    } else {
      this.aByte2848 = (byte) var13;
    }

    if (var14 == 1) {
      this.aByteArray2843 = new byte[var10];
    }

    if (var15 == 1) {
      this.anIntArray2847 = new int[var10];
    }

    this.triangleColors = new short[var10];
    var4.position = var21;
    var5.position = var32;
    var6.position = var33;
    var7.position = var45;
    var8.position = var27;
    int ax = 0;
    int ay = 0;
    int az = 0;

    int var38;
    int flags;
    int dz;
    int dx;
    int dy;
    for (var38 = 0; var38 < var9; ++var38) {
      flags = var4.readUnsignedByte();
      dx = 0;
      if ((flags & 1) != 0) {
        dx = var5.readUnsignedSmart();
      }

      dy = 0;
      if ((flags & 2) != 0) {
        dy = var6.readUnsignedSmart();
      }

      dz = 0;
      if ((flags & 4) != 0) {
        dz = var7.readUnsignedSmart();
      }

      this.vx[var38] = ax + dx;
      this.vy[var38] = ay + dy;
      this.vz[var38] = az + dz;
      ax = this.vx[var38];
      ay = this.vy[var38];
      az = this.vz[var38];
      if (var16 == 1) {
        this.anIntArray2860[var38] = var8.readUnsignedByte();
      }
    }

    var4.position = var30;
    var5.position = var26;
    var6.position = var24;
    var7.position = var28;
    var8.position = var25;

    for (var38 = 0; var38 < var10; ++var38) {
      this.triangleColors[var38] = (short) var4.readUnsignedShort();
      if (var12 == 1) {
        flags = var5.readUnsignedByte();
        if ((flags & 1) == 1) {
          this.normalTypes[var38] = 1;
          var2 = true;
        } else {
          this.normalTypes[var38] = 0;
        }

        if ((flags & 2) == 2) {
          this.aByteArray2866[var38] = (byte) (flags >> 2);
          this.materials[var38] = this.triangleColors[var38];
          this.triangleColors[var38] = 127;
          if (this.materials[var38] != -1) {
            var3 = true;
          }
        } else {
          this.aByteArray2866[var38] = -1;
          this.materials[var38] = -1;
        }
      }

      if (var13 == 255) {
        this.aByteArray2889[var38] = var6.readByte();
      }

      if (var14 == 1) {
        this.aByteArray2843[var38] = var7.readByte();
      }

      if (var15 == 1) {
        this.anIntArray2847[var38] = var8.readUnsignedByte();
      }
    }

    var4.position = var29;
    var5.position = var23;
    var38 = 0;
    flags = 0;
    dx = 0;
    dy = 0;

    int var43;
    int var44;
    for (dz = 0; dz < var10; ++dz) {
      var43 = var5.readUnsignedByte();
      if (var43 == 1) {
        var38 = var4.readUnsignedSmart() + dy;
        flags = var4.readUnsignedSmart() + var38;
        dx = var4.readUnsignedSmart() + flags;
        dy = dx;
        this.v0[dz] = var38;
        this.v1[dz] = flags;
        this.v2[dz] = dx;
      }

      if (var43 == 2) {
        flags = dx;
        dx = var4.readUnsignedSmart() + dy;
        dy = dx;
        this.v0[dz] = var38;
        this.v1[dz] = flags;
        this.v2[dz] = dx;
      }

      if (var43 == 3) {
        var38 = dx;
        dx = var4.readUnsignedSmart() + dy;
        dy = dx;
        this.v0[dz] = var38;
        this.v1[dz] = flags;
        this.v2[dz] = dx;
      }

      if (var43 == 4) {
        var44 = var38;
        var38 = flags;
        flags = var44;
        dx = var4.readUnsignedSmart() + dy;
        dy = dx;
        this.v0[dz] = var38;
        this.v1[dz] = var44;
        this.v2[dz] = dx;
      }
    }

    var4.position = var31;

    for (dz = 0; dz < var11; ++dz) {
      this.aByteArray2857[dz] = 0;
      this.aShortArray2884[dz] = (short) var4.readUnsignedShort();
      this.aShortArray2846[dz] = (short) var4.readUnsignedShort();
      this.aShortArray2891[dz] = (short) var4.readUnsignedShort();
    }

    if (this.aByteArray2866 != null) {
      boolean var46 = false;

      for (var43 = 0; var43 < var10; ++var43) {
        var44 = this.aByteArray2866[var43] & 255;
        if (var44 != 255) {
          if ((this.aShortArray2884[var44] & '\uffff') == this.v0[var43]
            && (this.aShortArray2846[var44] & '\uffff') == this.v1[var43]
            && (this.aShortArray2891[var44] & '\uffff') == this.v2[var43]) {
            this.aByteArray2866[var43] = -1;
          } else {
            var46 = true;
          }
        }
      }

      if (!var46) {
        this.aByteArray2866 = null;
      }
    }

    if (!var3) {
      this.materials = null;
    }

    if (!var2) {
      this.normalTypes = null;
    }

  }

  final void method2018() {
    for (int var1 = 0; var1 < this.amountVertices; ++var1) {
      int var2 = this.vz[var1];
      this.vz[var1] = this.vx[var1];
      this.vx[var1] = -var2;
    }

    this.invalidate();
  }

  public static void destroy() {
    anIntArray2861 = null;
    anIntArray2875 = null;
    SINE_TABLE = null;
    COSINE_TABLE = null;
  }

  private static final int method2009(int[][] var0, int var1, int var2) {
    int var3 = var1 >> 7;
    int var4 = var2 >> 7;
    if (var3 >= 0 && var4 >= 0 && var3 < var0.length && var4 < var0[0].length) {
      int var5 = var1 & 127;
      int var6 = var2 & 127;
      int var7 = var0[var3][var4] * (128 - var5) + var0[var3 + 1][var4] * var5 >> 7;
      int var8 = var0[var3][var4 + 1] * (128 - var5) + var0[var3 + 1][var4 + 1] * var5 >> 7;
      return var7 * (128 - var6) + var8 * var6 >> 7;
    } else {
      return 0;
    }
  }

  static final Model getModel(FileUnpacker var0, int var1, int var2) {
    byte[] var3 = var0.getBytes(var1, var2);
    return var3 == null ? null : new Model(var3);
  }

}
