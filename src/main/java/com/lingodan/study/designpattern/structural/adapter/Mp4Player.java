package com.lingodan.study.designpattern.structural.adapter;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
//        nothing to do
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file,FileName:" + fileName);
    }
}
