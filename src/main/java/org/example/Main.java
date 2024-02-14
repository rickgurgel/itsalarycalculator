package org.example;

import org.example.entities.Employee;
import org.example.enums.Role;

public class Main {
    public static void main(String[] args) {

        Employee devRicardo = new Employee("Ricardo", Role.DEVELOPER, 3000.00);
        Employee devWho = new Employee("Thiago", Role.DEVELOPER, 4000.00);
        Employee dbaPedro = new Employee("Pedro", Role.DBA, 3000.00);
        Employee dbaJoabe = new Employee("Joabe", Role.DBA, 4500.00);
        Employee testerRafael = new Employee("Rafael", Role.TESTER, 3333.33);
        Employee testerZeGuela = new Employee("Ze Guela", Role.TESTER, 2222.22);

        devRicardo.setNetSalary(devRicardo.getGrossSalary());
        devWho.setNetSalary(devWho.getGrossSalary());
        dbaPedro.setNetSalary(dbaPedro.getGrossSalary());
        dbaJoabe.setNetSalary(dbaJoabe.getGrossSalary());
        testerRafael.setNetSalary(testerRafael.getGrossSalary());
        testerZeGuela.setNetSalary(testerZeGuela.getGrossSalary());

        System.out.println("---x---x---x---");
        System.out.println(devRicardo);
        System.out.println("---x---x---x---");
        System.out.println(devWho);
        System.out.println("---x---x---x---");
        System.out.println(dbaPedro);
        System.out.println("---x---x---x---");
        System.out.println(dbaJoabe);
        System.out.println("---x---x---x---");
        System.out.println(testerRafael);
        System.out.println("---x---x---x---");
        System.out.println(testerZeGuela);
        System.out.println("---x---x---x---");
    }
}