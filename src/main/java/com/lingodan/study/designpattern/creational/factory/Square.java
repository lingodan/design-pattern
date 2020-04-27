package com.lingodan.study.designpattern.creational.factory;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside::Square::draw");
    }
}
