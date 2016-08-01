final class BumpShader implements MaterialShader {

  public final void enable() {
    if (DisplayMode.useBumpMaps) {
      GlRenderer.setLightingEnabled(false);
    }
  }

  public final int method24() {
    return 0;
  }

  public final void set(int var1) {}

  public final void disable() {
    if (DisplayMode.useBumpMaps) {
      GlRenderer.setLightingEnabled(true);
    }
  }
}
