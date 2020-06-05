package com.lingodan.study.designpattern.behavioral.visitor;

/**
 * @author lingodan
 * Created on 2020/6/5 13:24.
 */
public class Keyboard implements ComputePart {
    @Override
    public void accept(ComputerPartVistor computerPartVistor) {
        computerPartVistor.visit(this);
    }
}
