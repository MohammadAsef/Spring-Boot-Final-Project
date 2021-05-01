package hu.cs.se.adjva.projectmanagement.model;

import javax.persistence.*;

@Entity

@Table(name = "wallet")
public class Wallet {
    
    private String id;
    private Integer mount;  
    private Customer customer;

    public Wallet(Integer mount, Customer customer) {
        this.mount = mount;
        this.customer = customer;
    }

    public Wallet() {
    }

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

    public Integer getMount() {
        return mount;
    }

    public void setMount(Integer mount) {
        this.mount = mount;
    }
}
