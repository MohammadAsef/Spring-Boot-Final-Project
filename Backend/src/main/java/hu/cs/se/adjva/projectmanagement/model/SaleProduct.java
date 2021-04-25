package hu.cs.se.adjva.projectmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SaleProduct
 */
@Entity
@Table(name = "sale_product")
public class SaleProduct{

    private  Integer sale_id;
    private  Integer sale_factor_id;
    private  Integer product_id;
    private  Double  buy_price;
    private  Double  sale_price;
    private  Double  package_price;
    private  Double  unit_price;
    private  Double  total_price;
    private Integer  quantity;
    private String   sale_date;

    @Id
    @GeneratedValue
    public Integer getSale_id() {
        return sale_id;
    }
    public void setSale_id(Integer sale_id) {
        this.sale_id = sale_id;
    }
    public Integer getSale_factor_id() {
        return sale_factor_id;
    }
    public void setSale_factor_id(Integer sale_factor_id) {
        this.sale_factor_id = sale_factor_id;
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
    public Double getPackage_price() {
        return package_price;
    }
    public void setPackage_price(Double package_price) {
        this.package_price = package_price;
    }
    public Double getUnit_price() {
        return unit_price;
    }
    public void setUnit_price(Double unit_price) {
        this.unit_price = unit_price;
    }
    public Double getTotal_price() {
        return total_price;
    }
    public void setTotal_price(Double total_price) {
        this.total_price = total_price;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public String getSale_date() {
        return sale_date;
    }
    public void setSale_date(String sale_date) {
        this.sale_date = sale_date;
    }


    

}