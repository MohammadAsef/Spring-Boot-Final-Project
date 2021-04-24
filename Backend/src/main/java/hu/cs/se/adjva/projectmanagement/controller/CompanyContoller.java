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

import hu.cs.se.adjva.projectmanagement.model.Company;
import hu.cs.se.adjva.projectmanagement.service.company.Companyservices;

/**
 * CompanyContoller
 */
@Controller
public class CompanyContoller {

    
    @Autowired
    private Companyservices companyservices;


   
   @GetMapping("/company/all")
   public ResponseEntity<List<Company>> getCompanys(){

      List<Company> Companys = companyservices.getAllCompany();
      return new ResponseEntity<>(Companys, HttpStatus.OK);
   }

   @PostMapping("/company/add")
   public ResponseEntity<Company> addCompany(@RequestBody Company Company){
      Company saveCompany = companyservices.addCompany(Company);
      return new ResponseEntity<>(saveCompany , HttpStatus.CREATED) ;
   }

   @GetMapping("/company/{id}")
   public ResponseEntity<Company> getCompany(@PathVariable("id") Integer id){
       
      Company Company = companyservices.getCompanyById(id);
      return new ResponseEntity<>(Company , HttpStatus.OK);
   }


   @PutMapping("/company/update")
   public ResponseEntity<Company> updateCompany(@RequestBody Company Company){
      Company saveCompany = companyservices.addCompany(Company);
      return new ResponseEntity<>(saveCompany , HttpStatus.OK) ;
   }


   @DeleteMapping("/company/{id}/delete")
   public ResponseEntity<String> deleteCompany(@PathVariable("id") Integer id){

      companyservices.deleteCompanyt(id);

      return new ResponseEntity<>("The "+id+" Deleted",HttpStatus.OK);

   }
}