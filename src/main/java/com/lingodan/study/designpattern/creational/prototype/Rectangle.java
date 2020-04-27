package com.lingodan.study.designpattern.creational.prototype;

public class Rectangle extends Shape {

    public Rectangle() {
        super.type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Prototype::Rectangle::draw()");
    }
}
