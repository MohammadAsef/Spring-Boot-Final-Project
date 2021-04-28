package hu.cs.se.adjva.projectmanagement.Repository;

import hu.cs.se.adjva.projectmanagement.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
