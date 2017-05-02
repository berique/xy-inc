package com.xyinc.softdelete.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * MappedSuperclass that extends the {@link BaseEntity} class and is
 * extended by entity classes that have ID field of type Long
 * <p>
 * based on <a href="https://github.com/dzinot/spring-boot-jpa-soft-delete">https://github.com/dzinot/spring-boot-jpa-soft-delete</a>
 *
 * @author Kristijan Georgiev
 */
@Getter
@Setter
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
public class BaseIdEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected long id;

}
