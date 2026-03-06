package com.employeepayrollapp.service;

import com.employeepayrollapp.employee.Employee;
import com.employeepayrollapp.exceptions.CalculationException;
import com.employeepayrollapp.payroll.Payslip;
import com.employeepayrollapp.payroll.SalaryComponents;

/*
 PayrollService contains salary calculation logic.

 Business rules should not be inside main().
*/
public class PayrollService {

    /*
     Generates a payslip by:
     - Creating salary components
     - Applying calculation rules
     - Returning a completed Payslip object
    */
    public Payslip generatePayslip(Employee employee,
                                   String month,
                                   double basic,
                                   double hra,
                                   double da,
                                   double allowances) throws CalculationException {

        SalaryComponents sc =
                new SalaryComponents(basic, hra, da, allowances);
        if (basic < 0 || hra < 0 || da < 0 || allowances < 0) {
            throw new CalculationException("Salary components cannot be negative");
        }
        // Gross salary
        double gross = basic + hra + da + allowances;
        if (gross <= 0) {
            throw new CalculationException("Gross salary must be positive");
        }
        // Statutory deductions
        sc.pf = basic * 0.12;
        sc.tax = gross * 0.10;

        // Net pay
        sc.netPay = gross - (sc.pf + sc.tax);

        return new Payslip(employee, sc, month);
    }
}