package EmployeeProject;

public class Executive extends Employee {

    private static int bonus = 30000;
    private static int stockPriceTrigger = 50;
    public int stockPrice;

    // TODO: A constructor that allows the name, monthly salary and stock price to be initialized.
    public Executive(String name, double mSalary, int sPrice) {
        super(name, mSalary);
        stockPrice = sPrice;
    }

    /* TODO: An overridden method annualSalary that returns the salary for a whole year. The salary for an executive consists of the base salary computed from the monthly salary plus a bonus. The bonus is $30,000 if the current stock price is greater than $50 and nothing otherwise */

    @Override
    public double annualSalary() {
        if (stockPrice >= stockPriceTrigger) {
            return super.annualSalary() + bonus;
        } else {
            return super.annualSalary();
        }
    }

    // TODO: An overridden toString method that returns a string containing the name, monthly salary and stock price, appropriately labeled.
    public String toString() {
        return "Executive: " + fullName + ", Monthly Salary: $" + monthlySalary + ", Stock Price: $" + stockPrice;
    }

    }
