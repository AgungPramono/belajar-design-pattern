package com.agung.pattern.facade;

public class CustomerDemo {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("fuan");
        customer.setKode("001");

        Address address = new Address();
        address.setAddress("jakarta");

        AddressDao addressDao = new AddressDao();
        addressDao.save(address);

        customer.getAddresses().add(address);
        CustomerDao customerDao = new CustomerDao();
        customerDao.save(customer);


    }
}
