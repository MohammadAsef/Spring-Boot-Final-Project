package hu.cs.se.adjva.projectmanagement.dto;

import hu.cs.se.adjva.projectmanagement.model.Stock;

public class BuyFactorDTO {
    private Integer buyFactorId;
    private Integer factorCode;
    private String buyDate;
    private Integer discount;
    private Integer currentPayment;
    private Integer totalPayment;
    private Integer status;

    private Stock stockId;

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

    public Stock getStockId() {
        return stockId;
    }

    public void setStockId(Stock stockId) {
        this.stockId = stockId;
    }

    
}
