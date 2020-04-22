package com.lingodan.study.designpattern.creational.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class HungrySafe {

    private static HungrySafe instance = new HungrySafe();

    private HungrySafe(){}

    public static HungrySafe getInstance(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return instance;
    }


    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100).parallel().forEach(one-> System.out.println(Thread.currentThread().getName() + HungrySafe.getInstance()));
    }

}
