package com.company;

import java.util.List;
import java.util.Scanner;

public class EmployeeService {

    Scanner scanner = new Scanner(System.in);

    public boolean addEmployeeToList(List<Employee> employeeList){
        boolean result = false;
        Employee emp = new Employee();

        try {
            System.out.println("Enter employee id");
            int id = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter employee name");
            String name = scanner.nextLine();

            System.out.println("Enter employee age");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter employee department");
            String dept = scanner.nextLine();

            emp.setId(id);
            emp.setName(name);
            emp.setAge(age);

            emp.setDepartment(dept);
            employeeList.add(emp);
            result = true;
        }catch (Exception ex){
            System.out.println(ex);
        }
        return  result;
    }

    //TODO Add
    //TODO UPDATE
    //TODO VIEW
    public void displayEmployeeList(List<Employee> employeeList){
        for(Employee employee : employeeList){
            System.out.println(employee);
        }

    }
    //TODO DELETE

}
