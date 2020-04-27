package com.lingodan.study.designpattern.creational.abstractFactory;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside::Blue::fill()");
    }
}
