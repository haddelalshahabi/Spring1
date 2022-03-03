package com.oslomet.spring1.repository;

import com.oslomet.spring1.model.Amount;
import com.oslomet.spring1.model.Currency;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CurrencyService {

    private final List<Currency> list = new ArrayList<>();

    public void loadCurrensies() {
        Currency sek = new Currency("SEK", 0.85);
        Currency usd = new Currency("USD", 8.85);
        Currency eur = new Currency("EUR", 9.56);

        list.add(sek);
        list.add(usd);
        list.add(eur);
    }

    public double calculate(Amount amount) {
        for (Currency currency : list){
            if (amount.getCurrency().equalsIgnoreCase(currency.getCurrency())){
                return amount.getValue() * currency.getRate();
            }
        }
        return 0.0;
    }
}
