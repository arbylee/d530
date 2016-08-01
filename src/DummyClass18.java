import java.io.IOException;

final class DummyClass18 {

  static int anInt79;
  static int anInt80 = 0;
  static byte[][][] aByteArrayArrayArray81;
  static Deque aClass61_82 = new Deque();
  static short aShort83 = 32767;
  static RenderAnimation DEFAULT_RENDER_ANIMATION = new RenderAnimation();
  static GameString aClass94_85 = SpawnedGameObject.createString("overlay");
  static int anInt86 = 0;
  static int anInt87 = 0;
  static Widget aClass11_88 = null;


  static final int method823(int var0, int var1, int var2, int var3) {
    try {
      if (var2 >= -76) {
        aShort83 = -91;
      }

      return (8 & BZipDecompressorState.tileFlags[var3][var1][var0]) == 0 ?
        (~var3 < -1 && -1 != ~(BZipDecompressorState.tileFlags[1][var1][var0] & 2) ?
          -1 + var3 :
          var3) :
        0;
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "ac.G(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  static final void method824(long[] var0, Object[] var1, int var2) {
    try {
      int var3 = 38 % ((var2 - 28) / 52);
      DummyClass21.method1809(var0.length - 1, var0, 122, 0, var1);
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "ac.E(" + (var0 != null ? "{...}" : "null") + ',' + (var1 != null ? "{...}" : "null") + ','
          + var2 + ')');
    }
  }

