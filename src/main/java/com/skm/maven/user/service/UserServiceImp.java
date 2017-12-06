package com.skm.maven.user.service;

import com.skm.user.dao.UserDao;
import com.skm.user.model.User;

public class UserServiceImp implements UserService{

	private UserDao userDao;
	
	public UserServiceImp(UserDao userDao){
		this.userDao = userDao;
	}
	
	@Override
	public void add(User user) {
		userDao.add(user);
	}

	@Override
	public User loadByUserName(String userName) {
		return userDao.loadByUser(userName);
	}

}
