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
import com.redq.latte.controller.form.user.UserActivateForm;
import com.redq.latte.controller.form.user.UserRegisterForm;
import com.redq.latte.model.User;
import com.redq.latte.service.UserService;

import io.swagger.annotations.Api;

@Api(value = "user")
@RestController
@RequestMapping(value = "/user", method = {RequestMethod.GET, RequestMethod.POST})
public class UserController {
	
	@Autowired
    private UserService userService;
	
	@RequestMapping("/register")
    public RestDataResponse<User> register(@ModelAttribute UserRegisterForm form) {
		User user = new User();
		user.setLoginname(form.getLoginname());
		user.setPassword(form.getPassword());
	    user = userService.createUser(user);
		
        return new RestDataResponse<User>(user);
    }
    
    @RequestMapping("/view")
    public RestDataResponse<User> view(Long id) {
        return new RestDataResponse<User>(userService.getUserById(id));
    }
    
    @RequestMapping("/activate")
    public RestDataResponse<User> activate(UserActivateForm form) {
    	User user = userService.activateUser(form.getLoginname(), form.getCode());
        return new RestDataResponse<User>(user);
    }
    
    @RequestMapping("/list")
    public RestDataResponse<List<User>> list(@ModelAttribute SearchOrderForm form, Pageable pager) {
        List<User> users = userService.findUsers(pager);
    	return new RestDataResponse<List<User>>(users);
    }
}
