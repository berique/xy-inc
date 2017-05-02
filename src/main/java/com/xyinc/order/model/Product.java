package com.xyinc.order.model;

import com.xyinc.softdelete.model.BaseIdEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by henriquemoreno on 30/04/17.
 */
@Entity
@Data
public class Product extends BaseIdEntity {

    private String name;

    private BigDecimal price;

    @OneToMany(mappedBy = "product")
    private List<Order> orders;
}
