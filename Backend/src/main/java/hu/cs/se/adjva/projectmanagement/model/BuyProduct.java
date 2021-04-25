package hu.cs.se.adjva.projectmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * BuyProduct
 */
@Entity
@Table(name = "buy_product")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class BuyProduct {

    private Integer buy_product_id;
    private Integer buy_factor_id;
    private Double  buy_price;
    private Double  sale_price;
    private Double  quantity;

    private Product product;
    
    @OneToOne
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getBuy_product_id() {
        return buy_product_id;
    }
    public void setBuy_product_id(Integer buy_product_id) {
        this.buy_product_id = buy_product_id;
    }
    public Integer getBuy_factor_id() {
        return buy_factor_id;
    }
    public void setBuy_factor_id(Integer buy_factor_id) {
        this.buy_factor_id = buy_factor_id;
    }
    
    public Double getBuy_price() {
        return buy_price;
    }
    public void setBuy_price(Double buy_price) {
        this.buy_price = buy_price;
    }
    public Double getSale_price() {
        return sale_price;
    }
    public void setSale_price(Double sale_price) {
        this.sale_price = sale_price;
    }
    public Double getQuantity() {
        return quantity;
    }
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    
    

    
    
}