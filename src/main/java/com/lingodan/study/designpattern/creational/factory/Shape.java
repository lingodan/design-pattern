package com.lingodan.study.designpattern.creational.factory;

public interface Shape {
    /*
    在工厂模式中，我们在创建对象是不会对客户端暴露创建逻辑，并且是通过一个共同的接口来指向新创建的对象。
     */
    void draw();
}
