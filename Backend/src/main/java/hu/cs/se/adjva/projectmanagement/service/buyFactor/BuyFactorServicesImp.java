package hu.cs.se.adjva.projectmanagement.service.buyFactor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.cs.se.adjva.projectmanagement.Repository.BuyFactorRepository;
import hu.cs.se.adjva.projectmanagement.model.BuyFactor;

@Service
public class BuyFactorServicesImp implements BuyFactorServices {

    @Autowired
    private BuyFactorRepository buyFactorRepository;

    @Override
    public List<BuyFactor> getAllBuyFactor() {
        return buyFactorRepository.findAll();
    }

    @Override
    public BuyFactor getBuyFactorById(Integer id) {
        return buyFactorRepository.getOne(id);
    }

    @Override
    public BuyFactor addBuyFactor(BuyFactor buyFactor) {
        return buyFactorRepository.save(buyFactor);
    }

    @Override
    public void deleteBuyFactor(Integer id) {
        buyFactorRepository.deleteById(id);
    }
}
