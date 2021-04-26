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

import hu.cs.se.adjva.projectmanagement.DTO.SaleProductDTO;
import hu.cs.se.adjva.projectmanagement.model.SaleProduct;
import hu.cs.se.adjva.projectmanagement.service.product.ProdectServices;
import hu.cs.se.adjva.projectmanagement.service.saleProduct.SaleProductServices;

@RestController
public class SaleProductController {

    
   @Autowired
   private SaleProductServices saleProductServices;

   @Autowired
   private ProdectServices productService;


   
   @GetMapping("/saleProduct/all")
   public ResponseEntity<List<SaleProductDTO>> getSaleProducts(){

      List<SaleProduct> saleProducts = saleProductServices.getAllSaleProducts();
      List<SaleProductDTO> saleProductDTOs = saleProductServices.convatToDTO(saleProducts);
      
      return new ResponseEntity<>(saleProductDTOs, HttpStatus.OK);
   }

   @PostMapping("/saleProduct/add")
   public ResponseEntity<SaleProductDTO> addSaleProduct(@RequestBody SaleProduct saleProduct){

    saleProduct.setProduct(productService.getProductById(4));
    SaleProduct saveSaleProduct = saleProductServices.addSaleProduct(saleProduct);
    SaleProductDTO saleProductDTO = saleProductServices.convartToDTO(saveSaleProduct);
    return new ResponseEntity<>(saleProductDTO , HttpStatus.CREATED) ;
   
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
