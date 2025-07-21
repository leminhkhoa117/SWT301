package khoalm.example;

import java.util.logging.Logger;

class Printer {
    private static final Logger logger = Logger.getLogger(Printer.class.getName());

    void print(String message) {
        logger.info(message);
    }
}

class Report {
    private Printer printer = new Printer(); // tightly coupled

    void generate() {
        printer.print("Generating report...");
    }
}
