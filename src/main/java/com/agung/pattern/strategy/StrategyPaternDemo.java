//
// StrategyPaternDemo.java
// Java-Design-Patern 
//
// Created by Agung Pramono on 10/04/2017 
// Copyright (c) 2017 Java Development. All rights reserved.
//

package com.agung.pattern.strategy;

/**
 *
 */
public class StrategyPaternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = "+context.executeStrategy(10, 5));
        
        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = "+context.executeStrategy(10, 5));
        
        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = "+context.executeStrategy(10, 5));
    }
}
