package com.xyinc.order.repository;

import com.xyinc.order.model.Client;
import com.xyinc.softdelete.repository.SoftDeletesRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClientRepository extends SoftDeletesRepository<Client, Long> {
}