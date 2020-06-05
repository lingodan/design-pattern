package com.lingodan.study.designpattern.behavioral.visitor;

/**
 * @author lingodan
 * Created on 2020/6/5 13:30.
 */
public class ComputerPartDisplayVisitor implements ComputerPartVistor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Computer ...");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Mouse ...");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Keyboard ...");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Monitor ...");
    }
}
