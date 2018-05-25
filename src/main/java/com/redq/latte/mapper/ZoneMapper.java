package com.redq.latte.mapper;

import java.util.List;

import com.redq.latte.common.CrudMapper;
import com.redq.latte.model.Zone;

public interface ZoneMapper extends CrudMapper<Zone> {
	
	List<Zone> selectByParentId(Long parentId);

}
