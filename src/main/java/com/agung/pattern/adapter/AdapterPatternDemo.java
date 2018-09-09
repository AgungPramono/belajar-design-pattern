/*
 *  AdapterPatternDemo.java
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
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        
        audioPlayer.play("mp3", "Menghapus Jejakmu.mp3");
        audioPlayer.play("mp4", "Titanic.mp4");
        audioPlayer.play("vlc", "away.vlc");
        audioPlayer.play("avi", "Up.avi");
    }
}
