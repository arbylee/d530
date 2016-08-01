import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;

final class HashTableIterator {

  static ObjectCache aClass93_1131 = new ObjectCache(5);
  static GameString aClass94_1133 = SpawnedGameObject.createString(")4j");
  static ObjectCache aClass93_1135 = new ObjectCache(4);
  static AbstractDirectColorSprite[] aClass3_Sub28_Sub16Array1136;
  static int anInt1137 = 2;
  static int[] anIntArray1138;
  private Node iterator;
  private int anInt1132 = 0;
  private HashTable table;


  HashTableIterator(HashTable var1) {
    try {
      this.table = var1;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "l.<init>(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  final Node getNext() {
    try {
      Node var2;
      if (-1 > ~this.anInt1132 && this.table.nodes[this.anInt1132 + -1] != this.iterator) {
        var2 = this.iterator;
        this.iterator = var2.nextNode;
        return var2;
      } else {
        do {
          if (~this.table.capacity >= ~this.anInt1132) {
            return null;
          }

          var2 = this.table.nodes[this.anInt1132++].nextNode;
        } while (var2 == this.table.nodes[-1 + this.anInt1132]);

        this.iterator = var2.nextNode;
        return var2;
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "l.D()");
    }
  }

  final Node getFirst() {
    try {
      this.anInt1132 = 0;
      return this.getNext();
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "l.C()");
    }
  }

  public static void method1394(byte var0) {
    try {
      anIntArray1138 = null;
      int var1 = 118 / ((-33 - var0) / 45);
      aClass93_1131 = null;
      aClass94_1133 = null;
      aClass93_1135 = null;
      aClass3_Sub28_Sub16Array1136 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "l.E(" + var0 + ')');
    }
  }

  static final long method1395(int var0, int var1, int var2) {
    SceneGraphTile var3 = SomethingTexture1.sceneGraphTiles[var0][var1][var2];
    return var3 != null && var3.aClass19_2233 != null ? var3.aClass19_2233.aLong428 : 0L;
  }

  static final void method1396(int var0) {
    try {
      int var2 = DisplayMode.viewY;
      int var1 = DummyClass51.viewX;
      int var4 = -GroundItem.viewHeight + (SceneSomething2.windowHeight - var2);
      int var3 = -var1 + AreaSoundEffect.windowWidth - DummyClass30.viewWidth;
      if (~var1 < var0 || ~var3 < -1 || var2 > 0 || ~var4 < -1) {
        try {
          Object var5;
          if (null != TextureSampler30.fullScreenFrame) {
            var5 = TextureSampler30.fullScreenFrame;
          } else if (TextureSampler27.frame == null) {
            var5 = DummyClass35.signLink.applet;
          } else {
            var5 = TextureSampler27.frame;
          }

          int var7 = 0;
          int var6 = 0;
          if (TextureSampler27.frame == var5) {
            Insets var8 = TextureSampler27.frame.getInsets();
            var6 = var8.left;
            var7 = var8.top;
          }

          Graphics var11 = ((Container) var5).getGraphics();
          var11.setColor(Color.black);
          if (~var1 < -1) {
            var11.fillRect(var6, var7, var1, SceneSomething2.windowHeight);
          }

          if (0 < var2) {
            var11.fillRect(var6, var7, AreaSoundEffect.windowWidth, var2);
          }

          if (var3 > 0) {
            var11.fillRect(-var3 + var6 + AreaSoundEffect.windowWidth, var7, var3,
              SceneSomething2.windowHeight);
          }

          if (~var4 < -1) {
            var11.fillRect(var6, -var4 + var7 + SceneSomething2.windowHeight,
              AreaSoundEffect.windowWidth, var4);
          }
        } catch (Exception var9) {
        }
      }

    } catch (RuntimeException var10) {
      throw AbstractGameWorld.cascadeException(var10, "l.A(" + var0 + ')');
    }
  }

}
