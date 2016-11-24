package com.redq.latte.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.redq.latte.common.response.RestDataResponse;
import com.redq.latte.model.Zone;
import com.redq.latte.service.ZoneService;

import io.swagger.annotations.Api;

@Api(value = "zone")
@RestController
@RequestMapping(value = "/zone", method = {RequestMethod.GET, RequestMethod.POST})
public class ZoneController {

	@Autowired
    private ZoneService zoneService;
	
	@RequestMapping("/provinces")
    public RestDataResponse<List<Zone>> listRoots() {
		Long rootId = 1L;
		List<Zone> zones = zoneService.getZoneListByParent(rootId);
        return new RestDataResponse<List<Zone>>(zones);
    }
	
	@RequestMapping("/children")
    public RestDataResponse<List<Zone>> register(Long zoneId) {
		List<Zone> zones = zoneService.getZoneListByParent(zoneId);
        return new RestDataResponse<List<Zone>>(zones);
    }
	
	@RequestMapping("/path")
    public RestDataResponse<List<Zone>> path(Long zoneId) {
		List<Zone> zones = zoneService.getZonePath(zoneId);
        return new RestDataResponse<List<Zone>>(zones);
    }
	
	
	
}
