package khoalm.example;
import java.util.logging.Logger;

public class SQLInjectionExample {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(SQLInjectionExample.class.getName());
        String userInput = "' OR '1'='1";
        String query = String.format("SELECT * FROM users WHERE username = '%s'", userInput);
        logger.info("Executing query: " + query);
    }
}
