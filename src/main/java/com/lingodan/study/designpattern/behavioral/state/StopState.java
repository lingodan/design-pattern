package com.lingodan.study.designpattern.behavioral.state;

/**
 * @author lingodan
 * Created on 2020/6/3 22:46.
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString() {
        return "Stop State";
    }
}
