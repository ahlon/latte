/**
 * Ouer.com Inc.
 * Copyright (c) 2014-2015 All Rights Reserved.
 */
package com.redq.latte.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.redq.latte.common.response.RestDataResponse;
import com.redq.latte.model.common.Term;
import com.redq.latte.service.CategoryService;

import io.swagger.annotations.Api;

/**
 * 
 * @author tonghu
 * @version $Id: HomeController.java, v 0.1 2015年9月18日 下午7:16:41 tonghu Exp $
 */
@Api(value = "api")
@RestController
@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
public class ApiController {
    
    @Autowired
    private CategoryService categoryService;
    
    @RequestMapping("/terms")
    public RestDataResponse<List<Term>> listTerms() {
        return new RestDataResponse<List<Term>>(categoryService.listTerms());
    }
    
}
