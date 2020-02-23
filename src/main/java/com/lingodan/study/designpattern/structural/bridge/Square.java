package com.lingodan.study.designpattern.structural.bridge;

public class Square extends Shape {
    @Override
    public void draw() {
        this.color.paint("正方形");
    }
}
