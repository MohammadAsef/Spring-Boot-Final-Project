package hu.cs.se.adjva.projectmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
    private Integer factorCode;
    private String buyDate;
    private Integer discount;
    private Integer currentPayment;
    private Integer totalPayment;
    private Integer status;

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
}