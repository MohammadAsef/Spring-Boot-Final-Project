package hu.cs.se.adjva.projectmanagement.service.productStore;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.cs.se.adjva.projectmanagement.DTO.ProductStoreDTO;
import hu.cs.se.adjva.projectmanagement.Repository.ProductStoreRepository;
import hu.cs.se.adjva.projectmanagement.model.ProductStore;

@Service
public class ProductStoreServiceImp implements ProductStoreServices {

    @Autowired
    private ProductStoreRepository productStoreRepository;
    
    @Autowired
    private ModelMapper modelMapper;

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

    @Override
    public List<ProductStoreDTO> convartToDTO(List<ProductStore> productStores) {
        List<ProductStoreDTO> productStoreDTOs = new ArrayList<>();

        for(ProductStore productStore: productStores){
            ProductStoreDTO productStoreDTO = modelMapper.map(productStore, ProductStoreDTO.class);
            productStoreDTOs.add(productStoreDTO);
        }
        return productStoreDTOs;
    }

    @Override
    public ProductStoreDTO canvaDTO(ProductStore producStore) {
        ProductStoreDTO productStoreDTO = modelMapper.map(producStore, ProductStoreDTO.class);
        return productStoreDTO;
    }



}
