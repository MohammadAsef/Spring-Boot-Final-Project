package hu.cs.se.adjva.projectmanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hu.cs.se.adjva.projectmanagement.model.Employee;

/**
 * EmployeeRespository
 */
public interface EmployeeRespository extends JpaRepository<Employee, Integer> {

    
}