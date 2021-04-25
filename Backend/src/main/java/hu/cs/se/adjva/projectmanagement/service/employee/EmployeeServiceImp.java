package hu.cs.se.adjva.projectmanagement.service.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.cs.se.adjva.projectmanagement.Repository.EmployeesRepository;
import hu.cs.se.adjva.projectmanagement.model.Employee;

@Service
public class EmployeeServiceImp implements EmployeeServices{

    @Autowired
    private EmployeesRepository employeeRespository;



    @Override
    public List<Employee> getAllEmployees() {
        return employeeRespository.findAll();
    }

    @Override
    public Employee getEmployeeById(Integer id) {
       
        return employeeRespository.getOne(id);
    }

    @Override
    public Employee addEmployee(Employee employee) {
        
        return employeeRespository.save(employee);
    }

    @Override
    public void deleteEmployee(Integer id) {
        employeeRespository.deleteById(id);
        
    }


    
}
