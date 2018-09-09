package com.agung.pattern.singleton;

/**
 *
 */
public class SingletonDemo {
    public static void main(String[] args) {
        SingleObject object = SingleObject.getSingleObject();
        object.showMessage();
    }
}
