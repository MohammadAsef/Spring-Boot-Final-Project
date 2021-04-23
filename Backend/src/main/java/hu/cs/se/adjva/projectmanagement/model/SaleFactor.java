package hu.cs.se.adjva.projectmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "SaleFactor")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class SaleFactor {

    private Integer saleFactorId;
    private String salefactorCode;
    private Integer recieption_price;
    private Integer total_price;
    private String saleDate;
    private Integer discount;
    private Integer storeId;
    private Integer status;
    private Integer userId;
    private Integer customer_id;



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getSaleFactorId() {
        return saleFactorId;
    }
    public void setSaleFactorId(Integer saleFactorId) {
        this.saleFactorId = saleFactorId;
    }
    public String getSalefactorCode() {
        return salefactorCode;
    }
    public void setSalefactorCode(String salefactorCode) {
        this.salefactorCode = salefactorCode;
    }
    public Integer getRecieption_price() {
        return recieption_price;
    }
    public void setRecieption_price(Integer recieption_price) {
        this.recieption_price = recieption_price;
    }
    public Integer getTotal_price() {
        return total_price;
    }
    public void setTotal_price(Integer total_price) {
        this.total_price = total_price;
    }
    public String getSaleDate() {
        return saleDate;
    }
    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }
    public Integer getDiscount() {
        return discount;
    }
    public void setDiscount(Integer discount) {
        this.discount = discount;
    }
    public Integer getStoreId() {
        return storeId;
    }
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public Integer getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }
    public SaleFactor(Integer saleFactorId, String salefactorCode, Integer recieption_price, Integer total_price,
            String saleDate, Integer discount, Integer storeId, Integer status, Integer userId, Integer customer_id) {
        this.saleFactorId = saleFactorId;
        this.salefactorCode = salefactorCode;
        this.recieption_price = recieption_price;
        this.total_price = total_price;
        this.saleDate = saleDate;
        this.discount = discount;
        this.storeId = storeId;
        this.status = status;
        this.userId = userId;
        this.customer_id = customer_id;
    }


    

}
