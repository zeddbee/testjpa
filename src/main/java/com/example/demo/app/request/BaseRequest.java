package com.example.demo.app.request;

import com.example.demo.app.config.UserDetail;

public class BaseRequest {

	private UserDetail user;

	public BaseRequest(UserDetail user) {
		super();
		this.user = user;
	}

	public UserDetail getUser() {
		return user;
	}

	public void setUser(UserDetail user) {
		this.user = user;
	}

	public BaseRequest() {
		super();
	}
	
}
