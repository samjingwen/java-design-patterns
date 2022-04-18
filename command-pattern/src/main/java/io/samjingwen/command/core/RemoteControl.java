package io.samjingwen.command.core;

import java.util.HashMap;
import java.util.Map;

public class RemoteControl {
  Map<Integer, Command> commands;

  public RemoteControl() {
    commands = new HashMap<>();
  }

  public void setCommand(int slot, Command command) {
    commands.put(slot, command);
  }

  public void pushButton(int slot) {
    commands.getOrDefault(slot, new NoCommand()).execute();
  }
}
