package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.User;

public class UserDaoImpl implements UserDao {

	@Override
	public String createUser(User user) {
		String sqlQuery = "INSERT INTO user (user_name, password) VALUES(?, ?)";
		Connection connection = MySQLConnection.getConnection();
		Boolean bool = false;

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
			preparedStatement.setString(1, user.getUserName());
			preparedStatement.setString(2, user.getPassword());
			bool = preparedStatement.execute();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}

		if (bool == true) {
			return "Successfully Inserted the value into User DB";
		} else {
			return "Successfully Inserted the value into User DB";
		}
	}

	@Override
	public List<User> readAllUsers() {
		List<User> usersList = new ArrayList<User>();

		Connection connection = MySQLConnection.getConnection();
		Statement statement = null;
		ResultSet resultSet = null;

		String sqlQuery = "SELECT * FROM user";

		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sqlQuery);
			while (resultSet.next()) {
				String userId = resultSet.getString("user_id");
				String userName = resultSet.getString("user_name");
				String password = resultSet.getString("password");

				User user = new User();
				user.setUserId(Integer.parseInt(userId));
				user.setUserName(userName);
				user.setPassword(password);

				usersList.add(user);
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}

		return usersList;
	}

	@Override
	public User readUserById(int userId) {
		String sqlQuery = "SELECT * FROM user WHERE user_id = ?";
		Connection connection = MySQLConnection.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		User user = new User();
		try {
			preparedStatement = connection.prepareStatement(sqlQuery);
			preparedStatement.setInt(1, userId);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				user.setUserId(resultSet.getInt("user_id"));
				user.setUserName(resultSet.getString("user_name"));
				user.setPassword(resultSet.getString("password"));
			}

		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}

		return user;
	}

	@Override
	public User readUserByName(String userName) {
		String sqlQuery = "SELECT * FROM user WHERE user_name = ?";
		Connection connection = MySQLConnection.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		User user = new User();
		try {
			preparedStatement = connection.prepareStatement(sqlQuery);
			preparedStatement.setString(1, userName);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				user.setUserId(resultSet.getInt("user_id"));
				user.setUserName(resultSet.getString("user_name"));
				user.setPassword(resultSet.getString("password"));
			}

		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}

		return user;
	}

	@Override
	public String updateUserById(int userId, String value) {
		String sqlQuery = "UPDATE user SET password=? WHERE user_id=?";
		Connection connection = MySQLConnection.getConnection();
		PreparedStatement preparedStatement = null;
		int rowUpadted = 0;
		try {
			preparedStatement = connection.prepareStatement(sqlQuery);
			preparedStatement.setString(1, value);
			preparedStatement.setInt(2, userId);
			rowUpadted = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		if (rowUpadted > 0) {
			return "Successfully updated existing user by Id";
		} else {
			return "Failed to update existing user user by Id";
		}
	}

	@Override
	public String updateUserByName(String userName, String value) {
		String sqlQuery = "UPDATE user SET password=? WHERE user_name=?";
		Connection connection = MySQLConnection.getConnection();
		PreparedStatement preparedStatement = null;
		int rowUpadted = 0;
		try {
			preparedStatement = connection.prepareStatement(sqlQuery);
			preparedStatement.setString(1, value);
			preparedStatement.setString(2, userName);
			rowUpadted = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		if (rowUpadted > 0) {
			return "Successfully updated existing user by name";
		} else {
			return "Failed to update existing user user by name";
		}
	}

	@Override
	public String deleteUserById(int userId) {
		String sqlQuery = "DELETE FROM user WHERE user_id=?";
		Connection connection = MySQLConnection.getConnection();
		PreparedStatement preparedStatement = null;
		int rowUpadted = 0;
		try {
			preparedStatement = connection.prepareStatement(sqlQuery);
			preparedStatement.setInt(1, userId);
			rowUpadted = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		if (rowUpadted > 0) {
			return "Successfully delete existing user by Id";
		} else {
			return "Failed to delete existing user user by Id";
		}
	}

	@Override
	public String deleteUserByName(String userName) {
		String sqlQuery = "DELETE FROM user WHERE user_name=?";
		Connection connection = MySQLConnection.getConnection();
		PreparedStatement preparedStatement = null;
		int rowUpadted = 0;
		try {
			preparedStatement = connection.prepareStatement(sqlQuery);
			preparedStatement.setString(1, userName);
			rowUpadted = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		if (rowUpadted > 0) {
			return "Successfully delete existing user by Name";
		} else {
			return "Failed to delete existing user user by Name";
		}
	}

	@Override
	public String validateUsernameAndPassword(String userName, String password) {
		String result = "username and password didn't match, try again!!!";
		String sqlQuery = "SELECT user_name, password from user";
		Connection connection = MySQLConnection.getConnection();
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sqlQuery);
			while (resultSet.next()) {
				if(resultSet.getString("user_name").equalsIgnoreCase(userName) && resultSet.getString("password").equalsIgnoreCase(password)) {
					result = "username and password matched successfully :) :)";
				}
			}

		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}

		return result;
	}

}
