package hu.cs.se.adjva.projectmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Currency
 */
@Entity
public class Currency {

private Integer currency_id ;
private String currency_name;


@Id
@GeneratedValue
public Integer getCurrency_id() {
    return currency_id;
}
public void setCurrency_id(Integer currency_id) {
    this.currency_id = currency_id;
}
public String getCurrency_name() {
    return currency_name;
}
public void setCurrency_name(String currency_name) {
    this.currency_name = currency_name;
}


    
}