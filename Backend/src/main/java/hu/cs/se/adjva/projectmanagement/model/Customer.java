package hu.cs.se.adjva.projectmanagement.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "customer")
public class Customer {

    private int id;
    private String name;
    private String email;
    private String phone;

    private Wallet wallet;
    
    private Set<BuyFactor> buyFactors;

    @OneToMany(mappedBy = "customer")
    public Set<BuyFactor> getBuyFactors() {
        return buyFactors;
    }

    public void setBuyFactors(Set<BuyFactor> buyFactors) {
        this.buyFactors = buyFactors;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @OneToOne(mappedBy = "customer")
    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
}
