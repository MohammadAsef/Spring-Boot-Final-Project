package hu.cs.se.adjva.projectmanagement.service.saleProduct;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.cs.se.adjva.projectmanagement.DTO.SaleProductDTO;
import hu.cs.se.adjva.projectmanagement.Repository.SaleProductRepository;
import hu.cs.se.adjva.projectmanagement.model.SaleProduct;

@Service
public class SaleProductServiceImp  implements SaleProductServices{

    @Autowired
    private SaleProductRepository saleProductRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<SaleProduct> getAllSaleProducts() {
        List<SaleProduct> getAllSaleProduct = saleProductRepository.findAll();
        return getAllSaleProduct;
    }

    @Override
    public SaleProduct getSaleProductById(Integer id) {
        return saleProductRepository.getOne(id);
    }

    @Override
    public SaleProduct addSaleProduct(SaleProduct saleProduct) {
        return saleProductRepository.save(saleProduct);
    }

    @Override
    public void deleteSaleProduct(Integer id) {
        saleProductRepository.deleteById(id);
        
    }

    @Override
    public SaleProductDTO convartToDTO(SaleProduct saveSaleProduct) {
        SaleProductDTO saleProductDTO = modelMapper.map(saveSaleProduct, SaleProductDTO.class); 
        return saleProductDTO;
    }

    @Override
    public List<SaleProductDTO> convatToDTO(List<SaleProduct> saleProducts) {
       List<SaleProductDTO> saleProductDTOs = new ArrayList<>();

       for(SaleProduct saleProduct:saleProducts){
            SaleProductDTO saleProductDTO = modelMapper.map(saleProduct, SaleProductDTO.class);
            saleProductDTOs.add(saleProductDTO);

       }
        return saleProductDTOs;
    }
}
