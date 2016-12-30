package com.redq.latte.common;

import org.springframework.context.ApplicationEvent;

import com.redq.latte.model.User;

public class LoginEvent extends ApplicationEvent {

	private static final long serialVersionUID = 8427619751766149730L;

	private User user;
	
	public LoginEvent(Object source) {
		super(source);
	}
	
	public LoginEvent(Object source, User user) {
		super(source);
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
