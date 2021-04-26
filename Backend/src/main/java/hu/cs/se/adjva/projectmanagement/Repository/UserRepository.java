package hu.cs.se.adjva.projectmanagement.Repository;

import hu.cs.se.adjva.projectmanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

     User findByUsername(String username);

}
