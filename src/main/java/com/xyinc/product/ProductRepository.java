package com.xyinc.product;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by henriquemoreno on 30/04/17.
 */
@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
