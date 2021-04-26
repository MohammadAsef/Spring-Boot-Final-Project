package hu.cs.se.adjva.projectmanagement.controller;

import org.springframework.web.bind.annotation.RestController;

import hu.cs.se.adjva.projectmanagement.model.BuyProduct;
import hu.cs.se.adjva.projectmanagement.service.buyProduct.BuyProductServices;

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

@RestController
public class BuyProductController {

    
   @Autowired
   private BuyProductServices buyProductServices;


   
   @GetMapping("/buyProduct/all")
   public ResponseEntity<List<BuyProduct>> getBuyProducts(){

      List<BuyProduct> BuyProducts = buyProductServices.getAllBuyProducts();
      return new ResponseEntity<>(BuyProducts, HttpStatus.OK);
   }

   @PostMapping("/buyProduct/add")
   public ResponseEntity<BuyProduct> addBuyProduct(@RequestBody BuyProduct buyProduct){
      BuyProduct saveBuyProduct = buyProductServices.addBuyProduct(buyProduct);
      return new ResponseEntity<>(saveBuyProduct , HttpStatus.CREATED) ;
   }

   @GetMapping("/buyProduct/{id}")
   public ResponseEntity<BuyProduct> getBuyProduct(@PathVariable("id") Integer id){

      BuyProduct BuyProduct = buyProductServices.getBuyProductById(id);

      return new ResponseEntity<>(BuyProduct , HttpStatus.OK);
   }


   @PutMapping("/buyProduct/update")
   public ResponseEntity<BuyProduct> updateBuyProduct(@RequestBody BuyProduct BuyProduct){
      BuyProduct saveBuyProduct = buyProductServices.addBuyProduct(BuyProduct);
      return new ResponseEntity<>(saveBuyProduct , HttpStatus.OK) ;
   }


   @DeleteMapping("/buyProduct/{id}/delete")
   public ResponseEntity<String> deleteBuyProduct(@PathVariable("id") Integer id){

      buyProductServices.deleteBuyProduct(id);
      return new ResponseEntity<>("The "+id+" Deleted",HttpStatus.OK);

   }


    
}
