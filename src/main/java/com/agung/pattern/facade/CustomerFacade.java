package com.agung.pattern.facade;

public class CustomerFacade {

    CustomerRepository customerRepository = new CustomerRepository();
    AddressRepository addressRepository = new AddressRepository();

    public void saveCustomer(Customer customer){
        customerRepository.save(customer);

        for (Address address:customer.getAddresses()){
            addressRepository.save(address);
        }
    }
}
