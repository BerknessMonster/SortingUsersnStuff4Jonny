package com.Assignment4; //methods :)

public class UserService {
	public User getValidUser(String username, String password) {
		for (User user : Application.users) {
			if (user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}

	public User getUserByUsername(String username) {
		for (User user : Application.users) {
			if (user.getUsername().equalsIgnoreCase(username)) {
				return user;
			}
		}
		return null;
	}
	
	public String getOutput(User user) {
		return user.getUsername() + ", " + user.getPassword() + ", " + user.getName() + ", " + user.getRole();
	}

}
}
