//
// SingleObject.java
// Java-Design-Patern 
//
// Created by Agung Pramono on 10/04/2017 
// Copyright (c) 2017 Java Development. All rights reserved.
//

package com.agung.pattern.singleton;

/**
 *
 */
public class SingleObject {
    
    private static final SingleObject instance = new SingleObject();
    
    private SingleObject(){}
    
    public static SingleObject getSingleObject(){
        return instance;
    }
    
    public void showMessage(){
        System.out.println("Hello World");
    }
}
