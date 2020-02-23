package com.lingodan.study.designpattern.structural.bridge;

public class Circle extends Shape {
    @Override
    public void draw() {
        color.paint("圆形");
    }
}
