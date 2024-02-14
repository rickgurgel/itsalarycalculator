package org.example.entities;

import org.example.enums.Role;

public class Employee {
    private String name;
    private Enum role;
    private Double grossSalary;
    private Double netSalary;

    public Employee(String name, Enum role, Double grossSalary) {
        this.name = name;
        this.role = role;
        this.grossSalary = grossSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return (Role) role;
    }

    public void setRole(Enum role) {
        this.role = role;
    }

    public Double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(Double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public Double getNetSalary() {
        return netSalary;
    }

    public Double setNetSalary( Double grossSalary) {
        return switch (getRole()) {
            case DEVELOPER -> this.netSalary = Developer.calculateNetSalary(grossSalary);
            case DBA -> this.netSalary = DBA.calculateNetSalary(grossSalary);
            case TESTER -> this.netSalary = Tester.calculateNetSalary(grossSalary);
        };
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", role=" + role +
                ", grossSalary=" + grossSalary +
                ", netSalary=" + netSalary +
                '}';
    }
}
