package com.lingodan.study.designpattern.behavioral.interpreter;

/**
 * @author lingodan
 * Created on 2020/6/5 13:15.
 */
public class InterpreterDemo {

    public static void main(String[] args) {
        Expression expr1 = new TerminalExpression("Hello");
        Expression expr2 = new TerminalExpression("World");
        System.out.println(expr1.interpret("Hello world"));

        Expression andExpr = new AndExpression(expr1, expr2);
        Expression orExpr = new OrExpression(expr1, expr2);

        System.out.println(andExpr.interpret("Hello world"));
        System.out.println(orExpr.interpret("Hello world"));
    }

}
