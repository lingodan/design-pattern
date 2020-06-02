package com.lingodan.study.designpattern.behavioral.iterator;

/**
 * 定义容器，该容器具备返回迭代器的功能
 *
 * @author lingodan
 * Created on 2020/6/2 22:44.
 */
public interface Container {

    /*
    返回迭代器
     */
    public Iterator getIterator();
}
