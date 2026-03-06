# Use Case 2: Employee Authentication & Login

## Overview

This module introduces authentication and role-based user management using inheritance and polymorphism.

## Objective

Allow users to log in securely and demonstrate how different user roles share common behavior through abstraction.

## Key Concepts

* Inheritance
* Polymorphism
* Abstract Classes
* Password Hashing
* Session Management
* Role-Based Access

## Actors

* Employee
* Manager

## Flow

1. User enters login credentials.
2. Password is hashed and compared with stored hash.
3. AuthenticationService validates credentials.
4. Session object is created.
5. Dashboard is displayed based on role.

## Implementation Components

### Abstract User Class

Defines shared properties and authentication behavior.

Fields:

* username
* passwordHash
* role

Method:
authenticate()

### RegularEmployee

Extends User and implements employee-specific authentication.

### Manager

Extends User and represents management users.

### PasswordUtil

Handles password hashing before storing credentials.

### Session

Represents an active user login session and manages session expiry.

## Example Output

Login Successful

Employee Dashboard Loaded

Session active for user: emp1

## Benefits

* Demonstrates runtime polymorphism
* Supports multiple user roles
* Introduces session-based authentication
