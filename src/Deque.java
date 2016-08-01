final class Deque {

  static int anInt937;
  static int anInt938;
  static ObjectCache aClass93_939 = new ObjectCache(4);
  Node root = new Node();
  private Node iterator;


  public Deque() {
    try {
      this.root.prevNode = this.root;
      this.root.nextNode = this.root;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ih.<init>()");
    }
  }

  final void clear(int var1) {
    try {
      while (true) {
        Node var2 = this.root.nextNode;
        if (var2 == this.root) {
          if (var1 > -47) {
            this.root = null;
          }

          this.iterator = null;
          return;
        }

        var2.unlinkNode();
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "ih.C(" + var1 + ')');
    }
  }

  final Node method1212(int var1) {
    try {
      Node var2 = this.root.prevNode;
      if (var1 != 2) {
        method1213(56, null);
      }

      if (this.root == var2) {
        this.iterator = null;
        return null;
      } else {
        this.iterator = var2.prevNode;
        return var2;
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "ih.B(" + var1 + ')');
    }
  }

  final void addLast(Node var2) {
    try {
      if (null != var2.prevNode) {
        var2.unlinkNode();
      }

      var2.nextNode = this.root;
      var2.prevNode = this.root.prevNode;

      var2.prevNode.nextNode = var2;
      var2.nextNode.prevNode = var2;

    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "ih.D(" + (var2 != null ? "{...}" : "null") + ')');
    }
  }

  final void method1216(int var1, Node var2) {
    try {
      if (null != var2.prevNode) {
        var2.unlinkNode();
      }

      var2.nextNode = this.root.nextNode;
      var2.prevNode = this.root;
      var2.prevNode.nextNode = var2;
      var2.nextNode.prevNode = var2;
      if (var1 != 64) {
        this.getNext();
      }

    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "ih.N(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
    }
  }

  final Node method1219(int var1) {
    try {
      if (var1 < 13) {
        this.root = null;
      }

      Node var2 = this.iterator;
      if (this.root == var2) {
        this.iterator = null;
        return null;
      } else {
        this.iterator = var2.prevNode;
        return var2;
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "ih.H(" + var1 + ')');
    }
  }

  final Node method1220(byte var1) {
    try {
      Node var2 = this.root.nextNode;
      if (var1 != -3) {
        return null;
      } else if (this.root != var2) {
        var2.unlinkNode();
        return var2;
      } else {
        return null;
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "ih.E(" + var1 + ')');
    }
  }

  final Node getNext() {
    try {

      Node var2 = this.iterator;
      if (var2 != this.root) {
        this.iterator = var2.nextNode;
        return var2;
      } else {
        this.iterator = null;
        return null;
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "ih.L()");
    }
  }

  final Node getFirst() {
    try {
      Node var2 = this.root.nextNode;
      if (this.root == var2) {
        this.iterator = null;
        return null;
      } else {
        this.iterator = var2.nextNode;
        return var2;
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "ih.F()");
    }
  }

  static final SceneSomething2 method1209(int var0, int var1, int var2) {
    SceneGraphTile var3 = SomethingTexture1.sceneGraphTiles[var0][var1][var2];
    if (var3 == null) {
      return null;
    } else {
      SceneSomething2 var4 = var3.aClass70_2234;
      var3.aClass70_2234 = null;
      return var4;
    }
  }

  static final Parameter method1210(int var0, int var1) {
    try {
      Parameter var2 = (Parameter) DummyClass6.aClass47_2041.get((long) var1, 1400);
      if (var0 != 64) {
        method1218(false, -77, -82);
      }

      if (null == var2) {
        byte[] var3 = TextureSampler27.aClass153_3098.getBytes(11, var1);
        var2 = new Parameter();
        if (var3 != null) {
          var2.method583(207, new Buffer(var3));
        }

        DummyClass6.aClass47_2041.put((long) var1, var2);
        return var2;
      } else {
        return var2;
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "ih.G(" + var0 + ',' + var1 + ')');
    }
  }

  static final void method1213(int var0, SomethingGl0[] var1) {
    SomethingOtherWorldMap.aClass3_Sub11ArrayArray2542[var0] = var1;
  }

  static final void method1214(int var0, int var1, int var2, int var3, int var4) {
    try {
      AreaSoundEffect var5;
      for (
        var5 = (AreaSoundEffect) Node.aClass61_78.getFirst();
        var5 != null; var5 = (AreaSoundEffect) Node.aClass61_78.getNext()) {
        Structure.method606(var1, var5, var3, var0, var2, 126);
      }

      byte var6;
      RenderAnimation var7;
      int var8;
      for (
        var5 = (AreaSoundEffect) SocketStream.aClass61_1242.getFirst();
        var5 != null; var5 = (AreaSoundEffect) SocketStream.aClass61_1242.getNext()) {
        var6 = 1;
        var7 = var5.aClass140_Sub4_Sub2_2324.getRenderAnimationId(false);
        if (~var7.anInt368 != ~var5.aClass140_Sub4_Sub2_2324.anInt2764) {
          if (~var7.anInt393 != ~var5.aClass140_Sub4_Sub2_2324.anInt2764
            && ~var7.anInt386 != ~var5.aClass140_Sub4_Sub2_2324.anInt2764
            && ~var7.anInt375 != ~var5.aClass140_Sub4_Sub2_2324.anInt2764
            && ~var7.anInt373 != ~var5.aClass140_Sub4_Sub2_2324.anInt2764) {
            if (var7.anInt398 == var5.aClass140_Sub4_Sub2_2324.anInt2764
              || var7.anInt372 == var5.aClass140_Sub4_Sub2_2324.anInt2764
              || var5.aClass140_Sub4_Sub2_2324.anInt2764 == var7.anInt379
              || ~var7.anInt406 == ~var5.aClass140_Sub4_Sub2_2324.anInt2764) {
              var6 = 3;
            }
          } else {
            var6 = 2;
          }
        } else {
          var6 = 0;
        }

        if (var5.anInt2322 != var6) {
          var8 = ISAACCipher.method1232(var5.aClass140_Sub4_Sub2_2324, -1);
          if (var8 != var5.anInt2332) {
            if (var5.aClass3_Sub24_Sub1_2312 != null) {
              MonoChromaticImageBuffer.aClass3_Sub24_Sub2_2563.method461(
                var5.aClass3_Sub24_Sub1_2312);
              var5.aClass3_Sub24_Sub1_2312 = null;
            }

            var5.anInt2332 = var8;
          }

          var5.anInt2322 = var6;
        }

        var5.anInt2326 = var5.aClass140_Sub4_Sub2_2324.anInt2819;
        var5.anInt2321 =
          var5.aClass140_Sub4_Sub2_2324.anInt2819 + var5.aClass140_Sub4_Sub2_2324.getSize() * 64;
        var5.anInt2308 = var5.aClass140_Sub4_Sub2_2324.anInt2829;
        var5.anInt2307 =
          var5.aClass140_Sub4_Sub2_2324.anInt2829 + var5.aClass140_Sub4_Sub2_2324.getSize() * 64;
        Structure.method606(var1, var5, var3, var0, var2, var4 ^ 113);
      }

      if (var4 == 1) {
        for (
          var5 = (AreaSoundEffect) ObjectNode.aClass130_4046.getFirst(88);
          var5 != null; var5 = (AreaSoundEffect) ObjectNode.aClass130_4046.getNext(var4 ^ -92)) {
          var6 = 1;
          var7 = var5.aClass140_Sub4_Sub1_2327.getRenderAnimationId(false);
          if (var5.aClass140_Sub4_Sub1_2327.anInt2764 != var7.anInt368) {
            if (var5.aClass140_Sub4_Sub1_2327.anInt2764 != var7.anInt393
              && var5.aClass140_Sub4_Sub1_2327.anInt2764 != var7.anInt386
              && ~var5.aClass140_Sub4_Sub1_2327.anInt2764 != ~var7.anInt375
              && var7.anInt373 != var5.aClass140_Sub4_Sub1_2327.anInt2764) {
              if (var7.anInt398 == var5.aClass140_Sub4_Sub1_2327.anInt2764
                || var5.aClass140_Sub4_Sub1_2327.anInt2764 == var7.anInt372
                || ~var5.aClass140_Sub4_Sub1_2327.anInt2764 == ~var7.anInt379
                || ~var5.aClass140_Sub4_Sub1_2327.anInt2764 == ~var7.anInt406) {
                var6 = 3;
              }
            } else {
              var6 = 2;
            }
          } else {
            var6 = 0;
          }

          if (~var5.anInt2322 != ~var6) {
            var8 = DummyClass50.method1398(0, var5.aClass140_Sub4_Sub1_2327);
            if (~var5.anInt2332 != ~var8) {
              if (var5.aClass3_Sub24_Sub1_2312 != null) {
                MonoChromaticImageBuffer.aClass3_Sub24_Sub2_2563.method461(
                  var5.aClass3_Sub24_Sub1_2312);
                var5.aClass3_Sub24_Sub1_2312 = null;
              }

              var5.anInt2332 = var8;
            }

            var5.anInt2322 = var6;
          }

          var5.anInt2326 = var5.aClass140_Sub4_Sub1_2327.anInt2819;
          var5.anInt2321 =
            var5.aClass140_Sub4_Sub1_2327.anInt2819 + 64 * var5.aClass140_Sub4_Sub1_2327.getSize();
          var5.anInt2308 = var5.aClass140_Sub4_Sub1_2327.anInt2829;
          var5.anInt2307 =
            var5.aClass140_Sub4_Sub1_2327.anInt2829 + var5.aClass140_Sub4_Sub1_2327.getSize() * 64;
          Structure.method606(var1, var5, var3, var0, var2, 110);
        }

      }
    } catch (RuntimeException var9) {
      throw AbstractGameWorld.cascadeException(var9,
        "ih.K(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
    }
  }

  public static void method1217(int var0) {
    try {
      aClass93_939 = null;
      if (var0 != 0) {
        method1213(56, null);
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ih.J(" + var0 + ')');
    }
  }

  static final GameString method1218(boolean var0, int var1, int var2) {
    try {
      return var1 <= 122 ? null : AbstractObjectNodeWrapper.method1723((byte) -128, var0, 10, var2);
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "ih.A(" + var0 + ',' + var1 + ',' + var2 + ')');
    }
  }

}
