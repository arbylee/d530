import java.awt.Container;
import java.awt.Insets;

final class DummyClass25 {

  static WorldMapLabel aClass131_1624;
  static GameString aClass94_1625 = SpawnedGameObject.createString("Memory before cleanup=");
  static SomethingFont aClass33_1626;
  static GameWorldSomething[] aClass26Array1627;
  static FileUnpacker aClass153_1628;
  static int anInt1629;
  static GameString MEMORY_PREFIX = SpawnedGameObject.createString("Mem:");


  public static void method1728(int var0) {
    try {
      aClass33_1626 = null;
      aClass131_1624 = null;
      aClass26Array1627 = null;
      MEMORY_PREFIX = null;
      aClass153_1628 = null;
      aClass94_1625 = null;
      if (var0 != -14256) {
        method1728(46);
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "qh.B(" + var0 + ')');
    }
  }

  static final void resizeCanvas() {
    try {
      Object var1;
      if (null == TextureSampler30.fullScreenFrame) {
        if (TextureSampler27.frame != null) {
          var1 = TextureSampler27.frame;
        } else {
          var1 = DummyClass35.signLink.applet;
        }
      } else {
        var1 = TextureSampler30.fullScreenFrame;
      }

      AreaSoundEffect.windowWidth = ((Container) var1).getSize().width;
      SceneSomething2.windowHeight = ((Container) var1).getSize().height;
      Insets var2;
      if (var1 == TextureSampler27.frame) {
        var2 = TextureSampler27.frame.getInsets();
        SceneSomething2.windowHeight -= var2.bottom + var2.top;
        AreaSoundEffect.windowWidth -= var2.right + var2.left;
      }

      if (~MidiSomething.getWindowMode() <= -3) {
        DummyClass30.viewWidth = AreaSoundEffect.windowWidth;
        DummyClass51.viewX = 0;
        DisplayMode.viewY = 0;
        GroundItem.viewHeight = SceneSomething2.windowHeight;
      } else {
        DisplayMode.viewY = 0;
        DummyClass51.viewX = (-765 + AreaSoundEffect.windowWidth) / 2;
        GroundItem.viewHeight = 503;
        DummyClass30.viewWidth = 765;
      }

      if (GlRenderer.useOpenGlRenderer) {
        GlRenderer.setViewportDimensions(DummyClass30.viewWidth, GroundItem.viewHeight);
      }

      InventoryConfig.canvas.setSize(DummyClass30.viewWidth, GroundItem.viewHeight);
      if (var1 != TextureSampler27.frame) {
        InventoryConfig.canvas.setLocation(DummyClass51.viewX, DisplayMode.viewY);
      } else {
        var2 = TextureSampler27.frame.getInsets();
        InventoryConfig.canvas
          .setLocation(var2.left + DummyClass51.viewX, DisplayMode.viewY + var2.top);
      }

      if (~InventoryConfig.anInt3655 != 0) {
        DummyClass23.method1746(true, (byte) -125);
      }

      HashTableIterator.method1396(-1);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "qh.C()");
    }
  }

  static final void writeSettings(SignLink var0) {
    try {

      FileOnDisk var2 = null;

      try {
        SignLinkRequest var3 = var0.getSettings("runescape", 12);

        while (0 == var3.status) {
          TextureSampler25.sleep(1L);
        }

        if (~var3.status == -2) {
          var2 = (FileOnDisk) var3.result;
          Buffer var4 = DummyClass30.method939((byte) -116);
          var2.method1738(116, var4.bytes, var4.position, 0);
        }
      } catch (Exception var6) {
      }

      try {
        if (var2 != null) {
          var2.close(1);
        }
      } catch (Exception var5) {
      }


    } catch (RuntimeException var7) {
      throw AbstractGameWorld
        .cascadeException(var7, "qh.A(" + (var0 != null ? "{...}" : "null") + ')');
    }
  }

}
