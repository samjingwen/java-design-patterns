package io.samjingwen.state.core;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class SoldOutState implements State {
  GumballMachine gumballMachine;

  public void insertCoin() {
    log.info("You can't insert a quarter, the machine is sold out");
  }

  public void ejectCoin() {
    log.info("You can't eject, you haven't inserted a quarter yet");
  }

  public void turnCrank() {
    log.info("You turned, but there are no gumballs");
  }

  public void dispense() {
    log.info("No gumball dispensed");
  }

  public void refill() {
    gumballMachine.setState(gumballMachine.getNoQuarterState());
  }

  public String toString() {
    return "sold out";
  }
}
