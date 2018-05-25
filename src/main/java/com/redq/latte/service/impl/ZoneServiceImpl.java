package com.redq.latte.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.redq.latte.mapper.ZoneMapper;
import com.redq.latte.model.Zone;
import com.redq.latte.service.ZoneService;

@Service
public class ZoneServiceImpl implements ZoneService {
	
	@Autowired
	private ZoneMapper zoneMapper;

	@Override
	public List<Zone> getZoneListByParent(Long parentId) {
		return zoneMapper.selectByParentId(parentId);
	}

	@Override
	public List<Zone> getZonePath(Long zoneId) {
		Zone zone = zoneMapper.selectById(zoneId);
		String[] idStrs = zone.getPath().split(">");
		List<Zone> zoneList = new ArrayList<Zone>();
		for (String idStr : idStrs) {
			Zone z = zoneMapper.selectById(Long.parseLong(idStr));
			zoneList.add(z);
		}
		return zoneList;
	}

	@Override
	public List<Zone> getAll(Pageable pager) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
