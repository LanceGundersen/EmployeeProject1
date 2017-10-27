package employeeproject;

import java.text.DecimalFormat;

/**
 * Employee Model Object.
 *
 * Note that DecimalFormat is used to model the price.
 *
 * @author Lance Gundersen
 * @version 1.0
 */

public class Employee {

  private int year;
  private String fullName;
  private double monthlySalary;
  protected static DecimalFormat decimalFormat = new DecimalFormat("$0.00");
  private static final int MONTHS = 12;

  /**
   * Constructor
   *
   * A constructor that allows the name and monthly salary to be initialized
   */
  public Employee(int year, String fullName, double monthlySalary) {
    this.year = year;
    this.fullName = fullName;
    this.monthlySalary = monthlySalary;
  }

  /**
   * A method named annualSalary that returns the salary for a whole year.
   */
  public double annualSalary() {
    return this.monthlySalary * MONTHS;
  }

  /**
   * A toString method that returns a string containing the name and monthly
   * salary, appropriately labeled.
   */
  public String toString() {
    return "\nEmployee: \t\t\t\t" + this.fullName +
        "\nAnnual Salary: \t\t\t" + decimalFormat.format(this.annualSalary());
  }

}
