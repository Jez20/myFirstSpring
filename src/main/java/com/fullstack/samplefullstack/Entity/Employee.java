package com.fullstack.samplefullstack.Entity;

//import lombok.Data;

import javax.persistence.*;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;

@Entity
@Table(name = "tbl_employees")
//@Data
public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;
    private String name;
    private String location;
    private String department;

    public Employee(int employeeId, String name, String location, String department) {
        this.employeeId = employeeId;
        this.name = name;
        this.location = location;
        this.department = department;
    }

    public Employee()
    {

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
