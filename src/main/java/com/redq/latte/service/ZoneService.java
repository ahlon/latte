package com.redq.latte.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.redq.latte.model.Zone;

public interface ZoneService {
	
	List<Zone> getZoneListByParent(Long parentId);

	List<Zone> getZonePath(Long zoneId);
	
	List<Zone> getAll(Pageable pager);
	
}
