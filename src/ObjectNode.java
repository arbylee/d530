final class ObjectNode extends AbstractObjectNode {

  static ObjectCache aClass93_4043 = new ObjectCache(64);
  static volatile int anInt4045 = 0;
  static HashTable aClass130_4046 = new HashTable(16);
  static Mouse mouse = new Mouse();
  static FileUnpacker models;
  static GameString aClass94_4049 = SpawnedGameObject.createString("");
  static int[] anIntArray4050 = new int[1000];
  static ObjectCache aClass93_4051 = new ObjectCache(30);
  static GameString aClass94_4052 = SpawnedGameObject.createString("www");
  private Object anObject4044;


  ObjectNode(Object var1) {
    try {
      this.anObject4044 = var1;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "he.<init>(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  final Object getObject(boolean var1) {
    try {
      return !var1 ? null : this.anObject4044;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "he.B(" + var1 + ')');
    }
  }

  final boolean method568(int var1) {
    try {
      return var1 != -22358;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "he.A(" + var1 + ')');
    }
  }

  static final void method569(int var0, int var1) {
    try {
      if (var0 < -78) {
        WidgetUpdate var2 = AudioStreamEncoder3.method466(4, 7, var1);
        var2.createIndexedColorSprite(true);
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "he.C(" + var0 + ',' + var1 + ')');
    }
  }

  public static void method570(int var0) {
    try {
      aClass94_4049 = null;
      anIntArray4050 = null;
      mouse = null;
      aClass130_4046 = null;
      aClass94_4052 = null;
      aClass93_4043 = null;
      models = null;
      if (var0 > -101) {
        method570(-94);
      }

      aClass93_4051 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "he.D(" + var0 + ')');
    }
  }

}
