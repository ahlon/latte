package com.redq.latte.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.redq.latte.common.response.RestDataResponse;
import com.redq.latte.controller.form.SearchOrderForm;
import com.redq.latte.model.Order;
import com.redq.latte.model.User;
import com.redq.latte.service.UserService;

import io.swagger.annotations.Api;

@Api(value = "user")
@RestController
@RequestMapping(value = "/user", method = {RequestMethod.GET, RequestMethod.POST})
public class UserController {
	
	@Autowired
    private UserService userService;
    
    @RequestMapping("/view")
    public RestDataResponse<User> view(Long id) {
        RestDataResponse<User> result = new RestDataResponse<User>();
        result.setData(userService.getUserById(id));
        return result;
    }
    
    @RequestMapping("/list")
    public RestDataResponse<List<User>> list(@ModelAttribute SearchOrderForm form, Pageable pager) {
        RestDataResponse<List<User>> result = new RestDataResponse<List<User>>();
        result.setData(userService.findUsers(pager));
        return result;
    }
}
