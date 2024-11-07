package com.example.EmployeeDirectory.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
public class Employee {
    @Id
    Integer id;
    String name;
    Double salary;
    String location;
}
