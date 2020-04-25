package com.lingodan.study.designpattern.structural.adapter;

public class ClientDemo {
    public static void main(String[] args) {

       AudioPlayer audioPlayer = new AudioPlayer();
       audioPlayer.play("mp3","Hello mp3");
       audioPlayer.play("mp4","Hello mp4");
       audioPlayer.play("mp5","Hello mp5");
       audioPlayer.play("vlc","Hello vlc");

    }
}
