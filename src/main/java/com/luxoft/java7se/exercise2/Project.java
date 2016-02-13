package com.luxoft.java7se.exercise2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Project {
    private String name;
    private List<Date> deliveryBreakpoints = new ArrayList<>();
    private Employee manager;

    public void setName(String name) {
        this.name = name;
    }

    public void addDeliveryBreakpoint(Date deliveryBreakpoint) {
        this.deliveryBreakpoints.add(deliveryBreakpoint);
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public List<Date> getDeliveryBreakpoints() {
        return deliveryBreakpoints;
    }

    public Employee getManager() {
        return manager;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", deliveryBreakpoints=" + deliveryBreakpoints +
                ", manager=" + manager +
                '}';
    }
}
