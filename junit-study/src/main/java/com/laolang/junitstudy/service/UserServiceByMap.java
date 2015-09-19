package com.laolang.junitstudy.service;

import java.util.HashMap;
import java.util.Map;

import com.laolang.junitstudy.model.User;
import com.laolang.junitstudy.model.UserException;

public class UserServiceByMap implements IUserService{
	
	

	public void add(User user) {
		if( null != load(user.getUsername())){
			throw new UserException("用户已存在");
		}
		
		us.put(user.getUsername(), user);
	}


	public void delete(String username) {
		us.remove(username);
	}

	public User load(String username) {
		return us.get(username);
	}

	public User login(String username, String password) {
		User user = load(username);
		if( null == user ){
			throw new UserException("用户名不存在");
		}
		
		if( !password.equals(user.getPassword())){
			throw new UserException("用户密码错误");
		}
		return user;
	}

	
	
	private Map<String, User> us = new HashMap<String, User>(); 
}
