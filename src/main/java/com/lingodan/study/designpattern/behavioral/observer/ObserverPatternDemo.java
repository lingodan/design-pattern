package com.lingodan.study.designpattern.behavioral.observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change:15");
        subject.setState(15);
        System.out.println("Second state change:250");
        subject.setState(250);

    }
}
