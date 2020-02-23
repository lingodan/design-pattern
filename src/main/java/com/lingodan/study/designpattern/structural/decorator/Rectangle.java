package com.lingodan.study.designpattern.structural.decorator;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("SHAPE: rectangle");
    }
}
