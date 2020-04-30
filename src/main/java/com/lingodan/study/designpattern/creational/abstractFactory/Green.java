package com.lingodan.study.designpattern.creational.abstractFactory;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside::Green::fill()");
    }
}