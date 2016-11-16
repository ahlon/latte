package com.redq.latte.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.redq.latte.common.response.RestDataResponse;
import com.redq.latte.controller.form.SearchOrderForm;
import com.redq.latte.model.Order;
import com.redq.latte.service.OrderService;

import io.swagger.annotations.Api;

@Api(value = "order")
@RestController
@RequestMapping(value = "/order", method = {RequestMethod.GET, RequestMethod.POST})
public class OrderController {
    
    @Autowired
    private OrderService orderService;
    
    @RequestMapping("/list")
    public RestDataResponse<List<Order>> list(@ModelAttribute SearchOrderForm form, Pageable pager) {
        RestDataResponse<List<Order>> result = new RestDataResponse<List<Order>>();
        result.setData(orderService.searchOrders(pager));
        return result;
    }

    @RequestMapping("/view")
    public RestDataResponse<Order> view(@RequestParam Long id) {
        Order order = orderService.getById(id);
        return new RestDataResponse<Order>(order);
    }
    
}
