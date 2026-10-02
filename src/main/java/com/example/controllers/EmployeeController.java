package com.example.controllers;

import java.util.List;

import com.example.models.Employee;
import com.example.repositories.EmployeeRepository;
import com.example.views.EmployeeView;

public class EmployeeController {
    
    EmployeeRepository employeeRepository;
    EmployeeView employeeView;

    public EmployeeController(
        EmployeeRepository employeeRepository, 
        EmployeeView employeeView) {
            this.employeeRepository = employeeRepository;
            this.employeeView = employeeView;
    }

    public void list() {
        List<Employee> empList = employeeRepository.findAll();
        employeeView.showEmployees(empList);
    }

    public void create() {
        Employee emp = new Employee(
            "Tar Ferenc", 
            "Pécs", 
            392, 1
        );
        Employee createdEmp = employeeRepository.save(emp);
        System.out.println(createdEmp);

    }

    public void update() {
        Employee emp = new Employee(
            7,
            "Kiss Elemér", 
            "Harvan", 
            393, 2
        );
        Employee updatedEmp = employeeRepository.update(emp);
        System.out.println(updatedEmp);
    }

    public void delete() {
        int num = employeeRepository.delete(0);
        System.out.println("érinttett sorok: " + num);
    }
}
