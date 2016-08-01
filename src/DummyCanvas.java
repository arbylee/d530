import java.awt.Canvas;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

final class DummyCanvas extends Canvas implements FocusListener {

  static int anInt14 = 0;
  static int anInt15 = 0;
  static int anInt16;
  static int anInt17;
  static int anInt18;
  static int anInt19;
  static int[][] anIntArrayArray20 = new int[5][5000];
  static ObjectCache aClass93_21 = new ObjectCache(64);
  static GameString aClass94_22 = SpawnedGameObject.createString("leuchten3:");
  static int anInt23 = 0;
  static GameString aClass94_24 =
    SpawnedGameObject.createString("Chargement de RuneScape en cours )2 veuillez patienter)3)3)3");
  static int anInt25 = 1;
  static GameString aClass94_26 = SpawnedGameObject.createString("n");

  @Override
  public void focusGained(FocusEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void focusLost(FocusEvent e) {
    // TODO Auto-generated method stub

  }

  public static void method53(int var0) {
    try {
      aClass93_21 = null;
      aClass94_24 = null;
      aClass94_22 = null;
      anIntArrayArray20 = null;
      aClass94_26 = null;
      if (var0 != 0) {
        aClass93_21 = null;
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "oe.C(" + var0 + ')');
    }
  }

  static final int method54(int var0, boolean var1) {
    try {
      return var1 ? -81 : var0 & 127;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "oe.A(" + var0 + ',' + var1 + ')');
    }
  }

  static final void method55(int var0) {
    try {
      if (var0 != 22683) {
        method53(43);
      }

      aClass93_21.method1523((byte) -100);
      DummyClass54.aClass93_1401.method1523((byte) -105);
      ObjectNode.aClass93_4051.method1523((byte) -101);
      DummyClass14.aClass93_1965.method1523((byte) -119);
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "oe.B(" + var0 + ')');
    }
  }

}
