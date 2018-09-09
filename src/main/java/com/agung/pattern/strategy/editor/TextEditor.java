/*
 *  TextEditor.java
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
public class TextEditor {

    private TextFormatter textFormatter;

    public TextEditor(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    public void publish(String text) {
        textFormatter.format(text);
    }


}
