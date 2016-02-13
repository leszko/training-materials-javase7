package com.luxoft.java7se.exercise2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDatabase {
    List<Employee> employees = new ArrayList<>();

    public void saveEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
