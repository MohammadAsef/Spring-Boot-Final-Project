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

import hu.cs.se.adjva.projectmanagement.model.SaleFactor;
import hu.cs.se.adjva.projectmanagement.service.SaleFactor.SaleFactorService;


@RestController
public class SaleFactoryController {
    @Autowired
    private SaleFactorService saleFactorService;

    @GetMapping("/SaleFactor/all")
    public ResponseEntity<List<SaleFactor>> getSaleFactor() {
        List<SaleFactor> getSaleFactor = saleFactorService.getAllSaleFactor();
        return new ResponseEntity<>(getSaleFactor, HttpStatus.OK);
    }


    @PostMapping("/SaleFactor/add")
    public ResponseEntity<SaleFactor> addBuyFactor(@RequestBody SaleFactor saleFactor) {
        SaleFactor saveSaleFactor = saleFactorService.addSaleFactor(saleFactor);
        return new ResponseEntity<>(saveSaleFactor, HttpStatus.CREATED);
    }

    @GetMapping("/SaleFactor/{id}")
    public ResponseEntity<SaleFactor> getBuyFactor(@PathVariable("id") Integer id) {

        SaleFactor saleFactor = saleFactorService.getSaleFactorById(id);

        return new ResponseEntity<>(saleFactor, HttpStatus.OK);
    }

    @PutMapping("/buyFactor/update")
    public ResponseEntity<SaleFactor> updateBuyFactor(@RequestBody SaleFactor saleFactor) {
        SaleFactor saveBuyFactor = saleFactorService.addSaleFactor(saleFactor);
        return new ResponseEntity<>(saveBuyFactor, HttpStatus.OK);
    }

    @DeleteMapping("/buyFactor/{id}/delete")
    public ResponseEntity<String> deleteBuyFactor(@PathVariable("id") Integer id) {

        saleFactorService.deleteSaleFactor(id);

        return new ResponseEntity<>("The " + id + " Deleted", HttpStatus.OK);

    }

}
