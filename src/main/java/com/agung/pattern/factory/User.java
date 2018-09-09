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
public class User {
    public String userName;
    public boolean useFile;
    
    public User(String userName)
    {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isUseFile() {
        return useFile;
    }

    public void setUseFile(boolean useFile) {
        this.useFile = useFile;
    }
    
    public boolean getUseFile(){
        return useFile;
    }
}
