package com.redq.latte.dal.mapper;

import java.util.List;

import com.redq.latte.common.CrudMapper;
import com.redq.latte.model.Role;

public interface RoleMapper extends CrudMapper<Role> {
	
	List<Role> selectByUserId(Long userId);

}
