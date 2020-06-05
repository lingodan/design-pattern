package com.lingodan.study.designpattern.creational.prototype;

public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println(clonedShape.getType());
    }

}
