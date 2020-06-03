package com.lingodan.study.designpattern.behavioral.strategy;

/**
 * @author lingodan
 * Created on 2020/6/3 22:32.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }

}
