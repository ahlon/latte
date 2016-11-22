package com.redq.latte.service;

import java.util.List;

import com.redq.latte.model.Zone;

public interface ZoneService {
	
	List<Zone> getZoneListByParent(Long parentId);
	
}
