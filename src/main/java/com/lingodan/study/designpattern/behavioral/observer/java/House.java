package com.lingodan.study.designpattern.behavioral.observer.java;

import java.util.Observable;

public class House extends Observable {

    private int price;

    public House(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        // 设置变化点，标记此处变化会通知观察者
        super.setChanged();
        super.notifyObservers(price);
        this.price = price;
    }

}
