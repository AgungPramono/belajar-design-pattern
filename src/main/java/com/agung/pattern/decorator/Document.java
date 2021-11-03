package com.agung.pattern.decorator;

public class Document {

    private String document;

    public String getContent() {
        return document;
    }

    public void setContent(String content){
        this.document = content;
    }

    public void save(){
        System.out.println("menyimpan doc :"+document);
    }
}
