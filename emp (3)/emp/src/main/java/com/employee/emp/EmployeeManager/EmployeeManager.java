package com.employee.emp.EmployeeManager;

import org.springframework.stereotype.Repository;

import com.employee.emp.Employee.Employees;
import com.employee.emp.Entity.Employee;

@Repository
public class EmployeeManager {

	private static Employees list = new Employees();

    static {
        // Initial sample data
        list.getEmployeeList().add(new Employee("1", "Prem", "Tiwari", "prem@gmail.com", "Manager"));
        list.getEmployeeList().add(new Employee("2", "Vikash", "Kumar", "vikash@gmail.com", "Developer"));
    }

    public Employees getAllEmployees() {
        return list;
    }

    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}
