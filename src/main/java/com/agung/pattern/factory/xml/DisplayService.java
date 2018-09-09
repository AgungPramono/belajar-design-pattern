/*
 *  DisplayService.java
 *  Java-Design-Pattern 
 * 
 *  Created by Agung Pramono on 09/09/2018 
 *  Copyright (c) 2018 Java Development. All rights reserved.
 */

package com.agung.pattern.factory.xml;

/**
 *
 * @author agung
 */
public abstract class DisplayService {

    public void display() {
        XmlParser parser = getParser();
        String msg = parser.parse();
        System.out.println(msg);
    }

    protected abstract XmlParser getParser();
}
