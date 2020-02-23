package com.lingodan.study.designpattern.structural.bridge;

public abstract class Shape {
    // 访问权限定义为protected
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
