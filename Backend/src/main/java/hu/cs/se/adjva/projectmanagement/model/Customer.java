package hu.cs.se.adjva.projectmanagement.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "customer")
public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String email;
    private String phone;

    @OneToMany(mappedBy = "customer")
    private Set<BuyFactor> buyFactors;

    public Set<BuyFactor> getBuyFactors() {
        return buyFactors;
    }

    public void setBuyFactors(Set<BuyFactor> buyFactors) {
        this.buyFactors = buyFactors;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
    private Wallet wallet;

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
}
