package employeeproject;

public class Salesman extends Employee {

  private double annualSales;
  private static final double COMMISSION_RATE = 0.02;
  private static final int COMMISSION_MAX = 20000;

  /**
   * Constructor
   *
   * A constructor that allows the name, monthly salary and annual sales to be initialized.
   */
  public Salesman(int year, String fullName, double monthlySalary, double annualSales) {
    super(year, fullName, monthlySalary);
    this.annualSales = annualSales;
  }

  /**
   * An overridden method annualSalary that returns the salary for a whole year.
   *
   * The salary for a salesman consists of the base salary computed from the monthly salary plus a
   * commission. The commission is computed as 2% of that salesman's annual sales. The maximum
   * commission a salesman can earn is $20,000.
   */
  @Override
  public double annualSalary() {
    double salesCommission = this.annualSales * COMMISSION_RATE;

    if (salesCommission > COMMISSION_MAX) {
      salesCommission = COMMISSION_MAX;
    }

    return super.annualSalary() + salesCommission;
  }

  /**
   * An overridden toString method that returns a string containing the name, monthly salary and
   * annual sales, appropriately labeled.
   */
  @Override
  public String toString() {
    return super.toString() + "\nAnnual Sales: \t\t\t" +
        decimalFormat.format(this.annualSales);
  }
}
