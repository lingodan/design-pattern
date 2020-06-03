package com.lingodan.study.designpattern.behavioral.strategy;

/**
 * @author lingodan
 * Created on 2020/6/3 22:31.
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
