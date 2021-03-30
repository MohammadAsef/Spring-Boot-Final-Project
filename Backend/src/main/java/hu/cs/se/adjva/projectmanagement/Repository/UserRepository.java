package hu.cs.se.adjva.projectmanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hu.cs.se.adjva.projectmanagement.model.User;

@Repository
public interface UserRepository extends JpaRepository <User, Integer> {
    
    User findByUsername(String username);
}
