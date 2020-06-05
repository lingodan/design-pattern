package com.lingodan.study.designpattern.behavioral.visitor;

/**
 * @author lingodan
 * Created on 2020/6/5 13:24.
 */
public class Computer implements ComputePart {

    protected ComputePart[] parts;


    public Computer() {
        this.parts = new ComputePart[]{new Mouse(), new Monitor(), new Keyboard()};
    }


    @Override
    public void accept(ComputerPartVistor computerPartVistor) {
        for (ComputePart part : parts) {
            part.accept(computerPartVistor);
        }
        computerPartVistor.visit(this);
    }
}
