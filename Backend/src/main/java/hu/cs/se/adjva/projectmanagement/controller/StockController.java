package hu.cs.se.adjva.projectmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import hu.cs.se.adjva.projectmanagement.model.Stock;
import hu.cs.se.adjva.projectmanagement.service.stockService;

@RestController
@CrossOrigin(origins = "*")
public class StockController {
    
    @Autowired
    private stockService stockservice;

    @PostMapping("/api/stock/add")
    public ResponseEntity<Stock> addStock (@RequestBody Stock stock){

          Stock savedStock = stockservice.addStock(stock);

          return new ResponseEntity<Stock>(savedStock, HttpStatus.CREATED);
    }


    @GetMapping("/api/stock/all")
    public ResponseEntity<List<Stock>> getListOfStocks (){
        
        List<Stock> stocks =  stockservice.getAllStocks();

        return new ResponseEntity<>(stocks, HttpStatus.OK);
    }


    @GetMapping("/api/stock/{id}")
    public ResponseEntity<Stock> getstockById (@PathVariable("id") Integer id){
        
        Stock savestock =  stockservice.getStockById(id);

        return new ResponseEntity<>(savestock, HttpStatus.OK);

    }

    @PutMapping("/api/stock/update")
    public ResponseEntity <Stock> updateCourse(@RequestBody Stock stock){
    Stock savedStock = stockservice.addStock(stock);
    return new ResponseEntity<>(savedStock, HttpStatus.OK );
}


        @DeleteMapping("/api/stock/{id}/delete")
        public ResponseEntity<String> deleteStock(@PathVariable("id") Integer id){
            stockservice.deleteStockById(id);
            return new ResponseEntity<>("Course" + id + "deleted", HttpStatus.OK);
        }
}
