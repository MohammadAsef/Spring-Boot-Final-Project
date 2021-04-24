package hu.cs.se.adjva.projectmanagement.model;

import javax.persistence.*;

@Entity
@Table(name = "StockProduct")
public class StockProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;




}
