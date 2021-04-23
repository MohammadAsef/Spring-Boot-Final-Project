package hu.cs.se.adjva.projectmanagement.service.SaleFactor;

import java.util.List;

import hu.cs.se.adjva.projectmanagement.model.SaleFactor;

public interface SaleFactorService {
    List<SaleFactor> getAllSaleFactor();

    SaleFactor getSaleFactorById(Integer id);
    
    SaleFactor addSaleFactor(SaleFactor saleFactor);

    void deleteSaleFactor(Integer id);
}
