package com.lingodan.study.designpattern.behavioral.memento;

/**
 * 保存一个对象的某个状态，以便在合适的时候恢复对象
 *
 * @author lingodan
 * Created on 2020/6/4 22:28.
 */
public class MementoDemo {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("Org#1");
        originator.setState("Org#2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("Org#3");
        originator.setState("Org#4");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("Org#5");

        System.out.println("Current State:" + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("CareTaker【0】" + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("CareTaker【1】" + originator.getState());

    }

}
