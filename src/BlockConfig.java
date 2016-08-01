final class BlockConfig {

  static CollisionMap[] collisionMaps = new CollisionMap[4];
  static FileCache tableCache;
  static int sunPositionZ;
  static AudioStreamEncoder4 aClass3_Sub24_Sub4_1193;
  static HashTable aClass130_1194;
  private static GameString aClass94_1176 = SpawnedGameObject.createString("Loading wordpack )2 ");
  private static GameString aClass94_1192 = SpawnedGameObject.createString("Examine");
  static GameString aClass94_1179 = SpawnedGameObject.createString("Veuillez patienter)3)3)3");
  static GameString COMMAND_REBUILD = SpawnedGameObject.createString("::rebuild");
  static int screenLowerY;
  static GameString aClass94_1183 = aClass94_1176;
  static GameString aClass94_1180 = aClass94_1192;
  int anInt1175;
  int anInt1177;
  int sunPosZ;
  int sunPositionY;
  int anInt1184;
  int sunPositionX;
  float aFloat1187;
  float aFloat1189;
  float aFloat1190;

  public BlockConfig() {
    try {
      this.anInt1177 = GlEnvironment.defaultSunColor;
      this.aFloat1189 = 1.2F;
      this.sunPosZ = -50;
      this.aFloat1187 = 1.1523438F;
      this.anInt1175 = GlEnvironment.defaultFogColor;
      this.sunPositionY = -60;
      this.aFloat1190 = 0.69921875F;
      this.anInt1184 = 0;
      this.sunPositionX = -50;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "li.<init>()");
    }
  }

  BlockConfig(Buffer var1) {
    try {
      int var2 = var1.readUnsignedByte();
      if (~(var2 & 1) == -1) {
        this.anInt1177 = GlEnvironment.defaultSunColor;
      } else {
        this.anInt1177 = var1.readInt();
      }

      if (~(2 & var2) == -1) {
        this.aFloat1187 = 1.1523438F;
      } else {
        this.aFloat1187 = (float) var1.readUnsignedShort() / 256.0F;
      }

      if ((var2 & 4) == 0) {
        this.aFloat1190 = 0.69921875F;
      } else {
        this.aFloat1190 = (float) var1.readUnsignedShort() / 256.0F;
      }

      if (~(var2 & 8) != -1) {
        this.aFloat1189 = (float) var1.readUnsignedShort() / 256.0F;
      } else {
        this.aFloat1189 = 1.2F;
      }

      if (-1 == ~(16 & var2)) {
        this.sunPosZ = -50;
        this.sunPositionX = -50;
        this.sunPositionY = -60;
      } else {
        this.sunPositionX = var1.method787((byte) 53);
        this.sunPositionY = var1.method787((byte) 15);
        this.sunPosZ = var1.method787((byte) 50);
      }

      if ((32 & var2) == 0) {
        this.anInt1175 = GlEnvironment.defaultFogColor;
      } else {
        this.anInt1175 = var1.readInt();
      }

      if (-1 == ~(64 & var2)) {
        this.anInt1184 = 0;
      } else {
        this.anInt1184 = var1.readUnsignedShort();
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "li.<init>(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  static final void method1427(boolean var0, int var1) {
    try {
      if (-1 == var1 && !MidiSomething.aBoolean1158) {
        SceneNode.method1870(false);
      } else if (var1 != -1 && (AbstractFrameRegulator.anInt1691 != var1 || !BitVariable.method1391(
        -1)) && BZipDecompressorState.anInt120 != 0 && !MidiSomething.aBoolean1158) {
        AbstractFileRequester.method2099(true, var1, 0, SomethingTexture1.fileUnpacker6, false,
          BZipDecompressorState.anInt120, 2);
      }

      if (!var0) {
        aClass94_1192 = null;
      }

      AbstractFrameRegulator.anInt1691 = var1;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "li.B(" + var0 + ',' + var1 + ')');
    }
  }

  static final void method1428(int var0, int var1, int var2) {
    try {
      if (var1 < 21) {
        method1430(34, -13);
      }

      DummyClass5.anIntArray2985[var0] = var2;
      VariableUpdate var3 = (VariableUpdate) ClientScript.variableUpdates.get((long) var0);
      if (var3 == null) {
        var3 = new VariableUpdate(Time.getCurrentTimeMillis() - -500L);
        ClientScript.variableUpdates.put((long) var0, var3);
      } else {
        var3.timestamp = 500L + Time.getCurrentTimeMillis();
      }

    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "li.D(" + var0 + ',' + var1 + ',' + var2 + ')');
    }
  }

  public static void method1429(byte var0) {
    try {
      aClass3_Sub24_Sub4_1193 = null;
      COMMAND_REBUILD = null;
      collisionMaps = null;
      aClass94_1192 = null;
      aClass94_1183 = null;
      aClass94_1179 = null;
      aClass94_1176 = null;
      tableCache = null;
      aClass130_1194 = null;
      aClass94_1180 = null;
      if (var0 != 53) {
        aClass3_Sub24_Sub4_1193 = null;
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "li.C(" + var0 + ')');
    }
  }

  static final SoftwareFont method1430(int var0, int var1) {
    try {
      if (var0 != -28922) {
        return null;
      } else {
        SoftwareFont var2 = (SoftwareFont) HashTableIterator.aClass93_1135.get((long) var1);
        if (var2 != null) {
          return var2;
        } else {
          byte[] var3 = FileUnpacker.fileUnpacker13.getBytes(var1, 0);
          var2 = new SoftwareFont(var3);
          var2.method697(TextureSampler0.aClass109Array3270, null);
          HashTableIterator.aClass93_1135.get((byte) -96, var2, (long) var1);
          return var2;
        }
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "li.A(" + var0 + ',' + var1 + ')');
    }
  }

}
