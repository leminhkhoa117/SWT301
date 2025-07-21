package khoalm.example;

import java.util.logging.Logger;

public class NullPointerExample {
    private static final Logger logger = Logger.getLogger(NullPointerExample.class.getName());

    public static void main(String[] args) {
        // Now text might be null or non-null at runtime
        String text = Math.random() > 0.5 ? "Hello" : null;

        if (text != null && !text.isEmpty()) {
            logger.info("Text is not empty");
        } else if (text == null) {
            logger.warning("Text is null");
        } else {
            logger.info("Text is empty");
        }
    }
}
