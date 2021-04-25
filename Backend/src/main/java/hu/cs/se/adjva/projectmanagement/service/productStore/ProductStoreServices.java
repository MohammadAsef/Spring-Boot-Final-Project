package hu.cs.se.adjva.projectmanagement.service.productStore;

import java.util.List;

import hu.cs.se.adjva.projectmanagement.model.ProductStore;

public interface ProductStoreServices {
    List<ProductStore> getAllProductStores();
    ProductStore getProductStoreById(Integer id);
    ProductStore addProductStore(ProductStore productStore);
    void deleteProductStore(Integer id);
}
