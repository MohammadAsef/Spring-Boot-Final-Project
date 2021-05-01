package hu.cs.se.adjva.projectmanagement.service.stock;

import java.util.List;

import hu.cs.se.adjva.projectmanagement.model.Stock;

public interface StockServices {
    
    List<Stock> getAllStock();

    Stock getStockById(Integer id);

    Stock addStock(Stock stock);

    void deleteStock(Integer id);
}
