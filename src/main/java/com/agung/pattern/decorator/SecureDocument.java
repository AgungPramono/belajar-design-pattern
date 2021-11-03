package com.agung.pattern.decorator;

import javax.print.Doc;

public class SecureDocument {

    private Document document;

    public SecureDocument(Document document){
        this.document=document;
    }

    public void encrypt(){
        String plain = document.getContent();
        String encrypt="123["+plain+"]123";
        document.setContent(encrypt);
        document.save();
    }

    public void decrypt(){
        String encrypt = document.getContent();
        String plain=encrypt.substring(4,encrypt.length()-4);
        document.setContent(plain);
        document.save();
    }
}
