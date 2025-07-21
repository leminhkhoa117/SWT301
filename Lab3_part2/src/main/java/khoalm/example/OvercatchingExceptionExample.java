package khoalm.example;

import java.util.logging.Logger;

public class OvercatchingExceptionExample {
    private static final Logger logger = Logger.getLogger(OvercatchingExceptionExample.class.getName());

    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            logger.info(String.valueOf(arr[10])); // May throw ArrayIndexOutOfBoundsException
        } catch (RuntimeException e) {
            logger.severe("Runtime error");
        }
    }
}
