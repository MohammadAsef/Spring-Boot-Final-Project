package hu.cs.se.adjva.projectmanagement.service.SaleFactor;

import java.util.List;

import hu.cs.se.adjva.projectmanagement.Repository.SaleFactorRepository;
import hu.cs.se.adjva.projectmanagement.model.SaleFactor;

public class SaleFactorServiceImpl implements SaleFactorService {


    private SaleFactorRepository saleFactorRepository;

    @Override
    public List<SaleFactor> getAllBuyFactor() {
        // TODO Auto-generated method stub
        return saleFactorRepository.findAll();
    }
  
}
