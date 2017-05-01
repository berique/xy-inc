package com.xyinc.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by henriquemoreno on 30/04/17.
 */
@Entity
@Data
public class Product {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private BigDecimal price;

    @OneToMany(mappedBy = "product")
    private List<Order> orders;
}
