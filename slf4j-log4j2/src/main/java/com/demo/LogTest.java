package com.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lwx on 2019/6/4.
 */
public class LogTest {

    private static Logger logger = LoggerFactory.getLogger(LogTest.class);

    public static void main(String[] args) {
        logger.error("error");
    }
}
