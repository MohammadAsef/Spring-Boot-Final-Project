package hu.cs.se.adjva.projectmanagement.service.currency;

import java.util.List;

import hu.cs.se.adjva.projectmanagement.model.Currency;

/**
 * CurrencySevices
 */
public interface CurrencySevices {

    List<Currency> getAllCurrencys();

    Currency getCurrencyById(Integer id);

    Currency addCurrency(Currency currency);

    void deleteCurrency(Integer id);
}