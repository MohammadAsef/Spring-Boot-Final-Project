package hu.cs.se.adjva.projectmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "SaleFactor")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class SaleFactor {
    
    private Integer buyFactorId;
    private Integer factorCode;
    private String saleDate;
    private Integer receptionPrice;
    private Integer discount;
    private Integer totalPrice;
    private Integer status;

    private Stock stock;
    private Customer customer;

    
    public SaleFactor() {
    }


    public SaleFactor(Integer buyFactorId, Integer factorCode, String saleDate, Integer receptionPrice, Integer totalPrice) {
        this.buyFactorId = buyFactorId;
        this.factorCode = factorCode;
        this.saleDate = saleDate;
        this.receptionPrice = receptionPrice;
        this.totalPrice = totalPrice;
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
        this.factorCode = factorCode;
    }


    public String getSaleDate() {
        return saleDate;
    }


    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }


    public Integer getReceptionPrice() {
        return receptionPrice;
    }


    public void setReceptionPrice(Integer receptionPrice) {
        this.receptionPrice = receptionPrice;
    }


    public Integer getDiscount() {
        return discount;
    }


    public void setDiscount(Integer discount) {
        this.discount = discount;
    }


    public Integer getTotalPrice() {
        return totalPrice;
    }


    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }


    public Integer getStatus() {
        return status;
    }


    public void setStatus(Integer status) {
        this.status = status;
    }


    @OneToOne
    public Stock getStock() {
        return stock;
    }


    public void setStock(Stock stock) {
        this.stock = stock;
    }


    @OneToOne
    public Customer getCustomer() {
        return customer;
    }


    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    
}
