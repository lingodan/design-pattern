package com.lingodan.study.designpattern.behavioral.mediator;

/**
 * 降低多个对象之间调用的复杂性
 *
 * @author lingodan
 * Created on 2020/6/4 22:20.
 */
public class MediatorDemo {

    public static void main(String[] args) {

        User Robert = new User("Robert");
        User Jack = new User("Jack");

        Robert.showMessage("Hello Jack");
        Jack.showMessage("Hello Robert");

    }

}
