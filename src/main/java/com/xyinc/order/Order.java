package com.xyinc.order;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.xyinc.client.Client;
import com.xyinc.product.Product;
import lombok.Data;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by henriquemoreno on 30/04/17.
 */
@Entity(name = "ProductOrder")
@Where(clause = "is_active=1")
@Data
public class Order {
    @Id
    @GeneratedValue
    private Long id;

    private Date creationDate = new Date();

    @JsonIgnore
    private Date removeDate;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST})
    private Product product;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST})
    private Client client;

    @JsonIgnore
    @Column(name = "is_active")
    private Boolean active = true;

    @JsonIgnore
    @Version
    private Long version;
}
