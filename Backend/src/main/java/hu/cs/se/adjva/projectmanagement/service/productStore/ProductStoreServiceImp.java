package hu.cs.se.adjva.projectmanagement.service.productStore;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.cs.se.adjva.projectmanagement.Repository.ProductStoreRepository;
import hu.cs.se.adjva.projectmanagement.model.ProductStore;

@Service
public class ProductStoreServiceImp implements ProductStoreServices {

    @Autowired
    private ProductStoreRepository productStoreRepository;

    @Override
    public List<ProductStore> getAllProductStores() {
        List<ProductStore> getAllProductStore = productStoreRepository.findAll();
        return getAllProductStore;
    }

    @Override
    public ProductStore getProductStoreById(Integer id) {
        
        return productStoreRepository.getOne(id);
    }

    @Override
    public ProductStore addProductStore(ProductStore productStore) {
        
        return productStoreRepository.save(productStore);
    }

    @Override
    public void deleteProductStore(Integer id) {
        productStoreRepository.deleteById(id);
        
    }



}
