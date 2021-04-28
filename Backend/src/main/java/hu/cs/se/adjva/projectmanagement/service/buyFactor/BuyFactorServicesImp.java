package hu.cs.se.adjva.projectmanagement.service.buyFactor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.cs.se.adjva.projectmanagement.Repository.BuyFactorRepository;
import hu.cs.se.adjva.projectmanagement.dto.BuyFactorDTO;
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

    @Override
    public List<BuyFactorDTO> convertToDTO(List<BuyFactor> buyFactors) {
        List<BuyFactorDTO> buyFactorDTOList = new ArrayList<>();
        for(BuyFactor buyFactor : buyFactors){
            BuyFactorDTO buyFactorDTO = new BuyFactorDTO();
            buyFactorDTO.setBuyDate(buyFactor.getBuyDate());
            buyFactorDTO.setBuyFactorId(buyFactor.getBuyFactorId());
            buyFactorDTO.setCurrentPayment(buyFactor.getCurrentPayment());
            buyFactorDTO.setFactorCode(buyFactor.getFactorCode());
            buyFactorDTO.setStockId(buyFactor.getStock());
            buyFactorDTO.setTotalPayment(buyFactor.getTotalPayment());

            buyFactorDTOList.add(buyFactorDTO);
        }
        return buyFactorDTOList;
    }

    @Override
    public BuyFactorDTO convertToDTO(BuyFactor buyFactor) {
        BuyFactorDTO buyFactorDTO = new BuyFactorDTO();
            buyFactorDTO.setBuyDate(buyFactor.getBuyDate());
            buyFactorDTO.setBuyFactorId(buyFactor.getBuyFactorId());
            buyFactorDTO.setCurrentPayment(buyFactor.getCurrentPayment());
            buyFactorDTO.setFactorCode(buyFactor.getFactorCode());
            buyFactorDTO.setStockId(buyFactor.getStock());
            buyFactorDTO.setTotalPayment(buyFactor.getTotalPayment());
        return buyFactorDTO;
    }
}
