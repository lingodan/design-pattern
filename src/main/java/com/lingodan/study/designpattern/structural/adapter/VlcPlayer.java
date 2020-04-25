package com.lingodan.study.designpattern.structural.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file , fileName:" + fileName);
    }

    @Override
    public void playMp4(String fileName) {
//        Nothing to do
    }
}
