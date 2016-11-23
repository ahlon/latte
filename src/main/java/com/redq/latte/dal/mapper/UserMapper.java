package com.redq.latte.dal.mapper;

import org.apache.ibatis.annotations.Param;

import com.redq.latte.common.CrudMapper;
import com.redq.latte.model.User;

public interface UserMapper extends CrudMapper<User> {
	
	User selectByLoginname(@Param("loginname") String loginname);
	
}