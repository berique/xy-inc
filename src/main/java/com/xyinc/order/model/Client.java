package com.xyinc.order.model;

import com.xyinc.softdelete.model.BaseIdEntity;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * Created by henriquemoreno on 30/04/17.
 */
@Entity
@Data
@RequiredArgsConstructor
public class Client extends BaseIdEntity {

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
