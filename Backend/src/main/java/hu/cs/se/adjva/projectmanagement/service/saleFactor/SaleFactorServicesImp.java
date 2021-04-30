package hu.cs.se.adjva.projectmanagement.service.saleFactor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.cs.se.adjva.projectmanagement.Repository.SaleFactorRepository;
import hu.cs.se.adjva.projectmanagement.dto.SaleFactorDTO;
import hu.cs.se.adjva.projectmanagement.model.SaleFactor;

@Service
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

    @Override
    public List<SaleFactorDTO> convertToDTO(List<SaleFactor> saleFactors) {
        List<SaleFactorDTO> saleFactorDTOList = new ArrayList<>();
        for(SaleFactor saleFactor : saleFactors){
            SaleFactorDTO saleFactorDTO = new SaleFactorDTO();
            saleFactorDTO.setFactorCode(saleFactor.getBuyFactorId());
            saleFactorDTO.setDiscount(saleFactor.getDiscount());
            saleFactorDTO.setReceptionPrice(saleFactor.getReceptionPrice());
            saleFactorDTO.setSaleDate(saleFactor.getSaleDate());
            saleFactorDTO.setStatus(saleFactor.getStatus());
            saleFactorDTO.setTotalPrice(saleFactor.getTotalPrice());
            saleFactorDTO.setStock(saleFactor.getStock());

            saleFactorDTOList.add(saleFactorDTO);
        }
        return saleFactorDTOList;
    }

    @Override
    public SaleFactorDTO convertToDTO(SaleFactor saleFactor) {
        SaleFactorDTO saleFactorDTO = new SaleFactorDTO();
            saleFactorDTO.setFactorCode(saleFactor.getBuyFactorId());
            saleFactorDTO.setDiscount(saleFactor.getDiscount());
            saleFactorDTO.setReceptionPrice(saleFactor.getReceptionPrice());
            saleFactorDTO.setSaleDate(saleFactor.getSaleDate());
            saleFactorDTO.setStatus(saleFactor.getStatus());
            saleFactorDTO.setTotalPrice(saleFactor.getTotalPrice());
            saleFactorDTO.setStock(saleFactor.getStock());
        return saleFactorDTO;
    }
    
}
