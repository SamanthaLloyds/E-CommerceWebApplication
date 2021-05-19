package com.sw409.FairfieldUstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.sw409.FairfieldUstore.models.OrderProduct;
import com.sw409.FairfieldUstore.models.OrderProductPK;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
