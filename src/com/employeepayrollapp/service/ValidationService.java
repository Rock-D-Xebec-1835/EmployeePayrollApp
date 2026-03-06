package com.employeepayrollapp.service;

import java.util.regex.Pattern;

import com.employeepayrollapp.exceptions.*;

/*
 ValidationService contains all input validation rules.

 This class represents a defensive boundary between
 user input and application logic.
*/
public class ValidationService {

    /*
     Sanitizes input before validation.

     Purpose:
     - Remove accidental spaces
     - Ensure consistent validation behavior
    */
    private static String sanitize(String input) {

        if (input == null) {
            return "";
        }

        return input.trim();
    }


    public static void validateEmail(String email)
            throws EmailValidationException {

        email = sanitize(email);

        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        if (!Pattern.matches(regex, email)) {
            throw new EmailValidationException(
                    "Invalid email format."
            );
        }
    }


    public static void validatePhone(String phone)
            throws PhoneValidationException {

        phone = sanitize(phone);

        String regex = "^[6-9]\\d{9}$";

        if (!Pattern.matches(regex, phone)) {
            throw new PhoneValidationException(
                    "Phone must be a valid 10 digit number."
            );
        }
    }


    public static void validatePassword(String password)
            throws PasswordValidationException {

        password = sanitize(password);

        if (password.length() < 8) {

            throw new PasswordValidationException(
                    "Password must contain at least 8 characters."
            );
        }

        String regex =
                "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&]).+$";

        if (!Pattern.matches(regex, password)) {

            throw new PasswordValidationException(
                    "Password must contain upper, lower, number and special character."
            );
        }
    }


    public static void validateEmployeeId(String empId)
            throws EmployeeIdValidationException {

        empId = sanitize(empId);

        String regex = "^EMP-\\d{4}$";

        if (!Pattern.matches(regex, empId)) {

            throw new EmployeeIdValidationException(
                    "Employee ID must follow pattern EMP-XXXX."
            );
        }
    }
}