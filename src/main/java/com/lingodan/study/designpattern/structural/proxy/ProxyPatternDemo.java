package com.lingodan.study.designpattern.structural.proxy;

public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10md.jpg");
        image.display();
        System.out.println("............");
        image.display();
    }

}
