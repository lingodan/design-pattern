package com.lingodan.study.designpattern.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lingodan
 * Created on 2020/6/4 22:36.
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento) {
        this.mementoList.add(memento);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }

}
