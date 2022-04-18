package io.samjingwen.command.core.fan;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Fan {
  public void high() {
    log.info("fan is on high");
  }

  public void medium() {
    log.info("fan is on medium");
  }

  public void low() {
    log.info("fan is on low");
  }

  public void off() {
    log.info("fan is off");
  }
}
