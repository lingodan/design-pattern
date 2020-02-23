package com.lingodan.study.designpattern.structural.bridge.model;

public class RedefinedAbstraction extends Abstraction {
    @Override
    public void operation() {
        // 代码
        implementor.operationImpl();
        // 代码
    }
}
