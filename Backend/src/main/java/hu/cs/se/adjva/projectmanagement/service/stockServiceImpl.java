package hu.cs.se.adjva.projectmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.cs.se.adjva.projectmanagement.Repository.stockRepository;
import hu.cs.se.adjva.projectmanagement.model.Stock;

@Service
public class stockServiceImpl implements stockService {

     @Autowired
     private stockRepository stockrepository;

    
    public Stock addStock(Stock stock) {
          
         return stockrepository.save(stock);
       
    }

    @Override
    public List<Stock> getAllStocks() {
       return  stockrepository.findAll();
        
    }

    @Override
    public Stock getStockById(Integer id) {
        
        return stockrepository.getOne(id);
    }


    public void deleteStockById(Integer id) {
         stockrepository.deleteById(id);       
    }
    
}
