package com.lingodan.study.designpattern.behavioral.interpreter;

/**
 * @author lingodan
 * Created on 2020/6/5 13:16.
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
