/*
 *  LowerTextFormatter.java
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
public class LowerTextFormatter implements TextFormatter {

    @Override
    public void format(String text) {
        System.out.println("[Lower Text Formater]" + text.toLowerCase());
    }

}
