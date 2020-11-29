package log4jdemo;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test12Log4j {
    private static Logger logger = LogManager.getLogger(Test12Log4j.class);

    public static void main(String[] args) {
        System.out.println("\n Hellow World... \n");

        logger.trace("a trace message...");
        logger.debug("a debug message...");
        logger.info("information message...");
        logger.warn("a warn message...");
        logger.error("an error message...");
        logger.fatal("a fatal message...");

        System.out.println("\n Completed... \n");
    }
}
