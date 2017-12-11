package com.saket.service;

import com.saket.entity.User;


public interface UserFacade {
public boolean createUser(User user);

public User searchUser(String user_name);

public User changePassword(String password);
	
}
