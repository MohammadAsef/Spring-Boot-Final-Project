package hu.cs.se.adjva.projectmanagement.service.saleProduct;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hu.cs.se.adjva.projectmanagement.Repository.SaleProductRepository;
import hu.cs.se.adjva.projectmanagement.model.SaleProduct;

@Service
public class SaleProductServiceImp  implements SaleProductServices{

    @Autowired
    private SaleProductRepository saleProductRepository;

    @Override
    public List<SaleProduct> getAllSaleProducts() {
        List<SaleProduct> getAllSaleProduct = saleProductRepository.findAll();
        return getAllSaleProduct;
    }

    @Override
    public SaleProduct getSaleProductById(Integer id) {
        return saleProductRepository.getOne(id);
    }

    @Override
    public SaleProduct addSaleProduct(SaleProduct saleProduct) {
        return saleProductRepository.save(saleProduct);
    }

    @Override
    public void deleteSaleProduct(Integer id) {
        saleProductRepository.deleteById(id);
        
    }
}
