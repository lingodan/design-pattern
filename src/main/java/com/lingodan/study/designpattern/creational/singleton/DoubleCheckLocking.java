package com.lingodan.study.designpattern.creational.singleton;

import java.net.ConnectException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class DoubleCheckLocking {

    private volatile static DoubleCheckLocking instance;
    private DoubleCheckLocking(){}
    public static DoubleCheckLocking getInstance(){
        if(instance == null){
            synchronized (DoubleCheckLocking.class){
                if (instance == null){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new DoubleCheckLocking();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100).parallel().forEach(one-> System.out.println(Thread.currentThread().getName() + DoubleCheckLocking.getInstance()));
    }

}
