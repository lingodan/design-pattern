package com.lingodan.study.designpattern.creational.singleton;

import java.util.stream.IntStream;

public enum EnumWay {
    INSTANCE;

    public void doSomething(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Singleton Create");
    }

    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100).parallel().forEach(one-> System.out.println(Thread.currentThread().getName()));
    }

    // Effective Java中推荐使用枚举类来实现单例模式
    // 为什么要使用单例模式

    /*
    目的：
    1.在资源共享的情况下，避免由于资源操作时导致的性能或者损耗等
    2.控制资源的情况下，方便资源资源之间相互通信，如线程池等。
     */



}
