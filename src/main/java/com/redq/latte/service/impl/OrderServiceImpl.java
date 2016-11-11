package com.redq.latte.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.redq.latte.common.BaseService;
import com.redq.latte.dal.OrderMapper;
import com.redq.latte.model.Order;
import com.redq.latte.service.OrderService;

@Service
public class OrderServiceImpl extends BaseService implements OrderService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // @Autowired
    private OrderMapper orderMapper;
    
    @Override
    public Order getById(Long id) {
        return orderMapper.selectById(id);
    }

    /** 
     * @see com.redq.latte.service.OrderService#searchOrders()
     */
    @Override
    public List<Order> searchOrders(Pageable pager) {
        logger.info("searchOrders");
        return orderMapper.selectAll(pager);
    }

}
