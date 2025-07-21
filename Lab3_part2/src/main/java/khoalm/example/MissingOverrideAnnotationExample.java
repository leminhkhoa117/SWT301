package khoalm.example;

import java.util.logging.Logger;

class Animal {
    protected static final Logger logger = Logger.getLogger(Animal.class.getName());

    void speak() {
        logger.info("Animal speaks");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        logger.info("Dog barks");
    }
}
