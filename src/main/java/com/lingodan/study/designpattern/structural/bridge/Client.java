package com.lingodan.study.designpattern.structural.bridge;

public class Client {
    public static void main(String[] args) {
        Color white = new White();
        Shape square = new Square();
        square.setColor(white);
        square.draw();

        Shape rectangle = new Rectangle();
        rectangle.setColor(new Red());
        rectangle.draw();

    }
}
