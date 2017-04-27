/**
 * Ouer.com Inc.
 * Copyright (c) 2014-2015 All Rights Reserved.
 */
package com.redq.latte.conf;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 
 * @author tonghu
 * @version $Id: WebConfig.java, v 0.1 2015年9月22日 下午11:02:16 tonghu Exp $
 */
@Configuration
// @EnableWebMvc
@ComponentScan
public class WebConfig extends WebMvcConfigurerAdapter {

    private static Integer MAX_PAGE_SIZE = 200;

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/swagger-ui/**").addResourceLocations("/swagger-ui/");
//    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        PageableHandlerMethodArgumentResolver resolver = new PageableHandlerMethodArgumentResolver();
        // resolver.setFallbackPageable(new PageRequest(0, 30));
        resolver.setMaxPageSize(MAX_PAGE_SIZE);
        resolver.setOneIndexedParameters(true);
        argumentResolvers.add(resolver);
        // PageableArgumentResolver resolver = new PageableArgumentResolver();
    }
    
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
    	registry.addViewController("/").setViewName("home");
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/login").setViewName("login");
    }
}