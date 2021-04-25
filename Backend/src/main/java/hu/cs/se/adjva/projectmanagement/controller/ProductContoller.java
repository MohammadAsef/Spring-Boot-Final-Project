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

import hu.cs.se.adjva.projectmanagement.model.Product;
import hu.cs.se.adjva.projectmanagement.service.ProdectServices;

/**
 * ProductContoller
 */
@RestController
public class ProductContoller {


   @Autowired
   private ProdectServices productServices;


   
   @GetMapping("/product/all")
   public ResponseEntity<List<Product>> getProducts(){

      List<Product> products = productServices.getAllProducts();
      return new ResponseEntity(products, HttpStatus.OK);
   }

   @PostMapping("/product/add")
   public ResponseEntity<Product> addProduct(@RequestBody Product product){
      Product saveProduct = productServices.addProduct(product);
      return new ResponseEntity(saveProduct , HttpStatus.CREATED) ;
   }

   @GetMapping("/product/{id}")
   public ResponseEntity<Product> getProduct(@PathVariable("id") Integer id){

      Product product = productServices.getProductById(id);

      return new ResponseEntity<>(product , HttpStatus.OK);
   }


   @PutMapping("/product/update")
   public ResponseEntity<Product> updateProduct(@RequestBody Product product){
      Product saveProduct = productServices.addProduct(product);
      return new ResponseEntity<>(saveProduct , HttpStatus.OK) ;
   }


   @DeleteMapping("/product/{id}/delete")
   public ResponseEntity<String> deleteProduct(@PathVariable("id") Integer id){

      productServices.deleteProduct(id);

      return new ResponseEntity<>("The "+id+" Deleted",HttpStatus.OK);

   }






}