package hu.cs.se.adjva.projectmanagement.service;

import hu.cs.se.adjva.projectmanagement.model.Customer;
// import org.springframework.stereotype.Service;

import java.util.List;

public interface CustomerServices {
    List<Customer> getAllCustomers();

    Customer getCustomerById(Integer id);

    Customer addCustomer(Customer customer);

    void deleteCustomer(Integer id);

}
