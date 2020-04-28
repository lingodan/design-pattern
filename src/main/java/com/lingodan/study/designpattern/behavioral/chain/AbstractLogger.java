package com.lingodan.study.designpattern.behavioral.chain;

/*
责任链模式就为请求创建一个接收者对象的链，这种模式对请求模型进行解耦，对请求的发送者和接受者进行解耦。
每个核心的接收者都包含对另一个接收者的引用。
 */
public abstract class AbstractLogger {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger logger) {
        this.nextLogger = logger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if(nextLogger != null){
            nextLogger.logMessage(level,message);
        }


    }
    public abstract void write(String message);
}
