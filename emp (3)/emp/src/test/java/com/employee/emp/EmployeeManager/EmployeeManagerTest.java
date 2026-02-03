package com.employee.emp.EmployeeManager;

// These are our special testing tools!
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

// These tell the test what an Employee and the List look like
import com.employee.emp.Entity.Employee;
import com.employee.emp.Employee.Employees;

class EmployeeManagerTest {

    @Test
    void testGetAllEmployees() {
        // 1. Create our Manager "Boss"
        EmployeeManager manager = new EmployeeManager();
        
        // 2. Ask the Boss for the list of workers
        Employees result = manager.getAllEmployees();
        
        // 3. Make sure the list isn't empty!
        // Since you have Prem and Vikash in there by default, size should be at least 2.
        assertNotNull(result);
        assertTrue(result.getEmployeeList().size() >= 2);
    }

    @Test
    void testAddEmployee() {
        // 1. Setup the Boss and a new worker (Honey!)
        EmployeeManager manager = new EmployeeManager();
        Employee newWorker = new Employee("3", "Honey", "Bee", "honey@gmail.com", "Tester");
        
        // 2. Get the current count before adding
        int initialSize = manager.getAllEmployees().getEmployeeList().size();
        
        // 3. Perform the action: Add the new worker
        manager.addEmployee(newWorker);
        
        // 4. Verify: Does the list have one more person now?
        int finalSize = manager.getAllEmployees().getEmployeeList().size();
        assertEquals(initialSize + 1, finalSize);
        
        // 5. Verify the name of the last person added is "Honey"
        assertEquals("Honey", manager.getAllEmployees().getEmployeeList().get(finalSize - 1).getFirstName());
    }
}