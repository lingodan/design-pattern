package com.lingodan.study.designpattern.creational.prototype;

public class Square extends Shape {

    public Square() {
        super.type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Prototype::Square::draw()");
    }
}
