package com.lingodan.study.designpattern.creational.prototype;

public class Circle extends Shape {

    public Circle(){
        super.type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Prototype::Circle::draw()");
    }
}
