package org.example.stable.logs;

import lombok.extern.java.Log;

@Log
public class LogTest {
    public static void main(String[] args) {
        log.info("Info CommonsLog");
        log.finest("Finest CommonsLog"); //
        log.fine("Fine CommonsLog"); //
        log.finer("Finer CommonsLog"); //
        log.config("Config CommonsLog"); //
        log.warning("Warning CommonsLog");
        log.severe("severe CommonsLog");
    }
}