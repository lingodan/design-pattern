package com.lingodan.study.designpattern.behavioral.template;

/**
 * @author lingodan
 * Created on 2020/6/4 22:46.
 */
public abstract class Game {

    public void initialize() {
    }

    public void startPlay() {
    }

    public void endPlay() {
    }

    public void play() {
        initialize();
        startPlay();
        endPlay();
    }

}
