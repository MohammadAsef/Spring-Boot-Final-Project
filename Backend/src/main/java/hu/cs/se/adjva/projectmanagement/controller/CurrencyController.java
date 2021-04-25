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

import hu.cs.se.adjva.projectmanagement.model.Currency;
import hu.cs.se.adjva.projectmanagement.service.currency.CurrencySevices;

/**
 * CurrencyController
 */
@Controller
public class CurrencyController {

    
   @Autowired
   private CurrencySevices currencySevices;


   
   @GetMapping("/currency/all")
   public ResponseEntity<List<Currency>> getCurrencys(){

      List<Currency> Currencys = currencySevices.getAllCurrencys();
      return new ResponseEntity<>(Currencys, HttpStatus.OK);
   }

   @PostMapping("/currency/add")
   public ResponseEntity<Currency> addCurrency(@RequestBody Currency Currency){
      Currency saveCurrency = currencySevices.addCurrency(Currency);
      return new ResponseEntity<>(saveCurrency , HttpStatus.CREATED) ;
   }

   @GetMapping("/currency/{id}")
   public ResponseEntity<Currency> getCurrency(@PathVariable("id") Integer id){

      Currency Currency = currencySevices.getCurrencyById(id);

      return new ResponseEntity<>(Currency , HttpStatus.OK);
   }


   @PutMapping("/currency/update")
   public ResponseEntity<Currency> updateCurrency(@RequestBody Currency Currency){
      Currency saveCurrency = currencySevices.addCurrency(Currency);
      return new ResponseEntity<>(saveCurrency , HttpStatus.OK) ;
   }


   @DeleteMapping("/currency/{id}/delete")
   public ResponseEntity<String> deleteCurrency(@PathVariable("id") Integer id){

      currencySevices.deleteCurrency(id);

      return new ResponseEntity<>("The "+id+" Deleted",HttpStatus.OK);

   }



    
}