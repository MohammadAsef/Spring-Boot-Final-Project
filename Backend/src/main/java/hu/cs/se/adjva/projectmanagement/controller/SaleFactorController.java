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

import hu.cs.se.adjva.projectmanagement.model.SaleFactor;
import hu.cs.se.adjva.projectmanagement.service.saleFactor.SaleFactorServices;

@RestController
@CrossOrigin(origins = "*")
public class SaleFactorController {
    
    @Autowired
    private SaleFactorServices saleFactorServices;

    @GetMapping("/saleFactor/all")
    public ResponseEntity<List<SaleFactor>> getSaleFactors() {

        List<SaleFactor> saleFactors = saleFactorServices.getAllSaleFactor();
        return new ResponseEntity<>(saleFactors, HttpStatus.OK);
    }

    @PostMapping("/saleFactor/add")
    public ResponseEntity<SaleFactor> addSaleFactor(@RequestBody SaleFactor saleFactor) {
        SaleFactor saveSaleFactor = saleFactorServices.addSaleFactor(saleFactor);
        return new ResponseEntity<>(saveSaleFactor, HttpStatus.CREATED);
    }

    @GetMapping("/saleFactor/{id}")
    public ResponseEntity<SaleFactor> getSaleFactor(@PathVariable("id") Integer id) {

        SaleFactor saleFactor = saleFactorServices.getSaleFactorById(id);

        return new ResponseEntity<>(saleFactor, HttpStatus.OK);
    }

    @PutMapping("/saleFactor/update")
    public ResponseEntity<SaleFactor> updateSaleFactor(@RequestBody SaleFactor saleFactor) {
        SaleFactor saveSaleFactor = saleFactorServices.addSaleFactor(saleFactor);
        return new ResponseEntity<>(saveSaleFactor, HttpStatus.OK);
    }

    @DeleteMapping("/saleFactor/{id}/delete")
    public ResponseEntity<String> deleteSaleFactor(@PathVariable("id") Integer id) {

        saleFactorServices.deleteSaleFactor(id);

        return new ResponseEntity<>("The " + id + " Deleted", HttpStatus.OK);

    }
}
