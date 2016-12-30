package com.redq.latte.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class LoginListener implements ApplicationListener<LoginEvent> {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Async
	@Override
	public void onApplicationEvent(LoginEvent event) {
		// TODO Auto-generated method stub
		logger.info(event.toString());
	}

}
