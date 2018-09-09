//
// HexaObserver.java
// Java-Design-Pattern 
//
// Created by Agung Pramono on 10/04/2017 
// Copyright (c) 2017 Java Development. All rights reserved.
//

package com.agung.pattern.observer;

/**
 *
 */
public class HexaObserver extends Observer{

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    
    @Override
    public void update() {
        System.out.println("Hexa string : "+
                Integer.toHexString(subject.getState()));
    }

}
