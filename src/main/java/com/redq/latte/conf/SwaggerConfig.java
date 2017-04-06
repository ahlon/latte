package com.redq.latte.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
 
/**
 * api doc -- springfox swagger configuration
 */
@Profile({"dev", "test"})
@Configuration
@EnableSwagger2
public class SwaggerConfig { //implements EnvironmentAware
	
	private static final String ACTUATE_CONTROLLER_PACKAGE = "org.springframework.boot.actuate.endpoint.mvc";
	
	private static final String APPLICATION_CONTROLLER_PACKAGE = "com.redq.latte.controller.api";

	@Bean
	public Docket applicationApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("1 Application API")
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage(APPLICATION_CONTROLLER_PACKAGE))
				.paths(PathSelectors.any())
				.build();
	}
	
	@Bean  
    public Docket adminApi(){  
        return new Docket(DocumentationType.SWAGGER_2)  
                .groupName("2 Admin API")
                .apiInfo(apiInfo())
                .forCodeGeneration(true)
                .pathMapping("/")
                .select()
                .apis(RequestHandlerSelectors.basePackage(ACTUATE_CONTROLLER_PACKAGE))
                .paths(paths())  
                .build()  
                .useDefaultResponseMessages(false);  
    }
	
	private Predicate<String> paths(){  
        return Predicates.and(PathSelectors.regex("/.*"), Predicates.not(PathSelectors.regex("/error")));  
    }

	private ApiInfo apiInfo() {
		Contact contact = new Contact("ahlon", "https://github.com/ahlon", "ahlon2002@gmail.coms");  
        return new ApiInfoBuilder()  
                .title("Document Api")  
                .description("latte")  
                .license("Apache License Version 2.0")  
                .contact(contact)  
                .version("2.0")  
                .build();  
    }  
}	
//    private final Logger log = LoggerFactory.getLogger(SwaggerConfig.class);
//    public static final String DEFAULT_INCLUDE_PATTERN = "/order/.*";
//    private RelaxedPropertyResolver propertyResolver;
// 
//    @Override
//    public void setEnvironment(Environment environment) {
//        this.propertyResolver = new RelaxedPropertyResolver(environment, "swagger.");
//    }
// 
//    @Bean
//    public Docket swaggerSpringfoxDocket() {
//        log.debug("Starting Swagger");
//        StopWatch watch = new StopWatch();
//        watch.start();
//        Docket swaggerSpringMvcPlugin = new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .genericModelSubstitutes(ResponseEntity.class)
//                .select()
//                .paths(regex(DEFAULT_INCLUDE_PATTERN)) // and by paths
//                .build();
//        watch.stop();
//        log.debug("Started Swagger in {} ms", watch.getTotalTimeMillis());
//        return swaggerSpringMvcPlugin;
//    }
// 
//    private ApiInfo apiInfo() {
//        return new ApiInfo(
//                propertyResolver.getProperty("title"),
//                propertyResolver.getProperty("description"),
//                propertyResolver.getProperty("version"),
//                propertyResolver.getProperty("termsOfServiceUrl"),
//                propertyResolver.getProperty("contact"),
//                propertyResolver.getProperty("license"),
//                propertyResolver.getProperty("licenseUrl")
//        );
//    }
