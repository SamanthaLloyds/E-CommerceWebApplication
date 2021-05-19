package com.sw409.FairfieldUstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.sw409.FairfieldUstore.models.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
