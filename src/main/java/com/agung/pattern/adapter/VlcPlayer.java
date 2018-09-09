/*
 *  VLCPlayer.java
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
public class VlcPlayer implements AdvanceMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Memainkan file vlc. Nama File : " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //lakukan sesuatu
        System.out.println("Memainkan file mp4. Nama File : " + fileName);
    }

    @Override
    public void playAvi(String fileName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
