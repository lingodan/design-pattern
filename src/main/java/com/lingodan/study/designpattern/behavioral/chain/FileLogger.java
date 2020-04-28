package com.lingodan.study.designpattern.behavioral.chain;

public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("FileLogger::write()");
    }
}
