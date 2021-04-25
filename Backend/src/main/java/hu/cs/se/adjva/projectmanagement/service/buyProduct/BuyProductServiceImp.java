package hu.cs.se.adjva.projectmanagement.service.buyProduct;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.cs.se.adjva.projectmanagement.Repository.BuyProductRepository;
import hu.cs.se.adjva.projectmanagement.model.BuyProduct;

@Service
public class BuyProductServiceImp implements BuyProductServices {
    
    @Autowired
    private BuyProductRepository buyProductRepository;

    @Override
    public List<BuyProduct> getAllBuyProducts() {
        List<BuyProduct> getAllBuyProduct = buyProductRepository.findAll();
        return getAllBuyProduct;
    }

    @Override
    public BuyProduct getBuyProductById(Integer id) {
        return buyProductRepository.getOne(id);
    }

    @Override
    public BuyProduct addBuyProduct(BuyProduct BuyProduct) {
        return buyProductRepository.save(BuyProduct);
    }

    @Override
    public void deleteBuyProduct(Integer id) {
        buyProductRepository.deleteById(id);
    }
}
