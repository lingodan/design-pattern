package com.lingodan.study.designpattern.structural.flyweight;

public class FlyweightStartDemo {

    private static final String[] colors = new String[]{"RED","BLUE","GREEN","BLACK","WHITE","YELLOW"};

    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }

    }

    private static int getRandomY() {
        return (int) (Math.random()*100);
    }

    private static int getRandomX() {
        return (int) (Math.random()*1000);
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random()* colors.length)];
    }

}
