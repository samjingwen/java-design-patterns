package io.samjingwen.state.core;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class HasCoinState implements State {
  GumballMachine gumballMachine;

  @Override
  public void insertCoin() {
    log.info("You can't insert another quarter");
  }

  @Override
  public void ejectCoin() {
    log.info("Quarter returned");
    gumballMachine.setState(gumballMachine.getNoQuarterState());
  }

  @Override
  public void turnCrank() {
    log.info("You turned...");
    gumballMachine.setState(gumballMachine.getSoldState());
  }

  @Override
  public void dispense() {
    log.info("No gumball dispensed");
  }

  @Override
  public void refill() {}

  @Override
  public String toString() {
    return "waiting for turn of crank";
  }
}
