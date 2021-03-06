package com.redq.latte.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.redq.latte.common.BaseService;
import com.redq.latte.mapper.RoleMapper;
import com.redq.latte.mapper.UserMapper;
import com.redq.latte.model.User;
import com.redq.latte.service.UserService;

@Service
public class UserServiceImpl extends BaseService implements UserService { // UserDetailsService {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserMapper userMapper;

	@Autowired
	private RoleMapper roleMapper;
	
	@Override
	public User createUser(User user) {
		userMapper.insert(user);
		return user;
	}

	@Override
	public User updateUserPassword(Long userId, String oldPwd, String newPwd) {
		// User user = getUserById(userId);
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
		return userMapper.selectByLoginname(loginname);
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

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		User user = userMapper.selectByLoginname(username);
//        if (user == null) {
//            throw new UsernameNotFoundException("not found");
//        }
//        List<Role> roles = roleMapper.selectByUserId(user.getId());
//        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
//        for (Role role : roles) {
//        	authorities.add(new SimpleGrantedAuthority(role.getName()));
//        	logger.info("user: " + username + ", role: " + role.getName());
//		}
//        
//        return new org.springframework.security.core.userdetails.User(user.getLoginname(),
//                user.getPassword(), authorities);
//	}

}
