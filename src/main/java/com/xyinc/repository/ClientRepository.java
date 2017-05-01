package com.xyinc.repository;

import com.xyinc.model.Client;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClientRepository extends PagingAndSortingRepository<Client, Long> {
}