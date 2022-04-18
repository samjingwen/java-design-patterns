package io.samjingwen.command.core.light;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Light {

    public void on() {
        log.info("light is on");
    }

    public void off() {
        log.info("light is off");
    }
}
