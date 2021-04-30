package hu.cs.se.adjva.projectmanagement.service.saleFactor;

import java.util.List;

import hu.cs.se.adjva.projectmanagement.dto.SaleFactorDTO;
import hu.cs.se.adjva.projectmanagement.model.SaleFactor;

public interface SaleFactorServices {
    
    List<SaleFactor> getAllSaleFactor();

    SaleFactor getSaleFactorById(Integer id);

    SaleFactor addSaleFactor(SaleFactor saleFactor);

    void deleteSaleFactor(Integer id);

    List<SaleFactorDTO> convertToDTO(List<SaleFactor> saleFactors);

    SaleFactorDTO convertToDTO(SaleFactor saleFactor);
}
