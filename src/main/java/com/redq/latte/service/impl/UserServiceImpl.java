package com.redq.latte.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.redq.latte.common.BaseService;
import com.redq.latte.dal.UserMapper;
import com.redq.latte.model.User;
import com.redq.latte.service.UserService;

@Service
public class UserServiceImpl extends BaseService implements UserService {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public User createUser(User user) {
		userMapper.insert(user);
		return user;
	}

	@Override
	public User updateUserPassword(Long userId, String oldPwd, String newPwd) {
		User user = getUserById(userId);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User resetUserPassword(String passwrod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User activateUser(String loginname, String code) {
//		User user = 
//		userMapper.update(entity)
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User enableUser(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User disableUser(Long userId) {
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
		return userMapper.selectAll(pager);
	}

	@Override
	public List<User> getUsersByRole(Long roleId) {
		// TODO Auto-generated method stub
		return null;
	}

}
