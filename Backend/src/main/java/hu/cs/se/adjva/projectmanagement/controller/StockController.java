package hu.cs.se.adjva.projectmanagement.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import hu.cs.se.adjva.projectmanagement.model.Stock;
import hu.cs.se.adjva.projectmanagement.service.stock.StockServices;

@RestController
@CrossOrigin(origins = "*")
public class StockController {
    

    @Autowired
   private StockServices stockServices;


   
   @GetMapping("/stock/all")
   public ResponseEntity<List<Stock>> getStocks(){

      List<Stock> stocks = stockServices.getAllStock();
      return new ResponseEntity<>(stocks, HttpStatus.OK);
   }

   @PostMapping("/stock/add")
   public ResponseEntity<Stock> addStock(@RequestBody Stock stock){
    Stock saveStock = stockServices.addStock(stock);
      return new ResponseEntity<>(saveStock , HttpStatus.CREATED) ;
   }

   @GetMapping("/stock/{id}")
   public ResponseEntity<Stock> getStock(@PathVariable("id") Integer id){

    Stock stock = stockServices.getStockById(id);

      return new ResponseEntity<>(stock , HttpStatus.OK);
   }


   @PutMapping("/stock/update")
   public ResponseEntity<Stock> updateStock(@RequestBody Stock stock){
    Stock saveStock = stockServices.addStock(stock);
      return new ResponseEntity<>(saveStock , HttpStatus.OK) ;
   }


   @DeleteMapping("/stock/{id}/delete")
   public ResponseEntity<String> deleteProduct(@PathVariable("id") Integer id){

    stockServices.deleteStock(id);

      return new ResponseEntity<>("The "+id+" Deleted",HttpStatus.OK);

   }
}
