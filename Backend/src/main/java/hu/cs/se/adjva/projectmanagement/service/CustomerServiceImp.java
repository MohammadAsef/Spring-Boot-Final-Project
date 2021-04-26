package hu.cs.se.adjva.projectmanagement.service;

import hu.cs.se.adjva.projectmanagement.Repository.CustomerRepository;
import hu.cs.se.adjva.projectmanagement.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImp implements CustomerServices {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerById(Integer id) {
        return customerRepository.getOne(id);
    }

    @Override
    public Customer addCustomer(Customer prodect) {
        return customerRepository.save(prodect);
    }

    @Override
    public void deleteCustomer(Integer id) {
        customerRepository.deleteById(id);
    }
}
