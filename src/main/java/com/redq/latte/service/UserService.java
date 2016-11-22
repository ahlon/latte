package com.redq.latte.service;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;

import com.redq.latte.model.User;

@Validated
public interface UserService {
	
	/**
	 * create user
	 * @param user
	 * @return
	 */
	User createUser(User user);
	
	/**
	 * user change password
	 * @param userId
	 * @param oldPwd
	 * @param newPwd
	 * @return
	 */
	User updateUserPassword(Long userId, String oldPwd, String newPwd);
	
	/**
	 * reset user password by administrator
	 * @param passwrod
	 * @return
	 */
	User resetUserPassword(String passwrod);
	
	/**
	 * activate user for new registered user
	 * @param userId
	 * @return
	 */
	User activateUser(Long userId);
	
	/**
	 * enable user, user can login system and operate normally
	 * @param userId
	 * @return
	 */
	User enableUser(Long userId);
	
	/**
	 * disable user, user can not login or do anyting in the system until it is unfrozen
	 * @param userId
	 * @return
	 */
	User disableUser(Long userId);
	
	/**
	 * remove user logically not physically, the data is archived in db, but not show in the system
	 * @param id
	 * @return
	 */
	User deleteUser(@NotNull Long id);

	/**
	 * get user by primary key id
	 * @param id
	 * @return
	 */
    User getUserById(@NotNull Long id);
    
    /**
	 * get user by primary key id
	 * @param id
	 * @return
	 */
    User getUserByLoginname(String loginname);
    
    /**
     * get users by role
     * @param roleId
     * @return
     */
    List<User> getUsersByRole(Long roleId);
    
    /**
	 * search and list users by conditions
	 * @param id
	 * @return
	 */
    List<User> findUsers(Pageable pager);

}
