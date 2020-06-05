package com.lingodan.study.designpattern.behavioral.interpreter;

/**
 * @author lingodan
 * Created on 2020/6/5 13:16.
 */
public interface Expression {
    public boolean interpret(String context);
}
