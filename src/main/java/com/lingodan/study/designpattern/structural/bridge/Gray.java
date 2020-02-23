package com.lingodan.study.designpattern.structural.bridge;

public class Gray implements Color {
    @Override
    public void paint(String shape) {
        System.out.println("这是灰色的" + shape);
    }
}
