package com.labassignment.model;

public class Employee {
    
    // Employee information fields
    // Setters Getters and Parameterized Constructor.
    private String firstName;
    private String lastName;
    private String departmentName;

    public Employee(String firstName, String lastName, String departmentName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentName = departmentName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

}
