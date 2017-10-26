package EmployeeProject;

public class Employee {

    protected String fullName;
    protected double monthlySalary;
    protected static int year = 12;

    // TODO: A constructor that allows the name and monthly salary to be initialized
    public Employee(String fullName, double monthlySalary) {
        this.fullName = fullName;
        this.monthlySalary = monthlySalary;
    }

    // TODO: A method named annualSalary that returns the salary for a whole year.
    public double annualSalary() {
        return monthlySalary * year;
    }


    // TODO: A toString method that returns a string containing the name and monthly salary, appropriately labeled.
    public String toString() {
        return "Employee: " + fullName + ", Monthly Salary: $" + monthlySalary;
    }

}
