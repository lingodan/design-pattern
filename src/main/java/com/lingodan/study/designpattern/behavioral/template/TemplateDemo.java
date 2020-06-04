package com.lingodan.study.designpattern.behavioral.template;

/**
 * @author lingodan
 * Created on 2020/6/4 22:46.
 */
public class TemplateDemo {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }

}
