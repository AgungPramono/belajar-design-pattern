/*
 *  Rectangel.java
 *  Java-Design-Pattern 
 * 
 *  Created by Agung Pramono on 04/11/2017 
 *  Copyright (c) 2017 Java Development. All rights reserved.
 */

package com.agung.pattern.factory.shape;

/**
 *
 * @author agung
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Menjalankan Metode draw(): Rectangle");
    }

}
