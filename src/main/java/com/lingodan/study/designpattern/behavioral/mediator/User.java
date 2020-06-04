package com.lingodan.study.designpattern.behavioral.mediator;

/**
 * @author lingodan
 * Created on 2020/6/4 22:23.
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showMessage(String msg) {
        ChatRoom.showMsg(this, msg);
    }
}
