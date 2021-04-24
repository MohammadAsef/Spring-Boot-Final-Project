package hu.cs.se.adjva.projectmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import hu.cs.se.adjva.projectmanagement.model.Store;
import hu.cs.se.adjva.projectmanagement.service.store.StoreServices;

/**
 * StoreController
 */
@Controller
public class StoreController {

    @Autowired
    private StoreServices storeServices;



    @GetMapping("/store/all")
    public ResponseEntity<List<Store>> getAllStore(){

        List<Store> getAllStore = storeServices.getAllStore();
        return new ResponseEntity<>(getAllStore,HttpStatus.OK);

    }

    @GetMapping("/store/{id}")
    public ResponseEntity<Store> getStoreById(@PathVariable("id") Integer id){

        Store getStoreById = storeServices.getStoreById(id);
        return new ResponseEntity<>(getStoreById, HttpStatus.OK);

    }


    @PostMapping("/store/add")
    public ResponseEntity<Store> addStore(@RequestBody Store store){

        Store addsStore = storeServices.addStore(store);
        return new ResponseEntity<>(addsStore, HttpStatus.CREATED);
    }



    @PutMapping("/store/update")
    public ResponseEntity<Store> updateStore(@RequestBody Store store){

        Store updateStore = storeServices.addStore(store);
        return new ResponseEntity<>(updateStore,HttpStatus.OK);
    }


    @DeleteMapping("/store/{id}/delete")
    public ResponseEntity<String> deleteStore(@PathVariable("id") Integer id){

        storeServices.deleteStore(id);
        return new ResponseEntity<>("The "+id+" Deleted",HttpStatus.OK);

    } 
    
}