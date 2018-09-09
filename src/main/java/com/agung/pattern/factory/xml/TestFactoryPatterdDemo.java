/*
 *  TestFactoryPatterdDemo.java
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
public class TestFactoryPatterdDemo {

    public static void main(String[] args) {
        DisplayService service = new ErrorXmlDisplayService();
        service.display();

        service = new FeedBackXmlDisplayService();
        service.display();

        service = new OrderXmlDisplayService();
        service.display();

    }
}
