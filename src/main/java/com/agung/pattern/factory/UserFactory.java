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
public class UserFactory {
    public static User useCreate(String userName){
        User u = new User(userName);
        u.setUseFile(true);
        return u;
    }
}
