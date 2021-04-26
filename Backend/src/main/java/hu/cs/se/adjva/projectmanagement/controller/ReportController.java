package hu.cs.se.adjva.projectmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import hu.cs.se.adjva.projectmanagement.model.BuyFactor;
import hu.cs.se.adjva.projectmanagement.service.buyFactor.BuyFactorServices;

@RestController
public class ReportController {
    
    @Autowired
    private BuyFactorServices buyFactorServices;

    @GetMapping("/buyFactor/all")
    public ResponseEntity<List<BuyFactor>> getBuyFactors() {

        List<BuyFactor> buyFactors = buyFactorServices.getAllBuyFactor();
        return new ResponseEntity<>(buyFactors, HttpStatus.OK);
    }








    
}