  static final void method825(byte var0, int var1) {
    try {
      int var2 = -51 % ((26 - var0) / 33);
      WidgetUpdate var3 = AudioStreamEncoder3.method466(4, 1, var1);
      var3.createIndexedColorSprite(true);
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "ac.D(" + var0 + ',' + var1 + ')');
    }
  }

  static final int method826(GameString var0, int var1) {
    try {
      if (var1 != -1) {
        method826(null, 65);
      }

      if (var0 != null) {
        for (int var2 = 0; FileSystem.anInt104 > var2; ++var2) {
          if (var0.method1531(SceneSomething2.aClass94Array1046[var2])) {
            return var2;
          }
        }

        return -1;
      } else {
        return -1;
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "ac.B(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

  static final boolean parsePacket(byte var0) throws IOException {
    try {
      if (SomethingVolume15.gameSocket == null) {
        return false;
      }
      int available = SomethingVolume15.gameSocket.available();
      if (available == 0) {
        return false;
      }
      if (~GameString.packetId == 0) {
        SomethingVolume15.gameSocket.read(SpotAnimationConfig.gameBuffer.bytes, 0, 1);
        SpotAnimationConfig.gameBuffer.position = 0;
        GameString.packetId = SpotAnimationConfig.gameBuffer.readPacketId();
        HashTable.packetLength = SomethingTexture4.PACKET_LENGTHS[GameString.packetId];
        --available;
      }

      if (HashTable.packetLength == -1) {
        if (available <= 0) {
          return false;
        }
        SomethingVolume15.gameSocket.read(SpotAnimationConfig.gameBuffer.bytes, 0, 1);
        HashTable.packetLength = SpotAnimationConfig.gameBuffer.bytes[0] & 255;
        --available;
      }

      if (-2 == HashTable.packetLength) {
        if (~available >= -2) {
          return false;
        }

        available -= 2;
        SomethingVolume15.gameSocket.read(SpotAnimationConfig.gameBuffer.bytes, 0, 2);
        SpotAnimationConfig.gameBuffer.position = 0;
        HashTable.packetLength = SpotAnimationConfig.gameBuffer.readUnsignedShort();
      }

      if (~HashTable.packetLength < ~available) {
        return false;
      }
      SpotAnimationConfig.gameBuffer.position = 0;
      SomethingVolume15.gameSocket.read(SpotAnimationConfig.gameBuffer.bytes, 0,
        HashTable.packetLength);
      IdentityKit.lastPacketId2 = EnumStringFetcher.lastPacketId1;
      EnumStringFetcher.lastPacketId1 = StringNode.lastPacketId0;
      StringNode.lastPacketId0 = GameString.packetId;
      AbstractDirectColorSprite.anInt3699 = 0;

      int var20;
      // Update variable small
      if (GameString.packetId == 60) {
        int id = SpotAnimationConfig.gameBuffer.readUnsignedShortAdd();
        byte value = SpotAnimationConfig.gameBuffer.readByteNegate();
        TextureSampler39.updateVariable(id, value);
        GameString.packetId = -1;
        return true;
      }

      int var5;
      GameString var24;

      // Execute script
      if (GameString.packetId == 115) {
        int a = SpotAnimationConfig.gameBuffer.readUnsignedShort();
        GameString b = SpotAnimationConfig.gameBuffer.readString();
        Object[] arguments = new Object[b.getLength() - -1];

        for (var5 = b.getLength() + -1; -1 >= ~var5; --var5) {
          if (115 == b.charAt(var5)) {
            arguments[1 + var5] = SpotAnimationConfig.gameBuffer.readString();
          } else {
            arguments[1 + var5] = new Integer(SpotAnimationConfig.gameBuffer.readInt());
          }
        }
        arguments[0] = new Integer(SpotAnimationConfig.gameBuffer.readInt());
        if (AbstractMouseWheel.updateInterfaceCounter(a, (byte) -25)) {
          ClientScriptCall call = new ClientScriptCall();
          call.arguments = arguments;
          Light.executeScript(call);
        }

        GameString.packetId = -1;
        return true;
      }

      long var4;
      boolean var31;
      int var30;
      GameString var41;
      if (-71 == ~GameString.packetId) {
        GameString var70 = SpotAnimationConfig.gameBuffer.readString();
        if (!var70.endsWith(DummyClass26.TRADE_REQUEST)) {
          if (var70.endsWith(BufferedFile.CHALLENGE_REQ)) {
            var24 = var70.substring(var70.indexOf(AbstractAudioOutputStream.aClass94_1970), 0, 0);
            var4 = var24.toBase37();
            var31 = false;

            for (var30 = 0; ~AnimationSomething.anInt3591 < ~var30; ++var30) {
              if (MonoChromaticImageCache.aLongArray1574[var30] == var4) {
                var31 = true;
                break;
              }
            }

            if (!var31 && GameWorld.anInt2622 == 0) {
              var41 = var70.substring(var70.getLength() + -9, var0 ^ -83,
                1 + var70.indexOf(AbstractAudioOutputStream.aClass94_1970));
              GameBuffer.printMessage(var24, 8, var41, var0 ^ 82);
            }
          } else if (var70.endsWith(TextureSampler35.ASSIST_REQ)) {
            var31 = false;
            var24 = var70.substring(var70.indexOf(AbstractAudioOutputStream.aClass94_1970), 0, 0);
            var4 = var24.toBase37();

            for (var30 = 0; ~AnimationSomething.anInt3591 < ~var30; ++var30) {
              if (var4 == MonoChromaticImageCache.aLongArray1574[var30]) {
                var31 = true;
                break;
              }
            }

            if (!var31 && ~GameWorld.anInt2622 == -1) {
              GameBuffer.printMessage(var24, 10, GroundItemNode.EMPTY_STRING, -1);
            }
          } else if (var70.endsWith(TriChromaticImageBuffer.aClass94_2482)) {
            var24 = var70.substring(var70.indexOf(TriChromaticImageBuffer.aClass94_2482), 0, 0);
            GameBuffer.printMessage(GroundItemNode.EMPTY_STRING, 11, var24, -1);
          } else if (var70.endsWith(NPC.aClass94_3998)) {
            var24 = var70.substring(var70.indexOf(NPC.aClass94_3998), 0, 0);
            if (0 == GameWorld.anInt2622) {
              GameBuffer.printMessage(GroundItemNode.EMPTY_STRING, 12, var24, -1);
            }
          } else if (var70.endsWith(DummyClass15.aClass94_1877)) {
            var24 = var70.substring(var70.indexOf(DummyClass15.aClass94_1877), 0, 0);
            if (GameWorld.anInt2622 == 0) {
              GameBuffer.printMessage(GroundItemNode.EMPTY_STRING, 13, var24, -1);
            }
          } else if (!var70.endsWith(DummyClass32.aClass94_514)) {
            if (!var70.endsWith(ISAACCipher.aClass94_965)) {
              if (var70.endsWith(TextureSampler13.aClass94_3368)) {
                var24 =
                  var70.substring(var70.indexOf(AbstractAudioOutputStream.aClass94_1970), 0, 0);
                var4 = var24.toBase37();
                var31 = false;

                for (var30 = 0; ~AnimationSomething.anInt3591 < ~var30; ++var30) {
                  if (~var4 == ~MonoChromaticImageCache.aLongArray1574[var30]) {
                    var31 = true;
                    break;
                  }
                }

                if (!var31 && GameWorld.anInt2622 == 0) {
                  GameBuffer.printMessage(var24, 16, GroundItemNode.EMPTY_STRING, -1);
                }
              } else if (var70.endsWith(GameString.aClass94_2155)) {
                var24 =
                  var70.substring(var70.indexOf(AbstractAudioOutputStream.aClass94_1970), var0 + 83,
                    0);
                var31 = false;
                var4 = var24.toBase37();

                for (var30 = 0; ~AnimationSomething.anInt3591 < ~var30; ++var30) {
                  if (~MonoChromaticImageCache.aLongArray1574[var30] == ~var4) {
                    var31 = true;
                    break;
                  }
                }

                if (!var31 && GameWorld.anInt2622 == 0) {
                  var41 = var70.substring(var70.getLength() - 9, var0 ^ -83,
                    1 + var70.indexOf(AbstractAudioOutputStream.aClass94_1970));
                  GameBuffer.printMessage(var24, 21, var41, -1);
                }
              } else {
                GameBuffer.printMessage(GroundItemNode.EMPTY_STRING, 0, var70, var0 + 82);
              }
            } else {
              var24 = var70.substring(var70.indexOf(AbstractAudioOutputStream.aClass94_1970), 0, 0);
              var31 = false;
              var4 = var24.toBase37();

              for (var30 = 0; ~AnimationSomething.anInt3591 < ~var30; ++var30) {
                if (~MonoChromaticImageCache.aLongArray1574[var30] == ~var4) {
                  var31 = true;
                  break;
                }
              }

              if (!var31 && 0 == GameWorld.anInt2622) {
                GameBuffer.printMessage(var24, 15, GroundItemNode.EMPTY_STRING, -1);
              }
            }
          } else {
            var31 = false;
            var24 = var70.substring(var70.indexOf(AbstractAudioOutputStream.aClass94_1970), 0, 0);
            var4 = var24.toBase37();

            for (var30 = 0; AnimationSomething.anInt3591 > var30; ++var30) {
              if (var4 == MonoChromaticImageCache.aLongArray1574[var30]) {
                var31 = true;
                break;
              }
            }

            if (!var31 && -1 == ~GameWorld.anInt2622) {
              GameBuffer.printMessage(var24, 14, GroundItemNode.EMPTY_STRING, -1);
            }
          }
        } else {
          var24 = var70.substring(var70.indexOf(AbstractAudioOutputStream.aClass94_1970), 0, 0);
          var4 = var24.toBase37();
          var31 = false;

          for (var30 = 0; ~var30 > ~AnimationSomething.anInt3591; ++var30) {
            if (~MonoChromaticImageCache.aLongArray1574[var30] == ~var4) {
              var31 = true;
              break;
            }
          }


          if (!var31 && ~GameWorld.anInt2622 == -1) {
            GameBuffer.printMessage(var24, 4, SomethingMidiFile.aClass94_2285, var0 + 82);
          }
        }

        GameString.packetId = -1;
        return true;
      }
      int var3;
      GameString var58;

      // Set widget text
      if (~GameString.packetId == 123) {
        int a = SpotAnimationConfig.gameBuffer.readUnsignedShortLE();
        int b = SpotAnimationConfig.gameBuffer.readUnsignedShortAdd();
        GameString c = SpotAnimationConfig.gameBuffer.readString();
        if (AbstractMouseWheel.updateInterfaceCounter(b, (byte) -25)) {
          TextureSampler7.method295(c, (byte) 40, a);
        }

        GameString.packetId = -1;
        return true;
      }

      // Bulk entity update
      if (GameString.packetId == 230) {
        DummyClass56.spawnSceneY = SpotAnimationConfig.gameBuffer.method751((byte) -88);
        DummyClass45.spawnSceneX = SpotAnimationConfig.gameBuffer.method754(true);

        while (~HashTable.packetLength < ~SpotAnimationConfig.gameBuffer.position) {
          GameString.packetId = SpotAnimationConfig.gameBuffer.readUnsignedByte();
          DummyClass37.parseEntityUpdate((byte) -82);
        }

        GameString.packetId = -1;
        return true;
      }


      if (153 == GameString.packetId) {
        GameString.packetId = -1;
        DummyClass45.anInt987 = 0;
        return true;
      }
      int var21;
      if (-221 == ~GameString.packetId) {
        var20 = SpotAnimationConfig.gameBuffer.readInt((byte) -59);
        var3 = SpotAnimationConfig.gameBuffer.readUnsignedShortLE();
        var21 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
        if (AbstractMouseWheel.updateInterfaceCounter(var21, (byte) -25)) {
          TextureSampler29.method327(var3, var20, (byte) 68);
        }

        GameString.packetId = -1;
        return true;
      }
      long var2;
      int var10;
      int var11;
      long var29;
      long var36;
      if (81 == GameString.packetId) {
        var2 = SpotAnimationConfig.gameBuffer.readLong();
        SpotAnimationConfig.gameBuffer.readByte();
        var4 = SpotAnimationConfig.gameBuffer.readLong();
        var29 = (long) SpotAnimationConfig.gameBuffer.readUnsignedShort();
        var36 = (long) SpotAnimationConfig.gameBuffer.readUnsignedMedium((byte) 104);
        var10 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        boolean var63 = false;
        var11 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
        long var55 = (var29 << 32) + var36;
        int var54 = 0;

        label1521:
        while (true) {
          if (100 > var54) {
            if (~var55 != ~DummyClass8.aLongArray4017[var54]) {
              ++var54;
              continue;
            }

            var63 = true;
            break;
          }

          if (1 >= var10) {
            for (var54 = 0; ~AnimationSomething.anInt3591 < ~var54; ++var54) {
              if (~MonoChromaticImageCache.aLongArray1574[var54] == ~var2) {
                var63 = true;
                break label1521;
              }
            }
          }
          break;
        }

        if (!var63 && 0 == GameWorld.anInt2622) {
          DummyClass8.aLongArray4017[Mouse.anInt1921] = var55;
          Mouse.anInt1921 = (1 + Mouse.anInt1921) % 100;
          GameString var61 =
            StringNode.method733(12345678, var11).method555(28021, SpotAnimationConfig.gameBuffer);
          if (-3 != ~var10 && 3 != var10) {
            if (~var10 != -2) {
              InventoryConfig.method611(var11, 20, var61,
                FileCache.stringFromBase37(var0 + -29581, var4).formatName((byte) -50), (byte) 50,
                FileCache.stringFromBase37(-29664, var2).formatName((byte) -50));
            } else {
              InventoryConfig.method611(var11, 20, var61,
                FileCache.stringFromBase37(-29664, var4).formatName((byte) -50), (byte) 50,
                RenderAnimation.concat(new GameString[] {
                  DummyClass34.aClass94_592,
                  FileCache.stringFromBase37(var0 + -29581, var2).formatName((byte) -50)
                }));
            }
          } else {
            InventoryConfig.method611(var11, 20, var61,
              FileCache.stringFromBase37(var0 + -29581, var4).formatName((byte) -50), (byte) 50,
              RenderAnimation.concat(new GameString[] {
                DummyClass60.aClass94_444,
                FileCache.stringFromBase37(-29664, var2).formatName((byte) -50)
              }));
          }
        }

        GameString.packetId = -1;
        return true;
      }
      int var6;
      int var8;
      boolean var32;
      if (~GameString.packetId == -56) {
        DummyClass10.anInt2087 = TextureSampler23.anInt3213;
        var2 = SpotAnimationConfig.gameBuffer.readLong();
        if (~var2 == -1L) {
          DummyClass12.aClass94_2035 = null;
          GameString.packetId = -1;
          Widget.aClass94_251 = null;
          ClientScript.aClass3_Sub19Array3694 = null;
          SubNode.anInt2572 = 0;
          return true;
        } else {
          var4 = SpotAnimationConfig.gameBuffer.readLong();
          Widget.aClass94_251 = FileCache.stringFromBase37(-29664, var4);
          DummyClass12.aClass94_2035 = FileCache.stringFromBase37(var0 + -29581, var2);
          Player.aByte3953 = SpotAnimationConfig.gameBuffer.readByte();
          var6 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
          if (255 == var6) {
            GameString.packetId = -1;
            return true;
          } else {
            SubNode.anInt2572 = var6;
            ClanChatUser[] var7 = new ClanChatUser[100];

            for (var8 = 0; ~SubNode.anInt2572 < ~var8; ++var8) {
              var7[var8] = new ClanChatUser();
              var7[var8].key = SpotAnimationConfig.gameBuffer.readLong();
              var7[var8].name = FileCache.stringFromBase37(var0 + -29581, var7[var8].key);
              var7[var8].anInt2478 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
              var7[var8].aByte2472 = SpotAnimationConfig.gameBuffer.readByte();
              var7[var8].aClass94_2473 = SpotAnimationConfig.gameBuffer.readString();
              if (~TextureSampler15.encodedUsername == ~var7[var8].key) {
                CollisionMap.aByte1308 = var7[var8].aByte2472;
              }
            }

            var32 = false;
            var10 = SubNode.anInt2572;

            while (-1 > ~var10) {
              var32 = true;
              --var10;

              for (var11 = 0; ~var10 < ~var11; ++var11) {
                if (-1 > ~var7[var11].name.method1559(var7[var11 - -1].name, var0 ^ 82)) {
                  var32 = false;
                  ClanChatUser var9 = var7[var11];
                  var7[var11] = var7[1 + var11];
                  var7[var11 + 1] = var9;
                }
              }

              if (var32) {
                break;
              }
            }

            ClientScript.aClass3_Sub19Array3694 = var7;
            GameString.packetId = -1;
            return true;
          }
        }
      }
      if (GameString.packetId == 164) {
        var20 = SpotAnimationConfig.gameBuffer.method780(-1);
        SceneShadowMap.aClass64_1778 = DummyClass35.signLink.method1449(var0 ^ -82, var20);
        GameString.packetId = -1;
        return true;
      }

      if (225 == GameString.packetId) {
        DummyClass4.parsePlayerUpdate((byte) -122);
        GameString.packetId = -1;
        return true;
      }

      if (GameString.packetId == 48) {
        int a = SpotAnimationConfig.gameBuffer.readUnsignedShort();
        GameString b = SpotAnimationConfig.gameBuffer.readString();
        int c = SpotAnimationConfig.gameBuffer.readShortLEAdd();
        if (AbstractMouseWheel.updateInterfaceCounter(a, (byte) -25)) {
          TextureSampler7.method295(b, (byte) 40, c);
        }
        GameString.packetId = -1;
        return true;
      }

      if (232 == GameString.packetId) {
        TextureSampler9.anInt3101 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        IdentityKit.anInt467 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        DummyClass38.anInt734 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        GameString.packetId = -1;
        return true;
      }

      // Player option update
      GameString var56;
      if (GameString.packetId == 44) {
        var20 = SpotAnimationConfig.gameBuffer.readShortLEAdd();
        if (var20 == '\uffff') {
          var20 = -1;
        }

        var3 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        var21 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        var56 = SpotAnimationConfig.gameBuffer.readString();
        if (1 <= var21 && ~var21 >= -9) {
          if (var56.method1531(VertexNormal.aClass94_829)) {
            var56 = null;
          }

          CollisionMap.playerOptions[-1 + var21] = var56;
          TextureSampler35.anIntArray3328[var21 + -1] = var20;
          DummyClass3.aBooleanArray54[var21 + -1] = ~var3 == -1;
        }

        GameString.packetId = -1;
        return true;
      }

      // Update Variable large
      if (GameString.packetId == 226) {
        int value = SpotAnimationConfig.gameBuffer.readInt();
        int id = SpotAnimationConfig.gameBuffer.readUnsignedShortAdd();
        TextureSampler39.updateVariable(id, value);
        GameString.packetId = -1;
        return true;
      }

      if (GameString.packetId == 21) {
        var20 = SpotAnimationConfig.gameBuffer.method786(true);
        var3 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
        var21 = SpotAnimationConfig.gameBuffer.method782(var0 ^ 19);
        if (AbstractMouseWheel.updateInterfaceCounter(var3, (byte) -25)) {
          TextureSampler4.method260(-16207, var21, var20);
        }

        GameString.packetId = -1;
        return true;
      }

      if (-146 == ~GameString.packetId) {
        var20 = SpotAnimationConfig.gameBuffer.readShortLEAdd();
        var3 = SpotAnimationConfig.gameBuffer.method751((byte) -101);
        var21 = SpotAnimationConfig.gameBuffer.readShortLEAdd();
        if (AbstractMouseWheel.updateInterfaceCounter(var21, (byte) -25)) {
          if (-3 == ~var3) {
            EnumStringFetcher.method834((byte) -86);
          }

          InventoryConfig.anInt3655 = var20;
          TextureSampler20.method232(var20, 16182);
          DummyClass23.method1746(false, (byte) -64);
          TextureSampler24.method226(InventoryConfig.anInt3655, 69);

          for (var5 = 0; -101 < ~var5; ++var5) {
            GroundItemNode.aBooleanArray3674[var5] = true;
          }
        }

        GameString.packetId = -1;
        return true;
      }

      if (-70 == ~GameString.packetId) {
        var20 = SpotAnimationConfig.gameBuffer.readShortLEAdd();
        var3 = SpotAnimationConfig.gameBuffer.readInt();
        var21 = SpotAnimationConfig.gameBuffer.readUnsignedShortAdd();
        if (AbstractMouseWheel.updateInterfaceCounter(var20, (byte) -25)) {
          TextureSampler19.method255(var21, var3, 1);
        }

        GameString.packetId = -1;
        return true;
      }

      if (141 == GameString.packetId) {
        var2 = SpotAnimationConfig.gameBuffer.readLong();
        var21 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
        var56 = StringNode.method733(var0 + 12345761, var21)
          .method555(28021, SpotAnimationConfig.gameBuffer);
        InventoryConfig.method611(var21, 19, var56, null, (byte) 50,
          FileCache.stringFromBase37(-29664, var2).formatName((byte) -50));
        GameString.packetId = -1;
        return true;
      }

      // Write UID
      if (-170 == ~GameString.packetId) {
        DummyClass11.writeUID(SpotAnimationConfig.gameBuffer, var0 ^ -43);
        GameString.packetId = -1;
        return true;
      }

      if (89 == GameString.packetId) {
        TextureSampler6.resetVariables(-117);
        GameBuffer.method819(false);
        HuffmanEncoder.anInt641 += 32;
        GameString.packetId = -1;
        return true;
      }

      if (-126 == ~GameString.packetId) {
        var20 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
        var3 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        var21 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        var5 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
        var6 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        var30 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        if (AbstractMouseWheel.updateInterfaceCounter(var20, (byte) -25)) {
          Something3d.method2238(var5, var21, var6, var3, (byte) -21, var30);
        }

        GameString.packetId = -1;
        return true;
      }

      if (-37 == ~GameString.packetId) {
        var20 = SpotAnimationConfig.gameBuffer.readInt((byte) 122);
        var3 = SpotAnimationConfig.gameBuffer.method791((byte) 10);
        var21 = SpotAnimationConfig.gameBuffer.readUnsignedShortAdd();
        if (AbstractMouseWheel.updateInterfaceCounter(var21, (byte) -25)) {
          WorldMapLabel.method1790(var20, var3, var0 + 178);
        }

        GameString.packetId = -1;
        return true;
      }

      WidgetAccess var38;
      WidgetAccess var47;
      if (-10 == ~GameString.packetId) {
        var20 = SpotAnimationConfig.gameBuffer.readShortLEAdd();
        var3 = SpotAnimationConfig.gameBuffer.method782(-101);
        var21 = SpotAnimationConfig.gameBuffer.readUnsignedShortAdd();
        var5 = SpotAnimationConfig.gameBuffer.readUnsignedShortLE();
        if (-65536 == ~var5) {
          var5 = -1;
        }

        var6 = SpotAnimationConfig.gameBuffer.readUnsignedShortAdd();
        if (-65536 == ~var6) {
          var6 = -1;
        }

        if (AbstractMouseWheel.updateInterfaceCounter(var21, (byte) -25)) {
          for (var30 = var6; var5 >= var30; ++var30) {
            var36 = (long) var30 + ((long) var3 << 32);
            var47 = (WidgetAccess) DummyClass23.aClass130_1659.get(var36);
            if (null != var47) {
              var38 = new WidgetAccess(var47.anInt2205, var20);
              var47.unlinkNode();
            } else if (0 != ~var30) {
              var38 = new WidgetAccess(0, var20);
            } else {
              var38 = new WidgetAccess(
                EnumStringFetcher.getWidget((byte) 119, var3).aClass3_Sub1_257.anInt2205, var20);
            }

            DummyClass23.aClass130_1659.put(var36, var38);
          }
        }

        GameString.packetId = -1;
        return true;
      }

      int var33;
      if (GameString.packetId == 56) {
        var20 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
        var3 = SpotAnimationConfig.gameBuffer.readUnsignedShortLE();
        var21 = SpotAnimationConfig.gameBuffer.method780(-1);
        var5 = SpotAnimationConfig.gameBuffer.readShortLEAdd();
        if (~(var21 >> 30) == -1) {
          AnimationSequence var53;
          if (var21 >> 29 != 0) {
            var6 = '\uffff' & var21;
            NPC var62 = TextureSampler5.npcs[var6];
            if (null != var62) {
              if (-65536 == ~var5) {
                var5 = -1;
              }

              var32 = !(0 != ~var5 && -1 != var62.anInt2842 &&
                ~GameClient.method45(RenderAnimation.method898((byte) 42, var5).anInt542,
                  (byte) -20).anInt1857 > ~GameClient.method45(
                  RenderAnimation.method898((byte) 42, var62.anInt2842).anInt542,
                  (byte) -20).anInt1857);

              if (var32) {
                var62.anInt2761 = 0;
                var62.anInt2842 = var5;
                var62.anInt2759 = AbstractGameWorld.updateCycle - -var20;
                var62.anInt2805 = 0;
                if (var62.anInt2759 > AbstractGameWorld.updateCycle) {
                  var62.anInt2805 = -1;
                }

                var62.anInt2799 = var3;
                var62.anInt2826 = 1;
                if (~var62.anInt2842 != 0 && AbstractGameWorld.updateCycle == var62.anInt2759) {
                  var33 = RenderAnimation.method898((byte) 42, var62.anInt2842).anInt542;
                  if (~var33 != 0) {
                    var53 = GameClient.method45(var33, (byte) -20);
                    if (var53 != null && null != var53.anIntArray1851) {
                      SocketStream.method1470(var62.anInt2829, var53, 183921384, var62.anInt2819,
                        false, 0);
                    }
                  }
                }
              }
            }
          } else if (-1 != ~(var21 >> 28)) {
            var6 = var21 & '\uffff';
            Player var60;
            if (~WidgetAccess.localPlayerId == ~var6) {
              var60 = TextureCache.localPlayer;
            } else {
              var60 = TextureSampler0.players[var6];
            }

            if (null != var60) {
              if (var5 == '\uffff') {
                var5 = -1;
              }

              var32 = !(var5 != -1 && ~var60.anInt2842 != 0 &&
                ~GameClient.method45(RenderAnimation.method898((byte) 42, var5).anInt542,
                  (byte) -20).anInt1857 > ~GameClient.method45(
                  RenderAnimation.method898((byte) 42, var60.anInt2842).anInt542,
                  (byte) -20).anInt1857);

              if (var32) {
                var60.anInt2759 = var20 + AbstractGameWorld.updateCycle;
                var60.anInt2799 = var3;
                var60.anInt2842 = var5;
                if (~var60.anInt2842 == -65536) {
                  var60.anInt2842 = -1;
                }

                var60.anInt2826 = 1;
                var60.anInt2761 = 0;
                var60.anInt2805 = 0;
                if (var60.anInt2759 > AbstractGameWorld.updateCycle) {
                  var60.anInt2805 = -1;
                }

                if (0 != ~var60.anInt2842 && ~var60.anInt2759 == ~AbstractGameWorld.updateCycle) {
                  var33 = RenderAnimation.method898((byte) 42, var60.anInt2842).anInt542;
                  if (0 != ~var33) {
                    var53 = GameClient.method45(var33, (byte) -20);
                    if (null != var53 && null != var53.anIntArray1851) {
                      SocketStream.method1470(var60.anInt2829, var53, 183921384, var60.anInt2819,
                        var60 == TextureCache.localPlayer, 0);
                    }
                  }
                }
              }
            }
          }
        } else {
          var6 = 3 & var21 >> 28;
          var30 = ((var21 & 268434277) >> 14) + -WorldMapLabel.anInt1716;
          var8 = (var21 & 16383) + -ProceduralTexture.anInt1152;
          if (~var30 <= -1 && var8 >= 0 && 104 > var30 && ~var8 > -105) {
            var8 = var8 * 128 - -64;
            var30 = 128 * var30 + 64;
            StillGraphic var50 = new StillGraphic(var5, var6, var30, var8,
              -var3 + BufferData.method1736(var6, 1, var30, var8), var20,
              AbstractGameWorld.updateCycle);
            TextureSampler17.stillGraphics.addLast(new StillGraphicNode(var50));
          }
        }

        GameString.packetId = -1;
        return true;
      }

      if (-208 == ~GameString.packetId) {
        var20 = SpotAnimationConfig.gameBuffer.readInt((byte) -87);
        var3 = SpotAnimationConfig.gameBuffer.readUnsignedShortAdd();
        var21 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
        var5 = SpotAnimationConfig.gameBuffer.readUnsignedShortAdd();
        if (AbstractMouseWheel.updateInterfaceCounter(var3, (byte) -25)) {
          MonoChromaticImageCache.method1708(var5 + (var21 << 16), var20, var0 ^ 2474);
        }

        GameString.packetId = -1;
        return true;
      }

      if (~GameString.packetId == -39) {
        GameBuffer.method819(false);
        var20 = SpotAnimationConfig.gameBuffer.method751((byte) -111);
        var3 = SpotAnimationConfig.gameBuffer.method780(-1);
        var21 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        SomethingPacket116.anIntArray1743[var21] = var3;
        TextureSampler17.anIntArray3185[var21] = var20;
        TriChromaticImageBuffer.anIntArray2480[var21] = 1;

        for (var5 = 0; 98 > var5; ++var5) {
          if (ItemConfig.anIntArray781[var5] <= var3) {
            TriChromaticImageBuffer.anIntArray2480[var21] = var5 + 2;
          }
        }

        ProjectileNode.anIntArray3780[ClientScript.bitAnd(31, GZipDecompressor.anInt815++)] = var21;
        GameString.packetId = -1;
        return true;
      }
      if (GameString.packetId == 104 || 121 == GameString.packetId || -98 == ~GameString.packetId
        || ~GameString.packetId == -15 || ~GameString.packetId == -203
        || ~GameString.packetId == -136 || ~GameString.packetId == -18 || GameString.packetId == 16
        || GameString.packetId == 240 || GameString.packetId == 33 || -21 == ~GameString.packetId
        || 195 == GameString.packetId || 179 == GameString.packetId) {
        DummyClass37.parseEntityUpdate((byte) -99);
        GameString.packetId = -1;
        return true;
      }
      if (GameString.packetId == 149) {
        var20 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
        var3 = SpotAnimationConfig.gameBuffer.readInt();
        if (AbstractMouseWheel.updateInterfaceCounter(var20, (byte) -25)) {
          SomethingPacket151 var67 =
            (SomethingPacket151) TextureSampler23.aClass130_3208.get((long) var3);
          if (null != var67) {
            TextureSampler19.method254(true, var67, false);
          }

          if (null != TextureSampler27.aClass11_3087) {
            DummyClass29.method909(115, TextureSampler27.aClass11_3087);
            TextureSampler27.aClass11_3087 = null;
          }
        }

        GameString.packetId = -1;
        return true;
      }
      if (GameString.packetId == 187) {
        var20 = SpotAnimationConfig.gameBuffer.readUnsignedShortLE();
        var3 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
        var21 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
        if (AbstractMouseWheel.updateInterfaceCounter(var3, (byte) -25)) {
          SpotAnimationConfig.anInt531 = var20;
          AreaSoundEffect.anInt2309 = var21;
          if (-3 == ~SomethingPacket116.anInt1753) {
            DummyClass17.anInt1823 = AreaSoundEffect.anInt2309;
            TextureSampler28.anInt3315 = SpotAnimationConfig.anInt531;
          }

          Cache.method1098((byte) -117);
        }

        GameString.packetId = -1;
        return true;
      }
      if (GameString.packetId == 132) {
        var20 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
        var3 = SpotAnimationConfig.gameBuffer.readUnsignedShortAdd();
        var21 = SpotAnimationConfig.gameBuffer.readShortLEAdd();
        var5 = SpotAnimationConfig.gameBuffer.readShortLEAdd();
        var6 = SpotAnimationConfig.gameBuffer.readInt();
        if (AbstractMouseWheel.updateInterfaceCounter(var3, (byte) -25)) {
          FileUnpacker.method2143((byte) -124, var21, var6, var5, var20);
        }

        GameString.packetId = -1;
        return true;
      }

      // Remove all game objects and ground items
      if (112 == GameString.packetId) {
        DummyClass45.spawnSceneX = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        DummyClass56.spawnSceneY = SpotAnimationConfig.gameBuffer.method786(true);

        for (var20 = DummyClass45.spawnSceneX; var20 < 8 + DummyClass45.spawnSceneX; ++var20) {
          for (var3 = DummyClass56.spawnSceneY; ~var3 > ~(8 + DummyClass56.spawnSceneY); ++var3) {
            if (null != TextureSampler0.groundItems[GameWorldSomething.currentPlane][var20][var3]) {
              TextureSampler0.groundItems[GameWorldSomething.currentPlane][var20][var3] = null;
              DummyHashTable.method1760(var3, (byte) 65, var20);
            }
          }
        }

        for (SpawnedGameObject var68 =
             (SpawnedGameObject) TextureSampler26.aClass61_3075.getFirst();
             null != var68; var68 = (SpawnedGameObject) TextureSampler26.aClass61_3075.getNext()) {
          if (~var68.anInt2264 <= ~DummyClass45.spawnSceneX
            && 8 + DummyClass45.spawnSceneX > var68.anInt2264
            && var68.anInt2248 >= DummyClass56.spawnSceneY && ~var68.anInt2248 > ~(8
            + DummyClass56.spawnSceneY) && var68.anInt2250 == GameWorldSomething.currentPlane) {
            var68.aliveTime = 0;
          }
        }

        GameString.packetId = -1;
        return true;
      }

      if (GameString.packetId == 144) {
        var20 = SpotAnimationConfig.gameBuffer.readInt((byte) 72);
        Widget var65 = EnumStringFetcher.getWidget((byte) 111, var20);

        for (var21 = 0; var65.anIntArray254.length > var21; ++var21) {
          var65.anIntArray254[var21] = -1;
          var65.anIntArray254[var21] = 0;
        }

        DummyClass29.method909(123, var65);
        GameString.packetId = -1;
        return true;
      }

      if (-131 == ~GameString.packetId) {
        var20 = SpotAnimationConfig.gameBuffer.method782(-104);
        var3 = SpotAnimationConfig.gameBuffer.readShortLEAdd();
        var21 = SpotAnimationConfig.gameBuffer.readUnsignedShortAdd();
        if (var21 == '\uffff') {
          var21 = -1;
        }

        if (AbstractMouseWheel.updateInterfaceCounter(var3, (byte) -25)) {
          TextureSampler19.method256(-1, 1, var20, (byte) -109, var21);
        }

        GameString.packetId = -1;
        return true;
      }

      // Set minimap mode
      if (-193 == ~GameString.packetId) {
        DummyClass12.minimapMode = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        GameString.packetId = -1;
        return true;
      }

      // Set player position
      if (~GameString.packetId == -14) {
        var20 = SpotAnimationConfig.gameBuffer.method754(true);
        var3 = SpotAnimationConfig.gameBuffer.method751((byte) 108);
        var21 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        GameWorldSomething.currentPlane = var3 >> 1;
        TextureCache.localPlayer.setPosition((byte) 126, var20, ~(var3 & 1) == -2, var21);
        GameString.packetId = -1;
        return true;
      }

      int var12;
      GameString var57;
      GameString var64;
      if (-63 == ~GameString.packetId) {
        var2 = SpotAnimationConfig.gameBuffer.readLong();
        var21 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
        var5 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        var31 = true;
        if (var2 < 0L) {
          var2 &= Long.MAX_VALUE;
          var31 = false;
        }

        var41 = GroundItemNode.EMPTY_STRING;
        if (-1 > ~var21) {
          var41 = SpotAnimationConfig.gameBuffer.readString();
        }

        GameString var46 = FileCache.stringFromBase37(-29664, var2).formatName((byte) -50);

        for (var33 = 0; var33 < FileSystem.anInt104; ++var33) {
          if (var2 == VertexNormal.aLongArray826[var33]) {
            if (~var21 != ~Cursor.anIntArray882[var33]) {
              Cursor.anIntArray882[var33] = var21;
              if (0 < var21) {
                GameBuffer.printMessage(GroundItemNode.EMPTY_STRING, 5,
                  RenderAnimation.concat(new GameString[] {
                    var46, FileCacheRequest.aClass94_4058
                  }), -1);
              }

              if (var21 == 0) {
                GameBuffer.printMessage(GroundItemNode.EMPTY_STRING, 5,
                  RenderAnimation.concat(new GameString[] {
                    var46, VertexNormal.aClass94_822
                  }), -1);
              }
            }

            SubNode.aClass94Array2566[var33] = var41;
            LightIntensity.anIntArray904[var33] = var5;
            var46 = null;
            Node.aBooleanArray73[var33] = var31;
            break;
          }
        }

        boolean var45 = false;
        if (null != var46 && 200 > FileSystem.anInt104) {
          VertexNormal.aLongArray826[FileSystem.anInt104] = var2;
          SceneSomething2.aClass94Array1046[FileSystem.anInt104] = var46;
          Cursor.anIntArray882[FileSystem.anInt104] = var21;
          SubNode.aClass94Array2566[FileSystem.anInt104] = var41;
          LightIntensity.anIntArray904[FileSystem.anInt104] = var5;
          Node.aBooleanArray73[FileSystem.anInt104] = var31;
          ++FileSystem.anInt104;
        }

        DummyClass31.anInt1472 = TextureSampler23.anInt3213;
        var10 = FileSystem.anInt104;

        while (~var10 < -1) {
          --var10;
          var45 = true;

          for (var11 = 0; var11 < var10; ++var11) {
            if (~Cursor.anIntArray882[var11] != ~ClientScriptCall.anInt2451
              && ~ClientScriptCall.anInt2451 == ~Cursor.anIntArray882[var11 - -1]
              || Cursor.anIntArray882[var11] == 0 && Cursor.anIntArray882[var11 - -1] != 0) {
              var45 = false;
              var12 = Cursor.anIntArray882[var11];
              Cursor.anIntArray882[var11] = Cursor.anIntArray882[var11 - -1];
              Cursor.anIntArray882[1 + var11] = var12;
              var64 = SubNode.aClass94Array2566[var11];
              SubNode.aClass94Array2566[var11] = SubNode.aClass94Array2566[var11 + 1];
              SubNode.aClass94Array2566[var11 - -1] = var64;
              var57 = SceneSomething2.aClass94Array1046[var11];
              SceneSomething2.aClass94Array1046[var11] =
                SceneSomething2.aClass94Array1046[var11 + 1];
              SceneSomething2.aClass94Array1046[var11 - -1] = var57;
              long var15 = VertexNormal.aLongArray826[var11];
              VertexNormal.aLongArray826[var11] = VertexNormal.aLongArray826[var11 - -1];
              VertexNormal.aLongArray826[var11 - -1] = var15;
              int var17 = LightIntensity.anIntArray904[var11];
              LightIntensity.anIntArray904[var11] = LightIntensity.anIntArray904[var11 - -1];
              LightIntensity.anIntArray904[1 + var11] = var17;
              boolean var18 = Node.aBooleanArray73[var11];
              Node.aBooleanArray73[var11] = Node.aBooleanArray73[var11 - -1];
              Node.aBooleanArray73[var11 - -1] = var18;
            }
          }

          if (var45) {
            break;
          }
        }

        GameString.packetId = -1;
        return true;
      }

      if (-161 == ~GameString.packetId) {
        if (0 != HashTable.packetLength) {
          TextureSampler32.walkTooltip = SpotAnimationConfig.gameBuffer.readString();
        } else {
          TextureSampler32.walkTooltip = DummyClass42.DEFAULT_WALK_TOOLTIP;
        }

        GameString.packetId = -1;
        return true;
      }

      if (128 == GameString.packetId) {
        for (var20 = 0; ~DummyClass5.anIntArray2985.length < ~var20; ++var20) {
          if (~LightIntensity.variables[var20] != ~DummyClass5.anIntArray2985[var20]) {
            DummyClass5.anIntArray2985[var20] = LightIntensity.variables[var20];
            DummyClass39.method1087(98, var20);
            AbstractGameWorld.anIntArray726[ClientScript.bitAnd(HuffmanEncoder.anInt641++, 31)] =
              var20;
          }
        }

        GameString.packetId = -1;
        return true;
      }

      if (~GameString.packetId == -155) {
        var20 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
        var3 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        var21 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        var5 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
        var6 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        var30 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        if (AbstractMouseWheel.updateInterfaceCounter(var20, (byte) -25)) {
          TriChromaticImageBuffer.method390(true, var6, var5, var30, (byte) -124, var21, var3);
        }

        GameString.packetId = -1;
        return true;
      }

      if (247 == GameString.packetId) {
        var2 = SpotAnimationConfig.gameBuffer.readLong();
        var4 = (long) SpotAnimationConfig.gameBuffer.readUnsignedShort();
        var29 = (long) SpotAnimationConfig.gameBuffer.readUnsignedMedium((byte) 77);
        var8 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        var33 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
        boolean var49 = false;
        long var51 = (var4 << -737495840) - -var29;
        int var59 = 0;

        label1603:
        while (true) {
          if (100 > var59) {
            if (~var51 != ~DummyClass8.aLongArray4017[var59]) {
              ++var59;
              continue;
            }

            var49 = true;
            break;
          }

          if (var8 <= 1) {
            for (var59 = 0; ~var59 > ~AnimationSomething.anInt3591; ++var59) {
              if (var2 == MonoChromaticImageCache.aLongArray1574[var59]) {
                var49 = true;
                break label1603;
              }
            }
          }
          break;
        }

        if (!var49 && ~GameWorld.anInt2622 == -1) {
          DummyClass8.aLongArray4017[Mouse.anInt1921] = var51;
          Mouse.anInt1921 = (1 + Mouse.anInt1921) % 100;
          var64 =
            StringNode.method733(12345678, var33).method555(28021, SpotAnimationConfig.gameBuffer);
          if (-3 == ~var8) {
            InventoryConfig.method611(var33, 18, var64, null, (byte) 50,
              RenderAnimation.concat(new GameString[] {
                DummyClass60.aClass94_444,
                FileCache.stringFromBase37(-29664, var2).formatName((byte) -50)
              }));
          } else if (1 == var8) {
            InventoryConfig.method611(var33, 18, var64, null, (byte) 50,
              RenderAnimation.concat(new GameString[] {
                DummyClass34.aClass94_592,
                FileCache.stringFromBase37(-29664, var2).formatName((byte) -50)
              }));
          } else {
            InventoryConfig.method611(var33, 18, var64, null, (byte) 50,
              FileCache.stringFromBase37(var0 + -29581, var2).formatName((byte) -50));
          }
        }

        GameString.packetId = -1;
        return true;
      }

      SomethingPacket151 var26;
      if (~GameString.packetId == -177) {
        var20 = SpotAnimationConfig.gameBuffer.method780(var0 ^ 82);
        var3 = SpotAnimationConfig.gameBuffer.readUnsignedShortAdd();
        var21 = SpotAnimationConfig.gameBuffer.method780(-1);
        if (AbstractMouseWheel.updateInterfaceCounter(var3, (byte) -25)) {
          SomethingPacket151 var23 =
            (SomethingPacket151) TextureSampler23.aClass130_3208.get((long) var20);
          var26 = (SomethingPacket151) TextureSampler23.aClass130_3208.get((long) var21);
          if (null != var26) {
            TextureSampler19.method254(null == var23 || var26.anInt2602 != var23.anInt2602, var26,
              false);
          }

          if (null != var23) {
            var23.unlinkNode();
            TextureSampler23.aClass130_3208.put((long) var21, var23);
          }

          Widget var27 = EnumStringFetcher.getWidget((byte) 113, var20);
          if (var27 != null) {
            DummyClass29.method909(var0 + 57, var27);
          }

          var27 = EnumStringFetcher.getWidget((byte) 114, var21);
          if (null != var27) {
            DummyClass29.method909(119, var27);
            FileRequester.method2104(var27, true, 48);
          }

          if (0 != ~InventoryConfig.anInt3655) {
            ClassCheckRequest.method124(28, 1, InventoryConfig.anInt3655);
          }
        }

        GameString.packetId = -1;
        return true;
      }
      if (GameString.packetId == 27) {
        var20 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
        var3 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        var21 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        var5 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        var6 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        var30 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
        if (AbstractMouseWheel.updateInterfaceCounter(var20, (byte) -25)) {
          MaterialShader5.aBooleanArray2169[var3] = true;
          TextureSampler14.anIntArray3383[var3] = var21;
          SomethingIndex150.anIntArray2073[var3] = var5;
          TextureSampler3.anIntArray3359[var3] = var6;
          DummyClass9.anIntArray4009[var3] = var30;
        }

        GameString.packetId = -1;
        return true;
      }

      if (GameString.packetId == 2) {
        var20 = SpotAnimationConfig.gameBuffer.method780(-1);
        var3 = SpotAnimationConfig.gameBuffer.readUnsignedShortAdd();
        var21 = SpotAnimationConfig.gameBuffer.readShortLEAdd();
        if (AbstractMouseWheel.updateInterfaceCounter(var3, (byte) -25)) {
          BitVariable.method1385(var21, var20, (byte) -127);
        }

        GameString.packetId = -1;
        return true;
      }
      if (-86 == ~GameString.packetId) {
        DummyClass36.updateTime = SpotAnimationConfig.gameBuffer.readUnsignedShort() * 30;
        GameString.packetId = -1;
        Projectile.anInt2905 = TextureSampler23.anInt3213;
        return true;
      }
      if (~GameString.packetId == -115) {
        TextureSampler3.method305(DummyClass35.signLink, SpotAnimationConfig.gameBuffer,
          HashTable.packetLength, (byte) -126);
        GameString.packetId = -1;
        return true;
      }
      if (65 == GameString.packetId) {
        var20 = SpotAnimationConfig.gameBuffer.readUnsignedShortLE();
        var3 = SpotAnimationConfig.gameBuffer.method786(true);
        var21 = SpotAnimationConfig.gameBuffer.readShortLEAdd();
        if (AbstractMouseWheel.updateInterfaceCounter(var20, (byte) -25)) {
          TextureSampler19.method255(var21, var3, var0 ^ -84);
        }

        GameString.packetId = -1;
        return true;
      }
      if (GameString.packetId == 234) {
        GameBuffer.method819(false);
        BZipDecompressorState.anInt136 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        Projectile.anInt2905 = TextureSampler23.anInt3213;
        GameString.packetId = -1;
        return true;
      }

      if (~GameString.packetId == -210) {
        if (-1 != InventoryConfig.anInt3655) {
          ClassCheckRequest.method124(48, 0, InventoryConfig.anInt3655);
        }

        GameString.packetId = -1;
        return true;
      }
      if (~GameString.packetId == -192) {
        var20 = SpotAnimationConfig.gameBuffer.readUnsignedShortLE();
        SomethingQuickChat2.method532(var20, var0 ^ 28185);
        SomethingQuickChat.anIntArray3565[ClientScript.bitAnd(31, FileTable.anInt944++)] =
          ClientScript.bitAnd(var20, 32767);
        GameString.packetId = -1;
        return true;
      }

      if (-103 == ~GameString.packetId) {
        var20 = SpotAnimationConfig.gameBuffer.readUnsignedShortLE();
        var3 = SpotAnimationConfig.gameBuffer.method754(true);
        var21 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
        NPC var39 = TextureSampler5.npcs[var20];
        if (null != var39) {
          HashTable.method1772(var3, var21, 39, var39);
        }

        GameString.packetId = -1;
        return true;
      }

      if (GameString.packetId == 159) {
        GameBuffer.method819(false);
        Mouse.anInt1925 = SpotAnimationConfig.gameBuffer.method787((byte) 59);
        Projectile.anInt2905 = TextureSampler23.anInt3213;
        GameString.packetId = -1;
        return true;
      }

      // Chat
      if (~GameString.packetId == -72) {
        var2 = SpotAnimationConfig.gameBuffer.readLong();
        var58 = AbstractFont.otherFormat(
          DummyClass34.decompressString(SpotAnimationConfig.gameBuffer).format(121));
        GameBuffer.printMessage(FileCache.stringFromBase37(-29664, var2).formatName((byte) -50), 6,
          var58, var0 ^ 82);
        GameString.packetId = -1;
        return true;
      }

      if (-43 == ~GameString.packetId) {
        if (null != TextureSampler30.fullScreenFrame) {
          SceneNode.setWindowMode(false, SubNode.anInt2577, -8914, -1, -1);
        }

        byte[] var22 = new byte[HashTable.packetLength];
        SpotAnimationConfig.gameBuffer.method811((byte) 30, 0, var22, HashTable.packetLength);
        var24 = TextureSampler33.createString(var22, 0, HashTable.packetLength);
        if (null == TextureSampler27.frame && (3 == SignLink.anInt1214
          || !SignLink.formattedOsName.startsWith("win") || DisplayMode.aBoolean1451)) {
          DummyClass54.method1596(var24, (byte) 127, true);
        } else {
          TextureSampler5.aClass94_3295 = var24;
          GameString.aBoolean2154 = true;
          AudioWorker.aClass64_351 =
            DummyClass35.signLink.method1452(new String(var24.method1568(0), "ISO-8859-1"), true);
        }

        GameString.packetId = -1;
        return true;
      }

      if (-112 == ~GameString.packetId) {
        var20 = SpotAnimationConfig.gameBuffer.readUnsignedShortAdd();
        var3 = SpotAnimationConfig.gameBuffer.readInt((byte) -45);
        var21 = SpotAnimationConfig.gameBuffer.readShortLEAdd();
        var5 = SpotAnimationConfig.gameBuffer.readUnsignedShortLE();
        var6 = SpotAnimationConfig.gameBuffer.readShortLEAdd();
        if (AbstractMouseWheel.updateInterfaceCounter(var20, (byte) -25)) {
          TextureSampler19.method256(var21, 7, var3, (byte) -126, var5 << -311274832 | var6);
        }

        GameString.packetId = -1;
        return true;
      }

      if (37 == GameString.packetId) {
        var20 = SpotAnimationConfig.gameBuffer.method751((byte) 122);
        var3 = SpotAnimationConfig.gameBuffer.readUnsignedShortLE();
        DummyClass6.method2209((byte) -122, var20, var3);
        GameString.packetId = -1;
        return true;
      }

      if (~GameString.packetId == -156) {
        var20 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        var3 = SpotAnimationConfig.gameBuffer.readInt((byte) -51);
        var21 = SpotAnimationConfig.gameBuffer.readUnsignedShortAdd();
        var5 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
        if (AbstractMouseWheel.updateInterfaceCounter(var21, (byte) -25)) {
          var26 = (SomethingPacket151) TextureSampler23.aClass130_3208.get((long) var3);
          if (null != var26) {
            TextureSampler19.method254(var26.anInt2602 != var5, var26, false);
          }

          DummyClass60.method914(6422, var5, var3, var20);
        }

        GameString.packetId = -1;
        return true;
      }

      if (~GameString.packetId == -132) {
        for (var20 = 0; var20 < TextureSampler0.players.length; ++var20) {
          if (TextureSampler0.players[var20] != null) {
            TextureSampler0.players[var20].animationId = -1;
          }
        }

        for (var20 = 0; ~TextureSampler5.npcs.length < ~var20; ++var20) {
          if (null != TextureSampler5.npcs[var20]) {
            TextureSampler5.npcs[var20].animationId = -1;
          }
        }

        GameString.packetId = -1;
        return true;
      }

      if (~GameString.packetId == -218) {
        var20 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        HintMarker var48 = new HintMarker();
        var3 = var20 >> 340093798;
        var48.anInt1360 = var20 & 63;
        var48.anInt1351 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        if (~var48.anInt1351 <= -1
          && ~var48.anInt1351 > ~SomethingIndex150.aClass3_Sub28_Sub16Array2072.length) {
          if (~var48.anInt1360 != -2 && 10 != var48.anInt1360) {
            if (-3 >= ~var48.anInt1360 && 6 >= var48.anInt1360) {
              if (var48.anInt1360 == 2) {
                var48.anInt1346 = 64;
                var48.anInt1350 = 64;
              }

              if (-4 == ~var48.anInt1360) {
                var48.anInt1346 = 0;
                var48.anInt1350 = 64;
              }

              if (4 == var48.anInt1360) {
                var48.anInt1346 = 128;
                var48.anInt1350 = 64;
              }

              if (5 == var48.anInt1360) {
                var48.anInt1346 = 64;
                var48.anInt1350 = 0;
              }

              if (-7 == ~var48.anInt1360) {
                var48.anInt1346 = 64;
                var48.anInt1350 = 128;
              }

              var48.anInt1360 = 2;
              var48.anInt1356 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
              var48.anInt1347 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
              var48.anInt1353 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
            }
          } else {
            var48.anInt1359 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
            SpotAnimationConfig.gameBuffer.position += 3;
          }

          var48.anInt1355 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
          if (var48.anInt1355 == '\uffff') {
            var48.anInt1355 = -1;
          }

          GameException.aClass96Array2114[var3] = var48;
        }

        GameString.packetId = -1;
        return true;
      }

      if (GameString.packetId == 126) {
        AnimationSomething.anInt3591 = HashTable.packetLength / 8;

        for (var20 = 0; ~var20 > ~AnimationSomething.anInt3591; ++var20) {
          MonoChromaticImageCache.aLongArray1574[var20] = SpotAnimationConfig.gameBuffer.readLong();
          TextureSampler7.aClass94Array3341[var20] =
            FileCache.stringFromBase37(-29664, MonoChromaticImageCache.aLongArray1574[var20]);
        }

        DummyClass31.anInt1472 = TextureSampler23.anInt3213;
        GameString.packetId = -1;
        return true;
      }
      if (~GameString.packetId == -33) {
        TextureSampler31.parseNpcUpdate();
        GameString.packetId = -1;
        return true;
      }

      if (-120 == ~GameString.packetId) {
        var20 = SpotAnimationConfig.gameBuffer.readUnsignedShortAdd();
        var3 = SpotAnimationConfig.gameBuffer.method782(-48);
        var21 = SpotAnimationConfig.gameBuffer.method787((byte) 74);
        var5 = SpotAnimationConfig.gameBuffer.method747(-58);
        if (AbstractMouseWheel.updateInterfaceCounter(var20, (byte) -25)) {
          FloorOverlay.method2271(var21, var3, 1, var5);
        }

        GameString.packetId = -1;
        return true;
      }
      if (GameString.packetId == 235) {
        var20 = SpotAnimationConfig.gameBuffer.method754(true);
        var3 = var20 >> -518983614;
        var21 = 3 & var20;
        var5 = AbstractSomethingTexture.OBJECT_TYPES[var3];
        var6 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
        var30 = SpotAnimationConfig.gameBuffer.readInt();
        if ('\uffff' == var6) {
          var6 = -1;
        }

        var10 = 16383 & var30;
        var33 = 16383 & var30 >> 2070792462;
        var33 -= WorldMapLabel.anInt1716;
        var10 -= ProceduralTexture.anInt1152;
        var8 = 3 & var30 >> 765199868;
        VertexNormal.method1131(var8, 110, var21, var3, var10, var5, var33, var6);
        GameString.packetId = -1;
        return true;
      }
      if (GameString.packetId == 0) {
        var2 = SpotAnimationConfig.gameBuffer.readLong();
        var4 = (long) SpotAnimationConfig.gameBuffer.readUnsignedShort();
        var29 = (long) SpotAnimationConfig.gameBuffer.readUnsignedMedium((byte) 93);
        var8 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        boolean var42 = false;
        long var35 = var29 + (var4 << -1802335520);
        var12 = 0;

        label1651:
        while (true) {
          if (-101 >= ~var12) {
            if (var8 <= 1) {
              if ((!SomethingVolume15.aBoolean2433 || BufferData.aBoolean1641)
                && !TextureSampler31.aBoolean3166) {
                for (var12 = 0; var12 < AnimationSomething.anInt3591; ++var12) {
                  if (~var2 == ~MonoChromaticImageCache.aLongArray1574[var12]) {
                    var42 = true;
                    break label1651;
                  }
                }
              } else {
                var42 = true;
              }
            }
            break;
          }

          if (~var35 == ~DummyClass8.aLongArray4017[var12]) {
            var42 = true;
            break;
          }

          ++var12;
        }

        if (!var42 && -1 == ~GameWorld.anInt2622) {
          DummyClass8.aLongArray4017[Mouse.anInt1921] = var35;
          Mouse.anInt1921 = (Mouse.anInt1921 - -1) % 100;
          GameString var52 = AbstractFont.otherFormat(
            DummyClass34.decompressString(SpotAnimationConfig.gameBuffer).format(96));
          if (-3 != ~var8 && ~var8 != -4) {
            if (var8 != 1) {
              GameBuffer.printMessage(
                FileCache.stringFromBase37(var0 + -29581, var2).formatName((byte) -50), 3, var52,
                var0 + 82);
            } else {
              GameBuffer.printMessage(RenderAnimation.concat(new GameString[] {
                DummyClass34.aClass94_592,
                FileCache.stringFromBase37(-29664, var2).formatName((byte) -50)
              }), 7, var52, -1);
            }
          } else {
            GameBuffer.printMessage(RenderAnimation.concat(new GameString[] {
              DummyClass60.aClass94_444,
              FileCache.stringFromBase37(-29664, var2).formatName((byte) -50)
            }), 7, var52, -1);
          }
        }

        GameString.packetId = -1;
        return true;
      }

      if (-55 == ~GameString.packetId) {
        var2 = SpotAnimationConfig.gameBuffer.readLong();
        SpotAnimationConfig.gameBuffer.readByte();
        var4 = SpotAnimationConfig.gameBuffer.readLong();
        var29 = (long) SpotAnimationConfig.gameBuffer.readUnsignedShort();
        var36 = (long) SpotAnimationConfig.gameBuffer.readUnsignedMedium((byte) 81);
        long var44 = (var29 << -164903776) + var36;
        var10 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        boolean var13 = false;
        int var14 = 0;

        label1774:
        while (true) {
          if (var14 >= 100) {
            if (1 >= var10) {
              if ((!SomethingVolume15.aBoolean2433 || BufferData.aBoolean1641)
                && !TextureSampler31.aBoolean3166) {
                for (var14 = 0; AnimationSomething.anInt3591 > var14; ++var14) {
                  if (MonoChromaticImageCache.aLongArray1574[var14] == var2) {
                    var13 = true;
                    break label1774;
                  }
                }
              } else {
                var13 = true;
              }
            }
            break;
          }

          if (DummyClass8.aLongArray4017[var14] == var44) {
            var13 = true;
            break;
          }

          ++var14;
        }

        if (!var13 && 0 == GameWorld.anInt2622) {
          DummyClass8.aLongArray4017[Mouse.anInt1921] = var44;
          Mouse.anInt1921 = (Mouse.anInt1921 + 1) % 100;
          var57 = AbstractFont.otherFormat(
            DummyClass34.decompressString(SpotAnimationConfig.gameBuffer).format(116));
          if (-3 != ~var10 && -4 != ~var10) {
            if (~var10 == -2) {
              TextureSampler1.method221(-1, var57, RenderAnimation.concat(new GameString[] {
                DummyClass34.aClass94_592,
                FileCache.stringFromBase37(var0 ^ 29581, var2).formatName((byte) -50)
              }), FileCache.stringFromBase37(-29664, var4).formatName((byte) -50), 9);
            } else {
              TextureSampler1.method221(-1, var57,
                FileCache.stringFromBase37(-29664, var2).formatName((byte) -50),
                FileCache.stringFromBase37(-29664, var4).formatName((byte) -50), 9);
            }
          } else {
            TextureSampler1.method221(-1, var57, RenderAnimation.concat(new GameString[] {
              DummyClass60.aClass94_444,
              FileCache.stringFromBase37(-29664, var2).formatName((byte) -50)
            }), FileCache.stringFromBase37(var0 + -29581, var4).formatName((byte) -50), 9);
          }
        }

        GameString.packetId = -1;
        return true;
      }

      if (-215 == ~GameString.packetId) {
        DummyClass37.parseSceneRebuild(true);
        GameString.packetId = -1;
        return true;
      }

      if (~GameString.packetId == -173) {
        var20 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
        var3 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        if (-65536 == ~var20) {
          var20 = -1;
        }

        var21 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
        TextureSampler26.method199(var3, var20, var21, -799);
        GameString.packetId = -1;
        return true;
      }

      if (-67 == ~GameString.packetId) {
        var20 = SpotAnimationConfig.gameBuffer.readShortLEAdd();
        var3 = SpotAnimationConfig.gameBuffer.method780(-1);
        if (AbstractMouseWheel.updateInterfaceCounter(var20, (byte) -25)) {
          var21 = 0;
          if (TextureCache.localPlayer.appearance != null) {
            var21 = TextureCache.localPlayer.appearance.method1163(-24861);
          }

          TextureSampler19.method256(-1, 3, var3, (byte) -110, var21);
        }

        GameString.packetId = -1;
        return true;
      }

      if (GameString.packetId == 171) {
        var20 = SpotAnimationConfig.gameBuffer.readInt((byte) -55);
        var24 = SpotAnimationConfig.gameBuffer.readString();
        var21 = SpotAnimationConfig.gameBuffer.readUnsignedShortAdd();
        if (AbstractMouseWheel.updateInterfaceCounter(var21, (byte) -25)) {
          AbstractObjectNode.method566(var24, 0, var20);
        }

        GameString.packetId = -1;
        return true;
      }
      if (~GameString.packetId == -85) {
        var20 = SpotAnimationConfig.gameBuffer.method782(-79);
        var3 = SpotAnimationConfig.gameBuffer.readShortLEAdd();
        DummyClass6.method2209((byte) -106, var20, var3);
        GameString.packetId = -1;
        return true;
      }

      Widget var25;
      if (GameString.packetId == 22) {
        var20 = SpotAnimationConfig.gameBuffer.readInt();
        var3 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
        if (69999 < ~var20) {
          var3 += '\u8000';
        }

        if (var20 < 0) {
          var25 = null;
        } else {
          var25 = EnumStringFetcher.getWidget((byte) 127, var20);
        }

        for (; ~SpotAnimationConfig.gameBuffer.position
          > ~HashTable.packetLength; FloorOverlay.method2277(var6 + -1, var5, var30, var3,
          (byte) 46)) {
          var5 = SpotAnimationConfig.gameBuffer.readUnsignedSmart(true);
          var6 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
          var30 = 0;
          if (var6 != 0) {
            var30 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
            if (-256 == ~var30) {
              var30 = SpotAnimationConfig.gameBuffer.readInt();
            }
          }

          if (var25 != null && ~var5 <= -1 &&
            ~var25.anIntArray254.length < ~var5) {
            var25.anIntArray254[var5] = var6;
            var25.anIntArray317[var5] = var30;
          }
        }

        if (var25 != null) {
          DummyClass29.method909(-128, var25);
        }

        GameBuffer.method819(false);
        SomethingQuickChat.anIntArray3565[ClientScript.bitAnd(FileTable.anInt944++, 31)] =
          ClientScript.bitAnd(32767, var3);
        GameString.packetId = -1;
        return true;
      }

      if (GameString.packetId == 24) {
        var20 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
        if (AbstractMouseWheel.updateInterfaceCounter(var20, (byte) -25)) {
          AnimationSomething.method560(-21556);
        }

        GameString.packetId = -1;
        return true;
      }

      if (~GameString.packetId == -87) {
        DummyClass10.destroyGame((byte) 46);
        GameString.packetId = -1;
        return false;
      }
      if (116 == GameString.packetId) {
        var20 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        if (-1 != ~SpotAnimationConfig.gameBuffer.readUnsignedByte()) {
          --SpotAnimationConfig.gameBuffer.position;
          TextureSampler29.aClass133Array3393[var20] =
            new SomethingPacket116(SpotAnimationConfig.gameBuffer);
        } else {
          TextureSampler29.aClass133Array3393[var20] = new SomethingPacket116();
        }

        GameString.packetId = -1;
        BufferData.anInt1642 = TextureSampler23.anInt3213;
        return true;
      }
      if (-74 == ~GameString.packetId) {
        var20 = SpotAnimationConfig.gameBuffer.readUnsignedShortAdd();
        var3 = SpotAnimationConfig.gameBuffer.method782(-105);
        if (~var20 == -65536) {
          var20 = -1;
        }

        var21 = SpotAnimationConfig.gameBuffer.readUnsignedShortLE();
        if (AbstractMouseWheel.updateInterfaceCounter(var21, (byte) -25)) {
          TextureSampler19.method256(-1, 2, var3, (byte) -113, var20);
        }

        GameString.packetId = -1;
        return true;
      }

      if (~GameString.packetId == -163) {
        DummyClass37.parseSceneRebuild(false);
        GameString.packetId = -1;
        return true;
      }

      if (165 == GameString.packetId) {
        var20 = SpotAnimationConfig.gameBuffer.readUnsignedShortLE();
        var3 = SpotAnimationConfig.gameBuffer.readUnsignedShortLE();
        if (var3 == '\uffff') {
          var3 = -1;
        }

        var21 = SpotAnimationConfig.gameBuffer.readInt();
        var5 = SpotAnimationConfig.gameBuffer.readUnsignedShortAdd();
        var6 = SpotAnimationConfig.gameBuffer.method780(-1);
        if (~var5 == -65536) {
          var5 = -1;
        }

        if (AbstractMouseWheel.updateInterfaceCounter(var20, (byte) -25)) {
          for (var30 = var5; ~var3 <= ~var30; ++var30) {
            var36 = ((long) var21 << -1381724512) - -((long) var30);
            var47 = (WidgetAccess) DummyClass23.aClass130_1659.get(var36);
            if (var47 == null) {
              if (-1 == var30) {
                var38 = new WidgetAccess(var6,
                  EnumStringFetcher.getWidget((byte) 116, var21).aClass3_Sub1_257.anInt2202);
              } else {
                var38 = new WidgetAccess(var6, -1);
              }
            } else {
              var38 = new WidgetAccess(var6, var47.anInt2202);
              var47.unlinkNode();
            }

            DummyClass23.aClass130_1659.put(var36, var38);
          }
        }

        GameString.packetId = -1;
        return true;
      }

      if (GameString.packetId == 197) {
        HintMarker.anInt1357 = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        DummyClass31.anInt1472 = TextureSampler23.anInt3213;
        GameString.packetId = -1;
        return true;
      }
      if (GameString.packetId == 196) {
        var2 = SpotAnimationConfig.gameBuffer.readLong();
        var21 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
        byte var28 = SpotAnimationConfig.gameBuffer.readByte();
        var31 = -1L != ~(Long.MIN_VALUE & var2);

        if (!var31) {
          var41 = SpotAnimationConfig.gameBuffer.readString();
          ClanChatUser var40 = new ClanChatUser();
          var40.key = var2;
          var40.name = FileCache.stringFromBase37(-29664, var40.key);
          var40.aByte2472 = var28;
          var40.aClass94_2473 = var41;
          var40.anInt2478 = var21;

          for (var33 = -1 + SubNode.anInt2572; ~var33 <= -1; --var33) {
            var10 =
              ClientScript.aClass3_Sub19Array3694[var33].name.method1559(var40.name, var0 ^ 82);
            if (-1 == ~var10) {
              ClientScript.aClass3_Sub19Array3694[var33].anInt2478 = var21;
              ClientScript.aClass3_Sub19Array3694[var33].aByte2472 = var28;
              ClientScript.aClass3_Sub19Array3694[var33].aClass94_2473 = var41;
              if (~var2 == ~TextureSampler15.encodedUsername) {
                CollisionMap.aByte1308 = var28;
              }

              DummyClass10.anInt2087 = TextureSampler23.anInt3213;
              GameString.packetId = -1;
              return true;
            }

            if (var10 < 0) {
              break;
            }
          }

          if (ClientScript.aClass3_Sub19Array3694.length <= SubNode.anInt2572) {
            GameString.packetId = -1;
            return true;
          }

          for (var10 = SubNode.anInt2572 + -1; ~var33 > ~var10; --var10) {
            ClientScript.aClass3_Sub19Array3694[1 + var10] =
              ClientScript.aClass3_Sub19Array3694[var10];
          }

          if (-1 == ~SubNode.anInt2572) {
            ClientScript.aClass3_Sub19Array3694 = new ClanChatUser[100];
          }

          ClientScript.aClass3_Sub19Array3694[1 + var33] = var40;
          if (TextureSampler15.encodedUsername == var2) {
            CollisionMap.aByte1308 = var28;
          }

          ++SubNode.anInt2572;
        } else {
          if (~SubNode.anInt2572 == -1) {
            GameString.packetId = -1;
            return true;
          }

          boolean var37 = false;
          var2 &= Long.MAX_VALUE;

          for (
            var30 = 0;
            ~SubNode.anInt2572 < ~var30 && (var2 != ClientScript.aClass3_Sub19Array3694[var30].key
              || ~var21 != ~ClientScript.aClass3_Sub19Array3694[var30].anInt2478); ++var30) {
          }

          if (var30 < SubNode.anInt2572) {
            while (~(-1 + SubNode.anInt2572) < ~var30) {
              ClientScript.aClass3_Sub19Array3694[var30] =
                ClientScript.aClass3_Sub19Array3694[1 + var30];
              ++var30;
            }

            --SubNode.anInt2572;
            ClientScript.aClass3_Sub19Array3694[SubNode.anInt2572] = null;
          }
        }

        GameString.packetId = -1;
        DummyClass10.anInt2087 = TextureSampler23.anInt3213;
        return true;
      }

      if (50 == GameString.packetId) {
        var20 = SpotAnimationConfig.gameBuffer.readInt();
        var3 = SpotAnimationConfig.gameBuffer.readInt((byte) -79);
        var21 = SpotAnimationConfig.gameBuffer.readShortLEAdd();
        if ('\uffff' == var21) {
          var21 = -1;
        }

        var5 = SpotAnimationConfig.gameBuffer.readUnsignedShortLE();
        if (AbstractMouseWheel.updateInterfaceCounter(var5, (byte) -25)) {
          Widget var34 = EnumStringFetcher.getWidget((byte) 115, var3);
          ItemConfig var43;
          if (var34.aBoolean233) {
            Projectile.method2026((byte) 122, var3, var20, var21);
            var43 = DummyClass35.getItemConfig(var21, (byte) 70);
            FileUnpacker.method2143((byte) -128, var43.anInt810, var3, var43.rotationY,
              var43.rotationX);
            DummyClass51.method1420(var3, var43.rotationZ, var43.translateOther, var43.translateX,
              (byte) -85);
          } else {
            if (-1 == var21) {
              var34.anInt202 = 0;
              GameString.packetId = -1;
              return true;
            }

            var43 = DummyClass35.getItemConfig(var21, (byte) 91);
            var34.rotationX0 = var43.rotationX;
            var34.anInt164 = 100 * var43.anInt810 / var20;
            var34.anInt202 = 4;
            var34.anInt201 = var21;
            var34.rotationY = var43.rotationY;
            DummyClass29.method909(117, var34);
          }
        }

        GameString.packetId = -1;
        return true;
      }

      if (~GameString.packetId == -106) {
        var20 = SpotAnimationConfig.gameBuffer.readInt();
        var3 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
        if (~var20 > 69999) {
          var3 += '\u8000';
        }

        if (0 <= var20) {
          var25 = EnumStringFetcher.getWidget((byte) 118, var20);
        } else {
          var25 = null;
        }

        if (var25 != null) {
          for (var5 = 0; var25.anIntArray254.length > var5; ++var5) {
            var25.anIntArray254[var5] = 0;
            var25.anIntArray317[var5] = 0;
          }
        }

        SomethingQuickChatK.method852((byte) 114, var3);
        var5 = SpotAnimationConfig.gameBuffer.readUnsignedShort();

        for (var6 = 0; var5 > var6; ++var6) {
          var30 = SpotAnimationConfig.gameBuffer.method754(true);
          if (255 == var30) {
            var30 = SpotAnimationConfig.gameBuffer.readInt();
          }

          var8 = SpotAnimationConfig.gameBuffer.readUnsignedShort();
          if (null != var25 && ~var6 > ~var25.anIntArray254.length) {
            var25.anIntArray254[var6] = var8;
            var25.anIntArray317[var6] = var30;
          }

          FloorOverlay.method2277(-1 + var8, var6, var30, var3, (byte) 41);
        }

        if (var25 != null) {
          DummyClass29.method909(-9, var25);
        }

        GameBuffer.method819(false);
        SomethingQuickChat.anIntArray3565[ClientScript.bitAnd(FileTable.anInt944++, 31)] =
          ClientScript.bitAnd(32767, var3);
        GameString.packetId = -1;
        return true;
      }

      // Set settings
      if (~GameString.packetId == -143) {
        StringNode.setSettings(0, SpotAnimationConfig.gameBuffer.readString());
        GameString.packetId = -1;
        return true;
      }

      // Set block coordinates
      if (GameString.packetId == 26) {
        DummyClass45.spawnSceneX = SpotAnimationConfig.gameBuffer.method786(true);
        DummyClass56.spawnSceneY = SpotAnimationConfig.gameBuffer.readUnsignedByte();
        GameString.packetId = -1;
        return true;
      }

      if (4 == GameString.packetId) {
        var20 = SpotAnimationConfig.gameBuffer.readShortLEAdd();
        if (var20 == '\uffff') {
          var20 = -1;
        }

        BlockConfig.method1427(true, var20);
        GameString.packetId = -1;
        return true;
      }

      if (GameString.packetId == 208) {
        var20 = SpotAnimationConfig.gameBuffer.method755((byte) -118);
        var3 = SpotAnimationConfig.gameBuffer.readUnsignedShortLE();
        if (var3 == '\uffff') {
          var3 = -1;
        }

        DummyClass10.method2266(var20, var3, (byte) -1);
        GameString.packetId = -1;
        return true;
      }

      GZipDecompressor.reportError(
        "T1 - " + GameString.packetId + "," + EnumStringFetcher.lastPacketId1 + ","
          + IdentityKit.lastPacketId2 + " - " + HashTable.packetLength, null, (byte) 117);
      DummyClass10.destroyGame((byte) 46);
      return true;
    } catch (RuntimeException var19) {
      throw AbstractGameWorld.cascadeException(var19, "ac.C(" + var0 + ')');
    }
  }

  public static void method828(int var0) {
    try {
      DEFAULT_RENDER_ANIMATION = null;
      aByteArrayArrayArray81 = null;
      aClass94_85 = null;
      if (var0 > -88) {
        method828(-84);
      }

      aClass61_82 = null;
      aClass11_88 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ac.A(" + var0 + ')');
    }
  }

  static final void method829(int var0) {
    try {
      DummyClass29.method909(var0 + 111, DummyClass42.aClass11_886);
      ++SomethingTexture3.anInt2658;
      if (DummyClass60.aBoolean440 && DummyClass52.aBoolean1167) {
        int var1 = SomethingTilek.anInt1676;
        var1 -= BufferObject.anInt1881;
        if (TextureSampler20.anInt3156 > var1) {
          var1 = TextureSampler20.anInt3156;
        }

        int var2 = HashTable.anInt1709;
        if (~(TextureSampler20.anInt3156 + aClass11_88.anInt168) > ~(var1
          - -DummyClass42.aClass11_886.anInt168)) {
          var1 =
            -DummyClass42.aClass11_886.anInt168 + TextureSampler20.anInt3156 + aClass11_88.anInt168;
        }

        var2 -= DummyClass53.anInt1336;
        if (~var2 > ~DummyClass21.anInt1761) {
          var2 = DummyClass21.anInt1761;
        }

        if (DummyClass21.anInt1761 - -aClass11_88.anInt193
          < var2 - -DummyClass42.aClass11_886.anInt193) {
          var2 =
            DummyClass21.anInt1761 + aClass11_88.anInt193 + -DummyClass42.aClass11_886.anInt193;
        }

        if (var0 != -1) {
          aClass61_82 = null;
        }

        int var4 = var2 - SceneGraphTile.anInt2218;
        int var3 = var1 + -SomethingVolume15.anInt2421;
        int var6 = var1 + -TextureSampler20.anInt3156 + aClass11_88.anInt247;
        int var7 = aClass11_88.anInt208 + -DummyClass21.anInt1761 + var2;
        int var5 = DummyClass42.aClass11_886.anInt214;
        if (~SomethingTexture3.anInt2658 < ~DummyClass42.aClass11_886.anInt179 && (~var5 > ~var3
          || ~(-var5) < ~var3 || var4 > var5 || var4 < -var5)) {
          NPC.aBoolean3975 = true;
        }

        ClientScriptCall var8;
        if (DummyClass42.aClass11_886.anObjectArray295 != null && NPC.aBoolean3975) {
          var8 = new ClientScriptCall();
          var8.aClass11_2449 = DummyClass42.aClass11_886;
          var8.arguments = DummyClass42.aClass11_886.anObjectArray295;
          var8.anInt2447 = var6;
          var8.anInt2441 = var7;
          Light.executeScript(var8);
        }

        if (0 == TextureSampler21.anInt3069) {
          if (NPC.aBoolean3975) {
            if (DummyClass42.aClass11_886.anObjectArray229 != null) {
              var8 = new ClientScriptCall();
              var8.anInt2441 = var7;
              var8.aClass11_2438 = DummyClass32.aClass11_526;
              var8.anInt2447 = var6;
              var8.arguments = DummyClass42.aClass11_886.anObjectArray229;
              var8.aClass11_2449 = DummyClass42.aClass11_886;
              Light.executeScript(var8);
            }

            if (DummyClass32.aClass11_526 != null
              && GameClient.method42(DummyClass42.aClass11_886) != null) {
              TextureSampler12.secureBuffer.writePacket(79);
              ++DummyClass30.anInt456;
              TextureSampler12.secureBuffer.method759(-93, DummyClass42.aClass11_886.anInt279);
              TextureSampler12.secureBuffer.writeShortLE(var0 ^ 0,
                DummyClass32.aClass11_526.anInt191);
              TextureSampler12.secureBuffer.writeInt(DummyClass32.aClass11_526.anInt279);
              TextureSampler12.secureBuffer.writeShortLE(-1, DummyClass42.aClass11_886.anInt191);
            }
          } else if ((-2 == ~OndemandRequester.anInt998 || TextureSampler8.method353(
            -1 + TextureSampler25.amountContextActions, ~var0))
            && TextureSampler25.amountContextActions > 2) {
            DummyClass22.method1801((byte) -97);
          } else if (~TextureSampler25.amountContextActions < -1) {
            TextureSampler9.method203(96);
          }

          DummyClass42.aClass11_886 = null;
        }

      } else {
        if (-2 > ~SomethingTexture3.anInt2658) {
          DummyClass42.aClass11_886 = null;
        }

      }
    } catch (RuntimeException var9) {
      throw AbstractGameWorld.cascadeException(var9, "ac.F(" + var0 + ')');
    }
  }

}
