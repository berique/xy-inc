package com.xyinc.order;

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
@Where(clause="is_active=1")
@Data
public class Order {
    @Id
    @GeneratedValue
    private Long id;

    private Date creationDate;

    private Date removeDate;

    @ManyToOne
    @JoinColumn(name="PRODUCT_ID")
    private Product product;

    @ManyToOne
    @JoinColumn(name="CLIENT_ID")
    private Client client;

    @Column(name="is_active")
    private Boolean active;

    @Version
    private Long version;
}
