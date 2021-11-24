package com.agung.pattern.facade;

public class CustomerApp {

    public static void main(String[] args) {

        CustomerRepository customerRepository = new CustomerRepository();
        AddressRepository addressRepository = new AddressRepository();

        Customer customer = new Customer("c001", "fuan");

        Address address1 = new Address("jakarta");
        Address address2 = new Address("surabaya");

        customer.getAddresses().add(address2);

        customerRepository.save(customer);
        addressRepository.save(address1);
        addressRepository.save(address2);

        //////////////////

        AkunRepository akunRepository = new AkunRepository();
        Akun akunAsal = akunRepository.findByKode("001");
        Akun akunTujuan = akunRepository.findByKode("002");

        akunRepository.updateSaldo(akunAsal.getSaldo() - 1000000);
        akunRepository.updateSaldo(akunTujuan.getSaldo() + 100000);

    }
}
