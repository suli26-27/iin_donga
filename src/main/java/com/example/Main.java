package com.example;

import com.example.controllers.EmployeeController;
import com.example.repositories.EmployeeRepository;
import com.example.views.EmployeeView;

public class Main {
    public static void main(String[] args) {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        EmployeeView employeeView = new EmployeeView();
        EmployeeController employeeController =
            new EmployeeController(employeeRepository, employeeView);
        
        // employeeController.create();
        // employeeController.update();
        employeeController.delete();
        employeeController.list();
    }
}