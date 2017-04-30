package com.xyinc.order;

import com.xyinc.product.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by henriquemoreno on 30/04/17.
 */
@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
}
