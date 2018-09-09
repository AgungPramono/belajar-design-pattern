/*
 *  AudioPlayer.java
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
public class AudioPlayer implements MediaPlayer {
    
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        //inbuilt support to play mp3 music files
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Memainkan file mp3. Nama File : "+fileName);
        }
        
        //mediaAdapter is providing support to play other file formats
        else if (audioType.equalsIgnoreCase("vlc")
                || audioType.equalsIgnoreCase("mp4")
                || audioType.equalsIgnoreCase("avi")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        
        else{
            System.out.println("Format file ."+audioType+" tidak didukung");
        }
    }

}
