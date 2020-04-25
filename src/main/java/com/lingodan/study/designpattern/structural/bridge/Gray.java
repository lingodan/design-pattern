package com.lingodan.study.designpattern.structural.bridge;

public class Gray implements Color {

    /**
     * 绘制灰色的实现类
     * @param shape
     */
    @Override
    public void paint(String shape) {
        System.out.println("这是灰色的" + shape);
    }
}
