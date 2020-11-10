package com.sahibinden.test;

import org.apache.logging.log4j.*;

public class jLogger {

    private static final Logger jLogger = LogManager.getLogger(jLogger.class);


    public static void info(String message) {
        jLogger.info(message);

    }

    public static void info(int integer) {
        jLogger.info(integer);

    }

    public static void warn(String message) {
        jLogger.warn(message);

    }

    public static void error(String message) {
        jLogger.error(message);

    }

    public static void fatal(String message) {
        jLogger.fatal(message);

    }

    public static void debug(String message) {
        jLogger.debug(message);

    }

}
