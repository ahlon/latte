package com.redq.latte.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.redq.latte.model.status.UserStatus;

@Entity
public class User extends BaseEntity {
	
	private static final long serialVersionUID = 5732916347208229647L;
	
	@Column
	private String mobile;
	
	@Column
	private String nickname;

	@Column
	private String password;
 
	@Column
	private String salt;

	@Column
	private UserStatus status;

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserStatus getStatus() {
		return status;
	}

	public void setStatus(UserStatus status) {
		this.status = status;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

}
