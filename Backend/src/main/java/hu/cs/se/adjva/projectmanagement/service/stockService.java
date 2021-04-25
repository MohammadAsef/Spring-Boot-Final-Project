package hu.cs.se.adjva.projectmanagement.service;

import java.util.List;

import hu.cs.se.adjva.projectmanagement.model.Stock;

public interface stockService{
   
    Stock addStock(Stock stock);

	List<Stock> getAllStocks();

	Stock getStockById(Integer id);

	void deleteStockById(Integer id);
    
}
