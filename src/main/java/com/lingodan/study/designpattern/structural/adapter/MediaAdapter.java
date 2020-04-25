package com.lingodan.study.designpattern.structural.adapter;

public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")){
            this.advancedMediaPlayer = new VlcPlayer();
        }else if(audioType.equalsIgnoreCase("mp4")){
            this.advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            this.advancedMediaPlayer.playVlc("VLC is good");
        }

        if(audioType.equalsIgnoreCase("mp4")){
            this.advancedMediaPlayer.playMp4("Mp4 is also good");
        }


    }
}
