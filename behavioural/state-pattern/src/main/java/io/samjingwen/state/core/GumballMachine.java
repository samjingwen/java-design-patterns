package io.samjingwen.state.core;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class GumballMachine {
  State soldOutState;
  State noQuarterState;
  State hasQuarterState;
  State soldState;

  @Setter State state;
  int count = 0;

  public GumballMachine(int numberOfGumballs) {
    soldOutState = new SoldOutState(this);
    noQuarterState = new NoCoinState(this);
    hasQuarterState = new HasCoinState(this);
    soldState = new SoldState(this);
    this.count = numberOfGumballs;
    if (numberOfGumballs > 0) {
      state = noQuarterState;
    } else {
      state = soldOutState;
    }
  }

  public void insertCoin() {
    state.insertCoin();
  }

  public void ejectCoin() {
    state.ejectCoin();
  }

  public void turnCrank() {
    state.turnCrank();
    state.dispense();
  }

  public void releaseBall() {
    log.info("A gumball comes rolling out the slot...");
    if (count > 0) {
      count = count - 1;
    }
  }

  public void refill(int count) {
    this.count += count;
    log.info("The gumball machine was just refilled; its new count is: " + this.count);
    state.refill();
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    result
        .append("\nMighty Gumball, Inc.")
        .append("\nJava-enabled Standing Gumball Model #2004")
        .append("\nInventory: ")
        .append(count)
        .append(" gumball");
    if (count != 1) {
      result.append("s");
    }
    result.append("\n").append("Machine is ").append(state).append("\n");
    return result.toString();
  }
}
