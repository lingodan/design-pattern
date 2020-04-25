package com.lingodan.study.designpattern.structural.bridge;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        this.color.paint("正方形");
    }
}
