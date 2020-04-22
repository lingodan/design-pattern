package com.lingodan.study.designpattern.creational.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class LazyUnsafe {

    private static LazyUnsafe instance;

    private LazyUnsafe(){}

    public static LazyUnsafe getInstance() {
        if(instance == null){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new LazyUnsafe();
        }
        return instance;
    }

    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100).parallel().forEach(one-> System.out.println(Thread.currentThread().getName() + LazyUnsafe.getInstance()));
    }


}
