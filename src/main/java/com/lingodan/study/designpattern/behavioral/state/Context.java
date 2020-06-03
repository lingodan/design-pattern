package com.lingodan.study.designpattern.behavioral.state;

/**
 * @author lingodan
 * Created on 2020/6/3 22:44.
 */
public class Context {
    private State state;

    public Context() {
        this.state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
