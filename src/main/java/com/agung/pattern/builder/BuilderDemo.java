/*
 *  BuilderDemo.java
 *  Java-Design-Pattern 
 * 
 *  Created by Agung Pramono on 09/09/2018 
 *  Copyright (c) 2018 Java Development. All rights reserved.
 */

package com.agung.pattern.builder;

/**
 *
 * @author agung
 */
public class BuilderDemo {

    public static void main(String[] args) {
        Form form = new Form.FormBuilder()
                .url("localhost:8080/data")
                .username("agung")
                .password("agung123")
                .port("8080")
                .build();

        System.out.println(form);

    }

}
