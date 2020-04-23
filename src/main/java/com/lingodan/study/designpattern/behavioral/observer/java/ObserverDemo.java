package com.lingodan.study.designpattern.behavioral.observer.java;

public class ObserverDemo {

    public static void main(String[] args) {

        House house = new House(100);

        BuyerOne one = new BuyerOne("One");
        BuyerTwo two = new BuyerTwo("Two");

        house.addObserver(one);
        house.addObserver(two);

        System.out.println("初始完成:"+house.getPrice());
        house.setPrice(120);
        System.out.println("结束完成："+ house.getPrice());

    }

}
