//
// Context.java
// Java-Design-Patern 
//
// Created by Agung Pramono on 10/04/2017 
// Copyright (c) 2017 Java Development. All rights reserved.
//

package com.agung.pattern.strategy;

/**
 *
 */
public class Context {
    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    
    public Integer executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
