package com.lingodan.study.designpattern.behavioral.visitor;

/**
 * @author lingodan
 * Created on 2020/6/5 13:24.
 */
public interface ComputePart {
    void accept(ComputerPartVistor computerPartVistor);
}
