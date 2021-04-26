package hu.cs.se.adjva.projectmanagement.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import hu.cs.se.adjva.projectmanagement.Repository.WalletRepository;
import hu.cs.se.adjva.projectmanagement.model.Customer;
import hu.cs.se.adjva.projectmanagement.model.Wallet;
import hu.cs.se.adjva.projectmanagement.service.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<List<Customer>> getCustomers(){

        List<Customer> customers = customerServices.getAllCustomers();
        return new ResponseEntity(customers, HttpStatus.OK);
    }


    @PostMapping("/customer/add")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){



        Customer saveCustomer = customerServices.addCustomer(customer);

        Wallet wallet = walletRepository.save(new Wallet(0,saveCustomer));

        saveCustomer.setWallet(wallet);

        return new ResponseEntity(saveCustomer , HttpStatus.CREATED) ;
    }

    @GetMapping("/customer/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable("id") Integer id){

        Customer customer = customerServices.getCustomerById(id);

        return new ResponseEntity<>(customer , HttpStatus.OK);
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
