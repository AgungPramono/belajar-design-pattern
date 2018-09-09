//
// ObserverDemo.java
// Java-Design-Pattern 
//
// Created by Agung Pramono on 10/04/2017 
// Copyright (c) 2017 Java Development. All rights reserved.
//

package com.agung.pattern.observer;

/**
 *
 */
public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
        
        System.out.println("First state change : 15");
        subject.setState(15);
        System.out.println("Second state change : 10");
        subject.setState(10);
    }
}
