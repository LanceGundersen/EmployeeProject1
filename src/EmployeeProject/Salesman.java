package EmployeeProject;

public class Salesman extends Employee {

    private static final double commissionRate = 0.02;
    private static final double commissionCap = 20000;
    private double annualSales;

    // TODO: A constructor that allows the name, monthly salary and annual sales to be initialized.
    public Salesman(String fullName, double monthlySalary, double annualSales) {
        super(fullName, monthlySalary);
        this.annualSales = annualSales;
    }

    /* TODO: An overridden method annualSalary that returns the salary for a whole year. The salary for a salesman consists of the base salary computed from the monthly salary plus a commission. The commission is computed as 2% of that salesman's annual sales. The maximum commission a salesman can earn is $20,000. */

    @Override
    public double annualSalary() {
        double salesCommission = annualSales * commissionRate;

        if (salesCommission > commissionCap) {
            salesCommission = commissionCap;
        }

        return (year * monthlySalary) + salesCommission;
    }

    // TODO:  An overridden toString method that returns a string containing the name, monthly salary and annual sales, appropriately labeled.
    public String toString() {
        return "Salesman: " + fullName + ", Monthly Salary: $" + monthlySalary + ", Annual Sales: $" + annualSalary();
    }
}
