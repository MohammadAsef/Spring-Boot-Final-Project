package hu.cs.se.adjva.projectmanagement.service;

import java.util.List;

import hu.cs.se.adjva.projectmanagement.model.Product;

/**
 * ProdectServices
 */
public interface ProdectServices {

    List<Product> getAllProducts();

    Product getProductById(Integer id);

    Product addProduct(Product prodect);

    void deleteProduct(Integer id);
}