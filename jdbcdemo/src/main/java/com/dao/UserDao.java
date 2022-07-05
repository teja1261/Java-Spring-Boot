package com.dao;

import java.util.List;

import com.model.User;

public interface UserDao {

	//	CRUD Operations
	public abstract String createUser(User user);

	public abstract List<User> readAllUsers();

	public abstract User readUserById(int userId);

	public abstract User readUserByName(String userName);
	
	public abstract String updateUserById(int userId, String value);
	
	public abstract String updateUserByName(String userName, String value);

	public abstract String deleteUserById(int userId);

	public abstract String deleteUserByName(String userName);
	
	public abstract String validateUsernameAndPassword(String userName, String password);
}
