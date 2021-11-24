package com.agung.pattern.flyweight;

import com.agung.pattern.singleton.Connection;

import java.util.ArrayList;
import java.util.List;

public class DatabasePool {
    private static List<Connection> pool = new ArrayList<>();

    static {
        for (int i=0; i<=0; i++){
            Connection connection = new Connection("localhost","root","root");
            pool.add(connection);
        }
    }

    public static Connection getConnection(){
        if (pool.isEmpty()){
            throw new RuntimeException("database pool kosong");
        }else{
            Connection connection = pool.remove(0);
            return connection;
        }
    }

    public static void disconnect(Connection connection){
        if (connection !=  null){
            pool.add(connection);
        }
    }

}
