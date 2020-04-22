package com.lingodan.study.designpattern.creational.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class LazySafe {
    private static LazySafe instance;

    // 私有化构造器
    private LazySafe() {
    }

    public static synchronized LazySafe getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new LazySafe();
        }
        return instance;
    }


    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100).parallel().forEach(one-> System.out.println(Thread.currentThread().getName() + LazySafe.getInstance()));
    }

}
