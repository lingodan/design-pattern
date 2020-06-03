package com.lingodan.study.designpattern.behavioral.state;

/**
 * @author lingodan
 * Created on 2020/6/3 22:43.
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }
}
