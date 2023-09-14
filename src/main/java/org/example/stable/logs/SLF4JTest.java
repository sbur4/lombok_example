package org.example.stable.logs;//package org.example.stable.logs;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SLF4JTest {
    public static void main(String[] args) {
        // see properties slf4j.properties
        log.info("Info CommonsLog");
        log.warn("Warn CommonsLog");
        log.debug("Debug CommonsLog");
        log.error("Error CommonsLog");
        log.trace("Trace CommonsLog"); //
    }
}