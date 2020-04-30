package com.lingodan.study.designpattern.creational.abstractFactory;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("square")) {
            return new Square();
        } else {
            return null;
        }
    }

}