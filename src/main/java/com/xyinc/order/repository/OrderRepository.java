package com.xyinc.order.repository;

import com.xyinc.order.model.Order;
import com.xyinc.softdelete.repository.SoftDeletesRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by henriquemoreno on 30/04/17.
 */
@RepositoryRestResource
public interface OrderRepository extends SoftDeletesRepository<Order, Long> {
}
