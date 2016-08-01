import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

final class Mouse implements MouseListener, MouseMotionListener, FocusListener {

  static float[] aFloatArray1919 = new float[4];
  static int[] anIntArray1920;
  static int anInt1921 = 0;
  static GameString aClass94_1922 = SpawnedGameObject.createString("weiss:");
  static int anInt1923;
  static int anInt1924 = 0;
  static int anInt1925 = 0;
  static int anInt1926;
  static int anInt1927 = 0;

  public final synchronized void mouseDragged(MouseEvent var1) {
    try {
      if (null != ObjectNode.mouse) {
        ObjectNode.anInt4045 = 0;
        SomethingWorldMappy.anInt2493 = var1.getX();
        DummyClass53.anInt1340 = var1.getY();
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "ug.mouseDragged(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  public final synchronized void mouseMoved(MouseEvent var1) {
    try {
      if (ObjectNode.mouse != null) {
        ObjectNode.anInt4045 = 0;
        SomethingWorldMappy.anInt2493 = var1.getX();
        DummyClass53.anInt1340 = var1.getY();
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "ug.mouseMoved(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  public final void mouseClicked(MouseEvent var1) {
    try {
      if (var1.isPopupTrigger()) {
        var1.consume();
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "ug.mouseClicked(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  public final synchronized void mousePressed(MouseEvent var1) {
    try {
      if (ObjectNode.mouse != null) {
        ObjectNode.anInt4045 = 0;
        RenderAnimation.anInt362 = var1.getX();
        TextureSampler14.anInt3389 = var1.getY();
        Projectile.aLong2926 = Time.getCurrentTimeMillis();
        if (!var1.isMetaDown()) {
          GameObject.anInt2743 = 1;
          SpotAnimationConfig.anInt549 = 1;
        } else {
          GameObject.anInt2743 = 2;
          SpotAnimationConfig.anInt549 = 2;
        }

        int var2 = var1.getModifiers();
        if ((var2 & 16) == 0) {
        }

        if (~(4 & var2) != -1) {
        }

        if (-1 != ~(var2 & 8)) {
        }
      }

      if (var1.isPopupTrigger()) {
        var1.consume();
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "ug.mousePressed(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  public final synchronized void mouseReleased(MouseEvent var1) {
    try {
      if (null != ObjectNode.mouse) {
        ObjectNode.anInt4045 = 0;
        SpotAnimationConfig.anInt549 = 0;
        int var2 = var1.getModifiers();
        if (0 == (16 & var2)) {
        }

        if (-1 == ~(var2 & 4)) {
        }

        if (-1 == ~(var2 & 8)) {
        }
      }

      if (var1.isPopupTrigger()) {
        var1.consume();
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "ug.mouseReleased(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  public final synchronized void mouseEntered(MouseEvent var1) {
    try {
      if (ObjectNode.mouse != null) {
        ObjectNode.anInt4045 = 0;
        SomethingWorldMappy.anInt2493 = var1.getX();
        DummyClass53.anInt1340 = var1.getY();
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "ug.mouseEntered(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  public final synchronized void mouseExited(MouseEvent var1) {
    try {
      if (ObjectNode.mouse != null) {
        ObjectNode.anInt4045 = 0;
        SomethingWorldMappy.anInt2493 = -1;
        DummyClass53.anInt1340 = -1;
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "ug.mouseExited(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  public final void focusGained(FocusEvent var1) {
  }

  public final synchronized void focusLost(FocusEvent var1) {
    try {
      if (ObjectNode.mouse != null) {
        SpotAnimationConfig.anInt549 = 0;
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "ug.focusLost(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  static final void method2087(byte var0) {
    try {
      SpawnedGameObject var1 = (SpawnedGameObject) TextureSampler26.aClass61_3075.getFirst();

      for (int var2 = -37 / ((-21 - var0) / 48);
           null != var1; var1 = (SpawnedGameObject) TextureSampler26.aClass61_3075.getNext()) {
        if (var1.aliveTime > 0) {
          --var1.aliveTime;
        }

        if (0 != var1.aliveTime) {
          if (~var1.anInt2261 < -1) {
            --var1.anInt2261;
          }

          if (~var1.anInt2261 == -1 && 1 <= var1.anInt2264 && 1 <= var1.anInt2248
            && 102 >= var1.anInt2264 && ~var1.anInt2248 >= -103 && (~var1.anInt2265 > -1
            || AbstractFileRequest.method590((byte) -34, var1.anInt2265, var1.anInt2262))) {
            FileCache.method1048(var1.anInt2265, var1.anInt2264, var1.anInt2250, var1.anInt2256,
              var1.anInt2248, -65, var1.anInt2262, var1.anInt2263);
            var1.anInt2261 = -1;
            if (~var1.anInt2254 == ~var1.anInt2265 && var1.anInt2254 == -1) {
              var1.unlinkNode();
            } else if (~var1.anInt2265 == ~var1.anInt2254 && var1.anInt2256 == var1.anInt2257
              && ~var1.anInt2253 == ~var1.anInt2262) {
              var1.unlinkNode();
            }
          }
        } else if (-1 < ~var1.anInt2254 || AbstractFileRequest.method590((byte) -66, var1.anInt2254,
          var1.anInt2253)) {
          FileCache.method1048(var1.anInt2254, var1.anInt2264, var1.anInt2250, var1.anInt2257,
            var1.anInt2248, -71, var1.anInt2253, var1.anInt2263);
          var1.unlinkNode();
        }
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "ug.A(" + var0 + ')');
    }
  }

  public static void method2088(boolean var0) {
    try {
      aClass94_1922 = null;
      anIntArray1920 = null;
      if (!var0) {
        anIntArray1920 = null;
      }

      aFloatArray1919 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ug.C(" + var0 + ')');
    }
  }

  static final void method2089(byte var0) {
    try {
      DirectImageProducer.aClass93_2982.method1523((byte) -105);
      if (var0 >= 84) {
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ug.D(" + var0 + ')');
    }
  }

  static final void method2090(int var0) {
    try {
      if (ObjectNode.mouse != null) {
        Mouse var1 = ObjectNode.mouse;
        synchronized (var1) {
          ObjectNode.mouse = null;
        }
      }

      if (var0 == 8) {
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "ug.F(" + var0 + ')');
    }
  }

  static final void method2091(int var0, int var1) {
    try {
      if (SceneNode.anIntArray1838 == null || SceneNode.anIntArray1838.length < var0) {
        SceneNode.anIntArray1838 = new int[var0];
      }

      if (var1 != 4) {
        anInt1926 = -75;
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "ug.E(" + var0 + ',' + var1 + ')');
    }
  }

  static final void method2092(int var0, byte var1) {
    try {
      if (var1 != -47) {
        aClass94_1922 = null;
      }

      WidgetUpdate var2 = AudioStreamEncoder3.method466(4, 9, var0);
      var2.createIndexedColorSprite(true);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "ug.B(" + var0 + ',' + var1 + ')');
    }
  }

}
