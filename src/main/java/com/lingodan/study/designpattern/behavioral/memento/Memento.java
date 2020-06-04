package com.lingodan.study.designpattern.behavioral.memento;

/**
 * @author lingodan
 * Created on 2020/6/4 22:30.
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
