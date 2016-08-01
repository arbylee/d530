public final class Time {
  private static long deltaTime;
  private static long lastSampledTime;

  public static final synchronized long getCurrentTimeMillis() {
    long currentTime = System.currentTimeMillis();
    if (lastSampledTime > currentTime) {
      deltaTime += lastSampledTime - currentTime;
    }
    lastSampledTime = currentTime;
    return deltaTime + currentTime;
  }
}
