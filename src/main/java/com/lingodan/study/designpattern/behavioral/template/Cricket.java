package com.lingodan.study.designpattern.behavioral.template;

/**
 * @author lingodan
 * Created on 2020/6/4 22:48.
 */
public class Cricket extends Game {

    @Override
    public void initialize() {
        System.out.println("Cricket Game Finished");
    }

    @Override
    public void startPlay() {
        System.out.println("Cricket Game Initialize! Start playing.");
    }

    @Override
    public void endPlay() {
        System.out.println("Cricket Game Started.Enjoy the game!");
    }
}
