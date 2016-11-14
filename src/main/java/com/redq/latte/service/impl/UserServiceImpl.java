package com.redq.latte.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;

import com.redq.latte.dal.UserMapper;
import com.redq.latte.model.User;
import com.redq.latte.service.UserService;

public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public User createUser(User user) {
		userMapper.insert(user);
		return null;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteUser(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(Long id) {
		return userMapper.selectById(id);
	}

	@Override
	public User getUserByLoginname(String loginname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findUsers(Pageable pager) {
		// TODO Auto-generated method stub
		return null;
	}

}
