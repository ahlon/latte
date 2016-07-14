package com.redq.latte.service;

import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;

import com.redq.latte.model.Order;

@Validated
public interface OrderService {
    
    Order getById(@NotNull @Min(1000) Long id);
    
    List<Order> searchOrders(Pageable pager);

}
