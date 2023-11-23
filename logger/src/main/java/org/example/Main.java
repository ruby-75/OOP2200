package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.err.println("Error world!");
        System.out.println("Hello World!");

        Logger logger = new Logger();
        //not creating new object just getting a new instance if one doesn't exist
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        System.out.println("Are both logger of the same reference? " + (logger1 == logger2));

        logger1.setLoglevel(LogLevel.TRACE);
       // logger.log(LogLevel.DEBUG, "Hey-oh!");
        logger1.log(LogLevel.TRACE, "trace level log message");
        logger1.log(LogLevel.DEBUG, "debug level log message");
        logger1.log(LogLevel.INFO, "info level log message");
        logger1.log(LogLevel.WARN, "warn level log message");
        logger1.log(LogLevel.ERROR, "error level log message");

        //Display all logged messages
        System.out.println("Displaying all logged messages...");
        logger1.displayLogs();

    }
}