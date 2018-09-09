//
// Subject.java
// Java-Design-Pattern 
//
// Created by Agung Pramono on 10/04/2017 
// Copyright (c) 2017 Java Development. All rights reserved.
//

package com.agung.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Subject {
    
    private final List<Observer> observers = new ArrayList<>();
    private Integer state;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
        notifyAllObservers();
    }
    
    public void attach(Observer observer){
        observers.add(observer);
    }

    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
    
    
}
