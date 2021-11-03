package com.agung.pattern.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Document document = new Document();
        document.setContent("ini Content Asli");

        SecureDocument secureDocument = new SecureDocument(document);
        secureDocument.encrypt();

        SecureDocument decrypt = new SecureDocument(document);
        secureDocument.decrypt();
    }
}
