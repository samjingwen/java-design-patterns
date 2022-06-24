package io.samjingwen.singleton.core;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public final class EagerSingleton {
  private static final EagerSingleton uniqueInstance = new EagerSingleton();

  private EagerSingleton() {}

  public static EagerSingleton getInstance() {
    return uniqueInstance;
  }

  public void doStuff() {
    log.info(
        "hello from {}, addr: {}",
        this.getClass().getSimpleName(),
        Integer.toHexString(hashCode()));
  }
}
