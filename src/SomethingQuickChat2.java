import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

final class SomethingQuickChat2 extends SubNode {

  static boolean aBoolean3531 = false;
  static TriChromaticImageBuffer aClass3_Sub20_3532 = new TriChromaticImageBuffer(0, 0);
  static int anInt3536;
  static int anInt3537;
  static int anInt3539;
  int[] anIntArray3533;
  int[] anIntArray3534;
  int[] anIntArray3535;
  GameString aClass94_3538;
  int[] anIntArray3540;

  final void method525(int var1) {
    try {
      int var2;
      if (null != this.anIntArray3540) {
        for (var2 = 0; ~this.anIntArray3540.length < ~var2; ++var2) {
          this.anIntArray3540[var2] =
            TextureSampler3.method308(this.anIntArray3540[var2], '\u8000');
        }
      }

      if (null != this.anIntArray3534) {
        for (var2 = 0; this.anIntArray3534.length > var2; ++var2) {
          this.anIntArray3534[var2] =
            TextureSampler3.method308(this.anIntArray3534[var2], '\u8000');
        }
      }

      var2 = 46 / ((var1 - -27) / 38);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "bc.O(" + var1 + ')');
    }
  }

  final int method526(int var1, int var2) {
    try {
      if (this.anIntArray3540 != null) {
        for (int var3 = var2; ~var3 > ~this.anIntArray3540.length; ++var3) {
          if (var1 == this.anIntArray3533[var3]) {
            return this.anIntArray3540[var3];
          }
        }

        return -1;
      } else {
        return -1;
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "bc.Q(" + var1 + ',' + var2 + ')');
    }
  }

  private final void method527(Buffer var1, int var2, int var3) {
    try {
      if (var2 != 0) {
        this.method526(-91, -3);
      }

      if (var3 == 1) {
        this.aClass94_3538 = var1.readString();
      } else {
        int var4;
        int var5;
        if (var3 != 2) {
          if (var3 == 3) {
            var4 = var1.readUnsignedByte();
            this.anIntArray3540 = new int[var4];
            this.anIntArray3533 = new int[var4];

            for (var5 = 0; var5 < var4; ++var5) {
              this.anIntArray3540[var5] = var1.readUnsignedShort();
              this.anIntArray3533[var5] = TextureSampler29.method322(true, var1.readByte());
            }
          } else if (-5 == ~var3) {
          }
        } else {
          var4 = var1.readUnsignedByte();
          this.anIntArray3534 = new int[var4];
          this.anIntArray3535 = new int[var4];

          for (var5 = 0; var5 < var4; ++var5) {
            this.anIntArray3534[var5] = var1.readUnsignedShort();
            this.anIntArray3535[var5] = TextureSampler29.method322(true, var1.readByte());
          }
        }
      }

    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "bc.E(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
    }
  }

  final int method529(byte var1, int var2) {
    try {
      int var3 = 45 / ((var1 - -30) / 49);
      if (null == this.anIntArray3534) {
        return -1;
      } else {
        for (int var4 = 0; this.anIntArray3534.length > var4; ++var4) {
          if (~this.anIntArray3535[var4] == ~var2) {
            return this.anIntArray3534[var4];
          }
        }

        return -1;
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5, "bc.P(" + var1 + ',' + var2 + ')');
    }
  }

  final void method530(Buffer var1, byte var2) {
    try {
      if (var2 <= 104) {
        this.anIntArray3534 = null;
      }

      while (true) {
        int var3 = var1.readUnsignedByte();
        if (~var3 == -1) {
          return;
        }

        this.method527(var1, 0, var3);
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "bc.D(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
    }
  }

  public static void method528(int var0) {
    try {
      aClass3_Sub20_3532 = null;
      if (var0 != -1667) {
        anInt3539 = 101;
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "bc.B(" + var0 + ')');
    }
  }

  static final GameString method531(byte var0) {
    try {
      GameString var1;
      if (-2 == ~Something3d.anInt3012 && -3 < ~TextureSampler25.amountContextActions) {
        var1 = RenderAnimation.concat(new GameString[] {
          TextureSampler14.aClass94_3388, DummyInputStream.aClass94_43,
          RenderAnimation.aClass94_378, WorldMapLabel.aClass94_1724
        });
      } else if (SceneNode.aBoolean1837 && 2 > TextureSampler25.amountContextActions) {
        var1 = RenderAnimation.concat(new GameString[] {
          Parameter.aClass94_3621, DummyInputStream.aClass94_43, DummyClass59.aClass94_676,
          WorldMapLabel.aClass94_1724
        });
      } else if (DummyClass55.aBoolean1419 && GameObjectConfig.aBooleanArray1490[81]
        && TextureSampler25.amountContextActions > 2) {
        var1 = Buffer.method802(TextureSampler25.amountContextActions + -2, true);
      } else {
        var1 = Buffer.method802(TextureSampler25.amountContextActions - 1, true);
      }

      if (TextureSampler25.amountContextActions > 2) {
        var1 = RenderAnimation.concat(new GameString[] {
          var1, DummyClass3.aClass94_58,
          SomethingScene.toString(TextureSampler25.amountContextActions - 2),
          TextureSampler36.aClass94_3426
        });
      }

      int var2 = -97 % ((var0 - 55) / 32);
      return var1;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "bc.F(" + var0 + ')');
    }
  }

  static final void method532(int var0, int var1) {
    try {
      if (var1 == -28236) {
        Inventory var2 = (Inventory) SceneGraphTile.aClass130_2220.get((long) var0);
        if (null != var2) {
          var2.unlinkNode();
        }
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "bc.A(" + var0 + ',' + var1 + ')');
    }
  }

  static final void drawLoadingBar(Color var0, boolean var1, boolean var2, GameString var3,
                                   int var4) {
    try {
      try {
        Graphics var5 = InventoryConfig.canvas.getGraphics();
        if (TextureSampler14.aFont3384 == null) {
          TextureSampler14.aFont3384 = new Font("Helvetica", 1, 13);
          DummyClass17.aFontMetrics1822 =
            InventoryConfig.canvas.getFontMetrics(TextureSampler14.aFont3384);
        }

        if (var2) {
          var5.setColor(Color.black);
          var5.fillRect(0, 0, DummyClass30.viewWidth, GroundItem.viewHeight);
        }

        if (null == var0) {
          var0 = new Color(140, 17, 17);
        }

        if (var1) {
          return;
        }

        try {
          if (null == MilliFrameRegulator.anImage2695) {
            MilliFrameRegulator.anImage2695 = InventoryConfig.canvas.createImage(304, 34);
          }

          Graphics var6 = MilliFrameRegulator.anImage2695.getGraphics();
          var6.setColor(var0);
          var6.drawRect(0, 0, 303, 33);
          var6.fillRect(2, 2, var4 * 3, 30);
          var6.setColor(Color.black);
          var6.drawRect(1, 1, 301, 31);
          var6.fillRect(3 * var4 + 2, 2, -(3 * var4) + 300, 30);
          var6.setFont(TextureSampler14.aFont3384);
          var6.setColor(Color.white);
          var3.method1532(22, (-var3.method1575(-21018, DummyClass17.aFontMetrics1822) + 304) / 2,
            var6, (byte) -90);
          var5.drawImage(MilliFrameRegulator.anImage2695, DummyClass30.viewWidth / 2 - 152,
            -18 + GroundItem.viewHeight / 2, null);
        } catch (Exception var9) {
          int var7 = -152 + DummyClass30.viewWidth / 2;
          int var8 = -18 + GroundItem.viewHeight / 2;
          var5.setColor(var0);
          var5.drawRect(var7, var8, 303, 33);
          var5.fillRect(var7 + 2, 2 + var8, 3 * var4, 30);
          var5.setColor(Color.black);
          var5.drawRect(1 + var7, var8 - -1, 301, 31);
          var5.fillRect(3 * var4 + (var7 - -2), 2 + var8, 300 - var4 * 3, 30);
          var5.setFont(TextureSampler14.aFont3384);
          var5.setColor(Color.white);
          var3.method1532(22 + var8,
            var7 + (-var3.method1575(-21018, DummyClass17.aFontMetrics1822) + 304) / 2, var5,
            (byte) -125);
        }

        if (DummyClass10.aClass94_2083 != null) {
          var5.setFont(TextureSampler14.aFont3384);
          var5.setColor(Color.white);
          DummyClass10.aClass94_2083.method1532(GroundItem.viewHeight / 2 - 26,
            DummyClass30.viewWidth / 2
              - DummyClass10.aClass94_2083.method1575(-21018, DummyClass17.aFontMetrics1822) / 2,
            var5, (byte) -116);
        }
      } catch (Exception var10) {
        InventoryConfig.canvas.repaint();
      }

    } catch (RuntimeException var11) {
      throw AbstractGameWorld.cascadeException(var11,
        "bc.C(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ',' + (
          var3 != null ? "{...}" : "null") + ',' + var4 + ')');
    }
  }

}
