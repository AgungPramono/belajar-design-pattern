/*
 *  CapsTextFormatter.java
 *  Java-Design-Pattern 
 * 
 *  Created by Agung Pramono on 09/09/2018 
 *  Copyright (c) 2018 Java Development. All rights reserved.
 */

package com.agung.pattern.strategy.editor;

/**
 *
 * @author agung
 */
public class CapsTextFormatter implements TextFormatter {

    @Override
    public void format(String text) {
        System.out.println("[Caps Text Formatter ]" + text.toUpperCase());
    }

}
