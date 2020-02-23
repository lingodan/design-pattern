package com.lingodan.study.designpattern.structural.bridge;

public class White implements Color {
    @Override
    public void paint(String shape) {
        System.out.println("这是白色的" + shape);
    }
}
