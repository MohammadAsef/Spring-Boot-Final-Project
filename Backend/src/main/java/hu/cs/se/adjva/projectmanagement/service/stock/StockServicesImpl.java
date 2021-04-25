package hu.cs.se.adjva.projectmanagement.service.stock;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.cs.se.adjva.projectmanagement.Repository.StockRepository;
import hu.cs.se.adjva.projectmanagement.model.Stock;

@Service
public class StockServicesImpl implements StockServices {

    @Autowired
    private StockRepository stockRepository;

    @Override
    public List<Stock> getAllStock() {
        return stockRepository.findAll();
    }

    @Override
    public Stock getStockById(Integer id) {
        return stockRepository.getOne(id);
    }

    @Override
    public Stock addStock(Stock stock) {
        return stockRepository.save(stock);
    }

    @Override
    public void deleteStock(Integer id) {
        stockRepository.deleteById(id);
    }
    
}
