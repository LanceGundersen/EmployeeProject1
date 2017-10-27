package employeeproject;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class EmployeeMain {

  private ArrayList<Employee> employeeList2014 = new ArrayList<>();
  private ArrayList<Employee> employeeList2015 = new ArrayList<>();

  private static DecimalFormat decimalFormat = new DecimalFormat("$0.00");

  private void arrayGenerator() {

    try {

      Scanner input = new Scanner(new File("EmployeeData.txt"));

      // Completes loop when "input.nextLine();" below detects no data
      while (input.hasNext()) {

        int year = input.nextInt();

        // Tests for 2014 in the first element
        if (year == 2014) {
          String type = input.next();
          String name = input.next();
          double monthlySalary = input.nextDouble();

          // Tests for Salesman in the second element
          switch (type) {
            case "Salesman": {
              double salesOrStock = input.nextDouble();
              employeeList2014.add(new Salesman(year, name, monthlySalary, salesOrStock));
              break;
            }
            case "Executive": {
              double salesOrStock = input.nextDouble();
              employeeList2014.add(new Executive(year, name, monthlySalary, salesOrStock));
              break;
            }
            default:
              employeeList2014.add(new Employee(year, name, monthlySalary));

              break;
          }

          // Tests for 2015 employees
        } else if (year == 2015) {
          String type = input.next();
          String name = input.next();
          double monthlySalary = input.nextDouble();

          // Tests for Salesman in the second element
          switch (type) {
            case "Salesman": {
              double salesOrStock = input.nextDouble();
              employeeList2015.add(new Salesman(year, name, monthlySalary, salesOrStock));

              // Tests for Executive in the second element
              break;
            }
            case "Executive": {
              double salesOrStock = input.nextDouble();
              employeeList2015.add(new Executive(year, name, monthlySalary, salesOrStock));

              // If neither Salesman or Executive test happened, it is an Employee
              break;
            }
            default:
              employeeList2015.add(new Employee(year, name, monthlySalary));
              break;
          }
        }

        // Completes when a blank line is detected
        input.nextLine();

      }

    } catch (IOException e) {
      System.out.println("File not found.");
      e.printStackTrace();
    } catch (NullPointerException e) {
      System.out.println("A null pointer was found, please check the input file.");
      e.printStackTrace();
    } catch (NoSuchElementException e) {
      System.out.println("The last line of the document is not blank.");
      e.printStackTrace();
    }
  }

  private void displayAllEmployees() {

    // Placeholder variables to sum and average the salary
    double averageSalary2014 = 0;
    double averageSalary2015 = 0;

    // Iterate through, and display 2014 data first
    System.out.println("\n2014 Data:");
    for (Employee em : employeeList2014) {
      System.out.println(em.toString());
      averageSalary2014 += em.annualSalary();

    }

    // averageSalary2014's final value should be itself divided by the number of employees
    averageSalary2014 = averageSalary2014 / employeeList2014.size();
    System.out.println("=========================================");
    System.out
        .println("The average salary for 2014 was: " + decimalFormat.format(averageSalary2014));

    // Iterate through, and display 2015 data after 2014 has completed
    System.out.println("\n2015 Data:");
    for (Employee em : employeeList2015) {
      System.out.println(em.toString());
      averageSalary2015 += em.annualSalary();
    }

    // averageSalary2015's final value should be itself divided by the number of employees
    averageSalary2015 = averageSalary2015 / employeeList2015.size();
    System.out.println("=========================================");
    System.out
        .println("The average salary for 2015 was: " + decimalFormat.format(averageSalary2015));
  }

  public static void main(String[] args) {
    EmployeeMain list = new EmployeeMain();
    list.arrayGenerator();
    list.displayAllEmployees();

  }
}
