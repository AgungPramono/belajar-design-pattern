package com.agung.pattern.builder;

public class DemoCustomer {
    public static void main(String[] args) {
        Customer customer1 = new Customer("001","agung",23,"sidoarjo");

        CustomerBuilder customer2 = new CustomerBuilder.builder()
                .address("nganjuk")
                .name("agung")
                .build();

        CustomerBuilder customer3 = new CustomerBuilder.builder()
                .address("nganjuk")
                .name("agung")
                .id("123")
                .build();

        CustomerBuilder customer4 = new CustomerBuilder.builder()
                .address("nganjuk")
                .build();
    }
}
