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

import hu.cs.se.adjva.projectmanagement.model.Employee;
import hu.cs.se.adjva.projectmanagement.service.employee.EmployeeServices;


/**
 * EmployeeController
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeServices employeeServices;
 
 
    
    @GetMapping("/employee/all")
    public ResponseEntity<List<Employee>> getEmployees(){
 
       List<Employee> employees = employeeServices.getAllEmployees();
       return new ResponseEntity<>(employees, HttpStatus.OK);
    }
 
    @PostMapping("/employee/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
       Employee saveEmployee = employeeServices.addEmployee(employee);
       return new ResponseEntity<>(saveEmployee , HttpStatus.CREATED) ;
    }
 
    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable("id") Integer id){
 
       Employee Employee = employeeServices.getEmployeeById(id);
       return new ResponseEntity<>(Employee , HttpStatus.OK);
    }
 
 
    @PutMapping("/employee/update")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee Employee){
       
        Employee saveEmployee = employeeServices.addEmployee(Employee);
        return new ResponseEntity<>(saveEmployee , HttpStatus.OK) ;
    
    }
 
 
    @DeleteMapping("/employee/{id}/delete")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") Integer id){
 
       employeeServices.deleteEmployee(id);
       return new ResponseEntity<>("The "+id+" Deleted",HttpStatus.OK);
 
    }
 

}