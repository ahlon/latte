/**
 * Ouer.com Inc.
 * Copyright (c) 2014-2015 All Rights Reserved.
 */
package com.redq.latte.controller.api;

import io.swagger.annotations.Api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.redq.latte.common.response.RestDataResponse;
import com.redq.latte.controller.Person;
import com.redq.latte.model.common.Term;
import com.redq.latte.service.CategoryService;

/**
 * 
 * @author tonghu
 * @version $Id: HomeController.java, v 0.1 2015年9月18日 下午7:16:41 tonghu Exp $
 */
@Api(value = "home")
@RestController
@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
public class HomeController {
    
    @Autowired
    private CategoryService categoryService;
    
    @RequestMapping("/api/test")
    public Person index() {
        Person p = new Person();
        p.setName("ahlon");
        p.setAge(30);
        return p;
    }
    
    @RequestMapping("/terms")
    public RestDataResponse<List<Term>> listTerms() {
        return new RestDataResponse<List<Term>>(categoryService.listTerms());
    }
    
}
