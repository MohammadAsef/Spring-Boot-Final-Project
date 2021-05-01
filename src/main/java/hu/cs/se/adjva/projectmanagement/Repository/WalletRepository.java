package hu.cs.se.adjva.projectmanagement.Repository;

import hu.cs.se.adjva.projectmanagement.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet,Integer> {

}
