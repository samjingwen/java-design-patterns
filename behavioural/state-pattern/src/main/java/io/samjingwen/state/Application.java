package io.samjingwen.state;

import io.samjingwen.state.core.GumballMachine;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {
  public static void main(String[] args) {
    GumballMachine gumballMachine = new GumballMachine(2);

    log.info(gumballMachine + "");

    gumballMachine.insertCoin();
    gumballMachine.turnCrank();

    log.info(gumballMachine + "");

    gumballMachine.insertCoin();
    gumballMachine.turnCrank();
    gumballMachine.insertCoin();
    gumballMachine.turnCrank();

    gumballMachine.refill(5);
    gumballMachine.insertCoin();
    gumballMachine.turnCrank();

    log.info(gumballMachine + "");
  }
}
