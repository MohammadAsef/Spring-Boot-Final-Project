package hu.cs.se.adjva.projectmanagement.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import hu.cs.se.adjva.projectmanagement.model.ProductStore;
import hu.cs.se.adjva.projectmanagement.service.productStore.ProductStoreServices;

@RestController
public class ProductStoreController {
    
   @Autowired
   private ProductStoreServices productStoreServices;


   
   @GetMapping("/productStore/all")
   public ResponseEntity<List<ProductStore>> getProductStores(){

      List<ProductStore> ProductStores = productStoreServices.getAllProductStores();
      return new ResponseEntity<>(ProductStores, HttpStatus.OK);
   }

   @PostMapping("/productStore/add")
   public ResponseEntity<ProductStore> addProductStore(@RequestBody ProductStore productStore){
      ProductStore saveProductStore = productStoreServices.addProductStore(productStore);
      return new ResponseEntity<>(saveProductStore , HttpStatus.CREATED) ;
   }

   @GetMapping("/productStore/{id}")
   public ResponseEntity<ProductStore> getProductStore(@PathVariable("id") Integer id){

      ProductStore ProductStore = productStoreServices.getProductStoreById(id);

      return new ResponseEntity<>(ProductStore , HttpStatus.OK);
   }


   @PutMapping("/productStore/update")
   public ResponseEntity<ProductStore> updateProductStore(@RequestBody ProductStore ProductStore){
      ProductStore saveProductStore = productStoreServices.addProductStore(ProductStore);
      return new ResponseEntity<>(saveProductStore , HttpStatus.OK) ;
   }


   @DeleteMapping("/productStore/{id}/delete")
   public ResponseEntity<String> deleteProductStore(@PathVariable("id") Integer id){

      productStoreServices.deleteProductStore(id);
      return new ResponseEntity<>("The "+id+" Deleted",HttpStatus.OK);

   }

}
