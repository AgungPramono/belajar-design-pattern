/*
 *  FeedBackXmlParser.java
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
public class FeedBackXmlParser implements XmlParser {

    @Override
    public String parse() {
        System.out.println("Parsing Message Xml");
        return "FeedBack Xml Message";
    }

}
