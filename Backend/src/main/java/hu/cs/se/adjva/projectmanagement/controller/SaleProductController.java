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

import hu.cs.se.adjva.projectmanagement.model.SaleProduct;
import hu.cs.se.adjva.projectmanagement.service.saleProduct.SaleProductServices;

@RestController
public class SaleProductController {

    @Autowired
    private SaleProductServices saleProductServices;
 
 
    
    @GetMapping("/saleProduct/all")
    public ResponseEntity<List<SaleProduct>> getSaleProducts(){
 
       List<SaleProduct> SaleProducts = saleProductServices.getAllSaleProducts();
       return new ResponseEntity<>(SaleProducts, HttpStatus.OK);
    }
 
    @PostMapping("/saleProduct/add")
    public ResponseEntity<SaleProduct> addSaleProduct(@RequestBody SaleProduct SaleProduct){
       SaleProduct saveSaleProduct = saleProductServices.addSaleProduct(SaleProduct);
       return new ResponseEntity<>(saveSaleProduct , HttpStatus.CREATED) ;
    }
 
    @GetMapping("/saleProduct/{id}")
    public ResponseEntity<SaleProduct> getSaleProduct(@PathVariable("id") Integer id){
 
       SaleProduct SaleProduct = saleProductServices.getSaleProductById(id);
 
       return new ResponseEntity<>(SaleProduct , HttpStatus.OK);
    }
 
 
    @PutMapping("/saleProduct/update")
    public ResponseEntity<SaleProduct> updateSaleProduct(@RequestBody SaleProduct SaleProduct){
       SaleProduct saveSaleProduct = saleProductServices.addSaleProduct(SaleProduct);
       return new ResponseEntity<>(saveSaleProduct , HttpStatus.OK) ;
    }
 
 
    @DeleteMapping("/saleProduct/{id}/delete")
    public ResponseEntity<String> deleteSaleProduct(@PathVariable("id") Integer id){
 
       saleProductServices.deleteSaleProduct(id);
 
       return new ResponseEntity<>("The "+id+" Deleted",HttpStatus.OK);
 
    }
 
    
}
