/**
 * Ouer.com Inc.
 * Copyright (c) 2014-2015 All Rights Reserved.
 */
package com.redq.latte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author tonghu
 * @version $Id: HomeController.java, v 0.1 2015年9月18日 下午7:16:41 tonghu Exp $
 */
@Controller
@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
public class HomeController {
	
	@RequestMapping("/home")
    public String home() {
        return "home";
    }
    
    @RequestMapping("/login")
    public String login(String username, String password) {
        return "login";
    }
    
    @RequestMapping("/error")
    public String error() {
        return "error";
    }
    
    @RequestMapping("/category")
    public String category() {
        return "category";
    }
    
}
