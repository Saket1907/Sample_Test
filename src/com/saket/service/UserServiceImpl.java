package com.saket.service;

import com.saket.DAO.UserDAO;
import com.saket.entity.User;

public class UserServiceImpl implements UserFacade {

	@Override
	public boolean createUser(User user) {
		UserDAO dao = new UserDAO();
		dao.createUser(user);
		return false;
	}

	@Override
	public User searchUser(String user_name) {
		UserDAO dao = new UserDAO();
		User user = dao.searchUser(user_name);

		return user;
	}

	@Override
	public User changePassword(String password) {
		UserDAO dao = new UserDAO();
		
		return null;
	}

}
