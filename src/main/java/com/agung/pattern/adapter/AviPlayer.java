/*
 *  AviPlayer.java
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
public class AviPlayer implements AdvanceMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        // do nothing
    }

    @Override
    public void playMp4(String fileName) {
        // do nothing
    }

    @Override
    public void playAvi(String fileName) {
        System.out.println("Memainkan file .avi. Nama File : "+fileName);
    }

}
