package hu.cs.se.adjva.projectmanagement.service.buyFactor;

import java.util.List;

import hu.cs.se.adjva.projectmanagement.dto.BuyFactorDTO;
import hu.cs.se.adjva.projectmanagement.model.BuyFactor;

public interface BuyFactorServices {
    
    List<BuyFactor> getAllBuyFactor();

    BuyFactor getBuyFactorById(Integer id);

    BuyFactor addBuyFactor(BuyFactor buyFactor);

    void deleteBuyFactor(Integer id);

    List<BuyFactorDTO> convertToDTO(List<BuyFactor> buyFactors);

    BuyFactorDTO convertToDTO(BuyFactor buyFactor);
}
