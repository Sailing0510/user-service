package com.skm.maven.user.service;

import com.skm.user.model.User;

public interface UserService {
	
	public void add(User user);
	
	public User loadByUserName(String userName);
}
	