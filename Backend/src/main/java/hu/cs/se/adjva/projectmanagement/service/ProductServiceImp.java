package hu.cs.se.adjva.projectmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.cs.se.adjva.projectmanagement.Repository.ProductRepository;
import hu.cs.se.adjva.projectmanagement.model.Product;

@Service
public class ProductServiceImp implements ProdectServices{

    @Autowired
    private ProductRepository productRepository;



    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
       
        return productRepository.getOne(id);
    }

    @Override
    public Product addProduct(Product prodect) {
        
        return productRepository.save(prodect);
    }

    @Override
    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
        
    }

    
    
}