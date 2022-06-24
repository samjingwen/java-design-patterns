package io.samjingwen.state.core;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class NoCoinState implements State {
  GumballMachine gumballMachine;

  @Override
  public void insertCoin() {
    log.info("You inserted a quarter");
    gumballMachine.setState(gumballMachine.getHasQuarterState());
  }

  @Override
  public void ejectCoin() {
    log.info("You haven't inserted a quarter");
  }

  @Override
  public void turnCrank() {
    log.info("You turned, but there's no quarter");
  }

  @Override
  public void dispense() {
    log.info("You need to pay first");
  }

  @Override
  public void refill() {}

  @Override
  public String toString() {
    return "waiting for quarter";
  }
}
