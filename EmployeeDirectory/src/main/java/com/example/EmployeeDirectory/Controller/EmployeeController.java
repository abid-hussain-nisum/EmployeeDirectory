package com.example.EmployeeDirectory.Controller;

import com.example.EmployeeDirectory.Entity.Employee;
import com.example.EmployeeDirectory.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee)
    {
        return ResponseEntity.ok(employeeService.addEmployee(employee));
    }

    @PutMapping("/editEmployee")
    public ResponseEntity<Employee> editEmployee(@RequestBody Employee employee)
    {
        return ResponseEntity.ok(employeeService.editEmployee(employee));
    }

    @GetMapping("/getEmployeeById/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id)
    {
        return ResponseEntity.ok(employeeService.getEmployeeById(id));
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public ResponseEntity<Employee> deleteEmployee(@PathVariable Integer id)
    {
        employeeService.deleteEmployee(id);
        return ResponseEntity.ok().build();
    }
}
