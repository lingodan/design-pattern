package com.lingodan.study.designpattern.structural.bridge;

public interface Color {

    /**
     * 定义绘制颜色的接口 ，提供绘制颜色的说明
     * @param shape
     */
    void paint(String shape);

}
