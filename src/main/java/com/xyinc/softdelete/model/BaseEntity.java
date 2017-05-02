package com.xyinc.softdelete.model;

import lombok.Data;

import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * MappedSuperclass that contains all the necessary fields for using
 * soft deletes
 *
 * based on <a href="https://github.com/dzinot/spring-boot-jpa-soft-delete">https://github.com/dzinot/spring-boot-jpa-soft-delete</a>
 *
 * @author Kristijan Georgiev
 */
@Data
@MappedSuperclass
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    protected static final String NOT_DELETED = "deleted_on > CURRENT_TIMESTAMP OR deleted_on IS NULL";

    @Version
    protected Long version;

    protected LocalDateTime createdOn;

    protected LocalDateTime updatedOn;

    protected LocalDateTime deletedOn;

    protected Long createdBy;

    protected Long updatedBy;

}
