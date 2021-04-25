package hu.cs.se.adjva.projectmanagement.service.employee;

import java.util.List;

import hu.cs.se.adjva.projectmanagement.model.Employee;

/**
 * EmployeeServices
 */
public interface EmployeeServices {

    List<Employee> getAllEmployees();
    Employee getEmployeeById(Integer id);
    Employee addEmployee(Employee employee);
    void deleteEmployee(Integer id);
    
}