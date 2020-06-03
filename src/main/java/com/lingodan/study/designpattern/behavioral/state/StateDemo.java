package com.lingodan.study.designpattern.behavioral.state;

/**
 * 类的行为基于它的状态
 * @author lingodan
 * Created on 2020/6/3 22:42.
 */
public class StateDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
