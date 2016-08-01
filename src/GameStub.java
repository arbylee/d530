import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;

public abstract class GameStub extends Applet implements Runnable, FocusListener, WindowListener {

  public static int anInt12;
  public static boolean aBoolean13;
  static int anInt2;
  static int anInt3 = 0;
  static boolean aBoolean6 = false;
  static GameString aClass94_7 = SpawnedGameObject.createString(" s(West d-Bconnect-B)3");
  static GameString aClass94_8 = SpawnedGameObject.createString("");
  static GameString aClass94_9 = SpawnedGameObject.createString(")3)3)3");
  static GameString COMMAND_RECTANGLE_DEBUG = SpawnedGameObject.createString("::rect_debug");
  static boolean aBoolean11 = false;
  private static GameString aClass94_5 = SpawnedGameObject.createString(" from your ignore list first)3");
  static GameString aClass94_4 = aClass94_5;
  private boolean encounteredError = false;

  public static void method26(int var0) {
    try {
      if (var0 < 15) {
        method27(null, true);
      }

      aClass94_7 = null;
      aClass94_8 = null;
      COMMAND_RECTANGLE_DEBUG = null;
      aClass94_9 = null;
      aClass94_5 = null;
      aClass94_4 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "rc.W(" + var0 + ')');
    }
  }

  static final GameString method27(GameString var0, boolean var1) {
    try {
      if (!var1) {
        method26(-78);
      }

      int var2 = FloorUnderlay.method1602(0, var0);
      return var2 != -1 ?
        DummyClass25.aClass131_1624.aClass94Array1721[var2]
          .method1560(TextureSampler15.aClass94_3192, true, OndemandFileRequest.aClass94_4066) :
        ObjectNode.aClass94_4049;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld
        .cascadeException(var3, "rc.V(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

  static final void method28(boolean var0) {
    try {
      DummyClass15.aClass93_1874.method1524(3);
      if (!var0) {
        aBoolean11 = false;
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "rc.Q(" + var0 + ')');
    }
  }

  static final void method34(int var0) {
    try {
      if (null != GameWorld.audioOutputStream0) {
        GameWorld.audioOutputStream0.method2163(false);
      }

      if (var0 != -32589) {
        method26(-25);
      }

      if (SomethingWorldMappy.audioOutputStream1 != null) {
        SomethingWorldMappy.audioOutputStream1.method2163(false);
      }

      GameObject.method1959(256, 2, 22050, TextureSampler17.aBoolean3184);
      GameWorld.audioOutputStream0 = DummyClass43
        .createAudioOutputStream(22050, DummyClass35.signLink, InventoryConfig.canvas, 0, 14);
      GameWorld.audioOutputStream0.method2154(114, BlockConfig.aClass3_Sub24_Sub4_1193);
      SomethingWorldMappy.audioOutputStream1 = DummyClass43
        .createAudioOutputStream(2048, DummyClass35.signLink, InventoryConfig.canvas, 1, 14);
      SomethingWorldMappy.audioOutputStream1.method2154(-126, MonoChromaticImageBuffer.aClass3_Sub24_Sub2_2563);
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "rc.DA(" + var0 + ')');
    }
  }

  public static final void provideSignLink(SignLink var0) {
    try {
      DummyClass35.signLink = var0;
      TextureSampler30.signLink = var0;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld
        .cascadeException(var2, "rc.provideSignLink(" + (var0 != null ? "{...}" : "null") + ')');
    }
  }

  public final void focusLost(FocusEvent var1) {
    try {
      DummyClass8.focused = false;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld
        .cascadeException(var3, "rc.focusLost(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  abstract void update();

  public final void windowClosing(WindowEvent var1) {
    try {
      this.destroy();
    } catch (RuntimeException var3) {
      throw AbstractGameWorld
        .cascadeException(var3, "rc.windowClosing(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  public final void windowIconified(WindowEvent var1) {
  }

  public final void windowDeactivated(WindowEvent var1) {
  }

  public final AppletContext getAppletContext() {
    try {
      return null != TextureSampler27.frame ?
        null :
        (DummyClass35.signLink != null && this != DummyClass35.signLink.applet ?
          DummyClass35.signLink.applet.getAppletContext() :
          super.getAppletContext());
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "rc.getAppletContext()");
    }
  }

  public final void focusGained(FocusEvent var1) {
    try {
      DummyClass8.focused = true;
      TextureSampler30.aBoolean3116 = true;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld
        .cascadeException(var3, "rc.focusGained(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  public final void windowClosed(WindowEvent var1) {
  }

  final boolean isValidHost() {
    return true;
  }

  public final synchronized void initializeCanvas() {
    try {
      if (InventoryConfig.canvas != null) {
        InventoryConfig.canvas.removeFocusListener(this);
        InventoryConfig.canvas.getParent().remove(InventoryConfig.canvas);
      }

      Object container;
      if (TextureSampler30.fullScreenFrame != null) {
        container = TextureSampler30.fullScreenFrame;
      } else if (null != TextureSampler27.frame) {
        container = TextureSampler27.frame;
      } else {
        container = DummyClass35.signLink.applet;
      }
      ((Container) container).setLayout(null);
      InventoryConfig.canvas = new ComponentCanvas(this);

      ((Container) container).add(InventoryConfig.canvas);
      InventoryConfig.canvas.setSize(DummyClass30.viewWidth, GroundItem.viewHeight);
      InventoryConfig.canvas.setVisible(true);
      if (container != TextureSampler27.frame) {
        InventoryConfig.canvas.setLocation(DummyClass51.viewX, DisplayMode.viewY);
      } else {
        Insets var3 = TextureSampler27.frame.getInsets();
        InventoryConfig.canvas
          .setLocation(DummyClass51.viewX + var3.left, var3.top + DisplayMode.viewY);
      }
      InventoryConfig.canvas.addFocusListener(this);
      InventoryConfig.canvas.requestFocus();
      DummyClass8.focused = true;
      TextureSampler30.aBoolean3116 = true;
      TextureSampler26.focused = true;
      AnimationSomething.replaceCanvas = false;
      AnimationSequence.canvasInitializedTime = Time.getCurrentTimeMillis();
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "rc.BA()");
    }
  }

  public final void destroy() {
    try {
      if (this == StringNode.applet && !PlayerVariable.aBoolean554) {
        AreaSoundEffect.destroyTime = Time.getCurrentTimeMillis();
        TextureSampler25.sleep(5000L);
        TextureSampler30.signLink = null;
        this.shutdown(46, false);
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "rc.destroy()");
    }
  }

  public final void handleUpdate(Graphics var1) {
    try {
      this.paint(var1);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld
        .cascadeException(var3, "rc.update(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  final void reportError(String var1) {
    try {
      if (!this.encounteredError) {
        this.encounteredError = true;
        System.out.println("error_game_" + var1);

        try {

          getAppletContext()
            .showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_top");
        } catch (Exception var4) {
        }

      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld
        .cascadeException(var5, "rc.U(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  abstract void destroy(byte var1);

  abstract void method33(int var1);

  public final URL getDocumentBase() {
    try {
      return null != TextureSampler27.frame ?
        null :
        (DummyClass35.signLink != null && this != DummyClass35.signLink.applet ?
          DummyClass35.signLink.applet.getDocumentBase() :
          super.getDocumentBase());
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "rc.getDocumentBase()");
    }
  }

  public final synchronized void paint(Graphics var1) {
    try {
      if (this == StringNode.applet && !PlayerVariable.aBoolean554) {
        TextureSampler30.aBoolean3116 = true;
        if (DummyClass20.aBoolean1784 && !GlRenderer.useOpenGlRenderer
          && ~(-AnimationSequence.canvasInitializedTime + Time.getCurrentTimeMillis()) < -1001L) {
          Rectangle var2 = var1.getClipBounds();
          if (var2 == null || ~var2.width <= ~AreaSoundEffect.windowWidth
            && ~SceneSomething2.windowHeight >= ~var2.height) {
            AnimationSomething.replaceCanvas = true;
          }
        }

      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld
        .cascadeException(var3, "rc.paint(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  public final void windowDeiconified(WindowEvent var1) {
  }

  private final void shutdown(int var1, boolean clean) {
    try {
      synchronized (this) {
        if (PlayerVariable.aBoolean554) {
          return;
        }

        PlayerVariable.aBoolean554 = true;
      }

      if (DummyClass35.signLink.applet != null) {
        DummyClass35.signLink.applet.destroy();
      }

      try {
        this.destroy((byte) 23);
      } catch (Exception var8) {
      }

      if (InventoryConfig.canvas != null) {
        try {
          InventoryConfig.canvas.removeFocusListener(this);
          InventoryConfig.canvas.getParent().remove(InventoryConfig.canvas);
        } catch (Exception var7) {
        }
      }

      if (null != DummyClass35.signLink) {
        try {
          DummyClass35.signLink.method1445(0);
        } catch (Exception var6) {
        }
      }

      this.method33(126);
      if (var1 <= 31) {
        this.start(-50, -104, -76, 78, null, 49, false);
      }

      if (TextureSampler27.frame != null) {
        try {
          System.exit(0);
        } catch (Throwable var5) {
        }
      }

      System.out.println("Shutdown complete - clean:" + clean);
    } catch (RuntimeException var10) {
      throw AbstractGameWorld.cascadeException(var10, "rc.EA(" + var1 + ',' + clean + ')');
    }
  }

  public final void windowActivated(WindowEvent var1) {
  }

  private final void handleUpdate() {
    try {
      long currentTime = Time.getCurrentTimeMillis();
      long sampledTime = DummyClass21.updateMemory[FileUnpacker.updateMemoryCounter];
      DummyClass21.updateMemory[FileUnpacker.updateMemoryCounter] = currentTime;
      FileUnpacker.updateMemoryCounter = 31 & FileUnpacker.updateMemoryCounter - -1;
      synchronized (this) {
        TextureSampler26.focused = DummyClass8.focused;
      }
      update();
      if (0L != sampledTime && currentTime <= sampledTime) {
      }

    } catch (RuntimeException var9) {
      throw AbstractGameWorld.cascadeException(var9, "rc.R()");
    }
  }

  private final void draw() {
    try {
      long var2 = Time.getCurrentTimeMillis();
      long var4 = DummyClass5.drawMemory[FileTable.drawMemoryCounter];

      DummyClass5.drawMemory[FileTable.drawMemoryCounter] = var2;
      FileTable.drawMemoryCounter = 31 & FileTable.drawMemoryCounter + 1;
      if (~var4 != -1L && var2 > var4) {
        int var6 = (int) (var2 + -var4);
        AnimationSequence.fps = (32000 + (var6 >> 1)) / var6;
      }

      if (50 < TextureSampler28.anInt3313++) {
        TextureSampler30.aBoolean3116 = true;
        TextureSampler28.anInt3313 -= 50;
        InventoryConfig.canvas.setSize(DummyClass30.viewWidth, GroundItem.viewHeight);
        InventoryConfig.canvas.setVisible(true);
        if (TextureSampler27.frame != null && null == TextureSampler30.fullScreenFrame) {
          Insets var8 = TextureSampler27.frame.getInsets();
          InventoryConfig.canvas
            .setLocation(var8.left + DummyClass51.viewX, DisplayMode.viewY + var8.top);
        } else {
          InventoryConfig.canvas.setLocation(DummyClass51.viewX, DisplayMode.viewY);
        }
      }

      this.handleDraw(40);
    } catch (RuntimeException var7) {
      throw AbstractGameWorld.cascadeException(var7, "rc.AA()");
    }
  }

  abstract void handleDraw(int var1);

  public final URL getCodeBase() {
    return TextureSampler27.frame == null ?
      (null != DummyClass35.signLink && this != DummyClass35.signLink.applet ?
        DummyClass35.signLink.applet.getCodeBase() :
        super.getCodeBase()) :
      null;
  }

  public final void run() {
    try {
      try {
        if (null != SignLink.aString1216) {
          String var1 = SignLink.aString1216.toLowerCase();
          if (var1.indexOf("sun") == -1 && -1 == var1.indexOf("apple")) {
            if (0 != ~var1.indexOf("ibm") && (SignLink.aString1196 == null || SignLink.aString1196
              .equals("1.4.2"))) {
              this.reportError("wrongjava");
              return;
            }
          } else {
            String var2 = SignLink.aString1196;
            if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2
              .startsWith("1.2.")) {
              this.reportError("wrongjava");
              return;
            }

            DummyClass22.minimumDelta = 5;
          }
        }

        int var7;
        if (null != SignLink.aString1196 && SignLink.aString1196.startsWith("1.")) {
          var7 = 2;

          int var9;
          for (var9 = 0; ~var7 > ~SignLink.aString1196.length(); ++var7) {
            char var3 = SignLink.aString1196.charAt(var7);
            if (~var3 > -49 || 57 < var3) {
              break;
            }

            var9 = var9 * 10 - (-var3 - -48);
          }

          if (~var9 <= -6) {
            DummyClass20.aBoolean1784 = true;
          }
        }

        if (null != DummyClass35.signLink.applet) {
          Method var8 = SignLink.aMethod1220;
          if (null != var8) {
            try {
              var8.invoke(DummyClass35.signLink.applet, Boolean.TRUE);
            } catch (Throwable var4) {
            }
          }
        }

        GlTexture2d.method713(0);
        this.initializeCanvas();
        Something3d.viewImageProducer = TextureSampler18
          .createImageProducer(GroundItem.viewHeight, DummyClass30.viewWidth, true,
            InventoryConfig.canvas);
        this.initialize(2);
        Inventory.frameRateRegulator = HuffmanEncoder.method1012((byte) -31);

        while (-1L == ~AreaSoundEffect.destroyTime || AreaSoundEffect.destroyTime > Time
          .getCurrentTimeMillis()) {
          SomethingPacket116.cycles = Inventory.frameRateRegulator
            .sleep(-1, DummyClass22.minimumDelta, GameWorld.deltaTime);

          for (var7 = 0; var7 < SomethingPacket116.cycles; ++var7) {
            this.handleUpdate();
          }

          this.draw();
          DummyClass50.method1400(DummyClass35.signLink, InventoryConfig.canvas);
        }
      } catch (Exception var5) {
        GZipDecompressor.reportError(null, var5, (byte) 127);
        this.reportError("crash");
      }

      this.shutdown(107, true);
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6, "rc.run()");
    }
  }

  public final String getParameter(String var1) {
    try {
      return TextureSampler27.frame == null ?
        (DummyClass35.signLink != null && this != DummyClass35.signLink.applet ?
          DummyClass35.signLink.applet.getParameter(var1) :
          super.getParameter(var1)) :
        null;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld
        .cascadeException(var3, "rc.getParameter(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  abstract void initialize(int var1);

  public final void stop() {
    try {
      if (StringNode.applet == this && !PlayerVariable.aBoolean554) {
        AreaSoundEffect.destroyTime = 4000L + Time.getCurrentTimeMillis();
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "rc.stop()");
    }
  }

  public abstract void init();

  final void start(int build, int width, int height, int nodeId, String gameName, int amountVolumes,
                   boolean var3) {
    try {
      try {
        SceneSomething2.windowHeight = height;
        DummyClass51.viewX = 0;
        DisplayMode.viewY = 0;
        TextureSampler18.build = build;
        DummyClass30.viewWidth = width;
        GroundItem.viewHeight = height;
        AreaSoundEffect.windowWidth = width;
        StringNode.applet = this;
        TextureSampler27.frame = new Frame();
        TextureSampler27.frame.setTitle("Jagex");
        TextureSampler27.frame.setResizable(true);
        TextureSampler27.frame.addWindowListener(this);
        TextureSampler27.frame.setVisible(true);
        TextureSampler27.frame.toFront();
        Insets insets = TextureSampler27.frame.getInsets();
        TextureSampler27.frame.setSize(insets.left + AreaSoundEffect.windowWidth + insets.right,
          insets.top + SceneSomething2.windowHeight + insets.bottom);
        TextureSampler30.signLink =
          DummyClass35.signLink = new SignLink(null, nodeId, gameName, amountVolumes);
        SignLinkRequest request = DummyClass35.signLink.createThread(0, 1, this);
        while (request.status == 0) {
          TextureSampler25.sleep(10L);
        }
        DummyClass1.gameThread = (Thread) request.result;
      } catch (Exception var11) {
        GZipDecompressor.reportError(null, var11, (byte) 115);
      }

    } catch (RuntimeException var12) {
      throw AbstractGameWorld.cascadeException(var12,
        "rc.S(" + nodeId + ',' + build + ',' + var3 + ',' + width + ',' + (gameName != null ?
          "{...}" :
          "null") + ',' + height + ',' + amountVolumes + ')');
    }
  }

  public final void windowOpened(WindowEvent var1) {
  }

  public final void start() {
    try {
      if (StringNode.applet == this && !PlayerVariable.aBoolean554) {
        AreaSoundEffect.destroyTime = 0L;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "rc.start()");
    }
  }

  final void method41(byte var1, int var2, int var3, int var4, int var5) {
    try {
      try {
        if (StringNode.applet != null) {
          ++HuffmanEncoder.anInt639;
          if (~HuffmanEncoder.anInt639 <= -4) {
            this.reportError("alreadyloaded");
            return;
          }

          this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
          return;
        }

        StringNode.applet = this;
        DisplayMode.viewY = 0;
        TextureSampler18.build = var4;
        if (var1 >= -23) {
          aClass94_5 = null;
        }

        DummyClass30.viewWidth = var2;
        AreaSoundEffect.windowWidth = var2;
        DummyClass51.viewX = 0;
        GroundItem.viewHeight = var5;
        SceneSomething2.windowHeight = var5;
        String var6 = this.getParameter("openwinjs");
        WidgetUpdate.aBoolean3594 = var6 != null && var6.equals("1");

        if (null == DummyClass35.signLink) {
          TextureSampler30.signLink = DummyClass35.signLink = new SignLink(this, var3, null, 0);
        }

        SignLinkRequest var7 = DummyClass35.signLink.createThread(0, 1, this);

        while (~var7.status == -1) {
          TextureSampler25.sleep(10L);
        }

        DummyClass1.gameThread = (Thread) var7.result;
      } catch (Exception var8) {
        GZipDecompressor.reportError(null, var8, (byte) 113);
        this.reportError("crash");
      }

    } catch (RuntimeException var9) {
      throw AbstractGameWorld.cascadeException(var9,
        "rc.CA(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
    }
  }

}
