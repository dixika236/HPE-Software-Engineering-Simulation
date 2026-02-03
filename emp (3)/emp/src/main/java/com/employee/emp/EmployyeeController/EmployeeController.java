package com.employee.emp.EmployyeeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.employee.emp.Employee.Employees;
import com.employee.emp.EmployeeManager.EmployeeManager;
import com.employee.emp.Entity.Employee;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    @Autowired
    private EmployeeManager employeeManager;

    // GET request to fetch all employees
    @GetMapping(path = "/", produces = "application/json")
    public Employees getEmployees() {
        return employeeManager.getAllEmployees();
    }

    // POST request to add a new employee
    @PostMapping(path = "/", consumes = "application/json", produces = "application/json")
    public void addEmployee(@RequestBody Employee employee) {
        employeeManager.addEmployee(employee);
    }
}