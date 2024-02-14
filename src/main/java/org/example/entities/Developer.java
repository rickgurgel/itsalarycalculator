package org.example.entities;

public class Developer {

    public static Double calculateNetSalary(Double grossSalary){
        if(grossSalary > 3000.00){
            return grossSalary * 0.9;
        }
        else return grossSalary * 0.8;
    }
}