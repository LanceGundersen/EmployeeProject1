package EmployeeProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EmployeeMain {

    public static void main(String[] args) {

//        BufferedReader inputStream = null;
//
//        String fileLine;
//
//        try {
//            inputStream = new BufferedReader(new FileReader("EmployeeData.txt"));
//
//            System.out.println("Employee:");
//            // Read one Line using BufferedReader
//            while ((fileLine = inputStream.readLine()) != null) {
//                System.out.println(fileLine);
//            }
//        } catch (IOException io) {
//            System.out.println("File IO exception" + io.getMessage());
//        }finally {
//            // Need another catch for closing
//            // the streams
//            try {
//                if (inputStream != null) {
//                    inputStream.close();
//                }
//            } catch (IOException io) {
//                System.out.println("Issue closing the Files" + io.getMessage());
//            }
//
//        }

        Employee employee = new Employee("Smith,John",2000);
        System.out.println(employee.toString());
        Salesman salesman = new Salesman("Jones,Bill",3000, 100000);
        System.out.println(salesman.toString());
        Executive executive = new Executive("Bush,George",5000, 55);
        System.out.println(executive.toString());
    }
}
