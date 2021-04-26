package hu.cs.se.adjva.projectmanagement.controller;

import org.springframework.web.bind.annotation.RestController;

import hu.cs.se.adjva.projectmanagement.DTO.BuyProductDTO;
import hu.cs.se.adjva.projectmanagement.model.BuyProduct;
import hu.cs.se.adjva.projectmanagement.service.buyProduct.BuyProductServices;
import hu.cs.se.adjva.projectmanagement.service.product.ProdectServices;

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


   @Autowired 
   private ProdectServices productService;


   


   
   @GetMapping("/buyProduct/all")
   public ResponseEntity<List<BuyProductDTO>> getBuyProducts(){

      List<BuyProduct> buyProducts = buyProductServices.getAllBuyProducts();
      List<BuyProductDTO> buyProductDTOs = buyProductServices.convartToDTO(buyProducts);
      return new ResponseEntity<>(buyProductDTOs, HttpStatus.OK);
   }

   @PostMapping("/buyProduct/add")
   public ResponseEntity<BuyProductDTO> addBuyProduct(@RequestBody BuyProduct buyProduct){
      buyProduct.setProduct(productService.getProductById(16));
      BuyProduct saveBuyProduct = buyProductServices.addBuyProduct(buyProduct);
      BuyProductDTO buyProductDTO = buyProductServices.convartToDTO(saveBuyProduct);

      return new ResponseEntity<>(buyProductDTO , HttpStatus.CREATED) ;
   }

   @GetMapping("/buyProduct/{id}")
   public ResponseEntity<BuyProduct> getBuyProduct(@PathVariable("id") Integer id){
      BuyProduct BuyProduct = buyProductServices.getBuyProductById(id);
      return new ResponseEntity<>(BuyProduct , HttpStatus.OK);
   }


   @PutMapping("/buyProduct/update")
   public ResponseEntity<BuyProduct> updateBuyProduct(@RequestBody BuyProduct BuyProduct){
      BuyProduct saveBuyProduct = buyProductServices.addBuyProduct(BuyProduct);
      return new ResponseEntity<>(saveBuyProduct , HttpStatus.OK);
   }


   @DeleteMapping("/buyProduct/{id}/delete")
   public ResponseEntity<String> deleteBuyProduct(@PathVariable("id") Integer id){

      buyProductServices.deleteBuyProduct(id);
      return new ResponseEntity<>("The "+id+" Deleted",HttpStatus.OK);

   }


    
}
