package com.example.EmployeeDirectory.Respository;

import com.example.EmployeeDirectory.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    Employee findEmployeeById(Integer id);
}
