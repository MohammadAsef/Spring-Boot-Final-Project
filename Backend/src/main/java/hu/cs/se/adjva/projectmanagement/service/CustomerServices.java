package hu.cs.se.adjva.projectmanagement.service;

import hu.cs.se.adjva.projectmanagement.model.Customer;

import java.util.List;

public interface CustomerServices {
    List<Customer> getAllCustomers();

    Customer getCustomerById(Integer id);

    Customer addCustomer(Customer prodect);

    void deleteCustomer(Integer id);

}
