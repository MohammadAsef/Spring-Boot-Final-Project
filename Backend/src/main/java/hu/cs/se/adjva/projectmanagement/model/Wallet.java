package hu.cs.se.adjva.projectmanagement.model;

import javax.persistence.*;

@Entity

@Table(name = "wallet")
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer mount;

    @OneToOne
    private Customer customer;


    public Wallet(Integer mount, Customer customer) {
        this.mount = mount;
        this.customer = customer;
    }

    public Wallet() {
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMount() {
        return mount;
    }

    public void setMount(Integer mount) {
        this.mount = mount;
    }
}
