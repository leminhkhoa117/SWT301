package khoalm.example;

import java.util.logging.Logger;

public class CatchGenericExceptionExample {
    private static final Logger logger = Logger.getLogger(CatchGenericExceptionExample.class.getName());

    public static void main(String[] args) {
        // Simulate s being either null or non-null
        String s = Math.random() > 0.5 ? "Hello" : null;

        if (s != null) {
            logger.info(String.format("Length: %d", s.length()));
        } else {
            logger.warning("String 's' is null — cannot compute length.");
        }
    }
}
