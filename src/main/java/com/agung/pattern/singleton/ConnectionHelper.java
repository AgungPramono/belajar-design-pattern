package com.agung.pattern.singleton;

public class ConnectionHelper {
    private static Connection connection;

    public static Connection getConnection(){
        if (connection == null){
            connection = new Connection();
        }
        return connection;
    }

}
