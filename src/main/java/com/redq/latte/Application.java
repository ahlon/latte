package com.redq.latte;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@EnableAutoConfiguration
@SpringBootApplication
public class Application {
    
    private static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
    	System.out.println("user.dir : "+System.getProperty("user.dir"));
    	System.out.println("user.home : "+System.getProperty("user.home"));
    	
        ApplicationContext ctx = SpringApplication.run(Application.class, args);  
        String[] activeProfiles = ctx.getEnvironment().getActiveProfiles();  
        for (String profile : activeProfiles) {
            logger.info("Spring Boot using profile:{}" , profile);
        }
    }
}