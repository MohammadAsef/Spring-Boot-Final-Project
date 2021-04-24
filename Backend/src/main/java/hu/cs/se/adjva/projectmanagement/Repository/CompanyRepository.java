package hu.cs.se.adjva.projectmanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hu.cs.se.adjva.projectmanagement.model.Company;

/**
 * CompanyRepository
 */
@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer>{


    
}