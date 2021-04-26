package hu.cs.se.adjva.projectmanagement.DTO;

public class SaleProductDTO {
    
    private  Integer sale_id;
    private  Integer sale_factor_id;
    private  Double  buy_price;
    private  Double  sale_price;
    private  Double  package_price;
    private  Double  unit_price;
    private  Double  total_price;
    private Integer  quantity;
    private String   sale_date;

    private Integer productId;

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

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    

}
