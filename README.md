# Use Case 5: Dashboard Display

## Overview

This module introduces interfaces and runtime behavior selection to display personalized dashboards.

## Objective

Allow different dashboard implementations to present payroll data in different ways.

## Key Concepts

* Interfaces
* Factory Pattern
* Polymorphism
* Collections Processing
* Comparator Sorting

## Actors

* Employee
* Manager

## Flow

1. User role is identified.
2. DashboardFactory selects dashboard implementation.
3. Payslip data is processed.
4. Dashboard is displayed.

## Implementation Components

### Dashboard Interface

Defines a common display contract.

### EmployeeDashboard

Displays employee-specific metrics.

Features:

* Recent payslips
* Top earnings
* Year-to-date earnings

### ManagerDashboard

Displays aggregate payroll metrics.

Features:

* Team earnings summary

### DashboardFactory

Creates dashboard objects based on user role.

## Example Output

Employee Dashboard

Recent Payslips (Top 3)
May : 34000
Apr : 33000
Feb : 32000

Year-To-Date Earnings : 160000

## Benefits

* Extensible dashboard architecture
* Runtime dashboard selection
* Clean separation of UI logic
