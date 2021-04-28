package hu.cs.se.adjva.projectmanagement.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/* 
   Buy Factor
*/
@Entity
@Table(name = "BuyFactor")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class BuyFactor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer buyFactorId;
    private Integer storeId;
    private Integer companyId;
    private Integer factorCode;
    private String buyDate;
    private Integer discount;
    private Integer currentPayment;
    private Integer totalPayment;
    private Integer userId;
    private Integer status;


    @ManyToOne
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public BuyFactor() {
    }

    public BuyFactor(Integer buyFactorId, Integer storeId, Integer companyId, Integer factorCode, String buyDate,
            Integer discount, Integer currentPayment, Integer totalPayment, Integer userId, Integer status) {
        this.buyFactorId = buyFactorId;
        this.storeId = storeId;
        this.companyId = companyId;
        this.factorCode = factorCode;
        this.buyDate = buyDate;
        this.discount = discount;
        this.currentPayment = currentPayment;
        this.totalPayment = totalPayment;
        this.userId = userId;
        this.status = status;
    }

    public Integer getBuyFactorId() {
        return buyFactorId;
    }

    public void setBuyFactorId(Integer buyFactorId) {
        this.buyFactorId = buyFactorId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getFactorCode() {
        return factorCode;
    }

    public void setFactorCode(Integer factorCode) {
        this.factorCode = factorCode;
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
