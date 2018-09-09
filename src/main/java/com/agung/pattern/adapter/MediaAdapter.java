/*
 *  MediaAdapter.java
 *  Java-Design-Pattern 
 * 
 *  Created by Agung Pramono on 04/11/2017 
 *  Copyright (c) 2017 Java Development. All rights reserved.
 */

package com.agung.pattern.adapter;

/**
 *
 * @author agung
 */
public class MediaAdapter implements MediaPlayer {

    AdvanceMediaPlayer advanceMediaPlayer;
    
    public MediaAdapter(String audioType){
        if (audioType.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer = new VlcPlayer();
        }else if(audioType.equalsIgnoreCase("mp4")){
            advanceMediaPlayer = new Mp4Player();
        }else if(audioType.equalsIgnoreCase("avi")){
            advanceMediaPlayer = new AviPlayer();
        }
    }
    
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer.playVlc(fileName);
        }else if (audioType.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer.playMp4(fileName);
        }else if(audioType.equalsIgnoreCase("avi")){
            advanceMediaPlayer.playAvi(fileName);
        }
    }
}
