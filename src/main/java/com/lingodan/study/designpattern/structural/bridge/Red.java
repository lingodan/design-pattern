package com.lingodan.study.designpattern.structural.bridge;

public class Red implements Color {
    @Override
    public void paint(String shape) {
        System.out.println("这是红色的" + shape);
    }
}
