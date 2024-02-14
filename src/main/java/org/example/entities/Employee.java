package org.example.entities;

import org.example.enums.Role;

import java.util.UUID;

public class Employee {

    private UUID id;
    private String name;
    private String role;
    private Double grossSalary;
    private Double netSalary;

    public Employee(String name, String role, Double grossSalary) {
        this.name = name;
        this.role = role;
        this.grossSalary = grossSalary;
        this.netSalary = setNetSalary(grossSalary);
    }

    public Employee() {

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
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

    public Double setNetSalary(Double grossSalary) {
        return switch (getRole()) {
            case "DEVELOPER" -> this.netSalary = Developer.calculateNetSalary(grossSalary);
            case "DBA" -> this.netSalary = DBA.calculateNetSalary(grossSalary);
            case "TESTER" -> this.netSalary = Tester.calculateNetSalary(grossSalary);
            default -> throw new IllegalStateException("Unexpected value: " + getRole());
        };
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", grossSalary=" + grossSalary +
                ", netSalary=" + netSalary +
                '}';
    }
}
