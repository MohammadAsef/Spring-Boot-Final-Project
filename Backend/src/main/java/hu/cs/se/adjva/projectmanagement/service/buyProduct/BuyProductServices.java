package hu.cs.se.adjva.projectmanagement.service.buyProduct;

import java.util.List;

import hu.cs.se.adjva.projectmanagement.model.BuyProduct;

public interface BuyProductServices{

    List<BuyProduct> getAllBuyProducts();
    BuyProduct getBuyProductById(Integer id);
    BuyProduct addBuyProduct(BuyProduct buyProduct);
    void deleteBuyProduct(Integer id);
    
}
