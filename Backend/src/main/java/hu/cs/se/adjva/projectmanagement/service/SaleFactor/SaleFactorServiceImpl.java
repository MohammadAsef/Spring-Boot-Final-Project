package hu.cs.se.adjva.projectmanagement.service.SaleFactor;

import java.util.List;

import hu.cs.se.adjva.projectmanagement.Repository.SaleFactorRepository;
import hu.cs.se.adjva.projectmanagement.model.SaleFactor;

public class SaleFactorServiceImpl implements SaleFactorService {


    private SaleFactorRepository saleFactorRepository;

    @Override
    public List<SaleFactor> getAllSaleFactor() {
        // TODO Auto-generated method stub
        return saleFactorRepository.findAll();
    }

    @Override
    public SaleFactor getSaleFactorById(Integer id) {
        // TODO Auto-generated method stub
        return saleFactorRepository.getOne(id);
    }

    @Override
    public SaleFactor addSaleFactor(SaleFactor saleFactor) {
        // TODO Auto-generated method stub
        return saleFactorRepository.save(saleFactor);
    }

    @Override
    public void deleteSaleFactor(Integer id) {
        // TODO Auto-generated method stub
        saleFactorRepository.deleteById(id);
    }

   
    
}
