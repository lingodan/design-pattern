package com.lingodan.study.designpattern.structural.decorator;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("SHAPE: circle");
    }
}
