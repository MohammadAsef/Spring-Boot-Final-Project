package hu.cs.se.adjva.projectmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Produect
 */
@Entity
@Table(name = "Products")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer","handler"})
public class Product {

   
    private Integer id;
    private String product_name;
    private Integer product_code;
    private String product_description;
    private Double price;
    private Double product_buy_price;
    private Double product_sale_price;

    private ProductStore productStore;
    private SaleProduct saleProduct;
    private BuyProduct buyProduct;

    // mapping with BuyProduct
    @OneToOne(mappedBy = "product")
    public BuyProduct getBuyProduct() {
        return buyProduct;
    }

    public void setBuyProduct(BuyProduct buyProduct) {
        this.buyProduct = buyProduct;
    }

    // mapping with SaleProduct
    @OneToOne(mappedBy = "product")
    public SaleProduct getSaleProduct() {
        return saleProduct;
    }

    public void setSaleProduct(SaleProduct saleProduct) {
        this.saleProduct = saleProduct;
    }

    // mapping with productStore 
    @OneToOne(mappedBy = "product")
    public ProductStore getProductStore() {
        return productStore;
    }

    public void setProductStore(ProductStore productStore) {
        this.productStore = productStore;
    }

    public Product(){

    }

    public Product(Integer id, String product_name, Integer product_code, String product_description, Double price,
            Double product_buy_price, Double product_sale_price) {

                this.id = id;
                this.product_name = product_name;
                this.product_code = product_code;
                this.product_description = product_description;
                this.price = price;
                this.product_buy_price = product_buy_price;
                this.product_sale_price = product_sale_price;
                
    }

    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getProduct_name() {
        return product_name;
    }
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
    public Integer getProduct_code() {
        return product_code;
    }
    public void setProduct_code(Integer product_code) {
        this.product_code = product_code;
    }
    public String getProduct_description() {
        return product_description;
    }
    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Double getProduct_buy_price() {
        return product_buy_price;
    }
    public void setProduct_buy_price(Double product_buy_price) {
        this.product_buy_price = product_buy_price;
    }
    public Double getProduct_sale_price() {
        return product_sale_price;
    }
    public void setProduct_sale_price(Double product_sale_price) {
        this.product_sale_price = product_sale_price;
    }
}
