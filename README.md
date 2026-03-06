# Use Case 6: Input Validation

## Overview

This module centralizes validation logic and introduces a structured exception hierarchy for handling invalid user input.

## Objective

Ensure all input entering the system is validated and fail fast when invalid data is detected.

## Key Concepts

* Exception Hierarchy
* Custom Checked Exceptions
* Regular Expressions
* Input Sanitization
* Fail-Fast Validation

## Actors

* All System Users
* ValidationService

## Flow

1. User enters input data.
2. Input is sanitized.
3. ValidationService applies regex rules.
4. Custom exceptions are thrown if validation fails.
5. System displays user-friendly error messages.

## Implementation Components

### ValidationException

Base class for validation-related errors.

### Child Exceptions

* EmailValidationException
* PhoneValidationException
* PasswordValidationException
* EmployeeIdValidationException

### ValidationService

Centralized validation logic.

Validates:

* Email format
* Phone number format
* Password strength
* Employee ID pattern

## Example Output

All inputs are VALID. Registration/Login can proceed.

## Benefits

* Centralized validation logic
* Consistent error messaging
* Secure input processing
* Reusable validation methods
