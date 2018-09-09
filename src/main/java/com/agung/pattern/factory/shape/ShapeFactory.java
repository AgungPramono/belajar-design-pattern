/*
 *  ShapeFactory.java
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
public class ShapeFactory {

    public Shape getShape(String shape){
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }else if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
