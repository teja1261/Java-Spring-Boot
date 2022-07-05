package com.main;
import java.util.List;

import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.model.User;

public class DbMainApp {

	public static void main(String[] args) {
		UserDao dao = new UserDaoImpl();
		
//		//Create new user to DB
//		User user = new User("Bhargav", "bhargav@123");
//		String createStr = dao.createUser(user);
//		System.out.println(createStr);
//		
//		System.out.println();
//		
		//Read all the users from DB
		List<User> users = dao.readAllUsers();
		
		users.stream().forEach(arg -> {
			String output1 = "User #%s:- %s - %s";
			System.out.println(String.format(output1, arg.getUserId(), arg.getUserName(), arg.getPassword()));
		});
		
		System.out.println();
		
		//Read user by Id from DB
		User fetchUserById = dao.readUserById(12);
		if(fetchUserById != null) {
			String output2 = "User #%s:- %s - %s";
			System.out.println(String.format(output2, fetchUserById.getUserId(), fetchUserById.getUserName(), fetchUserById.getPassword()));
		}
		
		System.out.println();
		
		//Read user by Id from DB
		User fetchUserByName = dao.readUserByName("Teja");
		if(fetchUserByName != null) {
			String output3 = "User #%s:- %s - %s";
			System.out.println(String.format(output3, fetchUserByName.getUserId(), fetchUserByName.getUserName(), fetchUserByName.getPassword()));
		}
		
		System.out.println();
		
		//update user by Id From DB
		String updateUserById = dao.updateUserById(11, "teja@123");
		System.out.println(updateUserById);
		
		System.out.println();
		
		//update user by Name From DB
		String updateUserByName = dao.updateUserByName("Sindhu", "sindhu@123");
		System.out.println(updateUserByName);
		
		System.out.println();
		
		//delete the user by Id from DB;
		String deleteUserById = dao.deleteUserById(25);
		System.out.println(deleteUserById);
		
		System.out.println();
		
		//delete the user by Id from DB;
		String deleteUserByName = dao.deleteUserByName("Bhargav");
		System.out.println(deleteUserByName);
		
		System.out.println();
		
		//validating username and password from DB
		String validateUser = dao.validateUsernameAndPassword("Bhanu", "bhanu@123");
		System.out.println(validateUser);

	}

}
