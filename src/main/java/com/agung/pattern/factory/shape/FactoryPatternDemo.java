/*
 *  FactoryPatternDemo.java
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
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        
        
        Shape s1 = shapeFactory.getShape("CIRCLE");
        s1.draw();
        
        Shape s2 = shapeFactory.getShape("RECTANGLE");
        s2.draw();
        
        Shape s3 = shapeFactory.getShape("SQUARE");
        s3.draw();
    }
}
