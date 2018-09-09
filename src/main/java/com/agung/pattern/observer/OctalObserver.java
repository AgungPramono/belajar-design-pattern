//
// OctalObserver.java
// Java-Design-Pattern 
//
// Created by Agung Pramono on 10/04/2017 
// Copyright (c) 2017 Java Development. All rights reserved.
//

package com.agung.pattern.observer;

/**
 *
 */
public class OctalObserver extends Observer{

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    
    @Override
    public void update() {
        System.out.println("Octal string : "
                + Integer.toOctalString(subject.getState()));
    }

}
