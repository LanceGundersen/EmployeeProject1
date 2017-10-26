package EmployeeProject;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee employee = new Employee("Smith,John",2000);
        System.out.println(employee.toString());
        Salesman salesman = new Salesman("Jones,Bill",3000, 100000);
        System.out.println(salesman.toString());
        Executive executive = new Executive("Bush,George",5000, 55);
        System.out.println(executive.toString());
    }
}
