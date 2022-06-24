package io.samjingwen.singleton;

import io.samjingwen.singleton.core.EagerSingleton;
import io.samjingwen.singleton.core.LazySingleton;
import java.util.stream.IntStream;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {
  public static void main(String[] args) {
    IntStream.range(0, 100)
        .parallel()
        .forEach(
            ignored -> {
              LazySingleton.getInstance().doStuff();
              EagerSingleton.getInstance().doStuff();
            });
  }
}
