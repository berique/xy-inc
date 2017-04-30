package com.xyinc.client;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.xyinc.order.Order;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

/**
 * Created by henriquemoreno on 30/04/17.
 */
@Entity
@Data
@RequiredArgsConstructor
public class Client {
    @Id
    @GeneratedValue
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private Date birthDate;

    @JsonIgnore
    @OneToMany(mappedBy = "client")
    private List<Order> orders;
}
