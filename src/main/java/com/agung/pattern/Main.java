//
// Main.java
// Java-Design-Patern 
//
// Created by Agung Pramono on 10/04/2017 
// Copyright (c) 2017 Java Development. All rights reserved.
//
package com.agung.pattern;

/**
 *
 */
public class Main {

    public static void useStringClass() {
        for (int i = 0; i < 100; i++) {
            String nama = "agung";
            System.out.println(nama);
        }
    }

    public static void useStringBuffer() {
        StringBuilder sb = new StringBuilder("Agung");
        for (int i = 0; i < 100; i++) {
            sb.append(" Pramono");
            System.out.println("Capacity : "+sb.capacity());
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        useStringBuffer();
        //useStringClass();
    }
}
