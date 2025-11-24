package com.nov22.Day6_MavenProject;

public class Employee {


    private final int empId;
    private final String name;
    private final int salary;

    public Employee(int empId, String name, int salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpId() { return empId; }
    public String getName() { return name; }
    public int getSalary() { return salary; }

    @Override
    public String toString() {
        return "Employee{id=" + empId + ", name='" + name + "', salary=" + salary + "}";
    }


}
