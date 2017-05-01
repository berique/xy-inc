package com.xyinc.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
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

    @NotNull
    @Column(nullable = false)
    private String firstName;

    @NotNull
    @Column(nullable = false)
    private String lastName;

    @NotNull
    @Column(nullable = false)
    private String email;

    private Date birthDate;

    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
    private List<Order> orders;
}
