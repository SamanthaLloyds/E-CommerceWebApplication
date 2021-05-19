package com.sw409.FairfieldUstore.Database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import com.sw409.FairfieldUstore.Util.ConnectionPool;
import com.sw409.FairfieldUstore.models.User;

public class DatabaseService {

	private static ConnectionPool connectionPool;

	public DatabaseService() {
		try {
			getInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public synchronized static ConnectionPool getInstance() throws SQLException {
		if (connectionPool == null) {
			connectionPool = new ConnectionPool();
		}
		return connectionPool;
	}

	public int findUserId(User user) {
		int userId = 0;
		Connection connection = null;
		try {
			String query = "{CALL GET_USER_FROM_ID(?,?,?)}";
			connection = connectionPool.checkout();
			CallableStatement statement = connection.prepareCall(query);
			statement.setString(1, user.getUsername());
			statement.setString(2, user.getPassword());
			statement.registerOutParameter(3, Types.INTEGER);
			statement.execute();
			userId = statement.getInt(3);
		} catch (Exception e) {
			System.out.println("Error getting user id for username " + user.getUsername());
		} finally {
			connectionPool.checkin(connection);
		}
		return userId;
	}

	public User findUserFromUsername(String username) {
		User user = null;
		Connection connection = null;
		try {
			String query = "{CALL get_user_from_username(?)}";
			ResultSet resultSet;
			connection = connectionPool.checkout();
			CallableStatement statement = connection.prepareCall(query);
			statement.setString(1,username);
			resultSet = statement.executeQuery();
			if(resultSet.next()) {

				
				user = getUser(resultSet);
			}
			else {
				System.out.print("Error");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			connectionPool.checkin(connection);
		}
		return user;
	}

	public User getUser(ResultSet resultSet) {
		User user = new User();
		try {
			user.setId(resultSet.getInt(1));
			user.setUsername(resultSet.getString(3));
			user.setPassword(resultSet.getString(2));
			
		} catch (SQLException e) {
			System.out.println("Error reading from user table");
		}
		return user;
	}

}