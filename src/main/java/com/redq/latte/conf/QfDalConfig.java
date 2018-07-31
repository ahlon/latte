package com.redq.latte.conf;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.Resource;

// @Configuration
// @ImportResource({"classpath:config/applicationContext-dal.xml"})
// @PropertySource({"classpath:application.properties", "classpath:application-${spring.profiles.active}.properties"})
// @MapperScan("com.qf.trade.dal")
public class QfDalConfig {
	
	@Value("classpath:config/MapperConfig.xml")
	Resource mybatisMapperConfig;

    @javax.annotation.Resource(name = "qfDataSource")
	DataSource qfDataSource;

	<T> MapperFactoryBean<T> newMapperFactoryBean(Class<T> clazz) throws Exception {
		final MapperFactoryBean<T> b = new MapperFactoryBean<T>();
		b.setMapperInterface(clazz);
		b.setSqlSessionFactory(sqlSessionFactory());
		return b;
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() { 
		return new PropertySourcesPlaceholderConfigurer(); 
	} 

	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		final SqlSessionFactoryBean fb = new SqlSessionFactoryBean();
		fb.setDataSource(qfDataSource);
		fb.setConfigLocation(mybatisMapperConfig);
		// fb.setMapperLocations(mybatisMapperLocations);
		return fb.getObject();
	}
    
    
}
