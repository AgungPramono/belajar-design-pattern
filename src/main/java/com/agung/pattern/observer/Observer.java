//
// Observer.java
// Java-Design-Pattern 
//
// Created by Agung Pramono on 10/04/2017 
// Copyright (c) 2017 Java Development. All rights reserved.
//

package com.agung.pattern.observer;

/**
 *
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
