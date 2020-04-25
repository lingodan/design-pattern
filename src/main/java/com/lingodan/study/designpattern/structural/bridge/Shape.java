package com.lingodan.study.designpattern.structural.bridge;

/**
 * 这个类也是定义了一个Shape的抽象类
 */
public abstract class Shape {

    /**
     * 定义Color的成员变量，然后利用多态，可以将Color的具体实现，传递进来。
     * 访问权限定义为protected
     * 限定访问权限 ：
     * private 限定只有本类可以访问
     * protected: 本类、同一个包的类、继承类 可以访问。
     * public：本类、同一个包的类、继承类、其他类
     *
     */
    protected Color color;

    protected Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
