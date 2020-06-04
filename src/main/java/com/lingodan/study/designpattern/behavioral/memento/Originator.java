package com.lingodan.study.designpattern.behavioral.memento;

/**
 * @author lingodan
 * Created on 2020/6/4 22:34.
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    public Memento saveStateToMemento(){
        return new Memento(this.state);
    }

    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }

}
