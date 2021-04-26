package hu.cs.se.adjva.projectmanagement.service.saleProduct;

import java.util.List;

import hu.cs.se.adjva.projectmanagement.DTO.SaleProductDTO;
import hu.cs.se.adjva.projectmanagement.model.SaleProduct;

public interface SaleProductServices {
    List<SaleProduct> getAllSaleProducts();
    SaleProduct getSaleProductById(Integer id);
    SaleProduct addSaleProduct(SaleProduct saleProduct);
    void deleteSaleProduct(Integer id);
    SaleProductDTO convartToDTO(SaleProduct saveSaleProduct);
    List<SaleProductDTO> convatToDTO(List<SaleProduct> saleProducts);
}
