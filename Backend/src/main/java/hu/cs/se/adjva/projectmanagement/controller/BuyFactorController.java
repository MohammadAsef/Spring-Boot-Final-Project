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

import hu.cs.se.adjva.projectmanagement.dto.BuyFactorDTO;
import hu.cs.se.adjva.projectmanagement.model.BuyFactor;
import hu.cs.se.adjva.projectmanagement.service.buyFactor.BuyFactorServices;

@RestController
@CrossOrigin(origins = "*")
public class BuyFactorController {

    @Autowired
    private BuyFactorServices buyFactorServices;

    @GetMapping("/buyFactor/all")
    public ResponseEntity<List<BuyFactorDTO>> getBuyFactors() {

        List<BuyFactor> buyFactors = buyFactorServices.getAllBuyFactor();
        List<BuyFactorDTO> buyFactorDTOs = buyFactorServices.convertToDTO(buyFactors);
        return new ResponseEntity<>(buyFactorDTOs, HttpStatus.OK);
    }

    @PostMapping("/buyFactor/add")
    public ResponseEntity<BuyFactor> addBuyFactor(@RequestBody BuyFactor buyFactor) {
        BuyFactor saveBuyFactor = buyFactorServices.addBuyFactor(buyFactor);
        return new ResponseEntity<>(saveBuyFactor, HttpStatus.CREATED);
    }

    @GetMapping("/buyFactor/{id}")
    public ResponseEntity<BuyFactorDTO> getBuyFactor(@PathVariable("id") Integer id) {

        BuyFactor buyFactor = buyFactorServices.getBuyFactorById(id);

        BuyFactorDTO buyFactorDTO = buyFactorServices.convertToDTO(buyFactor);

        return new ResponseEntity<>(buyFactorDTO, HttpStatus.OK);
    }

    @PutMapping("/buyFactor/update")
    public ResponseEntity<BuyFactor> updateBuyFactor(@RequestBody BuyFactor buyFactor) {
        BuyFactor saveBuyFactor = buyFactorServices.addBuyFactor(buyFactor);
        return new ResponseEntity<>(saveBuyFactor, HttpStatus.OK);
    }

    @DeleteMapping("/buyFactor/{id}/delete")
    public ResponseEntity<String> deleteBuyFactor(@PathVariable("id") Integer id) {

        buyFactorServices.deleteBuyFactor(id);

        return new ResponseEntity<>("The " + id + " Deleted", HttpStatus.OK);

    }

}
