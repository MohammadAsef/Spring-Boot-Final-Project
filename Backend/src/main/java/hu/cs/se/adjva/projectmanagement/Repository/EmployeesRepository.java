package hu.cs.se.adjva.projectmanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hu.cs.se.adjva.projectmanagement.model.Employee;

/**
 * EmployeesRepository
 */
@Repository
public interface EmployeesRepository extends JpaRepository<Employee,Integer> {

    
}