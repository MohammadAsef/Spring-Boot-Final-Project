package hu.cs.se.adjva.projectmanagement.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import hu.cs.se.adjva.projectmanagement.Repository.WalletRepository;
import hu.cs.se.adjva.projectmanagement.dto.CustomerDTO;
import hu.cs.se.adjva.projectmanagement.model.Customer;
import hu.cs.se.adjva.projectmanagement.model.Wallet;
import hu.cs.se.adjva.projectmanagement.service.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

// for testing
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CustomerController {


    @Autowired
    private CustomerServices customerServices;

    @Autowired
    private WalletRepository walletRepository;

    @GetMapping("/customer/all")
    public ResponseEntity<List<CustomerDTO>> getCustomers(){

        List<Customer> customers = customerServices.getAllCustomers();
        List<CustomerDTO> customerDTOList = new ArrayList<>();
        for(Customer customer: customers){
            CustomerDTO customerDTO = new CustomerDTO();
            customerDTO.setId(customer.getId());
            customerDTO.setEmail(customer.getEmail());
            customerDTO.setName(customer.getName());
            customerDTO.setPhone(customer.getPhone());
            customerDTOList.add(customerDTO);
        }
        return new ResponseEntity(customerDTOList, HttpStatus.OK);
    }


    @PostMapping("/customer/add")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){



        Customer saveCustomer = customerServices.addCustomer(customer);

        // Wallet wallet = walletRepository.save(new Wallet(0,saveCustomer));

        // saveCustomer.setWallet(wallet);

        return new ResponseEntity(saveCustomer , HttpStatus.CREATED) ;
    }

    @GetMapping("/customer/{id}")
    public ResponseEntity<CustomerDTO> getCustomer(@PathVariable("id") Integer id){

        Customer customer = customerServices.getCustomerById(id);
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setEmail(customer.getEmail());
        customerDTO.setId(customer.getId());
        customerDTO.setName(customer.getName());
        customerDTO.setPhone(customer.getPhone());
        return new ResponseEntity<>(customerDTO , HttpStatus.OK);
    }


    @PutMapping("/customer/update")
    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer){
        Customer saveCustomer = customerServices.addCustomer(customer);
        return new ResponseEntity<>(saveCustomer , HttpStatus.OK) ;
    }


    @DeleteMapping("/customer/{id}/delete")
    public ResponseEntity<String> deleteCustomer(@PathVariable("id") Integer id){

        customerServices.deleteCustomer(id);

        return new ResponseEntity<>("The "+id+" Deleted",HttpStatus.OK);

    }



}
