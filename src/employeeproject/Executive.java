package employeeproject;

public class Executive extends Employee {

  private double stockPrice;
  private static final double BONUS = 30000;
  private static final int STOCK_PRICE_TRIGGER = 50;

  /**
   * Constructor
   *
   * A constructor that allows the name, monthly salary and stock price to be initialized.
   */
  public Executive(int year, String fullName, double monthlySalary, double stockPrice) {
    super(year, fullName, monthlySalary);
    this.stockPrice = stockPrice;
  }

  /**
   * An overridden method annualSalary that returns the salary for a whole year.
   *
   * The salary for an executive consists of the base salary computed from the monthly
   * salary plus a BONUS. The BONUS is $30,000 if the current stock price is greater
   * than $50 and nothing otherwise
   */
  @Override
  public double annualSalary() {

    if (this.stockPrice > STOCK_PRICE_TRIGGER) {
      return super.annualSalary() + BONUS;
    } else {
      return super.annualSalary();
    }
  }

  /**
   * An overridden toString method that returns a string containing the name, monthly
   * salary and stock price, appropriately labeled.
   */
  @Override
  public String toString() {
    return super.toString() + "\nCurrent Stock Price: \t" +
        decimalFormat.format(this.stockPrice);
  }

}
