/*
 *  StaticMethod.java
 *  Java-Design-Pattern 
 * 
 *  Created by Agung Pramono on 10/09/2018 
 *  Copyright (c) 2018 Java Development. All rights reserved.
 */

package com.agung.pattern;

/**
 *
 * @author agung
 */
public class StaticMethod {

    private static int a = 10;
    private static final Integer CONSTAN = 100;

    public static void main(String[] args) {
        a += 10;
        System.out.println(a);

        a += 10;
        System.out.println(a);

    }

}
