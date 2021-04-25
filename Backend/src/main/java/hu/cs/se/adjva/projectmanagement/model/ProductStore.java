package hu.cs.se.adjva.projectmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ProductStore
 */
@Entity
@Table(name = "product_store")
public class ProductStore {

    private Integer product_store_id;
    private Integer store_id;
    private Integer product_id;
    private Double  qualitity;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    public Integer getProduct_id() {
        return product_id;
    }
    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Double getQualitity() {
        return qualitity;
    }

    public void setQualitity(Double qualitity) {
        this.qualitity = qualitity;
    }

}