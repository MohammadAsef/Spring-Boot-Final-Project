package hu.cs.se.adjva.projectmanagement.service.saleFactor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import hu.cs.se.adjva.projectmanagement.Repository.SaleFactorRepository;
import hu.cs.se.adjva.projectmanagement.model.SaleFactor;

public class SaleFactorServicesImp implements SaleFactorServices {


    @Autowired
    private SaleFactorRepository saleFactorRepository;

    @Override
    public List<SaleFactor> getAllSaleFactor() {
        return saleFactorRepository.findAll();
    }

    @Override
    public SaleFactor getSaleFactorById(Integer id) {
        return saleFactorRepository.getOne(id);
    }

    @Override
    public SaleFactor addSaleFactor(SaleFactor saleFactor) {
        return saleFactorRepository.save(saleFactor);
    }

    @Override
    public void deleteSaleFactor(Integer id) {
        saleFactorRepository.deleteById(id);
    }
    
}
