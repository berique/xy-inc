package com.xyinc.repository;

import com.xyinc.model.Order;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by henriquemoreno on 30/04/17.
 */
@RepositoryRestResource
public interface OrderRepository extends PagingAndSortingRepository<Order, Long> {
}
