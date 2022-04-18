package io.samjingwen.command.core.fan;

import io.samjingwen.command.core.Command;

public record FanOffCommand(Fan fan) implements Command {
    @Override
    public void execute() {
        fan.off();
    }
}
