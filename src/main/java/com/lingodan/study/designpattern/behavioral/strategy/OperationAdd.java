package com.lingodan.study.designpattern.behavioral.strategy;

/**
 * @author lingodan
 * Created on 2020/6/3 22:30.
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}