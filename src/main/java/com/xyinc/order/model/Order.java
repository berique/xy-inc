package com.xyinc.order.model;

import com.xyinc.softdelete.model.BaseIdEntity;
import lombok.Data;

import javax.persistence.*;

/**
 * Created by henriquemoreno on 30/04/17.
 */
@Entity(name = "ProductOrder")
@Data
public class Order extends BaseIdEntity {

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST})
    private Product product;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST})
    private Client client;
}
