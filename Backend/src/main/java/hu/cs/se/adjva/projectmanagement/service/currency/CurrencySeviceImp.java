package hu.cs.se.adjva.projectmanagement.service.currency;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.cs.se.adjva.projectmanagement.Repository.CurrencyRespositroy;
import hu.cs.se.adjva.projectmanagement.model.Currency;

/**
 * CurrencySeviceImp
 */
@Service
public class CurrencySeviceImp implements CurrencySevices {

    @Autowired
    private CurrencyRespositroy currencyRespositroy;


    @Override
    public List<Currency> getAllCurrencys() {
        return currencyRespositroy.findAll();
    }

    @Override
    public Currency getCurrencyById(Integer id) {
       
        return currencyRespositroy.getOne(id);
    }

    @Override
    public Currency addCurrency(Currency currency) {
        
        return currencyRespositroy.save(currency);
    }

    @Override
    public void deleteCurrency(Integer id) {
        currencyRespositroy.deleteById(id);
        
    }

    
}