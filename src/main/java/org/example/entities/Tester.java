package org.example.entities;

public class Tester {

    public static Double calculateNetSalary(Double grossSalary){
        if(grossSalary > 3000.00){
            return grossSalary * 0.85;
        }
        else return grossSalary * 0.8;
    }
}
