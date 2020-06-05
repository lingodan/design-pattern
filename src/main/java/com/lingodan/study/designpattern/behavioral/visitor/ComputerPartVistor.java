package com.lingodan.study.designpattern.behavioral.visitor;

/**
 * @author lingodan
 * Created on 2020/6/5 13:27.
 */
public interface ComputerPartVistor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
