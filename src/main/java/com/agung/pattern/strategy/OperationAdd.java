//
// OperationAdd.java
// Java-Design-Patern 
//
// Created by Agung Pramono on 10/04/2017 
// Copyright (c) 2017 Java Development. All rights reserved.
//
package com.agung.pattern.strategy;

/**
 *
 */
public class OperationAdd implements Strategy {

    public Integer doOperation(int num1, int num2) {
        return num1 + num2;
    }
    
}
