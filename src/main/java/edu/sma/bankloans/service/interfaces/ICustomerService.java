package edu.sma.bankloans.service.interfaces;

import edu.sma.bankloans.model.Customer;

import java.util.List;

public interface ICustomerService {
    Customer create(Customer customer);
    Customer update(Customer customer);
    Customer get(String id);
    void delete(String id);
    List<Customer> getAll();

}
