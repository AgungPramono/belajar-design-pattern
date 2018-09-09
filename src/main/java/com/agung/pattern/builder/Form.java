/*
 *  Form.java
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
public class Form {

    private String url;
    private String username;
    private String password;
    private String port;

    public static class FormBuilder {

        private String url;
        private String username;
        private String password;
        private String port;

//        public FormBuilder(String email, String password) {
//            this.email = email;
//            this.password = password;
//        }
        public FormBuilder url(String url) {
            this.url = url;
            return this;
        }

        public FormBuilder username(String username) {
            this.username = username;
            return this;
        }

        public FormBuilder password(String password) {
            this.password = password;
            return this;
        }

        public FormBuilder port(String port) {
            this.port = port;
            return this;
        }

        public Form build() {
            return new Form(this);
        }
    }

    private Form(FormBuilder formBuilder) {
        this.url = formBuilder.url;
        this.username = formBuilder.username;
        this.password = formBuilder.password;
        this.port = formBuilder.port;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("URL :");
        sb.append(url);
        sb.append("\nUsername : ");
        sb.append(username);
        sb.append("\nPassword : ");
        sb.append(password);
        sb.append("\nPort :");
        sb.append(port);

        return sb.toString();
    }

}
