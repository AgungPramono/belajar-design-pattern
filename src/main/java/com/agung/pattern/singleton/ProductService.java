package com.agung.pattern.singleton;

import com.agung.pattern.flyweight.DatabasePool;

public class ProductService {

    public void save(String kode,String nama){
//        Connection connection = new Connection();
//        Connection connection = ConnectionHelper.getConnection();
        Connection connection = DatabasePool.getConnection();
        connection.sql("INSERT INTO PRODUCT....");
        DatabasePool.disconnect(connection);
    }

}

