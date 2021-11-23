package com.agung.pattern.singleton;

public class ProductService {

    public void save(String kode,String nama){
//        Connection connection = new Connection();
        Connection connection = ConnectionHelper.getConnection();
        connection.sql("INSERT INTO PRODUCT....");
    }

}
