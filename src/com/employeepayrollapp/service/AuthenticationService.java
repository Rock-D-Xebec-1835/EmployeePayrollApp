package com.employeepayrollapp.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.employeepayrollapp.employee.Manager;
import com.employeepayrollapp.employee.RegularEmployee;
import com.employeepayrollapp.employee.Session;
import com.employeepayrollapp.employee.User;
import com.employeepayrollapp.exceptions.*;

public class AuthenticationService {

    // Map storing users with username as key
    private Map<String, User> users = new HashMap<>();

    // Maximum login attempts allowed
    private int maxAttempts = 3;

    public AuthenticationService() {

        // Default users for demonstration
        users.put("emp1", new RegularEmployee("emp1", "Emp01234"));
        users.put("manager1", new Manager("manager1", "Mng01234"));
    }


    /*
     Registers a new user account.
     Called when employee registration happens.
    */
    public void registerUser(String username, String password) throws AuthenticationException{

        if (users.containsKey(username)) {
        	throw new AuthenticationException("User Already Exists");
        }

        users.put(username, new RegularEmployee(username, password));

        System.out.println("User account created successfully.");
    }


    /*
     Handles login flow.
    */
    public Session login() throws AuthenticationException{

        Scanner scanner = new Scanner(System.in);

        int attempts = 0;

        while (attempts < maxAttempts) {

            System.out.print("Username: ");
            String username = scanner.nextLine();

            System.out.print("Password: ");
            String password = scanner.nextLine();

            User user = users.get(username);

            if (user == null) {
            	throw new AuthenticationException("User not found");
            }

            // Polymorphism happens here
            if (user.authenticate(username, password)) {

                System.out.println("Login successful.");

                Session session = new Session(username);

                showDashboard(user.getRole());

                return session;
            }

            attempts++;

            System.out.println("Invalid credentials. Attempts left: " + (maxAttempts - attempts));
        }

        throw new AuthenticationException("Maximum login attempts exceeded");

    }


    /*
     Shows dashboard based on role.
    */
    private void showDashboard(String role) {

        if (role.equals("MANAGER")) {
            System.out.println("Manager Dashboard Loaded.");
        } else {
            System.out.println("Employee Dashboard Loaded.");
        }
    }
}