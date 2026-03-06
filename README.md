# Use Case 3: Payslip Generation

## Overview

This module introduces payroll calculation and object collaboration using aggregation and composition relationships.

## Objective

Generate a monthly payslip containing salary components and deductions while keeping calculation logic separate from data representation.

## Key Concepts

* Aggregation
* Composition
* Service Layer
* Business Logic Separation
* Method Overriding

## Actors

* Employee
* PayrollService

## Flow

1. Employee information is provided.
2. Salary components are created.
3. PayrollService calculates deductions.
4. Payslip object is generated.
5. Payslip is displayed.

## Implementation Components

### Employee (Aggregation)

Payslip references Employee but does not own it.

### SalaryComponents (Composition)

Groups all salary values.

Fields:

* Basic Salary
* HRA
* DA
* Allowances
* PF
* Tax
* Net Pay

### PayrollService

Responsible for salary calculations.

Rules:
PF = 12% of Basic
Tax = 10% of Gross Salary

### Payslip

Combines Employee and SalaryComponents into a readable salary statement.

## Example Output

Month : January
Employee ID : EMP-0001
Employee Name : John David

Basic Salary : 50000
HRA : 10000
DA : 5000

Net Pay : 54300

## Benefits

* Clean separation between logic and data
* Demonstrates aggregation and composition
* Encapsulates payroll calculations
