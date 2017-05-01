package com.xyinc.repository;

import com.xyinc.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by henriquemoreno on 30/04/17.
 */
@RepositoryRestResource
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
}
