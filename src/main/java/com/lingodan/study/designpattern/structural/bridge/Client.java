package com.lingodan.study.designpattern.structural.bridge;

public class Client {
    /*
    桥接是用于把抽象化与实现解耦，使二者可以独立变化。属于结构型模式，它通过抽象化和现实化之间的桥接结构，实现二者的解耦。
     */

    public static void main(String[] args) {
        Color white = new White();
        Shape square = new Square(white);
        square.draw();

        Shape rectangle = new Rectangle(new Red());
        rectangle.draw();
    }
}
