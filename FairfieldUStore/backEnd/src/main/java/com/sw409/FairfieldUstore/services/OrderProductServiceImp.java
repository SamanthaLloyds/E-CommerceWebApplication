package com.sw409.FairfieldUstore.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.sw409.FairfieldUstore.models.OrderProduct;
import com.sw409.FairfieldUstore.repository.OrderProductRepository;

@Service
@Transactional
public class OrderProductServiceImp implements OrderProductService {

    private OrderProductRepository orderProductRepository;

    public OrderProductServiceImp(OrderProductRepository orderProductRepository) {
        this.orderProductRepository = orderProductRepository;
    }

    @Override
    public OrderProduct create(OrderProduct orderProduct) {
        return this.orderProductRepository.save(orderProduct);
    }
}
