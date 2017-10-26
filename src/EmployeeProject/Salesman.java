package EmployeeProject;

public class Salesman extends Employee {

    private static double commissionRate = 0.02;
    public double annualSales;

    // TODO: A constructor that allows the name, monthly salary and annual sales to be initialized.
    public Salesman(String name, double mSalary, double aSales) {
        super(name, mSalary);
        annualSales = aSales;
    }

    /* TODO: An overridden method annualSalary that returns the salary for a whole year. The salary for a salesman consists of the base salary computed from the monthly salary plus a commission. The commission is computed as 2% of that salesman's annual sales. The maximum commission a salesman can earn is $20,000. */

    @Override
    public double annualSalary() {
        double yearSalary = super.annualSalary();
        return yearSalary * commissionRate;
    }

    // TODO:  An overridden toString method that returns a string containing the name, monthly salary and annual sales, appropriately labeled.
    public String toString() {
        return "Salesman: " + fullName + ", Monthly Salary: $" + monthlySalary + ", Annual Sales: $" + annualSalary();
    }
}
