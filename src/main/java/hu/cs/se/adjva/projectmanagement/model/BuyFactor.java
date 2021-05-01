package hu.cs.se.adjva.projectmanagement.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/* 
   Buy Factor
*/
@Entity
@Table(name = "BuyFactor")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class BuyFactor {

    private Integer buyFactorId;
    private Integer factorCode;
    private String buyDate;
    private Integer discount;
    private Integer currentPayment;
    private Integer totalPayment;
    private Integer status;

    private Stock stockId;
    private Set<Product> products;
    private Customer customer;

    @ManyToOne
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public BuyFactor() {
    }

    public BuyFactor(Integer buyFactorId, Integer factorCode, String buyDate,
            Integer discount, Integer currentPayment, Integer totalPayment, Integer status) {
        this.buyFactorId = buyFactorId;
        this.factorCode = factorCode;
        this.buyDate = buyDate;
        this.discount = discount;
        this.currentPayment = currentPayment;
        this.totalPayment = totalPayment;
        this.status = status;
    }

    @OneToOne
    public Stock getStock() {
        return stockId;
    }

    public void setStock(Stock stock) {
        this.stockId = stock;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getBuyFactorId() {
        return buyFactorId;
    }

    public void setBuyFactorId(Integer buyFactorId) {
        this.buyFactorId = buyFactorId;
    }

    public Integer getFactorCode() {
        return factorCode;
    }

    public void setFactorCode(Integer factorCode) {
        this.factorCode = this.buyFactorId;
    }

    public String getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(String buyDate) {
        this.buyDate = buyDate;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getCurrentPayment() {
        return currentPayment;
    }

    public void setCurrentPayment(Integer currentPayment) {
        this.currentPayment = currentPayment;
    }

    public Integer getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(Integer totalPayment) {
        this.totalPayment = totalPayment;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @OneToMany(mappedBy = "buyFactor")
    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
