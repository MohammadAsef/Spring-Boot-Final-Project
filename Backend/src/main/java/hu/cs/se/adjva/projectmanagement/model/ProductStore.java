package hu.cs.se.adjva.projectmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * ProductStore
 */
@Entity
@Table(name = "product_store")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer","handler"})
public class ProductStore {

    private Integer product_store_id;
    private Integer store_id;
    private Double  qualitity;

    private Product product; 
    
    @OneToOne
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    
    @Id
    @GeneratedValue
    public Integer getProduct_store_id() {
        return product_store_id;
    }
    public void setProduct_store_id(Integer product_store_id) {
        this.product_store_id = product_store_id;
    }
    public Integer getStore_id() {
        return store_id;
    }
    public void setStore_id(Integer store_id) {
        this.store_id = store_id;
    }
   
    public Double getQualitity() {
        return qualitity;
    }

    public void setQualitity(Double qualitity) {
        this.qualitity = qualitity;
    }

}