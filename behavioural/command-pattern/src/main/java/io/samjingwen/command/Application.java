package io.samjingwen.command;

import io.samjingwen.command.core.RemoteControl;
import io.samjingwen.command.core.fan.Fan;
import io.samjingwen.command.core.fan.FanOffCommand;
import io.samjingwen.command.core.fan.FanOnCommand;
import io.samjingwen.command.core.light.Light;
import io.samjingwen.command.core.light.LightOffCommand;
import io.samjingwen.command.core.light.LightOnCommand;

public class Application {
  public static void main(String[] args) {
    RemoteControl remoteControl = new RemoteControl();

    Light light = new Light();
    remoteControl.setCommand(0, new LightOnCommand(light));
    remoteControl.setCommand(1, new LightOffCommand(light));

    Fan fan = new Fan();
    remoteControl.setCommand(2, new FanOnCommand(fan));
    remoteControl.setCommand(3, new FanOffCommand(fan));

    remoteControl.pushButton(0);
    remoteControl.pushButton(1);
    remoteControl.pushButton(2);
    remoteControl.pushButton(3);
  }
}
