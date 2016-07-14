/**
 * Ouer.com Inc.
 * Copyright (c) 2014-2015 All Rights Reserved.
 */
package com.redq.latte.conf;

/**
 * 
 * @author tonghu
 * @version $Id: SwaggerConfig.java, v 0.1 2015年11月17日 下午7:05:50 tonghu Exp $
 */
import static springfox.documentation.builders.PathSelectors.regex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StopWatch;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
 
/**
 * api doc -- springfox swagger configuration
 */
@Profile({"dev", "test"})
@Configuration
@EnableSwagger2
public class SwaggerConfig implements EnvironmentAware {
    private final Logger log = LoggerFactory.getLogger(SwaggerConfig.class);
    public static final String DEFAULT_INCLUDE_PATTERN = "/order/.*";
    private RelaxedPropertyResolver propertyResolver;
 
    @Override
    public void setEnvironment(Environment environment) {
        this.propertyResolver = new RelaxedPropertyResolver(environment, "swagger.");
    }
 
    @Bean
    public Docket swaggerSpringfoxDocket() {
        log.debug("Starting Swagger");
        StopWatch watch = new StopWatch();
        watch.start();
        Docket swaggerSpringMvcPlugin = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .genericModelSubstitutes(ResponseEntity.class)
                .select()
                .paths(regex(DEFAULT_INCLUDE_PATTERN)) // and by paths
                .build();
        watch.stop();
        log.debug("Started Swagger in {} ms", watch.getTotalTimeMillis());
        return swaggerSpringMvcPlugin;
    }
 
    private ApiInfo apiInfo() {
        return new ApiInfo(
                propertyResolver.getProperty("title"),
                propertyResolver.getProperty("description"),
                propertyResolver.getProperty("version"),
                propertyResolver.getProperty("termsOfServiceUrl"),
                propertyResolver.getProperty("contact"),
                propertyResolver.getProperty("license"),
                propertyResolver.getProperty("licenseUrl")
        );
    }
}