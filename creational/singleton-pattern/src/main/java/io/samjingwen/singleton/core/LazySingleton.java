package io.samjingwen.singleton.core;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public final class LazySingleton {
  private static volatile LazySingleton uniqueInstance;

  private LazySingleton() {}

  public static LazySingleton getInstance() {
    if (uniqueInstance == null) {
      synchronized (LazySingleton.class) {
        if (uniqueInstance == null) {
          uniqueInstance = new LazySingleton();
        }
      }
    }
    return uniqueInstance;
  }

  public void doStuff() {
    log.info(
        "hello from {}, addr: {}",
        this.getClass().getSimpleName(),
        Integer.toHexString(hashCode()));
  }
}
