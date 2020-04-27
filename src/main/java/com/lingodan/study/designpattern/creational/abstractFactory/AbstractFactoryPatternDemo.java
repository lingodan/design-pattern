package com.lingodan.study.designpattern.creational.abstractFactory;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPe");
        Shape shape1 = shapeFactory.getShape("SQuare");
        shape1.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
        Color color1 = colorFactory.getColor("Red");
        color1.fill();
    }

}
