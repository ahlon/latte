package com.redq.latte.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.redq.latte.common.LoginEvent;
import com.redq.latte.common.response.RestDataResponse;
import com.redq.latte.common.response.RestListDataResponse;
import com.redq.latte.model.User;
import com.redq.latte.model.Zone;
import com.redq.latte.service.ZoneService;

import io.swagger.annotations.Api;

@Api(value = "zone")
@RestController
@RequestMapping(value = "/api/zone")
public class ZoneController {

	@Autowired
    private ZoneService zoneService;
	
	@Autowired  
    private ApplicationContext applicationContext;
	
	private static long ROOT_ZONE_ID = 1L;
	
	@RequestMapping(value = "/provinces", method = RequestMethod.GET)
    public RestDataResponse<List<Zone>> listRoots() {
		List<Zone> zones = zoneService.getZoneListByParent(ROOT_ZONE_ID);
		
		applicationContext.publishEvent(new LoginEvent(new User()));
        
		return new RestDataResponse<List<Zone>>(zones);
    }
	
	@RequestMapping(value = "/children", method = RequestMethod.GET)
    public RestDataResponse<List<Zone>> register(Long zoneId) {
		List<Zone> zones = zoneService.getZoneListByParent(zoneId);
        return new RestDataResponse<List<Zone>>(zones);
    }
	
	@RequestMapping(value = "/path", method = RequestMethod.GET)
    public RestDataResponse<List<Zone>> path(Long zoneId) {
		List<Zone> zones = zoneService.getZonePath(zoneId);
        return new RestDataResponse<List<Zone>>(zones);
    }
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
    public RestListDataResponse<List<Zone>> list(Pageable pager) {
		List<Zone> zones = zoneService.getAll(pager);
        return new RestListDataResponse(zones, pager);
    }
	
}
