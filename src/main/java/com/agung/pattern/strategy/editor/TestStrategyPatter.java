/*
 *  TestStrategyPatter.java
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
public class TestStrategyPatter {

    public static void main(String[] args) {

        String text = "java fundamental";
        TextFormatter formatter = new CapsTextFormatter();
        TextEditor editor = new TextEditor(formatter);
        editor.publish(text);

        formatter = new LowerTextFormatter();
        editor = new TextEditor(formatter);
        editor.publish(text);
    }

}
