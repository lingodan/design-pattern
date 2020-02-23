package com.lingodan.study.designpattern.structural.decorator;

public class Client {
    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border : ");
        circle.draw();
        System.out.println("\nCircle with red border : ");
        redCircle.draw();
        System.out.println("\nRectangle with red border : ");
        redRectangle.draw();
    }
}
