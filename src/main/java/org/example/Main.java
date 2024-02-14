package org.example;

import org.example.entities.Employee;
import org.example.menus.Menu;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        boolean exit = false;
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        List<Employee> employeesList = new ArrayList<>();

        while(!exit) {

            menu.mainMenu();
            int i = sc.nextInt();
            sc.nextLine();

            switch (i) {
                case 1:
                    Employee employee = new Employee();
                    System.out.println("---   INPUT NEW EMPLOYEE DATA ---");
                    System.out.println("Name:");
                    employee.setName(sc.nextLine().toUpperCase());
                    System.out.println("Choose a Role:");
                    employee.setRole(sc.nextLine().toUpperCase());
                    System.out.println("Gross Salary:");
                    employee.setGrossSalary(sc.nextDouble());
                    employee.setNetSalary(employee.getGrossSalary());
                    employee.setId(UUID.randomUUID());
                    employeesList.add(employee);
                    System.out.println(employee);
                    break;
                case 2:
                    System.out.println("---   LISTING ALL EMPLOYEES   ---");
                    for (Employee emp : employeesList){
                        System.out.println(emp);
                    }
                    break;
                case 3:
                    System.out.println("---  INPUT ID TO DELETE DATA  ---");
                    System.out.println("Id:");
                    UUID uuid = UUID.fromString(sc.nextLine());
                    employeesList.removeIf(employee1 -> employee1.getId().equals(uuid));
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Choose again...");
                    break;
            }

        }

        sc.close();
    }
}