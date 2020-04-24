package com.lingodan.study.designpattern.structural.flyweight;

public interface Shape {

    /*
    享元模式主要视为了减少对象的数量，以减少内存占用和提高性能。
    享元模式尝试重用现有的同类对象，如果没有找到匹配的对象，则创建新对象。
     */

    void draw();

}
