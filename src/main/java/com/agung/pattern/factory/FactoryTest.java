/*
 * Silahkan digunakan dengan bebas / dimodifikasi
 * Dengan tetap mencantumkan nama @author dan Referensi / Source
 * Terima Kasih atas Kerjasamanya.
 */
package com.agung.pattern.factory;

/**
 *
 * @author Personal
 */
public class FactoryTest {

    public static void main(String[] args) {
        //contoh tanpa factory
        User a = new User("agung");
        a.setUseFile(true);
        User b = new User("dani");
        b.setUseFile(true);

        //contoh dengan menggunakan factory
        User user1 = UserFactory.useCreate("agung");
        User user2 = UserFactory.useCreate("dani");
        //
        System.out.println("Use File");
        System.out.println(user1.getUserName() + ":" + user1.getUseFile());
        System.out.println(user2.getUserName() + ":" + user2.getUseFile());
    }
}
