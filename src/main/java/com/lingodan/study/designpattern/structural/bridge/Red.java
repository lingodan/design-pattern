package com.lingodan.study.designpattern.structural.bridge;

public class Red implements Color {

    /**
     * 绘制红色的实现类
     * @param shape
     */
    @Override
    public void paint(String shape) {
        System.out.println("这是红色的" + shape);
    }
}
