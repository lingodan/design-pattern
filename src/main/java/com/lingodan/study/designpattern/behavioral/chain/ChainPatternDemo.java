package com.lingodan.study.designpattern.behavioral.chain;

public class ChainPatternDemo {
    public static void main(String[] args) {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        AbstractLogger loggerChain = errorLogger;

        loggerChain.logMessage(AbstractLogger.INFO, "INFO level");
        System.out.println("============================================");
        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is a debug level information.");
        System.out.println("============================================");
        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }

}
