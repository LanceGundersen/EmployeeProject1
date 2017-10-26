package EmployeeProject;

public class Executive extends Employee {

    protected static int bonus = 30000;
    protected static int stockPriceTrigger = 50;
    private int stockPrice;

    // TODO: A constructor that allows the name, monthly salary and stock price to be initialized.
    public Executive(String fullName, double monthlySalary, int stockPrice) {
        super(fullName, monthlySalary);
        this.stockPrice = stockPrice;
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
