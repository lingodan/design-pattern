package com.lingodan.study.designpattern.behavioral.command;

public interface Order {

    /*
    命令模式是一种数据驱动的设计模式，将请求以命令的形式在对象中，并传递给调用对象 ，调用对象可以处理该命令的合适的对象，并把该命令传递给响应的对象，该对象执行命令。
     */

    void execute();
}
