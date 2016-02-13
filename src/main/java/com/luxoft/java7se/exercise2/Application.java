package com.luxoft.java7se.exercise2;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        // walk through use cases
        EmployeeDatabase employeeDatabase = new EmployeeDatabase();
        ProjectDatabase projectDatabase = new ProjectDatabase();

        // US01. create an employee and save
        Employee employee = new Employee();
        employee.setAddress("ul. Rakowicka 15, 31-123 Krakow");
        employee.addPhoneNumber("634 455 435");
        employee.addPhoneNumber("565 435 678");

        employeeDatabase.saveEmployee(employee);

        // US02. Create project and save
        Project project = new Project();
        project.setName("Best Project Ever");
        project.addDeliveryBreakpoint(new Date());
        project.setManager(employee);

        projectDatabase.saveProject(project);

        // US03. Look over employees
        for (Employee e : employeeDatabase.getEmployees()) {
            System.out.println(e);
        }

        // US04. Look over projects
        for (Project p : projectDatabase.getProjects()) {
            System.out.println(p);
        }


    }
}
