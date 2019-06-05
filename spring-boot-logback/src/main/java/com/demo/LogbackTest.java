package com.demo;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.ConsoleAppender;

/**
 * Created by lwx on 2019/6/4.
 */
public class LogbackTest {

    public static void main(String[] args) {
        LoggerContext loggerContext = new LoggerContext();
        Logger logger = loggerContext.getLogger(LogbackTest.class);

        logger.addAppender(new ConsoleAppender<>());

        logger.info("hello world");

    }
}
