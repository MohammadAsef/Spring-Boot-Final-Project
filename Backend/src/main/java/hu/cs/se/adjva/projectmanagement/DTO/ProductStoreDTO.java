package hu.cs.se.adjva.projectmanagement.DTO;

public class ProductStoreDTO {
    
    private Integer product_store_id;
    private Integer store_id;
    private Double  qualitity;

    private Integer productId;
    

    public Integer getProduct_store_id() {
        return product_store_id;
    }

    public void setProduct_store_id(Integer product_store_id) {
        this.product_store_id = product_store_id;
    }

    public Integer getStore_id() {
        return store_id;
    }

    public void setStore_id(Integer store_id) {
        this.store_id = store_id;
    }

    public Double getQualitity() {
        return qualitity;
    }

    public void setQualitity(Double qualitity) {
        this.qualitity = qualitity;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    } 

    
}
