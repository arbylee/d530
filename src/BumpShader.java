final class BumpShader implements MaterialShader {

  public final void disable() {
    if (DisplayMode.useBumpMaps) {
      GlRenderer.setLightingEnabled(true);
    }
  }

  public final void enable() {
    if (DisplayMode.useBumpMaps) {
      GlRenderer.setLightingEnabled(false);
    }
  }

  public final void set(int var1) {
  }

  public final int method24() {
    return 0;
  }
}
