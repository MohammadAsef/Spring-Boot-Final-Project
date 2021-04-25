package hu.cs.se.adjva.projectmanagement.model;

import javax.persistence.*;

@Entity

@Table(name = "wallet")
public class Wallet {
    
    private String id;
    private String mount;


  
    private Customer customer;

    @OneToOne
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMount() {
        return mount;
    }

    public void setMount(String mount) {
        this.mount = mount;
    }
}
