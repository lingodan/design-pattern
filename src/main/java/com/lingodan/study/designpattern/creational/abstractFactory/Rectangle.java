package com.lingodan.study.designpattern.creational.abstractFactory;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside::Rectangle::draw()");
    }
}
