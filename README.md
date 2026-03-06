# Use Case 1: Employee Registration

## Overview

This module introduces the foundation of the Employee Payroll System by implementing employee registration. It focuses on strong object-oriented design principles and proper data validation before persisting employee data.

## Objective

Register employees with validated information while demonstrating core OOP concepts such as encapsulation, validation logic separation, and object construction.

## Key Concepts

* Encapsulation
* Constructor Overloading
* Object Creation
* Regular Expression Validation
* File Persistence
* Separation of Concerns

## Actors

* Employee
* System

## Flow

1. User enters employee details.
2. Input is sanitized and validated.
3. Employee object is created.
4. Employee data is stored in a file.
5. System confirms successful registration.

## Implementation Components

### Employee

Represents the employee entity.

Fields:

* Employee ID
* Name
* Email
* Phone
* Salary

Responsibilities:

* Hold employee data
* Provide getter methods
* Maintain encapsulation

### ValidationService

Centralized validation logic using regular expressions.

Validates:

* Employee ID pattern
* Email format
* Phone number format

### File Persistence

Employee records are written to a text file to simulate data storage.

## Example Output

Employee Registered Successfully

Employee ID : EMP-0001
Name : John David
Email : [john@email.com](mailto:john@email.com)
Phone : 9876543210
Salary : 50000

## Benefits

* Prevents invalid data entry
* Demonstrates clean object creation
* Introduces reusable validation utilities
* Ensures consistent data formatting
