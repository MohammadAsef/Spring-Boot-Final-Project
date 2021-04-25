package hu.cs.se.adjva.projectmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * BuyProduct
 */
@Entity
@Table(name = "buy_product")
public class BuyProduct {

    private Integer buy_product_id;
    private Integer buy_factor_id;
    private Integer product_id;
    private Double  buy_price;
    private Double  sale_price;
    private Double  quantity;



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
    public Integer getProduct_id() {
        return product_id;
    }
    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
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