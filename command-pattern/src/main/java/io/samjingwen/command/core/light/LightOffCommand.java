package io.samjingwen.command.core.light;

import io.samjingwen.command.core.Command;

public record LightOffCommand(Light light) implements Command {

    @Override
    public void execute() {
        light.off();
    }
}
