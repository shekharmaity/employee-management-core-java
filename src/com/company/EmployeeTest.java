package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        EmployeeService employeeService = new EmployeeService();

        //main logic
        Scanner scanner = new Scanner(System.in);

        int userInput = 0;
        do {
            System.out.println("Welcome to Employee management system");
            System.out.println("Select your choice below");
            System.out.println("1. Add employee");
            System.out.println("2. Display employee");
            System.out.println("3. Exit");
            userInput = Integer.parseInt(scanner.nextLine());
            switch (userInput) {
                case 1:
                    employeeService.addEmployeeToList(employeeList);
                    break;
                case 2:
                    employeeService.displayEmployeeList(employeeList);
                    break;
                default:
                    break;
            }
        } while (userInput != 3);
    }
}
