package org.example.stable.logs;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Log4j2andSLF4JTest {
    public static void main(String[] args) {
        // see properties log4j2.properties
        log.info("Info CommonsLog");
        log.warn("Warn CommonsLog");
        log.debug("Debug CommonsLog");
        log.error("Error CommonsLog");
        log.trace("Trace CommonsLog"); //
        log.fatal("Fatal CommonsLog");
    }
}