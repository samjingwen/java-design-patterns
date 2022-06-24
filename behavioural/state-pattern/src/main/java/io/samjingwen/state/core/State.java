package io.samjingwen.state.core;

public interface State {
  void insertCoin();

  void ejectCoin();

  void turnCrank();

  void dispense();

  void refill();
}
