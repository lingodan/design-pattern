package com.lingodan.study.designpattern.behavioral.template;

/**
 * @author lingodan
 * Created on 2020/6/4 22:50.
 */
public class Football extends Game {

    @Override
    public void initialize() {
        System.out.println("Football Game Finished");
    }

    @Override
    public void startPlay() {
        System.out.println("Football Game Initialize! Start playing.");
    }

    @Override
    public void endPlay() {
        System.out.println("Football Game Started.Enjoy the game!");
    }
}
