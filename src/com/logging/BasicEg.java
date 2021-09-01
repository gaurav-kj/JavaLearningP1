package com.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BasicEg {
    private static Logger LOGGER = Logger.getLogger(BasicEg.class.getName());

    public static void main(String[] args) {
        LOGGER.log(Level.INFO, "Hello world!");
    }
}