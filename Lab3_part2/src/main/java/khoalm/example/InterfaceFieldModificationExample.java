package khoalm.example;

import java.util.logging.Logger;

enum Config {
    MAX_USERS(100);

    public final int value;

    Config(int value) {
        this.value = value;
    }
}

public class InterfaceFieldModificationExample {
    private static final Logger logger = Logger.getLogger(InterfaceFieldModificationExample.class.getName());

    public static void main(String[] args) {
        logger.info("Max users allowed: " + Config.MAX_USERS.value);
    }
}
