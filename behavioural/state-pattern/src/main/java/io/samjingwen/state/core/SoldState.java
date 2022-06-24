package io.samjingwen.state.core;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class SoldState implements State {
  GumballMachine gumballMachine;

  @Override
  public void insertCoin() {
    log.info("Please wait, we're already giving you a gumball");
  }

  @Override
  public void ejectCoin() {
    log.info("Sorry, you already turned the crank");
  }

  @Override
  public void turnCrank() {
    log.info("Turning twice doesn't get you another gumball!");
  }

  @Override
  public void dispense() {
    gumballMachine.releaseBall();
    if (gumballMachine.getCount() > 0) {
      gumballMachine.setState(gumballMachine.getNoQuarterState());
    } else {
      log.info("Oops, out of gumballs!");
      gumballMachine.setState(gumballMachine.getSoldOutState());
    }
  }

  @Override
  public void refill() {}

  @Override
  public String toString() {
    return "dispensing a gumball";
  }
}
