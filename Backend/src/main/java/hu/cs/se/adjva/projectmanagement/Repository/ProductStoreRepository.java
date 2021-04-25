package hu.cs.se.adjva.projectmanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hu.cs.se.adjva.projectmanagement.model.ProductStore;

/**
 * ProductStoreRepository
 */
@Repository
public interface ProductStoreRepository extends JpaRepository<ProductStore,Integer> {

    
}