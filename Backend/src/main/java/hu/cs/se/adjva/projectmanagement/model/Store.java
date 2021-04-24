package hu.cs.se.adjva.projectmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Store
 * 
 * 
 */
@Entity
@JsonIgnoreProperties(value = {"hibernateLazyInitializer","handler"})
public class Store {

    private Integer id;
    private String  store_name;
    private Integer money_store_id;
    private String  store_address;
    private Integer agency_id;



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getStore_name() {
        return store_name;
    }
    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }
    public Integer getMoney_store_id() {
        return money_store_id;
    }
    public void setMoney_store_id(Integer money_store_id) {
        this.money_store_id = money_store_id;
    }
    public String getStore_address() {
        return store_address;
    }
    public void setStore_address(String store_address) {
        this.store_address = store_address;
    }
    public Integer getAgency_id() {
        return agency_id;
    }
    public void setAgency_id(Integer agency_id) {
        this.agency_id = agency_id;
    }

    
}