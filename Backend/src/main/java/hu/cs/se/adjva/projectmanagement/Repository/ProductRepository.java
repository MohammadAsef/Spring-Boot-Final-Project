package hu.cs.se.adjva.projectmanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hu.cs.se.adjva.projectmanagement.model.Product;

/**
 * ProductRepository
 */
@Repository
public interface ProductRepository extends JpaRepository<Product , Integer> {
 
}
