package com.Assignment4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ApplicationRunnable {
	Static User [] users = new User[20];
	UserService userService = new UserService();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		//Array
		Users[] users = new User[20];
		
		for (int i = 0; i < 20; i++) {
			users[i] = userService.createUser("user" + (i+1), "password" + (i+1), )

	static Scanner scanner = new Scanner(System.in);System.out.println("To login enter your username");
	String username = scanner.next();System.out.println("Enter your password");
	String password = scanner.next();System.out.println("Welcome"+name);}System.out.println(users);

	}
	
	BufferedWriter writer = null;
	try {
		writer = new BuffereddWriter(new FileWriter("users.txt"));
		Array.sort(users);
		
		for 
		
		
		Finally {
			if (writer ! = null) {
				Writer.close();
			}
		}
	}

	
	
	
	
	
	
	// once logged in

	public static int multipleUsernamesToUpdate() {
		System.out.println("Which user would you like to login as? (Type in a valid username)");
		String usernameToUpdate = scanner.nextLine();
		return usernameToUpdate;
	}

	public static int multipleUpdateNames(User loggedInUser) {
		System.out.println("Please type in your new name: ");
		String name = scanner.nextLine();
		loggedInUser.setName(name);
	}

	

	public static int
	multipleUpdateUsername(User loggedInUser) {
		System.out.println("Please type in your new username: ");
		String username = scanner.nextLine();
		loggedInUser.setUsername(username);
	}
	public static int multipleUpdatePassword(User loggedInUser) {
		System.out.println("Please type in your new password: ");
		String password = scanner.nextLine();
		loggedInUser.setPassword(password);
	}
	public static int multipleOptions(User loggedInUser) {
		System.out.println("_______________________________");
		System.out.println("Please choose from the following options:");
		if (loggedInUser instanceof SuperUser) {
			System.out.println("(0) Log in as another user ");
		}
		System.out.println("(1) Update username");
		System.out.println("(2) Update password");
		System.out.println("(3) Update name");
		System.out.println("(4) Exit");
		String option = scanner.nextLine();
		
	
	}
}
