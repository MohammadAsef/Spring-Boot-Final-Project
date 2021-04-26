package hu.cs.se.adjva.projectmanagement.DTO;

public class BuyProductDTO {

    private Integer buy_product_id;
    private Integer buy_factor_id;
    private Double  buy_price;
    private Double  sale_price;
    private Double  quantity;

    private Integer productId;

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

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    
}
