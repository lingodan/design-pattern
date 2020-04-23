package com.lingodan.study.designpattern.behavioral.observer.java;

import java.util.Observable;
import java.util.Observer;

public class BuyerOne implements Observer {

    private String name;

    public BuyerOne(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(this.name + "价格修改");
        System.out.println(arg);
    }
}
