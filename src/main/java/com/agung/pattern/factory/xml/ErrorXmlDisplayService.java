/*
 *  ErrorXmlDisplayService.java
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
public class ErrorXmlDisplayService extends DisplayService {

    @Override
    protected XmlParser getParser() {
        return new ErrorXmlParser();
    }

}
