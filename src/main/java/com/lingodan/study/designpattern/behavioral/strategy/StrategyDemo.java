package com.lingodan.study.designpattern.behavioral.strategy;

/**
 * 一个类的行为或其算法可以在运行时更改
 *
 * @author lingodan
 * Created on 2020/6/3 22:27.
 */
public class StrategyDemo {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        Context context = new Context(new OperationAdd());
        System.out.println("ADD:" + context.executeStrategy(num1, num2));

        context = new Context(new OperationSubtract());
        System.out.println("SUB:" + context.executeStrategy(num1, num2));

        context = new Context(new OperationMultiply());
        System.out.println("MUL:" + context.executeStrategy(num1, num2));
    }

}
