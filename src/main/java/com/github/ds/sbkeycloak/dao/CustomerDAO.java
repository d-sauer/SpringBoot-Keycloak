package com.github.ds.sbkeycloak.dao;

import com.github.ds.sbkeycloak.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerDAO extends CrudRepository<Customer, Long> {

}