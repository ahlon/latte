package com.redq.latte.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.redq.latte.common.response.RestDataResponse;
import com.redq.latte.model.User;
import com.redq.latte.model.Zone;
import com.redq.latte.service.ZoneService;

import io.swagger.annotations.Api;

@Api(value = "user")
@RestController
@RequestMapping(value = "/zone", method = {RequestMethod.GET, RequestMethod.POST})
public class ZoneController {

	@Autowired
    private ZoneService zoneService;
	
	@RequestMapping("/provinces")
    public RestDataResponse<List<Zone>> listRoots() {
		// 1 represents China
		Long rootId = 1L;
		
		// TODO
		// zoneService.
        return new RestDataResponse<List<Zone>>();
    }
	
	@RequestMapping("/children")
    public RestDataResponse<List<Zone>> register(Long zoneId) {
        return new RestDataResponse<List<Zone>>();
    }
	
	
	
}
