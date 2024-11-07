package com.example.EmployeeDirectory.Service;

import com.example.EmployeeDirectory.Entity.Employee;
import com.example.EmployeeDirectory.Respository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee editEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee getEmployeeById(Integer id) {
        return employeeRepository.findEmployeeById(id);
    }

    public void deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
    }
}
