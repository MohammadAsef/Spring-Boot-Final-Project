package hu.cs.se.adjva.projectmanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hu.cs.se.adjva.projectmanagement.model.SaleFactor;

public interface SaleFactorRepository extends JpaRepository <SaleFactor, Integer> {
    
}
