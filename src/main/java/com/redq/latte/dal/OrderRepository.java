package com.redq.latte.dal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.redq.latte.model.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
    
}