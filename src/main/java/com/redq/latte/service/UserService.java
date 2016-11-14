package com.redq.latte.service;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;

import com.redq.latte.model.User;

@Validated
public interface UserService {
	
	User createUser(User user);
	
	User updateUser(User user);
	
	User deleteUser(Long id);

    User getUserById(@NotNull Long id);
    
    User getUserByLoginname(String loginname);
    
    List<User> findUsers(Pageable pager);

}
