package hu.cs.se.adjva.projectmanagement.dto;

import hu.cs.se.adjva.projectmanagement.model.Stock;

public class SaleFactorDTO {

    private Integer buyFactorId;
    private Integer factorCode;
    private String saleDate;
    private Integer receptionPrice;
    private Integer discount;
    private Integer totalPrice;
    private Integer status;

    private Stock stock;

    public SaleFactorDTO(Integer buyFactorId, Integer factorCode, String saleDate, Integer receptionPrice,
            Integer discount, Integer totalPrice, Integer status, Stock stock) {
        this.buyFactorId = buyFactorId;
        this.factorCode = factorCode;
        this.saleDate = saleDate;
        this.receptionPrice = receptionPrice;
        this.discount = discount;
        this.totalPrice = totalPrice;
        this.status = status;
        this.stock = stock;
    }

    public SaleFactorDTO() {
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

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
}
