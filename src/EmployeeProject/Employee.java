package EmployeeProject;

public class Employee {

    public String fullName;
    public double monthlySalary;
    public static int year = 12;

    // TODO: A constructor that allows the name and monthly salary to be initialized
    public Employee(String name, double mSalary) {
        fullName = name;
        monthlySalary = mSalary;
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
