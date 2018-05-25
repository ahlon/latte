/**
 * Ouer.com Inc.
 * Copyright (c) 2014-2015 All Rights Reserved.
 */
package com.redq.latte.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.redq.latte.model.User;
import com.redq.latte.repository.UserRepository;

/**
 * 
 * @author tonghu
 * @version $Id: HomeController.java, v 0.1 2015年9月18日 下午7:16:41 tonghu Exp $
 */
@Controller
@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
public class HomeController {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/dashboard")
    public String home() {
		Session session = SecurityUtils.getSubject().getSession();
		
        return "home";
    }
	
	@RequestMapping("/")
    public String index() {
		Session session = SecurityUtils.getSubject().getSession();
		
		User user = userRepository.findByMobile("13606806267");
		
        return "home";
    }
	
//	@RequestMapping(value = "/login", method = RequestMethod.GET)
//    public String loginPage() {
//        return "login";
//    }

	@RequestMapping(value = "/login")
    public String login(HttpServletResponse response, String username, String password) {
		if (username != null) {
			Subject currentUser = SecurityUtils.getSubject();
			UsernamePasswordToken token = new UsernamePasswordToken(username, password); 
			// 开始进入shiro的认证流程
			currentUser.login(token);
			try {
				response.sendRedirect("dashboard");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		} else {
			return "login";
		}
		
    }
    
    @RequestMapping("/error")
    public String error() {
        return "error";
    }
    
}
