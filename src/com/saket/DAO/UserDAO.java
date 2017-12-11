package com.saket.DAO;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.*;

import com.saket.entity.User;
import com.saket.helper.DbConnection;
import com.saket.helper.DbQueries;

public class UserDAO {
	Connection connection = null;
	DbQueries dbquery = null;
	PreparedStatement preparedstatement = null;
	ResultSet res = null;

	public UserDAO() {
		ApplicationContext applicationcontext = new ClassPathXmlApplicationContext("applicationContext.xml");
		dbquery = (DbQueries) applicationcontext.getBean("SqlBean");
	}

	public boolean createUser(User user) {
		try {
			connection = DbConnection.crteateConnection();
			preparedstatement = connection.prepareStatement(dbquery.getInsertQuery());
			preparedstatement.setString(1, user.getUser_name());
			preparedstatement.setString(2,user.getPassword());
			preparedstatement.executeUpdate();
			connection.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public User searchUser(String user_name) {
		User user = new User();
		try {
			connection = DbConnection.crteateConnection();
			preparedstatement = connection.prepareStatement(dbquery.getSearchQuery());
			preparedstatement.setString(1,user_name);
//			preparedstatement.setString(2,user.getPassword());
			res = preparedstatement.executeQuery();
			while(res.next()){
				user.setUser_name(res.getString("user_name"));
				user.setPassword(res.getString("password"));
			}
			connection.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		
	}
		return user;
	}
   public User changePassword(String password){
	   User user = new User();
	   try {
	   connection = DbConnection.crteateConnection();
	   preparedstatement = connection.prepareStatement(dbquery.getChangePasswordQuery());
	   preparedstatement.
   }
	   connection.close();
	   
   }catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
		
}
}

