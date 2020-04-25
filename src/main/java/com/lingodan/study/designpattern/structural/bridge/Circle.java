package com.lingodan.study.designpattern.structural.bridge;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        color.paint("圆形");
    }
}
